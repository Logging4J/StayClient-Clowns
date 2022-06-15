//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.player.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import me.alpha432.stay.client.*;
import net.minecraft.block.state.*;
import net.minecraft.client.entity.*;

public class HoleIntercept extends Module
{
    private final Setting<Integer> height;
    
    public HoleIntercept() {
        super("HoleIntercept", "HoleIntercept", Module.Category.MOVEMENT, true, false, false);
        this.height = (Setting<Integer>)this.register(new Setting("Height", (T)2, (T)0, (T)10));
    }
    
    public void onUpdate() {
        if (nullCheck()) {
            return;
        }
        if (HoleIntercept.mc.player == null || HoleIntercept.mc.world == null || HoleIntercept.mc.player.isInWater() || HoleIntercept.mc.player.isInLava()) {
            return;
        }
        final BlockPos originalPos = PlayerUtil.getPlayerPos();
        if (!HoleUtil.isInHole()) {
            for (int i = 1; i <= this.height.getValue(); ++i) {
                if (originalPos.getY() - i <= 0) {
                    break;
                }
                final IBlockState blockState2 = HoleIntercept.mc.world.getBlockState(new BlockPos(originalPos.getX(), originalPos.getY() - i, originalPos.getZ()));
                if (blockState2.getBlock() != Blocks.AIR) {
                    return;
                }
                if (HoleUtil.isHole(new BlockPos(originalPos.getX(), originalPos.getY() - i, originalPos.getZ()))) {
                    if (HoleIntercept.mc.player.onGround) {
                        final EntityPlayerSP player = HoleIntercept.mc.player;
                        --player.motionY;
                    }
                    for (int j = 0; j < i; ++j) {
                        Stay.positionManager.setPositionPacket(originalPos.getX() + 0.5, originalPos.getY() - 0.5 * j, originalPos.getZ() + 0.5, true, true, true);
                    }
                    return;
                }
            }
        }
    }
}
