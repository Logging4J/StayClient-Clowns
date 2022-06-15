//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.unstable;

import me.alpha432.stay.features.modules.*;
import net.minecraft.client.entity.*;
import kotlin.jvm.*;
import me.alpha432.stay.util.graphics.animations.*;
import me.alpha432.stay.util.thread.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import me.alpha432.stay.util.basement.wrapper.*;
import org.jetbrains.annotations.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import kotlin.jvm.functions.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lme/alpha432/stay/features/modules/unstable/GuiAnimationHelper;", "Lme/alpha432/stay/features/modules/Module;", "()V", "hotbarAnimation", "Lme/alpha432/stay/util/graphics/animations/AnimationFlag;", "updateHotbar", "", "Stay" })
public final class GuiAnimationHelper extends Module
{
    @NotNull
    public static final GuiAnimationHelper INSTANCE;
    @NotNull
    private static final AnimationFlag hotbarAnimation;
    
    private GuiAnimationHelper() {
        super("GuiAnimationHelper", "Plz enable this", Module.Category.UNSTABLE, true, false, true);
    }
    
    @JvmStatic
    public static final float updateHotbar() {
        final EntityPlayerSP player = Module.mc.player;
        float n;
        if (player == null) {
            n = 0.0f;
        }
        else {
            final EntityPlayerSP it = player;
            final int n2 = 0;
            n = it.inventory.currentItem * 20.0f;
        }
        final float currentPos = n;
        return GuiAnimationHelper.hotbarAnimation.getAndUpdate(currentPos);
    }
    
    public static final /* synthetic */ AnimationFlag access$getHotbarAnimation$p() {
        return GuiAnimationHelper.hotbarAnimation;
    }
    
    static {
        INSTANCE = new GuiAnimationHelper();
        hotbarAnimation = new AnimationFlag(Easing.OUT_CUBIC, 200.0f);
        BuildersKt.launch$default(CoroutineUtilsKt.getMainScope(), (CoroutineContext)null, (CoroutineStart)null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
            int label;
            
            @Nullable
            public final Object invokeSuspend(@NotNull final Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure($result);
                        while (true) {
                            final EntityPlayerSP player = MinecraftWrapper.getPlayer();
                            if (player == null) {
                                continue;
                            }
                            final float currentPos = player.inventory.currentItem * 20.0f;
                            GuiAnimationHelper.access$getHotbarAnimation$p().forceUpdate(currentPos, currentPos);
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            
            @NotNull
            public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
                return (Continuation<Unit>)new Function2<CoroutineScope, Continuation<? super Unit>, Object>($completion) {
                    int label;
                    
                    @Nullable
                    public final Object invokeSuspend(@NotNull final Object $result) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0: {
                                ResultKt.throwOnFailure($result);
                                while (true) {
                                    final EntityPlayerSP player = MinecraftWrapper.getPlayer();
                                    if (player == null) {
                                        continue;
                                    }
                                    final float currentPos = player.inventory.currentItem * 20.0f;
                                    GuiAnimationHelper.access$getHotbarAnimation$p().forceUpdate(currentPos, currentPos);
                                }
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }
                };
            }
            
            @Nullable
            public final Object invoke(@NotNull final CoroutineScope p1, @Nullable final Continuation<? super Unit> p2) {
                return ((GuiAnimationHelper$1)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, 3, (Object)null);
        GuiAnimationHelper.INSTANCE.onDisable((Function0)GuiAnimationHelper$2.INSTANCE);
    }
}
