//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b" }, d2 = { "Lcakeslayers/team/eventsystem/Listener;", "Lcakeslayers/team/eventsystem/AbstractListener;", "Lkotlin/Function1;", "", "", "owner", "eventID", "", "priority", "function", "(Ljava/lang/Object;IILkotlin/jvm/functions/Function1;)V", "Stay" })
public final class Listener extends AbstractListener<Function1<? super Object, ? extends Unit>>
{
    public Listener(@NotNull final Object owner, final int eventID, final int priority, @NotNull final Function1<Object, Unit> function) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        super(owner, eventID, priority, (Object)function, (DefaultConstructorMarker)null);
    }
}
