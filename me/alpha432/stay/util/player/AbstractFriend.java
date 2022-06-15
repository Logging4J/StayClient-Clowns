//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.player;

import me.alpha432.stay.util.interfaces.*;

public abstract class AbstractFriend implements INameable, IFriendable
{
    private String name;
    private String alias;
    
    public AbstractFriend(final String name, final String alias) {
        this.name = name;
        this.alias = alias;
    }
    
    public String getAlias() {
        return this.alias;
    }
    
    public void setAlias(final String alias) {
        this.alias = alias;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDisplayName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setDisplayName(final String displayName) {
        this.name = this.name;
    }
}
