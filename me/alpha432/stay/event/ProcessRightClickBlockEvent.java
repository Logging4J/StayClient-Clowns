//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import kotlin.jvm.internal.*;

@Cancelable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015" }, d2 = { "Lme/alpha432/stay/event/ProcessRightClickBlockEvent;", "Lme/alpha432/stay/event/EventStage;", "pos", "Lnet/minecraft/util/math/BlockPos;", "hand", "Lnet/minecraft/util/EnumHand;", "stack", "Lnet/minecraft/item/ItemStack;", "(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/item/ItemStack;)V", "getHand", "()Lnet/minecraft/util/EnumHand;", "setHand", "(Lnet/minecraft/util/EnumHand;)V", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "setPos", "(Lnet/minecraft/util/math/BlockPos;)V", "getStack", "()Lnet/minecraft/item/ItemStack;", "setStack", "(Lnet/minecraft/item/ItemStack;)V", "Stay" })
public final class ProcessRightClickBlockEvent extends EventStage
{
    @NotNull
    private BlockPos pos;
    @NotNull
    private EnumHand hand;
    @NotNull
    private ItemStack stack;
    
    public ProcessRightClickBlockEvent(@NotNull final BlockPos pos, @NotNull final EnumHand hand, @NotNull final ItemStack stack) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        Intrinsics.checkNotNullParameter((Object)hand, "hand");
        Intrinsics.checkNotNullParameter((Object)stack, "stack");
        this.pos = pos;
        this.hand = hand;
        this.stack = stack;
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
    public final EnumHand getHand() {
        return this.hand;
    }
    
    public final void setHand(@NotNull final EnumHand <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.hand = <set-?>;
    }
    
    @NotNull
    public final ItemStack getStack() {
        return this.stack;
    }
    
    public final void setStack(@NotNull final ItemStack <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.stack = <set-?>;
    }
}
