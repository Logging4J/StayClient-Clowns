//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.font;

import net.minecraft.client.*;
import me.alpha432.stay.client.*;

public class FontUtils
{
    private static final Minecraft mc;
    
    public static float drawStringWithShadow(final boolean customFont, final String text, final int x, final int y, final int color) {
        if (customFont) {
            return Stay.fontRenderer.drawStringWithShadow(text, (float)x, (float)y, color);
        }
        return (float)FontUtils.mc.fontRenderer.drawStringWithShadow(text, (float)x, (float)y, color);
    }
    
    public static int getStringWidth(final boolean customFont, final String str) {
        if (customFont) {
            return Stay.fontRenderer.getStringWidth(str);
        }
        return FontUtils.mc.fontRenderer.getStringWidth(str);
    }
    
    public static int getFontHeight(final boolean customFont) {
        if (customFont) {
            return Stay.fontRenderer.getFontHeight();
        }
        return FontUtils.mc.fontRenderer.FONT_HEIGHT;
    }
    
    public static float drawKeyStringWithShadow(final boolean customFont, final String text, final int x, final int y, final int color) {
        if (customFont) {
            return Stay.fontRenderer.drawStringWithShadow(text, (float)x, (float)y, color);
        }
        return (float)FontUtils.mc.fontRenderer.drawStringWithShadow(text, (float)x, (float)y, color);
    }
    
    static {
        mc = Minecraft.getMinecraft();
    }
}
