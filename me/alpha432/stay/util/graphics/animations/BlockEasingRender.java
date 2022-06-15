//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.animations;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.world.*;
import net.minecraft.client.multiplayer.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020\u0016J\u0006\u00105\u001a\u00020\u001eJ\u0006\u00106\u001a\u000200J\u000e\u00107\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00168BX\u0082\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u00020&*\u00020&8BX\u0082\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020\u0016*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00068" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/BlockEasingRender;", "Lme/alpha432/stay/util/basement/wrapper/Util;", "pos", "Lnet/minecraft/util/math/BlockPos;", "movingLength", "", "fadingLength", "(Lnet/minecraft/util/math/BlockPos;FF)V", "moveType", "Lme/alpha432/stay/util/graphics/animations/Easing;", "fadingType", "(Lnet/minecraft/util/math/BlockPos;FFLme/alpha432/stay/util/graphics/animations/Easing;Lme/alpha432/stay/util/graphics/animations/Easing;)V", "animationSize", "Lme/alpha432/stay/util/graphics/animations/AnimationFlag;", "animationX", "animationY", "animationZ", "<set-?>", "", "isEnded", "()Z", "lastBB", "Lnet/minecraft/util/math/AxisAlignedBB;", "getLastBB", "()Lnet/minecraft/util/math/AxisAlignedBB;", "lastPos", "newBB", "getNewBB", "newPos", "offset", "Lnet/minecraft/util/math/Vec3d;", "getOffset", "()Lnet/minecraft/util/math/Vec3d;", "offsetBB", "getOffsetBB$annotations", "()V", "getOffsetBB", "size", "", "abs", "getAbs$annotations", "(D)V", "getAbs", "(D)D", "bb", "getBb", "(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;", "begin", "", "end", "getBBAndVec3dUpdate", "Lme/alpha432/stay/util/graphics/animations/FullRenderInfo;", "getFullUpdate", "getUpdate", "reset", "updatePos", "Stay" })
public final class BlockEasingRender implements Util
{
    @NotNull
    private BlockPos lastPos;
    @NotNull
    private BlockPos newPos;
    @NotNull
    private final AnimationFlag animationX;
    @NotNull
    private final AnimationFlag animationY;
    @NotNull
    private final AnimationFlag animationZ;
    @NotNull
    private final AnimationFlag animationSize;
    private boolean isEnded;
    private double size;
    
