//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.*;
import me.alpha432.stay.manager.*;
import net.minecraft.util.*;
import java.lang.reflect.*;

public class SelfFill extends Module
{
    private BlockPos playerPos;
    private final Setting<Boolean> center;
    private final Setting<Boolean> timerfill;
    
    public SelfFill() {
        super("SelfFill", "SelfFills yourself in a hole.", Category.COMBAT, true, false, true);
        this.center = (Setting<Boolean>)this.register(new Setting("TPCenter", (T)false));
        this.timerfill = (Setting<Boolean>)this.register(new Setting("TimerFill", (T)false));
    }
    
    @Override
    public void onEnable() {
        if (this.timerfill.getValue()) {
            this.setTimer(50.0f);
        }
        this.playerPos = new BlockPos(SelfFill.mc.player.posX, SelfFill.mc.player.posY, SelfFill.mc.player.posZ);
        if (SelfFill.mc.world.getBlockState(this.playerPos).getBlock().equals(Blocks.OBSIDIAN)) {
            this.disable();
            return;
        }
        SelfFill.mc.player.jump();
    }
    
    @Override
    public void onDisable() {
        this.setTimer(1.0f);
    }
    
    @Override
    public void onUpdate() {
        if (nullCheck()) {
            return;
        }
        if (SelfFill.mc.player.posY > this.playerPos.getY() + 1.04) {
            SelfFill.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)SelfFill.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            WorldUtil.placeBlock(this.playerPos, InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN));
            SelfFill.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position((double)this.playerPos.getX(), this.playerPos.getY() + 1.05, (double)this.playerPos.getZ(), true));
            SelfFill.mc.player.motionY = 1.2;
            SelfFill.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)SelfFill.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
            this.disable();
        }
    }
    
    private void setTimer(final float value) {
        try {
            final Field timer = Minecraft.class.getDeclaredField(Mapping.timer);
            timer.setAccessible(true);
            final Field tickLength = Timer.class.getDeclaredField(Mapping.tickLength);
            tickLength.setAccessible(true);
            tickLength.setFloat(timer.get(SelfFill.mc), 50.0f / value);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getDisplayInfo() {
        if (this.timerfill.getValue()) {
            return "Timer";
        }
        return "Burrow";
    }
}
