//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import java.util.concurrent.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.entity.*;
import me.alpha432.stay.client.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.lwjgl.input.*;
import java.util.function.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.inventory.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.item.*;
import net.minecraft.block.*;

public class Offhand extends Module
{
    private static Offhand instance;
    private final Queue<InventoryUtil.Task> taskList;
    private final Timer timer;
    private final Timer secondTimer;
    public Setting<Boolean> crystal;
    public Setting<Float> crystalHealth;
    public Setting<Float> crystalHoleHealth;
    public Setting<Boolean> gapple;
    public Setting<Boolean> armorCheck;
    public Setting<Boolean> Anti32k;
    public Setting<Float> Anti32khp;
    public Setting<Integer> actions;
    public Mode2 currentMode;
    public int totems;
    public int crystals;
    public int gapples;
    public int lastTotemSlot;
    public int lastGappleSlot;
    public int lastCrystalSlot;
    public int lastObbySlot;
    public int lastWebSlot;
    public boolean holdingCrystal;
    public boolean holdingTotem;
    public boolean holdingGapple;
    public boolean didSwitchThisTick;
    private boolean second;
    private boolean switchedForHealthReason;
    private Boolean cuican;
    boolean moving;
    boolean returnI;
    
    public Offhand() {
        super("Offhand", "Allows you to switch up your Offhand.", Category.COMBAT, true, false, false);
        this.taskList = new ConcurrentLinkedQueue<InventoryUtil.Task>();
        this.timer = new Timer();
        this.secondTimer = new Timer();
        this.crystal = (Setting<Boolean>)this.register(new Setting("Crystal", (T)true));
        this.crystalHealth = (Setting<Float>)this.register(new Setting("CrystalHP", (T)13.0f, (T)0.1f, (T)36.0f));
        this.crystalHoleHealth = (Setting<Float>)this.register(new Setting("CrystalHoleHP", (T)3.5f, (T)0.1f, (T)36.0f));
        this.gapple = (Setting<Boolean>)this.register(new Setting("Gapple", (T)true));
        this.armorCheck = (Setting<Boolean>)this.register(new Setting("ArmorCheck", (T)true));
        this.Anti32k = (Setting<Boolean>)this.register(new Setting("Anti32k", (T)true));
        this.Anti32khp = (Setting<Float>)this.register(new Setting("Anti32kHP", (T)25.0f, (T)0.1f, (T)36.0f, v -> this.Anti32k.getValue()));
        this.actions = (Setting<Integer>)this.register(new Setting("Packets", (T)4, (T)1, (T)4));
        this.currentMode = Mode2.TOTEMS;
        this.totems = 0;
        this.crystals = 0;
        this.gapples = 0;
        this.lastTotemSlot = -1;
        this.lastGappleSlot = -1;
        this.lastCrystalSlot = -1;
        this.lastObbySlot = -1;
        this.lastWebSlot = -1;
        this.holdingCrystal = false;
        this.holdingTotem = false;
        this.holdingGapple = false;
        this.didSwitchThisTick = false;
        this.second = false;
        this.switchedForHealthReason = false;
        this.moving = false;
        this.returnI = false;
        Offhand.instance = this;
    }
    
    public static Offhand getInstance() {
        if (Offhand.instance == null) {
            Offhand.instance = new Offhand();
        }
        return Offhand.instance;
    }
    
