//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.client.gui.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011" }, d2 = { "Lme/alpha432/stay/event/Render2DEvent;", "Lme/alpha432/stay/event/EventStage;", "partialTicks", "", "scaledResolution", "Lnet/minecraft/client/gui/ScaledResolution;", "(FLnet/minecraft/client/gui/ScaledResolution;)V", "getPartialTicks", "()F", "setPartialTicks", "(F)V", "screenHeight", "", "getScreenHeight", "()D", "screenWidth", "getScreenWidth", "Stay" })
public final class Render2DEvent extends EventStage
{
    private float partialTicks;
    @NotNull
    private ScaledResolution scaledResolution;
    
    public Render2DEvent(final float partialTicks, @NotNull final ScaledResolution scaledResolution) {
        Intrinsics.checkNotNullParameter((Object)scaledResolution, "scaledResolution");
        this.partialTicks = partialTicks;
        this.scaledResolution = scaledResolution;
    }
    
    public final float getPartialTicks() {
        return this.partialTicks;
    }
    
    public final void setPartialTicks(final float <set-?>) {
        this.partialTicks = <set-?>;
    }
    
    public final double getScreenWidth() {
        return this.scaledResolution.getScaledWidth_double();
    }
    
    public final double getScreenHeight() {
        return this.scaledResolution.getScaledHeight_double();
    }
}
