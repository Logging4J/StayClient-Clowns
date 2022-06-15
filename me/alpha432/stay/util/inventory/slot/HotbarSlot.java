//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.inventory.slot;

import net.minecraft.inventory.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lme/alpha432/stay/util/inventory/slot/HotbarSlot;", "Lnet/minecraft/inventory/Slot;", "slot", "(Lnet/minecraft/inventory/Slot;)V", "hotbarSlot", "", "getHotbarSlot", "()I", "Stay" })
public final class HotbarSlot extends Slot
{
    private final int hotbarSlot;
    
    public HotbarSlot(@NotNull final Slot slot) {
        Intrinsics.checkNotNullParameter((Object)slot, "slot");
        super(slot.inventory, slot.getSlotIndex(), slot.xPos, slot.yPos);
        this.slotNumber = slot.slotNumber;
        this.hotbarSlot = slot.slotNumber - 36;
    }
    
    public final int getHotbarSlot() {
        return this.hotbarSlot;
    }
}
