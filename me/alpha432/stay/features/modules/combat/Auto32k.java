//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import java.awt.*;
import me.alpha432.stay.features.command.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import me.alpha432.stay.features.gui.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import java.util.function.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.util.world.*;
import java.util.stream.*;
import net.minecraft.client.gui.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.network.play.client.*;
import me.alpha432.stay.event.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.features.modules.render.*;
import org.lwjgl.opengl.*;
import me.alpha432.stay.util.graphics.opengl.*;
import me.alpha432.stay.util.math.*;
import java.util.*;

public class Auto32k extends Module
{
    public Setting<Boolean> rotate;
    public Setting<Boolean> swordOnly;
    public Setting<Boolean> tot;
    public Setting<Boolean> criticals;
    public Setting<Boolean> NBT;
    public Setting<Boolean> look;
    private final Setting<Bind> bind2;
    public Setting<Boolean> fuckmom;
    public Setting<Boolean> Second;
    private final Setting<Double> fuck;
    private final Setting<Integer> packets;
    public Setting<Boolean> no;
    public Setting<Boolean> Killaura;
    public Setting<Boolean> tps;
    public Setting<Boolean> packet;
    public Setting<Boolean> delay;
    public Setting<Boolean> auto;
    private final Setting<Double> fucks;
    private final Setting<Integer> delay2;
    public Setting<Boolean> friends;
    public Setting<Boolean> tarp;
    private final Setting<Double> tarprange;
    public Setting<Boolean> packet2;
    private final Setting<Bind> bind;
    private final Setting<Double> range;
    private final Setting<Double> range3;
    private final Setting<Boolean> Auxiliary;
    private final Setting<Boolean> Pointer;
    private final Setting<Integer> red;
    private final Setting<Integer> green;
    private final Setting<Integer> blue;
    private final Setting<Integer> radius;
    private final Setting<Float> size;
    private final Setting<Boolean> outline;
    private final Setting<Float> outlineWidth;
    private final Setting<Integer> fadeDistance;
    private int fume;
    public int totems;
    private String stagething;
    private int Hopperslot;
    private int ShulkerSlot;
    private int playerHotbarSlot;
    public static BlockPos placeTarget;
    public static BlockPos placeTarget2;
    private boolean active;
    private int beds;
    private int stage;
    private int shulkerSlot;
    private final Timer timer;
    private final Timer timer2;
    private int hopperSlot;
    private boolean isSneaking;
    private boolean isAttacking;
    private boolean offHand;
    private float I;
    private Entity IS;
    public static final List<BlockPos> Trap;
    boolean moving;
    boolean returnI;
    private Timer tis;
    
