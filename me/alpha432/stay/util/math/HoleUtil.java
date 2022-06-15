//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math;

import net.minecraft.client.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import java.util.*;

public class HoleUtil
{
    public static final List<BlockPos> holeBlocks;
    private static Minecraft mc;
    public static final Vec3d[] cityOffsets;
    
    public static BlockSafety isBlockSafe(final Block block) {
        if (block == Blocks.BEDROCK) {
            return BlockSafety.UNBREAKABLE;
        }
        if (block == Blocks.OBSIDIAN || block == Blocks.ENDER_CHEST || block == Blocks.ANVIL) {
            return BlockSafety.RESISTANT;
        }
        return BlockSafety.BREAKABLE;
    }
    
    public static HashMap<BlockOffset, BlockSafety> getUnsafeSides(final BlockPos pos) {
        final HashMap<BlockOffset, BlockSafety> output = new HashMap<BlockOffset, BlockSafety>();
        BlockSafety temp = isBlockSafe(HoleUtil.mc.world.getBlockState(BlockOffset.DOWN.offset(pos)).getBlock());
        if (temp != BlockSafety.UNBREAKABLE) {
            output.put(BlockOffset.DOWN, temp);
        }
        temp = isBlockSafe(HoleUtil.mc.world.getBlockState(BlockOffset.NORTH.offset(pos)).getBlock());
        if (temp != BlockSafety.UNBREAKABLE) {
            output.put(BlockOffset.NORTH, temp);
        }
        temp = isBlockSafe(HoleUtil.mc.world.getBlockState(BlockOffset.SOUTH.offset(pos)).getBlock());
        if (temp != BlockSafety.UNBREAKABLE) {
            output.put(BlockOffset.SOUTH, temp);
        }
        temp = isBlockSafe(HoleUtil.mc.world.getBlockState(BlockOffset.EAST.offset(pos)).getBlock());
        if (temp != BlockSafety.UNBREAKABLE) {
            output.put(BlockOffset.EAST, temp);
        }
        temp = isBlockSafe(HoleUtil.mc.world.getBlockState(BlockOffset.WEST.offset(pos)).getBlock());
        if (temp != BlockSafety.UNBREAKABLE) {
            output.put(BlockOffset.WEST, temp);
        }
        return output;
    }
    
    public static boolean isInHole() {
        final Vec3d playerPos = CombatUtil.interpolateEntity((Entity)HoleUtil.mc.player);
        final BlockPos blockpos = new BlockPos(playerPos.x, playerPos.y, playerPos.z);
        int size = 0;
        for (final BlockPos bPos : HoleUtil.holeBlocks) {
            if (CombatUtil.isHard(HoleUtil.mc.world.getBlockState(blockpos.add((Vec3i)bPos)).getBlock())) {
                ++size;
            }
        }
        return size == 5;
    }
    
    public static BlockPos is2Hole(final BlockPos pos) {
        if (isHole(pos)) {
            return null;
        }
        final BlockPos blockpos = pos;
        BlockPos blockpos2 = null;
        int size = 0;
        int size2 = 0;
        if (HoleUtil.mc.world.getBlockState(pos).getBlock() != Blocks.AIR) {
            return null;
        }
        for (final BlockPos bPos : HoleUtil.holeBlocks) {
            if (HoleUtil.mc.world.getBlockState(blockpos.add((Vec3i)bPos)).getBlock() == Blocks.AIR && blockpos.add((Vec3i)bPos) != new BlockPos(bPos.getX(), bPos.getY() - 1, bPos.getZ())) {
                blockpos2 = blockpos.add((Vec3i)bPos);
                ++size;
            }
        }
        if (size == 1) {
            for (final BlockPos bPoss : HoleUtil.holeBlocks) {
                if (HoleUtil.mc.world.getBlockState(blockpos.add((Vec3i)bPoss)).getBlock() == Blocks.BEDROCK || HoleUtil.mc.world.getBlockState(blockpos.add((Vec3i)bPoss)).getBlock() == Blocks.OBSIDIAN) {
                    ++size2;
                }
            }
            for (final BlockPos bPoss : HoleUtil.holeBlocks) {
                if (HoleUtil.mc.world.getBlockState(blockpos2.add((Vec3i)bPoss)).getBlock() == Blocks.BEDROCK || HoleUtil.mc.world.getBlockState(blockpos2.add((Vec3i)bPoss)).getBlock() == Blocks.OBSIDIAN) {
                    ++size2;
                }
            }
        }
        if (size2 == 8) {
            return blockpos2;
        }
        return null;
    }
    
    public static boolean is2securityHole(final BlockPos pos) {
        if (is2Hole(pos) == null) {
            return false;
        }
        final BlockPos blockpos = pos;
        final BlockPos blockpos2 = is2Hole(pos);
        int size = 0;
        for (final BlockPos bPoss : HoleUtil.holeBlocks) {
            if (HoleUtil.mc.world.getBlockState(blockpos.add((Vec3i)bPoss)).getBlock() == Blocks.BEDROCK) {
                ++size;
            }
        }
        for (final BlockPos bPoss : HoleUtil.holeBlocks) {
            if (HoleUtil.mc.world.getBlockState(blockpos2.add((Vec3i)bPoss)).getBlock() == Blocks.BEDROCK) {
                ++size;
            }
        }
        return size == 8;
    }
    
    public static boolean isHole(final BlockPos pos) {
        final BlockPos blockpos = pos;
        int size = 0;
        for (final BlockPos bPos : HoleUtil.holeBlocks) {
            if (CombatUtil.isHard(HoleUtil.mc.world.getBlockState(blockpos.add((Vec3i)bPos)).getBlock())) {
                ++size;
            }
        }
        return size == 5;
    }
    
    static {
        holeBlocks = Arrays.asList(new BlockPos(0, -1, 0), new BlockPos(0, 0, -1), new BlockPos(-1, 0, 0), new BlockPos(1, 0, 0), new BlockPos(0, 0, 1));
        HoleUtil.mc = Minecraft.getMinecraft();
        cityOffsets = new Vec3d[] { new Vec3d(1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(-1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, -1.0) };
    }
    
    public enum BlockOffset
    {
        DOWN(0, -1, 0), 
        UP(0, 1, 0), 
        NORTH(0, 0, -1), 
        EAST(1, 0, 0), 
        SOUTH(0, 0, 1), 
        WEST(-1, 0, 0);
        
        private final int x;
        private final int y;
        private final int z;
        
        private BlockOffset(final int x, final int y, final int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
        public BlockPos offset(final BlockPos pos) {
            return pos.add(this.x, this.y, this.z);
        }
        
        public BlockPos forward(final BlockPos pos, final int scale) {
            return pos.add(this.x * scale, 0, this.z * scale);
        }
        
        public BlockPos backward(final BlockPos pos, final int scale) {
            return pos.add(-this.x * scale, 0, -this.z * scale);
        }
        
        public BlockPos left(final BlockPos pos, final int scale) {
            return pos.add(this.z * scale, 0, -this.x * scale);
        }
        
        public BlockPos right(final BlockPos pos, final int scale) {
            return pos.add(-this.z * scale, 0, this.x * scale);
        }
    }
    
    public enum BlockSafety
    {
        UNBREAKABLE, 
        RESISTANT, 
        BREAKABLE;
    }
}
