//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.basement.verification;

import java.nio.charset.*;
import javax.crypto.*;
import java.security.*;
import org.jetbrains.annotations.*;
import javax.crypto.spec.*;
import java.util.*;
import com.google.common.hash.*;

public class HWIDUtil
{
    public static byte[] rawHWID() throws NoSuchAlgorithmException {
        final String main = System.getenv("PROCESS_IDENTIFIER") + System.getenv("PROCESSOR_LEVEL") + System.getenv("PROCESSOR_REVISION") + System.getenv("PROCESSOR_ARCHITECTURE") + System.getenv("PROCESSOR_ARCHITEW6432") + System.getenv("NUMBER_OF_PROCESSORS") + System.getenv("COMPUTERNAME");
        final byte[] bytes = main.getBytes(StandardCharsets.UTF_8);
        final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        return messageDigest.digest(bytes);
    }
    
    public static String Encrypt(final String strToEncrypt, final String secret) {
        try {
            final Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, getKey(secret));
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));
        }
        catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
            return null;
        }
    }
    
    public static SecretKeySpec getKey(@NotNull final String myKey) {
        try {
            byte[] key = myKey.getBytes(StandardCharsets.UTF_8);
            final MessageDigest sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            return new SecretKeySpec(key, "AES");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String getEncryptedHWID(@NotNull final String key) {
        try {
            final String a = Hashing.sha1().hashString((CharSequence)new String(rawHWID(), StandardCharsets.UTF_8), StandardCharsets.UTF_8).toString();
            final String b = Hashing.sha256().hashString((CharSequence)a, StandardCharsets.UTF_8).toString();
            final String c = Hashing.sha512().hashString((CharSequence)b, StandardCharsets.UTF_8).toString();
            final String d = Hashing.sha1().hashString((CharSequence)c, StandardCharsets.UTF_8).toString();
            return Encrypt(d, "spartanB312" + key);
        }
        catch (Exception e) {
            e.printStackTrace();
            return "null";
        }
    }
}
