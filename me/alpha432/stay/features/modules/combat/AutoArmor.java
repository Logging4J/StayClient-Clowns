//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.util.inventory.*;
import java.util.concurrent.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import me.alpha432.stay.features.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.gui.inventory.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.inventory.*;
import me.alpha432.stay.features.modules.player.*;
import me.alpha432.stay.client.*;
import net.minecraft.item.*;
import java.util.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.entity.player.*;

public class AutoArmor extends Module
{
    private final Setting<Integer> delay;
    private final Setting<Boolean> mendingTakeOff;
    private final Setting<Integer> closestEnemy;
    private final Setting<Integer> helmetThreshold;
    private final Setting<Integer> chestThreshold;
    private final Setting<Integer> legThreshold;
    private final Setting<Integer> bootsThreshold;
    private final Setting<Boolean> curse;
    private final Setting<Integer> actions;
    private final Setting<Bind> elytraBind;
    private final Setting<Boolean> tps;
    private final Setting<Boolean> updateController;
    private final Setting<Boolean> shiftClick;
    private final Timer timer;
    private final Timer elytraTimer;
    private final Queue<InventoryUtil.Task> taskList;
    private final List<Integer> doneSlots;
    private boolean elytraOn;
    
    public AutoArmor() {
        super("AutoArmor", "Puts Armor on for you.", Category.COMBAT, true, false, false);
        this.delay = (Setting<Integer>)this.register(new Setting("Delay", (T)50, (T)0, (T)500));
        this.mendingTakeOff = (Setting<Boolean>)this.register(new Setting("AutoMend", (T)false));
        this.closestEnemy = (Setting<Integer>)this.register(new Setting("Enemy", (T)8, (T)1, (T)20, v -> this.mendingTakeOff.getValue()));
        this.helmetThreshold = (Setting<Integer>)this.register(new Setting("Helmet%", (T)80, (T)1, (T)100, v -> this.mendingTakeOff.getValue()));
        this.chestThreshold = (Setting<Integer>)this.register(new Setting("Chest%", (T)80, (T)1, (T)100, v -> this.mendingTakeOff.getValue()));
        this.legThreshold = (Setting<Integer>)this.register(new Setting("Legs%", (T)80, (T)1, (T)100, v -> this.mendingTakeOff.getValue()));
        this.bootsThreshold = (Setting<Integer>)this.register(new Setting("Boots%", (T)80, (T)1, (T)100, v -> this.mendingTakeOff.getValue()));
        this.curse = (Setting<Boolean>)this.register(new Setting("CurseOfBinding", (T)false));
        this.actions = (Setting<Integer>)this.register(new Setting("Actions", (T)3, (T)1, (T)12));
        this.elytraBind = (Setting<Bind>)this.register(new Setting("Elytra", (T)new Bind(-1)));
        this.tps = (Setting<Boolean>)this.register(new Setting("TpsSync", (T)true));
        this.updateController = (Setting<Boolean>)this.register(new Setting("Update", (T)true));
        this.shiftClick = (Setting<Boolean>)this.register(new Setting("ShiftClick", (T)false));
        this.timer = new Timer();
        this.elytraTimer = new Timer();
        this.taskList = new ConcurrentLinkedQueue<InventoryUtil.Task>();
        this.doneSlots = new ArrayList<Integer>();
        this.elytraOn = false;
    }
    
    @SubscribeEvent
    public void onKeyInput(final InputEvent.KeyInputEvent event) {
        if (Keyboard.getEventKeyState() && !(AutoArmor.mc.currentScreen instanceof StayGui) && this.elytraBind.getValue().getKey() == Keyboard.getEventKey()) {
            this.elytraOn = !this.elytraOn;
        }
    }
    
    @Override
    public void onLogin() {
        this.timer.reset();
        this.elytraTimer.reset();
    }
    
    @Override
    public void onDisable() {
        this.taskList.clear();
        this.doneSlots.clear();
        this.elytraOn = false;
    }
    
    @Override
    public void onLogout() {
        this.taskList.clear();
        this.doneSlots.clear();
    }
    
