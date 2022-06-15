//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;

public class Step extends Module
{
    public Setting<Mode> mode;
    private final Setting<Double> height;
    private final Setting<Double> timerTicks;
    public Setting<Boolean> useTimer;
    public Setting<Boolean> entityStep;
    public Setting<Boolean> sneakPause;
    public Setting<Boolean> waterPause;
    public Setting<Modes> disable;
    double[] forwardStep;
    double originalHeight;
    
    public Step() {
        super("Step", "placeholder", Module.Category.MOVEMENT, false, false, false);
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.Teleport));
        this.height = (Setting<Double>)this.register(new Setting("Height", (T)2.0, (T)0.0, (T)10.0));
        this.timerTicks = (Setting<Double>)this.register(new Setting("Timer Speed", (T)0.5, (T)0.1, (T)2.0));
        this.useTimer = (Setting<Boolean>)this.register(new Setting("use Timer", (T)false));
        this.entityStep = (Setting<Boolean>)this.register(new Setting("Entity Step", (T)false));
        this.sneakPause = (Setting<Boolean>)this.register(new Setting("When Sneaking", (T)false));
        this.waterPause = (Setting<Boolean>)this.register(new Setting("When in Liquid", (T)true));
        this.disable = (Setting<Modes>)this.register(new Setting("Disable", (T)Modes.Never));
    }
    
    public void onEnable() {
        if (nullCheck()) {
            return;
        }
        this.originalHeight = Step.mc.player.posY;
    }
    
    public void onUpdate() {
        if (nullCheck()) {
            return;
        }
        if (!Step.mc.player.collidedHorizontally) {
            return;
        }
        if (Step.mc.player.isOnLadder() || Step.mc.player.movementInput.jump) {
            return;
        }
        if ((Step.mc.player.isInWater() || Step.mc.player.isInLava()) && this.waterPause.getValue()) {
            return;
        }
        if (!Step.mc.player.onGround) {
            return;
        }
        if (this.useTimer.getValue()) {
            Step.mc.timer.tickLength = (float)(50.0 / this.timerTicks.getValue());
        }
        if (this.entityStep.getValue() && Step.mc.player.isRiding()) {
            Step.mc.player.ridingEntity.stepHeight = (float)(this.height.getValue() / 1.0);
        }
        if (Step.mc.player.isSneaking() && this.sneakPause.getValue()) {
            return;
        }
        this.forwardStep = getMoveSpeed(0.1);
        if (this.getStepHeight().equals(StepHeight.Unsafe)) {
            if (this.disable.getValue() == Modes.Never) {
                this.disable();
            }
            return;
        }
        if (this.mode.getValue() == Mode.Teleport) {
            this.stepTeleport();
        }
        if (this.mode.getValue() == Mode.Spider) {
            this.stepSpider();
        }
        if (this.mode.getValue() == Mode.Vanilla) {
            this.stepVanilla();
        }
        if (Step.mc.player.posY > this.originalHeight + this.getStepHeight().height && this.disable.getValue() == Modes.Completion) {
            this.disable();
        }
    }
    
    public static double[] getMoveSpeed(final double speed) {
        float forward = Step.mc.player.movementInput.moveForward;
        float strafe = Step.mc.player.movementInput.moveStrafe;
        float yaw = Step.mc.player.rotationYaw;
        if (forward != 0.0f) {
            if (strafe >= 1.0f) {
                yaw += ((forward > 0.0f) ? -45 : 45);
                strafe = 0.0f;
            }
            else if (strafe <= -1.0f) {
                yaw += ((forward > 0.0f) ? 45 : -45);
                strafe = 0.0f;
            }
            if (forward > 0.0f) {
                forward = 1.0f;
            }
            else if (forward < 0.0f) {
                forward = -1.0f;
            }
        }
        final double sin = Math.sin(Math.toRadians(yaw + 90.0f));
        final double cos = Math.cos(Math.toRadians(yaw + 90.0f));
        double motionX = forward * speed * cos + strafe * speed * sin;
        double motionZ = forward * speed * sin - strafe * speed * cos;
        if (!isMoving()) {
            motionX = 0.0;
            motionZ = 0.0;
        }
        return new double[] { motionX, motionZ };
    }
    
    public static boolean isMoving() {
        return Step.mc.player.moveForward != 0.0 || Step.mc.player.moveStrafing != 0.0;
    }
    
    public void stepTeleport() {
        this.updateStepPackets(this.getStepHeight().stepArray);
        Step.mc.player.setPosition(Step.mc.player.posX, Step.mc.player.posY + this.getStepHeight().height, Step.mc.player.posZ);
    }
    
    public void stepSpider() {
        this.updateStepPackets(this.getStepHeight().stepArray);
        Step.mc.player.motionY = 0.2;
        Step.mc.player.fallDistance = 0.0f;
    }
    
    public void stepVanilla() {
        Step.mc.player.setPosition(Step.mc.player.posX, Step.mc.player.posY + this.getStepHeight().height, Step.mc.player.posZ);
    }
    
    public void updateStepPackets(final double[] stepArray) {
        for (final double v : stepArray) {
            Step.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Step.mc.player.posX, Step.mc.player.posY + v, Step.mc.player.posZ, Step.mc.player.onGround));
        }
    }
    
    public StepHeight getStepHeight() {
        if (Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 1.0, this.forwardStep[1])).isEmpty() && !Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 0.6, this.forwardStep[1])).isEmpty()) {
            return StepHeight.One;
        }
        if (Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 1.6, this.forwardStep[1])).isEmpty() && !Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 1.4, this.forwardStep[1])).isEmpty()) {
            return StepHeight.OneHalf;
        }
        if (Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 2.1, this.forwardStep[1])).isEmpty() && !Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 1.9, this.forwardStep[1])).isEmpty()) {
            return StepHeight.Two;
        }
        if (Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 2.6, this.forwardStep[1])).isEmpty() && !Step.mc.world.getCollisionBoxes((Entity)Step.mc.player, Step.mc.player.getEntityBoundingBox().offset(this.forwardStep[0], 2.4, this.forwardStep[1])).isEmpty()) {
            return StepHeight.TwoHalf;
        }
        return StepHeight.Unsafe;
    }
    
    public enum Mode
    {
        Teleport, 
        Spider, 
        Vanilla;
    }
    
    public enum Modes
    {
        Never, 
        Completion;
    }
    
    public enum StepHeight
    {
        One(1.0, new double[] { 0.42, 0.753 }), 
        OneHalf(1.5, new double[] { 0.42, 0.75, 1.0, 1.16, 1.23, 1.2 }), 
        Two(2.0, new double[] { 0.42, 0.78, 0.63, 0.51, 0.9, 1.21, 1.45, 1.43 }), 
        TwoHalf(2.5, new double[] { 0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.907 }), 
        Unsafe(3.0, new double[] { 0.0 });
        
        double[] stepArray;
        double height;
        
        private StepHeight(final double height, final double[] stepArray) {
            this.height = height;
            this.stepArray = stepArray;
        }
    }
}
