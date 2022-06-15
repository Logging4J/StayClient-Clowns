//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.client.*;
import net.minecraft.network.play.server.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import me.alpha432.stay.features.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraft.potion.*;
import java.util.*;

public class LongJump extends Module
{
    private final Setting<Integer> timeout;
    private final Setting<Float> boost;
    private final Setting<Mode> mode;
    private final Setting<Boolean> lagOff;
    private final Setting<Boolean> autoOff;
    private final Setting<Boolean> disableStrafe;
    private final Setting<Boolean> strafeOff;
    private final Setting<Boolean> step;
    private final Timer timer;
    private int stage;
    private int lastHDistance;
    private int airTicks;
    private int headStart;
    private int groundTicks;
    private double moveSpeed;
    private double lastDist;
    private boolean isSpeeding;
    private boolean beganJump;
    
    public LongJump() {
        super("LongJump", "Jumps long", Module.Category.MOVEMENT, true, false, false);
        this.timeout = (Setting<Integer>)this.register(new Setting("TimeOut", (T)2000, (T)0, (T)5000));
        this.boost = (Setting<Float>)this.register(new Setting("Boost", (T)4.48f, (T)1.0f, (T)20.0f));
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.DIRECT));
        this.lagOff = (Setting<Boolean>)this.register(new Setting("LagOff", (T)false));
        this.autoOff = (Setting<Boolean>)this.register(new Setting("AutoOff", (T)false));
        this.disableStrafe = (Setting<Boolean>)this.register(new Setting("DisableStrafe", (T)false));
        this.strafeOff = (Setting<Boolean>)this.register(new Setting("StrafeOff", (T)false));
        this.step = (Setting<Boolean>)this.register(new Setting("SetStep", (T)false));
        this.timer = new Timer();
        this.beganJump = false;
    }
    
    public void onEnable() {
        this.timer.reset();
        this.headStart = 4;
        this.groundTicks = 0;
        this.stage = 0;
        this.beganJump = false;
        if (Strafe.getInstance().isOn() && this.disableStrafe.getValue()) {
            Strafe.getInstance().disable();
        }
    }
    
    public void onDisable() {
        Stay.timerManager.setTimer(1.0f);
    }
    
    @SubscribeEvent
    public void onPacketReceive(final PacketEvent.Receive event) {
        if (this.lagOff.getValue() && event.getPacket() instanceof SPacketPlayerPosLook) {
            this.disable();
        }
    }
    
    @SubscribeEvent
    public void onMove(final MoveEvent event) {
        if (event.getStage() != 0) {
            return;
        }
        if (!this.timer.passedMs(this.timeout.getValue())) {
            event.setX(0.0);
            event.setY(0.0);
            event.setZ(0.0);
            return;
        }
        if (this.step.getValue()) {
            LongJump.mc.player.stepHeight = 0.6f;
        }
        this.doVirtue(event);
    }
    
    @SubscribeEvent
    public void onTickEvent(final TickEvent.ClientTickEvent event) {
        if (Feature.fullNullCheck() || event.phase != TickEvent.Phase.START) {
            return;
        }
        if (Strafe.getInstance().isOn() && this.strafeOff.getValue()) {
            this.disable();
            return;
        }
        switch (this.mode.getValue()) {
            case TICK: {
                this.doNormal(null);
                break;
            }
        }
    }
    
    @SubscribeEvent
    public void onUpdateWalkingPlayer(final MotionUpdateEvent event) {
        if (event.getStage() != 0) {
            return;
        }
        if (!this.timer.passedMs(this.timeout.getValue())) {
            event.setCanceled(true);
            return;
        }
        this.doNormal(event);
    }
    
    private void doNormal(final MotionUpdateEvent event) {
        if (this.autoOff.getValue() && this.beganJump && LongJump.mc.player.onGround) {
            this.disable();
            return;
        }
        switch (this.mode.getValue()) {
            case VIRTUE: {
                if (LongJump.mc.player.moveForward != 0.0f || LongJump.mc.player.moveStrafing != 0.0f) {
                    final double xDist = LongJump.mc.player.posX - LongJump.mc.player.prevPosX;
                    final double zDist = LongJump.mc.player.posZ - LongJump.mc.player.prevPosZ;
                    this.lastDist = Math.sqrt(xDist * xDist + zDist * zDist);
                    break;
                }
                event.setCanceled(true);
                break;
            }
            case TICK: {
                if (event != null) {
                    return;
                }
            }
            case DIRECT: {
                if (EntityUtils.isInLiquid()) {
                    break;
                }
                if (EntityUtils.isOnLiquid()) {
                    break;
                }
                if (LongJump.mc.player.onGround) {
                    this.lastHDistance = 0;
                }
                final float direction = LongJump.mc.player.rotationYaw + ((LongJump.mc.player.moveForward < 0.0f) ? 180 : 0) + ((LongJump.mc.player.moveStrafing > 0.0f) ? (-90.0f * ((LongJump.mc.player.moveForward < 0.0f) ? -0.5f : ((LongJump.mc.player.moveForward > 0.0f) ? 0.5f : 1.0f))) : 0.0f) - ((LongJump.mc.player.moveStrafing < 0.0f) ? (-90.0f * ((LongJump.mc.player.moveForward < 0.0f) ? -0.5f : ((LongJump.mc.player.moveForward > 0.0f) ? 0.5f : 1.0f))) : 0.0f);
                final float xDir = (float)Math.cos((direction + 90.0f) * 3.141592653589793 / 180.0);
                final float zDir = (float)Math.sin((direction + 90.0f) * 3.141592653589793 / 180.0);
                if (!LongJump.mc.player.collidedVertically) {
                    ++this.airTicks;
                    this.isSpeeding = true;
                    if (LongJump.mc.gameSettings.keyBindSneak.isKeyDown()) {
                        LongJump.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(0.0, 2.147483647E9, 0.0, false));
                    }
                    this.groundTicks = 0;
                    if (!LongJump.mc.player.collidedVertically) {
                        if (LongJump.mc.player.motionY == -0.07190068807140403) {
                            final EntityPlayerSP player;
                            final EntityPlayerSP player = player = LongJump.mc.player;
                            player.motionY *= 0.3499999940395355;
                        }
                        else if (LongJump.mc.player.motionY == -0.10306193759436909) {
                            final EntityPlayerSP player2;
                            final EntityPlayerSP player2 = player2 = LongJump.mc.player;
                            player2.motionY *= 0.550000011920929;
                        }
                        else if (LongJump.mc.player.motionY == -0.13395038817442878) {
                            final EntityPlayerSP player3;
                            final EntityPlayerSP player3 = player3 = LongJump.mc.player;
                            player3.motionY *= 0.6700000166893005;
                        }
                        else if (LongJump.mc.player.motionY == -0.16635183030382) {
                            final EntityPlayerSP player4;
                            final EntityPlayerSP player4 = player4 = LongJump.mc.player;
                            player4.motionY *= 0.6899999976158142;
                        }
                        else if (LongJump.mc.player.motionY == -0.19088711097794803) {
                            final EntityPlayerSP player5;
                            final EntityPlayerSP player5 = player5 = LongJump.mc.player;
                            player5.motionY *= 0.7099999785423279;
                        }
                        else if (LongJump.mc.player.motionY == -0.21121925191528862) {
                            final EntityPlayerSP player6;
                            final EntityPlayerSP player6 = player6 = LongJump.mc.player;
                            player6.motionY *= 0.20000000298023224;
                        }
                        else if (LongJump.mc.player.motionY == -0.11979897632390576) {
                            final EntityPlayerSP player7;
                            final EntityPlayerSP player7 = player7 = LongJump.mc.player;
                            player7.motionY *= 0.9300000071525574;
                        }
                        else if (LongJump.mc.player.motionY == -0.18758479151225355) {
                            final EntityPlayerSP player8;
                            final EntityPlayerSP player8 = player8 = LongJump.mc.player;
                            player8.motionY *= 0.7200000286102295;
                        }
                        else if (LongJump.mc.player.motionY == -0.21075983825251726) {
                            final EntityPlayerSP player9;
                            final EntityPlayerSP player9 = player9 = LongJump.mc.player;
                            player9.motionY *= 0.7599999904632568;
                        }
                        if (LongJump.mc.player.motionY < -0.2 && LongJump.mc.player.motionY > -0.24) {
                            final EntityPlayerSP player10;
                            final EntityPlayerSP player10 = player10 = LongJump.mc.player;
                            player10.motionY *= 0.7;
                        }
                        if (LongJump.mc.player.motionY < -0.25 && LongJump.mc.player.motionY > -0.32) {
                            final EntityPlayerSP player11;
                            final EntityPlayerSP player11 = player11 = LongJump.mc.player;
                            player11.motionY *= 0.8;
                        }
                        if (LongJump.mc.player.motionY < -0.35 && LongJump.mc.player.motionY > -0.8) {
                            final EntityPlayerSP player12;
                            final EntityPlayerSP player12 = player12 = LongJump.mc.player;
                            player12.motionY *= 0.98;
                        }
                        if (LongJump.mc.player.motionY < -0.8 && LongJump.mc.player.motionY > -1.6) {
                            final EntityPlayerSP player13;
                            final EntityPlayerSP player13 = player13 = LongJump.mc.player;
                            player13.motionY *= 0.99;
                        }
                    }
                    Stay.timerManager.setTimer(0.85f);
                    final double[] speedVals = { 0.420606, 0.417924, 0.415258, 0.412609, 0.409977, 0.407361, 0.404761, 0.402178, 0.399611, 0.39706, 0.394525, 0.392, 0.3894, 0.38644, 0.383655, 0.381105, 0.37867, 0.37625, 0.37384, 0.37145, 0.369, 0.3666, 0.3642, 0.3618, 0.35945, 0.357, 0.354, 0.351, 0.348, 0.345, 0.342, 0.339, 0.336, 0.333, 0.33, 0.327, 0.324, 0.321, 0.318, 0.315, 0.312, 0.309, 0.307, 0.305, 0.303, 0.3, 0.297, 0.295, 0.293, 0.291, 0.289, 0.287, 0.285, 0.283, 0.281, 0.279, 0.277, 0.275, 0.273, 0.271, 0.269, 0.267, 0.265, 0.263, 0.261, 0.259, 0.257, 0.255, 0.253, 0.251, 0.249, 0.247, 0.245, 0.243, 0.241, 0.239, 0.237 };
                    if (LongJump.mc.gameSettings.keyBindForward.pressed) {
                        try {
                            LongJump.mc.player.motionX = xDir * speedVals[this.airTicks - 1] * 3.0;
                            LongJump.mc.player.motionZ = zDir * speedVals[this.airTicks - 1] * 3.0;
                            break;
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                            return;
                        }
                    }
                    LongJump.mc.player.motionX = 0.0;
                    LongJump.mc.player.motionZ = 0.0;
                    break;
                }
                Stay.timerManager.setTimer(1.0f);
                this.airTicks = 0;
                ++this.groundTicks;
                --this.headStart;
                final EntityPlayerSP player14;
                final EntityPlayerSP player14 = player14 = LongJump.mc.player;
                player14.motionX /= 13.0;
                final EntityPlayerSP player15;
                final EntityPlayerSP player15 = player15 = LongJump.mc.player;
                player15.motionZ /= 13.0;
                if (this.groundTicks == 1) {
                    this.updatePosition(LongJump.mc.player.posX, LongJump.mc.player.posY, LongJump.mc.player.posZ);
                    this.updatePosition(LongJump.mc.player.posX + 0.0624, LongJump.mc.player.posY, LongJump.mc.player.posZ);
                    this.updatePosition(LongJump.mc.player.posX, LongJump.mc.player.posY + 0.419, LongJump.mc.player.posZ);
                    this.updatePosition(LongJump.mc.player.posX + 0.0624, LongJump.mc.player.posY, LongJump.mc.player.posZ);
                    this.updatePosition(LongJump.mc.player.posX, LongJump.mc.player.posY + 0.419, LongJump.mc.player.posZ);
                    break;
                }
                if (this.groundTicks > 2) {
                    this.groundTicks = 0;
                    LongJump.mc.player.motionX = xDir * 0.3;
                    LongJump.mc.player.motionZ = zDir * 0.3;
                    LongJump.mc.player.motionY = 0.42399999499320984;
                    this.beganJump = true;
                    break;
                }
                break;
            }
        }
    }
    
    private void doVirtue(final MoveEvent event) {
        if (this.mode.getValue() == Mode.VIRTUE && (LongJump.mc.player.moveForward != 0.0f || (LongJump.mc.player.moveStrafing != 0.0f && !EntityUtils.isOnLiquid() && !EntityUtils.isInLiquid()))) {
            if (this.stage == 0) {
                this.moveSpeed = this.boost.getValue() * this.getBaseMoveSpeed();
            }
            else if (this.stage == 1) {
                event.setY(LongJump.mc.player.motionY = 0.42);
                this.moveSpeed *= 2.149;
            }
            else if (this.stage == 2) {
                final double difference = 0.66 * (this.lastDist - this.getBaseMoveSpeed());
                this.moveSpeed = this.lastDist - difference;
            }
            else {
                this.moveSpeed = this.lastDist - this.lastDist / 159.0;
            }
            this.setMoveSpeed(event, this.moveSpeed = Math.max(this.getBaseMoveSpeed(), this.moveSpeed));
            final List<AxisAlignedBB> collidingList = (List<AxisAlignedBB>)LongJump.mc.world.getCollisionBoxes((Entity)LongJump.mc.player, LongJump.mc.player.getEntityBoundingBox().offset(0.0, LongJump.mc.player.motionY, 0.0));
            final List<AxisAlignedBB> collidingList2 = (List<AxisAlignedBB>)LongJump.mc.world.getCollisionBoxes((Entity)LongJump.mc.player, LongJump.mc.player.getEntityBoundingBox().offset(0.0, -0.4, 0.0));
            if (!LongJump.mc.player.collidedVertically && (collidingList.size() > 0 || collidingList2.size() > 0)) {
                event.setY(LongJump.mc.player.motionY = -0.001);
            }
            ++this.stage;
        }
        else if (this.stage > 0) {
            this.disable();
        }
    }
    
    private void invalidPacket() {
        this.updatePosition(0.0, 2.147483647E9, 0.0);
    }
    
    private void updatePosition(final double x, final double y, final double z) {
        LongJump.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(x, y, z, LongJump.mc.player.onGround));
    }
    
    private Block getBlock(final BlockPos pos) {
        return LongJump.mc.world.getBlockState(pos).getBlock();
    }
    
    private double getDistance(final EntityPlayer player, final double distance) {
        final List<AxisAlignedBB> boundingBoxes = (List<AxisAlignedBB>)player.world.getCollisionBoxes((Entity)player, player.getEntityBoundingBox().offset(0.0, -distance, 0.0));
        if (boundingBoxes.isEmpty()) {
            return 0.0;
        }
        double y = 0.0;
        for (final AxisAlignedBB boundingBox : boundingBoxes) {
            if (boundingBox.maxY > y) {
                y = boundingBox.maxY;
            }
        }
        return player.posY - y;
    }
    
    private void setMoveSpeed(final MoveEvent event, final double speed) {
        final MovementInput movementInput = LongJump.mc.player.movementInput;
        double forward = movementInput.moveForward;
        double strafe = movementInput.moveStrafe;
        float yaw = LongJump.mc.player.rotationYaw;
        if (forward == 0.0 && strafe == 0.0) {
            event.setX(0.0);
            event.setZ(0.0);
        }
        else {
            if (forward != 0.0) {
                if (strafe > 0.0) {
                    yaw += ((forward > 0.0) ? -45 : 45);
                }
                else if (strafe < 0.0) {
                    yaw += ((forward > 0.0) ? 45 : -45);
                }
                strafe = 0.0;
                if (forward > 0.0) {
                    forward = 1.0;
                }
                else if (forward < 0.0) {
                    forward = -1.0;
                }
            }
            event.setX(forward * speed * Math.cos(Math.toRadians(yaw + 90.0f)) + strafe * speed * Math.sin(Math.toRadians(yaw + 90.0f)));
            event.setZ(forward * speed * Math.sin(Math.toRadians(yaw + 90.0f)) - strafe * speed * Math.cos(Math.toRadians(yaw + 90.0f)));
        }
    }
    
    private double getBaseMoveSpeed() {
        double baseSpeed = 0.2873;
        if (LongJump.mc.player != null && LongJump.mc.player.isPotionActive(MobEffects.SPEED)) {
            final int amplifier = Objects.requireNonNull(LongJump.mc.player.getActivePotionEffect(MobEffects.SPEED)).getAmplifier();
            baseSpeed *= 1.0 + 0.2 * (amplifier + 1);
        }
        return baseSpeed;
    }
    
    public enum Mode
    {
        VIRTUE, 
        DIRECT, 
        TICK;
    }
}
