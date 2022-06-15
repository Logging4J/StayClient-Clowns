//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.entity.*;
import me.alpha432.stay.client.*;
import java.util.*;
import me.alpha432.stay.event.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.graphics.color.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.opengl.*;

public class Burrowesp extends Module
{
    public Setting<Boolean> rainbow;
    private final Setting<Integer> range;
    public Setting<Boolean> box;
    public Setting<Boolean> gradientBox;
    public Setting<Boolean> invertGradientBox;
    public Setting<Boolean> outline;
    public Setting<Boolean> gradientOutline;
    public Setting<Boolean> invertGradientOutline;
    public Setting<Double> height;
    private Setting<Integer> boxAlpha;
    private Setting<Float> lineWidth;
    public Setting<Boolean> safeColor;
    private Setting<Integer> safeRed;
    private Setting<Integer> safeGreen;
    private Setting<Integer> safeBlue;
    private Setting<Integer> safeAlpha;
    public Setting<Boolean> customOutline;
    private Setting<Integer> safecRed;
    private Setting<Integer> safecGreen;
    private Setting<Integer> safecBlue;
    private Setting<Integer> safecAlpha;
    
    public Burrowesp() {
        super("Burrowesp", "Burrowesp", Module.Category.VISUAL, false, false, false);
        this.rainbow = (Setting<Boolean>)this.register(new Setting("Rainbow", (T)false));
        this.range = (Setting<Integer>)this.register(new Setting("Range", (T)10, (T)0, (T)20));
        this.box = (Setting<Boolean>)this.register(new Setting("Box", (T)true));
        this.gradientBox = (Setting<Boolean>)this.register(new Setting("Gradient", (T)false, v -> this.box.getValue()));
        this.invertGradientBox = (Setting<Boolean>)this.register(new Setting("ReverseGradient", (T)false, v -> this.gradientBox.getValue()));
        this.outline = (Setting<Boolean>)this.register(new Setting("Outline", (T)true));
        this.gradientOutline = (Setting<Boolean>)this.register(new Setting("GradientOutline", (T)false, v -> this.outline.getValue()));
        this.invertGradientOutline = (Setting<Boolean>)this.register(new Setting("ReverseOutline", (T)false, v -> this.gradientOutline.getValue()));
        this.height = (Setting<Double>)this.register(new Setting("Height", (T)0.0, (T)(-2.0), (T)2.0));
        this.boxAlpha = (Setting<Integer>)this.register(new Setting("BoxAlpha", (T)125, (T)0, (T)255, v -> this.box.getValue()));
        this.lineWidth = (Setting<Float>)this.register(new Setting("LineWidth", (T)1.0f, (T)0.1f, (T)5.0f, v -> this.outline.getValue()));
        this.safeColor = (Setting<Boolean>)this.register(new Setting("BedrockColor", (T)false));
        this.safeRed = (Setting<Integer>)this.register(new Setting("BedrockRed", (T)0, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.safeGreen = (Setting<Integer>)this.register(new Setting("BedrockGreen", (T)255, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.safeBlue = (Setting<Integer>)this.register(new Setting("BedrockBlue", (T)0, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.safeAlpha = (Setting<Integer>)this.register(new Setting("BedrockAlpha", (T)255, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.customOutline = (Setting<Boolean>)this.register(new Setting("CustomLine", (T)false, v -> this.outline.getValue()));
        this.safecRed = (Setting<Integer>)this.register(new Setting("OL-SafeRed", (T)0, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
        this.safecGreen = (Setting<Integer>)this.register(new Setting("OL-SafeGreen", (T)255, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
        this.safecBlue = (Setting<Integer>)this.register(new Setting("OL-SafeBlue", (T)0, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
        this.safecAlpha = (Setting<Integer>)this.register(new Setting("OL-SafeAlpha", (T)255, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
    }
    
    private EntityPlayer getTarget(final double range) {
        EntityPlayer target = null;
        double distance = Math.pow(range, 2.0) + 1.0;
        for (final EntityPlayer player : Burrowesp.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range)) {
                if (Stay.speedManager.getPlayerSpeed(player) > 10.0) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = Burrowesp.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (Burrowesp.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = Burrowesp.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
    
    public void onRender3D(final Render3DEvent event) {
        EntityPlayer pss = this.getTarget(this.range.getValue());
        if (pss != null) {
            if (Burrowesp.mc.world.getBlockState(new BlockPos(pss.posX, pss.posY, pss.posZ)).getBlock() == Blocks.AIR || Burrowesp.mc.world.getBlockState(new BlockPos(pss.posX, pss.posY, pss.posZ)).getBlock() == Blocks.WATER || Burrowesp.mc.world.getBlockState(new BlockPos(pss.posX, pss.posY, pss.posZ)).getBlock() == Blocks.LAVA) {
                pss = null;
                return;
            }
            RenderUtil.drawBoxESP(new BlockPos(pss.posX, pss.posY, pss.posZ), ((boolean)this.rainbow.getValue()) ? ColorUtil.rainbow(ClickGui.getInstance().rainbowHue.getValue()) : new Color(this.safeRed.getValue(), this.safeGreen.getValue(), this.safeBlue.getValue(), this.safeAlpha.getValue()), this.customOutline.getValue(), new Color(this.safecRed.getValue(), this.safecGreen.getValue(), this.safecBlue.getValue(), this.safecAlpha.getValue()), this.lineWidth.getValue(), this.outline.getValue(), this.box.getValue(), this.boxAlpha.getValue(), true, this.height.getValue(), this.gradientBox.getValue(), this.gradientOutline.getValue(), this.invertGradientBox.getValue(), this.invertGradientOutline.getValue(), 0);
        }
    }
}
