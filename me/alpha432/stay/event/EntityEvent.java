//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b" }, d2 = { "Lme/alpha432/stay/event/EntityEvent;", "Lme/alpha432/stay/event/EventStage;", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "getEntity", "()Lnet/minecraft/entity/Entity;", "EntityCollision", "Stay" })
public class EntityEvent extends EventStage
{
    @NotNull
    private final Entity entity;
    
    public EntityEvent(@NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        this.entity = entity;
    }
    
    @NotNull
    public final Entity getEntity() {
        return this.entity;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0011" }, d2 = { "Lme/alpha432/stay/event/EntityEvent$EntityCollision;", "Lme/alpha432/stay/event/EntityEvent;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "(Lnet/minecraft/entity/Entity;DDD)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "getZ", "setZ", "Stay" })
    public static final class EntityCollision extends EntityEvent
    {
        private double x;
        private double y;
        private double z;
        
        public EntityCollision(@NotNull final Entity entity, final double x, final double y, final double z) {
            Intrinsics.checkNotNullParameter((Object)entity, "entity");
            super(entity);
            this.x = x;
            this.y = y;
            this.z = z;
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
    }
}
