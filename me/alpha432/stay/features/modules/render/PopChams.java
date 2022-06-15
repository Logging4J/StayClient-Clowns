//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import kotlin.reflect.*;
import net.minecraft.client.entity.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.event.*;
import net.minecraft.network.play.server.*;
import net.minecraft.world.*;
import com.mojang.authlib.*;
import kotlin.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import me.alpha432.stay.util.delegate.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u001a\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020EH\u0002J \u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020E2\u0006\u0010K\u001a\u00020E2\u0006\u0010H\u001a\u00020EH\u0002J\u0018\u0010L\u001a\u00020C2\u0006\u0010B\u001a\u00020C2\u0006\u0010M\u001a\u00020\u0004H\u0002J \u0010N\u001a\u00020\r2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\rH\u0002J\u0010\u0010R\u001a\u00020A2\u0006\u0010S\u001a\u00020TH\u0007J\u0010\u0010U\u001a\u00020A2\u0006\u0010S\u001a\u00020VH\u0007J\u0010\u0010W\u001a\u00020A2\u0006\u0010X\u001a\u00020GH\u0002J\u0018\u0010Y\u001a\u00020E2\u0006\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020EH\u0002J(\u0010\\\u001a\u00020A2\b\u0010]\u001a\u0004\u0018\u00010G2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\r2\u0006\u0010`\u001a\u00020\rJH\u0010a\u001a\u00020A2\u0006\u0010Z\u001a\u00020G2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020E2\u0006\u0010e\u001a\u00020E2\u0006\u0010f\u001a\u00020E2\u0006\u0010g\u001a\u00020E2\u0006\u0010h\u001a\u00020E2\u0006\u0010[\u001a\u00020EH\u0002J \u0010i\u001a\u00020A2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\r2\u0006\u0010`\u001a\u00020\rH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\u001b\u0010\u0015\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R\u001b\u0010\u0018\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b \u0010\u0006R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00101\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b2\u0010\u0006R\u001b\u00104\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\b\u001a\u0004\b5\u0010\u0006R\u001b\u00107\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b8\u0010'R\u001b\u0010:\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b;\u0010'R\u0012\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0004\n\u0002\u0010?¨\u0006j" }, d2 = { "Lme/alpha432/stay/features/modules/render/PopChams;", "Lme/alpha432/stay/features/modules/Module;", "()V", "aF", "", "getAF", "()I", "aF$delegate", "Lme/alpha432/stay/util/delegate/Value;", "aL", "getAL", "aL$delegate", "alphaFill", "", "alphaLine", "bF", "getBF", "bF$delegate", "bL", "getBL", "bL$delegate", "fadeStart", "getFadeStart", "fadeStart$delegate", "fadeTime", "getFadeTime", "()D", "fadeTime$delegate", "gF", "getGF", "gF$delegate", "gL", "getGL", "gL$delegate", "lock", "", "onlyOneEsp", "", "getOnlyOneEsp", "()Z", "onlyOneEsp$delegate", "player", "Lnet/minecraft/client/entity/EntityOtherPlayerMP;", "getPlayer", "()Lnet/minecraft/client/entity/EntityOtherPlayerMP;", "setPlayer", "(Lnet/minecraft/client/entity/EntityOtherPlayerMP;)V", "playerModel", "Lnet/minecraft/client/model/ModelPlayer;", "rF", "getRF", "rF$delegate", "rL", "getRL", "rL$delegate", "rainbow", "getRainbow", "rainbow$delegate", "self", "getSelf", "self$delegate", "startTime", "", "Ljava/lang/Long;", "glColor", "", "color", "Ljava/awt/Color;", "handleRotationFloat", "", "livingBase", "Lnet/minecraft/entity/EntityLivingBase;", "partialTicks", "interpolateRotation", "prevYawOffset", "yawOffset", "newAlpha", "alpha", "normalize", "value", "min", "max", "onPacketReceive", "event", "Lme/alpha432/stay/event/PacketEvent$Receive;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "prepareRotations", "entityLivingBase", "prepareScale", "entity", "scale", "prepareTranslate", "entityIn", "x", "y", "z", "renderEntity", "modelBase", "Lnet/minecraft/client/model/ModelBase;", "limbSwing", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "renderLivingAt", "Stay" })
public final class PopChams extends Module
{
    @NotNull
    public static final PopChams INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value self$delegate;
    @NotNull
    private static final Value rL$delegate;
    @NotNull
    private static final Value gL$delegate;
    @NotNull
    private static final Value bL$delegate;
    @NotNull
    private static final Value aL$delegate;
    @NotNull
    private static final Value rF$delegate;
    @NotNull
    private static final Value gF$delegate;
    @NotNull
    private static final Value bF$delegate;
    @NotNull
    private static final Value aF$delegate;
    @NotNull
    private static final Value fadeStart$delegate;
    @NotNull
    private static final Value fadeTime$delegate;
    @NotNull
    private static final Value onlyOneEsp$delegate;
    @NotNull
    private static final Value rainbow$delegate;
    @Nullable
    private static EntityOtherPlayerMP player;
    @Nullable
    private static ModelPlayer playerModel;
    @Nullable
    private static Long startTime;
    private static double alphaFill;
    private static double alphaLine;
    @NotNull
    private static final Object lock;
    
