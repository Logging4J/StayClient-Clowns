//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.basement.wrapper;

import kotlin.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.multiplayer.*;
import kotlin.jvm.*;
import cakeslayers.team.eventsystem.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048G¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\f8G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010" }, d2 = { "Lme/alpha432/stay/util/basement/wrapper/MinecraftWrapper;", "Lcakeslayers/team/eventsystem/AlwaysListening;", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "getMc", "()Lnet/minecraft/client/Minecraft;", "<set-?>", "Lnet/minecraft/client/entity/EntityPlayerSP;", "player", "getPlayer", "()Lnet/minecraft/client/entity/EntityPlayerSP;", "Lnet/minecraft/client/multiplayer/WorldClient;", "world", "getWorld", "()Lnet/minecraft/client/multiplayer/WorldClient;", "Stay" })
public final class MinecraftWrapper implements AlwaysListening
{
    @NotNull
    public static final MinecraftWrapper INSTANCE;
    @NotNull
    private static final Minecraft mc;
    @Nullable
    private static EntityPlayerSP player;
    @Nullable
    private static WorldClient world;
    
    private MinecraftWrapper() {
    }
    
    @JvmStatic
    @NotNull
    public static final Minecraft getMc() {
        return MinecraftWrapper.mc;
    }
    
    @JvmStatic
    @Nullable
    public static final EntityPlayerSP getPlayer() {
        return MinecraftWrapper.player;
    }
    
    @JvmStatic
    @Nullable
    public static final WorldClient getWorld() {
        return MinecraftWrapper.world;
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
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.<init>:()V
        //     7: putstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.INSTANCE:Lme/alpha432/stay/util/basement/wrapper/MinecraftWrapper;
        //    10: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //    13: astore_0       
        //    14: aload_0        
        //    15: ldc             "getMinecraft()"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload_0        
        //    21: putstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.mc:Lnet/minecraft/client/Minecraft;
        //    24: getstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.mc:Lnet/minecraft/client/Minecraft;
        //    27: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    30: putstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    33: getstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.mc:Lnet/minecraft/client/Minecraft;
        //    36: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    39: putstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    42: nop            
        //    43: getstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.INSTANCE:Lme/alpha432/stay/util/basement/wrapper/MinecraftWrapper;
        //    46: checkcast       Lcakeslayers/team/eventsystem/IListenerOwner;
        //    49: astore_0       
        //    50: ldc             2147483647
        //    52: istore_1       
        //    53: getstatic       me/alpha432/stay/util/basement/wrapper/MinecraftWrapper$1.INSTANCE:Lme/alpha432/stay/util/basement/wrapper/MinecraftWrapper$1;
        //    56: checkcast       Lkotlin/jvm/functions/Function2;
        //    59: astore_2        /* function$iv */
        //    60: iconst_0       
        //    61: istore_3        /* $i$f$safeListener */
        //    62: aload_0         /* $this$safeListener$iv */
        //    63: ldc             Lcakeslayers/team/eventsystem/impl/TickEvent$Post;.class
        //    65: iload_1         /* priority$iv */
        //    66: iconst_0       
        //    67: new             Lme/alpha432/stay/util/basement/wrapper/MinecraftWrapper$special$$inlined$safeListener$1;
        //    70: dup            
        //    71: aload_2         /* function$iv */
        //    72: invokespecial   me/alpha432/stay/util/basement/wrapper/MinecraftWrapper$special$$inlined$safeListener$1.<init>:(Lkotlin/jvm/functions/Function2;)V
        //    75: checkcast       Lkotlin/jvm/functions/Function1;
        //    78: invokestatic    cakeslayers/team/eventsystem/ListenersKt.listener:(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;IZLkotlin/jvm/functions/Function1;)V
        //    81: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
