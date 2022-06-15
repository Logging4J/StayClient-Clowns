//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import kotlin.*;
import net.minecraft.block.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00028\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00028\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006" }, d2 = { "isLiquid", "", "Lnet/minecraft/block/state/IBlockState;", "(Lnet/minecraft/block/state/IBlockState;)Z", "isReplaceable", "isWater", "Stay" })
public final class CrystalUtilsKt
{
    public static final boolean isLiquid(@NotNull final IBlockState $this$isLiquid) {
        Intrinsics.checkNotNullParameter((Object)$this$isLiquid, "<this>");
        final int $i$f$isLiquid = 0;
        return $this$isLiquid.getMaterial().isLiquid();
    }
    
    public static final boolean isWater(@NotNull final IBlockState $this$isWater) {
        Intrinsics.checkNotNullParameter((Object)$this$isWater, "<this>");
        final int $i$f$isWater = 0;
        return Intrinsics.areEqual((Object)$this$isWater.getBlock(), (Object)Blocks.WATER);
    }
    
    public static final boolean isReplaceable(@NotNull final IBlockState $this$isReplaceable) {
        Intrinsics.checkNotNullParameter((Object)$this$isReplaceable, "<this>");
        final int $i$f$isReplaceable = 0;
        return $this$isReplaceable.getMaterial().isReplaceable();
    }
}
