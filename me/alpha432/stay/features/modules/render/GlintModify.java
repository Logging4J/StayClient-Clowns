//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.awt.*;
import me.alpha432.stay.client.*;

public class GlintModify extends Module
{
    public Setting<Integer> red;
    public Setting<Integer> green;
    public Setting<Integer> blue;
    public Setting<Boolean> rainbow;
    
    public GlintModify() {
        super("GlintModify", "Changes the enchant glint color", Module.Category.VISUAL, true, false, true);
        this.red = (Setting<Integer>)this.register(new Setting("Red", (T)255, (T)0, (T)255));
        this.green = (Setting<Integer>)this.register(new Setting("Green", (T)255, (T)0, (T)255));
        this.blue = (Setting<Integer>)this.register(new Setting("Blue", (T)255, (T)0, (T)255));
        this.rainbow = (Setting<Boolean>)this.register(new Setting("Rainbow", (T)false));
    }
    
    public static Color getColor(final long offset, final float fade) {
        if (!Stay.moduleManager.getModuleT(GlintModify.class).rainbow.getValue()) {
            return new Color(Stay.moduleManager.getModuleT(GlintModify.class).red.getValue(), Stay.moduleManager.getModuleT(GlintModify.class).green.getValue(), Stay.moduleManager.getModuleT(GlintModify.class).blue.getValue());
        }
        final float hue = (System.nanoTime() + offset) / 1.0E10f % 1.0f;
        final long color = Long.parseLong(Integer.toHexString(Color.HSBtoRGB(hue, 1.0f, 1.0f)), 16);
        final Color c = new Color((int)color);
        return new Color(c.getRed() / 255.0f * fade, c.getGreen() / 255.0f * fade, c.getBlue() / 255.0f * fade, c.getAlpha() / 255.0f);
    }
    
    public void onUpdate() {
        if (this.rainbow.getValue()) {
            this.cycleRainbow();
        }
    }
    
    public void cycleRainbow() {
        final float[] tick_color = { System.currentTimeMillis() % 11520L / 11520.0f };
        final int color_rgb_o = Color.HSBtoRGB(tick_color[0], 0.8f, 0.8f);
        this.red.setValue(color_rgb_o >> 16 & 0xFF);
        this.green.setValue(color_rgb_o >> 8 & 0xFF);
        this.blue.setValue(color_rgb_o & 0xFF);
    }
}
