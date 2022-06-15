//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.manager.*;
import me.alpha432.stay.features.modules.render.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderItem.class })
public class MixinRenderItem
{
    @Shadow
    private void renderModel(final IBakedModel model, final int color, final ItemStack stack) {
    }
    
    @ModifyArg(method = { "renderEffect" }, at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/RenderItem.renderModel(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)V"), index = 1)
    private int renderEffect(final int oldValue) {
        final ModuleManager moduleManager = Stay.moduleManager;
        return ModuleManager.getModuleByName("GlintModify").isEnabled() ? GlintModify.getColor(1L, 1.0f).getRGB() : oldValue;
    }
}
