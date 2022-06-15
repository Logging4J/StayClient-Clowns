//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class AntiBookBan extends Module
{
    public AntiBookBan() {
        super("AntiBookBan", "AntiBookBan", Category.MISC, true, false, false);
    }
    
    @SubscribeEvent
    public void onLeavingDeathEvent(final PacketEvent.Receive event) {
        if (!(event.getPacket() instanceof CPacketClickWindow)) {
            return;
        }
        final CPacketClickWindow packet = (CPacketClickWindow)event.getPacket();
        if (!(packet.getClickedItem().getItem() instanceof ItemWrittenBook)) {
            return;
        }
        event.setCancelled(true);
        AntiBookBan.mc.player.openContainer.slotClick(packet.getSlotId(), packet.getUsedButton(), packet.getClickType(), (EntityPlayer)AntiBookBan.mc.player);
    }
}
