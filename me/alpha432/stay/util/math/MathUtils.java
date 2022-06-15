//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import kotlin.text.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\bJ1\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0087\bJ1\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0087\bJ1\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0087\bJ\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0087\bJ\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0087\bJ\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0087\bJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0087\bJ!\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0087\bJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0087\bJ\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0004H\u0087\bJ\u0019\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0087\b¨\u0006\u001c" }, d2 = { "Lme/alpha432/stay/util/math/MathUtils;", "", "()V", "ceilToPOT", "", "valueIn", "convertRange", "", "minIn", "maxIn", "minOut", "maxOut", "", "decimalPlaces", "value", "isNumberEven", "", "i", "lerp", "from", "to", "delta", "reverseNumber", "num", "min", "max", "round", "places", "Stay" })
public final class MathUtils
{
    @NotNull
    public static final MathUtils INSTANCE;
    
    private MathUtils() {
    }
    
    @JvmStatic
    public static final int ceilToPOT(final int valueIn) {
        final int $i$f$ceilToPOT = 0;
        int i = valueIn;
        --i;
        i |= i >> 1;
        i |= i >> 2;
        i |= i >> 4;
        i |= i >> 8;
        i |= i >> 16;
        ++i;
        return i;
    }
    
    @JvmStatic
    public static final float round(final float value, final int places) {
        final int $i$f$round = 0;
        final float scale = (float)Math.pow(10.0f, places);
        return (float)Math.rint(value * scale) / scale;
    }
    
    @JvmStatic
    public static final double round(final double value, final int places) {
        final int $i$f$round = 0;
        final double scale = Math.pow(10.0, places);
        return Math.rint(value * scale) / scale;
    }
    
    @JvmStatic
    public static final int decimalPlaces(final double value) {
        final int $i$f$decimalPlaces = 0;
        final List split$default = StringsKt.split$default((CharSequence)String.valueOf(value), new char[] { '.' }, false, 0, 6, (Object)null);
        final int n = 1;
        String value2;
        if (n <= CollectionsKt.getLastIndex(split$default)) {
            value2 = split$default.get(n);
        }
        else {
            final int it = n;
            final int n2 = 0;
            value2 = "0";
        }
        return value2.length();
    }
    
    @JvmStatic
    public static final int decimalPlaces(final float value) {
        final int $i$f$decimalPlaces = 0;
        final List split$default = StringsKt.split$default((CharSequence)String.valueOf(value), new char[] { '.' }, false, 0, 6, (Object)null);
        final int n = 1;
        String value2;
        if (n <= CollectionsKt.getLastIndex(split$default)) {
            value2 = split$default.get(n);
        }
        else {
            final int it = n;
            final int n2 = 0;
            value2 = "0";
        }
        return value2.length();
    }
    
    @JvmStatic
    public static final boolean isNumberEven(final int i) {
        final int $i$f$isNumberEven = 0;
        return (i & 0x1) == 0x0;
    }
    
    @JvmStatic
    public static final int reverseNumber(final int num, final int min, final int max) {
        final int $i$f$reverseNumber = 0;
        return max + min - num;
    }
    
