//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import com.mojang.text2speech.*;
import java.util.concurrent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.event.*;
import java.util.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraft.entity.*;

public class NarratorTweaks extends Module
{
    public Setting<Boolean> pop;
    public Setting<Boolean> death;
    public Setting<Boolean> totemPop;
    public Setting<Boolean> killsay;
    public Setting<String> totemPopMessage;
    public Setting<String> deathMessages;
    public Setting<String> popEnemyMessage;
    public Setting<String> killsayMsg;
    private final Narrator narrator;
    private ConcurrentHashMap<String, Integer> targetedPlayers;
    
    public NarratorTweaks() {
        super("NarratorTweaks", "Sends messages through narrator", Category.MISC, true, false, false);
        this.pop = (Setting<Boolean>)this.register(new Setting("OwnTotemPop", (T)true));
        this.death = (Setting<Boolean>)this.register(new Setting("Death", (T)true));
        this.totemPop = (Setting<Boolean>)this.register(new Setting("EnemyTotemPop", (T)true));
        this.killsay = (Setting<Boolean>)this.register(new Setting("Killsay", (T)true));
        this.totemPopMessage = (Setting<String>)this.register(new Setting("PopMessage", (T)"<player> bro stop popping ", v -> this.pop.getValue()));
        this.deathMessages = (Setting<String>)this.register(new Setting("DeathMessage", (T)"<player> ayt bro its calm just come back innit", v -> this.death.getValue()));
        this.popEnemyMessage = (Setting<String>)this.register(new Setting("PopEnemyMessage", (T)"<player> YOU'RE POPPING KID", v -> this.totemPop.getValue()));
        this.killsayMsg = (Setting<String>)this.register(new Setting("KillsayMessage", (T)"1 sit no name dog!", v -> this.killsay.getValue()));
        this.narrator = Narrator.getNarrator();
        this.targetedPlayers = null;
    }
    
    @SubscribeEvent
    public void onTotemPop(final TotemPopEvent event) {
        if (event.getPlayer() == NarratorTweaks.mc.player) {
            this.narrator.say(this.totemPopMessage.getValue().replaceAll("<player>", NarratorTweaks.mc.player.getName()));
        }
    }
    
    public void onTotemPop(final EntityPlayer player) {
        this.narrator.say(this.popEnemyMessage.getValue().replaceAll("<player>", String.valueOf(PopCounter.TotemPopContainer.get(player.getName()))));
    }
    
    @SubscribeEvent
    public void onDeath(final DeathEvent event) {
        if (event.getPlayer() == NarratorTweaks.mc.player) {
            this.narrator.say(this.deathMessages.getValue().replaceAll("<player>", NarratorTweaks.mc.player.getName()));
        }
    }
    
    @Override
    public void onUpdate() {
        if (nullCheck()) {
            return;
        }
        if (this.targetedPlayers == null) {
            this.targetedPlayers = new ConcurrentHashMap<String, Integer>();
        }
        for (final Entity entity : NarratorTweaks.mc.world.getLoadedEntityList()) {
            final EntityPlayer player;
            if (entity instanceof EntityPlayer && (player = (EntityPlayer)entity).getHealth() <= 0.0f) {
                final String name2;
                if (!this.shouldAnnounce(name2 = player.getName())) {
                    continue;
                }
                this.doAnnounce(name2);
                break;
            }
        }
        this.targetedPlayers.forEach((name, timeout) -> {
            if (timeout <= 0) {
                this.targetedPlayers.remove(name);
            }
            else {
                this.targetedPlayers.put(name, timeout - 1);
            }
        });
    }
    
    private boolean shouldAnnounce(final String name) {
        return this.targetedPlayers.containsKey(name);
    }
    
    private void doAnnounce(final String name) {
        this.targetedPlayers.remove(name);
        this.narrator.say((String)this.killsayMsg.getValue());
        int u = 0;
        for (int i = 0; i < 10; ++i) {
            ++u;
        }
    }
    
    @SubscribeEvent
    public void onLeavingDeathEvent(final LivingDeathEvent event) {
        if (AutoGG.mc.player == null) {
            return;
        }
        if (this.targetedPlayers == null) {
            this.targetedPlayers = new ConcurrentHashMap<String, Integer>();
        }
        final EntityLivingBase entity;
        if ((entity = event.getEntityLiving()) == null) {
            return;
        }
        if (!(entity instanceof EntityPlayer)) {
            return;
        }
        final EntityPlayer player = (EntityPlayer)entity;
        if (player.getHealth() > 0.0f) {
            return;
        }
        final String name = player.getName();
        if (this.shouldAnnounce(name)) {
            this.doAnnounce(name);
        }
    }
}
