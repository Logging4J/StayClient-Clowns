//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.client.renderer.*;
import me.alpha432.stay.util.world.*;
import java.util.function.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import org.lwjgl.opengl.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.combat.*;
import me.alpha432.stay.manager.*;
import java.awt.*;

public class Tracer extends Module
{
    public Setting<Boolean> players;
    public Setting<Boolean> mobs;
    public Setting<Boolean> animals;
    public Setting<Boolean> invisibles;
    public Setting<Boolean> drawFromSky;
    public Setting<Float> width;
    public Setting<Integer> distance;
    public Setting<Boolean> crystalCheck;
    
    public Tracer() {
        super("Tracers", "Draws lines to other players.", Module.Category.VISUAL, false, false, false);
        this.players = (Setting<Boolean>)this.register(new Setting("Players", (T)true));
        this.mobs = (Setting<Boolean>)this.register(new Setting("Mobs", (T)false));
        this.animals = (Setting<Boolean>)this.register(new Setting("Animals", (T)false));
        this.invisibles = (Setting<Boolean>)this.register(new Setting("Invisibles", (T)false));
        this.drawFromSky = (Setting<Boolean>)this.register(new Setting("DrawFromSky", (T)false));
        this.width = (Setting<Float>)this.register(new Setting("Width", (T)1.0f, (T)0.1f, (T)5.0f));
        this.distance = (Setting<Integer>)this.register(new Setting("Radius", (T)300, (T)0, (T)300));
        this.crystalCheck = (Setting<Boolean>)this.register(new Setting("CrystalCheck", (T)false));
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (fullNullCheck()) {
            return;
        }
        GlStateManager.pushMatrix();
        final float[] colour;
        Tracer.mc.world.loadedEntityList.stream().filter(EntityUtils::isLiving).filter(entity -> (entity instanceof EntityPlayer) ? (this.players.getValue() && Tracer.mc.player != entity) : (EntityUtils.isPassive(entity) ? this.animals.getValue() : ((boolean)this.mobs.getValue()))).filter(entity -> Tracer.mc.player.getDistanceSq(entity) < MathUtil.square(this.distance.getValue())).filter(entity -> this.invisibles.getValue() || !entity.isInvisible()).forEach(entity -> {
            colour = this.getColorByDistance(entity);
            this.drawLineToEntity(entity, colour[0], colour[1], colour[2], colour[3]);
            return;
        });
        GlStateManager.popMatrix();
    }
    
    public double interpolate(final double now, final double then) {
        return then + (now - then) * Tracer.mc.getRenderPartialTicks();
    }
    
    public double[] interpolate(final Entity entity) {
        final double posX = this.interpolate(entity.posX, entity.lastTickPosX) - Tracer.mc.getRenderManager().renderPosX;
        final double posY = this.interpolate(entity.posY, entity.lastTickPosY) - Tracer.mc.getRenderManager().renderPosY;
        final double posZ = this.interpolate(entity.posZ, entity.lastTickPosZ) - Tracer.mc.getRenderManager().renderPosZ;
        return new double[] { posX, posY, posZ };
    }
    
    public void drawLineToEntity(final Entity e, final float red, final float green, final float blue, final float opacity) {
        final double[] xyz = this.interpolate(e);
        this.drawLine(xyz[0], xyz[1], xyz[2], e.height, red, green, blue, opacity);
    }
    
    public void drawLine(final double posx, final double posy, final double posz, final double up, final float red, final float green, final float blue, final float opacity) {
        final Vec3d eyes = new Vec3d(0.0, 0.0, 1.0).rotatePitch(-(float)Math.toRadians(Tracer.mc.player.rotationPitch)).rotateYaw(-(float)Math.toRadians(Tracer.mc.player.rotationYaw));
        if (!this.drawFromSky.getValue()) {
            this.drawLineFromPosToPos(eyes.x, eyes.y + Tracer.mc.player.getEyeHeight(), eyes.z, posx, posy, posz, up, red, green, blue, opacity);
        }
        else {
            this.drawLineFromPosToPos(posx, 256.0, posz, posx, posy, posz, up, red, green, blue, opacity);
        }
    }
    
    public void drawLineFromPosToPos(final double posx, final double posy, final double posz, final double posx2, final double posy2, final double posz2, final double up, final float red, final float green, final float blue, final float opacity) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glLineWidth((float)this.width.getValue());
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glColor4f(red, green, blue, opacity);
        GlStateManager.disableLighting();
        GL11.glLoadIdentity();
        Tracer.mc.entityRenderer.orientCamera(Tracer.mc.getRenderPartialTicks());
        GL11.glBegin(1);
        GL11.glVertex3d(posx, posy, posz);
        GL11.glVertex3d(posx2, posy2, posz2);
        GL11.glVertex3d(posx2, posy2, posz2);
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
        GL11.glColor3d(1.0, 1.0, 1.0);
        GlStateManager.enableLighting();
    }
    
    public float[] getColorByDistance(final Entity entity) {
        if (entity instanceof EntityPlayer && Stay.friendManager.isFriend(entity.getName())) {
            return new float[] { 0.0f, 0.5f, 1.0f, 1.0f };
        }
        final ModuleManager moduleManager = Stay.moduleManager;
        final AutoCrystal autoCrystal = ModuleManager.getModuleByClass(AutoCrystal.class);
        final Color col = new Color(Color.HSBtoRGB((float)(Math.max(0.0, Math.min(Tracer.mc.player.getDistanceSq(entity), ((boolean)this.crystalCheck.getValue()) ? ((double)(autoCrystal.placeRange.getValue() * autoCrystal.placeRange.getValue())) : 2500.0) / (this.crystalCheck.getValue() ? (autoCrystal.placeRange.getValue() * autoCrystal.placeRange.getValue()) : 2500.0f)) / 3.0), 1.0f, 0.8f) | 0xFF000000);
        return new float[] { col.getRed() / 255.0f, col.getGreen() / 255.0f, col.getBlue() / 255.0f, 1.0f };
    }
}
