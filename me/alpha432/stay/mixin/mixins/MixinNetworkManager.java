//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.event.*;
import org.spongepowered.asm.mixin.injection.*;
import io.netty.channel.*;

@Mixin(value = { NetworkManager.class }, priority = 312312)
public class MixinNetworkManager
{
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void onSendPacketPre(final Packet<?> packet, final CallbackInfo info) {
        final PacketEvent.Send event = new PacketEvent.Send((Packet)packet);
        final cakeslayers.team.eventsystem.impl.PacketEvent.Send send = new cakeslayers.team.eventsystem.impl.PacketEvent.Send((Packet)packet);
        event.post();
        send.post();
        if (event.isCanceled() || send.getCancelled()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("RETURN") })
    private void sendPacketPost(final Packet<?> packet, final CallbackInfo callbackInfo) {
        if (packet != null) {
            final cakeslayers.team.eventsystem.impl.PacketEvent.PostSend event = new cakeslayers.team.eventsystem.impl.PacketEvent.PostSend((Packet)packet);
            event.post();
        }
    }
    
    @Inject(method = { "channelRead0" }, at = { @At("HEAD") }, cancellable = true)
    private void onChannelReadPre(final ChannelHandlerContext context, final Packet<?> packet, final CallbackInfo info) {
        final PacketEvent.Receive event = new PacketEvent.Receive((Packet)packet);
        final cakeslayers.team.eventsystem.impl.PacketEvent.Receive receive = new cakeslayers.team.eventsystem.impl.PacketEvent.Receive((Packet)packet);
        event.post();
        receive.post();
        if (event.isCanceled() || receive.getCancelled()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "channelRead0" }, at = { @At("RETURN") })
    private void channelReadPost(final ChannelHandlerContext context, final Packet<?> packet, final CallbackInfo callbackInfo) {
        if (packet != null) {
            final cakeslayers.team.eventsystem.impl.PacketEvent.PostReceive event = new cakeslayers.team.eventsystem.impl.PacketEvent.PostReceive((Packet)packet);
            event.post();
        }
    }
}
