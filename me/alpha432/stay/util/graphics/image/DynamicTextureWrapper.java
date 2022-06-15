//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.image;

import java.net.*;
import java.awt.image.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraftforge.fml.client.*;
import net.minecraft.client.renderer.texture.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;
import java.awt.*;

public class DynamicTextureWrapper
{
    private static final Map<URL, WrappedResource> URL_TEXTURES;
    private static final Map<URL, WrappedImage> URL_IMAGES;
    private static final BufferedImage FULLY_TRANSPARENT_IMAGE;
    private static final BufferedImage MISSING_IMAGE;
    private static ResourceLocation FULLY_TRANSPARENT_TEXTURE;
    private static boolean INITIALIZED;
    
    private static void init() {
        if (!DynamicTextureWrapper.INITIALIZED) {
            try {
                GLContext.getCapabilities();
            }
            catch (RuntimeException ignored) {
                return;
            }
            DynamicTextureWrapper.FULLY_TRANSPARENT_TEXTURE = FMLClientHandler.instance().getClient().getTextureManager().getDynamicTextureLocation("mediamod", new DynamicTexture(DynamicTextureWrapper.FULLY_TRANSPARENT_IMAGE));
            DynamicTextureWrapper.INITIALIZED = true;
        }
    }
    
    public static BufferedImage getImage(final URL url) {
        init();
        if (!DynamicTextureWrapper.URL_IMAGES.containsKey(url)) {
            queueImage(url);
        }
        final WrappedImage image = DynamicTextureWrapper.URL_IMAGES.get(url);
        if (image.image == null) {
            return DynamicTextureWrapper.FULLY_TRANSPARENT_IMAGE;
        }
        return image.image;
    }
    
    public static ResourceLocation getTexture(final URL url) {
        init();
        if (!DynamicTextureWrapper.URL_TEXTURES.containsKey(url)) {
            DynamicTextureWrapper.URL_TEXTURES.put(url, new WrappedResource(null));
            queueImage(url);
        }
        final WrappedResource wr = DynamicTextureWrapper.URL_TEXTURES.get(url);
        if (wr.location != null) {
            return wr.location;
        }
        if (DynamicTextureWrapper.URL_IMAGES.get(url) != null && DynamicTextureWrapper.URL_IMAGES.get(url).image != null) {
            final DynamicTexture texture = new DynamicTexture(DynamicTextureWrapper.URL_IMAGES.get(url).image);
            final WrappedResource wr2 = new WrappedResource(FMLClientHandler.instance().getClient().getTextureManager().getDynamicTextureLocation(url.toString(), texture));
            DynamicTextureWrapper.URL_TEXTURES.put(url, wr2);
            return wr2.location;
        }
        return DynamicTextureWrapper.FULLY_TRANSPARENT_TEXTURE;
    }
    
    private static void queueImage(final URL url) {
        init();
        DynamicTextureWrapper.URL_IMAGES.put(url, new WrappedImage(null));
        BufferedImage image;
        new Thread(() -> {
            try {
                image = ImageIO.read(url);
                DynamicTextureWrapper.URL_IMAGES.put(url, new WrappedImage(image));
            }
            catch (IOException e) {
                DynamicTextureWrapper.URL_IMAGES.put(url, new WrappedImage(DynamicTextureWrapper.MISSING_IMAGE));
            }
        }).start();
    }
    
    static {
        URL_TEXTURES = new HashMap<URL, WrappedResource>();
        URL_IMAGES = new HashMap<URL, WrappedImage>();
        (FULLY_TRANSPARENT_IMAGE = new BufferedImage(1, 1, 2)).setRGB(0, 0, new Color(0, 0, 0, 0).getRGB());
        (MISSING_IMAGE = new BufferedImage(2, 2, 2)).setRGB(0, 0, -524040);
        DynamicTextureWrapper.MISSING_IMAGE.setRGB(1, 1, -524040);
        DynamicTextureWrapper.MISSING_IMAGE.setRGB(0, 1, -16777216);
        DynamicTextureWrapper.MISSING_IMAGE.setRGB(1, 0, -16777216);
    }
    
    static class WrappedResource
    {
        final ResourceLocation location;
        
        WrappedResource(final ResourceLocation location) {
            this.location = location;
        }
    }
    
    static class WrappedImage
    {
        final BufferedImage image;
        
        WrappedImage(final BufferedImage image) {
            this.image = image;
        }
    }
}
