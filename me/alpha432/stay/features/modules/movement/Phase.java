//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.util.*;
import io.netty.util.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.*;
import net.minecraft.client.gui.*;

public class Phase extends Module
{
    private static Phase INSTANCE;
    public Setting<Mode> mode;
    public Setting<PacketFlyMode> type;
    public Setting<Integer> xMove;
    public Setting<Integer> yMove;
    public Setting<Boolean> extra;
    public Setting<Integer> offset;
    public Setting<Boolean> fallPacket;
    public Setting<Boolean> teleporter;
    public Setting<Boolean> boundingBox;
    public Setting<Integer> teleportConfirm;
    public Setting<Boolean> ultraPacket;
    public Setting<Boolean> updates;
    public Setting<Boolean> setOnMove;
    public Setting<Boolean> cliperino;
    public Setting<Boolean> scanPackets;
    public Setting<Boolean> resetConfirm;
    public Setting<Boolean> posLook;
    public Setting<Boolean> cancel;
    public Setting<Boolean> cancelType;
    public Setting<Boolean> onlyY;
    public Setting<Integer> cancelPacket;
    private final Set<CPacketPlayer> packets;
    private boolean teleport;
    private int teleportIds;
    private int posLookPackets;
    
    public Phase() {
        super("Phase", "Makes you able to phase through blocks.", Module.Category.MOVEMENT, true, false, false);
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.PACKETFLY));
        this.type = (Setting<PacketFlyMode>)this.register(new Setting("Type", (T)PacketFlyMode.SETBACK, v -> this.mode.getValue() == Mode.PACKETFLY));
        this.xMove = (Setting<Integer>)this.register(new Setting("HMove", (T)625, (T)1, (T)1000, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK, "XMovement speed."));
        this.yMove = (Setting<Integer>)this.register(new Setting("YMove", (T)625, (T)1, (T)1000, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK, "YMovement speed."));
        this.extra = (Setting<Boolean>)this.register(new Setting("ExtraPacket", (T)true, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.offset = (Setting<Integer>)this.register(new Setting("Offset", (T)1337, (T)(-1337), (T)1337, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK && this.extra.getValue(), "Up speed."));
        this.fallPacket = (Setting<Boolean>)this.register(new Setting("FallPacket", (T)true, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.teleporter = (Setting<Boolean>)this.register(new Setting("Teleport", (T)true, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.boundingBox = (Setting<Boolean>)this.register(new Setting("BoundingBox", (T)true, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.teleportConfirm = (Setting<Integer>)this.register(new Setting("Confirm", (T)2, (T)0, (T)4, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.ultraPacket = (Setting<Boolean>)this.register(new Setting("DoublePacket", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.updates = (Setting<Boolean>)this.register(new Setting("Update", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.setOnMove = (Setting<Boolean>)this.register(new Setting("SetMove", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.cliperino = (Setting<Boolean>)this.register(new Setting("NoClip", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK && this.setOnMove.getValue()));
        this.scanPackets = (Setting<Boolean>)this.register(new Setting("ScanPackets", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.resetConfirm = (Setting<Boolean>)this.register(new Setting("Reset", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.posLook = (Setting<Boolean>)this.register(new Setting("PosLook", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK));
        this.cancel = (Setting<Boolean>)this.register(new Setting("Cancel", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK && this.posLook.getValue()));
        this.cancelType = (Setting<Boolean>)this.register(new Setting("SetYaw", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK && this.posLook.getValue() && this.cancel.getValue()));
        this.onlyY = (Setting<Boolean>)this.register(new Setting("OnlyY", (T)false, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK && this.posLook.getValue()));
        this.cancelPacket = (Setting<Integer>)this.register(new Setting("Packets", (T)20, (T)0, (T)20, v -> this.mode.getValue() == Mode.PACKETFLY && this.type.getValue() == PacketFlyMode.SETBACK && this.posLook.getValue()));
        this.packets = (Set<CPacketPlayer>)new ConcurrentSet();
        this.teleport = true;
        this.teleportIds = 0;
        this.setInstance();
    }
    
    public void onUpdate() {
        if (fullNullCheck()) {
            this.disable();
        }
    }
    
    public static Phase getInstance() {
        if (Phase.INSTANCE == null) {
            Phase.INSTANCE = new Phase();
        }
        return Phase.INSTANCE;
    }
    
    private void setInstance() {
        Phase.INSTANCE = this;
    }
    
    public void onDisable() {
        this.packets.clear();
        this.posLookPackets = 0;
        if (Phase.mc.player != null) {
            if (this.resetConfirm.getValue()) {
                this.teleportIds = 0;
            }
            Phase.mc.player.noClip = false;
        }
    }
    
    public String getDisplayInfo() {
        return this.mode.currentEnumName();
    }
    
    @SubscribeEvent
    public void onMove(final MoveEvent event) {
        if (this.setOnMove.getValue() && this.type.getValue() == PacketFlyMode.SETBACK && event.getStage() == 0 && !Phase.mc.isSingleplayer() && this.mode.getValue() == Mode.PACKETFLY) {
            event.setX(Phase.mc.player.motionX);
            event.setY(Phase.mc.player.motionY);
            event.setZ(Phase.mc.player.motionZ);
            if (this.cliperino.getValue()) {
                Phase.mc.player.noClip = true;
            }
        }
        if (this.type.getValue() == PacketFlyMode.NONE || event.getStage() != 0 || Phase.mc.isSingleplayer() || this.mode.getValue() != Mode.PACKETFLY) {
            return;
        }
        if (!this.boundingBox.getValue() && !this.updates.getValue()) {
            this.doPhase(event);
        }
    }
    
    @SubscribeEvent
    public void onPush(final PushEvent event) {
        if (event.getStage() == 1 && this.type.getValue() != PacketFlyMode.NONE) {
            event.setCanceled(true);
        }
    }
    
    @SubscribeEvent
    public void onMove(final MotionUpdateEvent event) {
        if (fullNullCheck() || event.getStage() != 0 || this.type.getValue() != PacketFlyMode.SETBACK || this.mode.getValue() != Mode.PACKETFLY) {
            return;
        }
        if (this.boundingBox.getValue()) {
            this.doBoundingBox();
        }
        else if (this.updates.getValue()) {
            this.doPhase(null);
        }
    }
    
    private void doPhase(final MoveEvent event) {
        if (this.type.getValue() == PacketFlyMode.SETBACK && !this.boundingBox.getValue()) {
            final double[] dirSpeed = this.getMotion(this.teleport ? (this.yMove.getValue() / 10000.0) : ((this.yMove.getValue() - 1) / 10000.0));
            final double posX = Phase.mc.player.posX + dirSpeed[0];
            final double posY = Phase.mc.player.posY + (Phase.mc.gameSettings.keyBindJump.isKeyDown() ? (this.teleport ? (this.yMove.getValue() / 10000.0) : ((this.yMove.getValue() - 1) / 10000.0)) : 1.0E-8) - (Phase.mc.gameSettings.keyBindSneak.isKeyDown() ? (this.teleport ? (this.yMove.getValue() / 10000.0) : ((this.yMove.getValue() - 1) / 10000.0)) : 2.0E-8);
            final double posZ = Phase.mc.player.posZ + dirSpeed[1];
            final CPacketPlayer.PositionRotation packetPlayer = new CPacketPlayer.PositionRotation(posX, posY, posZ, Phase.mc.player.rotationYaw, Phase.mc.player.rotationPitch, false);
            this.packets.add((CPacketPlayer)packetPlayer);
            Phase.mc.player.connection.sendPacket((Packet)packetPlayer);
            if (this.teleportConfirm.getValue() != 3) {
                Phase.mc.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.teleportIds - 1));
                ++this.teleportIds;
            }
            if (this.extra.getValue()) {
                final CPacketPlayer.PositionRotation packet = new CPacketPlayer.PositionRotation(Phase.mc.player.posX, this.offset.getValue() + Phase.mc.player.posY, Phase.mc.player.posZ, Phase.mc.player.rotationYaw, Phase.mc.player.rotationPitch, true);
                this.packets.add((CPacketPlayer)packet);
                Phase.mc.player.connection.sendPacket((Packet)packet);
            }
            if (this.teleportConfirm.getValue() != 1) {
                Phase.mc.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.teleportIds + 1));
                ++this.teleportIds;
            }
            if (this.ultraPacket.getValue()) {
                final CPacketPlayer.PositionRotation packet2 = new CPacketPlayer.PositionRotation(posX, posY, posZ, Phase.mc.player.rotationYaw, Phase.mc.player.rotationPitch, false);
                this.packets.add((CPacketPlayer)packet2);
                Phase.mc.player.connection.sendPacket((Packet)packet2);
            }
            if (this.teleportConfirm.getValue() == 4) {
                Phase.mc.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.teleportIds));
                ++this.teleportIds;
            }
            if (this.fallPacket.getValue()) {
                Phase.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Phase.mc.player, CPacketEntityAction.Action.START_FALL_FLYING));
            }
            Phase.mc.player.setPosition(posX, posY, posZ);
            final boolean teleport = !this.teleporter.getValue() || !this.teleport;
            this.teleport = teleport;
            final boolean bl = teleport;
            if (event != null) {
                event.setX(0.0);
                event.setY(0.0);
                event.setX(0.0);
            }
            else {
                Phase.mc.player.motionX = 0.0;
                Phase.mc.player.motionY = 0.0;
                Phase.mc.player.motionZ = 0.0;
            }
        }
    }
    
    private void doBoundingBox() {
        final double[] dirSpeed = this.getMotion(this.teleport ? 0.02250000089406967 : 0.02239999920129776);
        Phase.mc.player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(Phase.mc.player.posX + dirSpeed[0], Phase.mc.player.posY + (Phase.mc.gameSettings.keyBindJump.isKeyDown() ? (this.teleport ? 0.0625 : 0.0624) : 1.0E-8) - (Phase.mc.gameSettings.keyBindSneak.isKeyDown() ? (this.teleport ? 0.0625 : 0.0624) : 2.0E-8), Phase.mc.player.posZ + dirSpeed[1], Phase.mc.player.rotationYaw, Phase.mc.player.rotationPitch, false));
        Phase.mc.player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(Phase.mc.player.posX, -1337.0, Phase.mc.player.posZ, Phase.mc.player.rotationYaw, Phase.mc.player.rotationPitch, true));
        Phase.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Phase.mc.player, CPacketEntityAction.Action.START_FALL_FLYING));
        Phase.mc.player.setPosition(Phase.mc.player.posX + dirSpeed[0], Phase.mc.player.posY + (Phase.mc.gameSettings.keyBindJump.isKeyDown() ? (this.teleport ? 0.0625 : 0.0624) : 1.0E-8) - (Phase.mc.gameSettings.keyBindSneak.isKeyDown() ? (this.teleport ? 0.0625 : 0.0624) : 2.0E-8), Phase.mc.player.posZ + dirSpeed[1]);
        this.teleport = !this.teleport;
        Phase.mc.player.motionZ = 0.0;
        Phase.mc.player.motionY = 0.0;
        Phase.mc.player.motionX = 0.0;
        Phase.mc.player.noClip = this.teleport;
    }
    
    @SubscribeEvent
    public void onPacketReceive(final PacketEvent.Receive event) {
        if (this.posLook.getValue() && event.getPacket() instanceof SPacketPlayerPosLook) {
            final SPacketPlayerPosLook packet = (SPacketPlayerPosLook)event.getPacket();
            if (Phase.mc.player.isEntityAlive() && Phase.mc.world.isBlockLoaded(new BlockPos(Phase.mc.player.posX, Phase.mc.player.posY, Phase.mc.player.posZ)) && !(Phase.mc.currentScreen instanceof GuiDownloadTerrain)) {
                if (this.teleportIds <= 0) {
                    this.teleportIds = packet.getTeleportId();
                }
                if (this.cancel.getValue() && this.cancelType.getValue()) {
                    packet.yaw = Phase.mc.player.rotationYaw;
                    packet.pitch = Phase.mc.player.rotationPitch;
                    return;
                }
                if (this.cancel.getValue() && this.posLookPackets >= this.cancelPacket.getValue() && (!this.onlyY.getValue() || (!Phase.mc.gameSettings.keyBindForward.isKeyDown() && !Phase.mc.gameSettings.keyBindRight.isKeyDown() && !Phase.mc.gameSettings.keyBindLeft.isKeyDown() && !Phase.mc.gameSettings.keyBindBack.isKeyDown()))) {
                    this.posLookPackets = 0;
                    event.setCanceled(true);
                }
                ++this.posLookPackets;
            }
        }
    }
    
    @SubscribeEvent
    public void onPacketReceive(final PacketEvent.Send event) {
        if (this.scanPackets.getValue() && event.getPacket() instanceof CPacketPlayer) {
            final CPacketPlayer packetPlayer = (CPacketPlayer)event.getPacket();
            if (this.packets.contains(packetPlayer)) {
                this.packets.remove(packetPlayer);
            }
            else {
                event.setCanceled(true);
            }
        }
    }
    
    private double[] getMotion(final double speed) {
        float moveForward = Phase.mc.player.movementInput.moveForward;
        float moveStrafe = Phase.mc.player.movementInput.moveStrafe;
        float rotationYaw = Phase.mc.player.prevRotationYaw + (Phase.mc.player.rotationYaw - Phase.mc.player.prevRotationYaw) * Phase.mc.getRenderPartialTicks();
        if (moveForward != 0.0f) {
            if (moveStrafe > 0.0f) {
                rotationYaw += ((moveForward > 0.0f) ? -45 : 45);
            }
            else if (moveStrafe < 0.0f) {
                rotationYaw += ((moveForward > 0.0f) ? 45 : -45);
            }
            moveStrafe = 0.0f;
            if (moveForward > 0.0f) {
                moveForward = 1.0f;
            }
            else if (moveForward < 0.0f) {
                moveForward = -1.0f;
            }
        }
        final double posX = moveForward * speed * -Math.sin(Math.toRadians(rotationYaw)) + moveStrafe * speed * Math.cos(Math.toRadians(rotationYaw));
        final double posZ = moveForward * speed * Math.cos(Math.toRadians(rotationYaw)) - moveStrafe * speed * -Math.sin(Math.toRadians(rotationYaw));
        return new double[] { posX, posZ };
    }
    
    static {
        Phase.INSTANCE = new Phase();
    }
    
    public enum PacketFlyMode
    {
        NONE, 
        SETBACK;
    }
    
    public enum Mode
    {
        PACKETFLY;
    }
}
