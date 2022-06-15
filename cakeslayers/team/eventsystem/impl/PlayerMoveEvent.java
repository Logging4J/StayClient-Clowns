//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import net.minecraft.client.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PlayerMoveEvent;", "Lcakeslayers/team/eventsystem/Event;", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "(Lnet/minecraft/client/entity/EntityPlayerSP;)V", "getPlayer", "()Lnet/minecraft/client/entity/EntityPlayerSP;", "Pre", "Lcakeslayers/team/eventsystem/impl/PlayerMoveEvent$Pre;", "Stay" })
public abstract class PlayerMoveEvent implements Event
{
    @NotNull
    private final EntityPlayerSP player;
    
    private PlayerMoveEvent(final EntityPlayerSP player) {
        this.player = player;
    }
    
    @NotNull
    public final EntityPlayerSP getPlayer() {
        return this.player;
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\"\u001a\u00020#H\u0096\u0001J\u0011\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0096\u0001R\u0018\u0010\u0007\u001a\u00020\bX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006(" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PlayerMoveEvent$Pre;", "Lcakeslayers/team/eventsystem/impl/PlayerMoveEvent;", "Lcakeslayers/team/eventsystem/ICancellable;", "Lcakeslayers/team/eventsystem/IEventPosting;", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "(Lnet/minecraft/client/entity/EntityPlayerSP;)V", "cancelled", "", "getCancelled", "()Z", "setCancelled", "(Z)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "isModified", "prevX", "", "prevY", "prevZ", "value", "x", "getX", "()D", "setX", "(D)V", "y", "getY", "setY", "z", "getZ", "setZ", "cancel", "", "post", "event", "", "Companion", "Stay" })
    public static final class Pre extends PlayerMoveEvent implements ICancellable, IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        private final /* synthetic */ Cancellable $$delegate_0;
        private final /* synthetic */ Companion $$delegate_1;
        private final double prevX;
        private final double prevY;
        private final double prevZ;
        
        public Pre(@NotNull final EntityPlayerSP player) {
            Intrinsics.checkNotNullParameter((Object)player, "player");
            super(player, null);
            this.$$delegate_0 = new Cancellable();
            this.$$delegate_1 = Pre.Companion;
            this.prevX = player.motionX;
            this.prevY = player.motionY;
            this.prevZ = player.motionZ;
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
        
        public final boolean isModified() {
            return this.getPlayer().motionX != this.prevX || this.getPlayer().motionY != this.prevY || this.getPlayer().motionZ != this.prevZ;
        }
        
        public final double getX() {
            return this.getCancelled() ? 0.0 : this.getPlayer().motionX;
        }
        
        public final void setX(final double value) {
            if (!this.getCancelled()) {
                this.getPlayer().motionX = value;
            }
        }
        
        public final double getY() {
            return this.getCancelled() ? 0.0 : this.getPlayer().motionY;
        }
        
        public final void setY(final double value) {
            if (!this.getCancelled()) {
                this.getPlayer().motionY = value;
            }
        }
        
        public final double getZ() {
            return this.getCancelled() ? 0.0 : this.getPlayer().motionZ;
        }
        
        public final void setZ(final double value) {
            if (!this.getCancelled()) {
                this.getPlayer().motionZ = value;
            }
        }
        
        static {
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PlayerMoveEvent$Pre$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
}
