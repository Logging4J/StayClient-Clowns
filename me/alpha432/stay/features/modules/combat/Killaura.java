//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.client.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.network.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.*;
import me.alpha432.stay.util.math.*;
import java.util.*;

public class Killaura extends Module
{
    private static Killaura INSTANCE;
    public static Entity target;
    private final Timer timer;
    public Setting<Float> range;
    public Setting<Boolean> delay;
    public Setting<Boolean> rotate;
    public Setting<Boolean> onlySharp;
    public Setting<Float> raytrace;
    public Setting<Boolean> players;
    public Setting<Boolean> mobs;
    public Setting<Boolean> animals;
    public Setting<Boolean> vehicles;
    public Setting<Boolean> projectiles;
    public Setting<Boolean> tps;
    public Setting<Boolean> packet;
    public Setting<Boolean> Ghosthand;
    
    public Killaura() {
        super("KillAura", "Kills aura.", Category.COMBAT, true, false, false);
        this.timer = new Timer();
        this.range = (Setting<Float>)this.register(new Setting("Range", (T)6.0f, (T)0.1f, (T)7.0f));
        this.delay = (Setting<Boolean>)this.register(new Setting("HitDelay", (T)true));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.onlySharp = (Setting<Boolean>)this.register(new Setting("SwordOnly", (T)true));
        this.raytrace = (Setting<Float>)this.register(new Setting("Raytrace", (T)6.0f, (T)0.1f, (T)7.0f, "Wall Range."));
        this.players = (Setting<Boolean>)this.register(new Setting("Players", (T)true));
        this.mobs = (Setting<Boolean>)this.register(new Setting("Mobs", (T)false));
        this.animals = (Setting<Boolean>)this.register(new Setting("Animals", (T)false));
        this.vehicles = (Setting<Boolean>)this.register(new Setting("Entities", (T)false));
        this.projectiles = (Setting<Boolean>)this.register(new Setting("Projectiles", (T)false));
        this.tps = (Setting<Boolean>)this.register(new Setting("TpsSync", (T)true));
        this.packet = (Setting<Boolean>)this.register(new Setting("Packet", (T)false));
        this.Ghosthand = (Setting<Boolean>)this.register(new Setting("Ghosthand", (T)false));
    }
    
    @Override
    public void onTick() {
        if (!this.rotate.getValue()) {
            this.doKillaura();
        }
    }
    
    public static Killaura getInstance() {
        if (Killaura.INSTANCE == null) {
            Killaura.INSTANCE = new Killaura();
        }
        return Killaura.INSTANCE;
    }
    
    @SubscribeEvent
    public void onMotionUpdateEvent(final MotionUpdateEvent event) {
        if (event.getStage() == 0 && this.rotate.getValue()) {
            this.doKillaura();
        }
    }
    
    private void doKillaura() {
        Killaura.target = this.getTarget();
        if (Killaura.target == null) {
            return;
        }
        int wait = this.delay.getValue() ? ((int)(DamageUtil.getCooldownByWeapon((EntityPlayer)Killaura.mc.player) * (this.tps.getValue() ? Stay.serverManager.getTpsFactor() : 1.0f))) : 0;
        Stay.targetManager.updateTarget((EntityLivingBase)Killaura.target);
        if (this.Ghosthand.getValue()) {
            final int sol = Killaura.mc.player.inventory.currentItem;
            final int det = InventoryUtil.getItemHotbar(Items.DIAMOND_SWORD);
            if (det == -1) {
                return;
            }
            wait = (this.delay.getValue() ? ((int)(600.0f * (this.tps.getValue() ? Stay.serverManager.getTpsFactor() : 1.0f))) : 0);
            if (!this.timer.passedMs(wait)) {
                return;
            }
            if (this.rotate.getValue()) {
                Stay.rotationManager.lookAtEntity(Killaura.target);
            }
            Killaura.mc.player.inventory.currentItem = det;
            if (this.packet.getValue()) {
                Killaura.mc.player.connection.sendPacket((Packet)new CPacketPlayer());
                EntityUtils.mc.player.connection.sendPacket((Packet)new CPacketUseEntity(Killaura.target));
            }
            else {
                EntityUtils.mc.playerController.attackEntity((EntityPlayer)EntityUtils.mc.player, Killaura.target);
            }
            EntityUtils.mc.player.swingArm(EnumHand.MAIN_HAND);
            Killaura.mc.player.inventory.currentItem = sol;
            this.timer.reset();
        }
        else {
            if (this.onlySharp.getValue() && !EntityUtils.holdingWeapon((EntityPlayer)Killaura.mc.player)) {
                Killaura.target = null;
                return;
            }
            if (!this.timer.passedMs(wait)) {
                return;
            }
            if (this.rotate.getValue()) {
                Stay.rotationManager.lookAtEntity(Killaura.target);
            }
            EntityUtils.attackEntity(Killaura.target, this.packet.getValue(), true);
            this.timer.reset();
        }
    }
    
    private Entity getTarget() {
        Entity target = null;
        double distance = this.range.getValue();
        double maxHealth = 36.0;
        for (final Entity entity : Killaura.mc.world.playerEntities) {
            if ((this.players.getValue() && entity instanceof EntityPlayer) || (this.animals.getValue() && EntityUtils.isPassive(entity)) || (this.mobs.getValue() && EntityUtils.isMobAggressive(entity)) || (this.vehicles.getValue() && EntityUtils.isVehicle(entity)) || (this.projectiles.getValue() && EntityUtils.isProjectile(entity))) {
                if (entity instanceof EntityLivingBase && EntityUtils.isntValid(entity, distance)) {
                    continue;
                }
                if (!Killaura.mc.player.canEntityBeSeen(entity) && !EntityUtils.canEntityFeetBeSeen(entity) && Killaura.mc.player.getDistanceSq(entity) > MathUtil.square(this.raytrace.getValue())) {
                    continue;
                }
                if (target == null) {
                    target = entity;
                    distance = Killaura.mc.player.getDistanceSq(entity);
                    maxHealth = EntityUtils.getHealth(entity);
                }
                else {
                    if (entity instanceof EntityPlayer && DamageUtil.isArmorLow((EntityPlayer)entity, 18)) {
                        target = entity;
                        break;
                    }
                    if (Killaura.mc.player.getDistanceSq(entity) < distance) {
                        target = entity;
                        distance = Killaura.mc.player.getDistanceSq(entity);
                        maxHealth = EntityUtils.getHealth(entity);
                    }
                    if (EntityUtils.getHealth(entity) >= maxHealth) {
                        continue;
                    }
                    target = entity;
                    distance = Killaura.mc.player.getDistanceSq(entity);
                    maxHealth = EntityUtils.getHealth(entity);
                }
            }
        }
        return target;
    }
    
    @Override
    public String getDisplayInfo() {
        if (Killaura.target instanceof EntityPlayer) {
            return Killaura.target.getName();
        }
        return null;
    }
    
    static {
        Killaura.INSTANCE = new Killaura();
    }
}
