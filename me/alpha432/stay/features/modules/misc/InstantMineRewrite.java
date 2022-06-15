//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.misc;

import me.alpha432.stay.features.modules.*;
import kotlin.*;
import kotlin.reflect.*;
import me.alpha432.stay.util.delegate.*;
import java.util.*;
import net.minecraft.block.*;
import me.alpha432.stay.util.counting.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u00108\u001a\u000209H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u001aR\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b#\u0010\u001aR\u001b\u0010%\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b&\u0010\u001aR\u001b\u0010(\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b)\u0010\u0006R\u001b\u0010+\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b,\u0010\u0006R\u001b\u0010.\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b/\u0010\u0006R\u001b\u00101\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b2\u0010\u0006R\u001c\u00104\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u0001060605X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:" }, d2 = { "Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;", "Lme/alpha432/stay/features/modules/Module;", "()V", "alphaAfter", "", "getAlphaAfter", "()I", "alphaAfter$delegate", "Lme/alpha432/stay/util/delegate/Value;", "alphaBefore", "getAlphaBefore", "alphaBefore$delegate", "blueAfter", "getBlueAfter", "blueAfter$delegate", "blueBefore", "getBlueBefore", "blueBefore$delegate", "breakPos", "Lnet/minecraft/util/math/BlockPos;", "breakSuccess", "Lme/alpha432/stay/util/counting/Timer;", "cancelStart", "", "creativeMode", "getCreativeMode", "()Z", "creativeMode$delegate", "doRender", "getDoRender", "doRender$delegate", "empty", "facing", "Lnet/minecraft/util/EnumFacing;", "fucker", "getFucker", "fucker$delegate", "ghostHand", "getGhostHand", "ghostHand$delegate", "greenAfter", "getGreenAfter", "greenAfter$delegate", "greenBefore", "getGreenBefore", "greenBefore$delegate", "redAfter", "getRedAfter", "redAfter$delegate", "redBefore", "getRedBefore", "redBefore$delegate", "unbreakableBlocks", "", "Lnet/minecraft/block/Block;", "kotlin.jvm.PlatformType", "getDisplayInfo", "", "Stay" })
public final class InstantMineRewrite extends Module
{
    @NotNull
    public static final InstantMineRewrite INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value creativeMode$delegate;
    @NotNull
    private static final Value ghostHand$delegate;
    @NotNull
    private static final Value fucker$delegate;
    @NotNull
    private static final Value doRender$delegate;
    @NotNull
    private static final Value redBefore$delegate;
    @NotNull
    private static final Value greenBefore$delegate;
    @NotNull
    private static final Value blueBefore$delegate;
    @NotNull
    private static final Value alphaBefore$delegate;
    @NotNull
    private static final Value redAfter$delegate;
    @NotNull
    private static final Value greenAfter$delegate;
    @NotNull
    private static final Value blueAfter$delegate;
    @NotNull
    private static final Value alphaAfter$delegate;
    @NotNull
    private static final List<Block> unbreakableBlocks;
    @NotNull
    private static final Timer breakSuccess;
    private static boolean cancelStart;
    private static boolean empty;
    @NotNull
    private static EnumFacing facing;
    @JvmField
    @Nullable
    public static BlockPos breakPos;
    
    private InstantMineRewrite() {
        super("InstantMine", "Rewrite by xiguajerry", Category.MISC, true, false, false);
    }
    
