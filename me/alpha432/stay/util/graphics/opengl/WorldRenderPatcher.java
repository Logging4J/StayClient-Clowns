//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.opengl;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.world.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r" }, d2 = { "Lme/alpha432/stay/util/graphics/opengl/WorldRenderPatcher;", "", "()V", "getInterpolatedPos", "Lnet/minecraft/util/math/Vec3d;", "entity", "Lnet/minecraft/entity/Entity;", "ticks", "", "patch", "", "event", "Lme/alpha432/stay/event/RenderWorldEvent;", "Stay" })
public final class WorldRenderPatcher
{
    @NotNull
    public static final WorldRenderPatcher INSTANCE;
    
    private WorldRenderPatcher() {
    }
    
    public final void patch(@NotNull final RenderWorldEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        Minecraft.getMinecraft().profiler.startSection("cursa");
        Minecraft.getMinecraft().profiler.startSection("setup");
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.shadeModel(7425);
        GlStateManager.disableDepth();
        GlStateManager.glLineWidth(1.0f);
        final Entity getRenderViewEntity = Minecraft.getMinecraft().getRenderViewEntity();
        Vec3d interpolatedPos;
        if (getRenderViewEntity == null) {
            interpolatedPos = null;
        }
        else {
            final Entity it = getRenderViewEntity;
            final int n = 0;
            interpolatedPos = WorldRenderPatcher.INSTANCE.getInterpolatedPos(it, event.getPartialTicks());
        }
        final Vec3d renderPos = interpolatedPos;
        final RenderEvent e = new RenderEvent((Tessellator)StayTessellator.INSTANCE, renderPos);
        e.resetTranslation();
        MinecraftForge.EVENT_BUS.post((Event)e);
        Minecraft.getMinecraft().profiler.endSection();
        Minecraft.getMinecraft().profiler.startSection("release");
        GlStateManager.glLineWidth(1.0f);
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
        StayTessellator.INSTANCE.releaseGL();
        Minecraft.getMinecraft().profiler.endSection();
    }
    
    @NotNull
    public final Vec3d getInterpolatedPos(@NotNull final Entity entity, final float ticks) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final Vec3d add = new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(EntityUtil.INSTANCE.getInterpolatedAmount(entity, ticks));
        Intrinsics.checkNotNullExpressionValue((Object)add, "Vec3d(\n            entit\u2026ntity, ticks.toDouble()))");
        return add;
    }
    
    static {
        INSTANCE = new WorldRenderPatcher();
    }
}
