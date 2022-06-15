//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;

public class CapesModule extends Module
{
    public Setting<ModeS> Mode;
    public Setting<String> URL;
    public Setting<Boolean> ros;
    private Setting<Integer> delay;
    private final Timer timer;
    
    public CapesModule() {
        super("Capes", "CapesModule", Module.Category.VISUAL, false, false, false);
        this.Mode = (Setting<ModeS>)this.register(new Setting("CapesMod", (T)ModeS.STAY));
        this.URL = (Setting<String>)this.register(new Setting("URL", (T)"URL", v -> this.Mode.getValue() == ModeS.URL));
        this.ros = (Setting<Boolean>)this.register(new Setting("Auto", (T)false));
        this.delay = (Setting<Integer>)this.register(new Setting("Delay", (T)100, (T)0, (T)10000));
        this.timer = new Timer();
    }
    
    public void onUpdate() {
        if (fullNullCheck()) {
            return;
        }
        if (this.Mode.getValue() == ModeS.URL) {
            return;
        }
        if (!this.ros.getValue()) {
            return;
        }
        if (!this.timer.passedMs(this.delay.getValue())) {
            return;
        }
        if (this.Mode.getValue() == ModeS.STAY) {
            this.Mode.setValue(ModeS.Future);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.Future) {
            this.Mode.setValue(ModeS.GS1);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.GS1) {
            this.Mode.setValue(ModeS.GS2);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.GS2) {
            this.Mode.setValue(ModeS.LJM);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.LJM) {
            this.Mode.setValue(ModeS.CAPE1);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE1) {
            this.Mode.setValue(ModeS.CAPE2);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE2) {
            this.Mode.setValue(ModeS.CAPE3);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE3) {
            this.Mode.setValue(ModeS.CAPE4);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE4) {
            this.Mode.setValue(ModeS.CAPE5);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE5) {
            this.Mode.setValue(ModeS.CAPE6);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE6) {
            this.Mode.setValue(ModeS.CAPE7);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE7) {
            this.Mode.setValue(ModeS.CAPE8);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE8) {
            this.Mode.setValue(ModeS.CAPE9);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE9) {
            this.Mode.setValue(ModeS.CAPE10);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE10) {
            this.Mode.setValue(ModeS.CAPE11);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE11) {
            this.Mode.setValue(ModeS.CAPE12);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE12) {
            this.Mode.setValue(ModeS.CAPE13);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE13) {
            this.Mode.setValue(ModeS.CAPE14);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE14) {
            this.Mode.setValue(ModeS.CAPE15);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE15) {
            this.Mode.setValue(ModeS.CAPE16);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE16) {
            this.Mode.setValue(ModeS.CAPE17);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE17) {
            this.Mode.setValue(ModeS.CAPE18);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE18) {
            this.Mode.setValue(ModeS.CAPE19);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE19) {
            this.Mode.setValue(ModeS.CAPE20);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE20) {
            this.Mode.setValue(ModeS.CAPE21);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE21) {
            this.Mode.setValue(ModeS.CAPE22);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE22) {
            this.Mode.setValue(ModeS.CAPE23);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE23) {
            this.Mode.setValue(ModeS.CAPE24);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE24) {
            this.Mode.setValue(ModeS.CAPE25);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE25) {
            this.Mode.setValue(ModeS.CAPE26);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.CAPE26) {
            this.Mode.setValue(ModeS.WUT1);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.WUT1) {
            this.Mode.setValue(ModeS.WUT2);
            this.timer.reset();
            return;
        }
        if (this.Mode.getValue() == ModeS.WUT2) {
            this.Mode.setValue(ModeS.STAY);
            this.timer.reset();
        }
    }
    
    public enum ModeS
    {
        STAY, 
        Future, 
        GS1, 
        GS2, 
        LJM, 
        CAPE1, 
        CAPE2, 
        CAPE3, 
        CAPE4, 
        CAPE5, 
        CAPE6, 
        CAPE7, 
        CAPE8, 
        CAPE9, 
        CAPE10, 
        CAPE11, 
        CAPE12, 
        CAPE13, 
        CAPE14, 
        CAPE15, 
        CAPE16, 
        CAPE17, 
        CAPE18, 
        CAPE19, 
        CAPE20, 
        CAPE21, 
        CAPE22, 
        CAPE23, 
        CAPE24, 
        CAPE25, 
        CAPE26, 
        WUT1, 
        WUT2, 
        URL;
    }
}
