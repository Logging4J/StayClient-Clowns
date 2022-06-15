//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.delegate;

import me.alpha432.stay.features.setting.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\tB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0002\u0010\rB5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\u0010\u000eB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0086\u0002¢\u0006\u0002\u0010\u0015J,\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0019¨\u0006\u001a" }, d2 = { "Lme/alpha432/stay/util/delegate/Value;", "T", "Lme/alpha432/stay/features/setting/Setting;", "name", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "min", "max", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "visibility", "Ljava/util/function/Predicate;", "description", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V", "getValue", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Stay" })
public final class Value<T> extends Setting<T>
{
    public Value(@NotNull final String name, final T defaultValue) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        super(name, (Object)defaultValue);
    }
    
    public Value(@NotNull final String name, final T defaultValue, final T min, final T max) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        super(name, (Object)defaultValue, (Object)min, (Object)max);
    }
    
    public Value(@NotNull final String name, final T defaultValue, final T min, final T max, @NotNull final Predicate<T> visibility, @NotNull final String description) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)visibility, "visibility");
        Intrinsics.checkNotNullParameter((Object)description, "description");
        super(name, (Object)defaultValue, (Object)min, (Object)max, (Predicate)visibility, description);
    }
    
    public Value(@NotNull final String name, final T defaultValue, final T min, final T max, @NotNull final Predicate<T> visibility) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)visibility, "visibility");
        super(name, (Object)defaultValue, (Object)min, (Object)max, (Predicate)visibility);
    }
    
    public Value(@NotNull final String name, final T defaultValue, @NotNull final Predicate<T> visibility) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)visibility, "visibility");
        super(name, (Object)defaultValue, (Predicate)visibility);
    }
    
    public final T getValue(@Nullable final Object thisRef, @NotNull final KProperty<?> property) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        return (T)this.value;
    }
    
    public final void setValue(@Nullable final Object thisRef, @NotNull final KProperty<?> property, final T value) {
        Intrinsics.checkNotNullParameter((Object)property, "property");
        this.setValue((Object)value);
    }
}
