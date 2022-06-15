//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.manager.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ChatSuffix extends Module
{
    public Setting<Boolean> prefix;
    public Setting<String> custom;
    public Setting<Boolean> bb;
    
    public ChatSuffix() {
        super("ChatSuffix", "Appends your message", Category.MISC, true, false, false);
        this.prefix = (Setting<Boolean>)this.register(new Setting("prefix", (T)true));
        this.custom = (Setting<String>)this.register(new Setting("Custom", (T)">", v -> this.prefix.getValue()));
        this.bb = (Setting<Boolean>)this.register(new Setting("edition", (T)true));
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (event.getStage() != 0) {
            return;
        }
        if (ModuleManager.getModuleByName("AutoQueue").isEnabled()) {
            return;
        }
        if (!(event.getPacket() instanceof CPacketChatMessage)) {
            return;
        }
        final CPacketChatMessage packet = (CPacketChatMessage)event.getPacket();
        String message = packet.getMessage();
        if (message.startsWith("/")) {
            return;
        }
        if (this.prefix.getValue()) {
            if ((message = this.custom.getValue() + message + "  >  s\u1d1b\u1d00\u028f").length() >= 256) {
                message = message.substring(0, 256);
            }
        }
        else if ((message += "  >  s\u1d1b\u1d00\u028f").length() >= 256) {
            message = message.substring(0, 256);
        }
        if (this.bb.getValue() && (message = message + "-" + "1.0 release+b1").length() >= 256) {
            message = message.substring(0, 256);
        }
        packet.message = message;
    }
}
