//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.util.player.*;
import net.minecraft.block.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.network.play.client.*;

public class Burrow extends Module
{
    public Setting<Boolean> rotate;
    public Setting<Boolean> Bypass;
    private final Setting<Double> Force;
    private static Burrow INSTANCE;
    private boolean isSneaking;
    private BlockPos startPos;
    private boolean noFall;
    int swapBlock;
    BlockPos originalPos;
    BlockPos playerPos;
    
    public Burrow() {
        super("Burrow", "Rubberbands you into a block", Category.COMBAT, true, false, false);
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.Bypass = (Setting<Boolean>)this.register(new Setting("Bypass", (T)true));
        this.Force = (Setting<Double>)this.register(new Setting("Force", (T)1.2, (T)(-5.0), (T)10.0));
        this.isSneaking = false;
        this.startPos = null;
        this.noFall = false;
        this.swapBlock = -1;
    }
    
    public static Burrow getInstance() {
        if (Burrow.INSTANCE == null) {
            Burrow.INSTANCE = new Burrow();
        }
        return Burrow.INSTANCE;
    }
    
    private void setInstance() {
        Burrow.INSTANCE = this;
    }
    
    @Override
    public void onEnable() {
        if (nullCheck()) {
            return;
        }
        final int imp = Burrow.mc.player.inventory.currentItem;
        this.swapBlock = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass());
        this.originalPos = PlayerUtil.getPlayerPos();
        if (InventoryUtil.findHotbarBlock(BlockObsidian.class) == -1) {
            Command.sendMessage("<" + this.getDisplayName() + "> " + ChatFormatting.RED + "Obsidian ?");
            this.disable();
            return;
        }
        Burrow.mc.player.motionX = 0.0;
        Burrow.mc.player.motionZ = 0.0;
        this.playerPos = new BlockPos(Burrow.mc.player.posX, Burrow.mc.player.posY, Burrow.mc.player.posZ);
    }
    
    @Override
    public void onUpdate() {
        if (nullCheck()) {
            return;
        }
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow.mc.player, CPacketEntityAction.Action.START_SNEAKING));
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow.mc.player.posX, Burrow.mc.player.posY + 0.41999998688698, Burrow.mc.player.posZ, true));
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow.mc.player.posX, Burrow.mc.player.posY + 0.7531999805211997, Burrow.mc.player.posZ, true));
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow.mc.player.posX, Burrow.mc.player.posY + 1.00133597911214, Burrow.mc.player.posZ, true));
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow.mc.player.posX, Burrow.mc.player.posY + 1.06610926093821, Burrow.mc.player.posZ, true));
        final int old = Burrow.mc.player.inventory.currentItem;
        this.switchToSlot(this.swapBlock);
        BlockUtil.placeBlock(this.originalPos, EnumHand.MAIN_HAND, this.rotate.getValue(), true, false);
        this.switchToSlot(old);
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow.mc.player.posX, Burrow.mc.player.posY + this.Force.getValue(), Burrow.mc.player.posZ, false));
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow.mc.player.posX, Burrow.mc.player.posY, Burrow.mc.player.posZ, true));
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
        if (this.Bypass.getValue() && !Burrow.mc.player.isSneaking()) {
            Burrow.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            Burrow.mc.player.setSneaking(true);
            Burrow.mc.playerController.updateController();
            Burrow.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
            Burrow.mc.player.setSneaking(false);
            Burrow.mc.playerController.updateController();
        }
        this.disable();
    }
    
    private void switchToSlot(final int slot) {
        Burrow.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
        Burrow.mc.player.inventory.currentItem = slot;
        Burrow.mc.playerController.updateController();
    }
    
    static {
        Burrow.INSTANCE = new Burrow();
    }
}
