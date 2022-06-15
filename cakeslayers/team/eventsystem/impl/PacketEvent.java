//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0013\b\u0004\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent;", "Lcakeslayers/team/eventsystem/Event;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "getPacket", "()Lnet/minecraft/network/Packet;", "PostReceive", "PostSend", "Receive", "Send", "Lcakeslayers/team/eventsystem/impl/PacketEvent$Receive;", "Lcakeslayers/team/eventsystem/impl/PacketEvent$PostReceive;", "Lcakeslayers/team/eventsystem/impl/PacketEvent$Send;", "Lcakeslayers/team/eventsystem/impl/PacketEvent$PostSend;", "Stay" })
public abstract class PacketEvent implements Event
{
    @NotNull
    private final Packet<?> packet;
    
    private PacketEvent(final Packet<?> packet) {
        this.packet = packet;
    }
    
    @NotNull
    public final Packet<?> getPacket() {
        return this.packet;
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0016B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u0018\u0010\u0007\u001a\u00020\bX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$Receive;", "Lcakeslayers/team/eventsystem/impl/PacketEvent;", "Lcakeslayers/team/eventsystem/ICancellable;", "Lcakeslayers/team/eventsystem/IEventPosting;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "cancelled", "", "getCancelled", "()Z", "setCancelled", "(Z)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "cancel", "", "post", "event", "", "Companion", "Stay" })
    public static final class Receive extends PacketEvent implements ICancellable, IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        private final /* synthetic */ Cancellable $$delegate_0;
        private final /* synthetic */ Companion $$delegate_1;
        
        public Receive(@NotNull final Packet<?> packet) {
            Intrinsics.checkNotNullParameter((Object)packet, "packet");
            super(packet, null);
            this.$$delegate_0 = new Cancellable();
            this.$$delegate_1 = Receive.Companion;
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
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$Receive$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$PostReceive;", "Lcakeslayers/team/eventsystem/impl/PacketEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Companion", "Stay" })
    public static final class PostReceive extends PacketEvent implements IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        private final /* synthetic */ Companion $$delegate_0;
        
        public PostReceive(@NotNull final Packet<?> packet) {
            Intrinsics.checkNotNullParameter((Object)packet, "packet");
            super(packet, null);
            this.$$delegate_0 = PostReceive.Companion;
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
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$PostReceive$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0016B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0001J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u0018\u0010\u0007\u001a\u00020\bX\u0096\u000f¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$Send;", "Lcakeslayers/team/eventsystem/impl/PacketEvent;", "Lcakeslayers/team/eventsystem/ICancellable;", "Lcakeslayers/team/eventsystem/IEventPosting;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "cancelled", "", "getCancelled", "()Z", "setCancelled", "(Z)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "cancel", "", "post", "event", "", "Companion", "Stay" })
    public static final class Send extends PacketEvent implements ICancellable, IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        private final /* synthetic */ Cancellable $$delegate_0;
        private final /* synthetic */ Companion $$delegate_1;
        
        public Send(@NotNull final Packet<?> packet) {
            Intrinsics.checkNotNullParameter((Object)packet, "packet");
            super(packet, null);
            this.$$delegate_0 = new Cancellable();
            this.$$delegate_1 = Send.Companion;
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
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$Send$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$PostSend;", "Lcakeslayers/team/eventsystem/impl/PacketEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Companion", "Stay" })
    public static final class PostSend extends PacketEvent implements IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        private final /* synthetic */ Companion $$delegate_0;
        
        public PostSend(@NotNull final Packet<?> packet) {
            Intrinsics.checkNotNullParameter((Object)packet, "packet");
            super(packet, null);
            this.$$delegate_0 = PostSend.Companion;
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
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/PacketEvent$PostSend$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
}
