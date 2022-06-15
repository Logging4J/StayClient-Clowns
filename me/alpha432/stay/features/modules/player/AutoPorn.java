//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.player;

import me.alpha432.stay.features.modules.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import me.alpha432.stay.util.delegate.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import net.minecraft.util.text.*;
import net.minecraft.network.play.server.*;
import kotlin.jvm.functions.*;
import net.minecraft.client.entity.*;
import java.util.*;
import net.minecraft.entity.*;
import java.awt.*;
import java.net.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002#$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b\u001d\u0010\u001e¨\u0006%" }, d2 = { "Lme/alpha432/stay/features/modules/player/AutoPorn;", "Lme/alpha432/stay/features/modules/Module;", "()V", "autoMessage", "", "getAutoMessage", "()Z", "autoMessage$delegate", "Lme/alpha432/stay/util/delegate/Value;", "autolog", "getAutolog", "autolog$delegate", "limits", "", "getLimits", "()I", "limits$delegate", "logBy", "Lme/alpha432/stay/features/modules/player/AutoPorn$LogBy;", "getLogBy", "()Lme/alpha432/stay/features/modules/player/AutoPorn$LogBy;", "logBy$delegate", "message", "", "getMessage", "()Ljava/lang/String;", "message$delegate", "website", "Lme/alpha432/stay/features/modules/player/AutoPorn$WebSites;", "getWebsite", "()Lme/alpha432/stay/features/modules/player/AutoPorn$WebSites;", "website$delegate", "onEnable", "", "onTick", "LogBy", "WebSites", "Stay" })
public final class AutoPorn extends Module
{
    @NotNull
    public static final AutoPorn INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value autoMessage$delegate;
    @NotNull
    private static final Value message$delegate;
    @NotNull
    private static final Value website$delegate;
    @NotNull
    private static final Value autolog$delegate;
    @NotNull
    private static final Value logBy$delegate;
    @NotNull
    private static final Value limits$delegate;
    
    private AutoPorn() {
        super("AutoPorn", "For Zero_One", Module.Category.PLAYER, false, false, false);
    }
    
    private final boolean getAutoMessage() {
        return AutoPorn.autoMessage$delegate.getValue(this, AutoPorn.$$delegatedProperties[0]);
    }
    
    private final String getMessage() {
        return AutoPorn.message$delegate.getValue(this, AutoPorn.$$delegatedProperties[1]);
    }
    
    private final WebSites getWebsite() {
        return AutoPorn.website$delegate.getValue(this, AutoPorn.$$delegatedProperties[2]);
    }
    
    private final boolean getAutolog() {
        return AutoPorn.autolog$delegate.getValue(this, AutoPorn.$$delegatedProperties[3]);
    }
    
    private final LogBy getLogBy() {
        return AutoPorn.logBy$delegate.getValue(this, AutoPorn.$$delegatedProperties[4]);
    }
    
    private final int getLimits() {
        return AutoPorn.limits$delegate.getValue(this, AutoPorn.$$delegatedProperties[5]).intValue();
    }
    
    public void onTick() {
        final Function3<EntityPlayerSP, List<? extends Entity>, Integer, Boolean> checker = this.getLogBy().getChecker();
        final EntityPlayerSP player = Module.mc.player;
        Intrinsics.checkNotNullExpressionValue((Object)player, "mc.player");
        final EntityPlayerSP entityPlayerSP = player;
        final List loadedEntityList = Module.mc.world.loadedEntityList;
        Intrinsics.checkNotNullExpressionValue((Object)loadedEntityList, "mc.world.loadedEntityList");
        if (checker.invoke((Object)entityPlayerSP, (Object)loadedEntityList, (Object)this.getLimits())) {
            Module.mc.player.connection.sendPacket((Packet)new SPacketDisconnect((ITextComponent)new TextComponentString("AutoLogged")));
            this.disable();
        }
    }
    
