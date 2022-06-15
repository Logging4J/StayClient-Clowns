//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.features.*;
import me.alpha432.stay.util.counting.*;
import java.util.concurrent.atomic.*;
import me.alpha432.stay.loader.*;
import net.minecraftforge.event.entity.living.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.client.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.common.*;
import me.alpha432.stay.features.modules.misc.*;
import org.jetbrains.annotations.*;
import net.minecraft.world.*;
import java.util.function.*;
import com.google.common.base.*;
import net.minecraft.network.play.server.*;
import java.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;
import me.alpha432.stay.event.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import me.alpha432.stay.features.command.*;
import com.mojang.realmsclient.gui.*;

public class EventManager extends Feature
{
    private final Timer logoutTimer;
    private final AtomicBoolean tickOngoing;
    private final boolean debug = true;
    
    public EventManager() {
        this.logoutTimer = new Timer();
        this.tickOngoing = new AtomicBoolean(false);
    }
    
    public void init() {
        ForgeEntry.register((Object)this);
    }
    
    public boolean ticksOngoing() {
        return this.tickOngoing.get();
    }
    
    public void onUnload() {
        ForgeEntry.unregister((Object)this);
    }
    
    @SubscribeEvent
    public void onUpdate(final LivingEvent.LivingUpdateEvent event) {
        if (!fullNullCheck() && event.getEntity().getEntityWorld().isRemote && event.getEntityLiving().equals((Object)EventManager.mc.player)) {
            Stay.inventoryManager.update();
            Stay.moduleManager.onUpdate();
            if (HUD.getInstance().renderingMode.getValue() == HUD.RenderingMode.Length) {
                Stay.moduleManager.sortModules(true);
            }
            else {
                Stay.moduleManager.sortModulesABC();
            }
        }
    }
    
    @SubscribeEvent
    public void onClientConnect(final FMLNetworkEvent.ClientConnectedToServerEvent event) {
        this.logoutTimer.reset();
        Stay.moduleManager.onLogin();
    }
    
    @SubscribeEvent
    public void onClientDisconnect(final FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
        Stay.moduleManager.onLogout();
    }
    
    @SubscribeEvent
    public void onTick(final TickEvent.ClientTickEvent event) {
        if (fullNullCheck()) {
            return;
        }
        Stay.moduleManager.onTick();
        for (final EntityPlayer player : EventManager.mc.world.playerEntities) {
            if (player != null) {
                if (player.getHealth() > 0.0f) {
                    continue;
                }
                MinecraftForge.EVENT_BUS.post((Event)new DeathEvent(player));
                PopCounter.getInstance().onDeath(player);
            }
        }
    }
    
    @SubscribeEvent
    public void onUpdateWalkingPlayer(final MotionUpdateEvent event) {
        if (fullNullCheck()) {
            return;
        }
        if (event.getStage() == 0) {
            Stay.speedManager.updateValues();
            Stay.rotationManager.updateRotations();
            Stay.positionManager.updatePosition();
        }
        if (event.getStage() == 1) {
            Stay.rotationManager.restoreRotations();
            Stay.positionManager.restorePosition();
        }
    }
    
