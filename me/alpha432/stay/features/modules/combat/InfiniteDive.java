//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.util.*;
import me.alpha432.stay.util.world.*;
import me.alpha432.stay.features.modules.misc.*;
import me.alpha432.stay.features.modules.movement.*;
import me.alpha432.stay.util.player.*;
import net.minecraft.block.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.network.play.client.*;

public class InfiniteDive extends Module
{
    private final Timer timer;
    public Setting<Boolean> buus;
    public Setting<Boolean> rotate;
    public Setting<Boolean> Knockoff;
    public Setting<Boolean> fuck;
    public Setting<Boolean> completion;
    public Setting<Boolean> rotate2;
    public Setting<Boolean> jump;
    public Setting<Boolean> packet;
    private Setting<Integer> delay;
    private Boolean insulls;
    
    public InfiniteDive() {
        super("InfiniteDive", "InfiniteDive", Category.COMBAT, true, false, false);
        this.timer = new Timer();
        this.buus = (Setting<Boolean>)this.register(new Setting("Burrow", (T)Boolean.FALSE));
        this.rotate = (Setting<Boolean>)this.register(new Setting("rotate", (T)Boolean.TRUE, v -> this.buus.getValue()));
        this.Knockoff = (Setting<Boolean>)this.register(new Setting("Knock off", (T)Boolean.FALSE));
        this.fuck = (Setting<Boolean>)this.register(new Setting("Super ghost hand", (T)Boolean.FALSE));
        this.completion = (Setting<Boolean>)this.register(new Setting("completion", (T)Boolean.TRUE));
        this.rotate2 = (Setting<Boolean>)this.register(new Setting("completion rotate", (T)Boolean.TRUE, v -> this.completion.getValue()));
        this.jump = (Setting<Boolean>)this.register(new Setting("jump", (T)Boolean.FALSE));
        this.packet = (Setting<Boolean>)this.register(new Setting("packet", (T)Boolean.TRUE));
        this.delay = (Setting<Integer>)this.register(new Setting("Delay", (T)200, (T)0, (T)500));
        this.insulls = true;
    }
    
