//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003�\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003�\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006�\u0006\u0007" }, d2 = { "Lme/alpha432/stay/event/TransformSideFirstPersonEvent;", "Lme/alpha432/stay/event/EventStage;", "enumHandSide", "Lnet/minecraft/util/EnumHandSide;", "(Lnet/minecraft/util/EnumHandSide;)V", "getEnumHandSide", "()Lnet/minecraft/util/EnumHandSide;", "Stay" })
public final class TransformSideFirstPersonEvent extends EventStage
{
    @NotNull
    private final EnumHandSide enumHandSide;
    
    public TransformSideFirstPersonEvent(@NotNull final EnumHandSide enumHandSide) {
        Intrinsics.checkNotNullParameter((Object)enumHandSide, "enumHandSide");
        this.enumHandSide = enumHandSide;
    }
    
    @NotNull
    public final EnumHandSide getEnumHandSide() {
        return this.enumHandSide;
    }
}
