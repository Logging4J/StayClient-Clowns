//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.network.internal.*;
import net.minecraft.network.play.client.*;
import io.netty.buffer.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class NoHandShake extends Module
{
    public NoHandShake() {
        super("NoHandshake", "Doesnt send your modlist to the server.", Category.MISC, true, false, false);
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (event.getPacket() instanceof FMLProxyPacket && !NoHandShake.mc.isSingleplayer()) {
            event.setCanceled(true);
        }
        final CPacketCustomPayload packet;
        if (event.getPacket() instanceof CPacketCustomPayload && (packet = (CPacketCustomPayload)event.getPacket()).getChannelName().equals("MC|Brand")) {
            packet.data = new PacketBuffer(Unpooled.buffer()).writeString("vanilla");
        }
    }
}
