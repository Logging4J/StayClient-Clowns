//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.counting;

public class Timer
{
    private long time;
    
    public Timer() {
        this.time = -1L;
    }
    
    public boolean passedS(final double s) {
        return this.passedMs((long)s * 1000L);
    }
    
    public boolean passedDms(final double dms) {
        return this.passedMs((long)dms * 10L);
    }
    
    public boolean passedMs(final double ms) {
        return this.passedNS(this.convertToNS((long)ms));
    }
    
    public boolean passedDs(final double ds) {
        return this.passedMs((long)ds * 100L);
    }
    
    public boolean passedMs(final long ms) {
        return this.passedNS(this.convertToNS(ms));
    }
    
    public void setMs(final long ms) {
        this.time = System.nanoTime() - this.convertToNS(ms);
    }
    
    public boolean passedNS(final long ns) {
        return System.nanoTime() - this.time >= ns;
    }
    
    public long getPassedTimeMs() {
        return this.getMs(System.nanoTime() - this.time);
    }
    
    public Timer reset() {
        this.time = System.nanoTime();
        return this;
    }
    
    public boolean sleep(final long time) {
        if (System.nanoTime() / 1000000L - time >= time) {
            this.reset();
            return true;
        }
        return false;
    }
    
    public long getMs(final long time) {
        return time / 1000000L;
    }
    
    public long convertToNS(final long time) {
        return time * 1000000L;
    }
}
