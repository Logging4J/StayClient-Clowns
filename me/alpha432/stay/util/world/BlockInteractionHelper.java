//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import net.minecraft.block.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.block.state.*;
import net.minecraft.init.*;
import java.util.*;

public class BlockInteractionHelper
{
    public static final List<Block> blackList;
    public static final List<Block> shulkerList;
    private static final Minecraft mc;
    public static double yaw;
    public static double pitch;
    
    public static double blockDistance2d(final double blockposx, final double blockposz, final Entity owo) {
        final double deltaX = owo.posX - blockposx;
        final double deltaZ = owo.posZ - blockposz;
        return Math.sqrt(deltaX * deltaX + deltaZ * deltaZ);
    }
    
    public static boolean hotbarSlotCheckEmpty(final ItemStack stack) {
        return stack != ItemStack.EMPTY;
    }
    
    public static boolean blockCheckNonBlock(final ItemStack stack) {
        return stack.getItem() instanceof ItemBlock;
    }
    
    public static void placeBlockScaffold(final BlockPos pos) {
        final Vec3d eyesPos = new Vec3d(BlockInteractionHelper.mc.player.posX, BlockInteractionHelper.mc.player.posY + BlockInteractionHelper.mc.player.getEyeHeight(), BlockInteractionHelper.mc.player.posZ);
        for (final EnumFacing side : EnumFacing.values()) {
            final BlockPos neighbor = pos.offset(side);
            final EnumFacing side2 = side.getOpposite();
            if (canBeClicked(neighbor)) {
                final Vec3d hitVec = new Vec3d((Vec3i)neighbor).add(0.5, 0.5, 0.5).add(new Vec3d(side2.getDirectionVec()).scale(0.5));
                if (eyesPos.squareDistanceTo(hitVec) <= 18.0625) {
                    faceVectorPacketInstant(hitVec);
                    processRightClickBlock(neighbor, side2, hitVec);
                    BlockInteractionHelper.mc.player.swingArm(EnumHand.MAIN_HAND);
                    return;
                }
            }
        }
    }
    
    public static void placeBlockScaffoldStrictRaytrace(final BlockPos pos) {
        BlockPos neighbor = null;
        EnumFacing side2 = null;
        if (findBlockFacingLocationBlock(pos) == 1) {
            neighbor = pos.west();
            side2 = EnumFacing.EAST;
        }
        if (findBlockFacingLocationBlock(pos) == 2) {
            neighbor = pos.east();
            side2 = EnumFacing.WEST;
        }
        if (findBlockFacingLocationBlock(pos) == 3) {
            neighbor = pos.north();
            side2 = EnumFacing.SOUTH;
        }
        if (findBlockFacingLocationBlock(pos) == 4) {
            neighbor = pos.south();
            side2 = EnumFacing.NORTH;
        }
        double y = 0.0;
        if (neighbor.getDistance((int)BlockInteractionHelper.mc.player.posX, (int)BlockInteractionHelper.mc.player.posY, (int)BlockInteractionHelper.mc.player.posZ) < 1.0) {
            y = 0.95;
        }
        if (neighbor.getDistance((int)BlockInteractionHelper.mc.player.posX, (int)BlockInteractionHelper.mc.player.posY, (int)BlockInteractionHelper.mc.player.posZ) > 1.0 && neighbor.getDistance((int)BlockInteractionHelper.mc.player.posX, (int)BlockInteractionHelper.mc.player.posY, (int)BlockInteractionHelper.mc.player.posZ) < 2.0) {
            y = 0.85;
        }
        if (neighbor.getDistance((int)BlockInteractionHelper.mc.player.posX, (int)BlockInteractionHelper.mc.player.posY, (int)BlockInteractionHelper.mc.player.posZ) > 2.0 && neighbor.getDistance((int)BlockInteractionHelper.mc.player.posX, (int)BlockInteractionHelper.mc.player.posY, (int)BlockInteractionHelper.mc.player.posZ) < 3.0) {
            y = 0.75;
        }
        if (neighbor.getDistance((int)BlockInteractionHelper.mc.player.posX, (int)BlockInteractionHelper.mc.player.posY, (int)BlockInteractionHelper.mc.player.posZ) > 3.0) {
            y = 0.65;
        }
        final RayTraceResult result = BlockInteractionHelper.mc.world.rayTraceBlocks(new Vec3d(BlockInteractionHelper.mc.player.posX, BlockInteractionHelper.mc.player.posY + BlockInteractionHelper.mc.player.getEyeHeight(), BlockInteractionHelper.mc.player.posZ), new Vec3d(neighbor.getX() + 0.5, pos.north().getY() + y, neighbor.getZ() + 0.5));
        final Vec3d hitVec = new Vec3d((Vec3i)neighbor).add(0.5, y, 0.5).add(new Vec3d(result.sideHit.getDirectionVec()).scale(0.5));
        faceVectorPacketInstant(hitVec);
        processRightClickBlock(neighbor, side2, hitVec);
        BlockInteractionHelper.mc.player.swingArm(EnumHand.MAIN_HAND);
    }
    
