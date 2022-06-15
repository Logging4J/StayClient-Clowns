//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import java.util.*;
import me.alpha432.stay.features.command.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import me.alpha432.stay.client.*;

public class AutoQueue extends Module
{
    private boolean firstrun;
    private static Image image;
    private static TrayIcon trayIcon;
    Map<String, String> QA;
    
    public AutoQueue() {
        super("AutoQueue", "Automatically queue in 2b2t.xin", Category.MISC, true, false, false);
        this.firstrun = true;
        this.QA = new HashMap<String, String>() {
            {
                this.put("\u9f99\u86cb", "B");
                this.put("\u4f20\u9001", "B");
                this.put("\u5927\u7bb1\u5b50", "C");
                this.put("\u5c0f\u7bb1\u5b50", "B");
                this.put("HIM", "A");
                this.put("\u95ea\u7535\u51fb\u4e2d", "B");
                this.put("\u5b98\u65b9\u8bd1\u540d", "C");
                this.put("\u94bb\u77f3", "C");
                this.put("\u706b\u7130\u5f39", "B");
                this.put("\u5357\u74dc", "B");
                this.put("\u4ec0\u4e48\u52a8\u7269", "B");
                this.put("\u7f8a\u9a7c", "B");
                this.put("\u6316\u6398", "C");
                this.put("\u51cb\u96f6", "C");
                this.put("\u5708\u5730", "B");
                this.put("\u65e0\u9650\u6c34", "C");
                this.put("\u672b\u5f71\u4e4b\u773c", "A");
                this.put("\u7ea2\u77f3\u706b\u628a", "B");
                this.put("\u51e0\u9875", "A");
                this.put("\u933e", "B");
                this.put("\u9644\u9b54\u91d1", "B");
            }
        };
    }
    
    @Override
    public void onEnable() {
        if (nullCheck()) {
            return;
        }
        if (AutoQueue.mc.getCurrentServerData().serverIP == null && !AutoQueue.mc.getCurrentServerData().serverIP.equals("2b2t.xin")) {
            Command.sendMessage("Only support 2b2t.xin!");
            this.disable();
            return;
        }
        if (this.firstrun) {
            if (SystemTray.isSupported()) {
                AutoQueue.trayIcon.setImageAutoSize(true);
                AutoQueue.trayIcon.setToolTip("Start Queueing");
            }
            else {
                System.err.println("System tray not supported!");
            }
            this.firstrun = false;
        }
    }
    
    @SubscribeEvent
    public void onGuiUpdate(final GuiScreenEvent event) {
        if (fullNullCheck()) {
            return;
        }
        if (event.getGui() instanceof GuiDownloadTerrain) {
            if (SystemTray.isSupported()) {
                displayTray();
                AutoQueue.trayIcon.setToolTip("Welcome " + AutoQueue.mc.player.getName());
                this.disable();
            }
            else {
                System.err.println("System tray not supported!");
                this.disable();
            }
        }
    }
    
    @SubscribeEvent
    public void onClientChatReceived(final ClientChatReceivedEvent event) {
        if (!AutoQueue.mc.getCurrentServerData().serverIP.equals("2b2t.xin")) {
            return;
        }
        if (event.getMessage().getUnformattedText().contains("§")) {
            final String s = event.getMessage().getUnformattedText().substring(15, 17);
            int sec;
            if (s.contains(" ")) {
                sec = Integer.parseInt(s.substring(0, 1));
            }
            else {
                sec = Integer.parseInt(s);
            }
            if (SystemTray.isSupported()) {
                AutoQueue.trayIcon.setToolTip("Queueing: " + sec);
            }
            if (sec <= 2) {
                return;
            }
        }
        final String msg = event.getMessage().getUnformattedText();
        final Map.Entry<String, String> Answer = this.QA.entrySet().stream().filter(p -> msg.contains(p.getKey())).findFirst().orElse(null);
        if (Answer != null) {
            AutoQueue.mc.player.connection.sendPacket((Packet)new CPacketChatMessage((String)Answer.getValue()));
        }
    }
    
    public static void displayTray() {
        AutoQueue.trayIcon.displayMessage("Auto Queue", "\u6392\u5b8c\u961f\u8fa3 " + AutoQueue.mc.player.getName(), TrayIcon.MessageType.NONE);
    }
    
    static {
        AutoQueue.image = Stay.image;
        AutoQueue.trayIcon = Stay.trayIcon;
    }
}
