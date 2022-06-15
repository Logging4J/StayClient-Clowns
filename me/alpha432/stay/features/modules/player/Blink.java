//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.player;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import java.util.*;
import net.minecraft.network.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.math.*;
import java.util.concurrent.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import me.alpha432.stay.util.math.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Blink extends Module
{
    private Setting<Boolean> cPacketPlayer;
    private Setting<Mode> autoOff;
    private Setting<Integer> timeLimit;
    private Setting<Integer> packetLimit;
    private Setting<Float> distance;
    private Timer timer;
    private Queue<Packet<?>> packets;
    private EntityOtherPlayerMP entity;
    private int packetsCanceled;
    private BlockPos startPos;
    private static Blink INSTANCE;
    
    public Blink() {
        super("Blink", "Fakelag.", Module.Category.PLAYER, true, false, false);
        this.cPacketPlayer = (Setting<Boolean>)this.register(new Setting("CPacketPlayer", (T)true));
        this.autoOff = (Setting<Mode>)this.register(new Setting("AutoOff", (T)Mode.MANUAL));
        this.timeLimit = (Setting<Integer>)this.register(new Setting("Time", (T)20, (T)1, (T)500, v -> this.autoOff.getValue() == Mode.TIME));
        this.packetLimit = (Setting<Integer>)this.register(new Setting("Packets", (T)20, (T)1, (T)500, v -> this.autoOff.getValue() == Mode.PACKETS));
        this.distance = (Setting<Float>)this.register(new Setting("Distance", (T)10.0f, (T)1.0f, (T)100.0f, v -> this.autoOff.getValue() == Mode.DISTANCE));
        this.timer = new Timer();
        this.packets = new ConcurrentLinkedQueue<Packet<?>>();
        this.packetsCanceled = 0;
        this.startPos = null;
        this.setInstance();
    }
    
    private void setInstance() {
        Blink.INSTANCE = this;
    }
    
    public static Blink getInstance() {
        if (Blink.INSTANCE != null) {
            return Blink.INSTANCE;
        }
        return Blink.INSTANCE = new Blink();
    }
    
    public void onEnable() {
        if (!fullNullCheck()) {
            (this.entity = new EntityOtherPlayerMP((World)Blink.mc.world, Blink.mc.getSession().getProfile())).copyLocationAndAnglesFrom((Entity)Blink.mc.player);
            this.entity.rotationYaw = Blink.mc.player.rotationYaw;
            this.entity.rotationYawHead = Blink.mc.player.rotationYawHead;
            this.entity.inventory.copyInventory(Blink.mc.player.inventory);
            Blink.mc.world.addEntityToWorld(6942069, (Entity)this.entity);
            this.startPos = Blink.mc.player.getPosition();
        }
        else {
            this.disable();
        }
        this.packetsCanceled = 0;
        this.timer.reset();
    }
    
    public void onUpdate() {
        if (!nullCheck() && (this.autoOff.getValue() != Mode.TIME || !this.timer.passedS(this.timeLimit.getValue())) && (this.autoOff.getValue() != Mode.DISTANCE || this.startPos == null || Blink.mc.player.getDistanceSq(this.startPos) < MathUtil.square(this.distance.getValue()))) {
            if (this.autoOff.getValue() != Mode.PACKETS) {
                return;
            }
            if (this.packetsCanceled < this.packetLimit.getValue()) {
                return;
            }
        }
        this.disable();
    }
    
    public void onLogout() {
        if (!this.isOn()) {
            return;
        }
        this.disable();
    }
    
    @SubscribeEvent
    public void onSendPacket(final PacketEvent.Send event) {
        if (Blink.mc.world == null) {
            return;
        }
        if (Blink.mc.isSingleplayer()) {
            return;
        }
        final Object packet = event.getPacket();
        if (this.cPacketPlayer.getValue() && packet instanceof CPacketPlayer) {
            event.setCanceled(true);
            this.packets.add((Packet<?>)packet);
            ++this.packetsCanceled;
        }
        if (this.cPacketPlayer.getValue()) {
            return;
        }
        if (packet instanceof CPacketChatMessage) {
            return;
        }
        if (packet instanceof CPacketConfirmTeleport) {
            return;
        }
        if (packet instanceof CPacketKeepAlive) {
            return;
        }
        if (packet instanceof CPacketTabComplete) {
            return;
        }
        if (packet instanceof CPacketClientStatus) {
            return;
        }
        this.packets.add((Packet<?>)packet);
        event.setCanceled(true);
        ++this.packetsCanceled;
    }
    
    public void onDisable() {
        if (!fullNullCheck()) {
            Blink.mc.world.removeEntity((Entity)this.entity);
            while (!this.packets.isEmpty()) {
                Blink.mc.player.connection.sendPacket((Packet)this.packets.poll());
            }
        }
        this.startPos = null;
    }
    
    public String getDisplayInfo() {
        if (this.packets == null) {
            return null;
        }
        return this.packets.size() + "";
    }
    
    static {
        Blink.INSTANCE = new Blink();
    }
    
    public enum Mode
    {
        MANUAL, 
        TIME, 
        DISTANCE, 
        PACKETS;
    }
}
