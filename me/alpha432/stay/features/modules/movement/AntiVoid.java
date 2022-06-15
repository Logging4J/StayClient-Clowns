//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;

public class AntiVoid extends Module
{
    public Setting<Mode> mode;
    public Setting<Boolean> display;
    
    public AntiVoid() {
        super("AntiVoid", "Glitches you up from void.", Module.Category.MOVEMENT, false, false, false);
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.BOUNCE));
        this.display = (Setting<Boolean>)this.register(new Setting("Display", (T)true));
    }
    
    public void onUpdate() {
        final double yLevel = AntiVoid.mc.player.posY;
        if (yLevel <= 0.5) {
            Command.sendMessage(ChatFormatting.RED + "Player " + ChatFormatting.GREEN + AntiVoid.mc.player.getName() + ChatFormatting.RED + " is in the void!");
            if (this.mode.getValue().equals(Mode.BOUNCE)) {
                AntiVoid.mc.player.moveVertical = 10.0f;
                AntiVoid.mc.player.jump();
            }
            if (this.mode.getValue().equals(Mode.LAUNCH)) {
                AntiVoid.mc.player.moveVertical = 100.0f;
                AntiVoid.mc.player.jump();
            }
        }
        else {
            AntiVoid.mc.player.moveVertical = 0.0f;
        }
    }
    
    public void onDisable() {
        AntiVoid.mc.player.moveVertical = 0.0f;
    }
    
    public String getDisplayInfo() {
        if (this.display.getValue()) {
            if (this.mode.getValue().equals(Mode.BOUNCE)) {
                return "Bounce";
            }
            if (this.mode.getValue().equals(Mode.LAUNCH)) {
                return "Launch";
            }
        }
        return null;
    }
    
    public enum Mode
    {
        BOUNCE, 
        LAUNCH;
    }
}
