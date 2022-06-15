//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.animations;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b#\b\u0086\u0001\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001)B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H$J\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005j\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006*" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing;", "", "(Ljava/lang/String;I)V", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "dec", "", "x", "max", "min", "dec0", "inc", "inc0", "incOrDec", "incOrDecOpposite", "LINEAR", "IN_SINE", "OUT_SINE", "IN_OUT_SINE", "IN_QUAD", "OUT_QUAD", "IN_OUT_QUAD", "IN_CUBIC", "OUT_CUBIC", "IN_OUT_CUBIC", "IN_QUART", "OUT_QUART", "IN_OUT_QUART", "IN_QUINT", "OUT_QUINT", "IN_OUT_QUINT", "IN_EXPO", "OUT_EXPO", "IN_OUT_EXPO", "IN_CIRC", "OUT_CIRC", "IN_OUT_CIRC", "IN_BACK", "OUT_BACK", "IN_OUT_BACK", "Companion", "Stay" })
public enum Easing
{
    @NotNull
    public static final Companion Companion;
    
    LINEAR, 
    IN_SINE, 
    OUT_SINE, 
    IN_OUT_SINE, 
    IN_QUAD, 
    OUT_QUAD, 
    IN_OUT_QUAD, 
    IN_CUBIC, 
    OUT_CUBIC, 
    IN_OUT_CUBIC, 
    IN_QUART, 
    OUT_QUART, 
    IN_OUT_QUART, 
    IN_QUINT, 
    OUT_QUINT, 
    IN_OUT_QUINT, 
    IN_EXPO, 
    OUT_EXPO, 
    IN_OUT_EXPO, 
    IN_CIRC, 
    OUT_CIRC, 
    IN_OUT_CIRC, 
    IN_BACK, 
    OUT_BACK, 
    IN_OUT_BACK;
    
    public final float incOrDecOpposite(final float x, final float min, final float max) {
        if (max == min) {
            return min;
        }
        final float delta = (max > min) ? this.inc(x) : this.getOpposite().inc(x);
        final int $i$f$lerp = 0;
        return min + (max - min) * delta;
    }
    
    public final float incOrDec(final float x, final float min, final float max) {
        final float delta$iv = this.inc(x);
        final int $i$f$lerp = 0;
        return min + (max - min) * delta$iv;
    }
    
    public final float inc(final float x, final float min, final float max) {
        float min2 = min;
        float max2 = max;
        if (max2 == min2) {
            return 0.0f;
        }
        if (max2 < min2) {
            final float oldMax = max2;
            max2 = min2;
            min2 = oldMax;
        }
        if (x <= 0.0f) {
            return min2;
        }
        if (x >= 1.0f) {
            return max2;
        }
        final float delta$iv = this.inc0(x);
        final int $i$f$lerp = 0;
        return min2 + (max2 - min2) * delta$iv;
    }
    
    public final float inc(final float x, final float max) {
        if (max == 0.0f) {
            return 0.0f;
        }
        if (x <= 0.0f) {
            return 0.0f;
        }
        if (x >= 1.0f) {
            return max;
        }
        return this.inc0(x) * max;
    }
    
    public final float inc(final float x) {
        if (x <= 0.0f) {
            return 0.0f;
        }
        if (x >= 1.0f) {
            return 1.0f;
        }
        return this.inc0(x);
    }
    
    public final float dec(final float x, final float min, final float max) {
        float min2 = min;
        float max2 = max;
        if (max2 == min2) {
            return 0.0f;
        }
        if (max2 < min2) {
            final float oldMax = max2;
            max2 = min2;
            min2 = oldMax;
        }
        if (x <= 0.0f) {
            return max2;
        }
        if (x >= 1.0f) {
            return min2;
        }
        final float delta$iv = this.dec0(x);
        final int $i$f$lerp = 0;
        return min2 + (max2 - min2) * delta$iv;
    }
    
    public final float dec(final float x, final float max) {
        if (max == 0.0f) {
            return 0.0f;
        }
        if (x <= 0.0f) {
            return max;
        }
        if (x >= 1.0f) {
            return 0.0f;
        }
        return this.dec0(x) * max;
    }
    
