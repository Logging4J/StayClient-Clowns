//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.coroutines.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\\\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aZ\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00042\u0006\u0010\u0010\u001a\u00020\u00112\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004H\u0002\u001aJ\u0010\u0019\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00042\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u001b\u001aZ\u0010\u001c\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00042\u0006\u0010\u0010\u001a\u00020\u00112\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aO\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112$\b\b\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001d\u001aG\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2$\b\b\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a2\u0010\u0019\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0014\b\b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b\u00f8\u0001\u0001\u001a:\u0010\u0019\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\b\b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b\u00f8\u0001\u0001\u001a:\u0010\u0019\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00012\u0014\b\b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b\u00f8\u0001\u0001\u001aB\u0010\u0019\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0014\b\b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u001bH\u0086\b\u00f8\u0001\u0001\u001aO\u0010\u001c\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112$\b\b\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001d\u001aG\u0010\u001c\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2$\b\b\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001e\u001aZ\u0010\u001f\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112/\b\b\u0010\u0012\u001a)\b\u0001\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150 ¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010#\u001aR\u0010\u001f\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2/\b\b\u0010\u0012\u001a)\b\u0001\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150 ¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010$\u001a=\u0010%\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u001f\b\b\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0001\u001aE\u0010%\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u001f\b\b\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0001\u001aE\u0010%\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00012\u001f\b\b\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0001\u001aM\u0010%\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u001f\b\b\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0001\u001aZ\u0010&\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112/\b\b\u0010\u0012\u001a)\b\u0001\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150 ¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010#\u001aR\u0010&\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f*\u00020\u000e2/\b\b\u0010\u0012\u001a)\b\u0001\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150 ¢\u0006\u0002\b\"H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"*\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u00048\u00c6\u0002¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006'" }, d2 = { "DEFAULT_LISTENER_PRIORITY", "", "instance", "T", "Ljava/lang/Class;", "getInstance$annotations", "(Ljava/lang/Class;)V", "getInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", "concurrentListener", "", "E", "Lcakeslayers/team/eventsystem/Event;", "owner", "Lcakeslayers/team/eventsystem/IListenerOwner;", "eventClass", "alwaysListening", "", "function", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;ZLkotlin/jvm/functions/Function2;)V", "getEventBus", "Lcakeslayers/team/eventsystem/EventBus;", "listener", "priority", "Lkotlin/Function1;", "parallelListener", "(Lcakeslayers/team/eventsystem/IListenerOwner;ZLkotlin/jvm/functions/Function2;)V", "(Lcakeslayers/team/eventsystem/IListenerOwner;Lkotlin/jvm/functions/Function2;)V", "safeConcurrentListener", "Lkotlin/Function3;", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "Lkotlin/ExtensionFunctionType;", "(Lcakeslayers/team/eventsystem/IListenerOwner;ZLkotlin/jvm/functions/Function3;)V", "(Lcakeslayers/team/eventsystem/IListenerOwner;Lkotlin/jvm/functions/Function3;)V", "safeListener", "safeParallelListener", "Stay" })
public final class ListenersKt
{
    public static final int DEFAULT_LISTENER_PRIORITY = 0;
    
    public static final <E extends Event> void listener(@NotNull final IListenerOwner owner, @NotNull final Class<E> eventClass, final int priority, final boolean alwaysListening, @NotNull final Function1<? super E, Unit> function) {
        Intrinsics.checkNotNullParameter((Object)owner, "owner");
        Intrinsics.checkNotNullParameter((Object)eventClass, "eventClass");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        final EventBus eventBus = getEventBus(eventClass);
        final Listener listener = new Listener((Object)owner, eventBus.getBusID(), priority, (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity((Object)function, 1));
        if (alwaysListening) {
            eventBus.subscribe(listener);
        }
        else {
            owner.register(listener);
        }
    }
    
    public static final <E extends Event> void parallelListener(@NotNull final IListenerOwner owner, @NotNull final Class<E> eventClass, final boolean alwaysListening, @NotNull final Function2<? super E, ? super Continuation<? super Unit>, ?> function) {
        Intrinsics.checkNotNullParameter((Object)owner, "owner");
        Intrinsics.checkNotNullParameter((Object)eventClass, "eventClass");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        final EventBus eventBus = getEventBus(eventClass);
        final ParallelListener listener = new ParallelListener(owner, eventBus.getBusID(), (Function2<Object, ? super Continuation<? super Unit>, ?>)function);
        if (alwaysListening) {
            eventBus.subscribe(listener);
        }
        else {
            owner.register(listener);
        }
    }
    
    public static final <E extends Event> void concurrentListener(@NotNull final IListenerOwner owner, @NotNull final Class<E> eventClass, final boolean alwaysListening, @NotNull final Function2<? super E, ? super Continuation<? super Unit>, ?> function) {
        Intrinsics.checkNotNullParameter((Object)owner, "owner");
        Intrinsics.checkNotNullParameter((Object)eventClass, "eventClass");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        final EventBus eventBus = getEventBus(eventClass);
        final Listener listener = new Listener((Object)owner, eventBus.getBusID(), Integer.MAX_VALUE, (Function1)new ListenersKt$concurrentListener$listener.ListenersKt$concurrentListener$listener$1((Function2)function));
        if (alwaysListening) {
            eventBus.subscribe(listener);
        }
        else {
            owner.register(listener);
        }
    }
    
    private static final EventBus getEventBus(final Class<? extends Event> eventClass) {
        IEventPosting eventPosting;
        try {
            final Class $this$instance$iv = eventClass;
            final int $i$f$getInstance = 0;
            eventPosting = (IEventPosting)$this$instance$iv.getDeclaredField("INSTANCE").get(null);
        }
        catch (NoSuchFieldException e) {
            final Object value = eventClass.getDeclaredField("Companion").get(null);
            if (value == null) {
                throw new NullPointerException("null cannot be cast to non-null type cakeslayers.team.eventsystem.IEventPosting");
            }
            eventPosting = (IEventPosting)value;
        }
        return eventPosting.getEventBus();
    }
    
    public static final <T> T getInstance(@NotNull final Class<? extends T> $this$instance) {
        Intrinsics.checkNotNullParameter((Object)$this$instance, "<this>");
        final int $i$f$getInstance = 0;
        return (T)$this$instance.getDeclaredField("INSTANCE").get(null);
    }
}
