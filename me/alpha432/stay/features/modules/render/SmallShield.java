//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;

public class SmallShield extends Module
{
    public Setting<Boolean> normalOffset;
    public Setting<Float> offset;
    public Setting<Float> offX;
    public Setting<Float> offY;
    public Setting<Float> mainX;
    public Setting<Float> mainY;
    private static SmallShield INSTANCE;
    
    public SmallShield() {
        super("SmallShield", "Makes you offhand lower.", Module.Category.VISUAL, false, false, false);
        this.normalOffset = (Setting<Boolean>)this.register(new Setting("OffNormal", (T)false));
        this.offset = (Setting<Float>)this.register(new Setting("Offset", (T)0.7f, (T)0.0f, (T)1.0f, v -> this.normalOffset.getValue()));
        this.offX = (Setting<Float>)this.register(new Setting("OffX", (T)0.0f, (T)(-1.0f), (T)1.0f, v -> !this.normalOffset.getValue()));
        this.offY = (Setting<Float>)this.register(new Setting("OffY", (T)0.0f, (T)(-1.0f), (T)1.0f, v -> !this.normalOffset.getValue()));
        this.mainX = (Setting<Float>)this.register(new Setting("MainX", (T)0.0f, (T)(-1.0f), (T)1.0f));
        this.mainY = (Setting<Float>)this.register(new Setting("MainY", (T)0.0f, (T)(-1.0f), (T)1.0f));
        this.setInstance();
    }
    
    private void setInstance() {
        SmallShield.INSTANCE = this;
    }
    
    public void onUpdate() {
        if (this.normalOffset.getValue()) {
            SmallShield.mc.entityRenderer.itemRenderer.equippedProgressOffHand = this.offset.getValue();
        }
    }
    
    public static SmallShield getINSTANCE() {
        if (SmallShield.INSTANCE == null) {
            SmallShield.INSTANCE = new SmallShield();
        }
        return SmallShield.INSTANCE;
    }
    
    static {
        SmallShield.INSTANCE = new SmallShield();
    }
}
