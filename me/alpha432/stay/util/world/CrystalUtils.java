//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.item.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import java.util.function.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u001e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J6\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fJ&\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\bJ\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\bJ\u0012\u0010$\u001a\u00020\u0017*\u00020%2\u0006\u0010\u0013\u001a\u00020\bR2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00020\b*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006&" }, d2 = { "Lme/alpha432/stay/util/world/CrystalUtils;", "", "()V", "mutableBlockPos", "Ljava/lang/ThreadLocal;", "Lnet/minecraft/util/math/BlockPos$MutableBlockPos;", "kotlin.jvm.PlatformType", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "Lnet/minecraft/entity/item/EntityEnderCrystal;", "getBlockPos", "(Lnet/minecraft/entity/item/EntityEnderCrystal;)Lnet/minecraft/util/math/BlockPos;", "getCrystalBB", "Lnet/minecraft/util/math/AxisAlignedBB;", "x", "", "y", "z", "", "pos", "Lnet/minecraft/util/math/Vec3d;", "getCrystalPlacingBB", "isResistant", "", "blockState", "Lnet/minecraft/block/state/IBlockState;", "isValidMaterial", "placeBoxIntersectsCrystalBox", "placeX", "placeY", "placeZ", "crystalX", "crystalY", "crystalZ", "crystalPos", "placePos", "canPlaceCrystalOn", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "Stay" })
public final class CrystalUtils
{
    @NotNull
    public static final CrystalUtils INSTANCE;
    private static final ThreadLocal<BlockPos$MutableBlockPos> mutableBlockPos;
    
    private CrystalUtils() {
    }
    
    @NotNull
    public final BlockPos getBlockPos(@NotNull final EntityEnderCrystal $this$blockPos) {
        Intrinsics.checkNotNullParameter((Object)$this$blockPos, "<this>");
        double $this$fastFloor$iv = $this$blockPos.posX;
        int $i$f$fastFloor = 0;
        final int n = (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824;
        $this$fastFloor$iv = $this$blockPos.posY;
        $i$f$fastFloor = 0;
        final int n2 = (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824 - 1;
        $this$fastFloor$iv = $this$blockPos.posZ;
        $i$f$fastFloor = 0;
        return new BlockPos(n, n2, (int)($this$fastFloor$iv + 1.073741824E9) - 1073741824);
    }
    
    public final boolean canPlaceCrystalOn(@NotNull final SafeClientEvent $this$canPlaceCrystalOn, @NotNull final BlockPos pos) {
        Intrinsics.checkNotNullParameter((Object)$this$canPlaceCrystalOn, "<this>");
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        final Block block = $this$canPlaceCrystalOn.getWorld().getBlockState(pos).getBlock();
        return Intrinsics.areEqual((Object)block, (Object)Blocks.BEDROCK) || Intrinsics.areEqual((Object)block, (Object)Blocks.OBSIDIAN);
    }
    
    public final boolean isValidMaterial(@NotNull final IBlockState blockState) {
        Intrinsics.checkNotNullParameter((Object)blockState, "blockState");
        final IBlockState $this$isLiquid$iv = blockState;
        final int $i$f$isLiquid = 0;
        if (!$this$isLiquid$iv.getMaterial().isLiquid()) {
            final IBlockState $this$isReplaceable$iv = blockState;
            final int $i$f$isReplaceable = 0;
            if ($this$isReplaceable$iv.getMaterial().isReplaceable()) {
                return true;
            }
        }
        return false;
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalPlacingBB(@NotNull final BlockPos pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        return this.getCrystalPlacingBB(pos.getX(), pos.getY(), pos.getZ());
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalPlacingBB(final int x, final int y, final int z) {
        return new AxisAlignedBB(x + 0.001, y + 1.0, z + 0.001, x + 0.999, y + 3.0, z + 0.999);
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalPlacingBB(@NotNull final Vec3d pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        return this.getCrystalPlacingBB(pos.x, pos.y, pos.z);
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalPlacingBB(final double x, final double y, final double z) {
        return new AxisAlignedBB(x - 0.499, y, z - 0.499, x + 0.499, y + 2.0, z + 0.499);
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalBB(@NotNull final BlockPos pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        return this.getCrystalBB(pos.getX(), pos.getY(), pos.getZ());
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalBB(final int x, final int y, final int z) {
        return new AxisAlignedBB(x - 0.5, y + 1.0, z - 0.5, x + 1.5, y + 3.0, z + 1.5);
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalBB(@NotNull final Vec3d pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        return this.getCrystalBB(pos.x, pos.y, pos.z);
    }
    
    @NotNull
    public final AxisAlignedBB getCrystalBB(final double x, final double y, final double z) {
        return new AxisAlignedBB(x - 1.0, y, z - 1.0, x + 1.0, y + 2.0, z + 1.0);
    }
    
    public final boolean placeBoxIntersectsCrystalBox(@NotNull final BlockPos placePos, @NotNull final BlockPos crystalPos) {
        Intrinsics.checkNotNullParameter((Object)placePos, "placePos");
        Intrinsics.checkNotNullParameter((Object)crystalPos, "crystalPos");
        final int n = crystalPos.getY() - placePos.getY();
        return 0 <= n && n < 3 && Math.abs(crystalPos.getX() - placePos.getX()) < 2 && Math.abs(crystalPos.getZ() - placePos.getZ()) < 2;
    }
    
    public final boolean placeBoxIntersectsCrystalBox(@NotNull final Vec3d placePos, @NotNull final BlockPos crystalPos) {
        Intrinsics.checkNotNullParameter((Object)placePos, "placePos");
        Intrinsics.checkNotNullParameter((Object)crystalPos, "crystalPos");
        final double n = crystalPos.getY() - placePos.y;
        return 0.0 <= n && n <= 2.0 && Math.abs(crystalPos.getX() - placePos.x) < 2.0 && Math.abs(crystalPos.getZ() - placePos.z) < 2.0;
    }
    
    public final boolean placeBoxIntersectsCrystalBox(final double placeX, final double placeY, final double placeZ, @NotNull final BlockPos crystalPos) {
        Intrinsics.checkNotNullParameter((Object)crystalPos, "crystalPos");
        final double n = crystalPos.getY() - placeY;
        return 0.0 <= n && n <= 2.0 && Math.abs(crystalPos.getX() - placeX) < 2.0 && Math.abs(crystalPos.getZ() - placeZ) < 2.0;
    }
    
    public final boolean placeBoxIntersectsCrystalBox(final double placeX, final double placeY, final double placeZ, final double crystalX, final double crystalY, final double crystalZ) {
        final double n = crystalY - placeY;
        return 0.0 <= n && n <= 2.0 && Math.abs(crystalX - placeX) < 2.0 && Math.abs(crystalZ - placeZ) < 2.0;
    }
    
    public final boolean isResistant(@NotNull final IBlockState blockState) {
        Intrinsics.checkNotNullParameter((Object)blockState, "blockState");
        final IBlockState $this$isLiquid$iv = blockState;
        final int $i$f$isLiquid = 0;
        return !$this$isLiquid$iv.getMaterial().isLiquid() && blockState.getBlock().getExplosionResistance((Entity)null) >= 19.7;
    }
    
    private static final BlockPos$MutableBlockPos mutableBlockPos$lambda-0() {
        return new BlockPos$MutableBlockPos();
    }
    
    static {
        INSTANCE = new CrystalUtils();
        mutableBlockPos = ThreadLocal.withInitial((Supplier<? extends BlockPos$MutableBlockPos>)CrystalUtils::mutableBlockPos$lambda-0);
    }
}
