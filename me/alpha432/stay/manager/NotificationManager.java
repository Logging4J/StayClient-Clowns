//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.features.modules.*;
import kotlin.*;
import kotlin.reflect.*;
import java.util.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.client.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import me.alpha432.stay.util.delegate.*;
import java.util.concurrent.*;
import kotlin.jvm.functions.*;
import me.alpha432.stay.util.graphics.animations.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "Lme/alpha432/stay/manager/NotificationManager;", "Lme/alpha432/stay/features/modules/Module;", "()V", "backgroundAlpha", "", "getBackgroundAlpha", "()I", "backgroundAlpha$delegate", "Lme/alpha432/stay/util/delegate/Value;", "notificationQueue", "", "Lme/alpha432/stay/manager/NotificationManager$NotificationInfo;", "push", "", "message", "", "type", "Lme/alpha432/stay/manager/NotificationType;", "length", "", "NotificationInfo", "Stay" })
public final class NotificationManager extends Module
{
    @NotNull
    public static final NotificationManager INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value backgroundAlpha$delegate;
    @NotNull
    private static final List<NotificationInfo> notificationQueue;
    
    private NotificationManager() {
        super("Notification", "", Module.Category.CLIENT, true, false, false);
    }
    
    private final int getBackgroundAlpha() {
        return NotificationManager.backgroundAlpha$delegate.getValue(this, NotificationManager.$$delegatedProperties[0]).intValue();
    }
    
    public final void push(@Nullable final Object message, @NotNull final NotificationType type, final long length) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        final NotificationInfo stuff = new NotificationInfo(String.valueOf(message), type, length, System.currentTimeMillis());
        final AnimationFlag animationX = stuff.getAnimationX();
        final TextManager textManager = Stay.textManager;
        Intrinsics.checkNotNull((Object)textManager);
        final float prev = (float)textManager.scaledWidth;
        final TextManager textManager2 = Stay.textManager;
        Intrinsics.checkNotNull((Object)textManager2);
        animationX.forceUpdate(prev, (float)textManager2.scaledWidth);
        final AnimationFlag animationY = stuff.getAnimationY();
        final TextManager textManager3 = Stay.textManager;
        Intrinsics.checkNotNull((Object)textManager3);
        final float prev2 = (float)textManager3.scaledHeight;
        final TextManager textManager4 = Stay.textManager;
        Intrinsics.checkNotNull((Object)textManager4);
        animationY.forceUpdate(prev2, (float)textManager4.scaledHeight);
        NotificationManager.notificationQueue.add(stuff);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)NotificationManager.class, "backgroundAlpha", "getBackgroundAlpha()I", 0)) };
        INSTANCE = new NotificationManager();
        backgroundAlpha$delegate = SettingsKt.setting(NotificationManager.INSTANCE, "BG Alpha", 127, new IntRange(0, 255));
        notificationQueue = new CopyOnWriteArrayList<NotificationInfo>();
        NotificationManager.INSTANCE.onRender2D((Function1)NotificationManager$1.INSTANCE);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J1\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010*\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006/" }, d2 = { "Lme/alpha432/stay/manager/NotificationManager$NotificationInfo;", "", "message", "", "type", "Lme/alpha432/stay/manager/NotificationType;", "length", "", "startTime", "(Ljava/lang/String;Lme/alpha432/stay/manager/NotificationType;JJ)V", "animationX", "Lme/alpha432/stay/util/graphics/animations/AnimationFlag;", "getAnimationX", "()Lme/alpha432/stay/util/graphics/animations/AnimationFlag;", "animationY", "getAnimationY", "currentX", "", "getCurrentX", "()F", "setCurrentX", "(F)V", "isEnded", "", "()Z", "setEnded", "(Z)V", "getLength", "()J", "getMessage", "()Ljava/lang/String;", "shouldRemove", "getShouldRemove", "setShouldRemove", "getStartTime", "getType", "()Lme/alpha432/stay/manager/NotificationType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Stay" })
    public static final class NotificationInfo
    {
        @NotNull
        private final String message;
        @NotNull
        private final NotificationType type;
        private final long length;
        private final long startTime;
        @NotNull
        private final AnimationFlag animationX;
        @NotNull
        private final AnimationFlag animationY;
        private boolean isEnded;
        private boolean shouldRemove;
        private float currentX;
        
        public NotificationInfo(@NotNull final String message, @NotNull final NotificationType type, final long length, final long startTime) {
            Intrinsics.checkNotNullParameter((Object)message, "message");
            Intrinsics.checkNotNullParameter((Object)type, "type");
            this.message = message;
            this.type = type;
            this.length = length;
            this.startTime = startTime;
            this.animationX = new AnimationFlag(Easing.OUT_QUINT, 700.0f);
            this.animationY = new AnimationFlag(Easing.OUT_QUINT, 400.0f);
        }
        
        @NotNull
        public final String getMessage() {
            return this.message;
        }
        
        @NotNull
        public final NotificationType getType() {
            return this.type;
        }
        
        public final long getLength() {
            return this.length;
        }
        
        public final long getStartTime() {
            return this.startTime;
        }
        
        @NotNull
        public final AnimationFlag getAnimationX() {
            return this.animationX;
        }
        
        @NotNull
        public final AnimationFlag getAnimationY() {
            return this.animationY;
        }
        
        public final boolean isEnded() {
            return this.isEnded;
        }
        
        public final void setEnded(final boolean <set-?>) {
            this.isEnded = <set-?>;
        }
        
        public final boolean getShouldRemove() {
            return this.shouldRemove;
        }
        
        public final void setShouldRemove(final boolean <set-?>) {
            this.shouldRemove = <set-?>;
        }
        
        public final float getCurrentX() {
            return this.currentX;
        }
        
        public final void setCurrentX(final float <set-?>) {
            this.currentX = <set-?>;
        }
        
        @NotNull
        public final String component1() {
            return this.message;
        }
        
        @NotNull
        public final NotificationType component2() {
            return this.type;
        }
        
        public final long component3() {
            return this.length;
        }
        
        public final long component4() {
            return this.startTime;
        }
        
        @NotNull
        public final NotificationInfo copy(@NotNull final String message, @NotNull final NotificationType type, final long length, final long startTime) {
            Intrinsics.checkNotNullParameter((Object)message, "message");
            Intrinsics.checkNotNullParameter((Object)type, "type");
            return new NotificationInfo(message, type, length, startTime);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "NotificationInfo(message=" + this.message + ", type=" + this.type + ", length=" + this.length + ", startTime=" + this.startTime + ')';
        }
        
        @Override
        public int hashCode() {
            int result = this.message.hashCode();
            result = result * 31 + this.type.hashCode();
            result = result * 31 + Long.hashCode(this.length);
            result = result * 31 + Long.hashCode(this.startTime);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationInfo)) {
                return false;
            }
            final NotificationInfo notificationInfo = (NotificationInfo)other;
            return Intrinsics.areEqual((Object)this.message, (Object)notificationInfo.message) && this.type == notificationInfo.type && this.length == notificationInfo.length && this.startTime == notificationInfo.startTime;
        }
    }
}
