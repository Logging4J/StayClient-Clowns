//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f" }, d2 = { "Lme/alpha432/stay/event/PlayerJumpEvent;", "Lme/alpha432/stay/event/EventStage;", "motionX", "", "motionY", "(DD)V", "getMotionX", "()D", "setMotionX", "(D)V", "getMotionY", "setMotionY", "Stay" })
public final class PlayerJumpEvent extends EventStage
{
    private double motionX;
    private double motionY;
    
    public PlayerJumpEvent(final double motionX, final double motionY) {
        this.motionX = motionX;
        this.motionY = motionY;
    }
    
    public final double getMotionX() {
        return this.motionX;
    }
    
    public final void setMotionX(final double <set-?>) {
        this.motionX = <set-?>;
    }
    
    public final double getMotionY() {
        return this.motionY;
    }
    
    public final void setMotionY(final double <set-?>) {
        this.motionY = <set-?>;
    }
}
