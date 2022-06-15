//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.interfaces;

import net.minecraft.client.*;
import java.util.*;

public interface Globals
{
    public static final Minecraft mc = Minecraft.getMinecraft();
    public static final Random random = new Random();
    public static final char SECTIONSIGN = '§';
    
    default boolean nullCheck() {
        return Globals.mc.player == null || Globals.mc.world == null;
    }
}
