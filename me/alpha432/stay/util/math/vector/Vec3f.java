//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math.vector;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017" }, d2 = { "Lme/alpha432/stay/util/math/vector/Vec3f;", "", "x", "", "y", "z", "(FFF)V", "getX", "()F", "getY", "getZ", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Stay" })
public final class Vec3f
{
    @NotNull
    public static final Companion Companion;
    private final float x;
    private final float y;
    private final float z;
    @JvmField
    @NotNull
    public static final Vec3f ZERO;
    
    public Vec3f(final float x, final float y, final float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public final float getX() {
        return this.x;
    }
    
    public final float getY() {
        return this.y;
    }
    
    public final float getZ() {
        return this.z;
    }
    
    public final float component1() {
        return this.x;
    }
    
    public final float component2() {
        return this.y;
    }
    
    public final float component3() {
        return this.z;
    }
    
    @NotNull
    public final Vec3f copy(final float x, final float y, final float z) {
        return new Vec3f(x, y, z);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Vec3f(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.x);
        result = result * 31 + Float.hashCode(this.y);
        result = result * 31 + Float.hashCode(this.z);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vec3f)) {
            return false;
        }
        final Vec3f vec3f = (Vec3f)other;
        return Intrinsics.areEqual((Object)this.x, (Object)vec3f.x) && Intrinsics.areEqual((Object)this.y, (Object)vec3f.y) && Intrinsics.areEqual((Object)this.z, (Object)vec3f.z);
    }
    
    static {
        Companion = new Companion(null);
        ZERO = new Vec3f(0.0f, 0.0f, 0.0f);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/util/math/vector/Vec3f$Companion;", "", "()V", "ZERO", "Lme/alpha432/stay/util/math/vector/Vec3f;", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
    }
}