    private final boolean getCreativeMode() {
        return InstantMineRewrite.creativeMode$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[0]);
    }
    
    private final boolean getGhostHand() {
        return InstantMineRewrite.ghostHand$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[1]);
    }
    
    private final boolean getFucker() {
        return InstantMineRewrite.fucker$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[2]);
    }
    
    private final boolean getDoRender() {
        return InstantMineRewrite.doRender$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[3]);
    }
    
    private final int getRedBefore() {
        return InstantMineRewrite.redBefore$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[4]).intValue();
    }
    
    private final int getGreenBefore() {
        return InstantMineRewrite.greenBefore$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[5]).intValue();
    }
    
    private final int getBlueBefore() {
        return InstantMineRewrite.blueBefore$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[6]).intValue();
    }
    
    private final int getAlphaBefore() {
        return InstantMineRewrite.alphaBefore$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[7]).intValue();
    }
    
    private final int getRedAfter() {
        return InstantMineRewrite.redAfter$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[8]).intValue();
    }
    
    private final int getGreenAfter() {
        return InstantMineRewrite.greenAfter$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[9]).intValue();
    }
    
    private final int getBlueAfter() {
        return InstantMineRewrite.blueAfter$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[10]).intValue();
    }
    
    private final int getAlphaAfter() {
        return InstantMineRewrite.alphaAfter$delegate.getValue(this, InstantMineRewrite.$$delegatedProperties[11]).intValue();
    }
    
    @NotNull
    @Override
    public String getDisplayInfo() {
        return this.getGhostHand() ? "Ghost" : "Normal";
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: anewarray       Lkotlin/reflect/KProperty;
        //     5: astore_0       
        //     6: aload_0        
        //     7: iconst_0       
        //     8: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    11: dup            
        //    12: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //    14: ldc             "creativeMode"
        //    16: ldc             "getCreativeMode()Z"
        //    18: iconst_0       
        //    19: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    22: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    25: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    28: checkcast       Lkotlin/reflect/KProperty;
        //    31: aastore        
        //    32: aload_0        
        //    33: iconst_1       
        //    34: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    37: dup            
        //    38: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //    40: ldc             "ghostHand"
        //    42: ldc_w           "getGhostHand()Z"
        //    45: iconst_0       
        //    46: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    49: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    52: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    55: checkcast       Lkotlin/reflect/KProperty;
        //    58: aastore        
        //    59: aload_0        
        //    60: iconst_2       
        //    61: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    64: dup            
        //    65: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //    67: ldc_w           "fucker"
        //    70: ldc_w           "getFucker()Z"
        //    73: iconst_0       
        //    74: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    77: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    80: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    83: checkcast       Lkotlin/reflect/KProperty;
        //    86: aastore        
        //    87: aload_0        
        //    88: iconst_3       
        //    89: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    92: dup            
        //    93: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //    95: ldc_w           "doRender"
        //    98: ldc_w           "getDoRender()Z"
        //   101: iconst_0       
        //   102: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   105: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   108: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   111: checkcast       Lkotlin/reflect/KProperty;
        //   114: aastore        
        //   115: aload_0        
        //   116: iconst_4       
        //   117: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   120: dup            
        //   121: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   123: ldc_w           "redBefore"
        //   126: ldc_w           "getRedBefore()I"
        //   129: iconst_0       
        //   130: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   133: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   136: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   139: checkcast       Lkotlin/reflect/KProperty;
        //   142: aastore        
        //   143: aload_0        
        //   144: iconst_5       
        //   145: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   148: dup            
        //   149: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   151: ldc_w           "greenBefore"
        //   154: ldc_w           "getGreenBefore()I"
        //   157: iconst_0       
        //   158: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   161: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   164: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   167: checkcast       Lkotlin/reflect/KProperty;
        //   170: aastore        
        //   171: aload_0        
        //   172: bipush          6
        //   174: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   177: dup            
        //   178: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   180: ldc_w           "blueBefore"
        //   183: ldc_w           "getBlueBefore()I"
        //   186: iconst_0       
        //   187: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   190: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   193: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   196: checkcast       Lkotlin/reflect/KProperty;
        //   199: aastore        
        //   200: aload_0        
        //   201: bipush          7
        //   203: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   206: dup            
        //   207: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   209: ldc_w           "alphaBefore"
        //   212: ldc_w           "getAlphaBefore()I"
        //   215: iconst_0       
        //   216: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   219: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   222: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   225: checkcast       Lkotlin/reflect/KProperty;
        //   228: aastore        
        //   229: aload_0        
        //   230: bipush          8
        //   232: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   235: dup            
        //   236: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   238: ldc_w           "redAfter"
        //   241: ldc_w           "getRedAfter()I"
        //   244: iconst_0       
        //   245: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   248: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   251: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   254: checkcast       Lkotlin/reflect/KProperty;
        //   257: aastore        
        //   258: aload_0        
        //   259: bipush          9
        //   261: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   264: dup            
        //   265: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   267: ldc_w           "greenAfter"
        //   270: ldc_w           "getGreenAfter()I"
        //   273: iconst_0       
        //   274: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   277: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   280: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   283: checkcast       Lkotlin/reflect/KProperty;
        //   286: aastore        
        //   287: aload_0        
        //   288: bipush          10
        //   290: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   293: dup            
        //   294: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   296: ldc_w           "blueAfter"
        //   299: ldc_w           "getBlueAfter()I"
        //   302: iconst_0       
        //   303: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   306: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   309: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   312: checkcast       Lkotlin/reflect/KProperty;
        //   315: aastore        
        //   316: aload_0        
        //   317: bipush          11
        //   319: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   322: dup            
        //   323: ldc             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;.class
        //   325: ldc_w           "alphaAfter"
        //   328: ldc_w           "getAlphaAfter()I"
        //   331: iconst_0       
        //   332: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   335: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   338: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   341: checkcast       Lkotlin/reflect/KProperty;
        //   344: aastore        
        //   345: aload_0        
        //   346: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   349: new             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   352: dup            
        //   353: invokespecial   me/alpha432/stay/features/modules/misc/InstantMineRewrite.<init>:()V
        //   356: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   359: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   362: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   365: ldc_w           "CreativeMode"
        //   368: iconst_1       
        //   369: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //   372: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.creativeMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   375: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   378: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   381: ldc_w           "GhostHand"
        //   384: iconst_1       
        //   385: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //   388: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.ghostHand$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   391: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   394: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   397: ldc_w           "Super Ghost Hand"
        //   400: iconst_1       
        //   401: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //   404: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.fucker$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   407: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   410: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   413: ldc_w           "Render"
        //   416: iconst_1       
        //   417: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //   420: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.doRender$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   423: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   426: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   429: ldc_w           "RedBefore"
        //   432: sipush          255
        //   435: new             Lkotlin/ranges/IntRange;
        //   438: dup            
        //   439: iconst_0       
        //   440: sipush          255
        //   443: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   446: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   449: astore_0       
        //   450: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$redBefore$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$redBefore$2;
        //   453: checkcast       Lkotlin/jvm/functions/Function1;
        //   456: astore_1        /* block$iv */
        //   457: iconst_0       
        //   458: istore_2        /* $i$f$visible */
        //   459: aload_0         /* $this$visible$iv */
        //   460: astore_3       
        //   461: aload_3        
        //   462: astore          it$iv
        //   464: iconst_0       
        //   465: istore          $i$a$-also-ValueKt$visible$1$iv
        //   467: aload           it$iv
        //   469: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   472: dup            
        //   473: aload_1         /* block$iv */
        //   474: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   477: checkcast       Ljava/util/function/Predicate;
        //   480: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   483: aload_3        
        //   484: nop            
        //   485: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.redBefore$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   488: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   491: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   494: ldc_w           "GreenBefore"
        //   497: iconst_0       
        //   498: new             Lkotlin/ranges/IntRange;
        //   501: dup            
        //   502: iconst_0       
        //   503: sipush          255
        //   506: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   509: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   512: astore_0       
        //   513: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$greenBefore$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$greenBefore$2;
        //   516: checkcast       Lkotlin/jvm/functions/Function1;
        //   519: astore_1        /* block$iv */
        //   520: iconst_0       
        //   521: istore_2        /* $i$f$visible */
        //   522: aload_0         /* $this$visible$iv */
        //   523: astore_3       
        //   524: aload_3        
        //   525: astore          it$iv
        //   527: iconst_0       
        //   528: istore          $i$a$-also-ValueKt$visible$1$iv
        //   530: aload           it$iv
        //   532: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   535: dup            
        //   536: aload_1         /* block$iv */
        //   537: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   540: checkcast       Ljava/util/function/Predicate;
        //   543: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   546: aload_3        
        //   547: nop            
        //   548: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.greenBefore$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   551: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   554: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   557: ldc_w           "BlueBefore"
        //   560: bipush          44
        //   562: new             Lkotlin/ranges/IntRange;
        //   565: dup            
        //   566: iconst_0       
        //   567: sipush          255
        //   570: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   573: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   576: astore_0       
        //   577: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$blueBefore$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$blueBefore$2;
        //   580: checkcast       Lkotlin/jvm/functions/Function1;
        //   583: astore_1        /* block$iv */
        //   584: iconst_0       
        //   585: istore_2        /* $i$f$visible */
        //   586: aload_0         /* $this$visible$iv */
        //   587: astore_3       
        //   588: aload_3        
        //   589: astore          it$iv
        //   591: iconst_0       
        //   592: istore          $i$a$-also-ValueKt$visible$1$iv
        //   594: aload           it$iv
        //   596: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   599: dup            
        //   600: aload_1         /* block$iv */
        //   601: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   604: checkcast       Ljava/util/function/Predicate;
        //   607: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   610: aload_3        
        //   611: nop            
        //   612: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.blueBefore$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   615: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   618: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   621: ldc_w           "AlphaBefore"
        //   624: bipush          127
        //   626: new             Lkotlin/ranges/IntRange;
        //   629: dup            
        //   630: iconst_0       
        //   631: sipush          255
        //   634: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   637: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   640: astore_0       
        //   641: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$alphaBefore$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$alphaBefore$2;
        //   644: checkcast       Lkotlin/jvm/functions/Function1;
        //   647: astore_1        /* block$iv */
        //   648: iconst_0       
        //   649: istore_2        /* $i$f$visible */
        //   650: aload_0         /* $this$visible$iv */
        //   651: astore_3       
        //   652: aload_3        
        //   653: astore          it$iv
        //   655: iconst_0       
        //   656: istore          $i$a$-also-ValueKt$visible$1$iv
        //   658: aload           it$iv
        //   660: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   663: dup            
        //   664: aload_1         /* block$iv */
        //   665: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   668: checkcast       Ljava/util/function/Predicate;
        //   671: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   674: aload_3        
        //   675: nop            
        //   676: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.alphaBefore$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   679: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   682: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   685: ldc_w           "RedAfter"
        //   688: iconst_0       
        //   689: new             Lkotlin/ranges/IntRange;
        //   692: dup            
        //   693: iconst_0       
        //   694: sipush          255
        //   697: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   700: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   703: astore_0       
        //   704: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$redAfter$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$redAfter$2;
        //   707: checkcast       Lkotlin/jvm/functions/Function1;
        //   710: astore_1        /* block$iv */
        //   711: iconst_0       
        //   712: istore_2        /* $i$f$visible */
        //   713: aload_0         /* $this$visible$iv */
        //   714: astore_3       
        //   715: aload_3        
        //   716: astore          it$iv
        //   718: iconst_0       
        //   719: istore          $i$a$-also-ValueKt$visible$1$iv
        //   721: aload           it$iv
        //   723: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   726: dup            
        //   727: aload_1         /* block$iv */
        //   728: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   731: checkcast       Ljava/util/function/Predicate;
        //   734: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   737: aload_3        
        //   738: nop            
        //   739: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.redAfter$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   742: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   745: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   748: ldc_w           "GreenAfter"
        //   751: sipush          255
        //   754: new             Lkotlin/ranges/IntRange;
        //   757: dup            
        //   758: iconst_0       
        //   759: sipush          255
        //   762: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   765: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   768: astore_0       
        //   769: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$greenAfter$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$greenAfter$2;
        //   772: checkcast       Lkotlin/jvm/functions/Function1;
        //   775: astore_1        /* block$iv */
        //   776: iconst_0       
        //   777: istore_2        /* $i$f$visible */
        //   778: aload_0         /* $this$visible$iv */
        //   779: astore_3       
        //   780: aload_3        
        //   781: astore          it$iv
        //   783: iconst_0       
        //   784: istore          $i$a$-also-ValueKt$visible$1$iv
        //   786: aload           it$iv
        //   788: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   791: dup            
        //   792: aload_1         /* block$iv */
        //   793: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   796: checkcast       Ljava/util/function/Predicate;
        //   799: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   802: aload_3        
        //   803: nop            
        //   804: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.greenAfter$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   807: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   810: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   813: ldc_w           "BlueAfter"
        //   816: bipush          44
        //   818: new             Lkotlin/ranges/IntRange;
        //   821: dup            
        //   822: iconst_0       
        //   823: sipush          255
        //   826: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   829: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   832: astore_0       
        //   833: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$blueAfter$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$blueAfter$2;
        //   836: checkcast       Lkotlin/jvm/functions/Function1;
        //   839: astore_1        /* block$iv */
        //   840: iconst_0       
        //   841: istore_2        /* $i$f$visible */
        //   842: aload_0         /* $this$visible$iv */
        //   843: astore_3       
        //   844: aload_3        
        //   845: astore          it$iv
        //   847: iconst_0       
        //   848: istore          $i$a$-also-ValueKt$visible$1$iv
        //   850: aload           it$iv
        //   852: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   855: dup            
        //   856: aload_1         /* block$iv */
        //   857: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   860: checkcast       Ljava/util/function/Predicate;
        //   863: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   866: aload_3        
        //   867: nop            
        //   868: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.blueAfter$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   871: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //   874: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   877: ldc_w           "AlphaAfter"
        //   880: bipush          127
        //   882: new             Lkotlin/ranges/IntRange;
        //   885: dup            
        //   886: iconst_0       
        //   887: sipush          255
        //   890: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //   893: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //   896: astore_0       
        //   897: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$alphaAfter$2.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$alphaAfter$2;
        //   900: checkcast       Lkotlin/jvm/functions/Function1;
        //   903: astore_1        /* block$iv */
        //   904: iconst_0       
        //   905: istore_2        /* $i$f$visible */
        //   906: aload_0         /* $this$visible$iv */
        //   907: astore_3       
        //   908: aload_3        
        //   909: astore          it$iv
        //   911: iconst_0       
        //   912: istore          $i$a$-also-ValueKt$visible$1$iv
        //   914: aload           it$iv
        //   916: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   919: dup            
        //   920: aload_1         /* block$iv */
        //   921: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   924: checkcast       Ljava/util/function/Predicate;
        //   927: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   930: aload_3        
        //   931: nop            
        //   932: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.alphaAfter$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   935: bipush          6
        //   937: anewarray       Lnet/minecraft/block/Block;
        //   940: astore_0       
        //   941: aload_0        
        //   942: iconst_0       
        //   943: getstatic       net/minecraft/init/Blocks.AIR:Lnet/minecraft/block/Block;
        //   946: aastore        
        //   947: aload_0        
        //   948: iconst_1       
        //   949: getstatic       net/minecraft/init/Blocks.FLOWING_LAVA:Lnet/minecraft/block/BlockDynamicLiquid;
        //   952: checkcast       Lnet/minecraft/block/Block;
        //   955: aastore        
        //   956: aload_0        
        //   957: iconst_2       
        //   958: getstatic       net/minecraft/init/Blocks.LAVA:Lnet/minecraft/block/BlockStaticLiquid;
        //   961: checkcast       Lnet/minecraft/block/Block;
        //   964: aastore        
        //   965: aload_0        
        //   966: iconst_3       
        //   967: getstatic       net/minecraft/init/Blocks.FLOWING_WATER:Lnet/minecraft/block/BlockDynamicLiquid;
        //   970: checkcast       Lnet/minecraft/block/Block;
        //   973: aastore        
        //   974: aload_0        
        //   975: iconst_4       
        //   976: getstatic       net/minecraft/init/Blocks.WATER:Lnet/minecraft/block/BlockStaticLiquid;
        //   979: checkcast       Lnet/minecraft/block/Block;
        //   982: aastore        
        //   983: aload_0        
        //   984: iconst_5       
        //   985: getstatic       net/minecraft/init/Blocks.BEDROCK:Lnet/minecraft/block/Block;
        //   988: aastore        
        //   989: aload_0        
        //   990: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   993: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.unbreakableBlocks:Ljava/util/List;
        //   996: new             Lme/alpha432/stay/util/counting/Timer;
        //   999: dup            
        //  1000: invokespecial   me/alpha432/stay/util/counting/Timer.<init>:()V
        //  1003: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.breakSuccess:Lme/alpha432/stay/util/counting/Timer;
        //  1006: getstatic       net/minecraft/util/EnumFacing.UP:Lnet/minecraft/util/EnumFacing;
        //  1009: putstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.facing:Lnet/minecraft/util/EnumFacing;
        //  1012: nop            
        //  1013: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //  1016: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$1.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$1;
        //  1019: checkcast       Lkotlin/jvm/functions/Function0;
        //  1022: invokevirtual   me/alpha432/stay/features/modules/misc/InstantMineRewrite.onUpdate:(Lkotlin/jvm/functions/Function0;)V
        //  1025: new             Lme/alpha432/stay/util/graphics/animations/AnimationFlag;
        //  1028: dup            
        //  1029: getstatic       me/alpha432/stay/util/graphics/animations/Easing.OUT_CUBIC:Lme/alpha432/stay/util/graphics/animations/Easing;
        //  1032: ldc_w           9400.0
        //  1035: invokespecial   me/alpha432/stay/util/graphics/animations/AnimationFlag.<init>:(Lme/alpha432/stay/util/graphics/animations/Easing;F)V
        //  1038: astore_0        /* animationFlag */
        //  1039: new             Lme/alpha432/stay/util/counting/Timer;
        //  1042: dup            
        //  1043: invokespecial   me/alpha432/stay/util/counting/Timer.<init>:()V
        //  1046: astore_1        /* timer */
        //  1047: new             Lkotlin/jvm/internal/Ref$DoubleRef;
        //  1050: dup            
        //  1051: invokespecial   kotlin/jvm/internal/Ref$DoubleRef.<init>:()V
        //  1054: astore_2        /* size */
        //  1055: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //  1058: new             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$2;
        //  1061: dup            
        //  1062: aload_1         /* timer */
        //  1063: aload_2         /* size */
        //  1064: aload_0         /* animationFlag */
        //  1065: invokespecial   me/alpha432/stay/features/modules/misc/InstantMineRewrite$2.<init>:(Lme/alpha432/stay/util/counting/Timer;Lkotlin/jvm/internal/Ref$DoubleRef;Lme/alpha432/stay/util/graphics/animations/AnimationFlag;)V
        //  1068: checkcast       Lkotlin/jvm/functions/Function1;
        //  1071: invokevirtual   me/alpha432/stay/features/modules/misc/InstantMineRewrite.onRender3D:(Lkotlin/jvm/functions/Function1;)V
        //  1074: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //  1077: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  1080: astore_3       
        //  1081: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite$3.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$3;
        //  1084: checkcast       Lkotlin/jvm/functions/Function1;
        //  1087: astore          function$iv
        //  1089: iconst_0       
        //  1090: istore          $i$f$safeListener
        //  1092: getstatic       me/alpha432/stay/event/Listener.INSTANCE:Lme/alpha432/stay/event/Listener;
        //  1095: astore          6
        //  1097: ldc_w           Lme/alpha432/stay/event/PacketEvent$Send;.class
        //  1100: astore          clazz$iv$iv
        //  1102: iconst_0       
        //  1103: istore          $i$f$register
        //  1105: aload           this_$iv$iv
        //  1107: invokevirtual   me/alpha432/stay/event/Listener.getListeners:()Ljava/util/List;
        //  1110: aload           clazz$iv$iv
        //  1112: aload           function$iv
        //  1114: iconst_1       
        //  1115: invokestatic    kotlin/jvm/internal/TypeIntrinsics.beforeCheckcastToFunctionOfArity:(Ljava/lang/Object;I)Ljava/lang/Object;
        //  1118: checkcast       Lkotlin/jvm/functions/Function1;
        //  1121: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  1124: aload_3         /* $this$safeListener$iv */
        //  1125: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  1128: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1133: pop            
        //  1134: nop            
        //  1135: nop            
        //  1136: getstatic       me/alpha432/stay/features/modules/misc/InstantMineRewrite.INSTANCE:Lme/alpha432/stay/features/modules/misc/InstantMineRewrite;
        //  1139: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  1142: astore_3       
        //  1143: new             Lme/alpha432/stay/features/modules/misc/InstantMineRewrite$4;
        //  1146: dup            
        //  1147: aload_2         /* size */
        //  1148: aload_0         /* animationFlag */
        //  1149: invokespecial   me/alpha432/stay/features/modules/misc/InstantMineRewrite$4.<init>:(Lkotlin/jvm/internal/Ref$DoubleRef;Lme/alpha432/stay/util/graphics/animations/AnimationFlag;)V
        //  1152: checkcast       Lkotlin/jvm/functions/Function1;
        //  1155: astore          function$iv
        //  1157: iconst_0       
        //  1158: istore          $i$f$safeListener
        //  1160: getstatic       me/alpha432/stay/event/Listener.INSTANCE:Lme/alpha432/stay/event/Listener;
        //  1163: astore          6
        //  1165: ldc_w           Lme/alpha432/stay/event/PlayerDamageBlockEvent;.class
        //  1168: astore          clazz$iv$iv
        //  1170: iconst_0       
        //  1171: istore          $i$f$register
        //  1173: aload           this_$iv$iv
        //  1175: invokevirtual   me/alpha432/stay/event/Listener.getListeners:()Ljava/util/List;
        //  1178: aload           clazz$iv$iv
        //  1180: aload           function$iv
        //  1182: iconst_1       
        //  1183: invokestatic    kotlin/jvm/internal/TypeIntrinsics.beforeCheckcastToFunctionOfArity:(Ljava/lang/Object;I)Ljava/lang/Object;
        //  1186: checkcast       Lkotlin/jvm/functions/Function1;
        //  1189: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  1192: aload_3         /* $this$safeListener$iv */
        //  1193: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  1196: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1201: pop            
        //  1202: nop            
        //  1203: nop            
        //  1204: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
