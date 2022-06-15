//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.util.*;
import net.minecraft.network.*;
import me.alpha432.stay.util.counting.*;
import java.util.concurrent.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.util.math.*;

public class PingSpoof extends Module
{
    private final Setting<Boolean> seconds;
    private final Setting<Integer> delay;
    private final Setting<Integer> secondDelay;
    private final Setting<Boolean> offOnLogout;
    private final Queue<Packet<?>> packets;
    private final Timer timer;
    private boolean receive;
    
    public PingSpoof() {
        super("PingSpoof", "Spoofs your ping!", Category.MISC, true, false, false);
        this.seconds = (Setting<Boolean>)this.register(new Setting("Seconds", (T)false));
        this.delay = (Setting<Integer>)this.register(new Setting("DelayMS", (T)20, (T)0, (T)1000, v -> !this.seconds.getValue()));
        this.secondDelay = (Setting<Integer>)this.register(new Setting("DelayS", (T)5, (T)0, (T)30, v -> this.seconds.getValue()));
        this.offOnLogout = (Setting<Boolean>)this.register(new Setting("Logout", (T)false));
        this.packets = new ConcurrentLinkedQueue<Packet<?>>();
        this.timer = new Timer();
        this.receive = true;
    }
    
    @Override
    public void onLoad() {
        if (this.offOnLogout.getValue()) {
            this.disable();
        }
    }
    
    @Override
    public void onLogout() {
        if (this.offOnLogout.getValue()) {
            this.disable();
        }
    }
    
    @Override
    public void onUpdate() {
        this.clearQueue();
    }
    
    @Override
    public void onDisable() {
        this.clearQueue();
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (this.receive && PingSpoof.mc.player != null && !PingSpoof.mc.isSingleplayer() && PingSpoof.mc.player.isEntityAlive() && event.getStage() == 0 && event.getPacket() instanceof CPacketKeepAlive) {
            this.packets.add((Packet<?>)event.getPacket());
            event.setCanceled(true);
        }
    }
    
    public void clearQueue() {
        if (PingSpoof.mc.player != null && !PingSpoof.mc.isSingleplayer() && PingSpoof.mc.player.isEntityAlive() && ((!this.seconds.getValue() && this.timer.passedMs(this.delay.getValue())) || (this.seconds.getValue() && this.timer.passedS(this.secondDelay.getValue())))) {
            final double limit = MathUtil.getIncremental(Math.random() * 10.0, 1.0);
            this.receive = false;
            for (int i = 0; i < limit; ++i) {
                final Packet<?> packet = this.packets.poll();
                if (packet != null) {
                    PingSpoof.mc.player.connection.sendPacket((Packet)packet);
                }
            }
            this.timer.reset();
            this.receive = true;
        }
    }
}
