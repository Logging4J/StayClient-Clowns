//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import net.minecraftforge.fml.common.eventhandler.*;
import kotlin.*;
import me.alpha432.stay.features.*;
import me.alpha432.stay.features.setting.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Cancelable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0013\b\u0016\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0002\u0010\tR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/event/ClientEvent;", "Lme/alpha432/stay/event/EventStage;", "stage", "", "feature", "Lme/alpha432/stay/features/Feature;", "(ILme/alpha432/stay/features/Feature;)V", "setting", "Lme/alpha432/stay/features/setting/Setting;", "(Lme/alpha432/stay/features/setting/Setting;)V", "<set-?>", "getFeature", "()Lme/alpha432/stay/features/Feature;", "getSetting", "()Lme/alpha432/stay/features/setting/Setting;", "Stay" })
public final class ClientEvent extends EventStage
{
    @Nullable
    private Feature feature;
    @Nullable
    private Setting<?> setting;
    
    @Nullable
    public final Feature getFeature() {
        return this.feature;
    }
    
    @Nullable
    public final Setting<?> getSetting() {
        return this.setting;
    }
    
    public ClientEvent(final int stage, @NotNull final Feature feature) {
        Intrinsics.checkNotNullParameter((Object)feature, "feature");
        super(stage);
        this.feature = feature;
    }
    
    public ClientEvent(@NotNull final Setting<?> setting) {
        Intrinsics.checkNotNullParameter((Object)setting, "setting");
        super(2);
        this.setting = setting;
    }
}
