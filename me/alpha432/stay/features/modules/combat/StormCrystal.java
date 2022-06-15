//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.graphics.animations.*;
import net.minecraft.client.*;
import net.minecraft.network.play.server.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.features.modules.client.*;
import java.awt.*;
import me.alpha432.stay.util.graphics.color.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraftforge.client.event.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.client.*;
import java.util.*;
import java.util.stream.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.renderer.*;
import me.alpha432.stay.util.inventory.item.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.projectile.*;
import me.alpha432.stay.util.player.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.enchantment.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.gameevent.*;
import java.util.function.*;
import net.minecraft.init.*;
import me.alpha432.stay.features.command.*;
import me.alpha432.stay.features.modules.misc.*;
import me.alpha432.stay.manager.*;
import net.minecraft.client.entity.*;
import me.alpha432.stay.util.world.*;
import org.jetbrains.annotations.*;

public class StormCrystal extends Module
{
    public static double yaw;
    public static double pitch;
    public static double renderPitch;
    public static boolean isSpoofingAngles;
    public static Entity target;
    public EntityEnderCrystal c;
    private int Placements;
    private int oldSlot;
    private int PrevSlot;
    private boolean switchCoolDown;
    boolean togglePitch;
    private BlockPos renderBlock;
    boolean shouldIgnoreEntity;
    private static boolean rotating;
    private int lastEntityId;
    private BlockPos pos1;
    Timer placeTimer;
    Timer breakTimer;
    Timer updateTimer;
    private final HashMap<BlockPos, Double> renderBlockDmg;
    List<BlockPos> PlacePosList;
    CrystalTarget crystalTarget;
    public Setting<ThreadMode> ExplodeHand_value;
    public Setting<ThreadMode2> AttackMode_value;
    public Setting<ThreadMode3> RenderMode_value;
    private final Setting<Boolean> AutoSwitch_value;
    private final Setting<Boolean> TargetPlayer_value;
    private final Setting<Boolean> TargetMobs_value;
    private final Setting<Boolean> TargetAnimals_value;
    private final Setting<Boolean> Place_value;
    private final Setting<Boolean> legitplace_value;
    private final Setting<Boolean> Explode_value;
    private final Setting<Boolean> EntityIgnore_value;
    private final Setting<Boolean> MultiPlace_value;
    private final Setting<Double> AttackSpeed_value;
    private final Setting<Double> PlaceSpeed_value;
    private final Setting<Double> Distance_value;
    private final Setting<Double> PlaceRange_value;
    private final Setting<Double> HitRange_value;
    private final Setting<Double> Damage_value;
    private final Setting<Boolean> Rotate_value;
    private final Setting<Boolean> RayTrace_value;
    private final Setting<Boolean> NewPlace_value;
    private final Setting<Boolean> Wall_value;
    private final Setting<Double> WallRange_value;
    private final Setting<Boolean> NoSuicide_value;
    private final Setting<Boolean> FacePlace_value;
    private final Setting<Boolean> armorPlace_value;
    private final Setting<Double> armorPlaceDmg_value;
    private final Setting<Boolean> Predite_value;
    private final Setting<Integer> PrediteNumber_value;
    private final Setting<Double> BlastHealth_value;
    private final Setting<Double> MinDmg_value;
    private final Setting<Double> MaxSelf_value;
    private final Setting<Double> BMinDmg_value;
    private final Setting<Double> BMaxSelf_value;
    private final Setting<Boolean> PopTotemTry;
    final Setting<Boolean> GhostHand_value;
    private final Setting<Boolean> PlacebyPass_value;
    final Setting<Boolean> weak;
    private final Setting<Boolean> PauseEating_value;
    private final Setting<Boolean> RenderDmg_value;
    private final Setting<Boolean> render;
    public Setting<Boolean> colorSync;
    private final Setting<Integer> Red_value;
    private final Setting<Integer> Green_value;
    private final Setting<Integer> Blue_value;
    private final Setting<Integer> Alpha_value;
    private final Setting<Integer> Width_value;
    private final Setting<Boolean> Rainbow_value;
    public Setting<Boolean> box;
    public Setting<Boolean> outline;
    private final Setting<Integer> boxAlpha;
    public Setting<Boolean> customOutline;
    private final Setting<Integer> cRed;
    private final Setting<Integer> cGreen;
    private final Setting<Integer> cBlue;
    private final Setting<Integer> cAlpha;
    private final Setting<Float> RGBSpeed_value;
    private final Setting<Float> Saturation_value;
    private final Setting<Float> Brightness_value;
    private final Setting<Easing> movingEasingType;
    private final Setting<Easing> fadingEasingType;
    private final Setting<Integer> moveTime;
    private final Setting<Integer> fadeTime;
    public BlockEasingRender blockRenderSmooth;
    
