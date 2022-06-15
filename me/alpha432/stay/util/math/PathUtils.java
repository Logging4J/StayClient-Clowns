//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math;

import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.client.*;
import java.util.*;
import net.minecraft.block.material.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import javax.vecmath.*;
import net.minecraft.util.math.*;

public final class PathUtils implements MinecraftInstance
{
    public static List<Vec3d> findBlinkPath(final double tpX, final double tpY, final double tpZ) {
        return findBlinkPath(tpX, tpY, tpZ, 5.0);
    }
    
    public static List<Vec3d> findBlinkPath(final double tpX, final double tpY, final double tpZ, final double dist) {
        final Minecraft mc = Minecraft.getMinecraft();
        return findBlinkPath(mc.player.posX, mc.player.posY, mc.player.posZ, tpX, tpY, tpZ, dist);
    }
    
    public static List<Vec3d> findBlinkPath(final double curX, final double curY, final double curZ, final double tpX, final double tpY, final double tpZ, final double dashDistance) {
        Vec3d topFrom = new Vec3d(curX, curY, curZ);
        final Vec3d to = new Vec3d(tpX, tpY, tpZ);
        if (!canPassThrow(new BlockPos(topFrom))) {
            topFrom = topFrom.add(0.0, 1.0, 0.0);
        }
        final AStarCustomPathFinder pathfinder = new AStarCustomPathFinder(topFrom, to);
        pathfinder.compute();
        int i = 0;
        Vec3d lastLoc = null;
        Vec3d lastDashLoc = null;
        final ArrayList<Vec3d> path = new ArrayList<Vec3d>();
        final ArrayList<Vec3d> pathFinderPath = (ArrayList<Vec3d>)pathfinder.getPath();
        for (final Vec3d pathElm : pathFinderPath) {
            if (i == 0 || i == pathFinderPath.size() - 1) {
                if (lastLoc != null) {
                    path.add(lastLoc.add(0.5, 0.0, 0.5));
                }
                path.add(pathElm.add(0.5, 0.0, 0.5));
                lastDashLoc = pathElm;
            }
            else {
                boolean canContinue = true;
                Label_0384: {
                    if (pathElm.squareDistanceTo(lastDashLoc) > dashDistance * dashDistance) {
                        canContinue = false;
                    }
                    else {
                        final double smallX = Math.min(lastDashLoc.x, pathElm.x);
                        final double smallY = Math.min(lastDashLoc.y, pathElm.y);
                        final double smallZ = Math.min(lastDashLoc.z, pathElm.z);
                        final double bigX = Math.max(lastDashLoc.x, pathElm.x);
                        final double bigY = Math.max(lastDashLoc.y, pathElm.y);
                        final double bigZ = Math.max(lastDashLoc.z, pathElm.z);
                        for (int x = (int)smallX; x <= bigX; ++x) {
                            for (int y = (int)smallY; y <= bigY; ++y) {
                                for (int z = (int)smallZ; z <= bigZ; ++z) {
                                    if (!AStarCustomPathFinder.checkPositionValidity(x, y, z, false)) {
                                        canContinue = false;
                                        break Label_0384;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!canContinue) {
                    path.add(lastLoc.add(0.5, 0.0, 0.5));
                    lastDashLoc = lastLoc;
                }
            }
            lastLoc = pathElm;
            ++i;
        }
        return path;
    }
    
    public static boolean canPassThrow(final BlockPos pos) {
        final Block block = Minecraft.getMinecraft().world.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ())).getBlock();
        return block.getMaterial(block.defaultBlockState) == Material.AIR || block.getMaterial(block.defaultBlockState) == Material.PLANTS || block.getMaterial(block.defaultBlockState) == Material.VINE || block == Blocks.LADDER || block == Blocks.WATER || block == Blocks.FLOWING_WATER || block == Blocks.WALL_SIGN || block == Blocks.STANDING_SIGN;
    }
    
    public static List<Vector3d> findPath(final double tpX, final double tpY, final double tpZ, final double offset) {
        final Minecraft mc = Minecraft.getMinecraft();
        final List<Vector3d> positions = new ArrayList<Vector3d>();
        final double steps = Math.ceil(getDistance(mc.player.posX, mc.player.posY, mc.player.posZ, tpX, tpY, tpZ) / offset);
        final double dX = tpX - mc.player.posX;
        final double dY = tpY - mc.player.posY;
        final double dZ = tpZ - mc.player.posZ;
        for (double d = 1.0; d <= steps; ++d) {
            positions.add(new Vector3d(mc.player.posX + dX * d / steps, mc.player.posY + dY * d / steps, mc.player.posZ + dZ * d / steps));
        }
        return positions;
    }
    
    private static double getDistance(final double x1, final double y1, final double z1, final double x2, final double y2, final double z2) {
        final double xDiff = x1 - x2;
        final double yDiff = y1 - y2;
        final double zDiff = z1 - z2;
        return MathHelper.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
}
