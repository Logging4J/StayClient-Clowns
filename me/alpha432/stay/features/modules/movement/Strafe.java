//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.manager.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.potion.*;
import java.util.*;

public class Strafe extends Module
{
    public Setting<Mode> mode;
    private static Strafe INSTANCE;
    private double lastDist;
    private double moveSpeed;
    int stage;
    
    public Strafe() {
        super("Strafe", "Modifies sprinting", Module.Category.MOVEMENT, true, false, false);
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.NORMAL));
        this.setInstance();
    }
    
    private void setInstance() {
        Strafe.INSTANCE = this;
    }
    
    public static Strafe getInstance() {
        if (Strafe.INSTANCE != null) {
            return Strafe.INSTANCE;
        }
        return Strafe.INSTANCE = new Strafe();
    }
    
    @SubscribeEvent
    public void onMotionUpdateEvent(final MotionUpdateEvent event) {
        if (event.getStage() == 1 && fullNullCheck()) {
            return;
        }
        this.lastDist = Math.sqrt((Strafe.mc.player.posX - Strafe.mc.player.prevPosX) * (Strafe.mc.player.posX - Strafe.mc.player.prevPosX) + (Strafe.mc.player.posZ - Strafe.mc.player.prevPosZ) * (Strafe.mc.player.posZ - Strafe.mc.player.prevPosZ));
    }
    
    @SubscribeEvent
    public void onStrafe(final MoveEvent event) {
        if (fullNullCheck()) {
            return;
        }
        if (Strafe.mc.player.isInWater()) {
            return;
        }
        if (Strafe.mc.player.isInLava()) {
            return;
        }
        if (ModuleManager.getModuleByName("Phase").isEnabled()) {
            return;
        }
        if (Strafe.mc.player.onGround) {
            this.stage = 2;
        }
        switch (this.stage) {
            case 0: {
                ++this.stage;
                this.lastDist = 0.0;
                break;
            }
            case 2: {
                double motionY = 0.40123128;
                if (!Strafe.mc.player.onGround) {
                    break;
                }
                if (!Strafe.mc.gameSettings.keyBindJump.isKeyDown()) {
                    break;
                }
                if (Strafe.mc.player.isPotionActive(MobEffects.JUMP_BOOST)) {
                    motionY += (Strafe.mc.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + 1) * 0.1f;
                }
                event.setY(Strafe.mc.player.motionY = motionY);
                this.moveSpeed *= ((this.mode.getValue() == Mode.NORMAL) ? 1.67 : 2.149);
                break;
            }
            case 3: {
                this.moveSpeed = this.lastDist - ((this.mode.getValue() == Mode.NORMAL) ? 0.6896 : 0.795) * (this.lastDist - this.getBaseMoveSpeed());
                break;
            }
            default: {
                if ((Strafe.mc.world.getCollisionBoxes((Entity)Strafe.mc.player, Strafe.mc.player.getEntityBoundingBox().offset(0.0, Strafe.mc.player.motionY, 0.0)).size() > 0 || Strafe.mc.player.collidedVertically) && this.stage > 0) {
                    this.stage = ((Strafe.mc.player.moveForward != 0.0f || Strafe.mc.player.moveStrafing != 0.0f) ? 1 : 0);
                }
                this.moveSpeed = this.lastDist - this.lastDist / ((this.mode.getValue() == Mode.NORMAL) ? 730.0 : 159.0);
                break;
            }
        }
        this.moveSpeed = ((!Strafe.mc.gameSettings.keyBindJump.isKeyDown() && Strafe.mc.player.onGround) ? this.getBaseMoveSpeed() : Math.max(this.moveSpeed, this.getBaseMoveSpeed()));
        double n = Strafe.mc.player.movementInput.moveForward;
        double n2 = Strafe.mc.player.movementInput.moveStrafe;
        final double n3 = Strafe.mc.player.rotationYaw;
        if (n == 0.0 && n2 == 0.0) {
            event.setX(0.0);
            event.setZ(0.0);
        }
        else if (n != 0.0 && n2 != 0.0) {
            n *= Math.sin(0.7853981633974483);
            n2 *= Math.cos(0.7853981633974483);
        }
        final double n4 = (this.mode.getValue() == Mode.NORMAL) ? 0.993 : 0.99;
        event.setX((n * this.moveSpeed * -Math.sin(Math.toRadians(n3)) + n2 * this.moveSpeed * Math.cos(Math.toRadians(n3))) * n4);
        event.setZ((n * this.moveSpeed * Math.cos(Math.toRadians(n3)) - n2 * this.moveSpeed * -Math.sin(Math.toRadians(n3))) * n4);
        ++this.stage;
        event.setCanceled(true);
    }
    
    public double getBaseMoveSpeed() {
        double n = 0.2873;
        if (!Strafe.mc.player.isPotionActive(MobEffects.SPEED)) {
            return n;
        }
        n *= 1.0 + 0.2 * (Objects.requireNonNull(Strafe.mc.player.getActivePotionEffect(MobEffects.SPEED)).getAmplifier() + 1);
        return n;
    }
    
    public String getDisplayInfo() {
        return this.mode.currentEnumName();
    }
    
    static {
        Strafe.INSTANCE = new Strafe();
    }
    
    public enum Mode
    {
        NORMAL, 
        Strict;
    }
}
