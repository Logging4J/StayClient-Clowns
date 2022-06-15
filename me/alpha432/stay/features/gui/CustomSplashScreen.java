//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.gui;

import net.minecraft.util.*;
import me.alpha432.stay.util.graphics.image.*;
import java.net.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import me.alpha432.stay.client.*;
import java.awt.*;
import java.util.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import me.alpha432.stay.util.graphics.color.*;
import me.alpha432.stay.util.graphics.opengl.*;

public class CustomSplashScreen extends GuiScreen
{
    private String URLS;
    private ResourceLocation background;
    private final List<DonatorItem> donatorItems;
    private int y;
    private int x;
    private float watermarkX;
    
    public CustomSplashScreen() {
        this.URLS = "http://47.106.126.97/assets/minecraft/textures/";
        try {
            this.background = DynamicTextureWrapper.getTexture(new URL(this.URLS + "gui.jpg"));
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.donatorItems = new ArrayList<DonatorItem>();
    }
    
    public static void drawCompleteImage(final float posX, final float posY, final float width, final float height) {
        GL11.glPushMatrix();
        GL11.glTranslatef(posX, posY, 0.0f);
        GL11.glBegin(7);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(0.0f, 0.0f, 0.0f);
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex3f(0.0f, height, 0.0f);
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex3f(width, height, 0.0f);
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex3f(width, 0.0f, 0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
    }
    
    public static boolean isHovered(final int x, final int y, final int width, final int height, final int mouseX, final int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY < y + height;
    }
    
    public void initGui() {
        this.mc.gameSettings.enableVsync = false;
        this.mc.gameSettings.limitFramerate = 200;
        this.x = this.width / 4;
        this.y = this.height / 4 + 48;
        this.watermarkX = (float)(this.width + 80);
        this.buttonList.add(new TextButton(0, this.x, this.y + 22, "Single"));
        this.buttonList.add(new TextButton(1, this.x, this.y + 44, "Online"));
        this.buttonList.add(new TextButton(2, this.x, this.y + 66, "Setting"));
        this.buttonList.add(new TextButton(2, this.x, this.y + 88, "Alts"));
        this.buttonList.add(new TextButton(2, this.x, this.y + 110, "Quit"));
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel(7425);
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }
    
    public void updateScreen() {
        super.updateScreen();
    }
    
    public void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) {
        if (isHovered(this.x, this.y + 22, Stay.MENU_FONT_MANAGER.getTextWidth("Single"), Stay.MENU_FONT_MANAGER.getTextHeight(), mouseX, mouseY)) {
            this.mc.displayGuiScreen((GuiScreen)new GuiWorldSelection((GuiScreen)this));
        }
        else if (isHovered(this.x, this.y + 44, Stay.MENU_FONT_MANAGER.getTextWidth("Online"), Stay.MENU_FONT_MANAGER.getTextHeight(), mouseX, mouseY)) {
            this.mc.displayGuiScreen((GuiScreen)new GuiMultiplayer((GuiScreen)this));
        }
        else if (isHovered(this.x, this.y + 66, Stay.MENU_FONT_MANAGER.getTextWidth("Setting"), Stay.MENU_FONT_MANAGER.getTextHeight(), mouseX, mouseY)) {
            this.mc.displayGuiScreen((GuiScreen)new GuiOptions((GuiScreen)this, this.mc.gameSettings));
        }
        else if (isHovered(this.x, this.y + 88, Stay.MENU_FONT_MANAGER.getTextWidth("Alts"), Stay.MENU_FONT_MANAGER.getTextHeight(), mouseX, mouseY)) {
            this.mc.displayGuiScreen((GuiScreen)new GuiAccountSelector());
        }
        else if (isHovered(this.x, this.y + 110, Stay.MENU_FONT_MANAGER.getTextWidth("Quit"), Stay.MENU_FONT_MANAGER.getTextHeight(), mouseX, mouseY)) {
            this.mc.shutdown();
        }
    }
    
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        try {
            this.background = new ResourceLocation("cuican/background/background.jpg");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        final float xOffset = -1.0f * ((mouseX - this.width / 2.0f) / (this.width / 32.0f));
        final float yOffset = -1.0f * ((mouseY - this.height / 2.0f) / (this.height / 18.0f));
        this.x = this.width / 4;
        this.y = this.height / 4 + 48;
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        this.mc.getTextureManager().bindTexture(this.background);
        drawCompleteImage(-16.0f + xOffset, -9.0f + yOffset, (float)(this.width + 32), (float)(this.height + 18));
        for (final DonatorItem item : this.donatorItems) {
            item.updatePos();
            switch (item.getSize()) {
                case 1: {
                    Stay.DONATOR_FONT_MANAGER.drawSmallStringRainbow(item.getName(), (float)item.getX(), (float)item.getY(), item.getRgb());
                    continue;
                }
                case 2: {
                    Stay.DONATOR_FONT_MANAGER.drawMediumStringRainbow(item.getName(), (float)item.getX(), (float)item.getY(), item.getRgb());
                    continue;
                }
                case 3: {
                    Stay.DONATOR_FONT_MANAGER.drawLargeStringRainbow(item.getName(), (float)item.getX(), (float)item.getY(), item.getRgb());
                    continue;
                }
            }
        }
        Stay.MENU_FONT_MANAGER.drawStringBig("STAY Client", (float)this.x, this.y - 20.0f, Color.white.getRGB(), true);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    
    private static class TextButton extends GuiButton
    {
        public TextButton(final int buttonId, final int x, final int y, final String buttonText) {
            super(buttonId, x, y, Stay.MENU_FONT_MANAGER.getTextWidth(buttonText), Stay.MENU_FONT_MANAGER.getTextHeight(), buttonText);
        }
        
        public void drawButton(final Minecraft mc, final int mouseX, final int mouseY, final float partialTicks) {
            if (this.visible) {
                this.enabled = true;
                this.hovered = (mouseX >= (float)this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height);
                Stay.MENU_FONT_MANAGER.drawStringWithShadow(this.displayString, this.x + 1.0f, (float)this.y, Color.WHITE.getRGB());
                if (this.hovered) {
                    RenderUtil.drawLine(this.x - 5.0f, (float)(this.y + 2 + Stay.MENU_FONT_MANAGER.getTextHeight()), this.x - 5.0f, (float)(this.y - 2), 2.0f, Rainbow.getColour().getRGB());
                }
            }
        }
        
        public boolean mousePressed(final Minecraft mc, final int mouseX, final int mouseY) {
            return this.enabled && this.visible && mouseX >= this.x - Stay.MENU_FONT_MANAGER.getTextWidth(this.displayString) / 2.0f && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
        }
    }
}
