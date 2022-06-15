//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.client.entity.*;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.util.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.features.modules.render.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.event.*;

@Mixin({ ItemRenderer.class })
public abstract class MixinItemRenderer
{
    private boolean injection;
    
    public MixinItemRenderer() {
        this.injection = true;
    }
    
    @Shadow
    public abstract void renderItemInFirstPerson(final AbstractClientPlayer p0, final float p1, final float p2, final EnumHand p3, final float p4, final ItemStack p5, final float p6);
    
    @Inject(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = { @At("HEAD") }, cancellable = true)
    public void renderItemInFirstPersonHook(final AbstractClientPlayer player, final float p_187457_2_, final float p_187457_3_, final EnumHand hand, final float p_187457_5_, final ItemStack stack, final float p_187457_7_, final CallbackInfo info) {
        if (this.injection) {
            info.cancel();
            final SmallShield offset = SmallShield.getINSTANCE();
            float xOffset = 0.0f;
            float yOffset = 0.0f;
            this.injection = false;
            if (hand == EnumHand.MAIN_HAND) {
                if (offset.isOn() && player.getHeldItemMainhand() != ItemStack.EMPTY) {
                    xOffset = (float)offset.mainX.getValue();
                    yOffset = (float)offset.mainY.getValue();
                }
            }
            else if (!(boolean)offset.normalOffset.getValue() && offset.isOn() && player.getHeldItemOffhand() != ItemStack.EMPTY) {
                xOffset = (float)offset.offX.getValue();
                yOffset = (float)offset.offY.getValue();
            }
            this.renderItemInFirstPerson(player, p_187457_2_, p_187457_3_, hand, p_187457_5_ + xOffset, stack, p_187457_7_ + yOffset);
            this.injection = true;
        }
    }
    
    @Redirect(method = { "renderArmFirstPerson" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", ordinal = 0))
    public void translateHook(final float x, final float y, final float z) {
        final SmallShield offset = SmallShield.getINSTANCE();
        final boolean shiftPos = Minecraft.getMinecraft().player != null && Minecraft.getMinecraft().player.getHeldItemMainhand() != ItemStack.EMPTY && offset.isOn();
        GlStateManager.translate(x + (shiftPos ? offset.mainX.getValue() : 0.0f), y + (shiftPos ? offset.mainY.getValue() : 0.0f), z);
    }
    
    @Inject(method = { "renderFireInFirstPerson" }, at = { @At("HEAD") }, cancellable = true)
    public void renderFireInFirstPersonHook(final CallbackInfo info) {
        if (NoRender.getInstance().isOn() && (boolean)NoRender.getInstance().fire.getValue()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "transformEatFirstPerson" }, at = { @At("HEAD") }, cancellable = true)
    public void transformEatFirstPerson(final float p_187454_1_, final EnumHandSide hand, final ItemStack stack, final CallbackInfo callbackInfo) {
        final TransformSideFirstPersonEvent event = new TransformSideFirstPersonEvent(hand);
        MinecraftForge.EVENT_BUS.post((Event)event);
        final ViewModel viewModel = (ViewModel)Stay.moduleManager.getModuleByDisplayName("ViewModel");
        if (viewModel.isEnabled() && (boolean)viewModel.noEat.getValue()) {
            callbackInfo.cancel();
        }
    }
    
    @Redirect(method = { "renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;transformSideFirstPerson(Lnet/minecraft/util/EnumHandSide;F)V"))
    public void transformRedirect(final ItemRenderer renderer, final EnumHandSide hand, final float y) {
        final RenderItemEvent event = new RenderItemEvent(0.5600000023841858, (double)(-0.52f + y * -0.6f), -0.7200000286102295, -0.5600000023841858, (double)(-0.52f + y * -0.6f), -0.7200000286102295, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        MinecraftForge.EVENT_BUS.post((Event)event);
        final ViewModel viewModel = (ViewModel)Stay.moduleManager.getModuleByDisplayName("ViewModel");
        if (viewModel.isEnabled()) {
            if (hand == EnumHandSide.RIGHT) {
                GlStateManager.translate((double)viewModel.mainX.getValue(), (double)viewModel.mainY.getValue(), (double)viewModel.mainZ.getValue());
                GlStateManager.scale((double)viewModel.mainScaleX.getValue(), (double)viewModel.mainScaleY.getValue(), (double)viewModel.mainScaleZ.getValue());
                GlStateManager.rotate(((Double)viewModel.mainRx.getValue()).floatValue(), ((Double)viewModel.mainRx.getValue()).floatValue(), ((Double)viewModel.mainRy.getValue()).floatValue(), ((Double)viewModel.mainRz.getValue()).floatValue());
            }
            else {
                GlStateManager.translate((double)viewModel.offX.getValue(), (double)viewModel.offY.getValue(), (double)viewModel.offZ.getValue());
                GlStateManager.scale((double)viewModel.offScaleX.getValue(), (double)viewModel.offScaleY.getValue(), (double)viewModel.offScaleZ.getValue());
                GlStateManager.rotate(((Double)viewModel.offRx.getValue()).floatValue(), ((Double)viewModel.offRx.getValue()).floatValue(), ((Double)viewModel.offRy.getValue()).floatValue(), ((Double)viewModel.offRz.getValue()).floatValue());
            }
        }
        else if (hand == EnumHandSide.RIGHT) {
            GlStateManager.translate(0.56f, -0.52f + y * -0.6f, -0.72f);
            GlStateManager.scale(1.0, 1.0, 1.0);
            GlStateManager.rotate(0.0f, 0.0f, 1.0f, 0.0f);
        }
        else {
            GlStateManager.translate(-0.56f, -0.52f + y * -0.6f, -0.72f);
            GlStateManager.scale(1.0, 1.0, 1.0);
            GlStateManager.rotate(0.0f, 0.0f, 1.0f, 0.0f);
        }
    }
}
