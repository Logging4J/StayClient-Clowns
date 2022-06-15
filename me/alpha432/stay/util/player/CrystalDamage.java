//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.player;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/util/player/CrystalDamage;", "", "crystalPos", "Lnet/minecraft/util/math/Vec3d;", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "selfDamage", "", "(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/BlockPos;F)V", "getBlockPos", "()Lnet/minecraft/util/math/BlockPos;", "getCrystalPos", "()Lnet/minecraft/util/math/Vec3d;", "getSelfDamage", "()F", "Stay" })
public final class CrystalDamage
{
    @NotNull
    private final Vec3d crystalPos;
    @NotNull
    private final BlockPos blockPos;
    private final float selfDamage;
    
    public CrystalDamage(@NotNull final Vec3d crystalPos, @NotNull final BlockPos blockPos, final float selfDamage) {
        Intrinsics.checkNotNullParameter((Object)crystalPos, "crystalPos");
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        this.crystalPos = crystalPos;
        this.blockPos = blockPos;
        this.selfDamage = selfDamage;
    }
    
    @NotNull
    public final Vec3d getCrystalPos() {
        return this.crystalPos;
    }
    
    @NotNull
    public final BlockPos getBlockPos() {
        return this.blockPos;
    }
    
    public final float getSelfDamage() {
        return this.selfDamage;
    }
}
