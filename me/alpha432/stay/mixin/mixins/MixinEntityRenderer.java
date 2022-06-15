//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import com.google.common.base.*;
import me.alpha432.stay.features.modules.misc.*;
import net.minecraft.item.*;
import net.minecraft.client.*;
import net.minecraft.init.*;
import java.util.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.manager.*;
import me.alpha432.stay.features.modules.render.*;
import org.spongepowered.asm.mixin.injection.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Mixin({ EntityRenderer.class })
public abstract class MixinEntityRenderer
{
    @Redirect(method = { "getMouseOver" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;getEntitiesInAABBexcluding(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;"))
    public List<Entity> getEntitiesInAABBexcluding(final WorldClient worldClient, final Entity entityIn, final AxisAlignedBB boundingBox, final Predicate predicate) {
        if (NoHitBox.getINSTANCE().isOn() && ((Minecraft.getMinecraft().player.getHeldItemMainhand().getItem() instanceof ItemPickaxe && (boolean)NoHitBox.getINSTANCE().pickaxe.getValue()) || (Minecraft.getMinecraft().player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL && (boolean)NoHitBox.getINSTANCE().crystal.getValue()) || (Minecraft.getMinecraft().player.getHeldItemMainhand().getItem() == Items.GOLDEN_APPLE && (boolean)NoHitBox.getINSTANCE().gapple.getValue()) || Minecraft.getMinecraft().player.getHeldItemMainhand().getItem() == Items.FLINT_AND_STEEL || Minecraft.getMinecraft().player.getHeldItemMainhand().getItem() == Items.TNT_MINECART)) {
            return new ArrayList<Entity>();
        }
        return (List<Entity>)worldClient.getEntitiesInAABBexcluding(entityIn, boundingBox, predicate);
    }
    
    @Inject(method = { "hurtCameraEffect" }, at = { @At("HEAD") }, cancellable = true)
    public void hurtCameraEffect(final float ticks, final CallbackInfo info) {
        final ModuleManager moduleManager = Stay.moduleManager;
        if (ModuleManager.getModuleByName("NoRender").isEnabled()) {
            info.cancel();
        }
    }
    
    @ModifyVariable(method = { "orientCamera" }, ordinal = 3, at = @At(value = "STORE", ordinal = 0), require = 1)
    public double changeCameraDistanceHook(final double range) {
        final CameraClip CameraClip = (CameraClip)Stay.moduleManager.getModuleByDisplayName("Camera Clip");
        if (ModuleManager.getModuleByName("Camera Clip").isEnabled()) {
            return (double)CameraClip.distance.getValue();
        }
        return range;
    }
    
    @ModifyVariable(method = { "orientCamera" }, ordinal = 7, at = @At(value = "STORE", ordinal = 0), require = 1)
    public double orientCameraHook(final double range) {
        final CameraClip CameraClip = (CameraClip)Stay.moduleManager.getModuleByDisplayName("Camera Clip");
        if (ModuleManager.getModuleByName("Camera Clip").isEnabled()) {
            return (double)CameraClip.distance.getValue();
        }
        return range;
    }
    
    @Inject(method = { "renderWorldPass" }, at = { @At(value = "INVOKE_STRING", target = "net/minecraft/profiler/Profiler.endStartSection(Ljava/lang/String;)V", args = { "ldc=hand" }) })
    public void onStartHand(final int pass, final float partialTicks, final long finishTimeNano, final CallbackInfo ci) {
        final RenderWorldEvent event = new RenderWorldEvent(partialTicks, pass);
        MinecraftForge.EVENT_BUS.post((Event)event);
    }
}
