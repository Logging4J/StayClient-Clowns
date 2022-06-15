//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.basement.verification;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;
import me.alpha432.stay.util.network.*;
import java.util.*;

@Mod(modid = "cuicanhwid", name = "HWID Verificator", version = "1.0")
public class Verificator
{
    public static final String MODID = "cuicanhwid";
    public static final String NAME = "HWID Verificator";
    public static final String VERSION = "1.0";
    public static List<String> hwidList;
    public static final String KEY = "verify";
    public static final String HWID_URL = "http://47.106.126.97/HWID.txt";
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        Verify();
    }
    
    public static void Verify() {
        Verificator.hwidList = NetworkUtil.getHWIDList();
        if (!Verificator.hwidList.contains(HWIDUtil.getEncryptedHWID("verify"))) {}
    }
    
    static {
        Verificator.hwidList = new ArrayList<String>();
    }
}
