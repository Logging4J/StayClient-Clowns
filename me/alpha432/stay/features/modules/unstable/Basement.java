//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.unstable;

import me.alpha432.stay.features.modules.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.util.delegate.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lme/alpha432/stay/features/modules/unstable/Basement;", "Lme/alpha432/stay/features/modules/Module;", "()V", "clear", "Lme/alpha432/stay/util/delegate/Value;", "", "maxPriority", "using", "Stay" })
public final class Basement extends Module
{
    @NotNull
    public static final Basement INSTANCE;
    @NotNull
    private static final Value<Boolean> using;
    @NotNull
    private static final Value<Boolean> clear;
    @NotNull
    private static final Value<Boolean> maxPriority;
    
    private Basement() {
        super("ThreadController", "", Module.Category.UNSTABLE, true, false, false);
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   me/alpha432/stay/features/modules/unstable/Basement.<init>:()V
        //     7: putstatic       me/alpha432/stay/features/modules/unstable/Basement.INSTANCE:Lme/alpha432/stay/features/modules/unstable/Basement;
        //    10: getstatic       me/alpha432/stay/features/modules/unstable/Basement.INSTANCE:Lme/alpha432/stay/features/modules/unstable/Basement;
        //    13: checkcast       Lme/alpha432/stay/features/modules/Module;
        //    16: ldc             "Use"
        //    18: iconst_0       
        //    19: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //    22: putstatic       me/alpha432/stay/features/modules/unstable/Basement.using:Lme/alpha432/stay/util/delegate/Value;
        //    25: getstatic       me/alpha432/stay/features/modules/unstable/Basement.INSTANCE:Lme/alpha432/stay/features/modules/unstable/Basement;
        //    28: checkcast       Lme/alpha432/stay/features/modules/Module;
        //    31: ldc             "ClearMemory"
        //    33: iconst_0       
        //    34: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //    37: putstatic       me/alpha432/stay/features/modules/unstable/Basement.clear:Lme/alpha432/stay/util/delegate/Value;
        //    40: getstatic       me/alpha432/stay/features/modules/unstable/Basement.INSTANCE:Lme/alpha432/stay/features/modules/unstable/Basement;
        //    43: checkcast       Lme/alpha432/stay/features/modules/Module;
        //    46: ldc             "ThreadPriority"
        //    48: iconst_0       
        //    49: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //    52: putstatic       me/alpha432/stay/features/modules/unstable/Basement.maxPriority:Lme/alpha432/stay/util/delegate/Value;
        //    55: nop            
        //    56: getstatic       me/alpha432/stay/features/modules/unstable/Basement.INSTANCE:Lme/alpha432/stay/features/modules/unstable/Basement;
        //    59: checkcast       Lcakeslayers/team/eventsystem/IListenerOwner;
        //    62: astore_0       
        //    63: iconst_1       
        //    64: istore_1       
        //    65: getstatic       me/alpha432/stay/features/modules/unstable/Basement$1.INSTANCE:Lme/alpha432/stay/features/modules/unstable/Basement$1;
        //    68: checkcast       Lkotlin/jvm/functions/Function2;
        //    71: astore_2        /* function$iv */
        //    72: iconst_0       
        //    73: istore_3        /* $i$f$safeListener */
        //    74: aload_0         /* $this$safeListener$iv */
        //    75: ldc             Lcakeslayers/team/eventsystem/impl/ClientChangeEvent$SettingChange;.class
        //    77: iconst_0       
        //    78: iload_1         /* alwaysListening$iv */
        //    79: new             Lme/alpha432/stay/features/modules/unstable/Basement$special$$inlined$safeListener$1;
        //    82: dup            
        //    83: aload_2         /* function$iv */
        //    84: invokespecial   me/alpha432/stay/features/modules/unstable/Basement$special$$inlined$safeListener$1.<init>:(Lkotlin/jvm/functions/Function2;)V
        //    87: checkcast       Lkotlin/jvm/functions/Function1;
        //    90: invokestatic    cakeslayers/team/eventsystem/ListenersKt.listener:(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;IZLkotlin/jvm/functions/Function1;)V
        //    93: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
