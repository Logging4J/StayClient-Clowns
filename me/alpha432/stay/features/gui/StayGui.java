//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.gui;

import net.minecraft.client.gui.*;
import me.alpha432.stay.features.gui.components.*;
import me.alpha432.stay.util.graphics.animations.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.gui.components.items.buttons.*;
import me.alpha432.stay.features.*;
import java.util.function.*;
import java.util.*;
import me.alpha432.stay.features.gui.components.items.*;
import org.lwjgl.opengl.*;
import org.jetbrains.annotations.*;
import org.lwjgl.input.*;
import java.io.*;

public class StayGui extends GuiScreen
{
    private static StayGui INSTANCE;
    private AnimationFlag animationFlag;
    private final ArrayList<Component> components;
    
    public StayGui() {
        this.animationFlag = new AnimationFlag(Easing.OUT_QUINT, ClickGui.getInstance().fadingLength.getValue());
        this.components = new ArrayList<Component>();
        this.setInstance();
        this.load();
    }
    
    public static StayGui getInstance() {
        if (StayGui.INSTANCE == null) {
            StayGui.INSTANCE = new StayGui();
        }
        return StayGui.INSTANCE;
    }
    
    public static StayGui getClickGui() {
        return getInstance();
    }
    
    private void setInstance() {
        StayGui.INSTANCE = this;
    }
    
    public void initGui() {
        (this.animationFlag = new AnimationFlag(Easing.OUT_CUBIC, ClickGui.getInstance().fadingLength.getValue())).forceUpdate(0.0f, 0.0f);
    }
    
    private void load() {
        int x = -84;
        assert Stay.moduleManager != null;
        for (final Module.Category category : Stay.moduleManager.getCategories()) {
            final ArrayList<Component> components2 = this.components;
            final String name = category.getName();
            x += 95;
            components2.add(new Component(name, x, 4, true) {
                public void setupItems() {
                    StayGui$1.counter1 = new int[] { 1 };
                    Stay.moduleManager.getModulesByCategory(category).forEach(module -> {
                        if (!module.hidden) {
                            this.addButton((Button)new ModuleButton(module));
                        }
                    });
                }
            }.setWidth(90));
        }
        this.components.forEach(components -> components.getItems().sort(Comparator.comparing((Function<? super E, ? extends Comparable>)Feature::getName)));
    }
    
    public void updateModule(final Module module) {
        for (final Component component : this.components) {
            for (final Item item : component.getItems()) {
                if (!(item instanceof ModuleButton)) {
                    continue;
                }
                final ModuleButton button = (ModuleButton)item;
                final Module mod = button.getModule();
                if (module == null) {
                    continue;
                }
                if (!module.equals(mod)) {
                    continue;
                }
                button.initSettings();
            }
        }
    }
    
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        GL11.glPushMatrix();
        final double scala = this.animationFlag.getAndUpdate(1.0f);
        GL11.glTranslated(Math.cos(this.width * scala * 2.0), Math.cos(this.height), Math.cos(this.width));
        GL11.glScaled(scala, scala, (double)this.animationFlag.getAndUpdate(1.0f));
        this.checkMouseWheel();
        this.drawDefaultBackground();
        this.components.forEach(components -> components.drawScreen(mouseX, mouseY, partialTicks));
        GL11.glPopMatrix();
    }
    
    public void mouseClicked(final int mouseX, final int mouseY, final int clickedButton) {
        this.components.forEach(components -> components.mouseClicked(mouseX, mouseY, clickedButton));
    }
    
    public void mouseReleased(final int mouseX, final int mouseY, final int releaseButton) {
        this.components.forEach(components -> components.mouseReleased(mouseX, mouseY, releaseButton));
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    @Contract(pure = true)
    public final ArrayList<Component> getComponents() {
        return this.components;
    }
    
    public void checkMouseWheel() {
        final int dWheel = Mouse.getDWheel();
        if (dWheel < 0) {
            this.components.forEach(component -> component.setY(component.getY() - 10));
        }
        else if (dWheel > 0) {
            this.components.forEach(component -> component.setY(component.getY() + 10));
        }
    }
    
    public int getTextOffset() {
        return -6;
    }
    
    public Component getComponentByName(final String name) {
        for (final Component component : this.components) {
            if (!component.getName().equalsIgnoreCase(name)) {
                continue;
            }
            return component;
        }
        return null;
    }
    
    public void keyTyped(final char typedChar, final int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
        this.components.forEach(component -> component.onKeyTyped(typedChar, keyCode));
    }
    
    static {
        StayGui.INSTANCE = new StayGui();
    }
}
