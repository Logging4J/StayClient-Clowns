//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.thread;

import org.jetbrains.annotations.*;
import kotlin.coroutines.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlinx.coroutines.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"!\u0010\u0004\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0017\u0010\n\u001a\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0003\"\u0017\u0010\r\u001a\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0003\"!\u0010\u0010\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u0012\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0003\"\u0018\u0010\u0014\u001a\u00020\u0015*\u0004\u0018\u00010\u00168\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018" }, d2 = { "defaultScope", "Lkotlinx/coroutines/CoroutineScope;", "getDefaultScope", "()Lkotlinx/coroutines/CoroutineScope;", "listenerScope", "getListenerScope$annotations", "()V", "getListenerScope", "listenerScope$delegate", "Lkotlin/Lazy;", "loadingScope", "getLoadingScope$annotations", "getLoadingScope", "mainScope", "getMainScope$annotations", "getMainScope", "taskScope", "getTaskScope$annotations", "getTaskScope", "taskScope$delegate", "isActiveOrFalse", "", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)Z", "Stay" })
public final class CoroutineUtilsKt
{
    @NotNull
    private static final CoroutineScope loadingScope;
    @NotNull
    private static final CoroutineScope mainScope;
    @NotNull
    private static final Lazy listenerScope$delegate;
    @NotNull
    private static final Lazy taskScope$delegate;
    @NotNull
    private static final CoroutineScope defaultScope;
    
    @NotNull
    public static final CoroutineScope getLoadingScope() {
        return CoroutineUtilsKt.loadingScope;
    }
    
    @NotNull
    public static final CoroutineScope getMainScope() {
        return CoroutineUtilsKt.mainScope;
    }
    
    @NotNull
    public static final CoroutineScope getListenerScope() {
        return (CoroutineScope)CoroutineUtilsKt.listenerScope$delegate.getValue();
    }
    
    @NotNull
    public static final CoroutineScope getTaskScope() {
        return (CoroutineScope)CoroutineUtilsKt.taskScope$delegate.getValue();
    }
    
    @NotNull
    public static final CoroutineScope getDefaultScope() {
        return CoroutineUtilsKt.defaultScope;
    }
    
    public static final boolean isActiveOrFalse(@Nullable final Job $this$isActiveOrFalse) {
        final int $i$f$isActiveOrFalse = 0;
        return $this$isActiveOrFalse != null && $this$isActiveOrFalse.isActive();
    }
    
    static {
        loadingScope = CoroutineScopeKt.CoroutineScope((CoroutineContext)ThreadPoolDispatcherKt.newFixedThreadPoolContext(10, "Stay-Loading"));
        mainScope = CoroutineScopeKt.CoroutineScope((CoroutineContext)ThreadPoolDispatcherKt.newSingleThreadContext("Stay-Main"));
        listenerScope$delegate = LazyKt.lazy((Function0)CoroutineUtilsKt$listenerScope.CoroutineUtilsKt$listenerScope$2.INSTANCE);
        taskScope$delegate = LazyKt.lazy((Function0)CoroutineUtilsKt$taskScope.CoroutineUtilsKt$taskScope$2.INSTANCE);
        defaultScope = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getDefault());
    }
}
