//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.songs;

import me.alpha432.stay.util.interfaces.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.audio.*;
import net.minecraft.util.*;

public class DontStop implements Globals
{
    public static final ISound sound;
    private static final String song = "dontstop";
    private static final ResourceLocation loc;
    
    static {
        loc = new ResourceLocation("sounds/dontstop.ogg");
        sound = (ISound)new ISound() {
            private final int pitch = 1;
            private final int volume = 1;
            
            @NotNull
            public ResourceLocation getSoundLocation() {
                return DontStop.loc;
            }
            
            @NotNull
            public SoundEventAccessor createAccessor(@NotNull final SoundHandler soundHandler) {
                return new SoundEventAccessor(DontStop.loc, "Pitbull");
            }
            
            @NotNull
            public Sound getSound() {
                return new Sound("dontstop", 1.0f, 1.0f, 1, Sound.Type.SOUND_EVENT, false);
            }
            
            @NotNull
            public SoundCategory getCategory() {
                return SoundCategory.VOICE;
            }
            
            public boolean canRepeat() {
                return true;
            }
            
            public int getRepeatDelay() {
                return 2;
            }
            
            public float getVolume() {
                return 1.0f;
            }
            
            public float getPitch() {
                return 1.0f;
            }
            
            public float getXPosF() {
                return 1.0f;
            }
            
            public float getYPosF() {
                return 0.0f;
            }
            
            public float getZPosF() {
                return 0.0f;
            }
            
            @NotNull
            public ISound.AttenuationType getAttenuationType() {
                return ISound.AttenuationType.LINEAR;
            }
        };
    }
}
