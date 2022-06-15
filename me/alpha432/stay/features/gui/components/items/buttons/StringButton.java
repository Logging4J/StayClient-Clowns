//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.gui.components.items.buttons;

import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.graphics.opengl.*;
import me.alpha432.stay.features.gui.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.manager.*;
import net.minecraft.init.*;
import net.minecraft.client.audio.*;
import net.minecraft.util.*;

public class StringButton extends Button
{
    private final Setting setting;
    public boolean isListening;
    private CurrentString currentString;
    
    public StringButton(final Setting setting) {
        super(setting.getName());
        this.currentString = new CurrentString("");
        this.setting = setting;
        this.width = 15;
    }
    
    public static String removeLastChar(final String str) {
        String output = "";
        if (str != null && str.length() > 0) {
            output = str.substring(0, str.length() - 1);
        }
        return output;
    }
    
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        final float x = this.x;
        final float y = this.y;
        final float w = this.x + this.width + 7.4f;
        final float h = this.y + this.height - 0.5f;
        int color;
        if (this.getState()) {
            if (!this.isHovering(mouseX, mouseY)) {
                final ColorManager colorManager = Stay.colorManager;
                final ModuleManager moduleManager = Stay.moduleManager;
                color = colorManager.getColorWithAlpha(ModuleManager.getModuleByClass(ClickGui.class).hoverAlpha.getValue());
            }
            else {
                final ColorManager colorManager2 = Stay.colorManager;
                final ModuleManager moduleManager2 = Stay.moduleManager;
                color = colorManager2.getColorWithAlpha(ModuleManager.getModuleByClass(ClickGui.class).alpha.getValue());
            }
        }
        else {
            color = (this.isHovering(mouseX, mouseY) ? -2007673515 : 290805077);
        }
        RenderUtil.drawRect(x, y, w, h, color);
        if (this.isListening) {
            Stay.textManager.drawStringWithShadow(this.currentString.getString() + Stay.textManager.getIdleSign(), this.x + 2.3f, this.y - 1.7f - StayGui.getClickGui().getTextOffset(), this.getState() ? -1 : -5592406);
        }
        else {
            Stay.textManager.drawStringWithShadow((this.setting.getName().equals("Buttons") ? "Buttons " : (this.setting.getName().equals("Prefix") ? ("Prefix  " + ChatFormatting.GRAY) : "")) + this.setting.getValue(), this.x + 2.3f, this.y - 1.7f - StayGui.getClickGui().getTextOffset(), this.getState() ? -1 : -5592406);
        }
    }
    
    public void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        if (this.isHovering(mouseX, mouseY)) {
            StringButton.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0f));
        }
    }
    
    public void onKeyTyped(final char typedChar, final int keyCode) {
        if (this.isListening) {
            switch (keyCode) {
                case 1: {
                    return;
                }
                case 28: {
                    this.enterString();
                }
                case 14: {
                    this.setString(removeLastChar(this.currentString.getString()));
                    break;
                }
            }
            if (ChatAllowedCharacters.isAllowedCharacter(typedChar)) {
                this.setString(this.currentString.getString() + typedChar);
            }
        }
    }
    
    public void update() {
        this.setHidden(!this.setting.isVisible());
    }
    
    private void enterString() {
        if (this.currentString.getString().isEmpty()) {
            this.setting.setValue(this.setting.getDefaultValue());
        }
        else {
            this.setting.setValue(this.currentString.getString());
        }
        this.setString("");
        this.onMouseClick();
    }
    
    public int getHeight() {
        return 14;
    }
    
    public void toggle() {
        this.isListening = !this.isListening;
    }
    
    public boolean getState() {
        return !this.isListening;
    }
    
    public void setString(final String newString) {
        this.currentString = new CurrentString(newString);
    }
    
    public static class CurrentString
    {
        private final String string;
        
        public CurrentString(final String string) {
            this.string = string;
        }
        
        public String getString() {
            return this.string;
        }
    }
}
