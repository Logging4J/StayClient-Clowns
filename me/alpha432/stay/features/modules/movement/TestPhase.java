//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import java.util.*;
import me.alpha432.stay.features.setting.*;
import io.netty.util.internal.*;
import java.util.concurrent.*;
import me.alpha432.stay.util.world.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.server.*;
import net.minecraft.client.gui.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import me.alpha432.stay.util.counting.*;

public class TestPhase extends Module
{
    private static TestPhase instance;
    private final Set<CPacketPlayer> packets;
    private final Map<Integer, IDtime> teleportmap;
    public Setting<Boolean> flight;
    public Setting<Integer> flightMode;
    public Setting<Boolean> doAntiFactor;
    public Setting<Double> antiFactor;
    public Setting<Double> extraFactor;
    public Setting<Boolean> strafeFactor;
    public Setting<Integer> loops;
    public Setting<Boolean> clearTeleMap;
    public Setting<Integer> mapTime;
    public Setting<Boolean> clearIDs;
    public Setting<Boolean> setYaw;
    public Setting<Boolean> setID;
    public Setting<Boolean> setMove;
    public Setting<Boolean> nocliperino;
    public Setting<Boolean> sendTeleport;
    public Setting<Boolean> resetID;
    public Setting<Boolean> setPos;
    public Setting<Boolean> invalidPacket;
    private int flightCounter;
    private int teleportID;
    
    public TestPhase() {
        super("Packetfly", "Uses packets to fly!", Module.Category.MOVEMENT, true, false, false);
        this.packets = (Set<CPacketPlayer>)new ConcurrentSet();
        this.teleportmap = new ConcurrentHashMap<Integer, IDtime>();
        this.flight = (Setting<Boolean>)this.register(new Setting("Flight", (T)true));
        this.flightMode = (Setting<Integer>)this.register(new Setting("FMode", (T)0, (T)0, (T)1));
        this.doAntiFactor = (Setting<Boolean>)this.register(new Setting("Factorize", (T)true));
        this.antiFactor = (Setting<Double>)this.register(new Setting("AntiFactor", (T)2.5, (T)0.1, (T)3.0));
        this.extraFactor = (Setting<Double>)this.register(new Setting("ExtraFactor", (T)1.0, (T)0.1, (T)3.0));
        this.strafeFactor = (Setting<Boolean>)this.register(new Setting("StrafeFactor", (T)true));
        this.loops = (Setting<Integer>)this.register(new Setting("Loops", (T)1, (T)1, (T)10));
        this.clearTeleMap = (Setting<Boolean>)this.register(new Setting("ClearMap", (T)true));
        this.mapTime = (Setting<Integer>)this.register(new Setting("ClearTime", (T)30, (T)1, (T)500));
        this.clearIDs = (Setting<Boolean>)this.register(new Setting("ClearIDs", (T)true));
        this.setYaw = (Setting<Boolean>)this.register(new Setting("SetYaw", (T)true));
        this.setID = (Setting<Boolean>)this.register(new Setting("SetID", (T)true));
        this.setMove = (Setting<Boolean>)this.register(new Setting("SetMove", (T)false));
        this.nocliperino = (Setting<Boolean>)this.register(new Setting("NoClip", (T)false));
        this.sendTeleport = (Setting<Boolean>)this.register(new Setting("Teleport", (T)true));
        this.resetID = (Setting<Boolean>)this.register(new Setting("ResetID", (T)true));
        this.setPos = (Setting<Boolean>)this.register(new Setting("SetPos", (T)false));
        this.invalidPacket = (Setting<Boolean>)this.register(new Setting("InvalidPacket", (T)true));
        this.flightCounter = 0;
        this.teleportID = 0;
        TestPhase.instance = this;
    }
    
    public static TestPhase getInstance() {
        if (TestPhase.instance == null) {
            TestPhase.instance = new TestPhase();
        }
        return TestPhase.instance;
    }
    
    public void onToggle() {
    }
    
    public void onTick() {
        this.teleportmap.entrySet().removeIf(idTime -> this.clearTeleMap.getValue() && idTime.getValue().getTimer().passedS(this.mapTime.getValue()));
    }
    
    @SubscribeEvent
    public void onUpdateWalkingPlayer(final MotionUpdateEvent event) {
        if (event.getStage() == 1) {
            return;
        }
        TestPhase.mc.player.setVelocity(0.0, 0.0, 0.0);
        double speed = 0.0;
        final boolean checkCollisionBoxes = this.checkHitBoxes();
        speed = ((TestPhase.mc.player.movementInput.jump && (checkCollisionBoxes || !EntityUtils.isMoving())) ? ((this.flight.getValue() && !checkCollisionBoxes) ? ((this.flightMode.getValue() == 0) ? (this.resetCounter(10) ? -0.032 : 0.062) : (this.resetCounter(20) ? -0.032 : 0.062)) : 0.062) : (TestPhase.mc.player.movementInput.sneak ? -0.062 : (checkCollisionBoxes ? 0.0 : (this.resetCounter(4) ? (this.flight.getValue() ? -0.04 : 0.0) : 0.0))));
        if (this.doAntiFactor.getValue() && checkCollisionBoxes && EntityUtils.isMoving() && speed != 0.0) {
            speed /= this.antiFactor.getValue();
        }
        final double[] strafing = this.getMotion((this.strafeFactor.getValue() && checkCollisionBoxes) ? 0.031 : 0.26);
        for (int i = 1; i < this.loops.getValue() + 1; ++i) {
            TestPhase.mc.player.motionX = strafing[0] * i * this.extraFactor.getValue();
            TestPhase.mc.player.motionY = speed * i;
            TestPhase.mc.player.motionZ = strafing[1] * i * this.extraFactor.getValue();
            this.sendPackets(TestPhase.mc.player.motionX, TestPhase.mc.player.motionY, TestPhase.mc.player.motionZ, this.sendTeleport.getValue());
        }
    }
    
