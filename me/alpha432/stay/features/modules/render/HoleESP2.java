//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.render;

import me.alpha432.stay.features.modules.*;
import me.alpha432.stay.features.setting.*;
import java.util.concurrent.*;
import me.alpha432.stay.util.graphics.color.*;
import me.alpha432.stay.event.*;
import java.util.function.*;
import me.alpha432.stay.util.graphics.opengl.*;
import net.minecraft.util.math.*;
import me.alpha432.stay.util.math.*;
import java.awt.*;

public class HoleESP2 extends Module
{
    private Setting<Integer> range;
    public Setting<customHolesMode> customHoles;
    public Setting<typeMode> type;
    public Setting<modesss> mode;
    private Setting<Boolean> hideOwn;
    private Setting<Boolean> flatOwn;
    private Setting<Double> slabHeight;
    private Setting<Integer> width;
    private Setting<Integer> bedrockColor1;
    private Setting<Integer> bedrockColor2;
    private Setting<Integer> bedrockColor3;
    private Setting<Integer> obsidianColor1;
    private Setting<Integer> obsidianColor2;
    private Setting<Integer> obsidianColor3;
    private Setting<Integer> customColor1;
    private Setting<Integer> customColor2;
    private Setting<Integer> customColor3;
    private Setting<Integer> ufoAlpha;
    private ConcurrentHashMap<AxisAlignedBB, GSColor> holes;
    
    public HoleESP2() {
        super("HoleESP2", "Shows safe spots.", Module.Category.VISUAL, false, false, false);
        this.range = (Setting<Integer>)this.register(new Setting("Range", (T)10, (T)1, (T)20));
        this.customHoles = (Setting<customHolesMode>)this.register(new Setting("Show", (T)customHolesMode.Single));
        this.type = (Setting<typeMode>)this.register(new Setting("Render", (T)typeMode.Both));
        this.mode = (Setting<modesss>)this.register(new Setting("Mode", (T)modesss.Air));
        this.hideOwn = (Setting<Boolean>)this.register(new Setting("Hide Own", (T)false));
        this.flatOwn = (Setting<Boolean>)this.register(new Setting("Flat Own", (T)false));
        this.slabHeight = (Setting<Double>)this.register(new Setting("Slab Height", (T)0.5, (T)0.1, (T)1.5));
        this.width = (Setting<Integer>)this.register(new Setting("Width", (T)1, (T)1, (T)10));
        this.bedrockColor1 = (Setting<Integer>)this.register(new Setting("bedrockColor.Red", (T)0, (T)0, (T)255));
        this.bedrockColor2 = (Setting<Integer>)this.register(new Setting("bedrockColor.Green", (T)255, (T)0, (T)255));
        this.bedrockColor3 = (Setting<Integer>)this.register(new Setting("bedrockColor.Blue", (T)0, (T)0, (T)255));
        this.obsidianColor1 = (Setting<Integer>)this.register(new Setting("obsidianColor.Red", (T)255, (T)0, (T)255));
        this.obsidianColor2 = (Setting<Integer>)this.register(new Setting("obsidianColor.Green", (T)0, (T)0, (T)255));
        this.obsidianColor3 = (Setting<Integer>)this.register(new Setting("obsidianColor.Blue", (T)0, (T)0, (T)255));
        this.customColor1 = (Setting<Integer>)this.register(new Setting("customColor.Red", (T)255, (T)0, (T)255));
        this.customColor2 = (Setting<Integer>)this.register(new Setting("customColor.Green", (T)0, (T)0, (T)255));
        this.customColor3 = (Setting<Integer>)this.register(new Setting("customColor.Blue", (T)255, (T)0, (T)255));
        this.ufoAlpha = (Setting<Integer>)this.register(new Setting("UFOAlpha", (T)255, (T)0, (T)255));
    }
    
