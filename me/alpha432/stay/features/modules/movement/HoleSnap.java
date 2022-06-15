//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.movement;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import me.alpha432.stay.features.modules.*;
import java.util.*;
import net.minecraft.util.math.*;
import kotlin.collections.*;
import me.alpha432.stay.util.math.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import me.alpha432.stay.util.delegate.*;
import kotlin.jvm.functions.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R8\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lme/alpha432/stay/features/modules/movement/HoleSnap;", "Lme/alpha432/stay/features/modules/WrappedModule;", "()V", "hole", "Lnet/minecraft/util/math/BlockPos;", "getHole", "()Lnet/minecraft/util/math/BlockPos;", "points", "", "Lnet/minecraft/util/math/Vec3d;", "kotlin.jvm.PlatformType", "getPoints", "()Ljava/util/List;", "range", "", "getRange", "()I", "range$delegate", "Lme/alpha432/stay/util/delegate/Value;", "Stay" })
public final class HoleSnap extends WrappedModule
{
    @NotNull
    public static final HoleSnap INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value range$delegate;
    
    private HoleSnap() {
        super("HoleSnap", null, Module.Category.MOVEMENT, false, false, false, 58, null);
    }
    
    private final int getRange() {
        return HoleSnap.range$delegate.getValue(this, HoleSnap.$$delegatedProperties[0]).intValue();
    }
    
