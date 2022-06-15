//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.entity.*;
import kotlin.jvm.internal.*;
import cakeslayers.team.eventsystem.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.*;
import net.minecraft.client.model.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\r\u000e¨\u0006\u000f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent;", "Lcakeslayers/team/eventsystem/Event;", "Lcakeslayers/team/eventsystem/Cancellable;", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "getEntity", "()Lnet/minecraft/entity/Entity;", "render", "", "All", "Companion", "Model", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model;", "Stay" })
public abstract class RenderEntityEvent extends Cancellable implements Event
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Entity entity;
    private static boolean renderingEntities;
    
    private RenderEntityEvent(final Entity entity) {
        this.entity = entity;
    }
    
    @NotNull
    public final Entity getEntity() {
        return this.entity;
    }
    
    public abstract void render();
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    public static final boolean getRenderingEntities() {
        return RenderEntityEvent.Companion.getRenderingEntities();
    }
    
    public static final void setRenderingEntities(final boolean <set-?>) {
        RenderEntityEvent.Companion.setRenderingEntities(<set-?>);
    }
    
    public static final /* synthetic */ boolean access$getRenderingEntities$cp() {
        return RenderEntityEvent.renderingEntities;
    }
    
    public static final /* synthetic */ void access$setRenderingEntities$cp(final boolean <set-?>) {
        RenderEntityEvent.renderingEntities = <set-?>;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010BE\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u0010\rJ\b\u0010\u000b\u001a\u00020\u000eH\u0016R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "render", "Lnet/minecraft/client/renderer/entity/Render;", "(Lnet/minecraft/entity/Entity;DDDFFLnet/minecraft/client/renderer/entity/Render;)V", "", "Post", "Pre", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All$Pre;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All$Post;", "Stay" })
    public abstract static class All extends RenderEntityEvent
    {
        private final double x;
        private final double y;
        private final double z;
        private final float yaw;
        private final float partialTicks;
        @NotNull
        private final Render<Entity> render;
        
        private All(final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, final Render<Entity> render) {
            super(entity, null);
            this.x = x;
            this.y = y;
            this.z = z;
            this.yaw = yaw;
            this.partialTicks = partialTicks;
            this.render = render;
        }
        
        @Override
        public void render() {
            this.render.doRender(this.getEntity(), this.x, this.y, this.z, this.yaw, this.partialTicks);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All$Pre;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All;", "Lcakeslayers/team/eventsystem/IEventPosting;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "render", "Lnet/minecraft/client/renderer/entity/Render;", "(Lnet/minecraft/entity/Entity;DDDFFLnet/minecraft/client/renderer/entity/Render;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Companion", "Stay" })
        public static final class Pre extends All implements IEventPosting
        {
            @NotNull
            public static final Companion Companion;
            private final /* synthetic */ Companion $$delegate_0;
            
            public Pre(@NotNull final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, @NotNull final Render<Entity> render) {
                Intrinsics.checkNotNullParameter((Object)entity, "entity");
                Intrinsics.checkNotNullParameter((Object)render, "render");
                super(entity, x, y, z, yaw, partialTicks, render, null);
                this.$$delegate_0 = Pre.Companion;
            }
            
            @NotNull
            public EventBus getEventBus() {
                return this.$$delegate_0.getEventBus();
            }
            
            public void post(@NotNull final Object event) {
                Intrinsics.checkNotNullParameter(event, "event");
                this.$$delegate_0.post(event);
            }
            
            static {
                Companion = new Companion(null);
            }
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All$Pre$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
            public static final class Companion extends EventBus
            {
                private Companion() {
                }
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All$Post;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All;", "Lcakeslayers/team/eventsystem/IEventPosting;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "render", "Lnet/minecraft/client/renderer/entity/Render;", "(Lnet/minecraft/entity/Entity;DDDFFLnet/minecraft/client/renderer/entity/Render;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Companion", "Stay" })
        public static final class Post extends All implements IEventPosting
        {
            @NotNull
            public static final Companion Companion;
            private final /* synthetic */ Companion $$delegate_0;
            
            public Post(@NotNull final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, @NotNull final Render<Entity> render) {
                Intrinsics.checkNotNullParameter((Object)entity, "entity");
                Intrinsics.checkNotNullParameter((Object)render, "render");
                super(entity, x, y, z, yaw, partialTicks, render, null);
                this.$$delegate_0 = Post.Companion;
            }
            
            @NotNull
            public EventBus getEventBus() {
                return this.$$delegate_0.getEventBus();
            }
            
            public void post(@NotNull final Object event) {
                Intrinsics.checkNotNullParameter(event, "event");
                this.$$delegate_0.post(event);
            }
            
            static {
                Companion = new Companion(null);
            }
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$All$Post$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
            public static final class Companion extends EventBus
            {
                private Companion() {
                }
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002\u000b\f¨\u0006\r" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent;", "entity", "Lnet/minecraft/entity/Entity;", "block", "Lkotlin/Function0;", "", "(Lnet/minecraft/entity/Entity;Lkotlin/jvm/functions/Function0;)V", "render", "Post", "Pre", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Pre;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Post;", "Stay" })
    public abstract static class Model extends RenderEntityEvent
    {
        @NotNull
        private final Function0<Unit> block;
        
        private Model(final Entity entity, final Function0<Unit> block) {
            super(entity, null);
            this.block = block;
        }
        
        @Override
        public void render() {
            this.block.invoke();
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Pre;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model;", "Lcakeslayers/team/eventsystem/IEventPosting;", "entity", "Lnet/minecraft/entity/Entity;", "block", "Lkotlin/Function0;", "", "(Lnet/minecraft/entity/Entity;Lkotlin/jvm/functions/Function0;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "event", "", "Companion", "Stay" })
        public static final class Pre extends Model implements IEventPosting
        {
            @NotNull
            public static final Companion Companion;
            private final /* synthetic */ Companion $$delegate_0;
            
            public Pre(@NotNull final Entity entity, @NotNull final Function0<Unit> block) {
                Intrinsics.checkNotNullParameter((Object)entity, "entity");
                Intrinsics.checkNotNullParameter((Object)block, "block");
                super(entity, block, null);
                this.$$delegate_0 = Pre.Companion;
            }
            
            @NotNull
            public EventBus getEventBus() {
                return this.$$delegate_0.getEventBus();
            }
            
            public void post(@NotNull final Object event) {
                Intrinsics.checkNotNullParameter(event, "event");
                this.$$delegate_0.post(event);
            }
            
            @JvmStatic
            @NotNull
            public static final Pre of(@NotNull final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, @NotNull final Render<Entity> render) {
                return Pre.Companion.of(entity, x, y, z, yaw, partialTicks, render);
            }
            
            @JvmStatic
            @NotNull
            public static final Pre of(@NotNull final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, @NotNull final ModelBase model) {
                return Pre.Companion.of(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, model);
            }
            
            static {
                Companion = new Companion(null);
            }
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u0018" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Pre$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "of", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Pre;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "render", "Lnet/minecraft/client/renderer/entity/Render;", "limbSwing", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "scaleFactor", "model", "Lnet/minecraft/client/model/ModelBase;", "Stay" })
            public static final class Companion extends EventBus
            {
                private Companion() {
                }
                
                @JvmStatic
                @NotNull
                public final Pre of(@NotNull final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, @NotNull final Render<Entity> render) {
                    Intrinsics.checkNotNullParameter((Object)entity, "entity");
                    Intrinsics.checkNotNullParameter((Object)render, "render");
                    return new Pre(entity, (Function0<Unit>)new RenderEntityEvent$Model$Pre$Companion$of.RenderEntityEvent$Model$Pre$Companion$of$1((Render)render, entity, x, y, z, yaw, partialTicks));
                }
                
                @JvmStatic
                @NotNull
                public final Pre of(@NotNull final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, @NotNull final ModelBase model) {
                    Intrinsics.checkNotNullParameter((Object)entity, "entity");
                    Intrinsics.checkNotNullParameter((Object)model, "model");
                    return new Pre(entity, (Function0<Unit>)new RenderEntityEvent$Model$Pre$Companion$of.RenderEntityEvent$Model$Pre$Companion$of$2(model, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor));
                }
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Post;", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model;", "Lcakeslayers/team/eventsystem/IEventPosting;", "entity", "Lnet/minecraft/entity/Entity;", "block", "Lkotlin/Function0;", "", "(Lnet/minecraft/entity/Entity;Lkotlin/jvm/functions/Function0;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "event", "", "Companion", "Stay" })
        public static final class Post extends Model implements IEventPosting
        {
            @NotNull
            public static final Companion Companion;
            private final /* synthetic */ Companion $$delegate_0;
            
            public Post(@NotNull final Entity entity, @NotNull final Function0<Unit> block) {
                Intrinsics.checkNotNullParameter((Object)entity, "entity");
                Intrinsics.checkNotNullParameter((Object)block, "block");
                super(entity, block, null);
                this.$$delegate_0 = Post.Companion;
            }
            
            @NotNull
            public EventBus getEventBus() {
                return this.$$delegate_0.getEventBus();
            }
            
            public void post(@NotNull final Object event) {
                Intrinsics.checkNotNullParameter(event, "event");
                this.$$delegate_0.post(event);
            }
            
            @JvmStatic
            @NotNull
            public static final Post of(@NotNull final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, @NotNull final Render<Entity> render) {
                return Post.Companion.of(entity, x, y, z, yaw, partialTicks, render);
            }
            
            @JvmStatic
            @NotNull
            public static final Post of(@NotNull final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, @NotNull final ModelBase model) {
                return Post.Companion.of(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, model);
            }
            
            static {
                Companion = new Companion(null);
            }
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u0018" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Post$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "of", "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Model$Post;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "render", "Lnet/minecraft/client/renderer/entity/Render;", "limbSwing", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "scaleFactor", "model", "Lnet/minecraft/client/model/ModelBase;", "Stay" })
            public static final class Companion extends EventBus
            {
                private Companion() {
                }
                
                @JvmStatic
                @NotNull
                public final Post of(@NotNull final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTicks, @NotNull final Render<Entity> render) {
                    Intrinsics.checkNotNullParameter((Object)entity, "entity");
                    Intrinsics.checkNotNullParameter((Object)render, "render");
                    return new Post(entity, (Function0<Unit>)new RenderEntityEvent$Model$Post$Companion$of.RenderEntityEvent$Model$Post$Companion$of$1((Render)render, entity, x, y, z, yaw, partialTicks));
                }
                
                @JvmStatic
                @NotNull
                public final Post of(@NotNull final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scaleFactor, @NotNull final ModelBase model) {
                    Intrinsics.checkNotNullParameter((Object)entity, "entity");
                    Intrinsics.checkNotNullParameter((Object)model, "model");
                    return new Post(entity, (Function0<Unit>)new RenderEntityEvent$Model$Post$Companion$of.RenderEntityEvent$Model$Post$Companion$of$2(model, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor));
                }
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcakeslayers/team/eventsystem/impl/RenderEntityEvent$Companion;", "", "()V", "renderingEntities", "", "getRenderingEntities$annotations", "getRenderingEntities", "()Z", "setRenderingEntities", "(Z)V", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final boolean getRenderingEntities() {
            return RenderEntityEvent.access$getRenderingEntities$cp();
        }
        
        public final void setRenderingEntities(final boolean <set-?>) {
            RenderEntityEvent.access$setRenderingEntities$cp(<set-?>);
        }
    }
}
