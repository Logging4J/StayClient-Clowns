//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.gui;

import net.minecraft.client.gui.*;
import java.io.*;
import java.net.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import com.google.gson.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import java.lang.reflect.*;

public class GuiAccountSelector extends GuiScreen
{
    private GuiTextField username;
    private GuiTextField token;
    
    public void initGui() {
        this.username = new GuiTextField(0, this.mc.fontRenderer, this.width / 2 - 100, this.height / 2 - 50, 200, 20);
        this.token = new GuiTextField(1, this.mc.fontRenderer, this.width / 2 - 100, this.height / 2 - 25, 200, 20);
        this.addButton(new GuiButton(2, this.width / 2 - 102, this.height / 2, 204, 20, "Login"));
        this.addButton(new GuiButton(3, this.width / 2 - 102, this.height / 2 + 23, 204, 20, "Exit"));
        this.username.setFocused(true);
        this.username.setText("Username");
        this.token.setText("Token");
        this.token.setMaxStringLength(1000);
    }
    
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        this.drawDefaultBackground();
        this.username.drawTextBox();
        this.token.drawTextBox();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    
    protected void actionPerformed(final GuiButton button) {
        if (button.id == 2) {
            this.login(this.username.getText(), this.token.getText());
        }
        if (button.id == 3) {
            this.mc.displayGuiScreen((GuiScreen)null);
        }
    }
    
    protected void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) throws IOException {
        this.username.mouseClicked(mouseX, mouseY, mouseButton);
        this.token.mouseClicked(mouseX, mouseY, mouseButton);
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }
    
    protected void keyTyped(final char typedChar, final int keyCode) {
        this.username.textboxKeyTyped(typedChar, keyCode);
        this.token.textboxKeyTyped(typedChar, keyCode);
    }
    
    private void login(final String username, final String token) {
        try {
            final String content = IOUtils.toString(new URL("https://api.mojang.com/users/profiles/minecraft/" + username), StandardCharsets.UTF_8);
            final String uuid = new JsonParser().parse(content).getAsJsonObject().get("id").getAsString();
            final Session session = new Session(username, UUID.fromString(uuid.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5")).toString(), token, "mojang");
            final Field field = Minecraft.class.getDeclaredField("session");
            field.setAccessible(true);
            field.set(Minecraft.getMinecraft(), session);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
