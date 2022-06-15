//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.util.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.block.*;

public class AntiCevTrap extends Module
{
    public Setting<Boolean> rotate;
    public Setting<Boolean> packet;
    private float yaw;
    private float pitch;
    private boolean rotating;
    private boolean isSneaking;
    
    public AntiCevTrap() {
        super("AntiCev", "AntiCev", Category.COMBAT, true, false, false);
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.packet = (Setting<Boolean>)this.register(new Setting("Packet", (T)true));
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.rotating = false;
    }
    
    @Override
    public void onTick() {
        if (!fullNullCheck() && InventoryUtil.findHotbarBlock(BlockObsidian.class) != -1) {
            this.main();
        }
    }
    
    @Override
    public void onDisable() {
        this.rotating = false;
        this.isSneaking = EntityUtils.stopSneaking(this.isSneaking);
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (event.getStage() == 0 && this.rotate.getValue() && this.rotating && event.getPacket() instanceof CPacketPlayer) {
            final CPacketPlayer packet = (CPacketPlayer)event.getPacket();
            packet.yaw = this.yaw;
            packet.pitch = this.pitch;
            this.rotating = false;
        }
    }
    
    private void main() {
        final Vec3d a = AntiCevTrap.mc.player.getPositionVector();
        if (this.checkTrap(a, EntityUtils.getOffsets(2, false)) && this.checkTrap(a, EntityUtils.getVarOffsets(0, 2, 0)) && this.checkCrystal(a, EntityUtils.getVarOffsets(0, 3, 0)) != null) {
            final EntityPlayerSP player = AntiCevTrap.mc.player;
            ++player.motionY;
            if (this.packet.getValue()) {
                this.rotateTo(this.checkCrystal(a, EntityUtils.getVarOffsets(0, 3, 0)));
                EntityUtils.attackEntity(this.checkCrystal(a, EntityUtils.getVarOffsets(0, 3, 0)), true);
            }
            else {
                this.rotateTo(this.checkCrystal(a, EntityUtils.getVarOffsets(0, 3, 0)));
                EntityUtils.attackEntity(this.checkCrystal(a, EntityUtils.getVarOffsets(0, 3, 0)), false);
            }
            this.rotateToPos(a, EntityUtils.getVarOffsets(0, 3, 0));
            this.place(a, EntityUtils.getVarOffsets(0, 3, 0));
        }
    }
    
    private void rotateTo(final Entity entity) {
        if (this.rotate.getValue()) {
            final float[] angle = MathUtil.calcAngle(AntiCevTrap.mc.player.getPositionEyes(AntiCevTrap.mc.getRenderPartialTicks()), entity.getPositionVector());
            this.yaw = angle[0];
            this.pitch = angle[1];
            this.rotating = true;
        }
    }
    
    private void rotateToPos(final Vec3d pos, final Vec3d[] list) {
        if (this.rotate.getValue()) {
            final Vec3d[] var3 = list;
            for (int var4 = list.length, var5 = 0; var5 < var4; ++var5) {
                final Vec3d vec3d = var3[var5];
                final BlockPos position = new BlockPos(pos).add(vec3d.x, vec3d.y, vec3d.z);
                final float[] angle = MathUtil.calcAngle(AntiCevTrap.mc.player.getPositionEyes(AntiCevTrap.mc.getRenderPartialTicks()), new Vec3d((double)(position.getX() + 0.5f), (double)(position.getY() - 0.5f), (double)(position.getZ() + 0.5f)));
                this.yaw = angle[0];
                this.pitch = angle[1];
                this.rotating = true;
            }
        }
    }
    
    private void place(final Vec3d pos, final Vec3d[] list) {
        final Vec3d[] var3 = list;
        for (int var4 = list.length, var5 = 0; var5 < var4; ++var5) {
            final Vec3d vec3d = var3[var5];
            final BlockPos position = new BlockPos(pos).add(vec3d.x, vec3d.y, vec3d.z);
            final int a = AntiCevTrap.mc.player.inventory.currentItem;
            AntiCevTrap.mc.player.inventory.currentItem = InventoryUtil.findHotbarBlock(BlockObsidian.class);
            AntiCevTrap.mc.playerController.updateController();
            this.isSneaking = BlockUtil.placeBlock(position, EnumHand.MAIN_HAND, false, this.packet.getValue(), true);
            AntiCevTrap.mc.player.inventory.currentItem = a;
            AntiCevTrap.mc.playerController.updateController();
        }
    }
    
    Entity checkCrystal(final Vec3d pos, final Vec3d[] list) {
        Entity crystal = null;
        final Vec3d[] var4 = list;
        for (int var5 = list.length, var6 = 0; var6 < var5; ++var6) {
            final Vec3d vec3d = var4[var6];
            final BlockPos position = new BlockPos(pos).add(vec3d.x, vec3d.y, vec3d.z);
            for (final Entity entity : AntiCevTrap.mc.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(position))) {
                if (entity instanceof EntityEnderCrystal && crystal == null) {
                    crystal = entity;
                }
            }
        }
        return crystal;
    }
    
    private boolean checkTrap(final Vec3d pos, final Vec3d[] list) {
        final Vec3d[] var3 = list;
        for (int var4 = list.length, var5 = 0; var5 < var4; ++var5) {
            final Vec3d vec3d = var3[var5];
            final BlockPos position = new BlockPos(pos).add(vec3d.x, vec3d.y, vec3d.z);
            final Block block = EntityUtils.mc.world.getBlockState(position).getBlock();
            if (block == Blocks.OBSIDIAN) {
                return true;
            }
        }
        return false;
    }
}
