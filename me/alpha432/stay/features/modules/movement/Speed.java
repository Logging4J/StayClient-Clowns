//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import me.alpha432.stay.features.modules.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import me.alpha432.stay.util.delegate.*;
import net.minecraft.init.*;
import net.minecraft.potion.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d" }, d2 = { "Lme/alpha432/stay/features/modules/movement/Speed;", "Lme/alpha432/stay/features/modules/Module;", "()V", "boostMotion", "", "getBoostMotion", "()D", "boostMotion$delegate", "Lme/alpha432/stay/util/delegate/Value;", "damageBoost", "", "getDamageBoost", "()Z", "damageBoost$delegate", "hurtTime", "", "getHurtTime", "()I", "hurtTime$delegate", "lastDist", "mode", "Lme/alpha432/stay/features/modules/movement/Speed$SpeedMode;", "getMode", "()Lme/alpha432/stay/features/modules/movement/Speed$SpeedMode;", "mode$delegate", "moveSpeed", "stage", "getBaseMoveSpeed", "SpeedMode", "Stay" })
public final class Speed extends Module
{
    @NotNull
    public static final Speed INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value mode$delegate;
    @NotNull
    private static final Value damageBoost$delegate;
    @NotNull
    private static final Value hurtTime$delegate;
    @NotNull
    private static final Value boostMotion$delegate;
    private static double lastDist;
    private static double moveSpeed;
    private static int stage;
    
    private Speed() {
        super("Speed", "HOPPPPPPPPPPPPPPPPPPPPPPPPPPPP", Module.Category.MOVEMENT, true, false, false);
    }
    
    private final SpeedMode getMode() {
        return Speed.mode$delegate.getValue(this, Speed.$$delegatedProperties[0]);
    }
    
    private final boolean getDamageBoost() {
        return Speed.damageBoost$delegate.getValue(this, Speed.$$delegatedProperties[1]);
    }
    
    private final int getHurtTime() {
        return Speed.hurtTime$delegate.getValue(this, Speed.$$delegatedProperties[2]).intValue();
    }
    
    private final double getBoostMotion() {
        return Speed.boostMotion$delegate.getValue(this, Speed.$$delegatedProperties[3]).doubleValue();
    }
    
