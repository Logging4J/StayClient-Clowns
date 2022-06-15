//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lcakeslayers/team/eventsystem/ICancellable;", "", "cancelled", "", "getCancelled", "()Z", "setCancelled", "(Z)V", "cancel", "", "Stay" })
public interface ICancellable
{
    boolean getCancelled();
    
    void setCancelled(final boolean p0);
    
    void cancel();
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        public static void cancel(@NotNull final ICancellable this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            this.setCancelled(true);
        }
    }
}
