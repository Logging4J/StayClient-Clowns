//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import net.minecraft.entity.item.*;
import cakeslayers.team.eventsystem.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001a" }, d2 = { "Lcakeslayers/team/eventsystem/impl/CrystalSetDeadEvent;", "Lcakeslayers/team/eventsystem/Event;", "Lcakeslayers/team/eventsystem/IEventPosting;", "x", "", "y", "z", "crystals", "", "Lnet/minecraft/entity/item/EntityEnderCrystal;", "(DDDLjava/util/List;)V", "getCrystals", "()Ljava/util/List;", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "getX", "()D", "getY", "getZ", "post", "", "event", "", "Companion", "Stay" })
public final class CrystalSetDeadEvent implements Event, IEventPosting
{
    @NotNull
    public static final Companion Companion;
    private final double x;
    private final double y;
    private final double z;
    @NotNull
    private final List<EntityEnderCrystal> crystals;
    private final /* synthetic */ Companion $$delegate_0;
    
    public CrystalSetDeadEvent(final double x, final double y, final double z, @NotNull final List<? extends EntityEnderCrystal> crystals) {
        Intrinsics.checkNotNullParameter((Object)crystals, "crystals");
        this.x = x;
        this.y = y;
        this.z = z;
        this.crystals = (List<EntityEnderCrystal>)crystals;
        this.$$delegate_0 = CrystalSetDeadEvent.Companion;
    }
    
    public final double getX() {
        return this.x;
    }
    
    public final double getY() {
        return this.y;
    }
    
    public final double getZ() {
        return this.z;
    }
    
    @NotNull
    public final List<EntityEnderCrystal> getCrystals() {
        return this.crystals;
    }
    
    @NotNull
    public EventBus getEventBus() {
        return this.$$delegate_0.getEventBus();
    }
    
    public void post(@NotNull final Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.post(event);
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/CrystalSetDeadEvent$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
    public static final class Companion extends EventBus
    {
        private Companion() {
        }
    }
}
