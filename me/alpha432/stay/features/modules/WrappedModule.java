//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules;

import cakeslayers.team.eventsystem.utils.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.world.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010" }, d2 = { "Lme/alpha432/stay/features/modules/WrappedModule;", "Lme/alpha432/stay/features/modules/Module;", "Lcakeslayers/team/eventsystem/utils/Nameable;", "Lcakeslayers/team/eventsystem/utils/Helper;", "name", "", "description", "category", "Lme/alpha432/stay/features/modules/Module$Category;", "hasListener", "", "hidden", "alwaysListening", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lme/alpha432/stay/features/modules/Module$Category;ZZZ)V", "getName", "()Ljava/lang/CharSequence;", "Stay" })
public class WrappedModule extends Module implements Nameable, Helper
{
    @NotNull
    private final CharSequence name;
    
    public WrappedModule(@NotNull final CharSequence name, @NotNull final CharSequence description, @NotNull final Module.Category category, final boolean hasListener, final boolean hidden, final boolean alwaysListening) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        Intrinsics.checkNotNullParameter((Object)category, "category");
        super(name.toString(), description.toString(), category, hasListener, hidden, alwaysListening);
        this.name = name;
    }
    
    @NotNull
    public CharSequence getName() {
        return this.name;
    }
    
    @NotNull
    public String getNameAsString() {
        return Nameable.DefaultImpls.getNameAsString((Nameable)this);
    }
    
    @NotNull
    public Minecraft getMc() {
        return Helper.DefaultImpls.getMc((Helper)this);
    }
    
    @Nullable
    public EntityPlayerSP getPlayer() {
        return Helper.DefaultImpls.getPlayer((Helper)this);
    }
    
    @Nullable
    public World getWorld() {
        return Helper.DefaultImpls.getWorld((Helper)this);
    }
}
