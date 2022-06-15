//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import me.alpha432.stay.features.command.*;
import me.alpha432.stay.util.player.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.entity.item.*;
import me.alpha432.stay.util.world.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.math.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.block.*;

public class PistonAura extends Module
{
    private final Setting<Double> range;
    private final Setting<Boolean> rotate;
    private BlockPos breakPos;
    private EntityPlayer _target;
    private BlockPos breakPos1;
    private boolean placedCrystal;
    
    public PistonAura() {
        super("PistonCrystal", "PistonCrystal", Category.COMBAT, true, false, false);
        this.range = (Setting<Double>)this.register(new Setting("Range", (T)4.9, (T)0.0, (T)6.0));
        this.rotate = (Setting<Boolean>)this.register(new Setting("Rotate", (T)false));
        this.breakPos = null;
        this.placedCrystal = false;
    }
    
    @Override
    public void onTick() {
        final int n = this.findItem(Items.DIAMOND_PICKAXE);
        final int n2 = this.findItem(Items.END_CRYSTAL);
        final int n3 = this.findMaterials((Block)Blocks.PISTON);
        final int n4 = this.findMaterials(Blocks.REDSTONE_BLOCK);
        final int n5 = this.findMaterials(Blocks.OBSIDIAN);
        if (n == -1) {
            Command.sendMessage("No Pix");
            this.disable();
        }
        else if (n2 == -1) {
            Command.sendMessage("No crystal");
            this.disable();
        }
        else if (n3 == -1) {
            Command.sendMessage("No piston");
            this.disable();
        }
        else if (n4 == -1) {
            Command.sendMessage("No redstoneblock");
            this.disable();
        }
        else if (n5 == -1) {
            Command.sendMessage("No OBSIDIAN");
            this.disable();
        }
        else {
            this._target = PlayerUtil.findClosestTarget(this.range.getValue(), this._target);
            if ((this._target != null && this._target != null) || this._target != null) {
                if (PistonAura.mc.world == null) {
                    Command.sendMessage("ByWorld");
                    this.disable();
                }
                if (PistonAura.mc.player.getDistance((Entity)this._target) <= this.range.getValue()) {
                    this.place();
                }
            }
        }
    }
    
    private int findMaterials(final Block block) {
        for (int i = 0; i < 9; ++i) {
            if (PistonAura.mc.player.inventory.getStackInSlot(i).getItem() instanceof ItemBlock && ((ItemBlock)PistonAura.mc.player.inventory.getStackInSlot(i).getItem()).getBlock() == block) {
                return i;
            }
        }
        return -1;
    }
    
