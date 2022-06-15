//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.manager.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;
import net.minecraft.client.entity.*;

public class ReverseStep extends Module
{
    private final Setting<Boolean> twoBlocks;
    
    public ReverseStep() {
        super("ReverseStep", "ReverseStep", Module.Category.MOVEMENT, true, false, false);
        this.twoBlocks = (Setting<Boolean>)this.register(new Setting("2Blocks", (T)false));
    }
    
    public void onUpdate() {
        if (fullNullCheck()) {
            return;
        }
        if (ModuleManager.getModuleByName("InfiniteDive").isEnabled()) {
            return;
        }
        final IBlockState touchingState = ReverseStep.mc.world.getBlockState(new BlockPos(ReverseStep.mc.player.posX, ReverseStep.mc.player.posY, ReverseStep.mc.player.posZ).down(2));
        final IBlockState touchingState2 = ReverseStep.mc.world.getBlockState(new BlockPos(ReverseStep.mc.player.posX, ReverseStep.mc.player.posY, ReverseStep.mc.player.posZ).down(3));
        if (ReverseStep.mc.player.isInLava()) {
            return;
        }
        if (ReverseStep.mc.player.isInWater()) {
            return;
        }
        if (touchingState.getBlock() == Blocks.BEDROCK || touchingState.getBlock() == Blocks.OBSIDIAN) {
            if (!ReverseStep.mc.player.onGround) {
                return;
            }
            final EntityPlayerSP player = ReverseStep.mc.player;
            --player.motionY;
        }
        else {
            if (!this.twoBlocks.getValue() || touchingState2.getBlock() != Blocks.BEDROCK) {
                if (!this.twoBlocks.getValue()) {
                    return;
                }
                if (touchingState2.getBlock() != Blocks.OBSIDIAN) {
                    return;
                }
            }
            if (!ReverseStep.mc.player.onGround) {
                return;
            }
            final EntityPlayerSP player2 = ReverseStep.mc.player;
            --player2.motionY;
        }
    }
}
