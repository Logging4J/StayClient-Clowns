//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.features.*;
import me.alpha432.stay.loader.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import me.alpha432.stay.client.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ReloadManager extends Feature
{
    public String prefix;
    
    public void init(final String prefix) {
        this.prefix = prefix;
        ForgeEntry.register((Object)this);
        if (!fullNullCheck()) {
            Command.sendMessage(ChatFormatting.RED + "stay has been unloaded. Type " + prefix + "reload to reload.");
        }
    }
    
    public void unload() {
        ForgeEntry.unregister((Object)this);
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        final CPacketChatMessage packet;
        if (event.getPacket() instanceof CPacketChatMessage && (packet = (CPacketChatMessage)event.getPacket()).getMessage().startsWith(this.prefix) && packet.getMessage().contains("reload")) {
            Stay.load();
            event.setCanceled(true);
        }
    }
}
