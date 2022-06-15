//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import java.util.*;
import me.alpha432.stay.util.math.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;

public class AntiCrystal extends Module
{
    private final List<BlockPos> targets;
    private final Timer timer;
    private final Timer breakTimer;
    private final Timer checkTimer;
    public Setting<Float> range;
    public Setting<Float> wallsRange;
    public Setting<Float> minDmg;
    public Setting<Float> selfDmg;
    public Setting<Integer> placeDelay;
    public Setting<Integer> breakDelay;
    public Setting<Integer> checkDelay;
    public Setting<Integer> wasteAmount;
    public Setting<Boolean> switcher;
    public Setting<Boolean> rotate;
    public Setting<Boolean> packet;
    public Setting<Integer> rotations;
    private float yaw;
    private float pitch;
    private boolean rotating;
    private int rotationPacketsSpoofed;
    private Entity breakTarget;
    
    public AntiCrystal() {
        super("AntiCrystal", "Hacker shit", Category.COMBAT, true, false, false);
        this.targets = new ArrayList<BlockPos>();
        this.timer = new Timer();
        this.breakTimer = new Timer();
        this.checkTimer = new Timer();
        this.range = (Setting<Float>)this.register(new Setting("Range", (T)6.0f, (T)0.0f, (T)10.0f));
        this.wallsRange = (Setting<Float>)this.register(new Setting("WallsRange", (T)3.5f, (T)0.0f, (T)10.0f));
        this.minDmg = (Setting<Float>)this.register(new Setting("MinDmg", (T)6.0f, (T)0.0f, (T)100.0f));
        this.selfDmg = (Setting<Float>)this.register(new Setting("SelfDmg", (T)2.0f, (T)0.0f, (T)10.0f));
        this.placeDelay = (Setting<Integer>)this.register(new Setting("PlaceDelay", (T)0, (T)0, (T)500));
        this.breakDelay = (Setting<Integer>)this.register(new Setting("BreakDelay", (T)0, (T)0, (T)500));
        this.checkDelay = (Setting<Integer>)this.register(new Setting("CheckDelay", (T)0, (T)0, (T)500));
        this.wasteAmount = (Setting<Integer>)this.register(new Setting("WasteAmount", (T)1, (T)1, (T)5));
        this.switcher = (Setting<Boolean>)this.register(new Setting("Switch", (T)true));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.packet = (Setting<Boolean>)this.register(new Setting("Packet", (T)true));
        this.rotations = (Setting<Integer>)this.register(new Setting("Spoofs", (T)1, (T)1, (T)20));
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.rotating = false;
        this.rotationPacketsSpoofed = 0;
    }
    
    @Override
    public void onToggle() {
        this.rotating = false;
    }
    
    private Entity getDeadlyCrystal() {
        Entity bestcrystal = null;
        float highestDamage = 0.0f;
        for (final Entity crystal : AntiCrystal.mc.world.loadedEntityList) {
            if (crystal instanceof EntityEnderCrystal && AntiCrystal.mc.player.getDistanceSq(crystal) <= 169.0) {
                final float damage;
                if ((damage = DamageUtil.calculateDamage(crystal, (Entity)AntiCrystal.mc.player)) < this.minDmg.getValue()) {
                    continue;
                }
                if (bestcrystal == null) {
                    bestcrystal = crystal;
                    highestDamage = damage;
                }
                else {
                    if (damage <= highestDamage) {
                        continue;
                    }
                    bestcrystal = crystal;
                    highestDamage = damage;
                }
            }
        }
        return bestcrystal;
    }
    
    private int getSafetyCrystals(final Entity deadlyCrystal) {
        int count = 0;
        for (final Entity entity : AntiCrystal.mc.world.loadedEntityList) {
            final float damage;
            if (!(entity instanceof EntityEnderCrystal) && (damage = DamageUtil.calculateDamage(entity, (Entity)AntiCrystal.mc.player)) <= 2.0f) {
                if (deadlyCrystal.getDistanceSq(entity) > 144.0) {
                    continue;
                }
                ++count;
            }
        }
        return count;
    }
    
    private BlockPos getPlaceTarget(final Entity deadlyCrystal) {
        BlockPos closestPos = null;
        float smallestDamage = 10.0f;
        for (final BlockPos pos : BlockUtil.possiblePlacePositions(this.range.getValue())) {
            final float damage = DamageUtil.calculateDamage(pos, (Entity)AntiCrystal.mc.player);
            if (damage <= 2.0f && deadlyCrystal.getDistanceSq(pos) <= 144.0) {
                if (AntiCrystal.mc.player.getDistanceSq(pos) >= MathUtil.square(this.wallsRange.getValue()) && BlockUtil.rayTracePlaceCheck(pos, true, 1.0f)) {
                    continue;
                }
                if (closestPos == null) {
                    smallestDamage = damage;
                    closestPos = pos;
                }
                else {
                    if (damage >= smallestDamage) {
                        if (damage != smallestDamage) {
                            continue;
                        }
                        if (AntiCrystal.mc.player.getDistanceSq(pos) >= AntiCrystal.mc.player.getDistanceSq(closestPos)) {
                            continue;
                        }
                    }
                    smallestDamage = damage;
                    closestPos = pos;
                }
            }
        }
        return closestPos;
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (event.getStage() == 0 && this.rotate.getValue() && this.rotating) {
            if (event.getPacket() instanceof CPacketPlayer) {
                final CPacketPlayer packet = (CPacketPlayer)event.getPacket();
                packet.yaw = this.yaw;
                packet.pitch = this.pitch;
            }
            ++this.rotationPacketsSpoofed;
            if (this.rotationPacketsSpoofed >= this.rotations.getValue()) {
                this.rotating = false;
                this.rotationPacketsSpoofed = 0;
            }
        }
    }
    
