//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.command.commands;

import me.alpha432.stay.features.command.*;
import me.alpha432.stay.client.*;
import com.mojang.realmsclient.gui.*;
import java.util.*;

public class HelpCommand extends Command
{
    public HelpCommand() {
        super("help");
    }
    
    public void execute(final String[] commands) {
        sendMessage("Commands: ");
        for (final Command command : Stay.commandManager.getCommands()) {
            sendMessage(ChatFormatting.GRAY + Stay.commandManager.getPrefix() + command.getName());
        }
    }
}
