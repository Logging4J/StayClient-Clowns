//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.block.*;
import java.util.*;
import me.alpha432.stay.util.graphics.animations.*;
import me.alpha432.stay.features.modules.combat.*;
import me.alpha432.stay.client.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.graphics.color.*;
import me.alpha432.stay.util.graphics.opengl.*;
import java.awt.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.*;

public class InstantMine extends Module
{
    private final Timer breakSuccess;
    private static InstantMine INSTANCE;
    private final Setting<Boolean> creativeMode;
    private final Setting<Boolean> ghostHand;
    public Setting<Boolean> fuck;
    private final Setting<Boolean> render;
    private final Setting<Integer> redBefore;
    private final Setting<Integer> greenBefore;
    private final Setting<Integer> blueBefore;
    private final Setting<Integer> alphaBefore;
    private final Setting<Integer> redAfter;
    private final Setting<Integer> greenAfter;
    private final Setting<Integer> blueAfter;
    private final Setting<Integer> alphaAfter;
    private final List<Block> godBlocks;
    private boolean cancelStart;
    private boolean empty;
    private EnumFacing facing;
    public static BlockPos breakPos;
    double manxi;
    AnimationFlag animationFlag;
    public final Timer imerS;
    long times;
    
    public InstantMine() {
        super("InstantMineOld", "InstantMine", Category.MISC, true, false, false);
        this.breakSuccess = new Timer();
        this.creativeMode = (Setting<Boolean>)this.register(new Setting("CreativeMode", (T)true));
        this.ghostHand = (Setting<Boolean>)this.register(new Setting("GhostHand", (T)Boolean.TRUE, v -> this.creativeMode.getValue()));
        this.fuck = (Setting<Boolean>)this.register(new Setting("Super ghost hand", (T)Boolean.TRUE, v -> this.ghostHand.getValue()));
        this.render = (Setting<Boolean>)this.register(new Setting("Render", (T)true));
        this.redBefore = (Setting<Integer>)this.register(new Setting("RedBefore", (T)255, (T)0, (T)255, v -> this.render.getValue()));
        this.greenBefore = (Setting<Integer>)this.register(new Setting("GreenBefore", (T)0, (T)0, (T)255, v -> this.render.getValue()));
        this.blueBefore = (Setting<Integer>)this.register(new Setting("BlueBefore", (T)44, (T)0, (T)255, v -> this.render.getValue()));
        this.alphaBefore = (Setting<Integer>)this.register(new Setting("AlphaBefore", (T)127, (T)0, (T)255, v -> this.render.getValue()));
        this.redAfter = (Setting<Integer>)this.register(new Setting("RedAfter", (T)0, (T)0, (T)255, v -> this.render.getValue()));
        this.greenAfter = (Setting<Integer>)this.register(new Setting("GreenAfter", (T)255, (T)0, (T)255, v -> this.render.getValue()));
        this.blueAfter = (Setting<Integer>)this.register(new Setting("BlueAfter", (T)44, (T)0, (T)255, v -> this.render.getValue()));
        this.alphaAfter = (Setting<Integer>)this.register(new Setting("AlphaAfter", (T)127, (T)0, (T)255, v -> this.render.getValue()));
        this.godBlocks = Arrays.asList(Blocks.AIR, (Block)Blocks.FLOWING_LAVA, (Block)Blocks.LAVA, (Block)Blocks.FLOWING_WATER, (Block)Blocks.WATER, Blocks.BEDROCK);
        this.cancelStart = false;
        this.empty = false;
        this.manxi = 0.0;
        this.animationFlag = new AnimationFlag(Easing.OUT_QUINT, 5000.0f);
        this.imerS = new Timer();
        this.times = 0L;
        this.setInstance();
    }
    
    public static InstantMine getInstance() {
        if (InstantMine.INSTANCE != null) {
            return InstantMine.INSTANCE;
        }
        return InstantMine.INSTANCE = new InstantMine();
    }
    
    private void setInstance() {
        InstantMine.INSTANCE = this;
    }
    
