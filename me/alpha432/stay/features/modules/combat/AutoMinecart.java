//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.block.material.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.entity.*;
import java.util.*;

public class AutoMinecart extends Module
{
    private final Setting<Boolean> web;
    private final Setting<Boolean> rotate;
    private final Setting<Boolean> packet;
    private final Setting<Integer> blocksPerTick;
    private final Setting<Integer> delay;
    public Setting<Float> minHP;
    int wait;
    int waitFlint;
    int originalSlot;
    private boolean check;
    
    public AutoMinecart() {
        super("AutoMinecart", "Places and explodes minecarts on other players.", Category.COMBAT, true, false, false);
        this.web = (Setting<Boolean>)this.register(new Setting("Web", (T)Boolean.FALSE));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)Boolean.FALSE));
        this.packet = (Setting<Boolean>)this.register(new Setting("PacketPlace", (T)Boolean.FALSE));
        this.blocksPerTick = (Setting<Integer>)this.register(new Setting("BlocksPerTick", (T)1, (T)1, (T)4));
        this.delay = (Setting<Integer>)this.register(new Setting("Carts", (T)20, (T)0, (T)50));
        this.minHP = (Setting<Float>)this.register(new Setting("MinHP", (T)4.0f, (T)0.0f, (T)36.0f));
    }
    
    @Override
    public void onEnable() {
        if (fullNullCheck()) {
            this.toggle();
        }
        this.wait = 0;
        this.waitFlint = 0;
        this.originalSlot = AutoMinecart.mc.player.inventory.currentItem;
        this.check = true;
    }
    
    @Override
    public void onUpdate() {
        if (fullNullCheck()) {
            this.toggle();
        }
        final int i = InventoryUtil.findStackInventory(Items.TNT_MINECART);
        for (int j = 0; j < 9; ++j) {
            if (AutoMinecart.mc.player.inventory.getStackInSlot(j).getItem() == Items.AIR) {
                if (i != -1) {
                    AutoMinecart.mc.playerController.windowClick(AutoMinecart.mc.player.inventoryContainer.windowId, i, 0, ClickType.QUICK_MOVE, (EntityPlayer)AutoMinecart.mc.player);
                    AutoMinecart.mc.playerController.updateController();
                }
            }
        }
        final int webSlot = InventoryUtil.findHotbarBlock(BlockWeb.class);
        final int tntSlot = InventoryUtil.getItemHotbar(Items.TNT_MINECART);
        final int flintSlot = InventoryUtil.getItemHotbar(Items.FLINT_AND_STEEL);
        final int railSlot = InventoryUtil.findHotbarBlock(Blocks.ACTIVATOR_RAIL);
        final int picSlot = InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE);
        if (tntSlot == -1 || railSlot == -1 || flintSlot == -1 || picSlot == -1 || (this.web.getValue() && webSlot == -1)) {
            Command.sendMessage("<" + this.getDisplayName() + "> " + ChatFormatting.RED + "No (tnt minecart/activator rail/flint/pic/webs) in hotbar disabling...");
            this.toggle();
        }
        final EntityPlayer target;
        if ((target = this.getTarget()) == null) {
            return;
        }
        final BlockPos pos = new BlockPos(target.posX, target.posY, target.posZ);
        final Vec3d hitVec = new Vec3d((Vec3i)pos).add(0.0, -0.5, 0.0);
        if (AutoMinecart.mc.player.getDistanceSq(pos) <= MathUtil.square(6.0)) {
            this.check = true;
            if (AutoMinecart.mc.world.getBlockState(pos).getBlock() != Blocks.ACTIVATOR_RAIL && !AutoMinecart.mc.world.getEntitiesWithinAABB((Class)EntityMinecartTNT.class, new AxisAlignedBB(pos)).isEmpty()) {
                InventoryUtil.switchToHotbarSlot(flintSlot, false);
                BlockUtil.rightClickBlock(pos.down(), hitVec, EnumHand.MAIN_HAND, EnumFacing.UP, this.packet.getValue());
            }
            if (AutoMinecart.mc.world.getBlockState(pos).getBlock() != Blocks.ACTIVATOR_RAIL && AutoMinecart.mc.world.getEntitiesWithinAABB((Class)EntityMinecartTNT.class, new AxisAlignedBB(pos)).isEmpty() && AutoMinecart.mc.world.getEntitiesWithinAABB((Class)EntityMinecartTNT.class, new AxisAlignedBB(pos.up())).isEmpty() && AutoMinecart.mc.world.getEntitiesWithinAABB((Class)EntityMinecartTNT.class, new AxisAlignedBB(pos.down())).isEmpty()) {
                InventoryUtil.switchToHotbarSlot(railSlot, false);
                BlockUtil.rightClickBlock(pos.down(), hitVec, EnumHand.MAIN_HAND, EnumFacing.UP, this.packet.getValue());
                this.wait = 0;
            }
            if (this.web.getValue() && this.wait != 0 && AutoMinecart.mc.world.getBlockState(pos).getBlock() == Blocks.ACTIVATOR_RAIL && !target.isInWeb && (BlockUtil.isPositionPlaceable(pos.up(), false) == 1 || BlockUtil.isPositionPlaceable(pos.up(), false) == 3) && AutoMinecart.mc.world.getEntitiesWithinAABB((Class)EntityMinecartTNT.class, new AxisAlignedBB(pos.up())).isEmpty()) {
                InventoryUtil.switchToHotbarSlot(webSlot, false);
                BlockUtil.placeBlock(pos.up(), EnumHand.MAIN_HAND, this.rotate.getValue(), this.packet.getValue(), false);
            }
            if (AutoMinecart.mc.world.getBlockState(pos).getBlock() == Blocks.ACTIVATOR_RAIL) {
                InventoryUtil.switchToHotbarSlot(tntSlot, false);
                for (int u = 0; u < this.blocksPerTick.getValue(); ++u) {
                    BlockUtil.rightClickBlock(pos, hitVec, EnumHand.MAIN_HAND, EnumFacing.UP, this.packet.getValue());
                }
            }
            if (this.wait < this.delay.getValue()) {
                ++this.wait;
                return;
            }
            this.check = false;
            this.wait = 0;
            InventoryUtil.switchToHotbarSlot(picSlot, false);
            if (AutoMinecart.mc.world.getBlockState(pos).getBlock() == Blocks.ACTIVATOR_RAIL && !AutoMinecart.mc.world.getEntitiesWithinAABB((Class)EntityMinecartTNT.class, new AxisAlignedBB(pos)).isEmpty()) {
                AutoMinecart.mc.playerController.onPlayerDamageBlock(pos, EnumFacing.UP);
            }
            InventoryUtil.switchToHotbarSlot(flintSlot, false);
            if (AutoMinecart.mc.world.getBlockState(pos).getBlock().getBlockState().getBaseState().getMaterial() != Material.FIRE && !AutoMinecart.mc.world.getEntitiesWithinAABB((Class)EntityMinecartTNT.class, new AxisAlignedBB(pos)).isEmpty()) {
                BlockUtil.rightClickBlock(pos.down(), hitVec, EnumHand.MAIN_HAND, EnumFacing.UP, this.packet.getValue());
            }
        }
    }
    
    @Override
    public String getDisplayInfo() {
        if (this.check) {
            return ChatFormatting.GREEN + "Placing";
        }
        return ChatFormatting.RED + "Breaking";
    }
    
    @Override
    public void onDisable() {
        AutoMinecart.mc.player.inventory.currentItem = this.originalSlot;
    }
    
    private EntityPlayer getTarget() {
        EntityPlayer target = null;
        double distance = Math.pow(6.0, 2.0) + 1.0;
        for (final EntityPlayer player : AutoMinecart.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, 6.0) && !player.isInWater() && !player.isInLava() && EntityUtils.isTrapped(player, false, false, false, false, false)) {
                if (player.getHealth() + player.getAbsorptionAmount() > this.minHP.getValue()) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = AutoMinecart.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (AutoMinecart.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = AutoMinecart.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
}
