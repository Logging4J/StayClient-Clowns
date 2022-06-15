//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.init.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.graphics.color.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.opengl.*;
import java.util.*;

public class HellgateEsp extends Module
{
    public Setting<Boolean> norem;
    public Setting<Boolean> rainbow;
    private final Setting<Double> range;
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
    
    public HellgateEsp() {
        super("HellgateEsp", "HellgateEsp", Module.Category.VISUAL, false, false, false);
        this.norem = (Setting<Boolean>)this.register(new Setting("Don't show hell gate", (T)true));
        this.rainbow = (Setting<Boolean>)this.register(new Setting("Rainbow", (T)false));
        this.range = (Setting<Double>)this.register(new Setting("Range", (T)15.0, (T)1.0, (T)50.0));
        this.box = (Setting<Boolean>)this.register(new Setting("Box", (T)true));
        this.gradientBox = (Setting<Boolean>)this.register(new Setting("Gradient", (T)false, v -> this.box.getValue()));
        this.invertGradientBox = (Setting<Boolean>)this.register(new Setting("ReverseGradient", (T)false, v -> this.gradientBox.getValue()));
        this.outline = (Setting<Boolean>)this.register(new Setting("Outline", (T)true));
        this.gradientOutline = (Setting<Boolean>)this.register(new Setting("GradientOutline", (T)true, v -> this.outline.getValue()));
        this.invertGradientOutline = (Setting<Boolean>)this.register(new Setting("ReverseOutline", (T)false, v -> this.gradientOutline.getValue()));
        this.height = (Setting<Double>)this.register(new Setting("Height", (T)0.0, (T)(-2.0), (T)2.0));
        this.boxAlpha = (Setting<Integer>)this.register(new Setting("BoxAlpha", (T)253, (T)0, (T)255, v -> this.box.getValue()));
        this.lineWidth = (Setting<Float>)this.register(new Setting("LineWidth", (T)1.0f, (T)0.1f, (T)5.0f, v -> this.outline.getValue()));
        this.safeColor = (Setting<Boolean>)this.register(new Setting("BedrockColor", (T)true));
        this.safeRed = (Setting<Integer>)this.register(new Setting("BedrockRed", (T)136, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.safeGreen = (Setting<Integer>)this.register(new Setting("BedrockGreen", (T)77, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.safeBlue = (Setting<Integer>)this.register(new Setting("BedrockBlue", (T)198, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.safeAlpha = (Setting<Integer>)this.register(new Setting("BedrockAlpha", (T)58, (T)0, (T)255, v -> this.safeColor.getValue()));
        this.customOutline = (Setting<Boolean>)this.register(new Setting("CustomLine", (T)false, v -> this.outline.getValue()));
        this.safecRed = (Setting<Integer>)this.register(new Setting("OL-SafeRed", (T)0, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
        this.safecGreen = (Setting<Integer>)this.register(new Setting("OL-SafeGreen", (T)255, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
        this.safecBlue = (Setting<Integer>)this.register(new Setting("OL-SafeBlue", (T)0, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
        this.safecAlpha = (Setting<Integer>)this.register(new Setting("OL-SafeAlpha", (T)255, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue() && this.safeColor.getValue()));
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (fullNullCheck()) {
            return;
        }
        final Double maxDist = this.range.getValue();
        short a = 0;
        ++a;
        final List<BlockPos> Blocksss = new ArrayList<BlockPos>();
        for (Double x = maxDist; x >= -maxDist; --x) {
            for (Double y = maxDist; y >= -maxDist; --y) {
                for (Double z = maxDist; z >= -maxDist; --z) {
                    final BlockPos pos = new BlockPos(Wrapper.getPlayer().posX + x, Wrapper.getPlayer().posY + y, Wrapper.getPlayer().posZ + z);
                    final double dist = Wrapper.getPlayer().getDistance((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
                    if (dist <= maxDist && HellgateEsp.mc.world.getBlockState(pos).getBlock() == Blocks.PORTAL) {
                        RenderUtil.drawBoxESP(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), ((boolean)this.rainbow.getValue()) ? ColorUtil.rainbow(ClickGui.getInstance().rainbowHue.getValue()) : new Color(this.safeRed.getValue(), this.safeGreen.getValue(), this.safeBlue.getValue(), this.safeAlpha.getValue()), this.customOutline.getValue(), new Color(this.safecRed.getValue(), this.safecGreen.getValue(), this.safecBlue.getValue(), this.safecAlpha.getValue()), this.lineWidth.getValue(), this.outline.getValue(), this.box.getValue(), this.boxAlpha.getValue(), true, this.height.getValue(), this.gradientBox.getValue(), this.gradientOutline.getValue(), this.invertGradientBox.getValue(), this.invertGradientOutline.getValue(), 0);
                    }
                }
            }
        }
    }
}
