//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.delegate;

import kotlin.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.util.counting.*;
import kotlin.jvm.internal.*;
import kotlin.properties.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0013\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001b\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0014J\u000b\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\r\u0010\u0017\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u001c\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\f\u001a\u00020\u0012J$\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u001d" }, d2 = { "Lme/alpha432/stay/util/delegate/CachedValue;", "T", "", "invalidValue", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Object;", "timer", "Lme/alpha432/stay/util/counting/TickTimer;", "value", "get", "updateTime", "", "(I)Ljava/lang/Object;", "timeUnit", "Lme/alpha432/stay/util/counting/TimeUnit;", "(ILme/alpha432/stay/util/counting/TimeUnit;)Ljava/lang/Object;", "", "(J)Ljava/lang/Object;", "(JLme/alpha432/stay/util/counting/TimeUnit;)Ljava/lang/Object;", "getForce", "()Ljava/lang/Object;", "getLazy", "updateForce", "", "updateLazy", "wrapped", "Lkotlin/properties/ReadWriteProperty;", "Stay" })
public final class CachedValue<T>
{
    @Nullable
    private final T invalidValue;
    @NotNull
    private final Function0<T> block;
    @Nullable
    private T value;
    @NotNull
    private final TickTimer timer;
    
    public CachedValue(@Nullable final T invalidValue, @NotNull final Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        this.invalidValue = invalidValue;
        this.block = (kotlin.jvm.functions.Function0<T>)block;
        this.timer = new TickTimer((TimeUnit)null, 1, (DefaultConstructorMarker)null);
    }
    
    public final T get(final int updateTime, @NotNull final TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter((Object)timeUnit, "timeUnit");
        return this.get(updateTime * timeUnit.getMultiplier());
    }
    
    public final T get(final long updateTime, @NotNull final TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter((Object)timeUnit, "timeUnit");
        return this.get(updateTime * timeUnit.getMultiplier());
    }
    
    public final T get(final int updateTime) {
        final Object cached = this.value;
        Object o;
        if (cached == null || Intrinsics.areEqual(cached, (Object)this.invalidValue) || this.timer.tick(updateTime)) {
            this.timer.reset();
            final Object it = this.block.invoke();
            final int n = 0;
            this.value = (T)it;
            o = it;
        }
        else {
            o = cached;
        }
        return (T)o;
    }
    
    public final T get(final long updateTime) {
        final Object cached = this.value;
        Object o;
        if (cached == null || Intrinsics.areEqual(cached, (Object)this.invalidValue) || this.timer.tick(updateTime)) {
            this.timer.reset();
            final Object it = this.block.invoke();
            final int n = 0;
            this.value = (T)it;
            o = it;
        }
        else {
            o = cached;
        }
        return (T)o;
    }
    
    public final T getForce() {
        final Object it = this.block.invoke();
        final int n = 0;
        return this.value = (T)it;
    }
    
    @Nullable
    public final T getLazy() {
        return this.value;
    }
    
    public final void updateForce() {
        this.timer.reset();
        this.value = (T)this.block.invoke();
    }
    
    public final void updateLazy() {
        this.value = null;
    }
    
    @NotNull
    public final ReadWriteProperty<Object, T> wrapped(final long updateTime) {
        return (ReadWriteProperty<Object, T>)new CachedValue$wrapped.CachedValue$wrapped$1(this, updateTime);
    }
    
    @NotNull
    public final ReadWriteProperty<Object, T> wrapped(final long updateTime, @NotNull final TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter((Object)timeUnit, "timeUnit");
        return (ReadWriteProperty<Object, T>)new CachedValue$wrapped.CachedValue$wrapped$2(this, updateTime, timeUnit);
    }
}
