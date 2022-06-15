//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.delegate;

import kotlin.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import java.util.*;
import me.alpha432.stay.util.counting.*;
import kotlin.reflect.*;
import cakeslayers.team.eventsystem.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u000b\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u000b\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ$\u0010\t\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0086\u0002¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0017" }, d2 = { "Lme/alpha432/stay/util/delegate/FrameValue;", "T", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "lastUpdateFrame", "", "value", "getValue", "()Ljava/lang/Object;", "value0", "Ljava/lang/Object;", "get", "getForce", "getLazy", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "updateLazy", "", "Companion", "Stay" })
public final class FrameValue<T>
{
    @NotNull
    private static final Companion Companion;
    @NotNull
    private final Function0<T> block;
    @Nullable
    private T value0;
    private int lastUpdateFrame;
    @Deprecated
    @NotNull
    private static final ArrayList<FrameValue<?>> instances;
    @Deprecated
    @NotNull
    private static final TickTimer timer;
    @Deprecated
    private static int frame;
    
    public FrameValue(@NotNull final Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        this.block = (kotlin.jvm.functions.Function0<T>)block;
        FrameValue.instances.add(this);
    }
    
    public final T getValue() {
        return this.get();
    }
    
    public final T get() {
        return (this.lastUpdateFrame == FrameValue.frame) ? this.getLazy() : this.getForce();
    }
    
    public final T getLazy() {
        T t;
        if ((t = this.value0) == null) {
            t = this.getForce();
        }
        return t;
    }
    
    public final T getForce() {
        final Object value = this.block.invoke();
        this.value0 = (T)value;
        this.lastUpdateFrame = FrameValue.frame;
        return (T)value;
    }
    
    public final void updateLazy() {
        this.value0 = null;
    }
    
    public final T getValue(@Nullable final Object thisRef, @NotNull final KProperty<?> property) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        return this.get();
    }
    
    public static final /* synthetic */ ArrayList access$getInstances$cp() {
        return FrameValue.instances;
    }
    
    public static final /* synthetic */ TickTimer access$getTimer$cp() {
        return FrameValue.timer;
    }
    
    public static final /* synthetic */ int access$getFrame$cp() {
        return FrameValue.frame;
    }
    
    public static final /* synthetic */ void access$setFrame$cp(final int <set-?>) {
        FrameValue.frame = <set-?>;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aconst_null    
        //     5: invokespecial   me/alpha432/stay/util/delegate/FrameValue$Companion.<init>:(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        //     8: putstatic       me/alpha432/stay/util/delegate/FrameValue.Companion:Lme/alpha432/stay/util/delegate/FrameValue$Companion;
        //    11: new             Ljava/util/ArrayList;
        //    14: dup            
        //    15: invokespecial   java/util/ArrayList.<init>:()V
        //    18: putstatic       me/alpha432/stay/util/delegate/FrameValue.instances:Ljava/util/ArrayList;
        //    21: new             Lme/alpha432/stay/util/counting/TickTimer;
        //    24: dup            
        //    25: getstatic       me/alpha432/stay/util/counting/TimeUnit.SECONDS:Lme/alpha432/stay/util/counting/TimeUnit;
        //    28: invokespecial   me/alpha432/stay/util/counting/TickTimer.<init>:(Lme/alpha432/stay/util/counting/TimeUnit;)V
        //    31: putstatic       me/alpha432/stay/util/delegate/FrameValue.timer:Lme/alpha432/stay/util/counting/TickTimer;
        //    34: nop            
        //    35: getstatic       me/alpha432/stay/util/delegate/FrameValue.Companion:Lme/alpha432/stay/util/delegate/FrameValue$Companion;
        //    38: checkcast       Lcakeslayers/team/eventsystem/IListenerOwner;
        //    41: astore_0       
        //    42: getstatic       me/alpha432/stay/util/delegate/FrameValue$Companion$1.INSTANCE:Lme/alpha432/stay/util/delegate/FrameValue$Companion$1;
        //    45: checkcast       Lkotlin/jvm/functions/Function1;
        //    48: astore_1        /* function$iv */
        //    49: iconst_0       
        //    50: istore_2        /* $i$f$listener */
        //    51: aload_0         /* $this$listener$iv */
        //    52: ldc             Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Render;.class
        //    54: iconst_0       
        //    55: iconst_0       
        //    56: aload_1         /* function$iv */
        //    57: invokestatic    cakeslayers/team/eventsystem/ListenersKt.listener:(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;IZLkotlin/jvm/functions/Function1;)V
        //    60: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR)\u0010\t\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013" }, d2 = { "Lme/alpha432/stay/util/delegate/FrameValue$Companion;", "Lcakeslayers/team/eventsystem/AlwaysListening;", "()V", "frame", "", "getFrame", "()I", "setFrame", "(I)V", "instances", "Ljava/util/ArrayList;", "Lme/alpha432/stay/util/delegate/FrameValue;", "Lkotlin/collections/ArrayList;", "getInstances", "()Ljava/util/ArrayList;", "timer", "Lme/alpha432/stay/util/counting/TickTimer;", "getTimer", "()Lme/alpha432/stay/util/counting/TickTimer;", "Stay" })
    private static final class Companion implements AlwaysListening
    {
        @NotNull
        public final ArrayList<FrameValue<?>> getInstances() {
            return (ArrayList<FrameValue<?>>)FrameValue.access$getInstances$cp();
        }
        
        @NotNull
        public final TickTimer getTimer() {
            return FrameValue.access$getTimer$cp();
        }
        
        public final int getFrame() {
            return FrameValue.access$getFrame$cp();
        }
        
        public final void setFrame(final int <set-?>) {
            FrameValue.access$setFrame$cp(<set-?>);
        }
        
        public void register(@NotNull final Listener listener) {
            AlwaysListening.DefaultImpls.register((AlwaysListening)this, listener);
        }
        
        public void register(@NotNull final ParallelListener listener) {
            AlwaysListening.DefaultImpls.register((AlwaysListening)this, listener);
        }
        
        public void subscribe() {
            AlwaysListening.DefaultImpls.subscribe((AlwaysListening)this);
        }
        
        public void unsubscribe() {
            AlwaysListening.DefaultImpls.unsubscribe((AlwaysListening)this);
        }
    }
}
