//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f" }, d2 = { "Lme/alpha432/stay/event/KeyPressedEvent;", "Lme/alpha432/stay/event/EventStage;", "info", "", "pressed", "(ZZ)V", "getInfo", "()Z", "setInfo", "(Z)V", "getPressed", "setPressed", "Stay" })
public final class KeyPressedEvent extends EventStage
{
    private boolean info;
    private boolean pressed;
    
    public KeyPressedEvent(final boolean info, final boolean pressed) {
        this.info = info;
        this.pressed = pressed;
    }
    
    public final boolean getInfo() {
        return this.info;
    }
    
    public final void setInfo(final boolean <set-?>) {
        this.info = <set-?>;
    }
    
    public final boolean getPressed() {
        return this.pressed;
    }
    
    public final void setPressed(final boolean <set-?>) {
        this.pressed = <set-?>;
    }
}
