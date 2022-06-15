//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.player;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import me.alpha432.stay.util.basement.wrapper.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u0012\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u000b\u001a\u00020\u0007*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019" }, d2 = { "Lme/alpha432/stay/util/player/SurroundUtils;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "surroundOffset", "", "Lnet/minecraft/util/math/BlockPos;", "getSurroundOffset", "()[Lnet/minecraft/util/math/BlockPos;", "[Lnet/minecraft/util/math/BlockPos;", "flooredPosition", "Lnet/minecraft/entity/Entity;", "getFlooredPosition", "(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/BlockPos;", "checkBlock", "", "block", "Lnet/minecraft/block/Block;", "checkHole", "Lme/alpha432/stay/util/player/SurroundUtils$HoleType;", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "entity", "pos", "HoleType", "Stay" })
public final class SurroundUtils
{
    @NotNull
    public static final SurroundUtils INSTANCE;
    @NotNull
    private static final Minecraft mc;
    @NotNull
    private static final BlockPos[] surroundOffset;
    
    private SurroundUtils() {
    }
    
    @NotNull
    public final BlockPos getFlooredPosition(@NotNull final Entity $this$flooredPosition) {
        Intrinsics.checkNotNullParameter((Object)$this$flooredPosition, "<this>");
        double $this$floorToInt$iv = $this$flooredPosition.posX;
        int $i$f$floorToInt = 0;
        final int n = (int)Math.floor($this$floorToInt$iv);
        $this$floorToInt$iv = $this$flooredPosition.posY;
        $i$f$floorToInt = 0;
        final int n2 = (int)Math.floor($this$floorToInt$iv);
        $this$floorToInt$iv = $this$flooredPosition.posZ;
        $i$f$floorToInt = 0;
        return new BlockPos(n, n2, (int)Math.floor($this$floorToInt$iv));
    }
    
    @NotNull
    public final BlockPos[] getSurroundOffset() {
        return SurroundUtils.surroundOffset;
    }
    
    @NotNull
    public final HoleType checkHole(@NotNull final SafeClientEvent $this$checkHole, @NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)$this$checkHole, "<this>");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return this.checkHole($this$checkHole, this.getFlooredPosition(entity));
    }
    
    @NotNull
    public final HoleType checkHole(@NotNull final SafeClientEvent $this$checkHole, @NotNull final BlockPos pos) {
        Intrinsics.checkNotNullParameter((Object)$this$checkHole, "<this>");
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        if (!$this$checkHole.getWorld().isAirBlock(pos) || !$this$checkHole.getWorld().isAirBlock(pos.up()) || !$this$checkHole.getWorld().isAirBlock(pos.up().up())) {
            return HoleType.NONE;
        }
        HoleType type = HoleType.BEDROCK;
        final BlockPos[] surroundOffset = SurroundUtils.surroundOffset;
        int i = 0;
        while (i < surroundOffset.length) {
            final BlockPos offset = surroundOffset[i];
            ++i;
            final Block block = $this$checkHole.getWorld().getBlockState(pos.add((Vec3i)offset)).getBlock();
            Intrinsics.checkNotNullExpressionValue((Object)block, "block");
            if (!this.checkBlock(block)) {
                type = HoleType.NONE;
                break;
            }
            if (Intrinsics.areEqual((Object)block, (Object)Blocks.BEDROCK)) {
                continue;
            }
            type = HoleType.OBBY;
        }
        return type;
    }
    
    private final boolean checkBlock(final Block block) {
        return Intrinsics.areEqual((Object)block, (Object)Blocks.BEDROCK) || Intrinsics.areEqual((Object)block, (Object)Blocks.OBSIDIAN) || Intrinsics.areEqual((Object)block, (Object)Blocks.ENDER_CHEST) || Intrinsics.areEqual((Object)block, (Object)Blocks.ANVIL);
    }
    
    static {
        INSTANCE = new SurroundUtils();
        mc = MinecraftWrapper.getMc();
        surroundOffset = new BlockPos[] { new BlockPos(0, -1, 0), new BlockPos(0, 0, -1), new BlockPos(1, 0, 0), new BlockPos(0, 0, 1), new BlockPos(-1, 0, 0) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/util/player/SurroundUtils$HoleType;", "", "(Ljava/lang/String;I)V", "NONE", "OBBY", "BEDROCK", "Stay" })
    public enum HoleType
    {
        NONE, 
        OBBY, 
        BEDROCK;
        
        private static final /* synthetic */ HoleType[] $values() {
            return new HoleType[] { HoleType.NONE, HoleType.OBBY, HoleType.BEDROCK };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
