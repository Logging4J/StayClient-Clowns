//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import cakeslayers.team.eventsystem.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent;", "Lcakeslayers/team/eventsystem/Event;", "()V", "BlockUpdate", "Entity", "Load", "RenderUpdate", "Unload", "Lcakeslayers/team/eventsystem/impl/WorldEvent$Unload;", "Lcakeslayers/team/eventsystem/impl/WorldEvent$Load;", "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity;", "Lcakeslayers/team/eventsystem/impl/WorldEvent$BlockUpdate;", "Lcakeslayers/team/eventsystem/impl/WorldEvent$RenderUpdate;", "Stay" })
public abstract class WorldEvent implements Event
{
    private WorldEvent() {
    }
    
    public void post() {
        Event.DefaultImpls.post((Event)this);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$Unload;", "Lcakeslayers/team/eventsystem/impl/WorldEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class Unload extends WorldEvent implements IEventPosting
    {
        @NotNull
        public static final Unload INSTANCE;
        private final /* synthetic */ EventBus $$delegate_0;
        
        private Unload() {
            super(null);
            this.$$delegate_0 = new EventBus();
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
            INSTANCE = new Unload();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$Load;", "Lcakeslayers/team/eventsystem/impl/WorldEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "()V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Stay" })
    public static final class Load extends WorldEvent implements IEventPosting
    {
        @NotNull
        public static final Load INSTANCE;
        private final /* synthetic */ EventBus $$delegate_0;
        
        private Load() {
            super(null);
            this.$$delegate_0 = new EventBus();
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
            INSTANCE = new Load();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity;", "Lcakeslayers/team/eventsystem/impl/WorldEvent;", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "getEntity", "()Lnet/minecraft/entity/Entity;", "Add", "Remove", "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity$Add;", "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity$Remove;", "Stay" })
    public abstract static class Entity extends WorldEvent
    {
        @NotNull
        private final net.minecraft.entity.Entity entity;
        
        private Entity(final net.minecraft.entity.Entity entity) {
            super(null);
            this.entity = entity;
        }
        
        @NotNull
        public final net.minecraft.entity.Entity getEntity() {
            return this.entity;
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity$Add;", "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity;", "Lcakeslayers/team/eventsystem/IEventPosting;", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Companion", "Stay" })
        public static final class Add extends Entity implements IEventPosting
        {
            @NotNull
            public static final Companion Companion;
            private final /* synthetic */ Companion $$delegate_0;
            
            public Add(@NotNull final net.minecraft.entity.Entity entity) {
                Intrinsics.checkNotNullParameter((Object)entity, "entity");
                super(entity, null);
                this.$$delegate_0 = Add.Companion;
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
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity$Add$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
            public static final class Companion extends EventBus
            {
                private Companion() {
                }
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity$Remove;", "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity;", "Lcakeslayers/team/eventsystem/IEventPosting;", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "post", "", "event", "", "Companion", "Stay" })
        public static final class Remove extends Entity implements IEventPosting
        {
            @NotNull
            public static final Companion Companion;
            private final /* synthetic */ Companion $$delegate_0;
            
            public Remove(@NotNull final net.minecraft.entity.Entity entity) {
                Intrinsics.checkNotNullParameter((Object)entity, "entity");
                super(entity, null);
                this.$$delegate_0 = Remove.Companion;
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
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$Entity$Remove$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
            public static final class Companion extends EventBus
            {
                private Companion() {
                }
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$BlockUpdate;", "Lcakeslayers/team/eventsystem/impl/WorldEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "pos", "Lnet/minecraft/util/math/BlockPos;", "oldState", "Lnet/minecraft/block/state/IBlockState;", "newState", "(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "getNewState", "()Lnet/minecraft/block/state/IBlockState;", "getOldState", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "post", "", "event", "", "Companion", "Stay" })
    public static final class BlockUpdate extends WorldEvent implements IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final BlockPos pos;
        @NotNull
        private final IBlockState oldState;
        @NotNull
        private final IBlockState newState;
        private final /* synthetic */ Companion $$delegate_0;
        
        public BlockUpdate(@NotNull final BlockPos pos, @NotNull final IBlockState oldState, @NotNull final IBlockState newState) {
            Intrinsics.checkNotNullParameter((Object)pos, "pos");
            Intrinsics.checkNotNullParameter((Object)oldState, "oldState");
            Intrinsics.checkNotNullParameter((Object)newState, "newState");
            super(null);
            this.pos = pos;
            this.oldState = oldState;
            this.newState = newState;
            this.$$delegate_0 = BlockUpdate.Companion;
        }
        
        @NotNull
        public final BlockPos getPos() {
            return this.pos;
        }
        
        @NotNull
        public final IBlockState getOldState() {
            return this.oldState;
        }
        
        @NotNull
        public final IBlockState getNewState() {
            return this.newState;
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
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$BlockUpdate$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001R\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001b" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$RenderUpdate;", "Lcakeslayers/team/eventsystem/impl/WorldEvent;", "Lcakeslayers/team/eventsystem/IEventPosting;", "x1", "", "y1", "z1", "x2", "y2", "z2", "(IIIIII)V", "eventBus", "Lcakeslayers/team/eventsystem/EventBus;", "getEventBus", "()Lcakeslayers/team/eventsystem/EventBus;", "getX1", "()I", "getX2", "getY1", "getY2", "getZ1", "getZ2", "post", "", "event", "", "Companion", "Stay" })
    public static final class RenderUpdate extends WorldEvent implements IEventPosting
    {
        @NotNull
        public static final Companion Companion;
        private final int x1;
        private final int y1;
        private final int z1;
        private final int x2;
        private final int y2;
        private final int z2;
        private final /* synthetic */ Companion $$delegate_0;
        
        public RenderUpdate(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2) {
            super(null);
            this.x1 = x1;
            this.y1 = y1;
            this.z1 = z1;
            this.x2 = x2;
            this.y2 = y2;
            this.z2 = z2;
            this.$$delegate_0 = RenderUpdate.Companion;
        }
        
        public final int getX1() {
            return this.x1;
        }
        
        public final int getY1() {
            return this.y1;
        }
        
        public final int getZ1() {
            return this.z1;
        }
        
        public final int getX2() {
            return this.x2;
        }
        
        public final int getY2() {
            return this.y2;
        }
        
        public final int getZ2() {
            return this.z2;
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
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcakeslayers/team/eventsystem/impl/WorldEvent$RenderUpdate$Companion;", "Lcakeslayers/team/eventsystem/EventBus;", "()V", "Stay" })
        public static final class Companion extends EventBus
        {
            private Companion() {
            }
        }
    }
}
