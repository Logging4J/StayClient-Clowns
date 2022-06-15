//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class AtinAFK extends Module
{
    private final Setting<Boolean> swing;
    private final Setting<Boolean> turn;
    private Random random;
    
    public AtinAFK() {
        super("AtinAFK", "AtinAFK", Category.MISC, true, false, false);
        this.swing = (Setting<Boolean>)this.register(new Setting("Swing", (T)true));
        this.turn = (Setting<Boolean>)this.register(new Setting("Turn", (T)true));
        this.random = new Random();
    }
    
    @Override
    public void onUpdate() {
        if (!AtinAFK.mc.playerController.getIsHittingBlock()) {
            if (AtinAFK.mc.player.ticksExisted % 40 == 0 && this.swing.getValue()) {
                AtinAFK.mc.getConnection().sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
            }
            if (AtinAFK.mc.player.ticksExisted % 15 == 0 && this.turn.getValue()) {
                AtinAFK.mc.player.rotationYaw = (float)(this.random.nextInt(360) - 180);
            }
            if (!this.swing.getValue() && !this.turn.getValue() && AtinAFK.mc.player.ticksExisted % 80 == 0) {
                AtinAFK.mc.player.jump();
            }
        }
    }
}
