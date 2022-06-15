//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lcakeslayers/team/eventsystem/NamedProfilerEventBus;", "Lcakeslayers/team/eventsystem/ProfilerEventBus;", "profilerName", "", "(Ljava/lang/String;)V", "post", "", "event", "", "Stay" })
public class NamedProfilerEventBus extends ProfilerEventBus
{
    @NotNull
    private final String profilerName;
    
    public NamedProfilerEventBus(@NotNull final String profilerName) {
        Intrinsics.checkNotNullParameter((Object)profilerName, "profilerName");
        this.profilerName = profilerName;
    }
    
    @Override
    public void post(@NotNull final Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.getMc().profiler.startSection(this.profilerName);
        super.post(event);
        this.getMc().profiler.endSection();
    }
}
