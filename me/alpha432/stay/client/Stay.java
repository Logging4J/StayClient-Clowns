//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.util.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import me.alpha432.stay.manager.*;
import kotlin.jvm.*;
import org.apache.logging.log4j.*;
import kotlin.jvm.internal.*;
import me.alpha432.stay.util.basement.*;
import me.alpha432.stay.loader.*;
import java.awt.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.thread.*;
import kotlin.jvm.functions.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lme/alpha432/stay/client/Stay;", "", "()V", "tray", "Ljava/awt/SystemTray;", "kotlin.jvm.PlatformType", "getTray", "()Ljava/awt/SystemTray;", "setTray", "(Ljava/awt/SystemTray;)V", "Companion", "Stay" })
public final class Stay
{
    @NotNull
    public static final Companion Companion;
    private SystemTray tray;
    @NotNull
    public static final String MOD_ID = "stay";
    @NotNull
    public static final String MOD_NAME = "Stay";
    @NotNull
    public static final String VERSION = "1.0 release+b1";
    @JvmField
    @NotNull
    public static final Logger LOGGER;
    @JvmField
    @Nullable
    public static TimerManager timerManager;
    @JvmField
    @Nullable
    public static CommandManager commandManager;
    @JvmField
    @Nullable
    public static FriendManager friendManager;
    @JvmField
    @Nullable
    public static ModuleManager moduleManager;
    @Nullable
    private static PacketManager packetManager;
    @JvmField
    @Nullable
    public static ColorManager colorManager;
    @JvmField
    @Nullable
    public static TotemPopManager POP_MANAGER;
    @Nullable
    private static HoleManager holeManager;
    @JvmField
    @Nullable
    public static InventoryManager inventoryManager;
    @JvmField
    @Nullable
    public static PotionManager potionManager;
    @JvmField
    @Nullable
    public static RotationManager rotationManager;
    @JvmField
    @Nullable
    public static PositionManager positionManager;
    @JvmField
    @Nullable
    public static SpeedManager speedManager;
    @Nullable
    private static ReloadManager reloadManager;
    @Nullable
    private static FileManager fileManager;
    @JvmField
    @Nullable
    public static ConfigManager configManager;
    @JvmField
    @Nullable
    public static ServerManager serverManager;
    @JvmField
    @Nullable
    public static EventManager eventManager;
    @JvmField
    @Nullable
    public static TextManager textManager;
    @JvmField
    @Nullable
    public static TextManager italicTextManager;
    @JvmField
    @Nullable
    public static TargetManager targetManager;
    @JvmField
    @Nullable
    public static TextManager fontRenderer;
    @Nullable
    private static Render3DEvent render3DEvent;
    @JvmField
    @Nullable
    public static Enemy enemy;
    @NotNull
    private static final EventBus EVENT_BUS;
    @JvmField
    @NotNull
    public static MenuFont MENU_FONT_MANAGER;
    @JvmField
    @NotNull
    public static GuiFont GUI_FONT_MANAGER;
    @JvmField
    @NotNull
    public static DonatorFont DONATOR_FONT_MANAGER;
    @JvmField
    @NotNull
    public static NotificationManager notificationManager;
    @NotNull
    private static SongManager SONG_MANAGER;
    private static boolean unloaded;
    @JvmField
    public static Image image;
    @JvmField
    @NotNull
    public static TrayIcon trayIcon;
    @NotNull
    private static Stay INSTANCE;
    
    public Stay() {
        this.tray = SystemTray.getSystemTray();
    }
    
    public final SystemTray getTray() {
        return this.tray;
    }
    
    public final void setTray(final SystemTray <set-?>) {
        this.tray = <set-?>;
    }
    
    @JvmStatic
    public static final void preInit() {
        Stay.Companion.preInit();
    }
    
    @JvmStatic
    public static final void postInit() {
        Stay.Companion.postInit();
    }
    
    @JvmStatic
    public static final void load() {
        Stay.Companion.load();
    }
    
    @JvmStatic
    public static final void unload(final boolean unload) {
        Stay.Companion.unload(unload);
    }
    
    @JvmStatic
    public static final void reload() {
        Stay.Companion.reload();
    }
    
