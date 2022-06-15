//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math.vector;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.ranges.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002J&\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0014j\b\u0012\u0004\u0012\u00020\u000b`\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bJ\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bJ\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010 \u001a\u00020\u0017J\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\u00172\u0006\u0010!\u001a\u00020\"J\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\"2\u0006\u0010!\u001a\u00020\"J\u0015\u0010#\u001a\u00020\u0017*\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0086\u0006J\u0012\u0010$\u001a\u00020\"*\u00020\"2\u0006\u0010%\u001a\u00020\rJ\u0015\u0010&\u001a\u00020\u0017*\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0086\u0006J\u0015\u0010'\u001a\u00020\u0017*\u00020\u00172\u0006\u0010%\u001a\u00020\u0006H\u0086\u0006J\u0015\u0010'\u001a\u00020\u0017*\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0086\u0006J\n\u0010(\u001a\u00020\u000b*\u00020\u0017J\n\u0010)\u001a\u00020\u0017*\u00020\"J\"\u0010)\u001a\u00020\u0017*\u00020\"2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006J\u0012\u0010)\u001a\u00020\u0017*\u00020\"2\u0006\u0010-\u001a\u00020\u0017J\n\u0010.\u001a\u00020\u0017*\u00020\"J\"\u0010.\u001a\u00020\u0017*\u00020\"2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006J\u0012\u0010.\u001a\u00020\u0017*\u00020\"2\u0006\u0010-\u001a\u00020\u0017J\u0017\u0010/\u001a\u00020\u0017*\u000200\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b1\u00102\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063" }, d2 = { "Lme/alpha432/stay/util/math/vector/VectorUtils;", "", "()V", "getAxisRange", "Lkotlin/ranges/IntRange;", "d1", "", "d2", "", "getBlockPos", "", "Lnet/minecraft/util/math/BlockPos;", "minX", "", "maxX", "minY", "maxY", "minZ", "maxZ", "getBlockPosInSphere", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "center", "Lnet/minecraft/util/math/Vec3d;", "radius", "getBlockPositionsInArea", "pos1", "pos2", "distanceTo", "Lnet/minecraft/entity/Entity;", "chunkPos", "Lnet/minecraft/util/math/ChunkPos;", "vec3d", "vec3i", "Lnet/minecraft/util/math/Vec3i;", "minus", "multiply", "multiplier", "plus", "times", "toBlockPos", "toVec3d", "xOffset", "yOffset", "zOffset", "offSet", "toVec3dCenter", "toViewVec", "Lme/alpha432/stay/util/math/vector/Vec2f;", "toViewVec-_5-9_aw", "(J)Lnet/minecraft/util/math/Vec3d;", "Stay" })
public final class VectorUtils
{
    @NotNull
    public static final VectorUtils INSTANCE;
    
    private VectorUtils() {
    }
    
    @NotNull
    public final List<BlockPos> getBlockPositionsInArea(@NotNull final BlockPos pos1, @NotNull final BlockPos pos2) {
        Intrinsics.checkNotNullParameter((Object)pos1, "pos1");
        Intrinsics.checkNotNullParameter((Object)pos2, "pos2");
        final int minX = Math.min(pos1.getX(), pos2.getX());
        final int maxX = Math.max(pos1.getX(), pos2.getX());
        final int minY = Math.min(pos1.getY(), pos2.getY());
        final int maxY = Math.max(pos1.getY(), pos2.getY());
        final int minZ = Math.min(pos1.getZ(), pos2.getZ());
        final int maxZ = Math.max(pos1.getZ(), pos2.getZ());
        return this.getBlockPos(minX, maxX, minY, maxY, minZ, maxZ);
    }
    
    private final List<BlockPos> getBlockPos(final int minX, final int maxX, final int minY, final int maxY, final int minZ, final int maxZ) {
        final ArrayList returnList = new ArrayList();
        int n = minX;
        if (n <= maxX) {
            int x;
            do {
                x = n;
                ++n;
                int n2 = minZ;
                if (n2 <= maxZ) {
                    int z;
                    do {
                        z = n2;
                        ++n2;
                        int n3 = minY;
                        if (n3 <= maxY) {
                            int y;
                            do {
                                y = n3;
                                ++n3;
                                returnList.add(new BlockPos(x, y, z));
                            } while (y != maxY);
                        }
                    } while (z != maxZ);
                }
            } while (x != maxX);
        }
        return (List<BlockPos>)returnList;
    }
    
