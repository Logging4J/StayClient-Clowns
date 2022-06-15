//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Cancelable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015" }, d2 = { "Lme/alpha432/stay/event/MoveEvent;", "Lme/alpha432/stay/event/EventStage;", "type", "Lnet/minecraft/entity/MoverType;", "x", "", "y", "z", "(Lnet/minecraft/entity/MoverType;DDD)V", "getType", "()Lnet/minecraft/entity/MoverType;", "setType", "(Lnet/minecraft/entity/MoverType;)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "getZ", "setZ", "Stay" })
public final class MoveEvent extends EventStage
{
    @NotNull
    private MoverType type;
    private double x;
    private double y;
    private double z;
    
    public MoveEvent(@NotNull final MoverType type, final double x, final double y, final double z) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @NotNull
    public final MoverType getType() {
        return this.type;
    }
    
    public final void setType(@NotNull final MoverType <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.type = <set-?>;
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
