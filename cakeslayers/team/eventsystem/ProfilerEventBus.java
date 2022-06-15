//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import cakeslayers.team.eventsystem.utils.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.world.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b" }, d2 = { "Lcakeslayers/team/eventsystem/ProfilerEventBus;", "Lcakeslayers/team/eventsystem/EventBus;", "Lcakeslayers/team/eventsystem/utils/Helper;", "()V", "post", "", "event", "", "Stay" })
public class ProfilerEventBus extends EventBus implements Helper
{
    public void post(@NotNull final Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.getMc().profiler.startSection("serial/concurrent");
        for (final Listener listener : this.getListeners()) {
            this.getMc().profiler.startSection(listener.getOwnerName());
            ((Function1)listener.getFunction()).invoke(event);
            this.getMc().profiler.endSection();
        }
        this.getMc().profiler.endStartSection("parallel");
        this.invokeParallel(event);
        this.getMc().profiler.endSection();
    }
    
    @NotNull
    public Minecraft getMc() {
        return DefaultImpls.getMc(this);
    }
    
    @Nullable
    public EntityPlayerSP getPlayer() {
        return DefaultImpls.getPlayer(this);
    }
    
    @Nullable
    public World getWorld() {
        return DefaultImpls.getWorld(this);
    }
}
