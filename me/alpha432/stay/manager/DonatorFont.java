//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.util.interfaces.*;
import me.alpha432.stay.features.gui.font.*;
import java.awt.*;

public class DonatorFont implements Globals
{
    private final String fontName = "Tahoma";
    private final int smallSize = 15;
    private final int mediumSize = 19;
    private final int largeSize = 24;
    private final CustomFont smallFont;
    private final CustomFont mediumFont;
    private final CustomFont largeFont;
    
    public DonatorFont() {
        this.smallFont = new CustomFont(new Font("Tahoma", 0, 15), true, false);
        this.mediumFont = new CustomFont(new Font("Tahoma", 0, 19), true, false);
        this.largeFont = new CustomFont(new Font("Tahoma", 0, 24), true, false);
    }
    
    public void drawSmallStringRainbow(final String string, final float x, final float y, final int colour) {
        this.smallFont.drawStringWithShadow(string, (double)x, (double)y, colour);
    }
    
    public void drawMediumStringRainbow(final String string, final float x, final float y, final int colour) {
        this.mediumFont.drawStringWithShadow(string, (double)x, (double)y, colour);
    }
    
    public void drawLargeStringRainbow(final String string, final float x, final float y, final int colour) {
        this.largeFont.drawStringWithShadow(string, (double)x, (double)y, colour);
    }
}
