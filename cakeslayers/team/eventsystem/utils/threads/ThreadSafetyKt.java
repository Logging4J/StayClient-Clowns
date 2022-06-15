//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.utils.threads;

import cakeslayers.team.eventsystem.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.coroutines.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0006\u001aB\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012'\u0010\u0002\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0005H\u0086@\u00f8\u0001\u0001¢\u0006\u0002\u0010\u000b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\f" }, d2 = { "runSafe", "R", "block", "Lkotlin/Function1;", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "runSafeSuspend", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Stay" })
public final class ThreadSafetyKt
{
    @Nullable
    public static final <R> R runSafe(@NotNull final Function1<? super SafeClientEvent, ? extends R> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final int $i$f$runSafe = 0;
        final SafeClientEvent instance = SafeClientEvent.Companion.getInstance();
        return (R)((instance != null) ? block.invoke((Object)instance) : null);
    }
    
    @Nullable
    public static final <R> Object runSafeSuspend(@NotNull final Function2<? super SafeClientEvent, ? super Continuation<? super R>, ?> block, @NotNull final Continuation<? super R> continuation) {
        final Continuation $continuation;
        Label_0049: {
            if (continuation instanceof ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1) {
                final ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1 threadSafetyKt$runSafeSuspend$1 = (ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1)continuation;
                if ((threadSafetyKt$runSafeSuspend$1.label & Integer.MIN_VALUE) != 0x0) {
                    final ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1 threadSafetyKt$runSafeSuspend$2 = threadSafetyKt$runSafeSuspend$1;
                    threadSafetyKt$runSafeSuspend$2.label -= Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            $continuation = (Continuation)new ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1((Continuation)continuation);
        }
        final Object $result = ((ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1)$continuation).result;
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object invoke = null;
        switch (((ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1)$continuation).label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                final SafeClientEvent instance = SafeClientEvent.Companion.getInstance();
                if (instance == null) {
                    invoke = null;
                    break;
                }
                final SafeClientEvent it = instance;
                final int n = 0;
                final SafeClientEvent safeClientEvent = it;
                final Continuation continuation2 = $continuation;
                ((ThreadSafetyKt$runSafeSuspend.ThreadSafetyKt$runSafeSuspend$1)$continuation).label = 1;
                if ((invoke = block.invoke((Object)safeClientEvent, (Object)continuation2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                break;
            }
            case 1: {
                final int n = 0;
                ResultKt.throwOnFailure($result);
                invoke = $result;
                break;
            }
            default: {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        return invoke;
    }
}
