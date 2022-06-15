//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.client.multiplayer.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lme/alpha432/stay/event/WorldEvent;", "Lme/alpha432/stay/event/EventStage;", "world", "Lnet/minecraft/client/multiplayer/WorldClient;", "(Lnet/minecraft/client/multiplayer/WorldClient;)V", "getWorld", "()Lnet/minecraft/client/multiplayer/WorldClient;", "Stay" })
public final class WorldEvent extends EventStage
{
    @Nullable
    private final WorldClient world;
    
    public WorldEvent(@Nullable final WorldClient world) {
        this.world = world;
    }
    
    @Nullable
    public final WorldClient getWorld() {
        return this.world;
    }
}