    @Override
    public void onTick() {
        if (fullNullCheck() || (AutoArmor.mc.currentScreen instanceof GuiContainer && !(AutoArmor.mc.currentScreen instanceof GuiInventory))) {
            return;
        }
        if (this.taskList.isEmpty()) {
            if (this.mendingTakeOff.getValue() && InventoryUtil.holdingItem(ItemExpBottle.class) && AutoArmor.mc.gameSettings.keyBindUseItem.isKeyDown() && (this.isSafe() || EntityUtils.isSafe((Entity)AutoArmor.mc.player, 1, false, true))) {
                final ItemStack helm = AutoArmor.mc.player.inventoryContainer.getSlot(5).getStack();
                final int helmDamage;
                if (!helm.isEmpty && (helmDamage = DamageUtil.getRoundedDamage(helm)) >= this.helmetThreshold.getValue()) {
                    this.takeOffSlot(5);
                }
                final ItemStack chest2 = AutoArmor.mc.player.inventoryContainer.getSlot(6).getStack();
                final int chestDamage;
                if (!chest2.isEmpty && (chestDamage = DamageUtil.getRoundedDamage(chest2)) >= this.chestThreshold.getValue()) {
                    this.takeOffSlot(6);
                }
                final ItemStack legging2 = AutoArmor.mc.player.inventoryContainer.getSlot(7).getStack();
                final int leggingDamage;
                if (!legging2.isEmpty && (leggingDamage = DamageUtil.getRoundedDamage(legging2)) >= this.legThreshold.getValue()) {
                    this.takeOffSlot(7);
                }
                final ItemStack feet2 = AutoArmor.mc.player.inventoryContainer.getSlot(8).getStack();
                final int bootDamage;
                if (!feet2.isEmpty && (bootDamage = DamageUtil.getRoundedDamage(feet2)) >= this.bootsThreshold.getValue()) {
                    this.takeOffSlot(8);
                }
                return;
            }
            final ItemStack helm2 = AutoArmor.mc.player.inventoryContainer.getSlot(5).getStack();
            final int slot4;
            if (helm2.getItem() == Items.AIR && (slot4 = InventoryUtil.findArmorSlot(EntityEquipmentSlot.HEAD, this.curse.getValue(), XCarry.getInstance().isOn())) != -1) {
                this.getSlotOn(5, slot4);
            }
            final ItemStack chest3;
            if ((chest3 = AutoArmor.mc.player.inventoryContainer.getSlot(6).getStack()).getItem() == Items.AIR) {
                if (this.taskList.isEmpty()) {
                    if (this.elytraOn && this.elytraTimer.passedMs(500L)) {
                        final int elytraSlot = InventoryUtil.findItemInventorySlot(Items.ELYTRA, false, XCarry.getInstance().isOn());
                        if (elytraSlot != -1) {
                            if ((elytraSlot < 5 && elytraSlot > 1) || !this.shiftClick.getValue()) {
                                this.taskList.add(new InventoryUtil.Task(elytraSlot));
                                this.taskList.add(new InventoryUtil.Task(6));
                            }
                            else {
                                this.taskList.add(new InventoryUtil.Task(elytraSlot, true));
                            }
                            if (this.updateController.getValue()) {
                                this.taskList.add(new InventoryUtil.Task());
                            }
                            this.elytraTimer.reset();
                        }
                    }
                    else {
                        final int slot5;
                        if (!this.elytraOn && (slot5 = InventoryUtil.findArmorSlot(EntityEquipmentSlot.CHEST, this.curse.getValue(), XCarry.getInstance().isOn())) != -1) {
                            this.getSlotOn(6, slot5);
                        }
                    }
                }
            }
            else if (this.elytraOn && chest3.getItem() != Items.ELYTRA && this.elytraTimer.passedMs(500L)) {
                if (this.taskList.isEmpty()) {
                    final int slot5 = InventoryUtil.findItemInventorySlot(Items.ELYTRA, false, XCarry.getInstance().isOn());
                    if (slot5 != -1) {
                        this.taskList.add(new InventoryUtil.Task(slot5));
                        this.taskList.add(new InventoryUtil.Task(6));
                        this.taskList.add(new InventoryUtil.Task(slot5));
                        if (this.updateController.getValue()) {
                            this.taskList.add(new InventoryUtil.Task());
                        }
                    }
                    this.elytraTimer.reset();
                }
            }
            else if (!this.elytraOn && chest3.getItem() == Items.ELYTRA && this.elytraTimer.passedMs(500L) && this.taskList.isEmpty()) {
                int slot5 = InventoryUtil.findItemInventorySlot((Item)Items.DIAMOND_CHESTPLATE, false, XCarry.getInstance().isOn());
                if (slot5 == -1 && (slot5 = InventoryUtil.findItemInventorySlot((Item)Items.IRON_CHESTPLATE, false, XCarry.getInstance().isOn())) == -1 && (slot5 = InventoryUtil.findItemInventorySlot((Item)Items.GOLDEN_CHESTPLATE, false, XCarry.getInstance().isOn())) == -1 && (slot5 = InventoryUtil.findItemInventorySlot((Item)Items.CHAINMAIL_CHESTPLATE, false, XCarry.getInstance().isOn())) == -1) {
                    slot5 = InventoryUtil.findItemInventorySlot((Item)Items.LEATHER_CHESTPLATE, false, XCarry.getInstance().isOn());
                }
                if (slot5 != -1) {
                    this.taskList.add(new InventoryUtil.Task(slot5));
                    this.taskList.add(new InventoryUtil.Task(6));
                    this.taskList.add(new InventoryUtil.Task(slot5));
                    if (this.updateController.getValue()) {
                        this.taskList.add(new InventoryUtil.Task());
                    }
                }
                this.elytraTimer.reset();
            }
            final ItemStack legging3;
            final int slot6;
            if ((legging3 = AutoArmor.mc.player.inventoryContainer.getSlot(7).getStack()).getItem() == Items.AIR && (slot6 = InventoryUtil.findArmorSlot(EntityEquipmentSlot.LEGS, this.curse.getValue(), XCarry.getInstance().isOn())) != -1) {
                this.getSlotOn(7, slot6);
            }
            final ItemStack feet3;
            final int slot7;
            if ((feet3 = AutoArmor.mc.player.inventoryContainer.getSlot(8).getStack()).getItem() == Items.AIR && (slot7 = InventoryUtil.findArmorSlot(EntityEquipmentSlot.FEET, this.curse.getValue(), XCarry.getInstance().isOn())) != -1) {
                this.getSlotOn(8, slot7);
            }
        }
        if (this.timer.passedMs((int)(this.delay.getValue() * (this.tps.getValue() ? Stay.serverManager.getTpsFactor() : 1.0f)))) {
            if (!this.taskList.isEmpty()) {
                for (int i = 0; i < this.actions.getValue(); ++i) {
                    final InventoryUtil.Task task = this.taskList.poll();
                    if (task != null) {
                        task.run();
                    }
                }
            }
            this.timer.reset();
        }
    }
    
