//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.loader;

import java.nio.charset.*;
import javax.crypto.*;
import java.security.*;
import javax.crypto.spec.*;
import java.util.*;

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
    
    public static SecretKeySpec getKey(final String myKey) {
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
    
    public static String getHWID() {
        try {
            final String hwidmain = System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("PROCESSOR_LEVEL") + System.getenv("PROCESSOR_REVISION") + System.getenv("PROCESSOR_ARCHITECTURE") + System.getenv("PROCESSOR_ARCHITEW6432") + System.getenv("NUMBER_OF_PROCESSORS") + System.getenv("COMPUTERNAME") + System.getProperty("user.name");
            final MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(hwidmain.getBytes());
            final StringBuffer hexString = new StringBuffer();
            final byte[] digest;
            final byte[] byteData = digest = md.digest();
            for (final byte aByteData : digest) {
                final String hex = Integer.toHexString(0xFF & aByteData);
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error:" + e.toString();
        }
    }
    
    public static String base64(final String str) {
        final byte[] bytes = str.getBytes();
        final String encoded = Base64.getEncoder().encodeToString(bytes);
        return encoded;
    }
    
    public static String getEncryptedHWID(final String key) {
        return base64(Encrypt(getHWID(), "cuican" + key));
    }
}
