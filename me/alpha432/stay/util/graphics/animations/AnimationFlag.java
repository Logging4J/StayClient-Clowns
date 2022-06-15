//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.animations;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "Lme/alpha432/stay/util/graphics/animations/AnimationFlag;", "", "easing", "Lme/alpha432/stay/util/graphics/animations/Easing;", "length", "", "(Lme/alpha432/stay/util/graphics/animations/Easing;F)V", "interpolation", "Lme/alpha432/stay/util/graphics/animations/InterpolateFunction;", "(Lme/alpha432/stay/util/graphics/animations/InterpolateFunction;)V", "current", "prev", "time", "", "forceUpdate", "", "get", "input", "update", "", "getAndUpdate", "Stay" })
public final class AnimationFlag
{
    @NotNull
    private final InterpolateFunction interpolation;
    private float prev;
    private float current;
    private long time;
    
    public AnimationFlag(@NotNull final InterpolateFunction interpolation) {
        Intrinsics.checkNotNullParameter((Object)interpolation, "interpolation");
        this.interpolation = interpolation;
        this.time = System.currentTimeMillis();
    }
    
    public AnimationFlag(@NotNull final Easing easing, final float length) {
        Intrinsics.checkNotNullParameter((Object)easing, "easing");
        this(AnimationFlag::_init_$lambda-0);
    }
    
    public final void forceUpdate(final float prev, final float current) {
        this.prev = prev;
        this.current = current;
        this.time = System.currentTimeMillis();
    }
    
    public final float getAndUpdate(final float input) {
        final float render = this.interpolation.invoke(this.time, this.prev, this.current);
        if (input != this.current) {
            this.prev = render;
            this.current = input;
            this.time = System.currentTimeMillis();
        }
        return render;
    }
    
    public final float get(final float input, final boolean update) {
        final float render = this.interpolation.invoke(this.time, this.prev, this.current);
        if (update && input != this.current) {
            this.prev = render;
            this.current = input;
            this.time = System.currentTimeMillis();
        }
        return render;
    }
    
    private static final float _init_$lambda-0(final Easing $easing, final float $length, final long time, final float prev, final float current) {
        Intrinsics.checkNotNullParameter((Object)$easing, "$easing");
        return $easing.incOrDec(Easing.Companion.toDelta(time, $length), prev, current);
    }
}
