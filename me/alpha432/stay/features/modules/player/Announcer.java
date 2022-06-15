//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.player;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.text.*;
import net.minecraftforge.event.entity.living.*;
import java.util.concurrent.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.event.*;

public class Announcer extends Module
{
    public static int blockBrokeDelay;
    static int blockPlacedDelay;
    static int jumpDelay;
    static int attackDelay;
    static int eattingDelay;
    static long lastPositionUpdate;
    static double lastPositionX;
    static double lastPositionY;
    static double lastPositionZ;
    private static double speed;
    String heldItem;
    int blocksPlaced;
    int blocksBroken;
    int eaten;
    public static String walkMessage;
    public static String breakMessage;
    public static String eatMessage;
    private final Setting<Boolean> move;
    private final Setting<Boolean> breakBlock;
    private final Setting<Boolean> eat;
    private final Setting<Double> delay;
    
    public Announcer() {
        super("Announcer", "flood chat wit da cheat on baby", Module.Category.PLAYER, false, false, false);
        this.heldItem = "";
        this.blocksPlaced = 0;
        this.blocksBroken = 0;
        this.eaten = 0;
        this.move = (Setting<Boolean>)this.register(new Setting("Move", (T)false));
        this.breakBlock = (Setting<Boolean>)this.register(new Setting("Break", (T)false));
        this.eat = (Setting<Boolean>)this.register(new Setting("Eat", (T)false));
        this.delay = (Setting<Double>)this.register(new Setting("Delay", (T)1.0, (T)1.0, (T)20.0));
    }
    
    public void onUpdate() {
        ++Announcer.blockBrokeDelay;
        ++Announcer.blockPlacedDelay;
        ++Announcer.jumpDelay;
        ++Announcer.attackDelay;
        ++Announcer.eattingDelay;
        this.heldItem = Announcer.mc.player.getHeldItemMainhand().getDisplayName();
        if (this.move.getValue() && Announcer.lastPositionUpdate + 5000.0 * this.delay.getValue() < System.currentTimeMillis()) {
            final double d0 = Announcer.lastPositionX - Announcer.mc.player.lastTickPosX;
            final double d2 = Announcer.lastPositionY - Announcer.mc.player.lastTickPosY;
            final double d3 = Announcer.lastPositionZ - Announcer.mc.player.lastTickPosZ;
            Announcer.speed = Math.sqrt(d0 * d0 + d2 * d2 + d3 * d3);
            if (Announcer.speed > 1.0 && Announcer.speed <= 5000.0) {
                final String walkAmount = new DecimalFormat("0").format(Announcer.speed);
                Announcer.mc.player.sendChatMessage(Announcer.walkMessage.replace("{blocks}", walkAmount));
            }
            Announcer.lastPositionUpdate = System.currentTimeMillis();
            Announcer.lastPositionX = Announcer.mc.player.lastTickPosX;
            Announcer.lastPositionY = Announcer.mc.player.lastTickPosY;
            Announcer.lastPositionZ = Announcer.mc.player.lastTickPosZ;
        }
    }
    
    @SubscribeEvent
    public void onItemUse(final LivingEntityUseItemEvent event) {
        final int randomNum = ThreadLocalRandom.current().nextInt(1, 11);
        if (event.getEntity() == Announcer.mc.player && (event.getItem().getItem() instanceof ItemFood || event.getItem().getItem() instanceof ItemAppleGold)) {
            ++this.eaten;
            if (Announcer.eattingDelay >= 300.0 * this.delay.getValue() && this.eat.getValue() && this.eaten > randomNum) {
                Announcer.mc.player.sendChatMessage(Announcer.eatMessage.replace("{amount}", this.eaten + "").replace("{name}", Announcer.mc.player.getHeldItemMainhand().getDisplayName()));
                this.eaten = 0;
                Announcer.eattingDelay = 0;
            }
        }
    }
    
    @SubscribeEvent
    public void onBlockBreak(final BlockDestructionEvent event) {
        ++this.blocksBroken;
        final int randomNum = ThreadLocalRandom.current().nextInt(1, 11);
        if (Announcer.blockBrokeDelay >= 300.0 * this.delay.getValue()) {
            if (this.breakBlock.getValue() && this.blocksBroken > randomNum) {
                final String msg = Announcer.breakMessage.replace("{amount}", this.blocksBroken + "").replace("{name}", Announcer.mc.world.getBlockState(event.getBlockPos()).getBlock().getLocalizedName());
                Announcer.mc.player.sendChatMessage(msg);
            }
            this.blocksBroken = 0;
            Announcer.blockBrokeDelay = 0;
        }
    }
    
    static {
        Announcer.blockBrokeDelay = 0;
        Announcer.blockPlacedDelay = 0;
        Announcer.jumpDelay = 0;
        Announcer.attackDelay = 0;
        Announcer.eattingDelay = 0;
        Announcer.walkMessage = "I just moved {blocks} blocks thanks to STAY";
        Announcer.breakMessage = "I just broke {amount} {name} thanks to STAY";
        Announcer.eatMessage = "I just ate {amount} {name} thanks to STAY";
    }
}
