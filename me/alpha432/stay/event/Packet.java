//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Cancelable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010" }, d2 = { "Lme/alpha432/stay/event/Packet;", "Lnet/minecraftforge/fml/common/eventhandler/Event;", "packet", "", "type", "Lme/alpha432/stay/event/Packet$Type;", "(Ljava/lang/Object;Lme/alpha432/stay/event/Packet$Type;)V", "getPacket", "()Ljava/lang/Object;", "setPacket", "(Ljava/lang/Object;)V", "getType", "()Lme/alpha432/stay/event/Packet$Type;", "setType", "(Lme/alpha432/stay/event/Packet$Type;)V", "Type", "Stay" })
public final class Packet extends Event
{
    @NotNull
    private Object packet;
    @NotNull
    private Type type;
    
    public Packet(@NotNull final Object packet, @NotNull final Type type) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.packet = packet;
        this.type = type;
    }
    
    @NotNull
    public final Object getPacket() {
        return this.packet;
    }
    
    public final void setPacket(@NotNull final Object <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.packet = <set-?>;
    }
    
    @NotNull
    public final Type getType() {
        return this.type;
    }
    
    public final void setType(@NotNull final Type <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.type = <set-?>;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/event/Packet$Type;", "", "(Ljava/lang/String;I)V", "INCOMING", "OUTGOING", "Stay" })
    public enum Type
    {
        INCOMING, 
        OUTGOING;
        
        private static final /* synthetic */ Type[] $values() {
            return new Type[] { Type.INCOMING, Type.OUTGOING };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
