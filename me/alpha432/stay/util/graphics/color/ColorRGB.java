//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.color;

import kotlin.jvm.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@JvmInline
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B$\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B,\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\tB$\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000bB,\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\n\u0012\u0006\u0010\b\u001a\u00020\n\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fB\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000eJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010!\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\"\u0010 J\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0003H\u00d6\u0001¢\u0006\u0004\b+\u0010\u000eJ\u001e\u0010,\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0086\u0004\u00f8\u0001\u0000\u00f8\u0001\u0002¢\u0006\u0004\b-\u0010 J#\u0010,\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\n\u00f8\u0001\u0000\u00f8\u0001\u0002¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b2\u0010 J\u000f\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\r\u00f8\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00067" }, d2 = { "Lme/alpha432/stay/util/graphics/color/ColorRGB;", "", "r", "", "g", "b", "constructor-impl", "(III)I", "a", "(IIII)I", "", "(FFF)I", "(FFFF)I", "rgba", "(I)I", "getA-impl", "aFloat", "getAFloat-impl", "(I)F", "getB-impl", "bFloat", "getBFloat-impl", "getG-impl", "gFloat", "getGFloat-impl", "getR-impl", "rFloat", "getRFloat-impl", "getRgba", "()I", "alpha", "alpha-_3BFyQM", "(II)I", "blue", "blue-_3BFyQM", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "green", "green-_3BFyQM", "hashCode", "hashCode-impl", "mix", "mix-NHzLvAk", "ratio", "mix-PvYQzXg", "(IIF)I", "red", "red-_3BFyQM", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Stay" })
public final class ColorRGB
{
    private final int rgba = rgba;
    
    public final int getRgba() {
        return this.rgba;
    }
    
    public static int constructor-impl(final int r, final int g, final int b) {
        return constructor-impl(r, g, b, 255);
    }
    
    public static int constructor-impl(final int r, final int g, final int b, final int a) {
        return constructor-impl((r & 0xFF) << 24 | (g & 0xFF) << 16 | (b & 0xFF) << 8 | (a & 0xFF));
    }
    
    public static int constructor-impl(final float r, final float g, final float b) {
        return constructor-impl((int)(r * 255.0f), (int)(g * 255.0f), (int)(b * 255.0f));
    }
    
    public static int constructor-impl(final float r, final float g, final float b, final float a) {
        return constructor-impl((int)(r * 255.0f), (int)(g * 255.0f), (int)(b * 255.0f), (int)(a * 255.0f));
    }
    
    public static final int getR-impl(final int arg0) {
        return arg0 >> 24 & 0xFF;
    }
    
    public static final int getG-impl(final int arg0) {
        return arg0 >> 16 & 0xFF;
    }
    
    public static final int getB-impl(final int arg0) {
        return arg0 >> 8 & 0xFF;
    }
    
    public static final int getA-impl(final int arg0) {
        return arg0 & 0xFF;
    }
    
    public static final float getRFloat-impl(final int arg0) {
        return getR-impl(arg0) / 255.0f;
    }
    
    public static final float getGFloat-impl(final int arg0) {
        return getG-impl(arg0) / 255.0f;
    }
    
    public static final float getBFloat-impl(final int arg0) {
        return getB-impl(arg0) / 255.0f;
    }
    
    public static final float getAFloat-impl(final int arg0) {
        return getA-impl(arg0) / 255.0f;
    }
    
    public static final int red-_3BFyQM(final int arg0, final int r) {
        return constructor-impl((arg0 & 0xFFFFFF) | r << 24);
    }
    
    public static final int green-_3BFyQM(final int arg0, final int g) {
        return constructor-impl((arg0 & 0xFF00FFFF) | g << 16);
    }
    
    public static final int blue-_3BFyQM(final int arg0, final int b) {
        return constructor-impl((arg0 & 0xFFFF00FF) | b << 8);
    }
    
    public static final int alpha-_3BFyQM(final int arg0, final int a) {
        return constructor-impl((arg0 & 0xFFFFFF00) | a);
    }
    
    public static final int mix-PvYQzXg(final int arg0, final int other, final float ratio) {
        final float rationSelf = 1.0f - ratio;
        return constructor-impl((int)(getR-impl(arg0) * rationSelf + getR-impl(other) * ratio), (int)(getG-impl(arg0) * rationSelf + getG-impl(other) * ratio), (int)(getB-impl(arg0) * rationSelf + getB-impl(other) * ratio), (int)(getA-impl(arg0) * rationSelf + getA-impl(other) * ratio));
    }
    
    public static final int mix-NHzLvAk(final int arg0, final int other) {
        return constructor-impl((getR-impl(arg0) + getR-impl(other)) / 2, (getG-impl(arg0) + getG-impl(other)) / 2, (getB-impl(arg0) + getB-impl(other)) / 2, (getA-impl(arg0) + getA-impl(other)) / 2);
    }
    
    @NotNull
    public static String toString-impl(final int arg0) {
        return getR-impl(arg0) + ", " + getG-impl(arg0) + ", " + getB-impl(arg0) + ", " + getA-impl(arg0);
    }
    
    @NotNull
    @Override
    public String toString() {
        return toString-impl(this.rgba);
    }
    
    public static int hashCode-impl(final int arg0) {
        return Integer.hashCode(arg0);
    }
    
    @Override
    public int hashCode() {
        return hashCode-impl(this.rgba);
    }
    
    public static boolean equals-impl(final int arg0, final Object other) {
        return other instanceof ColorRGB && arg0 == ((ColorRGB)other).unbox-impl();
    }
    
    @Override
    public boolean equals(final Object other) {
        return equals-impl(this.rgba, other);
    }
    
    public static int constructor-impl(final int rgba) {
        return rgba;
    }
    
    public final /* synthetic */ int unbox-impl() {
        return this.rgba;
    }
    
    public static final boolean equals-impl0(final int p1, final int p2) {
        return p1 == p2;
    }
}
