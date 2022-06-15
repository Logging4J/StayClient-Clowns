//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.client.network.*;
import java.util.*;
import me.alpha432.stay.client.*;

public class NameTags2 extends Module
{
    private final Setting<Boolean> invisibles;
    
    public NameTags2() {
        super("NameTags2", "Better Nametags", Module.Category.VISUAL, false, false, false);
        this.invisibles = (Setting<Boolean>)this.register(new Setting("Invisibles", (T)true));
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (fullNullCheck()) {
            return;
        }
        for (final EntityPlayer player : NameTags2.mc.world.playerEntities) {
            if (player.getDistance((Entity)NameTags2.mc.player) <= 30.0 && player != null && !player.equals((Object)NameTags2.mc.player) && player.isEntityAlive()) {
                if (player.isInvisible() && !this.invisibles.getValue()) {
                    continue;
                }
                final double x = this.interpolate(player.lastTickPosX, player.posX, event.getPartialTicks()) - NameTags2.mc.getRenderManager().viewerPosX;
                final double y = this.interpolate(player.lastTickPosY, player.posY, event.getPartialTicks()) - NameTags2.mc.getRenderManager().viewerPosY;
                final double z = this.interpolate(player.lastTickPosZ, player.posZ, event.getPartialTicks()) - NameTags2.mc.getRenderManager().viewerPosZ;
                this.renderNameTag(player, x, y, z, event.getPartialTicks());
            }
        }
    }
    
