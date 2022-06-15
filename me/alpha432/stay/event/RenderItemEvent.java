//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.event;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b?\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010\u001b¨\u0006B" }, d2 = { "Lme/alpha432/stay/event/RenderItemEvent;", "Lme/alpha432/stay/event/EventStage;", "mainX", "", "mainY", "mainZ", "offX", "offY", "offZ", "mainRAngel", "mainRx", "mainRy", "mainRz", "offRAngel", "offRx", "offRy", "offRz", "mainHandScaleX", "mainHandScaleY", "mainHandScaleZ", "offHandScaleX", "offHandScaleY", "offHandScaleZ", "(DDDDDDDDDDDDDDDDDDDD)V", "getMainHandScaleX", "()D", "setMainHandScaleX", "(D)V", "getMainHandScaleY", "setMainHandScaleY", "getMainHandScaleZ", "setMainHandScaleZ", "getMainRAngel", "setMainRAngel", "getMainRx", "setMainRx", "getMainRy", "setMainRy", "getMainRz", "setMainRz", "getMainX", "setMainX", "getMainY", "setMainY", "getMainZ", "setMainZ", "getOffHandScaleX", "setOffHandScaleX", "getOffHandScaleY", "setOffHandScaleY", "getOffHandScaleZ", "setOffHandScaleZ", "getOffRAngel", "setOffRAngel", "getOffRx", "setOffRx", "getOffRy", "setOffRy", "getOffRz", "setOffRz", "getOffX", "setOffX", "getOffY", "setOffY", "getOffZ", "setOffZ", "Stay" })
public final class RenderItemEvent extends EventStage
{
    private double mainX;
    private double mainY;
    private double mainZ;
    private double offX;
    private double offY;
    private double offZ;
    private double mainRAngel;
    private double mainRx;
    private double mainRy;
    private double mainRz;
    private double offRAngel;
    private double offRx;
    private double offRy;
    private double offRz;
    private double mainHandScaleX;
    private double mainHandScaleY;
    private double mainHandScaleZ;
    private double offHandScaleX;
    private double offHandScaleY;
    private double offHandScaleZ;
    
    public RenderItemEvent(final double mainX, final double mainY, final double mainZ, final double offX, final double offY, final double offZ, final double mainRAngel, final double mainRx, final double mainRy, final double mainRz, final double offRAngel, final double offRx, final double offRy, final double offRz, final double mainHandScaleX, final double mainHandScaleY, final double mainHandScaleZ, final double offHandScaleX, final double offHandScaleY, final double offHandScaleZ) {
        this.mainX = mainX;
        this.mainY = mainY;
        this.mainZ = mainZ;
        this.offX = offX;
        this.offY = offY;
        this.offZ = offZ;
        this.mainRAngel = mainRAngel;
        this.mainRx = mainRx;
        this.mainRy = mainRy;
        this.mainRz = mainRz;
        this.offRAngel = offRAngel;
        this.offRx = offRx;
        this.offRy = offRy;
        this.offRz = offRz;
        this.mainHandScaleX = mainHandScaleX;
        this.mainHandScaleY = mainHandScaleY;
        this.mainHandScaleZ = mainHandScaleZ;
        this.offHandScaleX = offHandScaleX;
        this.offHandScaleY = offHandScaleY;
        this.offHandScaleZ = offHandScaleZ;
    }
    
    public final double getMainX() {
        return this.mainX;
    }
    
    public final void setMainX(final double <set-?>) {
        this.mainX = <set-?>;
    }
    
    public final double getMainY() {
        return this.mainY;
    }
    
    public final void setMainY(final double <set-?>) {
        this.mainY = <set-?>;
    }
    
    public final double getMainZ() {
        return this.mainZ;
    }
    
    public final void setMainZ(final double <set-?>) {
        this.mainZ = <set-?>;
    }
    
    public final double getOffX() {
        return this.offX;
    }
    
    public final void setOffX(final double <set-?>) {
        this.offX = <set-?>;
    }
    
    public final double getOffY() {
        return this.offY;
    }
    
    public final void setOffY(final double <set-?>) {
        this.offY = <set-?>;
    }
    
    public final double getOffZ() {
        return this.offZ;
    }
    
    public final void setOffZ(final double <set-?>) {
        this.offZ = <set-?>;
    }
    
    public final double getMainRAngel() {
        return this.mainRAngel;
    }
    
    public final void setMainRAngel(final double <set-?>) {
        this.mainRAngel = <set-?>;
    }
    
    public final double getMainRx() {
        return this.mainRx;
    }
    
    public final void setMainRx(final double <set-?>) {
        this.mainRx = <set-?>;
    }
    
    public final double getMainRy() {
        return this.mainRy;
    }
    
    public final void setMainRy(final double <set-?>) {
        this.mainRy = <set-?>;
    }
    
    public final double getMainRz() {
        return this.mainRz;
    }
    
    public final void setMainRz(final double <set-?>) {
        this.mainRz = <set-?>;
    }
    
    public final double getOffRAngel() {
        return this.offRAngel;
    }
    
    public final void setOffRAngel(final double <set-?>) {
        this.offRAngel = <set-?>;
    }
    
    public final double getOffRx() {
        return this.offRx;
    }
    
    public final void setOffRx(final double <set-?>) {
        this.offRx = <set-?>;
    }
    
    public final double getOffRy() {
        return this.offRy;
    }
    
    public final void setOffRy(final double <set-?>) {
        this.offRy = <set-?>;
    }
    
    public final double getOffRz() {
        return this.offRz;
    }
    
    public final void setOffRz(final double <set-?>) {
        this.offRz = <set-?>;
    }
    
    public final double getMainHandScaleX() {
        return this.mainHandScaleX;
    }
    
    public final void setMainHandScaleX(final double <set-?>) {
        this.mainHandScaleX = <set-?>;
    }
    
    public final double getMainHandScaleY() {
        return this.mainHandScaleY;
    }
    
    public final void setMainHandScaleY(final double <set-?>) {
        this.mainHandScaleY = <set-?>;
    }
    
    public final double getMainHandScaleZ() {
        return this.mainHandScaleZ;
    }
    
    public final void setMainHandScaleZ(final double <set-?>) {
        this.mainHandScaleZ = <set-?>;
    }
    
    public final double getOffHandScaleX() {
        return this.offHandScaleX;
    }
    
    public final void setOffHandScaleX(final double <set-?>) {
        this.offHandScaleX = <set-?>;
    }
    
    public final double getOffHandScaleY() {
        return this.offHandScaleY;
    }
    
    public final void setOffHandScaleY(final double <set-?>) {
        this.offHandScaleY = <set-?>;
    }
    
    public final double getOffHandScaleZ() {
        return this.offHandScaleZ;
    }
    
    public final void setOffHandScaleZ(final double <set-?>) {
        this.offHandScaleZ = <set-?>;
    }
}
