//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import me.alpha432.stay.client.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class ChatModifier extends Module
{
    private static ChatModifier INSTANCE;
    public Setting<Boolean> clean;
    public Setting<Boolean> infinite;
    public boolean check;
    
    public ChatModifier() {
        super("BetterChat", "Modifies your chat", Category.MISC, true, false, false);
        this.clean = (Setting<Boolean>)this.register(new Setting("NoChatBackground", (T)false, "Cleans your chat"));
        this.infinite = (Setting<Boolean>)this.register(new Setting("InfiniteChat", (T)false, "Makes your chat infinite."));
        this.setInstance();
    }
    
    public static ChatModifier getInstance() {
        if (ChatModifier.INSTANCE == null) {
            ChatModifier.INSTANCE = new ChatModifier();
        }
        return ChatModifier.INSTANCE;
    }
    
    private void setInstance() {
        ChatModifier.INSTANCE = this;
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (event.getPacket() instanceof CPacketChatMessage) {
            final String s = ((CPacketChatMessage)event.getPacket()).getMessage();
            this.check = !s.startsWith(Stay.commandManager.getPrefix());
        }
    }
    
    static {
        ChatModifier.INSTANCE = new ChatModifier();
    }
}
