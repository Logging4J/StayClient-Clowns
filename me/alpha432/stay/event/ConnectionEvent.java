//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import java.util.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012" }, d2 = { "Lme/alpha432/stay/event/ConnectionEvent;", "Lme/alpha432/stay/event/EventStage;", "stage", "", "uuid", "Ljava/util/UUID;", "name", "", "(ILjava/util/UUID;Ljava/lang/String;)V", "entity", "Lnet/minecraft/entity/player/EntityPlayer;", "(ILnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;Ljava/lang/String;)V", "getEntity", "()Lnet/minecraft/entity/player/EntityPlayer;", "getName", "()Ljava/lang/String;", "getUuid", "()Ljava/util/UUID;", "Stay" })
public final class ConnectionEvent extends EventStage
{
    @NotNull
    private final UUID uuid;
    @Nullable
    private final EntityPlayer entity;
    @Nullable
    private final String name;
    
    @NotNull
    public final UUID getUuid() {
        return this.uuid;
    }
    
    @Nullable
    public final EntityPlayer getEntity() {
        return this.entity;
    }
    
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    public ConnectionEvent(final int stage, @NotNull final UUID uuid, @Nullable final String name) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        super(stage);
        this.uuid = uuid;
        this.name = name;
        this.entity = null;
    }
    
    public ConnectionEvent(final int stage, @NotNull final EntityPlayer entity, @NotNull final UUID uuid, @Nullable final String name) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        super(stage);
        this.entity = entity;
        this.uuid = uuid;
        this.name = name;
    }
}
