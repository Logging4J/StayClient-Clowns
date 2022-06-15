//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import me.alpha432.stay.client.*;
import com.mojang.realmsclient.gui.*;
import java.util.*;
import me.alpha432.stay.util.world.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.block.state.*;

public class Surround extends Module
{
    private final Setting<Integer> blocksPerTick;
    private final Setting<Integer> delay;
    private final Setting<Boolean> togg1e;
    private final Setting<Boolean> noGhost;
    private final Setting<Boolean> center;
    private final Setting<Boolean> rotate;
    private final Timer timer;
    private final Timer retryTimer;
    private final Set<Vec3d> extendingBlocks;
    private final Map<BlockPos, Integer> retries;
    private boolean isSafe;
    private BlockPos startPos;
    private boolean didPlace;
    private int lastHotbarSlot;
    private boolean isSneaking;
    private int placements;
    private int extenders;
    private int obbySlot;
    private boolean offHand;
    
    public Surround() {
        super("Surround", "Surrounds you with Obsidian", Category.COMBAT, true, false, false);
        this.blocksPerTick = (Setting<Integer>)this.register(new Setting("BlocksPerTick", (T)12, (T)1, (T)20));
        this.delay = (Setting<Integer>)this.register(new Setting("Delay", (T)0, (T)0, (T)250));
        this.togg1e = (Setting<Boolean>)this.register(new Setting("AutoToggle", (T)false));
        this.noGhost = (Setting<Boolean>)this.register(new Setting("PacketPlace", (T)false));
        this.center = (Setting<Boolean>)this.register(new Setting("TPCenter", (T)false));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.timer = new Timer();
        this.retryTimer = new Timer();
        this.extendingBlocks = new HashSet<Vec3d>();
        this.retries = new HashMap<BlockPos, Integer>();
        this.didPlace = false;
        this.placements = 0;
        this.extenders = 1;
        this.obbySlot = -1;
        this.offHand = false;
    }
    
    @Override
    public void onEnable() {
        if (fullNullCheck()) {
            return;
        }
        this.lastHotbarSlot = Surround.mc.player.inventory.currentItem;
        this.startPos = EntityUtils.getRoundedBlockPos((Entity)Surround.mc.player);
        if (this.center.getValue()) {
            Stay.positionManager.setPositionPacket(this.startPos.getX() + 0.5, this.startPos.getY(), this.startPos.getZ() + 0.5, true, true, true);
        }
        this.retries.clear();
        this.retryTimer.reset();
    }
    
    @Override
    public void onTick() {
        if (fullNullCheck()) {
            return;
        }
        this.doFeetPlace();
    }
    
    @Override
    public void onDisable() {
        this.isSneaking = EntityUtils.stopSneaking(this.isSneaking);
    }
    
    @Override
    public String getDisplayInfo() {
        if (!this.isSafe) {
            return ChatFormatting.GREEN + "Safe";
        }
        return ChatFormatting.RED + "Unsafe";
    }
    
    private void doFeetPlace() {
        if (this.check()) {
            return;
        }
        if (!EntityUtils.isSafe((Entity)Surround.mc.player, 0, true)) {
            this.isSafe = true;
            this.placeBlocks(Surround.mc.player.getPositionVector(), EntityUtils.getUnsafeBlockArray((Entity)Surround.mc.player, 0, true), true, false, false);
        }
        else {
            this.isSafe = false;
        }
        this.processExtendingBlocks();
        if (this.didPlace) {
            this.timer.reset();
        }
        if (!this.togg1e.getValue()) {
            return;
        }
        this.toggle();
    }
    
    private void processExtendingBlocks() {
        if (this.extendingBlocks.size() == 2 && this.extenders < 1) {
            final Vec3d[] array = new Vec3d[2];
            int i = 0;
            final Iterator<Vec3d> iterator = this.extendingBlocks.iterator();
            while (iterator.hasNext()) {
                array[i] = iterator.next();
                ++i;
            }
            final int placementsBefore = this.placements;
            if (this.areClose(array) != null) {
                this.placeBlocks(this.areClose(array), EntityUtils.getUnsafeBlockArrayFromVec3d(this.areClose(array), 0, true), true, false, true);
            }
            if (placementsBefore >= this.placements) {
                return;
            }
            this.extendingBlocks.clear();
        }
        else {
            if (this.extendingBlocks.size() <= 2 && this.extenders < 1) {
                return;
            }
            this.extendingBlocks.clear();
        }
    }
    
    private Vec3d areClose(final Vec3d[] vec3ds) {
        int matches = 0;
        for (final Vec3d vec3d : vec3ds) {
            for (final Vec3d pos : EntityUtils.getUnsafeBlockArray((Entity)Surround.mc.player, 0, true)) {
                if (vec3d.equals((Object)pos)) {
                    ++matches;
                }
            }
        }
        if (matches != 2) {
            return null;
        }
        return Surround.mc.player.getPositionVector().add(vec3ds[0].add(vec3ds[1]));
    }
    
