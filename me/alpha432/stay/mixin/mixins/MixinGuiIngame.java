//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.client.gui.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.features.modules.unstable.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ GuiIngame.class })
public abstract class MixinGuiIngame extends Gui
{
    @Shadow
    @Final
    protected static ResourceLocation WIDGETS_TEX_PATH;
    @Shadow
    @Final
    protected Minecraft mc;
    
    @Shadow
    protected abstract void renderHotbarItem(final int p0, final int p1, final float p2, final EntityPlayer p3, final ItemStack p4);
    
    @Inject(method = { "renderHotbar" }, at = { @At("HEAD") }, cancellable = true)
    public void renderHotbar$INJECT$HEAD(final ScaledResolution sr, final float partialTicks, final CallbackInfo ci) {
        if (AntiNewYing.INSTANCE.isEnabled()) {
            ci.cancel();
        }
        if (this.mc.getRenderViewEntity() instanceof EntityPlayer && AntiNewYing.INSTANCE.isEnabled()) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.mc.getTextureManager().bindTexture(MixinGuiIngame.WIDGETS_TEX_PATH);
            final EntityPlayer entityplayer = (EntityPlayer)this.mc.getRenderViewEntity();
            final ItemStack itemstack = entityplayer.getHeldItemOffhand();
            final EnumHandSide enumhandside = entityplayer.getPrimaryHand().opposite();
            final int i = sr.getScaledWidth() / 2;
            final float f = this.zLevel;
            final float x = GuiAnimationHelper.updateHotbar();
            this.zLevel = -90.0f;
            this.drawTexturedModalRect(i - 91, sr.getScaledHeight() - 22, 0, 0, 182, 22);
            this.drawTexturedModalRect(i - 91 - 1 + x, (float)(sr.getScaledHeight() - 22 - 1), 0, 22, 24, 22);
            if (!itemstack.isEmpty()) {
                if (enumhandside == EnumHandSide.LEFT) {
                    this.drawTexturedModalRect(i - 91 - 29, sr.getScaledHeight() - 23, 24, 22, 29, 24);
                }
                else {
                    this.drawTexturedModalRect(i + 91, sr.getScaledHeight() - 23, 53, 22, 29, 24);
                }
            }
            this.zLevel = f;
            GlStateManager.enableRescaleNormal();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
            RenderHelper.enableGUIStandardItemLighting();
            for (int l = 0; l < 9; ++l) {
                final int i2 = i - 90 + l * 20 + 2;
                final int j1 = sr.getScaledHeight() - 16 - 3;
                this.renderHotbarItem(i2, j1, partialTicks, entityplayer, (ItemStack)entityplayer.inventory.mainInventory.get(l));
            }
            if (!itemstack.isEmpty()) {
                final int l2 = sr.getScaledHeight() - 16 - 3;
                if (enumhandside == EnumHandSide.LEFT) {
                    this.renderHotbarItem(i - 91 - 26, l2, partialTicks, entityplayer, itemstack);
                }
                else {
                    this.renderHotbarItem(i + 91 + 10, l2, partialTicks, entityplayer, itemstack);
                }
            }
            if (this.mc.gameSettings.attackIndicator == 2) {
                final float f2 = this.mc.player.getCooledAttackStrength(0.0f);
                if (f2 < 1.0f) {
                    final int i3 = sr.getScaledHeight() - 20;
                    int j2 = i + 91 + 6;
                    if (enumhandside == EnumHandSide.RIGHT) {
                        j2 = i - 91 - 22;
                    }
                    this.mc.getTextureManager().bindTexture(Gui.ICONS);
                    final int k1 = (int)(f2 * 19.0f);
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    this.drawTexturedModalRect(j2, i3, 0, 94, 18, 18);
                    this.drawTexturedModalRect(j2, i3 + 18 - k1, 18, 112 - k1, 18, k1);
                }
            }
            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableRescaleNormal();
            GlStateManager.disableBlend();
        }
    }
}