    @JvmStatic
    public static final int convertRange(final int valueIn, final int minIn, final int maxIn, final int minOut, final int maxOut) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          $i$f$convertRange
        //     3: getstatic       me/alpha432/stay/util/math/MathUtils.INSTANCE:Lme/alpha432/stay/util/math/MathUtils;
        //     6: pop            
        //     7: iload_0         /* valueIn */
        //     8: i2d            
        //     9: dstore          6
        //    11: iload_1         /* minIn */
        //    12: i2d            
        //    13: dstore          8
        //    15: iload_2         /* maxIn */
        //    16: i2d            
        //    17: dstore          10
        //    19: iload_3         /* minOut */
        //    20: i2d            
        //    21: dstore          12
        //    23: iload           maxOut
        //    25: i2d            
        //    26: dstore          14
        //    28: nop            
        //    29: iconst_0       
        //    30: istore          $i$f$convertRange
        //    32: dload           maxIn$iv
        //    34: dload           minIn$iv
        //    36: dsub           
        //    37: dstore          rangeIn$iv
        //    39: dload           maxOut$iv
        //    41: dload           minOut$iv
        //    43: dsub           
        //    44: dstore          rangeOut$iv
        //    46: dload           valueIn$iv
        //    48: dload           minIn$iv
        //    50: dsub           
        //    51: dload           rangeOut$iv
        //    53: dload           rangeIn$iv
        //    55: ddiv           
        //    56: dmul           
        //    57: dload           minOut$iv
        //    59: dadd           
        //    60: dstore          convertedIn$iv
        //    62: dload           minOut$iv
        //    64: dload           maxOut$iv
        //    66: invokestatic    java/lang/Math.min:(DD)D
        //    69: dstore          actualMin$iv
        //    71: dload           minOut$iv
        //    73: dload           maxOut$iv
        //    75: invokestatic    java/lang/Math.max:(DD)D
        //    78: dstore          actualMax$iv
        //    80: dload           convertedIn$iv
        //    82: dload           actualMin$iv
        //    84: invokestatic    java/lang/Math.max:(DD)D
        //    87: dload           actualMax$iv
        //    89: invokestatic    java/lang/Math.min:(DD)D
        //    92: nop            
        //    93: d2i            
        //    94: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmStatic
    public static final float convertRange(final float valueIn, final float minIn, final float maxIn, final float minOut, final float maxOut) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          $i$f$convertRange
        //     3: getstatic       me/alpha432/stay/util/math/MathUtils.INSTANCE:Lme/alpha432/stay/util/math/MathUtils;
        //     6: pop            
        //     7: fload_0         /* valueIn */
        //     8: f2d            
        //     9: dstore          6
        //    11: fload_1         /* minIn */
        //    12: f2d            
        //    13: dstore          8
        //    15: fload_2         /* maxIn */
        //    16: f2d            
        //    17: dstore          10
        //    19: fload_3         /* minOut */
        //    20: f2d            
        //    21: dstore          12
        //    23: fload           maxOut
        //    25: f2d            
        //    26: dstore          14
        //    28: nop            
        //    29: iconst_0       
        //    30: istore          $i$f$convertRange
        //    32: dload           maxIn$iv
        //    34: dload           minIn$iv
        //    36: dsub           
        //    37: dstore          rangeIn$iv
        //    39: dload           maxOut$iv
        //    41: dload           minOut$iv
        //    43: dsub           
        //    44: dstore          rangeOut$iv
        //    46: dload           valueIn$iv
        //    48: dload           minIn$iv
        //    50: dsub           
        //    51: dload           rangeOut$iv
        //    53: dload           rangeIn$iv
        //    55: ddiv           
        //    56: dmul           
        //    57: dload           minOut$iv
        //    59: dadd           
        //    60: dstore          convertedIn$iv
        //    62: dload           minOut$iv
        //    64: dload           maxOut$iv
        //    66: invokestatic    java/lang/Math.min:(DD)D
        //    69: dstore          actualMin$iv
        //    71: dload           minOut$iv
        //    73: dload           maxOut$iv
        //    75: invokestatic    java/lang/Math.max:(DD)D
        //    78: dstore          actualMax$iv
        //    80: dload           convertedIn$iv
        //    82: dload           actualMin$iv
        //    84: invokestatic    java/lang/Math.max:(DD)D
        //    87: dload           actualMax$iv
        //    89: invokestatic    java/lang/Math.min:(DD)D
        //    92: nop            
        //    93: d2f            
        //    94: freturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmStatic
    public static final double convertRange(final double valueIn, final double minIn, final double maxIn, final double minOut, final double maxOut) {
        final int $i$f$convertRange = 0;
        final double rangeIn = maxIn - minIn;
        final double rangeOut = maxOut - minOut;
        final double convertedIn = (valueIn - minIn) * (rangeOut / rangeIn) + minOut;
        final double actualMin = Math.min(minOut, maxOut);
        final double actualMax = Math.max(minOut, maxOut);
        return Math.min(Math.max(convertedIn, actualMin), actualMax);
    }
    
    @JvmStatic
    public static final double lerp(final double from, final double to, final double delta) {
        final int $i$f$lerp = 0;
        return from + (to - from) * delta;
    }
    
    @JvmStatic
    public static final float lerp(final float from, final float to, final float delta) {
        final int $i$f$lerp = 0;
        return from + (to - from) * delta;
    }
    
    static {
        INSTANCE = new MathUtils();
    }
}
