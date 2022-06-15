//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.basement.wrapper.*;
import me.alpha432.stay.client.*;
import net.minecraft.world.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;

public class HoleTP extends Module
{
    public HoleTP() {
        super("HoleTP", "HoleTP", Module.Category.MOVEMENT, true, false, false);
    }
    
    public void onUpdate() {
        if (HoleTP.mc.world == null || HoleTP.mc.player == null) {
            return;
        }
        if (!HoleTP.mc.gameSettings.keyBindJump.isKeyDown() && HoleTP.mc.player.fallDistance < 0.5 && this.isInHole() && !this.isOnLiquid() && !this.isInLiquid() && !HoleTP.mc.gameSettings.keyBindJump.isKeyDown() && !HoleTP.mc.player.isOnLadder()) {
            final BlockPos pso = this.gethole();
            if (pso == null) {
                return;
            }
            System.out.println(pso);
            final double dist = Wrapper.getPlayer().getDistance(pso.getX() + 0.5, pso.getY() + 0.5, pso.getZ() + 0.5);
            System.out.println(dist);
            if (dist <= 1.0) {
                Stay.positionManager.setPositionPacket(pso.getX() + 0.5, pso.getY(), pso.getZ() + 0.5, true, true, true);
            }
        }
    }
    
    private boolean isInHole() {
        final BlockPos blockPos = new BlockPos(HoleTP.mc.player.posX, HoleTP.mc.player.posY - 1.0, HoleTP.mc.player.posZ);
        return this.isSafeHole(blockPos);
    }
    
    private double getNearestBlockBelow() {
        for (int y = (int)Math.floor(HoleTP.mc.player.posY); y > 0.0; --y) {
            if (!(HoleTP.mc.world.getBlockState(new BlockPos(HoleTP.mc.player.posX, (double)y, HoleTP.mc.player.posZ)).getBlock() instanceof BlockSlab) && HoleTP.mc.world.getBlockState(new BlockPos(HoleTP.mc.player.posX, (double)y, HoleTP.mc.player.posZ)).getBlock().getDefaultState().getCollisionBoundingBox((IBlockAccess)HoleTP.mc.world, new BlockPos(0, 0, 0)) != null) {
                return y;
            }
        }
        return -1.0;
    }
    
    private BlockPos gethole() {
        final BlockPos blockPos = new BlockPos(HoleTP.mc.player.posX, HoleTP.mc.player.posY - 1.0, HoleTP.mc.player.posZ);
        if (HoleUtil.isHole(new BlockPos(blockPos.getX() + 1, blockPos.getY(), blockPos.getZ()))) {
            return new BlockPos(blockPos.getX() + 1, blockPos.getY(), blockPos.getZ());
        }
        if (HoleUtil.isHole(new BlockPos(blockPos.getX() - 1, blockPos.getY(), blockPos.getZ()))) {
            return new BlockPos(blockPos.getX() - 1, blockPos.getY(), blockPos.getZ());
        }
        if (HoleUtil.isHole(new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() + 1))) {
            return new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() + 1);
        }
        if (HoleUtil.isHole(new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() - 1))) {
            return new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() - 1);
        }
        return null;
    }
    
    private boolean isSafeHole(final BlockPos blockPos) {
        return HoleUtil.isHole(new BlockPos(blockPos.getX() + 1, blockPos.getY(), blockPos.getZ())) || HoleUtil.isHole(new BlockPos(blockPos.getX() - 1, blockPos.getY(), blockPos.getZ())) || HoleUtil.isHole(new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() + 1)) || HoleUtil.isHole(new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() - 1));
    }
    
    private boolean isOnLiquid() {
        final double y = HoleTP.mc.player.posY - 0.03;
        for (int x = MathHelper.floor(HoleTP.mc.player.posX); x < MathHelper.ceil(HoleTP.mc.player.posX); ++x) {
            for (int z = MathHelper.floor(HoleTP.mc.player.posZ); z < MathHelper.ceil(HoleTP.mc.player.posZ); ++z) {
                final BlockPos pos = new BlockPos(x, MathHelper.floor(y), z);
                if (HoleTP.mc.world.getBlockState(pos).getBlock() instanceof BlockLiquid) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isInLiquid() {
        final double y = HoleTP.mc.player.posY + 0.01;
        for (int x = MathHelper.floor(HoleTP.mc.player.posX); x < MathHelper.ceil(HoleTP.mc.player.posX); ++x) {
            for (int z = MathHelper.floor(HoleTP.mc.player.posZ); z < MathHelper.ceil(HoleTP.mc.player.posZ); ++z) {
                final BlockPos pos = new BlockPos(x, (int)y, z);
                if (HoleTP.mc.world.getBlockState(pos).getBlock() instanceof BlockLiquid) {
                    return true;
                }
            }
        }
        return false;
    }
}
