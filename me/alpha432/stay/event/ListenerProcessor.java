//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.jvm.internal.*;
import me.alpha432.stay.util.thread.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.coroutines.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.manager.*;
import java.util.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraftforge.fml.common.network.*;
import cakeslayers.team.eventsystem.impl.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.client.event.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H\u0007¨\u0006\u0017" }, d2 = { "Lme/alpha432/stay/event/ListenerProcessor;", "", "()V", "onClientConnect", "", "event", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;", "onClientDisconnect", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;", "onEvent", "Lnet/minecraftforge/fml/common/eventhandler/Event;", "onInputUpdate", "Lnet/minecraftforge/client/event/InputUpdateEvent;", "onLoadWorld", "Lnet/minecraftforge/event/world/WorldEvent$Load;", "onPacketReceive", "Lme/alpha432/stay/event/PacketEvent$Receive;", "onRenderTickEvent", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent;", "onRenderWorld", "Lme/alpha432/stay/event/RenderWorldEvent;", "onUnloadWorld", "Lnet/minecraftforge/event/world/WorldEvent$Unload;", "Stay" })
public final class ListenerProcessor
{
    @NotNull
    public static final ListenerProcessor INSTANCE;
    
    private ListenerProcessor() {
    }
    
    @SubscribeEvent
    public final void onEvent(@NotNull final Event event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        final Listener this_$iv = Listener.INSTANCE;
        final int $i$f$onEvent = 0;
        try {
            BuildersKt.launch$default(CoroutineUtilsKt.getListenerScope(), (CoroutineContext)null, (CoroutineStart)null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(event, null) {
                int label;
                
                @Nullable
                public final Object invokeSuspend(@NotNull final Object $result) {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     3: pop            
                    //     4: aload_0        
                    //     5: getfield        me/alpha432/stay/event/ListenerProcessor$onEvent$$inlined$onEvent$1.label:I
                    //     8: tableswitch {
                    //                0: 28
                    //          default: 366
                    //        }
                    //    28: aload_1        
                    //    29: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
                    //    32: aload_0         /* this */
                    //    33: getfield        me/alpha432/stay/event/ListenerProcessor$onEvent$$inlined$onEvent$1.L$0:Ljava/lang/Object;
                    //    36: checkcast       Lkotlinx/coroutines/CoroutineScope;
                    //    39: astore_2       
                    //    40: getstatic       me/alpha432/stay/event/Listener.INSTANCE:Lme/alpha432/stay/event/Listener;
                    //    43: invokevirtual   me/alpha432/stay/event/Listener.getListeners:()Ljava/util/List;
                    //    46: checkcast       Ljava/lang/Iterable;
                    //    49: astore_3        /* $this$filter$iv */
                    //    50: aload_0         /* this */
                    //    51: getfield        me/alpha432/stay/event/ListenerProcessor$onEvent$$inlined$onEvent$1.$eventStage:Lnet/minecraftforge/fml/common/eventhandler/Event;
                    //    54: astore          4
                    //    56: iconst_0       
                    //    57: istore          $i$f$filter
                    //    59: aload_3         /* $this$filter$iv */
                    //    60: astore          6
                    //    62: new             Ljava/util/ArrayList;
                    //    65: dup            
                    //    66: invokespecial   java/util/ArrayList.<init>:()V
                    //    69: checkcast       Ljava/util/Collection;
                    //    72: astore          destination$iv$iv
                    //    74: iconst_0       
                    //    75: istore          $i$f$filterTo
                    //    77: aload           $this$filterTo$iv$iv
                    //    79: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
                    //    84: astore          9
                    //    86: aload           9
                    //    88: invokeinterface java/util/Iterator.hasNext:()Z
                    //    93: ifeq            159
                    //    96: aload           9
                    //    98: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   103: astore          element$iv$iv
                    //   105: aload           element$iv$iv
                    //   107: checkcast       Lkotlin/Pair;
                    //   110: astore          it
                    //   112: iconst_0       
                    //   113: istore          $i$a$-filter-Listener$onEvent$1$1
                    //   115: aload           it
                    //   117: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
                    //   120: checkcast       Lkotlin/Pair;
                    //   123: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
                    //   126: checkcast       Ljava/lang/Class;
                    //   129: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
                    //   132: aload           4
                    //   134: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
                    //   137: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
                    //   140: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
                    //   143: ifeq            86
                    //   146: aload           destination$iv$iv
                    //   148: aload           element$iv$iv
                    //   150: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
                    //   155: pop            
                    //   156: goto            86
                    //   159: aload           destination$iv$iv
                    //   161: checkcast       Ljava/util/List;
                    //   164: nop            
                    //   165: checkcast       Ljava/lang/Iterable;
                    //   168: astore_3        /* $this$filter$iv */
                    //   169: iconst_0       
                    //   170: istore          $i$f$filter
                    //   172: aload_3         /* $this$filter$iv */
                    //   173: astore          5
                    //   175: new             Ljava/util/ArrayList;
                    //   178: dup            
                    //   179: invokespecial   java/util/ArrayList.<init>:()V
                    //   182: checkcast       Ljava/util/Collection;
                    //   185: astore          destination$iv$iv
                    //   187: iconst_0       
                    //   188: istore          $i$f$filterTo
                    //   190: aload           $this$filterTo$iv$iv
                    //   192: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
                    //   197: astore          8
                    //   199: aload           8
                    //   201: invokeinterface java/util/Iterator.hasNext:()Z
                    //   206: ifeq            277
                    //   209: aload           8
                    //   211: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   216: astore          element$iv$iv
                    //   218: aload           element$iv$iv
                    //   220: checkcast       Lkotlin/Pair;
                    //   223: astore          it
                    //   225: iconst_0       
                    //   226: istore          $i$a$-filter-Listener$onEvent$1$2
                    //   228: aload           it
                    //   230: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
                    //   233: checkcast       Lme/alpha432/stay/features/modules/Module;
                    //   236: invokevirtual   me/alpha432/stay/features/modules/Module.isEnabled:()Z
                    //   239: ifne            256
                    //   242: aload           it
                    //   244: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
                    //   247: checkcast       Lme/alpha432/stay/features/modules/Module;
                    //   250: getfield        me/alpha432/stay/features/modules/Module.alwaysListening:Z
                    //   253: ifeq            260
                    //   256: iconst_1       
                    //   257: goto            261
                    //   260: iconst_0       
                    //   261: ifeq            199
                    //   264: aload           destination$iv$iv
                    //   266: aload           element$iv$iv
                    //   268: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
                    //   273: pop            
                    //   274: goto            199
                    //   277: aload           destination$iv$iv
                    //   279: checkcast       Ljava/util/List;
                    //   282: nop            
                    //   283: checkcast       Ljava/lang/Iterable;
                    //   286: astore_3        /* $this$forEach$iv */
                    //   287: aload_0         /* this */
                    //   288: getfield        me/alpha432/stay/event/ListenerProcessor$onEvent$$inlined$onEvent$1.$eventStage:Lnet/minecraftforge/fml/common/eventhandler/Event;
                    //   291: astore          4
                    //   293: iconst_0       
                    //   294: istore          $i$f$forEach
                    //   296: aload_3         /* $this$forEach$iv */
                    //   297: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
                    //   302: astore          6
                    //   304: aload           6
                    //   306: invokeinterface java/util/Iterator.hasNext:()Z
                    //   311: ifeq            361
                    //   314: aload           6
                    //   316: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   321: astore          element$iv
                    //   323: aload           element$iv
                    //   325: checkcast       Lkotlin/Pair;
                    //   328: astore          it
                    //   330: iconst_0       
                    //   331: istore          $i$a$-forEach-Listener$onEvent$1$3
                    //   333: aload_2         /* $this$launch */
                    //   334: aconst_null    
                    //   335: aconst_null    
                    //   336: new             Lme/alpha432/stay/event/ListenerProcessor$onEvent$$inlined$onEvent$1$1;
                    //   339: dup            
                    //   340: aload           it
                    //   342: aload           4
                    //   344: aconst_null    
                    //   345: invokespecial   me/alpha432/stay/event/ListenerProcessor$onEvent$$inlined$onEvent$1$1.<init>:(Lkotlin/Pair;Lnet/minecraftforge/fml/common/eventhandler/Event;Lkotlin/coroutines/Continuation;)V
                    //   348: checkcast       Lkotlin/jvm/functions/Function2;
                    //   351: iconst_3       
                    //   352: aconst_null    
                    //   353: invokestatic    kotlinx/coroutines/BuildersKt.launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
                    //   356: pop            
                    //   357: nop            
                    //   358: goto            304
                    //   361: nop            
                    //   362: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
                    //   365: areturn        
                    //   366: new             Ljava/lang/IllegalStateException;
                    //   369: dup            
                    //   370: ldc             "call to 'resume' before 'invoke' with coroutine"
                    //   372: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
                    //   375: athrow         
                    //    StackMapTable: 00 0B 1C FF 00 39 00 0A 07 00 02 07 00 69 07 00 50 07 00 5C 07 00 6B 01 07 00 5C 07 00 63 01 07 00 6D 00 00 FB 00 48 FF 00 27 00 0A 07 00 02 07 00 69 07 00 50 07 00 5C 01 07 00 5C 07 00 63 01 07 00 6D 07 00 69 00 00 FD 00 38 07 00 76 01 03 40 01 F9 00 0F FF 00 1A 00 09 07 00 02 07 00 69 07 00 50 07 00 5C 07 00 6B 01 07 00 6D 00 07 00 69 00 00 38 FF 00 04 00 02 07 00 02 07 00 69 00 00
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.NullPointerException
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
                
                @NotNull
                public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
                    final ListenerProcessor$onEvent$$inlined$onEvent$1 listenerProcessor$onEvent$$inlined$onEvent$1 = new ListenerProcessor$onEvent$$inlined$onEvent$1(this.$eventStage, (Continuation)$completion);
                    listenerProcessor$onEvent$$inlined$onEvent$1.L$0 = value;
                    return (Continuation<Unit>)listenerProcessor$onEvent$$inlined$onEvent$1;
                }
                
                @Nullable
                public final Object invoke(@NotNull final CoroutineScope p1, @Nullable final Continuation<? super Unit> p2) {
                    return ((ListenerProcessor$onEvent$$inlined$onEvent$1)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
                }
            }, 3, (Object)null);
        }
        catch (Throwable e$iv) {
            e$iv.printStackTrace();
        }
    }
    
    @SubscribeEvent
    public final void onRenderTickEvent(@NotNull final TickEvent$RenderTickEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        final ModuleManager moduleManager = Stay.moduleManager;
        Intrinsics.checkNotNull((Object)moduleManager);
        final ArrayList<Module> enabledModules = moduleManager.getEnabledModules();
        Intrinsics.checkNotNullExpressionValue((Object)enabledModules, "moduleManager!!.enabledModules");
        final Iterable $this$forEach$iv = enabledModules;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Module it = (Module)element$iv;
            final int n = 0;
            it.onRenderTick0(event);
        }
    }
    
