//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.block.*;
import java.util.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;

public class Anti32k extends Module
{
    private static final Anti32k INSTANCE;
    private final Setting<Integer> range;
    private final Setting<Boolean> packetMine;
    public static BlockPos min;
    int oldSlot;
    int shulkerInt;
    HashMap<BlockPos, Integer> openedShulker;
    
    public Anti32k() {
        super("Anti32k", "Anti32k", Category.COMBAT, true, false, false);
        this.range = (Setting<Integer>)this.register(new Setting("Range", (T)5, (T)3, (T)8));
        this.packetMine = (Setting<Boolean>)this.register(new Setting("PacketMine", (T)false));
        this.oldSlot = -1;
        this.openedShulker = new HashMap<BlockPos, Integer>();
    }
    
    @Override
    public void onDisable() {
        this.oldSlot = -1;
        this.shulkerInt = 0;
        this.openedShulker.clear();
    }
    
    @Override
    public void onTick() {
        if (fullNullCheck()) {
            return;
        }
        final Auto32k Auto32k = (Auto32k)Stay.moduleManager.getModuleByDisplayName("AutoXin32k");
        final boolean b;
        final BlockPos hopperPos = BlockInteractionHelper.getSphere(EntityUtils.getLocalPlayerPosFloored(), this.range.getValue(), this.range.getValue(), false, true, 0).stream().filter(e -> {
            if (Anti32k.mc.world.getBlockState(e).getBlock() instanceof BlockHopper) {
                if (Anti32k.mc.world.getBlockState(new BlockPos(e.getX(), e.getY() + 1, e.getZ())).getBlock() instanceof BlockShulkerBox && !e.equals((Object)me.alpha432.stay.features.modules.combat.Auto32k.placeTarget)) {
                    return b;
                }
            }
            return b;
        }).min(Comparator.comparing(e -> Anti32k.mc.player.getDistanceSq(e))).orElse(null);
        final int slot = InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE);
        if (slot != -1 && hopperPos != null) {
            if (Anti32k.mc.player.getDistance((double)hopperPos.getX(), (double)hopperPos.getY(), (double)hopperPos.getZ()) > this.range.getValue()) {
                return;
            }
            if (Anti32k.mc.player.inventory.currentItem != slot) {
                this.oldSlot = Anti32k.mc.player.inventory.currentItem;
                Anti32k.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
            }
            if (this.packetMine.getValue()) {
                Anti32k.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, hopperPos, EnumFacing.UP));
                Anti32k.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, hopperPos, EnumFacing.UP));
            }
            else {
                Anti32k.mc.playerController.onPlayerDamageBlock(hopperPos, EnumFacing.UP);
                Anti32k.mc.playerController.onPlayerDestroyBlock(hopperPos);
            }
            Anti32k.mc.player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
            if (this.oldSlot != -1) {
                Anti32k.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.oldSlot));
            }
        }
    }
    
    static {
        INSTANCE = new Anti32k();
        Anti32k.min = null;
    }
}