    public static void placeBlockScaffoldStrict(final BlockPos pos) {
        BlockPos neighbor = null;
        EnumFacing side2 = null;
        if (findBlockFacingLocationBlock(pos) == 1) {
            neighbor = pos.west();
            side2 = EnumFacing.EAST;
        }
        if (findBlockFacingLocationBlock(pos) == 2) {
            neighbor = pos.east();
            side2 = EnumFacing.WEST;
        }
        if (findBlockFacingLocationBlock(pos) == 3) {
            neighbor = pos.north();
            side2 = EnumFacing.SOUTH;
        }
        if (findBlockFacingLocationBlock(pos) == 4) {
            neighbor = pos.south();
            side2 = EnumFacing.NORTH;
        }
        final Vec3d hitVec = new Vec3d((Vec3i)neighbor).add(0.5, 0.5, 0.5).add(new Vec3d(side2.getDirectionVec()).scale(0.5));
        faceVectorPacketInstant(hitVec);
        processRightClickBlock(neighbor, side2, hitVec);
        BlockInteractionHelper.mc.player.swingArm(EnumHand.MAIN_HAND);
    }
    
    public static int findBlockFacingLocationBlock(final BlockPos pos) {
        double playerX = 0.0;
        double posX = 0.0;
        double distanceX = 0.0;
        double playerZ = 0.0;
        double posZ = 0.0;
        double distanceZ = 0.0;
        int direction = 0;
        playerX = BlockInteractionHelper.mc.player.posX;
        posX = pos.getX();
        if (playerX > posX) {
            distanceX = playerX - posX;
        }
        else {
            distanceX = posX - playerX;
        }
        playerZ = BlockInteractionHelper.mc.player.posZ;
        posZ = pos.getZ();
        if (playerZ > posZ) {
            distanceZ = playerZ - posZ;
        }
        else {
            distanceZ = posZ - playerZ;
        }
        if (distanceX > distanceZ) {
            if (playerX > posX) {
                direction = 1;
            }
            else {
                direction = 2;
            }
        }
        else if (playerZ > posZ) {
            direction = 3;
        }
        else {
            direction = 4;
        }
        return direction;
    }
    
    public static int findBlockFacingLocationPlayer(final BlockPos pos) {
        double playerX = 0.0;
        double enemyX = 0.0;
        double distanceX = 0.0;
        double playerZ = 0.0;
        double enemyZ = 0.0;
        double distanceZ = 0.0;
        int direction = 0;
        playerX = BlockInteractionHelper.mc.player.posX;
        enemyX = pos.getX();
        if (playerX > enemyX) {
            distanceX = playerX - enemyX;
        }
        else {
            distanceX = enemyX - playerX;
        }
        playerZ = BlockInteractionHelper.mc.player.posZ;
        enemyZ = pos.getZ();
        if (playerZ > enemyZ) {
            distanceZ = playerZ - enemyZ;
        }
        else {
            distanceZ = enemyZ - playerZ;
        }
        if (distanceX > distanceZ) {
            if (playerX > enemyX) {
                direction = 1;
            }
            else {
                direction = 2;
            }
        }
        else if (playerZ > enemyZ) {
            direction = 3;
        }
        else {
            direction = 4;
        }
        return direction;
    }
    
