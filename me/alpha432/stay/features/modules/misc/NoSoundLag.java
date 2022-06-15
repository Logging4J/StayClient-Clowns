//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import me.alpha432.stay.util.math.*;
import java.util.*;
import me.alpha432.stay.event.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraftforge.fml.common.eventhandler.*;
import com.google.common.collect.*;

public class NoSoundLag extends Module
{
    private static final Set<SoundEvent> BLACKLIST;
    private static NoSoundLag instance;
    public Setting<Boolean> crystals;
    public Setting<Boolean> armor;
    public Setting<Float> soundRange;
    
    public NoSoundLag() {
        super("NoSoundLag", "Prevents Lag through sound spam.", Category.MISC, true, false, false);
        this.crystals = (Setting<Boolean>)this.register(new Setting("Crystals", (T)true));
        this.armor = (Setting<Boolean>)this.register(new Setting("Armor", (T)true));
        this.soundRange = (Setting<Float>)this.register(new Setting("SoundRange", (T)12.0f, (T)0.0f, (T)12.0f));
        NoSoundLag.instance = this;
    }
    
    public static NoSoundLag getInstance() {
        if (NoSoundLag.instance == null) {
            NoSoundLag.instance = new NoSoundLag();
        }
        return NoSoundLag.instance;
    }
    
    public static void removeEntities(final SPacketSoundEffect packet, final float range) {
        final BlockPos pos = new BlockPos(packet.getX(), packet.getY(), packet.getZ());
        final ArrayList<Entity> toRemove = new ArrayList<Entity>();
        for (final Entity entity : NoSoundLag.mc.world.loadedEntityList) {
            if (entity instanceof EntityEnderCrystal) {
                if (entity.getDistanceSq(pos) > MathUtil.square(range)) {
                    continue;
                }
                toRemove.add(entity);
            }
        }
        for (final Entity entity : toRemove) {
            entity.setDead();
        }
    }
    
    @SubscribeEvent
    public void onPacketReceived(final PacketEvent.Receive event) {
        if (event != null && event.getPacket() != null && NoSoundLag.mc.player != null && NoSoundLag.mc.world != null && event.getPacket() instanceof SPacketSoundEffect) {
            final SPacketSoundEffect packet = (SPacketSoundEffect)event.getPacket();
            if (this.crystals.getValue() && packet.getCategory() == SoundCategory.BLOCKS && packet.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE) {
                removeEntities(packet, this.soundRange.getValue());
            }
            if (NoSoundLag.BLACKLIST.contains(packet.getSound()) && this.armor.getValue()) {
                event.setCanceled(true);
            }
        }
    }
    
    static {
        BLACKLIST = Sets.newHashSet((Object[])new SoundEvent[] { SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, SoundEvents.ITEM_ARMOR_EQUIP_IRON, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER });
    }
}
