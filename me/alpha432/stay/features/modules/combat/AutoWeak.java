//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.entity.*;
import me.alpha432.stay.client.*;
import java.util.*;
import net.minecraft.potion.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.item.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.math.*;
import me.alpha432.stay.util.player.*;
import net.minecraft.init.*;
import net.minecraft.inventory.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class AutoWeak extends Module
{
    private final Timer Timer;
    private boolean fuck;
    boolean bs;
    int i;
    
    public AutoWeak() {
        super("AutoWeak", "AutoWeak", Category.COMBAT, true, false, false);
        this.Timer = new Timer();
        this.fuck = false;
        this.bs = true;
        this.i = 0;
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
    
    private int getweakIteam() {
        for (int i = 0; i <= 36; ++i) {
            if (PotionUtils.getPotionFromItem(AutoWeak.mc.player.inventory.getStackInSlot(i)).getRegistryName().getPath().contains("weakness")) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void onUpdate() {
        if (AutoWeak.mc.player != null) {
            final int weak = this.getweakIteam();
            if (weak == -1) {
                return;
            }
            if (InventoryUtil.findItemInHotbar((Item)Items.BOW) == -1) {
                return;
            }
            if (!AutoWeak.mc.player.isHandActive() && HoleUtil.isHole(new BlockPos(Wrapper.getPlayer().posX, Wrapper.getPlayer().posY, Wrapper.getPlayer().posZ))) {
                final BlockPos pos2 = PlayerUtil.getPlayerPos();
                final EntityPlayer pos3 = this.getTarget(2.0);
                if (pos3 != null && Wrapper.getPlayer().getDistance(pos3.posX, pos3.posY, pos3.posZ) <= 1.0 && AutoWeak.mc.world.getBlockState(new BlockPos(pos2.getX(), pos2.getY(), pos2.getZ())).getBlock() == Blocks.AIR) {
                    AutoWeak.mc.playerController.windowClick(0, weak, 9, ClickType.SWAP, (EntityPlayer)AutoWeak.mc.player);
                    final int of = AutoWeak.mc.player.inventory.currentItem;
                    System.out.println(pos3.getEntityData());
                    if (AutoWeak.mc.player.getItemInUseMaxCount() >= 3) {
                        AutoWeak.mc.player.setActiveHand(EnumHand.MAIN_HAND);
                        AutoWeak.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        AutoWeak.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        AutoWeak.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                    }
                    else if (AutoWeak.mc.player.getItemInUseMaxCount() <= 3) {
                        AutoWeak.mc.player.stopActiveHand();
                    }
                }
            }
        }
    }
}
