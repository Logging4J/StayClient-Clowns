//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.manager;

import me.alpha432.stay.util.basement.wrapper.*;
import me.alpha432.stay.features.*;
import me.alpha432.stay.features.setting.*;
import me.alpha432.stay.client.*;
import java.util.stream.*;
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.util.*;
import com.google.gson.*;
import java.io.*;
import me.alpha432.stay.features.modules.*;

public class ConfigManager implements Util
{
    public ArrayList<Feature> features;
    public String config;
    
    public ConfigManager() {
        this.features = new ArrayList<Feature>();
        this.config = "Stay/config/";
    }
    
    public static void setValueFromJson(final Feature feature, final Setting setting, final JsonElement element) {
        final String type = setting.getType();
        switch (type) {
            case "Boolean": {
                setting.setValue((Object)element.getAsBoolean());
            }
            case "Double": {
                setting.setValue((Object)element.getAsDouble());
            }
            case "Float": {
                setting.setValue((Object)element.getAsFloat());
            }
            case "Integer": {
                setting.setValue((Object)element.getAsInt());
            }
            case "String": {
                final String str = element.getAsString();
                setting.setValue((Object)str.replace("_", " "));
            }
            case "Bind": {
                setting.setValue((Object)new Bind.BindConverter().doBackward(element));
            }
            case "Enum": {
                try {
                    final EnumConverter converter = new EnumConverter((Class)((Enum)setting.getValue()).getClass());
                    final Enum value = converter.doBackward(element);
                    setting.setValue((value == null) ? setting.getDefaultValue() : value);
                }
                catch (Exception ex) {}
            }
            default: {
                Stay.LOGGER.error("Unknown Setting type for: " + feature.getName() + " : " + setting.getName());
            }
        }
    }
    
