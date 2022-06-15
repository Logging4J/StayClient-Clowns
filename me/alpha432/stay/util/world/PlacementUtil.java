//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.client.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import me.alpha432.stay.util.inventory.*;

public class PlacementUtil implements Util
{
    private static final Minecraft mc;
    private static boolean isSneaking;
    private static int placementConnections;
    
    public static boolean place(final BlockPos blockPos, final EnumHand enumHand, final boolean bl) {
        return placeBlock(blockPos, enumHand, bl, true, null);
    }
    
    public static boolean placeBlock(final BlockPos blockPos, final EnumHand enumHand, final boolean bl, final boolean bl2, final ArrayList<EnumFacing> arrayList) {
        final EntityPlayerSP entityPlayerSP = PlacementUtil.mc.player;
        final WorldClient worldClient = PlacementUtil.mc.world;
        final PlayerControllerMP playerControllerMP = PlacementUtil.mc.playerController;
        if (entityPlayerSP == null || worldClient == null || playerControllerMP == null) {
            return false;
        }
        if (!worldClient.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return false;
        }
        final EnumFacing enumFacing = (arrayList != null) ? BlockUtil.getPlaceableSideExlude(blockPos, (ArrayList)arrayList) : BlockUtil.getPlaceableSide(blockPos);
        if (enumFacing == null) {
            return false;
        }
        final BlockPos blockPos2 = blockPos.offset(enumFacing);
        final EnumFacing enumFacing2 = enumFacing.getOpposite();
        if (!BlockUtil.canBeClicked(blockPos2)) {
            return false;
        }
        final Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(0.5, 0.5, 0.5).add(new Vec3d(enumFacing2.getDirectionVec()).scale(0.5));
        final Block block = worldClient.getBlockState(blockPos2).getBlock();
        if ((!PlacementUtil.isSneaking && BlockUtil.blackList.contains(block)) || BlockUtil.shulkerList.contains(block)) {
            entityPlayerSP.connection.sendPacket((Packet)new CPacketEntityAction((Entity)entityPlayerSP, CPacketEntityAction.Action.START_SNEAKING));
            PlacementUtil.isSneaking = true;
        }
        if (bl) {
            BlockUtil.faceVectorPacketInstant(vec3d, Boolean.valueOf(true));
        }
        final EnumActionResult enumActionResult = playerControllerMP.processRightClickBlock(entityPlayerSP, worldClient, blockPos2, enumFacing2, vec3d, enumHand);
        if (!bl2 || enumActionResult == EnumActionResult.SUCCESS) {
            entityPlayerSP.swingArm(enumHand);
            PlacementUtil.mc.rightClickDelayTimer = 4;
        }
        return enumActionResult == EnumActionResult.SUCCESS;
    }
    
    public static void onDisable() {
        if (--PlacementUtil.placementConnections == 0 && PlacementUtil.isSneaking) {
            PlacementUtil.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)PlacementUtil.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
            PlacementUtil.isSneaking = false;
        }
    }
    
    public static boolean placePrecise(final BlockPos blockPos, final EnumHand enumHand, final boolean bl, final Vec3d vec3d, final EnumFacing enumFacing, final boolean bl2, final boolean bl3) {
        final EntityPlayerSP entityPlayerSP = PlacementUtil.mc.player;
        final WorldClient worldClient = PlacementUtil.mc.world;
        final PlayerControllerMP playerControllerMP = PlacementUtil.mc.playerController;
        if (entityPlayerSP == null || worldClient == null || playerControllerMP == null) {
            return false;
        }
        if (!worldClient.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return false;
        }
        final EnumFacing enumFacing2 = (enumFacing == null) ? BlockUtil.getPlaceableSide(blockPos) : enumFacing;
        if (enumFacing2 == null) {
            return false;
        }
        final BlockPos blockPos2 = blockPos.offset(enumFacing2);
        final EnumFacing enumFacing3 = enumFacing2.getOpposite();
        if (!BlockUtil.canBeClicked(blockPos2)) {
            return false;
        }
        final Vec3d vec3d2 = new Vec3d((Vec3i)blockPos2).add(0.5, 0.5, 0.5).add(new Vec3d(enumFacing3.getDirectionVec()).scale(0.5));
        final Block block = worldClient.getBlockState(blockPos2).getBlock();
        if ((!PlacementUtil.isSneaking && BlockUtil.blackList.contains(block)) || BlockUtil.shulkerList.contains(block)) {
            entityPlayerSP.connection.sendPacket((Packet)new CPacketEntityAction((Entity)entityPlayerSP, CPacketEntityAction.Action.START_SNEAKING));
            PlacementUtil.isSneaking = true;
        }
        if (bl && !bl3) {
            BlockUtil.faceVectorPacketInstant((vec3d == null) ? vec3d2 : vec3d, Boolean.valueOf(true));
        }
        if (!bl2) {
            final EnumActionResult enumActionResult = playerControllerMP.processRightClickBlock(entityPlayerSP, worldClient, blockPos2, enumFacing3, (vec3d == null) ? vec3d2 : vec3d, enumHand);
            if (enumActionResult == EnumActionResult.SUCCESS) {
                entityPlayerSP.swingArm(enumHand);
                PlacementUtil.mc.rightClickDelayTimer = 4;
            }
            return enumActionResult == EnumActionResult.SUCCESS;
        }
        return true;
    }
    
    public static boolean placeItem(final BlockPos blockPos, final EnumHand enumHand, final boolean bl, final Class<? extends Item> clazz) {
        final int n = PlacementUtil.mc.player.inventory.currentItem;
        final int n2 = InventoryUtil.findFirstItemSlot((Class)clazz, 0, 8);
        if (n2 == -1) {
            return false;
        }
        PlacementUtil.mc.player.inventory.currentItem = n2;
        final boolean bl2 = place(blockPos, enumHand, bl);
        PlacementUtil.mc.player.inventory.currentItem = n;
        return bl2;
    }
    
    public static boolean place(final BlockPos blockPos, final EnumHand enumHand, final boolean bl, final boolean bl2) {
        return placeBlock(blockPos, enumHand, bl, bl2, null);
    }
    
    public static boolean placeBlock(final BlockPos blockPos, final EnumHand enumHand, final boolean bl, final Class<? extends Block> clazz) {
        final int n = PlacementUtil.mc.player.inventory.currentItem;
        final int n2 = InventoryUtil.findFirstBlockSlot((Class)clazz, 0, 8);
        if (n2 == -1) {
            return false;
        }
        PlacementUtil.mc.player.inventory.currentItem = n2;
        final boolean bl2 = place(blockPos, enumHand, bl);
        PlacementUtil.mc.player.inventory.currentItem = n;
        return bl2;
    }
    
    public static boolean place(final BlockPos blockPos, final EnumHand enumHand, final boolean bl, final ArrayList<EnumFacing> arrayList) {
        return placeBlock(blockPos, enumHand, bl, true, arrayList);
    }
    
    public static void onEnable() {
        ++PlacementUtil.placementConnections;
    }
    
    static {
        mc = Minecraft.getMinecraft();
        PlacementUtil.isSneaking = false;
        PlacementUtil.placementConnections = 0;
    }
}
