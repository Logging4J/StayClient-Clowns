//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.client.*;
import me.alpha432.stay.manager.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.init.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import java.util.concurrent.atomic.*;
import net.minecraft.item.*;
import java.util.*;

public class AutoTotem extends Module
{
    public Setting<Boolean> soft;
    public Setting<Boolean> pauseInContainers;
    public Setting<Boolean> pauseInInventory;
    private int numOfTotems;
    private int preferredTotemSlot;
    public static Minecraft mc;
    
    public AutoTotem() {
        super("AutoTotem", "AutoTotem", Category.COMBAT, true, false, false);
        this.soft = (Setting<Boolean>)this.register(new Setting("Soft", (T)true));
        this.pauseInContainers = (Setting<Boolean>)this.register(new Setting("PauseInInventory", (T)false));
        this.pauseInInventory = (Setting<Boolean>)this.register(new Setting("PauseInContainer", (T)false));
    }
    
    @Override
    public void onUpdate() {
        if (ModuleManager.getModuleByName("OffHandCrystal").isEnabled()) {
            this.soft.setValue(true);
        }
        if (AutoTotem.mc.player == null) {
            return;
        }
        if (!this.findTotems()) {
            return;
        }
        if (this.pauseInContainers.getValue() && AutoTotem.mc.currentScreen instanceof GuiContainer && !(AutoTotem.mc.currentScreen instanceof GuiInventory)) {
            return;
        }
        if (this.pauseInInventory.getValue() && AutoTotem.mc.currentScreen instanceof GuiInventory) {
            return;
        }
        if (this.soft.getValue()) {
            if (AutoTotem.mc.player.getHeldItemOffhand().getItem().equals(Items.AIR)) {
                AutoTotem.mc.playerController.windowClick(0, this.preferredTotemSlot, 0, ClickType.PICKUP, (EntityPlayer)AutoTotem.mc.player);
                AutoTotem.mc.playerController.windowClick(0, 45, 0, ClickType.PICKUP, (EntityPlayer)AutoTotem.mc.player);
                AutoTotem.mc.playerController.updateController();
            }
        }
        else if (!AutoTotem.mc.player.getHeldItemOffhand().getItem().equals(Items.TOTEM_OF_UNDYING)) {
            final boolean offhandEmptyPreSwitch = AutoTotem.mc.player.getHeldItemOffhand().getItem().equals(Items.AIR);
            AutoTotem.mc.playerController.windowClick(0, this.preferredTotemSlot, 0, ClickType.PICKUP, (EntityPlayer)AutoTotem.mc.player);
            AutoTotem.mc.playerController.windowClick(0, 45, 0, ClickType.PICKUP, (EntityPlayer)AutoTotem.mc.player);
            if (!offhandEmptyPreSwitch) {
                AutoTotem.mc.playerController.windowClick(0, this.preferredTotemSlot, 0, ClickType.PICKUP, (EntityPlayer)AutoTotem.mc.player);
            }
            AutoTotem.mc.playerController.updateController();
        }
    }
    
    private boolean findTotems() {
        this.numOfTotems = 0;
        final AtomicInteger preferredTotemSlotStackSize = new AtomicInteger();
        preferredTotemSlotStackSize.set(Integer.MIN_VALUE);
        int numOfTotemsInStack;
        final AtomicInteger atomicInteger;
        getInventoryAndHotbarSlots().forEach((slotKey, slotValue) -> {
            numOfTotemsInStack = 0;
            if (slotValue.getItem().equals(Items.TOTEM_OF_UNDYING)) {
                numOfTotemsInStack = slotValue.getCount();
                if (atomicInteger.get() < numOfTotemsInStack) {
                    atomicInteger.set(numOfTotemsInStack);
                    this.preferredTotemSlot = slotKey;
                }
            }
            this.numOfTotems += numOfTotemsInStack;
            return;
        });
        if (AutoTotem.mc.player.getHeldItemOffhand().getItem().equals(Items.TOTEM_OF_UNDYING)) {
            this.numOfTotems += AutoTotem.mc.player.getHeldItemOffhand().getCount();
        }
        return this.numOfTotems != 0;
    }
    
    private static Map<Integer, ItemStack> getInventoryAndHotbarSlots() {
        return getInventorySlots(9, 44);
    }
    
    private static Map<Integer, ItemStack> getInventorySlots(int current, final int last) {
        final Map<Integer, ItemStack> fullInventorySlots = new HashMap<Integer, ItemStack>();
        while (current <= last) {
            fullInventorySlots.put(current, (ItemStack)AutoTotem.mc.player.inventoryContainer.getInventory().get(current));
            ++current;
        }
        return fullInventorySlots;
    }
    
    static {
        AutoTotem.mc = Minecraft.getMinecraft();
    }
}
