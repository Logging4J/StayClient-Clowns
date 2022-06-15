//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.features.modules.misc.*;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.*;

@Mixin({ GuiScreen.class })
public class MixinGuiScreen extends Gui
{
    @Inject(method = { "renderToolTip" }, at = { @At("HEAD") }, cancellable = true)
    public void renderToolTipHook(final ItemStack stack, final int x, final int y, final CallbackInfo info) {
        if (ToolTips.getInstance().isOn() && stack.getItem() instanceof ItemShulkerBox) {
            ToolTips.getInstance().renderShulkerToolTip(stack, x, y, (String)null);
            info.cancel();
        }
    }
    
    @Inject(method = { "drawWorldBackground" }, at = { @At("HEAD") }, cancellable = true)
    public void drawWorldBackground(final int tint, final CallbackInfo ci) {
        if (Minecraft.getMinecraft().player == null) {
            return;
        }
        ci.cancel();
    }
}
