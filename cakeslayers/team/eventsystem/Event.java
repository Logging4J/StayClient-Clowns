//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004" }, d2 = { "Lcakeslayers/team/eventsystem/Event;", "Lcakeslayers/team/eventsystem/IEventPosting;", "post", "", "Stay" })
public interface Event extends IEventPosting
{
    void post();
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        public static void post(@NotNull final Event this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            this.post(this);
        }
    }
}
