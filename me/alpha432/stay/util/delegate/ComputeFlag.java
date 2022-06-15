//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.delegate;

import kotlin.properties.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J$\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0096\u0002¢\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lme/alpha432/stay/util/delegate/ComputeFlag;", "Lkotlin/properties/ReadOnlyProperty;", "", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "value", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Boolean;", "Stay" })
public final class ComputeFlag implements ReadOnlyProperty<Object, Boolean>
{
    @NotNull
    private final Function0<Boolean> block;
    private boolean value;
    
    public ComputeFlag(@NotNull final Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter((Object)block, "block");
        this.block = block;
    }
    
    @NotNull
    public Boolean getValue(@Nullable final Object thisRef, @NotNull final KProperty<?> property) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        if (!this.value) {
            final Object invoke = this.block.invoke();
            final boolean it = (boolean)invoke;
            final int n = 0;
            this.value = it;
            if (!(boolean)invoke) {
                return false;
            }
        }
        return true;
    }
}
