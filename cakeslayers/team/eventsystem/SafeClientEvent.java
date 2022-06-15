//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.network.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import me.alpha432.stay.util.basement.wrapper.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ0\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00140\u0016¢\u0006\u0002\b\u0017H\u0086\n\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a" }, d2 = { "Lcakeslayers/team/eventsystem/SafeClientEvent;", "Lcakeslayers/team/eventsystem/AbstractClientEvent;", "world", "Lnet/minecraft/client/multiplayer/WorldClient;", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "playerController", "Lnet/minecraft/client/multiplayer/PlayerControllerMP;", "connection", "Lnet/minecraft/client/network/NetHandlerPlayClient;", "(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/PlayerControllerMP;Lnet/minecraft/client/network/NetHandlerPlayClient;)V", "getConnection", "()Lnet/minecraft/client/network/NetHandlerPlayClient;", "getPlayer", "()Lnet/minecraft/client/entity/EntityPlayerSP;", "getPlayerController", "()Lnet/minecraft/client/multiplayer/PlayerControllerMP;", "getWorld", "()Lnet/minecraft/client/multiplayer/WorldClient;", "invoke", "T", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "Stay" })
public class SafeClientEvent extends AbstractClientEvent
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final WorldClient world;
    @NotNull
    private final EntityPlayerSP player;
    @NotNull
    private final PlayerControllerMP playerController;
    @NotNull
    private final NetHandlerPlayClient connection;
    @Nullable
    private static SafeClientEvent instance;
    
    public SafeClientEvent(@NotNull final WorldClient world, @NotNull final EntityPlayerSP player, @NotNull final PlayerControllerMP playerController, @NotNull final NetHandlerPlayClient connection) {
        Intrinsics.checkNotNullParameter((Object)world, "world");
        Intrinsics.checkNotNullParameter((Object)player, "player");
        Intrinsics.checkNotNullParameter((Object)playerController, "playerController");
        Intrinsics.checkNotNullParameter((Object)connection, "connection");
        this.world = world;
        this.player = player;
        this.playerController = playerController;
        this.connection = connection;
    }
    
    @NotNull
    public WorldClient getWorld() {
        return this.world;
    }
    
    @NotNull
    public EntityPlayerSP getPlayer() {
        return this.player;
    }
    
    @NotNull
    public PlayerControllerMP getPlayerController() {
        return this.playerController;
    }
    
    @NotNull
    public NetHandlerPlayClient getConnection() {
        return this.connection;
    }
    
    public final <T> T invoke(@NotNull final Function1<? super SafeClientEvent, ? extends T> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final int $i$f$invoke = 0;
        return (T)block.invoke((Object)this);
    }
    
    public static final /* synthetic */ SafeClientEvent access$getInstance$cp() {
        return SafeClientEvent.instance;
    }
    
    public static final /* synthetic */ void access$setInstance$cp(final SafeClientEvent <set-?>) {
        SafeClientEvent.instance = <set-?>;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aconst_null    
        //     5: invokespecial   cakeslayers/team/eventsystem/SafeClientEvent$Companion.<init>:(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        //     8: putstatic       cakeslayers/team/eventsystem/SafeClientEvent.Companion:Lcakeslayers/team/eventsystem/SafeClientEvent$Companion;
        //    11: nop            
        //    12: getstatic       cakeslayers/team/eventsystem/SafeClientEvent.Companion:Lcakeslayers/team/eventsystem/SafeClientEvent$Companion;
        //    15: checkcast       Lcakeslayers/team/eventsystem/IListenerOwner;
        //    18: astore_0       
        //    19: ldc             2147483647
        //    21: istore_1       
        //    22: iconst_1       
        //    23: istore_2       
        //    24: getstatic       cakeslayers/team/eventsystem/SafeClientEvent$Companion$1.INSTANCE:Lcakeslayers/team/eventsystem/SafeClientEvent$Companion$1;
        //    27: checkcast       Lkotlin/jvm/functions/Function1;
        //    30: astore_3        /* function$iv */
        //    31: iconst_0       
        //    32: istore          $i$f$listener
        //    34: aload_0         /* $this$listener$iv */
        //    35: ldc             Lcakeslayers/team/eventsystem/impl/ConnectionEvent$Disconnect;.class
        //    37: iload_1         /* priority$iv */
        //    38: iload_2         /* alwaysListening$iv */
        //    39: aload_3         /* function$iv */
        //    40: invokestatic    cakeslayers/team/eventsystem/ListenersKt.listener:(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;IZLkotlin/jvm/functions/Function1;)V
        //    43: getstatic       cakeslayers/team/eventsystem/SafeClientEvent.Companion:Lcakeslayers/team/eventsystem/SafeClientEvent$Companion;
        //    46: checkcast       Lcakeslayers/team/eventsystem/IListenerOwner;
        //    49: astore_0       
        //    50: ldc             2147483647
        //    52: istore_1       
        //    53: iconst_1       
        //    54: istore_2       
        //    55: getstatic       cakeslayers/team/eventsystem/SafeClientEvent$Companion$2.INSTANCE:Lcakeslayers/team/eventsystem/SafeClientEvent$Companion$2;
        //    58: checkcast       Lkotlin/jvm/functions/Function1;
        //    61: astore_3        /* function$iv */
        //    62: iconst_0       
        //    63: istore          $i$f$listener
        //    65: aload_0         /* $this$listener$iv */
        //    66: ldc             Lcakeslayers/team/eventsystem/impl/WorldEvent$Unload;.class
        //    68: iload_1         /* priority$iv */
        //    69: iload_2         /* alwaysListening$iv */
        //    70: aload_3         /* function$iv */
        //    71: invokestatic    cakeslayers/team/eventsystem/ListenersKt.listener:(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;IZLkotlin/jvm/functions/Function1;)V
        //    74: getstatic       cakeslayers/team/eventsystem/SafeClientEvent.Companion:Lcakeslayers/team/eventsystem/SafeClientEvent$Companion;
        //    77: checkcast       Lcakeslayers/team/eventsystem/IListenerOwner;
        //    80: astore_0       
        //    81: ldc             2147483647
        //    83: istore_1       
        //    84: iconst_1       
        //    85: istore_2       
        //    86: getstatic       cakeslayers/team/eventsystem/SafeClientEvent$Companion$3.INSTANCE:Lcakeslayers/team/eventsystem/SafeClientEvent$Companion$3;
        //    89: checkcast       Lkotlin/jvm/functions/Function1;
        //    92: astore_3        /* function$iv */
        //    93: iconst_0       
        //    94: istore          $i$f$listener
        //    96: aload_0         /* $this$listener$iv */
        //    97: ldc             Lcakeslayers/team/eventsystem/impl/RunGameLoopEvent$Tick;.class
        //    99: iload_1         /* priority$iv */
        //   100: iload_2         /* alwaysListening$iv */
        //   101: aload_3         /* function$iv */
        //   102: invokestatic    cakeslayers/team/eventsystem/ListenersKt.listener:(Lcakeslayers/team/eventsystem/IListenerOwner;Ljava/lang/Class;IZLkotlin/jvm/functions/Function1;)V
        //   105: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot read field "references" because "newVariable" is null
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.base/java.lang.Thread.run(Thread.java:833)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lcakeslayers/team/eventsystem/SafeClientEvent$Companion;", "Lcakeslayers/team/eventsystem/ListenerOwner;", "()V", "<set-?>", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "instance", "getInstance", "()Lcakeslayers/team/eventsystem/SafeClientEvent;", "reset", "", "update", "Stay" })
    public static final class Companion extends ListenerOwner
    {
        private Companion() {
        }
        
        @Nullable
        public final SafeClientEvent getInstance() {
            return SafeClientEvent.access$getInstance$cp();
        }
        
        public final void update() {
            final WorldClient world2 = MinecraftWrapper.getWorld();
            if (world2 == null) {
                return;
            }
            final WorldClient world = world2;
            final EntityPlayerSP player2 = MinecraftWrapper.getPlayer();
            if (player2 == null) {
                return;
            }
            final EntityPlayerSP player = player2;
            final PlayerControllerMP playerController = MinecraftWrapper.getMc().playerController;
            if (playerController == null) {
                return;
            }
            final PlayerControllerMP playerController = playerController;
            final NetHandlerPlayClient getConnection = MinecraftWrapper.getMc().getConnection();
            if (getConnection == null) {
                return;
            }
            final NetHandlerPlayClient connection = getConnection;
            SafeClientEvent.access$setInstance$cp(new SafeClientEvent(world, player, playerController, connection));
        }
        
        public final void reset() {
            SafeClientEvent.access$setInstance$cp(null);
        }
    }
}
