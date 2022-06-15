//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import cakeslayers.team.eventsystem.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ConnectionEvent;", "Lcakeslayers/team/eventsystem/Event;", "()V", "Connect", "Disconnect", "Lcakeslayers/team/eventsystem/impl/ConnectionEvent$Connect;", "Lcakeslayers/team/eventsystem/impl/ConnectionEvent$Disconnect;", "Stay" })
public abstract class ConnectionEvent implements Event
{
    private ConnectionEvent() {
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ConnectionEvent$Connect;", "Lcakeslayers/team/eventsystem/impl/ConnectionEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class Connect extends ConnectionEvent implements IEventPosting
    {
        @NotNull
        public static final Connect INSTANCE;
        private final /* synthetic */ EventBus $$delegate_0;
        
        private Connect() {
            super(null);
            this.$$delegate_0 = new EventBus();
        }
        
        @NotNull
        public EventBus getEventBus() {
            return this.$$delegate_0.getEventBus();
        }
        
        public void post(@NotNull final Object event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.$$delegate_0.post(event);
        }
        
        static {
            INSTANCE = new Connect();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ConnectionEvent$Disconnect;", "Lcakeslayers/team/eventsystem/impl/ConnectionEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class Disconnect extends ConnectionEvent implements IEventPosting
    {
        @NotNull
        public static final Disconnect INSTANCE;
        private final /* synthetic */ EventBus $$delegate_0;
        
        private Disconnect() {
            super(null);
            this.$$delegate_0 = new EventBus();
        }
        
        @NotNull
        public EventBus getEventBus() {
            return this.$$delegate_0.getEventBus();
        }
        
        public void post(@NotNull final Object event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.$$delegate_0.post(event);
        }
        
        static {
            INSTANCE = new Disconnect();
        }
    }
}
