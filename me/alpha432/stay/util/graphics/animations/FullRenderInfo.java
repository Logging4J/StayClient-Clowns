//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.animations;

import kotlin.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/FullRenderInfo;", "", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "vec3d", "Lnet/minecraft/util/math/Vec3d;", "(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/util/math/Vec3d;)V", "getBb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getVec3d", "()Lnet/minecraft/util/math/Vec3d;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Stay" })
public final class FullRenderInfo
{
    @NotNull
    private final AxisAlignedBB bb;
    @NotNull
    private final Vec3d vec3d;
    
    public FullRenderInfo(@NotNull final AxisAlignedBB bb, @NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        this.bb = bb;
        this.vec3d = vec3d;
    }
    
    @NotNull
    public final AxisAlignedBB getBb() {
        return this.bb;
    }
    
    @NotNull
    public final Vec3d getVec3d() {
        return this.vec3d;
    }
    
    @NotNull
    public final AxisAlignedBB component1() {
        return this.bb;
    }
    
    @NotNull
    public final Vec3d component2() {
        return this.vec3d;
    }
    
    @NotNull
    public final FullRenderInfo copy(@NotNull final AxisAlignedBB bb, @NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        return new FullRenderInfo(bb, vec3d);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "FullRenderInfo(bb=" + this.bb + ", vec3d=" + this.vec3d + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.bb.hashCode();
        result = result * 31 + this.vec3d.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullRenderInfo)) {
            return false;
        }
        final FullRenderInfo fullRenderInfo = (FullRenderInfo)other;
        return Intrinsics.areEqual((Object)this.bb, (Object)fullRenderInfo.bb) && Intrinsics.areEqual((Object)this.vec3d, (Object)fullRenderInfo.vec3d);
    }
}
