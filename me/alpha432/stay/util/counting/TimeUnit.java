//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.counting;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lme/alpha432/stay/util/counting/TimeUnit;", "", "multiplier", "", "(Ljava/lang/String;IJ)V", "getMultiplier", "()J", "MILLISECONDS", "TICKS", "SECONDS", "MINUTES", "Stay" })
public enum TimeUnit
{
    private final long multiplier;
    
    MILLISECONDS(1L), 
    TICKS(50L), 
    SECONDS(1000L), 
    MINUTES(60000L);
    
    private TimeUnit(final long multiplier) {
        this.multiplier = multiplier;
    }
    
    public final long getMultiplier() {
        return this.multiplier;
    }
    
    private static final /* synthetic */ TimeUnit[] $values() {
        return new TimeUnit[] { TimeUnit.MILLISECONDS, TimeUnit.TICKS, TimeUnit.SECONDS, TimeUnit.MINUTES };
    }
    
    static {
        $VALUES = $values();
    }
}
