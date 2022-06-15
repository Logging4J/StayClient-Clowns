//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.extension;

import kotlin.*;
import net.minecraft.inventory.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import net.minecraft.block.*;
import org.jetbrains.annotations.*;
import java.util.*;
import net.minecraft.item.*;
import me.alpha432.stay.util.inventory.item.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086\b\u001a*\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a\"\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a\u0010\u0010\u000b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a*\u0010\f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a1\u0010\u000e\u001a\u00020\u0001\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086\b\u001a*\u0010\u000e\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\b\b\u0001\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086\b\u001a:\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a:\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010\r\u001a\u00020\u00012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001aA\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0010\"\b\b\u0001\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086\b\u001a:\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a2\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001aB\u0010\u0018\u001a\u0004\u0018\u0001H\u0014\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\b\b\u0001\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086\b¢\u0006\u0002\u0010\u0019\u001a;\u0010\u0018\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\u001a\u001a3\u0010\u001b\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\u0019\u001a!\u0010\u001c\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u0004¢\u0006\u0002\u0010\u001d\u001a;\u0010\u001e\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010\r\u001a\u00020\u00012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\u001f\u001aB\u0010 \u001a\u0004\u0018\u0001H\u0014\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0010\"\b\b\u0001\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0086\b¢\u0006\u0002\u0010\u0019\u001a;\u0010 \u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010!\u001a\u0010\u0010\"\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u0010\u0010$\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u001f\u0010%\u001a\u00020#\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b\u001a\u0018\u0010%\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u0010\u001a&\u0010%\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006&" }, d2 = { "countBlock", "", "B", "Lnet/minecraft/block/Block;", "", "Lnet/minecraft/inventory/Slot;", "predicate", "Ljava/util/function/Predicate;", "Lnet/minecraft/item/ItemStack;", "block", "countByStack", "countEmpty", "countID", "itemID", "countItem", "I", "Lnet/minecraft/item/Item;", "item", "filterByBlock", "", "T", "filterByID", "filterByItem", "filterByStack", "firstBlock", "(Ljava/lang/Iterable;Ljava/util/function/Predicate;)Lnet/minecraft/inventory/Slot;", "(Ljava/lang/Iterable;Lnet/minecraft/block/Block;Ljava/util/function/Predicate;)Lnet/minecraft/inventory/Slot;", "firstByStack", "firstEmpty", "(Ljava/lang/Iterable;)Lnet/minecraft/inventory/Slot;", "firstID", "(Ljava/lang/Iterable;ILjava/util/function/Predicate;)Lnet/minecraft/inventory/Slot;", "firstItem", "(Ljava/lang/Iterable;Lnet/minecraft/item/Item;Ljava/util/function/Predicate;)Lnet/minecraft/inventory/Slot;", "hasAnyItem", "", "hasEmpty", "hasItem", "Stay" })
public final class IterableKt
{
    public static final boolean hasItem(@NotNull final Iterable<? extends Slot> $this$hasItem, @NotNull final Item item, @NotNull final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$hasItem, "<this>");
        Intrinsics.checkNotNullParameter((Object)item, "item");
        Intrinsics.checkNotNullParameter((Object)predicate, "predicate");
        final Iterable $this$any$iv = $this$hasItem;
        final int $i$f$any = 0;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final Slot slot = (Slot)element$iv;
                final int n = 0;
                final ItemStack it = slot.getStack();
                final int n2 = 0;
                if (Intrinsics.areEqual((Object)it.item, (Object)item) && predicate.test(it)) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public static final boolean hasItem(@NotNull final Iterable<? extends Slot> $this$hasItem, @NotNull final Item item) {
        Intrinsics.checkNotNullParameter((Object)$this$hasItem, "<this>");
        Intrinsics.checkNotNullParameter((Object)item, "item");
        final Iterable $this$any$iv = $this$hasItem;
        final int $i$f$any = 0;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final Slot it = (Slot)element$iv;
                final int n = 0;
                if (Intrinsics.areEqual((Object)it.getStack().item, (Object)item)) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public static final boolean hasAnyItem(@NotNull final Iterable<? extends Slot> $this$hasAnyItem) {
        Intrinsics.checkNotNullParameter((Object)$this$hasAnyItem, "<this>");
        final Iterable $this$any$iv = $this$hasAnyItem;
        final int $i$f$any = 0;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final Slot it = (Slot)element$iv;
                final int n = 0;
                if (!it.getStack().isEmpty) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public static final boolean hasEmpty(@NotNull final Iterable<? extends Slot> $this$hasEmpty) {
        Intrinsics.checkNotNullParameter((Object)$this$hasEmpty, "<this>");
        final Iterable $this$any$iv = $this$hasEmpty;
        final int $i$f$any = 0;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final Slot it = (Slot)element$iv;
                final int n = 0;
                if (it.getStack().isEmpty) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public static final int countEmpty(@NotNull final Iterable<? extends Slot> $this$countEmpty) {
        Intrinsics.checkNotNullParameter((Object)$this$countEmpty, "<this>");
        final Iterable $this$count$iv = $this$countEmpty;
        final int $i$f$count = 0;
        int n;
        if ($this$count$iv instanceof Collection && ((Collection)$this$count$iv).isEmpty()) {
            n = 0;
        }
        else {
            int count$iv = 0;
            for (final Object element$iv : $this$count$iv) {
                final Slot it = (Slot)element$iv;
                final int n2 = 0;
                if (it.getStack().isEmpty && ++count$iv < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            n = count$iv;
        }
        return n;
    }
    
    public static final int countBlock(@NotNull final Iterable<? extends Slot> $this$countBlock, @NotNull final Block block, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$countBlock, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return countByStack($this$countBlock, IterableKt::countBlock$lambda-8);
    }
    
    public static final int countItem(@NotNull final Iterable<? extends Slot> $this$countItem, @NotNull final Item item, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$countItem, "<this>");
        Intrinsics.checkNotNullParameter((Object)item, "item");
        return countByStack($this$countItem, IterableKt::countItem$lambda-9);
    }
    
    public static final int countID(@NotNull final Iterable<? extends Slot> $this$countID, final int itemID, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$countID, "<this>");
        return countByStack($this$countID, IterableKt::countID$lambda-10);
    }
    
    public static final int countByStack(@NotNull final Iterable<? extends Slot> $this$countByStack, @Nullable final Predicate<ItemStack> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$countByStack */
        //     7: astore_2       
        //     8: iconst_0       
        //     9: istore_3       
        //    10: aload_2        
        //    11: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    16: astore          4
        //    18: aload           4
        //    20: invokeinterface java/util/Iterator.hasNext:()Z
        //    25: ifeq            97
        //    28: aload           4
        //    30: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    35: astore          5
        //    37: iload_3        
        //    38: aload           5
        //    40: checkcast       Lnet/minecraft/inventory/Slot;
        //    43: astore          6
        //    45: istore          10
        //    47: iconst_0       
        //    48: istore          $i$a$-sumOfInt-IterableKt$countByStack$1
        //    50: aload           slot
        //    52: invokevirtual   net/minecraft/inventory/Slot.getStack:()Lnet/minecraft/item/ItemStack;
        //    55: astore          it
        //    57: iconst_0       
        //    58: istore          $i$a$-let-IterableKt$countByStack$1$1
        //    60: aload_1         /* predicate */
        //    61: ifnull          75
        //    64: aload_1         /* predicate */
        //    65: aload           it
        //    67: invokeinterface java/util/function/Predicate.test:(Ljava/lang/Object;)Z
        //    72: ifeq            83
        //    75: aload           it
        //    77: invokevirtual   net/minecraft/item/ItemStack.getCount:()I
        //    80: goto            84
        //    83: iconst_0       
        //    84: nop            
        //    85: nop            
        //    86: istore          11
        //    88: iload           10
        //    90: iload           11
        //    92: iadd           
        //    93: istore_3       
        //    94: goto            18
        //    97: iload_3        
        //    98: ireturn        
        //    Signature:
        //  (Ljava/lang/Iterable<+Lnet/minecraft/inventory/Slot;>;Ljava/util/function/Predicate<Lnet/minecraft/item/ItemStack;>;)I
        //    StackMapTable: 00 05 FE 00 12 07 00 56 01 07 00 5C FF 00 38 00 0B 07 00 56 07 00 74 07 00 56 01 07 00 5C 07 00 04 07 00 65 01 07 00 6B 01 01 00 00 07 40 01 FF 00 0C 00 05 07 00 56 07 00 74 07 00 56 01 07 00 5C 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public static final <T extends Slot> T firstEmpty(@NotNull final Iterable<? extends T> $this$firstEmpty) {
        Intrinsics.checkNotNullParameter((Object)$this$firstEmpty, "<this>");
        return firstByStack($this$firstEmpty, IterableKt::firstEmpty$lambda-13);
    }
    
    @Nullable
    public static final <T extends Slot> T firstBlock(@NotNull final Iterable<? extends T> $this$firstBlock, @NotNull final Block block, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$firstBlock, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return firstByStack($this$firstBlock, IterableKt::firstBlock$lambda-15);
    }
    
    @Nullable
    public static final <T extends Slot> T firstItem(@NotNull final Iterable<? extends T> $this$firstItem, @NotNull final Item item, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$firstItem, "<this>");
        Intrinsics.checkNotNullParameter((Object)item, "item");
        return firstByStack($this$firstItem, IterableKt::firstItem$lambda-16);
    }
    
    @Nullable
    public static final <T extends Slot> T firstID(@NotNull final Iterable<? extends T> $this$firstID, final int itemID, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$firstID, "<this>");
        return firstByStack($this$firstID, IterableKt::firstID$lambda-17);
    }
    
    @Nullable
    public static final <T extends Slot> T firstByStack(@NotNull final Iterable<? extends T> $this$firstByStack, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$firstByStack, "<this>");
        final Iterable $this$firstOrNull$iv = $this$firstByStack;
        final int $i$f$firstOrNull = 0;
        for (final Object element$iv : $this$firstOrNull$iv) {
            final Slot it = (Slot)element$iv;
            final int n = 0;
            if (predicate == null || predicate.test(it.getStack())) {
                final Object o = element$iv;
                return (T)o;
            }
        }
        final Object o = null;
        return (T)o;
    }
    