    @SubscribeEvent
    public final void onRenderWorld(@NotNull final RenderWorldEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        WorldRenderPatcher.INSTANCE.patch(event);
    }
    
    @SubscribeEvent
    public final void onClientDisconnect(@NotNull final FMLNetworkEvent$ClientDisconnectionFromServerEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        ConnectionEvent.Disconnect.INSTANCE.post();
    }
    
    @SubscribeEvent
    public final void onClientConnect(@NotNull final FMLNetworkEvent$ClientConnectedToServerEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        ConnectionEvent.Connect.INSTANCE.post();
    }
    
    @SubscribeEvent
    public final void onLoadWorld(@NotNull final WorldEvent$Load event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (event.getWorld().isRemote) {
            WorldEvent.Load.INSTANCE.post();
        }
    }
    
    @SubscribeEvent
    public final void onUnloadWorld(@NotNull final WorldEvent$Unload event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (event.getWorld().isRemote) {
            WorldEvent.Unload.INSTANCE.post();
        }
    }
    
    @SubscribeEvent
    public final void onPacketReceive(@NotNull final PacketEvent.Receive event) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "event"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: nop            
        //     7: aload_1         /* event */
        //     8: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //    11: astore_2       
        //    12: aload_2        
        //    13: instanceof      Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //    16: ifeq            254
        //    19: aload_1         /* event */
        //    20: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //    23: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //    26: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getCategory:()Lnet/minecraft/util/SoundCategory;
        //    29: getstatic       net/minecraft/util/SoundCategory.BLOCKS:Lnet/minecraft/util/SoundCategory;
        //    32: if_acmpne       458
        //    35: aload_1         /* event */
        //    36: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //    39: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //    42: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getSound:()Lnet/minecraft/util/SoundEvent;
        //    45: getstatic       net/minecraft/init/SoundEvents.ENTITY_GENERIC_EXPLODE:Lnet/minecraft/util/SoundEvent;
        //    48: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    51: ifeq            458
        //    54: invokestatic    me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.getMc:()Lnet/minecraft/client/Minecraft;
        //    57: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    60: dup            
        //    61: ifnonnull       66
        //    64: pop            
        //    65: return         
        //    66: getfield        net/minecraft/client/multiplayer/WorldClient.loadedEntityList:Ljava/util/List;
        //    69: astore          4
        //    71: aload           4
        //    73: ldc_w           "mc.world ?: return).loadedEntityList"
        //    76: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    79: aload           4
        //    81: checkcast       Ljava/lang/Iterable;
        //    84: invokestatic    kotlin/collections/CollectionsKt.asSequence:(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
        //    87: astore          4
        //    89: nop            
        //    90: iconst_0       
        //    91: istore          $i$f$filterIsInstance
        //    93: aload           $this$filterIsInstance$iv
        //    95: getstatic       me/alpha432/stay/event/ListenerProcessor$onPacketReceive$$inlined$filterIsInstance$1.INSTANCE:Lme/alpha432/stay/event/ListenerProcessor$onPacketReceive$$inlined$filterIsInstance$1;
        //    98: checkcast       Lkotlin/jvm/functions/Function1;
        //   101: invokestatic    kotlin/sequences/SequencesKt.filter:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   104: new             Lme/alpha432/stay/event/ListenerProcessor$onPacketReceive$list$1;
        //   107: dup            
        //   108: aload_1         /* event */
        //   109: invokespecial   me/alpha432/stay/event/ListenerProcessor$onPacketReceive$list$1.<init>:(Lme/alpha432/stay/event/PacketEvent$Receive;)V
        //   112: checkcast       Lkotlin/jvm/functions/Function1;
        //   115: invokestatic    kotlin/sequences/SequencesKt.filter:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   118: getstatic       me/alpha432/stay/event/ListenerProcessor$onPacketReceive$list$2.INSTANCE:Lme/alpha432/stay/event/ListenerProcessor$onPacketReceive$list$2;
        //   121: checkcast       Lkotlin/jvm/functions/Function1;
        //   124: invokestatic    kotlin/sequences/SequencesKt.onEach:(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
        //   127: invokestatic    kotlin/sequences/SequencesKt.toList:(Lkotlin/sequences/Sequence;)Ljava/util/List;
        //   130: astore_3        /* list */
        //   131: aload_3         /* list */
        //   132: checkcast       Ljava/util/Collection;
        //   135: invokeinterface java/util/Collection.isEmpty:()Z
        //   140: ifne            147
        //   143: iconst_1       
        //   144: goto            148
        //   147: iconst_0       
        //   148: ifeq            458
        //   151: aconst_null    
        //   152: new             Lme/alpha432/stay/event/ListenerProcessor$onPacketReceive$1;
        //   155: dup            
        //   156: aload_3         /* list */
        //   157: invokespecial   me/alpha432/stay/event/ListenerProcessor$onPacketReceive$1.<init>:(Ljava/util/List;)V
        //   160: checkcast       Lkotlin/jvm/functions/Function0;
        //   163: iconst_1       
        //   164: aconst_null    
        //   165: invokestatic    me/alpha432/stay/util/thread/ThreadSafetyKt.runSafeSuspend$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lme/alpha432/stay/util/thread/ITask;
        //   168: pop            
        //   169: new             Lme/alpha432/stay/event/CrystalDeadEvent;
        //   172: dup            
        //   173: aload_1         /* event */
        //   174: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   177: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //   180: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getX:()D
        //   183: aload_1         /* event */
        //   184: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   187: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //   190: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getY:()D
        //   193: aload_1         /* event */
        //   194: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   197: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //   200: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getZ:()D
        //   203: aload_3         /* list */
        //   204: invokespecial   me/alpha432/stay/event/CrystalDeadEvent.<init>:(DDDLjava/util/List;)V
        //   207: invokevirtual   me/alpha432/stay/event/CrystalDeadEvent.post:()V
        //   210: new             Lcakeslayers/team/eventsystem/impl/CrystalSetDeadEvent;
        //   213: dup            
        //   214: aload_1         /* event */
        //   215: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   218: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //   221: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getX:()D
        //   224: aload_1         /* event */
        //   225: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   228: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //   231: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getY:()D
        //   234: aload_1         /* event */
        //   235: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   238: checkcast       Lnet/minecraft/network/play/server/SPacketSoundEffect;
        //   241: invokevirtual   net/minecraft/network/play/server/SPacketSoundEffect.getZ:()D
        //   244: aload_3         /* list */
        //   245: invokespecial   cakeslayers/team/eventsystem/impl/CrystalSetDeadEvent.<init>:(DDDLjava/util/List;)V
        //   248: invokevirtual   cakeslayers/team/eventsystem/impl/CrystalSetDeadEvent.post:()V
        //   251: goto            458
        //   254: aload_2        
        //   255: instanceof      Lnet/minecraft/network/play/server/SPacketSpawnObject;
        //   258: ifeq            441
        //   261: aload_1         /* event */
        //   262: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   265: checkcast       Lnet/minecraft/network/play/server/SPacketSpawnObject;
        //   268: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getType:()I
        //   271: bipush          51
        //   273: if_icmpne       458
        //   276: new             Lme/alpha432/stay/event/CrystalSpawnEvent;
        //   279: dup            
        //   280: invokestatic    me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.getMc:()Lnet/minecraft/client/Minecraft;
        //   283: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //   286: dup            
        //   287: ifnonnull       292
        //   290: pop            
        //   291: return         
        //   292: aload_1         /* event */
        //   293: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   296: checkcast       Lnet/minecraft/network/play/server/SPacketSpawnObject;
        //   299: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getEntityID:()I
        //   302: invokevirtual   net/minecraft/client/multiplayer/WorldClient.getEntityByID:(I)Lnet/minecraft/entity/Entity;
        //   305: checkcast       Lnet/minecraft/entity/item/EntityEnderCrystal;
        //   308: invokespecial   me/alpha432/stay/event/CrystalSpawnEvent.<init>:(Lnet/minecraft/entity/item/EntityEnderCrystal;)V
        //   311: invokevirtual   me/alpha432/stay/event/CrystalSpawnEvent.post:()V
        //   314: invokestatic    me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.getMc:()Lnet/minecraft/client/Minecraft;
        //   317: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //   320: aload_1         /* event */
        //   321: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   324: checkcast       Lnet/minecraft/network/play/server/SPacketSpawnObject;
        //   327: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getEntityID:()I
        //   330: invokevirtual   net/minecraft/client/multiplayer/WorldClient.getEntityByID:(I)Lnet/minecraft/entity/Entity;
        //   333: dup            
        //   334: ifnonnull       341
        //   337: pop            
        //   338: goto            458
        //   341: astore          it
        //   343: iconst_0       
        //   344: istore          $i$a$-let-ListenerProcessor$onPacketReceive$2
        //   346: new             Lcakeslayers/team/eventsystem/impl/CrystalSpawnEvent;
        //   349: dup            
        //   350: aload_1         /* event */
        //   351: invokevirtual   me/alpha432/stay/event/PacketEvent$Receive.getPacket:()Lnet/minecraft/network/Packet;
        //   354: checkcast       Lnet/minecraft/network/play/server/SPacketSpawnObject;
        //   357: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getEntityID:()I
        //   360: new             Lme/alpha432/stay/util/player/CrystalDamage;
        //   363: dup            
        //   364: aload           it
        //   366: invokevirtual   net/minecraft/entity/Entity.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   369: astore          7
        //   371: aload           7
        //   373: ldc_w           "it.positionVector"
        //   376: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   379: aload           7
        //   381: aload           it
        //   383: invokevirtual   net/minecraft/entity/Entity.getPosition:()Lnet/minecraft/util/math/BlockPos;
        //   386: invokevirtual   net/minecraft/util/math/BlockPos.down:()Lnet/minecraft/util/math/BlockPos;
        //   389: astore          7
        //   391: aload           7
        //   393: ldc_w           "it.position.down()"
        //   396: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   399: aload           7
        //   401: aload           it
        //   403: getfield        net/minecraft/entity/Entity.posX:D
        //   406: aload           it
        //   408: getfield        net/minecraft/entity/Entity.posY:D
        //   411: aload           it
        //   413: getfield        net/minecraft/entity/Entity.posZ:D
        //   416: invokestatic    me/alpha432/stay/util/basement/wrapper/MinecraftWrapper.getMc:()Lnet/minecraft/client/Minecraft;
        //   419: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   422: checkcast       Lnet/minecraft/entity/Entity;
        //   425: invokestatic    me/alpha432/stay/util/world/CrystalUtil.calculateDamage:(DDDLnet/minecraft/entity/Entity;)F
        //   428: invokespecial   me/alpha432/stay/util/player/CrystalDamage.<init>:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/BlockPos;F)V
        //   431: invokespecial   cakeslayers/team/eventsystem/impl/CrystalSpawnEvent.<init>:(ILme/alpha432/stay/util/player/CrystalDamage;)V
        //   434: invokevirtual   cakeslayers/team/eventsystem/impl/CrystalSpawnEvent.post:()V
        //   437: nop            
        //   438: goto            458
        //   441: return         
        //   442: astore_2        /* e */
        //   443: getstatic       me/alpha432/stay/client/Stay.LOGGER:Lorg/apache/logging/log4j/Logger;
        //   446: ldc_w           "Error while receive packet at ListenerProcessor, stacktrace:"
        //   449: aload_2         /* e */
        //   450: checkcast       Ljava/lang/Throwable;
        //   453: invokeinterface org/apache/logging/log4j/Logger.warn:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   458: return         
        //    StackMapTable: 00 09 FF 00 42 00 03 07 00 02 07 00 CE 07 00 FA 00 01 07 00 FC FE 00 50 07 01 28 07 01 2A 01 40 01 F8 00 69 FF 00 25 00 03 07 00 02 07 00 CE 07 00 FA 00 03 08 01 14 08 01 14 07 00 FC 70 07 01 60 FB 00 63 FF 00 00 00 02 07 00 02 07 00 CE 00 01 07 00 CC FC 00 0F 07 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      442    442    458    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SubscribeEvent
    public final void onInputUpdate(@NotNull final InputUpdateEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        new cakeslayers.team.eventsystem.impl.InputUpdateEvent(event).post();
    }
    
    static {
        INSTANCE = new ListenerProcessor();
    }
}
