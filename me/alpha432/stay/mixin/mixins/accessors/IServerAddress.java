//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins.accessors;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.multiplayer.*;
import org.spongepowered.asm.mixin.gen.*;
import org.jetbrains.annotations.*;

@Mixin({ ServerAddress.class })
public interface IServerAddress
{
    @Invoker("getServerAddress")
    @Contract(value = "_ -> fail", pure = true)
    default String[] getServerAddress(final String string) {
        throw new IllegalStateException("Mixin didnt transform this");
    }
}
