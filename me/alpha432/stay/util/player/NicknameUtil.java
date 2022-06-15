//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.player;

import java.util.*;

public class NicknameUtil
{
    private static Map<String, String> nicknames;
    
    public static void addNickname(final String name, final String nick) {
        NicknameUtil.nicknames.put(name, nick);
    }
    
    public static void removeNickname(final String name) {
        NicknameUtil.nicknames.remove(name);
    }
    
    public static String getNickname(final String name) {
        return NicknameUtil.nicknames.get(name);
    }
    
    public static boolean hasNickname(final String name) {
        return NicknameUtil.nicknames.containsKey(name);
    }
    
    public static Map<String, String> getAllNicknames() {
        return NicknameUtil.nicknames;
    }
    
    static {
        NicknameUtil.nicknames = new HashMap<String, String>();
    }
}
