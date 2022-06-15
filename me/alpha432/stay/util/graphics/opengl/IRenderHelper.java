//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.opengl;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import org.lwjgl.opengl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/util/graphics/opengl/IRenderHelper;", "", "color4f", "", "r", "", "g", "b", "a", "disableGl", "code", "", "enableGl", "pop", "push", "Stay" })
public interface IRenderHelper
{
    void push();
    
    void pop();
    
    void color4f(final float p0, final float p1, final float p2, final float p3);
    
    void enableGl(final int p0);
    
    void disableGl(final int p0);
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public static final class DefaultImpls
    {
        public static void push(@NotNull final IRenderHelper this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            GL11.glPushMatrix();
        }
        
        public static void pop(@NotNull final IRenderHelper this) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            GL11.glPopMatrix();
        }
        
        public static void color4f(@NotNull final IRenderHelper this, final float r, final float g, final float b, final float a) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            GL11.glColor4f(r, g, b, a);
        }
        
        public static void enableGl(@NotNull final IRenderHelper this, final int code) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            GL11.glEnable(code);
        }
        
        public static void disableGl(@NotNull final IRenderHelper this, final int code) {
            Intrinsics.checkNotNullParameter((Object)this, "this");
            GL11.glDisable(code);
        }
    }
}
