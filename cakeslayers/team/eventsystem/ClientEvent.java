//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.network.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00140\u0016¢\u0006\u0002\b\u0017H\u0086\n\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019" }, d2 = { "Lcakeslayers/team/eventsystem/ClientEvent;", "Lcakeslayers/team/eventsystem/AbstractClientEvent;", "()V", "connection", "Lnet/minecraft/client/network/NetHandlerPlayClient;", "getConnection", "()Lnet/minecraft/client/network/NetHandlerPlayClient;", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "getPlayer", "()Lnet/minecraft/client/entity/EntityPlayerSP;", "playerController", "Lnet/minecraft/client/multiplayer/PlayerControllerMP;", "getPlayerController", "()Lnet/minecraft/client/multiplayer/PlayerControllerMP;", "world", "Lnet/minecraft/client/multiplayer/WorldClient;", "getWorld", "()Lnet/minecraft/client/multiplayer/WorldClient;", "invoke", "T", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Stay" })
public class ClientEvent extends AbstractClientEvent
{
    @Nullable
    private final WorldClient world;
    @Nullable
    private final EntityPlayerSP player;
    @Nullable
    private final PlayerControllerMP playerController;
    @Nullable
    private final NetHandlerPlayClient connection;
    
    public ClientEvent() {
        this.world = this.getMc().world;
        this.player = this.getMc().player;
        this.playerController = this.getMc().playerController;
        this.connection = this.getMc().getConnection();
    }
    
    @Nullable
    public final WorldClient getWorld() {
        return this.world;
    }
    
    @Nullable
    public final EntityPlayerSP getPlayer() {
        return this.player;
    }
    
    @Nullable
    public final PlayerControllerMP getPlayerController() {
        return this.playerController;
    }
    
    @Nullable
    public final NetHandlerPlayClient getConnection() {
        return this.connection;
    }
    
    public final <T> T invoke(@NotNull final Function1<? super ClientEvent, ? extends T> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        final int $i$f$invoke = 0;
        return (T)block.invoke((Object)this);
    }
}
