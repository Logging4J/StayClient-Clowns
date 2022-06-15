//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.item.*;
import me.alpha432.stay.features.command.*;
import java.util.*;
import net.minecraft.block.*;
import net.minecraft.item.*;

public class AutoCev extends Module
{
    private final Setting<Double> range;
    private final Setting<Boolean> autoToggle;
    Entity currentEntity;
    boolean flag;
    int progress;
    int sleep;
    int civCounter;
    boolean breakFlag;
    private BlockPos breakPos;
    
    public AutoCev() {
        super("AutoCev", "AutoCev", Category.COMBAT, true, false, false);
        this.range = (Setting<Double>)this.register(new Setting("Range", (T)4.9, (T)0.0, (T)6.0));
        this.autoToggle = (Setting<Boolean>)this.register(new Setting("AutoToggle", (T)true));
        this.progress = 0;
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
    }
    
    private int findItem(final Item item) {
        if (item == Items.END_CRYSTAL && AutoCev.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) {
            return 999;
        }
        for (int i = 0; i < 9; ++i) {
            if (AutoCev.mc.player.inventory.getStackInSlot(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void onEnable() {
        this.findTarget();
        this.progress = 0;
        this.breakFlag = false;
        this.flag = false;
        this.civCounter = 0;
        this.sleep = 0;
        super.onEnable();
    }
    
    @Override
    public void onTick() {
        final int n = this.findItem(Items.DIAMOND_PICKAXE);
        final int n2 = this.findItem(Items.END_CRYSTAL);
        final int n3 = this.findMaterials(Blocks.OBSIDIAN);
        final BlockPos[] objectArray = { new BlockPos(0, 0, 1), new BlockPos(0, 1, 1), new BlockPos(0, 2, 1), new BlockPos(0, 2, 0) };
        final int n4 = InventoryUtil.getSlot();
        if (n != -1 && n2 != -1 && n3 != -1) {
            if (this.currentEntity == null || this.currentEntity.getDistance((Entity)AutoCev.mc.player) > this.range.getValue()) {
                this.findTarget();
            }
            if (this.currentEntity != null) {
                if (this.currentEntity.isDead) {
                    this.disable();
                    return;
                }
                final Entity entity = this.currentEntity;
                Stay.targetManager.updateTarget((EntityLivingBase)entity);
                if (entity instanceof EntityPlayer && !Stay.friendManager.isFriend(entity.getName())) {
                    if (this.sleep > 0) {
                        --this.sleep;
                    }
                    else {
                        entity.move(MoverType.SELF, 0.0, -2.0, 0.0);
                        switch (this.progress) {
                            case 0: {
                                final BlockPos blockPos = new BlockPos(entity);
                                final BlockPos[] var16 = objectArray;
                                for (int var17 = objectArray.length, var18 = 0; var18 < var17; ++var18) {
                                    final BlockPos blockPos2 = var16[var18];
                                    if (Arrays.asList(objectArray).indexOf(blockPos2) != -1 && this.civCounter < 1) {
                                        this.flag = true;
                                        InventoryUtil.setSlot(n3);
                                    }
                                    else {
                                        InventoryUtil.setSlot(n3);
                                    }
                                    final BlockUtils blockUtils = BlockUtils.isPlaceable(blockPos.add((Vec3i)blockPos2), 0.0, true);
                                    if (blockUtils != null) {
                                        blockUtils.doPlace(true);
                                    }
                                }
                                InventoryUtil.setSlot(n2);
                                CrystalUtil.placeCrystal(new BlockPos(entity.posX, entity.posY + 3.0, entity.posZ));
                                ++this.progress;
                                break;
                            }
                            case 1: {
                                InventoryUtil.setSlot(n);
                                AutoCev.mc.playerController.onPlayerDamageBlock(new BlockPos(entity).add(0, 2, 0), EnumFacing.UP);
                                AutoCev.mc.getConnection().sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, new BlockPos(entity).add(0, 2, 0), EnumFacing.UP));
                                if (AutoCev.mc.world.isAirBlock(new BlockPos(entity).add(0, 2, 0))) {
                                    for (final Entity entity2 : AutoCev.mc.world.loadedEntityList) {
                                        if (entity.getDistance(entity2) <= this.range.getValue() && entity2 instanceof EntityEnderCrystal) {
                                            AutoCev.mc.playerController.attackEntity((EntityPlayer)AutoCev.mc.player, entity2);
                                        }
                                    }
                                    this.breakFlag = true;
                                }
                                if (this.civCounter < 1) {
                                    AutoCev.mc.playerController.onPlayerDamageBlock(new BlockPos(entity).add(0, 2, 0), EnumFacing.UP);
                                    this.sleep += 30;
                                }
                                ++this.progress;
                                break;
                            }
                            case 2: {
                                int n5 = 0;
                                for (final Entity entity3 : AutoCev.mc.world.loadedEntityList) {
                                    if (entity.getDistance(entity3) <= this.range.getValue() && entity3 instanceof EntityEnderCrystal) {
                                        AutoCev.mc.playerController.attackEntity((EntityPlayer)AutoCev.mc.player, entity3);
                                        ++n5;
                                    }
                                }
                                if (n5 == 0 || this.flag) {
                                    ++this.progress;
                                    break;
                                }
                                break;
                            }
                            case 3: {
                                BlockUtils.doPlace(BlockUtils.isPlaceable(new BlockPos(entity.posX, entity.posY + 2.0, entity.posZ), 0.0, true), true);
                                InventoryUtil.setSlot(n3);
                                this.progress = 0;
                                ++this.civCounter;
                                break;
                            }
                        }
                    }
                    InventoryUtil.setSlot(n4);
                    return;
                }
                InventoryUtil.setSlot(n4);
            }
        }
        else {
            Command.sendMessage("Pix or Crystal or Obsidian No Material");
            this.disable();
        }
    }
    
    private int findMaterials(final Block block) {
        for (int i = 0; i < 9; ++i) {
            if (AutoCev.mc.player.inventory.getStackInSlot(i).getItem() instanceof ItemBlock && ((ItemBlock)AutoCev.mc.player.inventory.getStackInSlot(i).getItem()).getBlock() == block) {
                return i;
            }
        }
        return -1;
    }
    
    public void findTarget() {
        this.currentEntity = (Entity)AutoCev.mc.world.loadedEntityList.stream().filter(entity -> entity != AutoCev.mc.player && entity instanceof EntityLivingBase && entity.getDistance((Entity)AutoCev.mc.player) < this.range.getValue() && !Stay.friendManager.isFriend(entity.getName())).findFirst().orElse(null);
    }
}
