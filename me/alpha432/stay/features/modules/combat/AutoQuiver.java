//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.*;
import net.minecraft.potion.*;
import net.minecraft.item.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;

public class AutoQuiver extends Module
{
    int randomVariation;
    public Setting<Boolean> autoSwitch;
    public Setting<Boolean> toggle;
    
    public AutoQuiver() {
        super("AutoQuiver", "Rotates and shoots yourself with good potion effects", Category.COMBAT, true, false, false);
        this.autoSwitch = (Setting<Boolean>)this.register(new Setting("AutoSwitchArrow", (T)true));
        this.toggle = (Setting<Boolean>)this.register(new Setting("Toggle", (T)true));
    }
    
    @Override
    public void onTick() {
        final PotionEffect speedEffect = AutoQuiver.mc.player.getActivePotionEffect((Potion)Objects.requireNonNull(Potion.getPotionById(1)));
        final PotionEffect strengthEffect = AutoQuiver.mc.player.getActivePotionEffect((Potion)Objects.requireNonNull(Potion.getPotionById(5)));
        final boolean hasSpeed = speedEffect != null;
        final boolean hasStrength = strengthEffect != null;
        if (AutoQuiver.mc.player.getHeldItemMainhand().getItem() == Items.BOW) {
            AutoQuiver.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(0.0f, -90.0f, true));
        }
        if (AutoQuiver.mc.player.getItemInUseMaxCount() == 0) {
            AutoQuiver.mc.player.setActiveHand(EnumHand.MAIN_HAND);
            AutoQuiver.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        }
        else if (AutoQuiver.mc.player.getItemInUseMaxCount() > 0) {
            AutoQuiver.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, AutoQuiver.mc.player.getHorizontalFacing()));
            AutoQuiver.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
            AutoQuiver.mc.player.stopActiveHand();
        }
        if (this.toggle.getValue()) {
            this.toggle();
        }
    }
    
    private boolean isArrowInInventory(final String type) {
        boolean inInv = false;
        for (int i = 0; i < 36; ++i) {
            final ItemStack itemStack = AutoQuiver.mc.player.inventory.getStackInSlot(i);
            if (itemStack.getItem() == Items.TIPPED_ARROW && itemStack.getDisplayName().equalsIgnoreCase(type)) {
                inInv = true;
                this.switchArrow(i);
                break;
            }
        }
        return inInv;
    }
    
    private void switchArrow(final int oldSlot) {
        final int bowSlot = AutoQuiver.mc.player.inventory.currentItem;
        int placeSlot = bowSlot + 1;
        if (placeSlot > 8) {
            placeSlot = 1;
        }
        if (placeSlot != oldSlot) {
            if (AutoQuiver.mc.currentScreen instanceof GuiContainer) {
                return;
            }
            AutoQuiver.mc.playerController.windowClick(0, oldSlot, 0, ClickType.PICKUP, (EntityPlayer)AutoQuiver.mc.player);
            AutoQuiver.mc.playerController.windowClick(0, placeSlot, 0, ClickType.PICKUP, (EntityPlayer)AutoQuiver.mc.player);
            AutoQuiver.mc.playerController.windowClick(0, oldSlot, 0, ClickType.PICKUP, (EntityPlayer)AutoQuiver.mc.player);
        }
    }
    
    private int getBowCharge() {
        if (this.randomVariation == 0) {
            this.randomVariation = 1;
        }
        return 1 + this.randomVariation;
    }
}