    @NotNull
    public final ArrayList<BlockPos> getBlockPosInSphere(@NotNull final Vec3d center, final float radius) {
        Intrinsics.checkNotNullParameter((Object)center, "center");
        final float squaredRadius = (float)Math.pow(radius, 2);
        final ArrayList posList = new ArrayList();
        final IntRange axisRange = this.getAxisRange(center.x, radius);
        int first = axisRange.getFirst();
        final int last = axisRange.getLast();
        if (first <= last) {
            int x;
            do {
                x = first;
                ++first;
                final IntRange axisRange2 = this.getAxisRange(center.y, radius);
                int first2 = axisRange2.getFirst();
                final int last2 = axisRange2.getLast();
                if (first2 <= last2) {
                    int y;
                    do {
                        y = first2;
                        ++first2;
                        final IntRange axisRange3 = this.getAxisRange(center.z, radius);
                        int first3 = axisRange3.getFirst();
                        final int last3 = axisRange3.getLast();
                        if (first3 <= last3) {
                            int z;
                            do {
                                z = first3;
                                ++first3;
                                final BlockPos blockPos = new BlockPos(x, y, z);
                                if (blockPos.distanceSqToCenter(center.x, center.y, center.z) > squaredRadius) {
                                    continue;
                                }
                                posList.add(blockPos);
                            } while (z != last3);
                        }
                    } while (y != last2);
                }
            } while (x != last);
        }
        return (ArrayList<BlockPos>)posList;
    }
    
    private final IntRange getAxisRange(final double d1, final float d2) {
        final double $this$floorToInt$iv = d1 - d2;
        final int $i$f$floorToInt = 0;
        final int n = (int)Math.floor($this$floorToInt$iv);
        final double $this$ceilToInt$iv = d1 + d2;
        final int $i$f$ceilToInt = 0;
        return new IntRange(n, (int)Math.ceil($this$ceilToInt$iv));
    }
    
    @NotNull
    public final Vec3d toViewVec-_5-9_aw(final long $this$toViewVec_u2d_5_u2d9_aw) {
        final long rotationRad = Vec2f.toRadians-meiVFKc($this$toViewVec_u2d_5_u2d9_aw);
        final float yaw = -Vec2f.getX-impl(rotationRad) - 3.1415927f;
        final float pitch = -Vec2f.getY-impl(rotationRad);
        final float cosYaw = (float)Math.cos(yaw);
        final float sinYaw = (float)Math.sin(yaw);
        final float cosPitch = -(float)Math.cos(pitch);
        final float sinPitch = (float)Math.sin(pitch);
        return new Vec3d((double)(sinYaw * cosPitch), (double)sinPitch, (double)(cosYaw * cosPitch));
    }
    
    @NotNull
    public final BlockPos toBlockPos(@NotNull final Vec3d $this$toBlockPos) {
        Intrinsics.checkNotNullParameter((Object)$this$toBlockPos, "<this>");
        double $this$floorToInt$iv = $this$toBlockPos.x;
        int $i$f$floorToInt = 0;
        final int n = (int)Math.floor($this$floorToInt$iv);
        $this$floorToInt$iv = $this$toBlockPos.y;
        $i$f$floorToInt = 0;
        final int n2 = (int)Math.floor($this$floorToInt$iv);
        $this$floorToInt$iv = $this$toBlockPos.z;
        $i$f$floorToInt = 0;
        return new BlockPos(n, n2, (int)Math.floor($this$floorToInt$iv));
    }
    
