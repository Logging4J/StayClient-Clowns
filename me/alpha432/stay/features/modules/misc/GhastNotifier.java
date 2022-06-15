//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import net.minecraft.entity.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.monster.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.init.*;
import java.util.*;

public class GhastNotifier extends Module
{
    private Set<Entity> ghasts;
    public Setting<Boolean> Chat;
    public Setting<Boolean> Sound;
    
    public GhastNotifier() {
        super("GhastNotifier", "Helps you find ghasts", Category.MISC, true, false, false);
        this.ghasts = new HashSet<Entity>();
        this.Chat = (Setting<Boolean>)this.register(new Setting("Chat", (T)true));
        this.Sound = (Setting<Boolean>)this.register(new Setting("Sound", (T)true));
    }
    
    @Override
    public void onEnable() {
        this.ghasts.clear();
    }
    
    @Override
    public void onUpdate() {
        for (final Entity entity : GhastNotifier.mc.world.getLoadedEntityList()) {
            if (entity instanceof EntityGhast) {
                if (this.ghasts.contains(entity)) {
                    continue;
                }
                if (this.Chat.getValue()) {
                    Command.sendMessage("Ghast Detected at: " + entity.getPosition().getX() + "x, " + entity.getPosition().getY() + "y, " + entity.getPosition().getZ() + "z.");
                }
                this.ghasts.add(entity);
                if (!this.Sound.getValue()) {
                    continue;
                }
                GhastNotifier.mc.player.playSound(SoundEvents.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
            }
        }
    }
}