    public static void placeBlockScaffoldPiston(final BlockPos pos, final BlockPos look) {
        final Vec3d eyesPos = new Vec3d(BlockInteractionHelper.mc.player.posX, BlockInteractionHelper.mc.player.posY + BlockInteractionHelper.mc.player.getEyeHeight(), BlockInteractionHelper.mc.player.posZ);
        for (final EnumFacing side : EnumFacing.values()) {
            final BlockPos neighbor = pos.offset(side);
            final BlockPos neighborLook = look.offset(side);
            final EnumFacing side2 = side.getOpposite();
            final EnumFacing side2Look = side.getOpposite();
            if (canBeClicked(neighbor)) {
                final Vec3d hitVec = new Vec3d((Vec3i)neighbor).add(0.9, 0.1, 0.9).add(new Vec3d(side2.getDirectionVec()).scale(0.5));
                final Vec3d hitVecLook = new Vec3d((Vec3i)neighborLook).add(0.9, 0.1, 0.9).add(new Vec3d(side2Look.getDirectionVec()).scale(0.5));
                if (eyesPos.squareDistanceTo(hitVec) <= 18.0625) {
                    faceVectorPacketInstant(hitVecLook);
                    processRightClickBlock(neighbor, side2, hitVec);
                    BlockInteractionHelper.mc.player.swingArm(EnumHand.MAIN_HAND);
                    return;
                }
            }
        }
    }
    
    public static void placeBlockScaffoldNoRotate(final BlockPos pos) {
        final Vec3d eyesPos = new Vec3d(BlockInteractionHelper.mc.player.posX, BlockInteractionHelper.mc.player.posY + BlockInteractionHelper.mc.player.getEyeHeight(), BlockInteractionHelper.mc.player.posZ);
        for (final EnumFacing side : EnumFacing.values()) {
            final BlockPos neighbor = pos.offset(side);
            final EnumFacing side2 = side.getOpposite();
            if (canBeClicked(neighbor)) {
                final Vec3d hitVec = new Vec3d((Vec3i)neighbor).add(0.5, 0.5, 0.5).add(new Vec3d(side2.getDirectionVec()).scale(0.5));
                processRightClickBlock(neighbor, side2, hitVec);
                BlockInteractionHelper.mc.player.swingArm(EnumHand.MAIN_HAND);
                return;
            }
        }
    }
    
    public static double[] calculateLookAt(final double px, final double py, final double pz, final EntityPlayer me) {
        double dirx = me.posX - px;
        double diry = me.posY - py;
        double dirz = me.posZ - pz;
        final double len = Math.sqrt(dirx * dirx + diry * diry + dirz * dirz);
        dirx /= len;
        diry /= len;
        dirz /= len;
        double pitch = Math.asin(diry);
        double yaw = Math.atan2(dirz, dirx);
        pitch = pitch * 180.0 / 3.141592653589793;
        yaw = yaw * 180.0 / 3.141592653589793;
        yaw += 90.0;
        return new double[] { yaw, pitch };
    }
    
    private static void lookAtPacket(final double px, final double py, final double pz, final EntityPlayer me) {
        final double[] v = calculateLookAt(px, py, pz, me);
        setYawAndPitch((float)v[0], (float)v[1]);
    }
    
    private static void setYawAndPitch(final float yaw1, final float pitch1) {
        BlockInteractionHelper.yaw = yaw1;
        BlockInteractionHelper.pitch = pitch1;
    }
    
    public static float[] getLegitRotations(final Vec3d vec) {
        final Vec3d eyesPos = getEyesPos();
        final double diffX = vec.x - eyesPos.x;
        final double diffY = vec.y - eyesPos.y;
        final double diffZ = vec.z - eyesPos.z;
        final double diffXZ = Math.sqrt(diffX * diffX + diffZ * diffZ);
        final float yaw = (float)Math.toDegrees(Math.atan2(diffZ, diffX)) - 90.0f;
        final float pitch = (float)(-Math.toDegrees(Math.atan2(diffY, diffXZ)));
        return new float[] { BlockInteractionHelper.mc.player.rotationYaw + MathHelper.wrapDegrees(yaw - BlockInteractionHelper.mc.player.rotationYaw), BlockInteractionHelper.mc.player.rotationPitch + MathHelper.wrapDegrees(pitch - BlockInteractionHelper.mc.player.rotationPitch) };
    }
    
    private static Vec3d getEyesPos() {
        return new Vec3d(BlockInteractionHelper.mc.player.posX, BlockInteractionHelper.mc.player.posY + BlockInteractionHelper.mc.player.getEyeHeight(), BlockInteractionHelper.mc.player.posZ);
    }
    
