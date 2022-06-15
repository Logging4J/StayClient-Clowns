//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import net.minecraft.client.*;
import me.alpha432.stay.util.inventory.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.enchantment.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;

public class CrystalUtil
{
    public static Minecraft mc;
    
    protected static final double getDirection2D(final double d, final double d2) {
        double d3;
        if (d2 == 0.0) {
            d3 = ((d > 0.0) ? 90.0 : -90.0);
        }
        else {
            d3 = Math.atan(d / d2) * 57.2957796;
            if (d2 < 0.0) {
                d3 = ((d > 0.0) ? (d3 += 180.0) : ((d < 0.0) ? (d3 -= 180.0) : 180.0));
            }
        }
        return d3;
    }
    
    protected static final Vec3d getVectorForRotation(final double d, final double d2) {
        final float f = MathHelper.cos((float)(-d2 * 0.01745329238474369 - 3.1415927410125732));
        final float f2 = MathHelper.sin((float)(-d2 * 0.01745329238474369 - 3.1415927410125732));
        final float f3 = -MathHelper.cos((float)(-d * 0.01745329238474369));
        final float f4 = MathHelper.sin((float)(-d * 0.01745329238474369));
        return new Vec3d((double)(f2 * f3), (double)f4, (double)(f * f3));
    }
    
    public static EnumActionResult placeCrystal(final BlockPos blockPos) {
        blockPos.offset(EnumFacing.DOWN);
        final double d = blockPos.getX() + 0.5 - CrystalUtil.mc.player.posX;
        final double d2 = blockPos.getY() + 0.5 - CrystalUtil.mc.player.posY - 0.5 - CrystalUtil.mc.player.getEyeHeight();
        final double d3 = blockPos.getZ() + 0.5 - CrystalUtil.mc.player.posZ;
        final double d4 = getDirection2D(d3, d);
        final double d5 = getDirection2D(d2, Math.sqrt(d * d + d3 * d3));
        final Vec3d vec3d = getVectorForRotation(-d5, d4 - 90.0);
        if (((ItemStack)CrystalUtil.mc.player.inventory.offHandInventory.get(0)).getItem().getClass().equals(Item.getItemById(426).getClass())) {
            return CrystalUtil.mc.playerController.processRightClickBlock(CrystalUtil.mc.player, CrystalUtil.mc.world, blockPos.offset(EnumFacing.DOWN), EnumFacing.UP, vec3d, EnumHand.OFF_HAND);
        }
        if (InventoryUtil.pickItem(426) != -1) {
            InventoryUtil.setSlot(InventoryUtil.pickItem(426));
            return CrystalUtil.mc.playerController.processRightClickBlock(CrystalUtil.mc.player, CrystalUtil.mc.world, blockPos.offset(EnumFacing.DOWN), EnumFacing.UP, vec3d, EnumHand.MAIN_HAND);
        }
        return EnumActionResult.FAIL;
    }
    
    public static double getRange(final Vec3d a, final double x, final double y, final double z) {
        final double xl = a.x - x;
        final double yl = a.y - y;
        final double zl = a.z - z;
        return Math.sqrt(xl * xl + yl * yl + zl * zl);
    }
    
    public static boolean isReplaceable(final Block block) {
        return block == Blocks.FIRE || block == Blocks.DOUBLE_PLANT || block == Blocks.VINE;
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
            finalValue = getBlastReduction((EntityLivingBase)entity, getDamageMultiplied(damage), new Explosion((World)CrystalUtil.mc.world, (Entity)null, posX, posY, posZ, 6.0f, false, true));
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
        catch (Exception ignored) {
            return getBlastReduction(entity, damage, explosion);
        }
    }
    
    private static float getDamageMultiplied(final float damage) {
        final int diff = CrystalUtil.mc.world.getDifficulty().getId();
        return damage * ((diff == 0) ? 0.0f : ((diff == 2) ? 1.0f : ((diff == 1) ? 0.5f : 1.5f)));
    }
    
    public static EnumFacing enumFacing(final BlockPos blockPos) {
        EnumFacing[] values;
        for (int length = (values = EnumFacing.values()).length, i = 0; i < length; ++i) {
            final EnumFacing enumFacing = values[i];
            final Vec3d vec3d = new Vec3d(CrystalUtil.mc.player.posX, CrystalUtil.mc.player.posY + CrystalUtil.mc.player.getEyeHeight(), CrystalUtil.mc.player.posZ);
            final Vec3d vec3d2 = new Vec3d((double)(blockPos.getX() + enumFacing.getDirectionVec().getX()), (double)(blockPos.getY() + enumFacing.getDirectionVec().getY()), (double)(blockPos.getZ() + enumFacing.getDirectionVec().getZ()));
            final RayTraceResult rayTraceBlocks;
            if ((rayTraceBlocks = CrystalUtil.mc.world.rayTraceBlocks(vec3d, vec3d2, false, true, false)) != null && rayTraceBlocks.typeOfHit.equals((Object)RayTraceResult.Type.BLOCK) && rayTraceBlocks.getBlockPos().equals((Object)blockPos)) {
                return enumFacing;
            }
        }
        if (blockPos.getY() > CrystalUtil.mc.player.posY + CrystalUtil.mc.player.getEyeHeight()) {
            return EnumFacing.DOWN;
        }
        return EnumFacing.UP;
    }
    
    public static boolean isEating() {
        return CrystalUtil.mc.player != null && (CrystalUtil.mc.player.getHeldItemMainhand().getItem() instanceof ItemFood || CrystalUtil.mc.player.getHeldItemOffhand().getItem() instanceof ItemFood) && CrystalUtil.mc.player.isHandActive();
    }
    
    public static boolean canSeeBlock(final BlockPos p_Pos) {
        return CrystalUtil.mc.player == null || CrystalUtil.mc.world.rayTraceBlocks(new Vec3d(CrystalUtil.mc.player.posX, CrystalUtil.mc.player.posY + CrystalUtil.mc.player.getEyeHeight(), CrystalUtil.mc.player.posZ), new Vec3d((double)p_Pos.getX(), (double)p_Pos.getY(), (double)p_Pos.getZ()), false, true, false) != null;
    }
    
    public static BlockPos getPlayerPos() {
        return new BlockPos(Math.floor(CrystalUtil.mc.player.posX), Math.floor(CrystalUtil.mc.player.posY), Math.floor(CrystalUtil.mc.player.posZ));
    }
    
    public static double getVecDistance(final BlockPos a, final double posX, final double posY, final double posZ) {
        final double x1 = a.getX() - posX;
        final double y1 = a.getY() - posY;
        final double z1 = a.getZ() - posZ;
        return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
    }
    
    static {
        CrystalUtil.mc = Minecraft.getMinecraft();
    }
}
