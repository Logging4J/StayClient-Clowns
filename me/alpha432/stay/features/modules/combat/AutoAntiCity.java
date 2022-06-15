//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.math.*;
import me.alpha432.stay.features.modules.render.*;
import java.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.entity.*;
import me.alpha432.stay.client.*;

public class AutoAntiCity extends Module
{
    private final Setting<Boolean> rotate;
    private final Setting<Boolean> noGhost;
    private final Setting<Double> range;
    private int swapBlock;
    List<Vec3d> city;
    
    public AutoAntiCity() {
        super("AutoAntiCity", "AutoAntiCity", Category.COMBAT, true, false, false);
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.noGhost = (Setting<Boolean>)this.register(new Setting("Packet", (T)false));
        this.range = (Setting<Double>)this.register(new Setting("Range", (T)8.0, (T)1.0, (T)20.0));
        this.swapBlock = -1;
        this.city = new ArrayList<Vec3d>(Arrays.asList(new Vec3d(2.0, 0.0, 0.0), new Vec3d(2.0, 1.0, 0.0), new Vec3d(-2.0, 0.0, 0.0), new Vec3d(-2.0, 1.0, 0.0), new Vec3d(0.0, 0.0, 2.0), new Vec3d(0.0, 1.0, 2.0), new Vec3d(0.0, 0.0, -2.0), new Vec3d(0.0, 1.0, -2.0)));
    }
    
    @Override
    public void onUpdate() {
        if (AutoAntiCity.mc.player == null || AutoAntiCity.mc.world == null) {
            return;
        }
        this.swapBlock = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN);
        if (this.swapBlock == -1) {
            return;
        }
        final BlockPos pos = new BlockPos(AutoAntiCity.mc.player.posX, AutoAntiCity.mc.player.posY, AutoAntiCity.mc.player.posZ);
        if (pos == null) {
            return;
        }
        if (!HoleUtil.isHole(pos) || this.getTarget(this.range.getValue()) == null) {
            return;
        }
        if (HoleESP.mc.world.getBlockState(pos.north()).getBlock() == Blocks.BEDROCK && HoleESP.mc.world.getBlockState(pos.east()).getBlock() == Blocks.BEDROCK && HoleESP.mc.world.getBlockState(pos.west()).getBlock() == Blocks.BEDROCK && HoleESP.mc.world.getBlockState(pos.south()).getBlock() == Blocks.BEDROCK && HoleESP.mc.world.getBlockState(pos.down()).getBlock() == Blocks.BEDROCK) {
            return;
        }
        for (final Vec3d city : this.city) {
            final BlockPos poss = new BlockPos(city.add((double)pos.getX(), (double)pos.getY(), (double)pos.getZ()));
            if (AutoAntiCity.mc.world.getBlockState(poss).getBlock() == Blocks.AIR) {
                this.paley(poss);
            }
        }
    }
    
    private void switchToSlot(final int slot) {
        AutoAntiCity.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
        AutoAntiCity.mc.player.inventory.currentItem = slot;
        AutoAntiCity.mc.playerController.updateController();
    }
    
    private void paley(final BlockPos pos) {
        final int old = AutoAntiCity.mc.player.inventory.currentItem;
        this.switchToSlot(this.swapBlock);
        BlockUtil.placeBlock(pos, EnumHand.MAIN_HAND, this.rotate.getValue(), true, false);
        this.switchToSlot(old);
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
}
