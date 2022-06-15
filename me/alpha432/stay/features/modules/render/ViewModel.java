//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;

public class ViewModel extends Module
{
    public float defaultFov;
    public Setting<Integer> viewmodelDistance;
    public Setting<Boolean> noEat;
    public final Setting<Double> mainX;
    public final Setting<Double> mainY;
    public final Setting<Double> mainZ;
    public final Setting<Double> offX;
    public final Setting<Double> offY;
    public final Setting<Double> offZ;
    public final Setting<Double> mainAngel;
    public final Setting<Double> mainRx;
    public final Setting<Double> mainRy;
    public final Setting<Double> mainRz;
    public final Setting<Double> offAngel;
    public final Setting<Double> offRx;
    public final Setting<Double> offRy;
    public final Setting<Double> offRz;
    public final Setting<Double> mainScaleX;
    public final Setting<Double> mainScaleY;
    public final Setting<Double> mainScaleZ;
    public final Setting<Double> offScaleX;
    public final Setting<Double> offScaleY;
    public final Setting<Double> offScaleZ;
    
    public ViewModel() {
        super("ViewModel", "Changes viewmodel of items", Module.Category.VISUAL, false, false, false);
        this.viewmodelDistance = (Setting<Integer>)this.register(new Setting("ViewmodelDistance", (T)125, (T)0, (T)170, "Changes the distance of the Viewmodel"));
        this.noEat = (Setting<Boolean>)this.register(new Setting("No Eat", (T)false));
        this.mainX = (Setting<Double>)this.register(new Setting("mainX", (T)1.2, (T)0.0, (T)6.0));
        this.mainY = (Setting<Double>)this.register(new Setting("mainY", (T)(-0.95), (T)(-3.0), (T)3.0));
        this.mainZ = (Setting<Double>)this.register(new Setting("mainZ", (T)(-1.45), (T)(-5.0), (T)5.0));
        this.offX = (Setting<Double>)this.register(new Setting("offX", (T)(-1.2), (T)(-6.0), (T)0.0));
        this.offY = (Setting<Double>)this.register(new Setting("offY", (T)(-0.95), (T)(-3.0), (T)3.0));
        this.offZ = (Setting<Double>)this.register(new Setting("offZ", (T)(-1.45), (T)(-5.0), (T)5.0));
        this.mainAngel = (Setting<Double>)this.register(new Setting("mainAngle", (T)0.0, (T)0.0, (T)360.0));
        this.mainRx = (Setting<Double>)this.register(new Setting("mainRotationPointX", (T)0.0, (T)(-1.0), (T)1.0));
        this.mainRy = (Setting<Double>)this.register(new Setting("mainRotationPointY", (T)0.0, (T)(-1.0), (T)1.0));
        this.mainRz = (Setting<Double>)this.register(new Setting("mainRotationPointZ", (T)0.0, (T)(-1.0), (T)1.0));
        this.offAngel = (Setting<Double>)this.register(new Setting("offAngle", (T)0.0, (T)0.0, (T)360.0));
        this.offRx = (Setting<Double>)this.register(new Setting("offRotationPointX", (T)0.0, (T)(-1.0), (T)1.0));
        this.offRy = (Setting<Double>)this.register(new Setting("offRotationPointY", (T)0.0, (T)(-1.0), (T)1.0));
        this.offRz = (Setting<Double>)this.register(new Setting("offRotationPointZ", (T)0.0, (T)(-1.0), (T)1.0));
        this.mainScaleX = (Setting<Double>)this.register(new Setting("mainScaleX", (T)1.0, (T)(-5.0), (T)10.0));
        this.mainScaleY = (Setting<Double>)this.register(new Setting("mainScaleY", (T)1.0, (T)(-5.0), (T)10.0));
        this.mainScaleZ = (Setting<Double>)this.register(new Setting("mainScaleZ", (T)1.0, (T)(-5.0), (T)10.0));
        this.offScaleX = (Setting<Double>)this.register(new Setting("offScaleX", (T)1.0, (T)(-5.0), (T)10.0));
        this.offScaleY = (Setting<Double>)this.register(new Setting("offScaleY", (T)1.0, (T)(-5.0), (T)10.0));
        this.offScaleZ = (Setting<Double>)this.register(new Setting("offScaleZ", (T)1.0, (T)(-5.0), (T)10.0));
    }
}
