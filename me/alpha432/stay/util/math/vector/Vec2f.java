//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math.vector;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;

@JvmInline
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 H2\u00020\u0001:\u0001HB\u001c\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tB\u001c\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u000bB\u0014\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u000eB\u0014\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0015J!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010\u001b\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0002¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020*H\u00d6\u0001¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010\u0015J\r\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u0010\u0015J!\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b3\u0010\u001eJ&\u00101\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b4\u0010 J\u001e\u00101\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0002¢\u0006\u0004\b5\u0010#J!\u00106\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b7\u0010\u001eJ&\u00106\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b8\u0010 J\u001e\u00106\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0002¢\u0006\u0004\b9\u0010#J!\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b<\u0010\u001eJ&\u0010:\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b=\u0010 J\u001e\u0010:\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0002¢\u0006\u0004\b>\u0010#J\u0016\u0010?\u001a\u00020\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b@\u0010\u0011J\u0010\u0010A\u001a\u00020BH\u00d6\u0001¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\r¢\u0006\u0004\bF\u0010GR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015\u0088\u0001\u000f\u00f8\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006I" }, d2 = { "Lme/alpha432/stay/util/math/vector/Vec2f;", "", "x", "", "y", "constructor-impl", "(FF)J", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)J", "", "(DD)J", "vec2d", "Lme/alpha432/stay/util/math/vector/Vec2d;", "(Lme/alpha432/stay/util/math/vector/Vec2d;)J", "bits", "", "(J)J", "getBits", "()J", "getX-impl", "(J)F", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "div", "divider", "div-b_4jExY", "(JF)J", "div-qpTSrKg", "(JFF)J", "vec2f", "div-sCD7nS8", "(JJ)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "length", "length-impl", "lengthSquared", "lengthSquared-impl", "minus", "value", "minus-b_4jExY", "minus-qpTSrKg", "minus-sCD7nS8", "plus", "plus-b_4jExY", "plus-qpTSrKg", "plus-sCD7nS8", "times", "multiplier", "times-b_4jExY", "times-qpTSrKg", "times-sCD7nS8", "toRadians", "toRadians-meiVFKc", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toVec2d", "toVec2d-impl", "(J)Lme/alpha432/stay/util/math/vector/Vec2d;", "Companion", "Stay" })
public final class Vec2f
{
    @NotNull
    public static final Companion Companion;
    private final long bits = bits;
    private static final long ZERO;
    
    public final long getBits() {
        return this.bits;
    }
    
    public static long constructor-impl(final float x, final float y) {
        return constructor-impl((long)Float.floatToRawIntBits(x) << 32 | ((long)Float.floatToRawIntBits(y) & 0xFFFFFFFFL));
    }
    
    public static long constructor-impl(@NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return constructor-impl(entity.rotationYaw, entity.rotationPitch);
    }
    
    public static long constructor-impl(final double x, final double y) {
        return constructor-impl((float)x, (float)y);
    }
    
    public static long constructor-impl(@NotNull final Vec2d vec2d) {
        Intrinsics.checkNotNullParameter((Object)vec2d, "vec2d");
        return constructor-impl((float)vec2d.getX(), (float)vec2d.getY());
    }
    
    public static final float getX-impl(final long arg0) {
        return Vec2f.Companion.getX(arg0);
    }
    
    public static final float getY-impl(final long arg0) {
        return Vec2f.Companion.getY(arg0);
    }
    
    public static final long toRadians-meiVFKc(final long arg0) {
        float $this$toRadian$iv = getX-impl(arg0);
        int $i$f$toRadian = 0;
        final float x = $this$toRadian$iv / 180.0f * 3.1415927f;
        $this$toRadian$iv = getY-impl(arg0);
        $i$f$toRadian = 0;
        return constructor-impl(x, $this$toRadian$iv / 180.0f * 3.1415927f);
    }
    
    public static final float length-impl(final long arg0) {
        return (float)Math.hypot(getX-impl(arg0), getY-impl(arg0));
    }
    
    public static final float lengthSquared-impl(final long arg0) {
        return (float)Math.pow(getX-impl(arg0), 2) + (float)Math.pow(getY-impl(arg0), 2);
    }
    
    public static final long div-sCD7nS8(final long arg0, final long vec2f) {
        return div-qpTSrKg(arg0, getX-impl(vec2f), getY-impl(vec2f));
    }
    