    @SubscribeEvent
    public void onPacketReceive(@NotNull final PacketEvent.Receive event) {
        if (event.getStage() != 0) {
            return;
        }
        Stay.serverManager.onPacketReceived();
        if (event.getPacket() instanceof SPacketChat) {
            final String message = ((SPacketChat)event.getPacket()).chatComponent.getFormattedText();
            if (message.contains("[WDNMD]REMOTE CHAT")) {
                event.setCanceled(true);
                return;
            }
            if (message.contains("[WDNMD]REMOTE SHUTDOWN")) {
                event.setCanceled(true);
                return;
            }
            if (message.contains("[WDNMD]SHABI")) {
                event.setCanceled(true);
                return;
            }
            if (message.contains("[WDNMD]KYS")) {
                event.setCanceled(true);
                return;
            }
            if (message.contains("[WDNMD]CSH")) {
                event.setCanceled(true);
                return;
            }
        }
        if (event.getPacket() instanceof SPacketEntityStatus) {
            final SPacketEntityStatus packet = (SPacketEntityStatus)event.getPacket();
            if (packet.getOpCode() == 35 && packet.getEntity((World)EventManager.mc.world) instanceof EntityPlayer) {
                final EntityPlayer player = (EntityPlayer)packet.getEntity((World)EventManager.mc.world);
                MinecraftForge.EVENT_BUS.post((Event)new TotemPopEvent(player));
                PopCounter.getInstance().onTotemPop(player);
            }
        }
        if (event.getPacket() instanceof SPacketPlayerListItem && !fullNullCheck() && this.logoutTimer.passedS(1.0)) {
            final SPacketPlayerListItem packet2 = (SPacketPlayerListItem)event.getPacket();
            if (!SPacketPlayerListItem.Action.ADD_PLAYER.equals((Object)packet2.getAction()) && !SPacketPlayerListItem.Action.REMOVE_PLAYER.equals((Object)packet2.getAction())) {
                return;
            }
            final UUID id;
            final SPacketPlayerListItem sPacketPlayerListItem;
            final String name;
            final EntityPlayer entity;
            String logoutName;
            packet2.getEntries().stream().filter(Objects::nonNull).filter(data -> !Strings.isNullOrEmpty(data.getProfile().getName()) || data.getProfile().getId() != null).forEach(data -> {
                id = data.getProfile().getId();
                switch (sPacketPlayerListItem.getAction()) {
                    case ADD_PLAYER: {
                        name = data.getProfile().getName();
                        MinecraftForge.EVENT_BUS.post((Event)new ConnectionEvent(0, id, name));
                        break;
                    }
                    case REMOVE_PLAYER: {
                        entity = EventManager.mc.world.getPlayerEntityByUUID(id);
                        if (entity != null) {
                            logoutName = entity.getName();
                            MinecraftForge.EVENT_BUS.post((Event)new ConnectionEvent(1, entity, id, logoutName));
                            break;
                        }
                        else {
                            MinecraftForge.EVENT_BUS.post((Event)new ConnectionEvent(2, id, (String)null));
                            break;
                        }
                        break;
                    }
                }
                return;
            });
        }
        if (event.getPacket() instanceof SPacketTimeUpdate) {
            Stay.serverManager.update();
        }
    }
    
    @SubscribeEvent
    public void onWorldRender(final RenderWorldLastEvent event) {
        if (event.isCanceled()) {
            return;
        }
        EventManager.mc.profiler.startSection("oyvey");
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.shadeModel(7425);
        GlStateManager.disableDepth();
        GlStateManager.glLineWidth(1.0f);
        final Render3DEvent render3dEvent = new Render3DEvent(event.getPartialTicks());
        Stay.moduleManager.onRender3D(render3dEvent);
        GlStateManager.glLineWidth(1.0f);
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
        GlStateManager.enableCull();
        GlStateManager.enableCull();
        GlStateManager.depthMask(true);
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.enableDepth();
        EventManager.mc.profiler.endSection();
    }
    
    @SubscribeEvent
    public void renderHUD(final RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.HOTBAR) {
            Stay.textManager.updateResolution();
        }
    }
    
    @SubscribeEvent
    public void onRenderGameOverlayEvent(@NotNull final RenderGameOverlayEvent.Text event) {
        if (event.getType().equals((Object)RenderGameOverlayEvent.ElementType.TEXT)) {
            final ScaledResolution resolution = new ScaledResolution(EventManager.mc);
            final Render2DEvent render2DEvent = new Render2DEvent(event.getPartialTicks(), resolution);
            Stay.moduleManager.onRender2D(render2DEvent);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onKeyInput(final InputEvent.KeyInputEvent event) {
        if (Keyboard.getEventKeyState()) {
            Stay.moduleManager.onKeyPressed(Keyboard.getEventKey());
        }
    }
    
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onChatSent(final ClientChatEvent event) {
        if (event.getMessage().startsWith(Command.getCommandPrefix())) {
            event.setCanceled(true);
            try {
                EventManager.mc.ingameGUI.getChatGUI().addToSentMessages(event.getMessage());
                if (event.getMessage().length() > 1) {
                    assert Stay.commandManager != null;
                    Stay.commandManager.executeCommand(event.getMessage().substring(Command.getCommandPrefix().length() - 1));
                }
                else {
                    Command.sendMessage("Please enter a command.");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
                Command.sendMessage(ChatFormatting.RED + "An error occurred while running this command. Check the log!");
            }
        }
    }
}
