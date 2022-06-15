//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.client;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;

public class NickHider extends Module
{
    public final Setting<String> NameString;
    private static NickHider instance;
    
    public NickHider() {
        super("NickHider", "Changes name", Category.CLIENT, false, false, false);
        this.NameString = (Setting<String>)this.register(new Setting("Name", (T)"New Name Here..."));
        NickHider.instance = this;
    }
    
    @Override
    public void onEnable() {
        Command.sendMessage(ChatFormatting.GRAY + "Success! Name succesfully changed to " + ChatFormatting.GREEN + this.NameString.getValue());
    }
    
    public static NickHider getInstance() {
        if (NickHider.instance == null) {
            NickHider.instance = new NickHider();
        }
        return NickHider.instance;
    }
}
