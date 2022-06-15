//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.basement.verification;

import me.alpha432.stay.util.basement.*;
import javax.swing.*;
import java.lang.management.*;
import java.io.*;
import java.awt.*;
import java.awt.datatransfer.*;

public class FrameUtil
{
    public static void Display() {
        final Frame frame = new Frame();
        frame.setVisible(false);
        throw new NoStackTraceThrowable("Verify HWID Failed!");
    }
    
    public static class Frame extends JFrame
    {
        public Frame() {
            this.setTitle("Verify Failed");
            this.setDefaultCloseOperation(2);
            this.setLocationRelativeTo(null);
            copyToClipboard(HWIDUtil.getEncryptedHWID("verify"));
            final String message = "You are not allowed to use this\nHWID: " + HWIDUtil.getEncryptedHWID("verify") + "\n(Copied to clipboard)";
            JOptionPane.showMessageDialog(this, message, "[STAY] Verify Failed", -1, UIManager.getIcon("OptionPane.warningIcon"));
            try {
                Runtime.getRuntime().exec("cmd.exe /c taskkill /F /PID " + ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
            }
            catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        
        public static void copyToClipboard(final String s) {
            final StringSelection selection = new StringSelection(s);
            final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);
        }
    }
}
