//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.extension;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\u001a0\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001a)\u0010\u0005\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004¢\u0006\u0002\u0010\t\u001a0\u0010\n\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001a)\u0010\u000b\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004¢\u0006\u0002\u0010\t\u001a.\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001a.\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006\u001a.\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\r¨\u0006\u000e" }, d2 = { "firstEntryOrNull", "", "K", "V", "Ljava/util/NavigableMap;", "firstKeyOrNull", "Ljava/util/SortedMap;", "(Ljava/util/SortedMap;)Ljava/lang/Object;", "firstValueOrNull", "(Ljava/util/NavigableMap;)Ljava/lang/Object;", "lastEntryOrNull", "lastValueOrNull", "synchronized", "", "Stay" })
public final class MapKt
{
    @Nullable
    public static final <K, V> K firstKeyOrNull(@NotNull final SortedMap<K, V> $this$firstKeyOrNull) {
        Intrinsics.checkNotNullParameter((Object)$this$firstKeyOrNull, "<this>");
        K firstKey;
        try {
            firstKey = $this$firstKeyOrNull.firstKey();
        }
        catch (NoSuchElementException e) {
            firstKey = null;
        }
        return firstKey;
    }
    
    @Nullable
    public static final <K, V> V lastValueOrNull(@NotNull final NavigableMap<K, V> $this$lastValueOrNull) {
        Intrinsics.checkNotNullParameter((Object)$this$lastValueOrNull, "<this>");
        final Map.Entry<K, V> lastEntry = $this$lastValueOrNull.lastEntry();
        return (lastEntry == null) ? null : lastEntry.getValue();
    }
    
    @Nullable
    public static final <K, V> V firstValueOrNull(@NotNull final NavigableMap<K, V> $this$firstValueOrNull) {
        Intrinsics.checkNotNullParameter((Object)$this$firstValueOrNull, "<this>");
        final Map.Entry<K, V> firstEntryOrNull = firstEntryOrNull($this$firstValueOrNull);
        return (firstEntryOrNull == null) ? null : firstEntryOrNull.getValue();
    }
    
    @Nullable
    public static final <K, V> Map.Entry<K, V> firstEntryOrNull(@NotNull final NavigableMap<K, V> $this$firstEntryOrNull) {
        Intrinsics.checkNotNullParameter((Object)$this$firstEntryOrNull, "<this>");
        return $this$firstEntryOrNull.firstEntry();
    }
    
    @Nullable
    public static final <K, V> Map.Entry<K, V> lastEntryOrNull(@NotNull final NavigableMap<K, V> $this$lastEntryOrNull) {
        Intrinsics.checkNotNullParameter((Object)$this$lastEntryOrNull, "<this>");
        return $this$lastEntryOrNull.lastEntry();
    }
    
    @NotNull
    public static final <K, V> Map<K, V> synchronized(@NotNull final Map<K, V> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final Map<K, V> synchronizedMap = Collections.synchronizedMap($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedMap, "synchronizedMap(this)");
        return synchronizedMap;
    }
    
    @NotNull
    public static final <K, V> SortedMap<K, V> synchronized(@NotNull final SortedMap<K, V> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final SortedMap<K, V> synchronizedSortedMap = Collections.synchronizedSortedMap($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedSortedMap, "synchronizedSortedMap(this)");
        return synchronizedSortedMap;
    }
    
    @NotNull
    public static final <K, V> NavigableMap<K, V> synchronized(@NotNull final NavigableMap<K, V> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final NavigableMap<K, V> synchronizedNavigableMap = Collections.synchronizedNavigableMap($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedNavigableMap, "synchronized");
        return synchronizedNavigableMap;
    }
}
