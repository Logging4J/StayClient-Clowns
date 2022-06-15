//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010" }, d2 = { "Lcakeslayers/team/eventsystem/ListenerOwner;", "Lcakeslayers/team/eventsystem/IListenerOwner;", "()V", "listeners", "Ljava/util/ArrayList;", "Lcakeslayers/team/eventsystem/Listener;", "Lkotlin/collections/ArrayList;", "getListeners", "()Ljava/util/ArrayList;", "parallelListeners", "Lcakeslayers/team/eventsystem/ParallelListener;", "register", "", "listener", "subscribe", "unsubscribe", "Stay" })
public class ListenerOwner implements IListenerOwner
{
    @NotNull
    private final ArrayList<Listener> listeners;
    @NotNull
    private final ArrayList<ParallelListener> parallelListeners;
    
    public ListenerOwner() {
        this.listeners = new ArrayList<Listener>();
        this.parallelListeners = new ArrayList<ParallelListener>();
    }
    
    @NotNull
    public final ArrayList<Listener> getListeners() {
        return this.listeners;
    }
    
    public void register(@NotNull final Listener listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.listeners.add(listener);
    }
    
    public void register(@NotNull final ParallelListener listener) {
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.parallelListeners.add(listener);
    }
    
    public void subscribe() {
        for (final Listener listener : this.listeners) {
            final EventBus value = EventBus.Companion.get(listener.getEventID());
            Intrinsics.checkNotNullExpressionValue((Object)listener, "listener");
            value.subscribe(listener);
        }
        for (final ParallelListener listener2 : this.parallelListeners) {
            final EventBus value2 = EventBus.Companion.get(listener2.getEventID());
            Intrinsics.checkNotNullExpressionValue((Object)listener2, "listener");
            value2.subscribe(listener2);
        }
    }
    
    public void unsubscribe() {
        for (final Listener listener : this.listeners) {
            final EventBus value = EventBus.Companion.get(listener.getEventID());
            Intrinsics.checkNotNullExpressionValue((Object)listener, "listener");
            value.unsubscribe(listener);
        }
        for (final ParallelListener listener2 : this.parallelListeners) {
            final EventBus value2 = EventBus.Companion.get(listener2.getEventID());
            Intrinsics.checkNotNullExpressionValue((Object)listener2, "listener");
            value2.unsubscribe(listener2);
        }
    }
}
