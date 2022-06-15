//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.command.commands;

import me.alpha432.stay.features.command.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.client.*;

public class PrefixCommand extends Command
{
    public PrefixCommand() {
        super("prefix", new String[] { "<char>" });
    }
    
    public void execute(final String[] commands) {
        if (commands.length == 1) {
            Command.sendMessage(ChatFormatting.GREEN + "Current prefix is " + Stay.commandManager.getPrefix());
            return;
        }
        Stay.commandManager.setPrefix(commands[0]);
        Command.sendMessage("Prefix changed to " + ChatFormatting.GRAY + commands[0]);
    }
}
