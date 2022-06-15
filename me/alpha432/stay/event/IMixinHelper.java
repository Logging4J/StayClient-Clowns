//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Lme/alpha432/stay/event/IMixinHelper;", "", "Companion", "Stay" })
public interface IMixinHelper
{
    @NotNull
    public static final Companion Companion = IMixinHelper.Companion.$$INSTANCE;
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lme/alpha432/stay/event/IMixinHelper$Companion;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "getMc", "()Lnet/minecraft/client/Minecraft;", "nullCheck", "", "getNullCheck", "()Z", "Stay" })
    public static final class Companion
    {
        static final /* synthetic */ Companion $$INSTANCE;
        private static final Minecraft mc;
        private static final boolean nullCheck;
        
        private Companion() {
        }
        
        public final Minecraft getMc() {
            return Companion.mc;
        }
        
        public final boolean getNullCheck() {
            return Companion.nullCheck;
        }
        
        static {
            $$INSTANCE = new Companion();
            mc = Minecraft.getMinecraft();
            nullCheck = (Companion.mc.player == null || Companion.mc.world == null);
        }
    }
}
