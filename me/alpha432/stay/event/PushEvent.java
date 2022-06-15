//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Cancelable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u0017\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006 " }, d2 = { "Lme/alpha432/stay/event/PushEvent;", "Lme/alpha432/stay/event/EventStage;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "airBone", "", "(Lnet/minecraft/entity/Entity;DDDZ)V", "stage", "", "(I)V", "(ILnet/minecraft/entity/Entity;)V", "airbone", "getAirbone", "()Z", "setAirbone", "(Z)V", "getEntity", "()Lnet/minecraft/entity/Entity;", "setEntity", "(Lnet/minecraft/entity/Entity;)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "getZ", "setZ", "Stay" })
public final class PushEvent extends EventStage
{
    @Nullable
    private Entity entity;
    private double x;
    private double y;
    private double z;
    private boolean airbone;
    
    @Nullable
    public final Entity getEntity() {
        return this.entity;
    }
    
    public final void setEntity(@Nullable final Entity <set-?>) {
        this.entity = <set-?>;
    }
    
    public final double getX() {
        return this.x;
    }
    
    public final void setX(final double <set-?>) {
        this.x = <set-?>;
    }
    
    public final double getY() {
        return this.y;
    }
    
    public final void setY(final double <set-?>) {
        this.y = <set-?>;
    }
    
    public final double getZ() {
        return this.z;
    }
    
    public final void setZ(final double <set-?>) {
        this.z = <set-?>;
    }
    
    public final boolean getAirbone() {
        return this.airbone;
    }
    
    public final void setAirbone(final boolean <set-?>) {
        this.airbone = <set-?>;
    }
    
    public PushEvent(@NotNull final Entity entity, final double x, final double y, final double z, final boolean airBone) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        super(0);
        this.entity = entity;
        this.x = x;
        this.y = y;
        this.z = z;
        this.airbone = airBone;
    }
    
    public PushEvent(final int stage) {
        super(stage);
    }
    
    public PushEvent(final int stage, @NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        super(stage);
        this.entity = entity;
    }
}