    public void onUpdate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //     6: ifnull          18
        //     9: getstatic       me/alpha432/stay/features/modules/render/HoleESP2.mc:Lnet/minecraft/client/Minecraft;
        //    12: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    15: ifnonnull       19
        //    18: return         
        //    19: aload_0         /* this */
        //    20: getfield        me/alpha432/stay/features/modules/render/HoleESP2.holes:Ljava/util/concurrent/ConcurrentHashMap;
        //    23: ifnonnull       40
        //    26: aload_0         /* this */
        //    27: new             Ljava/util/concurrent/ConcurrentHashMap;
        //    30: dup            
        //    31: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //    34: putfield        me/alpha432/stay/features/modules/render/HoleESP2.holes:Ljava/util/concurrent/ConcurrentHashMap;
        //    37: goto            47
        //    40: aload_0         /* this */
        //    41: getfield        me/alpha432/stay/features/modules/render/HoleESP2.holes:Ljava/util/concurrent/ConcurrentHashMap;
        //    44: invokevirtual   java/util/concurrent/ConcurrentHashMap.clear:()V
        //    47: aload_0         /* this */
        //    48: getfield        me/alpha432/stay/features/modules/render/HoleESP2.range:Lme/alpha432/stay/features/setting/Setting;
        //    51: invokevirtual   me/alpha432/stay/features/setting/Setting.getValue:()Ljava/lang/Object;
        //    54: checkcast       Ljava/lang/Integer;
        //    57: invokevirtual   java/lang/Integer.intValue:()I
        //    60: i2d            
        //    61: invokestatic    java/lang/Math.ceil:(D)D
        //    64: d2i            
        //    65: istore_1        /* range */
        //    66: invokestatic    com/google/common/collect/Sets.newHashSet:()Ljava/util/HashSet;
        //    69: astore_2        /* possibleHoles */
        //    70: invokestatic    me/alpha432/stay/util/player/PlayerUtil.getPlayerPos:()Lnet/minecraft/util/math/BlockPos;
        //    73: iload_1         /* range */
        //    74: i2f            
        //    75: iload_1         /* range */
        //    76: iconst_0       
        //    77: iconst_1       
        //    78: iconst_0       
        //    79: invokestatic    me/alpha432/stay/util/world/EntityUtils.getSphere:(Lnet/minecraft/util/math/BlockPos;FIZZI)Ljava/util/List;
        //    82: astore_3        /* blockPosList */
        //    83: aload_3         /* blockPosList */
        //    84: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    89: astore          4
        //    91: aload           4
        //    93: invokeinterface java/util/Iterator.hasNext:()Z
        //    98: ifeq            250
        //   101: aload           4
        //   103: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   108: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   111: astore          pos
        //   113: getstatic       me/alpha432/stay/features/modules/render/HoleESP2.mc:Lnet/minecraft/client/Minecraft;
        //   116: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //   119: aload           pos
        //   121: invokevirtual   net/minecraft/client/multiplayer/WorldClient.getBlockState:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   124: invokeinterface net/minecraft/block/state/IBlockState.getBlock:()Lnet/minecraft/block/Block;
        //   129: getstatic       net/minecraft/init/Blocks.AIR:Lnet/minecraft/block/Block;
        //   132: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   135: ifne            141
        //   138: goto            91
        //   141: getstatic       me/alpha432/stay/features/modules/render/HoleESP2.mc:Lnet/minecraft/client/Minecraft;
        //   144: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //   147: aload           pos
        //   149: iconst_0       
        //   150: iconst_m1      
        //   151: iconst_0       
        //   152: invokevirtual   net/minecraft/util/math/BlockPos.add:(III)Lnet/minecraft/util/math/BlockPos;
        //   155: invokevirtual   net/minecraft/client/multiplayer/WorldClient.getBlockState:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   158: invokeinterface net/minecraft/block/state/IBlockState.getBlock:()Lnet/minecraft/block/Block;
        //   163: getstatic       net/minecraft/init/Blocks.AIR:Lnet/minecraft/block/Block;
        //   166: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   169: ifeq            175
        //   172: goto            91
        //   175: getstatic       me/alpha432/stay/features/modules/render/HoleESP2.mc:Lnet/minecraft/client/Minecraft;
        //   178: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //   181: aload           pos
        //   183: iconst_0       
        //   184: iconst_1       
        //   185: iconst_0       
        //   186: invokevirtual   net/minecraft/util/math/BlockPos.add:(III)Lnet/minecraft/util/math/BlockPos;
        //   189: invokevirtual   net/minecraft/client/multiplayer/WorldClient.getBlockState:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   192: invokeinterface net/minecraft/block/state/IBlockState.getBlock:()Lnet/minecraft/block/Block;
        //   197: getstatic       net/minecraft/init/Blocks.AIR:Lnet/minecraft/block/Block;
        //   200: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   203: ifne            209
        //   206: goto            91
        //   209: getstatic       me/alpha432/stay/features/modules/render/HoleESP2.mc:Lnet/minecraft/client/Minecraft;
        //   212: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //   215: aload           pos
        //   217: iconst_0       
        //   218: iconst_2       
        //   219: iconst_0       
        //   220: invokevirtual   net/minecraft/util/math/BlockPos.add:(III)Lnet/minecraft/util/math/BlockPos;
        //   223: invokevirtual   net/minecraft/client/multiplayer/WorldClient.getBlockState:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   226: invokeinterface net/minecraft/block/state/IBlockState.getBlock:()Lnet/minecraft/block/Block;
        //   231: getstatic       net/minecraft/init/Blocks.AIR:Lnet/minecraft/block/Block;
        //   234: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   237: ifeq            247
        //   240: aload_2         /* possibleHoles */
        //   241: aload           pos
        //   243: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   246: pop            
        //   247: goto            91
        //   250: aload_2         /* possibleHoles */
        //   251: aload_0         /* this */
        //   252: invokedynamic   BootstrapMethod #0, accept:(Lme/alpha432/stay/features/modules/render/HoleESP2;)Ljava/util/function/Consumer;
        //   257: invokevirtual   java/util/HashSet.forEach:(Ljava/util/function/Consumer;)V
        //   260: return         
        //    StackMapTable: 00 0A 12 00 14 06 FF 00 2B 00 05 07 00 02 01 07 01 07 07 01 01 07 01 09 00 00 FC 00 31 07 01 12 21 21 FA 00 25 FA 00 02
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Could not infer any expression.
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:374)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.base/java.lang.Thread.run(Thread.java:833)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void onRender3D(final Render3DEvent event) {
        if (HoleESP2.mc.player == null || HoleESP2.mc.world == null || this.holes == null || this.holes.isEmpty()) {
            return;
        }
        this.holes.forEach(this::renderHoles);
    }
    
    private void renderHoles(final AxisAlignedBB hole, final GSColor color) {
        final String string = this.type.getValue().toString();
        switch (string) {
            case "Outline": {
                this.renderOutline(hole, color);
                break;
            }
            case "Fill": {
                this.renderFill(hole, color);
                break;
            }
            case "Both": {
                this.renderOutline(hole, color);
                this.renderFill(hole, color);
                break;
            }
        }
    }
    
    private void renderFill(final AxisAlignedBB hole, final GSColor color) {
        final GSColor fillColor = new GSColor(color, 50);
        final int ufoAlpha = this.ufoAlpha.getValue() * 50 / 255;
        if (this.hideOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
            return;
        }
        final String string = this.mode.getValue().toString();
        switch (string) {
            case "Air": {
                if (this.flatOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
                    RenderUtil.drawBox(hole, true, 1.0, fillColor, ufoAlpha, 1);
                    break;
                }
                RenderUtil.drawBox(hole, true, 1.0, fillColor, ufoAlpha, 63);
                break;
            }
            case "Ground": {
                RenderUtil.drawBox(hole.offset(0.0, -1.0, 0.0), true, 1.0, new GSColor(fillColor, ufoAlpha), fillColor.getAlpha(), 63);
                break;
            }
            case "Flat": {
                RenderUtil.drawBox(hole, true, 1.0, fillColor, ufoAlpha, 1);
                break;
            }
            case "Slab": {
                if (this.flatOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
                    RenderUtil.drawBox(hole, true, 1.0, fillColor, ufoAlpha, 1);
                    break;
                }
                RenderUtil.drawBox(hole, false, this.slabHeight.getValue(), fillColor, ufoAlpha, 63);
                break;
            }
            case "Double": {
                if (this.flatOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
                    RenderUtil.drawBox(hole, true, 1.0, fillColor, ufoAlpha, 1);
                    break;
                }
                RenderUtil.drawBox(hole.setMaxY(hole.maxY + 1.0), true, 2.0, fillColor, ufoAlpha, 63);
                break;
            }
        }
    }
    
    private void renderOutline(final AxisAlignedBB hole, final GSColor color) {
        final GSColor outlineColor = new GSColor(color, 255);
        if (this.hideOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
            return;
        }
        final String string = this.mode.getValue().toString();
        switch (string) {
            case "Air": {
                if (this.flatOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
                    RenderUtil.drawBoundingBoxWithSides(hole, this.width.getValue(), outlineColor, this.ufoAlpha.getValue(), 1);
                    break;
                }
                RenderUtil.drawBoundingBox(hole, this.width.getValue(), outlineColor, this.ufoAlpha.getValue());
                break;
            }
            case "Ground": {
                RenderUtil.drawBoundingBox(hole.offset(0.0, -1.0, 0.0), this.width.getValue(), new GSColor(outlineColor, this.ufoAlpha.getValue()), outlineColor.getAlpha());
                break;
            }
            case "Flat": {
                RenderUtil.drawBoundingBoxWithSides(hole, this.width.getValue(), outlineColor, this.ufoAlpha.getValue(), 1);
                break;
            }
            case "Slab": {
                if (this.flatOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
                    RenderUtil.drawBoundingBoxWithSides(hole, this.width.getValue(), outlineColor, this.ufoAlpha.getValue(), 1);
                    break;
                }
                RenderUtil.drawBoundingBox(hole.setMaxY(hole.minY + this.slabHeight.getValue()), this.width.getValue(), outlineColor, this.ufoAlpha.getValue());
                break;
            }
            case "Double": {
                if (this.flatOwn.getValue() && hole.intersects(HoleESP2.mc.player.getEntityBoundingBox())) {
                    RenderUtil.drawBoundingBoxWithSides(hole, this.width.getValue(), outlineColor, this.ufoAlpha.getValue(), 1);
                    break;
                }
                RenderUtil.drawBoundingBox(hole.setMaxY(hole.maxY + 1.0), this.width.getValue(), outlineColor, this.ufoAlpha.getValue());
                break;
            }
        }
    }
    
    public enum customHolesMode
    {
        Single, 
        Double, 
        Custom;
    }
    
    public enum modesss
    {
        Air, 
        Ground, 
        Flat, 
        Slab, 
        Double;
    }
    
    public enum typeMode
    {
        Outline, 
        Fill, 
        Both;
    }
}