    public StormCrystal() {
        super("StormCrystal", "Automatically place crystal to kill enemy", Category.COMBAT, true, false, false);
        this.ExplodeHand_value = (Setting<ThreadMode>)this.register(new Setting("HitHand", (T)ThreadMode.Off));
        this.AttackMode_value = (Setting<ThreadMode2>)this.register(new Setting("HitMode", (T)ThreadMode2.Smart));
        this.RenderMode_value = (Setting<ThreadMode3>)this.register(new Setting("RenderPattern", (T)ThreadMode3.Dynamic));
        this.AutoSwitch_value = (Setting<Boolean>)this.register(new Setting("AutoSwitch", (T)false));
        this.TargetPlayer_value = (Setting<Boolean>)this.register(new Setting("Players", (T)true));
        this.TargetMobs_value = (Setting<Boolean>)this.register(new Setting("Mobs", (T)false));
        this.TargetAnimals_value = (Setting<Boolean>)this.register(new Setting("Animals", (T)false));
        this.Place_value = (Setting<Boolean>)this.register(new Setting("Place", (T)true));
        this.legitplace_value = (Setting<Boolean>)this.register(new Setting("Legitplace", (T)true));
        this.Explode_value = (Setting<Boolean>)this.register(new Setting("Explode", (T)true));
        this.EntityIgnore_value = (Setting<Boolean>)this.register(new Setting("EntityIgnore", (T)true));
        this.MultiPlace_value = (Setting<Boolean>)this.register(new Setting("MultiPlace", (T)false));
        this.AttackSpeed_value = (Setting<Double>)this.register(new Setting("AttackSpeed", (T)35.0, (T)0.0, (T)50.0));
        this.PlaceSpeed_value = (Setting<Double>)this.register(new Setting("PlaceSpeed", (T)35.0, (T)0.0, (T)50.0));
        this.Distance_value = (Setting<Double>)this.register(new Setting("Distance", (T)11.0, (T)0.0, (T)15.0));
        this.PlaceRange_value = (Setting<Double>)this.register(new Setting("PlaceRange", (T)6.5, (T)0.0, (T)8.0));
        this.HitRange_value = (Setting<Double>)this.register(new Setting("HitRange", (T)5.5, (T)0.0, (T)8.0));
        this.Damage_value = (Setting<Double>)this.register(new Setting("Damage", (T)0.3, (T)0.0, (T)5.0));
        this.Rotate_value = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.RayTrace_value = (Setting<Boolean>)this.register(new Setting("RayTrace", (T)false));
        this.NewPlace_value = (Setting<Boolean>)this.register(new Setting("1.13Place", (T)false));
        this.Wall_value = (Setting<Boolean>)this.register(new Setting("Wall", (T)true));
        this.WallRange_value = (Setting<Double>)this.register(new Setting("WallRange", (T)3.5, (T)0.0, (T)20.0));
        this.NoSuicide_value = (Setting<Boolean>)this.register(new Setting("NoSuicide", (T)true));
        this.FacePlace_value = (Setting<Boolean>)this.register(new Setting("FacePlace", (T)true));
        this.armorPlace_value = (Setting<Boolean>)this.register(new Setting("ArmorPlace", (T)true));
        this.armorPlaceDmg_value = (Setting<Double>)this.register(new Setting("Armor%", (T)15.0, (T)0.0, (T)50.0));
        this.Predite_value = (Setting<Boolean>)this.register(new Setting("Predite", (T)true));
        this.PrediteNumber_value = (Setting<Integer>)this.register(new Setting("EnemyPlacePredite", (T)2, (T)0, (T)10));
        this.BlastHealth_value = (Setting<Double>)this.register(new Setting("MinHealthFace", (T)10.0, (T)0.0, (T)20.0));
        this.MinDmg_value = (Setting<Double>)this.register(new Setting("PlaceMinDamage", (T)4.5, (T)0.0, (T)20.0));
        this.MaxSelf_value = (Setting<Double>)this.register(new Setting("PlaceMaxSelf", (T)10.0, (T)0.0, (T)36.0));
        this.BMinDmg_value = (Setting<Double>)this.register(new Setting("BreakMinDmg", (T)4.5, (T)0.0, (T)36.0));
        this.BMaxSelf_value = (Setting<Double>)this.register(new Setting("BreakMaxSelf", (T)12.0, (T)0.0, (T)36.0));
        this.PopTotemTry = (Setting<Boolean>)this.register(new Setting("PopTotemTry", (T)true));
        this.GhostHand_value = (Setting<Boolean>)this.register(new Setting("GhostHand", (T)false));
        this.PlacebyPass_value = (Setting<Boolean>)this.register(new Setting("ByPass", (T)false));
        this.weak = (Setting<Boolean>)this.register(new Setting("antiWeakness", (T)false));
        this.PauseEating_value = (Setting<Boolean>)this.register(new Setting("PauseWhileEating", (T)false));
        this.RenderDmg_value = (Setting<Boolean>)this.register(new Setting("RenderDamage", (T)false));
        this.render = (Setting<Boolean>)this.register(new Setting("Silky rendering", (T)true));
        this.colorSync = (Setting<Boolean>)this.register(new Setting("ColorSync", (T)false));
        this.Red_value = (Setting<Integer>)this.register(new Setting("Red", (T)255, (T)0, (T)255));
        this.Green_value = (Setting<Integer>)this.register(new Setting("Green", (T)0, (T)0, (T)255));
        this.Blue_value = (Setting<Integer>)this.register(new Setting("Blue", (T)0, (T)0, (T)255));
        this.Alpha_value = (Setting<Integer>)this.register(new Setting("Alpha", (T)70, (T)0, (T)255));
        this.Width_value = (Setting<Integer>)this.register(new Setting("Width", (T)2, (T)0, (T)5));
        this.Rainbow_value = (Setting<Boolean>)this.register(new Setting("Rainbow", (T)false));
        this.box = (Setting<Boolean>)this.register(new Setting("Box", (T)true, v -> this.render.getValue()));
        this.outline = (Setting<Boolean>)this.register(new Setting("Outline", (T)true, v -> this.render.getValue()));
        this.boxAlpha = (Setting<Integer>)this.register(new Setting("BoxAlpha", (T)125, (T)0, (T)255, v -> this.render.getValue() && this.box.getValue()));
        this.customOutline = (Setting<Boolean>)this.register(new Setting("CustomLine", (T)false, String.valueOf(this.render.getValue() && this.outline.getValue())));
        this.cRed = (Setting<Integer>)this.register(new Setting("OL-Red", (T)255, (T)0, (T)255, v -> this.render.getValue() && this.customOutline.getValue() && this.outline.getValue()));
        this.cGreen = (Setting<Integer>)this.register(new Setting("OL-Green", (T)255, (T)0, (T)255, v -> this.render.getValue() && this.customOutline.getValue() && this.outline.getValue()));
        this.cBlue = (Setting<Integer>)this.register(new Setting("OL-Blue", (T)255, (T)0, (T)255, v -> this.render.getValue() && this.customOutline.getValue() && this.outline.getValue()));
        this.cAlpha = (Setting<Integer>)this.register(new Setting("OL-Alpha", (T)255, (T)0, (T)255, v -> this.render.getValue() && this.customOutline.getValue() && this.outline.getValue()));
        this.RGBSpeed_value = (Setting<Float>)this.register(new Setting("RGB Speed", (T)1.0f, (T)0.0f, (T)10.0f));
        this.Saturation_value = (Setting<Float>)this.register(new Setting("Saturation", (T)0.65f, (T)0.0f, (T)1.0f));
        this.Brightness_value = (Setting<Float>)this.register(new Setting("Brightness", (T)1.0f, (T)0.0f, (T)1.0f));
        this.movingEasingType = (Setting<Easing>)this.register(new Setting("MoveType", (T)Easing.OUT_CUBIC));
        this.fadingEasingType = (Setting<Easing>)this.register(new Setting("FadingType", (T)Easing.OUT_CUBIC));
        this.moveTime = (Setting<Integer>)this.register(new Setting("MoveTimeMS", (T)1000, (T)10, (T)20000));
        this.fadeTime = (Setting<Integer>)this.register(new Setting("FadeTimeMS", (T)1000, (T)10, (T)20000));
        this.blockRenderSmooth = new BlockEasingRender(new BlockPos(0, 0, 0), this.moveTime.getValue(), this.fadeTime.getValue());
        this.Placements = 0;
        this.oldSlot = -1;
        this.togglePitch = false;
        this.shouldIgnoreEntity = false;
        this.lastEntityId = -1;
        this.placeTimer = new Timer();
        this.breakTimer = new Timer();
        this.updateTimer = new Timer();
        this.renderBlockDmg = new HashMap<BlockPos, Double>();
        this.PlacePosList = new ArrayList<BlockPos>();
    }
    
