//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.loader;

import java.awt.*;
import javax.swing.*;

public class DialogueWindow extends JFrame
{
    public DialogueWindow(final String title, final String message) {
        this.setTitle(title);
        this.setDefaultCloseOperation(2);
        this.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(this, message, title, -1, UIManager.getIcon("OptionPane.warningIcon"));
    }
}
