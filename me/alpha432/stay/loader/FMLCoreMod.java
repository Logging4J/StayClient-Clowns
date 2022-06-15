//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.loader;

import net.minecraftforge.fml.relauncher.*;
import me.alpha432.stay.mixin.*;
import java.util.*;

@IFMLLoadingPlugin.Name("Stay")
public class FMLCoreMod implements IFMLLoadingPlugin
{
    public FMLCoreMod() {
        try {
            Loader.load();
            if (ForgeEntry.shouldLoad) {
                StayMixinLoader.load();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            if (ForgeEntry.shouldLoad) {
                StayMixinLoader.load();
            }
        }
    }
    
    public String[] getASMTransformerClass() {
        return new String[0];
    }
    
    public String getModContainerClass() {
        return null;
    }
    
    public String getSetupClass() {
        return null;
    }
    
    public void injectData(final Map<String, Object> data) {
    }
    
    public String getAccessTransformerClass() {
        return null;
    }
}