    public void onEnable() {
        if (this.getAutoMessage()) {
            Module.mc.player.sendChatMessage(this.getMessage());
        }
        Desktop.getDesktop().browse(new URI(this.getWebsite().getSite()));
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
        //    12: ldc             Lme/alpha432/stay/features/modules/player/AutoPorn;.class
        //    14: ldc             "autoMessage"
        //    16: ldc             "getAutoMessage()Z"
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
        //    38: ldc             Lme/alpha432/stay/features/modules/player/AutoPorn;.class
        //    40: ldc             "message"
        //    42: ldc             "getMessage()Ljava/lang/String;"
        //    44: iconst_0       
        //    45: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    48: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    51: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    54: checkcast       Lkotlin/reflect/KProperty;
        //    57: aastore        
        //    58: aload_0        
        //    59: iconst_2       
        //    60: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    63: dup            
        //    64: ldc             Lme/alpha432/stay/features/modules/player/AutoPorn;.class
        //    66: ldc             "website"
        //    68: ldc             "getWebsite()Lme/alpha432/stay/features/modules/player/AutoPorn$WebSites;"
        //    70: iconst_0       
        //    71: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    74: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    77: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    80: checkcast       Lkotlin/reflect/KProperty;
        //    83: aastore        
        //    84: aload_0        
        //    85: iconst_3       
        //    86: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    89: dup            
        //    90: ldc             Lme/alpha432/stay/features/modules/player/AutoPorn;.class
        //    92: ldc             "autolog"
        //    94: ldc_w           "getAutolog()Z"
        //    97: iconst_0       
        //    98: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   101: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   104: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   107: checkcast       Lkotlin/reflect/KProperty;
        //   110: aastore        
        //   111: aload_0        
        //   112: iconst_4       
        //   113: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   116: dup            
        //   117: ldc             Lme/alpha432/stay/features/modules/player/AutoPorn;.class
        //   119: ldc_w           "logBy"
        //   122: ldc_w           "getLogBy()Lme/alpha432/stay/features/modules/player/AutoPorn$LogBy;"
        //   125: iconst_0       
        //   126: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   129: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   132: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   135: checkcast       Lkotlin/reflect/KProperty;
        //   138: aastore        
        //   139: aload_0        
        //   140: iconst_5       
        //   141: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   144: dup            
        //   145: ldc             Lme/alpha432/stay/features/modules/player/AutoPorn;.class
        //   147: ldc_w           "limits"
        //   150: ldc_w           "getLimits()I"
        //   153: iconst_0       
        //   154: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   157: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   160: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   163: checkcast       Lkotlin/reflect/KProperty;
        //   166: aastore        
        //   167: aload_0        
        //   168: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   171: new             Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   174: dup            
        //   175: invokespecial   me/alpha432/stay/features/modules/player/AutoPorn.<init>:()V
        //   178: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   181: getstatic       me/alpha432/stay/features/modules/player/AutoPorn.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   184: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   187: ldc_w           "AutoMessage"
        //   190: iconst_0       
        //   191: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //   194: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.autoMessage$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   197: getstatic       me/alpha432/stay/features/modules/player/AutoPorn.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   200: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   203: ldc_w           "Message"
        //   206: ldc_w           "I'm sexy"
        //   209: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/String;)Lme/alpha432/stay/util/delegate/Value;
        //   212: astore_0       
        //   213: getstatic       me/alpha432/stay/features/modules/player/AutoPorn$message$2.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn$message$2;
        //   216: checkcast       Lkotlin/jvm/functions/Function1;
        //   219: astore_1        /* block$iv */
        //   220: iconst_0       
        //   221: istore_2        /* $i$f$visible */
        //   222: aload_0         /* $this$visible$iv */
        //   223: astore_3       
        //   224: aload_3        
        //   225: astore          it$iv
        //   227: iconst_0       
        //   228: istore          $i$a$-also-ValueKt$visible$1$iv
        //   230: aload           it$iv
        //   232: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   235: dup            
        //   236: aload_1         /* block$iv */
        //   237: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   240: checkcast       Ljava/util/function/Predicate;
        //   243: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   246: aload_3        
        //   247: nop            
        //   248: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.message$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   251: getstatic       me/alpha432/stay/features/modules/player/AutoPorn.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   254: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   257: ldc_w           "WebSite"
        //   260: getstatic       me/alpha432/stay/features/modules/player/AutoPorn$WebSites.PORNHUB:Lme/alpha432/stay/features/modules/player/AutoPorn$WebSites;
        //   263: checkcast       Ljava/lang/Enum;
        //   266: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //   269: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.website$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   272: getstatic       me/alpha432/stay/features/modules/player/AutoPorn.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   275: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   278: ldc_w           "AutoLog"
        //   281: iconst_0       
        //   282: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //   285: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.autolog$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   288: getstatic       me/alpha432/stay/features/modules/player/AutoPorn.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   291: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   294: ldc_w           "LogBy"
        //   297: getstatic       me/alpha432/stay/features/modules/player/AutoPorn$LogBy.CRYSTALS:Lme/alpha432/stay/features/modules/player/AutoPorn$LogBy;
        //   300: checkcast       Ljava/lang/Enum;
        //   303: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //   306: astore_0       
        //   307: getstatic       me/alpha432/stay/features/modules/player/AutoPorn$logBy$2.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn$logBy$2;
        //   310: checkcast       Lkotlin/jvm/functions/Function1;
        //   313: astore_1        /* block$iv */
        //   314: iconst_0       
        //   315: istore_2        /* $i$f$visible */
        //   316: aload_0         /* $this$visible$iv */
        //   317: astore_3       
        //   318: aload_3        
        //   319: astore          it$iv
        //   321: iconst_0       
        //   322: istore          $i$a$-also-ValueKt$visible$1$iv
        //   324: aload           it$iv
        //   326: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   329: dup            
        //   330: aload_1         /* block$iv */
        //   331: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   334: checkcast       Ljava/util/function/Predicate;
        //   337: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   340: aload_3        
        //   341: nop            
        //   342: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.logBy$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   345: getstatic       me/alpha432/stay/features/modules/player/AutoPorn.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn;
        //   348: checkcast       Lme/alpha432/stay/features/modules/Module;
        //   351: ldc_w           "Limit"
        //   354: bipush          10
        //   356: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   359: iconst_0       
        //   360: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   363: bipush          20
        //   365: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   368: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lme/alpha432/stay/util/delegate/Value;
        //   371: astore_0       
        //   372: getstatic       me/alpha432/stay/features/modules/player/AutoPorn$limits$2.INSTANCE:Lme/alpha432/stay/features/modules/player/AutoPorn$limits$2;
        //   375: checkcast       Lkotlin/jvm/functions/Function1;
        //   378: astore_1        /* block$iv */
        //   379: iconst_0       
        //   380: istore_2        /* $i$f$visible */
        //   381: aload_0         /* $this$visible$iv */
        //   382: astore_3       
        //   383: aload_3        
        //   384: astore          it$iv
        //   386: iconst_0       
        //   387: istore          $i$a$-also-ValueKt$visible$1$iv
        //   389: aload           it$iv
        //   391: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //   394: dup            
        //   395: aload_1         /* block$iv */
        //   396: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //   399: checkcast       Ljava/util/function/Predicate;
        //   402: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //   405: aload_3        
        //   406: nop            
        //   407: putstatic       me/alpha432/stay/features/modules/player/AutoPorn.limits$delegate:Lme/alpha432/stay/util/delegate/Value;
        //   410: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lme/alpha432/stay/features/modules/player/AutoPorn$WebSites;", "", "site", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getSite", "()Ljava/lang/String;", "PORNHUB", "AVCAR", "FOURTHREENINENINE", "XYUNSO", "BAOYUTV", "Stay" })
    public enum WebSites
    {
        @NotNull
        private final String site;
        
        PORNHUB("pornhub.com"), 
        AVCAR("avcar.vip"), 
        FOURTHREENINENINE("4399.com"), 
        XYUNSO("xyunso.cc"), 
        BAOYUTV("http://www.by29777.com/");
        
        private WebSites(final String site) {
            this.site = site;
        }
        
        @NotNull
        public final String getSite() {
            return this.site;
        }
        
        private static final /* synthetic */ WebSites[] $values() {
            return new WebSites[] { WebSites.PORNHUB, WebSites.AVCAR, WebSites.FOURTHREENINENINE, WebSites.XYUNSO, WebSites.BAOYUTV };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012$\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tR/\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/features/modules/player/AutoPorn$LogBy;", "", "checker", "Lkotlin/Function3;", "Lnet/minecraft/client/entity/EntityPlayerSP;", "", "Lnet/minecraft/entity/Entity;", "", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function3;)V", "getChecker", "()Lkotlin/jvm/functions/Function3;", "CRYSTALS", "PLAYERS", "HEALTH", "Stay" })
    public enum LogBy
    {
        @NotNull
        private final Function3<EntityPlayerSP, List<? extends Entity>, Integer, Boolean> checker;
        
        CRYSTALS((Function3<? super EntityPlayerSP, ? super List<? extends Entity>, ? super Integer, Boolean>)AutoPorn$LogBy$4.INSTANCE), 
        PLAYERS((Function3<? super EntityPlayerSP, ? super List<? extends Entity>, ? super Integer, Boolean>)AutoPorn$LogBy$5.INSTANCE), 
        HEALTH((Function3<? super EntityPlayerSP, ? super List<? extends Entity>, ? super Integer, Boolean>)AutoPorn$LogBy$6.INSTANCE);
        
        private LogBy(final Function3<? super EntityPlayerSP, ? super List<? extends Entity>, ? super Integer, Boolean> checker) {
            this.checker = (Function3<EntityPlayerSP, List<? extends Entity>, Integer, Boolean>)checker;
        }
        
        @NotNull
        public final Function3<EntityPlayerSP, List<? extends Entity>, Integer, Boolean> getChecker() {
            return this.checker;
        }
        
        private static final /* synthetic */ LogBy[] $values() {
            return new LogBy[] { LogBy.CRYSTALS, LogBy.PLAYERS, LogBy.HEALTH };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
