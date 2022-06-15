//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.util.counting.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.math.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import java.util.*;
import me.alpha432.stay.util.world.*;

public class HoleFiller extends Module
{
    private static final BlockPos[] surroundOffset;
    private static HoleFiller INSTANCE;
    private final Setting<Double> range;
    private final Setting<Integer> delay;
    private final Setting<Boolean> rotate;
    private final Setting<Integer> blocksPerTick;
    private final Setting<Boolean> packet;
    private final Timer offTimer;
    private final Timer timer;
    private boolean isSneaking;
    private boolean hasOffhand;
    private final Map<BlockPos, Integer> retries;
    private final Timer retryTimer;
    public Setting<Boolean> boxs;
    private int blocksThisTick;
    private ArrayList<BlockPos> holes;
    private int trie;
    
    public HoleFiller() {
        super("HoleFill", "Fills holes around you.", Category.COMBAT, true, false, true);
        this.packet = (Setting<Boolean>)this.register(new Setting("Packet", (T)false));
        this.hasOffhand = false;
        this.range = (Setting<Double>)this.register(new Setting("PlaceRange", (T)5.0, (T)0.0, (T)7.0));
        this.delay = (Setting<Integer>)this.register(new Setting("Delay", (T)50, (T)0, (T)250));
        this.blocksPerTick = (Setting<Integer>)this.register(new Setting("BlocksPerTick", (T)20, (T)8, (T)30));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)true));
        this.boxs = (Setting<Boolean>)this.register(new Setting("Double Hole", (T)true));
        this.offTimer = new Timer();
        this.timer = new Timer();
        this.blocksThisTick = 0;
        this.retries = new HashMap<BlockPos, Integer>();
        this.retryTimer = new Timer();
        this.holes = new ArrayList<BlockPos>();
        this.setInstance();
    }
    
    public static HoleFiller getInstance() {
        if (HoleFiller.INSTANCE == null) {
            HoleFiller.INSTANCE = new HoleFiller();
        }
        return HoleFiller.INSTANCE;
    }
    
    private void setInstance() {
        HoleFiller.INSTANCE = this;
    }
    
    @Override
    public void onEnable() {
        if (fullNullCheck()) {
            this.disable();
        }
        this.offTimer.reset();
        this.trie = 0;
    }
    
    @Override
    public void onTick() {
        if (this.isOn() && (this.blocksPerTick.getValue() != 1 || !this.rotate.getValue())) {
            this.doHoleFill();
        }
    }
    
    @Override
    public void onDisable() {
        this.retries.clear();
    }
    
    private void doHoleFill() {
        if (this.check()) {
            return;
        }
        this.holes = new ArrayList<BlockPos>();
        final Double maxDist = this.range.getValue();
        final BlockPos ret = null;
        for (Double x = maxDist; x >= -maxDist; --x) {
            for (Double y = maxDist; y >= -maxDist; --y) {
                for (Double z = maxDist; z >= -maxDist; --z) {
                    final BlockPos pos = new BlockPos(Wrapper.getPlayer().posX + x + 0.5, Wrapper.getPlayer().posY + y + 0.5, Wrapper.getPlayer().posZ + z + 0.5);
                    final double dist = Wrapper.getPlayer().getDistance(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
                    if (HoleFiller.mc.world.getBlockState(pos).getBlock() == Blocks.AIR) {
                        if (this.boxs.getValue() && dist <= maxDist && HoleUtil.is2Hole(pos) != null) {
                            this.holes.add(pos);
                            this.holes.add(HoleUtil.is2Hole(pos));
                        }
                        else if (dist <= maxDist && HoleUtil.isHole(pos)) {
                            this.holes.add(pos);
                        }
                    }
                }
            }
        }
        this.holes.forEach(this::placeBlock);
        this.toggle();
    }
    
    private void placeBlock(final BlockPos pos) {
        for (final Entity entity : HoleFiller.mc.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(pos))) {
            if (entity instanceof EntityLivingBase) {
                return;
            }
        }
        if (this.blocksThisTick < this.blocksPerTick.getValue()) {
            final int obbySlot = InventoryUtil.findHotbarBlock(BlockObsidian.class);
            final int eChestSot = InventoryUtil.findHotbarBlock(BlockEnderChest.class);
            if (obbySlot == -1 && eChestSot == -1) {
                this.toggle();
            }
            final boolean smartRotate = this.blocksPerTick.getValue() == 1 && this.rotate.getValue();
            if (smartRotate) {
                this.isSneaking = BlockUtil.placeBlockSmartRotate(pos, this.hasOffhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, true, this.packet.getValue(), this.isSneaking);
            }
            else {
                this.isSneaking = BlockUtil.placeBlock(pos, this.hasOffhand ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue(), this.packet.getValue(), this.isSneaking);
            }
            final int originalSlot = HoleFiller.mc.player.inventory.currentItem;
            HoleFiller.mc.player.inventory.currentItem = ((obbySlot == -1) ? eChestSot : obbySlot);
            HoleFiller.mc.playerController.updateController();
            TestUtil.placeBlock(pos);
            if (HoleFiller.mc.player.inventory.currentItem != originalSlot) {
                HoleFiller.mc.player.inventory.currentItem = originalSlot;
                HoleFiller.mc.playerController.updateController();
            }
            this.timer.reset();
            ++this.blocksThisTick;
        }
    }
    
    private boolean check() {
        if (fullNullCheck()) {
            this.disable();
            return true;
        }
        this.blocksThisTick = 0;
        if (this.retryTimer.passedMs(2000L)) {
            this.retries.clear();
            this.retryTimer.reset();
        }
        return !this.timer.passedMs(this.delay.getValue());
    }
    
    static {
        HoleFiller.INSTANCE = new HoleFiller();
        surroundOffset = BlockUtil.toBlockPos(EntityUtils.getOffsets(0, true));
    }
}
