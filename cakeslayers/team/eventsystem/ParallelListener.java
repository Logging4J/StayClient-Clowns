//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.jvm.functions.*;
import kotlin.coroutines.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B<\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u00f8\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b" }, d2 = { "Lcakeslayers/team/eventsystem/ParallelListener;", "Lcakeslayers/team/eventsystem/AbstractListener;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "owner", "eventID", "", "function", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)V", "Stay" })
public final class ParallelListener extends AbstractListener<Function2<? super Object, ? super Continuation<? super Unit>, ?>>
{
    public ParallelListener(@NotNull final Object owner, final int eventID, @NotNull final Function2<Object, ? super Continuation<? super Unit>, ?> function) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter((Object)function, "function");
        super(owner, eventID, 0, (Object)function, (DefaultConstructorMarker)null);
    }
}
