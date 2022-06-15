//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem;

import kotlin.*;
import org.jetbrains.annotations.*;
import cakeslayers.team.eventsystem.utils.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015" }, d2 = { "Lcakeslayers/team/eventsystem/AbstractListener;", "F", "", "owner", "eventID", "", "priority", "function", "(Ljava/lang/Object;IILjava/lang/Object;)V", "getEventID", "()I", "getFunction", "()Ljava/lang/Object;", "Ljava/lang/Object;", "ownerName", "", "getOwnerName", "()Ljava/lang/String;", "getPriority", "Lcakeslayers/team/eventsystem/Listener;", "Lcakeslayers/team/eventsystem/ParallelListener;", "Stay" })
public abstract class AbstractListener<F>
{
    private final int eventID;
    private final int priority;
    private final F function;
    @NotNull
    private final String ownerName;
    
    private AbstractListener(final Object owner, final int eventID, final int priority, final F function) {
        this.eventID = eventID;
        this.priority = priority;
        this.function = function;
        String nameAsString;
        if (owner instanceof Nameable) {
            nameAsString = ((Nameable)owner).getNameAsString();
        }
        else {
            final String simpleName = owner.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue((Object)simpleName, "owner.javaClass.simpleName");
            nameAsString = simpleName;
        }
        this.ownerName = nameAsString;
    }
    
    public final int getEventID() {
        return this.eventID;
    }
    
    public final int getPriority() {
        return this.priority;
    }
    
    public final F getFunction() {
        return this.function;
    }
    
    @NotNull
    public final String getOwnerName() {
        return this.ownerName;
    }
}
