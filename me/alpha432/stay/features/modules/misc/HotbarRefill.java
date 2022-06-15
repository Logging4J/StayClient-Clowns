//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import java.util.stream.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.block.*;

public class HotbarRefill extends Module
{
    private final Setting<Integer> threshold;
    private final Setting<Integer> tickDelay;
    private int delayStep;
    
    public HotbarRefill() {
        super("HotbarRefill", "HotbarRefill", Category.MISC, true, false, false);
        this.threshold = (Setting<Integer>)this.register(new Setting("Threshold", (T)32, (T)1, (T)63));
        this.tickDelay = (Setting<Integer>)this.register(new Setting("Tick Delay", (T)2, (T)1, (T)10));
        this.delayStep = 0;
    }
    
    @Override
    public void onUpdate() {
        if (HotbarRefill.mc.player == null || HotbarRefill.mc.world == null) {
            return;
        }
        if (HotbarRefill.mc.currentScreen instanceof GuiContainer) {
            return;
        }
        if (this.delayStep < this.tickDelay.getValue()) {
            ++this.delayStep;
            return;
        }
        this.delayStep = 0;
        final Pair<Integer, Integer> slots = this.findReplenishableHotbarSlot();
        if (slots == null) {
            return;
        }
        final int inventorySlot = slots.getKey();
        final int hotbarSlot = slots.getValue();
        HotbarRefill.mc.playerController.windowClick(0, inventorySlot, 0, ClickType.PICKUP, (EntityPlayer)HotbarRefill.mc.player);
        HotbarRefill.mc.playerController.windowClick(0, hotbarSlot + 36, 0, ClickType.PICKUP, (EntityPlayer)HotbarRefill.mc.player);
        HotbarRefill.mc.playerController.windowClick(0, inventorySlot, 0, ClickType.PICKUP, (EntityPlayer)HotbarRefill.mc.player);
    }
    
    private Pair<Integer, Integer> findReplenishableHotbarSlot() {
        final List<ItemStack> inventory = (List<ItemStack>)HotbarRefill.mc.player.inventory.mainInventory;
        for (int hotbarSlot = 0; hotbarSlot < 9; ++hotbarSlot) {
            final ItemStack stack = inventory.get(hotbarSlot);
            if (stack.isStackable()) {
                if (!stack.isEmpty) {
                    if (stack.getItem() != Items.AIR) {
                        if (stack.stackSize < stack.getMaxStackSize()) {
                            if (stack.stackSize <= this.threshold.getValue()) {
                                final int inventorySlot = this.findCompatibleInventorySlot(stack);
                                if (inventorySlot != -1) {
                                    return new Pair<Integer, Integer>(inventorySlot, hotbarSlot);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    private int findCompatibleInventorySlot(final ItemStack hotbarStack) {
        final Item item = hotbarStack.getItem();
        List<Integer> potentialSlots;
        if (item instanceof ItemBlock) {
            potentialSlots = InventoryUtil.findAllBlockSlots(((ItemBlock)item).getBlock().getClass());
        }
        else {
            potentialSlots = InventoryUtil.findAllItemSlots(item.getClass());
        }
        potentialSlots = potentialSlots.stream().filter(integer -> integer > 8 && integer < 36).sorted(Comparator.comparingInt(interger -> -interger)).collect((Collector<? super Object, ?, List<Integer>>)Collectors.toList());
        for (final int slot : potentialSlots) {
            if (this.isCompatibleStacks(hotbarStack, HotbarRefill.mc.player.inventory.getStackInSlot(slot))) {
                return slot;
            }
        }
        return -1;
    }
    
    private boolean isCompatibleStacks(final ItemStack stack1, final ItemStack stack2) {
        if (!stack1.getItem().equals(stack2.getItem())) {
            return false;
        }
        if (stack1.getItem() instanceof ItemBlock && stack2.getItem() instanceof ItemBlock) {
            final Block block1 = ((ItemBlock)stack1.getItem()).getBlock();
            final Block block2 = ((ItemBlock)stack2.getItem()).getBlock();
            if (!block1.material.equals(block2.material)) {
                return false;
            }
        }
        return stack1.getDisplayName().equals(stack2.getDisplayName()) && stack1.getItemDamage() == stack2.getItemDamage();
    }
}
