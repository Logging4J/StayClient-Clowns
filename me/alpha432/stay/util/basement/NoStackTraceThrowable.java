//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.basement;

public class NoStackTraceThrowable extends RuntimeException
{
    public NoStackTraceThrowable(final String msg) {
        super(msg);
        this.setStackTrace(new StackTraceElement[0]);
    }
    
    @Override
    public String toString() {
        return "Fuck off nigga!";
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
