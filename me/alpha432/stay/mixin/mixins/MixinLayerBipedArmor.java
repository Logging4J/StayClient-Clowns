//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.client.model.*;
import net.minecraft.inventory.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { LayerBipedArmor.class }, priority = 1898)
public class MixinLayerBipedArmor
{
    @Inject(method = { "setModelSlotVisible" }, at = { @At("HEAD") }, cancellable = true)
    protected void setModelSlotVisible(final ModelBiped model, final EntityEquipmentSlot slotIn, final CallbackInfo ci) {
        final NoRenderEvent event = new NoRenderEvent(0);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (!event.isCanceled()) {
            return;
        }
        ci.cancel();
        switch (slotIn.ordinal()) {
            case 2: {
                model.bipedHead.showModel = false;
                model.bipedHeadwear.showModel = false;
            }
            case 3: {
                model.bipedBody.showModel = false;
                model.bipedRightArm.showModel = false;
                model.bipedLeftArm.showModel = false;
            }
            case 4: {
                model.bipedBody.showModel = false;
                model.bipedRightLeg.showModel = false;
                model.bipedLeftLeg.showModel = false;
            }
            case 5: {
                model.bipedRightLeg.showModel = false;
                model.bipedLeftLeg.showModel = false;
            }
            default: {}
        }
    }
}
