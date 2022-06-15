//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.model.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import me.alpha432.stay.features.modules.render.*;
import org.lwjgl.opengl.*;
import me.alpha432.stay.util.graphics.color.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.math.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderEnderCrystal.class })
public class MixinRenderEnderCrystal extends Render<EntityEnderCrystal>
{
    @Shadow
    private static final ResourceLocation ENDER_CRYSTAL_TEXTURES;
    @Shadow
    private final ModelBase modelEnderCrystal;
    @Shadow
    private final ModelBase modelEnderCrystalNoBase;
    
    protected MixinRenderEnderCrystal(final RenderManager renderManager) {
        super(renderManager);
        this.modelEnderCrystal = (ModelBase)new ModelEnderCrystal(0.0f, true);
        this.modelEnderCrystalNoBase = (ModelBase)new ModelEnderCrystal(0.0f, false);
    }
    
    @Inject(method = { "doRender" }, at = { @At("HEAD") }, cancellable = true)
    public void doRender(final EntityEnderCrystal entity, final double x, final double y, final double z, final float entityYaw, final float partialTicks, final CallbackInfo callbackInfo) {
        try {
            Class.forName("com.client.epsilon.mixin.client.render.MixinRenderEnderCrystal");
        }
        catch (ClassNotFoundException e) {
            final float f = entity.innerRotation + partialTicks;
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x, (float)y, (float)z);
            this.bindTexture(MixinRenderEnderCrystal.ENDER_CRYSTAL_TEXTURES);
            float f2 = MathHelper.sin(f * 0.2f) / 2.0f + 0.5f;
            f2 += f2 * f2;
            if (this.renderOutlines) {
                GlStateManager.enableColorMaterial();
                GlStateManager.enableOutlineMode(this.getTeamColor((Entity)entity));
            }
            if (Wireframe.getInstance().isOn() && (boolean)Wireframe.getInstance().crystals.getValue()) {
                final float red = (int)Wireframe.getInstance().Cred.getValue() / 255.0f;
                final float green = (int)Wireframe.getInstance().Cgreen.getValue() / 255.0f;
                final float blue = (int)Wireframe.getInstance().Cblue.getValue() / 255.0f;
                if (((Wireframe.RenderMode)Wireframe.getInstance().cMode.getValue()).equals((Object)Wireframe.RenderMode.WIREFRAME) && (boolean)Wireframe.getInstance().crystalModel.getValue()) {
                    this.modelEnderCrystalNoBase.render((Entity)entity, 0.0f, f * 3.0f, f2 * 0.2f, 0.0f, 0.0f, 0.0625f);
                }
                GlStateManager.pushMatrix();
                GL11.glPushAttrib(1048575);
                if (((Wireframe.RenderMode)Wireframe.getInstance().cMode.getValue()).equals((Object)Wireframe.RenderMode.WIREFRAME)) {
                    GL11.glPolygonMode(1032, 6913);
                }
                GL11.glDisable(3553);
                GL11.glDisable(2896);
                if (((Wireframe.RenderMode)Wireframe.getInstance().cMode.getValue()).equals((Object)Wireframe.RenderMode.WIREFRAME)) {
                    GL11.glEnable(2848);
                }
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                GL11.glDisable(2929);
                GL11.glDepthMask(false);
                GL11.glColor4f(((boolean)Wireframe.getInstance().rainbow.getValue()) ? (ColorUtil.rainbow((int)Wireframe.getInstance().rainbowHue.getValue()).getRed() / 255.0f) : red, ((boolean)Wireframe.getInstance().rainbow.getValue()) ? (ColorUtil.rainbow((int)Wireframe.getInstance().rainbowHue.getValue()).getGreen() / 255.0f) : green, ((boolean)Wireframe.getInstance().rainbow.getValue()) ? (ColorUtil.rainbow((int)Wireframe.getInstance().rainbowHue.getValue()).getBlue() / 255.0f) : blue, (float)Wireframe.getInstance().cAlpha.getValue() / 255.0f);
                if (((Wireframe.RenderMode)Wireframe.getInstance().cMode.getValue()).equals((Object)Wireframe.RenderMode.WIREFRAME)) {
                    GL11.glLineWidth((float)Wireframe.getInstance().crystalLineWidth.getValue());
                }
                this.modelEnderCrystalNoBase.render((Entity)entity, 0.0f, f * 3.0f, f2 * 0.2f, 0.0f, 0.0f, 0.0625f);
                GL11.glDisable(2896);
                GL11.glEnable(2929);
                GL11.glDepthMask(true);
                GL11.glColor4f(((boolean)Wireframe.getInstance().rainbow.getValue()) ? (ColorUtil.rainbow((int)Wireframe.getInstance().rainbowHue.getValue()).getRed() / 255.0f) : red, ((boolean)Wireframe.getInstance().rainbow.getValue()) ? (ColorUtil.rainbow((int)Wireframe.getInstance().rainbowHue.getValue()).getGreen() / 255.0f) : green, ((boolean)Wireframe.getInstance().rainbow.getValue()) ? (ColorUtil.rainbow((int)Wireframe.getInstance().rainbowHue.getValue()).getBlue() / 255.0f) : blue, (float)Wireframe.getInstance().cAlpha.getValue() / 255.0f);
                if (((Wireframe.RenderMode)Wireframe.getInstance().cMode.getValue()).equals((Object)Wireframe.RenderMode.WIREFRAME)) {
                    GL11.glLineWidth((float)Wireframe.getInstance().crystalLineWidth.getValue());
                }
                this.modelEnderCrystalNoBase.render((Entity)entity, 0.0f, f * 3.0f, f2 * 0.2f, 0.0f, 0.0f, 0.0625f);
                GlStateManager.enableDepth();
                GlStateManager.popAttrib();
                GlStateManager.popMatrix();
            }
            else {
                this.modelEnderCrystalNoBase.render((Entity)entity, 0.0f, f * 3.0f, f2 * 0.2f, 0.0f, 0.0f, 0.0625f);
            }
            if (this.renderOutlines) {
                GlStateManager.disableOutlineMode();
                GlStateManager.disableColorMaterial();
            }
            GlStateManager.popMatrix();
            final BlockPos blockpos = entity.getBeamTarget();
            if (blockpos != null) {
                this.bindTexture(RenderDragon.ENDERCRYSTAL_BEAM_TEXTURES);
                final float f3 = blockpos.getX() + 0.5f;
                final float f4 = blockpos.getY() + 0.5f;
                final float f5 = blockpos.getZ() + 0.5f;
                final double d0 = f3 - entity.posX;
                final double d2 = f4 - entity.posY;
                final double d3 = f5 - entity.posZ;
                RenderDragon.renderCrystalBeams(x + d0, y - 0.3 + f2 * 0.4f + d2, z + d3, partialTicks, (double)f3, (double)f4, (double)f5, entity.innerRotation, entity.posX, entity.posY, entity.posZ);
            }
            super.doRender((Entity)entity, x, y, z, entityYaw, partialTicks);
            callbackInfo.cancel();
        }
    }
    
    protected ResourceLocation getEntityTexture(final EntityEnderCrystal entityEnderCrystal) {
        return null;
    }
    
    static {
        ENDER_CRYSTAL_TEXTURES = new ResourceLocation("textures/entity/endercrystal/endercrystal.png");
    }
}
