//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.loader;

import net.minecraftforge.fml.common.*;
import me.alpha432.stay.mixin.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.common.*;

@Mod(modid = "stay", name = "Stay", version = "1.0 release+b1")
public class ForgeEntry
{
    public static boolean shouldLoad;
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        if (ForgeEntry.shouldLoad) {
            ModHook.preInit();
        }
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        if (ForgeEntry.shouldLoad) {
            ModHook.postInit();
        }
    }
    
    public static void register(final Object obj) {
        MinecraftForge.EVENT_BUS.register(obj);
    }
    
    public static void unregister(final Object obj) {
        MinecraftForge.EVENT_BUS.unregister(obj);
    }
    
    static {
        ForgeEntry.shouldLoad = true;
    }
}
