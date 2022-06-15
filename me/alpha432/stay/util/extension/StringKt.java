//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.extension;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import kotlin.text.*;
import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0086\b\u001a$\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b\u00f8\u0001\u0000\u001a6\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u00f8\u0001\u0000\u001a*\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b\u00f8\u0001\u0000\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r\u001a\u001d\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\b\u001a\r\u0010\u000f\u001a\u00020\u0001*\u00020\u0001H\u0086\b\u001a&\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\b\u001a\u0019\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0016\u001a\u00020\t\"\u00020\u0005H\u0086\b\u001a\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0013H\u0086\b\u001a'\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0086\b\u001a'\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c" }, d2 = { "capitalize", "", "map", "transformer", "Lkotlin/Function1;", "", "mapEach", "", "delimiters", "", "mapIndexed", "Lkotlin/collections/IndexedValue;", "max", "", "suffix", "normalizeCase", "remove", "charSequences", "", "", "(Ljava/lang/String;[Ljava/lang/CharSequence;)Ljava/lang/String;", "char", "chars", "charSequence", "surroundedBy", "", "prefix", "ignoreCase", "Stay" })
public final class StringKt
{
    @NotNull
    public static final String max(@NotNull final String $this$max, final int max) {
        Intrinsics.checkNotNullParameter((Object)$this$max, "<this>");
        final String substring = $this$max.substring(0, RangesKt.coerceAtMost($this$max.length(), max));
        Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @NotNull
    public static final String max(@NotNull final String $this$max, final int max, @NotNull final String suffix) {
        Intrinsics.checkNotNullParameter((Object)$this$max, "<this>");
        Intrinsics.checkNotNullParameter((Object)suffix, "suffix");
        final int $i$f$max = 0;
        return ($this$max.length() > max) ? Intrinsics.stringPlus(max($this$max, max - suffix.length()), (Object)suffix) : max($this$max, max);
    }
    
    public static final boolean surroundedBy(@NotNull final String $this$surroundedBy, @NotNull final CharSequence prefix, @NotNull final CharSequence suffix, final boolean ignoreCase) {
        Intrinsics.checkNotNullParameter((Object)$this$surroundedBy, "<this>");
        Intrinsics.checkNotNullParameter((Object)prefix, "prefix");
        Intrinsics.checkNotNullParameter((Object)suffix, "suffix");
        final int $i$f$surroundedBy = 0;
        return StringsKt.startsWith((CharSequence)$this$surroundedBy, prefix, ignoreCase) && StringsKt.endsWith((CharSequence)$this$surroundedBy, suffix, ignoreCase);
    }
    
    public static final boolean surroundedBy(@NotNull final String $this$surroundedBy, final char prefix, final char suffix, final boolean ignoreCase) {
        Intrinsics.checkNotNullParameter((Object)$this$surroundedBy, "<this>");
        final int $i$f$surroundedBy = 0;
        return StringsKt.startsWith((CharSequence)$this$surroundedBy, prefix, ignoreCase) && StringsKt.endsWith((CharSequence)$this$surroundedBy, suffix, ignoreCase);
    }
    
    @NotNull
    public static final List<String> mapEach(@NotNull final String $this$mapEach, @NotNull final char[] delimiters, @NotNull final Function1<? super String, String> transformer) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* delimiters */
        //     7: ldc             "delimiters"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_2         /* transformer */
        //    13: ldc             "transformer"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: iconst_0       
        //    19: istore_3        /* $i$f$mapEach */
        //    20: aload_0         /* $this$mapEach */
        //    21: checkcast       Ljava/lang/CharSequence;
        //    24: aload_1         /* delimiters */
        //    25: aload_1         /* delimiters */
        //    26: arraylength    
        //    27: invokestatic    java/util/Arrays.copyOf:([CI)[C
        //    30: iconst_0       
        //    31: iconst_0       
        //    32: bipush          6
        //    34: aconst_null    
        //    35: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
        //    38: checkcast       Ljava/lang/Iterable;
        //    41: astore          $this$map$iv
        //    43: iconst_0       
        //    44: istore          $i$f$map
        //    46: aload           $this$map$iv
        //    48: astore          6
        //    50: new             Ljava/util/ArrayList;
        //    53: dup            
        //    54: aload           $this$map$iv
        //    56: bipush          10
        //    58: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    61: invokespecial   java/util/ArrayList.<init>:(I)V
        //    64: checkcast       Ljava/util/Collection;
        //    67: astore          destination$iv$iv
        //    69: iconst_0       
        //    70: istore          $i$f$mapTo
        //    72: aload           $this$mapTo$iv$iv
        //    74: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    79: astore          9
        //    81: aload           9
        //    83: invokeinterface java/util/Iterator.hasNext:()Z
        //    88: ifeq            119
        //    91: aload           9
        //    93: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    98: astore          item$iv$iv
        //   100: aload           destination$iv$iv
        //   102: aload_2         /* transformer */
        //   103: aload           item$iv$iv
        //   105: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   110: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   115: pop            
        //   116: goto            81
        //   119: aload           destination$iv$iv
        //   121: checkcast       Ljava/util/List;
        //   124: nop            
        //   125: areturn        
        //    Signature:
        //  (Ljava/lang/String;[CLkotlin/jvm/functions/Function1<-Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Ljava/lang/String;>;
        //    StackMapTable: 00 02 FF 00 51 00 0A 07 00 33 07 00 92 07 00 94 01 07 00 7E 01 07 00 7E 07 00 8C 01 07 00 96 00 00 25
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String capitalize(@NotNull final String $this$capitalize) {
        Intrinsics.checkNotNullParameter((Object)$this$capitalize, "<this>");
        final int $i$f$capitalize = 0;
        String string;
        if ($this$capitalize.length() > 0) {
            final char it = $this$capitalize.charAt(0);
            final int n = 0;
            final char c = Character.isLowerCase(it) ? Character.toTitleCase(it) : it;
            final String substring = $this$capitalize.substring(1);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "this as java.lang.String).substring(startIndex)");
            string = c + substring;
        }
        else {
            string = $this$capitalize;
        }
        return string;
    }
    
