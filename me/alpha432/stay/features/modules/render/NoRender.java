//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.init.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;

public class NoRender extends Module
{
    public static NoRender INSTANCE;
    public Setting<Boolean> armor;
    public Setting<Boolean> fire;
    public Setting<Boolean> blind;
    public Setting<Boolean> nausea;
    public Setting<Boolean> hurtCam;
    public Setting<Boolean> enchantmentTables;
    
    public NoRender() {
        super("NoRender", "No Render", Module.Category.VISUAL, true, false, false);
        this.armor = (Setting<Boolean>)this.register(new Setting("Armor", (T)true));
        this.fire = (Setting<Boolean>)this.register(new Setting("Frie", (T)true));
        this.blind = (Setting<Boolean>)this.register(new Setting("Blind", (T)true));
        this.nausea = (Setting<Boolean>)this.register(new Setting("Nausea", (T)true));
        this.hurtCam = (Setting<Boolean>)this.register(new Setting("HurtCam", (T)true));
        this.enchantmentTables = (Setting<Boolean>)this.register(new Setting("enchantmentTables", (T)true));
        this.setInstance();
    }
    
    public static NoRender getInstance() {
        if (NoRender.INSTANCE != null) {
            return NoRender.INSTANCE;
        }
        return NoRender.INSTANCE = new NoRender();
    }
    
    private void setInstance() {
        NoRender.INSTANCE = this;
    }
    
    public void onUpdate() {
        if (this.blind.getValue() && NoRender.mc.player.isPotionActive(MobEffects.BLINDNESS)) {
            NoRender.mc.player.removePotionEffect(MobEffects.BLINDNESS);
        }
        if (!this.nausea.getValue()) {
            return;
        }
        if (!NoRender.mc.player.isPotionActive(MobEffects.NAUSEA)) {
            return;
        }
        NoRender.mc.player.removePotionEffect(MobEffects.NAUSEA);
    }
    
    @SubscribeEvent
    public void NoRenderEventListener(final NoRenderEvent event) {
        if (event.getStage() == 0 && this.armor.getValue()) {
            event.setCanceled(true);
            return;
        }
        if (event.getStage() != 1) {
            return;
        }
        if (!this.hurtCam.getValue()) {
            return;
        }
        event.setCanceled(true);
    }
    
    @SubscribeEvent
    public void blockOverlayEventListener(final RenderBlockOverlayEvent event) {
        if (!this.fire.getValue()) {
            return;
        }
        if (event.getOverlayType() != RenderBlockOverlayEvent.OverlayType.FIRE) {
            return;
        }
        event.setCanceled(true);
    }
    
    static {
        NoRender.INSTANCE = new NoRender();
    }
}
