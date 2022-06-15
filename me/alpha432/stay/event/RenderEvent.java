//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/event/RenderEvent;", "Lme/alpha432/stay/event/EventStage;", "tessellator", "Lnet/minecraft/client/renderer/Tessellator;", "renderPos", "Lnet/minecraft/util/math/Vec3d;", "(Lnet/minecraft/client/renderer/Tessellator;Lnet/minecraft/util/math/Vec3d;)V", "buffer", "Lnet/minecraft/client/renderer/BufferBuilder;", "getBuffer", "()Lnet/minecraft/client/renderer/BufferBuilder;", "resetTranslation", "", "setTranslation", "paramVec3d", "Stay" })
public final class RenderEvent extends EventStage
{
    @NotNull
    private final Tessellator tessellator;
    @Nullable
    private final Vec3d renderPos;
    
    public RenderEvent(@NotNull final Tessellator tessellator, @Nullable final Vec3d renderPos) {
        Intrinsics.checkNotNullParameter((Object)tessellator, "tessellator");
        this.tessellator = tessellator;
        this.renderPos = renderPos;
    }
    
    public final void resetTranslation() {
        this.setTranslation(this.renderPos);
    }
    
    private final BufferBuilder getBuffer() {
        final BufferBuilder getBuffer = this.tessellator.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "tessellator.buffer");
        return getBuffer;
    }
    
    private final void setTranslation(final Vec3d paramVec3d) {
        if (paramVec3d != null) {
            this.getBuffer().setTranslation(-paramVec3d.x, -paramVec3d.y, -paramVec3d.z);
        }
    }
}
