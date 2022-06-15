//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.player;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;
import me.alpha432.stay.util.math.vector.*;
import kotlin.ranges.*;
import net.minecraft.util.math.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tJ#\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u000e\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tJ\u0012\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0005J\u0012\u0010'\u001a\u00020\t*\u00020%2\u0006\u0010&\u001a\u00020\u0005J\u0012\u0010'\u001a\u00020\t*\u00020%2\u0006\u0010\u001d\u001a\u00020\u0004J\"\u0010\u001b\u001a\u00020\u0013*\u00020%2\u0006\u0010\u001d\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001¢\u0006\u0004\b\u001e\u0010(J\"\u0010)\u001a\u00020\u0013*\u00020%2\u0006\u0010&\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001¢\u0006\u0004\b*\u0010+J\"\u0010,\u001a\u00020\u0013*\u00020%2\u0006\u0010&\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0002\u00f8\u0001\u0001¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u00020\t*\u00020%2\u0006\u0010\u001d\u001a\u00020\u0004J\u0012\u0010/\u001a\u00020\t*\u0002002\u0006\u00101\u001a\u00020\tJ\u001f\u00102\u001a\u00020\u0013*\u0002002\u0006\u00103\u001a\u00020\u0013\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u00020\t*\u0002002\u0006\u0010\b\u001a\u00020\tJ\u0012\u00107\u001a\u00020$*\u0002002\u0006\u00101\u001a\u00020\tJ\u001f\u00108\u001a\u00020$*\u0002002\u0006\u00103\u001a\u00020\u0013\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u00020$*\u0002002\u0006\u0010\b\u001a\u00020\tR\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u00020\t*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<" }, d2 = { "Lme/alpha432/stay/util/player/RotationUtils;", "", "()V", "eyePosition", "Lnet/minecraft/util/math/Vec3d;", "Lnet/minecraft/entity/Entity;", "getEyePosition", "(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/Vec3d;", "yaw", "", "Lnet/minecraft/util/EnumFacing;", "getYaw", "(Lnet/minecraft/util/EnumFacing;)F", "calcAbsAngleDiff", "a", "b", "calcAngleDiff", "getRotationDiff", "r1", "Lme/alpha432/stay/util/math/vector/Vec2f;", "r2", "getRotationDiff-NN95ukk", "(JJ)F", "getRotationFromVec", "vec", "getRotationFromVec-b_4jExY", "(Lnet/minecraft/util/math/Vec3d;)J", "getRotationTo", "posFrom", "posTo", "getRotationTo-qpTSrKg", "(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)J", "normalizeAngle", "", "angleIn", "faceEntityClosest", "", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "entity", "getRelativeRotation", "(Lcakeslayers/team/eventsystem/SafeClientEvent;Lnet/minecraft/util/math/Vec3d;)J", "getRotationToEntity", "getRotationToEntity-qpTSrKg", "(Lcakeslayers/team/eventsystem/SafeClientEvent;Lnet/minecraft/entity/Entity;)J", "getRotationToEntityClosest", "getRotationToEntityClosest-qpTSrKg", "getYawTo", "legitPitch", "Lnet/minecraft/client/entity/EntityPlayerSP;", "pitch", "legitRotation", "rotation", "legitRotation-z70pgz4", "(Lnet/minecraft/client/entity/EntityPlayerSP;J)J", "legitYaw", "setPitch", "setRotation", "setRotation-fGqq9QQ", "(Lnet/minecraft/client/entity/EntityPlayerSP;J)V", "setYaw", "Stay" })
public final class RotationUtils
{
    @NotNull
    public static final RotationUtils INSTANCE;
    
    private RotationUtils() {
    }
    
    @NotNull
    public final Vec3d getEyePosition(@NotNull final Entity $this$eyePosition) {
        Intrinsics.checkNotNullParameter((Object)$this$eyePosition, "<this>");
        return new Vec3d($this$eyePosition.posX, $this$eyePosition.posY + $this$eyePosition.getEyeHeight(), $this$eyePosition.posZ);
    }
    
    public final float calcAbsAngleDiff(final float a, final float b) {
        return Math.abs(a - b) % 180.0f;
    }
    
    public final float calcAngleDiff(final float a, final float b) {
        final float diff = a - b;
        return this.normalizeAngle(diff);
    }
    
