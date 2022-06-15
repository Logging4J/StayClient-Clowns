//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.mixin.mixins;

import net.minecraft.client.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.lwjgl.input.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.crash.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.features.modules.client.*;
import net.minecraft.client.gui.*;
import me.alpha432.stay.features.gui.*;
import javax.swing.*;
import java.awt.*;
import me.alpha432.stay.event.*;
import net.minecraft.client.entity.*;
import me.alpha432.stay.features.modules.player.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.client.multiplayer.*;
import me.alpha432.stay.util.basement.wrapper.*;
import cakeslayers.team.eventsystem.impl.*;

@Mixin({ Minecraft.class })
public abstract class MixinMinecraft
{
    @Inject(method = { "shutdownMinecraftApplet" }, at = { @At("HEAD") })
    public void injectShutDownMA(final CallbackInfo ci) {
        this.unload(false);
    }
    
    @Inject(method = { "shutdown" }, at = { @At("HEAD") })
    public void handleShutDown(final CallbackInfo ci) {
        this.unload(false);
    }
    
    @Inject(method = { "runTickKeyboard" }, at = { @At(value = "INVOKE", remap = false, target = "Lorg/lwjgl/input/Keyboard;getEventKey()I", ordinal = 0, shift = At.Shift.BEFORE) })
    private void onKeyboard(final CallbackInfo ci) {
        final int n;
        final int i = n = ((Keyboard.getEventKey() == 0) ? (Keyboard.getEventCharacter() + '\u0100') : Keyboard.getEventKey());
        if (Keyboard.getEventKeyState()) {
            final KeyEvent event = new KeyEvent(i);
            MinecraftForge.EVENT_BUS.post((Event)event);
        }
    }
    
    @Shadow
    public abstract void displayGuiScreen(final GuiScreen p0);
    
    @Shadow
    public abstract void crashed(final CrashReport p0);
    
    @Inject(method = { "displayGuiScreen" }, at = { @At("HEAD") })
    private void displayGuiScreen(final GuiScreen screen, final CallbackInfo ci) {
        assert Stay.moduleManager != null;
        final ClickGui ClickGui = (ClickGui)Stay.moduleManager.getModuleByDisplayName("ClickGui");
        if (screen instanceof GuiMainMenu && (boolean)ClickGui.gui.getValue()) {
            this.displayGuiScreen((GuiScreen)new CustomSplashScreen());
        }
    }
    
    @Inject(method = { "runTick()V" }, at = { @At("RETURN") })
    private void runTick(final CallbackInfo callbackInfo) {
        final ClickGui ClickGui = (ClickGui)Stay.moduleManager.getModuleByDisplayName("ClickGui");
        if (Minecraft.getMinecraft().currentScreen instanceof GuiMainMenu && (boolean)ClickGui.gui.getValue()) {
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new CustomSplashScreen());
        }
    }
    
    private void unload(final boolean crash) {
        Stay.LOGGER.info("Stopping Stay...");
        Stay.onUnload();
        Stay.LOGGER.info("Stay Client stopped.");
        if (crash) {
            JOptionPane.showConfirmDialog(null, "Client Crashed! Please send this message's screenshot & game logs to Stay Dev.\nConfigs is saved.Open the TaskManager and close the game then.\nCaused by " + Minecraft.getMinecraft().crashReporter.getCrashCause(), "Crash Warning", -1, 0);
        }
    }
    
    @Inject(method = { "loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V" }, at = { @At("HEAD") })
    private void loadWorld(final WorldClient p_loadWorld_1_, final String p_loadWorld_2_, final CallbackInfo callbackInfo) {
        MinecraftForge.EVENT_BUS.post((Event)new WorldEvent(p_loadWorld_1_));
    }
    
    @Inject(method = { "runTick" }, at = { @At("HEAD") })
    public void runTick$Inject$HEAD(final CallbackInfo ci) {
        TickEvent.Pre.INSTANCE.post();
    }
    
    @Inject(method = { "runTick" }, at = { @At("RETURN") })
    public void runTick$Inject$RETURN(final CallbackInfo ci) {
        TickEvent.Post.INSTANCE.post();
    }
    
    @Redirect(method = { "sendClickBlockToController" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;isHandActive()Z"))
    private boolean isHandActiveWrapper(final EntityPlayerSP playerSP) {
        return !MultiTask.getInstance().isOn() && playerSP.isHandActive();
    }
    
    @Redirect(method = { "rightClickMouse" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;getIsHittingBlock()Z", ordinal = 0))
    private boolean isHittingBlockHook(final PlayerControllerMP playerControllerMP) {
        return !MultiTask.getInstance().isOn() && playerControllerMP.getIsHittingBlock();
    }
    
    @Inject(method = { "runGameLoop" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/util/Timer;updateTimer()V", shift = At.Shift.BEFORE) })
    public void runGameLoop$Inject$INVOKE$updateTimer(final CallbackInfo ci) {
        Wrapper.getMinecraft().profiler.startSection("trollRunGameLoop");
        RunGameLoopEvent.Start.INSTANCE.post();
        Wrapper.getMinecraft().profiler.endSection();
    }
    
    @Inject(method = { "runGameLoop" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/profiler/Profiler;endSection()V", ordinal = 0, shift = At.Shift.AFTER) })
    public void runGameLoop$INVOKE$endSection(final CallbackInfo ci) {
        Wrapper.getMinecraft().profiler.startSection("trollRunGameLoop");
        RunGameLoopEvent.Tick.INSTANCE.post();
        Wrapper.getMinecraft().profiler.endSection();
    }
    
    @Inject(method = { "runGameLoop" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", ordinal = 0, shift = At.Shift.BEFORE) })
    public void runGameLoop$Inject$INVOKE$endStartSection(final CallbackInfo ci) {
        Wrapper.getMinecraft().profiler.endStartSection("trollRunGameLoop");
        RunGameLoopEvent.Render.INSTANCE.post();
    }
    
    @Inject(method = { "runGameLoop" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;isFramerateLimitBelowMax()Z", shift = At.Shift.BEFORE) })
    public void runGameLoop$Inject$INVOKE$isFramerateLimitBelowMax(final CallbackInfo ci) {
        Wrapper.getMinecraft().profiler.startSection("trollRunGameLoop");
        RunGameLoopEvent.End.INSTANCE.post();
        Wrapper.getMinecraft().profiler.endSection();
    }
}
