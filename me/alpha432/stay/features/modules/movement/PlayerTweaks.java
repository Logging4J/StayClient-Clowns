//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.server.*;
import me.alpha432.stay.event.*;

public class PlayerTweaks extends Module
{
    public Setting<Boolean> noSlow;
    public Setting<Boolean> antiKnockBack;
    public Setting<Boolean> noEntityPush;
    public Setting<Boolean> noBlockPush;
    public Setting<Boolean> noWaterPush;
    public Setting<Boolean> guiMove;
    public static PlayerTweaks INSTANCE;
    
    public PlayerTweaks() {
        super("PlayerTweaks", "XD", Module.Category.MOVEMENT, true, false, false);
        this.noSlow = (Setting<Boolean>)this.register(new Setting("No Slow", (T)true));
        this.antiKnockBack = (Setting<Boolean>)this.register(new Setting("Velocity", (T)true));
        this.noEntityPush = (Setting<Boolean>)this.register(new Setting("No PlayerPush", (T)true));
        this.noBlockPush = (Setting<Boolean>)this.register(new Setting("No BlockPush", (T)true));
        this.noWaterPush = (Setting<Boolean>)this.register(new Setting("No LiquidPush", (T)true));
        this.guiMove = (Setting<Boolean>)this.register(new Setting("Gui Move", (T)true));
        this.setInstance();
    }
    
    public static PlayerTweaks getInstance() {
        if (PlayerTweaks.INSTANCE != null) {
            return PlayerTweaks.INSTANCE;
        }
        return PlayerTweaks.INSTANCE = new PlayerTweaks();
    }
    
    private void setInstance() {
        PlayerTweaks.INSTANCE = this;
    }
    
    @SubscribeEvent
    public void Slow(final InputUpdateEvent event) {
        if (!this.noSlow.getValue()) {
            return;
        }
        if (!PlayerTweaks.mc.player.isHandActive()) {
            return;
        }
        if (PlayerTweaks.mc.player.isRiding()) {
            return;
        }
        final MovementInput movementInput = event.getMovementInput();
        movementInput.moveStrafe *= 5.0f;
        final MovementInput movementInput2 = event.getMovementInput();
        movementInput2.moveForward *= 5.0f;
    }
    
    @SubscribeEvent
    public void onPacketReceived(final PacketEvent.Receive event) {
        if (fullNullCheck()) {
            return;
        }
        if (!this.antiKnockBack.getValue()) {
            return;
        }
        if (event.getPacket() instanceof SPacketEntityVelocity && ((SPacketEntityVelocity)event.getPacket()).getEntityID() == PlayerTweaks.mc.player.getEntityId()) {
            event.setCanceled(true);
        }
        if (!(event.getPacket() instanceof SPacketExplosion)) {
            return;
        }
        event.setCanceled(true);
    }
    
    @SubscribeEvent
    public void onPush(final PushEvent event) {
        if (fullNullCheck()) {
            return;
        }
        if (event.getStage() == 0 && this.noEntityPush.getValue() && event.getEntity().equals((Object)PlayerTweaks.mc.player)) {
            event.setX(-event.getX() * 0.0);
            event.setY(-event.getY() * 0.0);
            event.setZ(-event.getZ() * 0.0);
            return;
        }
        if (event.getStage() == 1 && this.noBlockPush.getValue()) {
            event.setCanceled(true);
            return;
        }
        if (event.getStage() != 2) {
            return;
        }
        if (!this.noWaterPush.getValue()) {
            return;
        }
        if (PlayerTweaks.mc.player == null) {
            return;
        }
        if (!PlayerTweaks.mc.player.equals((Object)event.getEntity())) {
            return;
        }
        event.setCanceled(true);
    }
    
    static {
        PlayerTweaks.INSTANCE = new PlayerTweaks();
    }
}
