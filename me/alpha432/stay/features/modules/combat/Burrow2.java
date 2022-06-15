//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.block.*;

public class Burrow2 extends Module
{
    private Setting<Boolean> rotate;
    private boolean isSneaking;
    private BlockPos startPos;
    private boolean noFall;
    int oldSlot;
    private BlockPos originalPos;
    public boolean shouldEnable;
    
    public Burrow2() {
        super("Burrow+", "XD", Category.COMBAT, true, false, false);
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.isSneaking = false;
        this.startPos = null;
        this.noFall = false;
        this.oldSlot = -1;
        this.shouldEnable = true;
    }
    
    @Override
    public void onDisable() {
        this.isSneaking = EntityUtils.stopSneaking(this.isSneaking);
        if (!this.noFall) {
            return;
        }
        this.noFall = false;
    }
    
    @Override
    public void onEnable() {
        if (InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN) == -1) {
            Command.sendMessage("<" + this.getDisplayName() + "> " + ChatFormatting.RED + "Obsidian ?");
            this.disable();
            return;
        }
        this.originalPos = new BlockPos(Burrow2.mc.player.posX, Burrow2.mc.player.posY, Burrow2.mc.player.posZ);
        if (!Burrow2.mc.world.getBlockState(new BlockPos(Burrow2.mc.player.posX, Burrow2.mc.player.posY, Burrow2.mc.player.posZ)).getBlock().equals(Blocks.OBSIDIAN) && !intersectsWithEntity(this.originalPos)) {
            if (Burrow2.mc.world.getBlockState(new BlockPos(Burrow2.mc.player.getPositionVector().add(0.0, 3.0, 0.0))).getBlock() != Blocks.AIR || Burrow2.mc.world.getBlockState(new BlockPos(Burrow2.mc.player.getPositionVector().add(0.0, 2.0, 0.0))).getBlock() != Blocks.AIR) {
                Command.sendMessage("<" + this.getDisplayName() + "> " + ChatFormatting.RED + "From above stop you !");
                this.disable();
                return;
            }
            this.shouldEnable = true;
            this.oldSlot = Burrow2.mc.player.inventory.currentItem;
        }
        else {
            this.shouldEnable = false;
            this.toggle();
        }
    }
    
    @Override
    public void onTick() {
        if (Burrow2.mc.player != null && Burrow2.mc.world != null) {
            final int blockslot = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN);
            if (blockslot != -1) {
                Burrow2.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(blockslot));
            }
            EntityUtils.LocalPlayerfakeJump();
            Burrow2.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow2.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            this.placeBlock(this.originalPos, EnumHand.MAIN_HAND, this.rotate.getValue(), true);
            if (this.oldSlot != -1) {
                Burrow2.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.oldSlot));
            }
            Burrow2.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow2.mc.player.posX, Burrow2.mc.player.posY + 3.0, Burrow2.mc.player.posZ, false));
            Burrow2.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Burrow2.mc.player.posX, Burrow2.mc.player.posY, Burrow2.mc.player.posZ, true));
            Burrow2.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow2.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
            this.toggle();
        }
    }
    
    private static boolean intersectsWithEntity(final BlockPos pos) {
        for (final Entity entity : Burrow2.mc.world.loadedEntityList) {
            if (!entity.equals((Object)Burrow2.mc.player) && !(entity instanceof EntityItem) && new AxisAlignedBB(pos).intersects(entity.getEntityBoundingBox())) {
                return true;
            }
        }
        return false;
    }
    
    public List<EnumFacing> getPossibleSides(final BlockPos pos) {
        final ArrayList<EnumFacing> facings = new ArrayList<EnumFacing>();
        if (Burrow2.mc.world != null && pos != null) {
            for (final EnumFacing side : EnumFacing.values()) {
                final BlockPos neighbour = pos.offset(side);
                final IBlockState blockState = Burrow2.mc.world.getBlockState(neighbour);
                if (blockState != null && blockState.getBlock().canCollideCheck(blockState, false) && !blockState.getMaterial().isReplaceable()) {
                    facings.add(side);
                }
            }
            return facings;
        }
        return facings;
    }
    
    public void rightClickBlock(final BlockPos pos, final Vec3d vec, final EnumHand hand, final EnumFacing direction, final boolean packet) {
        if (packet) {
            final float f = (float)(vec.x - pos.getX());
            final float f2 = (float)(vec.y - pos.getY());
            final float f3 = (float)(vec.z - pos.getZ());
            Burrow2.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(pos, direction, hand, f, f2, f3));
        }
        else {
            Burrow2.mc.playerController.processRightClickBlock(Burrow2.mc.player, Burrow2.mc.world, pos, direction, vec, hand);
        }
        Burrow2.mc.player.swingArm(EnumHand.MAIN_HAND);
        Burrow2.mc.rightClickDelayTimer = 4;
    }
    
    public boolean placeBlock(final BlockPos pos, final EnumHand hand, final boolean rotate, final boolean isSneaking) {
        boolean sneaking = false;
        EnumFacing side = null;
        final Iterator<EnumFacing> iterator = this.getPossibleSides(pos).iterator();
        if (iterator.hasNext()) {
            side = iterator.next();
        }
        if (side == null) {
            return isSneaking;
        }
        final BlockPos neighbour = pos.offset(side);
        final EnumFacing opposite = side.getOpposite();
        final Vec3d hitVec = new Vec3d((Vec3i)neighbour).add(0.5, 0.5, 0.5).add(new Vec3d(opposite.getDirectionVec()).scale(0.5));
        final Block neighbourBlock = Burrow2.mc.world.getBlockState(neighbour).getBlock();
        if (!Burrow2.mc.player.isSneaking() && (BlockInteractionHelper.blackList.contains(neighbourBlock) || BlockInteractionHelper.shulkerList.contains(neighbourBlock))) {
            Burrow2.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow2.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            Burrow2.mc.player.setSneaking(true);
            sneaking = true;
        }
        if (rotate) {
            BlockInteractionHelper.faceVectorPacketInstant(hitVec);
        }
        this.rightClickBlock(neighbour, hitVec, hand, opposite, true);
        Burrow2.mc.player.swingArm(EnumHand.MAIN_HAND);
        Burrow2.mc.rightClickDelayTimer = 4;
        return sneaking || isSneaking;
    }
}
