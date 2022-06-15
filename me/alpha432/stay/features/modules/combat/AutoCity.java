//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.manager.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.features.modules.misc.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.entity.*;
import java.util.*;

public class AutoCity extends Module
{
    private final Setting<Boolean> disable;
    public EntityPlayer target;
    
    public AutoCity() {
        super("AutoCity", "AutoCity", Category.COMBAT, false, false, false);
        this.disable = (Setting<Boolean>)this.register(new Setting("AutoDisable", (T)true));
    }
    
    @Override
    public void onTick() {
        if (fullNullCheck()) {
            return;
        }
        if (Objects.requireNonNull(ModuleManager.getModuleByName("AutoCev")).isEnabled()) {
            return;
        }
        if (this.disable.getValue()) {
            this.disable();
        }
        if (InventoryUtil.getItemHotbar(Items.DIAMOND_PICKAXE) == -1) {
            return;
        }
        this.target = this.getTarget(6.0);
        this.surroundMine();
    }
    
    @Override
    public String getDisplayInfo() {
        if (this.target == null) {
            return null;
        }
        return this.target.getName();
    }
    
    private void surroundMine() {
        if (this.target == null) {
            return;
        }
        final Vec3d a = this.target.getPositionVector();
        if (EntityUtils.getSurroundWeakness(a, 1, -1)) {
            this.surroundMine(a, -1.0, 0.0, 0.0);
            return;
        }
        if (EntityUtils.getSurroundWeakness(a, 2, -1)) {
            this.surroundMine(a, 1.0, 0.0, 0.0);
            return;
        }
        if (EntityUtils.getSurroundWeakness(a, 3, -1)) {
            this.surroundMine(a, 0.0, 0.0, -1.0);
            return;
        }
        if (EntityUtils.getSurroundWeakness(a, 4, -1)) {
            this.surroundMine(a, 0.0, 0.0, 1.0);
            return;
        }
        if (EntityUtils.getSurroundWeakness(a, 5, -1)) {
            this.surroundMine(a, -1.0, 0.0, 0.0);
            return;
        }
        if (EntityUtils.getSurroundWeakness(a, 6, -1)) {
            this.surroundMine(a, 1.0, 0.0, 0.0);
            return;
        }
        if (EntityUtils.getSurroundWeakness(a, 7, -1)) {
            this.surroundMine(a, 0.0, 0.0, -1.0);
            return;
        }
        if (!EntityUtils.getSurroundWeakness(a, 8, -1)) {
            return;
        }
        this.surroundMine(a, 0.0, 0.0, 1.0);
    }
    
    private void surroundMine(final Vec3d pos, final double x, final double y, final double z) {
        final BlockPos position = new BlockPos(pos).add(x, y, z);
        if (InstantMine.getInstance().isOff()) {
            InstantMine.getInstance().enable();
            return;
        }
        if (!InstantMine.getInstance().isOn()) {
            return;
        }
        if (InstantMine.breakPos != null) {
            if (InstantMine.breakPos.equals((Object)position)) {
                return;
            }
            if (InstantMine.breakPos.equals((Object)new BlockPos(this.target.posX, this.target.posY, this.target.posZ)) && AutoCity.mc.world.getBlockState(new BlockPos(this.target.posX, this.target.posY, this.target.posZ)).getBlock() != Blocks.AIR) {
                return;
            }
        }
        AutoCity.mc.playerController.onPlayerDamageBlock(position, BlockUtil.getRayTraceFacing(position));
    }
    
    private EntityPlayer getTarget(final double range) {
        EntityPlayer target = null;
        double distance = range;
        for (final EntityPlayer player : AutoCity.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range)) {
                if (!EntityUtils.isInHole((Entity)player)) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = AutoCity.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (AutoCity.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = AutoCity.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
}
