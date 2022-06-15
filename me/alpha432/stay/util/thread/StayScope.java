//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.thread;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/util/thread/StayScope;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "context", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getContext", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "pool", "Ljava/util/concurrent/ThreadPoolExecutor;", "getPool", "()Ljava/util/concurrent/ThreadPoolExecutor;", "Stay" })
public final class StayScope implements CoroutineScope
{
    @NotNull
    public static final StayScope INSTANCE;
    private final /* synthetic */ CoroutineScope $$delegate_0;
    @NotNull
    private static final ThreadPoolExecutor pool;
    @NotNull
    private static final ExecutorCoroutineDispatcher context;
    
    private StayScope() {
        this.$$delegate_0 = CoroutineScopeKt.CoroutineScope((CoroutineContext)StayScopeKt.access$getContext0$p());
    }
    
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
    
    @NotNull
    public final ThreadPoolExecutor getPool() {
        return StayScope.pool;
    }
    
    @NotNull
    public final ExecutorCoroutineDispatcher getContext() {
        return StayScope.context;
    }
    
    static {
        INSTANCE = new StayScope();
        pool = StayScopeKt.access$getPool0$p();
        context = StayScopeKt.access$getContext0$p();
    }
}
