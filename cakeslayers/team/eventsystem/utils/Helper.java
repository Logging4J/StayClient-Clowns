//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.utils;

import kotlin.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.world.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e" }, d2 = { "Lcakeslayers/team/eventsystem/utils/Helper;", "", "mc", "Lnet/minecraft/client/Minecraft;", "getMc", "()Lnet/minecraft/client/Minecraft;", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "getPlayer", "()Lnet/minecraft/client/entity/EntityPlayerSP;", "world", "Lnet/minecraft/world/World;", "getWorld", "()Lnet/minecraft/world/World;", "Stay" })
public interface Helper
{
    @NotNull
    Minecraft getMc();
    
    @Nullable
    EntityPlayerSP getPlayer();
    
    @Nullable
    World getWorld();
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        @NotNull
        public static Minecraft getMc(@NotNull final Helper this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            final Minecraft getMinecraft = Minecraft.getMinecraft();
            Intrinsics.checkNotNullExpressionValue((Object)getMinecraft, "getMinecraft()");
            return getMinecraft;
        }
        
        @Nullable
        public static EntityPlayerSP getPlayer(@NotNull final Helper this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            return this.getMc().player;
        }
        
        @Nullable
        public static World getWorld(@NotNull final Helper this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            return (World)this.getMc().world;
        }
    }
}