    @Override
    public void onTick() {
        if (!fullNullCheck() && this.checkTimer.passedMs(this.checkDelay.getValue())) {
            final Entity deadlyCrystal = this.getDeadlyCrystal();
            if (deadlyCrystal != null) {
                final BlockPos placeTarget = this.getPlaceTarget(deadlyCrystal);
                if (placeTarget != null) {
                    this.targets.add(placeTarget);
                }
                this.placeCrystal(deadlyCrystal);
                this.breakTarget = this.getBreakTarget(deadlyCrystal);
                this.breakCrystal();
            }
            this.checkTimer.reset();
        }
    }
    
    public Entity getBreakTarget(final Entity deadlyCrystal) {
        Entity smallestCrystal = null;
        float smallestDamage = 10.0f;
        for (final Entity entity : AntiCrystal.mc.world.loadedEntityList) {
            final float damage;
            if (entity instanceof EntityEnderCrystal && (damage = DamageUtil.calculateDamage(entity, (Entity)AntiCrystal.mc.player)) <= this.selfDmg.getValue() && entity.getDistanceSq(deadlyCrystal) <= 144.0) {
                if (AntiCrystal.mc.player.getDistanceSq(entity) > MathUtil.square(this.wallsRange.getValue()) && EntityUtils.rayTraceHitCheck(entity, true)) {
                    continue;
                }
                if (smallestCrystal == null) {
                    smallestCrystal = entity;
                    smallestDamage = damage;
                }
                else {
                    if (damage >= smallestDamage) {
                        if (smallestDamage != damage) {
                            continue;
                        }
                        if (AntiCrystal.mc.player.getDistanceSq(entity) >= AntiCrystal.mc.player.getDistanceSq(smallestCrystal)) {
                            continue;
                        }
                    }
                    smallestCrystal = entity;
                    smallestDamage = damage;
                }
            }
        }
        return smallestCrystal;
    }
    
    private void placeCrystal(final Entity deadlyCrystal) {
        final boolean bl;
        final boolean offhand = bl = (AntiCrystal.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL);
        if (this.timer.passedMs(this.placeDelay.getValue()) && (this.switcher.getValue() || AntiCrystal.mc.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL || offhand) && !this.targets.isEmpty() && this.getSafetyCrystals(deadlyCrystal) <= this.wasteAmount.getValue()) {
            if (this.switcher.getValue() && AntiCrystal.mc.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && !offhand) {
                this.doSwitch();
            }
            this.rotateToPos(this.targets.get(this.targets.size() - 1));
            BlockUtil.placeCrystalOnBlock(this.targets.get(this.targets.size() - 1), offhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, true, true);
            this.timer.reset();
        }
    }
    
    private void doSwitch() {
        final int n;
        int crystalSlot = n = ((AntiCrystal.mc.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) ? AntiCrystal.mc.player.inventory.currentItem : -1);
        if (crystalSlot == -1) {
            for (int l = 0; l < 9; ++l) {
                if (AntiCrystal.mc.player.inventory.getStackInSlot(l).getItem() == Items.END_CRYSTAL) {
                    crystalSlot = l;
                    break;
                }
            }
        }
        if (crystalSlot != -1) {
            AntiCrystal.mc.player.inventory.currentItem = crystalSlot;
        }
    }
    
    private void breakCrystal() {
        if (this.breakTimer.passedMs(this.breakDelay.getValue()) && this.breakTarget != null && DamageUtil.canBreakWeakness((EntityPlayer)AntiCrystal.mc.player)) {
            this.rotateTo(this.breakTarget);
            EntityUtils.attackEntity(this.breakTarget, this.packet.getValue(), true);
            this.breakTimer.reset();
            this.targets.clear();
        }
    }
    
    private void rotateTo(final Entity entity) {
        if (this.rotate.getValue()) {
            final float[] angle = MathUtil.calcAngle(AntiCrystal.mc.player.getPositionEyes(AntiCrystal.mc.getRenderPartialTicks()), entity.getPositionVector());
            this.yaw = angle[0];
            this.pitch = angle[1];
            this.rotating = true;
        }
    }
    
    private void rotateToPos(final BlockPos pos) {
        if (this.rotate.getValue()) {
            final float[] angle = MathUtil.calcAngle(AntiCrystal.mc.player.getPositionEyes(AntiCrystal.mc.getRenderPartialTicks()), new Vec3d((double)(pos.getX() + 0.5f), (double)(pos.getY() - 0.5f), (double)(pos.getZ() + 0.5f)));
            this.yaw = angle[0];
            this.pitch = angle[1];
            this.rotating = true;
        }
    }
}