    @SubscribeEvent
    public void onPacketReceive(final PacketEvent.Receive event) {
        if (StormCrystal.mc.player != null) {
            if (event.getPacket() instanceof SPacketSoundEffect) {
                final SPacketSoundEffect packet = (SPacketSoundEffect)event.getPacket();
                if (packet.getCategory() == SoundCategory.BLOCKS && packet.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE) {
                    for (final Entity e : Minecraft.getMinecraft().world.loadedEntityList) {
                        if (e instanceof EntityEnderCrystal && e.getDistance(packet.getX(), packet.getY(), packet.getZ()) <= 6.0) {
                            e.setDead();
                        }
                    }
                }
            }
            if (event.getPacket() instanceof SPacketSpawnObject && ((SPacketSpawnObject)event.getPacket()).getType() == 51) {
                final SPacketSpawnObject sPacketSpawnObject = (SPacketSpawnObject)event.getPacket();
                final BlockPos pos = new BlockPos(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ());
                final float selfDamage = calculateDamage(pos.getX(), pos.getY(), pos.getZ(), (Entity)StormCrystal.mc.player, StormCrystal.mc.player.getPositionVector());
                final float playerHealthy = StormCrystal.mc.player.getHealth() + StormCrystal.mc.player.getAbsorptionAmount();
                if (!(StormCrystal.mc.world.getEntityByID(((SPacketSpawnObject)event.getPacket()).getEntityID()) instanceof EntityEnderCrystal)) {
                    return;
                }
                if (this.PlacePosList.contains(pos.down()) && StormCrystal.mc.player.getDistance((double)pos.getX(), (double)pos.getY(), (double)pos.getZ()) <= this.HitRange_value.getValue()) {
                    if (this.PopTotemTry.getValue()) {
                        if (selfDamage - 2.0f > playerHealthy) {
                            return;
                        }
                    }
                    else if (selfDamage - 0.5 > playerHealthy) {
                        return;
                    }
                    if (this.Rotate_value.getValue()) {
                        this.lookAtPos(pos, enumFacing(pos));
                    }
                    this.packetBreakCrystal(sPacketSpawnObject.getEntityID());
                }
                else if (this.Predite_value.getValue() && selfDamage <= this.MaxSelf_value.getValue() && selfDamage + 0.5 < playerHealthy) {
                    if (this.Rotate_value.getValue()) {
                        this.lookAtPos(pos, enumFacing(pos));
                    }
                    this.packetBreakCrystal(sPacketSpawnObject.getEntityID());
                }
            }
            else if (event.getPacket() instanceof SPacketExplosion) {
                final SPacketExplosion sPacketExplosion = (SPacketExplosion)event.getPacket();
                final BlockPos pos = new BlockPos(sPacketExplosion.getX(), sPacketExplosion.getY(), sPacketExplosion.getZ()).down();
                this.PlacePosList.remove(pos);
            }
            if (event.getPacket() instanceof SPacketEntityStatus && this.PlacebyPass_value.getValue()) {
                this.lastEntityId = ((SPacketEntityStatus)event.getPacket()).getEntity((World)StormCrystal.mc.world).getEntityId();
            }
        }
    }
    
    @Override
    public void onRender3D(final Render3DEvent event) {
        if (StormCrystal.mc.player == null || StormCrystal.mc.world == null) {
            return;
        }
        if (this.renderBlock == null) {
            this.blockRenderSmooth.end();
        }
        else {
            this.blockRenderSmooth.begin();
        }
        if (this.render.getValue() && this.RenderMode_value.getValue().equals(ThreadMode3.Dynamic)) {
            final AxisAlignedBB bb = this.blockRenderSmooth.getFullUpdate();
            final Color color = this.colorSync.getValue() ? ColorUtil.rainbow(ClickGui.getInstance().rainbowHue.getValue()) : new Color(this.Red_value.getValue(), this.Green_value.getValue(), this.Blue_value.getValue(), this.Alpha_value.getValue());
            RenderUtil.drawBBBox(bb, new Colour(color.getRed(), color.getGreen(), color.getBlue(), this.boxAlpha.getValue()), this.boxAlpha.getValue());
        }
        else if (this.render.getValue() && this.renderBlock != null) {
            RenderUtil.drawBoxESP(this.renderBlock, ((boolean)this.colorSync.getValue()) ? ColorUtil.rainbow(ClickGui.getInstance().rainbowHue.getValue()) : new Color(this.Red_value.getValue(), this.Green_value.getValue(), this.Blue_value.getValue(), this.Alpha_value.getValue()), this.customOutline.getValue(), ((boolean)this.colorSync.getValue()) ? this.getCurrentColor() : new Color(this.cRed.getValue(), this.cGreen.getValue(), this.cBlue.getValue(), this.cAlpha.getValue()), this.Width_value.getValue(), this.outline.getValue(), this.box.getValue(), this.boxAlpha.getValue(), false);
            if (this.RenderDmg_value.getValue()) {
                final double renderDamage = this.renderBlockDmg.get(this.renderBlock);
                RenderUtil.drawText(this.renderBlock, ((Math.floor(renderDamage) == renderDamage) ? Integer.valueOf((int)renderDamage) : String.format("%.1f", renderDamage)) + "");
            }
        }
    }
    
    public Color getCurrentColor() {
        return new Color(this.Red_value.getValue(), this.Green_value.getValue(), this.Blue_value.getValue(), this.Alpha_value.getValue());
    }
    
    @SubscribeEvent
    public void updateRotation(final RenderWorldLastEvent event) {
        if (this.Rotate_value.getValue() && StormCrystal.rotating) {
            StormCrystal.mc.player.rotationYawHead = (float)StormCrystal.yaw;
            StormCrystal.mc.player.renderYawOffset = (float)StormCrystal.yaw;
        }
    }
    
