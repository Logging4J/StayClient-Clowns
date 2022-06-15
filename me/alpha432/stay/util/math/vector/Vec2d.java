//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math.vector;

import kotlin.*;
import kotlin.jvm.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0002\u0010\nB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0010\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u000bH\u00c6\u0001J\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000bH\u0086\u0002J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bJ\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u000bJ\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0086\u0002J\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bJ\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000bH\u0086\u0002J\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bJ\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH\u0086\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bJ\u0011\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\"\u001a\u00020\u0000J\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\u0002\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006&" }, d2 = { "Lme/alpha432/stay/util/math/vector/Vec2d;", "", "x", "", "y", "(FF)V", "vec3d", "Lnet/minecraft/util/math/Vec3d;", "(Lnet/minecraft/util/math/Vec3d;)V", "vec2d", "(Lme/alpha432/stay/util/math/vector/Vec2d;)V", "", "(DD)V", "getX", "()D", "getY", "component1", "component2", "copy", "div", "divider", "equals", "", "other", "hashCode", "", "length", "lengthSquared", "minus", "sub", "plus", "add", "times", "multiplier", "toRadians", "toString", "", "Companion", "Stay" })
public final class Vec2d
{
    @NotNull
    public static final Companion Companion;
    private final double x;
    private final double y;
    @JvmField
    @NotNull
    public static final Vec2d ZERO;
    
    public Vec2d(final double x, final double y) {
        this.x = x;
        this.y = y;
    }
    
    public final double getX() {
        return this.x;
    }
    
    public final double getY() {
        return this.y;
    }
    
    public Vec2d(final float x, final float y) {
        this(x, (double)y);
    }
    
    public Vec2d(@NotNull final Vec3d vec3d) {
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        this(vec3d.x, vec3d.y);
    }
    
    public Vec2d(@NotNull final Vec2d vec2d) {
        Intrinsics.checkNotNullParameter((Object)vec2d, "vec2d");
        this(vec2d.x, vec2d.y);
    }
    
    @NotNull
    public final Vec2d toRadians() {
        double $this$toRadian$iv = this.x;
        int $i$f$toRadian = 0;
        final double x = $this$toRadian$iv / 180.0 * 3.141592653589793;
        $this$toRadian$iv = this.y;
        $i$f$toRadian = 0;
        return new Vec2d(x, $this$toRadian$iv / 180.0 * 3.141592653589793);
    }
    
    public final double length() {
        return Math.hypot(this.x, this.y);
    }
    
    public final double lengthSquared() {
        return Math.pow(this.x, 2) + Math.pow(this.y, 2);
    }
    
    @NotNull
    public final Vec2d div(@NotNull final Vec2d vec2d) {
        Intrinsics.checkNotNullParameter((Object)vec2d, "vec2d");
        return this.div(vec2d.x, vec2d.y);
    }
    
    @NotNull
    public final Vec2d div(final double divider) {
        return this.div(divider, divider);
    }
    
    @NotNull
    public final Vec2d div(final double x, final double y) {
        return new Vec2d(this.x / x, this.y / y);
    }
    
    @NotNull
    public final Vec2d times(@NotNull final Vec2d vec2d) {
        Intrinsics.checkNotNullParameter((Object)vec2d, "vec2d");
        return this.times(vec2d.x, vec2d.y);
    }
    
    @NotNull
    public final Vec2d times(final double multiplier) {
        return this.times(multiplier, multiplier);
    }
    
    @NotNull
    public final Vec2d times(final double x, final double y) {
        return new Vec2d(this.x * x, this.y * y);
    }
    
    @NotNull
    public final Vec2d minus(@NotNull final Vec2d vec2d) {
        Intrinsics.checkNotNullParameter((Object)vec2d, "vec2d");
        return this.minus(vec2d.x, vec2d.y);
    }
    
    @NotNull
    public final Vec2d minus(final double sub) {
        return this.minus(sub, sub);
    }
    
    @NotNull
    public final Vec2d minus(final double x, final double y) {
        return this.plus(-x, -y);
    }
    
    @NotNull
    public final Vec2d plus(@NotNull final Vec2d vec2d) {
        Intrinsics.checkNotNullParameter((Object)vec2d, "vec2d");
        return this.plus(vec2d.x, vec2d.y);
    }
    
    @NotNull
    public final Vec2d plus(final double add) {
        return this.plus(add, add);
    }
    
    @NotNull
    public final Vec2d plus(final double x, final double y) {
        return new Vec2d(this.x + x, this.y + y);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Vec2d[" + this.x + ", " + this.y + ']';
    }
    
    public final double component1() {
        return this.x;
    }
    
    public final double component2() {
        return this.y;
    }
    
    @NotNull
    public final Vec2d copy(final double x, final double y) {
        return new Vec2d(x, y);
    }
    
    @Override
    public int hashCode() {
        int result = Double.hashCode(this.x);
        result = result * 31 + Double.hashCode(this.y);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vec2d)) {
            return false;
        }
        final Vec2d vec2d = (Vec2d)other;
        return Intrinsics.areEqual((Object)this.x, (Object)vec2d.x) && Intrinsics.areEqual((Object)this.y, (Object)vec2d.y);
    }
    
    public Vec2d() {
        this(0.0, 0.0, 3, null);
    }
    
    static {
        Companion = new Companion(null);
        ZERO = new Vec2d(0.0, 0.0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/util/math/vector/Vec2d$Companion;", "", "()V", "ZERO", "Lme/alpha432/stay/util/math/vector/Vec2d;", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
    }
}
