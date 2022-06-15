//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t" }, d2 = { "Lcakeslayers/team/eventsystem/AlwaysListening;", "Lcakeslayers/team/eventsystem/IListenerOwner;", "register", "", "listener", "Lcakeslayers/team/eventsystem/Listener;", "Lcakeslayers/team/eventsystem/ParallelListener;", "subscribe", "unsubscribe", "Stay" })
public interface AlwaysListening extends IListenerOwner
{
    void register(@NotNull final Listener p0);
    
    void register(@NotNull final ParallelListener p0);
    
    void subscribe();
    
    void unsubscribe();
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        public static void register(@NotNull final AlwaysListening this, @NotNull final Listener listener) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            Intrinsics.checkNotNullParameter((Object)listener, "listener");
            EventBus.Companion.get(listener.getEventID()).subscribe(listener);
        }
        
        public static void register(@NotNull final AlwaysListening this, @NotNull final ParallelListener listener) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            Intrinsics.checkNotNullParameter((Object)listener, "listener");
            EventBus.Companion.get(listener.getEventID()).subscribe(listener);
        }
        
        public static void subscribe(@NotNull final AlwaysListening this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
        }
        
        public static void unsubscribe(@NotNull final AlwaysListening this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
        }
    }
}
