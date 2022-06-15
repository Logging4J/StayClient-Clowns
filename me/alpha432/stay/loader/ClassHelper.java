//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.loader;

import java.util.*;
import net.minecraft.launchwrapper.*;
import java.lang.reflect.*;
import java.util.zip.*;
import java.io.*;
import org.apache.logging.log4j.*;

public class ClassHelper
{
    private static Map<String, byte[]> resourceCache;
    private static final Logger logger;
    
    public static boolean inject(final InputStream inputStream) {
        final ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        return use(zipInputStream);
    }
    
    private static boolean use(final ZipInputStream zipInputStream) {
        final Field field;
        ZipEntry zipEntry;
        String name;
        String name2;
        String name3;
        return runSafe("Can't get the resource cache", () -> {
            field = LaunchClassLoader.class.getDeclaredField("resourceCache");
            field.setAccessible(true);
            ClassHelper.resourceCache = (Map<String, byte[]>)field.get(Launch.classLoader);
            return true;
        }) && runSafe("Can't inject to resource cache", () -> {
            while (true) {
                zipEntry = zipInputStream.getNextEntry();
                if (zipEntry == null) {
                    break;
                }
                else {
                    name = zipEntry.getName();
                    if (name.endsWith(".class")) {
                        name2 = name.substring(0, name.length() - 6);
                        name3 = name2.replace('/', '.');
                        ClassHelper.resourceCache.put(name3, readBytes(zipInputStream));
                    }
                    else {
                        continue;
                    }
                }
            }
            return true;
        });
    }
    
    private static boolean runSafe(final String message, final SafeTask task) {
        try {
            return task.invoke();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            ClassHelper.logger.error(message);
            return false;
        }
    }
    
    private static byte[] readBytes(final InputStream input) throws IOException {
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(8192, input.available()));
        copyTo(input, buffer);
        return buffer.toByteArray();
    }
    
    private static void copyTo(final InputStream in, final OutputStream out) throws IOException {
        final byte[] buffer = new byte[8192];
        for (int bytes = in.read(buffer); bytes >= 0; bytes = in.read(buffer)) {
            out.write(buffer, 0, bytes);
        }
    }
    
    static {
        logger = LogManager.getLogger("Class Helper");
    }
    
    private interface SafeTask
    {
        boolean invoke() throws Exception;
    }
}
