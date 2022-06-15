//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.delegate;

import kotlin.properties.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.util.counting.*;
import kotlin.jvm.internal.*;
import me.alpha432.stay.util.thread.*;
import kotlin.jvm.functions.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import kotlin.reflect.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00028\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0096\u0002¢\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0019R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001c" }, d2 = { "Lme/alpha432/stay/util/delegate/AsyncCachedValue;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "updateTime", "", "timeUnit", "Lme/alpha432/stay/util/counting/TimeUnit;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function0;", "(JLme/alpha432/stay/util/counting/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)V", "timer", "Lme/alpha432/stay/util/counting/TickTimer;", "value", "Ljava/lang/Object;", "get", "()Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "update", "Stay" })
public final class AsyncCachedValue<T> implements ReadWriteProperty<Object, T>
{
    private final long updateTime;
    @NotNull
    private final CoroutineContext context;
    @NotNull
    private final Function0<T> block;
    @Nullable
    private T value;
    @NotNull
    private final TickTimer timer;
    
    public AsyncCachedValue(final long updateTime, @NotNull final TimeUnit timeUnit, @NotNull final CoroutineContext context, @NotNull final Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter((Object)timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        this.updateTime = updateTime;
        this.context = context;
        this.block = (kotlin.jvm.functions.Function0<T>)block;
        this.timer = new TickTimer(timeUnit);
    }
    
    public final T get() {
        final Object cached = this.value;
        Object o;
        if (cached == null) {
            final Object it = this.block.invoke();
            final int n = 0;
            this.value = (T)it;
            o = it;
        }
        else if (this.timer.tickAndReset(this.updateTime)) {
            BuildersKt.launch$default(CoroutineUtilsKt.getDefaultScope(), this.context, (CoroutineStart)null, (Function2)new AsyncCachedValue$get.AsyncCachedValue$get$2(this, (Continuation)null), 2, (Object)null);
            o = cached;
        }
        else {
            o = cached;
        }
        return (T)o;
    }
    
    public final void update() {
        this.timer.reset();
        BuildersKt.launch$default(CoroutineUtilsKt.getDefaultScope(), this.context, (CoroutineStart)null, (Function2)new AsyncCachedValue$update.AsyncCachedValue$update$1(this, (Continuation)null), 2, (Object)null);
    }
    
    public T getValue(@Nullable final Object thisRef, @NotNull final KProperty<?> property) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        return this.get();
    }
    
    public void setValue(@Nullable final Object thisRef, @NotNull final KProperty<?> property, final T value) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        this.value = value;
    }
}
