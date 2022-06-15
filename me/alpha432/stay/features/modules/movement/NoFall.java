//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.client.gui.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.server.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.basement.wrapper.*;
import me.alpha432.stay.features.command.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.network.play.client.*;

public class NoFall extends Module
{
    private static final Timer bypassTimer;
    private static int ogslot;
    private final Setting<Mode> mode;
    private final Setting<Integer> distance;
    private final Setting<Boolean> glide;
    private final Setting<Boolean> silent;
    private final Setting<Boolean> bypass;
    private final Timer timer;
    private boolean equipped;
    private boolean gotElytra;
    private State currentState;
    
    public NoFall() {
        super("NoFall", "Prevents fall damage.", Module.Category.MOVEMENT, true, false, false);
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.PACKET));
        this.distance = (Setting<Integer>)this.register(new Setting("Distance", (T)15, (T)0, (T)50, v -> this.mode.getValue() == Mode.BUCKET));
        this.glide = (Setting<Boolean>)this.register(new Setting("Glide", (T)false, v -> this.mode.getValue() == Mode.ELYTRA));
        this.silent = (Setting<Boolean>)this.register(new Setting("Silent", (T)true, v -> this.mode.getValue() == Mode.ELYTRA));
        this.bypass = (Setting<Boolean>)this.register(new Setting("Bypass", (T)false, v -> this.mode.getValue() == Mode.ELYTRA));
        this.timer = new Timer();
        this.equipped = false;
        this.gotElytra = false;
        this.currentState = State.FALL_CHECK;
    }
    
    public void onEnable() {
        NoFall.ogslot = -1;
        this.currentState = State.FALL_CHECK;
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (fullNullCheck()) {
            return;
        }
        if (NoFall.mc.currentScreen instanceof GuiHopper) {
            return;
        }
        if (this.mode.getValue() == Mode.ELYTRA) {
            if (this.bypass.getValue()) {
                this.currentState = this.currentState.onSend(event);
            }
            else if (!this.equipped && event.getPacket() instanceof CPacketPlayer && NoFall.mc.player.fallDistance >= 3.0f) {
                RayTraceResult result = null;
                if (!this.glide.getValue()) {
                    result = NoFall.mc.world.rayTraceBlocks(NoFall.mc.player.getPositionVector(), NoFall.mc.player.getPositionVector().add(0.0, -3.0, 0.0), true, true, false);
                }
                if (this.glide.getValue() || (result != null && result.typeOfHit == RayTraceResult.Type.BLOCK)) {
                    if (NoFall.mc.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)) {
                        NoFall.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)NoFall.mc.player, CPacketEntityAction.Action.START_FALL_FLYING));
                    }
                    else if (this.silent.getValue()) {
                        final int slot = InventoryUtil.getItemHotbar(Items.ELYTRA);
                        if (slot != -1) {
                            NoFall.mc.playerController.windowClick(NoFall.mc.player.inventoryContainer.windowId, 6, slot, ClickType.SWAP, (EntityPlayer)NoFall.mc.player);
                            NoFall.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)NoFall.mc.player, CPacketEntityAction.Action.START_FALL_FLYING));
                        }
                        NoFall.ogslot = slot;
                        this.equipped = true;
                    }
                }
            }
        }
        if (this.mode.getValue() == Mode.PACKET && event.getPacket() instanceof CPacketPlayer) {
            final CPacketPlayer packet = (CPacketPlayer)event.getPacket();
            packet.onGround = true;
        }
    }
    
    @SubscribeEvent
    public void onPacketReceive(final PacketEvent.Receive event) {
        if (fullNullCheck()) {
            return;
        }
        if ((this.equipped || this.bypass.getValue()) && this.mode.getValue() == Mode.ELYTRA && (event.getPacket() instanceof SPacketWindowItems || event.getPacket() instanceof SPacketSetSlot)) {
            if (this.bypass.getValue()) {
                this.currentState = this.currentState.onReceive(event);
            }
            else {
                this.gotElytra = true;
            }
        }
    }
    
    public void onUpdate() {
        if (fullNullCheck()) {
            return;
        }
        if (this.mode.getValue() == Mode.ELYTRA) {
            if (this.bypass.getValue()) {
                this.currentState = this.currentState.onUpdate();
            }
            else if (this.silent.getValue() && this.equipped && this.gotElytra) {
                NoFall.mc.playerController.windowClick(NoFall.mc.player.inventoryContainer.windowId, 6, NoFall.ogslot, ClickType.SWAP, (EntityPlayer)NoFall.mc.player);
                NoFall.mc.playerController.updateController();
                this.equipped = false;
                this.gotElytra = false;
            }
            else {
                final int slot;
                if (this.silent.getValue() && InventoryUtil.getItemHotbar(Items.ELYTRA) == -1 && (slot = InventoryUtil.findStackInventory(Items.ELYTRA)) != -1 && NoFall.ogslot != -1) {
                    System.out.println(String.format("Moving %d to hotbar %d", slot, NoFall.ogslot));
                    NoFall.mc.playerController.windowClick(NoFall.mc.player.inventoryContainer.windowId, slot, NoFall.ogslot, ClickType.SWAP, (EntityPlayer)NoFall.mc.player);
                    NoFall.mc.playerController.updateController();
                }
            }
        }
    }
    
    public void onTick() {
        if (fullNullCheck()) {
            return;
        }
        final Vec3d posVec;
        final RayTraceResult result;
        if (this.mode.getValue() == Mode.BUCKET && NoFall.mc.player.fallDistance >= this.distance.getValue() && !EntityUtils.isAboveWater((Entity)NoFall.mc.player) && this.timer.passedMs(100L) && (result = NoFall.mc.world.rayTraceBlocks(posVec = NoFall.mc.player.getPositionVector(), posVec.add(0.0, -5.329999923706055, 0.0), true, true, false)) != null && result.typeOfHit == RayTraceResult.Type.BLOCK) {
            EnumHand hand = EnumHand.MAIN_HAND;
            if (NoFall.mc.player.getHeldItemOffhand().getItem() == Items.WATER_BUCKET) {
                hand = EnumHand.OFF_HAND;
            }
            else if (NoFall.mc.player.getHeldItemMainhand().getItem() != Items.WATER_BUCKET) {
                for (int i = 0; i < 9; ++i) {
                    if (NoFall.mc.player.inventory.getStackInSlot(i).getItem() == Items.WATER_BUCKET) {
                        NoFall.mc.player.inventory.currentItem = i;
                        NoFall.mc.player.rotationPitch = 90.0f;
                        this.timer.reset();
                        return;
                    }
                }
                return;
            }
            NoFall.mc.player.rotationPitch = 90.0f;
            NoFall.mc.playerController.processRightClick((EntityPlayer)NoFall.mc.player, (World)NoFall.mc.world, hand);
            this.timer.reset();
        }
    }
    
    public String getDisplayInfo() {
        return this.mode.currentEnumName();
    }
    
    static {
        bypassTimer = new Timer();
        NoFall.ogslot = -1;
    }
    
    public enum State
    {
        FALL_CHECK {
            @Override
            public State onSend(final PacketEvent.Send event) {
                final RayTraceResult result = Util.mc.world.rayTraceBlocks(Util.mc.player.getPositionVector(), Util.mc.player.getPositionVector().add(0.0, -3.0, 0.0), true, true, false);
                if (!(event.getPacket() instanceof CPacketPlayer) || Util.mc.player.fallDistance < 3.0f || result == null || result.typeOfHit != RayTraceResult.Type.BLOCK) {
                    return this;
                }
                final int slot = InventoryUtil.getItemHotbar(Items.ELYTRA);
                if (slot != -1) {
                    Util.mc.playerController.windowClick(Util.mc.player.inventoryContainer.windowId, 6, slot, ClickType.SWAP, (EntityPlayer)Util.mc.player);
                    NoFall.ogslot = slot;
                    Util.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Util.mc.player, CPacketEntityAction.Action.START_FALL_FLYING));
                    return NoFall$State$1.WAIT_FOR_ELYTRA_DEQUIP;
                }
                return this;
            }
        }, 
        WAIT_FOR_ELYTRA_DEQUIP {
            @Override
            public State onReceive(final PacketEvent.Receive event) {
                if (event.getPacket() instanceof SPacketWindowItems || event.getPacket() instanceof SPacketSetSlot) {
                    return NoFall$State$2.REEQUIP_ELYTRA;
                }
                return this;
            }
        }, 
        REEQUIP_ELYTRA {
            @Override
            public State onUpdate() {
                Util.mc.playerController.windowClick(Util.mc.player.inventoryContainer.windowId, 6, NoFall.ogslot, ClickType.SWAP, (EntityPlayer)Util.mc.player);
                Util.mc.playerController.updateController();
                final int slot = InventoryUtil.findStackInventory(Items.ELYTRA, true);
                if (slot == -1) {
                    Command.sendMessage("§cElytra not found after regain?");
                    return NoFall$State$3.WAIT_FOR_NEXT_REQUIP;
                }
                Util.mc.playerController.windowClick(Util.mc.player.inventoryContainer.windowId, slot, NoFall.ogslot, ClickType.SWAP, (EntityPlayer)Util.mc.player);
                Util.mc.playerController.updateController();
                NoFall.bypassTimer.reset();
                return NoFall$State$3.RESET_TIME;
            }
        }, 
        WAIT_FOR_NEXT_REQUIP {
            @Override
            public State onUpdate() {
                if (NoFall.bypassTimer.passedMs(250L)) {
                    return NoFall$State$4.REEQUIP_ELYTRA;
                }
                return this;
            }
        }, 
        RESET_TIME {
            @Override
            public State onUpdate() {
                if (Util.mc.player.onGround || NoFall.bypassTimer.passedMs(250L)) {
                    Util.mc.player.connection.sendPacket((Packet)new CPacketClickWindow(0, 0, 0, ClickType.PICKUP, new ItemStack(Blocks.BEDROCK), (short)1337));
                    return NoFall$State$5.FALL_CHECK;
                }
                return this;
            }
        };
        
        public State onSend(final PacketEvent.Send e) {
            return this;
        }
        
        public State onReceive(final PacketEvent.Receive e) {
            return this;
        }
        
        public State onUpdate() {
            return this;
        }
    }
    
    public enum Mode
    {
        PACKET, 
        BUCKET, 
        ELYTRA;
    }
}