    public final void faceEntityClosest(@NotNull final SafeClientEvent $this$faceEntityClosest, @NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)$this$faceEntityClosest, "<this>");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final long rotation = this.getRotationToEntityClosest-qpTSrKg($this$faceEntityClosest, entity);
        this.setRotation-fGqq9QQ($this$faceEntityClosest.getPlayer(), rotation);
    }
    
    public final float getRelativeRotation(@NotNull final SafeClientEvent $this$getRelativeRotation, @NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)$this$getRelativeRotation, "<this>");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return this.getRelativeRotation($this$getRelativeRotation, this.getEyePosition(entity));
    }
    
    public final float getRelativeRotation(@NotNull final SafeClientEvent $this$getRelativeRotation, @NotNull final Vec3d posTo) {
        Intrinsics.checkNotNullParameter((Object)$this$getRelativeRotation, "<this>");
        Intrinsics.checkNotNullParameter((Object)posTo, "posTo");
        return this.getRotationDiff-NN95ukk(this.getRotationTo-qpTSrKg($this$getRelativeRotation, posTo), Vec2f.constructor-impl((Entity)$this$getRelativeRotation.getPlayer()));
    }
    
    public final float getRotationDiff-NN95ukk(final long r1, final long r2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.toRadians-meiVFKc:(J)J
        //     4: lstore          r1Radians
        //     6: lload_3         /* r2 */
        //     7: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.toRadians-meiVFKc:(J)J
        //    10: lstore          r2Radians
        //    12: nop            
        //    13: lload           r1Radians
        //    15: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.getY-impl:(J)F
        //    18: f2d            
        //    19: invokestatic    java/lang/Math.cos:(D)D
        //    22: d2f            
        //    23: lload           r2Radians
        //    25: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.getY-impl:(J)F
        //    28: f2d            
        //    29: invokestatic    java/lang/Math.cos:(D)D
        //    32: d2f            
        //    33: fmul           
        //    34: lload           r1Radians
        //    36: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.getX-impl:(J)F
        //    39: lload           r2Radians
        //    41: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.getX-impl:(J)F
        //    44: fsub           
        //    45: f2d            
        //    46: invokestatic    java/lang/Math.cos:(D)D
        //    49: d2f            
        //    50: fmul           
        //    51: lload           r1Radians
        //    53: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.getY-impl:(J)F
        //    56: f2d            
        //    57: invokestatic    java/lang/Math.sin:(D)D
        //    60: d2f            
        //    61: nop            
        //    62: lload           r2Radians
        //    64: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.getY-impl:(J)F
        //    67: f2d            
        //    68: invokestatic    java/lang/Math.sin:(D)D
        //    71: d2f            
        //    72: fmul           
        //    73: fadd           
        //    74: f2d            
        //    75: invokestatic    java/lang/Math.acos:(D)D
        //    78: d2f            
        //    79: fstore          9
        //    81: nop            
        //    82: iconst_0       
        //    83: istore          $i$f$toDegree
        //    85: fload           $this$toDegree$iv
        //    87: ldc             180.0
        //    89: fmul           
        //    90: ldc             3.1415927
        //    92: fdiv           
        //    93: freturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final long getRotationToEntityClosest-qpTSrKg(@NotNull final SafeClientEvent $this$getRotationToEntityClosest_u2dqpTSrKg, @NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)$this$getRotationToEntityClosest_u2dqpTSrKg, "$receiver");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final AxisAlignedBB box = entity.getEntityBoundingBox();
        final Vec3d eyePos = this.getEyePosition((Entity)$this$getRotationToEntityClosest_u2dqpTSrKg.getPlayer());
        if ($this$getRotationToEntityClosest_u2dqpTSrKg.getPlayer().getEntityBoundingBox().intersects(box)) {
            final Vec3d posFrom = eyePos;
            final Vec3d getCenter = box.getCenter();
            Intrinsics.checkNotNullExpressionValue((Object)getCenter, "box.center");
            return this.getRotationTo-qpTSrKg(posFrom, getCenter);
        }
        final double x = RangesKt.coerceIn(eyePos.x, box.minX, box.maxX);
        final double y = RangesKt.coerceIn(eyePos.y, box.minY, box.maxY);
        final double z = RangesKt.coerceIn(eyePos.z, box.minZ, box.maxZ);
        final Vec3d hitVec = new Vec3d(x, y, z);
        return this.getRotationTo-qpTSrKg(eyePos, hitVec);
    }
    
    public final long getRotationToEntity-qpTSrKg(@NotNull final SafeClientEvent $this$getRotationToEntity_u2dqpTSrKg, @NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)$this$getRotationToEntity_u2dqpTSrKg, "$receiver");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final Vec3d getPositionVector = entity.getPositionVector();
        Intrinsics.checkNotNullExpressionValue((Object)getPositionVector, "entity.positionVector");
        return this.getRotationTo-qpTSrKg($this$getRotationToEntity_u2dqpTSrKg, getPositionVector);
    }
    
    public final long getRotationTo-qpTSrKg(@NotNull final SafeClientEvent $this$getRotationTo_u2dqpTSrKg, @NotNull final Vec3d posTo) {
        Intrinsics.checkNotNullParameter((Object)$this$getRotationTo_u2dqpTSrKg, "$receiver");
        Intrinsics.checkNotNullParameter((Object)posTo, "posTo");
        final Vec3d getPositionEyes = $this$getRotationTo_u2dqpTSrKg.getPlayer().getPositionEyes(1.0f);
        Intrinsics.checkNotNullExpressionValue((Object)getPositionEyes, "player.getPositionEyes(1f)");
        return this.getRotationTo-qpTSrKg(getPositionEyes, posTo);
    }
    
    public final float getYawTo(@NotNull final SafeClientEvent $this$getYawTo, @NotNull final Vec3d posTo) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* posTo */
        //     7: ldc             "posTo"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_2         /* posTo */
        //    13: aload_0         /* this */
        //    14: aload_1         /* $this$getYawTo */
        //    15: invokevirtual   cakeslayers/team/eventsystem/SafeClientEvent.getPlayer:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //    18: checkcast       Lnet/minecraft/entity/Entity;
        //    21: invokevirtual   me/alpha432/stay/util/player/RotationUtils.getEyePosition:(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/Vec3d;
        //    24: invokevirtual   net/minecraft/util/math/Vec3d.subtract:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //    27: astore_3        /* vec */
        //    28: aload_0         /* this */
        //    29: aload_3         /* vec */
        //    30: getfield        net/minecraft/util/math/Vec3d.z:D
        //    33: aload_3         /* vec */
        //    34: getfield        net/minecraft/util/math/Vec3d.x:D
        //    37: invokestatic    java/lang/Math.atan2:(DD)D
        //    40: dstore          4
        //    42: nop            
        //    43: iconst_0       
        //    44: istore          $i$f$toDegree
        //    46: dload           $this$toDegree$iv
        //    48: ldc2_w          180.0
        //    51: dmul           
        //    52: ldc2_w          3.141592653589793
        //    55: ddiv           
        //    56: ldc2_w          90.0
        //    59: dsub           
        //    60: d2f            
        //    61: invokevirtual   me/alpha432/stay/util/player/RotationUtils.normalizeAngle:(F)F
        //    64: freturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final long getRotationTo-qpTSrKg(@NotNull final Vec3d posFrom, @NotNull final Vec3d posTo) {
        Intrinsics.checkNotNullParameter((Object)posFrom, "posFrom");
        Intrinsics.checkNotNullParameter((Object)posTo, "posTo");
        final Vec3d subtract = posTo.subtract(posFrom);
        Intrinsics.checkNotNullExpressionValue((Object)subtract, "posTo.subtract(posFrom)");
        return this.getRotationFromVec-b_4jExY(subtract);
    }
    
    public final long getRotationFromVec-b_4jExY(@NotNull final Vec3d vec) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "vec"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* vec */
        //     8: getfield        net/minecraft/util/math/Vec3d.x:D
        //    11: dstore          4
        //    13: aload_1         /* vec */
        //    14: getfield        net/minecraft/util/math/Vec3d.z:D
        //    17: dstore          6
        //    19: dload           4
        //    21: dload           6
        //    23: invokestatic    java/lang/Math.hypot:(DD)D
        //    26: dstore_2        /* xz */
        //    27: aload_0         /* this */
        //    28: aload_1         /* vec */
        //    29: getfield        net/minecraft/util/math/Vec3d.z:D
        //    32: dstore          6
        //    34: aload_1         /* vec */
        //    35: getfield        net/minecraft/util/math/Vec3d.x:D
        //    38: dstore          8
        //    40: dload           6
        //    42: dload           8
        //    44: invokestatic    java/lang/Math.atan2:(DD)D
        //    47: dstore          6
        //    49: nop            
        //    50: iconst_0       
        //    51: istore          $i$f$toDegree
        //    53: dload           $this$toDegree$iv
        //    55: ldc2_w          180.0
        //    58: dmul           
        //    59: ldc2_w          3.141592653589793
        //    62: ddiv           
        //    63: ldc2_w          90.0
        //    66: dsub           
        //    67: invokevirtual   me/alpha432/stay/util/player/RotationUtils.normalizeAngle:(D)D
        //    70: dstore          yaw
        //    72: aload_0         /* this */
        //    73: aload_1         /* vec */
        //    74: getfield        net/minecraft/util/math/Vec3d.y:D
        //    77: dload_2         /* xz */
        //    78: invokestatic    java/lang/Math.atan2:(DD)D
        //    81: dstore          8
        //    83: nop            
        //    84: iconst_0       
        //    85: istore          $i$f$toDegree
        //    87: dload           $this$toDegree$iv
        //    89: ldc2_w          180.0
        //    92: dmul           
        //    93: ldc2_w          3.141592653589793
        //    96: ddiv           
        //    97: dneg           
        //    98: invokevirtual   me/alpha432/stay/util/player/RotationUtils.normalizeAngle:(D)D
        //   101: dstore          pitch
        //   103: dload           yaw
        //   105: dload           pitch
        //   107: invokestatic    me/alpha432/stay/util/math/vector/Vec2f.constructor-impl:(DD)J
        //   110: lreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final double normalizeAngle(final double angleIn) {
        double angle = angleIn;
        angle %= 360.0;
        if (angle >= 180.0) {
            angle -= 360.0;
        }
        if (angle < -180.0) {
            angle += 360.0;
        }
        return angle;
    }
    
    public final float normalizeAngle(final float angleIn) {
        float angle = angleIn;
        angle %= 360.0f;
        if (angle >= 180.0f) {
            angle -= 360.0f;
        }
        else if (angle < -180.0f) {
            angle += 360.0f;
        }
        return angle;
    }
    
    public final void setRotation-fGqq9QQ(@NotNull final EntityPlayerSP $this$setRotation_u2dfGqq9QQ, final long rotation) {
        Intrinsics.checkNotNullParameter((Object)$this$setRotation_u2dfGqq9QQ, "$receiver");
        this.setYaw($this$setRotation_u2dfGqq9QQ, Vec2f.getX-impl(rotation));
        this.setPitch($this$setRotation_u2dfGqq9QQ, Vec2f.getY-impl(rotation));
    }
    
    public final void setYaw(@NotNull final EntityPlayerSP $this$setYaw, final float yaw) {
        Intrinsics.checkNotNullParameter((Object)$this$setYaw, "<this>");
        $this$setYaw.rotationYaw += this.normalizeAngle(yaw - $this$setYaw.rotationYaw);
    }
    
    public final void setPitch(@NotNull final EntityPlayerSP $this$setPitch, final float pitch) {
        Intrinsics.checkNotNullParameter((Object)$this$setPitch, "<this>");
        $this$setPitch.rotationPitch = RangesKt.coerceIn($this$setPitch.rotationPitch + this.normalizeAngle(pitch - $this$setPitch.rotationPitch), -90.0f, 90.0f);
    }
    
    public final long legitRotation-z70pgz4(@NotNull final EntityPlayerSP $this$legitRotation_u2dz70pgz4, final long rotation) {
        Intrinsics.checkNotNullParameter((Object)$this$legitRotation_u2dz70pgz4, "$receiver");
        return Vec2f.constructor-impl(this.legitYaw($this$legitRotation_u2dz70pgz4, Vec2f.getX-impl(rotation)), this.legitPitch($this$legitRotation_u2dz70pgz4, Vec2f.getY-impl(rotation)));
    }
    
    public final float legitYaw(@NotNull final EntityPlayerSP $this$legitYaw, final float yaw) {
        Intrinsics.checkNotNullParameter((Object)$this$legitYaw, "<this>");
        return $this$legitYaw.rotationYaw + this.normalizeAngle(yaw - $this$legitYaw.rotationYaw);
    }
    
    public final float legitPitch(@NotNull final EntityPlayerSP $this$legitPitch, final float pitch) {
        Intrinsics.checkNotNullParameter((Object)$this$legitPitch, "<this>");
        return RangesKt.coerceIn($this$legitPitch.rotationPitch + this.normalizeAngle(pitch - $this$legitPitch.rotationPitch), -90.0f, 90.0f);
    }
    
    public final float getYaw(@NotNull final EnumFacing $this$yaw) {
        Intrinsics.checkNotNullParameter((Object)$this$yaw, "<this>");
        float n = 0.0f;
        switch (WhenMappings.$EnumSwitchMapping$0[$this$yaw.ordinal()]) {
            case 1: {
                n = -180.0f;
                break;
            }
            case 2: {
                n = 0.0f;
                break;
            }
            case 3: {
                n = -90.0f;
                break;
            }
            case 4: {
                n = 90.0f;
                break;
            }
            default: {
                n = 0.0f;
                break;
            }
        }
        return n;
    }
    
    static {
        INSTANCE = new RotationUtils();
    }
}
