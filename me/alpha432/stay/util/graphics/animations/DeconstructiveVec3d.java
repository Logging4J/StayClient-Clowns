//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.animations;

import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\u0003H\u0086\u0002J\t\u0010\r\u001a\u00020\u0003H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0003H\u0086\u0002¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/DeconstructiveVec3d;", "Lnet/minecraft/util/math/Vec3d;", "xIn", "", "yIn", "zIn", "(DDD)V", "vector", "Lnet/minecraft/util/math/Vec3i;", "(Lnet/minecraft/util/math/Vec3i;)V", "vec3d", "(Lnet/minecraft/util/math/Vec3d;)V", "component1", "component2", "component3", "Stay" })
public final class DeconstructiveVec3d extends Vec3d
{
    public DeconstructiveVec3d(final double xIn, final double yIn, final double zIn) {
        super(xIn, yIn, zIn);
    }
    
    public DeconstructiveVec3d(@NotNull final Vec3i vector) {
        Intrinsics.checkNotNullParameter((Object)vector, "vector");
        super(vector);
    }
    
    public DeconstructiveVec3d(@NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        super(vec3d.x, vec3d.y, vec3d.z);
    }
    
    public final double component1() {
        return this.x;
    }
    
    public final double component2() {
        return this.y;
    }
    
    public final double component3() {
        return this.z;
    }
}