    private void renderNameTag(final EntityPlayer player, final double x, final double y, final double z, final float delta) {
        double tempY = y;
        tempY += (player.isSneaking() ? 0.5 : 0.7);
        final Entity camera = NameTags2.mc.getRenderViewEntity();
        assert camera != null;
        final double originalPositionX = camera.posX;
        final double originalPositionY = camera.posY;
        final double originalPositionZ = camera.posZ;
        camera.posX = this.interpolate(camera.prevPosX, camera.posX, delta);
        camera.posY = this.interpolate(camera.prevPosY, camera.posY, delta);
        camera.posZ = this.interpolate(camera.prevPosZ, camera.posZ, delta);
        final String displayTag = this.getDisplayTag(player);
        final double distance = camera.getDistance(x + NameTags2.mc.getRenderManager().viewerPosX, y + NameTags2.mc.getRenderManager().viewerPosY, z + NameTags2.mc.getRenderManager().viewerPosZ);
        final int width = this.renderer.getStringWidth(displayTag) / 2;
        final double scale = (distance <= 6.0) ? 0.0245 : ((0.0018 + 4.5 * (distance * 1.0)) / 1000.0);
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset(1.0f, -1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)x, (float)tempY + 1.4f, (float)z);
        GlStateManager.rotate(-NameTags2.mc.getRenderManager().playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(NameTags2.mc.getRenderManager().playerViewX, (NameTags2.mc.gameSettings.thirdPersonView == 2) ? -1.0f : 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(-scale, -scale, scale);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        GlStateManager.enableBlend();
        RenderUtil.drawRect((float)(-width - 2), (float)(-(this.renderer.getFontHeight() + 1)), width + 2.0f, 1.5f, 1426063360);
        GlStateManager.disableBlend();
        final ItemStack renderMainHand = player.getHeldItemMainhand().copy();
        GlStateManager.pushMatrix();
        int xOffset = -8;
        for (final ItemStack stack : player.inventory.armorInventory) {
            if (stack == null) {
                continue;
            }
            xOffset -= 8;
        }
        final ItemStack copy;
        final ItemStack renderOffhand = copy = player.getHeldItemOffhand().copy();
        xOffset -= 8;
        this.renderItemStack(copy, xOffset, -26);
        xOffset += 16;
        for (final ItemStack stack2 : player.inventory.armorInventory) {
            if (stack2 == null) {
                continue;
            }
            final ItemStack armourStack = stack2.copy();
            this.renderItemStack(armourStack, xOffset, -26);
            xOffset += 16;
        }
        this.renderItemStack(renderMainHand, xOffset, -26);
        GlStateManager.popMatrix();
        this.renderer.drawStringWithShadow(displayTag, (float)(-width), (float)(-(this.renderer.getFontHeight() - 1)), this.getDisplayColour(player));
        camera.posX = originalPositionX;
        camera.posY = originalPositionY;
        camera.posZ = originalPositionZ;
        GlStateManager.enableDepth();
        GlStateManager.disableBlend();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset(1.0f, 1500000.0f);
        GlStateManager.popMatrix();
    }
    
    private void renderItemStack(final ItemStack stack, final int x, final int y) {
        GlStateManager.pushMatrix();
        GlStateManager.depthMask(true);
        GlStateManager.clear(256);
        RenderHelper.enableStandardItemLighting();
        NameTags2.mc.getRenderItem().zLevel = -150.0f;
        GlStateManager.disableAlpha();
        GlStateManager.enableDepth();
        GlStateManager.disableCull();
        NameTags2.mc.getRenderItem().renderItemAndEffectIntoGUI(stack, x, y);
        NameTags2.mc.getRenderItem().renderItemOverlays(NameTags2.mc.fontRenderer, stack, x, y);
        NameTags2.mc.getRenderItem().zLevel = 0.0f;
        RenderHelper.disableStandardItemLighting();
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.scale(0.5f, 0.5f, 0.5f);
        GlStateManager.disableDepth();
        this.renderEnchantmentText(stack, x, y);
        GlStateManager.enableDepth();
        GlStateManager.scale(2.0f, 2.0f, 2.0f);
        GlStateManager.popMatrix();
    }
    
    private void renderEnchantmentText(final ItemStack stack, final int x, final int y) {
        int enchantmentY = y - 8;
        if (stack.getItem() == Items.GOLDEN_APPLE && stack.hasEffect()) {
            this.renderer.drawStringWithShadow("God", (float)(x * 2), (float)enchantmentY, -3977919);
            enchantmentY -= 8;
        }
        if (!(stack.getItem() instanceof ItemArmor) && !(stack.getItem() instanceof ItemSword) && !(stack.getItem() instanceof ItemTool) && !(stack.getItem() instanceof ItemShield)) {
            return;
        }
        int dmg = 0;
        final float green = (stack.getMaxDamage() - (float)stack.getItemDamage()) / stack.getMaxDamage();
        final float red = 1.0f - green;
        dmg = 100 - (int)(red * 100.0f);
        final ChatFormatting color = (dmg >= 60) ? ChatFormatting.GREEN : ((dmg >= 25) ? ChatFormatting.YELLOW : ChatFormatting.RED);
        this.renderer.drawStringWithShadow(color + "" + dmg + "%", (float)(x * 2), (float)enchantmentY, -1);
    }
    
    private String getDisplayTag(final EntityPlayer player) {
        String name = player.getDisplayName().getFormattedText();
        if (name.contains(NameTags2.mc.getSession().getUsername())) {
            name = "You";
        }
        final float health;
        final ChatFormatting color = ((health = player.getHealth() + player.getAbsorptionAmount()) > 18.0f) ? ChatFormatting.GREEN : ((health > 16.0f) ? ChatFormatting.DARK_GREEN : ((health > 12.0f) ? ChatFormatting.YELLOW : ((health > 8.0f) ? ChatFormatting.GOLD : ((health > 5.0f) ? ChatFormatting.RED : ChatFormatting.DARK_RED))));
        String pingStr = "";
        try {
            final int responseTime = Objects.requireNonNull(NameTags2.mc.getConnection()).getPlayerInfo(player.getUniqueID()).getResponseTime();
            pingStr = pingStr + responseTime + "ms ";
        }
        catch (Exception ex) {}
        if (Math.floor(health) == health) {
            name = name + color + ' ' + ((health > 0.0f) ? Integer.valueOf((int)Math.floor(health)) : "dead");
            return pingStr + name;
        }
        name = name + color + ' ' + ((health > 0.0f) ? Integer.valueOf((int)health) : "dead");
        return pingStr + name;
    }
    
    private int getDisplayColour(final EntityPlayer player) {
        final int colour = -1;
        if (Stay.friendManager.isFriend(player)) {
            return -11157267;
        }
        if (player.isInvisible()) {
            return -1113785;
        }
        if (!player.isSneaking()) {
            return colour;
        }
        return -6481515;
    }
    
    private double interpolate(final double previous, final double current, final float delta) {
        return previous + (current - previous) * delta;
    }
}
