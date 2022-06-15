//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.init.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;

public class Anti32KTotem extends Module
{
    public Anti32KTotem() {
        super("Anti32KTotem", "Anti32KTotem", Category.COMBAT, true, false, false);
    }
    
    @Override
    public void onUpdate() {
        if (!(Anti32KTotem.mc.currentScreen instanceof GuiContainer) && Anti32KTotem.mc.player.inventory.getStackInSlot(0).getItem() != Items.TOTEM_OF_UNDYING) {
            for (int i = 9; i < 35; ++i) {
                if (Anti32KTotem.mc.player.inventory.getStackInSlot(i).getItem() == Items.TOTEM_OF_UNDYING) {
                    Anti32KTotem.mc.playerController.windowClick(Anti32KTotem.mc.player.inventoryContainer.windowId, i, 0, ClickType.SWAP, (EntityPlayer)Anti32KTotem.mc.player);
                    break;
                }
            }
        }
    }
}
