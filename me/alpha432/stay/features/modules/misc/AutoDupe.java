//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.block.state.*;
import me.alpha432.stay.features.modules.combat.*;
import net.minecraft.item.*;

public class AutoDupe extends Module
{
    public Setting<Boolean> packet;
    public Setting<Boolean> rotate;
    private final Setting<Integer> delay;
    private final Timer timer;
    private BlockPos pos;
    int Im;
    
    public AutoDupe() {
        super("AutoDupe", "Automatically places Shulker", Category.MISC, true, false, false);
        this.packet = (Setting<Boolean>)this.register(new Setting("Packet", (T)false));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)false));
        this.delay = (Setting<Integer>)this.register(new Setting("Delay", (T)0, (T)0, (T)2000));
        this.timer = new Timer();
    }
    
    @Override
    public void onEnable() {
    }
    
    @Override
    public void onDisable() {
    }
    
    @Override
    public void onUpdate() {
        if (InstantMine.breakPos == null) {
            return;
        }
        this.pos = InstantMine.breakPos;
        final IBlockState blockState = AutoDupe.mc.world.getBlockState(this.pos);
        this.Im = this.getItemShulkerBox();
        if (blockState.getBlock() == Blocks.AIR && this.Im != -1) {
            AutoDupe.mc.player.inventory.currentItem = this.Im;
            BlockUtil.placeBlock(this.pos, EnumHand.MAIN_HAND, this.rotate.getValue(), this.packet.getValue(), false);
            this.timer.passedDms(this.delay.getValue());
        }
    }
    
    public int getItemShulkerBox() {
        int fus = -1;
        for (int x = 0; x <= 8; ++x) {
            final Item item = Auto32k.mc.player.inventory.getStackInSlot(x).getItem();
            if (item instanceof ItemShulkerBox) {
                fus = x;
            }
        }
        return fus;
    }
}
