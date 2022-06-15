//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import com.mojang.authlib.*;
import me.alpha432.stay.features.modules.player.*;
import net.minecraft.entity.*;
import me.alpha432.stay.client.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.*;
import net.minecraftforge.common.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Mixin({ EntityPlayer.class })
public abstract class MixinEntityPlayer extends EntityLivingBase
{
    EntityPlayer player;
    
    public MixinEntityPlayer(final World worldIn, final GameProfile gameProfileIn) {
        super(worldIn);
    }
    
    @Inject(method = { "getCooldownPeriod" }, at = { @At("HEAD") }, cancellable = true)
    private void getCooldownPeriodHook(final CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (TpsSync.getInstance().isOn() && (boolean)TpsSync.getInstance().attack.getValue()) {
            callbackInfoReturnable.setReturnValue((Object)(float)(1.0 / EntityPlayer.class.cast(this).getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).getBaseValue() * 20.0 * Stay.serverManager.getTpsFactor()));
        }
    }
    
    @Inject(method = { "jump" }, at = { @At("HEAD") }, cancellable = true)
    public void onJump(final CallbackInfo ci) {
        if (Minecraft.getMinecraft().player.getName() == this.getName()) {
            MinecraftForge.EVENT_BUS.post((Event)new PlayerJumpEvent(this.motionX, this.motionY));
        }
    }
}
