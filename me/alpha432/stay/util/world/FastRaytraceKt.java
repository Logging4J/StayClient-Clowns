//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import net.minecraft.block.state.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002\u001af\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u0018\u001aV\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u0018\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u0018\u001a<\u0010\u001e\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006\u001a,\u0010\u001e\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006¨\u0006\u001f" }, d2 = { "fastRaytrace", "", "Lnet/minecraft/block/state/IBlockState;", "world", "Lnet/minecraft/world/World;", "blockPos", "Lnet/minecraft/util/math/BlockPos$MutableBlockPos;", "x1", "", "y1", "z1", "x2", "y2", "z2", "startX", "startY", "startZ", "endX", "endY", "endZ", "maxAttempt", "", "mutableBlockPos", "function", "Lkotlin/Function2;", "Lnet/minecraft/util/math/BlockPos;", "Lme/alpha432/stay/util/world/FastRayTraceAction;", "start", "Lnet/minecraft/util/math/Vec3d;", "end", "rayTraceVisible", "Stay" })
public final class FastRaytraceKt
{
    public static final boolean rayTraceVisible(@NotNull final World $this$rayTraceVisible, @NotNull final Vec3d start, final double endX, final double endY, final double endZ, final int maxAttempt, @NotNull final BlockPos$MutableBlockPos mutableBlockPos) {
        Intrinsics.checkNotNullParameter((Object)$this$rayTraceVisible, "<this>");
        Intrinsics.checkNotNullParameter((Object)start, "start");
        Intrinsics.checkNotNullParameter((Object)mutableBlockPos, "mutableBlockPos");
        return !fastRaytrace($this$rayTraceVisible, start.x, start.y, start.z, endX, endY, endZ, maxAttempt, mutableBlockPos, (Function2<? super BlockPos, ? super IBlockState, ? extends FastRayTraceAction>)new FastRaytraceKt$rayTraceVisible.FastRaytraceKt$rayTraceVisible$1($this$rayTraceVisible));
    }
    
    public static final boolean rayTraceVisible(@NotNull final World $this$rayTraceVisible, @NotNull final Vec3d start, @NotNull final Vec3d end, final int maxAttempt, @NotNull final BlockPos$MutableBlockPos mutableBlockPos) {
        Intrinsics.checkNotNullParameter((Object)$this$rayTraceVisible, "<this>");
        Intrinsics.checkNotNullParameter((Object)start, "start");
        Intrinsics.checkNotNullParameter((Object)end, "end");
        Intrinsics.checkNotNullParameter((Object)mutableBlockPos, "mutableBlockPos");
        return !fastRaytrace($this$rayTraceVisible, start, end, maxAttempt, mutableBlockPos, (Function2<? super BlockPos, ? super IBlockState, ? extends FastRayTraceAction>)new FastRaytraceKt$rayTraceVisible.FastRaytraceKt$rayTraceVisible$2($this$rayTraceVisible));
    }
    
    public static final boolean fastRaytrace(@NotNull final World $this$fastRaytrace, @NotNull final Vec3d start, @NotNull final Vec3d end, final int maxAttempt, @NotNull final BlockPos$MutableBlockPos mutableBlockPos) {
        Intrinsics.checkNotNullParameter((Object)$this$fastRaytrace, "<this>");
        Intrinsics.checkNotNullParameter((Object)start, "start");
        Intrinsics.checkNotNullParameter((Object)end, "end");
        Intrinsics.checkNotNullParameter((Object)mutableBlockPos, "mutableBlockPos");
        return fastRaytrace($this$fastRaytrace, start, end, maxAttempt, mutableBlockPos, (Function2<? super BlockPos, ? super IBlockState, ? extends FastRayTraceAction>)FastRaytraceKt$fastRaytrace.FastRaytraceKt$fastRaytrace$1.INSTANCE);
    }
    
    public static final boolean fastRaytrace(@NotNull final World $this$fastRaytrace, @NotNull final Vec3d start, @NotNull final Vec3d end, final int maxAttempt, @NotNull final BlockPos$MutableBlockPos mutableBlockPos, @NotNull final Function2<? super BlockPos, ? super IBlockState, ? extends FastRayTraceAction> function) {
        Intrinsics.checkNotNullParameter((Object)$this$fastRaytrace, "<this>");
        Intrinsics.checkNotNullParameter((Object)start, "start");
        Intrinsics.checkNotNullParameter((Object)end, "end");
        Intrinsics.checkNotNullParameter((Object)mutableBlockPos, "mutableBlockPos");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        return fastRaytrace($this$fastRaytrace, start.x, start.y, start.z, end.x, end.y, end.z, maxAttempt, mutableBlockPos, function);
    }
    
