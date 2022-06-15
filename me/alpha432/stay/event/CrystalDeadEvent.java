//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import java.util.*;
import net.minecraft.entity.item.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010" }, d2 = { "Lme/alpha432/stay/event/CrystalDeadEvent;", "Lme/alpha432/stay/event/EventStage;", "x", "", "y", "z", "crystals", "", "Lnet/minecraft/entity/item/EntityEnderCrystal;", "(DDDLjava/util/List;)V", "getCrystals", "()Ljava/util/List;", "getX", "()D", "getY", "getZ", "Stay" })
public final class CrystalDeadEvent extends EventStage
{
    private final double x;
    private final double y;
    private final double z;
    @NotNull
    private final List<EntityEnderCrystal> crystals;
    
    public CrystalDeadEvent(final double x, final double y, final double z, @NotNull final List<? extends EntityEnderCrystal> crystals) {
        Intrinsics.checkNotNullParameter((Object)crystals, "crystals");
        this.x = x;
        this.y = y;
        this.z = z;
        this.crystals = (List<EntityEnderCrystal>)crystals;
    }
    
    public final double getX() {
        return this.x;
    }
    
    public final double getY() {
        return this.y;
    }
    
    public final double getZ() {
        return this.z;
    }
    
    @NotNull
    public final List<EntityEnderCrystal> getCrystals() {
        return this.crystals;
    }
}
