//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.utils;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.jvm.internal.markers.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\t\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016J\u0015\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001c\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u001bH\u0016J\u001f\u0010#\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u00192\u0014\u0010&\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000'H\u0016J\u0017\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010!R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006*" }, d2 = { "Lcakeslayers/team/eventsystem/utils/ArrayMap;", "V", "", "", "", "()V", "array", "", "[Ljava/lang/Object;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "getSize", "()I", "size0", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "containsKey", "", "key", "containsValue", "value", "(Ljava/lang/Object;)Z", "get", "(I)Ljava/lang/Object;", "isEmpty", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "Entry", "Stay" })
public final class ArrayMap<V> implements Map<Integer, V>, KMutableMap
{
    @NotNull
    private Object[] array;
    private int size0;
    
    public ArrayMap() {
        final int $i$f$emptyArray = 0;
        this.array = new Object[0];
    }
    
    public int getSize() {
        return this.size0;
    }
    
    @Nullable
    public V put(final int key, @NotNull final V value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        Object prev = null;
        if (key >= this.array.length) {
            final Object[] copy = Arrays.copyOf(this.array, key + 10);
            Intrinsics.checkNotNullExpressionValue((Object)copy, "copyOf(this, newSize)");
            this.array = copy;
            ++this.size0;
        }
        else {
            prev = this.array[key];
            if (prev == null) {
                ++this.size0;
            }
        }
        this.array[key] = value;
        return (V)prev;
    }
    
    @Nullable
    public V get(final int key) {
        Object value = null;
        if (key < this.array.length) {
            value = this.array[key];
        }
        return (V)value;
    }
    
    public boolean containsKey(final int key) {
        return key < this.array.length && this.array[key] != null;
    }
    
    @Nullable
    public V remove(final int key) {
        Object prev = null;
        if (key < this.array.length) {
            prev = this.array[key];
            this.array[key] = null;
            if (prev != null) {
                --this.size0;
            }
        }
        return (V)prev;
    }
    
    @Override
    public void clear() {
        this.size0 = 0;
        ArraysKt.fill$default(this.array, (Object)null, 0, 0, 6, (Object)null);
    }
    
    @Override
    public boolean containsValue(@Nullable final Object value) {
        return value != null && ArraysKt.contains(this.array, value);
    }
    
    @Override
    public boolean isEmpty() {
        return this.size0 == 0;
    }
    
    @Override
    public void putAll(@NotNull final Map<? extends Integer, ? extends V> from) {
        Intrinsics.checkNotNullParameter((Object)from, "from");
        final Map $this$forEach$iv = from;
        final int $i$f$forEach = 0;
        for (final Map.Entry it : $this$forEach$iv.entrySet()) {
            final Map.Entry element$iv = it;
            final int n = 0;
            this.put(it.getKey().intValue(), it.getValue());
        }
    }
    
    @NotNull
    public Set<Map.Entry<Integer, V>> getEntries() {
        return (Set<Map.Entry<Integer, V>>)new ArrayMap$entries.ArrayMap$entries$1(this);
    }
    
    @NotNull
    public Set<Integer> getKeys() {
        return (Set<Integer>)new ArrayMap$keys.ArrayMap$keys$1(this);
    }
    
    @NotNull
    public Collection<V> getValues() {
        return (Collection<V>)new ArrayMap$values.ArrayMap$values$1(this);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
    
    @Override
    public final /* bridge */ V get(final Object key) {
        if (!(key instanceof Integer)) {
            return null;
        }
        return this.get(((Number)key).intValue());
    }
    
    @Override
    public final /* bridge */ boolean containsKey(final Object key) {
        return key instanceof Integer && this.containsKey(((Number)key).intValue());
    }
    
    @Override
    public final /* bridge */ V remove(final Object key) {
        if (!(key instanceof Integer)) {
            return null;
        }
        return this.remove(((Number)key).intValue());
    }
    
    @Override
    public final /* bridge */ Set<Map.Entry<Integer, V>> entrySet() {
        return this.getEntries();
    }
    
    @Override
    public final /* bridge */ Set<Integer> keySet() {
        return this.getKeys();
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return this.getValues();
    }
    
    public static final /* synthetic */ Object[] access$getArray$p(final ArrayMap $this) {
        return $this.array;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012" }, d2 = { "Lcakeslayers/team/eventsystem/utils/ArrayMap$Entry;", "", "", "key", "(Lcakeslayers/team/eventsystem/utils/ArrayMap;I)V", "getKey", "()Ljava/lang/Integer;", "value", "getValue", "()Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "Stay" })
    private final class Entry implements Map.Entry<Integer, V>, KMutableMap$Entry
    {
        private final int key;
        
        public Entry(final int key) {
            Intrinsics.checkNotNullParameter((Object)ArrayMap.this, "this$0");
            this.key = key;
        }
        
        @NotNull
        public Integer getKey() {
            return this.key;
        }
        
        @NotNull
        @Override
        public V getValue() {
            final Object o = ArrayMap.access$getArray$p(ArrayMap.this)[this.getKey()];
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type V of cakeslayers.team.eventsystem.utils.ArrayMap");
            }
            return (V)o;
        }
        
        @NotNull
        @Override
        public V setValue(@NotNull final V newValue) {
            Intrinsics.checkNotNullParameter((Object)newValue, "newValue");
            final V put = ArrayMap.this.put((int)this.getKey(), this.getValue());
            Intrinsics.checkNotNull((Object)put);
            return put;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            final int intValue = this.getKey();
            final Number key = ((Map.Entry)other).getKey();
            if (key instanceof Integer) {
                if (intValue == key.intValue()) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return this.getKey();
        }
    }
}
