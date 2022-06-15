//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import me.alpha432.stay.util.delegate.*;
import kotlin.ranges.*;
import me.alpha432.stay.util.graphics.animations.*;
import kotlin.jvm.functions.*;
import me.alpha432.stay.event.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.inventory.*;
import java.util.function.*;
import net.minecraft.item.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.client.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import java.util.*;
import me.alpha432.stay.manager.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0011\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u001e" }, d2 = { "Lme/alpha432/stay/features/modules/render/TargetHud;", "Lme/alpha432/stay/features/modules/Module;", "()V", "backgroundAlpha", "", "getBackgroundAlpha", "()I", "backgroundAlpha$delegate", "Lme/alpha432/stay/util/delegate/Value;", "currentTarget", "Lnet/minecraft/entity/EntityLivingBase;", "mode", "Lme/alpha432/stay/features/modules/render/TargetHud$Modes;", "getMode", "()Lme/alpha432/stay/features/modules/render/TargetHud$Modes;", "mode$delegate", "x", "getX", "x$delegate", "y", "getY", "y$delegate", "applyAsDouble", "", "entityLivingBase", "checkIsNotPlayer", "", "entity", "Lnet/minecraft/entity/Entity;", "Modes", "Stay" })
public final class TargetHud extends Module
{
    @NotNull
    public static final TargetHud INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value mode$delegate;
    @NotNull
    private static final Value x$delegate;
    @NotNull
    private static final Value y$delegate;
    @NotNull
    private static final Value backgroundAlpha$delegate;
    @Nullable
    private static EntityLivingBase currentTarget;
    
    private TargetHud() {
        super("TargetHud", "description", Module.Category.VISUAL, true, false, false);
    }
    
    private final Modes getMode() {
        return TargetHud.mode$delegate.getValue(this, TargetHud.$$delegatedProperties[0]);
    }
    
    private final int getX() {
        return TargetHud.x$delegate.getValue(this, TargetHud.$$delegatedProperties[1]).intValue();
    }
    
    private final int getY() {
        return TargetHud.y$delegate.getValue(this, TargetHud.$$delegatedProperties[2]).intValue();
    }
    
    private final int getBackgroundAlpha() {
        return TargetHud.backgroundAlpha$delegate.getValue(this, TargetHud.$$delegatedProperties[3]).intValue();
    }
    
    private final double applyAsDouble(final EntityLivingBase entityLivingBase) {
        return entityLivingBase.getDistance((Entity)Module.mc.player);
    }
    
    private final boolean checkIsNotPlayer(final Entity entity) {
        return !Intrinsics.areEqual((Object)entity, (Object)Module.mc.player);
    }
    
