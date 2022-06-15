//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.math.*;
import java.util.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class Selftrap extends Module
{
    private final Setting<Integer> blocksPerTick;
    private final Setting<Integer> delay;
    private final Setting<Boolean> rotate;
    private final Setting<Integer> disableTime;
    private final Setting<Boolean> disable;
    private final Setting<Boolean> packet;
    private final Timer offTimer;
    private final Timer timer;
    private boolean hasOffhand;
    private final Map<BlockPos, Integer> retries;
    private final Timer retryTimer;
    private int blocksThisTick;
    private boolean isSneaking;
    private boolean offHand;
    
    public Selftrap() {
        super("SelfTrap", "Lure your enemies in!", Category.COMBAT, true, false, true);
        this.blocksPerTick = (Setting<Integer>)this.register(new Setting("BlocksPerTick", (T)8, (T)1, (T)20));
        this.delay = (Setting<Integer>)this.register(new Setting("Delay", (T)50, (T)0, (T)250));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.disableTime = (Setting<Integer>)this.register(new Setting("DisableTime", (T)200, (T)50, (T)300));
        this.disable = (Setting<Boolean>)this.register(new Setting("AutoDisable", (T)true));
        this.packet = (Setting<Boolean>)this.register(new Setting("Packet", (T)false));
        this.offTimer = new Timer();
        this.timer = new Timer();
        this.hasOffhand = false;
        this.retries = new HashMap<BlockPos, Integer>();
        this.retryTimer = new Timer();
        this.blocksThisTick = 0;
        this.offHand = false;
    }
    
    @Override
    public void onEnable() {
        if (fullNullCheck()) {
            this.disable();
        }
        this.offTimer.reset();
    }
    
    @Override
    public void onTick() {
        if (this.isOn() && (this.blocksPerTick.getValue() != 1 || !this.rotate.getValue())) {
            this.doSelfTrap();
        }
    }
    
    @SubscribeEvent
    public void onUpdateWalkingPlayer(final MotionUpdateEvent event) {
        if (this.isOn() && event.getStage() == 0 && this.blocksPerTick.getValue() == 1 && this.rotate.getValue()) {
            this.doSelfTrap();
        }
    }
    
    @Override
    public void onDisable() {
        this.isSneaking = EntityUtils.stopSneaking(this.isSneaking);
        this.retries.clear();
        this.offHand = false;
    }
    
    private void doSelfTrap() {
        if (this.check()) {
            return;
        }
        for (final BlockPos position : this.getPositions()) {
            final int placeability = BlockUtil.isPositionPlaceable(position, false);
            if (placeability == 1 && (this.retries.get(position) == null || this.retries.get(position) < 4)) {
                this.placeBlock(position);
                this.retries.put(position, (this.retries.get(position) == null) ? 1 : (this.retries.get(position) + 1));
            }
            if (placeability != 3) {
                continue;
            }
            this.placeBlock(position);
        }
    }
    
    private List<BlockPos> getPositions() {
        final ArrayList<BlockPos> positions = new ArrayList<BlockPos>();
        positions.add(new BlockPos(Selftrap.mc.player.posX, Selftrap.mc.player.posY + 2.0, Selftrap.mc.player.posZ));
        final int placeability = BlockUtil.isPositionPlaceable(positions.get(0), false);
        switch (placeability) {
            case 0: {
                return new ArrayList<BlockPos>();
            }
            case 3: {
                return positions;
            }
            case 1: {
                if (BlockUtil.isPositionPlaceable(positions.get(0), false, false) == 3) {
                    return positions;
                }
            }
            case 2: {
                positions.add(new BlockPos(Selftrap.mc.player.posX + 1.0, Selftrap.mc.player.posY + 1.0, Selftrap.mc.player.posZ));
                positions.add(new BlockPos(Selftrap.mc.player.posX + 1.0, Selftrap.mc.player.posY + 2.0, Selftrap.mc.player.posZ));
                break;
            }
        }
        positions.sort(Comparator.comparingDouble(Vec3i::getY));
        return positions;
    }
    
    private void placeBlock(final BlockPos pos) {
        if (this.blocksThisTick < this.blocksPerTick.getValue()) {
            final boolean smartRotate = this.blocksPerTick.getValue() == 1 && this.rotate.getValue();
            final int originalSlot = Selftrap.mc.player.inventory.currentItem;
            final int obbySlot = InventoryUtil.findHotbarBlock(BlockObsidian.class);
            final int eChestSot = InventoryUtil.findHotbarBlock(BlockEnderChest.class);
            if (obbySlot == -1 && eChestSot == -1) {
                this.toggle();
            }
            Selftrap.mc.player.inventory.currentItem = ((obbySlot == -1) ? eChestSot : obbySlot);
            Selftrap.mc.playerController.updateController();
            this.isSneaking = (smartRotate ? BlockUtil.placeBlockSmartRotate(pos, this.hasOffhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, true, this.packet.getValue(), this.isSneaking) : BlockUtil.placeBlock(pos, this.hasOffhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue(), this.packet.getValue(), this.isSneaking));
            Selftrap.mc.player.inventory.currentItem = originalSlot;
            Selftrap.mc.playerController.updateController();
            this.timer.reset();
            ++this.blocksThisTick;
        }
    }
    
    private boolean check() {
        if (fullNullCheck()) {
            this.disable();
            return true;
        }
        final int obbySlot = InventoryUtil.findHotbarBlock(BlockObsidian.class);
        final int eChestSot = InventoryUtil.findHotbarBlock(BlockEnderChest.class);
        if (obbySlot == -1 && eChestSot == -1) {
            this.toggle();
        }
        this.blocksThisTick = 0;
        this.isSneaking = EntityUtils.stopSneaking(this.isSneaking);
        if (this.retryTimer.passedMs(2000L)) {
            this.retries.clear();
            this.retryTimer.reset();
        }
        if (!EntityUtils.isSafe((Entity)Selftrap.mc.player)) {
            this.offTimer.reset();
            return true;
        }
        if (this.disable.getValue() && this.offTimer.passedMs(this.disableTime.getValue())) {
            this.disable();
            return true;
        }
        return !this.timer.passedMs(this.delay.getValue());
    }
}
