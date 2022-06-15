//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.util.*;
import java.awt.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.client.*;
import org.lwjgl.opengl.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.renderer.*;

public class Breadcrumbs extends Module
{
    private final Setting<Integer> colorRed;
    private final Setting<Integer> colorGreen;
    private final Setting<Integer> colorBlue;
    private final Setting<Boolean> colorRainbow;
    private final Setting<Boolean> fade;
    private final Setting<Integer> fadeTime;
    private final List<BreadcrumbPoint> points;
    private final long startTime;
    
    public Breadcrumbs() {
        super("Breadcrumbs", "This is a description", Module.Category.VISUAL, true, false, false);
        this.colorRed = (Setting<Integer>)this.register(new Setting("Red", (T)255, (T)0, (T)255));
        this.colorGreen = (Setting<Integer>)this.register(new Setting("Green", (T)255, (T)0, (T)255));
        this.colorBlue = (Setting<Integer>)this.register(new Setting("Blue", (T)255, (T)0, (T)255));
        this.colorRainbow = (Setting<Boolean>)this.register(new Setting("Rainbow", (T)false));
        this.fade = (Setting<Boolean>)this.register(new Setting("Fade", (T)false));
        this.fadeTime = (Setting<Integer>)this.register(new Setting("FadeTime", (T)5, (T)1, (T)100, _hidden -> this.fade.getValue()));
        this.points = new ArrayList<BreadcrumbPoint>();
        this.startTime = System.currentTimeMillis();
    }
    
    private Color getColor() {
        if (this.colorRainbow.getValue()) {
            return Color.getHSBColor(Math.abs((System.currentTimeMillis() - this.startTime + 300L) / Stay.moduleManager.getModuleT(HUD.class).rainbowSpeed.getValue() % 2L - 1L) * 0.16999999f + 0.41f, 0.7f, 1.0f);
        }
        return new Color(this.colorRed.getValue(), this.colorGreen.getValue(), this.colorBlue.getValue());
    }
    
    public void onRender3D(final Render3DEvent event) {
        final int fTime = this.fadeTime.getValue() * 100;
        final long fadeSec = System.currentTimeMillis() - fTime;
        synchronized (this.points) {
            GL11.glPushMatrix();
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(2848);
            GL11.glEnable(3042);
            GL11.glDisable(2929);
            Breadcrumbs.mc.entityRenderer.disableLightmap();
            GL11.glLineWidth(2.0f);
            GL11.glBegin(3);
            final double renderPosX = Breadcrumbs.mc.renderManager.viewerPosX;
            final double renderPosY = Breadcrumbs.mc.renderManager.viewerPosY;
            final double renderPosZ = Breadcrumbs.mc.renderManager.viewerPosZ;
            if (this.fade.getValue()) {
                final float pct;
                this.points.removeIf(breadcrumbPoint -> {
                    pct = (breadcrumbPoint.time - fadeSec) / (float)fTime;
                    return pct < 0.0f || pct > 1.0f;
                });
            }
            final double n;
            final double n2;
            final double n3;
            this.points.forEach(breadcrumbPoint -> {
                glColor(breadcrumbPoint.color, 1.0f);
                GL11.glVertex3d(breadcrumbPoint.x - n, breadcrumbPoint.y - n2, breadcrumbPoint.z - n3);
                return;
            });
            GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
            GL11.glEnd();
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
        }
    }
    
    public void onUpdate() {
        synchronized (this.points) {
            this.points.add(new BreadcrumbPoint(Breadcrumbs.mc.player.posX, Breadcrumbs.mc.player.getEntityBoundingBox().minY, Breadcrumbs.mc.player.posZ, System.currentTimeMillis(), this.getColor().getRGB()));
        }
    }
    
    @SubscribeEvent
    public void onWorldLoad(final WorldEvent event) {
        synchronized (this.points) {
            this.points.clear();
        }
    }
    
    public void onDisable() {
        synchronized (this.points) {
            this.points.clear();
        }
    }
    
    private static void glColor(final int hex, final float alpha) {
        final float red = (hex >> 16 & 0xFF) / 255.0f;
        final float green = (hex >> 8 & 0xFF) / 255.0f;
        final float blue = (hex & 0xFF) / 255.0f;
        GlStateManager.color(red, green, blue, alpha);
    }
    
    public static class BreadcrumbPoint
    {
        private double x;
        private double y;
        private double z;
        private long time;
        private int color;
        
        public double getX() {
            return this.x;
        }
        
        public void setX(final double x) {
            this.x = x;
        }
        
        public double getY() {
            return this.y;
        }
        
        public void setY(final double y) {
            this.y = y;
        }
        
        public double getZ() {
            return this.z;
        }
        
        public void setZ(final double z) {
            this.z = z;
        }
        
        public long getTime() {
            return this.time;
        }
        
        public void setTime(final long time) {
            this.time = time;
        }
        
        public int getColor() {
            return this.color;
        }
        
        public void setColor(final int color) {
            this.color = color;
        }
        
        public BreadcrumbPoint(final double x, final double y, final double z, final long time, final int color) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.time = time;
            this.color = color;
        }
    }
}
