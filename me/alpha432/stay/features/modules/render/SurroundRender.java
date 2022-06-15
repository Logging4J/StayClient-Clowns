//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.init.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.opengl.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import java.util.*;

public class SurroundRender extends Module
{
    public EntityPlayer target;
    private final Setting<Integer> range;
    
    public SurroundRender() {
        super("CityESP", "CityESP", Module.Category.VISUAL, true, false, false);
        this.range = (Setting<Integer>)this.register(new Setting("Range", (T)5, (T)1, (T)10));
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (fullNullCheck()) {
            return;
        }
        this.target = this.getTarget(this.range.getValue());
        this.surroundRender();
    }
    
    private void surroundRender() {
        if (this.target == null) {
            return;
        }
        final Vec3d a = this.target.getPositionVector();
        if (SurroundRender.mc.world.getBlockState(new BlockPos(a)).getBlock() == Blocks.OBSIDIAN || SurroundRender.mc.world.getBlockState(new BlockPos(a)).getBlock() == Blocks.ENDER_CHEST) {
            RenderUtil.drawBoxESP(new BlockPos(a), new Color(255, 255, 0), false, new Color(255, 255, 0), 1.0f, false, true, 42, true);
        }
        if (EntityUtils.getSurroundWeakness(a, -1, 1)) {
            this.surroundRender(a, -1.0, 0.0, 0.0, true);
        }
        if (EntityUtils.getSurroundWeakness(a, -1, 2)) {
            this.surroundRender(a, 1.0, 0.0, 0.0, true);
        }
        if (EntityUtils.getSurroundWeakness(a, -1, 3)) {
            this.surroundRender(a, 0.0, 0.0, -1.0, true);
        }
        if (EntityUtils.getSurroundWeakness(a, -1, 4)) {
            this.surroundRender(a, 0.0, 0.0, 1.0, true);
        }
        if (EntityUtils.getSurroundWeakness(a, -1, 5)) {
            this.surroundRender(a, -1.0, 0.0, 0.0, false);
        }
        if (EntityUtils.getSurroundWeakness(a, -1, 6)) {
            this.surroundRender(a, 1.0, 0.0, 0.0, false);
        }
        if (EntityUtils.getSurroundWeakness(a, -1, 7)) {
            this.surroundRender(a, 0.0, 0.0, -1.0, false);
        }
        if (!EntityUtils.getSurroundWeakness(a, -1, 8)) {
            return;
        }
        this.surroundRender(a, 0.0, 0.0, 1.0, false);
    }
    
    private void surroundRender(final Vec3d pos, final double x, final double y, final double z, final boolean red) {
        final BlockPos position = new BlockPos(pos).add(x, y, z);
        if (SurroundRender.mc.world.getBlockState(position).getBlock() == Blocks.AIR) {
            return;
        }
        if (SurroundRender.mc.world.getBlockState(position).getBlock() == Blocks.FIRE) {
            return;
        }
        if (red) {
            RenderUtil.drawBoxESP(position, new Color(255, 0, 0), false, new Color(255, 0, 0), 1.0f, false, true, 42, true);
            return;
        }
        RenderUtil.drawBoxESP(position, new Color(0, 0, 255), false, new Color(0, 0, 255), 1.0f, false, true, 42, true);
    }
    
    private EntityPlayer getTarget(final double range) {
        EntityPlayer target = null;
        double distance = range;
        for (final EntityPlayer player : SurroundRender.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range)) {
                if (!EntityUtils.isInHole((Entity)player)) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = SurroundRender.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (SurroundRender.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = SurroundRender.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
}
