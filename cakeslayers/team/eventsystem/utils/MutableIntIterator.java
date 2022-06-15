//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package cakeslayers.team.eventsystem.utils;

import java.util.*;
import kotlin.jvm.internal.markers.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006" }, d2 = { "Lcakeslayers/team/eventsystem/utils/MutableIntIterator;", "", "", "next", "()Ljava/lang/Integer;", "nextInt", "Stay" })
public interface MutableIntIterator extends Iterator<Integer>, KMutableIterator
{
    @NotNull
    Integer next();
    
    int nextInt();
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        @NotNull
        public static Integer next(@NotNull final MutableIntIterator this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            return this.nextInt();
        }
    }
}
