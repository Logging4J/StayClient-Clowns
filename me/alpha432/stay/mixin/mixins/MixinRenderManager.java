//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.*;
import cakeslayers.team.eventsystem.impl.*;
import net.minecraft.entity.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(value = { RenderManager.class }, priority = 1919810)
public class MixinRenderManager
{
    @Inject(method = { "renderEntity" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render;setRenderOutlines(Z)V", shift = At.Shift.BEFORE) }, cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    public void renderEntityPre(final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, final boolean debug, final CallbackInfo ci, final Render<Entity> render) {
        if (entity == null || render == null || !RenderEntityEvent.getRenderingEntities()) {
            return;
        }
        final RenderEntityEvent eventAll = (RenderEntityEvent)new RenderEntityEvent.All.Pre(entity, x, y, z, yaw, partialTicks, (Render)render);
        eventAll.post();
        if (eventAll.getCancelled()) {
            ci.cancel();
        }
        else if (!(entity instanceof EntityLivingBase)) {
            final RenderEntityEvent eventModel = (RenderEntityEvent)RenderEntityEvent.Model.Pre.of(entity, x, y, z, yaw, partialTicks, (Render)render);
            eventModel.post();
        }
    }
    
    @Inject(method = { "renderEntity" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render;doRender(Lnet/minecraft/entity/Entity;DDDFF)V", shift = At.Shift.AFTER) }, locals = LocalCapture.CAPTURE_FAILHARD)
    public void renderEntityPeri(final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, final boolean debug, final CallbackInfo ci, final Render<Entity> render) {
        if (entity == null || render == null || !RenderEntityEvent.getRenderingEntities()) {
            return;
        }
        if (!(entity instanceof EntityLivingBase)) {
            final RenderEntityEvent.Model.Post eventModel = RenderEntityEvent.Model.Post.of(entity, x, y, z, yaw, partialTicks, (Render)render);
            eventModel.post();
        }
    }
    
    @Inject(method = { "renderEntity" }, at = { @At("RETURN") }, locals = LocalCapture.CAPTURE_FAILHARD)
    public void renderEntityPost(final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, final boolean debug, final CallbackInfo ci, final Render<Entity> render) {
        if (entity == null || render == null || !RenderEntityEvent.getRenderingEntities()) {
            return;
        }
        final RenderEntityEvent event = (RenderEntityEvent)new RenderEntityEvent.All.Post(entity, x, y, z, yaw, partialTicks, (Render)render);
        event.post();
    }
}
