//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.client;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.features.gui.*;
import net.minecraft.client.settings.*;
import me.alpha432.stay.event.*;
import me.alpha432.stay.client.*;
import com.mojang.realmsclient.gui.*;
import me.alpha432.stay.features.command.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.gui.*;

public class ClickGui extends Module
{
    private static ClickGui INSTANCE;
    public Setting<String> prefix;
    public Setting<Boolean> customFov;
    public Setting<Boolean> gui;
    public Setting<Float> fov;
    public Setting<Integer> red;
    public Setting<Integer> green;
    public Setting<Integer> blue;
    public Setting<Integer> hoverAlpha;
    public Setting<Integer> topRed;
    public Setting<Integer> topGreen;
    public Setting<Integer> topBlue;
    public Setting<Integer> alpha;
    public Setting<Boolean> rainbow;
    public Setting<rainbowMode> rainbowModeHud;
    public Setting<rainbowModeArray> rainbowModeA;
    public Setting<Integer> rainbowHue;
    public Setting<Float> rainbowBrightness;
    public Setting<Float> rainbowSaturation;
    public Setting<Integer> fadingLength;
    private StayGui click;
    
    public ClickGui() {
        super("ClickGui", "Opens the ClickGui, color by SexyMemory", Category.CLIENT, true, false, false);
        this.prefix = (Setting<String>)this.register(new Setting("Prefix", (T)"."));
        this.customFov = (Setting<Boolean>)this.register(new Setting("CustomFov", (T)true));
        this.gui = (Setting<Boolean>)this.register(new Setting("CustomMainMenu", (T)true));
        this.fov = (Setting<Float>)this.register(new Setting("Fov", (T)150.0f, (T)(-180.0f), (T)180.0f));
        this.red = (Setting<Integer>)this.register(new Setting("Red", (T)0, (T)0, (T)255));
        this.green = (Setting<Integer>)this.register(new Setting("Green", (T)0, (T)0, (T)255));
        this.blue = (Setting<Integer>)this.register(new Setting("Blue", (T)255, (T)0, (T)255));
        this.hoverAlpha = (Setting<Integer>)this.register(new Setting("Alpha", (T)180, (T)0, (T)255));
        this.topRed = (Setting<Integer>)this.register(new Setting("SecondRed", (T)0, (T)0, (T)255));
        this.topGreen = (Setting<Integer>)this.register(new Setting("SecondGreen", (T)0, (T)0, (T)255));
        this.topBlue = (Setting<Integer>)this.register(new Setting("SecondBlue", (T)150, (T)0, (T)255));
        this.alpha = (Setting<Integer>)this.register(new Setting("HoverAlpha", (T)240, (T)0, (T)255));
        this.rainbow = (Setting<Boolean>)this.register(new Setting("Rainbow", (T)false));
        this.rainbowModeHud = (Setting<rainbowMode>)this.register(new Setting("HRainbowMode", (T)rainbowMode.Static, v -> this.rainbow.getValue()));
        this.rainbowModeA = (Setting<rainbowModeArray>)this.register(new Setting("ARainbowMode", (T)rainbowModeArray.Static, v -> this.rainbow.getValue()));
        this.rainbowHue = (Setting<Integer>)this.register(new Setting("Delay", (T)240, (T)0, (T)600, v -> this.rainbow.getValue()));
        this.rainbowBrightness = (Setting<Float>)this.register(new Setting("Brightness ", (T)150.0f, (T)1.0f, (T)255.0f, v -> this.rainbow.getValue()));
        this.rainbowSaturation = (Setting<Float>)this.register(new Setting("Saturation", (T)150.0f, (T)1.0f, (T)255.0f, v -> this.rainbow.getValue()));
        this.fadingLength = (Setting<Integer>)this.register(new Setting("Fading Time", (T)500, (T)20, (T)5000));
        this.setInstance();
    }
    
    public static ClickGui getInstance() {
        if (ClickGui.INSTANCE == null) {
            ClickGui.INSTANCE = new ClickGui();
        }
        return ClickGui.INSTANCE;
    }
    
    private void setInstance() {
        ClickGui.INSTANCE = this;
    }
    
    @Override
    public void onUpdate() {
        if (this.customFov.getValue()) {
            ClickGui.mc.gameSettings.setOptionFloatValue(GameSettings.Options.FOV, (float)this.fov.getValue());
        }
    }
    
    @SubscribeEvent
    public void onSettingChange(final ClientEvent event) {
        if (event.getStage() == 2 && event.getSetting().getFeature().equals(this)) {
            if (event.getSetting().equals(this.prefix)) {
                Stay.commandManager.setPrefix(this.prefix.getPlannedValue());
                Command.sendMessage("Prefix set to " + ChatFormatting.DARK_GRAY + Stay.commandManager.getPrefix());
            }
            Stay.colorManager.setColor(this.red.getPlannedValue(), this.green.getPlannedValue(), this.blue.getPlannedValue(), this.hoverAlpha.getPlannedValue());
        }
    }
    
    @Override
    public void onEnable() {
        ClickGui.mc.displayGuiScreen((GuiScreen)StayGui.getClickGui());
    }
    
    @Override
    public void onLoad() {
        Stay.colorManager.setColor(this.red.getValue(), this.green.getValue(), this.blue.getValue(), this.hoverAlpha.getValue());
        Stay.commandManager.setPrefix(this.prefix.getValue());
    }
    
    @Override
    public void onTick() {
        if (!(ClickGui.mc.currentScreen instanceof StayGui)) {
            this.disable();
        }
    }
    
    static {
        ClickGui.INSTANCE = new ClickGui();
    }
    
    public enum ModeS
    {
        GUI1, 
        GUI2, 
        GUI3, 
        GUI4, 
        GUI5, 
        GUI6, 
        GUI7, 
        GUI8, 
        GUI9, 
        GUI10, 
        URL;
    }
    
    public enum rainbowModeArray
    {
        Static, 
        Up;
    }
    
    public enum rainbowMode
    {
        Static, 
        Sideway;
    }
}