    private boolean placeBlocks(final Vec3d pos, final Vec3d[] vec3ds, final boolean hasHelpingBlocks, final boolean isHelping, final boolean isExtending) {
        boolean gotHelp = true;
        for (final Vec3d vec3d : vec3ds) {
            gotHelp = true;
            final BlockPos position = new BlockPos(pos).add(vec3d.x, vec3d.y, vec3d.z);
            switch (BlockUtil.isPositionPlaceable(position, false)) {
                case 1: {
                    if (this.retries.get(position) == null || this.retries.get(position) < 4) {
                        this.placeBlock(position);
                        this.retries.put(position, (this.retries.get(position) == null) ? 1 : (this.retries.get(position) + 1));
                        this.retryTimer.reset();
                        break;
                    }
                    if (Stay.speedManager.getSpeedKpH() != 0.0 || isExtending) {
                        break;
                    }
                    if (this.extenders >= 1) {
                        break;
                    }
                    this.placeBlocks(Surround.mc.player.getPositionVector().add(vec3d), EntityUtils.getUnsafeBlockArrayFromVec3d(Surround.mc.player.getPositionVector().add(vec3d), 0, true), hasHelpingBlocks, false, true);
                    this.extendingBlocks.add(vec3d);
                    ++this.extenders;
                    break;
                }
                case 2: {
                    if (!hasHelpingBlocks) {
                        break;
                    }
                    gotHelp = this.placeBlocks(pos, BlockUtil.getHelpingBlocks(vec3d), false, true, true);
                }
                case 3: {
                    if (gotHelp) {
                        this.placeBlock(position);
                    }
                    if (isHelping) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    private boolean check() {
        if (fullNullCheck()) {
            if (!this.isOn()) {
                return true;
            }
            this.disable();
            return true;
        }
        else {
            final int obbySlot = InventoryUtil.findHotbarBlock(BlockObsidian.class);
            final int eChestSot = InventoryUtil.findHotbarBlock(BlockEnderChest.class);
            if (obbySlot == -1 && eChestSot == -1) {
                this.toggle();
            }
            this.offHand = InventoryUtil.isBlock(Surround.mc.player.getHeldItemOffhand().getItem(), BlockObsidian.class);
            this.didPlace = false;
            this.extenders = 1;
            this.placements = 0;
            this.obbySlot = InventoryUtil.findHotbarBlock(BlockObsidian.class);
            final int echestSlot = InventoryUtil.findHotbarBlock(BlockEnderChest.class);
            if (this.isOff()) {
                return true;
            }
            if (this.retryTimer.passedMs(2500L)) {
                this.retries.clear();
                this.retryTimer.reset();
            }
            if (this.obbySlot == -1 && !this.offHand && echestSlot == -1) {
                Command.sendMessage("<" + this.getDisplayName() + "> " + ChatFormatting.RED + "No Obsidian in hotbar disabling...");
                this.disable();
                return true;
            }
            this.isSneaking = EntityUtils.stopSneaking(this.isSneaking);
            if (Surround.mc.player.inventory.currentItem != this.lastHotbarSlot && Surround.mc.player.inventory.currentItem != this.obbySlot && Surround.mc.player.inventory.currentItem != echestSlot) {
                this.lastHotbarSlot = Surround.mc.player.inventory.currentItem;
            }
            if (!this.startPos.equals((Object)EntityUtils.getRoundedBlockPos((Entity)Surround.mc.player))) {
                this.disable();
                return true;
            }
            return !this.timer.passedMs(this.delay.getValue());
        }
    }
    
    private void placeBlock(final BlockPos pos) {
        if (this.placements >= this.blocksPerTick.getValue()) {
            return;
        }
        final int originalSlot = Surround.mc.player.inventory.currentItem;
        final int obbySlot = InventoryUtil.findHotbarBlock(BlockObsidian.class);
        final int eChestSot = InventoryUtil.findHotbarBlock(BlockEnderChest.class);
        if (obbySlot == -1 && eChestSot == -1) {
            this.toggle();
        }
        Surround.mc.player.inventory.currentItem = ((obbySlot == -1) ? eChestSot : obbySlot);
        Surround.mc.playerController.updateController();
        for (final BlockPos blockPos : new BlockPos[] { pos.north(), pos.south(), pos.east(), pos.west(), pos.down(), pos.up() }) {
            final IBlockState block = Surround.mc.world.getBlockState(blockPos);
            if (block instanceof BlockAir || block instanceof BlockLiquid || block instanceof BlockTallGrass || block instanceof BlockFire || block instanceof BlockDeadBush || block instanceof BlockSnow) {
                this.isSneaking = BlockUtil.placeBlock(pos.down(), this.offHand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue(), this.noGhost.getValue(), this.isSneaking);
            }
        }
        this.isSneaking = BlockUtil.placeBlock(pos, this.offHand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue(), this.noGhost.getValue(), this.isSneaking);
        Surround.mc.player.inventory.currentItem = originalSlot;
        Surround.mc.playerController.updateController();
        this.didPlace = true;
        ++this.placements;
    }
}
