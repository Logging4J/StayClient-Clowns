//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;

public class TexturedChams extends Module
{
    public static Setting<Integer> red;
    public static Setting<Integer> green;
    public static Setting<Integer> blue;
    public static Setting<Integer> alpha;
    
    public TexturedChams() {
        super("TexturedChams", "hi yes", Module.Category.VISUAL, true, false, true);
        TexturedChams.red = (Setting<Integer>)this.register(new Setting("Red", (T)168, (T)0, (T)255));
        TexturedChams.green = (Setting<Integer>)this.register(new Setting("Green", (T)0, (T)0, (T)255));
        TexturedChams.blue = (Setting<Integer>)this.register(new Setting("Blue", (T)232, (T)0, (T)255));
        TexturedChams.alpha = (Setting<Integer>)this.register(new Setting("Alpha", (T)150, (T)0, (T)255));
    }
}
