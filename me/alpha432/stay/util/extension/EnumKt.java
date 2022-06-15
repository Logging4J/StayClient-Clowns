//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.extension;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "next", "E", "", "(Ljava/lang/Enum;)Ljava/lang/Enum;", "Stay" })
public final class EnumKt
{
    @NotNull
    public static final <E extends Enum<E>> E next(@NotNull final E $this$next) {
        Intrinsics.checkNotNullParameter((Object)$this$next, "<this>");
        final Enum[] $this$next_u24lambda_u2d0 = $this$next.getDeclaringClass().getEnumConstants();
        final int n = 0;
        final Enum enum1 = $this$next_u24lambda_u2d0[($this$next.ordinal() + 1) % $this$next_u24lambda_u2d0.length];
        Intrinsics.checkNotNullExpressionValue((Object)enum1, "next");
        return (E)enum1;
    }
}
