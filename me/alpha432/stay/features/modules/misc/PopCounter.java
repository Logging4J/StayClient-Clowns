//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import java.util.*;
import me.alpha432.stay.features.setting.*;
import net.minecraft.entity.player.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import me.alpha432.stay.manager.*;

public class PopCounter extends Module
{
    public static HashMap<String, Integer> TotemPopContainer;
    public static PopCounter INSTANCE;
    public final Setting<String> clientname;
    
    public PopCounter() {
        super("PopCounter", "Counts other players totem pops.", Category.MISC, true, false, false);
        this.clientname = (Setting<String>)this.register(new Setting("Name", (T)"onpoint.ie"));
        this.setInstance();
    }
    
    public static PopCounter getInstance() {
        if (PopCounter.INSTANCE == null) {
            PopCounter.INSTANCE = new PopCounter();
        }
        return PopCounter.INSTANCE;
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
    }
    
    private void setInstance() {
        PopCounter.INSTANCE = this;
    }
    
    @Override
    public void onEnable() {
        PopCounter.TotemPopContainer.clear();
    }
    
    public void onDeath(final EntityPlayer player) {
        if (PopCounter.TotemPopContainer.containsKey(player.getName())) {
            final int l_Count = PopCounter.TotemPopContainer.get(player.getName());
            PopCounter.TotemPopContainer.remove(player.getName());
            if (l_Count == 1) {
                Command.sendSilentMessage(ChatFormatting.RED + player.getName() + " died after popping " + ChatFormatting.GRAY + l_Count + ChatFormatting.RED + ChatFormatting.RED + " totem, thanks to " + this.clientname.getValueAsString());
            }
            else {
                Command.sendSilentMessage(ChatFormatting.RED + player.getName() + " died after popping " + ChatFormatting.GRAY + l_Count + ChatFormatting.RED + ChatFormatting.RED + " totems, thanks to " + this.clientname.getValueAsString());
            }
        }
    }
    
    public void onTotemPop(final EntityPlayer player) {
        if (fullNullCheck()) {
            return;
        }
        if (PopCounter.mc.player.equals((Object)player)) {
            return;
        }
        int l_Count = 1;
        if (PopCounter.TotemPopContainer.containsKey(player.getName())) {
            l_Count = PopCounter.TotemPopContainer.get(player.getName());
            PopCounter.TotemPopContainer.put(player.getName(), ++l_Count);
        }
        else {
            PopCounter.TotemPopContainer.put(player.getName(), l_Count);
        }
        if (l_Count == 1) {
            NotificationManager.INSTANCE.push(player.getName() + " popped " + ChatFormatting.GRAY + l_Count + ChatFormatting.RED + " totem", NotificationType.INFO, 1500L);
        }
        else {
            NotificationManager.INSTANCE.push(player.getName() + " popped " + ChatFormatting.GRAY + l_Count + ChatFormatting.RED + " totems", NotificationType.INFO, 1500L);
        }
    }
    
    static {
        PopCounter.TotemPopContainer = new HashMap<String, Integer>();
        PopCounter.INSTANCE = new PopCounter();
    }
}