    @Override
    public void onUpdate() {
        if (fullNullCheck()) {
            return;
        }
        if (Stay.moduleManager.getModuleT(AutoCev.class).isEnabled()) {
            return;
        }
        if (!this.creativeMode.getValue()) {
            return;
        }
        if (!this.cancelStart) {
            return;
        }
        if (InventoryUtil.getItemHotbars(Items.DIAMOND_PICKAXE) == -1) {
            return;
        }
        if (this.godBlocks.contains(InstantMine.mc.world.getBlockState(InstantMine.breakPos).getBlock())) {
            return;
        }
        if (!this.ghostHand.getValue() || (!this.fuck.getValue() && InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE) == -1) || InventoryUtil.getItemHotbars(Items.DIAMOND_PICKAXE) == -1) {
            InstantMine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, InstantMine.breakPos, this.facing));
            return;
        }
        final int slotMain = InstantMine.mc.player.inventory.currentItem;
        if (InstantMine.mc.world.getBlockState(InstantMine.breakPos).getBlock() == Blocks.OBSIDIAN) {
            if (!this.breakSuccess.passedMs(1234L)) {
                return;
            }
            if (this.fuck.getValue() && InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE) == -1) {
                for (int i = 9; i < 36; ++i) {
                    if (InstantMine.mc.player.inventory.getStackInSlot(i).getItem() == Items.DIAMOND_PICKAXE) {
                        InstantMine.mc.playerController.windowClick(InstantMine.mc.player.inventoryContainer.windowId, i, InstantMine.mc.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)InstantMine.mc.player);
                        InstantMine.mc.playerController.updateController();
                        InstantMine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, InstantMine.breakPos, this.facing));
                        InstantMine.mc.playerController.windowClick(InstantMine.mc.player.inventoryContainer.windowId, i, InstantMine.mc.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)InstantMine.mc.player);
                        InstantMine.mc.playerController.updateController();
                        return;
                    }
                }
                return;
            }
            InstantMine.mc.player.inventory.currentItem = InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE);
            InstantMine.mc.playerController.updateController();
            InstantMine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, InstantMine.breakPos, this.facing));
            InstantMine.mc.player.inventory.currentItem = slotMain;
            InstantMine.mc.playerController.updateController();
        }
        else {
            if (this.fuck.getValue() && InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE) == -1) {
                for (int i = 9; i < 35; ++i) {
                    if (InstantMine.mc.player.inventory.getStackInSlot(i).getItem() == Items.DIAMOND_PICKAXE) {
                        InstantMine.mc.playerController.windowClick(InstantMine.mc.player.inventoryContainer.windowId, i, InstantMine.mc.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)InstantMine.mc.player);
                        InstantMine.mc.playerController.updateController();
                        InstantMine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, InstantMine.breakPos, this.facing));
                        InstantMine.mc.playerController.windowClick(InstantMine.mc.player.inventoryContainer.windowId, i, InstantMine.mc.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)InstantMine.mc.player);
                        InstantMine.mc.playerController.updateController();
                        return;
                    }
                }
                return;
            }
            InstantMine.mc.player.inventory.currentItem = InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE);
            InstantMine.mc.playerController.updateController();
            InstantMine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, InstantMine.breakPos, this.facing));
            InstantMine.mc.player.inventory.currentItem = slotMain;
            InstantMine.mc.playerController.updateController();
        }
    }
    
    @Override
    public void onRender3D(final Render3DEvent event) {
        if (fullNullCheck()) {
            return;
        }
        if (this.render.getValue() && this.creativeMode.getValue() && this.cancelStart) {
            if (this.godBlocks.contains(InstantMine.mc.world.getBlockState(InstantMine.breakPos).getBlock())) {
                this.empty = true;
            }
            if (this.imerS.passedMs(11L)) {
                if (this.manxi <= 10.0) {
                    this.manxi = this.animationFlag.getAndUpdate(11.0f);
                }
                this.imerS.reset();
            }
            final AxisAlignedBB axisAlignedBB = InstantMine.mc.world.getBlockState(InstantMine.breakPos).getSelectedBoundingBox((World)InstantMine.mc.world, InstantMine.breakPos);
            final double centerX = axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) / 2.0;
            final double centerY = axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) / 2.0;
            final double centerZ = axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) / 2.0;
            final double progressValX = this.manxi * ((axisAlignedBB.maxX - centerX) / 10.0);
            final double progressValY = this.manxi * ((axisAlignedBB.maxY - centerY) / 10.0);
            final double progressValZ = this.manxi * ((axisAlignedBB.maxZ - centerZ) / 10.0);
            final AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(centerX - progressValX, centerY - progressValY, centerZ - progressValZ, centerX + progressValX, centerY + progressValY, centerZ + progressValZ);
            if (this.empty) {
                RenderUtil.drawBBBox(axisAlignedBB2, new Colour(this.redAfter.getValue(), this.greenAfter.getValue(), this.blueAfter.getValue(), this.alphaAfter.getValue()), this.alphaAfter.getValue());
            }
            else {
                RenderUtil.drawBBBox(axisAlignedBB2, new Colour(this.redBefore.getValue(), this.greenBefore.getValue(), this.blueBefore.getValue(), this.alphaBefore.getValue()), this.alphaBefore.getValue());
            }
            return;
        }
        if (!this.cancelStart) {
            return;
        }
        if (!this.render.getValue()) {
            return;
        }
        RenderUtil.drawBoxESP(InstantMine.breakPos, new Color(236, 235, 235), false, new Color(248, 248, 248, 148), 1.0f, true, true, 84, false);
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (fullNullCheck()) {
            return;
        }
        if (!(event.getPacket() instanceof CPacketPlayerDigging)) {
            return;
        }
        final CPacketPlayerDigging packet = (CPacketPlayerDigging)event.getPacket();
        if (packet.getAction() != CPacketPlayerDigging.Action.START_DESTROY_BLOCK) {
            return;
        }
        event.setCanceled(this.cancelStart);
    }
    
    @SubscribeEvent
    public void onBlockEvent(final PlayerDamageBlockEvent event) {
        if (fullNullCheck()) {
            return;
        }
        if (!BlockUtil.canBreak(event.getPos())) {
            return;
        }
        if (InstantMine.breakPos != null && InstantMine.breakPos.getX() == event.getPos().getX() && InstantMine.breakPos.getY() == event.getPos().getY() && InstantMine.breakPos.getZ() == event.getPos().getZ()) {
            return;
        }
        this.animationFlag.forceUpdate(0.0f, 0.0f);
        this.manxi = 0.0;
        this.empty = false;
        this.cancelStart = false;
        InstantMine.breakPos = event.getPos();
        this.breakSuccess.reset();
        this.facing = event.getFacing();
        if (InstantMine.breakPos == null) {
            return;
        }
        InstantMine.mc.player.swingArm(EnumHand.MAIN_HAND);
        InstantMine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, InstantMine.breakPos, this.facing));
        this.cancelStart = true;
        InstantMine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, InstantMine.breakPos, this.facing));
        event.setCanceled(true);
    }
    
    @Override
    public String getDisplayInfo() {
        if (!this.ghostHand.getValue()) {
            return "Normal";
        }
        return "Ghost";
    }
    
    static {
        InstantMine.INSTANCE = new InstantMine();
    }
}
