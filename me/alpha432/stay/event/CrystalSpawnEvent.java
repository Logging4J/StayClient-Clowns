//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.entity.item.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lme/alpha432/stay/event/CrystalSpawnEvent;", "Lme/alpha432/stay/event/EventStage;", "crystal", "Lnet/minecraft/entity/item/EntityEnderCrystal;", "(Lnet/minecraft/entity/item/EntityEnderCrystal;)V", "getCrystal", "()Lnet/minecraft/entity/item/EntityEnderCrystal;", "Stay" })
public final class CrystalSpawnEvent extends EventStage
{
    @Nullable
    private final EntityEnderCrystal crystal;
    
    public CrystalSpawnEvent(@Nullable final EntityEnderCrystal crystal) {
        this.crystal = crystal;
    }
    
    @Nullable
    public final EntityEnderCrystal getCrystal() {
        return this.crystal;
    }
}