    private final BlockPos getHole() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   me/alpha432/stay/features/modules/movement/HoleSnap.getMc:()Lnet/minecraft/client/Minecraft;
        //     4: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //     7: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPosition:()Lnet/minecraft/util/math/BlockPos;
        //    10: aload_0         /* this */
        //    11: invokespecial   me/alpha432/stay/features/modules/movement/HoleSnap.getRange:()I
        //    14: i2f            
        //    15: aload_0         /* this */
        //    16: invokespecial   me/alpha432/stay/features/modules/movement/HoleSnap.getRange:()I
        //    19: iconst_0       
        //    20: iconst_1       
        //    21: iconst_0       
        //    22: invokestatic    me/alpha432/stay/util/world/BlockInteractionHelper.getSphere:(Lnet/minecraft/util/math/BlockPos;FIZZI)Ljava/util/List;
        //    25: astore_1       
        //    26: aload_1        
        //    27: ldc             "getSphere(\n            m\u2026     true,\n            0)"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload_1        
        //    33: checkcast       Ljava/lang/Iterable;
        //    36: astore_1       
        //    37: nop            
        //    38: iconst_0       
        //    39: istore_2        /* $i$f$filter */
        //    40: aload_1         /* $this$filter$iv */
        //    41: astore_3       
        //    42: new             Ljava/util/ArrayList;
        //    45: dup            
        //    46: invokespecial   java/util/ArrayList.<init>:()V
        //    49: checkcast       Ljava/util/Collection;
        //    52: astore          destination$iv$iv
        //    54: iconst_0       
        //    55: istore          $i$f$filterTo
        //    57: aload_3         /* $this$filterTo$iv$iv */
        //    58: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    63: astore          7
        //    65: aload           7
        //    67: invokeinterface java/util/Iterator.hasNext:()Z
        //    72: ifeq            115
        //    75: aload           7
        //    77: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    82: astore          element$iv$iv
        //    84: aload           element$iv$iv
        //    86: checkcast       Lnet/minecraft/util/math/BlockPos;
        //    89: astore          it
        //    91: iconst_0       
        //    92: istore          $i$a$-filter-HoleSnap$hole$1
        //    94: aload           it
        //    96: invokestatic    me/alpha432/stay/util/math/HoleUtil.isHole:(Lnet/minecraft/util/math/BlockPos;)Z
        //    99: ifeq            65
        //   102: aload           destination$iv$iv
        //   104: aload           element$iv$iv
        //   106: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   111: pop            
        //   112: goto            65
        //   115: aload           destination$iv$iv
        //   117: checkcast       Ljava/util/List;
        //   120: nop            
        //   121: checkcast       Ljava/lang/Iterable;
        //   124: astore_1       
        //   125: nop            
        //   126: iconst_0       
        //   127: istore_2        /* $i$f$minByOrNull */
        //   128: aload_1         /* $this$minByOrNull$iv */
        //   129: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   134: astore_3        /* iterator$iv */
        //   135: aload_3         /* iterator$iv */
        //   136: invokeinterface java/util/Iterator.hasNext:()Z
        //   141: ifne            148
        //   144: aconst_null    
        //   145: goto            545
        //   148: aload_3         /* iterator$iv */
        //   149: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   154: astore          minElem$iv
        //   156: aload_3         /* iterator$iv */
        //   157: invokeinterface java/util/Iterator.hasNext:()Z
        //   162: ifne            170
        //   165: aload           minElem$iv
        //   167: goto            545
        //   170: aload           minElem$iv
        //   172: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   175: astore          it
        //   177: iconst_0       
        //   178: istore          $i$a$-minByOrNull-HoleSnap$hole$2
        //   180: getstatic       me/alpha432/stay/features/modules/movement/HoleSnap.INSTANCE:Lme/alpha432/stay/features/modules/movement/HoleSnap;
        //   183: invokevirtual   me/alpha432/stay/features/modules/movement/HoleSnap.getMc:()Lnet/minecraft/client/Minecraft;
        //   186: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   189: astore          8
        //   191: aload           8
        //   193: ldc             "mc.player"
        //   195: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   198: aload           8
        //   200: checkcast       Lnet/minecraft/entity/Entity;
        //   203: astore          8
        //   205: aload           it
        //   207: invokevirtual   net/minecraft/util/math/BlockPos.getX:()I
        //   210: istore          10
        //   212: aload           it
        //   214: invokevirtual   net/minecraft/util/math/BlockPos.getY:()I
        //   217: istore          11
        //   219: aload           it
        //   221: invokevirtual   net/minecraft/util/math/BlockPos.getZ:()I
        //   224: istore          z$iv
        //   226: iconst_0       
        //   227: istore          $i$f$distanceTo
        //   229: aload           $this$distanceTo$iv
        //   231: getfield        net/minecraft/entity/Entity.posX:D
        //   234: dstore          14
        //   236: aload           $this$distanceTo$iv
        //   238: getfield        net/minecraft/entity/Entity.posY:D
        //   241: dstore          16
        //   243: aload           $this$distanceTo$iv
        //   245: getfield        net/minecraft/entity/Entity.posZ:D
        //   248: dstore          18
        //   250: iload           x$iv
        //   252: i2d            
        //   253: ldc2_w          0.5
        //   256: dadd           
        //   257: dstore          20
        //   259: iload           y$iv
        //   261: i2d            
        //   262: ldc2_w          0.5
        //   265: dadd           
        //   266: dstore          22
        //   268: iload           z$iv
        //   270: i2d            
        //   271: ldc2_w          0.5
        //   274: dadd           
        //   275: dstore          z2$iv$iv
        //   277: iconst_0       
        //   278: istore          $i$f$distance
        //   280: nop            
        //   281: iconst_0       
        //   282: istore          $i$f$distanceSq
        //   284: dload           x2$iv$iv
        //   286: dload           x1$iv$iv
        //   288: dsub           
        //   289: dstore          $this$sq$iv$iv$iv$iv
        //   291: iconst_0       
        //   292: istore          $i$f$getSq
        //   294: dload           $this$sq$iv$iv$iv$iv
        //   296: dload           $this$sq$iv$iv$iv$iv
        //   298: dmul           
        //   299: dload           y2$iv$iv
        //   301: dload           y1$iv$iv
        //   303: dsub           
        //   304: dstore          $this$sq$iv$iv$iv$iv
        //   306: iconst_0       
        //   307: istore          $i$f$getSq
        //   309: dload           $this$sq$iv$iv$iv$iv
        //   311: dload           $this$sq$iv$iv$iv$iv
        //   313: dmul           
        //   314: dadd           
        //   315: dload           z2$iv$iv
        //   317: dload           z1$iv$iv
        //   319: dsub           
        //   320: dstore          $this$sq$iv$iv$iv$iv
        //   322: iconst_0       
        //   323: istore          $i$f$getSq
        //   325: dload           $this$sq$iv$iv$iv$iv
        //   327: dload           $this$sq$iv$iv$iv$iv
        //   329: dmul           
        //   330: dadd           
        //   331: invokestatic    java/lang/Math.sqrt:(D)D
        //   334: nop            
        //   335: nop            
        //   336: nop            
        //   337: dstore          minValue$iv
        //   339: aload_3         /* iterator$iv */
        //   340: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   345: astore          e$iv
        //   347: aload           e$iv
        //   349: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   352: astore          it
        //   354: iconst_0       
        //   355: istore          $i$a$-minByOrNull-HoleSnap$hole$2
        //   357: getstatic       me/alpha432/stay/features/modules/movement/HoleSnap.INSTANCE:Lme/alpha432/stay/features/modules/movement/HoleSnap;
        //   360: invokevirtual   me/alpha432/stay/features/modules/movement/HoleSnap.getMc:()Lnet/minecraft/client/Minecraft;
        //   363: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   366: astore          11
        //   368: aload           11
        //   370: ldc             "mc.player"
        //   372: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   375: aload           11
        //   377: checkcast       Lnet/minecraft/entity/Entity;
        //   380: astore          11
        //   382: aload           it
        //   384: invokevirtual   net/minecraft/util/math/BlockPos.getX:()I
        //   387: istore          12
        //   389: aload           it
        //   391: invokevirtual   net/minecraft/util/math/BlockPos.getY:()I
        //   394: istore          13
        //   396: aload           it
        //   398: invokevirtual   net/minecraft/util/math/BlockPos.getZ:()I
        //   401: istore          z$iv
        //   403: iconst_0       
        //   404: istore          $i$f$distanceTo
        //   406: aload           $this$distanceTo$iv
        //   408: getfield        net/minecraft/entity/Entity.posX:D
        //   411: dstore          16
        //   413: aload           $this$distanceTo$iv
        //   415: getfield        net/minecraft/entity/Entity.posY:D
        //   418: dstore          18
        //   420: aload           $this$distanceTo$iv
        //   422: getfield        net/minecraft/entity/Entity.posZ:D
        //   425: dstore          20
        //   427: iload           x$iv
        //   429: i2d            
        //   430: ldc2_w          0.5
        //   433: dadd           
        //   434: dstore          22
        //   436: iload           y$iv
        //   438: i2d            
        //   439: ldc2_w          0.5
        //   442: dadd           
        //   443: dstore          24
        //   445: iload           z$iv
        //   447: i2d            
        //   448: ldc2_w          0.5
        //   451: dadd           
        //   452: dstore          z2$iv$iv
        //   454: iconst_0       
        //   455: istore          $i$f$distance
        //   457: nop            
        //   458: iconst_0       
        //   459: istore          $i$f$distanceSq
        //   461: dload           x2$iv$iv
        //   463: dload           x1$iv$iv
        //   465: dsub           
        //   466: dstore          $this$sq$iv$iv$iv$iv
        //   468: iconst_0       
        //   469: istore          $i$f$getSq
        //   471: dload           $this$sq$iv$iv$iv$iv
        //   473: dload           $this$sq$iv$iv$iv$iv
        //   475: dmul           
        //   476: dload           y2$iv$iv
        //   478: dload           y1$iv$iv
        //   480: dsub           
        //   481: dstore          $this$sq$iv$iv$iv$iv
        //   483: iconst_0       
        //   484: istore          $i$f$getSq
        //   486: dload           $this$sq$iv$iv$iv$iv
        //   488: dload           $this$sq$iv$iv$iv$iv
        //   490: dmul           
        //   491: dadd           
        //   492: dload           z2$iv$iv
        //   494: dload           z1$iv$iv
        //   496: dsub           
        //   497: dstore          $this$sq$iv$iv$iv$iv
        //   499: iconst_0       
        //   500: istore          $i$f$getSq
        //   502: dload           $this$sq$iv$iv$iv$iv
        //   504: dload           $this$sq$iv$iv$iv$iv
        //   506: dmul           
        //   507: dadd           
        //   508: invokestatic    java/lang/Math.sqrt:(D)D
        //   511: nop            
        //   512: nop            
        //   513: nop            
        //   514: dstore          v$iv
        //   516: dload           minValue$iv
        //   518: dload           v$iv
        //   520: invokestatic    java/lang/Double.compare:(DD)I
        //   523: ifle            534
        //   526: aload           e$iv
        //   528: astore          minElem$iv
        //   530: dload           v$iv
        //   532: dstore          minValue$iv
        //   534: aload_3         /* iterator$iv */
        //   535: invokeinterface java/util/Iterator.hasNext:()Z
        //   540: ifne            339
        //   543: aload           minElem$iv
        //   545: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   548: areturn        
        //    StackMapTable: 00 07 FF 00 41 00 08 07 00 02 07 00 6E 01 07 00 6E 07 00 74 01 00 07 00 7A 00 00 31 FF 00 20 00 08 07 00 02 07 00 6E 01 07 00 7A 07 00 74 01 00 07 00 7A 00 00 FF 00 15 00 08 07 00 02 07 00 6E 01 07 00 7A 07 00 92 01 00 07 00 7A 00 00 FF 00 A8 00 17 07 00 02 07 00 6E 01 07 00 7A 07 00 92 03 00 00 00 01 00 01 01 03 03 03 03 03 03 01 01 03 01 00 00 FF 00 C2 00 1D 07 00 02 07 00 6E 01 07 00 7A 07 00 92 03 07 00 92 03 01 07 00 98 01 01 03 03 03 03 03 03 01 01 03 01 01 01 03 01 01 03 01 00 00 FF 00 0A 00 08 07 00 02 07 00 6E 01 07 00 7A 07 00 92 00 00 07 00 92 00 01 07 00 92
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final List<Vec3d> getPoints() {
        List<Vec3d> list;
        if (this.getHole() == null) {
            list = (List<Vec3d>)CollectionsKt.emptyList();
        }
        else {
            final BlockPos hole = this.getHole();
            Intrinsics.checkNotNull((Object)hole);
            final double tpX = hole.getX();
            final BlockPos hole2 = this.getHole();
            Intrinsics.checkNotNull((Object)hole2);
            final double tpY = hole2.getY();
            final BlockPos hole3 = this.getHole();
            Intrinsics.checkNotNull((Object)hole3);
            list = PathUtils.findBlinkPath(tpX, tpY, hole3.getZ());
        }
        return list;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)HoleSnap.class, "range", "getRange()I", 0)) };
        INSTANCE = new HoleSnap();
        range$delegate = SettingsKt.setting(HoleSnap.INSTANCE, "Range", 6, new IntRange(0, 10));
        HoleSnap.INSTANCE.onEnable((Function0)HoleSnap$1.INSTANCE);
        HoleSnap.INSTANCE.onTick((Function0)HoleSnap$2.INSTANCE);
        HoleSnap.INSTANCE.onRender3D((Function1)HoleSnap$3.INSTANCE);
    }
}
