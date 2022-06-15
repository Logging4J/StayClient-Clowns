//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lme/alpha432/stay/features/modules/render/NameTags3Helper;", "Lme/alpha432/stay/features/modules/Module;", "()V", "<set-?>", "Lnet/minecraft/util/math/Vec3d;", "camPos", "getCamPos", "()Lnet/minecraft/util/math/Vec3d;", "", "partialTicks", "getPartialTicks$annotations", "getPartialTicks", "()F", "Stay" })
public final class NameTags3Helper extends Module
{
    @NotNull
    public static final NameTags3Helper INSTANCE;
    private static float partialTicks;
    @NotNull
    private static Vec3d camPos;
    
    private NameTags3Helper() {
        super("NameTags3$$Helper$$$", "", Module.Category.VISUAL, true, true, true);
    }
    
    public static final float getPartialTicks() {
        return NameTags3Helper.partialTicks;
    }
    
    @NotNull
    public final Vec3d getCamPos() {
        return NameTags3Helper.camPos;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   me/alpha432/stay/features/modules/render/NameTags3Helper.<init>:()V
        //     7: putstatic       me/alpha432/stay/features/modules/render/NameTags3Helper.INSTANCE:Lme/alpha432/stay/features/modules/render/NameTags3Helper;
        //    10: getstatic       net/minecraft/util/math/Vec3d.ZERO:Lnet/minecraft/util/math/Vec3d;
        //    13: astore_0       
        //    14: aload_0        
        //    15: ldc             "ZERO"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload_0        
        //    21: putstatic       me/alpha432/stay/features/modules/render/NameTags3Helper.camPos:Lnet/minecraft/util/math/Vec3d;
        //    24: nop            
        //    25: getstatic       me/alpha432/stay/features/modules/render/NameTags3Helper.INSTANCE:Lme/alpha432/stay/features/modules/render/NameTags3Helper;
        //    28: getstatic       me/alpha432/stay/features/modules/render/NameTags3Helper$1.INSTANCE:Lme/alpha432/stay/features/modules/render/NameTags3Helper$1;
        //    31: checkcast       Lkotlin/jvm/functions/Function0;
        //    34: invokevirtual   me/alpha432/stay/features/modules/render/NameTags3Helper.onTick:(Lkotlin/jvm/functions/Function0;)V
        //    37: getstatic       me/alpha432/stay/features/modules/render/NameTags3Helper.INSTANCE:Lme/alpha432/stay/features/modules/render/NameTags3Helper;
        //    40: checkcast       Lme/alpha432/stay/features/modules/Module;
        //    43: astore_0       
        //    44: getstatic       me/alpha432/stay/features/modules/render/NameTags3Helper$2.INSTANCE:Lme/alpha432/stay/features/modules/render/NameTags3Helper$2;
        //    47: checkcast       Lkotlin/jvm/functions/Function1;
        //    50: astore_1        /* function$iv */
        //    51: iconst_0       
        //    52: istore_2        /* $i$f$safeListener */
        //    53: getstatic       me/alpha432/stay/event/Listener.INSTANCE:Lme/alpha432/stay/event/Listener;
        //    56: astore_3       
        //    57: ldc             Lme/alpha432/stay/event/Render3DEvent;.class
        //    59: astore          clazz$iv$iv
        //    61: iconst_0       
        //    62: istore          $i$f$register
        //    64: aload_3         /* this_$iv$iv */
        //    65: invokevirtual   me/alpha432/stay/event/Listener.getListeners:()Ljava/util/List;
        //    68: aload           clazz$iv$iv
        //    70: aload_1         /* function$iv */
        //    71: iconst_1       
        //    72: invokestatic    kotlin/jvm/internal/TypeIntrinsics.beforeCheckcastToFunctionOfArity:(Ljava/lang/Object;I)Ljava/lang/Object;
        //    75: checkcast       Lkotlin/jvm/functions/Function1;
        //    78: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    81: aload_0         /* $this$safeListener$iv */
        //    82: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    85: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    90: pop            
        //    91: nop            
        //    92: nop            
        //    93: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
