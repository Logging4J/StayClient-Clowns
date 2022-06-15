//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import net.minecraft.client.gui.*;

public class AntiDeathScreen extends Module
{
    public AntiDeathScreen() {
        super("AntiDeathScreen", "AntiDeathScreen", Category.MISC, true, false, false);
    }
    
    @Override
    public void onUpdate() {
        if (AntiDeathScreen.mc.currentScreen instanceof GuiGameOver) {
            AntiDeathScreen.mc.player.respawnPlayer();
            AntiDeathScreen.mc.displayGuiScreen((GuiScreen)null);
        }
    }
}