    @Override
    public String getDisplayInfo() {
        if (this.elytraOn) {
            return "Elytra";
        }
        return null;
    }
    
    private void takeOffSlot(final int slot) {
        if (this.taskList.isEmpty()) {
            int target = -1;
            for (final int i : InventoryUtil.findEmptySlots(XCarry.getInstance().isOn())) {
                if (this.doneSlots.contains(target)) {
                    continue;
                }
                target = i;
                this.doneSlots.add(i);
            }
            if (target != -1) {
                if ((target < 5 && target > 0) || !this.shiftClick.getValue()) {
                    this.taskList.add(new InventoryUtil.Task(slot));
                    this.taskList.add(new InventoryUtil.Task(target));
                }
                else {
                    this.taskList.add(new InventoryUtil.Task(slot, true));
                }
                if (this.updateController.getValue()) {
                    this.taskList.add(new InventoryUtil.Task());
                }
            }
        }
    }
    
    private void getSlotOn(final int slot, final int target) {
        if (this.taskList.isEmpty()) {
            this.doneSlots.remove((Object)target);
            if ((target < 5 && target > 0) || !this.shiftClick.getValue()) {
                this.taskList.add(new InventoryUtil.Task(target));
                this.taskList.add(new InventoryUtil.Task(slot));
            }
            else {
                this.taskList.add(new InventoryUtil.Task(target, true));
            }
            if (this.updateController.getValue()) {
                this.taskList.add(new InventoryUtil.Task());
            }
        }
    }
    
    private boolean isSafe() {
        final EntityPlayer closest = EntityUtils.getClosestEnemy(this.closestEnemy.getValue());
        return closest == null || AutoArmor.mc.player.getDistanceSq((Entity)closest) >= MathUtil.square(this.closestEnemy.getValue());
    }
}