    @SubscribeEvent
    public void onPacketSend(final PacketEvent.Send event) {
        if (StormCrystal.mc.player != null) {
            final Packet<?> packet = (Packet<?>)event.getPacket();
            if (this.Rotate_value.getValue()) {
                if (packet instanceof CPacketPlayer && StormCrystal.isSpoofingAngles) {
                    ((CPacketPlayer)packet).yaw = (float)StormCrystal.yaw;
                    ((CPacketPlayer)packet).pitch = (float)StormCrystal.pitch;
                    StormCrystal.isSpoofingAngles = false;
                }
                if (this.legitplace_value.getValue() && StormCrystal.mc.playerController.isHittingBlock) {
                    for (final Vec3d v : new Vec3d[] { new Vec3d(1.0, 0.0, 0.0), new Vec3d(-1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, -1.0) }) {
                        if (v != null && StormCrystal.target != null && this.pos1 != null) {
                            if (this.pos1.add(v.x, v.y, v.z) == StormCrystal.target.getPosition()) {
                                return;
                            }
                            final BlockPos pos2 = new BlockPos(StormCrystal.target.getPositionVector()).add(v.x, v.y, v.z);
                            if (StormCrystal.mc.world.getBlockState(pos2).getBlock() != Blocks.AIR || StormCrystal.mc.world.getBlockState(pos2.down()).getBlock() != Blocks.OBSIDIAN || StormCrystal.mc.world.getBlockState(pos2.down()).getBlock() != Blocks.BEDROCK) {
                                return;
                            }
                            this.PlaceCrystal(pos2, EnumHand.OFF_HAND);
                        }
                    }
                }
            }
        }
    }
    
