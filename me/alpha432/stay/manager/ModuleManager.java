//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.features.*;
import me.alpha432.stay.features.modules.unstable.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.features.modules.render.*;
import me.alpha432.stay.features.modules.combat.*;
import me.alpha432.stay.features.modules.player.*;
import me.alpha432.stay.features.modules.misc.*;
import me.alpha432.stay.features.modules.movement.*;
import org.reflections.*;
import me.alpha432.stay.features.modules.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.loader.*;
import java.util.function.*;
import me.alpha432.stay.event.*;
import java.util.stream.*;
import java.util.*;
import org.lwjgl.input.*;
import me.alpha432.stay.features.gui.*;
import java.lang.reflect.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.util.basement.wrapper.*;
import me.alpha432.stay.client.*;
import java.util.concurrent.*;

public class ModuleManager extends Feature
{
    public static ArrayList<Module> modules;
    public List<Module> sortedModules;
    public List<String> sortedModulesABC;
    public Animation animationThread;
    public static ArrayList<Module> nigger;
    
    public ModuleManager() {
        this.sortedModules = new ArrayList<Module>();
        this.sortedModulesABC = new ArrayList<String>();
    }
    
    public void init() {
        ModuleManager.modules.add((Module)new ClickGui());
        ModuleManager.modules.add((Module)new FontMod());
        ModuleManager.modules.add((Module)new GUIBlur());
        ModuleManager.modules.add((Module)new HUD());
        ModuleManager.modules.add((Module)new HudComponents());
        ModuleManager.modules.add((Module)new NickHider());
        ModuleManager.modules.add((Module)new Breadcrumbs());
        ModuleManager.modules.add((Module)new HoleESP2());
        ModuleManager.modules.add((Module)new LogSpots());
        ModuleManager.modules.add((Module)new AntiWeather());
        ModuleManager.modules.add((Module)new Tracer());
        ModuleManager.modules.add((Module)new CameraClip());
        ModuleManager.modules.add((Module)new VoidESP());
        ModuleManager.modules.add((Module)new BreakESP());
        ModuleManager.modules.add((Module)new CapesModule());
        ModuleManager.modules.add((Module)new Shaders());
        ModuleManager.modules.add((Module)new BlockHighlight());
        ModuleManager.modules.add((Module)new HellgateEsp());
        ModuleManager.modules.add((Module)new HoleESP());
        ModuleManager.modules.add((Module)new Skeleton());
        ModuleManager.modules.add((Module)new Wireframe());
        ModuleManager.modules.add((Module)new ViewModel());
        ModuleManager.modules.add((Module)new HandChams());
        ModuleManager.modules.add((Module)new NoRender());
        ModuleManager.modules.add((Module)new Trajectories());
        ModuleManager.modules.add((Module)new Swing());
        ModuleManager.modules.add((Module)new ArrowESP());
        ModuleManager.modules.add((Module)new GlintModify());
        ModuleManager.modules.add((Module)new FullBright());
        ModuleManager.modules.add((Module)new SkyColor());
        ModuleManager.modules.add((Module)new ESP());
        ModuleManager.modules.add((Module)new Burrowesp());
        ModuleManager.modules.add((Module)new NameTags());
        ModuleManager.modules.add((Module)new NameTags2());
        ModuleManager.modules.add((Module)new Fov());
        ModuleManager.modules.add((Module)new TexturedChams());
        ModuleManager.modules.add((Module)new SurroundRender());
        ModuleManager.modules.add((Module)new SmallShield());
        ModuleManager.modules.add((Module)new HitMarkers());
        ModuleManager.modules.add((Module)new AutoQuiver());
        ModuleManager.modules.add((Module)new StormCrystal());
        ModuleManager.modules.add((Module)new InfiniteDive());
        ModuleManager.modules.add((Module)new PistonAura());
        ModuleManager.modules.add((Module)new AntiCrystal());
        ModuleManager.modules.add((Module)new Anti32KTotem());
        ModuleManager.modules.add((Module)new AutoCrystal2());
        ModuleManager.modules.add((Module)new Surround());
        ModuleManager.modules.add((Module)new AutoTrap());
        ModuleManager.modules.add((Module)new AutoTotem());
        ModuleManager.modules.add((Module)new OffHandCrystal());
        ModuleManager.modules.add((Module)new GodModule());
        ModuleManager.modules.add((Module)new AutoWeb());
        ModuleManager.modules.add((Module)new Killaura());
        ModuleManager.modules.add((Module)new AutoHoleFiller());
        ModuleManager.modules.add((Module)new NewBuorrw());
        ModuleManager.modules.add((Module)new AntiCevTrap());
        ModuleManager.modules.add((Module)new AutoCrystal());
        ModuleManager.modules.add((Module)new AutoCev());
        ModuleManager.modules.add((Module)new Auto32k());
        ModuleManager.modules.add((Module)new Criticals());
        ModuleManager.modules.add((Module)new HoleFiller());
        ModuleManager.modules.add((Module)new Burrow());
        ModuleManager.modules.add((Module)new AutoArmor());
        ModuleManager.modules.add((Module)new Selftrap());
        ModuleManager.modules.add((Module)new SelfWeb());
        ModuleManager.modules.add((Module)new Quiver());
        ModuleManager.modules.add((Module)new AutoMinecart());
        ModuleManager.modules.add((Module)new AutoAntiBurrow());
        ModuleManager.modules.add((Module)new NoContainer());
        ModuleManager.modules.add((Module)new AntiBurrow());
        ModuleManager.modules.add((Module)new AutoCity());
        ModuleManager.modules.add((Module)new PortalGodMode());
        ModuleManager.modules.add((Module)new Yaw());
        ModuleManager.modules.add((Module)new Freecam());
        ModuleManager.modules.add((Module)new FastPlace());
        ModuleManager.modules.add((Module)new TpsSync());
        ModuleManager.modules.add((Module)new Replenish());
        ModuleManager.modules.add((Module)new FakePlayer());
        ModuleManager.modules.add((Module)new Blink());
        ModuleManager.modules.add((Module)new MultiTask());
        ModuleManager.modules.add((Module)new MCP());
        ModuleManager.modules.add((Module)new LiquidInteract());
        ModuleManager.modules.add((Module)new Speedmine());
        ModuleManager.modules.add((Module)new Announcer());
        ModuleManager.modules.add((Module)new AntiBookBan());
        ModuleManager.modules.add((Module)new ExtraTab());
        ModuleManager.modules.add((Module)new AutoPlatform());
        ModuleManager.modules.add((Module)new NoHitBox());
        ModuleManager.modules.add((Module)new PacketEat());
        ModuleManager.modules.add((Module)new Timestamps());
        ModuleManager.modules.add((Module)new ChatSuffix());
        ModuleManager.modules.add((Module)new AntiDeathScreen());
        ModuleManager.modules.add((Module)new AtinAFK());
        ModuleManager.modules.add((Module)new NoHandShake());
        ModuleManager.modules.add((Module)new BuildHeight());
        ModuleManager.modules.add((Module)new AutoSignin());
        ModuleManager.modules.add((Module)new ChatModifier());
        ModuleManager.modules.add((Module)new MCF());
        ModuleManager.modules.add((Module)new Message());
        ModuleManager.modules.add((Module)new PearlNotify());
        ModuleManager.modules.add((Module)new AutoQueue());
        ModuleManager.modules.add((Module)new AutoGG());
        ModuleManager.modules.add((Module)new ToolTips());
        ModuleManager.modules.add((Module)new InstantMine());
        ModuleManager.modules.add((Module)new RPC());
        ModuleManager.modules.add((Module)new AutoDupe());
        ModuleManager.modules.add((Module)new Tracker());
        ModuleManager.modules.add((Module)new Timers());
        ModuleManager.modules.add((Module)new Anti32k());
        ModuleManager.modules.add((Module)new Burrow2());
        ModuleManager.modules.add((Module)new PopCounter());
        ModuleManager.modules.add((Module)new AutoAntiCity());
        ModuleManager.modules.add((Module)new NarratorTweaks());
        ModuleManager.modules.add((Module)new PacketXP());
        ModuleManager.modules.add((Module)new GhastNotifier());
        ModuleManager.modules.add((Module)new HotbarRefill());
        ModuleManager.modules.add((Module)new XCarry());
        ModuleManager.modules.add((Module)new TestPhase());
        ModuleManager.modules.add((Module)new PingSpoof());
        ModuleManager.modules.add((Module)new AutoLog());
        ModuleManager.modules.add((Module)new AutoReconnect());
        ModuleManager.modules.add((Module)new AutoWalk());
        ModuleManager.modules.add((Module)new Phase());
        ModuleManager.modules.add((Module)new Sprint());
        ModuleManager.modules.add((Module)new Step());
        ModuleManager.modules.add((Module)new Strafe());
        ModuleManager.modules.add((Module)new NoFall());
        ModuleManager.modules.add((Module)new BoatFly());
        ModuleManager.modules.add((Module)new ElytraFlight());
        ModuleManager.modules.add((Module)new ReverseStep());
        ModuleManager.modules.add((Module)new PlayerTweaks());
        ModuleManager.modules.add((Module)new AntiVoid());
        ModuleManager.modules.add((Module)new Anchor());
        ModuleManager.modules.add((Module)new Flight());
        ModuleManager.modules.add((Module)new HoleIntercept());
        ModuleManager.modules.add((Module)new Scaffold());
        final Reflections reflections = new Reflections(new Object[0]);
        final Set<Class<?>> modules = (Set<Class<?>>)reflections.getTypesAnnotatedWith((Class)ApplyModule.class);
        Module module;
        final ReflectiveOperationException ex;
        ReflectiveOperationException e;
        modules.stream().filter(it -> Arrays.stream(it.getFields()).noneMatch(field -> field.getName().equals("INSTANCE"))).forEach(aClass -> {
            try {
                module = aClass.newInstance();
                if (ModuleManager.modules.stream().noneMatch(module::equals)) {
                    ModuleManager.modules.add(module);
                }
            }
            catch (InstantiationException | IllegalAccessException ex2) {
                e = ex;
                e.printStackTrace();
            }
            return;
        });
        Module module2;
        modules.stream().filter(it -> Arrays.stream(it.getFields()).anyMatch(field -> field.getName().equals("INSTANCE"))).forEach(aClass -> {
            try {
                module2 = (Module)aClass.getField("INSTANCE").get(null);
                if (ModuleManager.modules.stream().noneMatch(module2::equals)) {
                    ModuleManager.modules.add(module2);
                }
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        });
    }
    
    public static Module getModuleByName(final String name) {
        for (final Module module : ModuleManager.modules) {
            if (!module.getName().equalsIgnoreCase(name)) {
                continue;
            }
            return module;
        }
        return null;
    }
    
    @Contract(pure = true)
    public static <T extends Module> T getModuleByClass(@NotNull final Class<T> clazz) {
        for (final Module module : ModuleManager.modules) {
            if (!clazz.isInstance(module)) {
                continue;
            }
            return (T)module;
        }
        return null;
    }
    
    public void enableModule(final Class<Module> clazz) {
        final Module module = getModuleByClass(clazz);
        if (module != null) {
            module.enable();
        }
    }
    
    public void disableModule(final Class<Module> clazz) {
        final Module module = getModuleByClass(clazz);
        if (module != null) {
            module.disable();
        }
    }
    
    public void enableModule(final String name) {
        final Module module = getModuleByName(name);
        if (module != null) {
            module.enable();
        }
    }
    
    public void disableModule(final String name) {
        final Module module = getModuleByName(name);
        if (module != null) {
            module.disable();
        }
    }
    
    public boolean isModuleEnabled(final String name) {
        final Module module = getModuleByName(name);
        return module != null && module.isOn();
    }
    
    public <T extends Module> boolean isModuleEnabled(final Class<T> clazz) {
        final Module module = getModuleByClass(clazz);
        return module != null && module.isOn();
    }
    
    public Module getModuleByDisplayName(final String displayName) {
        for (final Module module : ModuleManager.modules) {
            if (!module.getDisplayName().equalsIgnoreCase(displayName)) {
                continue;
            }
            return module;
        }
        return null;
    }
    
    public ArrayList<Module> getEnabledModules() {
        final ArrayList<Module> enabledModules = new ArrayList<Module>();
        for (final Module module : ModuleManager.modules) {
            if (!module.isEnabled()) {
                continue;
            }
            enabledModules.add(module);
        }
        return enabledModules;
    }
    
    public ArrayList<String> getEnabledModulesName() {
        final ArrayList<String> enabledModules = new ArrayList<String>();
        for (final Module module : ModuleManager.modules) {
            if (module.isEnabled()) {
                if (!module.isDrawn()) {
                    continue;
                }
                enabledModules.add(module.getFullArrayString());
            }
        }
        return enabledModules;
    }
    
    public ArrayList<Module> getModulesByCategory(final Module.Category category) {
        final ArrayList<Module> modulesCategory = new ArrayList<Module>();
        final ArrayList<Module> list;
        ModuleManager.modules.forEach(module -> {
            if (module.getCategory() == category) {
                list.add(module);
            }
            return;
        });
        return modulesCategory;
    }
    
    public List<Module.Category> getCategories() {
        return Arrays.asList(Module.Category.values());
    }
    
    public void onLoad() {
        ModuleManager.modules.stream().filter(Module::listening).forEach(ForgeEntry::register);
        ModuleManager.modules.forEach(Module::onLoad);
    }
    
    public void onUpdate() {
        ModuleManager.modules.stream().filter(Feature::isEnabled).forEach(module -> {
            module.onUpdate0();
            module.onUpdate();
        });
    }
    
    public void onTick() {
        ModuleManager.modules.stream().filter(Feature::isEnabled).forEach(module -> {
            module.onTick();
            module.onTick0();
        });
    }
    
    public void onRender2D(final Render2DEvent event) {
        ModuleManager.modules.stream().filter(Feature::isEnabled).forEach(module -> {
            module.onRender2D(event);
            module.onRender2D0(event);
        });
    }
    
    public void onRender3D(final Render3DEvent event) {
        ModuleManager.modules.stream().filter(Feature::isEnabled).forEach(module -> {
            module.onRender3D(event);
            module.onRender3D0(event);
        });
    }
    
    public <T extends Module> T getModuleT(final Class<T> clazz) {
        return ModuleManager.modules.stream().filter(module -> module.getClass() == clazz).map(module -> module).findFirst().orElse(null);
    }
    
    public void sortModules(final boolean reverse) {
        this.sortedModules = this.getEnabledModules().stream().filter(Module::isDrawn).sorted(Comparator.comparing(module -> this.renderer.getStringWidth(module.getFullArrayString()) * (reverse ? -1 : 1))).collect((Collector<? super Object, ?, List<Module>>)Collectors.toList());
    }
    
    public void sortModulesABC() {
        (this.sortedModulesABC = new ArrayList<String>(this.getEnabledModulesName())).sort(String.CASE_INSENSITIVE_ORDER);
    }
    
    public void onLogout() {
        ModuleManager.modules.forEach(Module::onLogout);
    }
    
    public void onLogin() {
        ModuleManager.modules.forEach(Module::onLogin);
    }
    
    public void onUnload() {
        ModuleManager.modules.forEach(ForgeEntry::unregister);
        ModuleManager.modules.forEach(Module::onUnload);
    }
    
    public void onUnloadPost() {
        for (final Module module : ModuleManager.modules) {
            module.enabled.setValue((Object)false);
        }
    }
    
    public void onKeyPressed(final int eventKey) {
        if (eventKey == 0 || !Keyboard.getEventKeyState() || ModuleManager.mc.currentScreen instanceof StayGui) {
            return;
        }
        ModuleManager.modules.forEach(module -> {
            if (module.getBind().getKey() == eventKey) {
                module.toggle();
            }
        });
    }
    
    @Contract(pure = true)
    public static ArrayList<Module> getModules() {
        return ModuleManager.nigger;
    }
    
    public static boolean isModuleEnablednigger(final String name) {
        final Module modulenigger = getModules().stream().filter(mm -> mm.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
        return modulenigger.isEnabled();
    }
    
    public static boolean isModuleEnablednigger(final Module modulenigger) {
        return modulenigger.isEnabled();
    }
    
    static {
        ModuleManager.modules = new ArrayList<Module>();
    }
    
    private class Animation extends Thread
    {
        public Module module;
        public float offset;
        public float vOffset;
        ScheduledExecutorService service;
        
        public Animation() {
            super("Animation");
            this.service = Executors.newSingleThreadScheduledExecutor();
        }
        
        @Override
        public void run() {
            if (HUD.getInstance().renderingMode.getValue() == HUD.RenderingMode.Length) {
                for (final Module module : ModuleManager.this.sortedModules) {
                    final String text = module.getDisplayName() + ChatFormatting.GRAY + ((module.getDisplayInfo() != null) ? (" [" + ChatFormatting.WHITE + module.getDisplayInfo() + ChatFormatting.GRAY + "]") : "");
                    module.offset = ModuleManager.this.renderer.getStringWidth(text) / (float)HUD.getInstance().animationHorizontalTime.getValue();
                    module.vOffset = ModuleManager.this.renderer.getFontHeight() / (float)HUD.getInstance().animationVerticalTime.getValue();
                    if (module.isEnabled() && (int)HUD.getInstance().animationHorizontalTime.getValue() != 1) {
                        if (module.arrayListOffset <= module.offset) {
                            continue;
                        }
                        if (Util.mc.world == null) {
                            continue;
                        }
                        final Module module3 = module;
                        module3.arrayListOffset -= module.offset;
                        module.sliding = true;
                    }
                    else {
                        if (!module.isDisabled()) {
                            continue;
                        }
                        if ((int)HUD.getInstance().animationHorizontalTime.getValue() == 1) {
                            continue;
                        }
                        if (module.arrayListOffset < ModuleManager.this.renderer.getStringWidth(text) && Util.mc.world != null) {
                            final Module module4 = module;
                            module4.arrayListOffset += module.offset;
                            module.sliding = true;
                        }
                        else {
                            module.sliding = false;
                        }
                    }
                }
            }
            else {
                for (final String e : ModuleManager.this.sortedModulesABC) {
                    final ModuleManager moduleManager = Stay.moduleManager;
                    final Module module2 = ModuleManager.getModuleByName(e);
                    final String text2 = module2.getDisplayName() + ChatFormatting.GRAY + ((module2.getDisplayInfo() != null) ? (" [" + ChatFormatting.WHITE + module2.getDisplayInfo() + ChatFormatting.GRAY + "]") : "");
                    module2.offset = ModuleManager.this.renderer.getStringWidth(text2) / (float)HUD.getInstance().animationHorizontalTime.getValue();
                    module2.vOffset = ModuleManager.this.renderer.getFontHeight() / (float)HUD.getInstance().animationVerticalTime.getValue();
                    if (module2.isEnabled() && (int)HUD.getInstance().animationHorizontalTime.getValue() != 1) {
                        if (module2.arrayListOffset <= module2.offset) {
                            continue;
                        }
                        if (Util.mc.world == null) {
                            continue;
                        }
                        final Module module5 = module2;
                        module5.arrayListOffset -= module2.offset;
                        module2.sliding = true;
                    }
                    else {
                        if (!module2.isDisabled()) {
                            continue;
                        }
                        if ((int)HUD.getInstance().animationHorizontalTime.getValue() == 1) {
                            continue;
                        }
                        if (module2.arrayListOffset < ModuleManager.this.renderer.getStringWidth(text2) && Util.mc.world != null) {
                            final Module module6 = module2;
                            module6.arrayListOffset += module2.offset;
                            module2.sliding = true;
                        }
                        else {
                            module2.sliding = false;
                        }
                    }
                }
            }
        }
        
        @Override
        public void start() {
            System.out.println("Starting animation thread.");
            this.service.scheduleAtFixedRate(this, 0L, 1L, TimeUnit.MILLISECONDS);
        }
    }
}
