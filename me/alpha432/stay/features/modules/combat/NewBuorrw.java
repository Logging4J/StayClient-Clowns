//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.util.math.*;
import me.alpha432.stay.util.player.*;
import me.alpha432.stay.features.modules.misc.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.entity.*;
import net.minecraft.block.state.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.client.*;
import me.alpha432.stay.util.world.*;
import me.alpha432.stay.client.*;
import java.util.*;

public class NewBuorrw extends Module
{
    private final Timer manualTimer;
    public Setting<Boolean> rotate;
    public Setting<Boolean> Bypass;
    public Setting<Boolean> noexcavate;
    private final Setting<Double> Force;
    private final Setting<Double> range;
    private boolean cuican;
    
    public NewBuorrw() {
        super("NewBuorrw", "AutoBurrw", Category.COMBAT, true, false, false);
        this.manualTimer = new Timer();
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.Bypass = (Setting<Boolean>)this.register(new Setting("Bypass", (T)true));
        this.noexcavate = (Setting<Boolean>)this.register(new Setting("excavate", (T)true));
        this.Force = (Setting<Double>)this.register(new Setting("Force", (T)1.2, (T)(-5.0), (T)10.0));
        this.range = (Setting<Double>)this.register(new Setting("Range", (T)2.5, (T)0.0, (T)10.0));
        this.cuican = true;
    }
    
    @Override
    public void onUpdate() {
        if (nullCheck()) {
            return;
        }
        if (NewBuorrw.mc.player == null || NewBuorrw.mc.world == null || NewBuorrw.mc.player.isInWater() || NewBuorrw.mc.player.isInLava()) {
            return;
        }
        final int swapBlock = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass());
        if (swapBlock == -1) {
            return;
        }
        final EntityPlayer target = this.getTarget(this.range.getValue(), true);
        if (HoleUtil.isInHole() && target != null) {
            if (NewBuorrw.mc.player.onGround) {
                final EntityPlayerSP player = NewBuorrw.mc.player;
                --player.motionY;
            }
            final BlockPos originalPos = PlayerUtil.getPlayerPos();
            final IBlockState blockState2 = NewBuorrw.mc.world.getBlockState(originalPos);
            if (this.noexcavate.getValue() && InstantMine.breakPos != null && originalPos.getX() == InstantMine.breakPos.getX() && originalPos.getY() == InstantMine.breakPos.getY() && originalPos.getZ() == InstantMine.breakPos.getZ()) {
                return;
            }
            if (blockState2.getBlock() == Blocks.AIR && NewBuorrw.mc.world.getBlockState(new BlockPos(originalPos.getX(), originalPos.getY() + 2, originalPos.getZ())).getBlock() == Blocks.AIR) {
                this.Burrow();
            }
        }
    }
    
    private void Burrow() {
        if (nullCheck()) {
            return;
        }
        this.cuican = false;
        final int imp = NewBuorrw.mc.player.inventory.currentItem;
        final int swapBlock = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass());
        final BlockPos originalPos = PlayerUtil.getPlayerPos();
        if (swapBlock == -1) {
            this.disable();
            return;
        }
        NewBuorrw.mc.player.motionX = 0.0;
        NewBuorrw.mc.player.motionZ = 0.0;
        NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(NewBuorrw.mc.player.posX, NewBuorrw.mc.player.posY + 0.41999998688698, NewBuorrw.mc.player.posZ, true));
        NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(NewBuorrw.mc.player.posX, NewBuorrw.mc.player.posY + 0.7531999805211997, NewBuorrw.mc.player.posZ, true));
        NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(NewBuorrw.mc.player.posX, NewBuorrw.mc.player.posY + 1.00133597911214, NewBuorrw.mc.player.posZ, true));
        NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(NewBuorrw.mc.player.posX, NewBuorrw.mc.player.posY + 1.16610926093821, NewBuorrw.mc.player.posZ, true));
        final int old = NewBuorrw.mc.player.inventory.currentItem;
        this.switchToSlot(swapBlock);
        BlockUtil.placeBlock(originalPos, EnumHand.MAIN_HAND, this.rotate.getValue(), true, false);
        this.switchToSlot(old);
        NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(NewBuorrw.mc.player.posX, NewBuorrw.mc.player.posY + this.Force.getValue(), NewBuorrw.mc.player.posZ, false));
        if (this.Bypass.getValue() && !NewBuorrw.mc.player.isSneaking()) {
            NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)NewBuorrw.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            NewBuorrw.mc.player.setSneaking(true);
            NewBuorrw.mc.playerController.updateController();
            NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)NewBuorrw.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
            NewBuorrw.mc.player.setSneaking(false);
            NewBuorrw.mc.playerController.updateController();
        }
    }
    
    private void switchToSlot(final int slot) {
        NewBuorrw.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
        NewBuorrw.mc.player.inventory.currentItem = slot;
        NewBuorrw.mc.playerController.updateController();
    }
    
    private EntityPlayer getTarget(final double range, final boolean trapped) {
        EntityPlayer target = null;
        double distance = Math.pow(range, 2.0) + 1.0;
        for (final EntityPlayer player : AutoTrap.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range) && (!trapped || !EntityUtils.isTrapped(player, false, false, false, false, false))) {
                if (Stay.speedManager.getPlayerSpeed(player) > 10.0) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = AutoTrap.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (AutoTrap.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = AutoTrap.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
}
