//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import net.minecraft.util.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.client.gui.*;
import me.alpha432.stay.loader.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.opengl.*;

public final class HitMarkers extends Module
{
    public final ResourceLocation image;
    private int renderTicks;
    public Setting<Integer> red;
    public Setting<Integer> green;
    public Setting<Integer> blue;
    public Setting<Integer> alpha;
    public Setting<Integer> thickness;
    public Setting<Double> time;
    
    public HitMarkers() {
        super("HitMarkers", "hitmarker thingys", Module.Category.VISUAL, false, false, false);
        this.red = (Setting<Integer>)this.register(new Setting("Red", (T)255, (T)0, (T)255));
        this.green = (Setting<Integer>)this.register(new Setting("Green", (T)255, (T)0, (T)255));
        this.blue = (Setting<Integer>)this.register(new Setting("Blue", (T)255, (T)0, (T)255));
        this.alpha = (Setting<Integer>)this.register(new Setting("Alpha", (T)255, (T)0, (T)255));
        this.thickness = (Setting<Integer>)this.register(new Setting("Thickness", (T)2, (T)1, (T)6));
        this.time = (Setting<Double>)this.register(new Setting("Time", (T)20.0, (T)1.0, (T)50.0));
        this.image = new ResourceLocation("hitmarker.png");
        this.renderTicks = 100;
    }
    
    public void onRender2D(final Render2DEvent event) {
        if (this.renderTicks < this.time.getValue()) {
            final ScaledResolution resolution = new ScaledResolution(HitMarkers.mc);
            this.drawHitMarkers();
        }
    }
    
    public void onEnable() {
        ForgeEntry.register(this);
    }
    
    public void onDisable() {
        ForgeEntry.unregister(this);
    }
    
    @SubscribeEvent
    public void onAttackEntity(final AttackEntityEvent event) {
        if (!event.getEntity().equals((Object)HitMarkers.mc.player)) {
            return;
        }
        this.renderTicks = 0;
    }
    
    @SubscribeEvent
    public void onTickClientTick(final TickEvent event) {
        ++this.renderTicks;
    }
    
    public void drawHitMarkers() {
        final ScaledResolution resolution = new ScaledResolution(HitMarkers.mc);
        RenderUtil.drawLine(resolution.getScaledWidth() / 2.0f - 4.0f, resolution.getScaledHeight() / 2.0f - 4.0f, resolution.getScaledWidth() / 2.0f - 8.0f, resolution.getScaledHeight() / 2.0f - 8.0f, this.thickness.getValue(), new Color(this.red.getValue(), this.green.getValue(), this.blue.getValue()).getRGB());
        RenderUtil.drawLine(resolution.getScaledWidth() / 2.0f + 4.0f, resolution.getScaledHeight() / 2.0f - 4.0f, resolution.getScaledWidth() / 2.0f + 8.0f, resolution.getScaledHeight() / 2.0f - 8.0f, this.thickness.getValue(), new Color(this.red.getValue(), this.green.getValue(), this.blue.getValue()).getRGB());
        RenderUtil.drawLine(resolution.getScaledWidth() / 2.0f - 4.0f, resolution.getScaledHeight() / 2.0f + 4.0f, resolution.getScaledWidth() / 2.0f - 8.0f, resolution.getScaledHeight() / 2.0f + 8.0f, this.thickness.getValue(), new Color(this.red.getValue(), this.green.getValue(), this.blue.getValue()).getRGB());
        RenderUtil.drawLine(resolution.getScaledWidth() / 2.0f + 4.0f, resolution.getScaledHeight() / 2.0f + 4.0f, resolution.getScaledWidth() / 2.0f + 8.0f, resolution.getScaledHeight() / 2.0f + 8.0f, this.thickness.getValue(), new Color(this.red.getValue(), this.green.getValue(), this.blue.getValue()).getRGB());
    }
}