    private PopChams() {
        super("PopChams", "", Module.Category.VISUAL, true, false, false);
    }
    
    private final boolean getSelf() {
        return PopChams.self$delegate.getValue(this, PopChams.$$delegatedProperties[0]);
    }
    
    private final int getRL() {
        return PopChams.rL$delegate.getValue(this, PopChams.$$delegatedProperties[1]).intValue();
    }
    
    private final int getGL() {
        return PopChams.gL$delegate.getValue(this, PopChams.$$delegatedProperties[2]).intValue();
    }
    
    private final int getBL() {
        return PopChams.bL$delegate.getValue(this, PopChams.$$delegatedProperties[3]).intValue();
    }
    
    private final int getAL() {
        return PopChams.aL$delegate.getValue(this, PopChams.$$delegatedProperties[4]).intValue();
    }
    
    private final int getRF() {
        return PopChams.rF$delegate.getValue(this, PopChams.$$delegatedProperties[5]).intValue();
    }
    
    private final int getGF() {
        return PopChams.gF$delegate.getValue(this, PopChams.$$delegatedProperties[6]).intValue();
    }
    
    private final int getBF() {
        return PopChams.bF$delegate.getValue(this, PopChams.$$delegatedProperties[7]).intValue();
    }
    
    private final int getAF() {
        return PopChams.aF$delegate.getValue(this, PopChams.$$delegatedProperties[8]).intValue();
    }
    
    private final int getFadeStart() {
        return PopChams.fadeStart$delegate.getValue(this, PopChams.$$delegatedProperties[9]).intValue();
    }
    
    private final double getFadeTime() {
        return PopChams.fadeTime$delegate.getValue(this, PopChams.$$delegatedProperties[10]).doubleValue();
    }
    
    private final boolean getOnlyOneEsp() {
        return PopChams.onlyOneEsp$delegate.getValue(this, PopChams.$$delegatedProperties[11]);
    }
    
    public final boolean getRainbow() {
        return PopChams.rainbow$delegate.getValue(this, PopChams.$$delegatedProperties[12]);
    }
    
    @Nullable
    public final EntityOtherPlayerMP getPlayer() {
        return PopChams.player;
    }
    
    public final void setPlayer(@Nullable final EntityOtherPlayerMP <set-?>) {
        PopChams.player = <set-?>;
    }
    
    @SubscribeEvent
    public final void onPacketReceive(@NotNull final PacketEvent.Receive event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (event.getPacket() instanceof SPacketEntityStatus) {
            final Packet packet = event.getPacket();
            if (((SPacketEntityStatus)packet).getOpCode() == 35 && (this.getSelf() || ((SPacketEntityStatus)packet).getEntity((World)Module.mc.world).getEntityId() != Module.mc.player.getEntityId())) {
                final GameProfile profile = new GameProfile(Module.mc.player.getUniqueID(), "");
                final EntityOtherPlayerMP it = new EntityOtherPlayerMP((World)Module.mc.world, profile);
                final int n = 0;
                PopChams.INSTANCE.setPlayer(it);
                it.copyLocationAndAnglesFrom(((SPacketEntityStatus)packet).getEntity((World)Module.mc.world));
                PopChams.playerModel = new ModelPlayer(0.0f, false);
                PopChams.startTime = System.currentTimeMillis();
                synchronized (PopChams.lock) {
                    final int n2 = 0;
                    if (PopChams.playerModel != null) {
                        final ModelPlayer playerModel2 = PopChams.playerModel;
                        if (playerModel2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.model.ModelPlayer");
                        }
                        final ModelPlayer playerModel1 = playerModel2;
                        playerModel1.bipedHead.showModel = false;
                        playerModel1.bipedBody.showModel = false;
                        playerModel1.bipedLeftArmwear.showModel = false;
                        playerModel1.bipedLeftLegwear.showModel = false;
                        playerModel1.bipedRightArmwear.showModel = false;
                        playerModel1.bipedRightLegwear.showModel = false;
                        final PopChams instance = PopChams.INSTANCE;
                        PopChams.alphaFill = PopChams.INSTANCE.getAF();
                        final PopChams instance2 = PopChams.INSTANCE;
                        PopChams.alphaLine = PopChams.INSTANCE.getAL();
                    }
                    final Unit instance3 = Unit.INSTANCE;
                }
            }
        }
    }
    
