//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.*;
import net.minecraft.world.*;
import net.minecraft.client.network.*;
import net.minecraft.stats.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.features.modules.movement.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.entity.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.util.basement.wrapper.*;
import cakeslayers.team.eventsystem.impl.*;

@Mixin(value = { EntityPlayerSP.class }, priority = Integer.MAX_VALUE)
public abstract class MixinEntityPlayerSP extends AbstractClientPlayer
{
    private double cachedX;
    private double cachedY;
    private double cachedZ;
    private float cachedRotationPitch;
    private float cachedRotationYaw;
    private boolean cachedMoving;
    private boolean cachedOnGround;
    
    public MixinEntityPlayerSP(final Minecraft p_i47378_1_, final World p_i47378_2_, final NetHandlerPlayClient p_i47378_3_, final StatisticsManager p_i47378_4_, final RecipeBook p_i47378_5_) {
        super(p_i47378_2_, p_i47378_3_.getGameProfile());
    }
    
    @Inject(method = { "sendChatMessage" }, at = { @At("HEAD") }, cancellable = true)
    public void sendChatMessage(final String message, final CallbackInfo ci) {
        final ChatEvent chatEvent = new ChatEvent(message);
        MinecraftForge.EVENT_BUS.post((Event)chatEvent);
    }
    
    @Inject(method = { "onUpdateWalkingPlayer" }, at = { @At("HEAD") }, cancellable = true)
    private void preMotion(final CallbackInfo ci) {
        final MotionUpdateEvent event = new MotionUpdateEvent(0);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (!event.isCanceled()) {
            return;
        }
        ci.cancel();
    }
    
    @Inject(method = { "onUpdateWalkingPlayer" }, at = { @At("RETURN") }, cancellable = true)
    private void postMotion(final CallbackInfo ci) {
        final MotionUpdateEvent event = new MotionUpdateEvent(1);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (!event.isCanceled()) {
            return;
        }
        ci.cancel();
    }
    
    @Inject(method = { "pushOutOfBlocks" }, at = { @At("HEAD") }, cancellable = true)
    private void pushOutOfBlocksHook(final double x, final double y, final double z, final CallbackInfoReturnable<Boolean> ci) {
        final PushEvent event = new PushEvent(1);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (!event.isCanceled()) {
            return;
        }
        ci.setReturnValue((Object)false);
    }
    
    @Redirect(method = { "onLivingUpdate" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;setSprinting(Z)V", ordinal = 2))
    public void onLivingUpdate(final EntityPlayerSP entityPlayerSP, final boolean sprinting) {
        Label_0078: {
            if (Sprint.getInstance().isOn() && Sprint.getInstance().mode.getValue() == Sprint.Mode.RAGE) {
                if (Util.mc.player.moveForward == 0.0f) {
                    if (Util.mc.player.moveStrafing == 0.0f) {
                        break Label_0078;
                    }
                }
            }
            else if (Util.mc.player.movementInput.moveStrafe == 0.0f) {
                break Label_0078;
            }
            entityPlayerSP.setSprinting(true);
            return;
        }
        entityPlayerSP.setSprinting(sprinting);
    }
    
    @Inject(method = { "move" }, at = { @At("HEAD") }, cancellable = true)
    public void move(final MoverType type, final double n, final double n2, final double n3, final CallbackInfo ci) {
        final MoveEvent event = new MoveEvent(type, n, n2, n3);
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (!event.isCanceled()) {
            return;
        }
        super.move(type, event.getX(), event.getY(), event.getZ());
        ci.cancel();
        final EntityPlayerSP player = Wrapper.getPlayer();
        if (player == null) {
            return;
        }
        final PlayerMoveEvent.Pre event2 = new PlayerMoveEvent.Pre(player);
        if (event2.getCancelled()) {
            ci.cancel();
        }
        if (event2.isModified()) {
            super.move(type, event2.getX(), event2.getY(), event2.getZ());
            ci.cancel();
        }
    }
}
