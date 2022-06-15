//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.tileentity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.manager.*;
import org.spongepowered.asm.mixin.injection.*;
import me.alpha432.stay.features.modules.render.*;

@Mixin({ TileEntityEnchantmentTableRenderer.class })
public class MixinTileEntityEnchantmentTableRenderer
{
    @Inject(method = { "render*" }, at = { @At("INVOKE") }, cancellable = true)
    private void renderEnchantingTableBook(final TileEntityEnchantmentTable te, final double x, final double y, final double z, final float partialTicks, final int destroyStage, final float alpha, final CallbackInfo info) {
        final NoRender NoRender = (NoRender)Stay.moduleManager.getModuleByDisplayName("NoRender");
        if (ModuleManager.getModuleByName("NoRender").isEnabled() && (boolean)NoRender.enchantmentTables.getValue()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "render*" }, at = { @At("INVOKE") }, cancellable = true)
    private void renderEnchantingTableBooks(final TileEntityEnchantmentTable te, final double x, final double y, final double z, final float partialTicks, final int destroyStage, final float alpha, final CallbackInfo info) {
        final HellgateEsp HellgateEsp = (HellgateEsp)Stay.moduleManager.getModuleByDisplayName("HellgateEsp");
        if (ModuleManager.getModuleByName("HellgateEsp").isEnabled() && (boolean)HellgateEsp.norem.getValue()) {
            info.cancel();
        }
    }
}
