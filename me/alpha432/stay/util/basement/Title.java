//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.basement;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lme/alpha432/stay/util/basement/Title;", "", "()V", "cachedTitle", "", "getCachedTitle", "()Ljava/lang/String;", "setCachedTitle", "(Ljava/lang/String;)V", "onTick", "", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "Stay" })
public final class Title
{
    @NotNull
    public static final Title INSTANCE;
    @NotNull
    private static String cachedTitle;
    
    private Title() {
    }
    
    @NotNull
    public final String getCachedTitle() {
        return Title.cachedTitle;
    }
    
    public final void setCachedTitle(@NotNull final String <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        Title.cachedTitle = <set-?>;
    }
    
    @SubscribeEvent
    public final void onTick(@Nullable final TickEvent$ClientTickEvent event) {
        Display.setTitle(Title.cachedTitle);
    }
    
    static {
        INSTANCE = new Title();
        Title.cachedTitle = "Stay 1.0 release+b1 | ";
        final String[] titles = { "Do one thing at a time, and do well.", "Keep on going, and never give up.", "Whatever is worth doing is worth doing well.", "You cannot improve your past, but you can improve your future. Once time is wasted, life is wasted.", "Don't aim for success if you want it; just do what you love and believe in, and it will come naturally.", "Whether it is the old man, or the young, it is the last time for us to sail.", "Is the true wisdom fortitude ambition.", "Life is precious, you have to pay no sooner.", "Life must be self weight.", "Genius out of diligence.", "Live a live you will remember.", "When your dreams come alive you're unstoppable.", "Take the shot, chase the sun, find the beautiful.", "We will glow in the dark turning dust to gold.", "The past, is everything we were, don't make us who we are.", "Yeah you better know where you're going.", "Keep goin' and never give up.", "Powered by SagiriAntiLeak" };
        final Title instance = Title.INSTANCE;
        Title.cachedTitle = Intrinsics.stringPlus(Title.cachedTitle, (Object)titles[(int)(Math.random() * titles.length)]);
    }
}
