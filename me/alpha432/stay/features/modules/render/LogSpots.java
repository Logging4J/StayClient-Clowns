//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.util.concurrent.*;
import me.alpha432.stay.util.graphics.opengl.*;
import me.alpha432.stay.util.graphics.color.*;
import java.awt.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import me.alpha432.stay.util.math.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.init.*;
import me.alpha432.stay.client.*;
import java.util.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.renderer.*;

public class LogSpots extends Module
{
    private final Setting<Integer> range;
    private final Setting<Boolean> announce;
    private final List<LogoutPos> spots;
    
    public LogSpots() {
        super("Log Spots", "shows ez logs", Module.Category.VISUAL, false, false, false);
        this.range = (Setting<Integer>)this.register(new Setting("Distance", (T)250, (T)0, (T)500));
        this.announce = (Setting<Boolean>)this.register(new Setting("Announce", (T)false));
        this.spots = new CopyOnWriteArrayList<LogoutPos>();
    }
    
    public void onLogout() {
        this.spots.clear();
    }
    
    public void onDisable() {
        this.spots.clear();
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (!this.spots.isEmpty()) {
            synchronized (this.spots) {
                AxisAlignedBB bb;
                double x;
                double y;
                double z;
                this.spots.forEach(spot -> {
                    if (spot.getEntity() != null) {
                        bb = RenderUtil.interpolateAxis(spot.getEntity().getEntityBoundingBox());
                        RenderUtil.drawBlockOutline(bb, new Colour(250), 2.0f);
                        x = this.interpolate(spot.getEntity().lastTickPosX, spot.getEntity().posX, event.getPartialTicks()) - LogSpots.mc.getRenderManager().renderPosX;
                        y = this.interpolate(spot.getEntity().lastTickPosY, spot.getEntity().posY, event.getPartialTicks()) - LogSpots.mc.getRenderManager().renderPosY;
                        z = this.interpolate(spot.getEntity().lastTickPosZ, spot.getEntity().posZ, event.getPartialTicks()) - LogSpots.mc.getRenderManager().renderPosZ;
                        this.renderNameTag(spot.getName(), x, y, z, event.getPartialTicks(), spot.getX(), spot.getY(), spot.getZ(), spot.getHp(), spot.getTotem(), spot.getPops());
                    }
                });
            }
        }
    }
    
    public void onUpdate() {
        this.spots.removeIf(spot -> LogSpots.mc.player.getDistanceSq((Entity)spot.getEntity()) >= MathUtil.square(this.range.getValue()));
    }
    
    @SubscribeEvent(priority = EventPriority.LOW)
    public void onConnection(final ConnectionEvent event) {
        if (event.getStage() == 0) {
            final UUID uuid = event.getUuid();
            final EntityPlayer entity = LogSpots.mc.world.getPlayerEntityByUUID(uuid);
            if (entity != null && this.announce.getValue()) {
                Command.sendMessage("§a" + entity.getName() + " just logged in at (" + (int)entity.posX + ", " + (int)entity.posY + ", " + (int)entity.posZ + ")");
            }
            this.spots.removeIf(pos -> pos.getName().equalsIgnoreCase(event.getName()));
        }
        else if (event.getStage() == 1) {
            final EntityPlayer entity2 = event.getEntity();
            final UUID uuid2 = event.getUuid();
            final String name = event.getName();
            if (this.announce.getValue()) {
                Command.sendMessage("§c" + event.getName() + " just logged out at (" + (int)entity2.posX + ", " + (int)entity2.posY + ", " + (int)entity2.posZ + ")");
            }
            if (name != null && uuid2 != null) {
                this.spots.add(new LogoutPos(name, uuid2, entity2, Math.round(entity2.getHealth() + entity2.getAbsorptionAmount()), entity2.getHeldItemOffhand().getItem() == Items.TOTEM_OF_UNDYING, Stay.POP_MANAGER.getTotemPops(entity2)));
            }
        }
    }
    