    @NotNull
    public static final String normalizeCase(@NotNull final String $this$normalizeCase) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$normalizeCase */
        //     8: aload_0         /* $this$normalizeCase */
        //     9: astore_2        /* $this$mapIndexed$iv */
        //    10: iconst_0       
        //    11: istore_3        /* $i$f$mapIndexed */
        //    12: aload_2         /* $this$mapIndexed$iv */
        //    13: invokevirtual   java/lang/String.length:()I
        //    16: newarray        C
        //    18: astore          charArray$iv
        //    20: aload_2         /* $this$mapIndexed$iv */
        //    21: checkcast       Ljava/lang/CharSequence;
        //    24: invokestatic    kotlin/text/StringsKt.withIndex:(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
        //    27: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    32: astore          5
        //    34: aload           5
        //    36: invokeinterface java/util/Iterator.hasNext:()Z
        //    41: ifeq            125
        //    44: aload           5
        //    46: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    51: checkcast       Lkotlin/collections/IndexedValue;
        //    54: astore          it$iv
        //    56: aload           charArray$iv
        //    58: aload           it$iv
        //    60: invokevirtual   kotlin/collections/IndexedValue.getIndex:()I
        //    63: aload           it$iv
        //    65: astore          7
        //    67: istore          12
        //    69: astore          11
        //    71: iconst_0       
        //    72: istore          $i$a$-mapIndexed-StringKt$normalizeCase$1
        //    74: aload           $dstr$i$char
        //    76: invokevirtual   kotlin/collections/IndexedValue.component1:()I
        //    79: istore          i
        //    81: aload           $dstr$i$char
        //    83: invokevirtual   kotlin/collections/IndexedValue.component2:()Ljava/lang/Object;
        //    86: checkcast       Ljava/lang/Character;
        //    89: invokevirtual   java/lang/Character.charValue:()C
        //    92: istore          char
        //    94: iload           i
        //    96: ifne            107
        //    99: iload           char
        //   101: invokestatic    java/lang/Character.toTitleCase:(C)C
        //   104: goto            112
        //   107: iload           char
        //   109: invokestatic    java/lang/Character.toLowerCase:(C)C
        //   112: nop            
        //   113: istore          13
        //   115: aload           11
        //   117: iload           12
        //   119: iload           13
        //   121: castore        
        //   122: goto            34
        //   125: new             Ljava/lang/String;
        //   128: dup            
        //   129: aload           charArray$iv
        //   131: invokespecial   java/lang/String.<init>:([C)V
        //   134: nop            
        //   135: areturn        
        //    StackMapTable: 00 04 FF 00 22 00 06 07 00 33 01 07 00 33 01 07 00 92 07 00 96 00 00 FF 00 48 00 0D 07 00 33 01 07 00 33 01 07 00 92 07 00 96 07 00 E3 07 00 E3 01 01 01 07 00 92 01 00 00 44 01 FF 00 0C 00 06 07 00 33 01 07 00 33 01 07 00 92 07 00 96 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String mapIndexed(@NotNull final String $this$mapIndexed, @NotNull final Function1<? super IndexedValue<Character>, Character> transformer) {
        Intrinsics.checkNotNullParameter((Object)$this$mapIndexed, "<this>");
        Intrinsics.checkNotNullParameter((Object)transformer, "transformer");
        final int $i$f$mapIndexed = 0;
        final char[] charArray = new char[$this$mapIndexed.length()];
        for (final IndexedValue it : StringsKt.withIndex((CharSequence)$this$mapIndexed)) {
            charArray[it.getIndex()] = (char)transformer.invoke((Object)it);
        }
        return new String(charArray);
    }
    
    @NotNull
    public static final String map(@NotNull final String $this$map, @NotNull final Function1<? super Character, Character> transformer) {
        Intrinsics.checkNotNullParameter((Object)$this$map, "<this>");
        Intrinsics.checkNotNullParameter((Object)transformer, "transformer");
        final int $i$f$map = 0;
        final char[] charArray = new char[$this$map.length()];
        int i;
        char char1;
        for (int j = 0; j < $this$map.length(); ++j, charArray[i] = (char)transformer.invoke((Object)char1)) {
            i = j;
            char1 = $this$map.charAt(j);
        }
        return new String(charArray);
    }
    
    @NotNull
    public static final String remove(@NotNull final String $this$remove, final char char) {
        Intrinsics.checkNotNullParameter((Object)$this$remove, "<this>");
        final int $i$f$remove = 0;
        final StringBuilder $this$remove_u24lambda_u2d2 = new StringBuilder();
        final int n = 0;
        int i = 0;
        while (i < $this$remove.length()) {
            final char c = $this$remove.charAt(i);
            ++i;
            if (c != char) {
                $this$remove_u24lambda_u2d2.append(c);
            }
        }
        final String string = $this$remove_u24lambda_u2d2.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @NotNull
    public static final String remove(@NotNull final String $this$remove, @NotNull final char... chars) {
        Intrinsics.checkNotNullParameter((Object)$this$remove, "<this>");
        Intrinsics.checkNotNullParameter((Object)chars, "chars");
        final int $i$f$remove = 0;
        final StringBuilder $this$remove_u24lambda_u2d3 = new StringBuilder();
        final int n = 0;
        int i = 0;
        while (i < $this$remove.length()) {
            final char c = $this$remove.charAt(i);
            ++i;
            if (!ArraysKt.contains(chars, c)) {
                $this$remove_u24lambda_u2d3.append(c);
            }
        }
        final String string = $this$remove_u24lambda_u2d3.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @NotNull
    public static final String remove(@NotNull final String $this$remove, @NotNull final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)$this$remove, "<this>");
        Intrinsics.checkNotNullParameter((Object)charSequence, "charSequence");
        final int $i$f$remove = 0;
        final StringBuilder $this$remove_u24lambda_u2d4 = new StringBuilder();
        final int n = 0;
        final char first = StringsKt.first(charSequence);
        final int l = charSequence.length();
        int i = 0;
        while (i < $this$remove.length()) {
            final char char1 = $this$remove.charAt(i);
            if (i + l <= $this$remove.length() && char1 == first && Intrinsics.areEqual((Object)$this$remove.subSequence(i, i + l), (Object)charSequence)) {
                i += l;
            }
            else {
                $this$remove_u24lambda_u2d4.append(char1);
                ++i;
            }
        }
        final String string = $this$remove_u24lambda_u2d4.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @NotNull
    public static final String remove(@NotNull final String $this$remove, @NotNull final CharSequence... charSequences) {
        Intrinsics.checkNotNullParameter((Object)$this$remove, "<this>");
        Intrinsics.checkNotNullParameter((Object)charSequences, "charSequences");
        final int $i$f$remove = 0;
        final StringBuilder $this$remove_u24lambda_u2d5 = new StringBuilder();
        final int n = 0;
        int i = 0;
    Label_0032:
        while (i < $this$remove.length()) {
            final char char1 = $this$remove.charAt(i);
            int j = 0;
            while (j < charSequences.length) {
                final CharSequence charSequence = charSequences[j];
                ++j;
                final char first = StringsKt.first(charSequence);
                final int l = charSequence.length();
                if (i + l <= $this$remove.length() && char1 == first && Intrinsics.areEqual((Object)$this$remove.subSequence(i, i + l), (Object)charSequences)) {
                    i += l;
                    continue Label_0032;
                }
            }
            $this$remove_u24lambda_u2d5.append(char1);
            ++i;
        }
        final String string = $this$remove_u24lambda_u2d5.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
