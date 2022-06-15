//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.color;

import java.awt.*;
import net.minecraft.client.renderer.*;

public class GSColor extends Color
{
    private static final long serialVersionUID = 1L;
    
    public GSColor(final int rgb) {
        super(rgb);
    }
    
    public GSColor(final int rgba, final boolean hasalpha) {
        super(rgba, hasalpha);
    }
    
    public GSColor(final int r, final int g, final int b) {
        super(r, g, b);
    }
    
    public GSColor(final int r, final int g, final int b, final int a) {
        super(r, g, b, a);
    }
    
    public GSColor(final Color color) {
        super(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
    
    public GSColor(final GSColor color, final int a) {
        super(color.getRed(), color.getGreen(), color.getBlue(), a);
    }
    
    public static GSColor fromHSB(final float hue, final float saturation, final float brightness) {
        return new GSColor(Color.getHSBColor(hue, saturation, brightness));
    }
    
    public float getHue() {
        return Color.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[0];
    }
    
    public float getSaturation() {
        return Color.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[1];
    }
    
    public float getBrightness() {
        return Color.RGBtoHSB(this.getRed(), this.getGreen(), this.getBlue(), null)[2];
    }
    
    public void glColor() {
        GlStateManager.color(this.getRed() / 255.0f, this.getGreen() / 255.0f, this.getBlue() / 255.0f, this.getAlpha() / 255.0f);
    }
}
