//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.util.player.*;
import cakeslayers.team.eventsystem.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015" }, d2 = { "Lcakeslayers/team/eventsystem/impl/CrystalSpawnEvent;", "Lcakeslayers/team/eventsystem/Event;", "Lcakeslayers/team/eventsystem/IEventPosting;", "entityID", "", "crystalDamage", "Lme/alpha432/stay/util/player/CrystalDamage;", "(ILme/alpha432/stay/util/player/CrystalDamage;)V", "getCrystalDamage", "()Lme/alpha432/stay/util/player/CrystalDamage;", "getEntityID", "()I", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Companion", "Stay" })
public final class CrystalSpawnEvent implements Event, IEventPosting
{
    @NotNull
    public static final Companion Companion;
    private final int entityID;
    @NotNull
    private final CrystalDamage crystalDamage;
    private final /* synthetic */ Companion $$delegate_0;
    
    public CrystalSpawnEvent(final int entityID, @NotNull final CrystalDamage crystalDamage) {
        Intrinsics.checkNotNullParameter((Object)crystalDamage, "crystalDamage");
        this.entityID = entityID;
        this.crystalDamage = crystalDamage;
        this.$$delegate_0 = CrystalSpawnEvent.Companion;
    }
    
    public final int getEntityID() {
        return this.entityID;
    }
    
    @NotNull
    public final CrystalDamage getCrystalDamage() {
        return this.crystalDamage;
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/CrystalSpawnEvent$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
    public static final class Companion extends EventBus
    {
        private Companion() {
        }
    }
}
