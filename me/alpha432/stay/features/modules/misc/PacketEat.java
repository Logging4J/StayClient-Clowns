//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;

public class PacketEat extends Module
{
    private static PacketEat INSTANCE;
    
    public PacketEat() {
        super("PacketEat", "PacketEat", Category.MISC, true, false, false);
        this.setInstance();
    }
    
    public static PacketEat getInstance() {
        if (PacketEat.INSTANCE != null) {
            return PacketEat.INSTANCE;
        }
        return PacketEat.INSTANCE = new PacketEat();
    }
    
    private void setInstance() {
        PacketEat.INSTANCE = this;
    }
    
    static {
        PacketEat.INSTANCE = new PacketEat();
    }
}