    public Auto32k() {
        super("AutoXin32k", "Automatically places 32ks", Category.COMBAT, true, false, false);
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.swordOnly = (Setting<Boolean>)this.register(new Setting("SwordOnly", (T)true));
        this.tot = (Setting<Boolean>)this.register(new Setting("Totem switch", (T)true));
        this.criticals = (Setting<Boolean>)this.register(new Setting("criticals", (T)true));
        this.NBT = (Setting<Boolean>)this.register(new Setting("NBT", (T)true));
        this.look = (Setting<Boolean>)this.register(new Setting("LookMode", (T)true));
        this.bind2 = (Setting<Bind>)this.register(new Setting("LookPlacesBind", (T)new Bind(42), v -> this.look.getValue()));
        this.fuckmom = (Setting<Boolean>)this.register(new Setting("Armor detection", (T)true, v -> this.criticals.getValue()));
        this.Second = (Setting<Boolean>)this.register(new Setting("Second knife", (T)true, v -> this.criticals.getValue()));
        this.fuck = (Setting<Double>)this.register(new Setting("Execute full tool HP:", (T)24.0, (T)0.0, (T)36.0, v -> this.Second.getValue()));
        this.packets = (Setting<Integer>)this.register(new Setting("criticalsPackets", (T)3, (T)1, (T)4, v -> this.criticals.getValue()));
        this.no = (Setting<Boolean>)this.register(new Setting("Close crystal", (T)false));
        this.Killaura = (Setting<Boolean>)this.register(new Setting("Killaura", (T)true));
        this.tps = (Setting<Boolean>)this.register(new Setting("Killaura.TpsSync", (T)Boolean.TRUE, v -> this.Killaura.getValue()));
        this.packet = (Setting<Boolean>)this.register(new Setting("Killaura.Packet", (T)Boolean.FALSE, v -> this.Killaura.getValue()));
        this.delay = (Setting<Boolean>)this.register(new Setting("Killaura.HitDelay", (T)Boolean.FALSE, v -> this.Killaura.getValue()));
        this.auto = (Setting<Boolean>)this.register(new Setting("Killaura.AutoDelay", (T)Boolean.FALSE, v -> !this.delay.getValue()));
        this.fucks = (Setting<Double>)this.register(new Setting("HP:", (T)13.0, (T)0.0, (T)36.0, v -> this.auto.getValue()));
        this.delay2 = (Setting<Integer>)this.register(new Setting("KILLDelay", (T)100, (T)0, (T)1000, v -> this.Killaura.getValue()));
        this.friends = (Setting<Boolean>)this.register(new Setting("No friends", (T)true));
        this.tarp = (Setting<Boolean>)this.register(new Setting("Tarpknife", (T)false));
        this.tarprange = (Setting<Double>)this.register(new Setting("TarpRange", (T)10.0, (T)1.0, (T)25.0, v -> this.tarp.getValue()));
        this.packet2 = (Setting<Boolean>)this.register(new Setting("Packet", (T)false, v -> this.tarp.getValue()));
        this.bind = (Setting<Bind>)this.register(new Setting("PlacesBind", (T)new Bind(-1)));
        this.range = (Setting<Double>)this.register(new Setting("Place Distance", (T)5.0, (T)0.0, (T)10.0));
        this.range3 = (Setting<Double>)this.register(new Setting("Detection distance", (T)10.0, (T)1.0, (T)20.0));
        this.Auxiliary = (Setting<Boolean>)this.register(new Setting("Auxiliary algorithm", (T)true));
        this.Pointer = (Setting<Boolean>)this.register(new Setting("Pointer", (T)true));
        this.red = (Setting<Integer>)this.register(new Setting("Red", (T)255, (T)0, (T)255, v -> this.Pointer.getValue()));
        this.green = (Setting<Integer>)this.register(new Setting("Green", (T)255, (T)0, (T)255, v -> this.Pointer.getValue()));
        this.blue = (Setting<Integer>)this.register(new Setting("Blue", (T)255, (T)0, (T)255, v -> this.Pointer.getValue()));
        this.radius = (Setting<Integer>)this.register(new Setting("Placement", (T)45, (T)10, (T)200, v -> this.Pointer.getValue()));
        this.size = (Setting<Float>)this.register(new Setting("Size", (T)10.0f, (T)5.0f, (T)25.0f, v -> this.Pointer.getValue()));
        this.outline = (Setting<Boolean>)this.register(new Setting("Outline", (T)true, v -> this.Pointer.getValue()));
        this.outlineWidth = (Setting<Float>)this.register(new Setting("Outline-Width", (T)1.0f, (T)0.1f, (T)3.0f, v -> this.Pointer.getValue()));
        this.fadeDistance = (Setting<Integer>)this.register(new Setting("Range", (T)100, (T)10, (T)200, v -> this.Pointer.getValue()));
        this.fume = 0;
        this.totems = 0;
        this.timer = new Timer();
        this.timer2 = new Timer();
        this.isAttacking = false;
        this.offHand = false;
        this.moving = false;
        this.returnI = false;
        this.tis = new Timer();
    }
    
    public static Color getColor(final int red, final int green, final int blue, final int alpha) {
        final Color color = new Color(red / 255.0f, green / 255.0f, blue / 255.0f, alpha / 255.0f);
        return color;
    }
    
