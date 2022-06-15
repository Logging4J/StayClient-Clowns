//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.loader;

import java.awt.*;
import java.awt.datatransfer.*;

public class Loader
{
    public static void load() throws Exception {
        final String hardwareID = HWIDUtil.getEncryptedHWID("cuicanIsYourDaddy");
        final String result = "[Passed]";
        if (result.equals("[NotPass]")) {
            copyToClipboard(hardwareID);
            new DialogueWindow("Not passed verification!", "You are not allowed to use Stay Client!\nHWID(Copied) : " + hardwareID).setVisible(false);
        }
        else if (!result.equals("[Passed]")) {
            new DialogueWindow("Time out", "Can't connect to the server.Please try again a later!").setVisible(false);
        }
        if (result.equals("[Passed]")) {
            ForgeEntry.shouldLoad = true;
        }
    }
    
    private static void copyToClipboard(final String s) {
        final StringSelection selection = new StringSelection(s);
        final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}
