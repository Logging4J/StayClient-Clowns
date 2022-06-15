//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lme/alpha432/stay/util/world/FastRayTraceAction;", "", "(Ljava/lang/String;I)V", "SKIP", "MISS", "CALC", "HIT", "Stay" })
public enum FastRayTraceAction
{
    SKIP, 
    MISS, 
    CALC, 
    HIT;
    
    private static final /* synthetic */ FastRayTraceAction[] $values() {
        return new FastRayTraceAction[] { FastRayTraceAction.SKIP, FastRayTraceAction.MISS, FastRayTraceAction.CALC, FastRayTraceAction.HIT };
    }
    
    static {
        $VALUES = $values();
    }
}
