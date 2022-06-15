//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules;

import me.alpha432.stay.features.*;
import me.alpha432.stay.features.setting.*;
import java.util.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import net.minecraftforge.fml.common.gameevent.*;
import java.util.concurrent.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.client.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.util.text.*;
import me.alpha432.stay.loader.*;
import me.alpha432.stay.event.*;
import cakeslayers.team.eventsystem.impl.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.manager.*;
import me.alpha432.stay.features.command.*;

public class Module extends Feature
{
    private final String description;
    private final Category category;
    public Setting<Boolean> enabled;
    public Setting<Boolean> drawn;
    public Setting<Bind> bind;
    public Setting<String> displayName;
    public boolean hasListener;
    public boolean alwaysListening;
    public boolean hidden;
    public float arrayListOffset;
    public float arrayListVOffset;
    public float offset;
    public float vOffset;
    public boolean sliding;
    private final List<Function0<Unit>> onEnableListener;
    private final List<Function0<Unit>> onDisableListener;
    private final List<Function0<Unit>> onTickListener;
    private final List<Function1<TickEvent.RenderTickEvent, Unit>> onRenderTickListener;
    private final List<Function0<Unit>> onUpdateListener;
    private final List<Function1<Render3DEvent, Unit>> onRender3DListener;
    private final List<Function1<Render2DEvent, Unit>> onRender2DListener;
    
    public Module(final String name, final String description, final Category category, final boolean hasListener, final boolean hidden, final boolean alwaysListening) {
        super(name);
        this.enabled = (Setting<Boolean>)this.register(new Setting("Enabled", (T)false));
        this.drawn = (Setting<Boolean>)this.register(new Setting("Drawn", (T)true));
        this.bind = (Setting<Bind>)this.register(new Setting("Keybind", (T)new Bind(-1)));
        this.arrayListOffset = 0.0f;
        this.arrayListVOffset = 0.0f;
        this.onEnableListener = new CopyOnWriteArrayList<Function0<Unit>>();
        this.onDisableListener = new CopyOnWriteArrayList<Function0<Unit>>();
        this.onTickListener = new CopyOnWriteArrayList<Function0<Unit>>();
        this.onRenderTickListener = new CopyOnWriteArrayList<Function1<TickEvent.RenderTickEvent, Unit>>();
        this.onUpdateListener = new CopyOnWriteArrayList<Function0<Unit>>();
        this.onRender3DListener = new CopyOnWriteArrayList<Function1<Render3DEvent, Unit>>();
        this.onRender2DListener = new CopyOnWriteArrayList<Function1<Render2DEvent, Unit>>();
        this.displayName = (Setting<String>)this.register(new Setting("DisplayName", (T)name));
        this.description = description;
        this.category = category;
        this.hasListener = hasListener;
        this.hidden = hidden;
        this.alwaysListening = alwaysListening;
    }
    
    public boolean isSliding() {
        return this.sliding;
    }
    
    public void onEnable() {
    }
    
    public void onDisable() {
    }
    
    public final void onEnable(final Function0<Unit> blockFunction) {
        this.onEnableListener.add(blockFunction);
    }
    
    public final void onDisable(final Function0<Unit> blockFunction) {
        this.onDisableListener.add(blockFunction);
    }
    
    private void onEnable0() {
        this.onEnableListener.forEach(Function0::invoke);
    }
    
    private void onDisable0() {
        this.onDisableListener.forEach(Function0::invoke);
    }
    
    public void onToggle() {
    }
    
    public void onLoad() {
    }
    
    public void onTick() {
    }
    
    public final void onTick(final Function0<Unit> func) {
        this.onTickListener.add(func);
    }
    
    public final void onTick0() {
        this.onTickListener.forEach(Function0::invoke);
    }
    
    public final void onRenderTick(final Function1<TickEvent.RenderTickEvent, Unit> func) {
        this.onRenderTickListener.add(func);
    }
    
    public final void onRenderTick0(final TickEvent.RenderTickEvent event) {
        final Unit unit;
        this.onRenderTickListener.forEach(func -> unit = (Unit)func.invoke((Object)event));
    }
    
    public void onLogin() {
    }
    
    public void onLogout() {
    }
    
    public void onUpdate() {
    }
    
    public final void onUpdate(final Function0<Unit> func) {
        this.onUpdateListener.add(func);
    }
    
    public final void onUpdate0() {
        this.onUpdateListener.forEach(Function0::invoke);
    }
    
    public void onRender2D(final Render2DEvent event) {
    }
    
    public final void onRender2D(final Function1<Render2DEvent, Unit> func) {
        this.onRender2DListener.add(func);
    }
    
