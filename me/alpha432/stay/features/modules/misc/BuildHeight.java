//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class BuildHeight extends Module
{
    public BuildHeight() {
        super("BuildHeight", "Allows you to place at build height", Category.MISC, true, false, false);
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        final CPacketPlayerTryUseItemOnBlock packet;
        if (event.getStage() == 0 && event.getPacket() instanceof CPacketPlayerTryUseItemOnBlock && (packet = (CPacketPlayerTryUseItemOnBlock)event.getPacket()).getPos().getY() >= 255 && packet.getDirection() == EnumFacing.UP) {
            packet.placedBlockDirection = EnumFacing.DOWN;
        }
    }
}