    private final double getBaseMoveSpeed() {
        double n = 0.2873;
        if (!Module.mc.player.isPotionActive(MobEffects.SPEED)) {
            return n;
        }
        final double n2 = n;
        final double n3 = 1.0;
        final double n4 = 0.2;
        final PotionEffect getActivePotionEffect = Module.mc.player.getActivePotionEffect(MobEffects.SPEED);
        n = n2 * (n3 + n4 * (((getActivePotionEffect == null) ? 0 : getActivePotionEffect.getAmplifier()) + 1));
        return n;
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
        //    11: ldc             Lme/alpha432/stay/features/modules/movement/Speed;.class
        //    13: ldc             "mode"
        //    15: ldc             "getMode()Lme/alpha432/stay/features/modules/movement/Speed$SpeedMode;"
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
        //    37: ldc             Lme/alpha432/stay/features/modules/movement/Speed;.class
        //    39: ldc             "damageBoost"
        //    41: ldc             "getDamageBoost()Z"
        //    43: iconst_0       
        //    44: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    47: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    50: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    53: checkcast       Lkotlin/reflect/KProperty;
        //    56: aastore        
        //    57: aload_0        
        //    58: iconst_2       
        //    59: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    62: dup            
        //    63: ldc             Lme/alpha432/stay/features/modules/movement/Speed;.class
        //    65: ldc             "hurtTime"
        //    67: ldc             "getHurtTime()I"
        //    69: iconst_0       
        //    70: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    73: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    76: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    79: checkcast       Lkotlin/reflect/KProperty;
        //    82: aastore        
        //    83: aload_0        
        //    84: iconst_3       
        //    85: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    88: dup            
        //    89: ldc             Lme/alpha432/stay/features/modules/movement/Speed;.class
        //    91: ldc             "boostMotion"
        //    93: ldc             "getBoostMotion()D"
        //    95: iconst_0       
        //    96: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    99: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   102: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   105: checkcast       Lkotlin/reflect/KProperty;
        //   108: aastore        
        //   109: aload_0        
        //   110: putstatic       me/alpha432/stay/features/modules/movement/Speed.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   113: new             Lme/alpha432/stay/features/modules/movement/Speed;
        //   116: dup            
        //   117: invokespecial   me/alpha432/stay/features/modules/movement/Speed.<init>:()V
        //   120: putstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   123: getstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   126: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   129: ldc             "Mode"
        //   131: getstatic       me/alpha432/stay/features/modules/movement/Speed$SpeedMode.NORMAL:Lme/alpha432/stay/features/modules/movement/Speed$SpeedMode;
        //   134: checkcast       Ljava/lang/Enum;
        //   137: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //   140: putstatic       me/alpha432/stay/features/modules/movement/Speed.mode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   143: getstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   146: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   149: ldc             "Damage Boost"
        //   151: iconst_0       
        //   152: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //   155: putstatic       me/alpha432/stay/features/modules/movement/Speed.damageBoost$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   158: getstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   161: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   164: ldc             "Hurt time"
        //   166: bipush          10
        //   168: new             Lkotlin/ranges/IntRange;
        //   171: dup            
        //   172: iconst_0       
        //   173: bipush          20
        //   175: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   178: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   181: astore_0       
        //   182: getstatic       me/alpha432/stay/features/modules/movement/Speed$hurtTime$2.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed$hurtTime$2;
        //   185: checkcast       Lkotlin/jvm/functions/Function1;
        //   188: astore_1        /* block$iv */
        //   189: iconst_0       
        //   190: istore_2        /* $i$f$visible */
        //   191: aload_0         /* $this$visible$iv */
        //   192: astore_3       
        //   193: aload_3        
        //   194: astore          it$iv
        //   196: iconst_0       
        //   197: istore          $i$a$-also-ValueKt$visible$1$iv
        //   199: aload           it$iv
        //   201: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   204: dup            
        //   205: aload_1         /* block$iv */
        //   206: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   209: checkcast       Ljava/util/function/Predicate;
        //   212: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   215: aload_3        
        //   216: nop            
        //   217: putstatic       me/alpha432/stay/features/modules/movement/Speed.hurtTime$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   220: getstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   223: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   226: ldc_w           "Motion Multiplier"
        //   229: dconst_1       
        //   230: dconst_1       
        //   231: ldc2_w          10.0
        //   234: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //   237: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //   240: astore_0       
        //   241: getstatic       me/alpha432/stay/features/modules/movement/Speed$boostMotion$2.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed$boostMotion$2;
        //   244: checkcast       Lkotlin/jvm/functions/Function1;
        //   247: astore_1        /* block$iv */
        //   248: iconst_0       
        //   249: istore_2        /* $i$f$visible */
        //   250: aload_0         /* $this$visible$iv */
        //   251: astore_3       
        //   252: aload_3        
        //   253: astore          it$iv
        //   255: iconst_0       
        //   256: istore          $i$a$-also-ValueKt$visible$1$iv
        //   258: aload           it$iv
        //   260: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   263: dup            
        //   264: aload_1         /* block$iv */
        //   265: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   268: checkcast       Ljava/util/function/Predicate;
        //   271: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   274: aload_3        
        //   275: nop            
        //   276: putstatic       me/alpha432/stay/features/modules/movement/Speed.boostMotion$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   279: nop            
        //   280: getstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   283: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   286: astore_0       
        //   287: getstatic       me/alpha432/stay/features/modules/movement/Speed$1.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed$1;
        //   290: checkcast       Lkotlin/jvm/functions/Function1;
        //   293: astore_1        /* function$iv */
        //   294: iconst_0       
        //   295: istore_2        /* $i$f$safeListener */
        //   296: getstatic       me/alpha432/stay/event/Listener.INSTANCE:Lme/alpha432/stay/event/Listener;
        //   299: astore_3       
        //   300: ldc_w           Lme/alpha432/stay/event/MotionUpdateEvent;.class
        //   303: astore          clazz$iv$iv
        //   305: iconst_0       
        //   306: istore          $i$f$register
        //   308: aload_3         /* this_$iv$iv */
        //   309: invokevirtual   me/alpha432/stay/event/Listener.getListeners:()Ljava/util/List;
        //   312: aload           clazz$iv$iv
        //   314: aload_1         /* function$iv */
        //   315: iconst_1       
        //   316: invokestatic    kotlin/jvm/internal/TypeIntrinsics.beforeCheckcastToFunctionOfArity:(Ljava/lang/Object;I)Ljava/lang/Object;
        //   319: checkcast       Lkotlin/jvm/functions/Function1;
        //   322: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   325: aload_0         /* $this$safeListener$iv */
        //   326: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   329: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   334: pop            
        //   335: nop            
        //   336: nop            
        //   337: getstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   340: getstatic       me/alpha432/stay/features/modules/movement/Speed$2.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed$2;
        //   343: checkcast       Lkotlin/jvm/functions/Function0;
        //   346: invokevirtual   me/alpha432/stay/features/modules/movement/Speed.onTick:(Lkotlin/jvm/functions/Function0;)V
        //   349: getstatic       me/alpha432/stay/features/modules/movement/Speed.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed;
        //   352: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   355: astore_0       
        //   356: getstatic       me/alpha432/stay/features/modules/movement/Speed$3.INSTANCE:Lme/alpha432/stay/features/modules/movement/Speed$3;
        //   359: checkcast       Lkotlin/jvm/functions/Function1;
        //   362: astore_1        /* function$iv */
        //   363: iconst_0       
        //   364: istore_2        /* $i$f$safeListener */
        //   365: getstatic       me/alpha432/stay/event/Listener.INSTANCE:Lme/alpha432/stay/event/Listener;
        //   368: astore_3       
        //   369: ldc_w           Lme/alpha432/stay/event/MoveEvent;.class
        //   372: astore          clazz$iv$iv
        //   374: iconst_0       
        //   375: istore          $i$f$register
        //   377: aload_3         /* this_$iv$iv */
        //   378: invokevirtual   me/alpha432/stay/event/Listener.getListeners:()Ljava/util/List;
        //   381: aload           clazz$iv$iv
        //   383: aload_1         /* function$iv */
        //   384: iconst_1       
        //   385: invokestatic    kotlin/jvm/internal/TypeIntrinsics.beforeCheckcastToFunctionOfArity:(Ljava/lang/Object;I)Ljava/lang/Object;
        //   388: checkcast       Lkotlin/jvm/functions/Function1;
        //   391: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   394: aload_0         /* $this$safeListener$iv */
        //   395: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   398: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   403: pop            
        //   404: nop            
        //   405: nop            
        //   406: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/features/modules/movement/Speed$SpeedMode;", "", "(Ljava/lang/String;I)V", "NORMAL", "STRICT", "Stay" })
    private enum SpeedMode
    {
        NORMAL, 
        STRICT;
        
        private static final /* synthetic */ SpeedMode[] $values() {
            return new SpeedMode[] { SpeedMode.NORMAL, SpeedMode.STRICT };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
