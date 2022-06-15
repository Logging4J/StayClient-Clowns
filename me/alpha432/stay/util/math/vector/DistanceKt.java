//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math.vector;

import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u00004\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0086\b\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0086\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0086\b\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\tH\u0086\b\u001a)\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a9\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a)\u0010\n\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0086\b\u001a9\u0010\n\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0086\b\u001a)\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0086\b\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\tH\u0086\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b\u001a%\u0010\u000b\u001a\u00020\t*\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\b\u001a\u0015\u0010\u0014\u001a\u00020\t*\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086\b\u001a%\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b\u001a%\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0086\b\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086\b\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\b\u001a%\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b\u001a%\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0086\b\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\b\u001a%\u0010\u0017\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b\u001a%\u0010\u0017\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0086\b\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\b¨\u0006\u0018" }, d2 = { "distance", "", "x1", "y1", "x2", "y2", "z1", "z2", "", "", "distanceSq", "distanceSqTo", "Lnet/minecraft/entity/Entity;", "x", "y", "z", "vec3d", "Lnet/minecraft/util/math/Vec3d;", "vec3i", "Lnet/minecraft/util/math/Vec3i;", "distanceSqToBlock", "chunkPos", "Lnet/minecraft/util/math/ChunkPos;", "distanceTo", "Stay" })
public final class DistanceKt
{
    public static final double distanceTo(@NotNull final Entity $this$distanceTo, @NotNull final ChunkPos chunkPos) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* chunkPos */
        //     7: ldc             "chunkPos"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceTo */
        //    14: aload_0         /* $this$distanceTo */
        //    15: getfield        net/minecraft/entity/Entity.posX:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceTo */
        //    20: getfield        net/minecraft/entity/Entity.posZ:D
        //    23: dstore          5
        //    25: aload_1         /* chunkPos */
        //    26: getfield        net/minecraft/util/math/ChunkPos.x:I
        //    29: bipush          16
        //    31: imul           
        //    32: bipush          8
        //    34: iadd           
        //    35: i2d            
        //    36: dstore          7
        //    38: aload_1         /* chunkPos */
        //    39: getfield        net/minecraft/util/math/ChunkPos.z:I
        //    42: bipush          16
        //    44: imul           
        //    45: bipush          8
        //    47: iadd           
        //    48: i2d            
        //    49: dstore          y2$iv
        //    51: iconst_0       
        //    52: istore          $i$f$distance
        //    54: dload           x2$iv
        //    56: dload_3         /* x1$iv */
        //    57: dsub           
        //    58: dload           y2$iv
        //    60: dload           y1$iv
        //    62: dsub           
        //    63: invokestatic    java/lang/Math.hypot:(DD)D
        //    66: nop            
        //    67: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final int distanceSqToBlock(@NotNull final Entity $this$distanceSqToBlock, @NotNull final ChunkPos chunkPos) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* chunkPos */
        //     7: ldc             "chunkPos"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceSqToBlock */
        //    14: aload_0         /* $this$distanceSqToBlock */
        //    15: getfield        net/minecraft/entity/Entity.posX:D
        //    18: dstore_3        /* $this$fastFloor$iv */
        //    19: iconst_0       
        //    20: istore          $i$f$fastFloor
        //    22: dload_3         /* $this$fastFloor$iv */
        //    23: ldc2_w          1.073741824E9
        //    26: dadd           
        //    27: d2i            
        //    28: ldc             1073741824
        //    30: isub           
        //    31: istore_3        /* $this$fastFloor$iv */
        //    32: aload_0         /* $this$distanceSqToBlock */
        //    33: getfield        net/minecraft/entity/Entity.posZ:D
        //    36: dstore          $this$fastFloor$iv
        //    38: iconst_0       
        //    39: istore          $i$f$fastFloor
        //    41: dload           $this$fastFloor$iv
        //    43: ldc2_w          1.073741824E9
        //    46: dadd           
        //    47: d2i            
        //    48: ldc             1073741824
        //    50: isub           
        //    51: istore          null
        //    53: aload_1         /* chunkPos */
        //    54: getfield        net/minecraft/util/math/ChunkPos.x:I
        //    57: bipush          16
        //    59: imul           
        //    60: bipush          8
        //    62: iadd           
        //    63: istore          5
        //    65: aload_1         /* chunkPos */
        //    66: getfield        net/minecraft/util/math/ChunkPos.z:I
        //    69: bipush          16
        //    71: imul           
        //    72: bipush          8
        //    74: iadd           
        //    75: istore          y2$iv
        //    77: iconst_0       
        //    78: istore          $i$f$distanceSq
        //    80: iload           x2$iv
        //    82: iload_3         /* x1$iv */
        //    83: isub           
        //    84: istore          $this$sq$iv$iv
        //    86: iconst_0       
        //    87: istore          $i$f$getSq
        //    89: iload           $this$sq$iv$iv
        //    91: iload           $this$sq$iv$iv
        //    93: imul           
        //    94: iload           y2$iv
        //    96: iload           y1$iv
        //    98: isub           
        //    99: istore          $this$sq$iv$iv
        //   101: iconst_0       
        //   102: istore          $i$f$getSq
        //   104: iload           $this$sq$iv$iv
        //   106: iload           $this$sq$iv$iv
        //   108: imul           
        //   109: iadd           
        //   110: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distance(final double x1, final double y1, final double x2, final double y2) {
        final int $i$f$distance = 0;
        return Math.hypot(x2 - x1, y2 - y1);
    }
    
    public static final double distance(final float x1, final float y1, final float x2, final float y2) {
        final int $i$f$distance = 0;
        return Math.hypot(x2 - x1, y2 - y1);
    }
    
    public static final double distance(final int x1, final int y1, final int x2, final int y2) {
        final int $i$f$distance = 0;
        return Math.hypot(x2 - x1, y2 - y1);
    }
    
    public static final double distanceSq(final double x1, final double y1, final double x2, final double y2) {
        final int $i$f$distanceSq = 0;
        double $this$sq$iv = x2 - x1;
        int $i$f$getSq = 0;
        final double n = $this$sq$iv * $this$sq$iv;
        $this$sq$iv = y2 - y1;
        $i$f$getSq = 0;
        return n + $this$sq$iv * $this$sq$iv;
    }
    
    public static final float distanceSq(final float x1, final float y1, final float x2, final float y2) {
        final int $i$f$distanceSq = 0;
        float $this$sq$iv = x2 - x1;
        int $i$f$getSq = 0;
        final float n = $this$sq$iv * $this$sq$iv;
        $this$sq$iv = y2 - y1;
        $i$f$getSq = 0;
        return n + $this$sq$iv * $this$sq$iv;
    }
    
    public static final int distanceSq(final int x1, final int y1, final int x2, final int y2) {
        final int $i$f$distanceSq = 0;
        int $this$sq$iv = x2 - x1;
        int $i$f$getSq = 0;
        final int n = $this$sq$iv * $this$sq$iv;
        $this$sq$iv = y2 - y1;
        $i$f$getSq = 0;
        return n + $this$sq$iv * $this$sq$iv;
    }
    
    public static final double distanceTo(@NotNull final Vec3i $this$distanceTo, @NotNull final Vec3d vec3d) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3d */
        //     7: ldc             "vec3d"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceTo */
        //    14: aload_0         /* $this$distanceTo */
        //    15: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    18: i2d            
        //    19: ldc2_w          0.5
        //    22: dadd           
        //    23: dstore_3       
        //    24: aload_0         /* $this$distanceTo */
        //    25: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    28: i2d            
        //    29: ldc2_w          0.5
        //    32: dadd           
        //    33: dstore          5
        //    35: aload_0         /* $this$distanceTo */
        //    36: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    39: i2d            
        //    40: ldc2_w          0.5
        //    43: dadd           
        //    44: dstore          7
        //    46: aload_1         /* vec3d */
        //    47: getfield        net/minecraft/util/math/Vec3d.x:D
        //    50: dstore          9
        //    52: aload_1         /* vec3d */
        //    53: getfield        net/minecraft/util/math/Vec3d.y:D
        //    56: dstore          11
        //    58: aload_1         /* vec3d */
        //    59: getfield        net/minecraft/util/math/Vec3d.z:D
        //    62: dstore          z2$iv
        //    64: iconst_0       
        //    65: istore          $i$f$distance
        //    67: nop            
        //    68: iconst_0       
        //    69: istore          $i$f$distanceSq
        //    71: dload           x2$iv
        //    73: dload_3         /* x1$iv */
        //    74: dsub           
        //    75: dstore          $this$sq$iv$iv$iv
        //    77: iconst_0       
        //    78: istore          $i$f$getSq
        //    80: dload           $this$sq$iv$iv$iv
        //    82: dload           $this$sq$iv$iv$iv
        //    84: dmul           
        //    85: dload           y2$iv
        //    87: dload           y1$iv
        //    89: dsub           
        //    90: dstore          $this$sq$iv$iv$iv
        //    92: iconst_0       
        //    93: istore          $i$f$getSq
        //    95: dload           $this$sq$iv$iv$iv
        //    97: dload           $this$sq$iv$iv$iv
        //    99: dmul           
        //   100: dadd           
        //   101: dload           z2$iv
        //   103: dload           z1$iv
        //   105: dsub           
        //   106: dstore          $this$sq$iv$iv$iv
        //   108: iconst_0       
        //   109: istore          $i$f$getSq
        //   111: dload           $this$sq$iv$iv$iv
        //   113: dload           $this$sq$iv$iv$iv
        //   115: dmul           
        //   116: dadd           
        //   117: invokestatic    java/lang/Math.sqrt:(D)D
        //   120: nop            
        //   121: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Vec3i $this$distanceTo, final double x, final double y, final double z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceTo
        //     9: aload_0         /* $this$distanceTo */
        //    10: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    13: i2d            
        //    14: ldc2_w          0.5
        //    17: dadd           
        //    18: dstore          8
        //    20: aload_0         /* $this$distanceTo */
        //    21: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    24: i2d            
        //    25: ldc2_w          0.5
        //    28: dadd           
        //    29: dstore          10
        //    31: aload_0         /* $this$distanceTo */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    35: i2d            
        //    36: ldc2_w          0.5
        //    39: dadd           
        //    40: dstore          z1$iv
        //    42: iconst_0       
        //    43: istore          $i$f$distance
        //    45: nop            
        //    46: iconst_0       
        //    47: istore          $i$f$distanceSq
        //    49: dload_1         /* x */
        //    50: dload           x1$iv
        //    52: dsub           
        //    53: dstore          $this$sq$iv$iv$iv
        //    55: iconst_0       
        //    56: istore          $i$f$getSq
        //    58: dload           $this$sq$iv$iv$iv
        //    60: dload           $this$sq$iv$iv$iv
        //    62: dmul           
        //    63: dload_3         /* y */
        //    64: dload           y1$iv
        //    66: dsub           
        //    67: dstore          $this$sq$iv$iv$iv
        //    69: iconst_0       
        //    70: istore          $i$f$getSq
        //    72: dload           $this$sq$iv$iv$iv
        //    74: dload           $this$sq$iv$iv$iv
        //    76: dmul           
        //    77: dadd           
        //    78: dload           z
        //    80: dload           z1$iv
        //    82: dsub           
        //    83: dstore          $this$sq$iv$iv$iv
        //    85: iconst_0       
        //    86: istore          $i$f$getSq
        //    88: dload           $this$sq$iv$iv$iv
        //    90: dload           $this$sq$iv$iv$iv
        //    92: dmul           
        //    93: dadd           
        //    94: invokestatic    java/lang/Math.sqrt:(D)D
        //    97: nop            
        //    98: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Vec3i $this$distanceTo, @NotNull final Vec3i vec3i) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3i */
        //     7: ldc             "vec3i"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceTo */
        //    14: aload_0         /* $this$distanceTo */
        //    15: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    18: istore_3       
        //    19: aload_0         /* $this$distanceTo */
        //    20: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    23: istore          4
        //    25: aload_0         /* $this$distanceTo */
        //    26: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    29: istore          5
        //    31: aload_1         /* vec3i */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    35: istore          6
        //    37: aload_1         /* vec3i */
        //    38: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    41: istore          7
        //    43: aload_1         /* vec3i */
        //    44: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    47: istore          z2$iv
        //    49: iconst_0       
        //    50: istore          $i$f$distance
        //    52: iconst_0       
        //    53: istore          $i$f$distanceSq
        //    55: iload           x2$iv
        //    57: iload_3         /* x1$iv */
        //    58: isub           
        //    59: istore          $this$sq$iv$iv$iv
        //    61: iconst_0       
        //    62: istore          $i$f$getSq
        //    64: iload           $this$sq$iv$iv$iv
        //    66: iload           $this$sq$iv$iv$iv
        //    68: imul           
        //    69: iload           y2$iv
        //    71: iload           y1$iv
        //    73: isub           
        //    74: istore          $this$sq$iv$iv$iv
        //    76: iconst_0       
        //    77: istore          $i$f$getSq
        //    79: iload           $this$sq$iv$iv$iv
        //    81: iload           $this$sq$iv$iv$iv
        //    83: imul           
        //    84: iadd           
        //    85: iload           z2$iv
        //    87: iload           z1$iv
        //    89: isub           
        //    90: istore          $this$sq$iv$iv$iv
        //    92: iconst_0       
        //    93: istore          $i$f$getSq
        //    95: iload           $this$sq$iv$iv$iv
        //    97: iload           $this$sq$iv$iv$iv
        //    99: imul           
        //   100: iadd           
        //   101: i2d            
        //   102: invokestatic    java/lang/Math.sqrt:(D)D
        //   105: nop            
        //   106: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Vec3i $this$distanceTo, final int x, final int y, final int z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceTo
        //     9: aload_0         /* $this$distanceTo */
        //    10: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    13: istore          5
        //    15: aload_0         /* $this$distanceTo */
        //    16: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    19: istore          6
        //    21: aload_0         /* $this$distanceTo */
        //    22: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    25: istore          z1$iv
        //    27: iconst_0       
        //    28: istore          $i$f$distance
        //    30: iconst_0       
        //    31: istore          $i$f$distanceSq
        //    33: iload_1         /* x */
        //    34: iload           x1$iv
        //    36: isub           
        //    37: istore          $this$sq$iv$iv$iv
        //    39: iconst_0       
        //    40: istore          $i$f$getSq
        //    42: iload           $this$sq$iv$iv$iv
        //    44: iload           $this$sq$iv$iv$iv
        //    46: imul           
        //    47: iload_2         /* y */
        //    48: iload           y1$iv
        //    50: isub           
        //    51: istore          $this$sq$iv$iv$iv
        //    53: iconst_0       
        //    54: istore          $i$f$getSq
        //    56: iload           $this$sq$iv$iv$iv
        //    58: iload           $this$sq$iv$iv$iv
        //    60: imul           
        //    61: iadd           
        //    62: iload_3         /* z */
        //    63: iload           z1$iv
        //    65: isub           
        //    66: istore          $this$sq$iv$iv$iv
        //    68: iconst_0       
        //    69: istore          $i$f$getSq
        //    71: iload           $this$sq$iv$iv$iv
        //    73: iload           $this$sq$iv$iv$iv
        //    75: imul           
        //    76: iadd           
        //    77: i2d            
        //    78: invokestatic    java/lang/Math.sqrt:(D)D
        //    81: nop            
        //    82: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Vec3i $this$distanceSqTo, @NotNull final Vec3d vec3d) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3d */
        //     7: ldc             "vec3d"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceSqTo */
        //    14: aload_0         /* $this$distanceSqTo */
        //    15: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    18: i2d            
        //    19: ldc2_w          0.5
        //    22: dadd           
        //    23: dstore_3       
        //    24: aload_0         /* $this$distanceSqTo */
        //    25: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    28: i2d            
        //    29: ldc2_w          0.5
        //    32: dadd           
        //    33: dstore          5
        //    35: aload_0         /* $this$distanceSqTo */
        //    36: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    39: i2d            
        //    40: ldc2_w          0.5
        //    43: dadd           
        //    44: dstore          7
        //    46: aload_1         /* vec3d */
        //    47: getfield        net/minecraft/util/math/Vec3d.x:D
        //    50: dstore          9
        //    52: aload_1         /* vec3d */
        //    53: getfield        net/minecraft/util/math/Vec3d.y:D
        //    56: dstore          11
        //    58: aload_1         /* vec3d */
        //    59: getfield        net/minecraft/util/math/Vec3d.z:D
        //    62: dstore          z2$iv
        //    64: iconst_0       
        //    65: istore          $i$f$distanceSq
        //    67: dload           x2$iv
        //    69: dload_3         /* x1$iv */
        //    70: dsub           
        //    71: dstore          $this$sq$iv$iv
        //    73: iconst_0       
        //    74: istore          $i$f$getSq
        //    76: dload           $this$sq$iv$iv
        //    78: dload           $this$sq$iv$iv
        //    80: dmul           
        //    81: dload           y2$iv
        //    83: dload           y1$iv
        //    85: dsub           
        //    86: dstore          $this$sq$iv$iv
        //    88: iconst_0       
        //    89: istore          $i$f$getSq
        //    91: dload           $this$sq$iv$iv
        //    93: dload           $this$sq$iv$iv
        //    95: dmul           
        //    96: dadd           
        //    97: dload           z2$iv
        //    99: dload           z1$iv
        //   101: dsub           
        //   102: dstore          $this$sq$iv$iv
        //   104: iconst_0       
        //   105: istore          $i$f$getSq
        //   107: dload           $this$sq$iv$iv
        //   109: dload           $this$sq$iv$iv
        //   111: dmul           
        //   112: dadd           
        //   113: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Vec3i $this$distanceSqTo, final double x, final double y, final double z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceSqTo
        //     9: aload_0         /* $this$distanceSqTo */
        //    10: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    13: i2d            
        //    14: ldc2_w          0.5
        //    17: dadd           
        //    18: dstore          8
        //    20: aload_0         /* $this$distanceSqTo */
        //    21: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    24: i2d            
        //    25: ldc2_w          0.5
        //    28: dadd           
        //    29: dstore          10
        //    31: aload_0         /* $this$distanceSqTo */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    35: i2d            
        //    36: ldc2_w          0.5
        //    39: dadd           
        //    40: dstore          z1$iv
        //    42: iconst_0       
        //    43: istore          $i$f$distanceSq
        //    45: dload_1         /* x */
        //    46: dload           x1$iv
        //    48: dsub           
        //    49: dstore          $this$sq$iv$iv
        //    51: iconst_0       
        //    52: istore          $i$f$getSq
        //    54: dload           $this$sq$iv$iv
        //    56: dload           $this$sq$iv$iv
        //    58: dmul           
        //    59: dload_3         /* y */
        //    60: dload           y1$iv
        //    62: dsub           
        //    63: dstore          $this$sq$iv$iv
        //    65: iconst_0       
        //    66: istore          $i$f$getSq
        //    68: dload           $this$sq$iv$iv
        //    70: dload           $this$sq$iv$iv
        //    72: dmul           
        //    73: dadd           
        //    74: dload           z
        //    76: dload           z1$iv
        //    78: dsub           
        //    79: dstore          $this$sq$iv$iv
        //    81: iconst_0       
        //    82: istore          $i$f$getSq
        //    84: dload           $this$sq$iv$iv
        //    86: dload           $this$sq$iv$iv
        //    88: dmul           
        //    89: dadd           
        //    90: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final int distanceSqTo(@NotNull final Vec3i $this$distanceSqTo, @NotNull final Vec3i vec3i) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3i */
        //     7: ldc             "vec3i"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceSqTo */
        //    14: aload_0         /* $this$distanceSqTo */
        //    15: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    18: istore_3       
        //    19: aload_0         /* $this$distanceSqTo */
        //    20: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    23: istore          4
        //    25: aload_0         /* $this$distanceSqTo */
        //    26: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    29: istore          5
        //    31: aload_1         /* vec3i */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    35: istore          6
        //    37: aload_1         /* vec3i */
        //    38: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    41: istore          7
        //    43: aload_1         /* vec3i */
        //    44: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    47: istore          z2$iv
        //    49: iconst_0       
        //    50: istore          $i$f$distanceSq
        //    52: iload           x2$iv
        //    54: iload_3         /* x1$iv */
        //    55: isub           
        //    56: istore          $this$sq$iv$iv
        //    58: iconst_0       
        //    59: istore          $i$f$getSq
        //    61: iload           $this$sq$iv$iv
        //    63: iload           $this$sq$iv$iv
        //    65: imul           
        //    66: iload           y2$iv
        //    68: iload           y1$iv
        //    70: isub           
        //    71: istore          $this$sq$iv$iv
        //    73: iconst_0       
        //    74: istore          $i$f$getSq
        //    76: iload           $this$sq$iv$iv
        //    78: iload           $this$sq$iv$iv
        //    80: imul           
        //    81: iadd           
        //    82: iload           z2$iv
        //    84: iload           z1$iv
        //    86: isub           
        //    87: istore          $this$sq$iv$iv
        //    89: iconst_0       
        //    90: istore          $i$f$getSq
        //    92: iload           $this$sq$iv$iv
        //    94: iload           $this$sq$iv$iv
        //    96: imul           
        //    97: iadd           
        //    98: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final int distanceSqTo(@NotNull final Vec3i $this$distanceSqTo, final int x, final int y, final int z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceSqTo
        //     9: aload_0         /* $this$distanceSqTo */
        //    10: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    13: istore          5
        //    15: aload_0         /* $this$distanceSqTo */
        //    16: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    19: istore          6
        //    21: aload_0         /* $this$distanceSqTo */
        //    22: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    25: istore          z1$iv
        //    27: iconst_0       
        //    28: istore          $i$f$distanceSq
        //    30: iload_1         /* x */
        //    31: iload           x1$iv
        //    33: isub           
        //    34: istore          $this$sq$iv$iv
        //    36: iconst_0       
        //    37: istore          $i$f$getSq
        //    39: iload           $this$sq$iv$iv
        //    41: iload           $this$sq$iv$iv
        //    43: imul           
        //    44: iload_2         /* y */
        //    45: iload           y1$iv
        //    47: isub           
        //    48: istore          $this$sq$iv$iv
        //    50: iconst_0       
        //    51: istore          $i$f$getSq
        //    53: iload           $this$sq$iv$iv
        //    55: iload           $this$sq$iv$iv
        //    57: imul           
        //    58: iadd           
        //    59: iload_3         /* z */
        //    60: iload           z1$iv
        //    62: isub           
        //    63: istore          $this$sq$iv$iv
        //    65: iconst_0       
        //    66: istore          $i$f$getSq
        //    68: iload           $this$sq$iv$iv
        //    70: iload           $this$sq$iv$iv
        //    72: imul           
        //    73: iadd           
        //    74: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Vec3d $this$distanceTo, @NotNull final Vec3d vec3d) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3d */
        //     7: ldc             "vec3d"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceTo */
        //    14: aload_0         /* $this$distanceTo */
        //    15: getfield        net/minecraft/util/math/Vec3d.x:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceTo */
        //    20: getfield        net/minecraft/util/math/Vec3d.y:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceTo */
        //    26: getfield        net/minecraft/util/math/Vec3d.z:D
        //    29: dstore          7
        //    31: aload_1         /* vec3d */
        //    32: getfield        net/minecraft/util/math/Vec3d.x:D
        //    35: dstore          9
        //    37: aload_1         /* vec3d */
        //    38: getfield        net/minecraft/util/math/Vec3d.y:D
        //    41: dstore          11
        //    43: aload_1         /* vec3d */
        //    44: getfield        net/minecraft/util/math/Vec3d.z:D
        //    47: dstore          z2$iv
        //    49: iconst_0       
        //    50: istore          $i$f$distance
        //    52: nop            
        //    53: iconst_0       
        //    54: istore          $i$f$distanceSq
        //    56: dload           x2$iv
        //    58: dload_3         /* x1$iv */
        //    59: dsub           
        //    60: dstore          $this$sq$iv$iv$iv
        //    62: iconst_0       
        //    63: istore          $i$f$getSq
        //    65: dload           $this$sq$iv$iv$iv
        //    67: dload           $this$sq$iv$iv$iv
        //    69: dmul           
        //    70: dload           y2$iv
        //    72: dload           y1$iv
        //    74: dsub           
        //    75: dstore          $this$sq$iv$iv$iv
        //    77: iconst_0       
        //    78: istore          $i$f$getSq
        //    80: dload           $this$sq$iv$iv$iv
        //    82: dload           $this$sq$iv$iv$iv
        //    84: dmul           
        //    85: dadd           
        //    86: dload           z2$iv
        //    88: dload           z1$iv
        //    90: dsub           
        //    91: dstore          $this$sq$iv$iv$iv
        //    93: iconst_0       
        //    94: istore          $i$f$getSq
        //    96: dload           $this$sq$iv$iv$iv
        //    98: dload           $this$sq$iv$iv$iv
        //   100: dmul           
        //   101: dadd           
        //   102: invokestatic    java/lang/Math.sqrt:(D)D
        //   105: nop            
        //   106: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Vec3d $this$distanceTo, @NotNull final Vec3i vec3i) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3i */
        //     7: ldc             "vec3i"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceTo */
        //    14: aload_0         /* $this$distanceTo */
        //    15: getfield        net/minecraft/util/math/Vec3d.x:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceTo */
        //    20: getfield        net/minecraft/util/math/Vec3d.y:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceTo */
        //    26: getfield        net/minecraft/util/math/Vec3d.z:D
        //    29: dstore          7
        //    31: aload_1         /* vec3i */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    35: i2d            
        //    36: ldc2_w          0.5
        //    39: dadd           
        //    40: dstore          9
        //    42: aload_1         /* vec3i */
        //    43: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    46: i2d            
        //    47: ldc2_w          0.5
        //    50: dadd           
        //    51: dstore          11
        //    53: aload_1         /* vec3i */
        //    54: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    57: i2d            
        //    58: ldc2_w          0.5
        //    61: dadd           
        //    62: dstore          z2$iv
        //    64: iconst_0       
        //    65: istore          $i$f$distance
        //    67: nop            
        //    68: iconst_0       
        //    69: istore          $i$f$distanceSq
        //    71: dload           x2$iv
        //    73: dload_3         /* x1$iv */
        //    74: dsub           
        //    75: dstore          $this$sq$iv$iv$iv
        //    77: iconst_0       
        //    78: istore          $i$f$getSq
        //    80: dload           $this$sq$iv$iv$iv
        //    82: dload           $this$sq$iv$iv$iv
        //    84: dmul           
        //    85: dload           y2$iv
        //    87: dload           y1$iv
        //    89: dsub           
        //    90: dstore          $this$sq$iv$iv$iv
        //    92: iconst_0       
        //    93: istore          $i$f$getSq
        //    95: dload           $this$sq$iv$iv$iv
        //    97: dload           $this$sq$iv$iv$iv
        //    99: dmul           
        //   100: dadd           
        //   101: dload           z2$iv
        //   103: dload           z1$iv
        //   105: dsub           
        //   106: dstore          $this$sq$iv$iv$iv
        //   108: iconst_0       
        //   109: istore          $i$f$getSq
        //   111: dload           $this$sq$iv$iv$iv
        //   113: dload           $this$sq$iv$iv$iv
        //   115: dmul           
        //   116: dadd           
        //   117: invokestatic    java/lang/Math.sqrt:(D)D
        //   120: nop            
        //   121: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Vec3d $this$distanceTo, final double x, final double y, final double z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceTo
        //     9: aload_0         /* $this$distanceTo */
        //    10: getfield        net/minecraft/util/math/Vec3d.x:D
        //    13: dstore          8
        //    15: aload_0         /* $this$distanceTo */
        //    16: getfield        net/minecraft/util/math/Vec3d.y:D
        //    19: dstore          10
        //    21: aload_0         /* $this$distanceTo */
        //    22: getfield        net/minecraft/util/math/Vec3d.z:D
        //    25: dstore          z1$iv
        //    27: iconst_0       
        //    28: istore          $i$f$distance
        //    30: nop            
        //    31: iconst_0       
        //    32: istore          $i$f$distanceSq
        //    34: dload_1         /* x */
        //    35: dload           x1$iv
        //    37: dsub           
        //    38: dstore          $this$sq$iv$iv$iv
        //    40: iconst_0       
        //    41: istore          $i$f$getSq
        //    43: dload           $this$sq$iv$iv$iv
        //    45: dload           $this$sq$iv$iv$iv
        //    47: dmul           
        //    48: dload_3         /* y */
        //    49: dload           y1$iv
        //    51: dsub           
        //    52: dstore          $this$sq$iv$iv$iv
        //    54: iconst_0       
        //    55: istore          $i$f$getSq
        //    57: dload           $this$sq$iv$iv$iv
        //    59: dload           $this$sq$iv$iv$iv
        //    61: dmul           
        //    62: dadd           
        //    63: dload           z
        //    65: dload           z1$iv
        //    67: dsub           
        //    68: dstore          $this$sq$iv$iv$iv
        //    70: iconst_0       
        //    71: istore          $i$f$getSq
        //    73: dload           $this$sq$iv$iv$iv
        //    75: dload           $this$sq$iv$iv$iv
        //    77: dmul           
        //    78: dadd           
        //    79: invokestatic    java/lang/Math.sqrt:(D)D
        //    82: nop            
        //    83: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Vec3d $this$distanceTo, final int x, final int y, final int z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceTo
        //     9: aload_0         /* $this$distanceTo */
        //    10: getfield        net/minecraft/util/math/Vec3d.x:D
        //    13: dstore          5
        //    15: aload_0         /* $this$distanceTo */
        //    16: getfield        net/minecraft/util/math/Vec3d.y:D
        //    19: dstore          7
        //    21: aload_0         /* $this$distanceTo */
        //    22: getfield        net/minecraft/util/math/Vec3d.z:D
        //    25: dstore          9
        //    27: iload_1         /* x */
        //    28: i2d            
        //    29: ldc2_w          0.5
        //    32: dadd           
        //    33: dstore          11
        //    35: iload_2         /* y */
        //    36: i2d            
        //    37: ldc2_w          0.5
        //    40: dadd           
        //    41: dstore          13
        //    43: iload_3         /* z */
        //    44: i2d            
        //    45: ldc2_w          0.5
        //    48: dadd           
        //    49: dstore          z2$iv
        //    51: iconst_0       
        //    52: istore          $i$f$distance
        //    54: nop            
        //    55: iconst_0       
        //    56: istore          $i$f$distanceSq
        //    58: dload           x2$iv
        //    60: dload           x1$iv
        //    62: dsub           
        //    63: dstore          $this$sq$iv$iv$iv
        //    65: iconst_0       
        //    66: istore          $i$f$getSq
        //    68: dload           $this$sq$iv$iv$iv
        //    70: dload           $this$sq$iv$iv$iv
        //    72: dmul           
        //    73: dload           y2$iv
        //    75: dload           y1$iv
        //    77: dsub           
        //    78: dstore          $this$sq$iv$iv$iv
        //    80: iconst_0       
        //    81: istore          $i$f$getSq
        //    83: dload           $this$sq$iv$iv$iv
        //    85: dload           $this$sq$iv$iv$iv
        //    87: dmul           
        //    88: dadd           
        //    89: dload           z2$iv
        //    91: dload           z1$iv
        //    93: dsub           
        //    94: dstore          $this$sq$iv$iv$iv
        //    96: iconst_0       
        //    97: istore          $i$f$getSq
        //    99: dload           $this$sq$iv$iv$iv
        //   101: dload           $this$sq$iv$iv$iv
        //   103: dmul           
        //   104: dadd           
        //   105: invokestatic    java/lang/Math.sqrt:(D)D
        //   108: nop            
        //   109: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Vec3d $this$distanceSqTo, @NotNull final Vec3d vec3d) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3d */
        //     7: ldc             "vec3d"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceSqTo */
        //    14: aload_0         /* $this$distanceSqTo */
        //    15: getfield        net/minecraft/util/math/Vec3d.x:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceSqTo */
        //    20: getfield        net/minecraft/util/math/Vec3d.y:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceSqTo */
        //    26: getfield        net/minecraft/util/math/Vec3d.z:D
        //    29: dstore          7
        //    31: aload_1         /* vec3d */
        //    32: getfield        net/minecraft/util/math/Vec3d.x:D
        //    35: dstore          9
        //    37: aload_1         /* vec3d */
        //    38: getfield        net/minecraft/util/math/Vec3d.y:D
        //    41: dstore          11
        //    43: aload_1         /* vec3d */
        //    44: getfield        net/minecraft/util/math/Vec3d.z:D
        //    47: dstore          z2$iv
        //    49: iconst_0       
        //    50: istore          $i$f$distanceSq
        //    52: dload           x2$iv
        //    54: dload_3         /* x1$iv */
        //    55: dsub           
        //    56: dstore          $this$sq$iv$iv
        //    58: iconst_0       
        //    59: istore          $i$f$getSq
        //    61: dload           $this$sq$iv$iv
        //    63: dload           $this$sq$iv$iv
        //    65: dmul           
        //    66: dload           y2$iv
        //    68: dload           y1$iv
        //    70: dsub           
        //    71: dstore          $this$sq$iv$iv
        //    73: iconst_0       
        //    74: istore          $i$f$getSq
        //    76: dload           $this$sq$iv$iv
        //    78: dload           $this$sq$iv$iv
        //    80: dmul           
        //    81: dadd           
        //    82: dload           z2$iv
        //    84: dload           z1$iv
        //    86: dsub           
        //    87: dstore          $this$sq$iv$iv
        //    89: iconst_0       
        //    90: istore          $i$f$getSq
        //    92: dload           $this$sq$iv$iv
        //    94: dload           $this$sq$iv$iv
        //    96: dmul           
        //    97: dadd           
        //    98: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Vec3d $this$distanceSqTo, @NotNull final Vec3i vec3i) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3i */
        //     7: ldc             "vec3i"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceSqTo */
        //    14: aload_0         /* $this$distanceSqTo */
        //    15: getfield        net/minecraft/util/math/Vec3d.x:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceSqTo */
        //    20: getfield        net/minecraft/util/math/Vec3d.y:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceSqTo */
        //    26: getfield        net/minecraft/util/math/Vec3d.z:D
        //    29: dstore          7
        //    31: aload_1         /* vec3i */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    35: i2d            
        //    36: ldc2_w          0.5
        //    39: dadd           
        //    40: dstore          9
        //    42: aload_1         /* vec3i */
        //    43: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    46: i2d            
        //    47: ldc2_w          0.5
        //    50: dadd           
        //    51: dstore          11
        //    53: aload_1         /* vec3i */
        //    54: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    57: i2d            
        //    58: ldc2_w          0.5
        //    61: dadd           
        //    62: dstore          z2$iv
        //    64: iconst_0       
        //    65: istore          $i$f$distanceSq
        //    67: dload           x2$iv
        //    69: dload_3         /* x1$iv */
        //    70: dsub           
        //    71: dstore          $this$sq$iv$iv
        //    73: iconst_0       
        //    74: istore          $i$f$getSq
        //    76: dload           $this$sq$iv$iv
        //    78: dload           $this$sq$iv$iv
        //    80: dmul           
        //    81: dload           y2$iv
        //    83: dload           y1$iv
        //    85: dsub           
        //    86: dstore          $this$sq$iv$iv
        //    88: iconst_0       
        //    89: istore          $i$f$getSq
        //    91: dload           $this$sq$iv$iv
        //    93: dload           $this$sq$iv$iv
        //    95: dmul           
        //    96: dadd           
        //    97: dload           z2$iv
        //    99: dload           z1$iv
        //   101: dsub           
        //   102: dstore          $this$sq$iv$iv
        //   104: iconst_0       
        //   105: istore          $i$f$getSq
        //   107: dload           $this$sq$iv$iv
        //   109: dload           $this$sq$iv$iv
        //   111: dmul           
        //   112: dadd           
        //   113: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Vec3d $this$distanceSqTo, final double x, final double y, final double z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceSqTo
        //     9: aload_0         /* $this$distanceSqTo */
        //    10: getfield        net/minecraft/util/math/Vec3d.x:D
        //    13: dstore          8
        //    15: aload_0         /* $this$distanceSqTo */
        //    16: getfield        net/minecraft/util/math/Vec3d.y:D
        //    19: dstore          10
        //    21: aload_0         /* $this$distanceSqTo */
        //    22: getfield        net/minecraft/util/math/Vec3d.z:D
        //    25: dstore          z1$iv
        //    27: iconst_0       
        //    28: istore          $i$f$distanceSq
        //    30: dload_1         /* x */
        //    31: dload           x1$iv
        //    33: dsub           
        //    34: dstore          $this$sq$iv$iv
        //    36: iconst_0       
        //    37: istore          $i$f$getSq
        //    39: dload           $this$sq$iv$iv
        //    41: dload           $this$sq$iv$iv
        //    43: dmul           
        //    44: dload_3         /* y */
        //    45: dload           y1$iv
        //    47: dsub           
        //    48: dstore          $this$sq$iv$iv
        //    50: iconst_0       
        //    51: istore          $i$f$getSq
        //    53: dload           $this$sq$iv$iv
        //    55: dload           $this$sq$iv$iv
        //    57: dmul           
        //    58: dadd           
        //    59: dload           z
        //    61: dload           z1$iv
        //    63: dsub           
        //    64: dstore          $this$sq$iv$iv
        //    66: iconst_0       
        //    67: istore          $i$f$getSq
        //    69: dload           $this$sq$iv$iv
        //    71: dload           $this$sq$iv$iv
        //    73: dmul           
        //    74: dadd           
        //    75: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Vec3d $this$distanceSqTo, final int x, final int y, final int z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceSqTo
        //     9: aload_0         /* $this$distanceSqTo */
        //    10: getfield        net/minecraft/util/math/Vec3d.x:D
        //    13: dstore          5
        //    15: aload_0         /* $this$distanceSqTo */
        //    16: getfield        net/minecraft/util/math/Vec3d.y:D
        //    19: dstore          7
        //    21: aload_0         /* $this$distanceSqTo */
        //    22: getfield        net/minecraft/util/math/Vec3d.z:D
        //    25: dstore          9
        //    27: iload_1         /* x */
        //    28: i2d            
        //    29: ldc2_w          0.5
        //    32: dadd           
        //    33: dstore          11
        //    35: iload_2         /* y */
        //    36: i2d            
        //    37: ldc2_w          0.5
        //    40: dadd           
        //    41: dstore          13
        //    43: iload_3         /* z */
        //    44: i2d            
        //    45: ldc2_w          0.5
        //    48: dadd           
        //    49: dstore          z2$iv
        //    51: iconst_0       
        //    52: istore          $i$f$distanceSq
        //    54: dload           x2$iv
        //    56: dload           x1$iv
        //    58: dsub           
        //    59: dstore          $this$sq$iv$iv
        //    61: iconst_0       
        //    62: istore          $i$f$getSq
        //    64: dload           $this$sq$iv$iv
        //    66: dload           $this$sq$iv$iv
        //    68: dmul           
        //    69: dload           y2$iv
        //    71: dload           y1$iv
        //    73: dsub           
        //    74: dstore          $this$sq$iv$iv
        //    76: iconst_0       
        //    77: istore          $i$f$getSq
        //    79: dload           $this$sq$iv$iv
        //    81: dload           $this$sq$iv$iv
        //    83: dmul           
        //    84: dadd           
        //    85: dload           z2$iv
        //    87: dload           z1$iv
        //    89: dsub           
        //    90: dstore          $this$sq$iv$iv
        //    92: iconst_0       
        //    93: istore          $i$f$getSq
        //    95: dload           $this$sq$iv$iv
        //    97: dload           $this$sq$iv$iv
        //    99: dmul           
        //   100: dadd           
        //   101: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Entity $this$distanceTo, @NotNull final Vec3d vec3d) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3d */
        //     7: ldc             "vec3d"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceTo */
        //    14: aload_0         /* $this$distanceTo */
        //    15: getfield        net/minecraft/entity/Entity.posX:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceTo */
        //    20: getfield        net/minecraft/entity/Entity.posY:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceTo */
        //    26: getfield        net/minecraft/entity/Entity.posZ:D
        //    29: dstore          7
        //    31: aload_1         /* vec3d */
        //    32: getfield        net/minecraft/util/math/Vec3d.x:D
        //    35: dstore          9
        //    37: aload_1         /* vec3d */
        //    38: getfield        net/minecraft/util/math/Vec3d.y:D
        //    41: dstore          11
        //    43: aload_1         /* vec3d */
        //    44: getfield        net/minecraft/util/math/Vec3d.z:D
        //    47: dstore          z2$iv
        //    49: iconst_0       
        //    50: istore          $i$f$distance
        //    52: nop            
        //    53: iconst_0       
        //    54: istore          $i$f$distanceSq
        //    56: dload           x2$iv
        //    58: dload_3         /* x1$iv */
        //    59: dsub           
        //    60: dstore          $this$sq$iv$iv$iv
        //    62: iconst_0       
        //    63: istore          $i$f$getSq
        //    65: dload           $this$sq$iv$iv$iv
        //    67: dload           $this$sq$iv$iv$iv
        //    69: dmul           
        //    70: dload           y2$iv
        //    72: dload           y1$iv
        //    74: dsub           
        //    75: dstore          $this$sq$iv$iv$iv
        //    77: iconst_0       
        //    78: istore          $i$f$getSq
        //    80: dload           $this$sq$iv$iv$iv
        //    82: dload           $this$sq$iv$iv$iv
        //    84: dmul           
        //    85: dadd           
        //    86: dload           z2$iv
        //    88: dload           z1$iv
        //    90: dsub           
        //    91: dstore          $this$sq$iv$iv$iv
        //    93: iconst_0       
        //    94: istore          $i$f$getSq
        //    96: dload           $this$sq$iv$iv$iv
        //    98: dload           $this$sq$iv$iv$iv
        //   100: dmul           
        //   101: dadd           
        //   102: invokestatic    java/lang/Math.sqrt:(D)D
        //   105: nop            
        //   106: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Entity $this$distanceTo, @NotNull final Vec3i vec3i) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3i */
        //     7: ldc             "vec3i"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceTo */
        //    14: aload_0         /* $this$distanceTo */
        //    15: getfield        net/minecraft/entity/Entity.posX:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceTo */
        //    20: getfield        net/minecraft/entity/Entity.posY:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceTo */
        //    26: getfield        net/minecraft/entity/Entity.posZ:D
        //    29: dstore          7
        //    31: aload_1         /* vec3i */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    35: i2d            
        //    36: ldc2_w          0.5
        //    39: dadd           
        //    40: dstore          9
        //    42: aload_1         /* vec3i */
        //    43: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    46: i2d            
        //    47: ldc2_w          0.5
        //    50: dadd           
        //    51: dstore          11
        //    53: aload_1         /* vec3i */
        //    54: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    57: i2d            
        //    58: ldc2_w          0.5
        //    61: dadd           
        //    62: dstore          z2$iv
        //    64: iconst_0       
        //    65: istore          $i$f$distance
        //    67: nop            
        //    68: iconst_0       
        //    69: istore          $i$f$distanceSq
        //    71: dload           x2$iv
        //    73: dload_3         /* x1$iv */
        //    74: dsub           
        //    75: dstore          $this$sq$iv$iv$iv
        //    77: iconst_0       
        //    78: istore          $i$f$getSq
        //    80: dload           $this$sq$iv$iv$iv
        //    82: dload           $this$sq$iv$iv$iv
        //    84: dmul           
        //    85: dload           y2$iv
        //    87: dload           y1$iv
        //    89: dsub           
        //    90: dstore          $this$sq$iv$iv$iv
        //    92: iconst_0       
        //    93: istore          $i$f$getSq
        //    95: dload           $this$sq$iv$iv$iv
        //    97: dload           $this$sq$iv$iv$iv
        //    99: dmul           
        //   100: dadd           
        //   101: dload           z2$iv
        //   103: dload           z1$iv
        //   105: dsub           
        //   106: dstore          $this$sq$iv$iv$iv
        //   108: iconst_0       
        //   109: istore          $i$f$getSq
        //   111: dload           $this$sq$iv$iv$iv
        //   113: dload           $this$sq$iv$iv$iv
        //   115: dmul           
        //   116: dadd           
        //   117: invokestatic    java/lang/Math.sqrt:(D)D
        //   120: nop            
        //   121: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Entity $this$distanceTo, final double x, final double y, final double z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceTo
        //     9: aload_0         /* $this$distanceTo */
        //    10: getfield        net/minecraft/entity/Entity.posX:D
        //    13: dstore          8
        //    15: aload_0         /* $this$distanceTo */
        //    16: getfield        net/minecraft/entity/Entity.posY:D
        //    19: dstore          10
        //    21: aload_0         /* $this$distanceTo */
        //    22: getfield        net/minecraft/entity/Entity.posZ:D
        //    25: dstore          z1$iv
        //    27: iconst_0       
        //    28: istore          $i$f$distance
        //    30: nop            
        //    31: iconst_0       
        //    32: istore          $i$f$distanceSq
        //    34: dload_1         /* x */
        //    35: dload           x1$iv
        //    37: dsub           
        //    38: dstore          $this$sq$iv$iv$iv
        //    40: iconst_0       
        //    41: istore          $i$f$getSq
        //    43: dload           $this$sq$iv$iv$iv
        //    45: dload           $this$sq$iv$iv$iv
        //    47: dmul           
        //    48: dload_3         /* y */
        //    49: dload           y1$iv
        //    51: dsub           
        //    52: dstore          $this$sq$iv$iv$iv
        //    54: iconst_0       
        //    55: istore          $i$f$getSq
        //    57: dload           $this$sq$iv$iv$iv
        //    59: dload           $this$sq$iv$iv$iv
        //    61: dmul           
        //    62: dadd           
        //    63: dload           z
        //    65: dload           z1$iv
        //    67: dsub           
        //    68: dstore          $this$sq$iv$iv$iv
        //    70: iconst_0       
        //    71: istore          $i$f$getSq
        //    73: dload           $this$sq$iv$iv$iv
        //    75: dload           $this$sq$iv$iv$iv
        //    77: dmul           
        //    78: dadd           
        //    79: invokestatic    java/lang/Math.sqrt:(D)D
        //    82: nop            
        //    83: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceTo(@NotNull final Entity $this$distanceTo, final int x, final int y, final int z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceTo
        //     9: aload_0         /* $this$distanceTo */
        //    10: getfield        net/minecraft/entity/Entity.posX:D
        //    13: dstore          5
        //    15: aload_0         /* $this$distanceTo */
        //    16: getfield        net/minecraft/entity/Entity.posY:D
        //    19: dstore          7
        //    21: aload_0         /* $this$distanceTo */
        //    22: getfield        net/minecraft/entity/Entity.posZ:D
        //    25: dstore          9
        //    27: iload_1         /* x */
        //    28: i2d            
        //    29: ldc2_w          0.5
        //    32: dadd           
        //    33: dstore          11
        //    35: iload_2         /* y */
        //    36: i2d            
        //    37: ldc2_w          0.5
        //    40: dadd           
        //    41: dstore          13
        //    43: iload_3         /* z */
        //    44: i2d            
        //    45: ldc2_w          0.5
        //    48: dadd           
        //    49: dstore          z2$iv
        //    51: iconst_0       
        //    52: istore          $i$f$distance
        //    54: nop            
        //    55: iconst_0       
        //    56: istore          $i$f$distanceSq
        //    58: dload           x2$iv
        //    60: dload           x1$iv
        //    62: dsub           
        //    63: dstore          $this$sq$iv$iv$iv
        //    65: iconst_0       
        //    66: istore          $i$f$getSq
        //    68: dload           $this$sq$iv$iv$iv
        //    70: dload           $this$sq$iv$iv$iv
        //    72: dmul           
        //    73: dload           y2$iv
        //    75: dload           y1$iv
        //    77: dsub           
        //    78: dstore          $this$sq$iv$iv$iv
        //    80: iconst_0       
        //    81: istore          $i$f$getSq
        //    83: dload           $this$sq$iv$iv$iv
        //    85: dload           $this$sq$iv$iv$iv
        //    87: dmul           
        //    88: dadd           
        //    89: dload           z2$iv
        //    91: dload           z1$iv
        //    93: dsub           
        //    94: dstore          $this$sq$iv$iv$iv
        //    96: iconst_0       
        //    97: istore          $i$f$getSq
        //    99: dload           $this$sq$iv$iv$iv
        //   101: dload           $this$sq$iv$iv$iv
        //   103: dmul           
        //   104: dadd           
        //   105: invokestatic    java/lang/Math.sqrt:(D)D
        //   108: nop            
        //   109: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Entity $this$distanceSqTo, @NotNull final Vec3d vec3d) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3d */
        //     7: ldc             "vec3d"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceSqTo */
        //    14: aload_0         /* $this$distanceSqTo */
        //    15: getfield        net/minecraft/entity/Entity.posX:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceSqTo */
        //    20: getfield        net/minecraft/entity/Entity.posY:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceSqTo */
        //    26: getfield        net/minecraft/entity/Entity.posZ:D
        //    29: dstore          7
        //    31: aload_1         /* vec3d */
        //    32: getfield        net/minecraft/util/math/Vec3d.x:D
        //    35: dstore          9
        //    37: aload_1         /* vec3d */
        //    38: getfield        net/minecraft/util/math/Vec3d.y:D
        //    41: dstore          11
        //    43: aload_1         /* vec3d */
        //    44: getfield        net/minecraft/util/math/Vec3d.z:D
        //    47: dstore          z2$iv
        //    49: iconst_0       
        //    50: istore          $i$f$distanceSq
        //    52: dload           x2$iv
        //    54: dload_3         /* x1$iv */
        //    55: dsub           
        //    56: dstore          $this$sq$iv$iv
        //    58: iconst_0       
        //    59: istore          $i$f$getSq
        //    61: dload           $this$sq$iv$iv
        //    63: dload           $this$sq$iv$iv
        //    65: dmul           
        //    66: dload           y2$iv
        //    68: dload           y1$iv
        //    70: dsub           
        //    71: dstore          $this$sq$iv$iv
        //    73: iconst_0       
        //    74: istore          $i$f$getSq
        //    76: dload           $this$sq$iv$iv
        //    78: dload           $this$sq$iv$iv
        //    80: dmul           
        //    81: dadd           
        //    82: dload           z2$iv
        //    84: dload           z1$iv
        //    86: dsub           
        //    87: dstore          $this$sq$iv$iv
        //    89: iconst_0       
        //    90: istore          $i$f$getSq
        //    92: dload           $this$sq$iv$iv
        //    94: dload           $this$sq$iv$iv
        //    96: dmul           
        //    97: dadd           
        //    98: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Entity $this$distanceSqTo, @NotNull final Vec3i vec3i) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* vec3i */
        //     7: ldc             "vec3i"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$distanceSqTo */
        //    14: aload_0         /* $this$distanceSqTo */
        //    15: getfield        net/minecraft/entity/Entity.posX:D
        //    18: dstore_3       
        //    19: aload_0         /* $this$distanceSqTo */
        //    20: getfield        net/minecraft/entity/Entity.posY:D
        //    23: dstore          5
        //    25: aload_0         /* $this$distanceSqTo */
        //    26: getfield        net/minecraft/entity/Entity.posZ:D
        //    29: dstore          7
        //    31: aload_1         /* vec3i */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    35: i2d            
        //    36: ldc2_w          0.5
        //    39: dadd           
        //    40: dstore          9
        //    42: aload_1         /* vec3i */
        //    43: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    46: i2d            
        //    47: ldc2_w          0.5
        //    50: dadd           
        //    51: dstore          11
        //    53: aload_1         /* vec3i */
        //    54: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    57: i2d            
        //    58: ldc2_w          0.5
        //    61: dadd           
        //    62: dstore          z2$iv
        //    64: iconst_0       
        //    65: istore          $i$f$distanceSq
        //    67: dload           x2$iv
        //    69: dload_3         /* x1$iv */
        //    70: dsub           
        //    71: dstore          $this$sq$iv$iv
        //    73: iconst_0       
        //    74: istore          $i$f$getSq
        //    76: dload           $this$sq$iv$iv
        //    78: dload           $this$sq$iv$iv
        //    80: dmul           
        //    81: dload           y2$iv
        //    83: dload           y1$iv
        //    85: dsub           
        //    86: dstore          $this$sq$iv$iv
        //    88: iconst_0       
        //    89: istore          $i$f$getSq
        //    91: dload           $this$sq$iv$iv
        //    93: dload           $this$sq$iv$iv
        //    95: dmul           
        //    96: dadd           
        //    97: dload           z2$iv
        //    99: dload           z1$iv
        //   101: dsub           
        //   102: dstore          $this$sq$iv$iv
        //   104: iconst_0       
        //   105: istore          $i$f$getSq
        //   107: dload           $this$sq$iv$iv
        //   109: dload           $this$sq$iv$iv
        //   111: dmul           
        //   112: dadd           
        //   113: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Entity $this$distanceSqTo, final double x, final double y, final double z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceSqTo
        //     9: aload_0         /* $this$distanceSqTo */
        //    10: getfield        net/minecraft/entity/Entity.posX:D
        //    13: dstore          8
        //    15: aload_0         /* $this$distanceSqTo */
        //    16: getfield        net/minecraft/entity/Entity.posY:D
        //    19: dstore          10
        //    21: aload_0         /* $this$distanceSqTo */
        //    22: getfield        net/minecraft/entity/Entity.posZ:D
        //    25: dstore          z1$iv
        //    27: iconst_0       
        //    28: istore          $i$f$distanceSq
        //    30: dload_1         /* x */
        //    31: dload           x1$iv
        //    33: dsub           
        //    34: dstore          $this$sq$iv$iv
        //    36: iconst_0       
        //    37: istore          $i$f$getSq
        //    39: dload           $this$sq$iv$iv
        //    41: dload           $this$sq$iv$iv
        //    43: dmul           
        //    44: dload_3         /* y */
        //    45: dload           y1$iv
        //    47: dsub           
        //    48: dstore          $this$sq$iv$iv
        //    50: iconst_0       
        //    51: istore          $i$f$getSq
        //    53: dload           $this$sq$iv$iv
        //    55: dload           $this$sq$iv$iv
        //    57: dmul           
        //    58: dadd           
        //    59: dload           z
        //    61: dload           z1$iv
        //    63: dsub           
        //    64: dstore          $this$sq$iv$iv
        //    66: iconst_0       
        //    67: istore          $i$f$getSq
        //    69: dload           $this$sq$iv$iv
        //    71: dload           $this$sq$iv$iv
        //    73: dmul           
        //    74: dadd           
        //    75: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distanceSqTo(@NotNull final Entity $this$distanceSqTo, final int x, final int y, final int z) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$distanceSqTo
        //     9: aload_0         /* $this$distanceSqTo */
        //    10: getfield        net/minecraft/entity/Entity.posX:D
        //    13: dstore          5
        //    15: aload_0         /* $this$distanceSqTo */
        //    16: getfield        net/minecraft/entity/Entity.posY:D
        //    19: dstore          7
        //    21: aload_0         /* $this$distanceSqTo */
        //    22: getfield        net/minecraft/entity/Entity.posZ:D
        //    25: dstore          9
        //    27: iload_1         /* x */
        //    28: i2d            
        //    29: ldc2_w          0.5
        //    32: dadd           
        //    33: dstore          11
        //    35: iload_2         /* y */
        //    36: i2d            
        //    37: ldc2_w          0.5
        //    40: dadd           
        //    41: dstore          13
        //    43: iload_3         /* z */
        //    44: i2d            
        //    45: ldc2_w          0.5
        //    48: dadd           
        //    49: dstore          z2$iv
        //    51: iconst_0       
        //    52: istore          $i$f$distanceSq
        //    54: dload           x2$iv
        //    56: dload           x1$iv
        //    58: dsub           
        //    59: dstore          $this$sq$iv$iv
        //    61: iconst_0       
        //    62: istore          $i$f$getSq
        //    64: dload           $this$sq$iv$iv
        //    66: dload           $this$sq$iv$iv
        //    68: dmul           
        //    69: dload           y2$iv
        //    71: dload           y1$iv
        //    73: dsub           
        //    74: dstore          $this$sq$iv$iv
        //    76: iconst_0       
        //    77: istore          $i$f$getSq
        //    79: dload           $this$sq$iv$iv
        //    81: dload           $this$sq$iv$iv
        //    83: dmul           
        //    84: dadd           
        //    85: dload           z2$iv
        //    87: dload           z1$iv
        //    89: dsub           
        //    90: dstore          $this$sq$iv$iv
        //    92: iconst_0       
        //    93: istore          $i$f$getSq
        //    95: dload           $this$sq$iv$iv
        //    97: dload           $this$sq$iv$iv
        //    99: dmul           
        //   100: dadd           
        //   101: dreturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final double distance(final double x1, final double y1, final double z1, final double x2, final double y2, final double z2) {
        final int $i$f$distance = 0;
        final int $i$f$distanceSq = 0;
        double $this$sq$iv$iv = x2 - x1;
        int $i$f$getSq = 0;
        final double n = $this$sq$iv$iv * $this$sq$iv$iv;
        $this$sq$iv$iv = y2 - y1;
        $i$f$getSq = 0;
        final double n2 = n + $this$sq$iv$iv * $this$sq$iv$iv;
        $this$sq$iv$iv = z2 - z1;
        $i$f$getSq = 0;
        return Math.sqrt(n2 + $this$sq$iv$iv * $this$sq$iv$iv);
    }
    
    public static final double distance(final float x1, final float y1, final float z1, final float x2, final float y2, final float z2) {
        final int $i$f$distance = 0;
        final int $i$f$distanceSq = 0;
        float $this$sq$iv$iv = x2 - x1;
        int $i$f$getSq = 0;
        final float n = $this$sq$iv$iv * $this$sq$iv$iv;
        $this$sq$iv$iv = y2 - y1;
        $i$f$getSq = 0;
        final float n2 = n + $this$sq$iv$iv * $this$sq$iv$iv;
        $this$sq$iv$iv = z2 - z1;
        $i$f$getSq = 0;
        return Math.sqrt(n2 + $this$sq$iv$iv * $this$sq$iv$iv);
    }
    
    public static final double distance(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2) {
        final int $i$f$distance = 0;
        final int $i$f$distanceSq = 0;
        int $this$sq$iv$iv = x2 - x1;
        int $i$f$getSq = 0;
        final int n = $this$sq$iv$iv * $this$sq$iv$iv;
        $this$sq$iv$iv = y2 - y1;
        $i$f$getSq = 0;
        final int n2 = n + $this$sq$iv$iv * $this$sq$iv$iv;
        $this$sq$iv$iv = z2 - z1;
        $i$f$getSq = 0;
        return Math.sqrt(n2 + $this$sq$iv$iv * $this$sq$iv$iv);
    }
    
    public static final double distanceSq(final double x1, final double y1, final double z1, final double x2, final double y2, final double z2) {
        final int $i$f$distanceSq = 0;
        double $this$sq$iv = x2 - x1;
        int $i$f$getSq = 0;
        final double n = $this$sq$iv * $this$sq$iv;
        $this$sq$iv = y2 - y1;
        $i$f$getSq = 0;
        final double n2 = n + $this$sq$iv * $this$sq$iv;
        $this$sq$iv = z2 - z1;
        $i$f$getSq = 0;
        return n2 + $this$sq$iv * $this$sq$iv;
    }
    
    public static final float distanceSq(final float x1, final float y1, final float z1, final float x2, final float y2, final float z2) {
        final int $i$f$distanceSq = 0;
        float $this$sq$iv = x2 - x1;
        int $i$f$getSq = 0;
        final float n = $this$sq$iv * $this$sq$iv;
        $this$sq$iv = y2 - y1;
        $i$f$getSq = 0;
        final float n2 = n + $this$sq$iv * $this$sq$iv;
        $this$sq$iv = z2 - z1;
        $i$f$getSq = 0;
        return n2 + $this$sq$iv * $this$sq$iv;
    }
    
    public static final int distanceSq(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2) {
        final int $i$f$distanceSq = 0;
        int $this$sq$iv = x2 - x1;
        int $i$f$getSq = 0;
        final int n = $this$sq$iv * $this$sq$iv;
        $this$sq$iv = y2 - y1;
        $i$f$getSq = 0;
        final int n2 = n + $this$sq$iv * $this$sq$iv;
        $this$sq$iv = z2 - z1;
        $i$f$getSq = 0;
        return n2 + $this$sq$iv * $this$sq$iv;
    }
}
