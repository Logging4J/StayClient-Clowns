//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.inventory.slot;

import kotlin.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import net.minecraft.inventory.*;
import kotlin.ranges.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010!\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0086\b\u001a\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020%2\u0006\u0010&\u001a\u00020'H\u0086\b\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u0002*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005\"\u0016\u0010\r\u001a\u00020\u000e*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u0002*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n\"\u0016\u0010\u0013\u001a\u00020\u000e*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\"\u0016\u0010\u0015\u001a\u00020\u0002*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n\"\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005\"\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0005\"\u0016\u0010\u001b\u001a\u00020\u0002*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n\"\u0016\u0010\u001d\u001a\u00020\u0002*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\n\"\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b \u0010\u0005¨\u0006(" }, d2 = { "allSlots", "", "Lnet/minecraft/inventory/Slot;", "Lnet/minecraft/entity/player/EntityPlayer;", "getAllSlots", "(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/List;", "armorSlots", "getArmorSlots", "chestSlot", "getChestSlot", "(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Slot;", "craftingSlots", "getCraftingSlots", "currentHotbarSlot", "Lme/alpha432/stay/util/inventory/slot/HotbarSlot;", "getCurrentHotbarSlot", "(Lnet/minecraft/entity/player/EntityPlayer;)Lme/alpha432/stay/util/inventory/slot/HotbarSlot;", "feetSlot", "getFeetSlot", "firstHotbarSlot", "getFirstHotbarSlot", "headSlot", "getHeadSlot", "hotbarSlots", "getHotbarSlots", "inventorySlots", "getInventorySlots", "legsSlot", "getLegsSlot", "offhandSlot", "getOffhandSlot", "storageSlots", "getStorageSlots", "getHotbarSlot", "slot", "", "getSlots", "Lnet/minecraft/inventory/Container;", "range", "Lkotlin/ranges/IntRange;", "Stay" })
public final class DefinedKt
{
    @NotNull
    public static final List<Slot> getAllSlots(@NotNull final EntityPlayer $this$allSlots) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$getAllSlots */
        //     8: aload_0         /* $this$allSlots */
        //     9: getfield        net/minecraft/entity/player/EntityPlayer.inventoryContainer:Lnet/minecraft/inventory/Container;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ldc             "inventoryContainer"
        //    16: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_2        
        //    20: astore_2       
        //    21: new             Lkotlin/ranges/IntRange;
        //    24: dup            
        //    25: iconst_1       
        //    26: bipush          45
        //    28: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //    31: astore_3        /* range$iv */
        //    32: iconst_0       
        //    33: istore          $i$f$getSlots
        //    35: aload_2         /* $this$getSlots$iv */
        //    36: getfield        net/minecraft/inventory/Container.inventorySlots:Ljava/util/List;
        //    39: aload_3         /* range$iv */
        //    40: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //    43: aload_3         /* range$iv */
        //    44: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //    47: iconst_1       
        //    48: iadd           
        //    49: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //    54: areturn        
        //    Signature:
        //  (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/List<Lnet/minecraft/inventory/Slot;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final List<Slot> getArmorSlots(@NotNull final EntityPlayer $this$armorSlots) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$getArmorSlots */
        //     8: aload_0         /* $this$armorSlots */
        //     9: getfield        net/minecraft/entity/player/EntityPlayer.inventoryContainer:Lnet/minecraft/inventory/Container;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ldc             "inventoryContainer"
        //    16: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_2        
        //    20: astore_2       
        //    21: new             Lkotlin/ranges/IntRange;
        //    24: dup            
        //    25: iconst_5       
        //    26: bipush          8
        //    28: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //    31: astore_3        /* range$iv */
        //    32: iconst_0       
        //    33: istore          $i$f$getSlots
        //    35: aload_2         /* $this$getSlots$iv */
        //    36: getfield        net/minecraft/inventory/Container.inventorySlots:Ljava/util/List;
        //    39: aload_3         /* range$iv */
        //    40: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //    43: aload_3         /* range$iv */
        //    44: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //    47: iconst_1       
        //    48: iadd           
        //    49: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //    54: areturn        
        //    Signature:
        //  (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/List<Lnet/minecraft/inventory/Slot;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Slot getHeadSlot(@NotNull final EntityPlayer $this$headSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$headSlot, "<this>");
        final int $i$f$getHeadSlot = 0;
        final Slot value = $this$headSlot.inventoryContainer.inventorySlots.get(5);
        Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[5]");
        return value;
    }
    
    @NotNull
    public static final Slot getChestSlot(@NotNull final EntityPlayer $this$chestSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$chestSlot, "<this>");
        final int $i$f$getChestSlot = 0;
        final Slot value = $this$chestSlot.inventoryContainer.inventorySlots.get(6);
        Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[6]");
        return value;
    }
    
    @NotNull
    public static final Slot getLegsSlot(@NotNull final EntityPlayer $this$legsSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$legsSlot, "<this>");
        final int $i$f$getLegsSlot = 0;
        final Slot value = $this$legsSlot.inventoryContainer.inventorySlots.get(7);
        Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[7]");
        return value;
    }
    
    @NotNull
    public static final Slot getFeetSlot(@NotNull final EntityPlayer $this$feetSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$feetSlot, "<this>");
        final int $i$f$getFeetSlot = 0;
        final Slot value = $this$feetSlot.inventoryContainer.inventorySlots.get(8);
        Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[8]");
        return value;
    }
    
    @NotNull
    public static final Slot getOffhandSlot(@NotNull final EntityPlayer $this$offhandSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$offhandSlot, "<this>");
        final int $i$f$getOffhandSlot = 0;
        final Slot value = $this$offhandSlot.inventoryContainer.inventorySlots.get(45);
        Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[45]");
        return value;
    }
    
    @NotNull
    public static final List<Slot> getCraftingSlots(@NotNull final EntityPlayer $this$craftingSlots) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$getCraftingSlots */
        //     8: aload_0         /* $this$craftingSlots */
        //     9: getfield        net/minecraft/entity/player/EntityPlayer.inventoryContainer:Lnet/minecraft/inventory/Container;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ldc             "inventoryContainer"
        //    16: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_2        
        //    20: astore_2       
        //    21: new             Lkotlin/ranges/IntRange;
        //    24: dup            
        //    25: iconst_1       
        //    26: iconst_4       
        //    27: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //    30: astore_3        /* range$iv */
        //    31: iconst_0       
        //    32: istore          $i$f$getSlots
        //    34: aload_2         /* $this$getSlots$iv */
        //    35: getfield        net/minecraft/inventory/Container.inventorySlots:Ljava/util/List;
        //    38: aload_3         /* range$iv */
        //    39: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //    42: aload_3         /* range$iv */
        //    43: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //    46: iconst_1       
        //    47: iadd           
        //    48: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //    53: areturn        
        //    Signature:
        //  (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/List<Lnet/minecraft/inventory/Slot;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final List<Slot> getInventorySlots(@NotNull final EntityPlayer $this$inventorySlots) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$getInventorySlots */
        //     8: aload_0         /* $this$inventorySlots */
        //     9: getfield        net/minecraft/entity/player/EntityPlayer.inventoryContainer:Lnet/minecraft/inventory/Container;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ldc             "inventoryContainer"
        //    16: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_2        
        //    20: astore_2       
        //    21: new             Lkotlin/ranges/IntRange;
        //    24: dup            
        //    25: bipush          9
        //    27: bipush          44
        //    29: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //    32: astore_3        /* range$iv */
        //    33: iconst_0       
        //    34: istore          $i$f$getSlots
        //    36: aload_2         /* $this$getSlots$iv */
        //    37: getfield        net/minecraft/inventory/Container.inventorySlots:Ljava/util/List;
        //    40: aload_3         /* range$iv */
        //    41: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //    44: aload_3         /* range$iv */
        //    45: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //    48: iconst_1       
        //    49: iadd           
        //    50: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //    55: areturn        
        //    Signature:
        //  (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/List<Lnet/minecraft/inventory/Slot;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final List<Slot> getStorageSlots(@NotNull final EntityPlayer $this$storageSlots) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$getStorageSlots */
        //     8: aload_0         /* $this$storageSlots */
        //     9: getfield        net/minecraft/entity/player/EntityPlayer.inventoryContainer:Lnet/minecraft/inventory/Container;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ldc             "inventoryContainer"
        //    16: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_2        
        //    20: astore_2       
        //    21: new             Lkotlin/ranges/IntRange;
        //    24: dup            
        //    25: bipush          9
        //    27: bipush          35
        //    29: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //    32: astore_3        /* range$iv */
        //    33: iconst_0       
        //    34: istore          $i$f$getSlots
        //    36: aload_2         /* $this$getSlots$iv */
        //    37: getfield        net/minecraft/inventory/Container.inventorySlots:Ljava/util/List;
        //    40: aload_3         /* range$iv */
        //    41: invokevirtual   kotlin/ranges/IntRange.getFirst:()I
        //    44: aload_3         /* range$iv */
        //    45: invokevirtual   kotlin/ranges/IntRange.getLast:()I
        //    48: iconst_1       
        //    49: iadd           
        //    50: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //    55: areturn        
        //    Signature:
        //  (Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/List<Lnet/minecraft/inventory/Slot;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final List<HotbarSlot> getHotbarSlots(@NotNull final EntityPlayer $this$hotbarSlots) {
        Intrinsics.checkNotNullParameter((Object)$this$hotbarSlots, "<this>");
        final int $i$f$getHotbarSlots = 0;
        final ArrayList $this$_get_hotbarSlots__u24lambda_u2d0;
        final ArrayList list = $this$_get_hotbarSlots__u24lambda_u2d0 = new ArrayList();
        final int n = 0;
        int i = 36;
        while (i < 45) {
            final int slot = i;
            ++i;
            final ArrayList list2 = $this$_get_hotbarSlots__u24lambda_u2d0;
            final Slot value = $this$hotbarSlots.inventoryContainer.inventorySlots.get(slot);
            Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[slot]");
            list2.add(new HotbarSlot(value));
        }
        return (ArrayList<HotbarSlot>)list;
    }
    
    @NotNull
    public static final HotbarSlot getCurrentHotbarSlot(@NotNull final EntityPlayer $this$currentHotbarSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$currentHotbarSlot, "<this>");
        final int $i$f$getCurrentHotbarSlot = 0;
        final Slot getSlot = $this$currentHotbarSlot.inventoryContainer.getSlot($this$currentHotbarSlot.inventory.currentItem + 36);
        Intrinsics.checkNotNullExpressionValue((Object)getSlot, "inventoryContainer.getSl\u2026ventory.currentItem + 36)");
        return new HotbarSlot(getSlot);
    }
    
    @NotNull
    public static final HotbarSlot getFirstHotbarSlot(@NotNull final EntityPlayer $this$firstHotbarSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$firstHotbarSlot, "<this>");
        final int $i$f$getFirstHotbarSlot = 0;
        final Slot getSlot = $this$firstHotbarSlot.inventoryContainer.getSlot(36);
        Intrinsics.checkNotNullExpressionValue((Object)getSlot, "inventoryContainer.getSlot(36)");
        return new HotbarSlot(getSlot);
    }
    
    @NotNull
    public static final HotbarSlot getHotbarSlot(@NotNull final EntityPlayer $this$getHotbarSlot, final int slot) {
        Intrinsics.checkNotNullParameter((Object)$this$getHotbarSlot, "<this>");
        final int $i$f$getHotbarSlot = 0;
        if (0 > slot || slot >= 9) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid hotbar slot: ", (Object)slot));
        }
        final Slot value = $this$getHotbarSlot.inventoryContainer.inventorySlots.get(slot + 36);
        Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[slot + 36]");
        return new HotbarSlot(value);
    }
    
    @NotNull
    public static final List<Slot> getSlots(@NotNull final Container $this$getSlots, @NotNull final IntRange range) {
        Intrinsics.checkNotNullParameter((Object)$this$getSlots, "<this>");
        Intrinsics.checkNotNullParameter((Object)range, "range");
        final int $i$f$getSlots = 0;
        return $this$getSlots.inventorySlots.subList(range.getFirst(), range.getLast() + 1);
    }
}
