//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util;

import kotlin.jvm.internal.markers.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 >*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001>B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nB\u001f\b\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\u0016\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0019H\u0016J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0016\u0010\"\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\u0016\u0010#\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u000fH\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0096\u0002J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J \u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0015\u00102\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u00103\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010$J\u0015\u00105\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010$J\u0016\u00106\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\u001e\u00107\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00108J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020=H\u0016R\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006?" }, d2 = { "Lme/alpha432/stay/util/CircularArray;", "E", "", "size", "", "(I)V", "defaultValue", "(ILjava/lang/Object;)V", "init", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)V", "array", "", "", "filled", "", "([Ljava/lang/Object;Z)V", "[Ljava/lang/Object;", "index", "<set-?>", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "add0", "addAll", "elements", "", "checkIndex", "checkIndexArray", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "move", "from", "to", "moveBackward", "moveBackwardFull", "remove", "removeAll", "removeAt", "removeAt0", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toString", "", "Companion", "Stay" })
public final class CircularArray<E> implements List<E>, KMutableList
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Object[] array;
    private int size;
    private int index;
    
    private CircularArray(final Object[] array, final boolean filled) {
        this.array = array;
        this.size = (filled ? this.array.length : 0);
    }
    
    public CircularArray(final int size) {
        this(new Object[size], false);
    }
    
    public CircularArray(final int size, final E defaultValue) {
        int i = 0;
        final Object[] array = new Object[size];
        while (i < size) {
            array[i] = defaultValue;
            ++i;
        }
        this(array, true);
    }
    
    public CircularArray(final int size, @NotNull final Function1<? super Integer, ? extends E> init) {
        Intrinsics.checkNotNullParameter((Object)init, "init");
        int i = 0;
        final Object[] array = new Object[size];
        while (i < size) {
            final int j = i;
            array[j] = init.invoke((Object)j);
            ++i;
        }
        this(array, true);
    }
    
    public int getSize() {
        return this.size;
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public E get(final int index) {
        this.checkIndex(index);
        return (E)this.array[index];
    }
    
    @Override
    public int indexOf(final Object element) {
        int j = 0;
        while (j < this.size()) {
            final int i = j;
            ++j;
            if (Intrinsics.areEqual(this.array[i], element)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public int lastIndexOf(final Object element) {
        int n = this.size() - 1;
        if (0 <= n) {
            do {
                final int i = n;
                --n;
                if (Intrinsics.areEqual(this.array[i], element)) {
                    return i;
                }
            } while (0 <= n);
        }
        return -1;
    }
    
    @Override
    public boolean addAll(final int index, @NotNull final Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter((Object)elements, "elements");
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean addAll(@NotNull final Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter((Object)elements, "elements");
        for (final Object element : elements) {
            this.add(element);
        }
        return true;
    }
    
    @Override
    public void add(final int index, final E element) {
        this.checkIndexArray(index);
        if (this.size() < this.array.length) {
            if (index == 0) {
                if (this.isEmpty()) {
                    this.add(element);
                }
                else {
                    this.moveBackward(index);
                    this.add0(index, element);
                }
            }
            else if (index == this.size()) {
                this.add0(index, element);
            }
            else {
                this.moveBackward(index);
                this.add0(index, element);
            }
        }
        else {
            if (index > 0) {
                this.move(0, 1, index - 1);
            }
            final int lastIndex = this.size() - 1;
            final int end = lastIndex - index;
            if (end > 0) {
                this.array[0] = this.array[lastIndex];
                this.move(index, index + 1, end);
            }
            this.array[index] = element;
        }
    }
    
    @Override
    public boolean add(final E element) {
        this.add0(this.index, element);
        return true;
    }
    
    private final void add0(final int index, final E element) {
        this.array[index] = element;
        this.index = (this.index + 1) % this.array.length;
        if (this.size() < this.array.length) {
            this.size = this.size() + 1;
        }
    }
    
    @Override
    public E set(final int index, final E element) {
        this.checkIndex(index);
        final Object prev = this.array[index];
        this.array[index] = element;
        return (E)prev;
    }
    
    @Override
    public boolean retainAll(@NotNull final Collection<?> elements) {
        Intrinsics.checkNotNullParameter((Object)elements, "elements");
        final Ref.BooleanRef removed = new Ref.BooleanRef();
        this.removeIf(CircularArray::retainAll$lambda-1);
        return removed.element;
    }
    
    @Override
    public boolean removeAll(@NotNull final Collection<?> elements) {
        Intrinsics.checkNotNullParameter((Object)elements, "elements");
        boolean removed = false;
        for (final Object element : elements) {
            removed = (this.remove(element) || removed);
        }
        return removed;
    }
    
    @Override
    public boolean remove(final Object element) {
        int n = 0;
        if (n < this.size()) {
            final int i = n;
            ++n;
            if (Intrinsics.areEqual(this.array[i], element)) {
                this.removeAt0(i);
            }
            return true;
        }
        return false;
    }
    
    public E removeAt(final int index) {
        this.checkIndex(index);
        return this.removeAt0(index);
    }
    
    private final E removeAt0(final int index) {
        final Object element = this.get(index);
        final int numMoved = this.size() - index - 1;
        if (numMoved > 0) {
            this.move(index + 1, index, numMoved);
        }
        this.array[this.size() - 1] = null;
        this.size = this.size() - 1;
        return (E)element;
    }
    
    @Override
    public void clear() {
        this.size = 0;
        this.index = 0;
    }
    
    @Override
    public boolean contains(final Object element) {
        return ArraysKt.contains(this.array, element);
    }
    
    @Override
    public boolean containsAll(@NotNull final Collection<?> elements) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "elements"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* elements */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_2       
        //    11: aload_0         /* this */
        //    12: getfield        me/alpha432/stay/util/CircularArray.array:[Ljava/lang/Object;
        //    15: astore_3       
        //    16: iconst_0       
        //    17: istore          $i$f$all
        //    19: aload_2         /* $this$all$iv */
        //    20: checkcast       Ljava/util/Collection;
        //    23: invokeinterface java/util/Collection.isEmpty:()Z
        //    28: ifeq            35
        //    31: iconst_1       
        //    32: goto            83
        //    35: aload_2         /* $this$all$iv */
        //    36: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    41: astore          5
        //    43: aload           5
        //    45: invokeinterface java/util/Iterator.hasNext:()Z
        //    50: ifeq            82
        //    53: aload           5
        //    55: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    60: astore          element$iv
        //    62: aload           element$iv
        //    64: astore          p0
        //    66: iconst_0       
        //    67: istore          $i$a$-all-CircularArray$containsAll$1
        //    69: aload_3        
        //    70: aload           p0
        //    72: invokestatic    kotlin/collections/ArraysKt.contains:([Ljava/lang/Object;Ljava/lang/Object;)Z
        //    75: ifne            43
        //    78: iconst_0       
        //    79: goto            83
        //    82: iconst_1       
        //    83: ireturn        
        //    Signature:
        //  (Ljava/util/Collection<*>;)Z [from metadata: (Ljava/util/Collection<+Ljava/lang/Object;>;)Z]
        //  
        //    StackMapTable: 00 04 FE 00 23 07 00 DA 07 00 5C 01 FC 00 07 07 00 94 26 FF 00 00 00 05 07 00 02 07 00 8F 07 00 DA 07 00 5C 01 00 01 01
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    public List<E> subList(final int fromIndex, final int toIndex) {
        this.checkIndex(fromIndex);
        this.checkIndex(toIndex);
        final ArrayList $this$subList_u24lambda_u2d2;
        final ArrayList list = $this$subList_u24lambda_u2d2 = new ArrayList(toIndex - fromIndex);
        final int n = 0;
        int j = fromIndex;
        while (j < toIndex) {
            final int i = j;
            ++j;
            $this$subList_u24lambda_u2d2.add(this.array[i]);
        }
        return (ArrayList<E>)list;
    }
    
    @NotNull
    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>)new CircularArray$iterator.CircularArray$iterator$1(this);
    }
    
    @NotNull
    @Override
    public ListIterator<E> listIterator() {
        return this.listIterator(0);
    }
    
    @NotNull
    @Override
    public ListIterator<E> listIterator(final int index) {
        return (ListIterator<E>)new CircularArray$listIterator.CircularArray$listIterator$1(index, this);
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder $this$toString_u24lambda_u2d3 = new StringBuilder();
        final int n = 0;
        final int lastIndex = this.size() - 1;
        $this$toString_u24lambda_u2d3.append('[');
        int n2 = 0;
        if (n2 <= lastIndex) {
            int i;
            do {
                i = n2;
                ++n2;
                $this$toString_u24lambda_u2d3.append(this.array[i]);
                if (i != lastIndex) {
                    $this$toString_u24lambda_u2d3.append(", ");
                }
            } while (i != lastIndex);
        }
        $this$toString_u24lambda_u2d3.append(']');
        final String string = $this$toString_u24lambda_u2d3.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "StringBuilder().run {\n  \u2026     toString()\n        }");
        return string;
    }
    
    private final void checkIndexArray(final int index) {
        if (index >= this.array.length || index > this.size()) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
    }
    
    private final void checkIndex(final int index) {
        if (this.size() == 0 || index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
    }
    
    private final void moveBackwardFull(final int index) {
        this.move(index, index + 1, this.size() - index - 1);
    }
    
    private final void moveBackward(final int index) {
        this.move(index, index + 1, this.size() - index);
    }
    
    private final void move(final int from, final int to, final int size) {
        System.arraycopy(this.array, from, this.array, to, size);
    }
    
    private static final boolean retainAll$lambda-1(final Collection $elements, final Ref.BooleanRef $removed, final Object element) {
        Intrinsics.checkNotNullParameter((Object)$elements, "$elements");
        Intrinsics.checkNotNullParameter((Object)$removed, "$removed");
        final boolean it = $elements.contains(element);
        final int n = 0;
        $removed.element = ($removed.element || it);
        return !it;
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
    
    @Override
    public final /* bridge */ E remove(final int index) {
        return this.removeAt(index);
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        Intrinsics.checkNotNullParameter((Object)array, "array");
        return (T[])CollectionToArray.toArray((Collection)this, (Object[])array);
    }
    
    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray((Collection)this);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0005J\u0010\u0010\u0003\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/CircularArray$Companion;", "", "()V", "average", "", "Lme/alpha432/stay/util/CircularArray;", "", "", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final float average(@NotNull final CircularArray<Float> $this$average) {
            Intrinsics.checkNotNullParameter((Object)$this$average, "<this>");
            if ($this$average.size() == 0) {
                return 0.0f;
            }
            float sum = 0.0f;
            int i;
            for (int j = 0; j < $this$average.size(); ++j, sum += $this$average.get(i).floatValue()) {
                i = j;
            }
            return sum / $this$average.size();
        }
        
        public final double average(@NotNull final CircularArray<Integer> $this$average) {
            Intrinsics.checkNotNullParameter((Object)$this$average, "<this>");
            if ($this$average.size() == 0) {
                return 0.0;
            }
            double sum = 0.0;
            int i;
            for (int j = 0; j < $this$average.size(); ++j, sum += $this$average.get(i).doubleValue()) {
                i = j;
            }
            return sum / $this$average.size();
        }
    }
}
