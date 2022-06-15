//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lme/alpha432/stay/event/RenderWorldEvent;", "Lme/alpha432/stay/event/EventStage;", "partialTicks", "", "pass", "", "(FI)V", "getPartialTicks", "()F", "Lme/alpha432/stay/event/RenderWorldEvent$Pass;", "Pass", "Stay" })
public final class RenderWorldEvent extends EventStage
{
    private final float partialTicks;
    @NotNull
    private final Pass pass;
    
    public RenderWorldEvent(final float partialTicks, final int pass) {
        this.partialTicks = partialTicks;
        this.pass = Pass.values()[pass];
    }
    
    public final float getPartialTicks() {
        return this.partialTicks;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/event/RenderWorldEvent$Pass;", "", "(Ljava/lang/String;I)V", "ANAGLYPH_CYAN", "ANAGLYPH_RED", "NORMAL", "Stay" })
    public enum Pass
    {
        ANAGLYPH_CYAN, 
        ANAGLYPH_RED, 
        NORMAL;
        
        private static final /* synthetic */ Pass[] $values() {
            return new Pass[] { Pass.ANAGLYPH_CYAN, Pass.ANAGLYPH_RED, Pass.NORMAL };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