    @NotNull
    public final Vec3d toVec3d(@NotNull final Vec3i $this$toVec3d) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3d, "<this>");
        return this.toVec3d($this$toVec3d, 0.0, 0.0, 0.0);
    }
    
    @NotNull
    public final Vec3d toVec3d(@NotNull final Vec3i $this$toVec3d, @NotNull final Vec3d offSet) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3d, "<this>");
        Intrinsics.checkNotNullParameter((Object)offSet, "offSet");
        return new Vec3d($this$toVec3d.getX() + offSet.x, $this$toVec3d.getY() + offSet.y, $this$toVec3d.getZ() + offSet.z);
    }
    
    @NotNull
    public final Vec3d toVec3d(@NotNull final Vec3i $this$toVec3d, final double xOffset, final double yOffset, final double zOffset) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3d, "<this>");
        return new Vec3d($this$toVec3d.getX() + xOffset, $this$toVec3d.getY() + yOffset, $this$toVec3d.getZ() + zOffset);
    }
    
    @NotNull
    public final Vec3d toVec3dCenter(@NotNull final Vec3i $this$toVec3dCenter) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3dCenter, "<this>");
        return this.toVec3dCenter($this$toVec3dCenter, 0.0, 0.0, 0.0);
    }
    
    @NotNull
    public final Vec3d toVec3dCenter(@NotNull final Vec3i $this$toVec3dCenter, @NotNull final Vec3d offSet) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3dCenter, "<this>");
        Intrinsics.checkNotNullParameter((Object)offSet, "offSet");
        return new Vec3d($this$toVec3dCenter.getX() + 0.5 + offSet.x, $this$toVec3dCenter.getY() + 0.5 + offSet.y, $this$toVec3dCenter.getZ() + 0.5 + offSet.z);
    }
    
    @NotNull
    public final Vec3d toVec3dCenter(@NotNull final Vec3i $this$toVec3dCenter, final double xOffset, final double yOffset, final double zOffset) {
        Intrinsics.checkNotNullParameter((Object)$this$toVec3dCenter, "<this>");
        return new Vec3d($this$toVec3dCenter.getX() + 0.5 + xOffset, $this$toVec3dCenter.getY() + 0.5 + yOffset, $this$toVec3dCenter.getZ() + 0.5 + zOffset);
    }
    
    public final double distanceTo(@NotNull final Vec3i $this$distanceTo, @NotNull final Vec3i vec3i) {
        Intrinsics.checkNotNullParameter((Object)$this$distanceTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)vec3i, "vec3i");
        final int xDiff = vec3i.getX() - $this$distanceTo.getX();
        final int yDiff = vec3i.getY() - $this$distanceTo.getY();
        final int zDiff = vec3i.getZ() - $this$distanceTo.getZ();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
    
    public final double distanceTo(@NotNull final Vec3d $this$distanceTo, @NotNull final Vec3i vec3i) {
        Intrinsics.checkNotNullParameter((Object)$this$distanceTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)vec3i, "vec3i");
        final double xDiff = vec3i.getX() + 0.5 - $this$distanceTo.x;
        final double yDiff = vec3i.getY() + 0.5 - $this$distanceTo.y;
        final double zDiff = vec3i.getZ() + 0.5 - $this$distanceTo.z;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
    
    public final double distanceTo(@NotNull final Entity $this$distanceTo, @NotNull final Vec3i vec3i) {
        Intrinsics.checkNotNullParameter((Object)$this$distanceTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)vec3i, "vec3i");
        final double xDiff = vec3i.getX() + 0.5 - $this$distanceTo.posX;
        final double yDiff = vec3i.getY() + 0.5 - $this$distanceTo.posY;
        final double zDiff = vec3i.getZ() + 0.5 - $this$distanceTo.posZ;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
    
    public final double distanceTo(@NotNull final Entity $this$distanceTo, @NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)$this$distanceTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        final double xDiff = vec3d.x - $this$distanceTo.posX;
        final double yDiff = vec3d.y - $this$distanceTo.posY;
        final double zDiff = vec3d.z - $this$distanceTo.posZ;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
    
    public final double distanceTo(@NotNull final Entity $this$distanceTo, @NotNull final ChunkPos chunkPos) {
        Intrinsics.checkNotNullParameter((Object)$this$distanceTo, "<this>");
        Intrinsics.checkNotNullParameter((Object)chunkPos, "chunkPos");
        return Math.hypot(chunkPos.x * 16 + 8 - $this$distanceTo.posX, chunkPos.z * 16 + 8 - $this$distanceTo.posZ);
    }
    
    @NotNull
    public final Vec3i multiply(@NotNull final Vec3i $this$multiply, final int multiplier) {
        Intrinsics.checkNotNullParameter((Object)$this$multiply, "<this>");
        return new Vec3i($this$multiply.getX() * multiplier, $this$multiply.getY() * multiplier, $this$multiply.getZ() * multiplier);
    }
    
    @NotNull
    public final Vec3d times(@NotNull final Vec3d $this$times, @NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        return new Vec3d($this$times.x * vec3d.x, $this$times.y * vec3d.y, $this$times.z * vec3d.z);
    }
    
    @NotNull
    public final Vec3d times(@NotNull final Vec3d $this$times, final double multiplier) {
        Intrinsics.checkNotNullParameter((Object)$this$times, "<this>");
        return new Vec3d($this$times.x * multiplier, $this$times.y * multiplier, $this$times.z * multiplier);
    }
    
    @NotNull
    public final Vec3d plus(@NotNull final Vec3d $this$plus, @NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)$this$plus, "<this>");
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        final Vec3d add = $this$plus.add(vec3d);
        Intrinsics.checkNotNullExpressionValue((Object)add, "add(vec3d)");
        return add;
    }
    
    @NotNull
    public final Vec3d minus(@NotNull final Vec3d $this$minus, @NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)$this$minus, "<this>");
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        final Vec3d subtract = $this$minus.subtract(vec3d);
        Intrinsics.checkNotNullExpressionValue((Object)subtract, "subtract(vec3d)");
        return subtract;
    }
    
    static {
        INSTANCE = new VectorUtils();
    }
}