    public final void onRender2D0(final Render2DEvent event) {
        final Unit unit;
        this.onRender2DListener.forEach(func -> unit = (Unit)func.invoke((Object)event));
    }
    
    public void onRender3D(final Render3DEvent event) {
    }
    
    public final void onRender3D(final Function1<Render3DEvent, Unit> func) {
        this.onRender3DListener.add(func);
    }
    
    public final void onRender3D0(final Render3DEvent event) {
        final Unit unit;
        this.onRender3DListener.forEach(func -> unit = (Unit)func.invoke((Object)event));
    }
    
    public void onUnload() {
    }
    
    public String getDisplayInfo() {
        return null;
    }
    
    public boolean isOn() {
        return this.enabled.getValue();
    }
    
    public boolean isOff() {
        return !this.enabled.getValue();
    }
    
    public void setEnabled(final boolean enabled) {
        if (enabled) {
            this.enable();
        }
        else {
            this.disable();
        }
    }
    
    public final void enable() {
        this.enabled.setValue(Boolean.TRUE);
        this.onToggle();
        this.onEnable();
        this.onEnable0();
        if (HUD.getInstance().notifyToggles.getValue()) {
            final TextComponentString text = new TextComponentString(Stay.commandManager.getClientMessage() + " " + ChatFormatting.GREEN + this.getDisplayName() + " toggled on.");
            Module.mc.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion((ITextComponent)text, 1);
        }
        assert Stay.notificationManager != null;
        Stay.notificationManager.push(this.getDisplayName() + " toggled on.", NotificationType.INFO, 1000L);
        this.subscribe();
        if (this.isOn() && this.hasListener && !this.alwaysListening) {
            ForgeEntry.register(this);
        }
    }
    
    public final void disable() {
        this.unsubscribe();
        if (this.hasListener && !this.alwaysListening) {
            ForgeEntry.unregister(this);
        }
        this.enabled.setValue(false);
        if (HUD.getInstance().notifyToggles.getValue()) {
            final TextComponentString text = new TextComponentString(Stay.commandManager.getClientMessage() + " " + ChatFormatting.RED + this.getDisplayName() + " toggled off.");
            Module.mc.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion((ITextComponent)text, 1);
        }
        assert Stay.notificationManager != null;
        Stay.notificationManager.push(this.getDisplayName() + " toggled off.", NotificationType.WARNING, 1000L);
        this.onToggle();
        this.onDisable();
        this.onDisable0();
    }
    
    public void toggle() {
        final ClientEvent event = new ClientEvent((int)(this.isEnabled() ? 0 : 1), (Feature)this);
        final ClientChangeEvent.ModuleToggle moduleToggle = new ClientChangeEvent.ModuleToggle(this, this.isEnabled());
        moduleToggle.post();
        MinecraftForge.EVENT_BUS.post((Event)event);
        if (!event.isCanceled() && !moduleToggle.getCancelled()) {
            this.setEnabled(!this.isEnabled());
        }
    }
    
    public String getDisplayName() {
        return this.displayName.getValue();
    }
    
    public void setDisplayName(final String name) {
        final Module module = Stay.moduleManager.getModuleByDisplayName(name);
        final ModuleManager moduleManager = Stay.moduleManager;
        final Module originalModule = ModuleManager.getModuleByName(name);
        if (module == null && originalModule == null) {
            Command.sendMessage(this.getDisplayName() + ", name: " + this.getName() + ", has been renamed to: " + name);
            this.displayName.setValue(name);
            return;
        }
        Command.sendMessage(ChatFormatting.RED + "A module of this name already exists.");
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public boolean isDrawn() {
        return this.drawn.getValue();
    }
    
    public void setDrawn(final boolean drawn) {
        this.drawn.setValue(drawn);
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public String getInfo() {
        return null;
    }
    
    public Bind getBind() {
        return this.bind.getValue();
    }
    
    public void setBind(final int key) {
        this.bind.setValue(new Bind(key));
    }
    
    public boolean listening() {
        return (this.hasListener && this.isOn()) || this.alwaysListening;
    }
    
    public String getFullArrayString() {
        return this.getDisplayName() + ChatFormatting.GRAY + ((this.getDisplayInfo() != null) ? (" [" + ChatFormatting.WHITE + this.getDisplayInfo() + ChatFormatting.GRAY + "]") : "");
    }
    
    public enum Category
    {
        COMBAT("Combat"), 
        MISC("Misc"), 
        VISUAL("Visual"), 
        MOVEMENT("Movement"), 
        PLAYER("Player"), 
        CLIENT("Global"), 
        UNSTABLE("Unstable");
        
        private final String name;
        
        private Category(final String name) {
            this.name = name;
        }
        
        public String getName() {
            return this.name;
        }
    }
}
