//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.inventory;

import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.util.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import java.util.concurrent.atomic.*;
import java.util.*;
import me.alpha432.stay.client.*;
import net.minecraft.inventory.*;
import net.minecraft.client.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.enchantment.*;

public class InventoryUtil implements Util
{
    public static int findFirstItemSlot(final Class<? extends Item> clazz, final int n, final int n2) {
        int n3 = -1;
        final NonNullList<ItemStack> nonNullList = (NonNullList<ItemStack>)InventoryUtil.mc.player.inventory.mainInventory;
        for (int i = n; i <= n2; ++i) {
            final ItemStack itemStack = (ItemStack)nonNullList.get(i);
            if (itemStack != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem()) && clazz.isInstance(itemStack.getItem())) {
                n3 = i;
                break;
            }
        }
        return n3;
    }
    
    public static int findFirstBlockSlot(final Class<? extends Block> clazz, final int n, final int n2) {
        int n3 = -1;
        final NonNullList<ItemStack> nonNullList = (NonNullList<ItemStack>)InventoryUtil.mc.player.inventory.mainInventory;
        for (int i = n; i <= n2; ++i) {
            final ItemStack itemStack = (ItemStack)nonNullList.get(i);
            if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemBlock && clazz.isInstance(((ItemBlock)itemStack.getItem()).getBlock())) {
                n3 = i;
                break;
            }
        }
        return n3;
    }
    
    public static List<Integer> findAllItemSlots(final Class<? extends Item> itemToFind) {
        final List<Integer> slots = new ArrayList<Integer>();
        final List<ItemStack> mainInventory = (List<ItemStack>)InventoryUtil.mc.player.inventory.mainInventory;
        for (int i = 0; i < 36; ++i) {
            final ItemStack stack = mainInventory.get(i);
            if (stack != ItemStack.EMPTY) {
                if (itemToFind.isInstance(stack.getItem())) {
                    slots.add(i);
                }
            }
        }
        return slots;
    }
    
    public static void setSlot(final int n) {
        if (n <= 8 && n >= 0) {
            InventoryUtil.mc.player.inventory.currentItem = n;
        }
    }
    
    public static List<Integer> findAllBlockSlots(final Class<? extends Block> blockToFind) {
        final List<Integer> slots = new ArrayList<Integer>();
        final List<ItemStack> mainInventory = (List<ItemStack>)InventoryUtil.mc.player.inventory.mainInventory;
        for (int i = 0; i < 36; ++i) {
            final ItemStack stack = mainInventory.get(i);
            if (stack != ItemStack.EMPTY) {
                if (stack.getItem() instanceof ItemBlock) {
                    if (blockToFind.isInstance(((ItemBlock)stack.getItem()).getBlock())) {
                        slots.add(i);
                    }
                }
            }
        }
        return slots;
    }
    
    public static void moveItemToOffhand(final int slot) {
        int returnSlot = -1;
        if (slot == -1) {
            return;
        }
        InventoryUtil.mc.playerController.windowClick(0, (slot < 9) ? (slot + 36) : slot, 0, ClickType.PICKUP, (EntityPlayer)InventoryUtil.mc.player);
        InventoryUtil.mc.playerController.windowClick(0, 45, 0, ClickType.PICKUP, (EntityPlayer)InventoryUtil.mc.player);
        for (int i = 0; i < 45; ++i) {
            if (InventoryUtil.mc.player.inventory.getStackInSlot(i).isEmpty()) {
                returnSlot = i;
                break;
            }
        }
        if (returnSlot != -1) {
            InventoryUtil.mc.playerController.windowClick(0, (returnSlot < 9) ? (returnSlot + 36) : returnSlot, 0, ClickType.PICKUP, (EntityPlayer)InventoryUtil.mc.player);
        }
    }
    
    public static void switchToHotbarSlot(final int slot, final boolean silent) {
        if (InventoryUtil.mc.player.inventory.currentItem == slot || slot < 0) {
            return;
        }
        if (silent) {
            InventoryUtil.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
            InventoryUtil.mc.playerController.updateController();
        }
        else {
            InventoryUtil.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
            InventoryUtil.mc.player.inventory.currentItem = slot;
            InventoryUtil.mc.playerController.updateController();
        }
    }
    
    public static int getHotbarItemSlot(final Item item) {
        for (int i = 0; i < 9; ++i) {
            if (InventoryUtil.mc.player.inventory.getStackInSlot(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }
    
    public static void switchToSlot(final Item item) {
        if (getHotbarItemSlot(item) != -1 && InventoryUtil.mc.player.inventory.currentItem != getHotbarItemSlot(item)) {
            InventoryUtil.mc.player.inventory.currentItem = getHotbarItemSlot(item);
        }
    }
    
    public static void switchToHotbarSlot(final Class clazz, final boolean silent) {
        final int slot = findHotbarBlock(clazz);
        if (slot > -1) {
            switchToHotbarSlot(slot, silent);
        }
    }
    
    public static boolean isNull(final ItemStack stack) {
        return stack == null || stack.getItem() instanceof ItemAir;
    }
    
    public static int findHotbarBlock(final Class clazz) {
        for (int i = 0; i < 9; ++i) {
            final ItemStack stack = InventoryUtil.mc.player.inventory.getStackInSlot(i);
            if (stack != ItemStack.EMPTY) {
                if (clazz.isInstance(stack.getItem())) {
                    return i;
                }
                if (stack.getItem() instanceof ItemBlock) {
                    final Block block;
                    if (clazz.isInstance(block = ((ItemBlock)stack.getItem()).getBlock())) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    public static int findHotbarBlock(final Block blockIn) {
        for (int i = 0; i < 9; ++i) {
            final ItemStack stack = InventoryUtil.mc.player.inventory.getStackInSlot(i);
            final Block block;
            if (stack != ItemStack.EMPTY && stack.getItem() instanceof ItemBlock && (block = ((ItemBlock)stack.getItem()).getBlock()) == blockIn) {
                return i;
            }
        }
        return -1;
    }
    
    public static int findHotbarBlock2(final Block blockIn) {
        for (int i = 0; i < 36; ++i) {
            final ItemStack stack = InventoryUtil.mc.player.inventory.getStackInSlot(i);
            final Block block;
            if (stack != ItemStack.EMPTY && stack.getItem() instanceof ItemBlock && (block = ((ItemBlock)stack.getItem()).getBlock()) == blockIn) {
                return i;
            }
        }
        return -1;
    }
    
    public static int getItemHotbar(final Item input) {
        for (int i = 0; i < 9; ++i) {
            final Item item = InventoryUtil.mc.player.inventory.getStackInSlot(i).getItem();
            if (Item.getIdFromItem(item) == Item.getIdFromItem(input)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int getItemHotbars(final Item input) {
        for (int i = 0; i < 36; ++i) {
            final Item item = InventoryUtil.mc.player.inventory.getStackInSlot(i).getItem();
            if (Item.getIdFromItem(item) == Item.getIdFromItem(input)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int findStackInventory(final Item input) {
        return findStackInventory(input, false);
    }
    
    public static int findStackInventory(final Item input, final boolean withHotbar) {
        int n;
        for (int i = n = (withHotbar ? 0 : 9); i < 36; ++i) {
            final Item item = InventoryUtil.mc.player.inventory.getStackInSlot(i).getItem();
            if (Item.getIdFromItem(input) == Item.getIdFromItem(item)) {
                return i + ((i < 9) ? 36 : 0);
            }
        }
        return -1;
    }
    
    public static int findItemInventorySlot(final Item item, final boolean offHand) {
        final AtomicInteger slot = new AtomicInteger();
        slot.set(-1);
        for (final Map.Entry<Integer, ItemStack> entry : getInventoryAndHotbarSlots().entrySet()) {
            if (entry.getValue().getItem() == item) {
                if (entry.getKey() == 45 && !offHand) {
                    continue;
                }
                slot.set(entry.getKey());
                return slot.get();
            }
        }
        return slot.get();
    }
    
    public static int findItemInHotbar(final Item item) {
        int index = -1;
        for (int i = 0; i < 9; ++i) {
            if (InventoryUtil.mc.player.inventory.getStackInSlot(i).getItem() == item) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    public static List<Integer> getItemInventory(final Item item) {
        final List<Integer> ints = new ArrayList<Integer>();
        for (int i = 9; i < 36; ++i) {
            final Item target = InventoryUtil.mc.player.inventory.getStackInSlot(i).getItem();
            if (item instanceof ItemBlock && ((ItemBlock)item).getBlock().equals(item)) {
                ints.add(i);
            }
        }
        if (ints.size() == 0) {
            ints.add(-1);
        }
        return ints;
    }
    
    public static List<Integer> findEmptySlots(final boolean withXCarry) {
        final ArrayList<Integer> outPut = new ArrayList<Integer>();
        for (final Map.Entry<Integer, ItemStack> entry : getInventoryAndHotbarSlots().entrySet()) {
            if (!entry.getValue().isEmpty && entry.getValue().getItem() != Items.AIR) {
                continue;
            }
            outPut.add(entry.getKey());
        }
        if (withXCarry) {
            for (int i = 1; i < 5; ++i) {
                final Slot craftingSlot = InventoryUtil.mc.player.inventoryContainer.inventorySlots.get(i);
                final ItemStack craftingStack = craftingSlot.getStack();
                if (craftingStack.isEmpty() || craftingStack.getItem() == Items.AIR) {
                    outPut.add(i);
                }
            }
        }
        return outPut;
    }
    
    public static int findInventoryBlock(final Class clazz, final boolean offHand) {
        final AtomicInteger slot = new AtomicInteger();
        slot.set(-1);
        for (final Map.Entry<Integer, ItemStack> entry : getInventoryAndHotbarSlots().entrySet()) {
            if (isBlock(entry.getValue().getItem(), clazz)) {
                if (entry.getKey() == 45 && !offHand) {
                    continue;
                }
                slot.set(entry.getKey());
                return slot.get();
            }
        }
        return slot.get();
    }
    
    public static boolean isBlock(final Item item, final Class clazz) {
        if (item instanceof ItemBlock) {
            final Block block = ((ItemBlock)item).getBlock();
            return clazz.isInstance(block);
        }
        return false;
    }
    
    public static void confirmSlot(final int slot) {
        InventoryUtil.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
        InventoryUtil.mc.player.inventory.currentItem = slot;
        InventoryUtil.mc.playerController.updateController();
    }
    
    public static Map<Integer, ItemStack> getInventoryAndHotbarSlots() {
        return getInventorySlots(9, 44);
    }
    
    public static int findSkullSlot() {
        final int slot = -1;
        final List<ItemStack> mainInventory = (List<ItemStack>)InventoryUtil.mc.player.inventory.mainInventory;
        for (int i = 0; i < 9; ++i) {
            final ItemStack stack = mainInventory.get(i);
            if (stack != ItemStack.EMPTY && stack.getItem() instanceof ItemSkull) {
                return i;
            }
        }
        return slot;
    }
    
    public static Boolean findSkullSlot2(final int slot) {
        final List<ItemStack> mainInventory = (List<ItemStack>)InventoryUtil.mc.player.inventory.mainInventory;
        final ItemStack stack = mainInventory.get(slot);
        if (stack != ItemStack.EMPTY && stack.getItem() instanceof ItemSkull) {
            return true;
        }
        return false;
    }
    
    public static int findSkullSlot2() {
        final int slot = -1;
        final List<ItemStack> mainInventory = (List<ItemStack>)InventoryUtil.mc.player.inventory.mainInventory;
        for (int i = 0; i < 36; ++i) {
            final ItemStack stack = mainInventory.get(i);
            if (stack != ItemStack.EMPTY && stack.getItem() instanceof ItemSkull) {
                return i;
            }
        }
        return slot;
    }
    
    private static Map<Integer, ItemStack> getInventorySlots(final int currentI, final int last) {
        final HashMap<Integer, ItemStack> fullInventorySlots = new HashMap<Integer, ItemStack>();
        for (int current = currentI; current <= last; ++current) {
            fullInventorySlots.put(current, (ItemStack)InventoryUtil.mc.player.inventoryContainer.getInventory().get(current));
        }
        return fullInventorySlots;
    }
    
    public static boolean[] switchItem(final boolean back, final int lastHotbarSlot, final boolean switchedItem, final Switch mode, final Class clazz) {
        final boolean[] switchedItemSwitched = { switchedItem, false };
        switch (mode) {
            case NORMAL: {
                if (!back && !switchedItem) {
                    switchToHotbarSlot(findHotbarBlock(clazz), false);
                    switchedItemSwitched[0] = true;
                }
                else if (back && switchedItem) {
                    switchToHotbarSlot(lastHotbarSlot, false);
                    switchedItemSwitched[0] = false;
                }
                switchedItemSwitched[1] = true;
                break;
            }
            case SILENT: {
                if (!back && !switchedItem) {
                    switchToHotbarSlot(findHotbarBlock(clazz), true);
                    switchedItemSwitched[0] = true;
                }
                else if (back && switchedItem) {
                    switchedItemSwitched[0] = false;
                    Stay.inventoryManager.recoverSilent(lastHotbarSlot);
                }
                switchedItemSwitched[1] = true;
                break;
            }
            case NONE: {
                switchedItemSwitched[1] = (back || InventoryUtil.mc.player.inventory.currentItem == findHotbarBlock(clazz));
                break;
            }
        }
        return switchedItemSwitched;
    }
    
    public static boolean[] switchItemToItem(final boolean back, final int lastHotbarSlot, final boolean switchedItem, final Switch mode, final Item item) {
        final boolean[] switchedItemSwitched = { switchedItem, false };
        switch (mode) {
            case NORMAL: {
                if (!back && !switchedItem) {
                    switchToHotbarSlot(getItemHotbar(item), false);
                    switchedItemSwitched[0] = true;
                }
                else if (back && switchedItem) {
                    switchToHotbarSlot(lastHotbarSlot, false);
                    switchedItemSwitched[0] = false;
                }
                switchedItemSwitched[1] = true;
                break;
            }
            case SILENT: {
                if (!back && !switchedItem) {
                    switchToHotbarSlot(getItemHotbar(item), true);
                    switchedItemSwitched[0] = true;
                }
                else if (back && switchedItem) {
                    switchedItemSwitched[0] = false;
                    Stay.inventoryManager.recoverSilent(lastHotbarSlot);
                }
                switchedItemSwitched[1] = true;
                break;
            }
            case NONE: {
                switchedItemSwitched[1] = (back || InventoryUtil.mc.player.inventory.currentItem == getItemHotbar(item));
                break;
            }
        }
        return switchedItemSwitched;
    }
    
    public static boolean holdingItem(final Class clazz) {
        boolean result = false;
        final ItemStack stack = InventoryUtil.mc.player.getHeldItemMainhand();
        result = isInstanceOf(stack, clazz);
        if (!result) {
            final ItemStack offhand = InventoryUtil.mc.player.getHeldItemOffhand();
            result = isInstanceOf(stack, clazz);
        }
        return result;
    }
    
    public static boolean isInstanceOf(final ItemStack stack, final Class clazz) {
        if (stack == null) {
            return false;
        }
        final Item item = stack.getItem();
        if (clazz.isInstance(item)) {
            return true;
        }
        if (item instanceof ItemBlock) {
            final Block block = Block.getBlockFromItem(item);
            return clazz.isInstance(block);
        }
        return false;
    }
    
    public static int getEmptyXCarry() {
        for (int i = 1; i < 5; ++i) {
            final Slot craftingSlot = InventoryUtil.mc.player.inventoryContainer.inventorySlots.get(i);
            final ItemStack craftingStack = craftingSlot.getStack();
            if (craftingStack.isEmpty() || craftingStack.getItem() == Items.AIR) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean isSlotEmpty(final int i) {
        final Slot slot = InventoryUtil.mc.player.inventoryContainer.inventorySlots.get(i);
        final ItemStack stack = slot.getStack();
        return stack.isEmpty();
    }
    
    public static int convertHotbarToInv(final int input) {
        return 36 + input;
    }
    
    public static boolean areStacksCompatible(final ItemStack stack1, final ItemStack stack2) {
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
    
    public static EntityEquipmentSlot getEquipmentFromSlot(final int slot) {
        if (slot == 5) {
            return EntityEquipmentSlot.HEAD;
        }
        if (slot == 6) {
            return EntityEquipmentSlot.CHEST;
        }
        if (slot == 7) {
            return EntityEquipmentSlot.LEGS;
        }
        return EntityEquipmentSlot.FEET;
    }
    
    public static int pickItem(final int n) {
        final ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        for (int i = 0; i < 9; ++i) {
            if (Item.getIdFromItem(((ItemStack)InventoryUtil.mc.player.inventory.mainInventory.get(i)).getItem()) == n) {
                arrayList.add((ItemStack)InventoryUtil.mc.player.inventory.mainInventory.get(i));
            }
        }
        if (arrayList.size() >= 1) {
            return InventoryUtil.mc.player.inventory.mainInventory.indexOf((Object)arrayList.get(0));
        }
        return -1;
    }
    
    public static int getSlot() {
        return InventoryUtil.mc.player.inventory.currentItem;
    }
    
    public static int findArmorSlot(final EntityEquipmentSlot type, final boolean binding) {
        int slot = -1;
        float damage = 0.0f;
        for (int i = 9; i < 45; ++i) {
            final ItemStack s = Minecraft.getMinecraft().player.inventoryContainer.getSlot(i).getStack();
            if (s.getItem() != Items.AIR && s.getItem() instanceof ItemArmor) {
                final ItemArmor armor;
                if ((armor = (ItemArmor)s.getItem()).getEquipmentSlot() == type) {
                    final float currentDamage = (float)(armor.damageReduceAmount + EnchantmentHelper.getEnchantmentLevel(Enchantments.PROTECTION, s));
                    final boolean bl;
                    final boolean cursed = bl = (binding && EnchantmentHelper.hasBindingCurse(s));
                    if (currentDamage > damage) {
                        if (!cursed) {
                            damage = currentDamage;
                            slot = i;
                        }
                    }
                }
            }
        }
        return slot;
    }
    
    public static int findArmorSlot(final EntityEquipmentSlot type, final boolean binding, final boolean withXCarry) {
        int slot = findArmorSlot(type, binding);
        if (slot == -1 && withXCarry) {
            float damage = 0.0f;
            for (int i = 1; i < 5; ++i) {
                final Slot craftingSlot = InventoryUtil.mc.player.inventoryContainer.inventorySlots.get(i);
                final ItemStack craftingStack = craftingSlot.getStack();
                if (craftingStack.getItem() != Items.AIR && craftingStack.getItem() instanceof ItemArmor) {
                    final ItemArmor armor;
                    if ((armor = (ItemArmor)craftingStack.getItem()).getEquipmentSlot() == type) {
                        final float currentDamage = (float)(armor.damageReduceAmount + EnchantmentHelper.getEnchantmentLevel(Enchantments.PROTECTION, craftingStack));
                        final boolean bl;
                        final boolean cursed = bl = (binding && EnchantmentHelper.hasBindingCurse(craftingStack));
                        if (currentDamage > damage) {
                            if (!cursed) {
                                damage = currentDamage;
                                slot = i;
                            }
                        }
                    }
                }
            }
        }
        return slot;
    }
    
    public static int findItemInventorySlot(final Item item, final boolean offHand, final boolean withXCarry) {
        int slot = findItemInventorySlot(item, offHand);
        if (slot == -1 && withXCarry) {
            for (int i = 1; i < 5; ++i) {
                final Slot craftingSlot = InventoryUtil.mc.player.inventoryContainer.inventorySlots.get(i);
                final ItemStack craftingStack = craftingSlot.getStack();
                if (craftingStack.getItem() != Items.AIR) {
                    final Item craftingStackItem;
                    if ((craftingStackItem = craftingStack.getItem()) == item) {
                        slot = i;
                    }
                }
            }
        }
        return slot;
    }
    
    public static int findBlockSlotInventory(final Class clazz, final boolean offHand, final boolean withXCarry) {
        int slot = findInventoryBlock(clazz, offHand);
        if (slot == -1 && withXCarry) {
            for (int i = 1; i < 5; ++i) {
                final Slot craftingSlot = InventoryUtil.mc.player.inventoryContainer.inventorySlots.get(i);
                final ItemStack craftingStack = craftingSlot.getStack();
                if (craftingStack.getItem() != Items.AIR) {
                    final Item craftingStackItem = craftingStack.getItem();
                    if (clazz.isInstance(craftingStackItem)) {
                        slot = i;
                    }
                    else if (craftingStackItem instanceof ItemBlock) {
                        final Block block;
                        if (clazz.isInstance(block = ((ItemBlock)craftingStackItem).getBlock())) {
                            slot = i;
                        }
                    }
                }
            }
        }
        return slot;
    }
    
    public enum Switch
    {
        NORMAL, 
        SILENT, 
        NONE;
    }
    
    public static class Task
    {
        private final int slot;
        private final boolean update;
        private final boolean quickClick;
        
        public Task() {
            this.update = true;
            this.slot = -1;
            this.quickClick = false;
        }
        
        public Task(final int slot) {
            this.slot = slot;
            this.quickClick = false;
            this.update = false;
        }
        
        public Task(final int slot, final boolean quickClick) {
            this.slot = slot;
            this.quickClick = quickClick;
            this.update = false;
        }
        
        public void run() {
            if (this.update) {
                Util.mc.playerController.updateController();
            }
            if (this.slot != -1) {
                Util.mc.playerController.windowClick(0, this.slot, 0, this.quickClick ? ClickType.QUICK_MOVE : ClickType.PICKUP, (EntityPlayer)Util.mc.player);
            }
        }
        
        public boolean isSwitching() {
            return !this.update;
        }
    }
}
