//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.player;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class PortalGodMode extends Module
{
    public PortalGodMode() {
        super("PortalGodMode", "PortalGodMode", Module.Category.PLAYER, false, false, false);
    }
    
    @SubscribeEvent
    public void onPacket(final PacketEvent.Send event) {
        if (this.isEnabled() && event.getPacket() instanceof CPacketConfirmTeleport) {
            event.setCancelled(true);
        }
    }
}
