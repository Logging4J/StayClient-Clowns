//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import net.minecraft.util.math.*;
import java.util.concurrent.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.util.player.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.opengl.*;
import java.util.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.world.*;
import java.util.function.*;
import java.util.stream.*;
import net.minecraft.init.*;

public class VoidESP extends Module
{
    private final Setting<Float> radius;
    private final Timer timer;
    public Setting<Boolean> air;
    public Setting<Boolean> noEnd;
    public Setting<Boolean> box;
    public Setting<Boolean> outline;
    public Setting<Boolean> colorSync;
    public Setting<Double> height;
    public Setting<Boolean> customOutline;
    private final Setting<Integer> updates;
    private final Setting<Integer> voidCap;
    private final Setting<Integer> red;
    private final Setting<Integer> green;
    private final Setting<Integer> blue;
    private final Setting<Integer> alpha;
    private final Setting<Integer> boxAlpha;
    private final Setting<Float> lineWidth;
    private final Setting<Integer> cRed;
    private final Setting<Integer> cGreen;
    private final Setting<Integer> cBlue;
    private final Setting<Integer> cAlpha;
    private List<BlockPos> voidHoles;
    
    public VoidESP() {
        super("VoidEsp", "Esps the void", Module.Category.VISUAL, true, false, false);
        this.radius = (Setting<Float>)this.register(new Setting("Radius", (T)8.0f, (T)0.0f, (T)50.0f));
        this.timer = new Timer();
        this.air = (Setting<Boolean>)this.register(new Setting("OnlyAir", (T)true));
        this.noEnd = (Setting<Boolean>)this.register(new Setting("NoEnd", (T)true));
        this.box = (Setting<Boolean>)this.register(new Setting("Box", (T)true));
        this.outline = (Setting<Boolean>)this.register(new Setting("Outline", (T)true));
        this.colorSync = (Setting<Boolean>)this.register(new Setting("Sync", (T)false));
        this.height = (Setting<Double>)this.register(new Setting("Height", (T)0.0, (T)(-2.0), (T)2.0));
        this.customOutline = (Setting<Boolean>)this.register(new Setting("CustomLine", (T)false, v -> this.outline.getValue()));
        this.updates = (Setting<Integer>)this.register(new Setting("Updates", (T)500, (T)0, (T)1000));
        this.voidCap = (Setting<Integer>)this.register(new Setting("VoidCap", (T)500, (T)0, (T)1000));
        this.red = (Setting<Integer>)this.register(new Setting("Red", (T)0, (T)0, (T)255));
        this.green = (Setting<Integer>)this.register(new Setting("Green", (T)255, (T)0, (T)255));
        this.blue = (Setting<Integer>)this.register(new Setting("Blue", (T)0, (T)0, (T)255));
        this.alpha = (Setting<Integer>)this.register(new Setting("Alpha", (T)255, (T)0, (T)255));
        this.boxAlpha = (Setting<Integer>)this.register(new Setting("BoxAlpha", (T)125, (T)0, (T)255, v -> this.box.getValue()));
        this.lineWidth = (Setting<Float>)this.register(new Setting("LineWidth", (T)1.0f, (T)0.1f, (T)5.0f, v -> this.outline.getValue()));
        this.cRed = (Setting<Integer>)this.register(new Setting("OL-Red", (T)0, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue()));
        this.cGreen = (Setting<Integer>)this.register(new Setting("OL-Green", (T)0, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue()));
        this.cBlue = (Setting<Integer>)this.register(new Setting("OL-Blue", (T)255, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue()));
        this.cAlpha = (Setting<Integer>)this.register(new Setting("OL-Alpha", (T)255, (T)0, (T)255, v -> this.customOutline.getValue() && this.outline.getValue()));
        this.voidHoles = new CopyOnWriteArrayList<BlockPos>();
    }
    
    public void onToggle() {
        this.timer.reset();
    }
    
    public void onLogin() {
        this.timer.reset();
    }
    
    public void onTick() {
        if (!fullNullCheck() && (!this.noEnd.getValue() || VoidESP.mc.player.dimension != 1) && this.timer.passedMs(this.updates.getValue())) {
            this.voidHoles.clear();
            this.voidHoles = this.findVoidHoles();
            if (this.voidHoles.size() > this.voidCap.getValue()) {
                this.voidHoles.clear();
            }
            this.timer.reset();
        }
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (fullNullCheck() || (this.noEnd.getValue() && VoidESP.mc.player.dimension == 1)) {
            return;
        }
        for (final BlockPos pos : this.voidHoles) {
            if (!RotationUtil.isInFov(pos)) {
                continue;
            }
            RenderUtil.drawBoxESP(pos, new Color(this.red.getValue(), this.green.getValue(), this.blue.getValue(), this.alpha.getValue()), this.customOutline.getValue(), new Color(this.cRed.getValue(), this.cGreen.getValue(), this.cBlue.getValue(), this.cAlpha.getValue()), this.lineWidth.getValue(), this.outline.getValue(), this.box.getValue(), this.boxAlpha.getValue(), true, this.height.getValue(), false, false, false, false, 0);
        }
    }
    
    private List<BlockPos> findVoidHoles() {
        final BlockPos playerPos = EntityUtils.getPlayerPos((EntityPlayer)VoidESP.mc.player);
        return BlockUtil.getDisc(playerPos.add(0, -playerPos.getY(), 0), this.radius.getValue()).stream().filter((Predicate<? super Object>)this::isVoid).collect((Collector<? super Object, ?, List<BlockPos>>)Collectors.toList());
    }
    
    private boolean isVoid(final BlockPos pos) {
        return (VoidESP.mc.world.getBlockState(pos).getBlock() == Blocks.AIR || (!this.air.getValue() && VoidESP.mc.world.getBlockState(pos).getBlock() != Blocks.BEDROCK)) && pos.getY() < 1 && pos.getY() >= 0;
    }
}
