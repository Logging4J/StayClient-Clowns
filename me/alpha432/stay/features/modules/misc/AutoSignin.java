//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import me.alpha432.stay.features.command.*;

public class AutoSignin extends Module
{
    public Setting<String> ID;
    public Setting<String> custom;
    public Setting<String> ip;
    private Boolean six;
    
    public AutoSignin() {
        super("AutoSignin", "Automatically send specified information", Category.MISC, true, false, false);
        this.ID = (Setting<String>)this.register(new Setting("ID", (T)"you id"));
        this.custom = (Setting<String>)this.register(new Setting("password", (T)"you password"));
        this.ip = (Setting<String>)this.register(new Setting("IP", (T)"serverIP"));
        this.six = false;
    }
    
    @Override
    public void onEnable() {
        if (nullCheck()) {
            return;
        }
        this.disable();
        if (AutoSignin.mc.player.getName().equals(this.ID.getValue())) {
            if (!this.custom.getValue().equals("/l you password") && !this.custom.getValue().equals("")) {
                if (AutoSignin.mc.getCurrentServerData().serverIP.equals(this.ip.getValue())) {
                    Util.mc.player.connection.sendPacket((Packet)new CPacketChatMessage("/l " + this.custom.getValue()));
                }
                else {
                    Command.sendMessage("Incorrect IP address");
                }
            }
            else {
                Command.sendMessage("Please enter your password");
            }
        }
        else {
            Command.sendMessage("The set ID does not match");
        }
    }
}