    @JvmStatic
    public static final void onUnload() {
        Stay.Companion.onUnload();
    }
    
    public static final /* synthetic */ PacketManager access$getPacketManager$cp() {
        return Stay.packetManager;
    }
    
    public static final /* synthetic */ void access$setPacketManager$cp(final PacketManager <set-?>) {
        Stay.packetManager = <set-?>;
    }
    
    public static final /* synthetic */ HoleManager access$getHoleManager$cp() {
        return Stay.holeManager;
    }
    
    public static final /* synthetic */ void access$setHoleManager$cp(final HoleManager <set-?>) {
        Stay.holeManager = <set-?>;
    }
    
    public static final /* synthetic */ ReloadManager access$getReloadManager$cp() {
        return Stay.reloadManager;
    }
    
    public static final /* synthetic */ void access$setReloadManager$cp(final ReloadManager <set-?>) {
        Stay.reloadManager = <set-?>;
    }
    
    public static final /* synthetic */ FileManager access$getFileManager$cp() {
        return Stay.fileManager;
    }
    
    public static final /* synthetic */ void access$setFileManager$cp(final FileManager <set-?>) {
        Stay.fileManager = <set-?>;
    }
    
    public static final /* synthetic */ Render3DEvent access$getRender3DEvent$cp() {
        return Stay.render3DEvent;
    }
    
    public static final /* synthetic */ void access$setRender3DEvent$cp(final Render3DEvent <set-?>) {
        Stay.render3DEvent = <set-?>;
    }
    
    public static final /* synthetic */ EventBus access$getEVENT_BUS$cp() {
        return Stay.EVENT_BUS;
    }
    
    public static final /* synthetic */ SongManager access$getSONG_MANAGER$cp() {
        return Stay.SONG_MANAGER;
    }
    
    public static final /* synthetic */ void access$setSONG_MANAGER$cp(final SongManager <set-?>) {
        Stay.SONG_MANAGER = <set-?>;
    }
    
    public static final /* synthetic */ void access$setUnloaded$cp(final boolean <set-?>) {
        Stay.unloaded = <set-?>;
    }
    
    public static final /* synthetic */ boolean access$getUnloaded$cp() {
        return Stay.unloaded;
    }
    
    public static final /* synthetic */ Stay access$getINSTANCE$cp() {
        return Stay.INSTANCE;
    }
    
    public static final /* synthetic */ void access$setINSTANCE$cp(final Stay <set-?>) {
        Stay.INSTANCE = <set-?>;
    }
    