    @NotNull
    public static final <T extends Slot> List<T> filterByBlock(@NotNull final Iterable<? extends T> $this$filterByBlock, @NotNull final Block block, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$filterByBlock, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        return filterByStack($this$filterByBlock, IterableKt::filterByBlock$lambda-20);
    }
    
    @NotNull
    public static final <T extends Slot> List<T> filterByItem(@NotNull final Iterable<? extends T> $this$filterByItem, @NotNull final Item item, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$filterByItem, "<this>");
        Intrinsics.checkNotNullParameter((Object)item, "item");
        return filterByStack($this$filterByItem, IterableKt::filterByItem$lambda-21);
    }
    
    @NotNull
    public static final <T extends Slot> List<T> filterByID(@NotNull final Iterable<? extends T> $this$filterByID, final int itemID, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$filterByID, "<this>");
        return filterByStack($this$filterByID, IterableKt::filterByID$lambda-22);
    }
    
    @NotNull
    public static final <T extends Slot> List<T> filterByStack(@NotNull final Iterable<? extends T> $this$filterByStack, @Nullable final Predicate<ItemStack> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$filterByStack */
        //     7: astore_2        /* $this$filter$iv */
        //     8: iconst_0       
        //     9: istore_3        /* $i$f$filter */
        //    10: aload_2         /* $this$filter$iv */
        //    11: astore          4
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: checkcast       Ljava/util/Collection;
        //    23: astore          destination$iv$iv
        //    25: iconst_0       
        //    26: istore          $i$f$filterTo
        //    28: aload           $this$filterTo$iv$iv
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          7
        //    37: aload           7
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            105
        //    47: aload           7
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          element$iv$iv
        //    56: aload           element$iv$iv
        //    58: checkcast       Lnet/minecraft/inventory/Slot;
        //    61: astore          it
        //    63: iconst_0       
        //    64: istore          $i$a$-filter-IterableKt$filterByStack$1
        //    66: aload_1         /* predicate */
        //    67: ifnull          84
        //    70: aload_1         /* predicate */
        //    71: aload           it
        //    73: invokevirtual   net/minecraft/inventory/Slot.getStack:()Lnet/minecraft/item/ItemStack;
        //    76: invokeinterface java/util/function/Predicate.test:(Ljava/lang/Object;)Z
        //    81: ifeq            88
        //    84: iconst_1       
        //    85: goto            89
        //    88: iconst_0       
        //    89: ifeq            37
        //    92: aload           destination$iv$iv
        //    94: aload           element$iv$iv
        //    96: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   101: pop            
        //   102: goto            37
        //   105: aload           destination$iv$iv
        //   107: checkcast       Ljava/util/List;
        //   110: nop            
        //   111: areturn        
        //    Signature:
        //  <T:Lnet/minecraft/inventory/Slot;>(Ljava/lang/Iterable<+TT;>;Ljava/util/function/Predicate<Lnet/minecraft/item/ItemStack;>;)Ljava/util/List<TT;>;
        //    StackMapTable: 00 05 FF 00 25 00 08 07 00 56 07 00 74 07 00 56 01 07 00 56 07 00 50 01 07 00 5C 00 00 FE 00 2E 07 00 04 07 00 65 01 03 40 01 F8 00 0F
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final boolean countBlock$lambda-8(final Predicate $predicate, final Block $block, final ItemStack itemStack) {
        Intrinsics.checkNotNullParameter((Object)$block, "$block");
        Intrinsics.checkNotNullParameter((Object)itemStack, "itemStack");
        final Item it = itemStack.item;
        final int n = 0;
        return it instanceof ItemBlock && Intrinsics.areEqual((Object)((ItemBlock)it).block, (Object)$block) && ($predicate == null || $predicate.test(itemStack));
    }
    
    private static final boolean countItem$lambda-9(final Item $item, final Predicate $predicate, final ItemStack it) {
        Intrinsics.checkNotNullParameter((Object)$item, "$item");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it.item, (Object)$item) && ($predicate == null || $predicate.test(it));
    }
    
    private static final boolean countID$lambda-10(final int $itemID, final Predicate $predicate, final ItemStack it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final Item item = it.item;
        Intrinsics.checkNotNullExpressionValue((Object)item, "it.item");
        return ItemKt.getId(item) == $itemID && ($predicate == null || $predicate.test(it));
    }
    
    private static final boolean firstEmpty$lambda-13(final ItemStack it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it.isEmpty;
    }
    
    private static final boolean firstBlock$lambda-15(final Predicate $predicate, final Block $block, final ItemStack itemStack) {
        Intrinsics.checkNotNullParameter((Object)$block, "$block");
        Intrinsics.checkNotNullParameter((Object)itemStack, "itemStack");
        final Item it = itemStack.item;
        final int n = 0;
        return it instanceof ItemBlock && Intrinsics.areEqual((Object)((ItemBlock)it).block, (Object)$block) && ($predicate == null || $predicate.test(itemStack));
    }
    
    private static final boolean firstItem$lambda-16(final Item $item, final Predicate $predicate, final ItemStack it) {
        Intrinsics.checkNotNullParameter((Object)$item, "$item");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it.item, (Object)$item) && ($predicate == null || $predicate.test(it));
    }
    
    private static final boolean firstID$lambda-17(final int $itemID, final Predicate $predicate, final ItemStack it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final Item item = it.item;
        Intrinsics.checkNotNullExpressionValue((Object)item, "it.item");
        return ItemKt.getId(item) == $itemID && ($predicate == null || $predicate.test(it));
    }
    
    private static final boolean filterByBlock$lambda-20(final Predicate $predicate, final Block $block, final ItemStack itemStack) {
        Intrinsics.checkNotNullParameter((Object)$block, "$block");
        Intrinsics.checkNotNullParameter((Object)itemStack, "itemStack");
        final Item it = itemStack.item;
        final int n = 0;
        return it instanceof ItemBlock && Intrinsics.areEqual((Object)((ItemBlock)it).block, (Object)$block) && ($predicate == null || $predicate.test(itemStack));
    }
    
    private static final boolean filterByItem$lambda-21(final Item $item, final Predicate $predicate, final ItemStack it) {
        Intrinsics.checkNotNullParameter((Object)$item, "$item");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it.item, (Object)$item) && ($predicate == null || $predicate.test(it));
    }
    
    private static final boolean filterByID$lambda-22(final int $itemID, final Predicate $predicate, final ItemStack it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final Item item = it.item;
        Intrinsics.checkNotNullExpressionValue((Object)item, "it.item");
        return ItemKt.getId(item) == $itemID && ($predicate == null || $predicate.test(it));
    }
}
