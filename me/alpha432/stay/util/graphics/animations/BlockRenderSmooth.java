//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.animations;

import me.alpha432.stay.util.basement.wrapper.*;
import me.alpha432.stay.util.counting.*;
import net.minecraft.util.math.*;

@Deprecated
public class BlockRenderSmooth implements Util
{
    private BlockPos lastPos;
    private BlockPos newPos;
    private final FadeUtils fade;
    public static Timer timer;
    
    public BlockRenderSmooth(final BlockPos pos, final long smoothLength) {
        this.lastPos = pos;
        this.newPos = pos;
        this.fade = new FadeUtils(smoothLength);
    }
    
    public void setNewPos(final BlockPos pos) {
        if (!pos.equals((Object)this.newPos) && BlockRenderSmooth.timer.passedMs(200L)) {
            this.lastPos = this.newPos;
            this.newPos = pos;
            this.fade.reset();
            BlockRenderSmooth.timer.reset();
        }
    }
    
    public Vec3d getRenderPos() {
        return lerp(PosToVec(this.lastPos), PosToVec(this.newPos), (float)this.fade.easeOutQuad());
    }
    
    public static Vec3d lerp(final Vec3d from, final Vec3d to, final float t) {
        return new Vec3d(t * to.x + (1.0f - t) * from.x, t * to.y + (1.0f - t) * from.y, t * to.z + (1.0f - t) * from.z);
    }
    
    private static Vec3d PosToVec(final BlockPos pos) {
        return new Vec3d((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }
    
    static {
        BlockRenderSmooth.timer = new Timer();
    }
}