    @SubscribeEvent
    public void onMove(final MoveEvent event) {
        if (this.setMove.getValue() && this.flightCounter != 0) {
            event.setX(TestPhase.mc.player.motionX);
            event.setY(TestPhase.mc.player.motionY);
            event.setZ(TestPhase.mc.player.motionZ);
            if (this.nocliperino.getValue() && this.checkHitBoxes()) {
                TestPhase.mc.player.noClip = true;
            }
        }
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        final CPacketPlayer packet;
        if (event.getPacket() instanceof CPacketPlayer && !this.packets.remove(packet = (CPacketPlayer)event.getPacket())) {
            event.setCanceled(true);
        }
    }
    
    @SubscribeEvent
    public void onPushOutOfBlocks(final PushEvent event) {
        if (event.getStage() == 1) {
            event.setCanceled(true);
        }
    }
    
    @SubscribeEvent
    public void onPacketReceive(final PacketEvent.Receive event) {
        if (event.getPacket() instanceof SPacketPlayerPosLook && !fullNullCheck()) {
            final SPacketPlayerPosLook packet = (SPacketPlayerPosLook)event.getPacket();
            final BlockPos pos;
            if (TestPhase.mc.player.isEntityAlive() && TestPhase.mc.world.isBlockLoaded(pos = new BlockPos(TestPhase.mc.player.posX, TestPhase.mc.player.posY, TestPhase.mc.player.posZ), false) && !(TestPhase.mc.currentScreen instanceof GuiDownloadTerrain) && this.clearIDs.getValue()) {
                this.teleportmap.remove(packet.getTeleportId());
            }
            if (this.setYaw.getValue()) {
                packet.yaw = TestPhase.mc.player.rotationYaw;
                packet.pitch = TestPhase.mc.player.rotationPitch;
            }
            if (this.setID.getValue()) {
                this.teleportID = packet.getTeleportId();
            }
        }
    }
    
    private boolean checkHitBoxes() {
        return !TestPhase.mc.world.getCollisionBoxes((Entity)TestPhase.mc.player, TestPhase.mc.player.getEntityBoundingBox().expand(-0.0625, -0.0625, -0.0625)).isEmpty();
    }
    
    private boolean resetCounter(final int counter) {
        if (++this.flightCounter >= counter) {
            this.flightCounter = 0;
            return true;
        }
        return false;
    }
    
    private double[] getMotion(final double speed) {
        float moveForward = TestPhase.mc.player.movementInput.moveForward;
        float moveStrafe = TestPhase.mc.player.movementInput.moveStrafe;
        float rotationYaw = TestPhase.mc.player.prevRotationYaw + (TestPhase.mc.player.rotationYaw - TestPhase.mc.player.prevRotationYaw) * TestPhase.mc.getRenderPartialTicks();
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
    
    private void sendPackets(final double x, final double y, final double z, final boolean teleport) {
        final Vec3d vec = new Vec3d(x, y, z);
        final Vec3d position = TestPhase.mc.player.getPositionVector().add(vec);
        final Vec3d outOfBoundsVec = this.outOfBoundsVec(vec, position);
        this.packetSender((CPacketPlayer)new CPacketPlayer.Position(position.x, position.y, position.z, TestPhase.mc.player.onGround));
        if (this.invalidPacket.getValue()) {
            this.packetSender((CPacketPlayer)new CPacketPlayer.Position(outOfBoundsVec.x, outOfBoundsVec.y, outOfBoundsVec.z, TestPhase.mc.player.onGround));
        }
        if (this.setPos.getValue()) {
            TestPhase.mc.player.setPosition(position.x, position.y, position.z);
        }
        this.teleportPacket(position, teleport);
    }
    
    private void teleportPacket(final Vec3d pos, final boolean shouldTeleport) {
        if (shouldTeleport) {
            TestPhase.mc.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(++this.teleportID));
            this.teleportmap.put(this.teleportID, new IDtime(pos, new Timer()));
        }
    }
    
    private Vec3d outOfBoundsVec(final Vec3d offset, final Vec3d position) {
        return position.add(0.0, 1337.0, 0.0);
    }
    
    private void packetSender(final CPacketPlayer packet) {
        this.packets.add(packet);
        TestPhase.mc.player.connection.sendPacket((Packet)packet);
    }
    
    private void clean() {
        this.teleportmap.clear();
        this.flightCounter = 0;
        if (this.resetID.getValue()) {
            this.teleportID = 0;
        }
        this.packets.clear();
    }
    
    public static class IDtime
    {
        private final Vec3d pos;
        private final Timer timer;
        
        public IDtime(final Vec3d pos, final Timer timer) {
            this.pos = pos;
            (this.timer = timer).reset();
        }
        
        public Vec3d getPos() {
            return this.pos;
        }
        
        public Timer getTimer() {
            return this.timer;
        }
    }
}