    static {
        Companion = new Companion(null);
        final Logger logger = LogManager.getLogger("Stay");
        Intrinsics.checkNotNullExpressionValue((Object)logger, "getLogger(MOD_NAME)");
        LOGGER = logger;
        Stay.fontRenderer = Stay.textManager;
        EVENT_BUS = new EventBus();
        Stay.MENU_FONT_MANAGER = new MenuFont();
        Stay.GUI_FONT_MANAGER = new GuiFont();
        Stay.DONATOR_FONT_MANAGER = new DonatorFont();
        Stay.notificationManager = NotificationManager.INSTANCE;
        Stay.SONG_MANAGER = new SongManager();
        Stay.image = Toolkit.getDefaultToolkit().createImage(Stay.class.getResource("/assets/cuican/icons/icon-32x.png"));
        Stay.trayIcon = new TrayIcon(Stay.image, "Auto Queue");
        Stay.INSTANCE = new Stay();
        final Companion companion = Stay.Companion;
        Stay.unloaded = false;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010j\u001a\u00020kH\u0007J\b\u0010l\u001a\u00020kH\u0007J\b\u0010m\u001a\u00020kH\u0007J\b\u0010n\u001a\u00020kH\u0007J\b\u0010o\u001a\u00020kH\u0007J\b\u0010p\u001a\u00020kH\u0002J\u0010\u0010q\u001a\u00020k2\u0006\u0010q\u001a\u00020iH\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\n =*\u0004\u0018\u00010<0<8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010C\u001a\u00020D8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010K\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010M\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010O\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010U\u001a\u0004\u0018\u00010VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010f\u001a\u00020g8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006r" }, d2 = { "Lme/alpha432/stay/client/Stay$Companion;", "", "()V", "DONATOR_FONT_MANAGER", "Lme/alpha432/stay/manager/DonatorFont;", "EVENT_BUS", "Lnet/minecraftforge/fml/common/eventhandler/EventBus;", "getEVENT_BUS", "()Lnet/minecraftforge/fml/common/eventhandler/EventBus;", "GUI_FONT_MANAGER", "Lme/alpha432/stay/manager/GuiFont;", "INSTANCE", "Lme/alpha432/stay/client/Stay;", "getINSTANCE", "()Lme/alpha432/stay/client/Stay;", "setINSTANCE", "(Lme/alpha432/stay/client/Stay;)V", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "MENU_FONT_MANAGER", "Lme/alpha432/stay/manager/MenuFont;", "MOD_ID", "", "MOD_NAME", "POP_MANAGER", "Lme/alpha432/stay/manager/TotemPopManager;", "SONG_MANAGER", "Lme/alpha432/stay/manager/SongManager;", "getSONG_MANAGER", "()Lme/alpha432/stay/manager/SongManager;", "setSONG_MANAGER", "(Lme/alpha432/stay/manager/SongManager;)V", "VERSION", "colorManager", "Lme/alpha432/stay/manager/ColorManager;", "commandManager", "Lme/alpha432/stay/manager/CommandManager;", "configManager", "Lme/alpha432/stay/manager/ConfigManager;", "enemy", "Lme/alpha432/stay/util/player/Enemy;", "eventManager", "Lme/alpha432/stay/manager/EventManager;", "fileManager", "Lme/alpha432/stay/manager/FileManager;", "getFileManager", "()Lme/alpha432/stay/manager/FileManager;", "setFileManager", "(Lme/alpha432/stay/manager/FileManager;)V", "fontRenderer", "Lme/alpha432/stay/manager/TextManager;", "friendManager", "Lme/alpha432/stay/manager/FriendManager;", "holeManager", "Lme/alpha432/stay/manager/HoleManager;", "getHoleManager", "()Lme/alpha432/stay/manager/HoleManager;", "setHoleManager", "(Lme/alpha432/stay/manager/HoleManager;)V", "image", "Ljava/awt/Image;", "kotlin.jvm.PlatformType", "inventoryManager", "Lme/alpha432/stay/manager/InventoryManager;", "italicTextManager", "moduleManager", "Lme/alpha432/stay/manager/ModuleManager;", "notificationManager", "Lme/alpha432/stay/manager/NotificationManager;", "packetManager", "Lme/alpha432/stay/manager/PacketManager;", "getPacketManager", "()Lme/alpha432/stay/manager/PacketManager;", "setPacketManager", "(Lme/alpha432/stay/manager/PacketManager;)V", "positionManager", "Lme/alpha432/stay/manager/PositionManager;", "potionManager", "Lme/alpha432/stay/manager/PotionManager;", "reloadManager", "Lme/alpha432/stay/manager/ReloadManager;", "getReloadManager", "()Lme/alpha432/stay/manager/ReloadManager;", "setReloadManager", "(Lme/alpha432/stay/manager/ReloadManager;)V", "render3DEvent", "Lme/alpha432/stay/event/Render3DEvent;", "getRender3DEvent", "()Lme/alpha432/stay/event/Render3DEvent;", "setRender3DEvent", "(Lme/alpha432/stay/event/Render3DEvent;)V", "rotationManager", "Lme/alpha432/stay/manager/RotationManager;", "serverManager", "Lme/alpha432/stay/manager/ServerManager;", "speedManager", "Lme/alpha432/stay/manager/SpeedManager;", "targetManager", "Lme/alpha432/stay/manager/TargetManager;", "textManager", "timerManager", "Lme/alpha432/stay/manager/TimerManager;", "trayIcon", "Ljava/awt/TrayIcon;", "unloaded", "", "load", "", "onUnload", "postInit", "preInit", "reload", "setWindowIcon", "unload", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        @Nullable
        public final PacketManager getPacketManager() {
            return Stay.access$getPacketManager$cp();
        }
        
        public final void setPacketManager(@Nullable final PacketManager <set-?>) {
            Stay.access$setPacketManager$cp(<set-?>);
        }
        
        @Nullable
        public final HoleManager getHoleManager() {
            return Stay.access$getHoleManager$cp();
        }
        
        public final void setHoleManager(@Nullable final HoleManager <set-?>) {
            Stay.access$setHoleManager$cp(<set-?>);
        }
        
        @Nullable
        public final ReloadManager getReloadManager() {
            return Stay.access$getReloadManager$cp();
        }
        
        public final void setReloadManager(@Nullable final ReloadManager <set-?>) {
            Stay.access$setReloadManager$cp(<set-?>);
        }
        
        @Nullable
        public final FileManager getFileManager() {
            return Stay.access$getFileManager$cp();
        }
        
        public final void setFileManager(@Nullable final FileManager <set-?>) {
            Stay.access$setFileManager$cp(<set-?>);
        }
        
        @Nullable
        public final Render3DEvent getRender3DEvent() {
            return Stay.access$getRender3DEvent$cp();
        }
        
        public final void setRender3DEvent(@Nullable final Render3DEvent <set-?>) {
            Stay.access$setRender3DEvent$cp(<set-?>);
        }
        
        @NotNull
        public final EventBus getEVENT_BUS() {
            return Stay.access$getEVENT_BUS$cp();
        }
        
        @NotNull
        public final SongManager getSONG_MANAGER() {
            return Stay.access$getSONG_MANAGER$cp();
        }
        
        public final void setSONG_MANAGER(@NotNull final SongManager <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            Stay.access$setSONG_MANAGER$cp(<set-?>);
        }
        
        @JvmStatic
        public final void preInit() {
            Stay.trayIcon.setImageAutoSize(true);
            Stay.trayIcon.setToolTip("Hello User, thanks for using Stay 1.0 release+b1!");
            try {
                this.getINSTANCE().getTray().add(Stay.trayIcon);
            }
            catch (AWTException e) {
                e.printStackTrace();
            }
            Stay.trayIcon.displayMessage("Stay", "Hello User, thanks for using Stay 1.0 release+b1!", TrayIcon.MessageType.NONE);
            Stay.LOGGER.info("Preparing to initialize Stay 1.0 release+b1");
            ForgeEntry.register(Title.INSTANCE);
            Stay.textManager = new TextManager();
            final TextManager textManager = Stay.textManager;
            Intrinsics.checkNotNull((Object)textManager);
            textManager.init(true);
            final TextManager $this$preInit_u24lambda_u2d0 = new TextManager();
            final int n = 0;
            $this$preInit_u24lambda_u2d0.setFontRenderer(Font.createFont(0, Stay.class.getResourceAsStream("/assets/cuican/LexendDeca-Regular.ttf")).deriveFont((float)FontMod.getInstance().fontSize.getValue().intValue()), true, true);
            Stay.italicTextManager = $this$preInit_u24lambda_u2d0;
            final TextManager italicTextManager = Stay.italicTextManager;
            Intrinsics.checkNotNull((Object)italicTextManager);
            italicTextManager.init(true);
            Stay.fontRenderer = Stay.textManager;
            Stay.LOGGER.info("TextRender loaded.");
            BuildersKt.launch$default(CoroutineUtilsKt.getMainScope(), (CoroutineContext)null, (CoroutineStart)null, (Function2)new Stay$Companion$preInit.Stay$Companion$preInit$2((Continuation)null), 3, (Object)null);
            this.setWindowIcon();
        }
        
        @JvmStatic
        public final void postInit() {
            BuildersKt.launch$default(CoroutineUtilsKt.getLoadingScope(), (CoroutineContext)null, (CoroutineStart)null, (Function2)new Stay$Companion$postInit.Stay$Companion$postInit$1((Continuation)null), 3, (Object)null);
        }
        
        @JvmStatic
        public final void load() {
            Stay.LOGGER.info("loading stay");
            Stay.access$setUnloaded$cp(false);
            if (this.getReloadManager() != null) {
                final ReloadManager reloadManager = this.getReloadManager();
                Intrinsics.checkNotNull((Object)reloadManager);
                reloadManager.unload();
                this.setReloadManager(null);
            }
            BuildersKt.launch$default(CoroutineUtilsKt.getLoadingScope(), (CoroutineContext)null, (CoroutineStart)null, (Function2)new Stay$Companion$load.Stay$Companion$load$1((Continuation)null), 3, (Object)null);
        }
        
        @JvmStatic
        public final void unload(final boolean unload) {
            Stay.LOGGER.info("unloading stay");
            if (unload) {
                this.setReloadManager(new ReloadManager());
                final ReloadManager reloadManager = this.getReloadManager();
                Intrinsics.checkNotNull((Object)reloadManager);
                String prefix;
                if (Stay.commandManager != null) {
                    final CommandManager commandManager = Stay.commandManager;
                    Intrinsics.checkNotNull((Object)commandManager);
                    prefix = commandManager.getPrefix();
                }
                else {
                    prefix = ".";
                }
                reloadManager.init(prefix);
            }
            this.onUnload();
            Stay.eventManager = null;
            Stay.friendManager = null;
            Stay.speedManager = null;
            this.setHoleManager(null);
            Stay.positionManager = null;
            Stay.rotationManager = null;
            Stay.configManager = null;
            Stay.commandManager = null;
            Stay.colorManager = null;
            Stay.serverManager = null;
            this.setFileManager(null);
            Stay.potionManager = null;
            Stay.inventoryManager = null;
            Stay.moduleManager = null;
            Stay.textManager = null;
            Stay.LOGGER.info("stay unloaded!\n");
        }
        
        @JvmStatic
        public final void reload() {
            this.unload(false);
            this.load();
        }
        
        @JvmStatic
        public final void onUnload() {
            if (!Stay.access$getUnloaded$cp()) {
                final EventManager eventManager = Stay.eventManager;
                if (eventManager != null) {
                    eventManager.onUnload();
                }
                final ModuleManager moduleManager = Stay.moduleManager;
                if (moduleManager != null) {
                    moduleManager.onUnload();
                }
                final ConfigManager configManager = Stay.configManager;
                if (configManager != null) {
                    final ConfigManager configManager2 = Stay.configManager;
                    Intrinsics.checkNotNull((Object)configManager2);
                    final String config = configManager2.config;
                    Intrinsics.checkNotNullExpressionValue((Object)config, "configManager!!.config");
                    configManager.saveConfig(new Regex("Stay/").replaceFirst((CharSequence)config, ""));
                }
                final ModuleManager moduleManager2 = Stay.moduleManager;
                if (moduleManager2 != null) {
                    moduleManager2.onUnloadPost();
                }
                Stay.access$setUnloaded$cp(true);
            }
        }
        
        private final void setWindowIcon() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: getstatic       net/minecraft/util/Util$EnumOS.OSX:Lnet/minecraft/util/Util$EnumOS;
            //     6: if_acmpeq       172
            //     9: nop            
            //    10: ldc             Lme/alpha432/stay/client/Stay;.class
            //    12: ldc_w           "/assets/cuican/icons/icon-16x.png"
            //    15: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
            //    18: checkcast       Ljava/io/Closeable;
            //    21: astore_1       
            //    22: aconst_null    
            //    23: astore_2       
            //    24: nop            
            //    25: aload_1        
            //    26: checkcast       Ljava/io/InputStream;
            //    29: astore_3        /* inputStream16x */
            //    30: iconst_0       
            //    31: istore          $i$a$-use-Stay$Companion$setWindowIcon$1
            //    33: ldc             Lme/alpha432/stay/client/Stay;.class
            //    35: ldc_w           "/assets/cuican/icons/icon-32x.png"
            //    38: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
            //    41: checkcast       Ljava/io/Closeable;
            //    44: astore          5
            //    46: aconst_null    
            //    47: astore          6
            //    49: nop            
            //    50: aload           5
            //    52: checkcast       Ljava/io/InputStream;
            //    55: astore          inputStream32x
            //    57: iconst_0       
            //    58: istore          $i$a$-use-Stay$Companion$setWindowIcon$1$1
            //    60: iconst_2       
            //    61: anewarray       Ljava/nio/ByteBuffer;
            //    64: astore          9
            //    66: aload           9
            //    68: iconst_0       
            //    69: getstatic       me/alpha432/stay/util/graphics/image/IconUtil.INSTANCE:Lme/alpha432/stay/util/graphics/image/IconUtil;
            //    72: aload_3         /* inputStream16x */
            //    73: invokevirtual   me/alpha432/stay/util/graphics/image/IconUtil.readImageToBuffer:(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
            //    76: aastore        
            //    77: aload           9
            //    79: iconst_1       
            //    80: getstatic       me/alpha432/stay/util/graphics/image/IconUtil.INSTANCE:Lme/alpha432/stay/util/graphics/image/IconUtil;
            //    83: aload           inputStream32x
            //    85: invokevirtual   me/alpha432/stay/util/graphics/image/IconUtil.readImageToBuffer:(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
            //    88: aastore        
            //    89: aload           9
            //    91: astore          icons
            //    93: aload           icons
            //    95: invokestatic    org/lwjgl/opengl/Display.setIcon:([Ljava/nio/ByteBuffer;)I
            //    98: istore          null
            //   100: aload           5
            //   102: aload           6
            //   104: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
            //   107: iload           7
            //   109: goto            133
            //   112: astore          7
            //   114: aload           7
            //   116: astore          6
            //   118: aload           7
            //   120: athrow         
            //   121: astore          7
            //   123: aload           5
            //   125: aload           6
            //   127: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
            //   130: aload           7
            //   132: athrow         
            //   133: nop            
            //   134: istore_3        /* inputStream16x */
            //   135: aload_1        
            //   136: aload_2        
            //   137: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
            //   140: goto            172
            //   143: astore_3       
            //   144: aload_3        
            //   145: astore_2       
            //   146: aload_3        
            //   147: athrow         
            //   148: astore_3       
            //   149: aload_1        
            //   150: aload_2        
            //   151: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
            //   154: aload_3        
            //   155: athrow         
            //   156: astore_1        /* e */
            //   157: getstatic       me/alpha432/stay/client/Stay.LOGGER:Lorg/apache/logging/log4j/Logger;
            //   160: ldc_w           "Couldn't set Windows Icon"
            //   163: aload_1         /* e */
            //   164: checkcast       Ljava/lang/Throwable;
            //   167: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
            //   172: return         
            //    StackMapTable: 00 07 FF 00 70 00 07 07 00 02 07 01 D4 05 07 01 D6 01 07 01 D4 05 00 01 07 01 C2 FF 00 08 00 07 07 00 02 07 01 D4 05 07 01 D6 01 07 01 D4 07 01 C2 00 01 07 01 C2 FF 00 0B 00 0B 07 00 02 07 01 D4 05 07 01 D6 01 07 01 D4 05 01 01 07 01 F1 07 01 F1 00 01 01 FF 00 09 00 03 07 00 02 07 01 D4 05 00 01 07 01 C2 FF 00 04 00 03 07 00 02 07 01 D4 07 01 C2 00 01 07 01 C2 FF 00 07 00 01 07 00 02 00 01 07 01 C4 0F
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  49     100    112    121    Ljava/lang/Throwable;
            //  49     100    121    133    Any
            //  112    121    121    133    Any
            //  121    123    121    133    Any
            //  24     135    143    148    Ljava/lang/Throwable;
            //  24     135    148    156    Any
            //  143    148    148    156    Any
            //  148    149    148    156    Any
            //  9      156    156    172    Ljava/lang/Exception;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
            //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            //     at java.base/java.util.Objects.checkIndex(Objects.java:359)
            //     at java.base/java.util.ArrayList.remove(ArrayList.java:504)
            //     at com.strobel.assembler.ir.StackMappingVisitor.pop(StackMappingVisitor.java:267)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:414)
            //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:490)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:403)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
            //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
            //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
            //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
            //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
            //     at java.base/java.lang.Thread.run(Thread.java:833)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final Stay getINSTANCE() {
            return Stay.access$getINSTANCE$cp();
        }
        
        public final void setINSTANCE(@NotNull final Stay <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            Stay.access$setINSTANCE$cp(<set-?>);
        }
    }
}
