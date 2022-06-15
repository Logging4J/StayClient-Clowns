//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.client.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;

public class BlockUtils implements Util
{
    protected static Minecraft mc;
    public BlockPos pos;
    public double rotx;
    public double roty;
    public double dist;
    public EnumFacing f;
    public int a;
    
    public BlockUtils(final BlockPos blockPos, final int n, final EnumFacing enumFacing, final double d) {
        this.pos = blockPos;
        this.a = n;
        this.f = enumFacing;
        this.dist = d;
    }
    
    public static Vec3d floorVec3(final Vec3d vec3) {
        return new Vec3d(Math.floor(vec3.x), Math.floor(vec3.y), Math.floor(vec3.z));
    }
    
    public static boolean isRePlaceable(final BlockPos blockPos) {
        final Block block = BlockUtils.mc.world.getBlockState(blockPos).getBlock();
        return block.isReplaceable((IBlockAccess)BlockUtils.mc.world, blockPos) && !(block instanceof BlockAir);
    }
    
    public static double getDirection2D(final double d, final double d2) {
        double d3;
        if (d2 == 0.0) {
            d3 = ((d > 0.0) ? 90.0 : -90.0);
        }
        else {
            d3 = Math.atan(d / d2) * 57.2957796;
            if (d2 < 0.0) {
                d3 = ((d > 0.0) ? (d3 += 180.0) : ((d < 0.0) ? (d3 -= 180.0) : 180.0));
            }
        }
        return d3;
    }
    
    public static boolean doPlace(final BlockUtils blockUtils, final boolean bl) {
        return blockUtils != null && blockUtils.doPlace(bl);
    }
    
    public static BlockUtils isPlaceable(final BlockPos blockPos, final double d, final boolean bl) {
        final BlockUtils blockUtils = new BlockUtils(blockPos, 0, null, d);
        if (!isAir(blockPos)) {
            return null;
        }
        if (!(BlockUtils.mc.player.inventory.getCurrentItem().getItem() instanceof ItemBlock)) {
            return null;
        }
        final AxisAlignedBB axisAlignedBB = ((ItemBlock)BlockUtils.mc.player.inventory.getCurrentItem().getItem()).getBlock().getDefaultState().getCollisionBoundingBox((IBlockAccess)BlockUtils.mc.world, blockPos);
        if (!isAir(blockPos) && BlockUtils.mc.world.getBlockState(blockPos).getBlock() instanceof BlockLiquid) {
            final Block block = BlockUtils.mc.world.getBlockState(blockPos.offset(EnumFacing.UP)).getBlock();
            if (block instanceof BlockLiquid) {
                blockUtils.f = EnumFacing.DOWN;
                blockUtils.pos.offset(EnumFacing.UP);
                return blockUtils;
            }
            blockUtils.f = EnumFacing.UP;
            blockUtils.pos.offset(EnumFacing.DOWN);
            return blockUtils;
        }
        else {
            final EnumFacing[] var6 = EnumFacing.values();
            final int var7 = var6.length;
            int var8 = 0;
            while (var8 < var7) {
                final EnumFacing enumFacing = var6[var8];
                if (!isAir(new BlockPos(blockPos.getX() - enumFacing.getDirectionVec().getX(), blockPos.getY() - enumFacing.getDirectionVec().getY(), blockPos.getZ() - enumFacing.getDirectionVec().getZ()))) {
                    blockUtils.f = enumFacing;
                    if (bl && axisAlignedBB != Block.NULL_AABB && !BlockUtils.mc.world.checkNoEntityCollision(axisAlignedBB.offset(blockPos), (Entity)null)) {
                        return null;
                    }
                    return blockUtils;
                }
                else {
                    ++var8;
                }
            }
            if (!isRePlaceable(blockPos)) {
                return null;
            }
            blockUtils.f = EnumFacing.UP;
            blockUtils.pos.offset(EnumFacing.UP);
            blockPos.offset(EnumFacing.DOWN);
            if (bl && axisAlignedBB != Block.NULL_AABB && !BlockUtils.mc.world.checkNoEntityCollision(axisAlignedBB.offset(blockPos), (Entity)null)) {
                return null;
            }
            return blockUtils;
        }
    }
    
    public static boolean isAir(final BlockPos blockPos) {
        final Block block = BlockUtils.mc.world.getBlockState(blockPos).getBlock();
        return block instanceof BlockAir;
    }
    
    public static boolean doBreak(final BlockPos blockPos, final EnumFacing enumFacing) {
        return BlockUtils.mc.playerController.clickBlock(blockPos, enumFacing);
    }
    
    public void doBreak() {
        BlockUtils.mc.playerController.onPlayerDamageBlock(new BlockPos(this.pos.getX() - this.f.getDirectionVec().getX(), this.pos.getY() - this.f.getDirectionVec().getY(), this.pos.getZ() - this.f.getDirectionVec().getZ()), this.f);
    }
    
    public boolean doPlace(final boolean bl) {
        final double d = this.pos.getX() + 0.5 - BlockUtils.mc.player.posX - this.f.getDirectionVec().getX() / 2.0;
        final double d2 = this.pos.getY() + 0.5 - BlockUtils.mc.player.posY - this.f.getDirectionVec().getY() / 2.0 - BlockUtils.mc.player.getEyeHeight();
        final double d3 = this.pos.getZ() + 0.5 - BlockUtils.mc.player.posZ - this.f.getDirectionVec().getZ() / 2.0;
        final double d4 = getDirection2D(d3, d);
        final double d5 = getDirection2D(d2, Math.sqrt(d * d + d3 * d3));
        final Vec3d vec3d = this.getVectorForRotation(-d5, d4 - 90.0);
        this.roty = -d5;
        this.rotx = d4 - 90.0;
        final EnumActionResult enumActionResult = BlockUtils.mc.playerController.processRightClickBlock(BlockUtils.mc.player, BlockUtils.mc.world, new BlockPos(this.pos.getX() - this.f.getDirectionVec().getX(), this.pos.getY() - this.f.getDirectionVec().getY(), this.pos.getZ() - this.f.getDirectionVec().getZ()), this.f, vec3d, EnumHand.MAIN_HAND);
        if (enumActionResult == EnumActionResult.SUCCESS) {
            if (bl) {
                BlockUtils.mc.player.swingArm(EnumHand.MAIN_HAND);
            }
            return true;
        }
        return false;
    }
    
    protected final Vec3d getVectorForRotation(final float f, final float f2) {
        final float f3 = MathHelper.cos(-f2 * 0.017453292f - 3.1415927f);
        final float f4 = MathHelper.sin(-f2 * 0.017453292f - 3.1415927f);
        final float f5 = -MathHelper.cos(-f * 0.017453292f);
        final float f6 = MathHelper.sin(-f * 0.017453292f);
        return new Vec3d((double)(f4 * f5), (double)f6, (double)(f3 * f5));
    }
    
    protected final Vec3d getVectorForRotation(final double d, final double d2) {
        final float f = MathHelper.cos((float)(-d2 * 0.01745329238474369 - 3.1415927410125732));
        final float f2 = MathHelper.sin((float)(-d2 * 0.01745329238474369 - 3.1415927410125732));
        final float f3 = -MathHelper.cos((float)(-d * 0.01745329238474369));
        final float f4 = MathHelper.sin((float)(-d * 0.01745329238474369));
        return new Vec3d((double)(f2 * f3), (double)f4, (double)(f * f3));
    }
    
    static {
        BlockUtils.mc = Minecraft.getMinecraft();
    }
}
