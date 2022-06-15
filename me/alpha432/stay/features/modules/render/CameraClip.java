//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;

public class CameraClip extends Module
{
    public Setting<Double> distance;
    
    public CameraClip() {
        super("Camera Clip", "CameraClip", Module.Category.VISUAL, false, false, false);
        this.distance = (Setting<Double>)this.register(new Setting("Distance", (T)10.0, (T)(-10.0), (T)50.0));
    }
}
