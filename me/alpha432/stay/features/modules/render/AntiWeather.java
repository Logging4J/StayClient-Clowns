//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;

public class AntiWeather extends Module
{
    public AntiWeather() {
        super("AntiWeather", "ARemoves rain from your world ", Module.Category.VISUAL, true, false, false);
    }
    
    public void onTick() {
        if (this.isDisabled()) {
            return;
        }
        if (AntiWeather.mc.world.isRaining()) {
            AntiWeather.mc.world.setRainStrength(0.0f);
        }
    }
}
