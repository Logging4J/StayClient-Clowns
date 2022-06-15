//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.*;
import me.alpha432.stay.util.graphics.animations.*;
import net.minecraft.client.settings.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.*;
import me.alpha432.stay.features.modules.unstable.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;

@Mixin({ GuiOptionSlider.class })
public class MixinGuiOptionSlider extends GuiButton
{
    private final AnimationFlag animation;
    @Shadow
    private float sliderValue;
    
    public MixinGuiOptionSlider(final int buttonId, final int x, final int y, final String buttonText) {
        super(buttonId, x, y, buttonText);
        this.animation = new AnimationFlag(Easing.OUT_CUBIC, 200.0f);
    }
    
    @Inject(method = { "<init>(IIILnet/minecraft/client/settings/GameSettings$Options;FF)V" }, at = { @At("RETURN") })
    public void init$INJECT$RETURN(final int buttonId, final int x, final int y, final GameSettings.Options optionIn, final float minValueIn, final float maxValue, final CallbackInfo ci) {
        this.animation.forceUpdate(0.0f, 0.0f);
    }
    
    @Inject(method = { "mouseDragged" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiOptionSlider;drawTexturedModalRect(IIIIII)V", ordinal = 0) }, cancellable = true)
    public void mouseDragged$INJECT$HEAD(final Minecraft mc, final int mouseX, final int mouseY, final CallbackInfo ci) {
        if (SliderAnimation.INSTANCE.isEnabled()) {
            ci.cancel();
            final float renderSliderValue = this.animation.getAndUpdate(this.sliderValue) * (this.width - 8.0f);
            final Tessellator tessellator = Tessellator.getInstance();
            final BufferBuilder bufferbuilder = tessellator.getBuffer();
            bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
            bufferbuilder.pos((double)(this.x + renderSliderValue), this.y + 20.0, (double)this.zLevel).tex(0.0, 0.3359375).endVertex();
            bufferbuilder.pos(this.x + renderSliderValue + 4.0, this.y + 20.0, (double)this.zLevel).tex(0.015625, 0.3359375).endVertex();
            bufferbuilder.pos(this.x + renderSliderValue + 4.0, this.y + 0.0, (double)this.zLevel).tex(0.015625, 0.2578125).endVertex();
            bufferbuilder.pos((double)(this.x + renderSliderValue), this.y + 0.0, (double)this.zLevel).tex(0.0, 0.2578125).endVertex();
            bufferbuilder.pos((double)(this.x + renderSliderValue + 4.0f), this.y + 20.0, (double)this.zLevel).tex(0.765625, 0.3359375).endVertex();
            bufferbuilder.pos((double)(this.x + renderSliderValue + 8.0f), this.y + 20.0, (double)this.zLevel).tex(0.78125, 0.3359375).endVertex();
            bufferbuilder.pos((double)(this.x + renderSliderValue + 8.0f), this.y + 0.0, (double)this.zLevel).tex(0.78125, 0.2578125).endVertex();
            bufferbuilder.pos((double)(this.x + renderSliderValue + 4.0f), this.y + 0.0, (double)this.zLevel).tex(0.765625, 0.2578125).endVertex();
            tessellator.draw();
        }
    }
}
