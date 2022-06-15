//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.util.*;
import net.minecraft.item.*;

public class Swing extends Module
{
    private Setting<Hand> hand;
    
    public Swing() {
        super("NoSwing", "Changes the hand you swing with", Module.Category.VISUAL, false, false, false);
        this.hand = (Setting<Hand>)this.register(new Setting("Hand", (T)Hand.OFFHAND));
    }
    
    public void onUpdate() {
        if (Swing.mc.world == null) {
            return;
        }
        if (this.hand.getValue().equals(Hand.OFFHAND)) {
            Swing.mc.player.swingingHand = EnumHand.OFF_HAND;
        }
        if (this.hand.getValue().equals(Hand.MAINHAND)) {
            Swing.mc.player.swingingHand = EnumHand.MAIN_HAND;
        }
        if (this.hand.getValue().equals(Hand.PACKETSWING) && Swing.mc.player.getHeldItemMainhand().getItem() instanceof ItemSword && Swing.mc.entityRenderer.itemRenderer.prevEquippedProgressMainHand >= 0.9) {
            Swing.mc.entityRenderer.itemRenderer.equippedProgressMainHand = 1.0f;
            Swing.mc.entityRenderer.itemRenderer.itemStackMainHand = Swing.mc.player.getHeldItemMainhand();
        }
    }
    
    public enum Hand
    {
        OFFHAND, 
        MAINHAND, 
        PACKETSWING;
    }
}