    public static void faceVectorPacketInstant(final Vec3d vec) {
        final float[] rotations = getLegitRotations(vec);
        BlockInteractionHelper.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(rotations[0], rotations[1], BlockInteractionHelper.mc.player.onGround));
    }
    
    private static void processRightClickBlock(final BlockPos pos, final EnumFacing side, final Vec3d hitVec) {
        getPlayerController().processRightClickBlock(BlockInteractionHelper.mc.player, BlockInteractionHelper.mc.world, pos, side, hitVec, EnumHand.MAIN_HAND);
    }
    
    public static boolean canBeClicked(final BlockPos pos) {
        return getBlock(pos).canCollideCheck(getState(pos), false);
    }
    
    public static Block getBlock(final BlockPos pos) {
        return getState(pos).getBlock();
    }
    
    private static PlayerControllerMP getPlayerController() {
        return Minecraft.getMinecraft().playerController;
    }
    
    private static IBlockState getState(final BlockPos pos) {
        return BlockInteractionHelper.mc.world.getBlockState(pos);
    }
    
    public static boolean checkForNeighbours(final BlockPos blockPos) {
        if (!hasNeighbour(blockPos)) {
            for (final EnumFacing side : EnumFacing.values()) {
                final BlockPos neighbour = blockPos.offset(side);
                if (hasNeighbour(neighbour)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private static boolean hasNeighbour(final BlockPos blockPos) {
        for (final EnumFacing side : EnumFacing.values()) {
            final BlockPos neighbour = blockPos.offset(side);
            if (!BlockInteractionHelper.mc.world.getBlockState(neighbour).getMaterial().isReplaceable()) {
                return true;
            }
        }
        return false;
    }
    
    public static float[] calcAngle(final Vec3d from, final Vec3d to) {
        final double difX = to.x - from.x;
        final double difY = (to.y - from.y) * -1.0;
        final double difZ = to.z - from.z;
        final double dist = MathHelper.sqrt(difX * difX + difZ * difZ);
        return new float[] { (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(difZ, difX)) - 90.0), (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(difY, dist))) };
    }
    
    public static List<BlockPos> getSphere(final BlockPos loc, final float r, final int h, final boolean hollow, final boolean sphere, final int plus_y) {
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
    
    public static List<BlockPos> getCircle(final BlockPos loc, final int y, final float r, final boolean hollow) {
        final List<BlockPos> circleblocks = new ArrayList<BlockPos>();
        final int cx = loc.getX();
        final int cz = loc.getZ();
        for (int x = cx - (int)r; x <= cx + r; ++x) {
            for (int z = cz - (int)r; z <= cz + r; ++z) {
                final double dist = (cx - x) * (cx - x) + (cz - z) * (cz - z);
                if (dist < r * r && (!hollow || dist >= (r - 1.0f) * (r - 1.0f))) {
                    final BlockPos l = new BlockPos(x, y, z);
                    circleblocks.add(l);
                }
            }
        }
        return circleblocks;
    }
    
    public static EnumFacing getPlaceableSide(final BlockPos pos) {
        for (final EnumFacing side : EnumFacing.values()) {
            final BlockPos neighbour = pos.offset(side);
            if (BlockInteractionHelper.mc.world.getBlockState(neighbour).getBlock().canCollideCheck(BlockInteractionHelper.mc.world.getBlockState(neighbour), false)) {
                final IBlockState blockState = BlockInteractionHelper.mc.world.getBlockState(neighbour);
                if (!blockState.getMaterial().isReplaceable()) {
                    return side;
                }
            }
        }
        return null;
    }
    
    public static boolean rayTracePlaceCheck(final BlockPos pos, final boolean shouldCheck, final float height) {
        return !shouldCheck || BlockInteractionHelper.mc.world.rayTraceBlocks(new Vec3d(BlockInteractionHelper.mc.player.posX, BlockInteractionHelper.mc.player.posY + BlockInteractionHelper.mc.player.getEyeHeight(), BlockInteractionHelper.mc.player.posZ), new Vec3d((double)pos.getX(), (double)(pos.getY() + height), (double)pos.getZ()), false, true, false) == null;
    }
    
    public static boolean rayTracePlaceCheck(final BlockPos pos, final boolean shouldCheck) {
        return rayTracePlaceCheck(pos, shouldCheck, 1.0f);
    }
    
    static {
        blackList = Arrays.asList(Blocks.ENDER_CHEST, (Block)Blocks.CHEST, Blocks.TRAPPED_CHEST, Blocks.CRAFTING_TABLE, Blocks.ANVIL, Blocks.BREWING_STAND, (Block)Blocks.HOPPER, Blocks.DROPPER, Blocks.DISPENSER, Blocks.TRAPDOOR, Blocks.ENCHANTING_TABLE);
        shulkerList = Arrays.asList(Blocks.WHITE_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.SILVER_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.BLACK_SHULKER_BOX);
        mc = Minecraft.getMinecraft();
    }
}
