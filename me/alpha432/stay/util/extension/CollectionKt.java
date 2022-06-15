//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.extension;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010#\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u0086\b¢\u0006\u0002\u0010\u0006\u001a$\u0010\u0007\u001a\u00020\b*\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0086\b\u00f8\u0001\u0000\u001a0\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\b0\u000bH\u0086\b\u00f8\u0001\u0000\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0010H\u0086\b\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0086\b\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\b\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0012H\u0086\b\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0013H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014" }, d2 = { "add", "", "E", "", "", "e", "(Ljava/util/Collection;Ljava/lang/Object;)V", "sumOfFloat", "", "", "selector", "Lkotlin/Function1;", "", "T", "", "synchronized", "Ljava/util/NavigableSet;", "Ljava/util/SortedSet;", "", "", "Stay" })
public final class CollectionKt
{
    public static final <E> void add(@NotNull final Collection<E> $this$add, @Nullable final E e) {
        Intrinsics.checkNotNullParameter((Object)$this$add, "<this>");
        final int $i$f$add = 0;
        if (e != null) {
            $this$add.add(e);
        }
    }
    
    public static final <T> float sumOfFloat(@NotNull final Iterable<? extends T> $this$sumOfFloat, @NotNull final Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter((Object)$this$sumOfFloat, "<this>");
        Intrinsics.checkNotNullParameter((Object)selector, "selector");
        final int $i$f$sumOfFloat = 0;
        float sum = 0.0f;
        for (final Object element : $this$sumOfFloat) {
            sum += ((Number)selector.invoke(element)).floatValue();
        }
        return sum;
    }
    
    public static final float sumOfFloat(@NotNull final CharSequence $this$sumOfFloat, @NotNull final Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter((Object)$this$sumOfFloat, "<this>");
        Intrinsics.checkNotNullParameter((Object)selector, "selector");
        final int $i$f$sumOfFloat = 0;
        float sum = 0.0f;
        char element;
        for (int i = 0; i < $this$sumOfFloat.length(); ++i, sum += ((Number)selector.invoke((Object)element)).floatValue()) {
            element = $this$sumOfFloat.charAt(i);
        }
        return sum;
    }
    
    @NotNull
    public static final <E> Collection<E> synchronized(@NotNull final Collection<E> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final int $i$f$synchronized = 0;
        final Collection<E> synchronizedCollection = Collections.synchronizedCollection($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedCollection, "synchronizedCollection(this)");
        return synchronizedCollection;
    }
    
    @NotNull
    public static final <E> List<E> synchronized(@NotNull final List<E> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final int $i$f$synchronized = 0;
        final List<E> synchronizedList = Collections.synchronizedList($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedList, "synchronizedList(this)");
        return synchronizedList;
    }
    
    @NotNull
    public static final <E> Set<E> synchronized(@NotNull final Set<E> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final int $i$f$synchronized = 0;
        final Set<E> synchronizedSet = Collections.synchronizedSet($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedSet, "synchronizedSet(this)");
        return synchronizedSet;
    }
    
    @NotNull
    public static final <E> SortedSet<E> synchronized(@NotNull final SortedSet<E> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final int $i$f$synchronized = 0;
        final SortedSet<E> synchronizedSortedSet = Collections.synchronizedSortedSet($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedSortedSet, "synchronizedSortedSet(this)");
        return synchronizedSortedSet;
    }
    
    @NotNull
    public static final <E> NavigableSet<E> synchronized(@NotNull final NavigableSet<E> $this$synchronized) {
        Intrinsics.checkNotNullParameter((Object)$this$synchronized, "<this>");
        final int $i$f$synchronized = 0;
        final NavigableSet<E> synchronizedNavigableSet = Collections.synchronizedNavigableSet($this$synchronized);
        Intrinsics.checkNotNullExpressionValue((Object)synchronizedNavigableSet, "synchronized");
        return synchronizedNavigableSet;
    }
}
