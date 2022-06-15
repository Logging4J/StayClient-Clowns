//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.manager.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.entity.item.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.world.*;
import me.alpha432.stay.client.*;
import net.minecraft.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class AutoHoleFiller extends Module
{
    public Setting<Double> range;
    public Setting<Boolean> smart;
    public Setting<Integer> smartRange;
    private final Setting<Boolean> announceUsage;
    private BlockPos render;
    private EntityPlayer closestTarget;
    int resetTimer;
    boolean rotated;
    private static boolean isSpoofingAngles;
    private static double yaw;
    private static double pitch;
    
    @Override
    public void onUpdate() {
        if (AutoHoleFiller.mc.player != null && !ModuleManager.getModuleByName("Freecam").isEnabled() && AutoHoleFiller.mc.world != null) {
            if (this.smart.getValue()) {
                this.findClosestTarget();
            }
            BlockPos q = null;
            final double dist = 0.0;
            final double prevDist = 0.0;
            int obsidianSlot = (AutoHoleFiller.mc.player.getHeldItemMainhand().getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN)) ? AutoHoleFiller.mc.player.inventory.currentItem : -1;
            if (obsidianSlot == -1) {
                for (int l = 0; l < 9; ++l) {
                    if (AutoHoleFiller.mc.player.inventory.getStackInSlot(l).getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN)) {
                        obsidianSlot = l;
                        break;
                    }
                }
            }
            if (obsidianSlot == -1) {
                if (this.rotated) {
                    this.resetTimer = 0;
                    this.rotated = false;
                }
            }
            else {
                final EntityPlayer w = this.findClosestTarget();
                if (w == null) {
                    ++this.resetTimer;
                    this.resetTimer = 0;
                    this.rotated = false;
                }
                else {
                    final List<BlockPos> blocks = this.findCrystalBlocks((EntityPlayer)AutoHoleFiller.mc.player);
                    blocks.sort(Comparator.comparing(e -> BlockInteractionHelper.blockDistance2d(e.getX() + 0.5, e.getZ() + 0.5, (Entity)w)));
                    final boolean b;
                    blocks.removeIf(e -> {
                        if (Math.sqrt(w.getDistanceSq(e.getX() + 0.5, (double)e.getY(), e.getZ() + 0.5)) <= 2.5) {
                            if (!AutoHoleFiller.mc.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(e)).isEmpty()) {
                                if (!(!AutoHoleFiller.mc.world.getEntitiesWithinAABB((Class)EntityItem.class, new AxisAlignedBB(e)).isEmpty())) {
                                    return 1 != 0;
                                }
                            }
                            if (Math.sqrt(AutoHoleFiller.mc.player.getDistanceSq((double)e.getX(), (double)(e.getY() - AutoHoleFiller.mc.player.getEyeHeight()), (double)e.getZ())) <= this.range.getValue()) {
                                return b;
                            }
                        }
                        return b;
                    });
                    q = blocks.stream().findFirst().orElse(null);
                    if ((this.render = q) == null) {
                        ++this.resetTimer;
                        if (this.resetTimer >= 5 && this.rotated) {
                            this.resetTimer = 0;
                            this.rotated = false;
                        }
                    }
                    else if (AutoHoleFiller.mc.player.onGround) {
                        final int oldSlot = AutoHoleFiller.mc.player.inventory.currentItem;
                        if (AutoHoleFiller.mc.player.inventory.currentItem != obsidianSlot) {
                            AutoHoleFiller.mc.player.inventory.currentItem = obsidianSlot;
                        }
                        final boolean y = this.placeBlockScaffold(this.render);
                        if (!y) {
                            ++this.resetTimer;
                            if (this.resetTimer >= 5 && this.rotated) {
                                this.resetTimer = 0;
                                this.rotated = false;
                            }
                        }
                        else {
                            this.rotated = true;
                            this.resetTimer = 0;
                        }
                        AutoHoleFiller.mc.player.swingArm(EnumHand.MAIN_HAND);
                        AutoHoleFiller.mc.player.inventory.currentItem = oldSlot;
                    }
                }
            }
        }
    }
    
    @SubscribeEvent
    public void onUpdateWalkingPlayer(final PacketEvent.Send event) {
        final Packet<?> packet = (Packet<?>)event.getPacket();
        if (packet instanceof CPacketPlayer && AutoHoleFiller.isSpoofingAngles) {
            ((CPacketPlayer)packet).yaw = (float)AutoHoleFiller.yaw;
            ((CPacketPlayer)packet).pitch = (float)AutoHoleFiller.pitch;
        }
    }
    
    @Override
    public void onEnable() {
        if (this.announceUsage.getValue()) {
            Command.sendMessage("[HoleFiller] " + ChatFormatting.GREEN.toString() + "Enabled" + ChatFormatting.RESET.toString() + "!");
        }
    }
    
    public boolean placeBlockScaffold(final BlockPos pos) {
        if (AutoHoleFiller.mc.world.getEntitiesWithinAABB((Class)EntityPlayer.class, new AxisAlignedBB(pos)).isEmpty() && AutoHoleFiller.mc.world.getEntitiesWithinAABB((Class)EntityEnderCrystal.class, new AxisAlignedBB(pos)).isEmpty()) {
            new Vec3d(Wrapper.getPlayer().posX, Wrapper.getPlayer().posY + Wrapper.getPlayer().getEyeHeight(), Wrapper.getPlayer().posZ);
            for (final EnumFacing side : EnumFacing.values()) {
                final BlockPos neighbor = pos.offset(side);
                final EnumFacing side2 = side.getOpposite();
                if (BlockInteractionHelper.canBeClicked(neighbor)) {
                    final Vec3d hitVec = new Vec3d((Vec3i)neighbor).add(0.5, 0.5, 0.5).add(new Vec3d(side2.getDirectionVec()).scale(0.5));
                    final float[] w = BlockInteractionHelper.getLegitRotations(hitVec);
                    AutoHoleFiller.mc.playerController.processRightClickBlock(AutoHoleFiller.mc.player, AutoHoleFiller.mc.world, neighbor, side2, hitVec, EnumHand.MAIN_HAND);
                    Wrapper.getPlayer().swingArm(EnumHand.MAIN_HAND);
                    AutoHoleFiller.mc.rightClickDelayTimer = 4;
                    return true;
                }
            }
        }
        return false;
    }
    
    private double getDistanceToBlockPos(final BlockPos pos1, final BlockPos pos2) {
        final double x = pos1.getX() - pos2.getX();
        final double y = pos1.getY() - pos2.getY();
        final double z = pos1.getZ() - pos2.getZ();
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    private void lookAtPacket(final double px, final double py, final double pz, final EntityPlayer me) {
        final double[] v = EntityUtils.calculateLookAt(px, py, pz, me);
        setYawAndPitch((float)v[0], (float)v[1]);
    }
    
    private boolean IsHole(final BlockPos blockPos) {
        final BlockPos boost = blockPos.add(0, 1, 0);
        final BlockPos boost2 = blockPos.add(0, 0, 0);
        final BlockPos boost3 = blockPos.add(0, 0, -1);
        final BlockPos boost4 = blockPos.add(1, 0, 0);
        final BlockPos boost5 = blockPos.add(-1, 0, 0);
        final BlockPos boost6 = blockPos.add(0, 0, 1);
        final BlockPos boost7 = blockPos.add(0, 2, 0);
        final BlockPos boost8 = blockPos.add(0.5, 0.5, 0.5);
        final BlockPos boost9 = blockPos.add(0, -1, 0);
        return AutoHoleFiller.mc.world.getBlockState(boost).getBlock() == Blocks.AIR && AutoHoleFiller.mc.world.getBlockState(boost2).getBlock() == Blocks.AIR && AutoHoleFiller.mc.world.getBlockState(boost7).getBlock() == Blocks.AIR && (AutoHoleFiller.mc.world.getBlockState(boost3).getBlock() == Blocks.OBSIDIAN || AutoHoleFiller.mc.world.getBlockState(boost3).getBlock() == Blocks.BEDROCK || AutoHoleFiller.mc.world.getBlockState(boost3).getBlock() == Blocks.ENDER_CHEST) && (AutoHoleFiller.mc.world.getBlockState(boost4).getBlock() == Blocks.OBSIDIAN || AutoHoleFiller.mc.world.getBlockState(boost4).getBlock() == Blocks.BEDROCK || AutoHoleFiller.mc.world.getBlockState(boost4).getBlock() == Blocks.ENDER_CHEST) && (AutoHoleFiller.mc.world.getBlockState(boost5).getBlock() == Blocks.OBSIDIAN || AutoHoleFiller.mc.world.getBlockState(boost5).getBlock() == Blocks.BEDROCK || AutoHoleFiller.mc.world.getBlockState(boost5).getBlock() == Blocks.ENDER_CHEST) && (AutoHoleFiller.mc.world.getBlockState(boost6).getBlock() == Blocks.OBSIDIAN || AutoHoleFiller.mc.world.getBlockState(boost6).getBlock() == Blocks.BEDROCK || AutoHoleFiller.mc.world.getBlockState(boost6).getBlock() == Blocks.ENDER_CHEST) && AutoHoleFiller.mc.world.getBlockState(boost8).getBlock() == Blocks.AIR && (AutoHoleFiller.mc.world.getBlockState(boost9).getBlock() == Blocks.OBSIDIAN || AutoHoleFiller.mc.world.getBlockState(boost9).getBlock() == Blocks.BEDROCK || AutoHoleFiller.mc.world.getBlockState(boost9).getBlock() == Blocks.ENDER_CHEST);
    }
    
    public static BlockPos getPlayerPos() {
        return new BlockPos(Math.floor(AutoHoleFiller.mc.player.posX), Math.floor(AutoHoleFiller.mc.player.posY), Math.floor(AutoHoleFiller.mc.player.posZ));
    }
    
    public BlockPos getClosestTargetPos() {
        return (this.closestTarget != null) ? new BlockPos(Math.floor(this.closestTarget.posX), Math.floor(this.closestTarget.posY), Math.floor(this.closestTarget.posZ)) : null;
    }
    
    private EntityPlayer findClosestTarget() {
        final List<EntityPlayer> playerList = (List<EntityPlayer>)AutoHoleFiller.mc.world.playerEntities;
        EntityPlayer closesttarget = null;
        for (final EntityPlayer target : playerList) {
            if (target != AutoHoleFiller.mc.player && !Stay.friendManager.isFriend(target.getName()) && EntityUtils.isLiving((Entity)target) && target.getHealth() > 0.0f) {
                if (closesttarget == null) {
                    closesttarget = target;
                }
                else {
                    if (AutoHoleFiller.mc.player.getDistance((Entity)target) >= AutoHoleFiller.mc.player.getDistance((Entity)closesttarget)) {
                        continue;
                    }
                    closesttarget = target;
                }
            }
        }
        return closesttarget;
    }
    
    private boolean isInRange(final BlockPos blockPos) {
        final NonNullList<BlockPos> positions = (NonNullList<BlockPos>)NonNullList.create();
        positions.addAll((Collection)this.getSphere(getPlayerPos(), this.range.getValue().floatValue(), this.range.getValue().intValue(), false, true, 0).stream().filter((Predicate<? super Object>)this::IsHole).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        return positions.contains((Object)blockPos);
    }
    
    private List<BlockPos> findCrystalBlocks(final EntityPlayer player) {
        final NonNullList<BlockPos> positions = (NonNullList<BlockPos>)NonNullList.create();
        if (this.smart.getValue() && this.closestTarget != null) {
            positions.addAll((Collection)this.getSphere(this.getClosestTargetPos(), this.smartRange.getValue(), this.range.getValue().intValue(), false, true, 0).stream().filter((Predicate<? super Object>)this::IsHole).filter((Predicate<? super Object>)this::isInRange).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        }
        else if (!this.smart.getValue()) {
            positions.addAll((Collection)this.getSphere(player.getPosition(), this.range.getValue().floatValue(), this.range.getValue().intValue(), false, true, 0).stream().filter((Predicate<? super Object>)this::IsHole).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        }
        return (List<BlockPos>)positions;
    }
    
    public List<BlockPos> getSphere(final BlockPos loc, final float r, final int h, final boolean hollow, final boolean sphere, final int plus_y) {
        final List<BlockPos> circleblocks = new ArrayList<BlockPos>();
        final int cx = loc.getX();
        final int cy = loc.getY();
        final int cz = loc.getZ();
        for (int x = cx - (int)r; x <= cx + r; ++x) {
            for (int z = cz - (int)r; z <= cz + r; ++z) {
                for (int y = sphere ? (cy - (int)r) : cy; y < (sphere ? (cy + r) : ((float)(cy + h))); ++y) {
                    final double dist = (cx - x) * (cx - x) + (cz - z) * (cz - z) + (sphere ? ((cy - y) * (cy - y)) : 0);
                    if (dist < r * r && (!hollow || dist >= (r - 1.0f) * (r - 1.0f))) {
                        final BlockPos l = new BlockPos(x, y + plus_y, z);
                        circleblocks.add(l);
                    }
                }
            }
        }
        return circleblocks;
    }
    
    private static void setYawAndPitch(final float yaw1, final float pitch1) {
        AutoHoleFiller.yaw = yaw1;
        AutoHoleFiller.pitch = pitch1;
        AutoHoleFiller.isSpoofingAngles = true;
    }
    
    private static void resetRotation() {
        if (AutoHoleFiller.isSpoofingAngles) {
            AutoHoleFiller.yaw = AutoHoleFiller.mc.player.rotationYaw;
            AutoHoleFiller.pitch = AutoHoleFiller.mc.player.rotationPitch;
            AutoHoleFiller.isSpoofingAngles = false;
        }
    }
    
    @Override
    public void onDisable() {
        this.closestTarget = null;
        this.render = null;
        resetRotation();
        if (this.announceUsage.getValue()) {
            Command.sendMessage("[HoleFiller] " + ChatFormatting.RED.toString() + "Disabled" + ChatFormatting.RESET.toString() + "!");
        }
    }
    
    public AutoHoleFiller() {
        super("AutoHoleFiller", "AutoHoleFiller", Category.COMBAT, true, false, false);
        this.range = (Setting<Double>)this.register(new Setting("Range", (T)4.5, (T)0.0, (T)6.0));
        this.smart = (Setting<Boolean>)this.register(new Setting("Smart", (T)false));
        this.smartRange = (Setting<Integer>)this.register(new Setting("distance2", (T)4, (T)1, (T)6));
        this.announceUsage = (Setting<Boolean>)this.register(new Setting("Announce Usage", (T)false));
        this.rotated = false;
    }
}
