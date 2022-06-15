//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import kotlin.jvm.*;
import net.minecraft.entity.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eB\u000f\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u001e\u0010&\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003J\u001e\u0010&\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0015J\u000e\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0000J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0000J\u000e\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0000J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003J\u001e\u00100\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003J\u001e\u00100\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0015J\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u000203R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"¨\u00065" }, d2 = { "Lme/alpha432/stay/util/math/Location;", "", "x", "", "y", "z", "yaw", "", "pitch", "(DDDFF)V", "ground", "", "moving", "(DDDZZ)V", "(DDD)V", "pos", "Lnet/minecraft/util/math/BlockPos;", "(Lnet/minecraft/util/math/BlockPos;)V", "entity", "Lnet/minecraft/entity/EntityLivingBase;", "(Lnet/minecraft/entity/EntityLivingBase;)V", "", "(III)V", "block", "Lnet/minecraft/block/Block;", "getBlock", "()Lnet/minecraft/block/Block;", "<set-?>", "isOnGround", "()Z", "oldY", "getPitch", "()F", "getX", "()D", "getY", "getYaw", "getZ", "add", "distanceTo", "loc", "distanceToXZ", "distanceToY", "setPitch", "setX", "setY", "setYaw", "setZ", "subtract", "toBlockPos", "toVector", "Lnet/minecraft/util/math/Vec3d;", "Companion", "Stay" })
public final class Location
{
    @NotNull
    public static final Companion Companion;
    private double x;
    private double y;
    private double z;
    private float yaw;
    private float pitch;
    private double oldY;
    private boolean isOnGround;
    private static final Minecraft mc;
    @JvmField
    public static boolean isMoving;
    
    public final double getX() {
        return this.x;
    }
    
    public final double getY() {
        return this.y;
    }
    
    public final double getZ() {
        return this.z;
    }
    
    public final float getYaw() {
        return this.yaw;
    }
    
    public final float getPitch() {
        return this.pitch;
    }
    
    public Location(final double x, final double y, final double z, final float yaw, final float pitch) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
    }
    
    public Location(final double x, final double y, final double z, final boolean ground, final boolean moving) {
        this.x = x;
        this.y = y;
        this.oldY = y;
        this.z = z;
        this.isOnGround = ground;
        final Companion companion = Location.Companion;
        Location.isMoving = moving;
    }
    
    public final boolean isOnGround() {
        return this.isOnGround;
    }
    
    public Location(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = 0.0f;
        this.isOnGround = true;
        this.pitch = 0.0f;
    }
    
    public Location(@NotNull final BlockPos pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        this.x = pos.getX();
        this.y = pos.getY();
        this.z = pos.getZ();
        this.yaw = 0.0f;
        this.pitch = 0.0f;
    }
    
    public Location(@NotNull final EntityLivingBase entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        this.x = entity.posX;
        this.y = entity.posY;
        this.z = entity.posZ;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
    }
    
    public Location(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
    }
    
    @NotNull
    public final Location add(final int x, final int y, final int z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }
    
    @NotNull
    public final Location add(final double x, final double y, final double z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }
    
    @NotNull
    public final Location subtract(final int x, final int y, final int z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        return this;
    }
    
    @NotNull
    public final Location subtract(final double x, final double y, final double z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        return this;
    }
    
    @NotNull
    public final Block getBlock() {
        final Block getBlock = Location.mc.world.getBlockState(this.toBlockPos()).getBlock();
        Intrinsics.checkNotNullExpressionValue((Object)getBlock, "mc.world.getBlockState(toBlockPos()).block");
        return getBlock;
    }
    
    @NotNull
    public final Location setX(final double x) {
        this.x = x;
        return this;
    }
    
    @NotNull
    public final Location setY(final double y) {
        this.y = y;
        return this;
    }
    
    @NotNull
    public final Location setZ(final double z) {
        this.z = z;
        return this;
    }
    
    @NotNull
    public final Location setYaw(final float yaw) {
        this.yaw = yaw;
        return this;
    }
    
    @NotNull
    public final Location setPitch(final float pitch) {
        this.pitch = pitch;
        return this;
    }
    
    @NotNull
    public final BlockPos toBlockPos() {
        return new BlockPos(this.x, this.y, this.z);
    }
    
    public final double distanceTo(@NotNull final Location loc) {
        Intrinsics.checkNotNullParameter((Object)loc, "loc");
        final double dx = loc.x - this.x;
        final double dz = loc.z - this.z;
        final double dy = loc.y - this.y;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    
    public final double distanceToXZ(@NotNull final Location loc) {
        Intrinsics.checkNotNullParameter((Object)loc, "loc");
        final double dx = loc.x - this.x;
        final double dz = loc.z - this.z;
        return Math.sqrt(dx * dx + dz * dz);
    }
    
    public final double distanceToY(@NotNull final Location loc) {
        Intrinsics.checkNotNullParameter((Object)loc, "loc");
        final double dy = loc.y - this.y;
        return Math.sqrt(dy * dy);
    }
    
    @NotNull
    public final Vec3d toVector() {
        return new Vec3d(this.x, this.y, this.z);
    }
    
    public static final /* synthetic */ Minecraft access$getMc$cp() {
        return Location.mc;
    }
    
    static {
        Companion = new Companion(null);
        mc = Minecraft.getMinecraft();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lme/alpha432/stay/util/math/Location$Companion;", "", "()V", "isMoving", "", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "getMc", "()Lnet/minecraft/client/Minecraft;", "fromBlockPos", "Lme/alpha432/stay/util/math/Location;", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        protected final Minecraft getMc() {
            return Location.access$getMc$cp();
        }
        
        @NotNull
        public final Location fromBlockPos(@NotNull final BlockPos blockPos) {
            Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
            return new Location(blockPos.getX(), blockPos.getY(), blockPos.getZ());
        }
    }
}