    @SubscribeEvent
    public final void onRenderWorld(@NotNull final RenderWorldLastEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (this.getOnlyOneEsp()) {
            if (PopChams.player == null || Module.mc.world == null || Module.mc.player == null) {
                return;
            }
            GL11.glLineWidth(1.0f);
            final Color lineColorS = new Color(this.getRL(), this.getBL(), this.getGL(), this.getAL());
            final Color fillColorS = new Color(this.getRF(), this.getBF(), this.getGF(), this.getAF());
            int lineA = lineColorS.getAlpha();
            int fillA = fillColorS.getAlpha();
            final long currentTimeMillis = System.currentTimeMillis();
            final Long startTime = PopChams.startTime;
            Intrinsics.checkNotNull((Object)startTime);
            final long time = currentTimeMillis - startTime - this.getFadeStart();
            final long currentTimeMillis2 = System.currentTimeMillis();
            final Long startTime2 = PopChams.startTime;
            Intrinsics.checkNotNull((Object)startTime2);
            if (currentTimeMillis2 - startTime2 > this.getFadeStart()) {
                double normal = this.normalize((double)time, 0.0, this.getFadeTime());
                normal = MathHelper.clamp(normal, 0.0, 1.0);
                normal = -normal + 1.0;
                lineA *= (int)normal;
                fillA *= (int)normal;
            }
            final Color lineColor = this.newAlpha(lineColorS, lineA);
            final Color fillColor = this.newAlpha(fillColorS, fillA);
            if (PopChams.player != null && PopChams.playerModel != null) {
                final EntityOtherPlayerMP player2 = PopChams.player;
                Intrinsics.checkNotNull((Object)player2);
                final EntityOtherPlayerMP player1 = player2;
                final ModelPlayer playerModel2 = PopChams.playerModel;
                Intrinsics.checkNotNull((Object)playerModel2);
                final ModelPlayer playerModel1 = playerModel2;
                StayTessellator.INSTANCE.prepareGL();
                GL11.glPushAttrib(1048575);
                GL11.glEnable(2881);
                GL11.glEnable(2848);
                if (PopChams.alphaFill > 1.0) {
                    PopChams.alphaFill -= this.getFadeTime();
                }
                final Color fillFinal = new Color(fillColor.getRed(), fillColor.getGreen(), fillColor.getBlue(), (int)PopChams.alphaFill);
                if (PopChams.alphaLine > 1.0) {
                    PopChams.alphaLine -= this.getFadeTime();
                }
                final Color outlineFinal = new Color(lineColor.getRed(), lineColor.getGreen(), lineColor.getBlue(), (int)PopChams.alphaLine);
                this.glColor(fillFinal);
                GL11.glPolygonMode(1032, 6914);
                this.renderEntity((EntityLivingBase)player1, (ModelBase)playerModel1, player1.limbSwing, player1.limbSwingAmount, (float)player1.ticksExisted, player1.rotationYawHead, player1.rotationPitch, 1.0f);
                this.glColor(outlineFinal);
                GL11.glPolygonMode(1032, 6913);
                this.renderEntity((EntityLivingBase)player1, (ModelBase)playerModel1, player1.limbSwing, player1.limbSwingAmount, (float)player1.ticksExisted, player1.rotationYawHead, player1.rotationPitch, 1.0f);
                GL11.glPolygonMode(1032, 6914);
                GL11.glPopAttrib();
                StayTessellator.INSTANCE.releaseGL();
            }
        }
    }
    
    private final double normalize(final double value, final double min, final double max) {
        return (value - min) / (max - min);
    }
    
    private final void renderEntity(final EntityLivingBase entity, final ModelBase modelBase, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        final Minecraft mc = Module.mc;
        if (((mc == null) ? null : mc.getRenderManager()) != null) {
            final float partialTicks = Module.mc.getRenderPartialTicks();
            final double x = entity.posX - Module.mc.getRenderManager().viewerPosX;
            double y = entity.posY - Module.mc.getRenderManager().viewerPosY;
            final double z = entity.posZ - Module.mc.getRenderManager().viewerPosZ;
            GlStateManager.pushMatrix();
            if (entity.isSneaking()) {
                y -= 0.125;
            }
            final float interpolateRotation = this.interpolateRotation(entity.prevRenderYawOffset, entity.renderYawOffset, partialTicks);
            final float interpolateRotation2 = this.interpolateRotation(entity.prevRotationYawHead, entity.rotationYawHead, partialTicks);
            this.renderLivingAt(x, y, z);
            final float f8 = this.handleRotationFloat(entity, partialTicks);
            this.prepareRotations(entity);
            final float f9 = this.prepareScale(entity, scale);
            GlStateManager.enableAlpha();
            modelBase.setLivingAnimations(entity, limbSwing, limbSwingAmount, partialTicks);
            modelBase.setRotationAngles(limbSwing, limbSwingAmount, f8, entity.rotationYaw, entity.rotationPitch, f9, (Entity)entity);
            modelBase.render((Entity)entity, limbSwing, limbSwingAmount, f8, entity.rotationYaw, entity.rotationPitch, f9);
            GlStateManager.popMatrix();
        }
    }
    
