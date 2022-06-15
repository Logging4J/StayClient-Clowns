//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.features.modules.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;
import me.alpha432.stay.features.setting.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent;", "Lcakeslayers/team/eventsystem/Event;", "()V", "ModuleToggle", "SettingChange", "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent$ModuleToggle;", "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent$SettingChange;", "Stay" })
public abstract class ClientChangeEvent implements Event
{
    private ClientChangeEvent() {
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001R\u0018\u0010\t\u001a\u00020\u0007X\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001b" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent$ModuleToggle;", "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent;", "Lcakeslayers/team/eventsystem/ICancellable;", "Lcakeslayers/team/eventsystem/IEventPosting;", "module", "Lme/alpha432/stay/features/modules/Module;", "toggleTo", "", "(Lme/alpha432/stay/features/modules/Module;Z)V", "cancelled", "getCancelled", "()Z", "setCancelled", "(Z)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "getModule", "()Lme/alpha432/stay/features/modules/Module;", "getToggleTo", "cancel", "", "post", "event", "", "Companion", "Stay" })
    public static final class ModuleToggle extends ClientChangeEvent implements ICancellable, IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final Module module;
        private final boolean toggleTo;
        private final /* synthetic */ Cancellable $$delegate_0;
        private final /* synthetic */ Companion $$delegate_1;
        
        public ModuleToggle(@NotNull final Module module, final boolean toggleTo) {
            Intrinsics.checkNotNullParameter((Object)module, "module");
            super(null);
            this.module = module;
            this.toggleTo = toggleTo;
            this.$$delegate_0 = new Cancellable();
            this.$$delegate_1 = ModuleToggle.Companion;
        }
        
        @NotNull
        public final Module getModule() {
            return this.module;
        }
        
        public final boolean getToggleTo() {
            return this.toggleTo;
        }
        
        public boolean getCancelled() {
            return this.$$delegate_0.getCancelled();
        }
        
        public void setCancelled(final boolean <set-?>) {
            this.$$delegate_0.setCancelled(<set-?>);
        }
        
        public void cancel() {
            this.$$delegate_0.cancel();
        }
        
        @NotNull
        public EventBus getEventBus() {
            return this.$$delegate_1.getEventBus();
        }
        
        public void post(@NotNull final Object event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.$$delegate_1.post(event);
        }
        
        static {
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent$ModuleToggle$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0019B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u0018\u0010\b\u001a\u00020\tX\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent$SettingChange;", "T", "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent;", "Lcakeslayers/team/eventsystem/ICancellable;", "Lcakeslayers/team/eventsystem/IEventPosting;", "setting", "Lme/alpha432/stay/features/setting/Setting;", "(Lme/alpha432/stay/features/setting/Setting;)V", "cancelled", "", "getCancelled", "()Z", "setCancelled", "(Z)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "getSetting", "()Lme/alpha432/stay/features/setting/Setting;", "cancel", "", "post", "event", "", "Companion", "Stay" })
    public static final class SettingChange<T> extends ClientChangeEvent implements ICancellable, IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final Setting<T> setting;
        private final /* synthetic */ Cancellable $$delegate_0;
        private final /* synthetic */ Companion $$delegate_1;
        
        public SettingChange(@NotNull final Setting<T> setting) {
            Intrinsics.checkNotNullParameter((Object)setting, "setting");
            super(null);
            this.setting = setting;
            this.$$delegate_0 = new Cancellable();
            this.$$delegate_1 = SettingChange.Companion;
        }
        
        @NotNull
        public final Setting<T> getSetting() {
            return this.setting;
        }
        
        public boolean getCancelled() {
            return this.$$delegate_0.getCancelled();
        }
        
        public void setCancelled(final boolean <set-?>) {
            this.$$delegate_0.setCancelled(<set-?>);
        }
        
        public void cancel() {
            this.$$delegate_0.cancel();
        }
        
        @NotNull
        public EventBus getEventBus() {
            return this.$$delegate_1.getEventBus();
        }
        
        public void post(@NotNull final Object event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.$$delegate_1.post(event);
        }
        
        static {
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/ClientChangeEvent$SettingChange$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
}
