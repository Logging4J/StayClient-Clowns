//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.entity.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.client.*;
import org.lwjgl.opengl.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderLivingBase.class })
public abstract class MixinRendererLivingEntity<T extends EntityLivingBase> extends Render<T>
{
    protected MixinRendererLivingEntity() {
        super((RenderManager)null);
    }
    
    @Inject(method = { "doRender" }, at = { @At("HEAD") })
    public void doRenderPre(final T entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks, final CallbackInfo info) {
        if (Stay.moduleManager.isModuleEnabled("TexturedChams") && entity != null) {
            GL11.glEnable(32823);
            GL11.glPolygonOffset(1.0f, -1100000.0f);
        }
    }
    
    @Inject(method = { "doRender" }, at = { @At("RETURN") })
    public void doRenderPost(final T entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks, final CallbackInfo info) {
        if (Stay.moduleManager.isModuleEnabled("TexturedChams") && entity != null) {
            GL11.glPolygonOffset(1.0f, 1000000.0f);
            GL11.glDisable(32823);
        }
    }
}
