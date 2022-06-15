//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;

public class Shaders extends Module
{
    public Setting<Mode> shader;
    private static Shaders INSTANCE;
    
    public Shaders() {
        super("Shaders", "i dont even know anymore", Module.Category.VISUAL, false, false, false);
        this.shader = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.green));
    }
    
    public void onUpdate() {
        if (OpenGlHelper.shadersSupported && Shaders.mc.getRenderViewEntity() instanceof EntityPlayer) {
            if (Shaders.mc.entityRenderer.getShaderGroup() != null) {
                Shaders.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
            }
            try {
                Shaders.mc.entityRenderer.loadShader(new ResourceLocation("shaders/post/" + this.shader.getValue() + ".json"));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (Shaders.mc.entityRenderer.getShaderGroup() != null && Shaders.mc.currentScreen == null) {
            Shaders.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        }
    }
    
    public String getDisplayInfo() {
        return this.shader.currentEnumName();
    }
    
    public void onDisable() {
        if (Shaders.mc.entityRenderer.getShaderGroup() != null) {
            Shaders.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        }
    }
    
    static {
        Shaders.INSTANCE = new Shaders();
    }
    
    public enum Mode
    {
        notch, 
        antialias, 
        art, 
        bits, 
        blobs, 
        blobs2, 
        blur, 
        bumpy, 
        color_convolve, 
        creeper, 
        deconverge, 
        desaturate, 
        entity_outline, 
        flip, 
        fxaa, 
        green, 
        invert, 
        ntsc, 
        outline, 
        pencil, 
        phosphor, 
        scan_pincusion, 
        sobel, 
        spider, 
        wobble;
    }
}
