//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lme/alpha432/stay/event/PacketEvent;", "Lme/alpha432/stay/event/EventStage;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "getPacket", "()Lnet/minecraft/network/Packet;", "Receive", "Send", "Stay" })
public class PacketEvent extends EventStage
{
    @NotNull
    private final Packet<?> packet;
    
    public PacketEvent(@NotNull final Packet<?> packet) {
        Intrinsics.checkNotNullParameter((Object)packet, "packet");
        this.packet = packet;
    }
    
    @NotNull
    public final Packet<?> getPacket() {
        return this.packet;
    }
    
    @Cancelable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/event/PacketEvent$Receive;", "Lme/alpha432/stay/event/PacketEvent;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "Stay" })
    public static final class Receive extends PacketEvent
    {
        public Receive(@NotNull final Packet<?> packet) {
            Intrinsics.checkNotNullParameter((Object)packet, "packet");
            super(packet);
        }
    }
    
    @Cancelable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/event/PacketEvent$Send;", "Lme/alpha432/stay/event/PacketEvent;", "packet", "Lnet/minecraft/network/Packet;", "(Lnet/minecraft/network/Packet;)V", "Stay" })
    public static final class Send extends PacketEvent
    {
        public Send(@NotNull final Packet<?> packet) {
            Intrinsics.checkNotNullParameter((Object)packet, "packet");
            super(packet);
        }
    }
}
