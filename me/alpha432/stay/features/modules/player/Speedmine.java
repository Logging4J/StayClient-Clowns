//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.player;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.client.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraft.init.*;
import me.alpha432.stay.features.modules.combat.*;
import net.minecraft.item.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Speedmine extends Module
{
    private static Speedmine INSTANCE;
    private final Timer timer;
    public Setting<Mode> mode;
    public Setting<Float> damage;
    public Setting<Boolean> webSwitch;
    public Setting<Boolean> doubleBreak;
    public Setting<Boolean> autosw;
    public Setting<Boolean> render;
    public Setting<Boolean> box;
    private final Setting<Integer> boxAlpha;
    public Setting<Boolean> outline;
    private final Setting<Float> lineWidth;
    public BlockPos currentPos;
    public IBlockState currentBlockState;
    private int lasthotbarslot;
    
    public Speedmine() {
        super("SpeedMine", "Speeds up mining.", Module.Category.PLAYER, true, false, false);
        this.timer = new Timer();
        this.mode = (Setting<Mode>)this.register(new Setting("Mode", (T)Mode.PACKET));
        this.damage = (Setting<Float>)this.register(new Setting("Damage", (T)0.7f, (T)0.0f, (T)1.0f, v -> this.mode.getValue() == Mode.DAMAGE));
        this.webSwitch = (Setting<Boolean>)this.register(new Setting("WebSwitch", (T)false));
        this.doubleBreak = (Setting<Boolean>)this.register(new Setting("DoubleBreak", (T)false));
        this.autosw = (Setting<Boolean>)this.register(new Setting("AutoSwitch", (T)false));
        this.render = (Setting<Boolean>)this.register(new Setting("Render", (T)false));
        this.box = (Setting<Boolean>)this.register(new Setting("Box", (T)false, v -> this.render.getValue()));
        this.boxAlpha = (Setting<Integer>)this.register(new Setting("BoxAlpha", (T)85, (T)0, (T)255, v -> this.box.getValue() && this.render.getValue()));
        this.outline = (Setting<Boolean>)this.register(new Setting("Outline", (T)true, v -> this.render.getValue()));
        this.lineWidth = (Setting<Float>)this.register(new Setting("Width", (T)1.0f, (T)0.1f, (T)5.0f, v -> this.outline.getValue() && this.render.getValue()));
        this.setInstance();
    }
    
    public static Speedmine getInstance() {
        if (Speedmine.INSTANCE == null) {
            Speedmine.INSTANCE = new Speedmine();
        }
        return Speedmine.INSTANCE;
    }
    
    private void setInstance() {
        Speedmine.INSTANCE = this;
    }
    
    public void onTick() {
        if (this.currentPos != null) {
            if (!Speedmine.mc.world.getBlockState(this.currentPos).equals(this.currentBlockState) || Speedmine.mc.world.getBlockState(this.currentPos).getBlock() == Blocks.AIR) {
                this.currentPos = null;
                this.currentBlockState = null;
            }
            else if (this.webSwitch.getValue() && this.currentBlockState.getBlock() == Blocks.WEB && Speedmine.mc.player.getHeldItemMainhand().getItem() instanceof ItemPickaxe) {
                InventoryUtil.switchToHotbarSlot(ItemSword.class, false);
            }
        }
    }
    
    public void onUpdate() {
        if (fullNullCheck()) {
            return;
        }
        Speedmine.mc.playerController.blockHitDelay = 0;
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (this.render.getValue() && this.currentPos != null && this.currentBlockState.getBlock() == Blocks.OBSIDIAN) {
            final Color color = new Color(this.timer.passedMs((int)(2000.0f * Stay.serverManager.getTpsFactor())) ? 0 : 255, this.timer.passedMs((int)(2000.0f * Stay.serverManager.getTpsFactor())) ? 255 : 0, 0, 255);
            RenderUtil.drawBoxESP(this.currentPos, color, false, color, this.lineWidth.getValue(), this.outline.getValue(), this.box.getValue(), this.boxAlpha.getValue(), false);
            if (this.autosw.getValue()) {
                boolean hasPickaxe = Speedmine.mc.player.getHeldItemMainhand().getItem() == Items.DIAMOND_PICKAXE;
                if (!hasPickaxe) {
                    for (int i = 0; i < 9; ++i) {
                        final ItemStack stack = Speedmine.mc.player.inventory.getStackInSlot(i);
                        if (!stack.isEmpty()) {
                            this.lasthotbarslot = Surround.mc.player.inventory.currentItem;
                            if (Speedmine.mc.player.inventory.currentItem != this.lasthotbarslot) {
                                this.lasthotbarslot = Speedmine.mc.player.inventory.currentItem;
                            }
                            if (stack.getItem() == Items.DIAMOND_PICKAXE) {
                                hasPickaxe = true;
                                Speedmine.mc.player.inventory.currentItem = i;
                                Speedmine.mc.playerController.updateController();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    
    @SubscribeEvent
    public void onBlockEvent(final BlockEvent event) {
        if (fullNullCheck()) {
            return;
        }
        if (event.getStage() == 3 && Speedmine.mc.playerController.curBlockDamageMP > 0.1f) {
            Speedmine.mc.playerController.isHittingBlock = true;
        }
        if (event.getStage() == 4) {
            if (BlockUtil.canBreak(event.getPos())) {
                Speedmine.mc.playerController.isHittingBlock = false;
                switch (this.mode.getValue()) {
                    case PACKET: {
                        if (this.currentPos == null) {
                            this.currentPos = event.getPos();
                            this.currentBlockState = Speedmine.mc.world.getBlockState(this.currentPos);
                            this.timer.reset();
                        }
                        Speedmine.mc.player.swingArm(EnumHand.MAIN_HAND);
                        Speedmine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, event.getPos(), event.getFacing()));
                        Speedmine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, event.getPos(), event.getFacing()));
                        event.setCanceled(true);
                        break;
                    }
                    case DAMAGE: {
                        if (Speedmine.mc.playerController.curBlockDamageMP < this.damage.getValue()) {
                            break;
                        }
                        Speedmine.mc.playerController.curBlockDamageMP = 1.0f;
                        break;
                    }
                    case INSTANT: {
                        Speedmine.mc.player.swingArm(EnumHand.MAIN_HAND);
                        Speedmine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, event.getPos(), event.getFacing()));
                        Speedmine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, event.getPos(), event.getFacing()));
                        Speedmine.mc.playerController.onPlayerDestroyBlock(event.getPos());
                        Speedmine.mc.world.setBlockToAir(event.getPos());
                        break;
                    }
                }
            }
            final BlockPos above;
            if (this.doubleBreak.getValue() && BlockUtil.canBreak(above = event.getPos().add(0, 1, 0)) && Speedmine.mc.player.getDistance((double)above.getX(), (double)above.getY(), (double)above.getZ()) <= 5.0) {
                Speedmine.mc.player.swingArm(EnumHand.MAIN_HAND);
                Speedmine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, above, event.getFacing()));
                Speedmine.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, above, event.getFacing()));
                Speedmine.mc.playerController.onPlayerDestroyBlock(above);
                Speedmine.mc.world.setBlockToAir(above);
            }
        }
    }
    
    public String getDisplayInfo() {
        return this.mode.currentEnumName();
    }
    
    static {
        Speedmine.INSTANCE = new Speedmine();
    }
    
    public enum Mode
    {
        PACKET, 
        DAMAGE, 
        INSTANT;
    }
}
