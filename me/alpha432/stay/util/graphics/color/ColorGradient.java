//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.color;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/util/graphics/color/ColorGradient;", "", "stops", "", "Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;", "([Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;)V", "colorArray", "[Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;", "get", "Lme/alpha432/stay/util/graphics/color/ColorRGB;", "valueIn", "", "get-_3BFyQM", "(F)I", "Stop", "Stay" })
public final class ColorGradient
{
    @NotNull
    private final Stop[] colorArray;
    
    public ColorGradient(@NotNull final Stop... stops) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "stops"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* stops */
        //    12: astore_2       
        //    13: aload_2        
        //    14: astore_3       
        //    15: astore          7
        //    17: iconst_0       
        //    18: istore          $i$a$-apply-ColorGradient$colorArray$1
        //    20: aload_3         /* $this$colorArray_u24lambda_u2d1 */
        //    21: astore          $this$sortBy$iv
        //    23: iconst_0       
        //    24: istore          $i$f$sortBy
        //    26: aload           $this$sortBy$iv
        //    28: arraylength    
        //    29: iconst_1       
        //    30: if_icmple       48
        //    33: aload           $this$sortBy$iv
        //    35: new             Lme/alpha432/stay/util/graphics/color/ColorGradient$colorArray$lambda-1$$inlined$sortBy$1;
        //    38: dup            
        //    39: invokespecial   me/alpha432/stay/util/graphics/color/ColorGradient$colorArray$lambda-1$$inlined$sortBy$1.<init>:()V
        //    42: checkcast       Ljava/util/Comparator;
        //    45: invokestatic    kotlin/collections/ArraysKt.sortWith:([Ljava/lang/Object;Ljava/util/Comparator;)V
        //    48: nop            
        //    49: nop            
        //    50: aload           7
        //    52: aload_2        
        //    53: putfield        me/alpha432/stay/util/graphics/color/ColorGradient.colorArray:[Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //    56: return         
        //    StackMapTable: 00 01 FF 00 30 00 08 07 00 02 07 00 38 07 00 38 07 00 38 01 07 00 38 01 07 00 02 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final int get-_3BFyQM(final float valueIn) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        me/alpha432/stay/util/graphics/color/ColorGradient.colorArray:[Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //     4: arraylength    
        //     5: ifne            12
        //     8: iconst_1       
        //     9: goto            13
        //    12: iconst_0       
        //    13: ifeq            29
        //    16: sipush          255
        //    19: sipush          255
        //    22: sipush          255
        //    25: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.constructor-impl:(III)I
        //    28: ireturn        
        //    29: aload_0         /* this */
        //    30: getfield        me/alpha432/stay/util/graphics/color/ColorGradient.colorArray:[Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //    33: invokestatic    kotlin/collections/ArraysKt.last:([Ljava/lang/Object;)Ljava/lang/Object;
        //    36: checkcast       Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //    39: astore_2        /* prevStop */
        //    40: aload_0         /* this */
        //    41: getfield        me/alpha432/stay/util/graphics/color/ColorGradient.colorArray:[Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //    44: invokestatic    kotlin/collections/ArraysKt.last:([Ljava/lang/Object;)Ljava/lang/Object;
        //    47: checkcast       Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //    50: astore_3        /* nextStop */
        //    51: aload_0         /* this */
        //    52: getfield        me/alpha432/stay/util/graphics/color/ColorGradient.colorArray:[Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //    55: astore          4
        //    57: iconst_0       
        //    58: istore          5
        //    60: aload           4
        //    62: arraylength    
        //    63: istore          6
        //    65: iload           5
        //    67: iload           6
        //    69: if_icmpge       140
        //    72: iload           5
        //    74: istore          index
        //    76: aload           4
        //    78: iload           5
        //    80: aaload         
        //    81: astore          pair
        //    83: iinc            5, 1
        //    86: aload           pair
        //    88: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //    91: fload_1         /* valueIn */
        //    92: fcmpg          
        //    93: ifge            99
        //    96: goto            65
        //    99: aload           pair
        //   101: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   104: fload_1         /* valueIn */
        //   105: fcmpg          
        //   106: ifne            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: ifeq            122
        //   117: aload           pair
        //   119: goto            135
        //   122: aload_0         /* this */
        //   123: getfield        me/alpha432/stay/util/graphics/color/ColorGradient.colorArray:[Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;
        //   126: iload           index
        //   128: iconst_1       
        //   129: isub           
        //   130: iconst_0       
        //   131: invokestatic    java/lang/Math.max:(II)I
        //   134: aaload         
        //   135: astore_2        /* prevStop */
        //   136: aload           pair
        //   138: astore_3        /* nextStop */
        //   139: nop            
        //   140: aload_2         /* prevStop */
        //   141: aload_3         /* nextStop */
        //   142: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   145: ifeq            153
        //   148: aload_2         /* prevStop */
        //   149: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   152: ireturn        
        //   153: aload_2         /* prevStop */
        //   154: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   157: fstore          5
        //   159: aload_3         /* nextStop */
        //   160: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   163: fstore          6
        //   165: aload_2         /* prevStop */
        //   166: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   169: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getR-impl:(I)I
        //   172: i2f            
        //   173: fstore          7
        //   175: aload_3         /* nextStop */
        //   176: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   179: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getR-impl:(I)I
        //   182: i2f            
        //   183: fstore          8
        //   185: nop            
        //   186: iconst_0       
        //   187: istore          $i$f$convertRange
        //   189: getstatic       me/alpha432/stay/util/math/MathUtils.INSTANCE:Lme/alpha432/stay/util/math/MathUtils;
        //   192: pop            
        //   193: fload_1         /* valueIn */
        //   194: f2d            
        //   195: dstore          10
        //   197: fload           minIn$iv
        //   199: f2d            
        //   200: dstore          12
        //   202: fload           maxIn$iv
        //   204: f2d            
        //   205: dstore          14
        //   207: fload           minOut$iv
        //   209: f2d            
        //   210: dstore          16
        //   212: fload           maxOut$iv
        //   214: f2d            
        //   215: dstore          18
        //   217: nop            
        //   218: iconst_0       
        //   219: istore          $i$f$convertRange
        //   221: dload           maxIn$iv$iv
        //   223: dload           minIn$iv$iv
        //   225: dsub           
        //   226: dstore          rangeIn$iv$iv
        //   228: dload           maxOut$iv$iv
        //   230: dload           minOut$iv$iv
        //   232: dsub           
        //   233: dstore          rangeOut$iv$iv
        //   235: dload           valueIn$iv$iv
        //   237: dload           minIn$iv$iv
        //   239: dsub           
        //   240: dload           rangeOut$iv$iv
        //   242: dload           rangeIn$iv$iv
        //   244: ddiv           
        //   245: dmul           
        //   246: dload           minOut$iv$iv
        //   248: dadd           
        //   249: dstore          convertedIn$iv$iv
        //   251: dload           minOut$iv$iv
        //   253: dload           maxOut$iv$iv
        //   255: invokestatic    java/lang/Math.min:(DD)D
        //   258: dstore          actualMin$iv$iv
        //   260: dload           minOut$iv$iv
        //   262: dload           maxOut$iv$iv
        //   264: invokestatic    java/lang/Math.max:(DD)D
        //   267: dstore          actualMax$iv$iv
        //   269: dload           convertedIn$iv$iv
        //   271: dload           actualMin$iv$iv
        //   273: invokestatic    java/lang/Math.max:(DD)D
        //   276: dload           actualMax$iv$iv
        //   278: invokestatic    java/lang/Math.min:(DD)D
        //   281: nop            
        //   282: d2f            
        //   283: nop            
        //   284: invokestatic    kotlin/math/MathKt.roundToInt:(F)I
        //   287: istore          r
        //   289: aload_2         /* prevStop */
        //   290: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   293: fstore          6
        //   295: aload_3         /* nextStop */
        //   296: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   299: fstore          7
        //   301: aload_2         /* prevStop */
        //   302: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   305: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getG-impl:(I)I
        //   308: i2f            
        //   309: fstore          8
        //   311: aload_3         /* nextStop */
        //   312: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   315: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getG-impl:(I)I
        //   318: i2f            
        //   319: fstore          9
        //   321: nop            
        //   322: iconst_0       
        //   323: istore          $i$f$convertRange
        //   325: getstatic       me/alpha432/stay/util/math/MathUtils.INSTANCE:Lme/alpha432/stay/util/math/MathUtils;
        //   328: pop            
        //   329: fload_1         /* valueIn */
        //   330: f2d            
        //   331: dstore          11
        //   333: fload           minIn$iv
        //   335: f2d            
        //   336: dstore          13
        //   338: fload           maxIn$iv
        //   340: f2d            
        //   341: dstore          15
        //   343: fload           minOut$iv
        //   345: f2d            
        //   346: dstore          17
        //   348: fload           maxOut$iv
        //   350: f2d            
        //   351: dstore          19
        //   353: nop            
        //   354: iconst_0       
        //   355: istore          $i$f$convertRange
        //   357: dload           maxIn$iv$iv
        //   359: dload           minIn$iv$iv
        //   361: dsub           
        //   362: dstore          rangeIn$iv$iv
        //   364: dload           maxOut$iv$iv
        //   366: dload           minOut$iv$iv
        //   368: dsub           
        //   369: dstore          rangeOut$iv$iv
        //   371: dload           valueIn$iv$iv
        //   373: dload           minIn$iv$iv
        //   375: dsub           
        //   376: dload           rangeOut$iv$iv
        //   378: dload           rangeIn$iv$iv
        //   380: ddiv           
        //   381: dmul           
        //   382: dload           minOut$iv$iv
        //   384: dadd           
        //   385: dstore          convertedIn$iv$iv
        //   387: dload           minOut$iv$iv
        //   389: dload           maxOut$iv$iv
        //   391: invokestatic    java/lang/Math.min:(DD)D
        //   394: dstore          actualMin$iv$iv
        //   396: dload           minOut$iv$iv
        //   398: dload           maxOut$iv$iv
        //   400: invokestatic    java/lang/Math.max:(DD)D
        //   403: dstore          actualMax$iv$iv
        //   405: dload           convertedIn$iv$iv
        //   407: dload           actualMin$iv$iv
        //   409: invokestatic    java/lang/Math.max:(DD)D
        //   412: dload           actualMax$iv$iv
        //   414: invokestatic    java/lang/Math.min:(DD)D
        //   417: nop            
        //   418: d2f            
        //   419: nop            
        //   420: invokestatic    kotlin/math/MathKt.roundToInt:(F)I
        //   423: istore          g
        //   425: aload_2         /* prevStop */
        //   426: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   429: fstore          7
        //   431: aload_3         /* nextStop */
        //   432: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   435: fstore          8
        //   437: aload_2         /* prevStop */
        //   438: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   441: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getB-impl:(I)I
        //   444: i2f            
        //   445: fstore          9
        //   447: aload_3         /* nextStop */
        //   448: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   451: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getB-impl:(I)I
        //   454: i2f            
        //   455: fstore          10
        //   457: nop            
        //   458: iconst_0       
        //   459: istore          $i$f$convertRange
        //   461: getstatic       me/alpha432/stay/util/math/MathUtils.INSTANCE:Lme/alpha432/stay/util/math/MathUtils;
        //   464: pop            
        //   465: fload_1         /* valueIn */
        //   466: f2d            
        //   467: dstore          12
        //   469: fload           minIn$iv
        //   471: f2d            
        //   472: dstore          14
        //   474: fload           maxIn$iv
        //   476: f2d            
        //   477: dstore          16
        //   479: fload           minOut$iv
        //   481: f2d            
        //   482: dstore          18
        //   484: fload           maxOut$iv
        //   486: f2d            
        //   487: dstore          20
        //   489: nop            
        //   490: iconst_0       
        //   491: istore          $i$f$convertRange
        //   493: dload           maxIn$iv$iv
        //   495: dload           minIn$iv$iv
        //   497: dsub           
        //   498: dstore          rangeIn$iv$iv
        //   500: dload           maxOut$iv$iv
        //   502: dload           minOut$iv$iv
        //   504: dsub           
        //   505: dstore          rangeOut$iv$iv
        //   507: dload           valueIn$iv$iv
        //   509: dload           minIn$iv$iv
        //   511: dsub           
        //   512: dload           rangeOut$iv$iv
        //   514: dload           rangeIn$iv$iv
        //   516: ddiv           
        //   517: dmul           
        //   518: dload           minOut$iv$iv
        //   520: dadd           
        //   521: dstore          convertedIn$iv$iv
        //   523: dload           minOut$iv$iv
        //   525: dload           maxOut$iv$iv
        //   527: invokestatic    java/lang/Math.min:(DD)D
        //   530: dstore          actualMin$iv$iv
        //   532: dload           minOut$iv$iv
        //   534: dload           maxOut$iv$iv
        //   536: invokestatic    java/lang/Math.max:(DD)D
        //   539: dstore          actualMax$iv$iv
        //   541: dload           convertedIn$iv$iv
        //   543: dload           actualMin$iv$iv
        //   545: invokestatic    java/lang/Math.max:(DD)D
        //   548: dload           actualMax$iv$iv
        //   550: invokestatic    java/lang/Math.min:(DD)D
        //   553: nop            
        //   554: d2f            
        //   555: nop            
        //   556: invokestatic    kotlin/math/MathKt.roundToInt:(F)I
        //   559: istore          b
        //   561: aload_2         /* prevStop */
        //   562: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   565: fstore          8
        //   567: aload_3         /* nextStop */
        //   568: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getValue:()F
        //   571: fstore          9
        //   573: aload_2         /* prevStop */
        //   574: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   577: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getA-impl:(I)I
        //   580: i2f            
        //   581: fstore          10
        //   583: aload_3         /* nextStop */
        //   584: invokevirtual   me/alpha432/stay/util/graphics/color/ColorGradient$Stop.getColor-RRr7D4I:()I
        //   587: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.getA-impl:(I)I
        //   590: i2f            
        //   591: fstore          11
        //   593: nop            
        //   594: iconst_0       
        //   595: istore          $i$f$convertRange
        //   597: getstatic       me/alpha432/stay/util/math/MathUtils.INSTANCE:Lme/alpha432/stay/util/math/MathUtils;
        //   600: pop            
        //   601: fload_1         /* valueIn */
        //   602: f2d            
        //   603: dstore          13
        //   605: fload           minIn$iv
        //   607: f2d            
        //   608: dstore          15
        //   610: fload           maxIn$iv
        //   612: f2d            
        //   613: dstore          17
        //   615: fload           minOut$iv
        //   617: f2d            
        //   618: dstore          19
        //   620: fload           maxOut$iv
        //   622: f2d            
        //   623: dstore          21
        //   625: nop            
        //   626: iconst_0       
        //   627: istore          $i$f$convertRange
        //   629: dload           maxIn$iv$iv
        //   631: dload           minIn$iv$iv
        //   633: dsub           
        //   634: dstore          rangeIn$iv$iv
        //   636: dload           maxOut$iv$iv
        //   638: dload           minOut$iv$iv
        //   640: dsub           
        //   641: dstore          rangeOut$iv$iv
        //   643: dload           valueIn$iv$iv
        //   645: dload           minIn$iv$iv
        //   647: dsub           
        //   648: dload           rangeOut$iv$iv
        //   650: dload           rangeIn$iv$iv
        //   652: ddiv           
        //   653: dmul           
        //   654: dload           minOut$iv$iv
        //   656: dadd           
        //   657: dstore          convertedIn$iv$iv
        //   659: dload           minOut$iv$iv
        //   661: dload           maxOut$iv$iv
        //   663: invokestatic    java/lang/Math.min:(DD)D
        //   666: dstore          actualMin$iv$iv
        //   668: dload           minOut$iv$iv
        //   670: dload           maxOut$iv$iv
        //   672: invokestatic    java/lang/Math.max:(DD)D
        //   675: dstore          actualMax$iv$iv
        //   677: dload           convertedIn$iv$iv
        //   679: dload           actualMin$iv$iv
        //   681: invokestatic    java/lang/Math.max:(DD)D
        //   684: dload           actualMax$iv$iv
        //   686: invokestatic    java/lang/Math.min:(DD)D
        //   689: nop            
        //   690: d2f            
        //   691: nop            
        //   692: invokestatic    kotlin/math/MathKt.roundToInt:(F)I
        //   695: istore          a
        //   697: iload           r
        //   699: iload           g
        //   701: iload           b
        //   703: iload           a
        //   705: invokestatic    me/alpha432/stay/util/graphics/color/ColorRGB.constructor-impl:(IIII)I
        //   708: ireturn        
        //    StackMapTable: 00 0B 0C 40 01 0F FF 00 23 00 07 07 00 02 02 07 00 20 07 00 20 07 00 38 01 01 00 00 FD 00 21 01 07 00 20 0D 40 01 07 4C 07 00 20 F9 00 04 0C
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f" }, d2 = { "Lme/alpha432/stay/util/graphics/color/ColorGradient$Stop;", "", "value", "", "color", "Lme/alpha432/stay/util/graphics/color/ColorRGB;", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-RRr7D4I", "()I", "I", "getValue", "()F", "Stay" })
    public static final class Stop
    {
        private final float value;
        private final int color;
        
        private Stop(final float value, final int color) {
            this.value = value;
            this.color = color;
        }
        
        public final float getValue() {
            return this.value;
        }
        
        public final int getColor-RRr7D4I() {
            return this.color;
        }
    }
}
