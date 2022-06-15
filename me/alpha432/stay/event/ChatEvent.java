//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Cancelable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lme/alpha432/stay/event/ChatEvent;", "Lme/alpha432/stay/event/EventStage;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "Stay" })
public final class ChatEvent extends EventStage
{
    @NotNull
    private final String msg;
    
    public ChatEvent(@NotNull final String msg) {
        Intrinsics.checkNotNullParameter((Object)msg, "msg");
        this.msg = msg;
    }
    
    @NotNull
    public final String getMsg() {
        return this.msg;
    }
}
