//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.delegate;

import kotlin.*;
import me.alpha432.stay.features.modules.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import me.alpha432.stay.features.setting.*;
import kotlin.jvm.functions.*;
import me.alpha432.stay.util.extension.*;
import java.util.function.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0002¢\u0006\u0002\u0010\b\u001a;\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0006\u0010\t\u001a\u0002H\u00022\u0006\u0010\n\u001a\u0002H\u0002¢\u0006\u0002\u0010\u000b\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0014\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00142\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000e\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¨\u0006\u0018" }, d2 = { "setting", "Lme/alpha432/stay/util/delegate/Value;", "T", "", "Lme/alpha432/stay/features/modules/Module;", "name", "", "defaultValue", "(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;", "minValue", "maxValue", "(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lme/alpha432/stay/util/delegate/Value;", "", "visibility", "Lkotlin/Function1;", "", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "", "Lkotlin/ranges/IntRange;", "stringIn", "Lme/alpha432/stay/features/setting/Bind;", "bind", "Stay" })
public final class SettingsKt
{
    @NotNull
    public static final Value<Integer> setting(@NotNull final Module $this$setting, @NotNull final String name, final int defaultValue, @NotNull final IntRange range) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)range, "range");
        final Value it;
        final Value value = it = new Value(name, (T)defaultValue, (T)range.getFirst(), (T)range.getLast());
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<Integer>)value;
    }
    
    @NotNull
    public static final Value<Float> setting(@NotNull final Module $this$setting, @NotNull final String name, final float defaultValue, @NotNull final ClosedFloatingPointRange<Float> range) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)range, "range");
        final Value it;
        final Value value = it = new Value(name, (T)defaultValue, (T)range.getStart(), (T)range.getEndInclusive());
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<Float>)value;
    }
    
    @NotNull
    public static final Value<Double> setting(@NotNull final Module $this$setting, @NotNull final String name, final double defaultValue, @NotNull final ClosedFloatingPointRange<Double> range) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)range, "range");
        final Value it;
        final Value value = it = new Value(name, (T)defaultValue, (T)range.getStart(), (T)range.getEndInclusive());
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<Double>)value;
    }
    
    @NotNull
    public static final Value<Boolean> setting(@NotNull final Module $this$setting, @NotNull final String name, final boolean defaultValue) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final Value it;
        final Value value = it = new Value(name, (T)defaultValue);
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<Boolean>)value;
    }
    
    @NotNull
    public static final Value<Bind> setting(@NotNull final Module $this$setting, @NotNull final String name, @NotNull final Bind bind) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)bind, "bind");
        final Value it;
        final Value value = it = new Value(name, (T)bind);
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<Bind>)value;
    }
    
    @NotNull
    public static final Value<String> setting(@NotNull final Module $this$setting, @NotNull final String name, @NotNull final String stringIn) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)stringIn, "stringIn");
        final Value it;
        final Value value = it = new Value(name, (T)stringIn);
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<String>)value;
    }
    
    @NotNull
    public static final Value<Boolean> setting(@NotNull final Module $this$setting, @NotNull final String name, final boolean defaultValue, @NotNull final Function1<? super Boolean, Boolean> visibility) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)visibility, "visibility");
        final Value $this$visible$iv = new Value(name, (T)defaultValue);
        final int $i$f$visible = 0;
        final Value it$iv;
        final Value value = it$iv = $this$visible$iv;
        final int n = 0;
        it$iv.setVisibility((Predicate)new Predicate(visibility));
        final Value it;
        final Value value2 = it = value;
        final int n2 = 0;
        $this$setting.register((Setting)it);
        return (Value<Boolean>)value2;
    }
    
    @NotNull
    public static final Value<Integer> setting(@NotNull final Module $this$setting, @NotNull final String name, final int defaultValue, @NotNull final IntRange range, @NotNull final Function1<? super Integer, Boolean> visibility) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)range, "range");
        Intrinsics.checkNotNullParameter((Object)visibility, "visibility");
        final Value $this$visible$iv = new Value(name, (T)defaultValue, (T)range.getFirst(), (T)range.getLast());
        final int $i$f$visible = 0;
        final Value it$iv;
        final Value value = it$iv = $this$visible$iv;
        final int n = 0;
        it$iv.setVisibility((Predicate)new Predicate(visibility));
        final Value it;
        final Value value2 = it = value;
        final int n2 = 0;
        $this$setting.register((Setting)it);
        return (Value<Integer>)value2;
    }
    
    @NotNull
    public static final <T> Value<T> setting(@NotNull final Module $this$setting, @NotNull final String name, final T defaultValue, final T minValue, final T maxValue) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final Value it;
        final Value value = it = new Value(name, (T)defaultValue, (T)minValue, (T)maxValue);
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<T>)value;
    }
    
    @NotNull
    public static final <T extends Enum<T>> Value<T> setting(@NotNull final Module $this$setting, @NotNull final String name, @NotNull final T defaultValue) {
        Intrinsics.checkNotNullParameter((Object)$this$setting, "<this>");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)defaultValue, "defaultValue");
        final Value it;
        final Value value = it = new Value(name, (T)defaultValue);
        final int n = 0;
        $this$setting.register((Setting)it);
        return (Value<T>)value;
    }
}
