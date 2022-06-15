//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;
import net.minecraft.init.*;
import net.minecraft.block.*;

public class NoContainer extends Module
{
    public Setting<Boolean> Chest;
    public Setting<Boolean> EnderChest;
    public Setting<Boolean> Trapped_Chest;
    public Setting<Boolean> Hopper;
    public Setting<Boolean> Dispenser;
    public Setting<Boolean> Furnace;
    public Setting<Boolean> Beacon;
    public Setting<Boolean> Crafting_Table;
    public Setting<Boolean> Anvil;
    public Setting<Boolean> Enchanting_table;
    public Setting<Boolean> Brewing_Stand;
    public Setting<Boolean> ShulkerBox;
    
    public NoContainer() {
        super("AntiContainer", "Do not display containers", Category.PLAYER, true, false, false);
        this.Chest = (Setting<Boolean>)this.register(new Setting("Chest", (T)true));
        this.EnderChest = (Setting<Boolean>)this.register(new Setting("EnderChest", (T)true));
        this.Trapped_Chest = (Setting<Boolean>)this.register(new Setting("Trapped_Chest", (T)true));
        this.Hopper = (Setting<Boolean>)this.register(new Setting("Hopper", (T)true));
        this.Dispenser = (Setting<Boolean>)this.register(new Setting("Dispenser", (T)true));
        this.Furnace = (Setting<Boolean>)this.register(new Setting("Furnace", (T)true));
        this.Beacon = (Setting<Boolean>)this.register(new Setting("Beacon", (T)true));
        this.Crafting_Table = (Setting<Boolean>)this.register(new Setting("Crafting_Table", (T)true));
        this.Anvil = (Setting<Boolean>)this.register(new Setting("Anvil", (T)true));
        this.Enchanting_table = (Setting<Boolean>)this.register(new Setting("Enchanting_table", (T)true));
        this.Brewing_Stand = (Setting<Boolean>)this.register(new Setting("Brewing_Stand", (T)true));
        this.ShulkerBox = (Setting<Boolean>)this.register(new Setting("ShulkerBox", (T)true));
    }
    
    @SubscribeEvent
    public void onCheck(final PacketEvent.Send packet) {
        if (packet.getPacket() instanceof CPacketPlayerTryUseItemOnBlock) {
            final BlockPos pos = ((CPacketPlayerTryUseItemOnBlock)packet.getPacket()).getPos();
            if (this.check(pos)) {
                packet.setCanceled(true);
            }
        }
    }
    
    public boolean check(final BlockPos pos) {
        return (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.CHEST && this.Chest.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.ENDER_CHEST && this.EnderChest.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.TRAPPED_CHEST && this.Trapped_Chest.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.HOPPER && this.Hopper.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.DISPENSER && this.Dispenser.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.FURNACE && this.Furnace.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.BEACON && this.Beacon.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.CRAFTING_TABLE && this.Crafting_Table.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.ANVIL && this.Anvil.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.ENCHANTING_TABLE && this.Enchanting_table.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() == Blocks.BREWING_STAND && this.Brewing_Stand.getValue()) || (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() instanceof BlockShulkerBox && this.ShulkerBox.getValue());
    }
}
