//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.client.*;
import java.util.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.features.modules.combat.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import me.alpha432.stay.util.world.*;

public class AutoPlatform extends Module
{
    private final Setting<Double> range;
    public Setting<Boolean> Double;
    private final Setting<Integer> blocksPerTick;
    private final Setting<Boolean> rotate;
    private final Setting<Boolean> packet;
    private boolean isSneaking;
    private boolean hasOffhand;
    private int blocksThisTick;
    private final Timer offTimer;
    private final Timer timer;
    private final Map<BlockPos, Integer> retries;
    private final Timer retryTimer;
    public Setting<Boolean> boxs;
    private ArrayList<BlockPos> holes;
    private int trie;
    
    public AutoPlatform() {
        super("AutoPlatform", "AutoPlatform", Category.MISC, true, false, false);
        this.range = (Setting<Double>)this.register(new Setting("PlaceRange", (T)5.0, (T)0.0, (T)7.0));
        this.Double = (Setting<Boolean>)this.register(new Setting("Double Hole", (T)true));
        this.blocksPerTick = (Setting<Integer>)this.register(new Setting("BlocksPerTick", (T)20, (T)8, (T)30));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.packet = (Setting<Boolean>)this.register(new Setting("Packet", (T)false));
        this.hasOffhand = false;
        this.blocksThisTick = 0;
        this.offTimer = new Timer();
        this.timer = new Timer();
        this.retries = new HashMap<BlockPos, Integer>();
        this.retryTimer = new Timer();
        this.holes = new ArrayList<BlockPos>();
    }
    
    private EntityPlayer getTarget(final double range) {
        EntityPlayer target = null;
        double distance = Math.pow(range, 2.0) + 1.0;
        for (final EntityPlayer player : AutoPlatform.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range)) {
                if (Stay.speedManager.getPlayerSpeed(player) > 10.0) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = AutoPlatform.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (AutoPlatform.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = AutoPlatform.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
    
    @Override
    public void onEnable() {
        if (AutoPlatform.mc.player == null || AutoPlatform.mc.world == null) {
            return;
        }
        this.disable();
        final int sand = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN);
        if (sand == -1) {
            return;
        }
        final EntityPlayer pos = this.getTarget(this.range.getValue());
        if (pos == null) {
            return;
        }
        this.placeBlock(new BlockPos(pos.posX + 1.0, pos.posY - 1.0, pos.posZ));
        this.placeBlock(new BlockPos(pos.posX - 1.0, pos.posY - 1.0, pos.posZ));
        this.placeBlock(new BlockPos(pos.posX, pos.posY - 1.0, pos.posZ + 1.0));
        this.placeBlock(new BlockPos(pos.posX, pos.posY - 1.0, pos.posZ - 1.0));
        this.placeBlock(new BlockPos(pos.posX + 1.0, pos.posY - 1.0, pos.posZ + 1.0));
        this.placeBlock(new BlockPos(pos.posX + 1.0, pos.posY - 1.0, pos.posZ - 1.0));
        this.placeBlock(new BlockPos(pos.posX - 1.0, pos.posY - 1.0, pos.posZ + 1.0));
        this.placeBlock(new BlockPos(pos.posX - 1.0, pos.posY - 1.0, pos.posZ - 1.0));
    }
    
    private void placeBlock(final BlockPos pos) {
        for (final Entity entity : HoleFiller.mc.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(pos))) {
            if (entity instanceof EntityLivingBase) {
                return;
            }
        }
        if (this.blocksThisTick < this.blocksPerTick.getValue()) {
            final int obbySlot = InventoryUtil.findHotbarBlock(BlockObsidian.class);
            final int eChestSot = InventoryUtil.findHotbarBlock(BlockEnderChest.class);
            if (obbySlot == -1 && eChestSot == -1) {
                this.toggle();
            }
            final boolean smartRotate = this.blocksPerTick.getValue() == 1 && this.rotate.getValue();
            if (smartRotate) {
                this.isSneaking = BlockUtil.placeBlockSmartRotate(pos, this.hasOffhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, true, this.packet.getValue(), this.isSneaking);
            }
            else {
                this.isSneaking = BlockUtil.placeBlock(pos, this.hasOffhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue(), this.packet.getValue(), this.isSneaking);
            }
            final int originalSlot = HoleFiller.mc.player.inventory.currentItem;
            HoleFiller.mc.player.inventory.currentItem = ((obbySlot == -1) ? eChestSot : obbySlot);
            HoleFiller.mc.playerController.updateController();
            TestUtil.placeBlock(pos);
            if (HoleFiller.mc.player.inventory.currentItem != originalSlot) {
                HoleFiller.mc.player.inventory.currentItem = originalSlot;
                HoleFiller.mc.playerController.updateController();
            }
            this.timer.reset();
            ++this.blocksThisTick;
        }
    }
}