    public static final /* synthetic */ EntityLivingBase access$getCurrentTarget$p() {
        return TargetHud.currentTarget;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TargetHud.class, "mode", "getMode()Lme/alpha432/stay/features/modules/render/TargetHud$Modes;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TargetHud.class, "x", "getX()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TargetHud.class, "y", "getY()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TargetHud.class, "backgroundAlpha", "getBackgroundAlpha()I", 0)) };
        INSTANCE = new TargetHud();
        mode$delegate = SettingsKt.setting(TargetHud.INSTANCE, "Mode", Modes.NOVOLINEOLD);
        x$delegate = SettingsKt.setting(TargetHud.INSTANCE, "X", 50, new IntRange(0, 2000));
        y$delegate = SettingsKt.setting(TargetHud.INSTANCE, "Y", 50, new IntRange(0, 2000));
        backgroundAlpha$delegate = SettingsKt.setting(TargetHud.INSTANCE, "Alpha", 80, new IntRange(0, 255));
        TargetHud.currentTarget = (EntityLivingBase)Module.mc.player;
        TargetHud.INSTANCE.onTick((Function0)TargetHud$1.INSTANCE);
        final AnimationFlag animationFlag = new AnimationFlag(Easing.OUT_QUINT, 700.0f);
        TargetHud.INSTANCE.onRender2D((Function1)new Function1<Render2DEvent, Unit>() {
            public final void invoke(final Render2DEvent it) {
                if (Module.fullNullCheck()) {
                    return;
                }
                final EntityLivingBase access$getCurrentTarget$p = TargetHud.access$getCurrentTarget$p();
                if (access$getCurrentTarget$p != null) {
                    final EntityLivingBase entityLivingBase = access$getCurrentTarget$p;
                    final AnimationFlag $animationFlag = animationFlag;
                    final EntityLivingBase target = entityLivingBase;
                    final int n = 0;
                    if (WhenMappings.$EnumSwitchMapping$0[TargetHud.INSTANCE.getMode().ordinal()] == 1) {
                        final FontRenderer fr = Module.mc.fontRenderer;
                        final int color = (target.getHealth() / target.getMaxHealth() > 0.66f) ? -16711936 : ((target.getHealth() / target.getMaxHealth() > 0.33f) ? -26368 : -65536);
                        GlStateManager.color(1.0f, 1.0f, 1.0f);
                        GuiInventory.drawEntityOnScreen(TargetHud.INSTANCE.getX() + 15, TargetHud.INSTANCE.getY() + 32, 15, 1.0f, 1.0f, target);
                        final List armorList = new LinkedList();
                        final List _armorList = new LinkedList();
                        target.getArmorInventoryList().forEach(TargetHud$2::invoke$lambda-1$lambda-0);
                        for (int i = _armorList.size() - 1; i >= 0; --i) {
                            armorList.add(_armorList.get(i));
                        }
                        int armorSize = 0;
                        switch (armorList.size()) {
                            case 0: {
                                if (!target.getHeldItemMainhand().isEmpty() && !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 28, TargetHud.INSTANCE.getY() + 18);
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemOffhand(), TargetHud.INSTANCE.getX() + 43, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 45;
                                    break;
                                }
                                if (!target.getHeldItemMainhand().isEmpty() || !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand().isEmpty() ? target.getHeldItemOffhand() : target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 28, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 30;
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                armorSize = 15;
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(0), TargetHud.INSTANCE.getX() + 28, TargetHud.INSTANCE.getY() + 18);
                                if (!target.getHeldItemMainhand().isEmpty() && !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 43, TargetHud.INSTANCE.getY() + 18);
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemOffhand(), TargetHud.INSTANCE.getX() + 58, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 45;
                                    break;
                                }
                                if (!target.getHeldItemMainhand().isEmpty() || !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand().isEmpty() ? target.getHeldItemOffhand() : target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 43, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 30;
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                armorSize = 30;
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(0), TargetHud.INSTANCE.getX() + 28, TargetHud.INSTANCE.getY() + 18);
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(1), TargetHud.INSTANCE.getX() + 43, TargetHud.INSTANCE.getY() + 18);
                                if (!target.getHeldItemMainhand().isEmpty() && !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 58, TargetHud.INSTANCE.getY() + 18);
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemOffhand(), TargetHud.INSTANCE.getX() + 73, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 45;
                                    break;
                                }
                                if (!target.getHeldItemMainhand().isEmpty() || !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand().isEmpty() ? target.getHeldItemOffhand() : target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 58, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 30;
                                    break;
                                }
                                break;
                            }
                            case 3: {
                                armorSize = 45;
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(0), TargetHud.INSTANCE.getX() + 28, TargetHud.INSTANCE.getY() + 18);
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(1), TargetHud.INSTANCE.getX() + 43, TargetHud.INSTANCE.getY() + 18);
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(2), TargetHud.INSTANCE.getX() + 58, TargetHud.INSTANCE.getY() + 18);
                                if (!target.getHeldItemMainhand().isEmpty() && !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 73, TargetHud.INSTANCE.getY() + 18);
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemOffhand(), TargetHud.INSTANCE.getX() + 98, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 45;
                                    break;
                                }
                                if (!target.getHeldItemMainhand().isEmpty() || !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand().isEmpty() ? target.getHeldItemOffhand() : target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 73, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 30;
                                    break;
                                }
                                break;
                            }
                            case 4: {
                                armorSize = 60;
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(0), TargetHud.INSTANCE.getX() + 28, TargetHud.INSTANCE.getY() + 18);
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(1), TargetHud.INSTANCE.getX() + 43, TargetHud.INSTANCE.getY() + 18);
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(2), TargetHud.INSTANCE.getX() + 58, TargetHud.INSTANCE.getY() + 18);
                                Module.mc.getRenderItem().renderItemAndEffectIntoGUI((ItemStack)armorList.get(3), TargetHud.INSTANCE.getX() + 73, TargetHud.INSTANCE.getY() + 18);
                                if (!target.getHeldItemMainhand().isEmpty() && !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 98, TargetHud.INSTANCE.getY() + 18);
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemOffhand(), TargetHud.INSTANCE.getX() + 113, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 45;
                                    break;
                                }
                                if (!target.getHeldItemMainhand().isEmpty() || !target.getHeldItemOffhand().isEmpty()) {
                                    Module.mc.getRenderItem().renderItemAndEffectIntoGUI(target.getHeldItemMainhand().isEmpty() ? target.getHeldItemOffhand() : target.getHeldItemMainhand(), TargetHud.INSTANCE.getX() + 98, TargetHud.INSTANCE.getY() + 18);
                                    armorSize += 30;
                                    break;
                                }
                                break;
                            }
                        }
                        int backgroundStopY = TargetHud.INSTANCE.getY() + 35;
                        final ModuleManager moduleManager = Stay.moduleManager;
                        Intrinsics.checkNotNull((Object)moduleManager);
                        final int stringWidth = moduleManager.isModuleEnabled(FontMod.class) ? (fr.getStringWidth(target.getName()) + 10) : (fr.getStringWidth(target.getName()) + 30);
                        int backgroundStopX = (fr.getStringWidth(target.getName()) > armorSize) ? (TargetHud.INSTANCE.getX() + stringWidth) : (TargetHud.INSTANCE.getX() + armorSize + 30);
                        backgroundStopX += 5;
                        backgroundStopY += 5;
                        Gui.drawRect(TargetHud.INSTANCE.getX() - 2, TargetHud.INSTANCE.getY(), backgroundStopX, backgroundStopY, new Color(0, 0, 0, TargetHud.INSTANCE.getBackgroundAlpha()).getRGB());
                        final int healthBarLength = (int)$animationFlag.getAndUpdate(target.getHealth() / target.getMaxHealth() * (backgroundStopX - TargetHud.INSTANCE.getX()));
                        Gui.drawRect(TargetHud.INSTANCE.getX() - 2, backgroundStopY - 2, TargetHud.INSTANCE.getX() + healthBarLength, backgroundStopY, new Color(color).darker().getRGB());
                        Gui.drawRect(TargetHud.INSTANCE.getX() - 2, backgroundStopY - 2, (int)(TargetHud.INSTANCE.getX() + target.getHealth() / target.getMaxHealth() * (backgroundStopX - TargetHud.INSTANCE.getX())), backgroundStopY, color);
                        fr.drawString(target.getName(), (float)(TargetHud.INSTANCE.getX() + 30), (float)(TargetHud.INSTANCE.getY() + 8), new Color(255, 255, 255).getRGB(), true);
                    }
                }
            }
            
            private static final void invoke$lambda-1$lambda-0(final List $_armorList, final ItemStack itemStack) {
                Intrinsics.checkNotNullParameter((Object)$_armorList, "$_armorList");
                Intrinsics.checkNotNullParameter((Object)itemStack, "itemStack");
                if (!itemStack.isEmpty()) {
                    $_armorList.add(itemStack);
                }
            }
        });
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004" }, d2 = { "Lme/alpha432/stay/features/modules/render/TargetHud$Modes;", "", "(Ljava/lang/String;I)V", "NOVOLINEOLD", "Stay" })
    public enum Modes
    {
        NOVOLINEOLD;
        
        private static final /* synthetic */ Modes[] $values() {
            return new Modes[] { Modes.NOVOLINEOLD };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
