//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import org.jetbrains.annotations.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.thread.*;
import kotlin.jvm.functions.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\r\u001a\u00020\t\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u00072\u0006\u0010\u000f\u001a\u0002H\u000eH\u0086\b¢\u0006\u0002\u0010\u0010JF\u0010\u0011\u001a\u00020\t\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000e0\u00062\u0014\b\b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\nH\u0086\b\u00f8\u0001\u0000RC\u0010\u0003\u001a4\u00120\u0012.\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\b0\u0005\u0012\u0004\u0012\u00020\n0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015" }, d2 = { "Lme/alpha432/stay/event/Listener;", "", "()V", "listeners", "", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lnet/minecraftforge/fml/common/eventhandler/Event;", "Lkotlin/Function1;", "", "Lme/alpha432/stay/features/modules/Module;", "getListeners", "()Ljava/util/List;", "onEvent", "E", "eventStage", "(Lnet/minecraftforge/fml/common/eventhandler/Event;)V", "register", "clazz", "handler", "module", "Stay" })
public final class Listener
{
    @NotNull
    public static final Listener INSTANCE;
    @NotNull
    private static final List<Pair<Pair<Class<? extends Event>, Function1<Event, Unit>>, Module>> listeners;
    
    private Listener() {
    }
    
    @NotNull
    public final List<Pair<Pair<Class<? extends Event>, Function1<Event, Unit>>, Module>> getListeners() {
        return Listener.listeners;
    }
    
    static {
        INSTANCE = new Listener();
        listeners = new ArrayList<Pair<Pair<Class<? extends Event>, Function1<Event, Unit>>, Module>>();
    }
}
