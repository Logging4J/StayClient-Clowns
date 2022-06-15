//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;

@Cancelable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011" }, d2 = { "Lme/alpha432/stay/event/PlayerDamageBlockEvent;", "Lme/alpha432/stay/event/EventStage;", "stage", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "(ILnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V", "getFacing", "()Lnet/minecraft/util/EnumFacing;", "setFacing", "(Lnet/minecraft/util/EnumFacing;)V", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "setPos", "(Lnet/minecraft/util/math/BlockPos;)V", "Stay" })
public final class PlayerDamageBlockEvent extends EventStage
{
    @NotNull
    private BlockPos pos;
    @NotNull
    private EnumFacing facing;
    
    public PlayerDamageBlockEvent(final int stage, @NotNull final BlockPos pos, @NotNull final EnumFacing facing) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        Intrinsics.checkNotNullParameter((Object)facing, "facing");
        super(stage);
        this.pos = pos;
        this.facing = facing;
    }
    
    @NotNull
    public final BlockPos getPos() {
        return this.pos;
    }
    
    public final void setPos(@NotNull final BlockPos <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.pos = <set-?>;
    }
    
    @NotNull
    public final EnumFacing getFacing() {
        return this.facing;
    }
    
    public final void setFacing(@NotNull final EnumFacing <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.facing = <set-?>;
    }
}
