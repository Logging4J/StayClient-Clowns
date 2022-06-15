//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import net.minecraftforge.client.event.*;
import java.util.*;
import java.text.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Timestamps extends Module
{
    public Timestamps() {
        super("Timestamps", "Prefixes chat messages with the time", Category.MISC, true, false, false);
    }
    
    @SubscribeEvent
    public void onClientChatReceived(final ClientChatReceivedEvent event) {
        final Date date = new Date();
        final SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm");
        final String strDate = dateFormatter.format(date);
        final TextComponentString time = new TextComponentString(ChatFormatting.RED + "<" + ChatFormatting.GRAY + strDate + ChatFormatting.RED + ">" + ChatFormatting.RESET + " ");
        event.setMessage(time.appendSibling(event.getMessage()));
    }
}
