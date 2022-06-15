//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import net.minecraft.client.*;
import me.alpha432.stay.util.basement.wrapper.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017" }, d2 = { "Lcakeslayers/team/eventsystem/AbstractClientEvent;", "", "()V", "connection", "Lnet/minecraft/client/network/NetHandlerPlayClient;", "getConnection", "()Lnet/minecraft/client/network/NetHandlerPlayClient;", "mc", "Lnet/minecraft/client/Minecraft;", "getMc", "()Lnet/minecraft/client/Minecraft;", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "getPlayer", "()Lnet/minecraft/client/entity/EntityPlayerSP;", "playerController", "Lnet/minecraft/client/multiplayer/PlayerControllerMP;", "getPlayerController", "()Lnet/minecraft/client/multiplayer/PlayerControllerMP;", "world", "Lnet/minecraft/client/multiplayer/WorldClient;", "getWorld", "()Lnet/minecraft/client/multiplayer/WorldClient;", "Stay" })
public abstract class AbstractClientEvent
{
    @NotNull
    private final Minecraft mc;
    
    public AbstractClientEvent() {
        this.mc = MinecraftWrapper.getMc();
    }
    
    @NotNull
    public final Minecraft getMc() {
        return this.mc;
    }
    
    @Nullable
    public abstract WorldClient getWorld();
    
    @Nullable
    public abstract EntityPlayerSP getPlayer();
    
    @Nullable
    public abstract PlayerControllerMP getPlayerController();
    
    @Nullable
    public abstract NetHandlerPlayClient getConnection();
}