    @Contract("null -> false")
    private boolean canHitCrystal(final Entity crystal) {
        if (!(crystal instanceof EntityEnderCrystal)) {
            return false;
        }
        final Vec3d vec3d = crystal.getPositionVector();
        if (StormCrystal.mc.player.getDistance(vec3d.x, vec3d.y, vec3d.z) > this.HitRange_value.getValue()) {
            return false;
        }
        if (!this.AttackMode_value.getValue().toString().equals("Smart")) {
            return true;
        }
        final float selfDamage = calculateDamage(vec3d.x, vec3d.y, vec3d.z, (Entity)StormCrystal.mc.player, StormCrystal.mc.player.getPositionVector());
        if (selfDamage >= StormCrystal.mc.player.getHealth() + StormCrystal.mc.player.getAbsorptionAmount()) {
            return false;
        }
        final List<EntityPlayer> entities = new ArrayList<EntityPlayer>(StormCrystal.mc.world.playerEntities);
        final List<EntityPlayer> entitiess = entities.stream().filter(e -> StormCrystal.mc.player.getDistance(e) <= this.Distance_value.getValue()).filter(e -> StormCrystal.mc.player != e).filter(e -> !Stay.friendManager.isFriend(e)).sorted(Comparator.comparing(e -> StormCrystal.mc.player.getDistance(e))).collect((Collector<? super Object, ?, List<EntityPlayer>>)Collectors.toList());
        for (final EntityPlayer player : entities) {
            if (!player.isDead && player.getHealth() + player.getAbsorptionAmount() > 0.0f) {
                double minDamage = this.BMinDmg_value.getValue();
                final double maxSelf = this.BMaxSelf_value.getValue();
                if (this.FacePlace_value.getValue() && this.canFacePlace((EntityLivingBase)player, this.BlastHealth_value.getValue())) {
                    minDamage = 1.0;
                }
                if (this.armorPlace_value.getValue() && this.canFaceArmorPlace(player, this.armorPlaceDmg_value.getValue())) {
                    minDamage = 1.0;
                }
                final double target = calculateDamage(vec3d.x, vec3d.y, vec3d.z, (Entity)player, player.getPositionVector());
                if (target > player.getHealth() + player.getAbsorptionAmount() + minDamage - 2.0 && selfDamage < StormCrystal.mc.player.getHealth() + StormCrystal.mc.player.getAbsorptionAmount() && this.PopTotemTry.getValue()) {
                    return true;
                }
                if (selfDamage <= maxSelf && target >= minDamage && selfDamage <= target) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    private void resetRotation() {
        if (StormCrystal.isSpoofingAngles) {
            StormCrystal.yaw = StormCrystal.mc.player.rotationYaw;
            StormCrystal.pitch = StormCrystal.mc.player.rotationPitch;
            StormCrystal.isSpoofingAngles = false;
            StormCrystal.rotating = false;
        }
    }
    
    private void ExplodeCrystal(final EntityEnderCrystal crystal) {
        if (this.Rotate_value.getValue()) {
            this.lookAtCrystal(crystal);
        }
        if (this.breakTimer.passedMs(this.AttackSpeed_value.getValue())) {
            if (crystal != null) {
                final String var2 = this.ExplodeHand_value.getValue().toString();
                byte var3 = -1;
                switch (var2.hashCode()) {
                    case -1911998296: {
                        if (var2.equals("Packet")) {
                            var3 = 2;
                            break;
                        }
                        break;
                    }
                    case 79183: {
                        if (var2.equals("Off")) {
                            var3 = 0;
                            break;
                        }
                        break;
                    }
                    case 2390489: {
                        if (var2.equals("Main")) {
                            var3 = 1;
                            break;
                        }
                        break;
                    }
                }
                final int newSlots = Wrapper.getPlayer().inventory.currentItem;
                if (this.weak.getValue() && StormCrystal.mc.player.isPotionActive(MobEffects.WEAKNESS)) {
                    int newSlot = -1;
                    for (int i = 0; i < 9; ++i) {
                        final ItemStack stack = Wrapper.getPlayer().inventory.getStackInSlot(i);
                        if (stack != ItemStack.EMPTY) {
                            if (stack.getItem() instanceof ItemSword) {
                                newSlot = i;
                                break;
                            }
                            if (stack.getItem() instanceof ItemTool) {
                                newSlot = i;
                                break;
                            }
                        }
                    }
                    if (newSlot != -1) {
                        Wrapper.getPlayer().inventory.currentItem = newSlot;
                    }
                }
                switch (var3) {
                    case 0: {
                        StormCrystal.mc.playerController.attackEntity((EntityPlayer)StormCrystal.mc.player, (Entity)crystal);
                        StormCrystal.mc.player.swingArm(EnumHand.OFF_HAND);
                        break;
                    }
                    case 1: {
                        StormCrystal.mc.playerController.attackEntity((EntityPlayer)StormCrystal.mc.player, (Entity)crystal);
                        StormCrystal.mc.player.swingArm(EnumHand.MAIN_HAND);
                        break;
                    }
                    case 2: {
                        this.packetBreakCrystal(crystal.entityId);
                        break;
                    }
                }
                if (this.weak.getValue() && StormCrystal.mc.player.isPotionActive(MobEffects.WEAKNESS) && newSlots != -1) {
                    Wrapper.getPlayer().inventory.currentItem = newSlots;
                }
                StormCrystal.mc.player.resetCooldown();
                this.breakTimer.reset();
            }
            if (this.lastEntityId != -1 && this.canHitCrystal(StormCrystal.mc.world.getEntityByID(this.lastEntityId))) {
                this.packetBreakCrystal(this.lastEntityId);
            }
        }
    }
    
    private void PlaceCrystal(final BlockPos targetBlock, final EnumHand enumHand) {
        EnumFacing facing;
        if (this.RayTrace_value.getValue()) {
            facing = enumFacing(targetBlock);
        }
        else {
            facing = EnumFacing.UP;
        }
        if (this.Rotate_value.getValue()) {
            this.lookAtPos(targetBlock, facing);
        }
        if (this.placeDelayRun(this.PlaceSpeed_value.getValue())) {
            this.blockRenderSmooth.updatePos(targetBlock);
            if (this.legitplace_value.getValue()) {
                StormCrystal.mc.playerController.processRightClickBlock(StormCrystal.mc.player, StormCrystal.mc.world, targetBlock, EnumFacing.UP, new Vec3d((double)targetBlock.getX(), (double)targetBlock.getY(), (double)targetBlock.getZ()), enumHand);
            }
            else {
                StormCrystal.mc.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(targetBlock, facing, enumHand, 0.0f, 0.0f, 0.0f));
            }
            this.placeTimer.reset();
            ++this.Placements;
        }
    }
    
    private boolean placeDelayRun(final double speed) {
        return this.placeTimer.passedMs(1000.0 / speed);
    }
    
    private void packetBreakCrystal(final int crystalEntityID) {
        final CPacketUseEntity cPacketUseEntity = new CPacketUseEntity();
        cPacketUseEntity.entityId = crystalEntityID;
        cPacketUseEntity.action = CPacketUseEntity.Action.ATTACK;
        StormCrystal.mc.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.breakTimer.reset();
    }
    
    private List<BlockPos> findCrystalBlocks(final double range) {
        final NonNullList<BlockPos> positions = (NonNullList<BlockPos>)NonNullList.create();
        positions.addAll((Collection)BlockInteractionHelper.getSphere(this.getPlayerPos(), (float)range, (int)range, false, true, 0).stream().filter(v -> this.canPlaceCrystal(v, this.NewPlace_value.getValue())).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
        return (List<BlockPos>)positions;
    }
    
    private void drawBlock(final BlockPos blockPos, final int color) {
    }
    
    public void glBillboardDistanceScaled(final float x, final float y, final float z, final EntityPlayer player) {
        this.glBillboard(x, y, z);
        final int distance = (int)player.getDistance((double)x, (double)y, (double)z);
        float scaleDistance = distance / 2.0f / 3.0f;
        if (scaleDistance < 1.0f) {
            scaleDistance = 1.0f;
        }
        GlStateManager.scale(scaleDistance, scaleDistance, scaleDistance);
    }
    
    public void glBillboard(final float x, final float y, final float z) {
        final float scale = 0.02666667f;
        GlStateManager.translate(x - Minecraft.getMinecraft().getRenderManager().renderPosX, y - Minecraft.getMinecraft().getRenderManager().renderPosY, z - Minecraft.getMinecraft().getRenderManager().renderPosZ);
        GlStateManager.glNormal3f(0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-Minecraft.getMinecraft().player.rotationYaw, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(Minecraft.getMinecraft().player.rotationPitch, (Minecraft.getMinecraft().gameSettings.thirdPersonView == 2) ? -1.0f : 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(-scale, -scale, scale);
    }
    
    public BlockPos getPlayerPos() {
        return new BlockPos(Math.floor(StormCrystal.mc.player.posX), Math.floor(StormCrystal.mc.player.posY), Math.floor(StormCrystal.mc.player.posZ));
    }
    
    public boolean canFacePlace(final EntityLivingBase target, final double blast) {
        final float healthTarget = target.getHealth() + target.getAbsorptionAmount();
        return healthTarget <= blast;
    }
    
    public boolean canFaceArmorPlace(final EntityPlayer target, final double blast) {
        for (final ItemStack piece : target.inventory.armorInventory) {
            if (piece == null) {
                return true;
            }
            if (ItemUtil.getItemDamage(piece) < blast) {
                return true;
            }
        }
        return false;
    }
    
    public boolean canPlaceCrystal(final BlockPos blockPos, final boolean newPlace) {
        final BlockPos boost = blockPos.add(0, 1, 0);
        final BlockPos boost2 = blockPos.add(0, 2, 0);
        if (StormCrystal.mc.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && StormCrystal.mc.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
            return false;
        }
        if (!newPlace) {
            if (StormCrystal.mc.world.getBlockState(boost).getBlock() != Blocks.AIR || StormCrystal.mc.world.getBlockState(boost2).getBlock() != Blocks.AIR) {
                return false;
            }
        }
        else if (StormCrystal.mc.world.getBlockState(boost).getBlock() != Blocks.AIR) {
            return false;
        }
        final AxisAlignedBB b1 = new AxisAlignedBB(boost);
        final AxisAlignedBB b2 = new AxisAlignedBB(boost2);
        if (this.shouldIgnoreEntity && !this.MultiPlace_value.getValue()) {
            return StormCrystal.mc.world.getEntitiesWithinAABB((Class)EntityItem.class, b1).isEmpty() && StormCrystal.mc.world.getEntitiesWithinAABB((Class)EntityPlayer.class, b1).isEmpty() && StormCrystal.mc.world.getEntitiesWithinAABB((Class)EntityPlayer.class, b2).isEmpty() && StormCrystal.mc.world.getEntitiesWithinAABB((Class)EntityArrow.class, b1).isEmpty();
        }
        return StormCrystal.mc.world.getEntitiesWithinAABB((Class)Entity.class, b1).isEmpty() && StormCrystal.mc.world.getEntitiesWithinAABB((Class)Entity.class, b2).isEmpty();
    }
    
    public static double getRange(final Vec3d a, final double x, final double y, final double z) {
        final double xl = a.x - x;
        final double yl = a.y - y;
        final double zl = a.z - z;
        return Math.sqrt(xl * xl + yl * yl + zl * zl);
    }
    
    public void lookAtPos(final BlockPos block, final EnumFacing face) {
        final float[] v = RotationUtil.getRotationsBlock(block, face, false);
        final float[] v2 = RotationUtil.getRotationsBlock(block.add(0.0, 0.5, 0.0), face, false);
        this.setYawAndPitch(v[0], v[1], v2[1]);
    }
    
    public void lookAtCrystal(final EntityEnderCrystal ent) {
        final float[] v = RotationUtil.getRotations(StormCrystal.mc.player.getPositionEyes(StormCrystal.mc.getRenderPartialTicks()), ent.getPositionVector());
        final float[] v2 = RotationUtil.getRotations(StormCrystal.mc.player.getPositionEyes(StormCrystal.mc.getRenderPartialTicks()), ent.getPositionVector().add(0.0, -0.5, 0.0));
        this.setYawAndPitch(v[0], v[1], v2[1]);
    }
    
    public void setYawAndPitch(final float yaw1, final float pitch1, final float renderPitch1) {
        StormCrystal.yaw = yaw1;
        StormCrystal.pitch = pitch1;
        StormCrystal.renderPitch = renderPitch1;
        StormCrystal.isSpoofingAngles = true;
        StormCrystal.rotating = true;
    }
    
    public static float calculateDamage(final double posX, final double posY, final double posZ, final Entity entity, final Vec3d vec) {
        final float doubleExplosionSize = 12.0f;
        final double distanceSize = getRange(vec, posX, posY, posZ) / doubleExplosionSize;
        final Vec3d vec3d = new Vec3d(posX, posY, posZ);
        final double blockDensity = entity.world.getBlockDensity(vec3d, entity.getEntityBoundingBox());
        final double v = (1.0 - distanceSize) * blockDensity;
        final float damage = (float)(int)((v * v + v) / 2.0 * 7.0 * doubleExplosionSize + 1.0);
        double finalValue = 1.0;
        if (entity instanceof EntityLivingBase) {
            finalValue = getBlastReduction((EntityLivingBase)entity, getDamageMultiplied(damage), new Explosion((World)StormCrystal.mc.world, (Entity)null, posX, posY, posZ, 6.0f, false, true));
        }
        return (float)finalValue;
    }
    
    public static float calculateDamage(final double posX, final double posY, final double posZ, final Entity entity) {
        final Vec3d offset = new Vec3d(entity.posX, entity.posY, entity.posZ);
        return calculateDamage(posX, posY, posZ, entity, offset);
    }
    
    private static float getBlastReduction(final EntityLivingBase entity, float damage, final Explosion explosion) {
        try {
            if (entity instanceof EntityPlayer) {
                final EntityPlayer ep = (EntityPlayer)entity;
                final DamageSource ds = DamageSource.causeExplosionDamage(explosion);
                damage = CombatRules.getDamageAfterAbsorb(damage, (float)ep.getTotalArmorValue(), (float)ep.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue());
                final int k = EnchantmentHelper.getEnchantmentModifierDamage(ep.getArmorInventoryList(), ds);
                final float f = MathHelper.clamp((float)k, 0.0f, 20.0f);
                damage *= 1.0f - f / 25.0f;
                if (entity.isPotionActive(MobEffects.RESISTANCE)) {
                    damage -= damage / 5.0f;
                }
                damage = Math.max(damage, 0.0f);
                return damage;
            }
            damage = CombatRules.getDamageAfterAbsorb(damage, (float)entity.getTotalArmorValue(), (float)entity.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue());
            return damage;
        }
        catch (Exception var7) {
            return getBlastReduction(entity, damage, explosion);
        }
    }
    
    private static float getDamageMultiplied(final float damage) {
        final int diff = StormCrystal.mc.world.getDifficulty().getId();
        return damage * ((diff == 0) ? 0.0f : ((diff == 2) ? 1.0f : ((diff == 1) ? 0.5f : 1.5f)));
    }
    
    public static EnumFacing enumFacing(final BlockPos blockPos) {
        EnumFacing[] values;
        for (int length = (values = EnumFacing.values()).length, i = 0; i < length; ++i) {
            final EnumFacing enumFacing = values[i];
            final Vec3d vec3d = new Vec3d(StormCrystal.mc.player.posX, StormCrystal.mc.player.posY + StormCrystal.mc.player.getEyeHeight(), StormCrystal.mc.player.posZ);
            final Vec3d vec3d2 = new Vec3d((double)(blockPos.getX() + enumFacing.getDirectionVec().getX()), (double)(blockPos.getY() + enumFacing.getDirectionVec().getY()), (double)(blockPos.getZ() + enumFacing.getDirectionVec().getZ()));
            final RayTraceResult rayTraceBlocks;
            if ((rayTraceBlocks = StormCrystal.mc.world.rayTraceBlocks(vec3d, vec3d2, false, true, false)) != null && rayTraceBlocks.typeOfHit.equals((Object)RayTraceResult.Type.BLOCK) && rayTraceBlocks.getBlockPos().equals((Object)blockPos)) {
                return enumFacing;
            }
        }
        if (blockPos.getY() > StormCrystal.mc.player.posY + StormCrystal.mc.player.getEyeHeight()) {
            return EnumFacing.DOWN;
        }
        return EnumFacing.UP;
    }
    
    public static boolean IsEating() {
        return StormCrystal.mc.player != null && (StormCrystal.mc.player.getHeldItemMainhand().getItem() instanceof ItemFood || StormCrystal.mc.player.getHeldItemOffhand().getItem() instanceof ItemFood) && StormCrystal.mc.player.isHandActive();
    }
    
    public static boolean CanSeeBlock(final BlockPos p_Pos) {
        return StormCrystal.mc.world.rayTraceBlocks(new Vec3d(StormCrystal.mc.player.posX, StormCrystal.mc.player.posY + StormCrystal.mc.player.getEyeHeight(), StormCrystal.mc.player.posZ), new Vec3d((double)p_Pos.getX(), p_Pos.getY() + 1.7, (double)p_Pos.getZ()), false, true, false) == null;
    }
    
    public static double getVecDistance(final BlockPos a, final double posX, final double posY, final double posZ) {
        final double x1 = a.getX() - posX;
        final double y1 = a.getY() - posY;
        final double z1 = a.getZ() - posZ;
        return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
    }
    
    @SubscribeEvent
    public void doAutoCrystal(final TickEvent.RenderTickEvent event) {
        if (StormCrystal.mc.player != null && StormCrystal.mc.world != null) {
            if (this.placeTimer.passedMs(1050.0) || this.breakTimer.passedMs(1050.0)) {
                StormCrystal.rotating = false;
            }
            if (!this.PauseEating_value.getValue() || !IsEating()) {
                this.shouldIgnoreEntity = false;
                this.c = (EntityEnderCrystal)StormCrystal.mc.world.loadedEntityList.stream().filter(this::canHitCrystal).map(e -> e).min(Comparator.comparing(e -> StormCrystal.mc.player.getDistance(e))).orElse(null);
                if (this.Explode_value.getValue() && this.c != null) {
                    if (StormCrystal.mc.player.canEntityBeSeen((Entity)this.c) || (StormCrystal.mc.player.getDistance((Entity)this.c) < this.WallRange_value.getValue() && this.Wall_value.getValue()) || !this.Wall_value.getValue()) {
                        this.ExplodeCrystal(this.c);
                        this.shouldIgnoreEntity = (!this.MultiPlace_value.getValue() && (this.shouldIgnoreEntity = this.EntityIgnore_value.getValue()));
                        if (this.Placements >= 2) {
                            this.Placements = 0;
                            if (this.shouldIgnoreEntity == this.EntityIgnore_value.getValue()) {
                                return;
                            }
                            this.shouldIgnoreEntity = this.EntityIgnore_value.getValue();
                        }
                    }
                }
                else {
                    this.resetRotation();
                    if (this.oldSlot != -1) {
                        StormCrystal.mc.player.inventory.currentItem = this.oldSlot;
                        this.oldSlot = -1;
                    }
                }
                int crystalSlot = (StormCrystal.mc.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) ? StormCrystal.mc.player.inventory.currentItem : -1;
                if (crystalSlot == -1) {
                    for (int l = 0; l < 9; ++l) {
                        if (StormCrystal.mc.player.inventory.getStackInSlot(l).getItem() == Items.END_CRYSTAL) {
                            crystalSlot = l;
                            break;
                        }
                    }
                }
                boolean offhand = false;
                if (StormCrystal.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) {
                    offhand = true;
                }
                else if (crystalSlot == -1 && !this.GhostHand_value.getValue()) {
                    return;
                }
                if (this.updateTimer.passedMs(10L)) {
                    try {
                        this.crystalTarget = this.Calculator();
                    }
                    catch (Exception e2) {
                        Command.sendMessage("[AntiCrash] I've prevented you from a crash!");
                    }
                }
                if (this.crystalTarget != null) {
                    StormCrystal.target = this.crystalTarget.target;
                    final BlockPos targetBlock = this.crystalTarget.blockPos;
                    if (StormCrystal.target == null) {
                        this.renderBlock = null;
                        this.resetRotation();
                    }
                    else {
                        this.renderBlock = targetBlock;
                        final AutoGG autoGG = ModuleManager.getModuleByClass(AutoGG.class);
                        if (autoGG != null) {
                            if (autoGG.isEnabled()) {
                                autoGG.addTargetedPlayer(StormCrystal.target.getName());
                            }
                        }
                        if (this.Place_value.getValue()) {
                            final EnumHand enumHand = offhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
                            if (!offhand && StormCrystal.mc.player.inventory.currentItem != crystalSlot) {
                                if (this.AutoSwitch_value.getValue()) {
                                    StormCrystal.mc.player.inventory.currentItem = crystalSlot;
                                    this.resetRotation();
                                    this.switchCoolDown = true;
                                }
                                if (!this.GhostHand_value.getValue()) {
                                    return;
                                }
                            }
                            if (this.switchCoolDown) {
                                this.switchCoolDown = false;
                                return;
                            }
                            int inft = -1;
                            if (StormCrystal.mc.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && StormCrystal.mc.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL && this.GhostHand_value.getValue() && !this.AutoSwitch_value.getValue() && findCrystal() != -1) {
                                inft = StormCrystal.mc.player.inventory.currentItem;
                                StormCrystal.mc.player.inventory.currentItem = findCrystal();
                                StormCrystal.mc.playerController.updateController();
                            }
                            this.PlaceCrystal(targetBlock, enumHand);
                            if (inft != -1 && this.GhostHand_value.getValue()) {
                                StormCrystal.mc.player.inventory.currentItem = inft;
                                StormCrystal.mc.playerController.updateController();
                            }
                        }
                        if (this.Rotate_value.getValue() && StormCrystal.isSpoofingAngles) {
                            final EntityPlayerSP sp = StormCrystal.mc.player;
                            sp.rotationPitch -= (float)4.0E-4;
                            this.togglePitch = !this.togglePitch;
                        }
                    }
                }
            }
        }
    }
    
    private static int findCrystal() {
        for (int l = 0; l < 9; ++l) {
            if (StormCrystal.mc.player.inventory.getStackInSlot(l).getItem() == Items.END_CRYSTAL) {
                return l;
            }
        }
        return -1;
    }
    
    private CrystalTarget Calculator() {
        if (StormCrystal.mc.player == null || StormCrystal.mc.world == null) {
            return null;
        }
        double damage = 0.5;
        BlockPos tempBlock = null;
        Entity target = null;
        this.PlacePosList = this.findCrystalBlocks(this.PlaceRange_value.getValue());
        final List<Entity> entities = this.getEntities();
        this.PrevSlot = -1;
        for (final Entity entity2 : entities) {
            if (entity2 != StormCrystal.mc.player && ((EntityLivingBase)entity2).getHealth() > 0.0f) {
                final Vec3d targetVec = new Vec3d(entity2.posX, entity2.posY, entity2.posZ);
                final Vec3d interpolatedPos = EntityUtils.getInterpolatedPos(entity2, this.PrediteNumber_value.getValue());
                final BlockPos pos = new BlockPos(interpolatedPos.x, interpolatedPos.y, interpolatedPos.z);
                if (pos != null && this.canPlaceCrystal(pos, false)) {
                    this.PlacePosList.add(pos);
                }
                for (final BlockPos blockPos : this.PlacePosList) {
                    if ((blockPos == null || entity2.getDistanceSq(blockPos) < this.Distance_value.getValue() * this.Distance_value.getValue()) && (blockPos == null || StormCrystal.mc.player.getDistance((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ()) <= this.PlaceRange_value.getValue())) {
                        final double targetDamage = calculateDamage(Math.floor(blockPos.getX()) + 0.5, Math.floor(blockPos.getY()) + 1.0, Math.floor(blockPos.getZ()) + 0.5, entity2, targetVec);
                        if (targetDamage < damage || (blockPos != null && targetDamage < (this.FacePlace_value.getValue() ? (this.canFacePlace((EntityLivingBase)entity2, this.BlastHealth_value.getValue()) ? 1.0 : this.MinDmg_value.getValue()) : this.MinDmg_value.getValue()))) {
                            continue;
                        }
                        final float healthTarget = ((EntityLivingBase)entity2).getHealth() + ((EntityLivingBase)entity2).getAbsorptionAmount();
                        final float healthSelf = StormCrystal.mc.player.getHealth() + StormCrystal.mc.player.getAbsorptionAmount();
                        final double selfDamage = calculateDamage(Math.floor(blockPos.getX()) + 0.5, Math.floor(blockPos.getY()) + 1.0, Math.floor(blockPos.getZ()) + 0.5, (Entity)StormCrystal.mc.player, StormCrystal.mc.player.getPositionVector());
                        if ((blockPos != null && selfDamage > targetDamage && targetDamage < healthTarget) || (blockPos != null && selfDamage - 2.0 > healthSelf) || (blockPos != null && selfDamage > this.MaxSelf_value.getValue()) || (blockPos != null && !this.Wall_value.getValue() && this.WallRange_value.getValue() > 0.0 && !CanSeeBlock(blockPos) && getVecDistance(blockPos, StormCrystal.mc.player.posX, StormCrystal.mc.player.posY, StormCrystal.mc.player.posZ) >= this.WallRange_value.getValue())) {
                            continue;
                        }
                        damage = targetDamage;
                        tempBlock = new BlockPos(Math.floor(blockPos.getX()), (double)blockPos.getY(), Math.floor(blockPos.getZ()));
                        target = entity2;
                        if (!this.RenderDmg_value.getValue()) {
                            continue;
                        }
                        this.renderBlockDmg.put(tempBlock, targetDamage);
                    }
                }
            }
        }
        return new CrystalTarget(tempBlock, target);
    }
    
    private void GhostHand() {
        if (StormCrystal.mc.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && StormCrystal.mc.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL) {
            for (int i = 0; i < 9; ++i) {
                final ItemStack stack = StormCrystal.mc.player.inventory.getStackInSlot(i);
                if (stack != ItemStack.EMPTY && stack.getItem() == Items.END_CRYSTAL) {
                    this.PrevSlot = StormCrystal.mc.player.inventory.currentItem;
                    StormCrystal.mc.player.inventory.currentItem = i;
                    StormCrystal.mc.playerController.updateController();
                }
            }
        }
        else {
            this.PrevSlot = -1;
        }
    }
    
    @NotNull
    private List<Entity> getEntities() {
        final List<Entity> entities = new ArrayList<Entity>();
        if (this.TargetPlayer_value.getValue()) {
            entities.addAll((Collection<? extends Entity>)StormCrystal.mc.world.playerEntities.stream().filter(entityPlayer -> !Stay.friendManager.isFriend(entityPlayer.getName())).filter(entity -> StormCrystal.mc.player.getDistance(entity) < this.Distance_value.getValue()).collect(Collectors.toList()));
        }
        entities.addAll((Collection<? extends Entity>)StormCrystal.mc.world.loadedEntityList.stream().filter(entity -> (EntityUtils.isLiving(entity) && EntityUtils.isPassive(entity)) ? this.TargetAnimals_value.getValue() : ((boolean)this.TargetMobs_value.getValue())).filter(entity -> !(entity instanceof EntityPlayer)).filter(entity -> StormCrystal.mc.player.getDistance(entity) < this.Distance_value.getValue()).collect(Collectors.toList()));
        for (final Entity ite2 : new ArrayList<Entity>(entities)) {
            if (StormCrystal.mc.player.getDistance(ite2) > this.Distance_value.getValue()) {
                entities.remove(ite2);
            }
            if (ite2 == StormCrystal.mc.player) {
                entities.remove(ite2);
            }
        }
        entities.sort(Comparator.comparingDouble(entity -> entity.getDistance((Entity)StormCrystal.mc.player)));
        return entities;
    }
    
    public int getColor() {
        final float[] tick_color = { System.currentTimeMillis() % 11520L / 11520.0f * this.RGBSpeed_value.getValue() };
        final int color_rgb = Color.HSBtoRGB(tick_color[0], this.Saturation_value.getValue(), this.Brightness_value.getValue());
        return this.Rainbow_value.getValue() ? new Color(color_rgb >> 16 & 0xFF, color_rgb >> 8 & 0xFF, color_rgb & 0xFF, this.Alpha_value.getValue()).getRGB() : new Color(this.Red_value.getValue(), this.Green_value.getValue(), this.Blue_value.getValue(), this.Alpha_value.getValue()).getRGB();
    }
    
    @Override
    public void onEnable() {
        this.placeTimer.reset();
        this.breakTimer.reset();
        this.updateTimer.reset();
        this.renderBlockDmg.clear();
        (this.blockRenderSmooth = new BlockEasingRender(new BlockPos(0, 0, 0), this.moveTime.getValue(), this.fadeTime.getValue(), this.movingEasingType.getValue(), this.fadingEasingType.getValue())).reset();
    }
    
    @Override
    public void onDisable() {
        StormCrystal.rotating = false;
        this.resetRotation();
        this.renderBlock = null;
        this.pos1 = null;
        StormCrystal.target = null;
        StormCrystal.yaw = StormCrystal.mc.player.rotationYaw;
        StormCrystal.pitch = StormCrystal.mc.player.rotationPitch;
        this.PlacePosList.clear();
    }
    
    @NotNull
    @Override
    public String getDisplayInfo() {
        return (StormCrystal.target == null) ? "Finding...." : StormCrystal.target.getName();
    }
    
    static {
        StormCrystal.rotating = false;
    }
    
    static class CrystalTarget
    {
        public BlockPos blockPos;
        public Entity target;
        
        public CrystalTarget(final BlockPos block, final Entity target) {
            this.blockPos = block;
            this.target = target;
        }
    }
    
    public enum ThreadMode3
    {
        Dynamic, 
        Classic;
    }
    
    public enum ThreadMode
    {
        Off, 
        Main, 
        Packet;
    }
    
    public enum ThreadMode2
    {
        Smart;
    }
}
