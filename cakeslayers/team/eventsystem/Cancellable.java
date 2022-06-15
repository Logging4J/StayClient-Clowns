//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcakeslayers/team/eventsystem/Cancellable;", "Lcakeslayers/team/eventsystem/ICancellable;", "()V", "value", "", "cancelled", "getCancelled", "()Z", "setCancelled", "(Z)V", "Stay" })
public class Cancellable implements ICancellable
{
    private boolean cancelled;
    
    @Override
    public boolean getCancelled() {
        return this.cancelled;
    }
    
    @Override
    public void setCancelled(final boolean value) {
        this.cancelled = (this.cancelled || value);
    }
    
    @Override
    public void cancel() {
        DefaultImpls.cancel(this);
    }
}
