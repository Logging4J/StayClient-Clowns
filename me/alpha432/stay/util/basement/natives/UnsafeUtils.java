//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.basement.natives;

import kotlin.*;
import com.google.common.annotations.*;
import sun.misc.*;
import java.lang.reflect.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import java.io.*;
import java.security.*;

@UnsafeFeature
@Deprecated(message = "Unsafe API(s)")
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0003¢\u0006\u0002\u0010\u0002¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/util/basement/natives/UnsafeUtils;", "", "()V", "Companion", "ForceShutDown", "Stay" })
@Beta
public abstract class UnsafeUtils
{
    @NotNull
    public static final Companion Companion;
    private static boolean showReport;
    @NotNull
    private static final Unsafe nativeUnsafe;
    
    @Beta
    private UnsafeUtils() {
    }
    
    public static final /* synthetic */ boolean access$getShowReport$cp() {
        return UnsafeUtils.showReport;
    }
    
    public static final /* synthetic */ Unsafe access$getNativeUnsafe$cp() {
        return UnsafeUtils.nativeUnsafe;
    }
    
    public static final /* synthetic */ void access$setShowReport$cp(final boolean <set-?>) {
        UnsafeUtils.showReport = <set-?>;
    }
    
    static {
        Companion = new Companion(null);
        UnsafeUtils.showReport = true;
        final Field it = Unsafe.class.getDeclaredField("theUnsafe");
        final int n = 0;
        it.setAccessible(true);
        final Object value = it.get(null);
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type sun.misc.Unsafe");
        }
        nativeUnsafe = (Unsafe)value;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/util/basement/natives/UnsafeUtils$ForceShutDown;", "", "(Ljava/lang/String;I)V", "ERROR", "OOM", "STACKOVERFLOW", "Stay" })
    public enum ForceShutDown
    {
        ERROR, 
        OOM, 
        STACKOVERFLOW;
        
        private static final /* synthetic */ ForceShutDown[] $values() {
            return new ForceShutDown[] { ForceShutDown.ERROR, ForceShutDown.OOM, ForceShutDown.STACKOVERFLOW };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rJ#\u0010\u0016\u001a\u0002H\u0017\"\b\b\u0000\u0010\u0017*\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\rJ\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0001J*\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019\"\b\b\u0000\u0010\u0017*\u00020\u00012\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'J\b\u0010(\u001a\u00020\u0010H\u0002J\u0006\u0010)\u001a\u00020\u0010J\u0016\u0010*\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u001e\u0010+\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u000200R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u00061" }, d2 = { "Lme/alpha432/stay/util/basement/natives/UnsafeUtils$Companion;", "", "()V", "nativeUnsafe", "Lsun/misc/Unsafe;", "getNativeUnsafe", "()Lsun/misc/Unsafe;", "<set-?>", "", "showReport", "getShowReport", "()Z", "allocateMemory", "", "long", "copyMemory", "", "obj1", "long1", "obj2", "long2", "long3", "forceCreateInstance", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "forceReleaseMemory", "clearMCStuff", "offset", "forceReleaseMemory0", "forceShutDown", "Lme/alpha432/stay/util/basement/natives/UnsafeUtils$ForceShutDown;", "getAddress", "obj", "getClassDynamic", "file", "Ljava/io/File;", "classLoader", "Ljava/lang/ClassLoader;", "makeStackOF0", "memoryShutdown", "reallocateMemory", "setMemory", "byte", "", "throwExceptionNoStackTrace", "e", "", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final boolean getShowReport() {
            return UnsafeUtils.access$getShowReport$cp();
        }
        
        @NotNull
        public final Unsafe getNativeUnsafe() {
            return UnsafeUtils.access$getNativeUnsafe$cp();
        }
        
        public final void forceReleaseMemory(final boolean clearMCStuff) {
            if (clearMCStuff) {
                Minecraft.getMinecraft().freeMemory();
            }
            else {
                System.gc();
            }
        }
        
        public final void forceReleaseMemory(final long offset) {
            this.forceReleaseMemory0(offset);
        }
        