    private int findItem(final Item item) {
        if (item == Items.END_CRYSTAL && PistonAura.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) {
            return 999;
        }
        for (int i = 0; i < 9; ++i) {
            if (PistonAura.mc.player.inventory.getStackInSlot(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }
    
    public void place() {
        final int n = this.findItem(Items.END_CRYSTAL);
        final int n2 = this.findMaterials((Block)Blocks.PISTON);
        final int n3 = this.findMaterials(Blocks.REDSTONE_BLOCK);
        final int n4 = this.findMaterials(Blocks.OBSIDIAN);
        final BlockPos blockPos = new BlockPos(this._target.posX, this._target.posY, this._target.posZ);
        final int n5 = this.findItem(Items.DIAMOND_PICKAXE);
        final Entity entity2 = (Entity)PistonAura.mc.world.loadedEntityList.stream().filter(entity -> entity instanceof EntityEnderCrystal).min(Comparator.comparing(entity -> entity.getDistance((Entity)this._target))).orElse(null);
        if (BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockAir) {
            if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 0.0, this._target.posZ + 1.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(1, 0, 1);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 0.0, this._target.posZ + 1.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(2, 0, 1);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ + 1.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(2, 1, 1);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ + 1.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(1, 1, 1);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n2 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n2;
                }
                this.breakPos = blockPos.add(2, 2, 1);
                this.breakPos1 = blockPos.add(0, 2, 0);
                final float[] fArray = MathUtil.calcAngle(new Vec3d((Vec3i)this.breakPos), new Vec3d((Vec3i)this.breakPos1));
                PistonAura.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] + 180.0f, fArray[1], true));
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n != 999) {
                    PistonAura.mc.player.inventory.currentItem = n;
                }
                this.breakPos = blockPos.add(1, 2, 1);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, (PistonAura.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
                this.placedCrystal = true;
            }
            if (BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n3 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n3;
                }
                this.breakPos = blockPos.add(3, 2, 1);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
        }
        else if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockPistonMoving) {
            this.breakPos = blockPos.add(3, 2, 1);
            PistonAura.mc.player.inventory.currentItem = n5;
            PistonAura.mc.playerController.updateController();
            PistonAura.mc.player.swingArm(EnumHand.MAIN_HAND);
            PistonAura.mc.playerController.onPlayerDamageBlock(this.breakPos, EnumFacing.DOWN);
            if (entity2 != null) {
                PistonAura.mc.player.connection.sendPacket((Packet)new CPacketUseEntity(entity2));
            }
        }
        else if ((!(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ + 0.0) instanceof BlockAir) || !(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ + 0.0) instanceof BlockAir) || !(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ + 0.0) instanceof BlockAir)) && !Objects.requireNonNull(BlockUtil.getBlock(this._target.posX, this._target.posY + 1.0, this._target.posZ + 1.0).getRegistryName()).toString().toLowerCase().contains("bedrock") && !(BlockUtil.getBlock(this._target.posX, this._target.posY + 1.0, this._target.posZ + 1.0) instanceof BlockObsidian)) {
            if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockPistonMoving) {
                this.breakPos = blockPos.add(3, 2, 0);
                PistonAura.mc.player.inventory.currentItem = n5;
                PistonAura.mc.playerController.updateController();
                PistonAura.mc.player.swingArm(EnumHand.MAIN_HAND);
                PistonAura.mc.playerController.onPlayerDamageBlock(this.breakPos, EnumFacing.DOWN);
                if (entity2 != null) {
                    PistonAura.mc.player.connection.sendPacket((Packet)new CPacketUseEntity(entity2));
                }
            }
            else if (BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockAir) {
                if (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian) {
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 0.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(1, 0, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 0.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(2, 0, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(2, 1, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(1, 1, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(1, 2, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(2, 2, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n2 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n2;
                        }
                        this.breakPos = blockPos.add(2, 3, 0);
                        this.breakPos1 = blockPos.add(0, 3, 0);
                        final float[] fArray = MathUtil.calcAngle(new Vec3d((Vec3i)this.breakPos), new Vec3d((Vec3i)this.breakPos1));
                        PistonAura.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] + 180.0f, fArray[1], true));
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n != 999) {
                            PistonAura.mc.player.inventory.currentItem = n;
                        }
                        this.breakPos = blockPos.add(1, 3, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, (PistonAura.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                        this.placedCrystal = true;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n3 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n3;
                        }
                        this.breakPos = blockPos.add(3, 3, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                }
            }
            else if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockPistonMoving) {
                this.breakPos = blockPos.add(3, 3, 0);
                PistonAura.mc.player.inventory.currentItem = n5;
                PistonAura.mc.playerController.updateController();
                PistonAura.mc.player.swingArm(EnumHand.MAIN_HAND);
                PistonAura.mc.playerController.onPlayerDamageBlock(this.breakPos, EnumFacing.DOWN);
                if (entity2 != null) {
                    PistonAura.mc.player.connection.sendPacket((Packet)new CPacketUseEntity(entity2));
                }
            }
            else if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                if (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian) {
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 0.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(1, 0, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 0.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(2, 0, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n2 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n2;
                        }
                        this.breakPos1 = blockPos.add(1, 1, 0);
                        this.breakPos = blockPos.add(2, 1, 0);
                        this.breakPos1 = blockPos.add(0, 1, 0);
                        final float[] fArray = MathUtil.calcAngle(new Vec3d((Vec3i)this.breakPos), new Vec3d((Vec3i)this.breakPos1));
                        PistonAura.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] + 180.0f, fArray[1], true));
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n != 999) {
                            PistonAura.mc.player.inventory.currentItem = n;
                        }
                        this.breakPos = blockPos.add(1, 1, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, (PistonAura.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                        this.placedCrystal = true;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n3 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n3;
                        }
                        this.breakPos = blockPos.add(3, 1, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                }
            }
            else if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockPistonMoving) {
                this.breakPos = blockPos.add(3, 1, 0);
                PistonAura.mc.player.inventory.currentItem = n5;
                PistonAura.mc.playerController.updateController();
                PistonAura.mc.player.swingArm(EnumHand.MAIN_HAND);
                PistonAura.mc.playerController.onPlayerDamageBlock(this.breakPos, EnumFacing.DOWN);
                if (entity2 != null) {
                    PistonAura.mc.player.connection.sendPacket((Packet)new CPacketUseEntity(entity2));
                }
            }
            else if (BlockUtil.getBlock(this._target.posX - 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir && BlockUtil.getBlock(this._target.posX - 3.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir && BlockUtil.getBlock(this._target.posX - 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                if ((Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian) && (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian) && (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian)) {
                    if (BlockUtil.getBlock(this._target.posX - 1.0, this._target.posY + 0.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(-1, 0, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX - 2.0, this._target.posY + 0.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(-2, 0, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX - 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        this.breakPos = blockPos.add(-2, 1, 0);
                        this.breakPos1 = blockPos.add(0, 1, 0);
                        final float[] fArray = MathUtil.calcAngle(new Vec3d((Vec3i)this.breakPos), new Vec3d((Vec3i)this.breakPos1));
                        PistonAura.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] + 180.0f, fArray[1], true));
                        if (n2 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n2;
                        }
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX - 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n != 999) {
                            PistonAura.mc.player.inventory.currentItem = n;
                        }
                        this.breakPos = blockPos.add(-1, 1, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, (PistonAura.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                        this.placedCrystal = true;
                    }
                    if (BlockUtil.getBlock(this._target.posX - 3.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n3 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n3;
                        }
                        this.breakPos = blockPos.add(-3, 1, 0);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                }
            }
            else if (BlockUtil.getBlock(this._target.posX - 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockPistonMoving) {
                this.breakPos = blockPos.add(-1, 1, 0);
                PistonAura.mc.player.inventory.currentItem = n5;
                PistonAura.mc.playerController.updateController();
                PistonAura.mc.player.swingArm(EnumHand.MAIN_HAND);
                PistonAura.mc.playerController.onPlayerDamageBlock(this.breakPos, EnumFacing.DOWN);
                if (entity2 != null) {
                    PistonAura.mc.player.connection.sendPacket((Packet)new CPacketUseEntity(entity2));
                }
            }
            else if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ - 1.0) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ - 1.0) instanceof BlockAir && BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ - 1.0) instanceof BlockAir && (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian) && (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 3.0, this._target.posZ + 0.0) instanceof BlockObsidian)) {
                if (!Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") && !(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian) && !Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") && !(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian) && !Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") && !(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockObsidian)) {
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ - 1.0) instanceof BlockPistonMoving) {
                        this.breakPos = blockPos.add(3, 2, -1);
                        PistonAura.mc.player.inventory.currentItem = n5;
                        PistonAura.mc.playerController.updateController();
                        PistonAura.mc.player.swingArm(EnumHand.MAIN_HAND);
                        PistonAura.mc.playerController.onPlayerDamageBlock(this.breakPos, EnumFacing.DOWN);
                        if (entity2 != null) {
                            PistonAura.mc.player.connection.sendPacket((Packet)new CPacketUseEntity(entity2));
                        }
                    }
                }
                else if (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockObsidian) {
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 0.0, this._target.posZ - 1.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(1, 0, -1);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 0.0, this._target.posZ - 1.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(2, 0, -1);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ - 1.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(1, 1, -1);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ - 1.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n4 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n4;
                        }
                        this.breakPos = blockPos.add(2, 1, -1);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ - 1.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n2 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n2;
                        }
                        this.breakPos = blockPos.add(2, 2, -1);
                        this.breakPos1 = blockPos.add(0, 1, 0);
                        final float[] fArray = MathUtil.calcAngle(new Vec3d((Vec3i)this.breakPos), new Vec3d((Vec3i)this.breakPos1));
                        PistonAura.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] + 180.0f, fArray[1], true));
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ - 1.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n != 999) {
                            PistonAura.mc.player.inventory.currentItem = n;
                        }
                        this.breakPos = blockPos.add(1, 2, -1);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, (PistonAura.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                        this.placedCrystal = true;
                    }
                    if (BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ - 1.0) instanceof BlockAir) {
                        final int n6 = PistonAura.mc.player.inventory.currentItem;
                        if (n3 != 999) {
                            PistonAura.mc.player.inventory.currentItem = n3;
                        }
                        this.breakPos = blockPos.add(3, 2, -1);
                        PistonAura.mc.playerController.updateController();
                        PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                        PistonAura.mc.player.inventory.currentItem = n6;
                    }
                }
            }
        }
        else if (Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ + 1.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ + 1.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockObsidian || Objects.requireNonNull(BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ + 1.0).getRegistryName()).toString().toLowerCase().contains("bedrock") || BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ + 1.0) instanceof BlockObsidian) {
            if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 0.0, this._target.posZ + 0.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(1, 0, 0);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 0.0, this._target.posZ + 0.0) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(2, 0, 0);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(2, 1, 0);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 1.0, this._target.posZ) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n4 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n4;
                }
                this.breakPos = blockPos.add(1, 1, 0);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 2.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n2 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n2;
                }
                this.breakPos = blockPos.add(2, 2, 0);
                this.breakPos1 = blockPos.add(0, 2, 0);
                final float[] fArray = MathUtil.calcAngle(new Vec3d((Vec3i)this.breakPos), new Vec3d((Vec3i)this.breakPos1));
                PistonAura.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] + 180.0f, fArray[1], true));
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
            if (BlockUtil.getBlock(this._target.posX + 1.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n != 999) {
                    PistonAura.mc.player.inventory.currentItem = n;
                }
                this.breakPos = blockPos.add(1, 2, 0);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, (PistonAura.mc.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
                this.placedCrystal = true;
            }
            if (BlockUtil.getBlock(this._target.posX + 3.0, this._target.posY + 2.0, this._target.posZ) instanceof BlockAir) {
                final int n6 = PistonAura.mc.player.inventory.currentItem;
                if (n3 != 999) {
                    PistonAura.mc.player.inventory.currentItem = n3;
                }
                this.breakPos = blockPos.add(3, 2, 0);
                PistonAura.mc.playerController.updateController();
                PlacementUtil.place(this.breakPos, EnumHand.MAIN_HAND, this.rotate.getValue());
                PistonAura.mc.player.inventory.currentItem = n6;
            }
        }
    }
}
