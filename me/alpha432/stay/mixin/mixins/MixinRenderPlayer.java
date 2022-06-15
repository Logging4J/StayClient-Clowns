//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.client.entity.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.model.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.client.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.util.*;
import me.alpha432.stay.features.modules.render.*;
import org.lwjgl.opengl.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.entity.*;

@Mixin({ RenderPlayer.class })
public abstract class MixinRenderPlayer extends RenderLivingBase<AbstractClientPlayer>
{
    public MixinRenderPlayer(final RenderManager renderManagerIn, final ModelBase modelBaseIn, final float shadowSizeIn) {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
    }
    
    @Inject(method = { "renderEntityName" }, at = { @At("HEAD") }, cancellable = true)
    public void renderEntityNameHook(final AbstractClientPlayer entityIn, final double x, final double y, final double z, final String name, final double distanceSq, final CallbackInfo info) {
        assert Stay.moduleManager != null;
        if (Stay.moduleManager.isModuleEnabled("NameTags")) {
            info.cancel();
        }
    }
    
    @Overwrite
    public ResourceLocation getEntityTexture(final AbstractClientPlayer entity) {
        if (Stay.moduleManager.isModuleEnabled("TexturedChams")) {
            GL11.glColor4f((int)TexturedChams.red.getValue() / 255.0f, (int)TexturedChams.green.getValue() / 255.0f, (int)TexturedChams.blue.getValue() / 255.0f, (int)TexturedChams.alpha.getValue() / 255.0f);
            return new ResourceLocation("minecraft:steve_skin1.png");
        }
        return entity.getLocationSkin();
    }
}