        private final void forceReleaseMemory0(final long long1) {
            this.getNativeUnsafe().freeMemory(long1);
        }
        
        public final void forceShutDown(@NotNull final ForceShutDown forceShutDown) {
            Intrinsics.checkNotNullParameter((Object)forceShutDown, "forceShutDown");
            switch (WhenMappings.$EnumSwitchMapping$0[forceShutDown.ordinal()]) {
                case 1: {
                    this.getNativeUnsafe().allocateMemory(Long.MAX_VALUE);
                    break;
                }
                case 2: {
                    this.makeStackOF0();
                    break;
                }
                case 3: {
                    throw new Error();
                }
            }
        }
        
        private final void makeStackOF0() {
            this.makeStackOF0();
        }
        
        @NotNull
        public final <T> T forceCreateInstance(@NotNull final Class<T> clazz) {
            Intrinsics.checkNotNullParameter((Object)clazz, "clazz");
            final Object allocateInstance = this.getNativeUnsafe().allocateInstance(clazz);
            if (allocateInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of me.alpha432.stay.util.basement.natives.UnsafeUtils.Companion.forceCreateInstance");
            }
            return (T)allocateInstance;
        }
        
        public final long allocateMemory(final long long) {
            return this.getNativeUnsafe().allocateMemory(long);
        }
        
        public final long reallocateMemory(final long long1, final long long2) {
            return this.getNativeUnsafe().reallocateMemory(long1, long2);
        }
        
        public final void setMemory(final long long1, final long long2, final byte byte) {
            this.getNativeUnsafe().setMemory(long1, long2, byte);
        }
        
        public final void copyMemory(@NotNull final Object obj1, final long long1, @NotNull final Object obj2, final long long2, final long long3) {
            Intrinsics.checkNotNullParameter(obj1, "obj1");
            Intrinsics.checkNotNullParameter(obj2, "obj2");
            this.getNativeUnsafe().copyMemory(obj1, long1, obj2, long2, long3);
        }
        
        public final void throwExceptionNoStackTrace(@NotNull final Throwable e) {
            Intrinsics.checkNotNullParameter((Object)e, "e");
            this.getNativeUnsafe().throwException(e);
        }
        
        @Nullable
        public final <T> Class<?> getClassDynamic(@NotNull final File file, @Nullable final ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter((Object)file, "file");
            final FileInputStream input = new FileInputStream(file);
            final byte[] content = new byte[(int)file.length()];
            input.read(content);
            input.close();
            return (Class<?>)this.getNativeUnsafe().defineClass((String)null, content, 0, content.length, classLoader, (ProtectionDomain)null);
        }
        
        public final long getAddress(@NotNull final Object obj) throws Throwable {
            Intrinsics.checkNotNullParameter(obj, "obj");
            final Unsafe unsafe = this.getNativeUnsafe();
            final Object[] array = { obj };
            final long baseOffset = unsafe.arrayBaseOffset(Object[].class);
            final int addressSize = unsafe.addressSize();
            long long1 = 0L;
            switch (addressSize) {
                case 4: {
                    long1 = unsafe.getInt(array, baseOffset);
                    break;
                }
                case 8: {
                    long1 = unsafe.getLong(array, baseOffset);
                    break;
                }
                default: {
                    throw new Error(Intrinsics.stringPlus("unsupported address size: ", (Object)addressSize));
                }
            }
            final long location = long1;
            return location;
        }
        
        public final void memoryShutdown() {
            UnsafeUtils.access$setShowReport$cp(false);
            this.getNativeUnsafe().putAddress(0L, 0L);
            this.setMemory(0L, Long.MAX_VALUE, (byte)0);
            Runtime.getRuntime().addShutdownHook(new Thread(Companion::memoryShutdown$lambda-0));
            Runtime.getRuntime().halt(0);
        }
        
        private static final void memoryShutdown$lambda-0(final Companion this$0) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            this$0.getNativeUnsafe().setMemory(this$0.getAddress(this$0), UnsafeUtils.Companion.getNativeUnsafe().objectFieldOffset(this$0.getClass().getField("nativeUnsafe")), (byte)0);
        }
    }
}
