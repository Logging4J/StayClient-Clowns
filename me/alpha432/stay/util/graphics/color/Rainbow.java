//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.color;

import java.awt.*;

public class Rainbow
{
    public static Color getColour() {
        return (Color)Colour.fromHSB(System.currentTimeMillis() % 11520L / 11520.0f, 1.0f, 1.0f);
    }
}