    private void renderNameTag(final String name, final double x, final double yi, final double z, final float delta, final double xPos, final double yPos, final double zPos, final double hp, final boolean hasTotem, final int pops) {
        final double y = yi + 0.7;
        final Entity camera = LogSpots.mc.getRenderViewEntity();
        assert camera != null;
        final double originalPositionX = camera.posX;
        final double originalPositionY = camera.posY;
        final double originalPositionZ = camera.posZ;
        camera.posX = this.interpolate(camera.prevPosX, camera.posX, delta);
        camera.posY = this.interpolate(camera.prevPosY, camera.posY, delta);
        camera.posZ = this.interpolate(camera.prevPosZ, camera.posZ, delta);
        final String displayTag = name + " [" + (int)xPos + ", " + (int)yPos + ", " + (int)zPos + "]";
        final String displayTag2 = "HP [" + hp + "] : Totem [" + hasTotem + "] : Pops [" + pops + "]";
        final double distance = camera.getDistance(x + LogSpots.mc.getRenderManager().viewerPosX, y + LogSpots.mc.getRenderManager().viewerPosY, z + LogSpots.mc.getRenderManager().viewerPosZ);
        final int width = Stay.GUI_FONT_MANAGER.getTextWidth(displayTag) / 2;
        final int width2 = Stay.GUI_FONT_MANAGER.getTextWidth(displayTag2) / 2;
        double scale = 0.0012018;
        if (distance <= 8.0) {
            scale = 0.0245;
        }
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset(1.0f, -1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)x, (float)y + 1.4f, (float)z);
        GlStateManager.rotate(-LogSpots.mc.getRenderManager().playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(LogSpots.mc.getRenderManager().playerViewX, (LogSpots.mc.gameSettings.thirdPersonView == 2) ? -1.0f : 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(-scale, -scale, scale);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        GlStateManager.enableBlend();
        RenderUtil.drawRect((float)(-width2 - 2), (float)(-(Stay.GUI_FONT_MANAGER.getTextHeight() + 1)), width2 + 2.0f, 14.0f, 1426063360);
        GlStateManager.disableBlend();
        Stay.GUI_FONT_MANAGER.drawStringWithShadow(displayTag, (float)(-width), (float)(-(Stay.GUI_FONT_MANAGER.getTextHeight() - 1)), 250);
        Stay.GUI_FONT_MANAGER.drawStringWithShadow(displayTag2, (float)(-width2), (float)(-(Stay.GUI_FONT_MANAGER.getTextHeight() - 1 - 12)), 250);
        camera.posX = originalPositionX;
        camera.posY = originalPositionY;
        camera.posZ = originalPositionZ;
        GlStateManager.enableDepth();
        GlStateManager.disableBlend();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset(1.0f, 1500000.0f);
        GlStateManager.popMatrix();
    }
    
    private double interpolate(final double previous, final double current, final float delta) {
        return previous + (current - previous) * delta;
    }
    
    private static class LogoutPos
    {
        private final String name;
        private final EntityPlayer entity;
        private final boolean hasTotem;
        private final double x;
        private final double y;
        private final double z;
        private final double hp;
        private final int pops;
        
        public LogoutPos(final String name, final UUID uuid, final EntityPlayer entity, final double hp, final boolean totem, final int pops) {
            this.name = name;
            this.entity = entity;
            this.x = entity.posX;
            this.y = entity.posY;
            this.z = entity.posZ;
            this.hp = hp;
            this.hasTotem = totem;
            this.pops = pops;
        }
        
        public String getName() {
            return this.name;
        }
        
        public EntityPlayer getEntity() {
            return this.entity;
        }
        
        public double getX() {
            return this.x;
        }
        
        public double getY() {
            return this.y;
        }
        
        public double getZ() {
            return this.z;
        }
        
        public double getHp() {
            return this.hp;
        }
        
        public boolean getTotem() {
            return this.hasTotem;
        }
        
        public int getPops() {
            return this.pops;
        }
    }
}
