//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math.vector;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.sun.javafx.geom.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u00000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0086\b\u001a%\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\b\u001a\r\u0010\u001e\u001a\u00020\u001a*\u00020\u001fH\u0086\b\u001a\u0015\u0010\u001e\u001a\u00020\u001a*\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0086\b\u001a%\u0010\u001e\u001a\u00020\u001a*\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"H\u0086\b\u001a\u0015\u0010\u001e\u001a\u00020\u001a*\u00020\u001f2\u0006\u0010 \u001a\u00020\u001aH\u0086\b\u001a\r\u0010#\u001a\u00020\u001a*\u00020\u001fH\u0086\b\u001a%\u0010#\u001a\u00020\u001a*\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"H\u0086\b\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006$" }, d2 = { "NUM_X_BITS", "", "getNUM_X_BITS", "()I", "NUM_Y_BITS", "getNUM_Y_BITS", "NUM_Z_BITS", "getNUM_Z_BITS", "X_MASK", "", "getX_MASK", "()J", "X_SHIFT", "getX_SHIFT", "Y_MASK", "getY_MASK", "Y_SHIFT", "getY_SHIFT", "Z_MASK", "getZ_MASK", "toLong", "x", "y", "z", "toBlockPos", "Lnet/minecraft/util/math/BlockPos;", "Lnet/minecraft/util/math/Vec3d;", "xOffset", "yOffset", "zOffset", "toVec3d", "Lnet/minecraft/util/math/Vec3i;", "offSet", "Lcom/sun/javafx/geom/Vec3f;", "", "toVec3dCenter", "Stay" })
public final class ConversionKt
{
    private static final int NUM_X_BITS;
    private static final int NUM_Z_BITS;
    private static final int NUM_Y_BITS;
    private static final int Y_SHIFT;
    private static final int X_SHIFT;
    private static final long X_MASK;
    private static final long Y_MASK;
    private static final long Z_MASK;
    
