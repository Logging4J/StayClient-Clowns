//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;

public class Fov extends Module
{
    public Setting<Integer> fov;
    float fovOld;
    
    public Fov() {
        super("Fov", "tabbott mode", Module.Category.VISUAL, false, false, false);
        this.fov = (Setting<Integer>)this.register(new Setting("Fov", (T)130, (T)90, (T)179));
    }
    
    public void onEnable() {
        this.fovOld = Fov.mc.gameSettings.fovSetting;
    }
    
    public void onUpdate() {
        Fov.mc.gameSettings.fovSetting = this.fov.getValue();
    }
    
    public void onDisable() {
        Fov.mc.gameSettings.fovSetting = this.fovOld;
    }
}
