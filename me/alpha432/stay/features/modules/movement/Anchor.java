//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.util.math.*;
import net.minecraft.client.gui.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.math.*;
import java.util.*;

public class Anchor extends Module
{
    public Setting<Boolean> guarantee;
    private final Setting<Integer> activateHeight;
    BlockPos playerPos;
    
    public Anchor() {
        super("Anchor", "Anchor", Module.Category.MOVEMENT, false, false, false);
        this.guarantee = (Setting<Boolean>)this.register(new Setting("Guarantee Hole", (T)true));
        this.activateHeight = (Setting<Integer>)this.register(new Setting("Horizontal", (T)2, (T)1, (T)5));
    }
    
    public void onUpdate() {
        if (Anchor.mc.player == null) {
            return;
        }
        if (Anchor.mc.currentScreen instanceof GuiHopper) {
            return;
        }
        if (Anchor.mc.player.posY < 0.0) {
            return;
        }
        final double blockX = Math.floor(Anchor.mc.player.posX);
        final double blockZ = Math.floor(Anchor.mc.player.posZ);
        final double offsetX = Math.abs(Anchor.mc.player.posX - blockX);
        final double offsetZ = Math.abs(Anchor.mc.player.posZ - blockZ);
        if (this.guarantee.getValue() && (offsetX < 0.30000001192092896 || offsetX > 0.699999988079071 || offsetZ < 0.30000001192092896 || offsetZ > 0.699999988079071)) {
            return;
        }
        this.playerPos = new BlockPos(blockX, Anchor.mc.player.posY, blockZ);
        if (Anchor.mc.world.getBlockState(this.playerPos).getBlock() != Blocks.AIR) {
            return;
        }
        BlockPos currentBlock = this.playerPos.down();
        for (int i = 0; i < this.activateHeight.getValue(); ++i) {
            currentBlock = currentBlock.down();
            if (Anchor.mc.world.getBlockState(currentBlock).getBlock() != Blocks.AIR) {
                final HashMap<HoleUtil.BlockOffset, HoleUtil.BlockSafety> sides = HoleUtil.getUnsafeSides(currentBlock.up());
                sides.entrySet().removeIf(entry -> entry.getValue() == HoleUtil.BlockSafety.RESISTANT);
                if (sides.size() == 0) {
                    Anchor.mc.player.motionX = 0.0;
                    Anchor.mc.player.motionZ = 0.0;
                }
            }
        }
    }
}
