//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.graphics.color.*;
import net.minecraft.client.renderer.*;

public class BreakESP extends Module
{
    public Setting<Boolean> ros;
    
    public BreakESP() {
        super("BreakESP", "BreakESP", Module.Category.VISUAL, false, false, false);
        this.ros = (Setting<Boolean>)this.register(new Setting("No Animation", (T)true));
    }
    
    public void onRender3D(final Render3DEvent event) {
        BlockPos blockPos;
        int progress;
        String neam;
        AxisAlignedBB axisAlignedBB;
        AxisAlignedBB axisAlignedBB2;
        BreakESP.mc.renderGlobal.damagedBlocks.forEach((integer, destroyBlockProgress) -> {
            if (destroyBlockProgress != null && integer != null) {
                blockPos = destroyBlockProgress.getPosition();
                if (BreakESP.mc.world.getBlockState(blockPos).getBlock() != Blocks.AIR) {
                    if (blockPos.getDistance((int)BreakESP.mc.player.posX, (int)BreakESP.mc.player.posY, (int)BreakESP.mc.player.posZ) <= 6.0 && blockPos != null && integer != null) {
                        progress = destroyBlockProgress.getPartialBlockDamage();
                        neam = BreakESP.mc.world.getEntityByID((int)integer).getName();
                        if (!(!neam.equals(""))) {
                            axisAlignedBB = BreakESP.mc.world.getBlockState(blockPos).getSelectedBoundingBox((World)BreakESP.mc.world, blockPos);
                            RenderUtil.drawText(blockPos, neam + ">" + (progress * 10 + 20) + "%");
                            axisAlignedBB2 = this.calcBB(axisAlignedBB, progress);
                            this.renderESP(axisAlignedBB2, progress + 2);
                        }
                    }
                }
            }
        });
    }
    
    private AxisAlignedBB calcBB(final AxisAlignedBB bb, final int state) {
        AxisAlignedBB rbb = bb;
        switch (state) {
            case 0: {
                rbb = bb.shrink(0.6);
                break;
            }
            case 1: {
                rbb = bb.shrink(0.65);
                break;
            }
            case 2: {
                rbb = bb.shrink(0.7);
                break;
            }
            case 3: {
                rbb = bb.shrink(0.75);
                break;
            }
            case 4: {
                rbb = bb.shrink(0.8);
                break;
            }
            case 5: {
                rbb = bb.shrink(0.85);
                break;
            }
            case 6: {
                rbb = bb.shrink(0.9);
                break;
            }
            case 7: {
                rbb = bb.shrink(0.95);
                break;
            }
            case 8: {
                rbb = bb;
                break;
            }
        }
        return rbb;
    }
    
    private void renderESP(final AxisAlignedBB axisAlignedBB, final int progress) {
        final double centerX = axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) / 2.0;
        final double centerY = axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) / 2.0;
        final double centerZ = axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) / 2.0;
        final double progressValX = progress * ((axisAlignedBB.maxX - centerX) / 10.0);
        final double progressValY = progress * ((axisAlignedBB.maxY - centerY) / 10.0);
        final double progressValZ = progress * ((axisAlignedBB.maxZ - centerZ) / 10.0);
        final AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(centerX - progressValX, centerY - progressValY, centerZ - progressValZ, centerX + progressValX, centerY + progressValY, centerZ + progressValZ);
        RenderUtil.drawBBBox(axisAlignedBB2, new Colour(255, 255, 255, 200), new Colour(255, 255, 255, 200).getAlpha());
    }
}