    private void lookmods() {
        Auto32k.placeTarget = null;
        Auto32k.placeTarget2 = null;
        this.Hopperslot = -1;
        this.ShulkerSlot = -1;
        final RayTraceResult ray = BlockHighlight.mc.objectMouseOver;
        if (ray == null) {
            return;
        }
        final BlockPos placePos = ray.getBlockPos();
        if (Auto32k.mc.world.getBlockState(new BlockPos(placePos.getX(), placePos.getY() + 1, placePos.getZ())).getBlock() != Blocks.AIR || Auto32k.mc.world.getBlockState(new BlockPos(placePos.getX(), placePos.getY() + 2, placePos.getZ())).getBlock() != Blocks.AIR) {
            return;
        }
        if (Auto32k.mc.world.getBlockState(new BlockPos(placePos.getX(), placePos.getY(), placePos.getZ())).getBlock() == Blocks.AIR && Auto32k.mc.world.getBlockState(new BlockPos(placePos.getX() + 1, placePos.getY(), placePos.getZ())).getBlock() == Blocks.AIR && Auto32k.mc.world.getBlockState(new BlockPos(placePos.getX() - 1, placePos.getY(), placePos.getZ())).getBlock() == Blocks.AIR && Auto32k.mc.world.getBlockState(new BlockPos(placePos.getX(), placePos.getY(), placePos.getZ() + 1)).getBlock() == Blocks.AIR && Auto32k.mc.world.getBlockState(new BlockPos(placePos.getX(), placePos.getY(), placePos.getZ() - 1)).getBlock() == Blocks.AIR) {
            return;
        }
        if (placePos == null) {
            return;
        }
        Auto32k.placeTarget = placePos.add(0, 1, 0);
        Anti32k.min = Auto32k.placeTarget;
        this.isSneaking = false;
        for (int x = 0; x <= 8; ++x) {
            final Item item = Auto32k.mc.player.inventory.getStackInSlot(x).getItem();
            if (item == Item.getItemFromBlock((Block)Blocks.HOPPER)) {
                this.Hopperslot = x;
            }
            else if (item instanceof ItemShulkerBox) {
                if (this.NBT.getValue()) {
                    if (Auto32k.mc.player.inventory.getStackInSlot(x).serializeNBT().copy().toString().indexOf("AttributeModifiers:[{UUIDMost:2345838571545327294L,UUIDLeast:-1985342459327194118L,Amount:32767,AttributeName") != -1) {
                        this.ShulkerSlot = x;
                    }
                }
                else {
                    this.ShulkerSlot = x;
                }
            }
        }
        if (this.ShulkerSlot == -1 || this.Hopperslot == -1) {
            Command.sendMessage("Hopper/Shulker No Found!");
            return;
        }
        this.placeBlock(placePos.add(0, 1, 0), this.Hopperslot);
        this.placeBlock(placePos.add(0, 2, 0), this.ShulkerSlot);
        Anti32k.min = Auto32k.placeTarget;
        this.fume = 0;
        WorldUtil.openBlock(placePos.add(0, 1, 0));
        Command.sendMessage("[Auto32kHopper] " + ChatFormatting.GREEN + "Succesfully" + ChatFormatting.WHITE + " placed 32k");
    }
    
