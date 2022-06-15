//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.features.modules.render.*;
import me.alpha432.stay.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderGlobal.class })
public class MixinRenderGlobal
{
    @Inject(method = { "drawBlockDamageTexture" }, at = { @At("HEAD") }, cancellable = true)
    public void drawBlockDamageTexture(final Tessellator tessellatorIn, final BufferBuilder bufferBuilderIn, final Entity entityIn, final float partialTicks, final CallbackInfo callbackInfo) {
        final BreakESP BreakESP = (BreakESP)Stay.moduleManager.getModuleByDisplayName("BreakESP");
        if ((boolean)BreakESP.ros.getValue() && BreakESP.isEnabled()) {
            callbackInfo.cancel();
        }
    }
}
