//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.inventory.item;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import kotlin.math.*;
import net.minecraft.enchantment.*;
import io.netty.buffer.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000L\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u001f\u001a\u0012\u0010)\u001a\u00020\u000e*\u00020\u00022\u0006\u0010*\u001a\u00020+\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u000e*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0017\u001a\u00020\u000e*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001a\u001a\u00020\u001b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c\"\u0015\u0010\u001d\u001a\u00020\u001b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c\"\u0015\u0010\u001e\u001a\u00020\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010\"\u001a\u00020\u0001*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006," }, d2 = { "attackDamage", "", "Lnet/minecraft/item/ItemStack;", "getAttackDamage", "(Lnet/minecraft/item/ItemStack;)F", "baseAttackDamage", "Lnet/minecraft/item/Item;", "getBaseAttackDamage", "(Lnet/minecraft/item/Item;)F", "block", "Lnet/minecraft/block/Block;", "getBlock", "(Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;", "duraPercentage", "", "getDuraPercentage", "(Lnet/minecraft/item/ItemStack;)I", "durability", "getDurability", "foodValue", "Lnet/minecraft/item/ItemFood;", "getFoodValue", "(Lnet/minecraft/item/ItemFood;)I", "id", "getId", "(Lnet/minecraft/item/Item;)I", "isTool", "", "(Lnet/minecraft/item/Item;)Z", "isWeapon", "originalName", "", "getOriginalName", "(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;", "saturation", "getSaturation", "(Lnet/minecraft/item/ItemFood;)F", "itemPayload", "", "item", "channelIn", "getEnchantmentLevel", "enchantment", "Lnet/minecraft/enchantment/Enchantment;", "Stay" })
public final class ItemKt
{
    @NotNull
    public static final String getOriginalName(@NotNull final ItemStack $this$originalName) {
        Intrinsics.checkNotNullParameter((Object)$this$originalName, "<this>");
        final String getItemStackDisplayName = $this$originalName.item.getItemStackDisplayName($this$originalName);
        Intrinsics.checkNotNullExpressionValue((Object)getItemStackDisplayName, "item.getItemStackDisplayName(this)");
        return getItemStackDisplayName;
    }
    
    public static final int getId(@NotNull final Item $this$id) {
        Intrinsics.checkNotNullParameter((Object)$this$id, "<this>");
        return Item.getIdFromItem($this$id);
    }
    
    @NotNull
    public static final Block getBlock(@NotNull final Item $this$block) {
        Intrinsics.checkNotNullParameter((Object)$this$block, "<this>");
        final Block getBlockFromItem = Block.getBlockFromItem($this$block);
        Intrinsics.checkNotNullExpressionValue((Object)getBlockFromItem, "getBlockFromItem(this)");
        return getBlockFromItem;
    }
    
    public static final boolean isWeapon(@NotNull final Item $this$isWeapon) {
        Intrinsics.checkNotNullParameter((Object)$this$isWeapon, "<this>");
        return $this$isWeapon instanceof ItemSword || $this$isWeapon instanceof ItemAxe;
    }
    
    public static final boolean isTool(@NotNull final Item $this$isTool) {
        Intrinsics.checkNotNullParameter((Object)$this$isTool, "<this>");
        return $this$isTool instanceof ItemTool || $this$isTool instanceof ItemSword || $this$isTool instanceof ItemHoe || $this$isTool instanceof ItemShears;
    }
    
    public static final int getFoodValue(@NotNull final ItemFood $this$foodValue) {
        Intrinsics.checkNotNullParameter((Object)$this$foodValue, "<this>");
        return $this$foodValue.getHealAmount(ItemStack.EMPTY);
    }
    
    public static final float getSaturation(@NotNull final ItemFood $this$saturation) {
        Intrinsics.checkNotNullParameter((Object)$this$saturation, "<this>");
        return getFoodValue($this$saturation) * $this$saturation.getSaturationModifier(ItemStack.EMPTY) * 2.0f;
    }
    
    public static final float getAttackDamage(@NotNull final ItemStack $this$attackDamage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "<this>"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$attackDamage */
        //     7: getfield        net/minecraft/item/ItemStack.item:Lnet/minecraft/item/Item;
        //    10: astore_1       
        //    11: aload_1        
        //    12: ldc             "this.item"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_1        
        //    18: invokestatic    me/alpha432/stay/util/inventory/item/ItemKt.getBaseAttackDamage:(Lnet/minecraft/item/Item;)F
        //    21: getstatic       net/minecraft/init/Enchantments.SHARPNESS:Lnet/minecraft/enchantment/Enchantment;
        //    24: aload_0         /* $this$attackDamage */
        //    25: invokestatic    net/minecraft/enchantment/EnchantmentHelper.getEnchantmentLevel:(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        //    28: istore_2       
        //    29: fstore          4
        //    31: iconst_0       
        //    32: istore_3       
        //    33: iload_2         /* it */
        //    34: ifle            48
        //    37: iload_2         /* it */
        //    38: i2f            
        //    39: ldc             0.5
        //    41: fmul           
        //    42: ldc             0.5
        //    44: fadd           
        //    45: goto            49
        //    48: fconst_0       
        //    49: nop            
        //    50: fstore          5
        //    52: fload           4
        //    54: fload           5
        //    56: nop            
        //    57: fadd           
        //    58: freturn        
        //    StackMapTable: 00 02 FF 00 30 00 05 07 00 45 07 00 4A 01 01 02 00 00 40 02
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final float getBaseAttackDamage(@NotNull final Item $this$baseAttackDamage) {
        Intrinsics.checkNotNullParameter((Object)$this$baseAttackDamage, "<this>");
        return ($this$baseAttackDamage instanceof ItemSword) ? (((ItemSword)$this$baseAttackDamage).getAttackDamage() + 4.0f) : (($this$baseAttackDamage instanceof ItemTool) ? (((ItemTool)$this$baseAttackDamage).attackDamage + 1.0f) : 1.0f);
    }
    
    public static final int getDurability(@NotNull final ItemStack $this$durability) {
        Intrinsics.checkNotNullParameter((Object)$this$durability, "<this>");
        return $this$durability.getMaxDamage() - $this$durability.itemDamage;
    }
    
    public static final int getDuraPercentage(@NotNull final ItemStack $this$duraPercentage) {
        Intrinsics.checkNotNullParameter((Object)$this$duraPercentage, "<this>");
        return MathKt.roundToInt(getDurability($this$duraPercentage) * 100.0f / $this$duraPercentage.getMaxDamage());
    }
    
    public static final int getEnchantmentLevel(@NotNull final ItemStack $this$getEnchantmentLevel, @NotNull final Enchantment enchantment) {
        Intrinsics.checkNotNullParameter((Object)$this$getEnchantmentLevel, "<this>");
        Intrinsics.checkNotNullParameter((Object)enchantment, "enchantment");
        return EnchantmentHelper.getEnchantmentLevel(enchantment, $this$getEnchantmentLevel);
    }
    
    public static final void itemPayload(@NotNull final ItemStack item, @NotNull final String channelIn) {
        Intrinsics.checkNotNullParameter((Object)item, "item");
        Intrinsics.checkNotNullParameter((Object)channelIn, "channelIn");
        final PacketBuffer buffer = new PacketBuffer(Unpooled.buffer());
        buffer.writeItemStack(item);
        Util.mc.player.connection.sendPacket((Packet)new CPacketCustomPayload(channelIn, buffer));
    }
}
