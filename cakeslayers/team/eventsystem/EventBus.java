//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import cakeslayers.team.eventsystem.utils.*;
import java.util.*;
import kotlin.jvm.functions.*;
import kotlinx.coroutines.*;
import kotlin.coroutines.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a" }, d2 = { "Lcakeslayers/team/eventsystem/EventBus;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "busID", "", "getBusID", "()I", "eventBus", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcakeslayers/team/eventsystem/Listener;", "getListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "parallelListeners", "Lcakeslayers/team/eventsystem/ParallelListener;", "invokeParallel", "", "event", "", "post", "subscribe", "listener", "unsubscribe", "Companion", "Stay" })
public class EventBus implements IEventPosting
{
    @NotNull
    public static final Companion Companion;
    private final int busID;
    @NotNull
    private final CopyOnWriteArrayList<Listener> listeners;
    @NotNull
    private final CopyOnWriteArrayList<ParallelListener> parallelListeners;
    @NotNull
    private static final AtomicInteger id;
    @NotNull
    private static final ArrayMap<EventBus> eventBusMap;
    
    public EventBus() {
        this.busID = EventBus.id.getAndIncrement();
        EventBus.eventBusMap.put(this.busID, this);
        this.listeners = new CopyOnWriteArrayList<Listener>();
        this.parallelListeners = new CopyOnWriteArrayList<ParallelListener>();
    }
    
    @NotNull
    @Override
    public EventBus getEventBus() {
        return this;
    }
    
    public final int getBusID() {
        return this.busID;
    }
    
    @NotNull
    protected final CopyOnWriteArrayList<Listener> getListeners() {
        return this.listeners;
    }
    
    @Override
    public void post(@NotNull final Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        for (final Listener listener : this.listeners) {
            ((Function1)listener.getFunction()).invoke(event);
        }
        this.invokeParallel(event);
    }
    
    protected final void invokeParallel(@NotNull final Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.parallelListeners.isEmpty()) {
            BuildersKt.runBlocking$default((CoroutineContext)null, (Function2)new EventBus$invokeParallel.EventBus$invokeParallel$1(this, event, (Continuation)null), 1, (Object)null);
        }
    }
    
    public final void subscribe(@NotNull final Listener listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        int j = 0;
        while (j < this.listeners.size()) {
            final int i = j;
            ++j;
            final Listener other = this.listeners.get(i);
            if (Intrinsics.areEqual((Object)listener, (Object)other)) {
                return;
            }
            if (listener.getPriority() > other.getPriority()) {
                if (!Intrinsics.areEqual((Object)listener, (Object)other)) {
                    this.listeners.add(i, listener);
                }
                return;
            }
        }
        this.listeners.add(listener);
    }
    
    public final void subscribe(@NotNull final ParallelListener listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        int j = 0;
        while (j < this.parallelListeners.size()) {
            final int i = j;
            ++j;
            final ParallelListener other = this.parallelListeners.get(i);
            if (Intrinsics.areEqual((Object)listener, (Object)other)) {
                return;
            }
            if (listener.getPriority() > other.getPriority()) {
                if (!Intrinsics.areEqual((Object)listener, (Object)other)) {
                    this.parallelListeners.add(i, listener);
                }
                return;
            }
        }
        this.parallelListeners.add(listener);
    }
    
    public final void unsubscribe(@NotNull final Listener listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.listeners.removeIf(EventBus::unsubscribe$lambda-0);
    }
    
    public final void unsubscribe(@NotNull final ParallelListener listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.parallelListeners.removeIf(EventBus::unsubscribe$lambda-1);
    }
    
    private static final boolean unsubscribe$lambda-0(final Listener $listener, final Listener it) {
        Intrinsics.checkNotNullParameter((Object)$listener, "$listener");
        return Intrinsics.areEqual((Object)it, (Object)$listener);
    }
    
    private static final boolean unsubscribe$lambda-1(final ParallelListener $listener, final ParallelListener it) {
        Intrinsics.checkNotNullParameter((Object)$listener, "$listener");
        return Intrinsics.areEqual((Object)it, (Object)$listener);
    }
    
    public static final /* synthetic */ ArrayMap access$getEventBusMap$cp() {
        return EventBus.eventBusMap;
    }
    
    static {
        Companion = new Companion(null);
        id = new AtomicInteger();
        eventBusMap = new ArrayMap<EventBus>();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lcakeslayers/team/eventsystem/EventBus$Companion;", "", "()V", "eventBusMap", "Lcakeslayers/team/eventsystem/utils/ArrayMap;", "Lcakeslayers/team/eventsystem/EventBus;", "id", "Ljava/util/concurrent/atomic/AtomicInteger;", "get", "busID", "", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        @NotNull
        public final EventBus get(final int busID) {
            final EventBus value = EventBus.access$getEventBusMap$cp().get((Object)busID);
            Intrinsics.checkNotNull((Object)value);
            return value;
        }
    }
}