    public final void prepareTranslate(@Nullable final EntityLivingBase entityIn, final double x, final double y, final double z) {
        this.renderLivingAt(x - Module.mc.getRenderManager().viewerPosX, y - Module.mc.getRenderManager().viewerPosY, z - Module.mc.getRenderManager().viewerPosZ);
    }
    
    private final void renderLivingAt(final double x, final double y, final double z) {
        GlStateManager.translate((float)x, (float)y, (float)z);
    }
    
    private final float prepareScale(final EntityLivingBase entity, final float scale) {
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0f, -1.0f, 1.0f);
        final double widthX = entity.getRenderBoundingBox().maxX - entity.getRenderBoundingBox().minX;
        final double widthZ = entity.getRenderBoundingBox().maxZ - entity.getRenderBoundingBox().minZ;
        GlStateManager.scale(scale + widthX, (double)(scale * entity.height), scale + widthZ);
        final float f = 0.0625f;
        GlStateManager.translate(0.0f, -1.501f, 0.0f);
        return 0.0625f;
    }
    
    private final void prepareRotations(final EntityLivingBase entityLivingBase) {
        GlStateManager.rotate(180.0f - entityLivingBase.rotationYaw, 0.0f, 1.0f, 0.0f);
    }
    
    private final float interpolateRotation(final float prevYawOffset, final float yawOffset, final float partialTicks) {
        float f;
        for (f = yawOffset - prevYawOffset; f < -180.0f; f += 360.0f) {}
        while (f >= 180.0f) {
            f -= 360.0f;
        }
        return prevYawOffset + partialTicks * f;
    }
    
    private final Color newAlpha(final Color color, final int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }
    
    private final void glColor(final Color color) {
        GL11.glColor4f(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f);
    }
    
    private final float handleRotationFloat(final EntityLivingBase livingBase, final float partialTicks) {
        return 0.0f;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "self", "getSelf()Z", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "rL", "getRL()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "gL", "getGL()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "bL", "getBL()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "aL", "getAL()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "rF", "getRF()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "gF", "getGF()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "bF", "getBF()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "aF", "getAF()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "fadeStart", "getFadeStart()I", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "fadeTime", "getFadeTime()D", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "onlyOneEsp", "getOnlyOneEsp()Z", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)PopChams.class, "rainbow", "getRainbow()Z", 0)) };
        INSTANCE = new PopChams();
        self$delegate = SettingsKt.setting(PopChams.INSTANCE, "Self", false);
        rL$delegate = SettingsKt.setting(PopChams.INSTANCE, "RedLine", 255, 0, 255);
        gL$delegate = SettingsKt.setting(PopChams.INSTANCE, "GreenLine", 26, 0, 255);
        bL$delegate = SettingsKt.setting(PopChams.INSTANCE, "BlueLine", 42, 0, 255);
        aL$delegate = SettingsKt.setting(PopChams.INSTANCE, "AlphaLine", 42, 0, 255);
        rF$delegate = SettingsKt.setting(PopChams.INSTANCE, "RedFill", 255, 0, 255);
        gF$delegate = SettingsKt.setting(PopChams.INSTANCE, "GreenFill", 26, 0, 255);
        bF$delegate = SettingsKt.setting(PopChams.INSTANCE, "BlueFill", 42, 0, 255);
        aF$delegate = SettingsKt.setting(PopChams.INSTANCE, "AlphaFill", 42, 0, 255);
        fadeStart$delegate = SettingsKt.setting(PopChams.INSTANCE, "FadeStart", 200, 0, 3000);
        fadeTime$delegate = SettingsKt.setting(PopChams.INSTANCE, "FadeStart", 0.5, 0.0, 2.0);
        onlyOneEsp$delegate = SettingsKt.setting(PopChams.INSTANCE, "OnlyOneEsp", true);
        rainbow$delegate = SettingsKt.setting(PopChams.INSTANCE, "Rainbow", false);
        lock = new Object();
    }
}
