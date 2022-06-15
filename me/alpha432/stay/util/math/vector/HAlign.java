//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math.vector;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010" }, d2 = { "Lme/alpha432/stay/util/math/vector/HAlign;", "", "displayName", "", "multiplier", "", "offset", "(Ljava/lang/String;ILjava/lang/CharSequence;FF)V", "getDisplayName", "()Ljava/lang/CharSequence;", "getMultiplier", "()F", "getOffset", "LEFT", "CENTER", "RIGHT", "Stay" })
public enum HAlign
{
    @NotNull
    private final CharSequence displayName;
    private final float multiplier;
    private final float offset;
    
    LEFT((CharSequence)"Left", 0.0f, -1.0f), 
    CENTER((CharSequence)"Center", 0.5f, 0.0f), 
    RIGHT((CharSequence)"Right", 1.0f, 1.0f);
    
    private HAlign(final CharSequence displayName, final float multiplier, final float offset) {
        this.displayName = displayName;
        this.multiplier = multiplier;
        this.offset = offset;
    }
    
    @NotNull
    public final CharSequence getDisplayName() {
        return this.displayName;
    }
    
    public final float getMultiplier() {
        return this.multiplier;
    }
    
    public final float getOffset() {
        return this.offset;
    }
    
    private static final /* synthetic */ HAlign[] $values() {
        return new HAlign[] { HAlign.LEFT, HAlign.CENTER, HAlign.RIGHT };
    }
    
    static {
        $VALUES = $values();
    }
}
