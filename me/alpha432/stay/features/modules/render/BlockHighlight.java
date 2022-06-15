//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.util.graphics.color.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraft.util.math.*;

public class BlockHighlight extends Module
{
    private final Setting<Float> lineWidth;
    private final Setting<Integer> alpha;
    private final Setting<Integer> red;
    private final Setting<Integer> green;
    private final Setting<Integer> blue;
    private final Setting<Boolean> rainbow;
    private final Setting<Integer> rainbowhue;
    
    public BlockHighlight() {
        super("BlockHighlight", "Highlights the block u look at.", Module.Category.VISUAL, false, false, false);
        this.lineWidth = (Setting<Float>)this.register(new Setting("LineWidth", (T)1.0f, (T)0.1f, (T)5.0f));
        this.alpha = (Setting<Integer>)this.register(new Setting("Alpha", (T)255, (T)0, (T)255));
        this.red = (Setting<Integer>)this.register(new Setting("Red", (T)255, (T)0, (T)255));
        this.green = (Setting<Integer>)this.register(new Setting("Green", (T)255, (T)0, (T)255));
        this.blue = (Setting<Integer>)this.register(new Setting("Blue", (T)255, (T)0, (T)255));
        this.rainbow = (Setting<Boolean>)this.register(new Setting("Rainbow", (T)false));
        this.rainbowhue = (Setting<Integer>)this.register(new Setting("RainbowHue", (T)255, (T)0, (T)255, v -> this.rainbow.getValue()));
    }
    
    public void onRender3D(final Render3DEvent event) {
        final RayTraceResult ray = BlockHighlight.mc.objectMouseOver;
        if (ray != null && ray.typeOfHit == RayTraceResult.Type.BLOCK) {
            final BlockPos blockpos = ray.getBlockPos();
            RenderUtil.drawBlockOutline(blockpos, ((boolean)this.rainbow.getValue()) ? ColorUtil.rainbow(this.rainbowhue.getValue()) : new Color(this.red.getValue(), this.green.getValue(), this.blue.getValue(), this.alpha.getValue()), this.lineWidth.getValue(), false);
        }
    }
}
