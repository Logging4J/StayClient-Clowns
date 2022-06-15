//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.block.*;

public class Burrow3 extends Module
{
    private Setting<Boolean> Rotate;
    private final Setting<Float> offset;
    public Setting<Mode> burrowMode;
    int oldSlot;
    private BlockPos originalPos;
    public boolean shouldEnable;
    
    public Burrow3() {
        super("Burrow3", "", Category.COMBAT, true, false, false);
        this.Rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)false));
        this.offset = (Setting<Float>)this.register(new Setting("Force", (T)0.1f, (T)(-2.0f), (T)1.0f));
        this.burrowMode = (Setting<Mode>)this.register(new Setting("Swing", (T)Mode.FakeJump));
        this.oldSlot = -1;
        this.shouldEnable = true;
    }
    
    @SubscribeEvent
    public void PacketReceiveEvent(final PacketEvent.Receive event) {
    }
    
    @Override
    public void onEnable() {
        this.originalPos = new BlockPos(Burrow3.mc.player.posX, Burrow3.mc.player.posY, Burrow3.mc.player.posZ);
        if (!Burrow3.mc.world.getBlockState(new BlockPos(Burrow3.mc.player.posX, Burrow3.mc.player.posY, Burrow3.mc.player.posZ)).getBlock().equals(Blocks.OBSIDIAN) && !intersectsWithEntity(this.originalPos)) {
            this.shouldEnable = true;
            this.oldSlot = Burrow3.mc.player.inventory.currentItem;
        }
        else {
            this.shouldEnable = false;
            this.toggle();
        }
        if (this.burrowMode.getValue() == Mode.Jump) {
            Burrow3.mc.player.jump();
        }
    }
    
    @Override
    public void onDisable() {
        this.shouldEnable = false;
    }
    
    @Override
    public void onUpdate() {
        if (fullNullCheck()) {
            this.disable();
        }
        if (this.burrowMode.getValue() == Mode.Jump && Burrow3.mc.player.posY > this.originalPos.getY() + 1.05) {
            Burrow3.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position((double)this.originalPos.getX(), this.originalPos.getY() + 1.04, (double)this.originalPos.getZ(), true));
            Burrow3.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow3.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            final int old = Burrow3.mc.player.inventory.currentItem;
            Burrow3.mc.player.setSneaking(true);
            Burrow3.mc.player.inventory.currentItem = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass());
            this.placeBlock(this.originalPos, EnumHand.MAIN_HAND, this.Rotate.getValue(), true);
            Burrow3.mc.player.inventory.currentItem = old;
            Burrow3.mc.player.motionY = this.offset.getValue();
            this.disable();
            Burrow3.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow3.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
        }
    }
    
    private static boolean intersectsWithEntity(final BlockPos pos) {
        for (final Entity entity : Burrow3.mc.world.loadedEntityList) {
            if (!entity.equals((Object)Burrow3.mc.player) && !(entity instanceof EntityItem) && new AxisAlignedBB(pos).intersects(entity.getEntityBoundingBox())) {
                return true;
            }
        }
        return false;
    }
    
    public List<EnumFacing> getPossibleSides(final BlockPos pos) {
        final ArrayList<EnumFacing> facings = new ArrayList<EnumFacing>();
        if (Burrow3.mc.world != null && pos != null) {
            for (final EnumFacing side : EnumFacing.values()) {
                final BlockPos neighbour = pos.offset(side);
                final IBlockState blockState = Burrow3.mc.world.getBlockState(neighbour);
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
            Burrow3.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(pos, direction, hand, f, f2, f3));
        }
        else {
            Burrow3.mc.playerController.processRightClickBlock(Burrow3.mc.player, Burrow3.mc.world, pos, direction, vec, hand);
        }
        Burrow3.mc.player.swingArm(EnumHand.MAIN_HAND);
        Burrow3.mc.rightClickDelayTimer = 4;
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
        final Block neighbourBlock = Burrow3.mc.world.getBlockState(neighbour).getBlock();
        if (!Burrow3.mc.player.isSneaking() && (BlockInteractionHelper.blackList.contains(neighbourBlock) || BlockInteractionHelper.shulkerList.contains(neighbourBlock))) {
            Burrow3.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Burrow3.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            Burrow3.mc.player.setSneaking(true);
            sneaking = true;
        }
        if (rotate) {
            BlockInteractionHelper.faceVectorPacketInstant(hitVec);
        }
        this.rightClickBlock(neighbour, hitVec, hand, opposite, true);
        Burrow3.mc.player.swingArm(EnumHand.MAIN_HAND);
        Burrow3.mc.rightClickDelayTimer = 4;
        return sneaking || isSneaking;
    }
    
    public enum Mode
    {
        FakeJump, 
        Jump;
    }
}
