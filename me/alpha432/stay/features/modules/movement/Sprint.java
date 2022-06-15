//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;

public class Sprint extends Module
{
    public Setting<Mode> mode;
    private static Sprint INSTANCE;
    
    public Sprint() {
        super("Sprint", "Modifies sprinting", Module.Category.MOVEMENT, true, false, false);
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.LEGIT));
        this.setInstance();
    }
    
    private void setInstance() {
        Sprint.INSTANCE = this;
    }
    
    public static Sprint getInstance() {
        if (Sprint.INSTANCE != null) {
            return Sprint.INSTANCE;
        }
        return Sprint.INSTANCE = new Sprint();
    }
    
    public void onUpdate() {
        switch (this.mode.getValue().ordinal()) {
            case 1: {
                if (!Sprint.mc.gameSettings.keyBindForward.isKeyDown() && !Sprint.mc.gameSettings.keyBindBack.isKeyDown() && !Sprint.mc.gameSettings.keyBindLeft.isKeyDown() && !Sprint.mc.gameSettings.keyBindRight.isKeyDown()) {
                    return;
                }
                if (Sprint.mc.player.isSneaking()) {
                    return;
                }
                if (Sprint.mc.player.collidedHorizontally) {
                    return;
                }
                if (Sprint.mc.player.getFoodStats().getFoodLevel() <= 6.0f) {
                    return;
                }
                Sprint.mc.player.setSprinting(true);
            }
            case 2: {
                if (!Sprint.mc.gameSettings.keyBindForward.isKeyDown()) {
                    return;
                }
                if (Sprint.mc.player.isSneaking()) {
                    return;
                }
                if (Sprint.mc.player.isHandActive()) {
                    return;
                }
                if (Sprint.mc.player.collidedHorizontally) {
                    return;
                }
                if (Sprint.mc.player.getFoodStats().getFoodLevel() <= 6.0f) {
                    return;
                }
                if (Sprint.mc.currentScreen != null) {
                    return;
                }
                Sprint.mc.player.setSprinting(true);
            }
            default: {}
        }
    }
    
    public void onDisable() {
        if (nullCheck()) {
            return;
        }
        Sprint.mc.player.setSprinting(false);
    }
    
    public String getDisplayInfo() {
        return this.mode.currentEnumName();
    }
    
    static {
        Sprint.INSTANCE = new Sprint();
    }
    
    public enum Mode
    {
        LEGIT, 
        RAGE;
    }
}
