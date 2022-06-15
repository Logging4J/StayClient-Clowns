//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins.accessors;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.handshake.client.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin({ C00Handshake.class })
public interface IC00Handshake
{
    @Accessor("ip")
    String getIp();
    
    @Accessor("ip")
    void setIp(final String p0);
}
