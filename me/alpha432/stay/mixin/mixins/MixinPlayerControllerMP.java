//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import me.alpha432.stay.features.modules.player.*;
import me.alpha432.stay.client.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import me.alpha432.stay.event.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import me.alpha432.stay.features.modules.misc.*;
import net.minecraft.item.*;

@Mixin({ PlayerControllerMP.class })
public abstract class MixinPlayerControllerMP
{
    @Redirect(method = { "onPlayerDamageBlock" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/block/state/IBlockState;getPlayerRelativeBlockHardness(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F"))
    public float getPlayerRelativeBlockHardnessHook(final IBlockState state, final EntityPlayer player, final World worldIn, final BlockPos pos) {
        return state.getPlayerRelativeBlockHardness(player, worldIn, pos) * ((TpsSync.getInstance().isOn() && (boolean)TpsSync.getInstance().mining.getValue()) ? (1.0f / Stay.serverManager.getTpsFactor()) : 1.0f);
    }
    
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At("HEAD") }, cancellable = true)
    private void onPlayerDamageBlockHook(final BlockPos pos, final EnumFacing face, final CallbackInfoReturnable<Boolean> ci) {
        final PlayerDamageBlockEvent event = new PlayerDamageBlockEvent(0, pos, face);
        MinecraftForge.EVENT_BUS.post((Event)event);
    }
    
    @Inject(method = { "clickBlock" }, at = { @At("HEAD") }, cancellable = true)
    private void clickBlockHook(final BlockPos pos, final EnumFacing face, final CallbackInfoReturnable<Boolean> info) {
        final BlockEvent event = new BlockEvent(3, pos, face);
        event.post();
    }
    
    @Shadow
    public abstract void syncCurrentPlayItem();
    
    @Inject(method = { "processRightClickBlock" }, at = { @At("HEAD") }, cancellable = true)
    public void processRightClickBlock(final EntityPlayerSP player, final WorldClient worldIn, final BlockPos pos, final EnumFacing direction, final Vec3d vec, final EnumHand hand, final CallbackInfoReturnable<EnumActionResult> cir) {
        final ProcessRightClickBlockEvent event = new ProcessRightClickBlockEvent(pos, hand, Minecraft.instance.player.getHeldItem(hand));
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (event.isCanceled()) {
            cir.cancel();
        }
    }
    
    @Inject(method = { "onStoppedUsingItem" }, at = { @At("HEAD") }, cancellable = true)
    private void onStoppedUsingItem(final EntityPlayer playerIn, final CallbackInfo ci) {
        if (!PacketEat.getInstance().isOn()) {
            return;
        }
        if (!(playerIn.getHeldItem(playerIn.getActiveHand()).getItem() instanceof ItemFood)) {
            return;
        }
        this.syncCurrentPlayItem();
        playerIn.stopActiveHand();
        ci.cancel();
    }
}
