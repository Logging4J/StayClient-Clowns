//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.network;

import java.util.*;
import java.net.*;
import java.io.*;
import net.minecraftforge.fml.common.*;

public class NetworkUtil
{
    public static List<String> getHWIDList() {
        final List<String> HWIDList = new ArrayList<String>();
        try {
            final URL url = new URL("http://47.106.126.97/HWID.txt");
            final BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                HWIDList.add(inputLine);
            }
        }
        catch (Exception e) {
            FMLLog.log.info("Load HWID Failed!");
        }
        return HWIDList;
    }
}
