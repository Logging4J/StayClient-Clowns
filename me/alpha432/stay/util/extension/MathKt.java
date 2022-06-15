//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.extension;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\u001a\r\u0010\u0013\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0013\u001a\u00020\u0003*\u00020\u0005H\u0086\b\u001a\r\u0010\u0014\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0014\u001a\u00020\u0003*\u00020\u0005H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0003*\u00020\u0005H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0003*\u00020\u0005H\u0086\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0086\b\u001a\r\u0010\u0017\u001a\u00020\u0005*\u00020\u0005H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0001*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0005*\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00018\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0016\u0010\b\u001a\u00020\u0005*\u00020\u00058\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0016\u0010\b\u001a\u00020\u0003*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\f\"\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00018\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\"\u0016\u0010\r\u001a\u00020\u0005*\u00020\u00058\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0016\u0010\r\u001a\u00020\u0003*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u0016\u0010\u000f\u001a\u00020\u0001*\u00020\u00018\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n\"\u0016\u0010\u000f\u001a\u00020\u0005*\u00020\u00058\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0016\u0010\u000f\u001a\u00020\u0003*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f\"\u0016\u0010\u0011\u001a\u00020\u0001*\u00020\u00018\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n\"\u0016\u0010\u0011\u001a\u00020\u0005*\u00020\u00058\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\"\u0016\u0010\u0011\u001a\u00020\u0003*\u00020\u00038\u00c6\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006\u0019" }, d2 = { "FLOOR_DOUBLE_D", "", "FLOOR_DOUBLE_I", "", "FLOOR_FLOAT_F", "", "FLOOR_FLOAT_I", "PI_FLOAT", "cubic", "getCubic", "(D)D", "(F)F", "(I)I", "quart", "getQuart", "quint", "getQuint", "sq", "getSq", "ceilToInt", "fastCeil", "fastFloor", "floorToInt", "toDegree", "toRadian", "Stay" })
public final class MathKt
{
    public static final float PI_FLOAT = 3.1415927f;
    public static final double FLOOR_DOUBLE_D = 1.073741824E9;
    public static final int FLOOR_DOUBLE_I = 1073741824;
    public static final float FLOOR_FLOAT_F = 4194304.0f;
    public static final int FLOOR_FLOAT_I = 4194304;
    
    public static final int floorToInt(final double $this$floorToInt) {
        final int $i$f$floorToInt = 0;
        return (int)Math.floor($this$floorToInt);
    }
    
    public static final int floorToInt(final float $this$floorToInt) {
        final int $i$f$floorToInt = 0;
        return (int)(float)Math.floor($this$floorToInt);
    }
    
    public static final int ceilToInt(final double $this$ceilToInt) {
        final int $i$f$ceilToInt = 0;
        return (int)Math.ceil($this$ceilToInt);
    }
    
    public static final int ceilToInt(final float $this$ceilToInt) {
        final int $i$f$ceilToInt = 0;
        return (int)(float)Math.ceil($this$ceilToInt);
    }
    
    public static final int fastFloor(final double $this$fastFloor) {
        final int $i$f$fastFloor = 0;
        return (int)($this$fastFloor + 1.073741824E9) - 1073741824;
    }
    
    public static final int fastFloor(final float $this$fastFloor) {
        final int $i$f$fastFloor = 0;
        return (int)($this$fastFloor + 4194304.0f) - 4194304;
    }
    
    public static final int fastCeil(final double $this$fastCeil) {
        final int $i$f$fastCeil = 0;
        return 1073741824 - (int)(1.073741824E9 - $this$fastCeil);
    }
    
    public static final int fastCeil(final float $this$fastCeil) {
        final int $i$f$fastCeil = 0;
        return 4194304 - (int)(4194304.0f - $this$fastCeil);
    }
    
    public static final float toRadian(final float $this$toRadian) {
        final int $i$f$toRadian = 0;
        return $this$toRadian / 180.0f * 3.1415927f;
    }
    
    public static final double toRadian(final double $this$toRadian) {
        final int $i$f$toRadian = 0;
        return $this$toRadian / 180.0 * 3.141592653589793;
    }
    
    public static final float toDegree(final float $this$toDegree) {
        final int $i$f$toDegree = 0;
        return $this$toDegree * 180.0f / 3.1415927f;
    }
    
    public static final double toDegree(final double $this$toDegree) {
        final int $i$f$toDegree = 0;
        return $this$toDegree * 180.0 / 3.141592653589793;
    }
    
    public static final double getSq(final double $this$sq) {
        final int $i$f$getSq = 0;
        return $this$sq * $this$sq;
    }
    
    public static final float getSq(final float $this$sq) {
        final int $i$f$getSq = 0;
        return $this$sq * $this$sq;
    }
    
    public static final int getSq(final int $this$sq) {
        final int $i$f$getSq = 0;
        return $this$sq * $this$sq;
    }
    
    public static final double getCubic(final double $this$cubic) {
        final int $i$f$getCubic = 0;
        return $this$cubic * $this$cubic * $this$cubic;
    }
    
    public static final float getCubic(final float $this$cubic) {
        final int $i$f$getCubic = 0;
        return $this$cubic * $this$cubic * $this$cubic;
    }
    
    public static final int getCubic(final int $this$cubic) {
        final int $i$f$getCubic = 0;
        return $this$cubic * $this$cubic * $this$cubic;
    }
    
    public static final double getQuart(final double $this$quart) {
        final int $i$f$getQuart = 0;
        return $this$quart * $this$quart * $this$quart * $this$quart;
    }
    
    public static final float getQuart(final float $this$quart) {
        final int $i$f$getQuart = 0;
        return $this$quart * $this$quart * $this$quart * $this$quart;
    }
    
    public static final int getQuart(final int $this$quart) {
        final int $i$f$getQuart = 0;
        return $this$quart * $this$quart * $this$quart * $this$quart;
    }
    
    public static final double getQuint(final double $this$quint) {
        final int $i$f$getQuint = 0;
        return $this$quint * $this$quint * $this$quint * $this$quint * $this$quint;
    }
    
    public static final float getQuint(final float $this$quint) {
        final int $i$f$getQuint = 0;
        return $this$quint * $this$quint * $this$quint * $this$quint * $this$quint;
    }
    
    public static final int getQuint(final int $this$quint) {
        final int $i$f$getQuint = 0;
        return $this$quint * $this$quint * $this$quint * $this$quint * $this$quint;
    }
}
