//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.basement.*;

public class RPC extends Module
{
    public static RPC INSTANCE;
    public Setting<Boolean> showIP;
    public Setting<String> state;
    
    public RPC() {
        super("RPC", "Discord rich presence", Category.MISC, false, false, false);
        this.showIP = (Setting<Boolean>)this.register(new Setting("ShowIP", (T)true, "Shows the server IP in your discord presence."));
        this.state = (Setting<String>)this.register(new Setting("State", (T)"Stay 1.2.2", "Sets the state of the DiscordRPC."));
        RPC.INSTANCE = this;
    }
    
    @Override
    public void onEnable() {
        DiscordPresence.start();
    }
    
    @Override
    public void onDisable() {
        DiscordPresence.stop();
    }
}
