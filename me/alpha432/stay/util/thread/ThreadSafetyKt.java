//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.thread;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.coroutines.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a0\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u0014\u0010\f\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u001e\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u001e\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0010" }, d2 = { "runLoop", "Lme/alpha432/stay/util/thread/ITask;", "amount", "", "delay", "", "block", "Lkotlin/Function0;", "", "runLoopSuspend", "scope", "Lkotlinx/coroutines/CoroutineScope;", "runSafe", "runSafeSuspend", "runSuspend", "runTask", "Stay" })
public final class ThreadSafetyKt
{
    @NotNull
    public static final ITask runTask(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final ThreadSafetyKt$runTask.ThreadSafetyKt$runTask$1 it;
        final ThreadSafetyKt$runTask.ThreadSafetyKt$runTask$1 threadSafetyKt$runTask$1 = it = new ThreadSafetyKt$runTask.ThreadSafetyKt$runTask$1((Function0)block);
        final int n = 0;
        it.invoke();
        return (ITask)threadSafetyKt$runTask$1;
    }
    
    @NotNull
    public static final ITask runSafe(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final ThreadSafetyKt$runSafe.ThreadSafetyKt$runSafe$1 it;
        final ThreadSafetyKt$runSafe.ThreadSafetyKt$runSafe$1 threadSafetyKt$runSafe$1 = it = new ThreadSafetyKt$runSafe.ThreadSafetyKt$runSafe$1((Function0)block);
        final int n = 0;
        it.invoke();
        return (ITask)threadSafetyKt$runSafe$1;
    }
    
    @NotNull
    public static final ITask runSuspend(@NotNull final CoroutineScope scope, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)scope, "scope");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return (ITask)new ThreadSafetyKt$runSuspend.ThreadSafetyKt$runSuspend$1(scope, (Function0)block);
    }
    
    @NotNull
    public static final ITask runSafeSuspend(@NotNull final CoroutineScope scope, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)scope, "scope");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return (ITask)new ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1(scope, (Function0)block);
    }
    
    @NotNull
    public static final ITask runLoop(final int amount, final long delay, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return (ITask)new ThreadSafetyKt$runLoop.ThreadSafetyKt$runLoop$1(amount, (Function0)block, delay);
    }
    
    @NotNull
    public static final ITask runLoopSuspend(@NotNull final CoroutineScope scope, final int amount, final long delay, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter((Object)scope, "scope");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return (ITask)new ThreadSafetyKt$runLoopSuspend.ThreadSafetyKt$runLoopSuspend$1(scope, amount, (Function0)block, delay);
    }
}
