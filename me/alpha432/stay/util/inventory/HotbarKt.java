//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.inventory;

import kotlin.*;
import cakeslayers.team.eventsystem.*;
import java.util.function.*;
import net.minecraft.block.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.player.*;
import java.util.*;
import net.minecraft.inventory.*;
import me.alpha432.stay.util.inventory.slot.*;
import me.alpha432.stay.util.extension.*;
import net.minecraft.item.*;
import java.lang.reflect.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086\b\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u001a+\u0010\t\u001a\u00020\u0001\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b*\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086\b\u001a$\u0010\t\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013" }, d2 = { "swapToBlock", "", "B", "Lnet/minecraft/block/Block;", "Lcakeslayers/team/eventsystem/SafeClientEvent;", "predicate", "Ljava/util/function/Predicate;", "Lnet/minecraft/item/ItemStack;", "block", "swapToItem", "I", "Lnet/minecraft/item/Item;", "item", "swapToSlot", "", "slot", "", "hotbarSlot", "Lme/alpha432/stay/util/inventory/slot/HotbarSlot;", "Stay" })
public final class HotbarKt
{
    public static final boolean swapToBlock(@NotNull final SafeClientEvent $this$swapToBlock, @NotNull final Block block, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$swapToBlock, "<this>");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final EntityPlayer $this$hotbarSlots$iv = (EntityPlayer)$this$swapToBlock.getPlayer();
        final int $i$f$getHotbarSlots = 0;
        final ArrayList $this$_get_hotbarSlots__u24lambda_u2d0$iv = new ArrayList();
        final int n = 0;
        int i = 36;
        while (i < 45) {
            final int slot$iv = i;
            ++i;
            final ArrayList list = $this$_get_hotbarSlots__u24lambda_u2d0$iv;
            final Slot value = $this$hotbarSlots$iv.inventoryContainer.inventorySlots.get(slot$iv);
            Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[slot]");
            list.add(new HotbarSlot(value));
        }
        final HotbarSlot hotbarSlot = (HotbarSlot)IterableKt.firstBlock((Iterable)$this$_get_hotbarSlots__u24lambda_u2d0$iv, block, (Predicate)predicate);
        boolean b;
        if (hotbarSlot == null) {
            b = false;
        }
        else {
            final HotbarSlot it = hotbarSlot;
            final int n2 = 0;
            swapToSlot($this$swapToBlock, it);
            b = true;
        }
        return b;
    }
    
    public static final boolean swapToItem(@NotNull final SafeClientEvent $this$swapToItem, @NotNull final Item item, @Nullable final Predicate<ItemStack> predicate) {
        Intrinsics.checkNotNullParameter((Object)$this$swapToItem, "<this>");
        Intrinsics.checkNotNullParameter((Object)item, "item");
        final EntityPlayer $this$hotbarSlots$iv = (EntityPlayer)$this$swapToItem.getPlayer();
        final int $i$f$getHotbarSlots = 0;
        final ArrayList $this$_get_hotbarSlots__u24lambda_u2d0$iv = new ArrayList();
        final int n = 0;
        int i = 36;
        while (i < 45) {
            final int slot$iv = i;
            ++i;
            final ArrayList list = $this$_get_hotbarSlots__u24lambda_u2d0$iv;
            final Slot value = $this$hotbarSlots$iv.inventoryContainer.inventorySlots.get(slot$iv);
            Intrinsics.checkNotNullExpressionValue((Object)value, "inventoryContainer.inventorySlots[slot]");
            list.add(new HotbarSlot(value));
        }
        final HotbarSlot hotbarSlot = (HotbarSlot)IterableKt.firstItem((Iterable)$this$_get_hotbarSlots__u24lambda_u2d0$iv, item, (Predicate)predicate);
        boolean b;
        if (hotbarSlot == null) {
            b = false;
        }
        else {
            final HotbarSlot it = hotbarSlot;
            final int n2 = 0;
            swapToSlot($this$swapToItem, it);
            b = true;
        }
        return b;
    }
    
    public static final void swapToSlot(@NotNull final SafeClientEvent $this$swapToSlot, @NotNull final HotbarSlot hotbarSlot) {
        Intrinsics.checkNotNullParameter((Object)$this$swapToSlot, "<this>");
        Intrinsics.checkNotNullParameter((Object)hotbarSlot, "hotbarSlot");
        swapToSlot($this$swapToSlot, hotbarSlot.getHotbarSlot());
    }
    
    public static final void swapToSlot(@NotNull final SafeClientEvent $this$swapToSlot, final int slot) {
        Intrinsics.checkNotNullParameter((Object)$this$swapToSlot, "<this>");
        if (0 > slot || slot >= 9) {
            return;
        }
        $this$swapToSlot.getPlayer().inventory.currentItem = slot;
        final Method it = $this$swapToSlot.getPlayerController().getClass().getMethod("syncCurrentPlayItem", (Class<?>[])new Class[0]);
        final int n = 0;
        it.setAccessible(true);
        it.invoke($this$swapToSlot.getPlayerController(), new Object[0]);
    }
}
