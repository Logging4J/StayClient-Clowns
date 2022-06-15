//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b" }, d2 = { "Lme/alpha432/stay/event/DeathEvent;", "Lme/alpha432/stay/event/EventStage;", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "(Lnet/minecraft/entity/player/EntityPlayer;)V", "getPlayer", "()Lnet/minecraft/entity/player/EntityPlayer;", "setPlayer", "Stay" })
public final class DeathEvent extends EventStage
{
    @NotNull
    private EntityPlayer player;
    
    public DeathEvent(@NotNull final EntityPlayer player) {
        Intrinsics.checkNotNullParameter((Object)player, "player");
        this.player = player;
    }
    
    @NotNull
    public final EntityPlayer getPlayer() {
        return this.player;
    }
    
    public final void setPlayer(@NotNull final EntityPlayer <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.player = <set-?>;
    }
}
