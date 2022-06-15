//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.gui.*;
import java.util.*;
import net.minecraft.client.network.*;
import me.alpha432.stay.features.modules.misc.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ GuiPlayerTabOverlay.class })
public class MixinGuiPlayerTabOverlay extends Gui
{
    @Redirect(method = { "renderPlayerlist" }, at = @At(value = "INVOKE", target = "Ljava/util/List;subList(II)Ljava/util/List;"))
    public List<NetworkPlayerInfo> subListHook(final List<NetworkPlayerInfo> list, final int fromIndex, final int toIndex) {
        return list.subList(fromIndex, ExtraTab.getINSTANCE().isEnabled() ? Math.min((int)ExtraTab.getINSTANCE().size.getValue(), list.size()) : toIndex);
    }
    
    @Inject(method = { "getPlayerName" }, at = { @At("HEAD") }, cancellable = true)
    public void getPlayerNameHook(final NetworkPlayerInfo networkPlayerInfoIn, final CallbackInfoReturnable<String> info) {
        if (ExtraTab.getINSTANCE().isEnabled()) {
            info.setReturnValue((Object)ExtraTab.getPlayerName(networkPlayerInfoIn));
        }
    }
}
