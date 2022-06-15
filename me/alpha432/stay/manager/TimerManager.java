//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.features.*;

public class TimerManager extends Feature
{
    private float timer;
    
    public TimerManager() {
        this.timer = 1.0f;
    }
    
    public void unload() {
        this.timer = 1.0f;
        TimerManager.mc.timer.tickLength = 50.0f;
    }
    
    public void update() {
        TimerManager.mc.timer.tickLength = 50.0f / ((this.timer <= 0.0f) ? 0.1f : this.timer);
    }
    
    public void setTimer(final float timer) {
        if (timer > 0.0f) {
            this.timer = timer;
        }
    }
    
    public float getTimer() {
        return this.timer;
    }
    
    public void reset() {
        this.timer = 1.0f;
    }
}
