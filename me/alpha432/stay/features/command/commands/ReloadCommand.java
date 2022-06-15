//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.command.commands;

import me.alpha432.stay.features.command.*;
import me.alpha432.stay.client.*;

public class ReloadCommand extends Command
{
    public ReloadCommand() {
        super("reload", new String[0]);
    }
    
    public void execute(final String[] commands) {
        Stay.reload();
    }
}
