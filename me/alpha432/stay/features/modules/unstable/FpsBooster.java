//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.unstable;

import me.alpha432.stay.features.modules.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import me.alpha432.stay.util.delegate.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lme/alpha432/stay/features/modules/unstable/FpsBooster;", "Lme/alpha432/stay/features/modules/Module;", "()V", "boost", "", "getBoost", "()I", "boost$delegate", "Lme/alpha432/stay/util/delegate/Value;", "currentFps", "getCurrentFps", "setCurrentFps", "(I)V", "mode", "Lme/alpha432/stay/features/modules/unstable/FpsBooster$BoostMode;", "getMode", "()Lme/alpha432/stay/features/modules/unstable/FpsBooster$BoostMode;", "mode$delegate", "BoostMode", "Stay" })
public final class FpsBooster extends Module
{
    @NotNull
    public static final FpsBooster INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value mode$delegate;
    @NotNull
    private static final Value boost$delegate;
    private static int currentFps;
    
    private FpsBooster() {
        super("Fps Bypass", "LOL", Module.Category.UNSTABLE, true, false, false);
    }
    
    private final BoostMode getMode() {
        return FpsBooster.mode$delegate.getValue(this, FpsBooster.$$delegatedProperties[0]);
    }
    
    private final int getBoost() {
        return FpsBooster.boost$delegate.getValue(this, FpsBooster.$$delegatedProperties[1]).intValue();
    }
    
    public final int getCurrentFps() {
        return FpsBooster.currentFps;
    }
    
    public final void setCurrentFps(final int <set-?>) {
        FpsBooster.currentFps = <set-?>;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Lkotlin/reflect/KProperty;
        //     4: astore_0       
        //     5: aload_0        
        //     6: iconst_0       
        //     7: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    10: dup            
        //    11: ldc             Lme/alpha432/stay/features/modules/unstable/FpsBooster;.class
        //    13: ldc             "mode"
        //    15: ldc             "getMode()Lme/alpha432/stay/features/modules/unstable/FpsBooster$BoostMode;"
        //    17: iconst_0       
        //    18: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    21: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    24: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    27: checkcast       Lkotlin/reflect/KProperty;
        //    30: aastore        
        //    31: aload_0        
        //    32: iconst_1       
        //    33: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    36: dup            
        //    37: ldc             Lme/alpha432/stay/features/modules/unstable/FpsBooster;.class
        //    39: ldc             "boost"
        //    41: ldc             "getBoost()I"
        //    43: iconst_0       
        //    44: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    47: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    50: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    53: checkcast       Lkotlin/reflect/KProperty;
        //    56: aastore        
        //    57: aload_0        
        //    58: putstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //    61: new             Lme/alpha432/stay/features/modules/unstable/FpsBooster;
        //    64: dup            
        //    65: invokespecial   me/alpha432/stay/features/modules/unstable/FpsBooster.<init>:()V
        //    68: putstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.INSTANCE:Lme/alpha432/stay/features/modules/unstable/FpsBooster;
        //    71: getstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.INSTANCE:Lme/alpha432/stay/features/modules/unstable/FpsBooster;
        //    74: checkcast       Lme/alpha432/stay/features/modules/Module;
        //    77: ldc             "Mode"
        //    79: getstatic       me/alpha432/stay/features/modules/unstable/FpsBooster$BoostMode.ADD:Lme/alpha432/stay/features/modules/unstable/FpsBooster$BoostMode;
        //    82: checkcast       Ljava/lang/Enum;
        //    85: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //    88: putstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.mode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //    91: getstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.INSTANCE:Lme/alpha432/stay/features/modules/unstable/FpsBooster;
        //    94: checkcast       Lme/alpha432/stay/features/modules/Module;
        //    97: ldc             "Boost"
        //    99: sipush          1000
        //   102: new             Lkotlin/ranges/IntRange;
        //   105: dup            
        //   106: iconst_0       
        //   107: sipush          2000
        //   110: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   113: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   116: putstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.boost$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   119: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   122: getfield        net/minecraft/client/Minecraft.fpsCounter:I
        //   125: putstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.currentFps:I
        //   128: nop            
        //   129: getstatic       me/alpha432/stay/features/modules/unstable/FpsBooster.INSTANCE:Lme/alpha432/stay/features/modules/unstable/FpsBooster;
        //   132: checkcast       Lcakeslayers/team/eventsystem/IListenerOwner;
        //   135: astore_0       
        //   136: getstatic       me/alpha432/stay/features/modules/unstable/FpsBooster$1.INSTANCE:Lme/alpha432/stay/features/modules/unstable/FpsBooster$1;
        //   139: checkcast       Lkotlin/jvm/functions/Function2;
        //   142: astore_1        /* function$iv */
        //   143: iconst_0       
        //   144: istore_2        /* $i$f$safeListener */
        //   145: aload_0         /* $this$safeListener$iv */
        //   146: ldc             Lcakeslayers/team/eventsystem/impl/TickEvent$Pre;.class
        //   148: iconst_0       
        //   149: iconst_0       
        //   150: new             Lme/alpha432/stay/features/modules/unstable/FpsBooster$special$$inlined$safeListener$1;
        //   153: dup            
        //   154: aload_1         /* function$iv */
        //   155: invokespecial   me/alpha432/stay/features/modules/unstable/FpsBooster$special$$inlined$safeListener$1.<init>:(Lkotlin/jvm/functions/Function2;)V
        //   158: checkcast       Lkotlin/jvm/functions/Function1;
        //   161: invokestatic    cakeslayers/team/eventsystem/ListenersKt.listener:(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;IZLkotlin/jvm/functions/Function1;)V
        //   164: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/features/modules/unstable/FpsBooster$BoostMode;", "", "(Ljava/lang/String;I)V", "ADD", "SET", "Stay" })
    private enum BoostMode
    {
        ADD, 
        SET;
        
        private static final /* synthetic */ BoostMode[] $values() {
            return new BoostMode[] { BoostMode.ADD, BoostMode.SET };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