    private static void loadFile(final JsonObject input, final Feature feature) {
        for (final Map.Entry<String, JsonElement> entry : input.entrySet()) {
            final String settingName = entry.getKey();
            final JsonElement element = entry.getValue();
            if (feature instanceof FriendManager) {
                try {
                    Stay.friendManager.addFriend(new FriendManager.Friend(element.getAsString(), UUID.fromString(settingName)));
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else {
                boolean settingFound = false;
                for (final Setting setting : feature.getSettings()) {
                    if (settingName.equals(setting.getName())) {
                        try {
                            setValueFromJson(feature, setting, element);
                        }
                        catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        settingFound = true;
                    }
                }
                if (settingFound) {}
            }
        }
    }
    
    public void loadConfig(final String name) {
        final List<File> files = Arrays.stream((Object[])Objects.requireNonNull((T[])new File("Stay").listFiles())).filter(File::isDirectory).collect((Collector<? super Object, ?, List<File>>)Collectors.toList());
        if (files.contains(new File("Stay/" + name + "/"))) {
            this.config = "Stay/" + name + "/";
        }
        else {
            this.config = "Stay/config/";
        }
        Stay.friendManager.onLoad();
        for (final Feature feature : this.features) {
            try {
                this.loadSettings(feature);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.saveCurrentConfig();
    }
    
    public boolean configExists(final String name) {
        final List<File> files = Arrays.stream((Object[])Objects.requireNonNull((T[])new File("Stay").listFiles())).filter(File::isDirectory).collect((Collector<? super Object, ?, List<File>>)Collectors.toList());
        return files.contains(new File("Stay/" + name + "/"));
    }
    
    public void saveConfig(final String name) {
        this.config = "Stay/" + name + "/";
        final File path = new File(this.config);
        if (!path.exists()) {
            path.mkdir();
        }
        Stay.friendManager.saveFriends();
        for (final Feature feature : this.features) {
            try {
                this.saveSettings(feature);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.saveCurrentConfig();
    }
    
    public void saveCurrentConfig() {
        final File currentConfig = new File("Stay/currentconfig.txt");
        try {
            if (currentConfig.exists()) {
                final FileWriter writer = new FileWriter(currentConfig);
                final String tempConfig = this.config.replaceAll("/", "");
                writer.write(tempConfig.replaceAll("Stay", ""));
                writer.close();
            }
            else {
                currentConfig.createNewFile();
                final FileWriter writer = new FileWriter(currentConfig);
                final String tempConfig = this.config.replaceAll("/", "");
                writer.write(tempConfig.replaceAll("Stay", ""));
                writer.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String loadCurrentConfig() {
        final File currentConfig = new File("Stay/currentconfig.txt");
        String name = "config";
        try {
            if (currentConfig.exists()) {
                final Scanner reader = new Scanner(currentConfig);
                while (reader.hasNextLine()) {
                    name = reader.nextLine();
                }
                reader.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }
    
    public void resetConfig(final boolean saveConfig, final String name) {
        for (final Feature feature : this.features) {
            feature.reset();
        }
        if (saveConfig) {
            this.saveConfig(name);
        }
    }
    
    public void saveSettings(final Feature feature) throws IOException {
        final JsonObject object = new JsonObject();
        final File directory = new File(this.config + this.getDirectory(feature));
        if (!directory.exists()) {
            directory.mkdir();
        }
        final String featureName = this.config + this.getDirectory(feature) + feature.getName() + ".json";
        final Path outputFile = Paths.get(featureName, new String[0]);
        if (!Files.exists(outputFile, new LinkOption[0])) {
            Files.createFile(outputFile, (FileAttribute<?>[])new FileAttribute[0]);
        }
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final String json = gson.toJson((JsonElement)this.writeSettings(feature));
        final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(outputFile, new OpenOption[0])));
        writer.write(json);
        writer.close();
    }
    
    public void init() {
        final ArrayList<Feature> features = this.features;
        final ModuleManager moduleManager = Stay.moduleManager;
        features.addAll((Collection<? extends Feature>)ModuleManager.modules);
        this.features.add(Stay.friendManager);
        final String name = this.loadCurrentConfig();
        this.loadConfig(name);
        Stay.LOGGER.info("Config loaded.");
    }
    
    private void loadSettings(final Feature feature) throws IOException {
        final String featureName = this.config + this.getDirectory(feature) + feature.getName() + ".json";
        final Path featurePath = Paths.get(featureName, new String[0]);
        if (!Files.exists(featurePath, new LinkOption[0])) {
            return;
        }
        this.loadPath(featurePath, feature);
    }
    
    private void loadPath(final Path path, final Feature feature) throws IOException {
        final InputStream stream = Files.newInputStream(path, new OpenOption[0]);
        try {
            loadFile(new JsonParser().parse((Reader)new InputStreamReader(stream)).getAsJsonObject(), feature);
        }
        catch (IllegalStateException e) {
            Stay.LOGGER.error("Bad Config File for: " + feature.getName() + ". Resetting...");
            loadFile(new JsonObject(), feature);
        }
        stream.close();
    }
    
    public JsonObject writeSettings(final Feature feature) {
        final JsonObject object = new JsonObject();
        final JsonParser jp = new JsonParser();
        for (final Setting setting : feature.getSettings()) {
            if (setting.isEnumSetting()) {
                final EnumConverter converter = new EnumConverter((Class)setting.getValue().getClass());
                object.add(setting.getName(), converter.doForwards(setting.getValue()));
            }
            else {
                if (setting.isStringSetting()) {
                    final String str = (String)setting.getValue();
                    setting.setValue((Object)str.replace(" ", "_"));
                }
                try {
                    object.add(setting.getName(), jp.parse(setting.getValueAsString()));
                }
                catch (Exception ex) {}
            }
        }
        return object;
    }
    
    public String getDirectory(final Feature feature) {
        String directory = "";
        if (feature instanceof Module) {
            directory = directory + ((Module)feature).getCategory().getName() + "/";
        }
        return directory;
    }
}
