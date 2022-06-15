//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import net.minecraftforge.common.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006¨\u0006\u0011" }, d2 = { "Lme/alpha432/stay/event/EventStage;", "Lnet/minecraftforge/fml/common/eventhandler/Event;", "Lme/alpha432/stay/event/IPostable;", "()V", "stage", "", "(I)V", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "getStage", "()I", "setStage", "post", "", "Stay" })
public abstract class EventStage extends Event implements IPostable
{
    private int stage;
    private boolean isCancelled;
    
    public final int getStage() {
        return this.stage;
    }
    
    public final void setStage(final int <set-?>) {
        this.stage = <set-?>;
    }
    
    public EventStage() {
        this.isCancelled = true;
    }
    
    public final boolean isCancelled() {
        return this.isCancelled;
    }
    
    public final void setCancelled(final boolean <set-?>) {
        this.isCancelled = <set-?>;
    }
    
    public EventStage(final int stage) {
        this.isCancelled = true;
        this.stage = stage;
    }
    
    public void post() {
        MinecraftForge.EVENT_BUS.post((Event)this);
    }
}
