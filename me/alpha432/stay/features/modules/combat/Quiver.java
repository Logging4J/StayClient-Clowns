//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.item.*;

public class Quiver extends Module
{
    private final Setting<Integer> tickDelay;
    
    public Quiver() {
        super("Quiver", "Rotates and shoots yourself with good potion effects", Category.COMBAT, true, false, false);
        this.tickDelay = (Setting<Integer>)this.register(new Setting("TickDelay", (T)3, (T)0, (T)8));
    }
    
    @Override
    public void onUpdate() {
        if (Quiver.mc.player != null) {
            if (Quiver.mc.player.inventory.getCurrentItem().getItem() instanceof ItemBow && Quiver.mc.player.isHandActive() && Quiver.mc.player.getItemInUseMaxCount() >= this.tickDelay.getValue()) {
                Quiver.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(Quiver.mc.player.cameraYaw, -90.0f, Quiver.mc.player.onGround));
                Quiver.mc.playerController.onStoppedUsingItem((EntityPlayer)Quiver.mc.player);
            }
            final List<Integer> arrowSlots = InventoryUtil.getItemInventory(Items.TIPPED_ARROW);
            if (arrowSlots.get(0) == -1) {
                return;
            }
            int speedSlot = -1;
            int strengthSlot = -1;
            for (final Integer slot : arrowSlots) {
                if (PotionUtils.getPotionFromItem(Quiver.mc.player.inventory.getStackInSlot((int)slot)).getRegistryName().getPath().contains("swiftness")) {
                    speedSlot = slot;
                }
                else {
                    if (!Objects.requireNonNull(PotionUtils.getPotionFromItem(Quiver.mc.player.inventory.getStackInSlot((int)slot)).getRegistryName()).getPath().contains("strength")) {
                        continue;
                    }
                    strengthSlot = slot;
                }
            }
        }
    }
    
    @Override
    public void onEnable() {
    }
    
    private int findBow() {
        return InventoryUtil.getItemHotbar((Item)Items.BOW);
    }
}
