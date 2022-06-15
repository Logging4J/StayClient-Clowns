//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.gui.components.items.buttons;

import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.graphics.color.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.util.graphics.opengl.*;
import me.alpha432.stay.features.gui.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.manager.*;
import net.minecraft.init.*;
import net.minecraft.client.audio.*;
import me.alpha432.stay.features.setting.*;

public class BindButton extends Button
{
    private final Setting setting;
    public boolean isListening;
    
    public BindButton(final Setting setting) {
        super(setting.getName());
        this.setting = setting;
        this.width = 15;
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        final int color = ColorUtil.toARGB(ClickGui.getInstance().red.getValue(), ClickGui.getInstance().green.getValue(), ClickGui.getInstance().blue.getValue(), 255);
        final float x = this.x;
        final float y = this.y;
        final float w = this.x + this.width + 7.4f;
        final float h = this.y + this.height - 0.5f;
        int color2;
        if (this.getState()) {
            color2 = (this.isHovering(mouseX, mouseY) ? -2007673515 : 290805077);
        }
        else if (!this.isHovering(mouseX, mouseY)) {
            final ColorManager colorManager = Stay.colorManager;
            final ModuleManager moduleManager = Stay.moduleManager;
            color2 = colorManager.getColorWithAlpha(ModuleManager.getModuleByClass(ClickGui.class).hoverAlpha.getValue());
        }
        else {
            final ColorManager colorManager2 = Stay.colorManager;
            final ModuleManager moduleManager2 = Stay.moduleManager;
            color2 = colorManager2.getColorWithAlpha(ModuleManager.getModuleByClass(ClickGui.class).alpha.getValue());
        }
        RenderUtil.drawRect(x, y, w, h, color2);
        if (this.isListening) {
            Stay.textManager.drawStringWithShadow("Press a Key...", this.x + 2.3f, this.y - 1.7f - StayGui.getClickGui().getTextOffset(), -1);
        }
        else {
            Stay.textManager.drawStringWithShadow(this.setting.getName() + " " + ChatFormatting.GRAY + this.setting.getValue().toString().toUpperCase(), this.x + 2.3f, this.y - 1.7f - StayGui.getClickGui().getTextOffset(), this.getState() ? -1 : -5592406);
        }
    }
    
    @Override
    public void update() {
        this.setHidden(!this.setting.isVisible());
    }
    
    @Override
    public void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        if (this.isHovering(mouseX, mouseY)) {
            BindButton.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0f));
        }
    }
    
    @Override
    public void onKeyTyped(final char typedChar, final int keyCode) {
        if (this.isListening) {
            Bind bind = new Bind(keyCode);
            if (bind.toString().equalsIgnoreCase("Escape")) {
                return;
            }
            if (bind.toString().equalsIgnoreCase("Delete")) {
                bind = new Bind(-1);
            }
            this.setting.setValue(bind);
            this.onMouseClick();
        }
    }
    
    @Override
    public int getHeight() {
        return 14;
    }
    
    @Override
    public void toggle() {
        this.isListening = !this.isListening;
    }
    
    @Override
    public boolean getState() {
        return !this.isListening;
    }
}
