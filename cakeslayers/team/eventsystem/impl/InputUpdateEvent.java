//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import cakeslayers.team.eventsystem.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\u0096\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016" }, d2 = { "Lcakeslayers/team/eventsystem/impl/InputUpdateEvent;", "Lcakeslayers/team/eventsystem/Event;", "Lcakeslayers/team/eventsystem/WrappedForgeEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "event", "Lnet/minecraftforge/client/event/InputUpdateEvent;", "(Lnet/minecraftforge/client/event/InputUpdateEvent;)V", "getEvent", "()Lnet/minecraftforge/client/event/InputUpdateEvent;", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "movementInput", "Lnet/minecraft/util/MovementInput;", "kotlin.jvm.PlatformType", "getMovementInput", "()Lnet/minecraft/util/MovementInput;", "post", "", "", "Companion", "Stay" })
public final class InputUpdateEvent implements Event, WrappedForgeEvent, IEventPosting
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final net.minecraftforge.client.event.InputUpdateEvent event;
    private final /* synthetic */ Companion $$delegate_0;
    
    public InputUpdateEvent(@NotNull final net.minecraftforge.client.event.InputUpdateEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        this.event = event;
        this.$$delegate_0 = InputUpdateEvent.Companion;
    }
    
    @NotNull
    public net.minecraftforge.client.event.InputUpdateEvent getEvent() {
        return this.event;
    }
    
    @NotNull
    public EventBus getEventBus() {
        return this.$$delegate_0.getEventBus();
    }
    
    public void post(@NotNull final Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.post(event);
    }
    
    public final MovementInput getMovementInput() {
        return this.getEvent().getMovementInput();
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    public boolean getCancelled() {
        return DefaultImpls.getCancelled(this);
    }
    
    public void setCancelled(final boolean value) {
        DefaultImpls.setCancelled(this, value);
    }
    
    public void cancel() {
        DefaultImpls.cancel(this);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/InputUpdateEvent$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
    public static final class Companion extends EventBus
    {
        private Companion() {
        }
    }
}
