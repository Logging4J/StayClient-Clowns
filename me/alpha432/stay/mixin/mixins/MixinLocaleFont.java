//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.resources.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { Locale.class }, priority = 100)
public class MixinLocaleFont
{
    @Inject(method = { "checkUnicode" }, at = { @At("HEAD") }, cancellable = true)
    public void checkUnicode(final CallbackInfo ci) {
        ci.cancel();
    }
}
