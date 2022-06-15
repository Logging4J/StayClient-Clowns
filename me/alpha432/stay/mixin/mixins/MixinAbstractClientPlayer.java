//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.util.*;
import me.alpha432.stay.features.modules.render.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.util.graphics.image.*;
import java.net.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ AbstractClientPlayer.class })
public abstract class MixinAbstractClientPlayer
{
    @Inject(method = { "getLocationCape" }, at = { @At("HEAD") }, cancellable = true)
    public void getLocationCape(final CallbackInfoReturnable<ResourceLocation> callbackInfoReturnable) {
        final CapesModule capesModule = (CapesModule)Stay.moduleManager.getModuleByDisplayName("Capes");
        final String URLS = "http://47.106.126.97/assets/cape/";
        try {
            if (capesModule.isEnabled()) {
                if (capesModule.Mode.getValue() == CapesModule.ModeS.STAY) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "capestay.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.Future) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "capefuture.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.GS1) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "capeblack.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.GS2) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "capewhite.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE1) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape1.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE2) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape2.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE3) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape3.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE4) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape4.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE5) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape5.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE6) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape6.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE7) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape7.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE8) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape8.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE9) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape9.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE10) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape10.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE11) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape11.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE12) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape12.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE13) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape13.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE14) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape14.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE15) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape15.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE16) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape16.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE17) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape17.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE18) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape18.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE19) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape19.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE20) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape20.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE21) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape21.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE22) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape22.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE23) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape23.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE24) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape24.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE25) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape25.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.CAPE26) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "cape26.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.LJM) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "ljm.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.WUT1) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "wu1.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.WUT2) {
                    callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL(URLS + "wu2.png")));
                }
                if (capesModule.Mode.getValue() == CapesModule.ModeS.URL) {
                    try {
                        callbackInfoReturnable.setReturnValue((Object)DynamicTextureWrapper.getTexture(new URL((String)capesModule.URL.getValue())));
                    }
                    catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
