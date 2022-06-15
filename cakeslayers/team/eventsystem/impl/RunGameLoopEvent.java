//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import cakeslayers.team.eventsystem.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent;", "Lcakeslayers/team/eventsystem/Event;", "()V", "End", "Render", "Start", "Tick", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Start;", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Tick;", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Render;", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$End;", "Stay" })
public abstract class RunGameLoopEvent implements Event
{
    private RunGameLoopEvent() {
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Start;", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class Start extends RunGameLoopEvent implements IEventPosting
    {
        @NotNull
        public static final Start INSTANCE;
        private final /* synthetic */ NamedProfilerEventBus $$delegate_0;
        
        private Start() {
            super(null);
            this.$$delegate_0 = new NamedProfilerEventBus("start");
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
            INSTANCE = new Start();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Tick;", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class Tick extends RunGameLoopEvent implements IEventPosting
    {
        @NotNull
        public static final Tick INSTANCE;
        private final /* synthetic */ NamedProfilerEventBus $$delegate_0;
        
        private Tick() {
            super(null);
            this.$$delegate_0 = new NamedProfilerEventBus("tick");
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
            INSTANCE = new Tick();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Render;", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class Render extends RunGameLoopEvent implements IEventPosting
    {
        @NotNull
        public static final Render INSTANCE;
        private final /* synthetic */ NamedProfilerEventBus $$delegate_0;
        
        private Render() {
            super(null);
            this.$$delegate_0 = new NamedProfilerEventBus("render");
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
            INSTANCE = new Render();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$End;", "Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class End extends RunGameLoopEvent implements IEventPosting
    {
        @NotNull
        public static final End INSTANCE;
        private final /* synthetic */ NamedProfilerEventBus $$delegate_0;
        
        private End() {
            super(null);
            this.$$delegate_0 = new NamedProfilerEventBus("end");
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
            INSTANCE = new End();
        }
    }
}
