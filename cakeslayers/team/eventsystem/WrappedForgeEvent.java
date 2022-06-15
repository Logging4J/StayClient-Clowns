//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lcakeslayers/team/eventsystem/WrappedForgeEvent;", "Lcakeslayers/team/eventsystem/ICancellable;", "value", "", "cancelled", "getCancelled", "()Z", "setCancelled", "(Z)V", "event", "Lnet/minecraftforge/fml/common/eventhandler/Event;", "getEvent", "()Lnet/minecraftforge/fml/common/eventhandler/Event;", "Stay" })
public interface WrappedForgeEvent extends ICancellable
{
    @NotNull
    Event getEvent();
    
    boolean getCancelled();
    
    void setCancelled(final boolean p0);
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        public static boolean getCancelled(@NotNull final WrappedForgeEvent this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            return this.getEvent().isCanceled();
        }
        
        public static void setCancelled(@NotNull final WrappedForgeEvent this, final boolean value) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            this.getEvent().setCanceled(value);
        }
        
        public static void cancel(@NotNull final WrappedForgeEvent this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            ICancellable.DefaultImpls.cancel((ICancellable)this);
        }
    }
}