    @Override
    public void onUpdate() {
        if (fullNullCheck()) {
            this.disable();
        }
        if (this.insulls) {
            if (this.completion.getValue() && InfiniteDive.mc.world.getBlockState(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY - 2.0, InfiniteDive.mc.player.posZ)).getBlock() == Blocks.AIR && InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass()) != -1) {
                final int swapBlock = InfiniteDive.mc.player.inventory.currentItem;
                InfiniteDive.mc.player.inventory.currentItem = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN);
                InfiniteDive.mc.player.setSneaking(true);
                BlockUtil.placeBlock(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY - 2.0, InfiniteDive.mc.player.posZ), EnumHand.MAIN_HAND, this.rotate2.getValue(), this.packet.getValue(), true);
                InfiniteDive.mc.player.inventory.currentItem = swapBlock;
            }
            this.issull();
            this.timer.reset();
            this.insulls = false;
            if (this.Knockoff.getValue()) {
                final BlockPos pos = new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ);
                if (InstantMine.breakPos != null && InstantMine.breakPos.getZ() == pos.getZ() && InstantMine.breakPos.getX() == pos.getX() && InstantMine.breakPos.getY() == pos.getY()) {
                    return;
                }
                InfiniteDive.mc.player.swingArm(EnumHand.MAIN_HAND);
                InfiniteDive.mc.playerController.onPlayerDamageBlock(pos, BlockUtil.getRayTraceFacing(pos));
            }
        }
        if (InfiniteDive.mc.world.getBlockState(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY + 0.5, InfiniteDive.mc.player.posZ)).getBlock() != Blocks.AIR && InfiniteDive.mc.world.getBlockState(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ)).getBlock() != Blocks.WATER && InfiniteDive.mc.world.getBlockState(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ)).getBlock() != Blocks.LAVA) {
            Phase.getInstance().enable();
        }
        if (this.timer.passedMs(this.delay.getValue())) {
            this.disable();
            Phase.getInstance().disable();
            if (this.jump.getValue()) {
                InfiniteDive.mc.player.jump();
            }
            this.timer.reset();
        }
    }
    
    @Override
    public void onEnable() {
        this.insulls = true;
    }
    
    public void issull() {
        if (fullNullCheck()) {
            return;
        }
        if (!this.buus.getValue() && InventoryUtil.findSkullSlot2() == -1) {
            return;
        }
        if (InfiniteDive.mc.world.getBlockState(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY + 0.5, InfiniteDive.mc.player.posZ)).getBlock() != Blocks.AIR && InfiniteDive.mc.world.getBlockState(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ)).getBlock() != Blocks.WATER && InfiniteDive.mc.world.getBlockState(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ)).getBlock() != Blocks.LAVA) {
            return;
        }
        if (this.buus.getValue()) {
            int swapBlock = -1;
            final int imp = InfiniteDive.mc.player.inventory.currentItem;
            swapBlock = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass());
            final BlockPos originalPos = PlayerUtil.getPlayerPos();
            if (InventoryUtil.findHotbarBlock(BlockObsidian.class) == -1) {
                Command.sendMessage("<" + this.getDisplayName() + "> " + ChatFormatting.RED + "Obsidian ?");
                this.disable();
                return;
            }
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)InfiniteDive.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY + 0.41999998688698, InfiniteDive.mc.player.posZ, true));
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY + 0.7531999805211997, InfiniteDive.mc.player.posZ, true));
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY + 1.00133597911214, InfiniteDive.mc.player.posZ, true));
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY + 1.06610926093821, InfiniteDive.mc.player.posZ, true));
            final int old = InfiniteDive.mc.player.inventory.currentItem;
            this.switchToSlot(swapBlock);
            BlockUtil.placeBlock(originalPos, EnumHand.MAIN_HAND, this.rotate.getValue(), true, false);
            this.switchToSlot(old);
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY + 3.0, InfiniteDive.mc.player.posZ, false));
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ, true));
            InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)InfiniteDive.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
        }
        else if (this.fuck.getValue()) {
            final int slotMain = InfiniteDive.mc.player.inventory.currentItem;
            if (InventoryUtil.findSkullSlot() != -1) {
                InfiniteDive.mc.player.inventory.currentItem = InventoryUtil.findSkullSlot();
                InfiniteDive.mc.playerController.updateController();
                InfiniteDive.mc.player.setSneaking(true);
                BlockUtil.placeBlock(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ), EnumHand.MAIN_HAND, false, this.packet.getValue(), true);
                InfiniteDive.mc.player.inventory.currentItem = slotMain;
                InfiniteDive.mc.playerController.updateController();
                return;
            }
            final int i = InventoryUtil.findSkullSlot2();
            if (i == -1) {
                return;
            }
            InfiniteDive.mc.playerController.windowClick(InfiniteDive.mc.player.inventoryContainer.windowId, i, InfiniteDive.mc.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)InfiniteDive.mc.player);
            InfiniteDive.mc.playerController.updateController();
            InfiniteDive.mc.player.setSneaking(true);
            BlockUtil.placeBlock(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ), EnumHand.MAIN_HAND, false, this.packet.getValue(), true);
            InfiniteDive.mc.playerController.windowClick(InfiniteDive.mc.player.inventoryContainer.windowId, i, InfiniteDive.mc.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)InfiniteDive.mc.player);
            InfiniteDive.mc.playerController.updateController();
        }
        else {
            if (InventoryUtil.findSkullSlot() == -1) {
                return;
            }
            final int slotMain = InfiniteDive.mc.player.inventory.currentItem;
            InfiniteDive.mc.player.inventory.currentItem = InventoryUtil.findSkullSlot();
            InfiniteDive.mc.playerController.updateController();
            InfiniteDive.mc.player.setSneaking(true);
            BlockUtil.placeBlock(new BlockPos(InfiniteDive.mc.player.posX, InfiniteDive.mc.player.posY, InfiniteDive.mc.player.posZ), EnumHand.MAIN_HAND, false, this.packet.getValue(), true);
            InfiniteDive.mc.player.inventory.currentItem = slotMain;
            InfiniteDive.mc.playerController.updateController();
        }
    }
    
    private void switchToSlot(final int slot) {
        InfiniteDive.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
        InfiniteDive.mc.player.inventory.currentItem = slot;
        InfiniteDive.mc.playerController.updateController();
    }
}
