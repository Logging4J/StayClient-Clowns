//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.thread;

import java.util.concurrent.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.atomic.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lme/alpha432/stay/util/thread/CountingThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "prefix", "", "(Ljava/lang/String;)V", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "Stay" })
public final class CountingThreadFactory implements ThreadFactory
{
    @NotNull
    private final String prefix;
    @NotNull
    private final AtomicInteger count;
    
    public CountingThreadFactory(@NotNull final String prefix) {
        Intrinsics.checkNotNullParameter((Object)prefix, "prefix");
        this.prefix = prefix;
        this.count = new AtomicInteger(1);
    }
    
    @NotNull
    @Override
    public Thread newThread(@NotNull final Runnable r) {
        Intrinsics.checkNotNullParameter((Object)r, "r");
        final Thread $this$newThread_u24lambda_u2d0 = new Thread(r, this.prefix + '-' + this.count.getAndIncrement());
        final int n = 0;
        $this$newThread_u24lambda_u2d0.setDaemon(true);
        return $this$newThread_u24lambda_u2d0;
    }
}
