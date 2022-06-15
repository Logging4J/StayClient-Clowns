//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.util.interfaces.*;
import net.minecraft.client.audio.*;
import me.alpha432.stay.util.songs.*;
import java.util.*;

public class SongManager implements Globals
{
    private final List<ISound> songs;
    private final ISound menuSong;
    private ISound currentSong;
    
    public SongManager() {
        this.songs = Arrays.asList(FireBall.sound, HotelRoom.sound, DontStop.sound);
        this.menuSong = this.getRandomSong();
        this.currentSong = this.getRandomSong();
    }
    
    public ISound getMenuSong() {
        return this.menuSong;
    }
    
    public void skip() {
        final boolean flag = this.isCurrentSongPlaying();
        if (flag) {
            this.stop();
        }
        this.currentSong = this.songs.get((this.songs.indexOf(this.currentSong) + 1) % this.songs.size());
        if (flag) {
            this.play();
        }
    }
    
    public void play() {
        if (!this.isCurrentSongPlaying()) {
            SongManager.mc.soundHandler.playSound(this.currentSong);
        }
    }
    
    public void stop() {
        if (this.isCurrentSongPlaying()) {
            SongManager.mc.soundHandler.stopSound(this.currentSong);
        }
    }
    
    private boolean isCurrentSongPlaying() {
        return SongManager.mc.soundHandler.isSoundPlaying(this.currentSong);
    }
    
    public void shuffle() {
        this.stop();
        Collections.shuffle(this.songs);
    }
    
    private ISound getRandomSong() {
        return this.songs.get(SongManager.random.nextInt(this.songs.size()));
    }
}
