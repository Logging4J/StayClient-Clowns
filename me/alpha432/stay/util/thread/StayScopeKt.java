//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.thread;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.coroutines.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004" }, d2 = { "context0", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "pool0", "Ljava/util/concurrent/ThreadPoolExecutor;", "Stay" })
public final class StayScopeKt
{
    @NotNull
    private static final ThreadPoolExecutor pool0;
    @NotNull
    private static final ExecutorCoroutineDispatcher context0;
    
    static {
        final int cpuCount = Runtime.getRuntime().availableProcessors();
        final int n = 0;
        final int maxSize = Math.max(cpuCount * 16, 64);
        pool0 = new ThreadPoolExecutor(cpuCount * 2, maxSize, 5L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), (ThreadFactory)new CountingThreadFactory("Stay Pool"));
        context0 = ExecutorsKt.from((ExecutorService)StayScopeKt.pool0);
    }
}
