//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin;

import org.spongepowered.asm.launch.*;
import org.spongepowered.asm.mixin.*;

public class StayMixinLoader
{
    public static void load() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.stay.json");
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
        MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
    }
}
