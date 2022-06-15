//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.world;

import kotlin.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001bJ&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bJ\u0016\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020(J\u0016\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020(J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001fJ\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020(J\u000e\u0010/\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020(J\u0010\u00100\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0018\u00100\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\tJ\u000e\u00102\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0005J\u0010\u00104\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u000e\u00105\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0005J\u0010\u00106\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u0005J\u000e\u00108\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0005J\u0010\u00109\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0010\u0010:\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u0005J\u000e\u0010;\u001a\u00020\t2\u0006\u00107\u001a\u00020\u0005J\u0010\u0010<\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J.\u0010=\u001a\u00020\t2\u0006\u00107\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0016\u001a\u00020\t*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006B" }, d2 = { "Lme/alpha432/stay/util/world/EntityUtil;", "", "()V", "entityList", "", "Lnet/minecraft/entity/Entity;", "getEntityList", "()Ljava/util/List;", "isPlayerInHole", "", "()Z", "localPlayerPosFloored", "Lnet/minecraft/util/math/BlockPos;", "getLocalPlayerPosFloored", "()Lnet/minecraft/util/math/BlockPos;", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "getMc", "()Lnet/minecraft/client/Minecraft;", "setMc", "(Lnet/minecraft/client/Minecraft;)V", "isInHole", "(Lnet/minecraft/entity/Entity;)Z", "calculateLookAt", "", "px", "", "py", "pz", "me", "Lnet/minecraft/entity/player/EntityPlayer;", "getInterpolatedAmount", "Lnet/minecraft/util/math/Vec3d;", "entity", "ticks", "x", "y", "z", "getInterpolatedPos", "", "getInterpolatedRenderPos", "getPlayerName", "", "player", "getRelativeX", "yaw", "getRelativeZ", "isAboveWater", "packet", "isCurrentlyNeutral", "isEntityInHole", "isFakeLocalPlayer", "isHostileMob", "isLiving", "e", "isMobAggressive", "isNeutralMob", "isPassive", "isPassiveMob", "isPlayer", "mobTypeSettings", "mobs", "passive", "neutral", "hostile", "Stay" })
public final class EntityUtil
{
    @NotNull
    public static final EntityUtil INSTANCE;
    private static Minecraft mc;
    
    private EntityUtil() {
    }
    
    public final Minecraft getMc() {
        return EntityUtil.mc;
    }
    
    public final void setMc(final Minecraft <set-?>) {
        EntityUtil.mc = <set-?>;
    }
    
    public final boolean mobTypeSettings(@NotNull final Entity e, final boolean mobs, final boolean passive, final boolean neutral, final boolean hostile) {
        Intrinsics.checkNotNullParameter((Object)e, "e");
        return mobs && ((passive && this.isPassiveMob(e)) || (neutral && this.isCurrentlyNeutral(e)) || (hostile && this.isMobAggressive(e)));
    }
    
    public final boolean isPassiveMob(@NotNull final Entity e) {
        Intrinsics.checkNotNullParameter((Object)e, "e");
        return e instanceof EntityAgeable || e instanceof EntityAmbientCreature || e instanceof EntitySquid;
    }
    
    public final boolean isCurrentlyNeutral(@NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return this.isNeutralMob(entity) && !this.isMobAggressive(entity);
    }
    
    @NotNull
    public final Vec3d getInterpolatedAmount(@NotNull final Entity entity, final double x, final double y, final double z) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return new Vec3d((entity.posX - entity.lastTickPosX) * x, (entity.posY - entity.lastTickPosY) * y, (entity.posZ - entity.lastTickPosZ) * z);
    }
    
    public final double getRelativeX(final float yaw) {
        return MathHelper.sin(-yaw * 0.017453292f);
    }
    
    public final double getRelativeZ(final float yaw) {
        return MathHelper.cos(yaw * 0.017453292f);
    }
    
    @NotNull
    public final Vec3d getInterpolatedAmount(@NotNull final Entity entity, final double ticks) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return this.getInterpolatedAmount(entity, ticks, ticks, ticks);
    }
    
    @NotNull
    public final Vec3d getInterpolatedRenderPos(@NotNull final Entity entity, final float ticks) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final Vec3d subtract = this.getInterpolatedPos(entity, ticks).subtract(Minecraft.getMinecraft().getRenderManager().renderPosX, Minecraft.getMinecraft().getRenderManager().renderPosY, Minecraft.getMinecraft().getRenderManager().renderPosZ);
        Intrinsics.checkNotNullExpressionValue((Object)subtract, "getInterpolatedPos(entit\u2026er().renderPosZ\n        )");
        return subtract;
    }
    
    @NotNull
    public final Vec3d getInterpolatedPos(@NotNull final Entity entity, final float ticks) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final Vec3d add = new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(this.getInterpolatedAmount(entity, ticks));
        Intrinsics.checkNotNullExpressionValue((Object)add, "Vec3d(entity.lastTickPos\u2026cks.toDouble())\n        )");
        return add;
    }
    
    public final boolean isFakeLocalPlayer(@Nullable final Entity entity) {
        return entity != null && entity.getEntityId() == -100 && Minecraft.getMinecraft().player != entity;
    }
    
    public final boolean isAboveWater(@Nullable final Entity entity) {
        return this.isAboveWater(entity, false);
    }
    
    public final boolean isAboveWater(@Nullable final Entity entity, final boolean packet) {
        if (entity == null) {
            return false;
        }
        final double y = entity.posY - (packet ? 0.03 : (this.isPlayer(entity) ? 0.2 : 0.5));
        int i = MathHelper.floor(entity.posX);
        while (i < MathHelper.ceil(entity.posX)) {
            final int x = i;
            ++i;
            int j = MathHelper.floor(entity.posZ);
            while (j < MathHelper.ceil(entity.posZ)) {
                final int z = j;
                ++j;
                final BlockPos pos = new BlockPos(x, MathHelper.floor(y), z);
                if (Minecraft.getMinecraft().world.getBlockState(pos).getBlock() instanceof BlockLiquid) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @NotNull
    public final double[] calculateLookAt(final double px, final double py, final double pz, @NotNull final EntityPlayer me) {
        Intrinsics.checkNotNullParameter((Object)me, "me");
        double dirx = me.posX - px;
        double diry = me.posY - py;
        double dirz = me.posZ - pz;
        final double len = Math.sqrt(dirx * dirx + diry * diry + dirz * dirz);
        dirx /= len;
        diry /= len;
        dirz /= len;
        double pitch = Math.asin(diry);
        double yaw = Math.atan2(dirz, dirx);
        pitch = pitch * 180.0 / 3.141592653589793;
        yaw = yaw * 180.0 / 3.141592653589793;
        yaw += 90.0;
        return new double[] { yaw, pitch };
    }
    
    public final boolean isMobAggressive(@NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        if (entity instanceof EntityPigZombie) {
            if (((EntityPigZombie)entity).isArmsRaised() || ((EntityPigZombie)entity).isAngry()) {
                return true;
            }
        }
        else {
            if (entity instanceof EntityWolf) {
                return ((EntityWolf)entity).isAngry() && !Intrinsics.areEqual((Object)Minecraft.getMinecraft().player, (Object)((EntityWolf)entity).getOwner());
            }
            if (entity instanceof EntityEnderman) {
                return ((EntityEnderman)entity).isScreaming();
            }
        }
        return this.isHostileMob(entity);
    }
    
    public final boolean isHostileMob(@NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return entity.isCreatureType(EnumCreatureType.MONSTER, false) && !this.isNeutralMob(entity);
    }
    
    public final boolean isNeutralMob(@Nullable final Entity entity) {
        return entity instanceof EntityPigZombie || entity instanceof EntityWolf || entity instanceof EntityEnderman;
    }
    
    public final boolean isPassive(@Nullable final Entity e) {
        return (!(e instanceof EntityWolf) || !((EntityWolf)e).isAngry()) && (e instanceof EntityAgeable || e instanceof EntityAmbientCreature || e instanceof EntitySquid || (e instanceof EntityIronGolem && ((EntityIronGolem)e).getRevengeTarget() == null));
    }
    
    public final boolean isPlayer(@Nullable final Entity entity) {
        return entity instanceof EntityPlayer;
    }
    
    public final boolean isLiving(@Nullable final Entity e) {
        return e instanceof EntityLivingBase;
    }
    
    @NotNull
    public final String getPlayerName(@NotNull final EntityPlayer player) {
        Intrinsics.checkNotNullParameter((Object)player, "player");
        final String name = player.getGameProfile().getName();
        Intrinsics.checkNotNullExpressionValue((Object)name, "player.gameProfile.name");
        return name;
    }
    
    @NotNull
    public final List<Entity> getEntityList() {
        final List getLoadedEntityList = Minecraft.getMinecraft().world.getLoadedEntityList();
        Intrinsics.checkNotNullExpressionValue((Object)getLoadedEntityList, "getMinecraft().world.getLoadedEntityList()");
        return (List<Entity>)getLoadedEntityList;
    }
    
    @NotNull
    public final BlockPos getLocalPlayerPosFloored() {
        return new BlockPos(Math.floor(EntityUtil.mc.player.posX), Math.floor(EntityUtil.mc.player.posY), Math.floor(EntityUtil.mc.player.posZ));
    }
    
    public final boolean isInHole(@NotNull final Entity $this$isInHole) {
        Intrinsics.checkNotNullParameter((Object)$this$isInHole, "<this>");
        return this.isEntityInHole($this$isInHole);
    }
    
    public final boolean isEntityInHole(@NotNull final Entity entity) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final BlockPos blockPos = new BlockPos(Math.floor(entity.posX), Math.floor(entity.posY), Math.floor(entity.posZ));
        final IBlockState blockState = EntityUtil.mc.world.getBlockState(blockPos);
        if (blockState.getBlock() != Blocks.AIR) {
            return false;
        }
        if (EntityUtil.mc.world.getBlockState(blockPos.up()).getBlock() != Blocks.AIR) {
            return false;
        }
        if (EntityUtil.mc.world.getBlockState(blockPos.down()).getBlock() == Blocks.AIR) {
            return false;
        }
        final BlockPos[] touchingBlocks = { blockPos.north(), blockPos.south(), blockPos.east(), blockPos.west() };
        int validHorizontalBlocks = 0;
        int i = 0;
        while (i < touchingBlocks.length) {
            final BlockPos touching = touchingBlocks[i];
            ++i;
            final IBlockState touchingState = EntityUtil.mc.world.getBlockState(touching);
            if (touchingState.getBlock() != Blocks.AIR && touchingState.isFullBlock()) {
                ++validHorizontalBlocks;
            }
        }
        return validHorizontalBlocks >= 4;
    }
    
    public final boolean isPlayerInHole() {
        final BlockPos blockPos = this.getLocalPlayerPosFloored();
        final IBlockState blockState = EntityUtil.mc.world.getBlockState(blockPos);
        if (blockState.getBlock() != Blocks.AIR) {
            return false;
        }
        if (EntityUtil.mc.world.getBlockState(blockPos.up()).getBlock() != Blocks.AIR) {
            return false;
        }
        if (EntityUtil.mc.world.getBlockState(blockPos.down()).getBlock() == Blocks.AIR) {
            return false;
        }
        final BlockPos[] touchingBlocks = { blockPos.north(), blockPos.south(), blockPos.east(), blockPos.west() };
        int validHorizontalBlocks = 0;
        int i = 0;
        while (i < touchingBlocks.length) {
            final BlockPos touching = touchingBlocks[i];
            ++i;
            final IBlockState touchingState = EntityUtil.mc.world.getBlockState(touching);
            if (touchingState.getBlock() != Blocks.AIR && touchingState.isFullBlock()) {
                ++validHorizontalBlocks;
            }
        }
        return validHorizontalBlocks >= 4;
    }
    
    static {
        INSTANCE = new EntityUtil();
        EntityUtil.mc = Minecraft.getMinecraft();
    }
}
