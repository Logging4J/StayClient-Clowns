//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.player;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;
import net.minecraft.init.*;
import net.minecraft.potion.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0012\u0010\u001f\u001a\u00020\u0014*\u00020\u001a2\u0006\u0010 \u001a\u00020\u0014J\u0012\u0010!\u001a\u00020\u0014*\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0014J\u0015\u0010!\u001a\u00020\u0014*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0014H\u0086\bJ(\u0010#\u001a\u00020\u0014*\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000bJ\n\u0010'\u001a\u00020\u0004*\u00020(J\u001a\u0010)\u001a\u00020\u0004*\u00020(2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0014J\u0012\u0010)\u001a\u00020\u0004*\u00020(2\u0006\u0010,\u001a\u00020-J\u0012\u0010)\u001a\u00020\u0004*\u00020(2\u0006\u0010,\u001a\u00020.J\u0012\u0010)\u001a\u00020\u0004*\u00020\u00112\u0006\u0010/\u001a\u00020-J\n\u00100\u001a\u000201*\u000202J\n\u00103\u001a\u000201*\u000202J\u0012\u00104\u001a\u000201*\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u00048\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0010\u001a\u00020\u0004*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0017\u001a\u00020\u0014*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u001a8\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00065" }, d2 = { "Lme/alpha432/stay/util/player/MovementUtils;", "", "()V", "isInputting", "", "()Z", "isInputtingAny", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "roundedForward", "", "getRoundedForward", "()F", "roundedStrafing", "getRoundedStrafing", "isMoving", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)Z", "realSpeed", "", "getRealSpeed", "(Lnet/minecraft/entity/Entity;)D", "speed", "getSpeed", "speedEffectMultiplier", "Lnet/minecraft/entity/EntityLivingBase;", "getSpeedEffectMultiplier", "(Lnet/minecraft/entity/EntityLivingBase;)D", "getRoundedMovementInput", "input", "applyJumpBoostPotionEffects", "motion", "applySpeedPotionEffects", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "calcMoveYaw", "yawIn", "moveForward", "moveString", "centerPlayer", "Lnet/minecraft/client/entity/EntityPlayerSP;", "isCentered", "x", "z", "center", "Lnet/minecraft/util/math/BlockPos;", "Lnet/minecraft/util/math/Vec3d;", "pos", "resetJumpSneak", "", "Lnet/minecraft/util/MovementInput;", "resetMove", "setSpeed", "Stay" })
public final class MovementUtils
{
    @NotNull
    public static final MovementUtils INSTANCE;
    private static final Minecraft mc;
    
    private MovementUtils() {
    }
    
    public final boolean isInputting() {
        final EntityPlayerSP player = MovementUtils.mc.player;
        boolean b;
        if (player == null) {
            b = false;
        }
        else {
            final MovementInput movementInput = player.movementInput;
            if (movementInput == null) {
                b = false;
            }
            else {
                final MovementInput it = movementInput;
                final int n = 0;
                b = (it.moveForward != 0.0f || it.moveStrafe != 0.0f);
            }
        }
        return b;
    }
    
    public final boolean isMoving(@NotNull final Entity $this$isMoving) {
        Intrinsics.checkNotNullParameter((Object)$this$isMoving, "<this>");
        return this.getSpeed($this$isMoving) > 1.0E-4;
    }
    
    public final double getSpeed(@NotNull final Entity $this$speed) {
        Intrinsics.checkNotNullParameter((Object)$this$speed, "<this>");
        return Math.hypot($this$speed.motionX, $this$speed.motionZ);
    }
    
    public final double getRealSpeed(@NotNull final Entity $this$realSpeed) {
        Intrinsics.checkNotNullParameter((Object)$this$realSpeed, "<this>");
        return Math.hypot($this$realSpeed.posX - $this$realSpeed.prevPosX, $this$realSpeed.posZ - $this$realSpeed.prevPosZ);
    }
    
    public final double calcMoveYaw(@NotNull final SafeClientEvent $this$calcMoveYaw, final float yawIn, final float moveForward, final float moveString) {
        Intrinsics.checkNotNullParameter((Object)$this$calcMoveYaw, "<this>");
        float strafe = 90 * moveString;
        strafe *= ((moveForward == 0.0f) ? 1.0f : (moveForward * 0.5f));
        float yaw = yawIn - strafe;
        yaw -= ((moveForward < 0.0f) ? 180 : 0);
        return Math.toRadians(yaw);
    }
    
    public static /* synthetic */ double calcMoveYaw$default(final MovementUtils movementUtils, final SafeClientEvent $this$calcMoveYaw, float rotationYaw, float roundedForward, float roundedStrafing, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            rotationYaw = $this$calcMoveYaw.getMc().player.rotationYaw;
        }
        if ((n & 0x2) != 0x0) {
            roundedForward = movementUtils.getRoundedForward();
        }
        if ((n & 0x4) != 0x0) {
            roundedStrafing = movementUtils.getRoundedStrafing();
        }
        return movementUtils.calcMoveYaw($this$calcMoveYaw, rotationYaw, roundedForward, roundedStrafing);
    }
    
    private final float getRoundedForward() {
        return this.getRoundedMovementInput(MovementUtils.mc.player.movementInput.moveForward);
    }
    
    private final float getRoundedStrafing() {
        return this.getRoundedMovementInput(MovementUtils.mc.player.movementInput.moveStrafe);
    }
    
    private final float getRoundedMovementInput(final float input) {
        return (input > 0.0f) ? 1.0f : ((input < 0.0f) ? -1.0f : 0.0f);
    }
    
    public final void setSpeed(@NotNull final SafeClientEvent $this$setSpeed, final double speed) {
        Intrinsics.checkNotNullParameter((Object)$this$setSpeed, "<this>");
        final double yaw = calcMoveYaw$default(this, $this$setSpeed, 0.0f, 0.0f, 0.0f, 7, null);
        $this$setSpeed.getPlayer().motionX = -Math.sin(yaw) * speed;
        $this$setSpeed.getPlayer().motionZ = Math.cos(yaw) * speed;
    }
    
    public final double applySpeedPotionEffects(@NotNull final SafeClientEvent $this$applySpeedPotionEffects, final double speed) {
        Intrinsics.checkNotNullParameter((Object)$this$applySpeedPotionEffects, "<this>");
        final PotionEffect getActivePotionEffect = $this$applySpeedPotionEffects.getPlayer().getActivePotionEffect(MobEffects.SPEED);
        double n;
        if (getActivePotionEffect == null) {
            n = speed;
        }
        else {
            final PotionEffect it = getActivePotionEffect;
            final int n2 = 0;
            n = speed * (1.0 + (it.getAmplifier() + 1) * 0.2);
        }
        return n;
    }
    
    public final boolean centerPlayer(@NotNull final EntityPlayerSP $this$centerPlayer) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       me/alpha432/stay/util/player/SurroundUtils.INSTANCE:Lme/alpha432/stay/util/player/SurroundUtils;
        //     9: aload_1         /* $this$centerPlayer */
        //    10: checkcast       Lnet/minecraft/entity/Entity;
        //    13: invokevirtual   me/alpha432/stay/util/player/SurroundUtils.getFlooredPosition:(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/BlockPos;
        //    16: checkcast       Lnet/minecraft/util/math/Vec3i;
        //    19: astore_3       
        //    20: ldc2_w          0.5
        //    23: dstore          4
        //    25: dconst_0       
        //    26: dstore          6
        //    28: ldc2_w          0.5
        //    31: dstore          zOffset$iv
        //    33: iconst_0       
        //    34: istore          $i$f$toVec3d
        //    36: new             Lnet/minecraft/util/math/Vec3d;
        //    39: dup            
        //    40: aload_3         /* $this$toVec3d$iv */
        //    41: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    44: i2d            
        //    45: dload           xOffset$iv
        //    47: dadd           
        //    48: aload_3         /* $this$toVec3d$iv */
        //    49: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    52: i2d            
        //    53: dload           yOffset$iv
        //    55: dadd           
        //    56: aload_3         /* $this$toVec3d$iv */
        //    57: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    60: i2d            
        //    61: dload           zOffset$iv
        //    63: dadd           
        //    64: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //    67: astore_2        /* center */
        //    68: aload_0         /* this */
        //    69: aload_1         /* $this$centerPlayer */
        //    70: getstatic       me/alpha432/stay/util/player/SurroundUtils.INSTANCE:Lme/alpha432/stay/util/player/SurroundUtils;
        //    73: aload_1         /* $this$centerPlayer */
        //    74: checkcast       Lnet/minecraft/entity/Entity;
        //    77: invokevirtual   me/alpha432/stay/util/player/SurroundUtils.getFlooredPosition:(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/BlockPos;
        //    80: invokevirtual   me/alpha432/stay/util/player/MovementUtils.isCentered:(Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/util/math/BlockPos;)Z
        //    83: istore_3        /* centered */
        //    84: iload_3         /* centered */
        //    85: ifne            171
        //    88: aload_1         /* $this$centerPlayer */
        //    89: aload_2         /* center */
        //    90: getfield        net/minecraft/util/math/Vec3d.x:D
        //    93: aload_1         /* $this$centerPlayer */
        //    94: getfield        net/minecraft/client/entity/EntityPlayerSP.posX:D
        //    97: dsub           
        //    98: ldc2_w          2.0
        //   101: ddiv           
        //   102: putfield        net/minecraft/client/entity/EntityPlayerSP.motionX:D
        //   105: aload_1         /* $this$centerPlayer */
        //   106: aload_2         /* center */
        //   107: getfield        net/minecraft/util/math/Vec3d.z:D
        //   110: aload_1         /* $this$centerPlayer */
        //   111: getfield        net/minecraft/client/entity/EntityPlayerSP.posZ:D
        //   114: dsub           
        //   115: ldc2_w          2.0
        //   118: ddiv           
        //   119: putfield        net/minecraft/client/entity/EntityPlayerSP.motionZ:D
        //   122: aload_0         /* this */
        //   123: aload_1         /* $this$centerPlayer */
        //   124: checkcast       Lnet/minecraft/entity/Entity;
        //   127: invokevirtual   me/alpha432/stay/util/player/MovementUtils.getSpeed:(Lnet/minecraft/entity/Entity;)D
        //   130: dstore          speed
        //   132: dload           speed
        //   134: ldc2_w          0.2805
        //   137: dcmpl          
        //   138: ifle            171
        //   141: ldc2_w          0.2805
        //   144: dload           speed
        //   146: ddiv           
        //   147: dstore          multiplier
        //   149: aload_1         /* $this$centerPlayer */
        //   150: aload_1         /* $this$centerPlayer */
        //   151: getfield        net/minecraft/client/entity/EntityPlayerSP.motionX:D
        //   154: dload           multiplier
        //   156: dmul           
        //   157: putfield        net/minecraft/client/entity/EntityPlayerSP.motionX:D
        //   160: aload_1         /* $this$centerPlayer */
        //   161: aload_1         /* $this$centerPlayer */
        //   162: getfield        net/minecraft/client/entity/EntityPlayerSP.motionZ:D
        //   165: dload           multiplier
        //   167: dmul           
        //   168: putfield        net/minecraft/client/entity/EntityPlayerSP.motionZ:D
        //   171: iload_3         /* centered */
        //   172: ireturn        
        //    StackMapTable: 00 01 FF 00 AB 00 08 07 00 02 07 00 51 07 00 DE 01 03 03 03 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean isCentered(@NotNull final Entity $this$isCentered, @NotNull final BlockPos pos) {
        Intrinsics.checkNotNullParameter((Object)$this$isCentered, "<this>");
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        final double n = pos.getX() + 0.31;
        final double n2 = pos.getX() + 0.69;
        final double posX = $this$isCentered.posX;
        if (n <= posX && posX <= n2) {
            final double n3 = pos.getZ() + 0.31;
            final double n4 = pos.getZ() + 0.69;
            final double posZ = $this$isCentered.posZ;
            if (n3 <= posZ && posZ <= n4) {
                return true;
            }
        }
        return false;
    }
    
    public final void resetMove(@NotNull final MovementInput $this$resetMove) {
        Intrinsics.checkNotNullParameter((Object)$this$resetMove, "<this>");
        $this$resetMove.moveForward = 0.0f;
        $this$resetMove.moveStrafe = 0.0f;
        $this$resetMove.forwardKeyDown = false;
        $this$resetMove.backKeyDown = false;
        $this$resetMove.leftKeyDown = false;
        $this$resetMove.rightKeyDown = false;
    }
    
    public final void resetJumpSneak(@NotNull final MovementInput $this$resetJumpSneak) {
        Intrinsics.checkNotNullParameter((Object)$this$resetJumpSneak, "<this>");
        $this$resetJumpSneak.jump = false;
        $this$resetJumpSneak.sneak = false;
    }
    
    public final boolean isInputtingAny() {
        final int $i$f$isInputtingAny = 0;
        if (!this.isInputting()) {
            final EntityPlayerSP player = MinecraftWrapper.getPlayer();
            boolean b;
            if (player == null) {
                b = false;
            }
            else {
                final MovementInput movementInput = player.movementInput;
                if (movementInput == null) {
                    b = false;
                }
                else {
                    final MovementInput it = movementInput;
                    final int n = 0;
                    b = (it.jump || it.sneak);
                }
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    public final double applySpeedPotionEffects(@NotNull final EntityLivingBase $this$applySpeedPotionEffects, final double speed) {
        Intrinsics.checkNotNullParameter((Object)$this$applySpeedPotionEffects, "<this>");
        final int $i$f$applySpeedPotionEffects = 0;
        final PotionEffect getActivePotionEffect = $this$applySpeedPotionEffects.getActivePotionEffect(MobEffects.SPEED);
        double n;
        if (getActivePotionEffect == null) {
            n = speed;
        }
        else {
            final PotionEffect it = getActivePotionEffect;
            final int n2 = 0;
            final MovementUtils instance = MovementUtils.INSTANCE;
            final EntityLivingBase $this$speedEffectMultiplier$iv = $this$applySpeedPotionEffects;
            final int $i$f$getSpeedEffectMultiplier = 0;
            final PotionEffect getActivePotionEffect2 = $this$speedEffectMultiplier$iv.getActivePotionEffect(MobEffects.SPEED);
            double n3;
            if (getActivePotionEffect2 == null) {
                n3 = 1.0;
            }
            else {
                final PotionEffect it$iv = getActivePotionEffect2;
                final int n4 = 0;
                n3 = 1.0 + (it$iv.getAmplifier() + 1.0) * 0.2;
            }
            n = speed * n3;
        }
        return n;
    }
    
    public final double getSpeedEffectMultiplier(@NotNull final EntityLivingBase $this$speedEffectMultiplier) {
        Intrinsics.checkNotNullParameter((Object)$this$speedEffectMultiplier, "<this>");
        final int $i$f$getSpeedEffectMultiplier = 0;
        final PotionEffect getActivePotionEffect = $this$speedEffectMultiplier.getActivePotionEffect(MobEffects.SPEED);
        double n;
        if (getActivePotionEffect == null) {
            n = 1.0;
        }
        else {
            final PotionEffect it = getActivePotionEffect;
            final int n2 = 0;
            n = 1.0 + (it.getAmplifier() + 1.0) * 0.2;
        }
        return n;
    }
    
    public final double applyJumpBoostPotionEffects(@NotNull final EntityLivingBase $this$applyJumpBoostPotionEffects, final double motion) {
        Intrinsics.checkNotNullParameter((Object)$this$applyJumpBoostPotionEffects, "<this>");
        final PotionEffect getActivePotionEffect = $this$applyJumpBoostPotionEffects.getActivePotionEffect(MobEffects.JUMP_BOOST);
        double n;
        if (getActivePotionEffect == null) {
            n = motion;
        }
        else {
            final PotionEffect it = getActivePotionEffect;
            final int n2 = 0;
            n = motion + (it.getAmplifier() + 1.0) * 0.2;
        }
        return n;
    }
    
    public final boolean isCentered(@NotNull final EntityPlayerSP $this$isCentered, @NotNull final BlockPos center) {
        Intrinsics.checkNotNullParameter((Object)$this$isCentered, "<this>");
        Intrinsics.checkNotNullParameter((Object)center, "center");
        return this.isCentered($this$isCentered, center.getX() + 0.5, center.getZ() + 0.5);
    }
    
    public final boolean isCentered(@NotNull final EntityPlayerSP $this$isCentered, @NotNull final Vec3d center) {
        Intrinsics.checkNotNullParameter((Object)$this$isCentered, "<this>");
        Intrinsics.checkNotNullParameter((Object)center, "center");
        return this.isCentered($this$isCentered, center.x, center.z);
    }
    
    public final boolean isCentered(@NotNull final EntityPlayerSP $this$isCentered, final double x, final double z) {
        Intrinsics.checkNotNullParameter((Object)$this$isCentered, "<this>");
        return Math.abs($this$isCentered.posX - x) < 0.2 && Math.abs($this$isCentered.posZ - z) < 0.2;
    }
    
    static {
        INSTANCE = new MovementUtils();
        mc = Minecraft.getMinecraft();
    }
}