    @NotNull
    public static final BlockPos toBlockPos(@NotNull final Vec3d $this$toBlockPos, final int xOffset, final int yOffset, final int zOffset) {
        Intrinsics.checkNotNullParameter((Object)$this$toBlockPos, "<this>");
        final int $i$f$toBlockPos = 0;
        double $this$fastFloor$iv = $this$toBlockPos.x;
        int $i$f$fastFloor = 0;
        final int n = (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824 + xOffset;
        $this$fastFloor$iv = $this$toBlockPos.y;
        $i$f$fastFloor = 0;
        final int n2 = (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824 + yOffset;
        $this$fastFloor$iv = $this$toBlockPos.z;
        $i$f$fastFloor = 0;
        return new BlockPos(n, n2, (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824 + zOffset);
    }
    
    @NotNull
    public static final BlockPos toBlockPos(@NotNull final Vec3d $this$toBlockPos) {
        Intrinsics.checkNotNullParameter((Object)$this$toBlockPos, "<this>");
        final int $i$f$toBlockPos = 0;
        double $this$fastFloor$iv = $this$toBlockPos.x;
        int $i$f$fastFloor = 0;
        final int n = (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824;
        $this$fastFloor$iv = $this$toBlockPos.y;
        $i$f$fastFloor = 0;
        final int n2 = (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824;
        $this$fastFloor$iv = $this$toBlockPos.z;
        $i$f$fastFloor = 0;
        return new BlockPos(n, n2, (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824);
    }
    
    @NotNull
    public static final Vec3d toVec3dCenter(@NotNull final Vec3i $this$toVec3dCenter) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$toVec3dCenter */
        //     8: aload_0         /* $this$toVec3dCenter */
        //     9: astore_2       
        //    10: ldc2_w          0.5
        //    13: dstore_3       
        //    14: ldc2_w          0.5
        //    17: dstore          5
        //    19: ldc2_w          0.5
        //    22: dstore          zOffset$iv
        //    24: iconst_0       
        //    25: istore          $i$f$toVec3d
        //    27: new             Lnet/minecraft/util/math/Vec3d;
        //    30: dup            
        //    31: aload_2         /* $this$toVec3d$iv */
        //    32: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    35: i2d            
        //    36: dload_3         /* xOffset$iv */
        //    37: dadd           
        //    38: aload_2         /* $this$toVec3d$iv */
        //    39: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    42: i2d            
        //    43: dload           yOffset$iv
        //    45: dadd           
        //    46: aload_2         /* $this$toVec3d$iv */
        //    47: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    50: i2d            
        //    51: dload           zOffset$iv
        //    53: dadd           
        //    54: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //    57: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Vec3d toVec3dCenter(@NotNull final Vec3i $this$toVec3dCenter, final double xOffset, final double yOffset, final double zOffset) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore          $i$f$toVec3dCenter
        //     9: aload_0         /* $this$toVec3dCenter */
        //    10: astore          8
        //    12: ldc2_w          0.5
        //    15: dload_1         /* xOffset */
        //    16: dadd           
        //    17: dstore          9
        //    19: ldc2_w          0.5
        //    22: dload_3         /* yOffset */
        //    23: dadd           
        //    24: dstore          11
        //    26: ldc2_w          0.5
        //    29: dload           zOffset
        //    31: dadd           
        //    32: dstore          zOffset$iv
        //    34: iconst_0       
        //    35: istore          $i$f$toVec3d
        //    37: new             Lnet/minecraft/util/math/Vec3d;
        //    40: dup            
        //    41: aload           $this$toVec3d$iv
        //    43: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    46: i2d            
        //    47: dload           xOffset$iv
        //    49: dadd           
        //    50: aload           $this$toVec3d$iv
        //    52: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    55: i2d            
        //    56: dload           yOffset$iv
        //    58: dadd           
        //    59: aload           $this$toVec3d$iv
        //    61: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    64: i2d            
        //    65: dload           zOffset$iv
        //    67: dadd           
        //    68: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //    71: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Vec3d toVec3d(@NotNull final Vec3i $this$toVec3d) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3d, "<this>");
        final int $i$f$toVec3d = 0;
        return new Vec3d($this$toVec3d);
    }
    
    @NotNull
    public static final Vec3d toVec3d(@NotNull final Vec3i $this$toVec3d, @NotNull final Vec3d offSet) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* offSet */
        //     7: ldc             "offSet"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$toVec3d */
        //    14: aload_0         /* $this$toVec3d */
        //    15: astore_3       
        //    16: aload_1         /* offSet */
        //    17: getfield        net/minecraft/util/math/Vec3d.x:D
        //    20: dstore          4
        //    22: aload_1         /* offSet */
        //    23: getfield        net/minecraft/util/math/Vec3d.y:D
        //    26: dstore          6
        //    28: aload_1         /* offSet */
        //    29: getfield        net/minecraft/util/math/Vec3d.z:D
        //    32: dstore          zOffset$iv
        //    34: iconst_0       
        //    35: istore          $i$f$toVec3d
        //    37: new             Lnet/minecraft/util/math/Vec3d;
        //    40: dup            
        //    41: aload_3         /* $this$toVec3d$iv */
        //    42: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    45: i2d            
        //    46: dload           xOffset$iv
        //    48: dadd           
        //    49: aload_3         /* $this$toVec3d$iv */
        //    50: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    53: i2d            
        //    54: dload           yOffset$iv
        //    56: dadd           
        //    57: aload_3         /* $this$toVec3d$iv */
        //    58: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    61: i2d            
        //    62: dload           zOffset$iv
        //    64: dadd           
        //    65: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //    68: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Vec3d toVec3d(@NotNull final Vec3i $this$toVec3d, @NotNull final Vec3f offSet) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* offSet */
        //     7: ldc             "offSet"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: iconst_0       
        //    13: istore_2        /* $i$f$toVec3d */
        //    14: aload_0         /* $this$toVec3d */
        //    15: astore_3       
        //    16: aload_1         /* offSet */
        //    17: getfield        com/sun/javafx/geom/Vec3f.x:F
        //    20: f2d            
        //    21: dstore          4
        //    23: aload_1         /* offSet */
        //    24: getfield        com/sun/javafx/geom/Vec3f.y:F
        //    27: f2d            
        //    28: dstore          6
        //    30: aload_1         /* offSet */
        //    31: getfield        com/sun/javafx/geom/Vec3f.z:F
        //    34: f2d            
        //    35: dstore          zOffset$iv
        //    37: iconst_0       
        //    38: istore          $i$f$toVec3d
        //    40: new             Lnet/minecraft/util/math/Vec3d;
        //    43: dup            
        //    44: aload_3         /* $this$toVec3d$iv */
        //    45: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //    48: i2d            
        //    49: dload           xOffset$iv
        //    51: dadd           
        //    52: aload_3         /* $this$toVec3d$iv */
        //    53: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //    56: i2d            
        //    57: dload           yOffset$iv
        //    59: dadd           
        //    60: aload_3         /* $this$toVec3d$iv */
        //    61: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //    64: i2d            
        //    65: dload           zOffset$iv
        //    67: dadd           
        //    68: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //    71: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Vec3d toVec3d(@NotNull final Vec3i $this$toVec3d, final double xOffset, final double yOffset, final double zOffset) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3d, "<this>");
        final int $i$f$toVec3d = 0;
        return new Vec3d($this$toVec3d.getX() + xOffset, $this$toVec3d.getY() + yOffset, $this$toVec3d.getZ() + zOffset);
    }
    
    public static final int getNUM_X_BITS() {
        return ConversionKt.NUM_X_BITS;
    }
    
    public static final int getNUM_Z_BITS() {
        return ConversionKt.NUM_Z_BITS;
    }
    
    public static final int getNUM_Y_BITS() {
        return ConversionKt.NUM_Y_BITS;
    }
    
    public static final int getY_SHIFT() {
        return ConversionKt.Y_SHIFT;
    }
    
    public static final int getX_SHIFT() {
        return ConversionKt.X_SHIFT;
    }
    
    public static final long getX_MASK() {
        return ConversionKt.X_MASK;
    }
    
    public static final long getY_MASK() {
        return ConversionKt.Y_MASK;
    }
    
    public static final long getZ_MASK() {
        return ConversionKt.Z_MASK;
    }
    
    public static final long toLong(final int x, final int y, final int z) {
        final int $i$f$toLong = 0;
        return ((long)x & getX_MASK()) << getX_SHIFT() | ((long)y & getY_MASK()) << getY_SHIFT() | ((long)z & getZ_MASK());
    }
    
    static {
        NUM_X_BITS = 1 + MathHelper.log2(MathHelper.smallestEncompassingPowerOfTwo(30000000));
        NUM_Z_BITS = ConversionKt.NUM_X_BITS;
        NUM_Y_BITS = 64 - ConversionKt.NUM_X_BITS - ConversionKt.NUM_Z_BITS;
        Y_SHIFT = 0 + ConversionKt.NUM_Z_BITS;
        X_SHIFT = ConversionKt.Y_SHIFT + ConversionKt.NUM_Y_BITS;
        X_MASK = (1L << ConversionKt.NUM_X_BITS) - 1L;
        Y_MASK = (1L << ConversionKt.NUM_Y_BITS) - 1L;
        Z_MASK = (1L << ConversionKt.NUM_Z_BITS) - 1L;
    }
}