    private EntityPlayer getTarget(final double range, final boolean trapped) {
        EntityPlayer target = null;
        double distance = Math.pow(range, 2.0) + 1.0;
        for (final EntityPlayer player : Offhand.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range) && (!trapped || !EntityUtils.isTrapped(player, false, false, false, false, false))) {
                if (Stay.speedManager.getPlayerSpeed(player) > 10.0) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = Offhand.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (Offhand.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = Offhand.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
    
    @SubscribeEvent
    public void onUpdateWalkingPlayer(final ProcessRightClickBlockEvent event) {
        if (event.getHand() == EnumHand.MAIN_HAND && event.getStack().getItem() == Items.END_CRYSTAL && Offhand.mc.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE && Offhand.mc.objectMouseOver != null && event.getPos() == Offhand.mc.objectMouseOver.getBlockPos()) {
            event.setCanceled(true);
            Offhand.mc.player.setActiveHand(EnumHand.OFF_HAND);
            Offhand.mc.playerController.processRightClick((EntityPlayer)Offhand.mc.player, (World)Offhand.mc.world, EnumHand.OFF_HAND);
        }
    }
    
    @Override
    public void onUpdate() {
        if (Offhand.mc.currentScreen instanceof GuiContainer) {
            return;
        }
        if (this.timer.passedMs(50L)) {
            if (Offhand.mc.player != null && Offhand.mc.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE && Offhand.mc.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL && Mouse.isButtonDown(1)) {
                Offhand.mc.player.setActiveHand(EnumHand.OFF_HAND);
                Offhand.mc.gameSettings.keyBindUseItem.pressed = Mouse.isButtonDown(1);
            }
        }
        else if (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE && Offhand.mc.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) {
            Offhand.mc.gameSettings.keyBindUseItem.pressed = false;
        }
        if (nullCheck()) {
            return;
        }
        if (this.Anti32k.getValue()) {
            final EntityPlayer IS = this.getTarget(15.0, true);
            if (EntityUtils.getHealth((Entity)Offhand.mc.player, true) <= this.Anti32khp.getValue() && IS != null && IS.getHeldItem(EnumHand.MAIN_HAND).getItem() == Items.DIAMOND_SWORD) {
                final String nbt = IS.getHeldItem(EnumHand.MAIN_HAND).serializeNBT().copy().toString();
                if (nbt.indexOf("AttributeModifiers:[{UUIDMost:2345838571545327294L,UUIDLeast:-1985342459327194118L,Amount:32767,AttributeName") != -1) {
                    this.fck();
                    return;
                }
            }
        }
        this.doOffhand();
        if (this.secondTimer.passedMs(50L) && this.second) {
            this.second = false;
            this.timer.reset();
        }
    }
    
    public void fck() {
        this.totems = Offhand.mc.player.inventory.mainInventory.stream().filter(itemStack -> itemStack.getItem() == Items.TOTEM_OF_UNDYING).mapToInt(ItemStack::getCount).sum();
        if (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.TOTEM_OF_UNDYING) {
            ++this.totems;
        }
        else if (Offhand.mc.player.inventory.getItemStack().isEmpty()) {
            if (this.totems == 0) {
                return;
            }
            int t = -1;
            for (int i = 0; i < 45; ++i) {
                if (Offhand.mc.player.inventory.getStackInSlot(i).getItem() == Items.TOTEM_OF_UNDYING) {
                    t = i;
                    break;
                }
            }
            if (t == -1) {
                return;
            }
            this.setMode(Mode2.TOTEMS);
            this.lastTotemSlot = InventoryUtil.findItemInventorySlot(Items.TOTEM_OF_UNDYING, false);
            final int lastSlot = this.getLastSlot(Offhand.mc.player.getHeldItemOffhand().getItem(), this.lastTotemSlot);
            this.putItemInOffhand(this.lastTotemSlot, lastSlot);
        }
        if (this.returnI) {
            int t = -1;
            for (int i = 0; i < 45; ++i) {
                if (Offhand.mc.player.inventory.getStackInSlot(i).isEmpty) {
                    t = i;
                    break;
                }
            }
            if (t == -1) {
                return;
            }
            Offhand.mc.playerController.windowClick(0, (t < 9) ? (t + 36) : t, 0, ClickType.PICKUP, (EntityPlayer)Offhand.mc.player);
            this.returnI = false;
        }
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (!fullNullCheck() && Offhand.mc.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE && Offhand.mc.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL && Offhand.mc.gameSettings.keyBindUseItem.isKeyDown()) {
            if (event.getPacket() instanceof CPacketPlayerTryUseItemOnBlock) {
                final CPacketPlayerTryUseItemOnBlock packet2 = (CPacketPlayerTryUseItemOnBlock)event.getPacket();
                if (packet2.getHand() == EnumHand.MAIN_HAND) {
                    if (this.timer.passedMs(50L)) {
                        Offhand.mc.player.setActiveHand(EnumHand.OFF_HAND);
                        Offhand.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
                    }
                    event.setCanceled(true);
                }
            }
            else {
                final CPacketPlayerTryUseItem packet3;
                if (event.getPacket() instanceof CPacketPlayerTryUseItem && (packet3 = (CPacketPlayerTryUseItem)event.getPacket()).getHand() == EnumHand.OFF_HAND && !this.timer.passedMs(50L)) {
                    event.setCanceled(true);
                }
            }
        }
    }
    
    @Override
    public String getDisplayInfo() {
        if (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) {
            return "Crystal";
        }
        if (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.TOTEM_OF_UNDYING) {
            return "Totem";
        }
        if (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE) {
            return "Gapple";
        }
        return null;
    }
    
    public void doOffhand() {
        this.didSwitchThisTick = false;
        this.holdingCrystal = (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL);
        this.holdingTotem = (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.TOTEM_OF_UNDYING);
        this.holdingGapple = (Offhand.mc.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE);
        this.totems = Offhand.mc.player.inventory.mainInventory.stream().filter(itemStack -> itemStack.getItem() == Items.TOTEM_OF_UNDYING).mapToInt(ItemStack::getCount).sum();
        if (this.holdingTotem) {
            this.totems += Offhand.mc.player.inventory.offHandInventory.stream().filter(itemStack -> itemStack.getItem() == Items.TOTEM_OF_UNDYING).mapToInt(ItemStack::getCount).sum();
        }
        this.crystals = Offhand.mc.player.inventory.mainInventory.stream().filter(itemStack -> itemStack.getItem() == Items.END_CRYSTAL).mapToInt(ItemStack::getCount).sum();
        if (this.holdingCrystal) {
            this.crystals += Offhand.mc.player.inventory.offHandInventory.stream().filter(itemStack -> itemStack.getItem() == Items.END_CRYSTAL).mapToInt(ItemStack::getCount).sum();
        }
        this.gapples = Offhand.mc.player.inventory.mainInventory.stream().filter(itemStack -> itemStack.getItem() == Items.GOLDEN_APPLE).mapToInt(ItemStack::getCount).sum();
        if (this.holdingGapple) {
            this.gapples += Offhand.mc.player.inventory.offHandInventory.stream().filter(itemStack -> itemStack.getItem() == Items.GOLDEN_APPLE).mapToInt(ItemStack::getCount).sum();
        }
        this.doSwitch();
    }
    
    public void doSwitch() {
        this.currentMode = Mode2.TOTEMS;
        if (this.gapple.getValue() && Offhand.mc.player.getHeldItemMainhand().getItem() instanceof ItemSword && Offhand.mc.gameSettings.keyBindUseItem.isKeyDown()) {
            this.currentMode = Mode2.GAPPLES;
        }
        else if (this.currentMode != Mode2.CRYSTALS && this.crystal.getValue() && ((EntityUtils.isSafe((Entity)Offhand.mc.player) && EntityUtils.getHealth((Entity)Offhand.mc.player, true) > this.crystalHoleHealth.getValue()) || EntityUtils.getHealth((Entity)Offhand.mc.player, true) > this.crystalHealth.getValue())) {
            this.currentMode = Mode2.CRYSTALS;
        }
        if (this.currentMode == Mode2.CRYSTALS && this.crystals == 0) {
            this.setMode(Mode2.TOTEMS);
        }
        if (this.currentMode == Mode2.CRYSTALS && ((!EntityUtils.isSafe((Entity)Offhand.mc.player) && EntityUtils.getHealth((Entity)Offhand.mc.player, true) <= this.crystalHealth.getValue()) || EntityUtils.getHealth((Entity)Offhand.mc.player, true) <= this.crystalHoleHealth.getValue())) {
            if (this.currentMode == Mode2.CRYSTALS) {
                this.switchedForHealthReason = true;
            }
            this.setMode(Mode2.TOTEMS);
        }
        if (this.switchedForHealthReason && ((EntityUtils.isSafe((Entity)Offhand.mc.player) && EntityUtils.getHealth((Entity)Offhand.mc.player, true) > this.crystalHoleHealth.getValue()) || EntityUtils.getHealth((Entity)Offhand.mc.player, true) > this.crystalHealth.getValue())) {
            this.setMode(Mode2.CRYSTALS);
            this.switchedForHealthReason = false;
        }
        if (this.currentMode == Mode2.CRYSTALS && this.armorCheck.getValue() && (Offhand.mc.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == Items.AIR || Offhand.mc.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == Items.AIR || Offhand.mc.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == Items.AIR || Offhand.mc.player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == Items.AIR)) {
            this.setMode(Mode2.TOTEMS);
        }
        if (Offhand.mc.currentScreen instanceof GuiContainer && !(Offhand.mc.currentScreen instanceof GuiInventory)) {
            return;
        }
        final Item currentOffhandItem = Offhand.mc.player.getHeldItemOffhand().getItem();
        switch (this.currentMode) {
            case TOTEMS: {
                if (this.totems <= 0) {
                    break;
                }
                if (this.holdingTotem) {
                    break;
                }
                this.lastTotemSlot = InventoryUtil.findItemInventorySlot(Items.TOTEM_OF_UNDYING, false);
                final int lastSlot = this.getLastSlot(currentOffhandItem, this.lastTotemSlot);
                this.putItemInOffhand(this.lastTotemSlot, lastSlot);
                break;
            }
            case GAPPLES: {
                if (this.gapples <= 0) {
                    break;
                }
                if (this.holdingGapple) {
                    break;
                }
                this.lastGappleSlot = InventoryUtil.findItemInventorySlot(Items.GOLDEN_APPLE, false);
                final int lastSlot = this.getLastSlot(currentOffhandItem, this.lastGappleSlot);
                this.putItemInOffhand(this.lastGappleSlot, lastSlot);
                break;
            }
            default: {
                if (this.crystals <= 0) {
                    break;
                }
                if (this.holdingCrystal) {
                    break;
                }
                this.lastCrystalSlot = InventoryUtil.findItemInventorySlot(Items.END_CRYSTAL, false);
                final int lastSlot = this.getLastSlot(currentOffhandItem, this.lastCrystalSlot);
                this.putItemInOffhand(this.lastCrystalSlot, lastSlot);
                break;
            }
        }
        for (int i = 0; i < this.actions.getValue(); ++i) {
            final InventoryUtil.Task task = this.taskList.poll();
            if (task != null) {
                task.run();
                if (task.isSwitching()) {
                    this.didSwitchThisTick = true;
                }
            }
        }
    }
    
    private int getLastSlot(final Item item, final int slotIn) {
        if (item == Items.END_CRYSTAL) {
            return this.lastCrystalSlot;
        }
        if (item == Items.GOLDEN_APPLE) {
            return this.lastGappleSlot;
        }
        if (item == Items.TOTEM_OF_UNDYING) {
            return this.lastTotemSlot;
        }
        if (InventoryUtil.isBlock(item, BlockObsidian.class)) {
            return this.lastObbySlot;
        }
        if (InventoryUtil.isBlock(item, BlockWeb.class)) {
            return this.lastWebSlot;
        }
        if (item == Items.AIR) {
            return -1;
        }
        return slotIn;
    }
    
    private void putItemInOffhand(final int slotIn, final int slotOut) {
        if (slotIn != -1 && this.taskList.isEmpty()) {
            this.taskList.add(new InventoryUtil.Task(slotIn));
            this.taskList.add(new InventoryUtil.Task(45));
            this.taskList.add(new InventoryUtil.Task(slotOut));
            this.taskList.add(new InventoryUtil.Task());
        }
    }
    
    public void setMode(final Mode2 mode) {
        this.currentMode = ((this.currentMode == mode) ? Mode2.TOTEMS : mode);
    }
    
    public enum Mode2
    {
        TOTEMS, 
        GAPPLES, 
        CRYSTALS;
    }
}
