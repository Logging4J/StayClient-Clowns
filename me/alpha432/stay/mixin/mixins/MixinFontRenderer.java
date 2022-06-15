//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ FontRenderer.class })
public abstract class MixinFontRenderer
{
    @Shadow
    protected abstract int renderString(final String p0, final float p1, final float p2, final int p3, final boolean p4);
    
    @Shadow
    protected abstract void renderStringAtPos(final String p0, final boolean p1);
    
    @Redirect(method = { "renderString(Ljava/lang/String;FFIZ)I" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;renderStringAtPos(Ljava/lang/String;Z)V"))
    public void renderStringAtPosHook(final FontRenderer renderer, final String text, final boolean shadow) {
        if (NickHider.getInstance().isOn()) {
            this.renderStringAtPos(text.replace(Minecraft.getMinecraft().getSession().getUsername(), NickHider.getInstance().NameString.getValueAsString()), shadow);
        }
        else {
            this.renderStringAtPos(text, shadow);
        }
    }
    
    @Inject(method = { "drawString(Ljava/lang/String;FFIZ)I" }, at = { @At("HEAD") }, cancellable = true)
    public void renderStringHook(final String text, final float x, final float y, final int color, final boolean dropShadow, final CallbackInfoReturnable<Integer> info) {
        if (FontMod.getInstance().isOn() && (boolean)((FontMod)Stay.moduleManager.getModuleT((Class)FontMod.class)).customAll.getValue() && Stay.textManager != null) {
            final float result = Stay.textManager.drawString(text, x, y, color, dropShadow);
            info.setReturnValue((Object)(int)result);
        }
    }
}