    public static final boolean fastRaytrace(@NotNull final World $this$fastRaytrace, @NotNull final Vec3d start, final double endX, final double endY, final double endZ, final int maxAttempt, @NotNull final BlockPos$MutableBlockPos mutableBlockPos, @NotNull final Function2<? super BlockPos, ? super IBlockState, ? extends FastRayTraceAction> function) {
        Intrinsics.checkNotNullParameter((Object)$this$fastRaytrace, "<this>");
        Intrinsics.checkNotNullParameter((Object)start, "start");
        Intrinsics.checkNotNullParameter((Object)mutableBlockPos, "mutableBlockPos");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        return fastRaytrace($this$fastRaytrace, start.x, start.y, start.z, endX, endY, endZ, maxAttempt, mutableBlockPos, function);
    }
    
    public static final boolean fastRaytrace(@NotNull final World $this$fastRaytrace, final double startX, final double startY, final double startZ, final double endX, final double endY, final double endZ, final int maxAttempt, @NotNull final BlockPos$MutableBlockPos mutableBlockPos, @NotNull final Function2<? super BlockPos, ? super IBlockState, ? extends FastRayTraceAction> function) {
        Intrinsics.checkNotNullParameter((Object)$this$fastRaytrace, "<this>");
        Intrinsics.checkNotNullParameter((Object)mutableBlockPos, "mutableBlockPos");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        double currentX = startX;
        double currentY = startY;
        double currentZ = startZ;
        final double $this$fastFloor$iv = currentX;
        final int $i$f$fastFloor = 0;
        int currentBlockX = (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824;
        final double $this$fastFloor$iv2 = currentY;
        final int $i$f$fastFloor2 = 0;
        int currentBlockY = (int)($this$fastFloor$iv2 + 1.073741824E9) - 1073741824;
        final double $this$fastFloor$iv3 = currentZ;
        final int $i$f$fastFloor3 = 0;
        int currentBlockZ = (int)($this$fastFloor$iv3 + 1.073741824E9) - 1073741824;
        mutableBlockPos.setPos(currentBlockX, currentBlockY, currentBlockZ);
        final IBlockState startBlockState = $this$fastRaytrace.getBlockState((BlockPos)mutableBlockPos);
        Intrinsics.checkNotNullExpressionValue((Object)startBlockState, "startBlockState");
        switch (WhenMappings.$EnumSwitchMapping$0[((FastRayTraceAction)function.invoke((Object)mutableBlockPos, (Object)startBlockState)).ordinal()]) {
            case 1: {
                return false;
            }
            case 2: {
                if (fastRaytrace(startBlockState, $this$fastRaytrace, mutableBlockPos, currentX, currentY, currentZ, endX, endY, endZ)) {
                    return true;
                }
                break;
            }
            case 3: {
                return true;
            }
        }
        final double $this$fastFloor$iv4 = endX;
        final int $i$f$fastFloor4 = 0;
        final int endBlockX = (int)($this$fastFloor$iv4 + 1.073741824E9) - 1073741824;
        final double $this$fastFloor$iv5 = endY;
        final int $i$f$fastFloor5 = 0;
        final int endBlockY = (int)($this$fastFloor$iv5 + 1.073741824E9) - 1073741824;
        final double $this$fastFloor$iv6 = endZ;
        final int $i$f$fastFloor6 = 0;
        final int endBlockZ = (int)($this$fastFloor$iv6 + 1.073741824E9) - 1073741824;
        int count = maxAttempt;
        while (true) {
            final int n = count;
            count = n - 1;
            if (n < 0) {
                return false;
            }
            if (currentBlockX == endBlockX && currentBlockY == endBlockY && currentBlockZ == endBlockZ) {
                return false;
            }
            int nextX = 999;
            int nextY = 999;
            int nextZ = 999;
            double stepX = 999.0;
            double stepY = 999.0;
            double stepZ = 999.0;
            final double diffX = endX - currentX;
            final double diffY = endY - currentY;
            final double diffZ = endZ - currentZ;
            if (endBlockX > currentBlockX) {
                nextX = currentBlockX + 1;
                stepX = (nextX - currentX) / diffX;
            }
            else if (endBlockX < currentBlockX) {
                nextX = currentBlockX;
                stepX = (nextX - currentX) / diffX;
            }
            if (endBlockY > currentBlockY) {
                nextY = currentBlockY + 1;
                stepY = (nextY - currentY) / diffY;
            }
            else if (endBlockY < currentBlockY) {
                nextY = currentBlockY;
                stepY = (nextY - currentY) / diffY;
            }
            if (endBlockZ > currentBlockZ) {
                nextZ = currentBlockZ + 1;
                stepZ = (nextZ - currentZ) / diffZ;
            }
            else if (endBlockZ < currentBlockZ) {
                nextZ = currentBlockZ;
                stepZ = (nextZ - currentZ) / diffZ;
            }
            if (stepX < stepY && stepX < stepZ) {
                currentX = nextX;
                currentY += diffY * stepX;
                currentZ += diffZ * stepX;
                currentBlockX = nextX - (endBlockX - currentBlockX >>> 31);
                double $this$fastFloor$iv7 = currentY;
                int $i$f$fastFloor7 = 0;
                currentBlockY = (int)($this$fastFloor$iv7 + 1.073741824E9) - 1073741824;
                $this$fastFloor$iv7 = currentZ;
                $i$f$fastFloor7 = 0;
                currentBlockZ = (int)($this$fastFloor$iv7 + 1.073741824E9) - 1073741824;
            }
            else if (stepY < stepZ) {
                currentX += diffX * stepY;
                currentY = nextY;
                currentZ += diffZ * stepY;
                double $this$fastFloor$iv7 = currentX;
                int $i$f$fastFloor7 = 0;
                currentBlockX = (int)($this$fastFloor$iv7 + 1.073741824E9) - 1073741824;
                currentBlockY = nextY - (endBlockY - currentBlockY >>> 31);
                $this$fastFloor$iv7 = currentZ;
                $i$f$fastFloor7 = 0;
                currentBlockZ = (int)($this$fastFloor$iv7 + 1.073741824E9) - 1073741824;
            }
            else {
                currentX += diffX * stepZ;
                currentY += diffY * stepZ;
                currentZ = nextZ;
                double $this$fastFloor$iv7 = currentX;
                int $i$f$fastFloor7 = 0;
                currentBlockX = (int)($this$fastFloor$iv7 + 1.073741824E9) - 1073741824;
                $this$fastFloor$iv7 = currentY;
                $i$f$fastFloor7 = 0;
                currentBlockY = (int)($this$fastFloor$iv7 + 1.073741824E9) - 1073741824;
                currentBlockZ = nextZ - (endBlockZ - currentBlockZ >>> 31);
            }
            mutableBlockPos.setPos(currentBlockX, currentBlockY, currentBlockZ);
            final IBlockState blockState = $this$fastRaytrace.getBlockState((BlockPos)mutableBlockPos);
            Intrinsics.checkNotNullExpressionValue((Object)blockState, "blockState");
            switch (WhenMappings.$EnumSwitchMapping$0[((FastRayTraceAction)function.invoke((Object)mutableBlockPos, (Object)blockState)).ordinal()]) {
                case 1: {
                    return false;
                }
                case 2: {
                    if (fastRaytrace(blockState, $this$fastRaytrace, mutableBlockPos, currentX, currentY, currentZ, endX, endY, endZ)) {
                        return true;
                    }
                    continue;
                }
                case 3: {
                    return true;
                }
                default: {
                    continue;
                }
            }
        }
    }
    
    private static final boolean fastRaytrace(final IBlockState $this$fastRaytrace, final World world, final BlockPos$MutableBlockPos blockPos, final double x1, final double y1, final double z1, final double x2, final double y2, final double z2) {
        final float x1f = (float)(x1 - blockPos.getX());
        final float y1f = (float)(y1 - blockPos.getY());
        final float z1f = (float)(z1 - blockPos.getZ());
        final AxisAlignedBB box = $this$fastRaytrace.getBoundingBox((IBlockAccess)world, (BlockPos)blockPos);
        final float minX = (float)box.minX;
        final float minY = (float)box.minY;
        final float minZ = (float)box.minZ;
        final float maxX = (float)box.maxX;
        final float maxY = (float)box.maxY;
        final float maxZ = (float)box.maxZ;
        final float xDiff = (float)(x2 - blockPos.getX()) - x1f;
        final float yDiff = (float)(y2 - blockPos.getY()) - y1f;
        final float zDiff = (float)(z2 - blockPos.getZ()) - z1f;
        if (xDiff * xDiff >= 1.0E-7f) {
            float factor = (minX - x1f) / xDiff;
            if (0.0f > factor || factor > 1.0f) {
                factor = (maxX - x1f) / xDiff;
            }
            if (0.0f <= factor && factor <= 1.0f) {
                final float n = y1f + yDiff * factor;
                if (minY <= n && n <= maxY) {
                    final float n2 = z1f + zDiff * factor;
                    if (minZ <= n2 && n2 <= maxZ) {
                        return true;
                    }
                }
            }
        }
        if (yDiff * yDiff >= 1.0E-7f) {
            float factor = (minY - y1f) / yDiff;
            if (0.0f > factor || factor > 1.0f) {
                factor = (maxY - y1f) / yDiff;
            }
            if (0.0f <= factor && factor <= 1.0f) {
                final float n3 = x1f + xDiff * factor;
                if (minX <= n3 && n3 <= maxX) {
                    final float n4 = z1f + zDiff * factor;
                    if (minZ <= n4 && n4 <= maxZ) {
                        return true;
                    }
                }
            }
        }
        if (zDiff * zDiff >= 1.0E-7) {
            float factor = (minZ - z1f) / zDiff;
            if (0.0f > factor || factor > 1.0f) {
                factor = (maxZ - z1f) / zDiff;
            }
            if (0.0f <= factor && factor <= 1.0f) {
                final float n5 = x1f + xDiff * factor;
                if (minX <= n5 && n5 <= maxX) {
                    final float n6 = y1f + yDiff * factor;
                    if (minY <= n6 && n6 <= maxY) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
