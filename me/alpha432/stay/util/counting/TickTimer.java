//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.counting;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016" }, d2 = { "Lme/alpha432/stay/util/counting/TickTimer;", "", "timeUnit", "Lme/alpha432/stay/util/counting/TimeUnit;", "(Lme/alpha432/stay/util/counting/TimeUnit;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "getTimeUnit", "()Lme/alpha432/stay/util/counting/TimeUnit;", "reset", "", "offset", "", "tick", "", "delay", "unit", "tickAndReset", "Stay" })
public final class TickTimer
{
    @NotNull
    private final TimeUnit timeUnit;
    private long time;
    
    public TickTimer(@NotNull final TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter((Object)timeUnit, "timeUnit");
        this.timeUnit = timeUnit;
        this.time = System.currentTimeMillis();
    }
    
    @NotNull
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
    
    public final long getTime() {
        return this.time;
    }
    
    public final void setTime(final long <set-?>) {
        this.time = <set-?>;
    }
    
    public final boolean tick(final int delay) {
        final long current = System.currentTimeMillis();
        return current - this.time >= delay * this.timeUnit.getMultiplier();
    }
    
    public final boolean tick(final long delay) {
        final long current = System.currentTimeMillis();
        return current - this.time >= delay * this.timeUnit.getMultiplier();
    }
    
    public final boolean tick(final int delay, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        final long current = System.currentTimeMillis();
        return current - this.time >= delay * unit.getMultiplier();
    }
    
    public final boolean tick(final long delay, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        final long current = System.currentTimeMillis();
        return current - this.time >= delay * unit.getMultiplier();
    }
    
    public final boolean tickAndReset(final int delay) {
        final long current = System.currentTimeMillis();
        boolean b;
        if (current - this.time >= delay * this.timeUnit.getMultiplier()) {
            this.time = current;
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean tickAndReset(final long delay) {
        final long current = System.currentTimeMillis();
        boolean b;
        if (current - this.time >= delay * this.timeUnit.getMultiplier()) {
            this.time = current;
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean tickAndReset(final int delay, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        final long current = System.currentTimeMillis();
        boolean b;
        if (current - this.time >= delay * unit.getMultiplier()) {
            this.time = current;
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean tickAndReset(final long delay, @NotNull final TimeUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        final long current = System.currentTimeMillis();
        boolean b;
        if (current - this.time >= delay * unit.getMultiplier()) {
            this.time = current;
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final void reset() {
        this.time = System.currentTimeMillis();
    }
    
    public final void reset(final long offset) {
        this.time = System.currentTimeMillis() + offset;
    }
    
    public final void reset(final int offset) {
        this.time = System.currentTimeMillis() + offset;
    }
    
    public TickTimer() {
        this(null, 1, null);
    }
}
