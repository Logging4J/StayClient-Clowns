//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.utils;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcakeslayers/team/eventsystem/utils/Nameable;", "", "name", "", "getName", "()Ljava/lang/CharSequence;", "nameAsString", "", "getNameAsString", "()Ljava/lang/String;", "Stay" })
public interface Nameable
{
    @NotNull
    CharSequence getName();
    
    @NotNull
    String getNameAsString();
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        @NotNull
        public static String getNameAsString(@NotNull final Nameable this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            return this.getName().toString();
        }
    }
}