    private void placeBlock(final BlockPos pos, final int slot) {
        if (!TestUtil.emptyBlocks.contains(Auto32k.mc.world.getBlockState(pos).getBlock())) {
            return;
        }
        if (slot != Auto32k.mc.player.inventory.currentItem) {
            Auto32k.mc.player.inventory.currentItem = slot;
        }
        for (final EnumFacing f : EnumFacing.values()) {
            final Block neighborBlock = Auto32k.mc.world.getBlockState(pos.offset(f)).getBlock();
            if (!TestUtil.emptyBlocks.contains(neighborBlock)) {
                Auto32k.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Auto32k.mc.player, CPacketEntityAction.Action.START_SNEAKING));
                Auto32k.mc.playerController.processRightClickBlock(Auto32k.mc.player, Auto32k.mc.world, pos.offset(f), f.getOpposite(), new Vec3d((Vec3i)pos), EnumHand.MAIN_HAND);
                Auto32k.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Auto32k.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
            }
        }
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (this.Second.getValue() && this.I >= this.fuck.getValue()) {
            return;
        }
        if (this.fuckmom.getValue() && this.IS != null) {
            for (final ItemStack armourStack : this.IS.getArmorInventoryList()) {
                if (armourStack.getItem() != Items.DIAMOND_CHESTPLATE || armourStack.getItem() != Items.DIAMOND_HELMET || armourStack.getItem() != Items.DIAMOND_LEGGINGS || armourStack.getItem() != Items.DIAMOND_BOOTS) {
                    final CPacketUseEntity packet;
                    if (event.getPacket() instanceof CPacketUseEntity && (packet = (CPacketUseEntity)event.getPacket()).getAction() == CPacketUseEntity.Action.ATTACK) {
                        if (!this.criticals.getValue()) {
                            return;
                        }
                        if (!this.timer.passedMs(0L)) {
                            return;
                        }
                        if (Criticals.mc.player.onGround && !Criticals.mc.gameSettings.keyBindJump.isKeyDown() && packet.getEntityFromWorld((World)Criticals.mc.world) instanceof EntityLivingBase && !Criticals.mc.player.isInWater() && !Criticals.mc.player.isInLava()) {
                            switch (this.packets.getValue()) {
                                case 1: {
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.10000000149011612, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    break;
                                }
                                case 2: {
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.0625101, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 1.1E-5, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    break;
                                }
                                case 3: {
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.0625101, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.0125, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    break;
                                }
                                case 4: {
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.1625, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 4.0E-6, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 1.0E-6, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                                    Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer());
                                    Criticals.mc.player.onCriticalHit((Entity)Objects.requireNonNull(packet.getEntityFromWorld((World)Criticals.mc.world)));
                                    break;
                                }
                            }
                            this.timer.reset();
                        }
                    }
                    return;
                }
            }
        }
        final CPacketUseEntity packet2;
        if (event.getPacket() instanceof CPacketUseEntity && (packet2 = (CPacketUseEntity)event.getPacket()).getAction() == CPacketUseEntity.Action.ATTACK) {
            if (!this.criticals.getValue()) {
                return;
            }
            if (!this.timer.passedMs(0L)) {
                return;
            }
            if (Criticals.mc.player.onGround && !Criticals.mc.gameSettings.keyBindJump.isKeyDown() && packet2.getEntityFromWorld((World)Criticals.mc.world) instanceof EntityLivingBase && !Criticals.mc.player.isInWater() && !Criticals.mc.player.isInLava()) {
                switch (this.packets.getValue()) {
                    case 1: {
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.10000000149011612, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        break;
                    }
                    case 2: {
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.0625101, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 1.1E-5, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        break;
                    }
                    case 3: {
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.0625101, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.0125, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        break;
                    }
                    case 4: {
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 0.1625, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 4.0E-6, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY + 1.0E-6, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Criticals.mc.player.posX, Criticals.mc.player.posY, Criticals.mc.player.posZ, false));
                        Criticals.mc.player.connection.sendPacket((Packet)new CPacketPlayer());
                        Criticals.mc.player.onCriticalHit((Entity)Objects.requireNonNull(packet2.getEntityFromWorld((World)Criticals.mc.world)));
                        break;
                    }
                }
                this.timer.reset();
            }
        }
    }
    
    private void placeBlock(final BlockPos pos, final EnumFacing side) {
        final BlockPos neighbour = pos.offset(side);
        final EnumFacing opposite = side.getOpposite();
        if (!this.isSneaking) {
            Auto32k.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Auto32k.mc.player, CPacketEntityAction.Action.START_SNEAKING));
            this.isSneaking = true;
        }
        final Vec3d hitVec = new Vec3d((Vec3i)neighbour).add(new Vec3d(opposite.getDirectionVec()).scale(0.5));
        if (this.rotate.getValue()) {
            BlockInteractionHelper.faceVectorPacketInstant(hitVec);
        }
        Auto32k.mc.playerController.processRightClickBlock(Auto32k.mc.player, Auto32k.mc.world, neighbour, opposite, hitVec, EnumHand.MAIN_HAND);
        Auto32k.mc.player.swingArm(EnumHand.MAIN_HAND);
    }
    
    @SubscribeEvent
    public void onKeyInput(final InputEvent.KeyInputEvent event) {
        if (Keyboard.getEventKeyState() && !(Auto32k.mc.currentScreen instanceof StayGui) && this.bind2.getValue().getKey() > -1 && this.bind2.getValue().getKey() > -1 && this.look.getValue() && Keyboard.isKeyDown(this.bind2.getValue().getKey()) && Auto32k.mc.currentScreen == null && Keyboard.isKeyDown(this.bind.getValue().getKey())) {
            Anti32k.min = null;
            this.lookmods();
            return;
        }
        if (Keyboard.getEventKeyState() && !(Auto32k.mc.currentScreen instanceof StayGui) && this.bind.getValue().getKey() > -1 && Keyboard.isKeyDown(this.bind.getValue().getKey()) && Auto32k.mc.currentScreen == null) {
            this.place32k();
        }
    }
    
    private BlockPos getNearestHopper2() {
        final Double maxDist = this.range.getValue();
        final List<BlockPos> Blocksss = new ArrayList<BlockPos>();
        for (Double x = maxDist; x >= -maxDist; --x) {
            for (Double y = maxDist; y >= -maxDist; --y) {
                for (Double z = maxDist; z >= -maxDist; --z) {
                    final BlockPos pos = new BlockPos(Wrapper.getPlayer().posX + x, Wrapper.getPlayer().posY + y, Wrapper.getPlayer().posZ + z);
                    final double dist = Wrapper.getPlayer().getDistance((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
                    final BlockPos pos2 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
                    final BlockPos pos3 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
                    if (dist >= maxDist && this.range3.getValue() >= dist && Wrapper.getWorld().getBlockState(pos3).getBlock() != Blocks.HOPPER && !(Wrapper.getWorld().getBlockState(pos3).getBlock() instanceof BlockShulkerBox) && Wrapper.getWorld().getBlockState(pos3).getBlock() != Blocks.AIR) {
                        if (Wrapper.getWorld().getBlockState(pos).getBlock() == Blocks.WATER || Wrapper.getWorld().getBlockState(pos).getBlock() == Blocks.LAVA || Wrapper.getWorld().getBlockState(pos).getBlock() == Blocks.AIR) {
                            if (Wrapper.getWorld().getBlockState(pos2).getBlock() == Blocks.WATER || Wrapper.getWorld().getBlockState(pos2).getBlock() == Blocks.LAVA || Wrapper.getWorld().getBlockState(pos2).getBlock() == Blocks.AIR) {
                                if (pos.getY() >= 1) {
                                    if (pos.getY() <= 255) {
                                        final EntityPlayer target = this.getTarget(this.range3.getValue(), true);
                                        final double dists = Wrapper.getPlayer().getDistance((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
                                        if (dists <= this.range3.getValue()) {
                                            if (dists >= this.range.getValue()) {
                                                if (target == null || dist > Math.sqrt((target.posX - pos.getX()) * (target.posX - pos.getX()) + (target.posY - pos.getY()) * (target.posY - pos.getY()) + (target.posZ - pos.getZ()) * (target.posZ - pos.getZ()))) {
                                                    Blocksss.add(pos);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int a = 0;
        for (final BlockPos renderBlock : Blocksss) {
            ++a;
        }
        if (a == 0) {
            return null;
        }
        double ant = -1.0;
        int fomen = -1;
        final EntityPlayer target2 = this.getTarget(this.range3.getValue(), true);
        for (int i = 0; i < a; ++i) {
            final BlockPos pos4 = Blocksss.get(i);
            final double dist2 = Math.sqrt((target2.posX - pos4.getX()) * (target2.posX - pos4.getX()) + (target2.posY - pos4.getY()) * (target2.posY - pos4.getY()) + (target2.posZ - pos4.getZ()) * (target2.posZ - pos4.getZ()));
            if (dist2 > ant) {
                ant = dist2;
                fomen = i;
            }
        }
        if (fomen == -1) {
            return null;
        }
        return Blocksss.get(fomen);
    }
    
    private BlockPos getNearestHopper3() {
        final Double maxDist = this.range.getValue();
        final BlockPos ret = null;
        final List<BlockPos> Blocksss = new ArrayList<BlockPos>();
        for (Double x = maxDist; x >= -maxDist; --x) {
            for (Double y = maxDist; y >= -maxDist; --y) {
                for (Double z = maxDist; z >= -maxDist; --z) {
                    final BlockPos pos = new BlockPos(Wrapper.getPlayer().posX + x, Wrapper.getPlayer().posY + y, Wrapper.getPlayer().posZ + z);
                    final double dist = Wrapper.getPlayer().getDistance((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
                    final BlockPos pos2 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
                    final BlockPos pos3 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
                    if (this.range.getValue() >= dist && Wrapper.getWorld().getBlockState(pos3).getBlock() != Blocks.AIR && (Wrapper.getWorld().getBlockState(pos).getBlock() == Blocks.AIR || Wrapper.getWorld().getBlockState(pos).getBlock() == Blocks.LAVA || Wrapper.getWorld().getBlockState(pos).getBlock() == Blocks.WATER)) {
                        if (Wrapper.getWorld().getBlockState(pos2).getBlock() == Blocks.WATER || Wrapper.getWorld().getBlockState(pos2).getBlock() == Blocks.LAVA || Wrapper.getWorld().getBlockState(pos2).getBlock() == Blocks.AIR) {
                            Blocksss.add(pos);
                        }
                    }
                }
            }
        }
        final EntityPlayer target = this.getTarget(this.range3.getValue(), true);
        int a = 0;
        for (final BlockPos renderBlock : Blocksss) {
            ++a;
        }
        if (a == 0) {
            return null;
        }
        BlockPos pp = null;
        if (target != null) {
            for (int i = 1; i < a; ++i) {
                final BlockPos pos4 = Blocksss.get(i);
                if (pp == null) {
                    pp = pos4;
                }
                else {
                    final double distance = Math.sqrt((target.posX - pp.getX()) * (target.posX - pp.getX()) + (target.posY - pp.getY()) * (target.posY - pp.getY()) + (target.posZ - pp.getZ()) * (target.posZ - pp.getZ()));
                    final double distance2 = Math.sqrt((target.posX - pos4.getX()) * (target.posX - pos4.getX()) + (target.posY - pos4.getY()) * (target.posY - pos4.getY()) + (target.posZ - pos4.getZ()) * (target.posZ - pos4.getZ()));
                    if (distance2 > distance) {
                        pp = pos4;
                    }
                }
            }
        }
        if (pp == null) {
            final Random random = new Random();
            return Blocksss.get(random.nextInt(a));
        }
        return pp;
    }
    
    public void fck() {
        this.totems = Auto32k.mc.player.inventory.mainInventory.stream().filter(itemStack -> itemStack.getItem() == Items.TOTEM_OF_UNDYING).mapToInt(ItemStack::getCount).sum();
        if (Auto32k.mc.player.getHeldItemOffhand().getItem() == Items.TOTEM_OF_UNDYING) {
            ++this.totems;
        }
        else if (Auto32k.mc.player.inventory.getItemStack().isEmpty()) {
            if (this.totems == 0) {
                return;
            }
            int t = -1;
            for (int i = 0; i < 45; ++i) {
                if (Auto32k.mc.player.inventory.getStackInSlot(i).getItem() == Items.TOTEM_OF_UNDYING) {
                    t = i;
                    break;
                }
            }
            if (t == -1) {
                return;
            }
            Auto32k.mc.playerController.windowClick(0, (t < 9) ? (t + 36) : t, 0, ClickType.PICKUP, (EntityPlayer)Auto32k.mc.player);
            this.moving = true;
            if (this.moving) {
                Auto32k.mc.playerController.windowClick(0, 45, 0, ClickType.PICKUP, (EntityPlayer)Auto32k.mc.player);
                this.moving = false;
                if (!Auto32k.mc.player.inventory.getItemStack().isEmpty()) {
                    this.returnI = true;
                }
                return;
            }
        }
        if (this.returnI) {
            int t = -1;
            for (int i = 0; i < 45; ++i) {
                if (Auto32k.mc.player.inventory.getStackInSlot(i).isEmpty) {
                    t = i;
                    break;
                }
            }
            if (t == -1) {
                return;
            }
            Auto32k.mc.playerController.windowClick(0, (t < 9) ? (t + 36) : t, 0, ClickType.PICKUP, (EntityPlayer)Auto32k.mc.player);
            this.returnI = false;
        }
    }
    
    private EntityPlayer getTarget(final double range, final boolean trapped) {
        EntityPlayer target = null;
        double distance = Math.pow(range, 2.0) + 1.0;
        for (final EntityPlayer player : AutoTrap.mc.world.playerEntities) {
            if (!EntityUtils.isntValid((Entity)player, range)) {
                if (Stay.speedManager.getPlayerSpeed(player) > 10.0) {
                    continue;
                }
                if (target == null) {
                    target = player;
                    distance = AutoTrap.mc.player.getDistanceSq((Entity)player);
                }
                else {
                    if (AutoTrap.mc.player.getDistanceSq((Entity)player) >= distance) {
                        continue;
                    }
                    target = player;
                    distance = AutoTrap.mc.player.getDistanceSq((Entity)player);
                }
            }
        }
        return target;
    }
    
    public void place32k() {
        this.Hopperslot = -1;
        this.ShulkerSlot = -1;
        this.isSneaking = false;
        Auto32k.placeTarget = null;
        Auto32k.placeTarget2 = null;
        for (int x = 0; x <= 8; ++x) {
            final Item item = Auto32k.mc.player.inventory.getStackInSlot(x).getItem();
            if (item == Item.getItemFromBlock((Block)Blocks.HOPPER)) {
                this.Hopperslot = x;
            }
            else if (item instanceof ItemShulkerBox) {
                if (this.NBT.getValue()) {
                    if (Auto32k.mc.player.inventory.getStackInSlot(x).serializeNBT().copy().toString().indexOf("AttributeModifiers:[{UUIDMost:2345838571545327294L,UUIDLeast:-1985342459327194118L,Amount:32767,AttributeName") != -1) {
                        this.ShulkerSlot = x;
                    }
                }
                else {
                    this.ShulkerSlot = x;
                }
            }
        }
        if (this.ShulkerSlot == -1 || this.Hopperslot == -1) {
            Command.sendMessage("Hopper/Shulker No Found!");
            return;
        }
        Auto32k.placeTarget = this.getNearestHopper3();
        if (Auto32k.placeTarget != null) {
            if (this.tarp.getValue()) {
                if (InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass()) != -1) {
                    final EntityPlayer on = this.getTarget(this.tarprange.getValue(), true);
                    if (on != null && HoleUtil.isHole(new BlockPos(on.posX, on.posY, on.posZ))) {
                        final BlockPos pos = new BlockPos(on.posX, on.posY, on.posZ);
                        for (final BlockPos bPoss : Auto32k.Trap) {
                            Auto32k.mc.player.inventory.currentItem = InventoryUtil.findHotbarBlock(Blocks.OBSIDIAN.getClass());
                            BlockUtil.placeBlock(pos.add((Vec3i)bPoss), this.offHand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue(), this.packet2.getValue(), this.isSneaking);
                        }
                    }
                }
                else {
                    Command.sendMessage("No Obsidian! Tarp execution failed");
                }
            }
            Auto32k.mc.player.inventory.currentItem = this.Hopperslot;
            this.stagething = "HOPPER";
            this.placeBlock(new BlockPos((Vec3i)Auto32k.placeTarget), EnumFacing.DOWN);
            Auto32k.mc.player.inventory.currentItem = this.ShulkerSlot;
            this.stagething = "SHULKER";
            this.placeBlock(new BlockPos(Auto32k.placeTarget.getX(), Auto32k.placeTarget.getY() + 1, Auto32k.placeTarget.getZ()), EnumFacing.DOWN);
            Auto32k.mc.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Auto32k.mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
            this.isSneaking = false;
            this.stagething = "OPENING";
            if (Offhand.mc.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING && this.tot.getValue()) {
                OffHandCrystal.dev = true;
                this.tis.reset();
                this.fck();
            }
            Auto32k.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.ShulkerSlot));
            this.fume = 0;
            WorldUtil.openBlock(Auto32k.placeTarget);
            Command.sendMessage("[Auto32kHopper] " + ChatFormatting.GREEN + "Succesfully" + ChatFormatting.WHITE + " placed 32k");
        }
        else {
            Command.sendMessage("[Auto32kHopper] " + ChatFormatting.RED + "FAILED" + ChatFormatting.WHITE + " because your dumbass thought you could place there");
        }
    }
    
    @Override
    public void onUpdate() {
        if (Auto32k.mc.player == null || Auto32k.mc.player.isDead) {
            return;
        }
        final List<Entity> targets = (List<Entity>)Auto32k.mc.world.loadedEntityList.stream().filter(entity -> entity != Auto32k.mc.player).filter(entity -> Auto32k.mc.player.getDistance(entity) <= this.range.getValue()).filter(entity -> !entity.isDead).filter(entity -> entity instanceof EntityPlayer).filter(entity -> entity.getHealth() > 0.0f).sorted(Comparator.comparing(e -> Auto32k.mc.player.getDistance(e))).collect(Collectors.toList());
        targets.forEach(target -> {
            this.IS = target;
            if (Auto32k.mc.player.getHeldItemMainhand().getItem() == Items.DIAMOND_SWORD && Auto32k.mc.currentScreen instanceof GuiHopper && this.Killaura.getValue()) {
                if (this.friends.getValue()) {
                    if (!Stay.friendManager.isFriend(target.getName())) {
                        this.I = EntityUtils.getHealth(target);
                        this.attack(target);
                        this.timer2.reset();
                    }
                }
                else {
                    this.I = EntityUtils.getHealth(target);
                    this.attack(target);
                }
            }
            return;
        });
        final int w = 0;
        if (Auto32k.mc.currentScreen instanceof GuiHopper) {
            Anti32k.min = Auto32k.placeTarget;
            final GuiHopper gui = (GuiHopper)Auto32k.mc.currentScreen;
            this.active = true;
            for (int i = 0; i <= 4; ++i) {
                if (gui.inventorySlots.inventorySlots.get(i).getStack().getItem() == Items.DIAMOND_SWORD) {
                    if (this.swordOnly.getValue() && !(Auto32k.mc.player.getHeldItemMainhand().getItem() instanceof ItemSword) && !(Auto32k.mc.player.getHeldItemMainhand().getItem() instanceof ItemAir)) {
                        final int ss = InventoryUtil.findHotbarBlock(Blocks.AIR);
                        if (ss != -1) {
                            Auto32k.mc.player.inventory.currentItem = ss;
                        }
                        else {
                            Auto32k.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.DROP_ITEM, new BlockPos(1, 0, 0), Auto32k.mc.player.getHorizontalFacing()));
                        }
                    }
                    if (Auto32k.mc.player.getHeldItemMainhand().getItem() instanceof ItemAir) {
                        Auto32k.mc.playerController.windowClick(Auto32k.mc.player.openContainer.windowId, i, Auto32k.mc.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)Auto32k.mc.player);
                        break;
                    }
                }
            }
            Anti32k.min = Auto32k.placeTarget2;
            Auto32k.placeTarget2 = Auto32k.placeTarget;
        }
        else {
            ++this.fume;
            if (this.fume >= 10) {
                Auto32k.placeTarget2 = null;
                Anti32k.min = Auto32k.placeTarget2;
                this.fume = 0;
            }
        }
        if (this.tot.getValue()) {
            if (this.tis.passedDms(100.0)) {
                OffHandCrystal.dev = false;
            }
            else if (Auto32k.mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem() != Items.TOTEM_OF_UNDYING) {
                this.fck();
            }
        }
    }
    
    @Override
    public void onRender2D(final Render2DEvent event) {
        if (Auto32k.placeTarget2 != null && this.Pointer.getValue()) {
            final Color color = getColor(this.red.getValue(), this.green.getValue(), this.blue.getValue(), (int)MathHelper.clamp(255.0 - 255.0f / this.fadeDistance.getValue() * Wrapper.getPlayer().getDistance(Auto32k.placeTarget2.getX() + 0.5, Auto32k.placeTarget2.getY() + 0.5, Auto32k.placeTarget2.getZ() + 0.5), 100.0, 255.0));
            final int x = Display.getWidth() / 2 / ((ArrowESP.mc.gameSettings.guiScale == 0) ? 1 : ArrowESP.mc.gameSettings.guiScale);
            final int y = Display.getHeight() / 2 / ((ArrowESP.mc.gameSettings.guiScale == 0) ? 1 : ArrowESP.mc.gameSettings.guiScale);
            final float yaw = this.getRotations(Auto32k.placeTarget2) - ArrowESP.mc.player.rotationYaw;
            GL11.glTranslatef((float)x, (float)y, 0.0f);
            GL11.glRotatef(yaw, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-x), (float)(-y), 0.0f);
            RenderUtil.drawTracerPointer((float)x, (float)(y - this.radius.getValue()), this.size.getValue(), 2.0f, 1.0f, this.outline.getValue(), this.outlineWidth.getValue(), color.getRGB());
            GL11.glTranslatef((float)x, (float)y, 0.0f);
            GL11.glRotatef(-yaw, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-x), (float)(-y), 0.0f);
        }
    }
    
    private float getRotations(final BlockPos ent) {
        final double x = ent.getX() - ArrowESP.mc.player.posX;
        final double z = ent.getZ() - ArrowESP.mc.player.posZ;
        return (float)(-(Math.atan2(x, z) * 57.29577951308232));
    }
    
    private void attack(final Entity target) {
        if (this.NBT.getValue() && Auto32k.mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem() == Items.DIAMOND_SWORD && Auto32k.mc.player.getHeldItem(EnumHand.MAIN_HAND).serializeNBT().copy().toString().indexOf("AttributeModifiers:[{UUIDMost:2345838571545327294L,UUIDLeast:-1985342459327194118L,Amount:32767,AttributeName") == -1) {
            this.timer.reset();
            Auto32k.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.DROP_ITEM, new BlockPos(1, 0, 0), Auto32k.mc.player.getHorizontalFacing()));
            return;
        }
        if (Auto32k.mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem() != Items.DIAMOND_SWORD) {
            Auto32k.mc.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.DROP_ITEM, new BlockPos(1, 0, 0), Auto32k.mc.player.getHorizontalFacing()));
            return;
        }
        int wait = this.delay.getValue() ? this.delay2.getValue() : ((int)(DamageUtil.getCooldownByWeapon((EntityPlayer)Auto32k.mc.player) * (this.tps.getValue() ? Stay.serverManager.getTpsFactor() : 1.0f)));
        if (this.auto.getValue() && !this.delay.getValue()) {
            final EntityPlayer targets = this.getTarget(this.range3.getValue(), true);
            if (targets != null) {
                Stay.targetManager.updateTarget((EntityLivingBase)target);
                if (targets.getHeldItem(EnumHand.OFF_HAND).getItem() == Items.TOTEM_OF_UNDYING && targets.getHealth() <= this.fucks.getValue()) {
                    wait = this.delay2.getValue();
                }
            }
        }
        if (!this.timer.passedMs(wait)) {
            return;
        }
        if (target == null) {
            return;
        }
        Stay.rotationManager.lookAtEntity(target);
        EntityUtils.attackEntity(target, this.packet.getValue(), true);
        this.timer.reset();
    }
    
    static {
        Trap = Arrays.asList(new BlockPos(0, -1, -1), new BlockPos(1, -1, 0), new BlockPos(0, -1, 1), new BlockPos(-1, -1, 0), new BlockPos(0, 0, -1), new BlockPos(1, 0, 0), new BlockPos(0, 0, 1), new BlockPos(-1, 0, 0), new BlockPos(0, 1, -1), new BlockPos(0, 1, 1), new BlockPos(-1, 1, 0), new BlockPos(1, 1, 0), new BlockPos(0, 2, -1), new BlockPos(0, 2, 1), new BlockPos(-1, 2, 0), new BlockPos(0, 2, 0), new BlockPos(1, 2, 0));
    }
}
