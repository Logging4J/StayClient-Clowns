//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.client.*;

public class Timers extends Module
{
    private final Setting<Double> ticks;
    public Setting<Boolean> sync;
    public Setting<Boolean> bypass;
    private final Setting<Integer> ISFM;
    public int i;
    public int x;
    
    public Timers() {
        super("Timer", "Modifies client-side ticks", Category.MISC, false, false, false);
        this.ticks = (Setting<Double>)this.register(new Setting("Timer", (T)4.0, (T)0.0, (T)10.0));
        this.sync = (Setting<Boolean>)this.register(new Setting("TPS Sync", (T)false));
        this.bypass = (Setting<Boolean>)this.register(new Setting("bypass xin", (T)false));
        this.ISFM = (Setting<Integer>)this.register(new Setting("bypas sspeed", (T)50, (T)0, (T)100, v -> this.bypass.getValue()));
        this.i = 0;
        this.x = 0;
    }
    
    @Override
    public void onUpdate() {
        if (nullCheck()) {
            return;
        }
        if (this.bypass.getValue()) {
            if (this.i <= this.ISFM.getValue()) {
                ++this.i;
                Timers.mc.timer.tickLength = (this.sync.getValue() ? (50.0f / (Stay.serverManager.getTPS() / 20.0f)) : ((float)(50.0 / this.ticks.getValue())));
                this.x = 0;
            }
            else if (this.x <= this.ISFM.getValue() - this.ISFM.getValue() / 2 / 2) {
                ++this.x;
                Timers.mc.timer.tickLength = 50.0f;
            }
            else {
                this.i = 0;
            }
        }
        else {
            Timers.mc.timer.tickLength = (this.sync.getValue() ? (50.0f / (Stay.serverManager.getTPS() / 20.0f)) : ((float)(50.0 / this.ticks.getValue())));
        }
    }
    
    @Override
    public void onDisable() {
        Timers.mc.timer.tickLength = 50.0f;
    }
}
