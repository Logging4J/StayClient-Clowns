//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.gui.components.items.buttons;

import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.graphics.opengl.*;
import me.alpha432.stay.features.gui.*;
import me.alpha432.stay.manager.*;
import net.minecraft.init.*;
import net.minecraft.client.audio.*;

public class BooleanButton extends Button
{
    private final Setting setting;
    
    public BooleanButton(final Setting setting) {
        super(setting.getName());
        this.setting = setting;
        this.width = 15;
    }
    
    @Override
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
        Stay.textManager.drawStringWithShadow(this.getName(), this.x + 2.3f, this.y - 1.7f - StayGui.getClickGui().getTextOffset(), this.getState() ? -1 : -5592406);
    }
    
    @Override
    public void update() {
        this.setHidden(!this.setting.isVisible());
    }
    
    @Override
    public void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        if (this.isHovering(mouseX, mouseY)) {
            BooleanButton.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0f));
        }
    }
    
    @Override
    public int getHeight() {
        return 14;
    }
    
    @Override
    public void toggle() {
        this.setting.setValue(!this.setting.getValue());
    }
    
    @Override
    public boolean getState() {
        return this.setting.getValue();
    }
}