    public final float dec(final float x) {
        if (x <= 0.0f) {
            return 1.0f;
        }
        if (x >= 1.0f) {
            return 0.0f;
        }
        return this.dec0(x);
    }
    
    @NotNull
    public abstract Easing getOpposite();
    
    protected abstract float inc0(final float p0);
    
    private final float dec0(final float x) {
        return 1.0f - this.inc0(x);
    }
    
    private static final /* synthetic */ Easing[] $values() {
        return new Easing[] { Easing.LINEAR, Easing.IN_SINE, Easing.OUT_SINE, Easing.IN_OUT_SINE, Easing.IN_QUAD, Easing.OUT_QUAD, Easing.IN_OUT_QUAD, Easing.IN_CUBIC, Easing.OUT_CUBIC, Easing.IN_OUT_CUBIC, Easing.IN_QUART, Easing.OUT_QUART, Easing.IN_OUT_QUART, Easing.IN_QUINT, Easing.OUT_QUINT, Easing.IN_OUT_QUINT, Easing.IN_EXPO, Easing.OUT_EXPO, Easing.IN_OUT_EXPO, Easing.IN_CIRC, Easing.OUT_CIRC, Easing.IN_OUT_CIRC, Easing.IN_BACK, Easing.OUT_BACK, Easing.IN_OUT_BACK };
    }
    
    @JvmStatic
    public static final float toDelta(final long start, final int length) {
        return Easing.Companion.toDelta(start, length);
    }
    
    @JvmStatic
    public static final float toDelta(final long start, final long length) {
        return Easing.Companion.toDelta(start, length);
    }
    
    @JvmStatic
    public static final float toDelta(final long start, final float length) {
        return Easing.Companion.toDelta(start, length);
    }
    