    public BlockEasingRender(@NotNull final BlockPos pos, final float movingLength, final float fadingLength, @NotNull final Easing moveType, @NotNull final Easing fadingType) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        Intrinsics.checkNotNullParameter((Object)moveType, "moveType");
        Intrinsics.checkNotNullParameter((Object)fadingType, "fadingType");
        this.size = 0.5;
        this.lastPos = pos;
        this.newPos = pos;
        this.isEnded = true;
        this.animationX = new AnimationFlag(moveType, movingLength);
        this.animationY = new AnimationFlag(moveType, movingLength);
        this.animationZ = new AnimationFlag(moveType, movingLength);
        this.animationSize = new AnimationFlag(fadingType, fadingLength);
    }
    
    private final Vec3d getOffset() {
        return new Vec3d((double)(this.newPos.getX() - this.lastPos.getX()), (double)(this.newPos.getY() - this.lastPos.getY()), (double)(this.newPos.getZ() - this.lastPos.getZ()));
    }
    
    private final AxisAlignedBB getLastBB() {
        return this.getBb(this.lastPos);
    }
    
    private final AxisAlignedBB getNewBB() {
        return this.getBb(this.newPos);
    }
    
    private final AxisAlignedBB getOffsetBB() {
        return new AxisAlignedBB(this.getLastBB().minX - this.getNewBB().minX, this.getLastBB().minY - this.getNewBB().minY, this.getLastBB().minZ - this.getNewBB().minZ, this.getLastBB().maxX - this.getNewBB().maxX, this.getLastBB().maxY - this.getNewBB().maxY, this.getLastBB().maxZ - this.getNewBB().maxZ);
    }
    
    public final boolean isEnded() {
        return this.isEnded;
    }
    
    private final double getAbs(final double $this$abs) {
        return Math.abs($this$abs);
    }
    
    private final AxisAlignedBB getBb(final BlockPos $this$bb) {
        final WorldClient world2 = MinecraftWrapper.getWorld();
        Intrinsics.checkNotNull((Object)world2);
        final WorldClient world = world2;
        final AxisAlignedBB getSelectedBoundingBox = world.getBlockState($this$bb).getSelectedBoundingBox((World)world, $this$bb);
        Intrinsics.checkNotNullExpressionValue((Object)getSelectedBoundingBox, "world.getBlockState(this\u2026dBoundingBox(world, this)");
        return getSelectedBoundingBox;
    }
    
    public BlockEasingRender(@NotNull final BlockPos pos, final float movingLength, final float fadingLength) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        this(pos, movingLength, fadingLength, Easing.OUT_QUINT, Easing.OUT_QUINT);
    }
    
    public final void updatePos(@NotNull final BlockPos pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        this.lastPos = this.newPos;
        this.newPos = pos;
    }
    
    @NotNull
    public final FullRenderInfo getBBAndVec3dUpdate() {
        final Vec3d vec3d = this.getUpdate();
        final DeconstructiveVec3d deconstructiveVec3d = new DeconstructiveVec3d(vec3d);
        final double x = deconstructiveVec3d.component1();
        final double y = deconstructiveVec3d.component2();
        final double z = deconstructiveVec3d.component3();
        this.size = this.animationSize.getAndUpdate(this.isEnded ? 0.0f : 50.0f);
        final AxisAlignedBB axisAlignedBB = new AxisAlignedBB(x, y, z, x + 1, y + 1, z + 1);
        final double centerX = axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) / 2;
        final double centerY = axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) / 2;
        final double centerZ = axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) / 2;
        return new FullRenderInfo(new AxisAlignedBB(centerX + this.size / 100, centerY + this.size / 100, centerZ + this.size / 100, centerX - this.size / 100, centerY - this.size / 100, centerZ - this.size / 100), vec3d);
    }
    
    @NotNull
    public final AxisAlignedBB getFullUpdate() {
        final DeconstructiveVec3d deconstructiveVec3d = new DeconstructiveVec3d(this.getUpdate());
        final double x = deconstructiveVec3d.component1();
        final double y = deconstructiveVec3d.component2();
        final double z = deconstructiveVec3d.component3();
        this.size = this.animationSize.getAndUpdate(this.isEnded ? 0.0f : 50.0f);
        final AxisAlignedBB axisAlignedBB = new AxisAlignedBB(x, y, z, x + 1, y + 1, z + 1);
        final double centerX = axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) / 2;
        final double centerY = axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) / 2;
        final double centerZ = axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) / 2;
        return new AxisAlignedBB(centerX + this.size / 100, centerY + this.size / 100, centerZ + this.size / 100, centerX - this.size / 100, centerY - this.size / 100, centerZ - this.size / 100);
    }
    
    @NotNull
    public final Vec3d getUpdate() {
        return new Vec3d((double)this.animationX.getAndUpdate((float)this.getOffset().x + this.lastPos.getX()), (double)this.animationY.getAndUpdate((float)this.getOffset().y + this.lastPos.getY()), (double)this.animationZ.getAndUpdate((float)this.getOffset().z + this.lastPos.getZ()));
    }
    
    public final void reset() {
        this.animationX.forceUpdate(0.0f, 0.0f);
        this.animationY.forceUpdate(0.0f, 0.0f);
        this.animationZ.forceUpdate(0.0f, 0.0f);
        this.animationSize.forceUpdate(0.0f, 0.0f);
        this.isEnded = false;
        this.size = 0.0;
        this.newPos = new BlockPos(0, 0, 0);
        this.lastPos = this.newPos;
    }
    
    public final void end() {
        this.isEnded = true;
    }
    
    public final void begin() {
        this.isEnded = false;
    }
}
