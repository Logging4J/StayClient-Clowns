//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.gui.components.items.buttons;

import me.alpha432.stay.features.gui.components.items.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.graphics.opengl.*;
import me.alpha432.stay.features.gui.*;
import me.alpha432.stay.manager.*;
import net.minecraft.init.*;
import net.minecraft.client.audio.*;
import me.alpha432.stay.features.gui.components.*;
import java.util.*;

public class Button extends Item
{
    private boolean state;
    
    public Button(final String name) {
        super(name);
        this.height = 15;
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        final float x = this.x;
        final float y = this.y;
        final float w = this.x + this.width;
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
        Stay.textManager.drawStringWithShadow(this.getName(), this.x + 2.3f, this.y - 2.0f - StayGui.getClickGui().getTextOffset(), this.getState() ? -1 : -5592406);
    }
    
    @Override
    public void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) {
        if (mouseButton == 0 && this.isHovering(mouseX, mouseY)) {
            this.onMouseClick();
        }
    }
    
    public void onMouseClick() {
        this.state = !this.state;
        this.toggle();
        Button.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0f));
    }
    
    public void toggle() {
    }
    
    public boolean getState() {
        return this.state;
    }
    
    @Override
    public int getHeight() {
        return 14;
    }
    
    public boolean isHovering(final int mouseX, final int mouseY) {
        for (final Component component : StayGui.getClickGui().getComponents()) {
            if (!component.drag) {
                continue;
            }
            return false;
        }
        return mouseX >= this.getX() && mouseX <= this.getX() + this.getWidth() && mouseY >= this.getY() && mouseY <= this.getY() + this.height;
    }
}
