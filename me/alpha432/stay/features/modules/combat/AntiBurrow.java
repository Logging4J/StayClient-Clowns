//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import me.alpha432.stay.client.*;
import java.util.*;
import net.minecraft.client.gui.*;
import me.alpha432.stay.manager.*;
import me.alpha432.stay.features.modules.misc.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;

public class AntiBurrow extends Module
{
    private final Setting<Double> range;
    private final Setting<Boolean> disable;
    
    public AntiBurrow() {
        super("AntiBurrow", "AntiBurrow", Category.COMBAT, true, false, false);
        this.range = (Setting<Double>)this.register(new Setting("Range", (T)4.0, (T)0.0, (T)10.0));
        this.disable = (Setting<Boolean>)this.register(new Setting("disable", (T)true));
    }
    
    private EntityPlayer getTarget(final double range) {
        EntityPlayer target = null;
        double distance = Math.pow(range, 2.0) + 1.0;
        for (final EntityPlayer player : AutoTrap.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range)) {
                if (Stay.speedManager.getPlayerSpeed(player) > 10.0) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = AutoTrap.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (AutoTrap.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = AutoTrap.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
    
    @Override
    public void onUpdate() {
        if (fullNullCheck()) {
            return;
        }
        if (AntiBurrow.mc.currentScreen instanceof GuiHopper) {
            return;
        }
        if (ModuleManager.getModuleByName("AutoCev").isEnabled()) {
            return;
        }
        final EntityPlayer player = this.getTarget(this.range.getValue());
        if (this.disable.getValue()) {
            this.disable();
        }
        if (player == null) {
            return;
        }
        final BlockPos pos = new BlockPos(player.posX, player.posY + 0.5, player.posZ);
        if (pos == null) {
            return;
        }
        if (InstantMine.breakPos == null) {
            return;
        }
        if (InstantMine.breakPos.getZ() == pos.getZ() && InstantMine.breakPos.getX() == pos.getX() && InstantMine.breakPos.getY() == pos.getY()) {
            return;
        }
        if (AntiBurrow.mc.world.getBlockState(pos).getBlock() != Blocks.AIR && !this.isOnLiquid() && !this.isInLiquid() && AntiBurrow.mc.world.getBlockState(pos).getBlock() != Blocks.WATER && AntiBurrow.mc.world.getBlockState(pos).getBlock() != Blocks.LAVA) {
            Anti32k.mc.player.swingArm(EnumHand.MAIN_HAND);
            Anti32k.mc.playerController.onPlayerDamageBlock(pos, BlockUtil.getRayTraceFacing(pos));
        }
    }
    
    private boolean isOnLiquid() {
        final double y = AntiBurrow.mc.player.posY - 0.03;
        for (int x = MathHelper.floor(AntiBurrow.mc.player.posX); x < MathHelper.ceil(AntiBurrow.mc.player.posX); ++x) {
            for (int z = MathHelper.floor(AntiBurrow.mc.player.posZ); z < MathHelper.ceil(AntiBurrow.mc.player.posZ); ++z) {
                final BlockPos pos = new BlockPos(x, MathHelper.floor(y), z);
                if (AntiBurrow.mc.world.getBlockState(pos).getBlock() instanceof BlockLiquid) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean isInLiquid() {
        final double y = AntiBurrow.mc.player.posY + 0.01;
        for (int x = MathHelper.floor(AntiBurrow.mc.player.posX); x < MathHelper.ceil(AntiBurrow.mc.player.posX); ++x) {
            for (int z = MathHelper.floor(AntiBurrow.mc.player.posZ); z < MathHelper.ceil(AntiBurrow.mc.player.posZ); ++z) {
                final BlockPos pos = new BlockPos(x, (int)y, z);
                if (AntiBurrow.mc.world.getBlockState(pos).getBlock() instanceof BlockLiquid) {
                    return true;
                }
            }
        }
        return false;
    }
}
