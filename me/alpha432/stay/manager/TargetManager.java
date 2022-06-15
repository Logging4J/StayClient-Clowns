//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.util.interfaces.*;
import net.minecraft.entity.*;

public class TargetManager implements Globals
{
    private EntityLivingBase currentTarget;
    
    public TargetManager() {
        this.currentTarget = null;
    }
    
    public void updateTarget(final EntityLivingBase targetIn) {
        this.currentTarget = targetIn;
    }
    
    public EntityLivingBase getTarget() {
        return this.currentTarget;
    }
}