    public static final long div-b_4jExY(final long arg0, final float divider) {
        return div-qpTSrKg(arg0, divider, divider);
    }
    
    public static final long div-qpTSrKg(final long arg0, final float x, final float y) {
        return constructor-impl(getX-impl(arg0) / x, getY-impl(arg0) / y);
    }
    
    public static final long times-sCD7nS8(final long arg0, final long vec2f) {
        return times-qpTSrKg(arg0, getX-impl(vec2f), getY-impl(vec2f));
    }
    
    public static final long times-b_4jExY(final long arg0, final float multiplier) {
        return times-qpTSrKg(arg0, multiplier, multiplier);
    }
    
    public static final long times-qpTSrKg(final long arg0, final float x, final float y) {
        return constructor-impl(getX-impl(arg0) * x, getY-impl(arg0) * y);
    }
    
    public static final long minus-sCD7nS8(final long arg0, final long vec2f) {
        return minus-qpTSrKg(arg0, getX-impl(vec2f), getY-impl(vec2f));
    }
    
    public static final long minus-b_4jExY(final long arg0, final float value) {
        return minus-qpTSrKg(arg0, value, value);
    }
    
    public static final long minus-qpTSrKg(final long arg0, final float x, final float y) {
        return plus-qpTSrKg(arg0, -x, -y);
    }
    
    public static final long plus-sCD7nS8(final long arg0, final long vec2f) {
        return plus-qpTSrKg(arg0, getX-impl(vec2f), getY-impl(vec2f));
    }
    
    public static final long plus-b_4jExY(final long arg0, final float value) {
        return plus-qpTSrKg(arg0, value, value);
    }
    
    public static final long plus-qpTSrKg(final long arg0, final float x, final float y) {
        return constructor-impl(getX-impl(arg0) + x, getY-impl(arg0) + y);
    }
    
    @NotNull
    public static final Vec2d toVec2d-impl(final long arg0) {
        return new Vec2d((double)getX-impl(arg0), (double)getY-impl(arg0));
    }
    
    public static final float component1-impl(final long arg0) {
        return getX-impl(arg0);
    }
    
    public static final float component2-impl(final long arg0) {
        return getY-impl(arg0);
    }
    
    public static String toString-impl(final long arg0) {
        return "Vec2f(bits=" + arg0 + ')';
    }
    
    @Override
    public String toString() {
        return toString-impl(this.bits);
    }
    
    public static int hashCode-impl(final long arg0) {
        return Long.hashCode(arg0);
    }
    
    @Override
    public int hashCode() {
        return hashCode-impl(this.bits);
    }
    
    public static boolean equals-impl(final long arg0, final Object other) {
        return other instanceof Vec2f && arg0 == ((Vec2f)other).unbox-impl();
    }
    
    @Override
    public boolean equals(final Object other) {
        return equals-impl(this.bits, other);
    }
    
    private static long constructor-impl(final long bits) {
        return bits;
    }
    
    public final /* synthetic */ long unbox-impl() {
        return this.bits;
    }
    
    public static final boolean equals-impl0(final long p1, final long p2) {
        return p1 == p2;
    }
    
    @JvmStatic
    public static final float getX(final long bits) {
        return Vec2f.Companion.getX(bits);
    }
    
    @JvmStatic
    public static final float getY(final long bits) {
        return Vec2f.Companion.getY(bits);
    }
    
    public static final /* synthetic */ long access$getZERO$cp() {
        return Vec2f.ZERO;
    }
    
    static {
        Companion = new Companion(null);
        ZERO = constructor-impl(0.0f, 0.0f);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r" }, d2 = { "Lme/alpha432/stay/util/math/vector/Vec2f$Companion;", "", "()V", "ZERO", "Lme/alpha432/stay/util/math/vector/Vec2f;", "getZERO-meiVFKc", "()J", "J", "getX", "", "bits", "", "getY", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final long getZERO-meiVFKc() {
            return Vec2f.access$getZERO$cp();
        }
        
        @JvmStatic
        public final float getX(final long bits) {
            final FloatCompanionObject instance = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int)(bits >> 32));
        }
        
        @JvmStatic
        public final float getY(final long bits) {
            final FloatCompanionObject instance = FloatCompanionObject.INSTANCE;
            return Float.intBitsToFloat((int)(bits & 0xFFFFFFFFL));
        }
    }
}
