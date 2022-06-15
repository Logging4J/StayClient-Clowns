//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.player;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.client.entity.*;
import java.util.*;
import com.mojang.authlib.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;

public class FakePlayer extends Module
{
    private final Setting<Integer> setHealth;
    private EntityOtherPlayerMP clonedPlayer;
    
    public FakePlayer() {
        super("FakePlayer", "Spawns a FakePlayer for testing", Module.Category.PLAYER, true, false, false);
        this.setHealth = (Setting<Integer>)this.register(new Setting("SetHealth", (T)20, (T)1, (T)20));
    }
    
    public void onEnable() {
        if (FakePlayer.mc.player != null && !FakePlayer.mc.player.isDead) {
            (this.clonedPlayer = new EntityOtherPlayerMP((World)FakePlayer.mc.world, new GameProfile(UUID.fromString("a3ca166d-c5f1-3d5a-baac-b18a5b38d4cd"), "Cuican"))).copyLocationAndAnglesFrom((Entity)FakePlayer.mc.player);
            this.clonedPlayer.rotationYawHead = FakePlayer.mc.player.rotationYawHead;
            this.clonedPlayer.rotationYaw = FakePlayer.mc.player.rotationYaw;
            this.clonedPlayer.rotationPitch = FakePlayer.mc.player.rotationPitch;
            this.clonedPlayer.inventory.copyInventory(FakePlayer.mc.player.inventory);
            this.clonedPlayer.setGameType(GameType.SURVIVAL);
            this.clonedPlayer.setHealth((float)this.setHealth.getValue());
            FakePlayer.mc.world.addEntityToWorld(-404, (Entity)this.clonedPlayer);
            this.clonedPlayer.onLivingUpdate();
            return;
        }
        this.disable();
    }
    
    public void onDisable() {
        if (FakePlayer.mc.world == null) {
            return;
        }
        FakePlayer.mc.world.removeEntityFromWorld(-404);
    }
}
