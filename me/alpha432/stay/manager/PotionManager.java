//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.features.*;
import net.minecraft.entity.player.*;
import java.util.concurrent.*;
import net.minecraft.client.resources.*;
import java.util.*;
import net.minecraft.potion.*;
import com.mojang.realmsclient.gui.*;

public class PotionManager extends Feature
{
    private final Map<EntityPlayer, PotionList> potions;
    
    public PotionManager() {
        this.potions = new ConcurrentHashMap<EntityPlayer, PotionList>();
    }
    
    public List<PotionEffect> getOwnPotions() {
        return this.getPlayerPotions((EntityPlayer)PotionManager.mc.player);
    }
    
    public List<PotionEffect> getPlayerPotions(final EntityPlayer player) {
        final PotionList list = this.potions.get(player);
        List<PotionEffect> potions = new ArrayList<PotionEffect>();
        if (list != null) {
            potions = list.getEffects();
        }
        return potions;
    }
    
    public PotionEffect[] getImportantPotions(final EntityPlayer player) {
        final PotionEffect[] array = new PotionEffect[3];
        for (final PotionEffect effect : this.getPlayerPotions(player)) {
            final Potion potion = effect.getPotion();
            final String lowerCase = I18n.format(potion.getName(), new Object[0]).toLowerCase();
            switch (lowerCase) {
                case "strength": {
                    array[0] = effect;
                }
                case "weakness": {
                    array[1] = effect;
                }
                case "speed": {
                    array[2] = effect;
                    continue;
                }
            }
        }
        return array;
    }
    
    public String getPotionString(final PotionEffect effect) {
        final Potion potion = effect.getPotion();
        return I18n.format(potion.getName(), new Object[0]) + " " + (effect.getAmplifier() + 1) + " " + ChatFormatting.WHITE + Potion.getPotionDurationString(effect, 1.0f);
    }
    
    public String getColoredPotionString(final PotionEffect effect) {
        return this.getPotionString(effect);
    }
    
    public static class PotionList
    {
        private final List<PotionEffect> effects;
        
        public PotionList() {
            this.effects = new ArrayList<PotionEffect>();
        }
        
        public void addEffect(final PotionEffect effect) {
            if (effect != null) {
                this.effects.add(effect);
            }
        }
        
        public List<PotionEffect> getEffects() {
            return this.effects;
        }
    }
}