    @JvmStatic
    public static final long toDelta(final long start) {
        return Easing.Companion.toDelta(start);
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$LINEAR;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class LINEAR extends Easing
    {
        LINEAR(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            return x;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_SINE;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_SINE extends Easing
    {
        IN_SINE(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_SINE;
        }
        
        @Override
        protected float inc0(final float x) {
            return 1.0f - (float)Math.cos(x * 3.1415927f / 2.0f);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_SINE;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_SINE extends Easing
    {
        OUT_SINE(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            return (float)Math.sin(x * 3.1415927f / 2.0f);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_SINE;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_SINE extends Easing
    {
        IN_OUT_SINE(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            return -((float)Math.cos(3.1415927f * x) - 1.0f) / 2.0f;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_QUAD;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_QUAD extends Easing
    {
        IN_QUAD(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_QUAD;
        }
        
        @Override
        protected float inc0(final float x) {
            final float $this$sq$iv = x;
            final int $i$f$getSq = 0;
            return $this$sq$iv * $this$sq$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_QUAD;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_QUAD extends Easing
    {
        OUT_QUAD(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.IN_QUAD;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 1.0f;
            final float $this$sq$iv = 1.0f - x;
            final int $i$f$getSq = 0;
            return n - $this$sq$iv * $this$sq$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_QUAD;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_QUAD extends Easing
    {
        IN_OUT_QUAD(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            float n;
            if (x < 0.5f) {
                n = 2.0f * x * x;
            }
            else {
                final float n2 = 1.0f;
                final float $this$sq$iv = -2.0f * x + 2.0f;
                final int $i$f$getSq = 0;
                n = n2 - $this$sq$iv * $this$sq$iv / 2.0f;
            }
            return n;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_CUBIC;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_CUBIC extends Easing
    {
        IN_CUBIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_CUBIC;
        }
        
        @Override
        protected float inc0(final float x) {
            final float $this$cubic$iv = x;
            final int $i$f$getCubic = 0;
            return $this$cubic$iv * $this$cubic$iv * $this$cubic$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_CUBIC;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_CUBIC extends Easing
    {
        OUT_CUBIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.IN_CUBIC;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 1.0f;
            final float $this$cubic$iv = 1.0f - x;
            final int $i$f$getCubic = 0;
            return n - $this$cubic$iv * $this$cubic$iv * $this$cubic$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_CUBIC;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_CUBIC extends Easing
    {
        IN_OUT_CUBIC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            float n2;
            if (x < 0.5f) {
                final float n = 4.0f;
                final float $this$cubic$iv = x;
                final int $i$f$getCubic = 0;
                n2 = n * ($this$cubic$iv * $this$cubic$iv * $this$cubic$iv);
            }
            else {
                final float n3 = 1.0f;
                final float $this$cubic$iv = -2.0f * x + 2.0f;
                final int $i$f$getCubic = 0;
                n2 = n3 - $this$cubic$iv * $this$cubic$iv * $this$cubic$iv / 2.0f;
            }
            return n2;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_QUART;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_QUART extends Easing
    {
        IN_QUART(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_QUART;
        }
        
        @Override
        protected float inc0(final float x) {
            final float $this$quart$iv = x;
            final int $i$f$getQuart = 0;
            return $this$quart$iv * $this$quart$iv * $this$quart$iv * $this$quart$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_QUART;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_QUART extends Easing
    {
        OUT_QUART(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.IN_QUART;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 1.0f;
            final float $this$quart$iv = 1.0f - x;
            final int $i$f$getQuart = 0;
            return n - $this$quart$iv * $this$quart$iv * $this$quart$iv * $this$quart$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_QUART;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_QUART extends Easing
    {
        IN_OUT_QUART(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            float n2;
            if (x < 0.5f) {
                final float n = 8.0f;
                final float $this$quart$iv = x;
                final int $i$f$getQuart = 0;
                n2 = n * ($this$quart$iv * $this$quart$iv * $this$quart$iv * $this$quart$iv);
            }
            else {
                final float n3 = 1.0f;
                final float $this$quart$iv = -2.0f * x + 2.0f;
                final int $i$f$getQuart = 0;
                n2 = n3 - $this$quart$iv * $this$quart$iv * $this$quart$iv * $this$quart$iv / 2.0f;
            }
            return n2;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_QUINT;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_QUINT extends Easing
    {
        IN_QUINT(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_QUINT;
        }
        
        @Override
        protected float inc0(final float x) {
            final float $this$quint$iv = x;
            final int $i$f$getQuint = 0;
            return $this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_QUINT;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_QUINT extends Easing
    {
        OUT_QUINT(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.IN_QUINT;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 1.0f;
            final float $this$quint$iv = 1.0f - x;
            final int $i$f$getQuint = 0;
            return n - $this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_QUINT;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_QUINT extends Easing
    {
        IN_OUT_QUINT(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            float n2;
            if (x < 0.5f) {
                final float n = 16.0f;
                final float $this$quint$iv = x;
                final int $i$f$getQuint = 0;
                n2 = n * ($this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv);
            }
            else {
                final float n3 = 1.0f;
                final float $this$quint$iv = -2 * x + 2;
                final int $i$f$getQuint = 0;
                n2 = n3 - $this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv * $this$quint$iv / 2.0f;
            }
            return n2;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_EXPO;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_EXPO extends Easing
    {
        IN_EXPO(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_EXPO;
        }
        
        @Override
        protected float inc0(final float x) {
            return (x == 0.0f) ? 0.0f : ((float)Math.pow(2.0f, 10.0f * x - 10.0f));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_EXPO;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_EXPO extends Easing
    {
        OUT_EXPO(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.IN_EXPO;
        }
        
        @Override
        protected float inc0(final float x) {
            return (x == 1.0f) ? 1.0f : (1.0f - (float)Math.pow(2.0f, -10.0f * x));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_EXPO;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_EXPO extends Easing
    {
        IN_OUT_EXPO(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            return (x == 0.0f) ? 0.0f : ((x == 1.0f) ? 1.0f : ((x < 0.5f) ? ((float)Math.pow(2.0f, 20.0f * x - 10.0f) / 2.0f) : ((2.0f - (float)Math.pow(2.0f, -20.0f * x + 10.0f)) / 2.0f)));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_CIRC;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_CIRC extends Easing
    {
        IN_CIRC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_CIRC;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 1.0f;
            final float n2 = 1.0f;
            final float $this$sq$iv = x;
            final int $i$f$getSq = 0;
            return n - (float)Math.sqrt(n2 - $this$sq$iv * $this$sq$iv);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_CIRC;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_CIRC extends Easing
    {
        OUT_CIRC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.IN_CIRC;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 1.0f;
            final float $this$sq$iv = x - 1.0f;
            final int $i$f$getSq = 0;
            return (float)Math.sqrt(n - $this$sq$iv * $this$sq$iv);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_CIRC;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_CIRC extends Easing
    {
        IN_OUT_CIRC(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            float n3;
            if (x < 0.5f) {
                final float n = 1.0f;
                final float n2 = 1.0f;
                final float $this$sq$iv = 2.0f * x;
                final int $i$f$getSq = 0;
                n3 = (n - (float)Math.sqrt(n2 - $this$sq$iv * $this$sq$iv)) / 2.0f;
            }
            else {
                final float n4 = 1.0f;
                final float $this$sq$iv = -2.0f * x + 2.0f;
                final int $i$f$getSq = 0;
                n3 = ((float)Math.sqrt(n4 - $this$sq$iv * $this$sq$iv) + 1.0f) / 2.0f;
            }
            return n3;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_BACK;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_BACK extends Easing
    {
        IN_BACK(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.OUT_BACK;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 2.70158f;
            final float $this$cubic$iv = x;
            final int $i$f$getCubic = 0;
            final float n2 = n * ($this$cubic$iv * $this$cubic$iv * $this$cubic$iv);
            final float n3 = 1.70158f;
            final float $this$sq$iv = x;
            final int $i$f$getSq = 0;
            return n2 - n3 * ($this$sq$iv * $this$sq$iv);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$OUT_BACK;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class OUT_BACK extends Easing
    {
        OUT_BACK(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return Easing.IN_BACK;
        }
        
        @Override
        protected float inc0(final float x) {
            final float n = 1.0f;
            final float n2 = 2.70158f;
            final float $this$cubic$iv = x - 1.0f;
            final int $i$f$getCubic = 0;
            final float n3 = n + n2 * ($this$cubic$iv * $this$cubic$iv * $this$cubic$iv);
            final float n4 = 1.70158f;
            final float $this$sq$iv = x - 1.0f;
            final int $i$f$getSq = 0;
            return n3 + n4 * ($this$sq$iv * $this$sq$iv);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\u0002\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$IN_OUT_BACK;", "Lme/alpha432/stay/util/graphics/animations/Easing;", "opposite", "getOpposite", "()Lme/alpha432/stay/util/graphics/animations/Easing;", "inc0", "", "x", "Stay" })
    static final class IN_OUT_BACK extends Easing
    {
        IN_OUT_BACK(final String $enum$name, final int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }
        
        @NotNull
        @Override
        public Easing getOpposite() {
            return this;
        }
        
        @Override
        protected float inc0(final float x) {
            float n;
            if (x < 0.5f) {
                final float $this$sq$iv = 2.0f * x;
                final int $i$f$getSq = 0;
                n = $this$sq$iv * $this$sq$iv * (7.189819f * x - 2.5949094f) / 2.0f;
            }
            else {
                final float $this$sq$iv = 2.0f * x - 2.0f;
                final int $i$f$getSq = 0;
                n = ($this$sq$iv * $this$sq$iv * (3.5949094f * (x * 2.0f - 2.0f) + 2.5949094f) + 2.0f) / 2.0f;
            }
            return n;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\t" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/Easing$Companion;", "", "()V", "toDelta", "", "start", "", "length", "", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        @JvmStatic
        public final float toDelta(final long start, final int length) {
            return this.toDelta(start, (float)length);
        }
        
        @JvmStatic
        public final float toDelta(final long start, final long length) {
            return this.toDelta(start, (float)length);
        }
        
        @JvmStatic
        public final float toDelta(final long start, final float length) {
            return RangesKt.coerceIn(this.toDelta(start) / length, 0.0f, 1.0f);
        }
        
        @JvmStatic
        public final long toDelta(final long start) {
            return System.currentTimeMillis() - start;
        }
    }
}
