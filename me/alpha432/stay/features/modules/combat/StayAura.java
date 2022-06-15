//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.features.modules.combat;

import me.alpha432.stay.features.modules.*;
import kotlin.reflect.*;
import me.alpha432.stay.util.delegate.*;
import me.alpha432.stay.util.counting.*;
import java.util.concurrent.atomic.*;
import me.alpha432.stay.util.graphics.animations.*;
import org.jetbrains.annotations.*;
import me.alpha432.stay.util.world.*;
import kotlin.random.*;
import kotlin.ranges.*;
import java.awt.*;
import me.alpha432.stay.features.modules.client.*;
import me.alpha432.stay.util.graphics.color.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import me.alpha432.stay.event.*;
import java.util.function.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.client.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import me.alpha432.stay.util.inventory.*;
import me.alpha432.stay.features.command.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.manager.*;
import kotlin.jvm.functions.*;

@ApplyModule
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u001e\u00f4\u0002\u00f5\u0002\u00f6\u0002\u00f7\u0002\u00f8\u0002\u00f9\u0002\u00fa\u0002\u00fb\u0002\u00fc\u0002\u00fd\u0002\u00fe\u0002\u00ff\u0002\u0080\u0003\u0081\u0003\u0082\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000b\u0010\u00d3\u0002\u001a\u00030\u00d4\u0002H\u0082\bJ\u000b\u0010\u00d5\u0002\u001a\u00030\u00d4\u0002H\u0082\bJ\u000b\u0010\u00d6\u0002\u001a\u00030\u00d7\u0002H\u0082\bJ\u000b\u0010\u00d8\u0002\u001a\u00030\u00d7\u0002H\u0082\bJ\u000b\u0010\u00d9\u0002\u001a\u00030\u00d4\u0002H\u0082\bJ\u0014\u0010a\u001a\u00030\u00d7\u00022\b\u0010\u00da\u0002\u001a\u00030\u0088\u0001H\u0082\bJ\u000b\u0010\u00db\u0002\u001a\u0004\u0018\u00010WH\u0016J\u001a\u0010\u00dc\u0002\u001a\t\u0012\u0005\u0012\u00030\u0084\u00020yH\u0082H\u00f8\u0001\u0000¢\u0006\u0003\u0010\u00dd\u0002J\u0015\u0010\u00de\u0002\u001a\u00030\u00d7\u00022\b\u0010\u00df\u0002\u001a\u00030\u0088\u0001H\u0082\bJ\u001e\u0010\u00e0\u0002\u001a\u00030\u00d7\u00022\b\u0010\u00e1\u0002\u001a\u00030\u0084\u00022\u0007\u0010\u00e2\u0002\u001a\u00020kH\u0082\bJ\u0014\u0010\u00e3\u0002\u001a\u00030\u00d7\u00022\b\u0010\u00e4\u0002\u001a\u00030\u00e5\u0002H\u0007J\u0014\u0010\u00e6\u0002\u001a\u00030\u00d7\u00022\b\u0010\u00e4\u0002\u001a\u00030\u00e7\u0002H\u0007J\u001e\u0010\u00e8\u0002\u001a\u00030\u00d7\u00022\b\u0010\u00e9\u0002\u001a\u00030\u00ea\u00022\b\u0010\u00eb\u0002\u001a\u00030\u00ec\u0002H\u0002J\u000b\u0010\u00ed\u0002\u001a\u00030\u00d7\u0002H\u0082\bJ)\u0010\u00ee\u0002\u001a\u00030\u00d7\u00022\b\u0010\u00ef\u0002\u001a\u00030\u00f0\u00022\b\u0010\u00f1\u0002\u001a\u00030\u00f0\u00022\b\u0010\u00f2\u0002\u001a\u00030\u00f0\u0002H\u0082\bJ\u000b\u0010\u00f3\u0002\u001a\u00030\u00d7\u0002H\u0082\bR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u001b\u0010\u0011\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\fR\u001b\u0010\u0014\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b'\u0010\u001aR\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b/\u0010\u001fR\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b9\u0010\fR\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\b\u001a\u0004\bA\u0010\fR\u001b\u0010C\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\b\u001a\u0004\bD\u0010\u001aR\u001b\u0010F\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\b\u001a\u0004\bG\u0010\u001fR\u0014\u0010I\u001a\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001b\u0010M\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\b\u001a\u0004\bN\u0010\fR\u000e\u0010P\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010Z\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010\b\u001a\u0004\b[\u0010\u001aR\u000e\u0010]\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010^\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010\b\u001a\u0004\b_\u0010\u001fR\u001b\u0010a\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010\b\u001a\u0004\bb\u0010\fR\u001b\u0010d\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010\b\u001a\u0004\be\u0010\fR\u001b\u0010g\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010\b\u001a\u0004\bh\u0010\u001fR#\u0010j\u001a\n l*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010\b\u001a\u0004\bm\u0010nR\u001b\u0010p\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010\b\u001a\u0004\br\u0010sR\u001b\u0010u\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010\b\u001a\u0004\bv\u0010\u001fR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020z0y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u001b\u0010}\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u007f\u0010\b\u001a\u0004\b~\u0010\fR \u0010\u0080\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\fR\u000f\u0010\u0086\u0001\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u008a\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\b\u001a\u0005\b\u008b\u0001\u0010\fR\u000f\u0010\u008d\u0001\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u008e\u0001\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\b\u001a\u0005\b\u008f\u0001\u0010\u001fR\u001e\u0010\u0091\u0001\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\b\u001a\u0005\b\u0092\u0001\u0010\u001fR\u001e\u0010\u0094\u0001\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\b\u001a\u0005\b\u0095\u0001\u0010\u001fR\u001e\u0010\u0097\u0001\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\b\u001a\u0005\b\u0098\u0001\u0010\u001fR\u001e\u0010\u009a\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\b\u001a\u0005\b\u009b\u0001\u0010\fR\u001e\u0010\u009d\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\b\u001a\u0005\b\u009e\u0001\u0010\fR\u001e\u0010 \u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¢\u0001\u0010\b\u001a\u0005\b¡\u0001\u0010\fR\u001e\u0010£\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¥\u0001\u0010\b\u001a\u0005\b¤\u0001\u0010\fR\u001e\u0010¦\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¨\u0001\u0010\b\u001a\u0005\b§\u0001\u0010\fR \u0010©\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00ad\u0001\u0010\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u001e\u0010®\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b°\u0001\u0010\b\u001a\u0005\b¯\u0001\u0010\fR\u001e\u0010±\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b³\u0001\u0010\b\u001a\u0005\b²\u0001\u0010\u001aR \u0010´\u0001\u001a\u00030µ\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¸\u0001\u0010\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010¹\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b»\u0001\u0010\b\u001a\u0005\bº\u0001\u0010\fR\u000f\u0010¼\u0001\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010½\u0001\u001a\u00030¾\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00c1\u0001\u0010\b\u001a\u0006\b¿\u0001\u0010\u00c0\u0001R\u001e\u0010\u00c2\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00c4\u0001\u0010\b\u001a\u0005\b\u00c3\u0001\u0010\fR\u000f\u0010\u00c5\u0001\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u00c6\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00c8\u0001\u0010\b\u001a\u0005\b\u00c7\u0001\u0010\fR\u001e\u0010\u00c9\u0001\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00cb\u0001\u0010\b\u001a\u0005\b\u00ca\u0001\u0010\u001fR \u0010\u00cc\u0001\u001a\u00030\u00cd\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00d0\u0001\u0010\b\u001a\u0006\b\u00ce\u0001\u0010\u00cf\u0001R\u001e\u0010\u00d1\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00d3\u0001\u0010\b\u001a\u0005\b\u00d2\u0001\u0010\u001aR\u001e\u0010\u00d4\u0001\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00d6\u0001\u0010\b\u001a\u0005\b\u00d5\u0001\u0010\u001fR\u000f\u0010\u00d7\u0001\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u00d8\u0001\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u00d9\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00db\u0001\u0010\b\u001a\u0005\b\u00da\u0001\u0010\fR\u001e\u0010\u00dc\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00de\u0001\u0010\b\u001a\u0005\b\u00dd\u0001\u0010\fR\u001e\u0010\u00df\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00e1\u0001\u0010\b\u001a\u0005\b\u00e0\u0001\u0010\fR\u000f\u0010\u00e2\u0001\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u00e3\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00e5\u0001\u0010\b\u001a\u0005\b\u00e4\u0001\u0010\fR\u001e\u0010\u00e6\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00e8\u0001\u0010\b\u001a\u0005\b\u00e7\u0001\u0010\u001aR\u001e\u0010\u00e9\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00eb\u0001\u0010\b\u001a\u0005\b\u00ea\u0001\u0010\u001aR \u0010\u00ec\u0001\u001a\u00030\u00ed\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00f0\u0001\u0010\b\u001a\u0006\b\u00ee\u0001\u0010\u00ef\u0001R\u001e\u0010\u00f1\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00f3\u0001\u0010\b\u001a\u0005\b\u00f2\u0001\u0010\fR\u001e\u0010\u00f4\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00f6\u0001\u0010\b\u001a\u0005\b\u00f5\u0001\u0010\u001aR\u001e\u0010\u00f7\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00f9\u0001\u0010\b\u001a\u0005\b\u00f8\u0001\u0010\u001aR\u001e\u0010\u00fa\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00fc\u0001\u0010\b\u001a\u0005\b\u00fb\u0001\u0010\u001aR \u0010\u00fd\u0001\u001a\u00030\u00fe\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0002\u0010\b\u001a\u0006\b\u00ff\u0001\u0010\u0080\u0002R\u000f\u0010\u0082\u0002\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0085\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\b\u001a\u0005\b\u0086\u0002\u0010\u001aR\u001e\u0010\u0088\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008a\u0002\u0010\b\u001a\u0005\b\u0089\u0002\u0010\u001aR\u001e\u0010\u008b\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010\b\u001a\u0005\b\u008c\u0002\u0010\u001aR\u001e\u0010\u008e\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0002\u0010\b\u001a\u0005\b\u008f\u0002\u0010\u001aR\u001e\u0010\u0091\u0002\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\b\u001a\u0005\b\u0092\u0002\u0010\fR\u000f\u0010\u0094\u0002\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0005\n\u0003\u0010\u0096\u0002R\u0016\u0010\u0097\u0002\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0002\u0010\fR\u0010\u0010\u0099\u0002\u001a\u00030\u009a\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u009b\u0002\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009d\u0002\u0010\b\u001a\u0005\b\u009c\u0002\u0010\fR \u0010\u009e\u0002\u001a\u00030\u009f\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0002\u0010\b\u001a\u0006\b \u0002\u0010¡\u0002R\u0011\u0010£\u0002\u001a\u0004\u0018\u00010zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010¤\u0002\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0005\n\u0003\u0010\u0096\u0002R\u001e\u0010¥\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b§\u0002\u0010\b\u001a\u0005\b¦\u0002\u0010\u001aR\u001e\u0010¨\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bª\u0002\u0010\b\u001a\u0005\b©\u0002\u0010\u001aR\u001e\u0010«\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u00ad\u0002\u0010\b\u001a\u0005\b¬\u0002\u0010\u001aR\u001e\u0010®\u0002\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b°\u0002\u0010\b\u001a\u0005\b¯\u0002\u0010\u001aR\u001e\u0010±\u0002\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b³\u0002\u0010\b\u001a\u0005\b²\u0002\u0010\fR\u001e\u0010´\u0002\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¶\u0002\u0010\b\u001a\u0005\bµ\u0002\u0010\u001fR\u001e\u0010·\u0002\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¹\u0002\u0010\b\u001a\u0005\b¸\u0002\u0010\fR\u001e\u0010º\u0002\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¼\u0002\u0010\b\u001a\u0005\b»\u0002\u0010\u001fR\u001e\u0010½\u0002\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¿\u0002\u0010\b\u001a\u0005\b¾\u0002\u0010\u001fR\u000f\u0010\u00c0\u0002\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u00c1\u0002\u001a\u00020\n*\u00030\u0088\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c2\u0002\u0010\u00c3\u0002R\u001c\u0010\u00c4\u0002\u001a\u00020\n*\u00030\u0084\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00c5\u0002\u0010\u00c6\u0002R\u001d\u0010\u00c7\u0002\u001a\u00030\u00c8\u0002*\u00030\u00c9\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ca\u0002\u0010\u00cb\u0002R\u001c\u0010\u00cc\u0002\u001a\u00020\u001d*\u00030\u00c9\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00cd\u0002\u0010\u00ce\u0002R\u001c\u0010\u00cf\u0002\u001a\u00020\u001d*\u00030\u00c9\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00d0\u0002\u0010\u00ce\u0002R\u001c\u0010\u00d1\u0002\u001a\u00020\u001d*\u00030\u00c9\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00d2\u0002\u0010\u00ce\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0083\u0003" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura;", "Lme/alpha432/stay/features/modules/Module;", "()V", "actionPriority", "Lme/alpha432/stay/features/modules/combat/StayAura$ActionPriority;", "getActionPriority", "()Lme/alpha432/stay/features/modules/combat/StayAura$ActionPriority;", "actionPriority$delegate", "Lme/alpha432/stay/util/delegate/Value;", "animals", "", "getAnimals", "()Z", "animals$delegate", "auraScope", "Lkotlinx/coroutines/CoroutineScope;", "getAuraScope$annotations", "autoSwitch", "getAutoSwitch", "autoSwitch$delegate", "balanceProtection", "getBalanceProtection", "balanceProtection$delegate", "balanceProtectionFactor", "", "getBalanceProtectionFactor", "()I", "balanceProtectionFactor$delegate", "breakBalance", "", "getBreakBalance", "()D", "breakBalance$delegate", "breakCalcMode", "Lme/alpha432/stay/features/modules/combat/StayAura$BreakCalcMode;", "getBreakCalcMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$BreakCalcMode;", "breakCalcMode$delegate", "breakDelay", "getBreakDelay", "breakDelay$delegate", "breakHand", "Lme/alpha432/stay/features/modules/combat/StayAura$BreakHand;", "getBreakHand", "()Lme/alpha432/stay/features/modules/combat/StayAura$BreakHand;", "breakHand$delegate", "breakRange", "getBreakRange", "breakRange$delegate", "breakTimer", "Lme/alpha432/stay/util/counting/Timer;", "breakWhen", "Lme/alpha432/stay/features/modules/combat/StayAura$BreakMode;", "getBreakWhen", "()Lme/alpha432/stay/features/modules/combat/StayAura$BreakMode;", "breakWhen$delegate", "bypass", "getBypass", "bypass$delegate", "bypassMode", "Lme/alpha432/stay/features/modules/combat/StayAura$BypassMode;", "getBypassMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$BypassMode;", "bypassMode$delegate", "chase", "getChase", "chase$delegate", "chasingFactor", "getChasingFactor", "chasingFactor$delegate", "chasingMaxSelf", "getChasingMaxSelf", "chasingMaxSelf$delegate", "color", "Ljava/awt/Color;", "getColor", "()Ljava/awt/Color;", "colorSync", "getColorSync", "colorSync$delegate", "countTimer", "crystalID", "Ljava/util/concurrent/atomic/AtomicInteger;", "crystalLock", "", "crystals", "currentAction", "", "currentPlaceTime", "", "damagePriority", "getDamagePriority", "damagePriority$delegate", "displayCount", "enemyRange", "getEnemyRange", "enemyRange$delegate", "explode", "getExplode", "explode$delegate", "facePlace", "getFacePlace", "facePlace$delegate", "facePlaceHealth", "getFacePlaceHealth", "facePlaceHealth$delegate", "facing", "Lnet/minecraft/util/EnumFacing;", "kotlin.jvm.PlatformType", "getFacing", "()Lnet/minecraft/util/EnumFacing;", "facing$delegate", "findingMode", "Lme/alpha432/stay/features/modules/combat/StayAura$TargetMode;", "getFindingMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$TargetMode;", "findingMode$delegate", "globalBalance", "getGlobalBalance", "globalBalance$delegate", "handledEntities", "", "Lnet/minecraft/entity/EntityLivingBase;", "getHandledEntities", "()Ljava/util/List;", "heavyCalc", "getHeavyCalc", "heavyCalc$delegate", "hudMode", "Lme/alpha432/stay/features/modules/combat/StayAura$HudInfoMode;", "getHudMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$HudInfoMode;", "hudMode$delegate", "isEating", "isSpoofingAngles", "lastCrystal", "Lnet/minecraft/entity/item/EntityEnderCrystal;", "lastPlaceTime", "legitPlace", "getLegitPlace", "legitPlace$delegate", "lock", "maxBreakSelf", "getMaxBreakSelf", "maxBreakSelf$delegate", "maxPlaceSelf", "getMaxPlaceSelf", "maxPlaceSelf$delegate", "minBreakDmg", "getMinBreakDmg", "minBreakDmg$delegate", "minPlaceDmg", "getMinPlaceDmg", "minPlaceDmg$delegate", "mobs", "getMobs", "mobs$delegate", "motionPredict", "getMotionPredict", "motionPredict$delegate", "multiPlace", "getMultiPlace", "multiPlace$delegate", "newPlace", "getNewPlace", "newPlace$delegate", "noSuicide", "getNoSuicide", "noSuicide$delegate", "nullCheckedReturn", "Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;", "getNullCheckedReturn", "()Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;", "nullCheckedReturn$delegate", "outline", "getOutline", "outline$delegate", "outlineA", "getOutlineA", "outlineA$delegate", "overrideMode", "Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;", "getOverrideMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;", "overrideMode$delegate", "packetExplode", "getPacketExplode", "packetExplode$delegate", "packetTimer", "page", "Lme/alpha432/stay/features/modules/combat/StayAura$Pages;", "getPage", "()Lme/alpha432/stay/features/modules/combat/StayAura$Pages;", "page$delegate", "pauseWhileEating", "getPauseWhileEating", "pauseWhileEating$delegate", "pitch", "place", "getPlace", "place$delegate", "placeBalance", "getPlaceBalance", "placeBalance$delegate", "placeCalcMode", "Lme/alpha432/stay/features/modules/combat/StayAura$PlaceCalcMode;", "getPlaceCalcMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$PlaceCalcMode;", "placeCalcMode$delegate", "placeDelay", "getPlaceDelay", "placeDelay$delegate", "placeRange", "getPlaceRange", "placeRange$delegate", "placeTimer", "placement", "players", "getPlayers", "players$delegate", "popTotemTry", "getPopTotemTry", "popTotemTry$delegate", "popTotemTryingProtection", "getPopTotemTryingProtection", "popTotemTryingProtection$delegate", "predictBreakTimer", "predictHit", "getPredictHit", "predictHit$delegate", "predictHitSize", "getPredictHitSize", "predictHitSize$delegate", "predictTicks", "getPredictTicks", "predictTicks$delegate", "protectionMode", "Lme/alpha432/stay/features/modules/combat/StayAura$PopTotemTryingProtection;", "getProtectionMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$PopTotemTryingProtection;", "protectionMode$delegate", "render", "getRender", "render$delegate", "renderA", "getRenderA", "renderA$delegate", "renderB", "getRenderB", "renderB$delegate", "renderG", "getRenderG", "renderG$delegate", "renderMode", "Lme/alpha432/stay/features/modules/combat/StayAura$RenderMode;", "getRenderMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$RenderMode;", "renderMode$delegate", "renderPitch", "renderPos", "Lnet/minecraft/util/math/BlockPos;", "renderR", "getRenderR", "renderR$delegate", "renderTB", "getRenderTB", "renderTB$delegate", "renderTG", "getRenderTG", "renderTG$delegate", "renderTR", "getRenderTR", "renderTR$delegate", "rotate", "getRotate", "rotate$delegate", "rotating", "selfD", "Ljava/lang/Double;", "shouldProtectBalance", "getShouldProtectBalance", "smoothRender", "Lme/alpha432/stay/util/graphics/animations/BlockEasingRender;", "stopFpWhileSwording", "getStopFpWhileSwording", "stopFpWhileSwording$delegate", "switchingMode", "Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;", "getSwitchingMode", "()Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;", "switchingMode$delegate", "target", "targetD", "threads", "getThreads", "threads$delegate", "trialFactor", "getTrialFactor", "trialFactor$delegate", "trialMaxSelf", "getTrialMaxSelf", "trialMaxSelf$delegate", "trialSelfHealth", "getTrialSelfHealth", "trialSelfHealth$delegate", "wallBreak", "getWallBreak", "wallBreak$delegate", "wallBreakRange", "getWallBreakRange", "wallBreakRange$delegate", "wallPlace", "getWallPlace", "wallPlace$delegate", "wallPlaceRange", "getWallPlaceRange", "wallPlaceRange$delegate", "width", "getWidth", "width$delegate", "yaw", "canBreak", "getCanBreak", "(Lnet/minecraft/entity/item/EntityEnderCrystal;)Z", "canPlaceCrystal", "getCanPlaceCrystal", "(Lnet/minecraft/util/math/BlockPos;)Z", "offset", "Lnet/minecraft/util/math/Vec3d;", "Lnet/minecraft/entity/Entity;", "getOffset", "(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/Vec3d;", "offsetX", "getOffsetX", "(Lnet/minecraft/entity/Entity;)D", "offsetY", "getOffsetY", "offsetZ", "getOffsetZ", "calculate", "Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;", "calculate0", "doBreak", "", "doPlace", "doubleCalculate", "entity", "getDisplayInfo", "getPlaceBlocks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookAtCrystal", "ent", "lookAtPos", "block", "face", "onPacketReceive", "event", "Lme/alpha432/stay/event/PacketEvent$Receive;", "onPacketSend", "Lme/alpha432/stay/event/PacketEvent$Send;", "packetBreak", "player", "Lnet/minecraft/client/entity/EntityPlayerSP;", "packet", "Lnet/minecraft/network/play/server/SPacketSpawnObject;", "resetRotation", "setYawAndPitch", "yaw1", "", "pitch1", "renderPitch1", "switch", "ActionPriority", "BreakCalcMode", "BreakHand", "BreakMode", "BypassMode", "CrystalTarget", "HudInfoMode", "NullChecked", "OverrideMode", "Pages", "PlaceCalcMode", "PopTotemTryingProtection", "RenderMode", "SwitchMode", "TargetMode", "Stay" })
public final class StayAura extends Module
{
    @NotNull
    public static final StayAura INSTANCE;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private static final Value page$delegate;
    @NotNull
    private static final Value explode$delegate;
    @NotNull
    private static final Value place$delegate;
    @NotNull
    private static final Value multiPlace$delegate;
    @NotNull
    private static final Value packetExplode$delegate;
    @NotNull
    private static final Value autoSwitch$delegate;
    @NotNull
    private static final Value switchingMode$delegate;
    @NotNull
    private static final Value findingMode$delegate;
    @NotNull
    private static final Value enemyRange$delegate;
    @NotNull
    private static final Value placeRange$delegate;
    @NotNull
    private static final Value breakRange$delegate;
    @NotNull
    private static final Value placeDelay$delegate;
    @NotNull
    private static final Value breakDelay$delegate;
    @NotNull
    private static final Value players$delegate;
    @NotNull
    private static final Value animals$delegate;
    @NotNull
    private static final Value mobs$delegate;
    @NotNull
    private static final Value rotate$delegate;
    @NotNull
    private static final Value pauseWhileEating$delegate;
    @NotNull
    private static final Value newPlace$delegate;
    @NotNull
    private static final Value legitPlace$delegate;
    @NotNull
    private static final Value wallPlace$delegate;
    @NotNull
    private static final Value wallPlaceRange$delegate;
    @NotNull
    private static final Value placeCalcMode$delegate;
    @NotNull
    private static final Value minPlaceDmg$delegate;
    @NotNull
    private static final Value maxPlaceSelf$delegate;
    @NotNull
    private static final Value placeBalance$delegate;
    @NotNull
    private static final Value motionPredict$delegate;
    @NotNull
    private static final Value predictTicks$delegate;
    @NotNull
    private static final Value facePlace$delegate;
    @NotNull
    private static final Value facePlaceHealth$delegate;
    @NotNull
    private static final Value stopFpWhileSwording$delegate;
    @NotNull
    private static final Value breakWhen$delegate;
    @NotNull
    private static final Value predictHit$delegate;
    @NotNull
    private static final Value predictHitSize$delegate;
    @NotNull
    private static final Value breakHand$delegate;
    @NotNull
    private static final Value wallBreak$delegate;
    @NotNull
    private static final Value wallBreakRange$delegate;
    @NotNull
    private static final Value breakCalcMode$delegate;
    @NotNull
    private static final Value minBreakDmg$delegate;
    @NotNull
    private static final Value maxBreakSelf$delegate;
    @NotNull
    private static final Value breakBalance$delegate;
    @NotNull
    private static final Value bypass$delegate;
    @NotNull
    private static final Value bypassMode$delegate;
    @NotNull
    private static final Value actionPriority$delegate;
    @NotNull
    private static final Value popTotemTry$delegate;
    @NotNull
    private static final Value popTotemTryingProtection$delegate;
    @NotNull
    private static final Value protectionMode$delegate;
    @NotNull
    private static final Value trialFactor$delegate;
    @NotNull
    private static final Value trialMaxSelf$delegate;
    @NotNull
    private static final Value trialSelfHealth$delegate;
    @NotNull
    private static final Value chase$delegate;
    @NotNull
    private static final Value chasingFactor$delegate;
    @NotNull
    private static final Value chasingMaxSelf$delegate;
    @NotNull
    private static final Value noSuicide$delegate;
    @NotNull
    private static final Value damagePriority$delegate;
    @NotNull
    private static final Value balanceProtection$delegate;
    @NotNull
    private static final Value globalBalance$delegate;
    @NotNull
    private static final Value balanceProtectionFactor$delegate;
    @NotNull
    private static final Value facing$delegate;
    @NotNull
    private static final Value threads$delegate;
    @NotNull
    private static final Value heavyCalc$delegate;
    @NotNull
    private static final Value overrideMode$delegate;
    @NotNull
    private static final Value nullCheckedReturn$delegate;
    @NotNull
    private static final Value render$delegate;
    @NotNull
    private static final Value renderMode$delegate;
    @NotNull
    private static final Value colorSync$delegate;
    @NotNull
    private static final Value renderR$delegate;
    @NotNull
    private static final Value renderG$delegate;
    @NotNull
    private static final Value renderB$delegate;
    @NotNull
    private static final Value renderA$delegate;
    @NotNull
    private static final Value outline$delegate;
    @NotNull
    private static final Value width$delegate;
    @NotNull
    private static final Value outlineA$delegate;
    @NotNull
    private static final Value renderTR$delegate;
    @NotNull
    private static final Value renderTG$delegate;
    @NotNull
    private static final Value renderTB$delegate;
    @NotNull
    private static final Value hudMode$delegate;
    @NotNull
    private static final Timer placeTimer;
    @NotNull
    private static final Timer breakTimer;
    @NotNull
    private static final Timer packetTimer;
    @NotNull
    private static final Timer predictBreakTimer;
    @NotNull
    private static final transient AtomicInteger crystalID;
    private static int placement;
    @NotNull
    private static final BlockEasingRender smoothRender;
    @NotNull
    private static CoroutineScope auraScope;
    @Nullable
    private static BlockPos renderPos;
    @Nullable
    private static EntityLivingBase target;
    @Nullable
    private static Double selfD;
    @Nullable
    private static Double targetD;
    @NotNull
    private static final Object lock;
    private static boolean rotating;
    private static double yaw;
    private static double pitch;
    private static double renderPitch;
    private static boolean isSpoofingAngles;
    private static long lastPlaceTime;
    private static long currentPlaceTime;
    @NotNull
    private static String currentAction;
    private static int crystals;
    private static int displayCount;
    @NotNull
    private static Timer countTimer;
    @Nullable
    private static EntityEnderCrystal lastCrystal;
    @NotNull
    private static final Object crystalLock;
    
    private StayAura() {
        super("StayAura", "WTF lol", Category.COMBAT, true, false, false);
    }
    
    private final Pages getPage() {
        return StayAura.page$delegate.getValue(this, StayAura.$$delegatedProperties[0]);
    }
    
    private final boolean getExplode() {
        return StayAura.explode$delegate.getValue(this, StayAura.$$delegatedProperties[1]);
    }
    
    private final boolean getPlace() {
        return StayAura.place$delegate.getValue(this, StayAura.$$delegatedProperties[2]);
    }
    
    private final boolean getMultiPlace() {
        return StayAura.multiPlace$delegate.getValue(this, StayAura.$$delegatedProperties[3]);
    }
    
    private final boolean getPacketExplode() {
        return StayAura.packetExplode$delegate.getValue(this, StayAura.$$delegatedProperties[4]);
    }
    
    private final boolean getAutoSwitch() {
        return StayAura.autoSwitch$delegate.getValue(this, StayAura.$$delegatedProperties[5]);
    }
    
    private final SwitchMode getSwitchingMode() {
        return StayAura.switchingMode$delegate.getValue(this, StayAura.$$delegatedProperties[6]);
    }
    
    private final TargetMode getFindingMode() {
        return StayAura.findingMode$delegate.getValue(this, StayAura.$$delegatedProperties[7]);
    }
    
    private final double getEnemyRange() {
        return StayAura.enemyRange$delegate.getValue(this, StayAura.$$delegatedProperties[8]).doubleValue();
    }
    
    private final double getPlaceRange() {
        return StayAura.placeRange$delegate.getValue(this, StayAura.$$delegatedProperties[9]).doubleValue();
    }
    
    private final double getBreakRange() {
        return StayAura.breakRange$delegate.getValue(this, StayAura.$$delegatedProperties[10]).doubleValue();
    }
    
    private final int getPlaceDelay() {
        return StayAura.placeDelay$delegate.getValue(this, StayAura.$$delegatedProperties[11]).intValue();
    }
    
    private final int getBreakDelay() {
        return StayAura.breakDelay$delegate.getValue(this, StayAura.$$delegatedProperties[12]).intValue();
    }
    
    private final boolean getPlayers() {
        return StayAura.players$delegate.getValue(this, StayAura.$$delegatedProperties[13]);
    }
    
    private final boolean getAnimals() {
        return StayAura.animals$delegate.getValue(this, StayAura.$$delegatedProperties[14]);
    }
    
    private final boolean getMobs() {
        return StayAura.mobs$delegate.getValue(this, StayAura.$$delegatedProperties[15]);
    }
    
    private final boolean getRotate() {
        return StayAura.rotate$delegate.getValue(this, StayAura.$$delegatedProperties[16]);
    }
    
    private final boolean getPauseWhileEating() {
        return StayAura.pauseWhileEating$delegate.getValue(this, StayAura.$$delegatedProperties[17]);
    }
    
    private final boolean getNewPlace() {
        return StayAura.newPlace$delegate.getValue(this, StayAura.$$delegatedProperties[18]);
    }
    
    private final boolean getLegitPlace() {
        return StayAura.legitPlace$delegate.getValue(this, StayAura.$$delegatedProperties[19]);
    }
    
    private final boolean getWallPlace() {
        return StayAura.wallPlace$delegate.getValue(this, StayAura.$$delegatedProperties[20]);
    }
    
    private final double getWallPlaceRange() {
        return StayAura.wallPlaceRange$delegate.getValue(this, StayAura.$$delegatedProperties[21]).doubleValue();
    }
    
    private final PlaceCalcMode getPlaceCalcMode() {
        return StayAura.placeCalcMode$delegate.getValue(this, StayAura.$$delegatedProperties[22]);
    }
    
    private final double getMinPlaceDmg() {
        return StayAura.minPlaceDmg$delegate.getValue(this, StayAura.$$delegatedProperties[23]).doubleValue();
    }
    
    private final double getMaxPlaceSelf() {
        return StayAura.maxPlaceSelf$delegate.getValue(this, StayAura.$$delegatedProperties[24]).doubleValue();
    }
    
    private final double getPlaceBalance() {
        return StayAura.placeBalance$delegate.getValue(this, StayAura.$$delegatedProperties[25]).doubleValue();
    }
    
    private final boolean getMotionPredict() {
        return StayAura.motionPredict$delegate.getValue(this, StayAura.$$delegatedProperties[26]);
    }
    
    private final int getPredictTicks() {
        return StayAura.predictTicks$delegate.getValue(this, StayAura.$$delegatedProperties[27]).intValue();
    }
    
    private final boolean getFacePlace() {
        return StayAura.facePlace$delegate.getValue(this, StayAura.$$delegatedProperties[28]);
    }
    
    private final double getFacePlaceHealth() {
        return StayAura.facePlaceHealth$delegate.getValue(this, StayAura.$$delegatedProperties[29]).doubleValue();
    }
    
    private final boolean getStopFpWhileSwording() {
        return StayAura.stopFpWhileSwording$delegate.getValue(this, StayAura.$$delegatedProperties[30]);
    }
    
    private final BreakMode getBreakWhen() {
        return StayAura.breakWhen$delegate.getValue(this, StayAura.$$delegatedProperties[31]);
    }
    
    private final boolean getPredictHit() {
        return StayAura.predictHit$delegate.getValue(this, StayAura.$$delegatedProperties[32]);
    }
    
    private final int getPredictHitSize() {
        return StayAura.predictHitSize$delegate.getValue(this, StayAura.$$delegatedProperties[33]).intValue();
    }
    
    private final BreakHand getBreakHand() {
        return StayAura.breakHand$delegate.getValue(this, StayAura.$$delegatedProperties[34]);
    }
    
    private final boolean getWallBreak() {
        return StayAura.wallBreak$delegate.getValue(this, StayAura.$$delegatedProperties[35]);
    }
    
    private final double getWallBreakRange() {
        return StayAura.wallBreakRange$delegate.getValue(this, StayAura.$$delegatedProperties[36]).doubleValue();
    }
    
    private final BreakCalcMode getBreakCalcMode() {
        return StayAura.breakCalcMode$delegate.getValue(this, StayAura.$$delegatedProperties[37]);
    }
    
    private final double getMinBreakDmg() {
        return StayAura.minBreakDmg$delegate.getValue(this, StayAura.$$delegatedProperties[38]).doubleValue();
    }
    
    private final double getMaxBreakSelf() {
        return StayAura.maxBreakSelf$delegate.getValue(this, StayAura.$$delegatedProperties[39]).doubleValue();
    }
    
    private final double getBreakBalance() {
        return StayAura.breakBalance$delegate.getValue(this, StayAura.$$delegatedProperties[40]).doubleValue();
    }
    
    private final boolean getBypass() {
        return StayAura.bypass$delegate.getValue(this, StayAura.$$delegatedProperties[41]);
    }
    
    private final BypassMode getBypassMode() {
        return StayAura.bypassMode$delegate.getValue(this, StayAura.$$delegatedProperties[42]);
    }
    
    private final ActionPriority getActionPriority() {
        return StayAura.actionPriority$delegate.getValue(this, StayAura.$$delegatedProperties[43]);
    }
    
    private final boolean getPopTotemTry() {
        return StayAura.popTotemTry$delegate.getValue(this, StayAura.$$delegatedProperties[44]);
    }
    
    private final boolean getPopTotemTryingProtection() {
        return StayAura.popTotemTryingProtection$delegate.getValue(this, StayAura.$$delegatedProperties[45]);
    }
    
    private final PopTotemTryingProtection getProtectionMode() {
        return StayAura.protectionMode$delegate.getValue(this, StayAura.$$delegatedProperties[46]);
    }
    
    private final int getTrialFactor() {
        return StayAura.trialFactor$delegate.getValue(this, StayAura.$$delegatedProperties[47]).intValue();
    }
    
    private final int getTrialMaxSelf() {
        return StayAura.trialMaxSelf$delegate.getValue(this, StayAura.$$delegatedProperties[48]).intValue();
    }
    
    private final int getTrialSelfHealth() {
        return StayAura.trialSelfHealth$delegate.getValue(this, StayAura.$$delegatedProperties[49]).intValue();
    }
    
    private final boolean getChase() {
        return StayAura.chase$delegate.getValue(this, StayAura.$$delegatedProperties[50]);
    }
    
    private final int getChasingFactor() {
        return StayAura.chasingFactor$delegate.getValue(this, StayAura.$$delegatedProperties[51]).intValue();
    }
    
    private final double getChasingMaxSelf() {
        return StayAura.chasingMaxSelf$delegate.getValue(this, StayAura.$$delegatedProperties[52]).doubleValue();
    }
    
    private final boolean getNoSuicide() {
        return StayAura.noSuicide$delegate.getValue(this, StayAura.$$delegatedProperties[53]);
    }
    
    private final int getDamagePriority() {
        return StayAura.damagePriority$delegate.getValue(this, StayAura.$$delegatedProperties[54]).intValue();
    }
    
    private final boolean getBalanceProtection() {
        return StayAura.balanceProtection$delegate.getValue(this, StayAura.$$delegatedProperties[55]);
    }
    
    private final double getGlobalBalance() {
        return StayAura.globalBalance$delegate.getValue(this, StayAura.$$delegatedProperties[56]).doubleValue();
    }
    
    private final int getBalanceProtectionFactor() {
        return StayAura.balanceProtectionFactor$delegate.getValue(this, StayAura.$$delegatedProperties[57]).intValue();
    }
    
    private final EnumFacing getFacing() {
        return StayAura.facing$delegate.getValue(this, StayAura.$$delegatedProperties[58]);
    }
    
    private final int getThreads() {
        return StayAura.threads$delegate.getValue(this, StayAura.$$delegatedProperties[59]).intValue();
    }
    
    private final boolean getHeavyCalc() {
        return StayAura.heavyCalc$delegate.getValue(this, StayAura.$$delegatedProperties[60]);
    }
    
    private final OverrideMode getOverrideMode() {
        return StayAura.overrideMode$delegate.getValue(this, StayAura.$$delegatedProperties[61]);
    }
    
    private final NullChecked getNullCheckedReturn() {
        return StayAura.nullCheckedReturn$delegate.getValue(this, StayAura.$$delegatedProperties[62]);
    }
    
    private final boolean getRender() {
        return StayAura.render$delegate.getValue(this, StayAura.$$delegatedProperties[63]);
    }
    
    private final RenderMode getRenderMode() {
        return StayAura.renderMode$delegate.getValue(this, StayAura.$$delegatedProperties[64]);
    }
    
    private final boolean getColorSync() {
        return StayAura.colorSync$delegate.getValue(this, StayAura.$$delegatedProperties[65]);
    }
    
    private final int getRenderR() {
        return StayAura.renderR$delegate.getValue(this, StayAura.$$delegatedProperties[66]).intValue();
    }
    
    private final int getRenderG() {
        return StayAura.renderG$delegate.getValue(this, StayAura.$$delegatedProperties[67]).intValue();
    }
    
    private final int getRenderB() {
        return StayAura.renderB$delegate.getValue(this, StayAura.$$delegatedProperties[68]).intValue();
    }
    
    private final int getRenderA() {
        return StayAura.renderA$delegate.getValue(this, StayAura.$$delegatedProperties[69]).intValue();
    }
    
    private final boolean getOutline() {
        return StayAura.outline$delegate.getValue(this, StayAura.$$delegatedProperties[70]);
    }
    
    private final double getWidth() {
        return StayAura.width$delegate.getValue(this, StayAura.$$delegatedProperties[71]).doubleValue();
    }
    
    private final int getOutlineA() {
        return StayAura.outlineA$delegate.getValue(this, StayAura.$$delegatedProperties[72]).intValue();
    }
    
    private final int getRenderTR() {
        return StayAura.renderTR$delegate.getValue(this, StayAura.$$delegatedProperties[73]).intValue();
    }
    
    private final int getRenderTG() {
        return StayAura.renderTG$delegate.getValue(this, StayAura.$$delegatedProperties[74]).intValue();
    }
    
    private final int getRenderTB() {
        return StayAura.renderTB$delegate.getValue(this, StayAura.$$delegatedProperties[75]).intValue();
    }
    
    private final HudInfoMode getHudMode() {
        return StayAura.hudMode$delegate.getValue(this, StayAura.$$delegatedProperties[76]);
    }
    
    private final boolean isEating() {
        return CrystalUtil.isEating();
    }
    
    private final boolean getShouldProtectBalance() {
        final int balanceProtectionFactor = this.getBalanceProtectionFactor();
        final int random = RangesKt.random(new IntRange(0, 100), (Random)Random.Default);
        return 0 <= random && random < balanceProtectionFactor && this.getBalanceProtection();
    }
    
    private final List<EntityLivingBase> getHandledEntities() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //     6: ifnonnull       13
        //     9: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //    12: areturn        
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: checkcast       Ljava/util/List;
        //    23: astore_1        /* entities */
        //    24: aload_0         /* this */
        //    25: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getPlayers:()Z
        //    28: ifeq            93
        //    31: aload_1         /* entities */
        //    32: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    35: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    38: getfield        net/minecraft/client/multiplayer/WorldClient.playerEntities:Ljava/util/List;
        //    41: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //    46: invokedynamic   BootstrapMethod #0, test:()Ljava/util/function/Predicate;
        //    51: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //    56: aload_0         /* this */
        //    57: invokedynamic   BootstrapMethod #1, test:(Lme/alpha432/stay/features/modules/combat/StayAura;)Ljava/util/function/Predicate;
        //    62: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //    67: invokestatic    java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        //    70: invokeinterface java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        //    75: astore_2       
        //    76: aload_2        
        //    77: ldc_w           "mc.world.playerEntities.\u2026lect(Collectors.toList())"
        //    80: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    83: aload_2        
        //    84: checkcast       Ljava/util/Collection;
        //    87: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    92: pop            
        //    93: aload_1         /* entities */
        //    94: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    97: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //   100: getfield        net/minecraft/client/multiplayer/WorldClient.loadedEntityList:Ljava/util/List;
        //   103: astore_2       
        //   104: aload_2        
        //   105: ldc_w           "mc.world.loadedEntityList"
        //   108: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   111: aload_2        
        //   112: checkcast       Ljava/lang/Iterable;
        //   115: astore_2       
        //   116: astore          11
        //   118: iconst_0       
        //   119: istore_3        /* $i$f$filter */
        //   120: aload_2         /* $this$filter$iv */
        //   121: astore          4
        //   123: new             Ljava/util/ArrayList;
        //   126: dup            
        //   127: invokespecial   java/util/ArrayList.<init>:()V
        //   130: checkcast       Ljava/util/Collection;
        //   133: astore          destination$iv$iv
        //   135: iconst_0       
        //   136: istore          $i$f$filterTo
        //   138: aload           $this$filterTo$iv$iv
        //   140: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   145: astore          7
        //   147: aload           7
        //   149: invokeinterface java/util/Iterator.hasNext:()Z
        //   154: ifeq            220
        //   157: aload           7
        //   159: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   164: astore          element$iv$iv
        //   166: aload           element$iv$iv
        //   168: checkcast       Lnet/minecraft/entity/Entity;
        //   171: astore          entity
        //   173: iconst_0       
        //   174: istore          $i$a$-filter-StayAura$handledEntities$3
        //   176: aload           entity
        //   178: invokestatic    me/alpha432/stay/util/world/EntityUtils.isLiving:(Lnet/minecraft/entity/Entity;)Z
        //   181: ifeq            199
        //   184: aload           entity
        //   186: invokestatic    me/alpha432/stay/util/world/EntityUtils.isPassive:(Lnet/minecraft/entity/Entity;)Z
        //   189: ifeq            199
        //   192: aload_0         /* this */
        //   193: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getAnimals:()Z
        //   196: goto            203
        //   199: aload_0         /* this */
        //   200: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getMobs:()Z
        //   203: nop            
        //   204: ifeq            147
        //   207: aload           destination$iv$iv
        //   209: aload           element$iv$iv
        //   211: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   216: pop            
        //   217: goto            147
        //   220: aload           destination$iv$iv
        //   222: checkcast       Ljava/util/List;
        //   225: nop            
        //   226: aload           11
        //   228: swap           
        //   229: checkcast       Ljava/lang/Iterable;
        //   232: astore_2       
        //   233: astore          11
        //   235: iconst_0       
        //   236: istore_3        /* $i$f$filter */
        //   237: aload_2         /* $this$filter$iv */
        //   238: astore          4
        //   240: new             Ljava/util/ArrayList;
        //   243: dup            
        //   244: invokespecial   java/util/ArrayList.<init>:()V
        //   247: checkcast       Ljava/util/Collection;
        //   250: astore          destination$iv$iv
        //   252: iconst_0       
        //   253: istore          $i$f$filterTo
        //   255: aload           $this$filterTo$iv$iv
        //   257: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   262: astore          7
        //   264: aload           7
        //   266: invokeinterface java/util/Iterator.hasNext:()Z
        //   271: ifeq            322
        //   274: aload           7
        //   276: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   281: astore          element$iv$iv
        //   283: aload           element$iv$iv
        //   285: checkcast       Lnet/minecraft/entity/Entity;
        //   288: astore          entity
        //   290: iconst_0       
        //   291: istore          $i$a$-filter-StayAura$handledEntities$4
        //   293: aload           entity
        //   295: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   298: ifne            305
        //   301: iconst_1       
        //   302: goto            306
        //   305: iconst_0       
        //   306: ifeq            264
        //   309: aload           destination$iv$iv
        //   311: aload           element$iv$iv
        //   313: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   318: pop            
        //   319: goto            264
        //   322: aload           destination$iv$iv
        //   324: checkcast       Ljava/util/List;
        //   327: nop            
        //   328: aload           11
        //   330: swap           
        //   331: checkcast       Ljava/lang/Iterable;
        //   334: astore_2       
        //   335: astore          11
        //   337: iconst_0       
        //   338: istore_3        /* $i$f$filter */
        //   339: aload_2         /* $this$filter$iv */
        //   340: astore          4
        //   342: new             Ljava/util/ArrayList;
        //   345: dup            
        //   346: invokespecial   java/util/ArrayList.<init>:()V
        //   349: checkcast       Ljava/util/Collection;
        //   352: astore          destination$iv$iv
        //   354: iconst_0       
        //   355: istore          $i$f$filterTo
        //   357: aload           $this$filterTo$iv$iv
        //   359: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   364: astore          7
        //   366: aload           7
        //   368: invokeinterface java/util/Iterator.hasNext:()Z
        //   373: ifeq            439
        //   376: aload           7
        //   378: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   383: astore          element$iv$iv
        //   385: aload           element$iv$iv
        //   387: checkcast       Lnet/minecraft/entity/Entity;
        //   390: astore          entity
        //   392: iconst_0       
        //   393: istore          $i$a$-filter-StayAura$handledEntities$5
        //   395: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   398: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   401: aload           entity
        //   403: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getDistance:(Lnet/minecraft/entity/Entity;)F
        //   406: f2d            
        //   407: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //   410: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getPlaceRange:()D
        //   413: dcmpg          
        //   414: ifge            421
        //   417: iconst_1       
        //   418: goto            422
        //   421: iconst_0       
        //   422: nop            
        //   423: ifeq            366
        //   426: aload           destination$iv$iv
        //   428: aload           element$iv$iv
        //   430: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   435: pop            
        //   436: goto            366
        //   439: aload           destination$iv$iv
        //   441: checkcast       Ljava/util/List;
        //   444: nop            
        //   445: aload           11
        //   447: swap           
        //   448: checkcast       Ljava/util/Collection;
        //   451: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   456: pop            
        //   457: new             Ljava/util/ArrayList;
        //   460: dup            
        //   461: aload_1         /* entities */
        //   462: checkcast       Ljava/util/Collection;
        //   465: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   468: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   471: astore_2       
        //   472: aload_2        
        //   473: invokeinterface java/util/Iterator.hasNext:()Z
        //   478: ifeq            539
        //   481: aload_2        
        //   482: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   487: checkcast       Lnet/minecraft/entity/Entity;
        //   490: astore_3        /* ite2 */
        //   491: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   494: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   497: aload_3         /* ite2 */
        //   498: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getDistance:(Lnet/minecraft/entity/Entity;)F
        //   501: f2d            
        //   502: aload_0         /* this */
        //   503: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getPlaceRange:()D
        //   506: dcmpl          
        //   507: ifle            518
        //   510: aload_1         /* entities */
        //   511: aload_3         /* ite2 */
        //   512: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   517: pop            
        //   518: aload_3         /* ite2 */
        //   519: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   522: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   525: if_acmpne       472
        //   528: aload_1         /* entities */
        //   529: aload_3         /* ite2 */
        //   530: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   535: pop            
        //   536: goto            472
        //   539: aload_1         /* entities */
        //   540: checkcast       Ljava/lang/Iterable;
        //   543: astore_2        /* $this$map$iv */
        //   544: iconst_0       
        //   545: istore_3        /* $i$f$map */
        //   546: aload_2         /* $this$map$iv */
        //   547: astore          4
        //   549: new             Ljava/util/ArrayList;
        //   552: dup            
        //   553: aload_2         /* $this$map$iv */
        //   554: bipush          10
        //   556: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   559: invokespecial   java/util/ArrayList.<init>:(I)V
        //   562: checkcast       Ljava/util/Collection;
        //   565: astore          destination$iv$iv
        //   567: iconst_0       
        //   568: istore          $i$f$mapTo
        //   570: aload           $this$mapTo$iv$iv
        //   572: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   577: astore          7
        //   579: aload           7
        //   581: invokeinterface java/util/Iterator.hasNext:()Z
        //   586: ifeq            629
        //   589: aload           7
        //   591: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   596: astore          item$iv$iv
        //   598: aload           destination$iv$iv
        //   600: aload           item$iv$iv
        //   602: checkcast       Lnet/minecraft/entity/Entity;
        //   605: astore          9
        //   607: astore          11
        //   609: iconst_0       
        //   610: istore          $i$a$-map-StayAura$handledEntities$6
        //   612: aload           it
        //   614: checkcast       Lnet/minecraft/entity/EntityLivingBase;
        //   617: aload           11
        //   619: swap           
        //   620: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   625: pop            
        //   626: goto            579
        //   629: aload           destination$iv$iv
        //   631: checkcast       Ljava/util/List;
        //   634: nop            
        //   635: astore_2        /* $this$map$iv */
        //   636: aload_2        
        //   637: astore_3        /* it */
        //   638: iconst_0       
        //   639: istore          $i$a$-also-StayAura$handledEntities$7
        //   641: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //   644: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getFindingMode:()Lme/alpha432/stay/features/modules/combat/StayAura$TargetMode;
        //   647: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$TargetMode.getHandler:()Lkotlin/jvm/functions/Function1;
        //   650: aload_3         /* it */
        //   651: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   656: pop            
        //   657: aload_2        
        //   658: checkcast       Ljava/lang/Iterable;
        //   661: invokestatic    kotlin/collections/CollectionsKt.toList:(Ljava/lang/Iterable;)Ljava/util/List;
        //   664: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lnet/minecraft/entity/EntityLivingBase;>;
        //    StackMapTable: 00 13 0D FC 00 4F 07 03 59 FF 00 35 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 59 00 00 FF 00 33 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 07 03 C1 07 03 B4 01 07 03 59 00 00 43 01 FF 00 10 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 59 00 00 2B FF 00 28 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 07 03 C1 07 03 B4 01 07 03 59 00 00 40 01 FF 00 0F 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 59 00 00 2B FF 00 36 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 07 03 C1 07 03 B4 01 07 03 59 00 00 40 01 FF 00 10 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 59 00 00 FF 00 20 00 0C 07 00 02 07 03 59 07 03 AB 00 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 59 00 00 FF 00 2D 00 0C 07 00 02 07 03 59 07 03 AB 07 03 B4 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 59 00 00 FF 00 14 00 0C 07 00 02 07 03 59 07 03 AB 00 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 59 00 00 FF 00 27 00 0C 07 00 02 07 03 59 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 00 00 00 07 03 C1 00 00 31
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Color getColor() {
        Color rainbow;
        if (this.getColorSync()) {
            final Number value = ClickGui.getInstance().rainbowHue.getValue();
            Intrinsics.checkNotNullExpressionValue((Object)value, "getInstance().rainbowHue.value");
            rainbow = ColorUtil.rainbow(value.intValue());
        }
        else {
            rainbow = new Color(this.getRenderR(), this.getRenderG(), this.getRenderB(), this.getRenderA());
        }
        final Color color = rainbow;
        return new Color(color.getRGB());
    }
    
    private final boolean getCanBreak(final EntityEnderCrystal $this$canBreak) {
        if (this.getBreakWhen() == BreakMode.ALWAYS) {
            return true;
        }
        synchronized (StayAura.lock) {
            final int n = 0;
            final double posX = $this$canBreak.posX;
            final double posY = $this$canBreak.posY;
            final double posZ = $this$canBreak.posZ;
            final EntityLivingBase target = StayAura.target;
            if (target == null) {
                return false;
            }
            final Entity entity = (Entity)target;
            final EntityLivingBase target2 = StayAura.target;
            final Vec3d vec = (target2 == null) ? null : target2.getPositionVector();
            if (vec == null) {
                return false;
            }
            final float targetDamage = CrystalUtil.calculateDamage(posX, posY, posZ, entity, vec);
            final double posX2 = $this$canBreak.posX;
            final double posY2 = $this$canBreak.posY;
            final double posZ2 = $this$canBreak.posZ;
            final EntityPlayerSP player = Module.mc.player;
            if (player == null) {
                return false;
            }
            final Entity entity2 = (Entity)player;
            final Vec3d getPositionVector = Module.mc.player.getPositionVector();
            if (getPositionVector == null) {
                return false;
            }
            final float selfDamage = CrystalUtil.calculateDamage(posX2, posY2, posZ2, entity2, getPositionVector);
            final EntityLivingBase target3 = StayAura.target;
            Intrinsics.checkNotNull((Object)target3);
            final float getHealth = target3.getHealth();
            final EntityLivingBase target4 = StayAura.target;
            Intrinsics.checkNotNull((Object)target4);
            final float healthTarget = getHealth + target4.getAbsorptionAmount();
            final float healthSelf = Module.mc.player.getHealth() + Module.mc.player.getAbsorptionAmount();
            double maxSelf = StayAura.INSTANCE.getMaxBreakSelf();
            double minDamage = StayAura.INSTANCE.getMinBreakDmg();
            double balance = StayAura.INSTANCE.getBreakBalance();
            if (StayAura.INSTANCE.getChase() && healthSelf <= StayAura.INSTANCE.getChasingMaxSelf()) {
                final int chasingFactor = StayAura.INSTANCE.getChasingFactor();
                final int random = RangesKt.random(new IntRange(0, 100), (Random)Random.Default);
                if (0 <= random && random < chasingFactor) {
                    maxSelf = Double.MAX_VALUE;
                    balance = Double.MAX_VALUE;
                }
            }
            if (StayAura.INSTANCE.getPopTotemTry()) {
                if (!StayAura.INSTANCE.getPopTotemTryingProtection() && healthTarget < targetDamage) {
                    maxSelf = Double.MAX_VALUE;
                    balance = Double.MAX_VALUE;
                }
                if (StayAura.INSTANCE.getPopTotemTryingProtection() && StayAura.INSTANCE.getProtectionMode() == PopTotemTryingProtection.CHANCE) {
                    final int trialFactor = StayAura.INSTANCE.getTrialFactor();
                    final int random2 = RangesKt.random(new IntRange(0, 100), (Random)Random.Default);
                    if (0 <= random2 && random2 < trialFactor && healthTarget < targetDamage) {
                        maxSelf = Double.MAX_VALUE;
                        balance = Double.MAX_VALUE;
                    }
                }
                if (StayAura.INSTANCE.getPopTotemTryingProtection() && StayAura.INSTANCE.getProtectionMode() == PopTotemTryingProtection.SELFDAMAGE && selfDamage <= StayAura.INSTANCE.getTrialMaxSelf() && healthTarget < targetDamage) {
                    maxSelf = Double.MAX_VALUE;
                    balance = Double.MAX_VALUE;
                }
                if (StayAura.INSTANCE.getPopTotemTryingProtection() && StayAura.INSTANCE.getProtectionMode() == PopTotemTryingProtection.SELFHEALTH && healthSelf >= StayAura.INSTANCE.getTrialSelfHealth() && healthTarget < targetDamage) {
                    maxSelf = Double.MAX_VALUE;
                    balance = Double.MAX_VALUE;
                }
            }
            if (!StayAura.INSTANCE.getWallBreak() && StayAura.INSTANCE.getWallBreakRange() > 0.0 && !CrystalUtil.canSeeBlock($this$canBreak.getPosition()) && CrystalUtil.getVecDistance($this$canBreak.getPosition(), Module.mc.player.posX, Module.mc.player.posY, Module.mc.player.posZ) >= StayAura.INSTANCE.getWallBreakRange()) {
                return false;
            }
            if (StayAura.INSTANCE.getFacePlace() && healthTarget <= StayAura.INSTANCE.getFacePlaceHealth() && (!(Module.mc.player.getHeldItemMainhand().item instanceof ItemSword) || !(Module.mc.player.getHeldItemOffhand().item instanceof ItemSword) || !StayAura.INSTANCE.getStopFpWhileSwording())) {
                minDamage = 1.0;
            }
            if (StayAura.INSTANCE.getNoSuicide()) {
                maxSelf *= StayAura.INSTANCE.getDamagePriority() / 100.0;
            }
            if (StayAura.INSTANCE.getShouldProtectBalance()) {
                balance = StayAura.INSTANCE.getGlobalBalance();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[StayAura.INSTANCE.getBreakCalcMode().ordinal()]) {
                case 1: {
                    if (targetDamage < minDamage) {
                        return false;
                    }
                    if (selfDamage > maxSelf) {
                        return false;
                    }
                    break;
                }
                case 2: {
                    if (targetDamage - selfDamage < balance) {
                        return false;
                    }
                    break;
                }
                case 3: {
                    if (targetDamage < minDamage || selfDamage > maxSelf || targetDamage - selfDamage < balance) {
                        return false;
                    }
                    break;
                }
            }
            final Unit instance = Unit.INSTANCE;
        }
        return true;
    }
    
    private final boolean getCanPlaceCrystal(final BlockPos $this$canPlaceCrystal) {
        final BlockPos boost = $this$canPlaceCrystal.add(0, 1, 0);
        final BlockPos boost2 = $this$canPlaceCrystal.add(0, 2, 0);
        if (Module.mc.world.getBlockState($this$canPlaceCrystal).getBlock() != Blocks.BEDROCK && Module.mc.world.getBlockState($this$canPlaceCrystal).getBlock() != Blocks.OBSIDIAN) {
            return false;
        }
        if (!this.getNewPlace()) {
            if (Module.mc.world.getBlockState(boost).getBlock() != Blocks.AIR || Module.mc.world.getBlockState(boost2).getBlock() != Blocks.AIR) {
                return false;
            }
        }
        else if (Module.mc.world.getBlockState(boost).getBlock() != Blocks.AIR) {
            return false;
        }
        if ((this.getBypass() && this.getBypassMode() == BypassMode.ENTITYIGNORE) || !this.getMultiPlace()) {
            final List getEntitiesWithinAABB = Module.mc.world.getEntitiesWithinAABB((Class)EntityItem.class, new AxisAlignedBB(boost));
            Intrinsics.checkNotNullExpressionValue((Object)getEntitiesWithinAABB, "mc.world.getEntitiesWith\u2026va, AxisAlignedBB(boost))");
            if (getEntitiesWithinAABB.isEmpty()) {
                final List getEntitiesWithinAABB2 = Module.mc.world.getEntitiesWithinAABB((Class)EntityPlayer.class, new AxisAlignedBB(boost));
                Intrinsics.checkNotNullExpressionValue((Object)getEntitiesWithinAABB2, "mc.world.getEntitiesWith\u2026va, AxisAlignedBB(boost))");
                if (getEntitiesWithinAABB2.isEmpty()) {
                    final List getEntitiesWithinAABB3 = Module.mc.world.getEntitiesWithinAABB((Class)EntityPlayer.class, new AxisAlignedBB(boost2));
                    Intrinsics.checkNotNullExpressionValue((Object)getEntitiesWithinAABB3, "mc.world.getEntitiesWith\u2026a, AxisAlignedBB(boost2))");
                    if (getEntitiesWithinAABB3.isEmpty()) {
                        final List getEntitiesWithinAABB4 = Module.mc.world.getEntitiesWithinAABB((Class)EntityArrow.class, new AxisAlignedBB(boost));
                        Intrinsics.checkNotNullExpressionValue((Object)getEntitiesWithinAABB4, "mc.world.getEntitiesWith\u2026va, AxisAlignedBB(boost))");
                        if (getEntitiesWithinAABB4.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return Module.mc.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(boost)).isEmpty() && Module.mc.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(boost2)).isEmpty();
    }
    
    private final Vec3d getOffset(final Entity $this$offset) {
        return new Vec3d($this$offset.posX - $this$offset.lastTickPosX, $this$offset.posY - $this$offset.lastTickPosY, $this$offset.posZ - $this$offset.lastTickPosZ);
    }
    
    private final double getOffsetX(final Entity $this$offsetX) {
        return this.getOffset($this$offsetX).x;
    }
    
    private final double getOffsetY(final Entity $this$offsetY) {
        return this.getOffset($this$offsetY).y;
    }
    
    private final double getOffsetZ(final Entity $this$offsetZ) {
        return this.getOffset($this$offsetZ).z;
    }
    
    @SubscribeEvent
    public final void onPacketReceive(@NotNull final PacketEvent.Receive event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        final Packet packet2 = event.getPacket();
        if (packet2 instanceof SPacketSpawnExperienceOrb) {
            StayAura.crystalID.set(-1);
            return;
        }
        if (packet2 instanceof SPacketSpawnGlobalEntity) {
            StayAura.crystalID.set(-1);
            return;
        }
        if (packet2 instanceof SPacketSpawnMob) {
            StayAura.crystalID.getAndUpdate(StayAura::onPacketReceive$lambda-8);
            return;
        }
        if (packet2 instanceof SPacketSoundEffect) {
            final Packet packet = event.getPacket();
            if (((SPacketSoundEffect)packet).getCategory() == SoundCategory.BLOCKS && ((SPacketSoundEffect)packet).getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE) {
                Module.mc.world.loadedEntityList.stream().filter(StayAura::onPacketReceive$lambda-9).filter(StayAura::onPacketReceive$lambda-10).forEach(StayAura::onPacketReceive$lambda-11);
            }
            return;
        }
        if (packet2 instanceof SPacketSpawnObject) {
            if (((SPacketSpawnObject)event.getPacket()).getType() == 51) {
                StayAura.crystalID.getAndUpdate(StayAura::onPacketReceive$lambda-12);
                if (this.getPacketExplode()) {
                    final EntityPlayerSP player = Module.mc.player;
                    Intrinsics.checkNotNullExpressionValue((Object)player, "mc.player");
                    this.packetBreak(player, (SPacketSpawnObject)event.getPacket());
                }
            }
            else {
                StayAura.crystalID.set(-1);
            }
            return;
        }
        if (packet2 instanceof SPacketSpawnPainting) {
            StayAura.crystalID.set(-1);
        }
        else {
            if (!(packet2 instanceof SPacketSpawnPlayer)) {
                return;
            }
            StayAura.crystalID.getAndUpdate(StayAura::onPacketReceive$lambda-13);
        }
    }
    
    @SubscribeEvent
    public final void onPacketSend(@NotNull final PacketEvent.Send event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        if (event.getPacket() instanceof CPacketPlayer && StayAura.isSpoofingAngles) {
            ((CPacketPlayer)event.getPacket()).yaw = (float)StayAura.yaw;
            ((CPacketPlayer)event.getPacket()).pitch = (float)StayAura.pitch;
            StayAura.isSpoofingAngles = false;
        }
        if (event.getPacket() instanceof CPacketAnimation && this.getBreakHand() == BreakHand.NONE) {
            event.setCanceled(true);
        }
    }
    
    private final void lookAtPos(final BlockPos block, final EnumFacing face) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_3        /* $i$f$lookAtPos */
        //     2: aload_1         /* block */
        //     3: aload_2         /* face */
        //     4: iconst_0       
        //     5: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotationsBlock:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Z)[F
        //     8: astore          v
        //    10: aload_1         /* block */
        //    11: dconst_0       
        //    12: ldc2_w          0.5
        //    15: dconst_0       
        //    16: invokevirtual   net/minecraft/util/math/BlockPos.add:(DDD)Lnet/minecraft/util/math/BlockPos;
        //    19: aload_2         /* face */
        //    20: iconst_0       
        //    21: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotationsBlock:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Z)[F
        //    24: astore          v2
        //    26: aload_0         /* this */
        //    27: astore          6
        //    29: aload           v
        //    31: iconst_0       
        //    32: faload         
        //    33: fstore          7
        //    35: aload           v
        //    37: iconst_1       
        //    38: faload         
        //    39: fstore          8
        //    41: aload           v2
        //    43: iconst_1       
        //    44: faload         
        //    45: fstore          renderPitch1$iv
        //    47: iconst_0       
        //    48: istore          $i$f$setYawAndPitch
        //    50: fload           yaw1$iv
        //    52: f2d            
        //    53: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setYaw$p:(D)V
        //    56: fload           pitch1$iv
        //    58: f2d            
        //    59: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPitch$p:(D)V
        //    62: fload           renderPitch1$iv
        //    64: f2d            
        //    65: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRenderPitch$p:(D)V
        //    68: iconst_1       
        //    69: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSpoofingAngles$p:(Z)V
        //    72: iconst_1       
        //    73: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRotating$p:(Z)V
        //    76: nop            
        //    77: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Object getPlaceBlocks(final Continuation<? super List<? extends BlockPos>> $completion) {
        final int $i$f$getPlaceBlocks = 0;
        if (Module.mc.player == null) {
            return new ArrayList<Object>();
        }
        final Ref.ObjectRef handler = new Ref.ObjectRef();
        BuildersKt.runBlocking$default((CoroutineContext)null, (Function2)new StayAura$getPlaceBlocks.StayAura$getPlaceBlocks$2(handler, (Continuation)null), 1, (Object)null);
        final Deferred deferred = (Deferred)handler.element;
        InlineMarker.mark(0);
        final Object await = deferred.await((Continuation)$completion);
        InlineMarker.mark(1);
        return await;
    }
    
    private final void lookAtCrystal(final EntityEnderCrystal ent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2        /* $i$f$lookAtCrystal */
        //     2: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //     5: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //     8: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    11: invokevirtual   net/minecraft/client/Minecraft.getRenderPartialTicks:()F
        //    14: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionEyes:(F)Lnet/minecraft/util/math/Vec3d;
        //    17: aload_1         /* ent */
        //    18: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //    21: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotations:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
        //    24: astore_3        /* v */
        //    25: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    34: invokevirtual   net/minecraft/client/Minecraft.getRenderPartialTicks:()F
        //    37: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionEyes:(F)Lnet/minecraft/util/math/Vec3d;
        //    40: aload_1         /* ent */
        //    41: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //    44: dconst_0       
        //    45: ldc2_w          -0.5
        //    48: dconst_0       
        //    49: invokevirtual   net/minecraft/util/math/Vec3d.add:(DDD)Lnet/minecraft/util/math/Vec3d;
        //    52: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotations:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
        //    55: astore          v2
        //    57: aload_0         /* this */
        //    58: astore          5
        //    60: aload_3         /* v */
        //    61: iconst_0       
        //    62: faload         
        //    63: fstore          6
        //    65: aload_3         /* v */
        //    66: iconst_1       
        //    67: faload         
        //    68: fstore          7
        //    70: aload           v2
        //    72: iconst_1       
        //    73: faload         
        //    74: fstore          renderPitch1$iv
        //    76: iconst_0       
        //    77: istore          $i$f$setYawAndPitch
        //    79: fload           yaw1$iv
        //    81: f2d            
        //    82: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setYaw$p:(D)V
        //    85: fload           pitch1$iv
        //    87: f2d            
        //    88: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPitch$p:(D)V
        //    91: fload           renderPitch1$iv
        //    93: f2d            
        //    94: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRenderPitch$p:(D)V
        //    97: iconst_1       
        //    98: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSpoofingAngles$p:(Z)V
        //   101: iconst_1       
        //   102: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRotating$p:(Z)V
        //   105: nop            
        //   106: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void setYawAndPitch(final float yaw1, final float pitch1, final float renderPitch1) {
        final int $i$f$setYawAndPitch = 0;
        access$setYaw$p(yaw1);
        access$setPitch$p(pitch1);
        access$setRenderPitch$p(renderPitch1);
        access$setSpoofingAngles$p(true);
        access$setRotating$p(true);
    }
    
    private final void resetRotation() {
        final int $i$f$resetRotation = 0;
        if (access$isSpoofingAngles$p()) {
            access$setYaw$p(Module.mc.player.rotationYaw);
            access$setPitch$p(Module.mc.player.rotationPitch);
            access$setSpoofingAngles$p(false);
            access$setRotating$p(false);
        }
    }
    
    private final CrystalTarget calculate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1        /* $i$f$calculate */
        //     2: aload_0         /* this */
        //     3: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getHeavyCalc:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //     6: ifeq            542
        //     9: aload_0         /* this */
        //    10: astore_2        /* this_$iv */
        //    11: iconst_0       
        //    12: istore_3        /* $i$f$doubleCalculate */
        //    13: aload_2         /* this_$iv */
        //    14: astore          this_$iv$iv
        //    16: iconst_0       
        //    17: istore          $i$f$calculate0
        //    19: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //    22: dup            
        //    23: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    26: astore          handler$iv$iv
        //    28: aconst_null    
        //    29: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //    32: dup            
        //    33: aload           handler$iv$iv
        //    35: aconst_null    
        //    36: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //    39: checkcast       Lkotlin/jvm/functions/Function2;
        //    42: iconst_1       
        //    43: aconst_null    
        //    44: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //    47: pop            
        //    48: aload           handler$iv$iv
        //    50: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    53: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //    56: astore          result1$iv
        //    58: aload_2         /* this_$iv */
        //    59: astore          this_$iv$iv
        //    61: iconst_0       
        //    62: istore          $i$f$calculate0
        //    64: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //    67: dup            
        //    68: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    71: astore          handler$iv$iv
        //    73: aconst_null    
        //    74: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //    77: dup            
        //    78: aload           handler$iv$iv
        //    80: aconst_null    
        //    81: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //    84: checkcast       Lkotlin/jvm/functions/Function2;
        //    87: iconst_1       
        //    88: aconst_null    
        //    89: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //    92: pop            
        //    93: aload           handler$iv$iv
        //    95: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    98: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //   101: astore          result2$iv
        //   103: aload_2         /* this_$iv */
        //   104: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getOverrideMode:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;
        //   107: getstatic       me/alpha432/stay/features/modules/combat/StayAura$WhenMappings.$EnumSwitchMapping$1:[I
        //   110: swap           
        //   111: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$OverrideMode.ordinal:()I
        //   114: iaload         
        //   115: tableswitch {
        //                2: 140
        //                3: 164
        //                4: 188
        //          default: 534
        //        }
        //   140: aload           result1$iv
        //   142: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getTargetDamage:()D
        //   145: aload           result2$iv
        //   147: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getTargetDamage:()D
        //   150: dcmpl          
        //   151: ifle            159
        //   154: aload           result1$iv
        //   156: goto            161
        //   159: aload           result2$iv
        //   161: goto            583
        //   164: aload           result1$iv
        //   166: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getSelfDamage:()D
        //   169: aload           result2$iv
        //   171: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getSelfDamage:()D
        //   174: dcmpg          
        //   175: ifge            183
        //   178: aload           result1$iv
        //   180: goto            185
        //   183: aload           result2$iv
        //   185: goto            583
        //   188: aload           result1$iv
        //   190: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   193: ifnull          204
        //   196: aload           result2$iv
        //   198: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   201: ifnonnull       224
        //   204: aload_2         /* this_$iv */
        //   205: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getNullCheckedReturn:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;
        //   208: getstatic       me/alpha432/stay/features/modules/combat/StayAura$NullChecked.FIRST:Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;
        //   211: if_acmpne       219
        //   214: aload           result1$iv
        //   216: goto            583
        //   219: aload           result2$iv
        //   221: goto            583
        //   224: aload           result1$iv
        //   226: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   229: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   232: astore          8
        //   234: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   237: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   240: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   243: astore          9
        //   245: aload           9
        //   247: ldc_w           "mc.player.positionVector"
        //   250: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   253: aload           9
        //   255: astore          vec3d$iv$iv
        //   257: iconst_0       
        //   258: istore          $i$f$distanceTo
        //   260: aload           $this$distanceTo$iv$iv
        //   262: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //   265: i2d            
        //   266: ldc2_w          0.5
        //   269: dadd           
        //   270: dstore          11
        //   272: aload           $this$distanceTo$iv$iv
        //   274: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //   277: i2d            
        //   278: ldc2_w          0.5
        //   281: dadd           
        //   282: dstore          13
        //   284: aload           $this$distanceTo$iv$iv
        //   286: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //   289: i2d            
        //   290: ldc2_w          0.5
        //   293: dadd           
        //   294: dstore          15
        //   296: aload           vec3d$iv$iv
        //   298: getfield        net/minecraft/util/math/Vec3d.x:D
        //   301: dstore          17
        //   303: aload           vec3d$iv$iv
        //   305: getfield        net/minecraft/util/math/Vec3d.y:D
        //   308: dstore          19
        //   310: aload           vec3d$iv$iv
        //   312: getfield        net/minecraft/util/math/Vec3d.z:D
        //   315: dstore          z2$iv$iv$iv
        //   317: iconst_0       
        //   318: istore          $i$f$distance
        //   320: nop            
        //   321: iconst_0       
        //   322: istore          $i$f$distanceSq
        //   324: dload           x2$iv$iv$iv
        //   326: dload           x1$iv$iv$iv
        //   328: dsub           
        //   329: dstore          $this$sq$iv$iv$iv$iv$iv
        //   331: iconst_0       
        //   332: istore          $i$f$getSq
        //   334: dload           $this$sq$iv$iv$iv$iv$iv
        //   336: dload           $this$sq$iv$iv$iv$iv$iv
        //   338: dmul           
        //   339: dload           y2$iv$iv$iv
        //   341: dload           y1$iv$iv$iv
        //   343: dsub           
        //   344: dstore          $this$sq$iv$iv$iv$iv$iv
        //   346: iconst_0       
        //   347: istore          $i$f$getSq
        //   349: dload           $this$sq$iv$iv$iv$iv$iv
        //   351: dload           $this$sq$iv$iv$iv$iv$iv
        //   353: dmul           
        //   354: dadd           
        //   355: dload           z2$iv$iv$iv
        //   357: dload           z1$iv$iv$iv
        //   359: dsub           
        //   360: dstore          $this$sq$iv$iv$iv$iv$iv
        //   362: iconst_0       
        //   363: istore          $i$f$getSq
        //   365: dload           $this$sq$iv$iv$iv$iv$iv
        //   367: dload           $this$sq$iv$iv$iv$iv$iv
        //   369: dmul           
        //   370: dadd           
        //   371: invokestatic    java/lang/Math.sqrt:(D)D
        //   374: nop            
        //   375: nop            
        //   376: aload           result2$iv
        //   378: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   381: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   384: astore          8
        //   386: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   389: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   392: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   395: astore          9
        //   397: aload           9
        //   399: ldc_w           "mc.player.positionVector"
        //   402: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   405: aload           9
        //   407: astore          vec3d$iv$iv
        //   409: iconst_0       
        //   410: istore          $i$f$distanceSqTo
        //   412: aload           $this$distanceSqTo$iv$iv
        //   414: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //   417: i2d            
        //   418: ldc2_w          0.5
        //   421: dadd           
        //   422: dstore          11
        //   424: aload           $this$distanceSqTo$iv$iv
        //   426: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //   429: i2d            
        //   430: ldc2_w          0.5
        //   433: dadd           
        //   434: dstore          13
        //   436: aload           $this$distanceSqTo$iv$iv
        //   438: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //   441: i2d            
        //   442: ldc2_w          0.5
        //   445: dadd           
        //   446: dstore          15
        //   448: aload           vec3d$iv$iv
        //   450: getfield        net/minecraft/util/math/Vec3d.x:D
        //   453: dstore          17
        //   455: aload           vec3d$iv$iv
        //   457: getfield        net/minecraft/util/math/Vec3d.y:D
        //   460: dstore          19
        //   462: aload           vec3d$iv$iv
        //   464: getfield        net/minecraft/util/math/Vec3d.z:D
        //   467: dstore          z2$iv$iv$iv
        //   469: iconst_0       
        //   470: istore          $i$f$distanceSq
        //   472: dload           x2$iv$iv$iv
        //   474: dload           x1$iv$iv$iv
        //   476: dsub           
        //   477: dstore          $this$sq$iv$iv$iv$iv
        //   479: iconst_0       
        //   480: istore          $i$f$getSq
        //   482: dload           $this$sq$iv$iv$iv$iv
        //   484: dload           $this$sq$iv$iv$iv$iv
        //   486: dmul           
        //   487: dload           y2$iv$iv$iv
        //   489: dload           y1$iv$iv$iv
        //   491: dsub           
        //   492: dstore          $this$sq$iv$iv$iv$iv
        //   494: iconst_0       
        //   495: istore          $i$f$getSq
        //   497: dload           $this$sq$iv$iv$iv$iv
        //   499: dload           $this$sq$iv$iv$iv$iv
        //   501: dmul           
        //   502: dadd           
        //   503: dload           z2$iv$iv$iv
        //   505: dload           z1$iv$iv$iv
        //   507: dsub           
        //   508: dstore          $this$sq$iv$iv$iv$iv
        //   510: iconst_0       
        //   511: istore          $i$f$getSq
        //   513: dload           $this$sq$iv$iv$iv$iv
        //   515: dload           $this$sq$iv$iv$iv$iv
        //   517: dmul           
        //   518: dadd           
        //   519: nop            
        //   520: dcmpl          
        //   521: ifle            529
        //   524: aload           result2$iv
        //   526: goto            531
        //   529: aload           result1$iv
        //   531: goto            583
        //   534: new             Lkotlin/NoWhenBranchMatchedException;
        //   537: dup            
        //   538: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   541: athrow         
        //   542: aload_0         /* this */
        //   543: astore_2        /* this_$iv */
        //   544: iconst_0       
        //   545: istore_3        /* $i$f$calculate0 */
        //   546: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   549: dup            
        //   550: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   553: astore          handler$iv
        //   555: aconst_null    
        //   556: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //   559: dup            
        //   560: aload           handler$iv
        //   562: aconst_null    
        //   563: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //   566: checkcast       Lkotlin/jvm/functions/Function2;
        //   569: iconst_1       
        //   570: aconst_null    
        //   571: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //   574: pop            
        //   575: aload           handler$iv
        //   577: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   580: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //   583: areturn        
        //    StackMapTable: 00 0F FF 00 8C 00 09 07 00 02 01 07 00 02 01 07 02 5B 07 00 02 01 07 02 5B 07 05 E7 00 00 12 41 07 02 5B 02 12 41 07 02 5B 02 0F 0E 04 FF 01 30 00 17 07 00 02 01 07 00 02 01 07 02 5B 07 00 02 01 07 02 5B 07 06 44 07 04 4C 01 03 03 03 03 03 03 01 01 03 01 03 01 00 00 41 07 02 5B FF 00 02 00 09 07 00 02 01 07 00 02 01 07 02 5B 07 00 02 01 07 02 5B 07 05 E7 00 00 FF 00 07 00 02 07 00 02 01 00 00 FF 00 28 00 05 07 00 02 01 07 00 02 01 07 03 C1 00 01 07 02 5B
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final CrystalTarget doubleCalculate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1        /* $i$f$doubleCalculate */
        //     2: aload_0         /* this */
        //     3: astore_3        /* this_$iv */
        //     4: iconst_0       
        //     5: istore          $i$f$calculate0
        //     7: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //    10: dup            
        //    11: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    14: astore          handler$iv
        //    16: aconst_null    
        //    17: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //    20: dup            
        //    21: aload           handler$iv
        //    23: aconst_null    
        //    24: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //    27: checkcast       Lkotlin/jvm/functions/Function2;
        //    30: iconst_1       
        //    31: aconst_null    
        //    32: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //    35: pop            
        //    36: aload           handler$iv
        //    38: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    41: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //    44: astore_2        /* result1 */
        //    45: aload_0         /* this */
        //    46: astore          this_$iv
        //    48: iconst_0       
        //    49: istore          $i$f$calculate0
        //    51: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //    54: dup            
        //    55: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    58: astore          handler$iv
        //    60: aconst_null    
        //    61: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //    64: dup            
        //    65: aload           handler$iv
        //    67: aconst_null    
        //    68: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //    71: checkcast       Lkotlin/jvm/functions/Function2;
        //    74: iconst_1       
        //    75: aconst_null    
        //    76: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //    79: pop            
        //    80: aload           handler$iv
        //    82: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    85: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //    88: astore_3        /* result2 */
        //    89: aload_0         /* this */
        //    90: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getOverrideMode:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;
        //    93: getstatic       me/alpha432/stay/features/modules/combat/StayAura$WhenMappings.$EnumSwitchMapping$1:[I
        //    96: swap           
        //    97: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$OverrideMode.ordinal:()I
        //   100: iaload         
        //   101: tableswitch {
        //                2: 128
        //                3: 146
        //                4: 164
        //          default: 498
        //        }
        //   128: aload_2         /* result1 */
        //   129: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getTargetDamage:()D
        //   132: aload_3         /* result2 */
        //   133: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getTargetDamage:()D
        //   136: dcmpl          
        //   137: ifle            144
        //   140: aload_2         /* result1 */
        //   141: goto            145
        //   144: aload_3         /* result2 */
        //   145: areturn        
        //   146: aload_2         /* result1 */
        //   147: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getSelfDamage:()D
        //   150: aload_3         /* result2 */
        //   151: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getSelfDamage:()D
        //   154: dcmpg          
        //   155: ifge            162
        //   158: aload_2         /* result1 */
        //   159: goto            163
        //   162: aload_3         /* result2 */
        //   163: areturn        
        //   164: aload_2         /* result1 */
        //   165: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   168: ifnull          178
        //   171: aload_3         /* result2 */
        //   172: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   175: ifnonnull       194
        //   178: aload_0         /* this */
        //   179: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getNullCheckedReturn:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;
        //   182: getstatic       me/alpha432/stay/features/modules/combat/StayAura$NullChecked.FIRST:Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;
        //   185: if_acmpne       192
        //   188: aload_2         /* result1 */
        //   189: goto            193
        //   192: aload_3         /* result2 */
        //   193: areturn        
        //   194: aload_2         /* result1 */
        //   195: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   198: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   201: astore          6
        //   203: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   206: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   209: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   212: astore          7
        //   214: aload           7
        //   216: ldc_w           "mc.player.positionVector"
        //   219: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   222: aload           7
        //   224: astore          vec3d$iv
        //   226: iconst_0       
        //   227: istore          $i$f$distanceTo
        //   229: aload           $this$distanceTo$iv
        //   231: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //   234: i2d            
        //   235: ldc2_w          0.5
        //   238: dadd           
        //   239: dstore          9
        //   241: aload           $this$distanceTo$iv
        //   243: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //   246: i2d            
        //   247: ldc2_w          0.5
        //   250: dadd           
        //   251: dstore          11
        //   253: aload           $this$distanceTo$iv
        //   255: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //   258: i2d            
        //   259: ldc2_w          0.5
        //   262: dadd           
        //   263: dstore          13
        //   265: aload           vec3d$iv
        //   267: getfield        net/minecraft/util/math/Vec3d.x:D
        //   270: dstore          15
        //   272: aload           vec3d$iv
        //   274: getfield        net/minecraft/util/math/Vec3d.y:D
        //   277: dstore          17
        //   279: aload           vec3d$iv
        //   281: getfield        net/minecraft/util/math/Vec3d.z:D
        //   284: dstore          z2$iv$iv
        //   286: iconst_0       
        //   287: istore          $i$f$distance
        //   289: nop            
        //   290: iconst_0       
        //   291: istore          $i$f$distanceSq
        //   293: dload           x2$iv$iv
        //   295: dload           x1$iv$iv
        //   297: dsub           
        //   298: dstore          $this$sq$iv$iv$iv$iv
        //   300: iconst_0       
        //   301: istore          $i$f$getSq
        //   303: dload           $this$sq$iv$iv$iv$iv
        //   305: dload           $this$sq$iv$iv$iv$iv
        //   307: dmul           
        //   308: dload           y2$iv$iv
        //   310: dload           y1$iv$iv
        //   312: dsub           
        //   313: dstore          $this$sq$iv$iv$iv$iv
        //   315: iconst_0       
        //   316: istore          $i$f$getSq
        //   318: dload           $this$sq$iv$iv$iv$iv
        //   320: dload           $this$sq$iv$iv$iv$iv
        //   322: dmul           
        //   323: dadd           
        //   324: dload           z2$iv$iv
        //   326: dload           z1$iv$iv
        //   328: dsub           
        //   329: dstore          $this$sq$iv$iv$iv$iv
        //   331: iconst_0       
        //   332: istore          $i$f$getSq
        //   334: dload           $this$sq$iv$iv$iv$iv
        //   336: dload           $this$sq$iv$iv$iv$iv
        //   338: dmul           
        //   339: dadd           
        //   340: invokestatic    java/lang/Math.sqrt:(D)D
        //   343: nop            
        //   344: nop            
        //   345: aload_3         /* result2 */
        //   346: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   349: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   352: astore          6
        //   354: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   357: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   360: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   363: astore          7
        //   365: aload           7
        //   367: ldc_w           "mc.player.positionVector"
        //   370: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   373: aload           7
        //   375: astore          vec3d$iv
        //   377: iconst_0       
        //   378: istore          $i$f$distanceSqTo
        //   380: aload           $this$distanceSqTo$iv
        //   382: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //   385: i2d            
        //   386: ldc2_w          0.5
        //   389: dadd           
        //   390: dstore          9
        //   392: aload           $this$distanceSqTo$iv
        //   394: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //   397: i2d            
        //   398: ldc2_w          0.5
        //   401: dadd           
        //   402: dstore          11
        //   404: aload           $this$distanceSqTo$iv
        //   406: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //   409: i2d            
        //   410: ldc2_w          0.5
        //   413: dadd           
        //   414: dstore          13
        //   416: aload           vec3d$iv
        //   418: getfield        net/minecraft/util/math/Vec3d.x:D
        //   421: dstore          15
        //   423: aload           vec3d$iv
        //   425: getfield        net/minecraft/util/math/Vec3d.y:D
        //   428: dstore          17
        //   430: aload           vec3d$iv
        //   432: getfield        net/minecraft/util/math/Vec3d.z:D
        //   435: dstore          z2$iv$iv
        //   437: iconst_0       
        //   438: istore          $i$f$distanceSq
        //   440: dload           x2$iv$iv
        //   442: dload           x1$iv$iv
        //   444: dsub           
        //   445: dstore          $this$sq$iv$iv$iv
        //   447: iconst_0       
        //   448: istore          $i$f$getSq
        //   450: dload           $this$sq$iv$iv$iv
        //   452: dload           $this$sq$iv$iv$iv
        //   454: dmul           
        //   455: dload           y2$iv$iv
        //   457: dload           y1$iv$iv
        //   459: dsub           
        //   460: dstore          $this$sq$iv$iv$iv
        //   462: iconst_0       
        //   463: istore          $i$f$getSq
        //   465: dload           $this$sq$iv$iv$iv
        //   467: dload           $this$sq$iv$iv$iv
        //   469: dmul           
        //   470: dadd           
        //   471: dload           z2$iv$iv
        //   473: dload           z1$iv$iv
        //   475: dsub           
        //   476: dstore          $this$sq$iv$iv$iv
        //   478: iconst_0       
        //   479: istore          $i$f$getSq
        //   481: dload           $this$sq$iv$iv$iv
        //   483: dload           $this$sq$iv$iv$iv
        //   485: dmul           
        //   486: dadd           
        //   487: nop            
        //   488: dcmpl          
        //   489: ifle            496
        //   492: aload_3         /* result2 */
        //   493: goto            497
        //   496: aload_2         /* result1 */
        //   497: areturn        
        //   498: new             Lkotlin/NoWhenBranchMatchedException;
        //   501: dup            
        //   502: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   505: athrow         
        //    StackMapTable: 00 0E FF 00 80 00 07 07 00 02 01 07 02 5B 07 02 5B 07 00 02 01 07 05 E7 00 00 0F 40 07 02 5B 00 0F 40 07 02 5B 00 0D 0D 40 07 02 5B 00 FF 01 2D 00 13 07 00 02 01 07 02 5B 07 02 5B 07 00 02 01 07 06 44 07 04 4C 01 03 03 03 03 03 03 01 03 01 01 00 00 40 07 02 5B FF 00 00 00 07 07 00 02 01 07 02 5B 07 02 5B 07 00 02 01 07 05 E7 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final CrystalTarget calculate0() {
        final int $i$f$calculate0 = 0;
        final Ref.ObjectRef handler = new Ref.ObjectRef();
        BuildersKt.runBlocking$default((CoroutineContext)null, (Function2)new StayAura$calculate0.StayAura$calculate0$1(handler, (Continuation)null), 1, (Object)null);
        return (CrystalTarget)handler.element;
    }
    
    private final void packetBreak(final EntityPlayerSP player, final SPacketSpawnObject packet) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* this */
        //     4: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getBreakDelay:()I
        //     7: i2l            
        //     8: invokevirtual   me/alpha432/stay/util/counting/Timer.passedMs:(J)Z
        //    11: ifne            15
        //    14: return         
        //    15: aload_1         /* player */
        //    16: aload_2         /* packet */
        //    17: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getX:()D
        //    20: aload_2         /* packet */
        //    21: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getY:()D
        //    24: aload_2         /* packet */
        //    25: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getZ:()D
        //    28: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getDistance:(DDD)D
        //    31: dstore_3        /* distance */
        //    32: dload_3         /* distance */
        //    33: aload_0         /* this */
        //    34: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getBreakRange:()D
        //    37: dcmpl          
        //    38: ifle            42
        //    41: return         
        //    42: new             Lnet/minecraft/util/math/Vec3d;
        //    45: dup            
        //    46: aload_2         /* packet */
        //    47: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getX:()D
        //    50: aload_2         /* packet */
        //    51: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getY:()D
        //    54: aload_2         /* packet */
        //    55: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getZ:()D
        //    58: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //    61: astore          pos
        //    63: aload_0         /* this */
        //    64: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getWallBreak:()Z
        //    67: ifeq            95
        //    70: dload_3         /* distance */
        //    71: aload_0         /* this */
        //    72: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getWallBreakRange:()D
        //    75: dcmpl          
        //    76: ifle            95
        //    79: new             Lnet/minecraft/util/math/BlockPos;
        //    82: dup            
        //    83: aload           pos
        //    85: invokespecial   net/minecraft/util/math/BlockPos.<init>:(Lnet/minecraft/util/math/Vec3d;)V
        //    88: invokestatic    me/alpha432/stay/util/player/CombatUtil.canSeeBlock:(Lnet/minecraft/util/math/BlockPos;)Z
        //    91: ifne            95
        //    94: return         
        //    95: new             Lnet/minecraft/network/play/client/CPacketUseEntity;
        //    98: dup            
        //    99: invokespecial   net/minecraft/network/play/client/CPacketUseEntity.<init>:()V
        //   102: astore          attackPacket
        //   104: aload           attackPacket
        //   106: aload_2         /* packet */
        //   107: invokevirtual   net/minecraft/network/play/server/SPacketSpawnObject.getEntityID:()I
        //   110: putfield        net/minecraft/network/play/client/CPacketUseEntity.entityId:I
        //   113: aload           attackPacket
        //   115: getstatic       net/minecraft/network/play/client/CPacketUseEntity$Action.ATTACK:Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
        //   118: putfield        net/minecraft/network/play/client/CPacketUseEntity.action:Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
        //   121: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   124: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   127: getfield        net/minecraft/client/entity/EntityPlayerSP.connection:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   130: aload           attackPacket
        //   132: checkcast       Lnet/minecraft/network/Packet;
        //   135: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.sendPacket:(Lnet/minecraft/network/Packet;)V
        //   138: aload_0         /* this */
        //   139: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getRotate:()Z
        //   142: ifeq            261
        //   145: aload_0         /* this */
        //   146: astore          7
        //   148: new             Lnet/minecraft/util/math/BlockPos;
        //   151: dup            
        //   152: aload           pos
        //   154: invokespecial   net/minecraft/util/math/BlockPos.<init>:(Lnet/minecraft/util/math/Vec3d;)V
        //   157: astore          8
        //   159: aload_0         /* this */
        //   160: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.getFacing:()Lnet/minecraft/util/EnumFacing;
        //   163: astore          9
        //   165: aload           9
        //   167: ldc_w           "facing"
        //   170: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   173: aload           9
        //   175: astore          face$iv
        //   177: iconst_0       
        //   178: istore          $i$f$lookAtPos
        //   180: aload           block$iv
        //   182: aload           face$iv
        //   184: iconst_0       
        //   185: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotationsBlock:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Z)[F
        //   188: astore          v$iv
        //   190: aload           block$iv
        //   192: dconst_0       
        //   193: ldc2_w          0.5
        //   196: dconst_0       
        //   197: invokevirtual   net/minecraft/util/math/BlockPos.add:(DDD)Lnet/minecraft/util/math/BlockPos;
        //   200: aload           face$iv
        //   202: iconst_0       
        //   203: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotationsBlock:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Z)[F
        //   206: astore          v2$iv
        //   208: aload           this_$iv
        //   210: astore          13
        //   212: aload           v$iv
        //   214: iconst_0       
        //   215: faload         
        //   216: fstore          14
        //   218: aload           v$iv
        //   220: iconst_1       
        //   221: faload         
        //   222: fstore          15
        //   224: aload           v2$iv
        //   226: iconst_1       
        //   227: faload         
        //   228: fstore          renderPitch1$iv$iv
        //   230: iconst_0       
        //   231: istore          $i$f$setYawAndPitch
        //   233: fload           yaw1$iv$iv
        //   235: f2d            
        //   236: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setYaw$p:(D)V
        //   239: fload           pitch1$iv$iv
        //   241: f2d            
        //   242: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPitch$p:(D)V
        //   245: fload           renderPitch1$iv$iv
        //   247: f2d            
        //   248: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRenderPitch$p:(D)V
        //   251: iconst_1       
        //   252: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSpoofingAngles$p:(Z)V
        //   255: iconst_1       
        //   256: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRotating$p:(Z)V
        //   259: nop            
        //   260: nop            
        //   261: getstatic       me/alpha432/stay/features/modules/combat/StayAura.packetTimer:Lme/alpha432/stay/util/counting/Timer;
        //   264: invokevirtual   me/alpha432/stay/util/counting/Timer.reset:()Lme/alpha432/stay/util/counting/Timer;
        //   267: pop            
        //   268: return         
        //    StackMapTable: 00 04 0F FC 00 1A 03 FC 00 34 07 04 4C FC 00 A5 07 06 9E
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void doPlace() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1        /* $i$f$doPlace */
        //     2: aload_0         /* this */
        //     3: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPlace:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //     6: ifeq            23
        //     9: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPlaceTimer$p:()Lme/alpha432/stay/util/counting/Timer;
        //    12: aload_0         /* this */
        //    13: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPlaceDelay:(Lme/alpha432/stay/features/modules/combat/StayAura;)I
        //    16: i2l            
        //    17: invokevirtual   me/alpha432/stay/util/counting/Timer.passedMs:(J)Z
        //    20: ifne            24
        //    23: return         
        //    24: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPlacement$p:()I
        //    27: iconst_1       
        //    28: if_icmple       39
        //    31: aload_0         /* this */
        //    32: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getMultiPlace:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //    35: ifne            39
        //    38: return         
        //    39: aload_0         /* this */
        //    40: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$isEating:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //    43: ifeq            54
        //    46: aload_0         /* this */
        //    47: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPauseWhileEating:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //    50: ifeq            54
        //    53: return         
        //    54: aload_0         /* this */
        //    55: astore_3        /* this_$iv */
        //    56: iconst_0       
        //    57: istore          $i$f$calculate
        //    59: aload_3         /* this_$iv */
        //    60: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getHeavyCalc:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //    63: ifeq            607
        //    66: aload_3         /* this_$iv */
        //    67: astore          this_$iv$iv
        //    69: iconst_0       
        //    70: istore          $i$f$doubleCalculate
        //    72: aload           this_$iv$iv
        //    74: astore          this_$iv$iv$iv
        //    76: iconst_0       
        //    77: istore          $i$f$calculate0
        //    79: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //    82: dup            
        //    83: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    86: astore          handler$iv$iv$iv
        //    88: aconst_null    
        //    89: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //    92: dup            
        //    93: aload           handler$iv$iv$iv
        //    95: aconst_null    
        //    96: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //    99: checkcast       Lkotlin/jvm/functions/Function2;
        //   102: iconst_1       
        //   103: aconst_null    
        //   104: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //   107: pop            
        //   108: aload           handler$iv$iv$iv
        //   110: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   113: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //   116: astore          result1$iv$iv
        //   118: aload           this_$iv$iv
        //   120: astore          this_$iv$iv$iv
        //   122: iconst_0       
        //   123: istore          $i$f$calculate0
        //   125: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   128: dup            
        //   129: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   132: astore          handler$iv$iv$iv
        //   134: aconst_null    
        //   135: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //   138: dup            
        //   139: aload           handler$iv$iv$iv
        //   141: aconst_null    
        //   142: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //   145: checkcast       Lkotlin/jvm/functions/Function2;
        //   148: iconst_1       
        //   149: aconst_null    
        //   150: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //   153: pop            
        //   154: aload           handler$iv$iv$iv
        //   156: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   159: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //   162: astore          result2$iv$iv
        //   164: aload           this_$iv$iv
        //   166: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getOverrideMode:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;
        //   169: getstatic       me/alpha432/stay/features/modules/combat/StayAura$WhenMappings.$EnumSwitchMapping$1:[I
        //   172: swap           
        //   173: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$OverrideMode.ordinal:()I
        //   176: iaload         
        //   177: tableswitch {
        //                2: 204
        //                3: 228
        //                4: 252
        //          default: 599
        //        }
        //   204: aload           result1$iv$iv
        //   206: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getTargetDamage:()D
        //   209: aload           result2$iv$iv
        //   211: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getTargetDamage:()D
        //   214: dcmpl          
        //   215: ifle            223
        //   218: aload           result1$iv$iv
        //   220: goto            225
        //   223: aload           result2$iv$iv
        //   225: goto            650
        //   228: aload           result1$iv$iv
        //   230: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getSelfDamage:()D
        //   233: aload           result2$iv$iv
        //   235: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getSelfDamage:()D
        //   238: dcmpg          
        //   239: ifge            247
        //   242: aload           result1$iv$iv
        //   244: goto            249
        //   247: aload           result2$iv$iv
        //   249: goto            650
        //   252: aload           result1$iv$iv
        //   254: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   257: ifnull          268
        //   260: aload           result2$iv$iv
        //   262: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   265: ifnonnull       289
        //   268: aload           this_$iv$iv
        //   270: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getNullCheckedReturn:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;
        //   273: getstatic       me/alpha432/stay/features/modules/combat/StayAura$NullChecked.FIRST:Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;
        //   276: if_acmpne       284
        //   279: aload           result1$iv$iv
        //   281: goto            650
        //   284: aload           result2$iv$iv
        //   286: goto            650
        //   289: aload           result1$iv$iv
        //   291: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   294: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   297: astore          11
        //   299: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   302: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   305: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   308: astore          12
        //   310: aload           12
        //   312: ldc_w           "mc.player.positionVector"
        //   315: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   318: aload           12
        //   320: astore          vec3d$iv$iv$iv
        //   322: iconst_0       
        //   323: istore          $i$f$distanceTo
        //   325: aload           $this$distanceTo$iv$iv$iv
        //   327: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //   330: i2d            
        //   331: ldc2_w          0.5
        //   334: dadd           
        //   335: dstore          14
        //   337: aload           $this$distanceTo$iv$iv$iv
        //   339: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //   342: i2d            
        //   343: ldc2_w          0.5
        //   346: dadd           
        //   347: dstore          16
        //   349: aload           $this$distanceTo$iv$iv$iv
        //   351: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //   354: i2d            
        //   355: ldc2_w          0.5
        //   358: dadd           
        //   359: dstore          18
        //   361: aload           vec3d$iv$iv$iv
        //   363: getfield        net/minecraft/util/math/Vec3d.x:D
        //   366: dstore          20
        //   368: aload           vec3d$iv$iv$iv
        //   370: getfield        net/minecraft/util/math/Vec3d.y:D
        //   373: dstore          22
        //   375: aload           vec3d$iv$iv$iv
        //   377: getfield        net/minecraft/util/math/Vec3d.z:D
        //   380: dstore          z2$iv$iv$iv$iv
        //   382: iconst_0       
        //   383: istore          $i$f$distance
        //   385: nop            
        //   386: iconst_0       
        //   387: istore          $i$f$distanceSq
        //   389: dload           x2$iv$iv$iv$iv
        //   391: dload           x1$iv$iv$iv$iv
        //   393: dsub           
        //   394: dstore          $this$sq$iv$iv$iv$iv$iv$iv
        //   396: iconst_0       
        //   397: istore          $i$f$getSq
        //   399: dload           $this$sq$iv$iv$iv$iv$iv$iv
        //   401: dload           $this$sq$iv$iv$iv$iv$iv$iv
        //   403: dmul           
        //   404: dload           y2$iv$iv$iv$iv
        //   406: dload           y1$iv$iv$iv$iv
        //   408: dsub           
        //   409: dstore          $this$sq$iv$iv$iv$iv$iv$iv
        //   411: iconst_0       
        //   412: istore          $i$f$getSq
        //   414: dload           $this$sq$iv$iv$iv$iv$iv$iv
        //   416: dload           $this$sq$iv$iv$iv$iv$iv$iv
        //   418: dmul           
        //   419: dadd           
        //   420: dload           z2$iv$iv$iv$iv
        //   422: dload           z1$iv$iv$iv$iv
        //   424: dsub           
        //   425: dstore          $this$sq$iv$iv$iv$iv$iv$iv
        //   427: iconst_0       
        //   428: istore          $i$f$getSq
        //   430: dload           $this$sq$iv$iv$iv$iv$iv$iv
        //   432: dload           $this$sq$iv$iv$iv$iv$iv$iv
        //   434: dmul           
        //   435: dadd           
        //   436: invokestatic    java/lang/Math.sqrt:(D)D
        //   439: nop            
        //   440: nop            
        //   441: aload           result2$iv$iv
        //   443: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.getBlockPos:()Lnet/minecraft/util/math/BlockPos;
        //   446: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   449: astore          11
        //   451: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   454: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   457: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   460: astore          12
        //   462: aload           12
        //   464: ldc_w           "mc.player.positionVector"
        //   467: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   470: aload           12
        //   472: astore          vec3d$iv$iv$iv
        //   474: iconst_0       
        //   475: istore          $i$f$distanceSqTo
        //   477: aload           $this$distanceSqTo$iv$iv$iv
        //   479: invokevirtual   net/minecraft/util/math/Vec3i.getX:()I
        //   482: i2d            
        //   483: ldc2_w          0.5
        //   486: dadd           
        //   487: dstore          14
        //   489: aload           $this$distanceSqTo$iv$iv$iv
        //   491: invokevirtual   net/minecraft/util/math/Vec3i.getY:()I
        //   494: i2d            
        //   495: ldc2_w          0.5
        //   498: dadd           
        //   499: dstore          16
        //   501: aload           $this$distanceSqTo$iv$iv$iv
        //   503: invokevirtual   net/minecraft/util/math/Vec3i.getZ:()I
        //   506: i2d            
        //   507: ldc2_w          0.5
        //   510: dadd           
        //   511: dstore          18
        //   513: aload           vec3d$iv$iv$iv
        //   515: getfield        net/minecraft/util/math/Vec3d.x:D
        //   518: dstore          20
        //   520: aload           vec3d$iv$iv$iv
        //   522: getfield        net/minecraft/util/math/Vec3d.y:D
        //   525: dstore          22
        //   527: aload           vec3d$iv$iv$iv
        //   529: getfield        net/minecraft/util/math/Vec3d.z:D
        //   532: dstore          z2$iv$iv$iv$iv
        //   534: iconst_0       
        //   535: istore          $i$f$distanceSq
        //   537: dload           x2$iv$iv$iv$iv
        //   539: dload           x1$iv$iv$iv$iv
        //   541: dsub           
        //   542: dstore          $this$sq$iv$iv$iv$iv$iv
        //   544: iconst_0       
        //   545: istore          $i$f$getSq
        //   547: dload           $this$sq$iv$iv$iv$iv$iv
        //   549: dload           $this$sq$iv$iv$iv$iv$iv
        //   551: dmul           
        //   552: dload           y2$iv$iv$iv$iv
        //   554: dload           y1$iv$iv$iv$iv
        //   556: dsub           
        //   557: dstore          $this$sq$iv$iv$iv$iv$iv
        //   559: iconst_0       
        //   560: istore          $i$f$getSq
        //   562: dload           $this$sq$iv$iv$iv$iv$iv
        //   564: dload           $this$sq$iv$iv$iv$iv$iv
        //   566: dmul           
        //   567: dadd           
        //   568: dload           z2$iv$iv$iv$iv
        //   570: dload           z1$iv$iv$iv$iv
        //   572: dsub           
        //   573: dstore          $this$sq$iv$iv$iv$iv$iv
        //   575: iconst_0       
        //   576: istore          $i$f$getSq
        //   578: dload           $this$sq$iv$iv$iv$iv$iv
        //   580: dload           $this$sq$iv$iv$iv$iv$iv
        //   582: dmul           
        //   583: dadd           
        //   584: nop            
        //   585: dcmpl          
        //   586: ifle            594
        //   589: aload           result2$iv$iv
        //   591: goto            596
        //   594: aload           result1$iv$iv
        //   596: goto            650
        //   599: new             Lkotlin/NoWhenBranchMatchedException;
        //   602: dup            
        //   603: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   606: athrow         
        //   607: aload_3         /* this_$iv */
        //   608: astore          this_$iv$iv
        //   610: iconst_0       
        //   611: istore          $i$f$calculate0
        //   613: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   616: dup            
        //   617: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   620: astore          handler$iv$iv
        //   622: aconst_null    
        //   623: new             Lme/alpha432/stay/features/modules/combat/StayAura$calculate0$1;
        //   626: dup            
        //   627: aload           handler$iv$iv
        //   629: aconst_null    
        //   630: invokespecial   me/alpha432/stay/features/modules/combat/StayAura$calculate0$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
        //   633: checkcast       Lkotlin/jvm/functions/Function2;
        //   636: iconst_1       
        //   637: aconst_null    
        //   638: invokestatic    kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        //   641: pop            
        //   642: aload           handler$iv$iv
        //   644: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   647: checkcast       Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;
        //   650: nop            
        //   651: astore_2       
        //   652: aload_2        
        //   653: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.component1:()Lnet/minecraft/util/math/BlockPos;
        //   656: astore_3        /* pos */
        //   657: aload_2        
        //   658: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.component2:()Lnet/minecraft/entity/EntityLivingBase;
        //   661: astore          target
        //   663: aload_2        
        //   664: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.component3:()D
        //   667: dstore          targetD
        //   669: aload_2        
        //   670: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$CrystalTarget.component4:()D
        //   673: dstore          selfD
        //   675: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getLock$p:()Ljava/lang/Object;
        //   678: astore          9
        //   680: aload           9
        //   682: monitorenter   
        //   683: nop            
        //   684: iconst_0       
        //   685: istore          $i$a$-synchronized-StayAura$doPlace$1
        //   687: aload_3         /* pos */
        //   688: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRenderPos$p:(Lnet/minecraft/util/math/BlockPos;)V
        //   691: aload           target
        //   693: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setTarget$p:(Lnet/minecraft/entity/EntityLivingBase;)V
        //   696: dload           targetD
        //   698: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   701: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setTargetD$p:(Ljava/lang/Double;)V
        //   704: dload           selfD
        //   706: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   709: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSelfD$p:(Ljava/lang/Double;)V
        //   712: nop            
        //   713: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   716: astore          10
        //   718: iconst_1       
        //   719: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //   722: aload           9
        //   724: monitorexit    
        //   725: iconst_1       
        //   726: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   729: goto            748
        //   732: astore          10
        //   734: iconst_1       
        //   735: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //   738: aload           9
        //   740: monitorexit    
        //   741: iconst_1       
        //   742: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   745: aload           10
        //   747: athrow         
        //   748: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   751: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   754: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   757: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //   760: istore          lastHotbar
        //   762: aload_0         /* this */
        //   763: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getAutoSwitch:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //   766: ifne            802
        //   769: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   772: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   775: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getHeldItemMainhand:()Lnet/minecraft/item/ItemStack;
        //   778: getfield        net/minecraft/item/ItemStack.item:Lnet/minecraft/item/Item;
        //   781: getstatic       net/minecraft/init/Items.END_CRYSTAL:Lnet/minecraft/item/Item;
        //   784: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   787: ifeq            796
        //   790: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   793: goto            934
        //   796: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   799: goto            934
        //   802: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   805: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   808: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getHeldItemMainhand:()Lnet/minecraft/item/ItemStack;
        //   811: getfield        net/minecraft/item/ItemStack.item:Lnet/minecraft/item/Item;
        //   814: getstatic       net/minecraft/init/Items.END_CRYSTAL:Lnet/minecraft/item/Item;
        //   817: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   820: ifne            931
        //   823: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   826: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   829: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getHeldItemOffhand:()Lnet/minecraft/item/ItemStack;
        //   832: getfield        net/minecraft/item/ItemStack.item:Lnet/minecraft/item/Item;
        //   835: getstatic       net/minecraft/init/Items.END_CRYSTAL:Lnet/minecraft/item/Item;
        //   838: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   841: ifne            931
        //   844: aload_0         /* this */
        //   845: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getSwitchingMode:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;
        //   848: getstatic       me/alpha432/stay/features/modules/combat/StayAura$SwitchMode.NORMAL:Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;
        //   851: if_acmpne       890
        //   854: aload_0         /* this */
        //   855: astore          this_$iv
        //   857: iconst_0       
        //   858: istore          $i$f$switch
        //   860: aload           this_$iv
        //   862: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getSwitchingMode:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;
        //   865: getstatic       me/alpha432/stay/features/modules/combat/StayAura$SwitchMode.NORMAL:Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;
        //   868: if_acmpne       880
        //   871: getstatic       net/minecraft/init/Items.END_CRYSTAL:Lnet/minecraft/item/Item;
        //   874: invokestatic    me/alpha432/stay/util/inventory/InventoryUtil.switchToSlot:(Lnet/minecraft/item/Item;)V
        //   877: goto            886
        //   880: ldc_w           "GhostHand is not supported!"
        //   883: invokestatic    me/alpha432/stay/features/command/Command.sendMessage:(Ljava/lang/String;)V
        //   886: nop            
        //   887: goto            931
        //   890: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   893: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   896: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   899: getfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //   902: istore          lastHotbar
        //   904: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   907: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   910: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //   913: getstatic       net/minecraft/init/Items.END_CRYSTAL:Lnet/minecraft/item/Item;
        //   916: invokestatic    me/alpha432/stay/util/inventory/InventoryUtil.findItemInHotbar:(Lnet/minecraft/item/Item;)I
        //   919: putfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //   922: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   925: getfield        net/minecraft/client/Minecraft.playerController:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   928: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.updateController:()V
        //   931: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   934: astore          hand
        //   936: aload_0         /* this */
        //   937: astore          this_$iv
        //   939: iconst_0       
        //   940: istore          $i$f$resetRotation
        //   942: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$isSpoofingAngles$p:()Z
        //   945: ifeq            982
        //   948: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   951: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   954: getfield        net/minecraft/client/entity/EntityPlayerSP.rotationYaw:F
        //   957: f2d            
        //   958: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setYaw$p:(D)V
        //   961: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   964: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   967: getfield        net/minecraft/client/entity/EntityPlayerSP.rotationPitch:F
        //   970: f2d            
        //   971: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPitch$p:(D)V
        //   974: iconst_0       
        //   975: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSpoofingAngles$p:(Z)V
        //   978: iconst_0       
        //   979: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRotating$p:(Z)V
        //   982: nop            
        //   983: aload_3         /* pos */
        //   984: ifnull          1359
        //   987: aload_3         /* pos */
        //   988: astore          placePos
        //   990: aload_0         /* this */
        //   991: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getRotate:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //   994: ifeq            1102
        //   997: aload_0         /* this */
        //   998: astore          12
        //  1000: aload_0         /* this */
        //  1001: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getFacing:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lnet/minecraft/util/EnumFacing;
        //  1004: astore          13
        //  1006: aload           13
        //  1008: ldc_w           "facing"
        //  1011: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1014: aload           13
        //  1016: astore          face$iv
        //  1018: iconst_0       
        //  1019: istore          $i$f$lookAtPos
        //  1021: aload           placePos
        //  1023: aload           face$iv
        //  1025: iconst_0       
        //  1026: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotationsBlock:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Z)[F
        //  1029: astore          v$iv
        //  1031: aload           placePos
        //  1033: dconst_0       
        //  1034: ldc2_w          0.5
        //  1037: dconst_0       
        //  1038: invokevirtual   net/minecraft/util/math/BlockPos.add:(DDD)Lnet/minecraft/util/math/BlockPos;
        //  1041: aload           face$iv
        //  1043: iconst_0       
        //  1044: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotationsBlock:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Z)[F
        //  1047: astore          v2$iv
        //  1049: aload           this_$iv
        //  1051: astore          17
        //  1053: aload           v$iv
        //  1055: iconst_0       
        //  1056: faload         
        //  1057: fstore          18
        //  1059: aload           v$iv
        //  1061: iconst_1       
        //  1062: faload         
        //  1063: fstore          19
        //  1065: aload           v2$iv
        //  1067: iconst_1       
        //  1068: faload         
        //  1069: fstore          renderPitch1$iv$iv
        //  1071: iconst_0       
        //  1072: istore          $i$f$setYawAndPitch
        //  1074: fload           yaw1$iv$iv
        //  1076: f2d            
        //  1077: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setYaw$p:(D)V
        //  1080: fload           pitch1$iv$iv
        //  1082: f2d            
        //  1083: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPitch$p:(D)V
        //  1086: fload           renderPitch1$iv$iv
        //  1088: f2d            
        //  1089: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRenderPitch$p:(D)V
        //  1092: iconst_1       
        //  1093: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSpoofingAngles$p:(Z)V
        //  1096: iconst_1       
        //  1097: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRotating$p:(Z)V
        //  1100: nop            
        //  1101: nop            
        //  1102: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getSmoothRender$p:()Lme/alpha432/stay/util/graphics/animations/BlockEasingRender;
        //  1105: aload           placePos
        //  1107: invokevirtual   me/alpha432/stay/util/graphics/animations/BlockEasingRender.updatePos:(Lnet/minecraft/util/math/BlockPos;)V
        //  1110: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getCurrentPlaceTime$p:()J
        //  1113: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setLastPlaceTime$p:(J)V
        //  1116: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1119: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setCurrentPlaceTime$p:(J)V
        //  1122: ldc_w           "Place"
        //  1125: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setCurrentAction$p:(Ljava/lang/String;)V
        //  1128: aload_0         /* this */
        //  1129: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getLegitPlace:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //  1132: ifeq            1193
        //  1135: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //  1138: getfield        net/minecraft/client/Minecraft.playerController:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1141: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //  1144: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1147: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //  1150: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1153: aload           placePos
        //  1155: aload_0         /* this */
        //  1156: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getFacing:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lnet/minecraft/util/EnumFacing;
        //  1159: new             Lnet/minecraft/util/math/Vec3d;
        //  1162: dup            
        //  1163: aload           placePos
        //  1165: invokevirtual   net/minecraft/util/math/BlockPos.getX:()I
        //  1168: i2d            
        //  1169: aload           placePos
        //  1171: invokevirtual   net/minecraft/util/math/BlockPos.getY:()I
        //  1174: i2d            
        //  1175: aload           placePos
        //  1177: invokevirtual   net/minecraft/util/math/BlockPos.getZ:()I
        //  1180: i2d            
        //  1181: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  1184: aload           hand
        //  1186: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.processRightClickBlock:(Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
        //  1189: pop            
        //  1190: goto            1226
        //  1193: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //  1196: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1199: getfield        net/minecraft/client/entity/EntityPlayerSP.connection:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1202: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //  1205: dup            
        //  1206: aload           placePos
        //  1208: aload_0         /* this */
        //  1209: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getFacing:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lnet/minecraft/util/EnumFacing;
        //  1212: aload           hand
        //  1214: fconst_0       
        //  1215: fconst_0       
        //  1216: fconst_0       
        //  1217: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //  1220: checkcast       Lnet/minecraft/network/Packet;
        //  1223: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.sendPacket:(Lnet/minecraft/network/Packet;)V
        //  1226: aload_0         /* this */
        //  1227: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPredictHit:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //  1230: ifeq            1347
        //  1233: aload_0         /* this */
        //  1234: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPredictHitSize:(Lme/alpha432/stay/features/modules/combat/StayAura;)I
        //  1237: ifle            1347
        //  1240: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getCrystalID$p:()Ljava/util/concurrent/atomic/AtomicInteger;
        //  1243: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //  1246: istore          syncedId
        //  1248: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //  1251: dup            
        //  1252: iconst_0       
        //  1253: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:(I)V
        //  1256: astore          count
        //  1258: aload_0         /* this */
        //  1259: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPredictHitSize:(Lme/alpha432/stay/features/modules/combat/StayAura;)I
        //  1262: istore          14
        //  1264: iconst_0       
        //  1265: istore          15
        //  1267: iload           15
        //  1269: iload           14
        //  1271: if_icmpge       1347
        //  1274: iload           15
        //  1276: istore          16
        //  1278: iinc            15, 1
        //  1281: iload           16
        //  1283: istore          it
        //  1285: iconst_0       
        //  1286: istore          $i$a$-repeat-StayAura$doPlace$2
        //  1288: iload           syncedId
        //  1290: iconst_m1      
        //  1291: if_icmpeq       1343
        //  1294: new             Lnet/minecraft/network/play/client/CPacketUseEntity;
        //  1297: dup            
        //  1298: invokespecial   net/minecraft/network/play/client/CPacketUseEntity.<init>:()V
        //  1301: astore          attackPacket
        //  1303: aload           attackPacket
        //  1305: iload           syncedId
        //  1307: aload           count
        //  1309: invokevirtual   java/util/concurrent/atomic/AtomicInteger.getAndIncrement:()I
        //  1312: iadd           
        //  1313: iconst_1       
        //  1314: iadd           
        //  1315: putfield        net/minecraft/network/play/client/CPacketUseEntity.entityId:I
        //  1318: aload           attackPacket
        //  1320: getstatic       net/minecraft/network/play/client/CPacketUseEntity$Action.ATTACK:Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
        //  1323: putfield        net/minecraft/network/play/client/CPacketUseEntity.action:Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
        //  1326: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //  1329: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1332: getfield        net/minecraft/client/entity/EntityPlayerSP.connection:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1335: aload           attackPacket
        //  1337: checkcast       Lnet/minecraft/network/Packet;
        //  1340: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.sendPacket:(Lnet/minecraft/network/Packet;)V
        //  1343: nop            
        //  1344: goto            1267
        //  1347: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPlacement$p:()I
        //  1350: istore          12
        //  1352: iload           12
        //  1354: iconst_1       
        //  1355: iadd           
        //  1356: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPlacement$p:(I)V
        //  1359: iload           lastHotbar
        //  1361: iconst_m1      
        //  1362: if_icmpeq       1398
        //  1365: aload_0         /* this */
        //  1366: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getSwitchingMode:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;
        //  1369: getstatic       me/alpha432/stay/features/modules/combat/StayAura$SwitchMode.GHOSTHAND:Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;
        //  1372: if_acmpne       1398
        //  1375: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //  1378: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1381: getfield        net/minecraft/client/entity/EntityPlayerSP.inventory:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1384: iload           lastHotbar
        //  1386: putfield        net/minecraft/entity/player/InventoryPlayer.currentItem:I
        //  1389: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //  1392: getfield        net/minecraft/client/Minecraft.playerController:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1395: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.updateController:()V
        //  1398: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getPlaceTimer$p:()Lme/alpha432/stay/util/counting/Timer;
        //  1401: invokevirtual   me/alpha432/stay/util/counting/Timer.reset:()Lme/alpha432/stay/util/counting/Timer;
        //  1404: pop            
        //  1405: return         
        //    StackMapTable: 00 25 FC 00 17 01 00 0E 0E FF 00 95 00 0C 07 00 02 01 00 07 00 02 01 07 00 02 01 07 02 5B 07 00 02 01 07 02 5B 07 05 E7 00 00 12 41 07 02 5B 02 12 41 07 02 5B 02 0F 0F 04 FF 01 30 00 1A 07 00 02 01 00 07 00 02 01 07 00 02 01 07 02 5B 07 00 02 01 07 02 5B 07 06 44 07 04 4C 01 03 03 03 03 03 03 01 01 03 01 03 01 00 00 41 07 02 5B FF 00 02 00 0C 07 00 02 01 00 07 00 02 01 07 00 02 01 07 02 5B 07 00 02 01 07 02 5B 07 05 E7 00 00 FF 00 07 00 05 07 00 02 01 00 07 00 02 01 00 00 FF 00 2A 00 08 07 00 02 01 00 07 00 02 01 07 00 02 01 07 03 C1 00 01 07 02 5B FF 00 51 00 08 07 00 02 01 07 02 5B 07 04 CE 07 03 E5 03 03 07 03 C1 00 01 07 04 C2 FC 00 0F 07 04 BD FF 00 2F 00 09 07 00 02 01 07 02 5B 07 04 CE 07 03 E5 03 03 01 07 04 BD 00 00 05 FD 00 4D 07 00 02 01 05 F9 00 03 28 42 07 07 23 FF 00 2F 00 0B 07 00 02 01 07 02 5B 07 04 CE 07 03 E5 03 03 01 07 07 23 07 00 02 01 00 00 FF 00 77 00 0A 07 00 02 01 07 02 5B 07 04 CE 07 03 E5 03 03 01 07 07 23 07 04 CE 00 00 FB 00 5A 20 FF 00 28 00 0E 07 00 02 01 07 02 5B 07 04 CE 07 03 E5 03 03 01 07 07 23 07 04 CE 01 07 05 3B 01 01 00 00 FE 00 4B 01 01 01 FF 00 03 00 0A 07 00 02 01 07 02 5B 07 04 CE 07 03 E5 03 03 01 07 07 23 07 04 CE 00 00 FF 00 0B 00 0B 07 00 02 01 07 02 5B 07 04 CE 07 03 E5 03 03 01 07 07 23 07 03 C1 01 00 00 26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  683    718    732    748    Any
        //  732    734    732    748    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void doBreak() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1        /* $i$f$doBreak */
        //     2: aload_0         /* this */
        //     3: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getExplode:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //     6: ifeq            23
        //     9: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getBreakTimer$p:()Lme/alpha432/stay/util/counting/Timer;
        //    12: aload_0         /* this */
        //    13: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getBreakDelay:(Lme/alpha432/stay/features/modules/combat/StayAura;)I
        //    16: i2l            
        //    17: invokevirtual   me/alpha432/stay/util/counting/Timer.passedMs:(J)Z
        //    20: ifne            24
        //    23: return         
        //    24: aload_0         /* this */
        //    25: astore_2        /* this_$iv */
        //    26: iconst_0       
        //    27: istore_3        /* $i$f$resetRotation */
        //    28: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$isSpoofingAngles$p:()Z
        //    31: ifeq            68
        //    34: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    37: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    40: getfield        net/minecraft/client/entity/EntityPlayerSP.rotationYaw:F
        //    43: f2d            
        //    44: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setYaw$p:(D)V
        //    47: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    50: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    53: getfield        net/minecraft/client/entity/EntityPlayerSP.rotationPitch:F
        //    56: f2d            
        //    57: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPitch$p:(D)V
        //    60: iconst_0       
        //    61: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSpoofingAngles$p:(Z)V
        //    64: iconst_0       
        //    65: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRotating$p:(Z)V
        //    68: nop            
        //    69: ldc_w           "Break"
        //    72: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setCurrentAction$p:(Ljava/lang/String;)V
        //    75: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getBreakTimer$p:()Lme/alpha432/stay/util/counting/Timer;
        //    78: invokevirtual   me/alpha432/stay/util/counting/Timer.reset:()Lme/alpha432/stay/util/counting/Timer;
        //    81: pop            
        //    82: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //    85: getfield        net/minecraft/client/Minecraft.world:Lnet/minecraft/client/multiplayer/WorldClient;
        //    88: getfield        net/minecraft/client/multiplayer/WorldClient.loadedEntityList:Ljava/util/List;
        //    91: astore_3       
        //    92: aload_3        
        //    93: ldc_w           "mc.world.loadedEntityList"
        //    96: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    99: aload_3        
        //   100: checkcast       Ljava/lang/Iterable;
        //   103: astore_3       
        //   104: nop            
        //   105: iconst_0       
        //   106: istore          $i$f$filterIsInstance
        //   108: aload_3         /* $this$filterIsInstance$iv */
        //   109: astore          5
        //   111: new             Ljava/util/ArrayList;
        //   114: dup            
        //   115: invokespecial   java/util/ArrayList.<init>:()V
        //   118: checkcast       Ljava/util/Collection;
        //   121: astore          destination$iv$iv
        //   123: iconst_0       
        //   124: istore          $i$f$filterIsInstanceTo
        //   126: aload           $this$filterIsInstanceTo$iv$iv
        //   128: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   133: astore          8
        //   135: aload           8
        //   137: invokeinterface java/util/Iterator.hasNext:()Z
        //   142: ifeq            175
        //   145: aload           8
        //   147: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   152: astore          element$iv$iv
        //   154: aload           element$iv$iv
        //   156: instanceof      Lnet/minecraft/entity/item/EntityEnderCrystal;
        //   159: ifeq            135
        //   162: aload           destination$iv$iv
        //   164: aload           element$iv$iv
        //   166: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   171: pop            
        //   172: goto            135
        //   175: aload           destination$iv$iv
        //   177: checkcast       Ljava/util/List;
        //   180: nop            
        //   181: checkcast       Ljava/lang/Iterable;
        //   184: astore_3       
        //   185: nop            
        //   186: iconst_0       
        //   187: istore          $i$f$filter
        //   189: aload_3         /* $this$filter$iv */
        //   190: astore          5
        //   192: new             Ljava/util/ArrayList;
        //   195: dup            
        //   196: invokespecial   java/util/ArrayList.<init>:()V
        //   199: checkcast       Ljava/util/Collection;
        //   202: astore          destination$iv$iv
        //   204: iconst_0       
        //   205: istore          $i$f$filterTo
        //   207: aload           $this$filterTo$iv$iv
        //   209: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   214: astore          8
        //   216: aload           8
        //   218: invokeinterface java/util/Iterator.hasNext:()Z
        //   223: ifeq            269
        //   226: aload           8
        //   228: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   233: astore          element$iv$iv
        //   235: aload           element$iv$iv
        //   237: checkcast       Lnet/minecraft/entity/item/EntityEnderCrystal;
        //   240: astore          it
        //   242: iconst_0       
        //   243: istore          $i$a$-filter-StayAura$doBreak$1
        //   245: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //   248: aload           it
        //   250: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getCanBreak:(Lme/alpha432/stay/features/modules/combat/StayAura;Lnet/minecraft/entity/item/EntityEnderCrystal;)Z
        //   253: ifeq            216
        //   256: aload           destination$iv$iv
        //   258: aload           element$iv$iv
        //   260: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   265: pop            
        //   266: goto            216
        //   269: aload           destination$iv$iv
        //   271: checkcast       Ljava/util/List;
        //   274: nop            
        //   275: checkcast       Ljava/lang/Iterable;
        //   278: astore_3       
        //   279: nop            
        //   280: iconst_0       
        //   281: istore          $i$f$minByOrNull
        //   283: aload_3         /* $this$minByOrNull$iv */
        //   284: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   289: astore          iterator$iv
        //   291: aload           iterator$iv
        //   293: invokeinterface java/util/Iterator.hasNext:()Z
        //   298: ifne            305
        //   301: aconst_null    
        //   302: goto            420
        //   305: aload           iterator$iv
        //   307: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   312: astore          minElem$iv
        //   314: aload           iterator$iv
        //   316: invokeinterface java/util/Iterator.hasNext:()Z
        //   321: ifne            329
        //   324: aload           minElem$iv
        //   326: goto            420
        //   329: aload           minElem$iv
        //   331: checkcast       Lnet/minecraft/entity/item/EntityEnderCrystal;
        //   334: astore          it
        //   336: iconst_0       
        //   337: istore          $i$a$-minByOrNull-StayAura$doBreak$2
        //   339: aload           it
        //   341: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   344: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   347: checkcast       Lnet/minecraft/entity/Entity;
        //   350: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.getDistance:(Lnet/minecraft/entity/Entity;)F
        //   353: fstore          minValue$iv
        //   355: aload           iterator$iv
        //   357: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   362: astore          e$iv
        //   364: aload           e$iv
        //   366: checkcast       Lnet/minecraft/entity/item/EntityEnderCrystal;
        //   369: astore          it
        //   371: iconst_0       
        //   372: istore          $i$a$-minByOrNull-StayAura$doBreak$2
        //   374: aload           it
        //   376: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   379: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   382: checkcast       Lnet/minecraft/entity/Entity;
        //   385: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.getDistance:(Lnet/minecraft/entity/Entity;)F
        //   388: fstore          v$iv
        //   390: fload           minValue$iv
        //   392: fload           v$iv
        //   394: invokestatic    java/lang/Float.compare:(FF)I
        //   397: ifle            408
        //   400: aload           e$iv
        //   402: astore          minElem$iv
        //   404: fload           v$iv
        //   406: fstore          minValue$iv
        //   408: aload           iterator$iv
        //   410: invokeinterface java/util/Iterator.hasNext:()Z
        //   415: ifne            355
        //   418: aload           minElem$iv
        //   420: checkcast       Lnet/minecraft/entity/item/EntityEnderCrystal;
        //   423: astore_2       
        //   424: aload_2        
        //   425: ifnonnull       431
        //   428: goto            728
        //   431: aload_2        
        //   432: astore          crystal
        //   434: iconst_0       
        //   435: istore          $i$a$-let-StayAura$doBreak$3
        //   437: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getCrystalLock$p:()Ljava/lang/Object;
        //   440: astore          6
        //   442: aload           6
        //   444: monitorenter   
        //   445: nop            
        //   446: iconst_0       
        //   447: istore          $i$a$-synchronized-StayAura$doBreak$3$1
        //   449: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //   452: pop            
        //   453: aload           crystal
        //   455: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setLastCrystal$p:(Lnet/minecraft/entity/item/EntityEnderCrystal;)V
        //   458: nop            
        //   459: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   462: astore          7
        //   464: iconst_1       
        //   465: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //   468: aload           6
        //   470: monitorexit    
        //   471: iconst_1       
        //   472: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   475: goto            494
        //   478: astore          7
        //   480: iconst_1       
        //   481: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //   484: aload           6
        //   486: monitorexit    
        //   487: iconst_1       
        //   488: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   491: aload           7
        //   493: athrow         
        //   494: aload_0         /* this */
        //   495: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getRotate:(Lme/alpha432/stay/features/modules/combat/StayAura;)Z
        //   498: ifeq            620
        //   501: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //   504: astore          this_$iv
        //   506: iconst_0       
        //   507: istore          $i$f$lookAtCrystal
        //   509: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   512: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   515: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   518: invokevirtual   net/minecraft/client/Minecraft.getRenderPartialTicks:()F
        //   521: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionEyes:(F)Lnet/minecraft/util/math/Vec3d;
        //   524: aload           crystal
        //   526: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   529: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotations:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
        //   532: astore          v$iv
        //   534: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   537: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   540: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   543: invokevirtual   net/minecraft/client/Minecraft.getRenderPartialTicks:()F
        //   546: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.getPositionEyes:(F)Lnet/minecraft/util/math/Vec3d;
        //   549: aload           crystal
        //   551: invokevirtual   net/minecraft/entity/item/EntityEnderCrystal.getPositionVector:()Lnet/minecraft/util/math/Vec3d;
        //   554: dconst_0       
        //   555: ldc2_w          -0.5
        //   558: dconst_0       
        //   559: invokevirtual   net/minecraft/util/math/Vec3d.add:(DDD)Lnet/minecraft/util/math/Vec3d;
        //   562: invokestatic    me/alpha432/stay/util/player/RotationUtil.getRotations:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
        //   565: astore          v2$iv
        //   567: aload           this_$iv
        //   569: astore          10
        //   571: aload           v$iv
        //   573: iconst_0       
        //   574: faload         
        //   575: fstore          11
        //   577: aload           v$iv
        //   579: iconst_1       
        //   580: faload         
        //   581: fstore          12
        //   583: aload           v2$iv
        //   585: iconst_1       
        //   586: faload         
        //   587: fstore          renderPitch1$iv$iv
        //   589: iconst_0       
        //   590: istore          $i$f$setYawAndPitch
        //   592: fload           yaw1$iv$iv
        //   594: f2d            
        //   595: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setYaw$p:(D)V
        //   598: fload           pitch1$iv$iv
        //   600: f2d            
        //   601: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPitch$p:(D)V
        //   604: fload           renderPitch1$iv$iv
        //   606: f2d            
        //   607: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRenderPitch$p:(D)V
        //   610: iconst_1       
        //   611: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setSpoofingAngles$p:(Z)V
        //   614: iconst_1       
        //   615: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setRotating$p:(Z)V
        //   618: nop            
        //   619: nop            
        //   620: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //   623: astore          this_$iv
        //   625: iconst_0       
        //   626: istore          $i$f$explode
        //   628: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   631: getfield        net/minecraft/client/Minecraft.playerController:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   634: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   637: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   640: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   643: aload           crystal
        //   645: checkcast       Lnet/minecraft/entity/Entity;
        //   648: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.attackEntity:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;)V
        //   651: aload           this_$iv
        //   653: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$getBreakHand:(Lme/alpha432/stay/features/modules/combat/StayAura;)Lme/alpha432/stay/features/modules/combat/StayAura$BreakHand;
        //   656: getstatic       me/alpha432/stay/features/modules/combat/StayAura$WhenMappings.$EnumSwitchMapping$2:[I
        //   659: swap           
        //   660: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura$BreakHand.ordinal:()I
        //   663: iaload         
        //   664: tableswitch {
        //                2: 692
        //                3: 707
        //                4: 722
        //          default: 725
        //        }
        //   692: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   695: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   698: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   701: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.swingArm:(Lnet/minecraft/util/EnumHand;)V
        //   704: goto            725
        //   707: getstatic       me/alpha432/stay/features/modules/Module.mc:Lnet/minecraft/client/Minecraft;
        //   710: getfield        net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   713: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   716: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.swingArm:(Lnet/minecraft/util/EnumHand;)V
        //   719: goto            725
        //   722: goto            726
        //   725: nop            
        //   726: nop            
        //   727: nop            
        //   728: iconst_0       
        //   729: invokestatic    me/alpha432/stay/features/modules/combat/StayAura.access$setPlacement$p:(I)V
        //   732: return         
        //    StackMapTable: 00 16 FC 00 17 01 00 FD 00 2B 07 00 02 01 FF 00 42 00 09 07 00 02 01 07 00 02 07 03 A5 01 07 03 A5 07 03 9A 01 07 03 AB 00 00 27 28 34 FF 00 23 00 09 07 00 02 01 07 00 02 07 03 A5 01 07 03 AB 07 03 9A 01 07 03 AB 00 00 FF 00 17 00 09 07 00 02 01 07 00 02 07 03 A5 01 07 03 AB 07 03 C1 01 07 03 AB 00 00 FF 00 19 00 08 07 00 02 01 07 00 02 07 03 A5 01 07 03 AB 07 03 C1 02 00 00 FE 00 34 07 03 C1 02 01 FF 00 0B 00 09 07 00 02 01 07 00 02 07 03 A5 01 07 03 AB 07 03 C1 00 07 03 C1 00 01 07 03 C1 FF 00 0A 00 09 07 00 02 01 07 04 3B 07 03 A5 01 07 03 AB 07 03 C1 00 07 03 C1 00 00 FF 00 2E 00 09 07 00 02 01 07 04 3B 07 03 A5 07 04 3B 01 07 03 C1 00 07 03 C1 00 01 07 04 C2 FF 00 0F 00 09 07 00 02 01 07 04 3B 07 03 A5 07 04 3B 01 07 03 C1 07 04 BD 07 03 C1 00 00 FF 00 7D 00 09 07 00 02 01 07 04 3B 07 03 A5 07 04 3B 01 07 03 C1 00 07 03 C1 00 00 FF 00 47 00 09 07 00 02 01 07 04 3B 07 03 A5 07 04 3B 01 07 00 02 01 07 03 C1 00 00 0E 0E 02 00 FF 00 01 00 09 07 00 02 01 07 04 3B 07 03 A5 00 00 07 03 C1 00 07 03 C1 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  445    464    478    494    Any
        //  478    480    478    494    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void explode(final EntityEnderCrystal entity) {
        final int $i$f$explode = 0;
        Module.mc.playerController.attackEntity((EntityPlayer)Module.mc.player, (Entity)entity);
        switch (WhenMappings.$EnumSwitchMapping$2[this.getBreakHand().ordinal()]) {
            case 1: {
                Module.mc.player.swingArm(EnumHand.MAIN_HAND);
                break;
            }
            case 2: {
                Module.mc.player.swingArm(EnumHand.OFF_HAND);
                break;
            }
            case 3: {}
        }
    }
    
    private final void switch() {
        final int $i$f$switch = 0;
        if (this.getSwitchingMode() == SwitchMode.NORMAL) {
            InventoryUtil.switchToSlot(Items.END_CRYSTAL);
        }
        else {
            Command.sendMessage("GhostHand is not supported!");
        }
    }
    
    @Nullable
    @Override
    public String getDisplayInfo() {
        String s = null;
        switch (WhenMappings.$EnumSwitchMapping$3[this.getHudMode().ordinal()]) {
            case 1: {
                final EntityLivingBase target = StayAura.target;
                if (target == null) {
                    s = "Finding...";
                    break;
                }
                if ((s = target.getName()) == null) {
                    s = "Finding...";
                    break;
                }
                break;
            }
            case 2: {
                s = ((StayAura.target == null) ? "NaN" : String.valueOf(StayAura.currentPlaceTime - StayAura.lastPlaceTime));
                break;
            }
            case 3: {
                s = ((StayAura.target == null) ? "Waiting" : StayAura.currentAction);
                break;
            }
            case 4: {
                s = ((StayAura.target == null) ? "NaN" : String.valueOf(StayAura.crystals));
                break;
            }
            case 5: {
                s = null;
                break;
            }
            case 6: {
                if (StayAura.target == null) {
                    s = "0.0/0.0";
                    break;
                }
                final StringBuilder sb = new StringBuilder();
                final StringCompanionObject instance = StringCompanionObject.INSTANCE;
                final String format = "%.1f";
                final Object[] original = { StayAura.targetD };
                final String format2 = String.format(format, Arrays.copyOf(original, original.length));
                Intrinsics.checkNotNullExpressionValue((Object)format2, "format(format, *args)");
                final StringBuilder append = sb.append(format2).append('/');
                final StringCompanionObject instance2 = StringCompanionObject.INSTANCE;
                final String format3 = "%.1f";
                final Object[] original2 = { StayAura.selfD };
                final String format4 = String.format(format3, Arrays.copyOf(original2, original2.length));
                Intrinsics.checkNotNullExpressionValue((Object)format4, "format(format, *args)");
                s = append.append(format4).toString();
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return s;
    }
    
    private static final boolean _get_handledEntities_$lambda-0(final EntityPlayer entityPlayer) {
        Intrinsics.checkNotNullParameter((Object)entityPlayer, "entityPlayer");
        final FriendManager friendManager = Stay.friendManager;
        Intrinsics.checkNotNull((Object)friendManager);
        return !friendManager.isFriend(entityPlayer.getName());
    }
    
    private static final boolean _get_handledEntities_$lambda-1(final StayAura this$0, final EntityPlayer entity) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return Module.mc.player.getDistance((Entity)entity) < this$0.getPlaceRange();
    }
    
    private static final int onPacketReceive$lambda-8(final PacketEvent.Receive $event, final int it) {
        Intrinsics.checkNotNullParameter((Object)$event, "$event");
        return Math.max(it, ((SPacketSpawnMob)$event.getPacket()).getEntityID());
    }
    
    private static final boolean onPacketReceive$lambda-9(final Entity it) {
        return it instanceof EntityEnderCrystal;
    }
    
    private static final boolean onPacketReceive$lambda-10(final Packet $packet, final Entity it) {
        Intrinsics.checkNotNullParameter((Object)$packet, "$packet");
        return it.getDistance(((SPacketSoundEffect)$packet).getX(), ((SPacketSoundEffect)$packet).getY(), ((SPacketSoundEffect)$packet).getZ()) <= 6.0;
    }
    
    private static final void onPacketReceive$lambda-11(final Entity obj) {
        obj.setDead();
    }
    
    private static final int onPacketReceive$lambda-12(final PacketEvent.Receive $event, final int it) {
        Intrinsics.checkNotNullParameter((Object)$event, "$event");
        return Math.max(it, ((SPacketSpawnObject)$event.getPacket()).getEntityID());
    }
    
    private static final int onPacketReceive$lambda-13(final PacketEvent.Receive $event, final int it) {
        Intrinsics.checkNotNullParameter((Object)$event, "$event");
        return Math.max(it, ((SPacketSpawnPlayer)$event.getPacket()).getEntityID());
    }
    
    public static final /* synthetic */ void access$setYaw$p(final double <set-?>) {
        StayAura.yaw = <set-?>;
    }
    
    public static final /* synthetic */ void access$setPitch$p(final double <set-?>) {
        StayAura.pitch = <set-?>;
    }
    
    public static final /* synthetic */ void access$setRenderPitch$p(final double <set-?>) {
        StayAura.renderPitch = <set-?>;
    }
    
    public static final /* synthetic */ void access$setSpoofingAngles$p(final boolean <set-?>) {
        StayAura.isSpoofingAngles = <set-?>;
    }
    
    public static final /* synthetic */ void access$setRotating$p(final boolean <set-?>) {
        StayAura.rotating = <set-?>;
    }
    
    public static final /* synthetic */ boolean access$isSpoofingAngles$p() {
        return StayAura.isSpoofingAngles;
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
        //    12: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //    14: ldc_w           "page"
        //    17: ldc_w           "getPage()Lme/alpha432/stay/features/modules/combat/StayAura$Pages;"
        //    20: iconst_0       
        //    21: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    24: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    27: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    30: checkcast       Lkotlin/reflect/KProperty;
        //    33: aastore        
        //    34: aload_0        
        //    35: iconst_1       
        //    36: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    39: dup            
        //    40: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //    42: ldc_w           "explode"
        //    45: ldc_w           "getExplode()Z"
        //    48: iconst_0       
        //    49: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    52: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    55: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    58: checkcast       Lkotlin/reflect/KProperty;
        //    61: aastore        
        //    62: aload_0        
        //    63: iconst_2       
        //    64: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    67: dup            
        //    68: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //    70: ldc_w           "place"
        //    73: ldc_w           "getPlace()Z"
        //    76: iconst_0       
        //    77: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //    80: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //    83: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //    86: checkcast       Lkotlin/reflect/KProperty;
        //    89: aastore        
        //    90: aload_0        
        //    91: iconst_3       
        //    92: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //    95: dup            
        //    96: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //    98: ldc_w           "multiPlace"
        //   101: ldc_w           "getMultiPlace()Z"
        //   104: iconst_0       
        //   105: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   108: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   111: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   114: checkcast       Lkotlin/reflect/KProperty;
        //   117: aastore        
        //   118: aload_0        
        //   119: iconst_4       
        //   120: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   123: dup            
        //   124: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   126: ldc_w           "packetExplode"
        //   129: ldc_w           "getPacketExplode()Z"
        //   132: iconst_0       
        //   133: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   136: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   139: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   142: checkcast       Lkotlin/reflect/KProperty;
        //   145: aastore        
        //   146: aload_0        
        //   147: iconst_5       
        //   148: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   151: dup            
        //   152: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   154: ldc_w           "autoSwitch"
        //   157: ldc_w           "getAutoSwitch()Z"
        //   160: iconst_0       
        //   161: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   164: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   167: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   170: checkcast       Lkotlin/reflect/KProperty;
        //   173: aastore        
        //   174: aload_0        
        //   175: bipush          6
        //   177: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   180: dup            
        //   181: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   183: ldc_w           "switchingMode"
        //   186: ldc_w           "getSwitchingMode()Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;"
        //   189: iconst_0       
        //   190: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   193: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   196: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   199: checkcast       Lkotlin/reflect/KProperty;
        //   202: aastore        
        //   203: aload_0        
        //   204: bipush          7
        //   206: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   209: dup            
        //   210: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   212: ldc_w           "findingMode"
        //   215: ldc_w           "getFindingMode()Lme/alpha432/stay/features/modules/combat/StayAura$TargetMode;"
        //   218: iconst_0       
        //   219: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   222: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   225: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   228: checkcast       Lkotlin/reflect/KProperty;
        //   231: aastore        
        //   232: aload_0        
        //   233: bipush          8
        //   235: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   238: dup            
        //   239: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   241: ldc_w           "enemyRange"
        //   244: ldc_w           "getEnemyRange()D"
        //   247: iconst_0       
        //   248: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   251: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   254: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   257: checkcast       Lkotlin/reflect/KProperty;
        //   260: aastore        
        //   261: aload_0        
        //   262: bipush          9
        //   264: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   267: dup            
        //   268: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   270: ldc_w           "placeRange"
        //   273: ldc_w           "getPlaceRange()D"
        //   276: iconst_0       
        //   277: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   280: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   283: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   286: checkcast       Lkotlin/reflect/KProperty;
        //   289: aastore        
        //   290: aload_0        
        //   291: bipush          10
        //   293: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   296: dup            
        //   297: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   299: ldc_w           "breakRange"
        //   302: ldc_w           "getBreakRange()D"
        //   305: iconst_0       
        //   306: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   309: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   312: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   315: checkcast       Lkotlin/reflect/KProperty;
        //   318: aastore        
        //   319: aload_0        
        //   320: bipush          11
        //   322: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   325: dup            
        //   326: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   328: ldc_w           "placeDelay"
        //   331: ldc_w           "getPlaceDelay()I"
        //   334: iconst_0       
        //   335: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   338: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   341: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   344: checkcast       Lkotlin/reflect/KProperty;
        //   347: aastore        
        //   348: aload_0        
        //   349: bipush          12
        //   351: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   354: dup            
        //   355: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   357: ldc_w           "breakDelay"
        //   360: ldc_w           "getBreakDelay()I"
        //   363: iconst_0       
        //   364: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   367: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   370: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   373: checkcast       Lkotlin/reflect/KProperty;
        //   376: aastore        
        //   377: aload_0        
        //   378: bipush          13
        //   380: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   383: dup            
        //   384: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   386: ldc_w           "players"
        //   389: ldc_w           "getPlayers()Z"
        //   392: iconst_0       
        //   393: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   396: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   399: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   402: checkcast       Lkotlin/reflect/KProperty;
        //   405: aastore        
        //   406: aload_0        
        //   407: bipush          14
        //   409: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   412: dup            
        //   413: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   415: ldc_w           "animals"
        //   418: ldc_w           "getAnimals()Z"
        //   421: iconst_0       
        //   422: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   425: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   428: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   431: checkcast       Lkotlin/reflect/KProperty;
        //   434: aastore        
        //   435: aload_0        
        //   436: bipush          15
        //   438: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   441: dup            
        //   442: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   444: ldc_w           "mobs"
        //   447: ldc_w           "getMobs()Z"
        //   450: iconst_0       
        //   451: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   454: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   457: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   460: checkcast       Lkotlin/reflect/KProperty;
        //   463: aastore        
        //   464: aload_0        
        //   465: bipush          16
        //   467: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   470: dup            
        //   471: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   473: ldc_w           "rotate"
        //   476: ldc_w           "getRotate()Z"
        //   479: iconst_0       
        //   480: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   483: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   486: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   489: checkcast       Lkotlin/reflect/KProperty;
        //   492: aastore        
        //   493: aload_0        
        //   494: bipush          17
        //   496: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   499: dup            
        //   500: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   502: ldc_w           "pauseWhileEating"
        //   505: ldc_w           "getPauseWhileEating()Z"
        //   508: iconst_0       
        //   509: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   512: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   515: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   518: checkcast       Lkotlin/reflect/KProperty;
        //   521: aastore        
        //   522: aload_0        
        //   523: bipush          18
        //   525: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   528: dup            
        //   529: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   531: ldc_w           "newPlace"
        //   534: ldc_w           "getNewPlace()Z"
        //   537: iconst_0       
        //   538: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   541: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   544: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   547: checkcast       Lkotlin/reflect/KProperty;
        //   550: aastore        
        //   551: aload_0        
        //   552: bipush          19
        //   554: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   557: dup            
        //   558: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   560: ldc_w           "legitPlace"
        //   563: ldc_w           "getLegitPlace()Z"
        //   566: iconst_0       
        //   567: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   570: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   573: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   576: checkcast       Lkotlin/reflect/KProperty;
        //   579: aastore        
        //   580: aload_0        
        //   581: bipush          20
        //   583: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   586: dup            
        //   587: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   589: ldc_w           "wallPlace"
        //   592: ldc_w           "getWallPlace()Z"
        //   595: iconst_0       
        //   596: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   599: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   602: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   605: checkcast       Lkotlin/reflect/KProperty;
        //   608: aastore        
        //   609: aload_0        
        //   610: bipush          21
        //   612: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   615: dup            
        //   616: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   618: ldc_w           "wallPlaceRange"
        //   621: ldc_w           "getWallPlaceRange()D"
        //   624: iconst_0       
        //   625: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   628: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   631: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   634: checkcast       Lkotlin/reflect/KProperty;
        //   637: aastore        
        //   638: aload_0        
        //   639: bipush          22
        //   641: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   644: dup            
        //   645: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   647: ldc_w           "placeCalcMode"
        //   650: ldc_w           "getPlaceCalcMode()Lme/alpha432/stay/features/modules/combat/StayAura$PlaceCalcMode;"
        //   653: iconst_0       
        //   654: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   657: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   660: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   663: checkcast       Lkotlin/reflect/KProperty;
        //   666: aastore        
        //   667: aload_0        
        //   668: bipush          23
        //   670: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   673: dup            
        //   674: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   676: ldc_w           "minPlaceDmg"
        //   679: ldc_w           "getMinPlaceDmg()D"
        //   682: iconst_0       
        //   683: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   686: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   689: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   692: checkcast       Lkotlin/reflect/KProperty;
        //   695: aastore        
        //   696: aload_0        
        //   697: bipush          24
        //   699: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   702: dup            
        //   703: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   705: ldc_w           "maxPlaceSelf"
        //   708: ldc_w           "getMaxPlaceSelf()D"
        //   711: iconst_0       
        //   712: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   715: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   718: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   721: checkcast       Lkotlin/reflect/KProperty;
        //   724: aastore        
        //   725: aload_0        
        //   726: bipush          25
        //   728: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   731: dup            
        //   732: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   734: ldc_w           "placeBalance"
        //   737: ldc_w           "getPlaceBalance()D"
        //   740: iconst_0       
        //   741: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   744: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   747: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   750: checkcast       Lkotlin/reflect/KProperty;
        //   753: aastore        
        //   754: aload_0        
        //   755: bipush          26
        //   757: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   760: dup            
        //   761: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   763: ldc_w           "motionPredict"
        //   766: ldc_w           "getMotionPredict()Z"
        //   769: iconst_0       
        //   770: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   773: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   776: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   779: checkcast       Lkotlin/reflect/KProperty;
        //   782: aastore        
        //   783: aload_0        
        //   784: bipush          27
        //   786: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   789: dup            
        //   790: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   792: ldc_w           "predictTicks"
        //   795: ldc_w           "getPredictTicks()I"
        //   798: iconst_0       
        //   799: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   802: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   805: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   808: checkcast       Lkotlin/reflect/KProperty;
        //   811: aastore        
        //   812: aload_0        
        //   813: bipush          28
        //   815: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   818: dup            
        //   819: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   821: ldc_w           "facePlace"
        //   824: ldc_w           "getFacePlace()Z"
        //   827: iconst_0       
        //   828: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   831: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   834: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   837: checkcast       Lkotlin/reflect/KProperty;
        //   840: aastore        
        //   841: aload_0        
        //   842: bipush          29
        //   844: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   847: dup            
        //   848: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   850: ldc_w           "facePlaceHealth"
        //   853: ldc_w           "getFacePlaceHealth()D"
        //   856: iconst_0       
        //   857: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   860: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   863: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   866: checkcast       Lkotlin/reflect/KProperty;
        //   869: aastore        
        //   870: aload_0        
        //   871: bipush          30
        //   873: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   876: dup            
        //   877: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   879: ldc_w           "stopFpWhileSwording"
        //   882: ldc_w           "getStopFpWhileSwording()Z"
        //   885: iconst_0       
        //   886: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   889: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   892: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   895: checkcast       Lkotlin/reflect/KProperty;
        //   898: aastore        
        //   899: aload_0        
        //   900: bipush          31
        //   902: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   905: dup            
        //   906: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   908: ldc_w           "breakWhen"
        //   911: ldc_w           "getBreakWhen()Lme/alpha432/stay/features/modules/combat/StayAura$BreakMode;"
        //   914: iconst_0       
        //   915: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   918: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   921: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   924: checkcast       Lkotlin/reflect/KProperty;
        //   927: aastore        
        //   928: aload_0        
        //   929: bipush          32
        //   931: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   934: dup            
        //   935: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   937: ldc_w           "predictHit"
        //   940: ldc_w           "getPredictHit()Z"
        //   943: iconst_0       
        //   944: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   947: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   950: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   953: checkcast       Lkotlin/reflect/KProperty;
        //   956: aastore        
        //   957: aload_0        
        //   958: bipush          33
        //   960: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   963: dup            
        //   964: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   966: ldc_w           "predictHitSize"
        //   969: ldc_w           "getPredictHitSize()I"
        //   972: iconst_0       
        //   973: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //   976: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //   979: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //   982: checkcast       Lkotlin/reflect/KProperty;
        //   985: aastore        
        //   986: aload_0        
        //   987: bipush          34
        //   989: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //   992: dup            
        //   993: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //   995: ldc_w           "breakHand"
        //   998: ldc_w           "getBreakHand()Lme/alpha432/stay/features/modules/combat/StayAura$BreakHand;"
        //  1001: iconst_0       
        //  1002: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1005: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1008: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1011: checkcast       Lkotlin/reflect/KProperty;
        //  1014: aastore        
        //  1015: aload_0        
        //  1016: bipush          35
        //  1018: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1021: dup            
        //  1022: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1024: ldc_w           "wallBreak"
        //  1027: ldc_w           "getWallBreak()Z"
        //  1030: iconst_0       
        //  1031: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1034: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1037: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1040: checkcast       Lkotlin/reflect/KProperty;
        //  1043: aastore        
        //  1044: aload_0        
        //  1045: bipush          36
        //  1047: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1050: dup            
        //  1051: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1053: ldc_w           "wallBreakRange"
        //  1056: ldc_w           "getWallBreakRange()D"
        //  1059: iconst_0       
        //  1060: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1063: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1066: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1069: checkcast       Lkotlin/reflect/KProperty;
        //  1072: aastore        
        //  1073: aload_0        
        //  1074: bipush          37
        //  1076: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1079: dup            
        //  1080: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1082: ldc_w           "breakCalcMode"
        //  1085: ldc_w           "getBreakCalcMode()Lme/alpha432/stay/features/modules/combat/StayAura$BreakCalcMode;"
        //  1088: iconst_0       
        //  1089: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1092: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1095: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1098: checkcast       Lkotlin/reflect/KProperty;
        //  1101: aastore        
        //  1102: aload_0        
        //  1103: bipush          38
        //  1105: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1108: dup            
        //  1109: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1111: ldc_w           "minBreakDmg"
        //  1114: ldc_w           "getMinBreakDmg()D"
        //  1117: iconst_0       
        //  1118: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1121: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1124: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1127: checkcast       Lkotlin/reflect/KProperty;
        //  1130: aastore        
        //  1131: aload_0        
        //  1132: bipush          39
        //  1134: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1137: dup            
        //  1138: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1140: ldc_w           "maxBreakSelf"
        //  1143: ldc_w           "getMaxBreakSelf()D"
        //  1146: iconst_0       
        //  1147: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1150: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1153: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1156: checkcast       Lkotlin/reflect/KProperty;
        //  1159: aastore        
        //  1160: aload_0        
        //  1161: bipush          40
        //  1163: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1166: dup            
        //  1167: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1169: ldc_w           "breakBalance"
        //  1172: ldc_w           "getBreakBalance()D"
        //  1175: iconst_0       
        //  1176: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1179: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1182: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1185: checkcast       Lkotlin/reflect/KProperty;
        //  1188: aastore        
        //  1189: aload_0        
        //  1190: bipush          41
        //  1192: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1195: dup            
        //  1196: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1198: ldc_w           "bypass"
        //  1201: ldc_w           "getBypass()Z"
        //  1204: iconst_0       
        //  1205: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1208: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1211: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1214: checkcast       Lkotlin/reflect/KProperty;
        //  1217: aastore        
        //  1218: aload_0        
        //  1219: bipush          42
        //  1221: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1224: dup            
        //  1225: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1227: ldc_w           "bypassMode"
        //  1230: ldc_w           "getBypassMode()Lme/alpha432/stay/features/modules/combat/StayAura$BypassMode;"
        //  1233: iconst_0       
        //  1234: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1237: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1240: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1243: checkcast       Lkotlin/reflect/KProperty;
        //  1246: aastore        
        //  1247: aload_0        
        //  1248: bipush          43
        //  1250: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1253: dup            
        //  1254: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1256: ldc_w           "actionPriority"
        //  1259: ldc_w           "getActionPriority()Lme/alpha432/stay/features/modules/combat/StayAura$ActionPriority;"
        //  1262: iconst_0       
        //  1263: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1266: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1269: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1272: checkcast       Lkotlin/reflect/KProperty;
        //  1275: aastore        
        //  1276: aload_0        
        //  1277: bipush          44
        //  1279: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1282: dup            
        //  1283: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1285: ldc_w           "popTotemTry"
        //  1288: ldc_w           "getPopTotemTry()Z"
        //  1291: iconst_0       
        //  1292: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1295: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1298: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1301: checkcast       Lkotlin/reflect/KProperty;
        //  1304: aastore        
        //  1305: aload_0        
        //  1306: bipush          45
        //  1308: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1311: dup            
        //  1312: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1314: ldc_w           "popTotemTryingProtection"
        //  1317: ldc_w           "getPopTotemTryingProtection()Z"
        //  1320: iconst_0       
        //  1321: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1324: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1327: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1330: checkcast       Lkotlin/reflect/KProperty;
        //  1333: aastore        
        //  1334: aload_0        
        //  1335: bipush          46
        //  1337: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1340: dup            
        //  1341: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1343: ldc_w           "protectionMode"
        //  1346: ldc_w           "getProtectionMode()Lme/alpha432/stay/features/modules/combat/StayAura$PopTotemTryingProtection;"
        //  1349: iconst_0       
        //  1350: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1353: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1356: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1359: checkcast       Lkotlin/reflect/KProperty;
        //  1362: aastore        
        //  1363: aload_0        
        //  1364: bipush          47
        //  1366: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1369: dup            
        //  1370: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1372: ldc_w           "trialFactor"
        //  1375: ldc_w           "getTrialFactor()I"
        //  1378: iconst_0       
        //  1379: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1382: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1385: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1388: checkcast       Lkotlin/reflect/KProperty;
        //  1391: aastore        
        //  1392: aload_0        
        //  1393: bipush          48
        //  1395: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1398: dup            
        //  1399: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1401: ldc_w           "trialMaxSelf"
        //  1404: ldc_w           "getTrialMaxSelf()I"
        //  1407: iconst_0       
        //  1408: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1411: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1414: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1417: checkcast       Lkotlin/reflect/KProperty;
        //  1420: aastore        
        //  1421: aload_0        
        //  1422: bipush          49
        //  1424: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1427: dup            
        //  1428: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1430: ldc_w           "trialSelfHealth"
        //  1433: ldc_w           "getTrialSelfHealth()I"
        //  1436: iconst_0       
        //  1437: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1440: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1443: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1446: checkcast       Lkotlin/reflect/KProperty;
        //  1449: aastore        
        //  1450: aload_0        
        //  1451: bipush          50
        //  1453: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1456: dup            
        //  1457: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1459: ldc_w           "chase"
        //  1462: ldc_w           "getChase()Z"
        //  1465: iconst_0       
        //  1466: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1469: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1472: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1475: checkcast       Lkotlin/reflect/KProperty;
        //  1478: aastore        
        //  1479: aload_0        
        //  1480: bipush          51
        //  1482: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1485: dup            
        //  1486: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1488: ldc_w           "chasingFactor"
        //  1491: ldc_w           "getChasingFactor()I"
        //  1494: iconst_0       
        //  1495: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1498: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1501: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1504: checkcast       Lkotlin/reflect/KProperty;
        //  1507: aastore        
        //  1508: aload_0        
        //  1509: bipush          52
        //  1511: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1514: dup            
        //  1515: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1517: ldc_w           "chasingMaxSelf"
        //  1520: ldc_w           "getChasingMaxSelf()D"
        //  1523: iconst_0       
        //  1524: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1527: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1530: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1533: checkcast       Lkotlin/reflect/KProperty;
        //  1536: aastore        
        //  1537: aload_0        
        //  1538: bipush          53
        //  1540: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1543: dup            
        //  1544: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1546: ldc_w           "noSuicide"
        //  1549: ldc_w           "getNoSuicide()Z"
        //  1552: iconst_0       
        //  1553: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1556: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1559: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1562: checkcast       Lkotlin/reflect/KProperty;
        //  1565: aastore        
        //  1566: aload_0        
        //  1567: bipush          54
        //  1569: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1572: dup            
        //  1573: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1575: ldc_w           "damagePriority"
        //  1578: ldc_w           "getDamagePriority()I"
        //  1581: iconst_0       
        //  1582: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1585: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1588: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1591: checkcast       Lkotlin/reflect/KProperty;
        //  1594: aastore        
        //  1595: aload_0        
        //  1596: bipush          55
        //  1598: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1601: dup            
        //  1602: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1604: ldc_w           "balanceProtection"
        //  1607: ldc_w           "getBalanceProtection()Z"
        //  1610: iconst_0       
        //  1611: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1614: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1617: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1620: checkcast       Lkotlin/reflect/KProperty;
        //  1623: aastore        
        //  1624: aload_0        
        //  1625: bipush          56
        //  1627: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1630: dup            
        //  1631: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1633: ldc_w           "globalBalance"
        //  1636: ldc_w           "getGlobalBalance()D"
        //  1639: iconst_0       
        //  1640: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1643: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1646: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1649: checkcast       Lkotlin/reflect/KProperty;
        //  1652: aastore        
        //  1653: aload_0        
        //  1654: bipush          57
        //  1656: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1659: dup            
        //  1660: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1662: ldc_w           "balanceProtectionFactor"
        //  1665: ldc_w           "getBalanceProtectionFactor()I"
        //  1668: iconst_0       
        //  1669: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1672: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1675: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1678: checkcast       Lkotlin/reflect/KProperty;
        //  1681: aastore        
        //  1682: aload_0        
        //  1683: bipush          58
        //  1685: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1688: dup            
        //  1689: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1691: ldc_w           "facing"
        //  1694: ldc_w           "getFacing()Lnet/minecraft/util/EnumFacing;"
        //  1697: iconst_0       
        //  1698: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1701: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1704: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1707: checkcast       Lkotlin/reflect/KProperty;
        //  1710: aastore        
        //  1711: aload_0        
        //  1712: bipush          59
        //  1714: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1717: dup            
        //  1718: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1720: ldc_w           "threads"
        //  1723: ldc_w           "getThreads()I"
        //  1726: iconst_0       
        //  1727: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1730: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1733: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1736: checkcast       Lkotlin/reflect/KProperty;
        //  1739: aastore        
        //  1740: aload_0        
        //  1741: bipush          60
        //  1743: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1746: dup            
        //  1747: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1749: ldc_w           "heavyCalc"
        //  1752: ldc_w           "getHeavyCalc()Z"
        //  1755: iconst_0       
        //  1756: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1759: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1762: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1765: checkcast       Lkotlin/reflect/KProperty;
        //  1768: aastore        
        //  1769: aload_0        
        //  1770: bipush          61
        //  1772: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1775: dup            
        //  1776: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1778: ldc_w           "overrideMode"
        //  1781: ldc_w           "getOverrideMode()Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;"
        //  1784: iconst_0       
        //  1785: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1788: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1791: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1794: checkcast       Lkotlin/reflect/KProperty;
        //  1797: aastore        
        //  1798: aload_0        
        //  1799: bipush          62
        //  1801: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1804: dup            
        //  1805: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1807: ldc_w           "nullCheckedReturn"
        //  1810: ldc_w           "getNullCheckedReturn()Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;"
        //  1813: iconst_0       
        //  1814: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1817: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1820: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1823: checkcast       Lkotlin/reflect/KProperty;
        //  1826: aastore        
        //  1827: aload_0        
        //  1828: bipush          63
        //  1830: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1833: dup            
        //  1834: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1836: ldc_w           "render"
        //  1839: ldc_w           "getRender()Z"
        //  1842: iconst_0       
        //  1843: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1846: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1849: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1852: checkcast       Lkotlin/reflect/KProperty;
        //  1855: aastore        
        //  1856: aload_0        
        //  1857: bipush          64
        //  1859: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1862: dup            
        //  1863: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1865: ldc_w           "renderMode"
        //  1868: ldc_w           "getRenderMode()Lme/alpha432/stay/features/modules/combat/StayAura$RenderMode;"
        //  1871: iconst_0       
        //  1872: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1875: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1878: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1881: checkcast       Lkotlin/reflect/KProperty;
        //  1884: aastore        
        //  1885: aload_0        
        //  1886: bipush          65
        //  1888: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1891: dup            
        //  1892: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1894: ldc_w           "colorSync"
        //  1897: ldc_w           "getColorSync()Z"
        //  1900: iconst_0       
        //  1901: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1904: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1907: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1910: checkcast       Lkotlin/reflect/KProperty;
        //  1913: aastore        
        //  1914: aload_0        
        //  1915: bipush          66
        //  1917: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1920: dup            
        //  1921: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1923: ldc_w           "renderR"
        //  1926: ldc_w           "getRenderR()I"
        //  1929: iconst_0       
        //  1930: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1933: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1936: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1939: checkcast       Lkotlin/reflect/KProperty;
        //  1942: aastore        
        //  1943: aload_0        
        //  1944: bipush          67
        //  1946: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1949: dup            
        //  1950: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1952: ldc_w           "renderG"
        //  1955: ldc_w           "getRenderG()I"
        //  1958: iconst_0       
        //  1959: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1962: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1965: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1968: checkcast       Lkotlin/reflect/KProperty;
        //  1971: aastore        
        //  1972: aload_0        
        //  1973: bipush          68
        //  1975: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  1978: dup            
        //  1979: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  1981: ldc_w           "renderB"
        //  1984: ldc_w           "getRenderB()I"
        //  1987: iconst_0       
        //  1988: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  1991: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  1994: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  1997: checkcast       Lkotlin/reflect/KProperty;
        //  2000: aastore        
        //  2001: aload_0        
        //  2002: bipush          69
        //  2004: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2007: dup            
        //  2008: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2010: ldc_w           "renderA"
        //  2013: ldc_w           "getRenderA()I"
        //  2016: iconst_0       
        //  2017: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2020: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2023: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2026: checkcast       Lkotlin/reflect/KProperty;
        //  2029: aastore        
        //  2030: aload_0        
        //  2031: bipush          70
        //  2033: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2036: dup            
        //  2037: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2039: ldc_w           "outline"
        //  2042: ldc_w           "getOutline()Z"
        //  2045: iconst_0       
        //  2046: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2049: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2052: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2055: checkcast       Lkotlin/reflect/KProperty;
        //  2058: aastore        
        //  2059: aload_0        
        //  2060: bipush          71
        //  2062: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2065: dup            
        //  2066: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2068: ldc_w           "width"
        //  2071: ldc_w           "getWidth()D"
        //  2074: iconst_0       
        //  2075: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2078: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2081: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2084: checkcast       Lkotlin/reflect/KProperty;
        //  2087: aastore        
        //  2088: aload_0        
        //  2089: bipush          72
        //  2091: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2094: dup            
        //  2095: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2097: ldc_w           "outlineA"
        //  2100: ldc_w           "getOutlineA()I"
        //  2103: iconst_0       
        //  2104: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2107: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2110: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2113: checkcast       Lkotlin/reflect/KProperty;
        //  2116: aastore        
        //  2117: aload_0        
        //  2118: bipush          73
        //  2120: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2123: dup            
        //  2124: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2126: ldc_w           "renderTR"
        //  2129: ldc_w           "getRenderTR()I"
        //  2132: iconst_0       
        //  2133: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2136: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2139: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2142: checkcast       Lkotlin/reflect/KProperty;
        //  2145: aastore        
        //  2146: aload_0        
        //  2147: bipush          74
        //  2149: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2152: dup            
        //  2153: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2155: ldc_w           "renderTG"
        //  2158: ldc_w           "getRenderTG()I"
        //  2161: iconst_0       
        //  2162: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2165: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2168: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2171: checkcast       Lkotlin/reflect/KProperty;
        //  2174: aastore        
        //  2175: aload_0        
        //  2176: bipush          75
        //  2178: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2181: dup            
        //  2182: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2184: ldc_w           "renderTB"
        //  2187: ldc_w           "getRenderTB()I"
        //  2190: iconst_0       
        //  2191: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2194: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2197: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2200: checkcast       Lkotlin/reflect/KProperty;
        //  2203: aastore        
        //  2204: aload_0        
        //  2205: bipush          76
        //  2207: new             Lkotlin/jvm/internal/PropertyReference1Impl;
        //  2210: dup            
        //  2211: ldc             Lme/alpha432/stay/features/modules/combat/StayAura;.class
        //  2213: ldc_w           "hudMode"
        //  2216: ldc_w           "getHudMode()Lme/alpha432/stay/features/modules/combat/StayAura$HudInfoMode;"
        //  2219: iconst_0       
        //  2220: invokespecial   kotlin/jvm/internal/PropertyReference1Impl.<init>:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        //  2223: checkcast       Lkotlin/jvm/internal/PropertyReference1;
        //  2226: invokestatic    kotlin/jvm/internal/Reflection.property1:(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;
        //  2229: checkcast       Lkotlin/reflect/KProperty;
        //  2232: aastore        
        //  2233: aload_0        
        //  2234: putstatic       me/alpha432/stay/features/modules/combat/StayAura.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  2237: new             Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2240: dup            
        //  2241: invokespecial   me/alpha432/stay/features/modules/combat/StayAura.<init>:()V
        //  2244: putstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2247: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2250: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2253: ldc_w           "Page"
        //  2256: getstatic       me/alpha432/stay/features/modules/combat/StayAura$Pages.GENERAL:Lme/alpha432/stay/features/modules/combat/StayAura$Pages;
        //  2259: checkcast       Ljava/lang/Enum;
        //  2262: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  2265: putstatic       me/alpha432/stay/features/modules/combat/StayAura.page$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2268: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2271: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2274: ldc_w           "Explode"
        //  2277: iconst_1       
        //  2278: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  2281: astore_0       
        //  2282: getstatic       me/alpha432/stay/features/modules/combat/StayAura$explode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$explode$2;
        //  2285: checkcast       Lkotlin/jvm/functions/Function1;
        //  2288: astore_1        /* block$iv */
        //  2289: iconst_0       
        //  2290: istore_2        /* $i$f$visible */
        //  2291: aload_0         /* $this$visible$iv */
        //  2292: astore_3       
        //  2293: aload_3        
        //  2294: astore          it$iv
        //  2296: iconst_0       
        //  2297: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2299: aload           it$iv
        //  2301: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2304: dup            
        //  2305: aload_1         /* block$iv */
        //  2306: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2309: checkcast       Ljava/util/function/Predicate;
        //  2312: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2315: aload_3        
        //  2316: nop            
        //  2317: putstatic       me/alpha432/stay/features/modules/combat/StayAura.explode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2320: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2323: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2326: ldc_w           "Place"
        //  2329: iconst_1       
        //  2330: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  2333: astore_0       
        //  2334: getstatic       me/alpha432/stay/features/modules/combat/StayAura$place$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$place$2;
        //  2337: checkcast       Lkotlin/jvm/functions/Function1;
        //  2340: astore_1        /* block$iv */
        //  2341: iconst_0       
        //  2342: istore_2        /* $i$f$visible */
        //  2343: aload_0         /* $this$visible$iv */
        //  2344: astore_3       
        //  2345: aload_3        
        //  2346: astore          it$iv
        //  2348: iconst_0       
        //  2349: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2351: aload           it$iv
        //  2353: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2356: dup            
        //  2357: aload_1         /* block$iv */
        //  2358: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2361: checkcast       Ljava/util/function/Predicate;
        //  2364: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2367: aload_3        
        //  2368: nop            
        //  2369: putstatic       me/alpha432/stay/features/modules/combat/StayAura.place$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2372: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2375: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2378: ldc_w           "MultiPlace"
        //  2381: iconst_0       
        //  2382: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  2385: astore_0       
        //  2386: getstatic       me/alpha432/stay/features/modules/combat/StayAura$multiPlace$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$multiPlace$2;
        //  2389: checkcast       Lkotlin/jvm/functions/Function1;
        //  2392: astore_1        /* block$iv */
        //  2393: iconst_0       
        //  2394: istore_2        /* $i$f$visible */
        //  2395: aload_0         /* $this$visible$iv */
        //  2396: astore_3       
        //  2397: aload_3        
        //  2398: astore          it$iv
        //  2400: iconst_0       
        //  2401: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2403: aload           it$iv
        //  2405: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2408: dup            
        //  2409: aload_1         /* block$iv */
        //  2410: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2413: checkcast       Ljava/util/function/Predicate;
        //  2416: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2419: aload_3        
        //  2420: nop            
        //  2421: putstatic       me/alpha432/stay/features/modules/combat/StayAura.multiPlace$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2424: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2427: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2430: ldc_w           "Packet Break"
        //  2433: iconst_1       
        //  2434: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  2437: astore_0       
        //  2438: getstatic       me/alpha432/stay/features/modules/combat/StayAura$packetExplode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$packetExplode$2;
        //  2441: checkcast       Lkotlin/jvm/functions/Function1;
        //  2444: astore_1        /* block$iv */
        //  2445: iconst_0       
        //  2446: istore_2        /* $i$f$visible */
        //  2447: aload_0         /* $this$visible$iv */
        //  2448: astore_3       
        //  2449: aload_3        
        //  2450: astore          it$iv
        //  2452: iconst_0       
        //  2453: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2455: aload           it$iv
        //  2457: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2460: dup            
        //  2461: aload_1         /* block$iv */
        //  2462: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2465: checkcast       Ljava/util/function/Predicate;
        //  2468: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2471: aload_3        
        //  2472: nop            
        //  2473: putstatic       me/alpha432/stay/features/modules/combat/StayAura.packetExplode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2476: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2479: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2482: ldc_w           "Auto Switch"
        //  2485: iconst_0       
        //  2486: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  2489: astore_0       
        //  2490: getstatic       me/alpha432/stay/features/modules/combat/StayAura$autoSwitch$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$autoSwitch$2;
        //  2493: checkcast       Lkotlin/jvm/functions/Function1;
        //  2496: astore_1        /* block$iv */
        //  2497: iconst_0       
        //  2498: istore_2        /* $i$f$visible */
        //  2499: aload_0         /* $this$visible$iv */
        //  2500: astore_3       
        //  2501: aload_3        
        //  2502: astore          it$iv
        //  2504: iconst_0       
        //  2505: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2507: aload           it$iv
        //  2509: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2512: dup            
        //  2513: aload_1         /* block$iv */
        //  2514: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2517: checkcast       Ljava/util/function/Predicate;
        //  2520: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2523: aload_3        
        //  2524: nop            
        //  2525: putstatic       me/alpha432/stay/features/modules/combat/StayAura.autoSwitch$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2528: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2531: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2534: ldc_w           "Switch Mode"
        //  2537: getstatic       me/alpha432/stay/features/modules/combat/StayAura$SwitchMode.NORMAL:Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;
        //  2540: checkcast       Ljava/lang/Enum;
        //  2543: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  2546: astore_0       
        //  2547: getstatic       me/alpha432/stay/features/modules/combat/StayAura$switchingMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$switchingMode$2;
        //  2550: checkcast       Lkotlin/jvm/functions/Function1;
        //  2553: astore_1        /* block$iv */
        //  2554: iconst_0       
        //  2555: istore_2        /* $i$f$visible */
        //  2556: aload_0         /* $this$visible$iv */
        //  2557: astore_3       
        //  2558: aload_3        
        //  2559: astore          it$iv
        //  2561: iconst_0       
        //  2562: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2564: aload           it$iv
        //  2566: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2569: dup            
        //  2570: aload_1         /* block$iv */
        //  2571: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2574: checkcast       Ljava/util/function/Predicate;
        //  2577: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2580: aload_3        
        //  2581: nop            
        //  2582: putstatic       me/alpha432/stay/features/modules/combat/StayAura.switchingMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2585: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2588: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2591: ldc_w           "Sort By"
        //  2594: getstatic       me/alpha432/stay/features/modules/combat/StayAura$TargetMode.DISTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$TargetMode;
        //  2597: checkcast       Ljava/lang/Enum;
        //  2600: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  2603: astore_0       
        //  2604: getstatic       me/alpha432/stay/features/modules/combat/StayAura$findingMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$findingMode$2;
        //  2607: checkcast       Lkotlin/jvm/functions/Function1;
        //  2610: astore_1        /* block$iv */
        //  2611: iconst_0       
        //  2612: istore_2        /* $i$f$visible */
        //  2613: aload_0         /* $this$visible$iv */
        //  2614: astore_3       
        //  2615: aload_3        
        //  2616: astore          it$iv
        //  2618: iconst_0       
        //  2619: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2621: aload           it$iv
        //  2623: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2626: dup            
        //  2627: aload_1         /* block$iv */
        //  2628: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2631: checkcast       Ljava/util/function/Predicate;
        //  2634: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2637: aload_3        
        //  2638: nop            
        //  2639: putstatic       me/alpha432/stay/features/modules/combat/StayAura.findingMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2642: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2645: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2648: ldc_w           "Enemy Range"
        //  2651: ldc2_w          10.0
        //  2654: dconst_0       
        //  2655: ldc2_w          20.0
        //  2658: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  2661: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  2664: astore_0       
        //  2665: getstatic       me/alpha432/stay/features/modules/combat/StayAura$enemyRange$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$enemyRange$2;
        //  2668: checkcast       Lkotlin/jvm/functions/Function1;
        //  2671: astore_1        /* block$iv */
        //  2672: iconst_0       
        //  2673: istore_2        /* $i$f$visible */
        //  2674: aload_0         /* $this$visible$iv */
        //  2675: astore_3       
        //  2676: aload_3        
        //  2677: astore          it$iv
        //  2679: iconst_0       
        //  2680: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2682: aload           it$iv
        //  2684: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2687: dup            
        //  2688: aload_1         /* block$iv */
        //  2689: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2692: checkcast       Ljava/util/function/Predicate;
        //  2695: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2698: aload_3        
        //  2699: nop            
        //  2700: putstatic       me/alpha432/stay/features/modules/combat/StayAura.enemyRange$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2703: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2706: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2709: ldc_w           "Place Range"
        //  2712: ldc2_w          6.0
        //  2715: dconst_0       
        //  2716: ldc2_w          8.0
        //  2719: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  2722: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  2725: astore_0       
        //  2726: getstatic       me/alpha432/stay/features/modules/combat/StayAura$placeRange$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$placeRange$2;
        //  2729: checkcast       Lkotlin/jvm/functions/Function1;
        //  2732: astore_1        /* block$iv */
        //  2733: iconst_0       
        //  2734: istore_2        /* $i$f$visible */
        //  2735: aload_0         /* $this$visible$iv */
        //  2736: astore_3       
        //  2737: aload_3        
        //  2738: astore          it$iv
        //  2740: iconst_0       
        //  2741: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2743: aload           it$iv
        //  2745: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2748: dup            
        //  2749: aload_1         /* block$iv */
        //  2750: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2753: checkcast       Ljava/util/function/Predicate;
        //  2756: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2759: aload_3        
        //  2760: nop            
        //  2761: astore_0        /* $this$visible$iv */
        //  2762: getstatic       me/alpha432/stay/features/modules/combat/StayAura$placeRange$3.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$placeRange$3;
        //  2765: checkcast       Lkotlin/jvm/functions/Function1;
        //  2768: astore_1        /* block$iv */
        //  2769: iconst_0       
        //  2770: istore_2        /* $i$f$limit */
        //  2771: aload_0         /* $this$limit$iv */
        //  2772: astore_3       
        //  2773: aload_3        
        //  2774: astore          it$iv
        //  2776: iconst_0       
        //  2777: istore          $i$a$-also-ValueKt$limit$1$iv
        //  2779: aload           it$iv
        //  2781: aload_1         /* block$iv */
        //  2782: invokevirtual   me/alpha432/stay/util/delegate/Value.setLimiter:(Lkotlin/jvm/functions/Function1;)V
        //  2785: aload_3        
        //  2786: nop            
        //  2787: putstatic       me/alpha432/stay/features/modules/combat/StayAura.placeRange$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2790: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2793: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2796: ldc_w           "Break Range"
        //  2799: ldc2_w          6.0
        //  2802: dconst_0       
        //  2803: ldc2_w          8.0
        //  2806: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  2809: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  2812: astore_0       
        //  2813: getstatic       me/alpha432/stay/features/modules/combat/StayAura$breakRange$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$breakRange$2;
        //  2816: checkcast       Lkotlin/jvm/functions/Function1;
        //  2819: astore_1        /* block$iv */
        //  2820: iconst_0       
        //  2821: istore_2        /* $i$f$visible */
        //  2822: aload_0         /* $this$visible$iv */
        //  2823: astore_3       
        //  2824: aload_3        
        //  2825: astore          it$iv
        //  2827: iconst_0       
        //  2828: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2830: aload           it$iv
        //  2832: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2835: dup            
        //  2836: aload_1         /* block$iv */
        //  2837: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2840: checkcast       Ljava/util/function/Predicate;
        //  2843: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2846: aload_3        
        //  2847: nop            
        //  2848: astore_0        /* $this$visible$iv */
        //  2849: getstatic       me/alpha432/stay/features/modules/combat/StayAura$breakRange$3.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$breakRange$3;
        //  2852: checkcast       Lkotlin/jvm/functions/Function1;
        //  2855: astore_1        /* block$iv */
        //  2856: iconst_0       
        //  2857: istore_2        /* $i$f$limit */
        //  2858: aload_0         /* $this$limit$iv */
        //  2859: astore_3       
        //  2860: aload_3        
        //  2861: astore          it$iv
        //  2863: iconst_0       
        //  2864: istore          $i$a$-also-ValueKt$limit$1$iv
        //  2866: aload           it$iv
        //  2868: aload_1         /* block$iv */
        //  2869: invokevirtual   me/alpha432/stay/util/delegate/Value.setLimiter:(Lkotlin/jvm/functions/Function1;)V
        //  2872: aload_3        
        //  2873: nop            
        //  2874: putstatic       me/alpha432/stay/features/modules/combat/StayAura.breakRange$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2877: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2880: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2883: ldc_w           "Place Delay"
        //  2886: bipush          50
        //  2888: new             Lkotlin/ranges/IntRange;
        //  2891: dup            
        //  2892: iconst_0       
        //  2893: sipush          200
        //  2896: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  2899: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  2902: astore_0       
        //  2903: getstatic       me/alpha432/stay/features/modules/combat/StayAura$placeDelay$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$placeDelay$2;
        //  2906: checkcast       Lkotlin/jvm/functions/Function1;
        //  2909: astore_1        /* block$iv */
        //  2910: iconst_0       
        //  2911: istore_2        /* $i$f$visible */
        //  2912: aload_0         /* $this$visible$iv */
        //  2913: astore_3       
        //  2914: aload_3        
        //  2915: astore          it$iv
        //  2917: iconst_0       
        //  2918: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2920: aload           it$iv
        //  2922: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2925: dup            
        //  2926: aload_1         /* block$iv */
        //  2927: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2930: checkcast       Ljava/util/function/Predicate;
        //  2933: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  2936: aload_3        
        //  2937: nop            
        //  2938: putstatic       me/alpha432/stay/features/modules/combat/StayAura.placeDelay$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  2941: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  2944: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  2947: ldc_w           "Break Delay"
        //  2950: bipush          50
        //  2952: new             Lkotlin/ranges/IntRange;
        //  2955: dup            
        //  2956: iconst_0       
        //  2957: sipush          200
        //  2960: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  2963: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  2966: astore_0       
        //  2967: getstatic       me/alpha432/stay/features/modules/combat/StayAura$breakDelay$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$breakDelay$2;
        //  2970: checkcast       Lkotlin/jvm/functions/Function1;
        //  2973: astore_1        /* block$iv */
        //  2974: iconst_0       
        //  2975: istore_2        /* $i$f$visible */
        //  2976: aload_0         /* $this$visible$iv */
        //  2977: astore_3       
        //  2978: aload_3        
        //  2979: astore          it$iv
        //  2981: iconst_0       
        //  2982: istore          $i$a$-also-ValueKt$visible$1$iv
        //  2984: aload           it$iv
        //  2986: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  2989: dup            
        //  2990: aload_1         /* block$iv */
        //  2991: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  2994: checkcast       Ljava/util/function/Predicate;
        //  2997: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3000: aload_3        
        //  3001: nop            
        //  3002: putstatic       me/alpha432/stay/features/modules/combat/StayAura.breakDelay$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3005: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3008: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3011: ldc_w           "Players"
        //  3014: iconst_1       
        //  3015: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3018: astore_0       
        //  3019: getstatic       me/alpha432/stay/features/modules/combat/StayAura$players$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$players$2;
        //  3022: checkcast       Lkotlin/jvm/functions/Function1;
        //  3025: astore_1        /* block$iv */
        //  3026: iconst_0       
        //  3027: istore_2        /* $i$f$visible */
        //  3028: aload_0         /* $this$visible$iv */
        //  3029: astore_3       
        //  3030: aload_3        
        //  3031: astore          it$iv
        //  3033: iconst_0       
        //  3034: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3036: aload           it$iv
        //  3038: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3041: dup            
        //  3042: aload_1         /* block$iv */
        //  3043: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3046: checkcast       Ljava/util/function/Predicate;
        //  3049: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3052: aload_3        
        //  3053: nop            
        //  3054: putstatic       me/alpha432/stay/features/modules/combat/StayAura.players$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3057: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3060: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3063: ldc_w           "Animals"
        //  3066: iconst_0       
        //  3067: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3070: astore_0       
        //  3071: getstatic       me/alpha432/stay/features/modules/combat/StayAura$animals$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$animals$2;
        //  3074: checkcast       Lkotlin/jvm/functions/Function1;
        //  3077: astore_1        /* block$iv */
        //  3078: iconst_0       
        //  3079: istore_2        /* $i$f$visible */
        //  3080: aload_0         /* $this$visible$iv */
        //  3081: astore_3       
        //  3082: aload_3        
        //  3083: astore          it$iv
        //  3085: iconst_0       
        //  3086: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3088: aload           it$iv
        //  3090: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3093: dup            
        //  3094: aload_1         /* block$iv */
        //  3095: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3098: checkcast       Ljava/util/function/Predicate;
        //  3101: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3104: aload_3        
        //  3105: nop            
        //  3106: putstatic       me/alpha432/stay/features/modules/combat/StayAura.animals$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3109: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3112: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3115: ldc_w           "Mobs"
        //  3118: iconst_0       
        //  3119: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3122: astore_0       
        //  3123: getstatic       me/alpha432/stay/features/modules/combat/StayAura$mobs$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$mobs$2;
        //  3126: checkcast       Lkotlin/jvm/functions/Function1;
        //  3129: astore_1        /* block$iv */
        //  3130: iconst_0       
        //  3131: istore_2        /* $i$f$visible */
        //  3132: aload_0         /* $this$visible$iv */
        //  3133: astore_3       
        //  3134: aload_3        
        //  3135: astore          it$iv
        //  3137: iconst_0       
        //  3138: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3140: aload           it$iv
        //  3142: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3145: dup            
        //  3146: aload_1         /* block$iv */
        //  3147: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3150: checkcast       Ljava/util/function/Predicate;
        //  3153: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3156: aload_3        
        //  3157: nop            
        //  3158: putstatic       me/alpha432/stay/features/modules/combat/StayAura.mobs$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3161: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3164: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3167: ldc_w           "Rotation"
        //  3170: iconst_1       
        //  3171: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3174: astore_0       
        //  3175: getstatic       me/alpha432/stay/features/modules/combat/StayAura$rotate$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$rotate$2;
        //  3178: checkcast       Lkotlin/jvm/functions/Function1;
        //  3181: astore_1        /* block$iv */
        //  3182: iconst_0       
        //  3183: istore_2        /* $i$f$visible */
        //  3184: aload_0         /* $this$visible$iv */
        //  3185: astore_3       
        //  3186: aload_3        
        //  3187: astore          it$iv
        //  3189: iconst_0       
        //  3190: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3192: aload           it$iv
        //  3194: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3197: dup            
        //  3198: aload_1         /* block$iv */
        //  3199: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3202: checkcast       Ljava/util/function/Predicate;
        //  3205: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3208: aload_3        
        //  3209: nop            
        //  3210: putstatic       me/alpha432/stay/features/modules/combat/StayAura.rotate$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3213: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3216: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3219: ldc_w           "PauseWhileEating"
        //  3222: iconst_0       
        //  3223: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3226: astore_0       
        //  3227: getstatic       me/alpha432/stay/features/modules/combat/StayAura$pauseWhileEating$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$pauseWhileEating$2;
        //  3230: checkcast       Lkotlin/jvm/functions/Function1;
        //  3233: astore_1        /* block$iv */
        //  3234: iconst_0       
        //  3235: istore_2        /* $i$f$visible */
        //  3236: aload_0         /* $this$visible$iv */
        //  3237: astore_3       
        //  3238: aload_3        
        //  3239: astore          it$iv
        //  3241: iconst_0       
        //  3242: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3244: aload           it$iv
        //  3246: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3249: dup            
        //  3250: aload_1         /* block$iv */
        //  3251: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3254: checkcast       Ljava/util/function/Predicate;
        //  3257: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3260: aload_3        
        //  3261: nop            
        //  3262: putstatic       me/alpha432/stay/features/modules/combat/StayAura.pauseWhileEating$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3265: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3268: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3271: ldc_w           "1.13+"
        //  3274: iconst_0       
        //  3275: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3278: astore_0       
        //  3279: getstatic       me/alpha432/stay/features/modules/combat/StayAura$newPlace$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$newPlace$2;
        //  3282: checkcast       Lkotlin/jvm/functions/Function1;
        //  3285: astore_1        /* block$iv */
        //  3286: iconst_0       
        //  3287: istore_2        /* $i$f$visible */
        //  3288: aload_0         /* $this$visible$iv */
        //  3289: astore_3       
        //  3290: aload_3        
        //  3291: astore          it$iv
        //  3293: iconst_0       
        //  3294: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3296: aload           it$iv
        //  3298: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3301: dup            
        //  3302: aload_1         /* block$iv */
        //  3303: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3306: checkcast       Ljava/util/function/Predicate;
        //  3309: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3312: aload_3        
        //  3313: nop            
        //  3314: putstatic       me/alpha432/stay/features/modules/combat/StayAura.newPlace$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3317: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3320: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3323: ldc_w           "LegitPlace"
        //  3326: iconst_0       
        //  3327: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3330: astore_0       
        //  3331: getstatic       me/alpha432/stay/features/modules/combat/StayAura$legitPlace$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$legitPlace$2;
        //  3334: checkcast       Lkotlin/jvm/functions/Function1;
        //  3337: astore_1        /* block$iv */
        //  3338: iconst_0       
        //  3339: istore_2        /* $i$f$visible */
        //  3340: aload_0         /* $this$visible$iv */
        //  3341: astore_3       
        //  3342: aload_3        
        //  3343: astore          it$iv
        //  3345: iconst_0       
        //  3346: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3348: aload           it$iv
        //  3350: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3353: dup            
        //  3354: aload_1         /* block$iv */
        //  3355: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3358: checkcast       Ljava/util/function/Predicate;
        //  3361: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3364: aload_3        
        //  3365: nop            
        //  3366: putstatic       me/alpha432/stay/features/modules/combat/StayAura.legitPlace$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3369: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3372: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3375: ldc_w           "Ignore Wall"
        //  3378: iconst_1       
        //  3379: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3382: astore_0       
        //  3383: getstatic       me/alpha432/stay/features/modules/combat/StayAura$wallPlace$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$wallPlace$2;
        //  3386: checkcast       Lkotlin/jvm/functions/Function1;
        //  3389: astore_1        /* block$iv */
        //  3390: iconst_0       
        //  3391: istore_2        /* $i$f$visible */
        //  3392: aload_0         /* $this$visible$iv */
        //  3393: astore_3       
        //  3394: aload_3        
        //  3395: astore          it$iv
        //  3397: iconst_0       
        //  3398: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3400: aload           it$iv
        //  3402: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3405: dup            
        //  3406: aload_1         /* block$iv */
        //  3407: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3410: checkcast       Ljava/util/function/Predicate;
        //  3413: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3416: aload_3        
        //  3417: nop            
        //  3418: putstatic       me/alpha432/stay/features/modules/combat/StayAura.wallPlace$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3421: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3424: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3427: ldc_w           "Wall Range"
        //  3430: ldc2_w          3.5
        //  3433: dconst_0       
        //  3434: ldc2_w          6.0
        //  3437: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  3440: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  3443: astore_0       
        //  3444: getstatic       me/alpha432/stay/features/modules/combat/StayAura$wallPlaceRange$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$wallPlaceRange$2;
        //  3447: checkcast       Lkotlin/jvm/functions/Function1;
        //  3450: astore_1        /* block$iv */
        //  3451: iconst_0       
        //  3452: istore_2        /* $i$f$visible */
        //  3453: aload_0         /* $this$visible$iv */
        //  3454: astore_3       
        //  3455: aload_3        
        //  3456: astore          it$iv
        //  3458: iconst_0       
        //  3459: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3461: aload           it$iv
        //  3463: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3466: dup            
        //  3467: aload_1         /* block$iv */
        //  3468: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3471: checkcast       Ljava/util/function/Predicate;
        //  3474: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3477: aload_3        
        //  3478: nop            
        //  3479: astore_0        /* $this$visible$iv */
        //  3480: getstatic       me/alpha432/stay/features/modules/combat/StayAura$wallPlaceRange$3.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$wallPlaceRange$3;
        //  3483: checkcast       Lkotlin/jvm/functions/Function1;
        //  3486: astore_1        /* block$iv */
        //  3487: iconst_0       
        //  3488: istore_2        /* $i$f$limit */
        //  3489: aload_0         /* $this$limit$iv */
        //  3490: astore_3       
        //  3491: aload_3        
        //  3492: astore          it$iv
        //  3494: iconst_0       
        //  3495: istore          $i$a$-also-ValueKt$limit$1$iv
        //  3497: aload           it$iv
        //  3499: aload_1         /* block$iv */
        //  3500: invokevirtual   me/alpha432/stay/util/delegate/Value.setLimiter:(Lkotlin/jvm/functions/Function1;)V
        //  3503: aload_3        
        //  3504: nop            
        //  3505: putstatic       me/alpha432/stay/features/modules/combat/StayAura.wallPlaceRange$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3508: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3511: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3514: ldc_w           "Calc Mode"
        //  3517: getstatic       me/alpha432/stay/features/modules/combat/StayAura$PlaceCalcMode.DEFAULT:Lme/alpha432/stay/features/modules/combat/StayAura$PlaceCalcMode;
        //  3520: checkcast       Ljava/lang/Enum;
        //  3523: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  3526: astore_0       
        //  3527: getstatic       me/alpha432/stay/features/modules/combat/StayAura$placeCalcMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$placeCalcMode$2;
        //  3530: checkcast       Lkotlin/jvm/functions/Function1;
        //  3533: astore_1        /* block$iv */
        //  3534: iconst_0       
        //  3535: istore_2        /* $i$f$visible */
        //  3536: aload_0         /* $this$visible$iv */
        //  3537: astore_3       
        //  3538: aload_3        
        //  3539: astore          it$iv
        //  3541: iconst_0       
        //  3542: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3544: aload           it$iv
        //  3546: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3549: dup            
        //  3550: aload_1         /* block$iv */
        //  3551: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3554: checkcast       Ljava/util/function/Predicate;
        //  3557: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3560: aload_3        
        //  3561: nop            
        //  3562: putstatic       me/alpha432/stay/features/modules/combat/StayAura.placeCalcMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3565: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3568: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3571: ldc_w           "Min Dmg"
        //  3574: ldc2_w          4.0
        //  3577: dconst_0       
        //  3578: ldc2_w          20.0
        //  3581: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  3584: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  3587: astore_0       
        //  3588: getstatic       me/alpha432/stay/features/modules/combat/StayAura$minPlaceDmg$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$minPlaceDmg$2;
        //  3591: checkcast       Lkotlin/jvm/functions/Function1;
        //  3594: astore_1        /* block$iv */
        //  3595: iconst_0       
        //  3596: istore_2        /* $i$f$visible */
        //  3597: aload_0         /* $this$visible$iv */
        //  3598: astore_3       
        //  3599: aload_3        
        //  3600: astore          it$iv
        //  3602: iconst_0       
        //  3603: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3605: aload           it$iv
        //  3607: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3610: dup            
        //  3611: aload_1         /* block$iv */
        //  3612: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3615: checkcast       Ljava/util/function/Predicate;
        //  3618: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3621: aload_3        
        //  3622: nop            
        //  3623: putstatic       me/alpha432/stay/features/modules/combat/StayAura.minPlaceDmg$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3626: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3629: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3632: ldc_w           "Max Self"
        //  3635: ldc2_w          10.0
        //  3638: dconst_0       
        //  3639: ldc2_w          20.0
        //  3642: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  3645: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  3648: astore_0       
        //  3649: getstatic       me/alpha432/stay/features/modules/combat/StayAura$maxPlaceSelf$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$maxPlaceSelf$2;
        //  3652: checkcast       Lkotlin/jvm/functions/Function1;
        //  3655: astore_1        /* block$iv */
        //  3656: iconst_0       
        //  3657: istore_2        /* $i$f$visible */
        //  3658: aload_0         /* $this$visible$iv */
        //  3659: astore_3       
        //  3660: aload_3        
        //  3661: astore          it$iv
        //  3663: iconst_0       
        //  3664: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3666: aload           it$iv
        //  3668: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3671: dup            
        //  3672: aload_1         /* block$iv */
        //  3673: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3676: checkcast       Ljava/util/function/Predicate;
        //  3679: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3682: aload_3        
        //  3683: nop            
        //  3684: putstatic       me/alpha432/stay/features/modules/combat/StayAura.maxPlaceSelf$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3687: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3690: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3693: ldc_w           "Balance"
        //  3696: dconst_0       
        //  3697: ldc2_w          -10.0
        //  3700: ldc2_w          10.0
        //  3703: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  3706: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  3709: astore_0       
        //  3710: getstatic       me/alpha432/stay/features/modules/combat/StayAura$placeBalance$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$placeBalance$2;
        //  3713: checkcast       Lkotlin/jvm/functions/Function1;
        //  3716: astore_1        /* block$iv */
        //  3717: iconst_0       
        //  3718: istore_2        /* $i$f$visible */
        //  3719: aload_0         /* $this$visible$iv */
        //  3720: astore_3       
        //  3721: aload_3        
        //  3722: astore          it$iv
        //  3724: iconst_0       
        //  3725: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3727: aload           it$iv
        //  3729: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3732: dup            
        //  3733: aload_1         /* block$iv */
        //  3734: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3737: checkcast       Ljava/util/function/Predicate;
        //  3740: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3743: aload_3        
        //  3744: nop            
        //  3745: putstatic       me/alpha432/stay/features/modules/combat/StayAura.placeBalance$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3748: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3751: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3754: ldc_w           "Predict"
        //  3757: iconst_1       
        //  3758: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3761: astore_0       
        //  3762: getstatic       me/alpha432/stay/features/modules/combat/StayAura$motionPredict$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$motionPredict$2;
        //  3765: checkcast       Lkotlin/jvm/functions/Function1;
        //  3768: astore_1        /* block$iv */
        //  3769: iconst_0       
        //  3770: istore_2        /* $i$f$visible */
        //  3771: aload_0         /* $this$visible$iv */
        //  3772: astore_3       
        //  3773: aload_3        
        //  3774: astore          it$iv
        //  3776: iconst_0       
        //  3777: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3779: aload           it$iv
        //  3781: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3784: dup            
        //  3785: aload_1         /* block$iv */
        //  3786: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3789: checkcast       Ljava/util/function/Predicate;
        //  3792: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3795: aload_3        
        //  3796: nop            
        //  3797: putstatic       me/alpha432/stay/features/modules/combat/StayAura.motionPredict$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3800: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3803: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3806: ldc_w           "Predict Ticks"
        //  3809: bipush          8
        //  3811: new             Lkotlin/ranges/IntRange;
        //  3814: dup            
        //  3815: iconst_1       
        //  3816: bipush          20
        //  3818: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  3821: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  3824: astore_0       
        //  3825: getstatic       me/alpha432/stay/features/modules/combat/StayAura$predictTicks$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$predictTicks$2;
        //  3828: checkcast       Lkotlin/jvm/functions/Function1;
        //  3831: astore_1        /* block$iv */
        //  3832: iconst_0       
        //  3833: istore_2        /* $i$f$visible */
        //  3834: aload_0         /* $this$visible$iv */
        //  3835: astore_3       
        //  3836: aload_3        
        //  3837: astore          it$iv
        //  3839: iconst_0       
        //  3840: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3842: aload           it$iv
        //  3844: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3847: dup            
        //  3848: aload_1         /* block$iv */
        //  3849: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3852: checkcast       Ljava/util/function/Predicate;
        //  3855: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3858: aload_3        
        //  3859: nop            
        //  3860: putstatic       me/alpha432/stay/features/modules/combat/StayAura.predictTicks$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3863: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3866: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3869: ldc_w           "Face Place"
        //  3872: iconst_1       
        //  3873: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3876: astore_0       
        //  3877: getstatic       me/alpha432/stay/features/modules/combat/StayAura$facePlace$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$facePlace$2;
        //  3880: checkcast       Lkotlin/jvm/functions/Function1;
        //  3883: astore_1        /* block$iv */
        //  3884: iconst_0       
        //  3885: istore_2        /* $i$f$visible */
        //  3886: aload_0         /* $this$visible$iv */
        //  3887: astore_3       
        //  3888: aload_3        
        //  3889: astore          it$iv
        //  3891: iconst_0       
        //  3892: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3894: aload           it$iv
        //  3896: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3899: dup            
        //  3900: aload_1         /* block$iv */
        //  3901: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3904: checkcast       Ljava/util/function/Predicate;
        //  3907: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3910: aload_3        
        //  3911: nop            
        //  3912: putstatic       me/alpha432/stay/features/modules/combat/StayAura.facePlace$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3915: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3918: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3921: ldc_w           "Min Health"
        //  3924: ldc2_w          10.0
        //  3927: dconst_0       
        //  3928: ldc2_w          36.0
        //  3931: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  3934: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  3937: astore_0       
        //  3938: getstatic       me/alpha432/stay/features/modules/combat/StayAura$facePlaceHealth$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$facePlaceHealth$2;
        //  3941: checkcast       Lkotlin/jvm/functions/Function1;
        //  3944: astore_1        /* block$iv */
        //  3945: iconst_0       
        //  3946: istore_2        /* $i$f$visible */
        //  3947: aload_0         /* $this$visible$iv */
        //  3948: astore_3       
        //  3949: aload_3        
        //  3950: astore          it$iv
        //  3952: iconst_0       
        //  3953: istore          $i$a$-also-ValueKt$visible$1$iv
        //  3955: aload           it$iv
        //  3957: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  3960: dup            
        //  3961: aload_1         /* block$iv */
        //  3962: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  3965: checkcast       Ljava/util/function/Predicate;
        //  3968: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  3971: aload_3        
        //  3972: nop            
        //  3973: putstatic       me/alpha432/stay/features/modules/combat/StayAura.facePlaceHealth$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  3976: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  3979: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  3982: ldc_w           "StopWhileSwording"
        //  3985: iconst_0       
        //  3986: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  3989: astore_0       
        //  3990: getstatic       me/alpha432/stay/features/modules/combat/StayAura$stopFpWhileSwording$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$stopFpWhileSwording$2;
        //  3993: checkcast       Lkotlin/jvm/functions/Function1;
        //  3996: astore_1        /* block$iv */
        //  3997: iconst_0       
        //  3998: istore_2        /* $i$f$visible */
        //  3999: aload_0         /* $this$visible$iv */
        //  4000: astore_3       
        //  4001: aload_3        
        //  4002: astore          it$iv
        //  4004: iconst_0       
        //  4005: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4007: aload           it$iv
        //  4009: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4012: dup            
        //  4013: aload_1         /* block$iv */
        //  4014: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4017: checkcast       Ljava/util/function/Predicate;
        //  4020: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4023: aload_3        
        //  4024: nop            
        //  4025: putstatic       me/alpha432/stay/features/modules/combat/StayAura.stopFpWhileSwording$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4028: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4031: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4034: ldc_w           "Break Mode"
        //  4037: getstatic       me/alpha432/stay/features/modules/combat/StayAura$BreakMode.CALCULATION:Lme/alpha432/stay/features/modules/combat/StayAura$BreakMode;
        //  4040: checkcast       Ljava/lang/Enum;
        //  4043: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  4046: astore_0       
        //  4047: getstatic       me/alpha432/stay/features/modules/combat/StayAura$breakWhen$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$breakWhen$2;
        //  4050: checkcast       Lkotlin/jvm/functions/Function1;
        //  4053: astore_1        /* block$iv */
        //  4054: iconst_0       
        //  4055: istore_2        /* $i$f$visible */
        //  4056: aload_0         /* $this$visible$iv */
        //  4057: astore_3       
        //  4058: aload_3        
        //  4059: astore          it$iv
        //  4061: iconst_0       
        //  4062: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4064: aload           it$iv
        //  4066: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4069: dup            
        //  4070: aload_1         /* block$iv */
        //  4071: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4074: checkcast       Ljava/util/function/Predicate;
        //  4077: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4080: aload_3        
        //  4081: nop            
        //  4082: putstatic       me/alpha432/stay/features/modules/combat/StayAura.breakWhen$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4085: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4088: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4091: ldc_w           "Predict Hit"
        //  4094: iconst_0       
        //  4095: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  4098: astore_0       
        //  4099: getstatic       me/alpha432/stay/features/modules/combat/StayAura$predictHit$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$predictHit$2;
        //  4102: checkcast       Lkotlin/jvm/functions/Function1;
        //  4105: astore_1        /* block$iv */
        //  4106: iconst_0       
        //  4107: istore_2        /* $i$f$visible */
        //  4108: aload_0         /* $this$visible$iv */
        //  4109: astore_3       
        //  4110: aload_3        
        //  4111: astore          it$iv
        //  4113: iconst_0       
        //  4114: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4116: aload           it$iv
        //  4118: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4121: dup            
        //  4122: aload_1         /* block$iv */
        //  4123: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4126: checkcast       Ljava/util/function/Predicate;
        //  4129: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4132: aload_3        
        //  4133: nop            
        //  4134: putstatic       me/alpha432/stay/features/modules/combat/StayAura.predictHit$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4137: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4140: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4143: ldc_w           "Predict Size"
        //  4146: iconst_0       
        //  4147: new             Lkotlin/ranges/IntRange;
        //  4150: dup            
        //  4151: iconst_0       
        //  4152: bipush          20
        //  4154: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  4157: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  4160: astore_0       
        //  4161: getstatic       me/alpha432/stay/features/modules/combat/StayAura$predictHitSize$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$predictHitSize$2;
        //  4164: checkcast       Lkotlin/jvm/functions/Function1;
        //  4167: astore_1        /* block$iv */
        //  4168: iconst_0       
        //  4169: istore_2        /* $i$f$visible */
        //  4170: aload_0         /* $this$visible$iv */
        //  4171: astore_3       
        //  4172: aload_3        
        //  4173: astore          it$iv
        //  4175: iconst_0       
        //  4176: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4178: aload           it$iv
        //  4180: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4183: dup            
        //  4184: aload_1         /* block$iv */
        //  4185: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4188: checkcast       Ljava/util/function/Predicate;
        //  4191: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4194: aload_3        
        //  4195: nop            
        //  4196: putstatic       me/alpha432/stay/features/modules/combat/StayAura.predictHitSize$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4199: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4202: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4205: ldc_w           "Hand"
        //  4208: getstatic       me/alpha432/stay/features/modules/combat/StayAura$BreakHand.MAIN:Lme/alpha432/stay/features/modules/combat/StayAura$BreakHand;
        //  4211: checkcast       Ljava/lang/Enum;
        //  4214: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  4217: astore_0       
        //  4218: getstatic       me/alpha432/stay/features/modules/combat/StayAura$breakHand$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$breakHand$2;
        //  4221: checkcast       Lkotlin/jvm/functions/Function1;
        //  4224: astore_1        /* block$iv */
        //  4225: iconst_0       
        //  4226: istore_2        /* $i$f$visible */
        //  4227: aload_0         /* $this$visible$iv */
        //  4228: astore_3       
        //  4229: aload_3        
        //  4230: astore          it$iv
        //  4232: iconst_0       
        //  4233: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4235: aload           it$iv
        //  4237: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4240: dup            
        //  4241: aload_1         /* block$iv */
        //  4242: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4245: checkcast       Ljava/util/function/Predicate;
        //  4248: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4251: aload_3        
        //  4252: nop            
        //  4253: putstatic       me/alpha432/stay/features/modules/combat/StayAura.breakHand$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4256: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4259: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4262: ldc_w           "Ignore Wall"
        //  4265: iconst_1       
        //  4266: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  4269: astore_0       
        //  4270: getstatic       me/alpha432/stay/features/modules/combat/StayAura$wallBreak$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$wallBreak$2;
        //  4273: checkcast       Lkotlin/jvm/functions/Function1;
        //  4276: astore_1        /* block$iv */
        //  4277: iconst_0       
        //  4278: istore_2        /* $i$f$visible */
        //  4279: aload_0         /* $this$visible$iv */
        //  4280: astore_3       
        //  4281: aload_3        
        //  4282: astore          it$iv
        //  4284: iconst_0       
        //  4285: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4287: aload           it$iv
        //  4289: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4292: dup            
        //  4293: aload_1         /* block$iv */
        //  4294: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4297: checkcast       Ljava/util/function/Predicate;
        //  4300: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4303: aload_3        
        //  4304: nop            
        //  4305: putstatic       me/alpha432/stay/features/modules/combat/StayAura.wallBreak$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4308: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4311: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4314: ldc_w           "Wall Range"
        //  4317: ldc2_w          3.5
        //  4320: dconst_0       
        //  4321: ldc2_w          6.0
        //  4324: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  4327: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  4330: astore_0       
        //  4331: getstatic       me/alpha432/stay/features/modules/combat/StayAura$wallBreakRange$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$wallBreakRange$2;
        //  4334: checkcast       Lkotlin/jvm/functions/Function1;
        //  4337: astore_1        /* block$iv */
        //  4338: iconst_0       
        //  4339: istore_2        /* $i$f$visible */
        //  4340: aload_0         /* $this$visible$iv */
        //  4341: astore_3       
        //  4342: aload_3        
        //  4343: astore          it$iv
        //  4345: iconst_0       
        //  4346: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4348: aload           it$iv
        //  4350: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4353: dup            
        //  4354: aload_1         /* block$iv */
        //  4355: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4358: checkcast       Ljava/util/function/Predicate;
        //  4361: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4364: aload_3        
        //  4365: nop            
        //  4366: astore_0        /* $this$visible$iv */
        //  4367: getstatic       me/alpha432/stay/features/modules/combat/StayAura$wallBreakRange$3.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$wallBreakRange$3;
        //  4370: checkcast       Lkotlin/jvm/functions/Function1;
        //  4373: astore_1        /* block$iv */
        //  4374: iconst_0       
        //  4375: istore_2        /* $i$f$limit */
        //  4376: aload_0         /* $this$limit$iv */
        //  4377: astore_3       
        //  4378: aload_3        
        //  4379: astore          it$iv
        //  4381: iconst_0       
        //  4382: istore          $i$a$-also-ValueKt$limit$1$iv
        //  4384: aload           it$iv
        //  4386: aload_1         /* block$iv */
        //  4387: invokevirtual   me/alpha432/stay/util/delegate/Value.setLimiter:(Lkotlin/jvm/functions/Function1;)V
        //  4390: aload_3        
        //  4391: nop            
        //  4392: putstatic       me/alpha432/stay/features/modules/combat/StayAura.wallBreakRange$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4395: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4398: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4401: ldc_w           "Calc Mode"
        //  4404: getstatic       me/alpha432/stay/features/modules/combat/StayAura$BreakCalcMode.DEFAULT:Lme/alpha432/stay/features/modules/combat/StayAura$BreakCalcMode;
        //  4407: checkcast       Ljava/lang/Enum;
        //  4410: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  4413: astore_0       
        //  4414: getstatic       me/alpha432/stay/features/modules/combat/StayAura$breakCalcMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$breakCalcMode$2;
        //  4417: checkcast       Lkotlin/jvm/functions/Function1;
        //  4420: astore_1        /* block$iv */
        //  4421: iconst_0       
        //  4422: istore_2        /* $i$f$visible */
        //  4423: aload_0         /* $this$visible$iv */
        //  4424: astore_3       
        //  4425: aload_3        
        //  4426: astore          it$iv
        //  4428: iconst_0       
        //  4429: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4431: aload           it$iv
        //  4433: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4436: dup            
        //  4437: aload_1         /* block$iv */
        //  4438: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4441: checkcast       Ljava/util/function/Predicate;
        //  4444: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4447: aload_3        
        //  4448: nop            
        //  4449: putstatic       me/alpha432/stay/features/modules/combat/StayAura.breakCalcMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4452: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4455: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4458: ldc_w           "Min Dmg"
        //  4461: ldc2_w          4.0
        //  4464: dconst_0       
        //  4465: ldc2_w          20.0
        //  4468: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  4471: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  4474: astore_0       
        //  4475: getstatic       me/alpha432/stay/features/modules/combat/StayAura$minBreakDmg$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$minBreakDmg$2;
        //  4478: checkcast       Lkotlin/jvm/functions/Function1;
        //  4481: astore_1        /* block$iv */
        //  4482: iconst_0       
        //  4483: istore_2        /* $i$f$visible */
        //  4484: aload_0         /* $this$visible$iv */
        //  4485: astore_3       
        //  4486: aload_3        
        //  4487: astore          it$iv
        //  4489: iconst_0       
        //  4490: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4492: aload           it$iv
        //  4494: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4497: dup            
        //  4498: aload_1         /* block$iv */
        //  4499: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4502: checkcast       Ljava/util/function/Predicate;
        //  4505: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4508: aload_3        
        //  4509: nop            
        //  4510: putstatic       me/alpha432/stay/features/modules/combat/StayAura.minBreakDmg$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4513: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4516: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4519: ldc_w           "Max Self"
        //  4522: ldc2_w          12.0
        //  4525: dconst_0       
        //  4526: ldc2_w          20.0
        //  4529: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  4532: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  4535: astore_0       
        //  4536: getstatic       me/alpha432/stay/features/modules/combat/StayAura$maxBreakSelf$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$maxBreakSelf$2;
        //  4539: checkcast       Lkotlin/jvm/functions/Function1;
        //  4542: astore_1        /* block$iv */
        //  4543: iconst_0       
        //  4544: istore_2        /* $i$f$visible */
        //  4545: aload_0         /* $this$visible$iv */
        //  4546: astore_3       
        //  4547: aload_3        
        //  4548: astore          it$iv
        //  4550: iconst_0       
        //  4551: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4553: aload           it$iv
        //  4555: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4558: dup            
        //  4559: aload_1         /* block$iv */
        //  4560: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4563: checkcast       Ljava/util/function/Predicate;
        //  4566: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4569: aload_3        
        //  4570: nop            
        //  4571: putstatic       me/alpha432/stay/features/modules/combat/StayAura.maxBreakSelf$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4574: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4577: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4580: ldc_w           "Balance"
        //  4583: dconst_0       
        //  4584: ldc2_w          -10.0
        //  4587: ldc2_w          10.0
        //  4590: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  4593: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  4596: astore_0       
        //  4597: getstatic       me/alpha432/stay/features/modules/combat/StayAura$breakBalance$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$breakBalance$2;
        //  4600: checkcast       Lkotlin/jvm/functions/Function1;
        //  4603: astore_1        /* block$iv */
        //  4604: iconst_0       
        //  4605: istore_2        /* $i$f$visible */
        //  4606: aload_0         /* $this$visible$iv */
        //  4607: astore_3       
        //  4608: aload_3        
        //  4609: astore          it$iv
        //  4611: iconst_0       
        //  4612: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4614: aload           it$iv
        //  4616: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4619: dup            
        //  4620: aload_1         /* block$iv */
        //  4621: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4624: checkcast       Ljava/util/function/Predicate;
        //  4627: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4630: aload_3        
        //  4631: nop            
        //  4632: putstatic       me/alpha432/stay/features/modules/combat/StayAura.breakBalance$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4635: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4638: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4641: ldc_w           "Bypass"
        //  4644: iconst_0       
        //  4645: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  4648: astore_0       
        //  4649: getstatic       me/alpha432/stay/features/modules/combat/StayAura$bypass$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$bypass$2;
        //  4652: checkcast       Lkotlin/jvm/functions/Function1;
        //  4655: astore_1        /* block$iv */
        //  4656: iconst_0       
        //  4657: istore_2        /* $i$f$visible */
        //  4658: aload_0         /* $this$visible$iv */
        //  4659: astore_3       
        //  4660: aload_3        
        //  4661: astore          it$iv
        //  4663: iconst_0       
        //  4664: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4666: aload           it$iv
        //  4668: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4671: dup            
        //  4672: aload_1         /* block$iv */
        //  4673: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4676: checkcast       Ljava/util/function/Predicate;
        //  4679: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4682: aload_3        
        //  4683: nop            
        //  4684: putstatic       me/alpha432/stay/features/modules/combat/StayAura.bypass$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4687: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4690: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4693: ldc_w           "Mode"
        //  4696: getstatic       me/alpha432/stay/features/modules/combat/StayAura$BypassMode.ENTITYIGNORE:Lme/alpha432/stay/features/modules/combat/StayAura$BypassMode;
        //  4699: checkcast       Ljava/lang/Enum;
        //  4702: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  4705: astore_0       
        //  4706: getstatic       me/alpha432/stay/features/modules/combat/StayAura$bypassMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$bypassMode$2;
        //  4709: checkcast       Lkotlin/jvm/functions/Function1;
        //  4712: astore_1        /* block$iv */
        //  4713: iconst_0       
        //  4714: istore_2        /* $i$f$visible */
        //  4715: aload_0         /* $this$visible$iv */
        //  4716: astore_3       
        //  4717: aload_3        
        //  4718: astore          it$iv
        //  4720: iconst_0       
        //  4721: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4723: aload           it$iv
        //  4725: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4728: dup            
        //  4729: aload_1         /* block$iv */
        //  4730: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4733: checkcast       Ljava/util/function/Predicate;
        //  4736: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4739: aload_3        
        //  4740: nop            
        //  4741: putstatic       me/alpha432/stay/features/modules/combat/StayAura.bypassMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4744: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4747: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4750: ldc_w           "Action"
        //  4753: getstatic       me/alpha432/stay/features/modules/combat/StayAura$ActionPriority.BREAK_PLACE:Lme/alpha432/stay/features/modules/combat/StayAura$ActionPriority;
        //  4756: checkcast       Ljava/lang/Enum;
        //  4759: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  4762: astore_0       
        //  4763: getstatic       me/alpha432/stay/features/modules/combat/StayAura$actionPriority$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$actionPriority$2;
        //  4766: checkcast       Lkotlin/jvm/functions/Function1;
        //  4769: astore_1        /* block$iv */
        //  4770: iconst_0       
        //  4771: istore_2        /* $i$f$visible */
        //  4772: aload_0         /* $this$visible$iv */
        //  4773: astore_3       
        //  4774: aload_3        
        //  4775: astore          it$iv
        //  4777: iconst_0       
        //  4778: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4780: aload           it$iv
        //  4782: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4785: dup            
        //  4786: aload_1         /* block$iv */
        //  4787: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4790: checkcast       Ljava/util/function/Predicate;
        //  4793: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4796: aload_3        
        //  4797: nop            
        //  4798: putstatic       me/alpha432/stay/features/modules/combat/StayAura.actionPriority$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4801: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4804: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4807: ldc_w           "TryPopTotem"
        //  4810: iconst_0       
        //  4811: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  4814: astore_0       
        //  4815: getstatic       me/alpha432/stay/features/modules/combat/StayAura$popTotemTry$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$popTotemTry$2;
        //  4818: checkcast       Lkotlin/jvm/functions/Function1;
        //  4821: astore_1        /* block$iv */
        //  4822: iconst_0       
        //  4823: istore_2        /* $i$f$visible */
        //  4824: aload_0         /* $this$visible$iv */
        //  4825: astore_3       
        //  4826: aload_3        
        //  4827: astore          it$iv
        //  4829: iconst_0       
        //  4830: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4832: aload           it$iv
        //  4834: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4837: dup            
        //  4838: aload_1         /* block$iv */
        //  4839: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4842: checkcast       Ljava/util/function/Predicate;
        //  4845: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4848: aload_3        
        //  4849: nop            
        //  4850: putstatic       me/alpha432/stay/features/modules/combat/StayAura.popTotemTry$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4853: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4856: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4859: ldc_w           "TryPopProtection"
        //  4862: iconst_0       
        //  4863: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  4866: astore_0       
        //  4867: getstatic       me/alpha432/stay/features/modules/combat/StayAura$popTotemTryingProtection$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$popTotemTryingProtection$2;
        //  4870: checkcast       Lkotlin/jvm/functions/Function1;
        //  4873: astore_1        /* block$iv */
        //  4874: iconst_0       
        //  4875: istore_2        /* $i$f$visible */
        //  4876: aload_0         /* $this$visible$iv */
        //  4877: astore_3       
        //  4878: aload_3        
        //  4879: astore          it$iv
        //  4881: iconst_0       
        //  4882: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4884: aload           it$iv
        //  4886: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4889: dup            
        //  4890: aload_1         /* block$iv */
        //  4891: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4894: checkcast       Ljava/util/function/Predicate;
        //  4897: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4900: aload_3        
        //  4901: nop            
        //  4902: putstatic       me/alpha432/stay/features/modules/combat/StayAura.popTotemTryingProtection$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4905: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4908: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4911: ldc_w           "ProtectMode"
        //  4914: getstatic       me/alpha432/stay/features/modules/combat/StayAura$PopTotemTryingProtection.CHANCE:Lme/alpha432/stay/features/modules/combat/StayAura$PopTotemTryingProtection;
        //  4917: checkcast       Ljava/lang/Enum;
        //  4920: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  4923: astore_0       
        //  4924: getstatic       me/alpha432/stay/features/modules/combat/StayAura$protectionMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$protectionMode$2;
        //  4927: checkcast       Lkotlin/jvm/functions/Function1;
        //  4930: astore_1        /* block$iv */
        //  4931: iconst_0       
        //  4932: istore_2        /* $i$f$visible */
        //  4933: aload_0         /* $this$visible$iv */
        //  4934: astore_3       
        //  4935: aload_3        
        //  4936: astore          it$iv
        //  4938: iconst_0       
        //  4939: istore          $i$a$-also-ValueKt$visible$1$iv
        //  4941: aload           it$iv
        //  4943: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  4946: dup            
        //  4947: aload_1         /* block$iv */
        //  4948: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  4951: checkcast       Ljava/util/function/Predicate;
        //  4954: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  4957: aload_3        
        //  4958: nop            
        //  4959: putstatic       me/alpha432/stay/features/modules/combat/StayAura.protectionMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  4962: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  4965: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  4968: ldc_w           "TrialChance"
        //  4971: bipush          100
        //  4973: new             Lkotlin/ranges/IntRange;
        //  4976: dup            
        //  4977: iconst_0       
        //  4978: bipush          100
        //  4980: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  4983: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  4986: astore_0       
        //  4987: getstatic       me/alpha432/stay/features/modules/combat/StayAura$trialFactor$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$trialFactor$2;
        //  4990: checkcast       Lkotlin/jvm/functions/Function1;
        //  4993: astore_1        /* block$iv */
        //  4994: iconst_0       
        //  4995: istore_2        /* $i$f$visible */
        //  4996: aload_0         /* $this$visible$iv */
        //  4997: astore_3       
        //  4998: aload_3        
        //  4999: astore          it$iv
        //  5001: iconst_0       
        //  5002: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5004: aload           it$iv
        //  5006: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5009: dup            
        //  5010: aload_1         /* block$iv */
        //  5011: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5014: checkcast       Ljava/util/function/Predicate;
        //  5017: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5020: aload_3        
        //  5021: nop            
        //  5022: putstatic       me/alpha432/stay/features/modules/combat/StayAura.trialFactor$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5025: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5028: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5031: ldc_w           "TrialMaxSelf"
        //  5034: bipush          10
        //  5036: new             Lkotlin/ranges/IntRange;
        //  5039: dup            
        //  5040: iconst_0       
        //  5041: bipush          36
        //  5043: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  5046: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5049: astore_0       
        //  5050: getstatic       me/alpha432/stay/features/modules/combat/StayAura$trialMaxSelf$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$trialMaxSelf$2;
        //  5053: checkcast       Lkotlin/jvm/functions/Function1;
        //  5056: astore_1        /* block$iv */
        //  5057: iconst_0       
        //  5058: istore_2        /* $i$f$visible */
        //  5059: aload_0         /* $this$visible$iv */
        //  5060: astore_3       
        //  5061: aload_3        
        //  5062: astore          it$iv
        //  5064: iconst_0       
        //  5065: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5067: aload           it$iv
        //  5069: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5072: dup            
        //  5073: aload_1         /* block$iv */
        //  5074: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5077: checkcast       Ljava/util/function/Predicate;
        //  5080: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5083: aload_3        
        //  5084: nop            
        //  5085: putstatic       me/alpha432/stay/features/modules/combat/StayAura.trialMaxSelf$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5088: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5091: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5094: ldc_w           "TrialSelfHealth"
        //  5097: bipush          10
        //  5099: new             Lkotlin/ranges/IntRange;
        //  5102: dup            
        //  5103: iconst_0       
        //  5104: bipush          36
        //  5106: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  5109: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5112: astore_0       
        //  5113: getstatic       me/alpha432/stay/features/modules/combat/StayAura$trialSelfHealth$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$trialSelfHealth$2;
        //  5116: checkcast       Lkotlin/jvm/functions/Function1;
        //  5119: astore_1        /* block$iv */
        //  5120: iconst_0       
        //  5121: istore_2        /* $i$f$visible */
        //  5122: aload_0         /* $this$visible$iv */
        //  5123: astore_3       
        //  5124: aload_3        
        //  5125: astore          it$iv
        //  5127: iconst_0       
        //  5128: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5130: aload           it$iv
        //  5132: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5135: dup            
        //  5136: aload_1         /* block$iv */
        //  5137: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5140: checkcast       Ljava/util/function/Predicate;
        //  5143: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5146: aload_3        
        //  5147: nop            
        //  5148: putstatic       me/alpha432/stay/features/modules/combat/StayAura.trialSelfHealth$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5151: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5154: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5157: ldc_w           "Chasing"
        //  5160: iconst_0       
        //  5161: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  5164: astore_0       
        //  5165: getstatic       me/alpha432/stay/features/modules/combat/StayAura$chase$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$chase$2;
        //  5168: checkcast       Lkotlin/jvm/functions/Function1;
        //  5171: astore_1        /* block$iv */
        //  5172: iconst_0       
        //  5173: istore_2        /* $i$f$visible */
        //  5174: aload_0         /* $this$visible$iv */
        //  5175: astore_3       
        //  5176: aload_3        
        //  5177: astore          it$iv
        //  5179: iconst_0       
        //  5180: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5182: aload           it$iv
        //  5184: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5187: dup            
        //  5188: aload_1         /* block$iv */
        //  5189: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5192: checkcast       Ljava/util/function/Predicate;
        //  5195: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5198: aload_3        
        //  5199: nop            
        //  5200: putstatic       me/alpha432/stay/features/modules/combat/StayAura.chase$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5203: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5206: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5209: ldc_w           "ChasingFactor"
        //  5212: bipush          20
        //  5214: new             Lkotlin/ranges/IntRange;
        //  5217: dup            
        //  5218: iconst_0       
        //  5219: bipush          100
        //  5221: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  5224: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5227: astore_0       
        //  5228: getstatic       me/alpha432/stay/features/modules/combat/StayAura$chasingFactor$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$chasingFactor$2;
        //  5231: checkcast       Lkotlin/jvm/functions/Function1;
        //  5234: astore_1        /* block$iv */
        //  5235: iconst_0       
        //  5236: istore_2        /* $i$f$visible */
        //  5237: aload_0         /* $this$visible$iv */
        //  5238: astore_3       
        //  5239: aload_3        
        //  5240: astore          it$iv
        //  5242: iconst_0       
        //  5243: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5245: aload           it$iv
        //  5247: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5250: dup            
        //  5251: aload_1         /* block$iv */
        //  5252: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5255: checkcast       Ljava/util/function/Predicate;
        //  5258: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5261: aload_3        
        //  5262: nop            
        //  5263: putstatic       me/alpha432/stay/features/modules/combat/StayAura.chasingFactor$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5266: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5269: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5272: ldc_w           "ChasingMaxSelf"
        //  5275: ldc2_w          30.0
        //  5278: dconst_0       
        //  5279: ldc2_w          36.0
        //  5282: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  5285: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5288: astore_0       
        //  5289: getstatic       me/alpha432/stay/features/modules/combat/StayAura$chasingMaxSelf$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$chasingMaxSelf$2;
        //  5292: checkcast       Lkotlin/jvm/functions/Function1;
        //  5295: astore_1        /* block$iv */
        //  5296: iconst_0       
        //  5297: istore_2        /* $i$f$visible */
        //  5298: aload_0         /* $this$visible$iv */
        //  5299: astore_3       
        //  5300: aload_3        
        //  5301: astore          it$iv
        //  5303: iconst_0       
        //  5304: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5306: aload           it$iv
        //  5308: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5311: dup            
        //  5312: aload_1         /* block$iv */
        //  5313: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5316: checkcast       Ljava/util/function/Predicate;
        //  5319: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5322: aload_3        
        //  5323: nop            
        //  5324: putstatic       me/alpha432/stay/features/modules/combat/StayAura.chasingMaxSelf$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5327: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5330: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5333: ldc_w           "NoSuicide"
        //  5336: iconst_1       
        //  5337: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  5340: astore_0       
        //  5341: getstatic       me/alpha432/stay/features/modules/combat/StayAura$noSuicide$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$noSuicide$2;
        //  5344: checkcast       Lkotlin/jvm/functions/Function1;
        //  5347: astore_1        /* block$iv */
        //  5348: iconst_0       
        //  5349: istore_2        /* $i$f$visible */
        //  5350: aload_0         /* $this$visible$iv */
        //  5351: astore_3       
        //  5352: aload_3        
        //  5353: astore          it$iv
        //  5355: iconst_0       
        //  5356: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5358: aload           it$iv
        //  5360: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5363: dup            
        //  5364: aload_1         /* block$iv */
        //  5365: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5368: checkcast       Ljava/util/function/Predicate;
        //  5371: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5374: aload_3        
        //  5375: nop            
        //  5376: putstatic       me/alpha432/stay/features/modules/combat/StayAura.noSuicide$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5379: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5382: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5385: ldc_w           "DamagePriority"
        //  5388: bipush          100
        //  5390: new             Lkotlin/ranges/IntRange;
        //  5393: dup            
        //  5394: iconst_0       
        //  5395: sipush          200
        //  5398: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  5401: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5404: astore_0       
        //  5405: getstatic       me/alpha432/stay/features/modules/combat/StayAura$damagePriority$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$damagePriority$2;
        //  5408: checkcast       Lkotlin/jvm/functions/Function1;
        //  5411: astore_1        /* block$iv */
        //  5412: iconst_0       
        //  5413: istore_2        /* $i$f$visible */
        //  5414: aload_0         /* $this$visible$iv */
        //  5415: astore_3       
        //  5416: aload_3        
        //  5417: astore          it$iv
        //  5419: iconst_0       
        //  5420: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5422: aload           it$iv
        //  5424: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5427: dup            
        //  5428: aload_1         /* block$iv */
        //  5429: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5432: checkcast       Ljava/util/function/Predicate;
        //  5435: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5438: aload_3        
        //  5439: nop            
        //  5440: putstatic       me/alpha432/stay/features/modules/combat/StayAura.damagePriority$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5443: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5446: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5449: ldc_w           "BalanceProtection"
        //  5452: iconst_0       
        //  5453: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  5456: astore_0       
        //  5457: getstatic       me/alpha432/stay/features/modules/combat/StayAura$balanceProtection$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$balanceProtection$2;
        //  5460: checkcast       Lkotlin/jvm/functions/Function1;
        //  5463: astore_1        /* block$iv */
        //  5464: iconst_0       
        //  5465: istore_2        /* $i$f$visible */
        //  5466: aload_0         /* $this$visible$iv */
        //  5467: astore_3       
        //  5468: aload_3        
        //  5469: astore          it$iv
        //  5471: iconst_0       
        //  5472: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5474: aload           it$iv
        //  5476: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5479: dup            
        //  5480: aload_1         /* block$iv */
        //  5481: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5484: checkcast       Ljava/util/function/Predicate;
        //  5487: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5490: aload_3        
        //  5491: nop            
        //  5492: putstatic       me/alpha432/stay/features/modules/combat/StayAura.balanceProtection$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5495: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5498: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5501: ldc_w           "GlobalBalance"
        //  5504: dconst_0       
        //  5505: ldc2_w          -10.0
        //  5508: ldc2_w          10.0
        //  5511: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  5514: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5517: astore_0       
        //  5518: getstatic       me/alpha432/stay/features/modules/combat/StayAura$globalBalance$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$globalBalance$2;
        //  5521: checkcast       Lkotlin/jvm/functions/Function1;
        //  5524: astore_1        /* block$iv */
        //  5525: iconst_0       
        //  5526: istore_2        /* $i$f$visible */
        //  5527: aload_0         /* $this$visible$iv */
        //  5528: astore_3       
        //  5529: aload_3        
        //  5530: astore          it$iv
        //  5532: iconst_0       
        //  5533: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5535: aload           it$iv
        //  5537: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5540: dup            
        //  5541: aload_1         /* block$iv */
        //  5542: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5545: checkcast       Ljava/util/function/Predicate;
        //  5548: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5551: aload_3        
        //  5552: nop            
        //  5553: putstatic       me/alpha432/stay/features/modules/combat/StayAura.globalBalance$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5556: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5559: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5562: ldc_w           "ProtectFactor"
        //  5565: bipush          50
        //  5567: new             Lkotlin/ranges/IntRange;
        //  5570: dup            
        //  5571: iconst_0       
        //  5572: bipush          100
        //  5574: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  5577: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5580: astore_0       
        //  5581: getstatic       me/alpha432/stay/features/modules/combat/StayAura$balanceProtectionFactor$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$balanceProtectionFactor$2;
        //  5584: checkcast       Lkotlin/jvm/functions/Function1;
        //  5587: astore_1        /* block$iv */
        //  5588: iconst_0       
        //  5589: istore_2        /* $i$f$visible */
        //  5590: aload_0         /* $this$visible$iv */
        //  5591: astore_3       
        //  5592: aload_3        
        //  5593: astore          it$iv
        //  5595: iconst_0       
        //  5596: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5598: aload           it$iv
        //  5600: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5603: dup            
        //  5604: aload_1         /* block$iv */
        //  5605: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5608: checkcast       Ljava/util/function/Predicate;
        //  5611: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5614: aload_3        
        //  5615: nop            
        //  5616: putstatic       me/alpha432/stay/features/modules/combat/StayAura.balanceProtectionFactor$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5619: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5622: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5625: ldc_w           "Facing"
        //  5628: getstatic       net/minecraft/util/EnumFacing.UP:Lnet/minecraft/util/EnumFacing;
        //  5631: checkcast       Ljava/lang/Enum;
        //  5634: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  5637: astore_0       
        //  5638: getstatic       me/alpha432/stay/features/modules/combat/StayAura$facing$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$facing$2;
        //  5641: checkcast       Lkotlin/jvm/functions/Function1;
        //  5644: astore_1        /* block$iv */
        //  5645: iconst_0       
        //  5646: istore_2        /* $i$f$visible */
        //  5647: aload_0         /* $this$visible$iv */
        //  5648: astore_3       
        //  5649: aload_3        
        //  5650: astore          it$iv
        //  5652: iconst_0       
        //  5653: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5655: aload           it$iv
        //  5657: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5660: dup            
        //  5661: aload_1         /* block$iv */
        //  5662: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5665: checkcast       Ljava/util/function/Predicate;
        //  5668: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5671: aload_3        
        //  5672: nop            
        //  5673: putstatic       me/alpha432/stay/features/modules/combat/StayAura.facing$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5676: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5679: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5682: ldc_w           "Threads"
        //  5685: bipush          10
        //  5687: new             Lkotlin/ranges/IntRange;
        //  5690: dup            
        //  5691: iconst_1       
        //  5692: bipush          100
        //  5694: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  5697: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  5700: astore_0       
        //  5701: getstatic       me/alpha432/stay/features/modules/combat/StayAura$threads$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$threads$2;
        //  5704: checkcast       Lkotlin/jvm/functions/Function1;
        //  5707: astore_1        /* block$iv */
        //  5708: iconst_0       
        //  5709: istore_2        /* $i$f$visible */
        //  5710: aload_0         /* $this$visible$iv */
        //  5711: astore_3       
        //  5712: aload_3        
        //  5713: astore          it$iv
        //  5715: iconst_0       
        //  5716: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5718: aload           it$iv
        //  5720: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5723: dup            
        //  5724: aload_1         /* block$iv */
        //  5725: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5728: checkcast       Ljava/util/function/Predicate;
        //  5731: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5734: aload_3        
        //  5735: nop            
        //  5736: putstatic       me/alpha432/stay/features/modules/combat/StayAura.threads$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5739: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5742: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5745: ldc_w           "Heavy Calc"
        //  5748: iconst_0       
        //  5749: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  5752: astore_0       
        //  5753: getstatic       me/alpha432/stay/features/modules/combat/StayAura$heavyCalc$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$heavyCalc$2;
        //  5756: checkcast       Lkotlin/jvm/functions/Function1;
        //  5759: astore_1        /* block$iv */
        //  5760: iconst_0       
        //  5761: istore_2        /* $i$f$visible */
        //  5762: aload_0         /* $this$visible$iv */
        //  5763: astore_3       
        //  5764: aload_3        
        //  5765: astore          it$iv
        //  5767: iconst_0       
        //  5768: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5770: aload           it$iv
        //  5772: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5775: dup            
        //  5776: aload_1         /* block$iv */
        //  5777: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5780: checkcast       Ljava/util/function/Predicate;
        //  5783: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5786: aload_3        
        //  5787: nop            
        //  5788: putstatic       me/alpha432/stay/features/modules/combat/StayAura.heavyCalc$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5791: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5794: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5797: ldc_w           "Override Mode"
        //  5800: getstatic       me/alpha432/stay/features/modules/combat/StayAura$OverrideMode.TARGETDAMAGE:Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;
        //  5803: checkcast       Ljava/lang/Enum;
        //  5806: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  5809: astore_0       
        //  5810: getstatic       me/alpha432/stay/features/modules/combat/StayAura$overrideMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$overrideMode$2;
        //  5813: checkcast       Lkotlin/jvm/functions/Function1;
        //  5816: astore_1        /* block$iv */
        //  5817: iconst_0       
        //  5818: istore_2        /* $i$f$visible */
        //  5819: aload_0         /* $this$visible$iv */
        //  5820: astore_3       
        //  5821: aload_3        
        //  5822: astore          it$iv
        //  5824: iconst_0       
        //  5825: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5827: aload           it$iv
        //  5829: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5832: dup            
        //  5833: aload_1         /* block$iv */
        //  5834: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5837: checkcast       Ljava/util/function/Predicate;
        //  5840: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5843: aload_3        
        //  5844: nop            
        //  5845: putstatic       me/alpha432/stay/features/modules/combat/StayAura.overrideMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5848: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5851: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5854: ldc_w           "Null Checked"
        //  5857: getstatic       me/alpha432/stay/features/modules/combat/StayAura$NullChecked.FIRST:Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;
        //  5860: checkcast       Ljava/lang/Enum;
        //  5863: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  5866: astore_0       
        //  5867: getstatic       me/alpha432/stay/features/modules/combat/StayAura$nullCheckedReturn$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$nullCheckedReturn$2;
        //  5870: checkcast       Lkotlin/jvm/functions/Function1;
        //  5873: astore_1        /* block$iv */
        //  5874: iconst_0       
        //  5875: istore_2        /* $i$f$visible */
        //  5876: aload_0         /* $this$visible$iv */
        //  5877: astore_3       
        //  5878: aload_3        
        //  5879: astore          it$iv
        //  5881: iconst_0       
        //  5882: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5884: aload           it$iv
        //  5886: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5889: dup            
        //  5890: aload_1         /* block$iv */
        //  5891: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5894: checkcast       Ljava/util/function/Predicate;
        //  5897: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5900: aload_3        
        //  5901: nop            
        //  5902: putstatic       me/alpha432/stay/features/modules/combat/StayAura.nullCheckedReturn$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5905: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5908: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5911: ldc_w           "Render"
        //  5914: iconst_1       
        //  5915: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  5918: astore_0       
        //  5919: getstatic       me/alpha432/stay/features/modules/combat/StayAura$render$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$render$2;
        //  5922: checkcast       Lkotlin/jvm/functions/Function1;
        //  5925: astore_1        /* block$iv */
        //  5926: iconst_0       
        //  5927: istore_2        /* $i$f$visible */
        //  5928: aload_0         /* $this$visible$iv */
        //  5929: astore_3       
        //  5930: aload_3        
        //  5931: astore          it$iv
        //  5933: iconst_0       
        //  5934: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5936: aload           it$iv
        //  5938: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5941: dup            
        //  5942: aload_1         /* block$iv */
        //  5943: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  5946: checkcast       Ljava/util/function/Predicate;
        //  5949: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  5952: aload_3        
        //  5953: nop            
        //  5954: putstatic       me/alpha432/stay/features/modules/combat/StayAura.render$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  5957: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  5960: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  5963: ldc_w           "RenderMode"
        //  5966: getstatic       me/alpha432/stay/features/modules/combat/StayAura$RenderMode.DYNAMIC:Lme/alpha432/stay/features/modules/combat/StayAura$RenderMode;
        //  5969: checkcast       Ljava/lang/Enum;
        //  5972: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  5975: astore_0       
        //  5976: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderMode$2;
        //  5979: checkcast       Lkotlin/jvm/functions/Function1;
        //  5982: astore_1        /* block$iv */
        //  5983: iconst_0       
        //  5984: istore_2        /* $i$f$visible */
        //  5985: aload_0         /* $this$visible$iv */
        //  5986: astore_3       
        //  5987: aload_3        
        //  5988: astore          it$iv
        //  5990: iconst_0       
        //  5991: istore          $i$a$-also-ValueKt$visible$1$iv
        //  5993: aload           it$iv
        //  5995: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  5998: dup            
        //  5999: aload_1         /* block$iv */
        //  6000: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6003: checkcast       Ljava/util/function/Predicate;
        //  6006: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6009: aload_3        
        //  6010: nop            
        //  6011: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6014: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6017: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6020: ldc_w           "Sync"
        //  6023: iconst_0       
        //  6024: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  6027: astore_0       
        //  6028: getstatic       me/alpha432/stay/features/modules/combat/StayAura$colorSync$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$colorSync$2;
        //  6031: checkcast       Lkotlin/jvm/functions/Function1;
        //  6034: astore_1        /* block$iv */
        //  6035: iconst_0       
        //  6036: istore_2        /* $i$f$visible */
        //  6037: aload_0         /* $this$visible$iv */
        //  6038: astore_3       
        //  6039: aload_3        
        //  6040: astore          it$iv
        //  6042: iconst_0       
        //  6043: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6045: aload           it$iv
        //  6047: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6050: dup            
        //  6051: aload_1         /* block$iv */
        //  6052: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6055: checkcast       Ljava/util/function/Predicate;
        //  6058: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6061: aload_3        
        //  6062: nop            
        //  6063: putstatic       me/alpha432/stay/features/modules/combat/StayAura.colorSync$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6066: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6069: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6072: ldc_w           "Red"
        //  6075: sipush          255
        //  6078: new             Lkotlin/ranges/IntRange;
        //  6081: dup            
        //  6082: iconst_0       
        //  6083: sipush          255
        //  6086: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6089: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6092: astore_0       
        //  6093: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderR$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderR$2;
        //  6096: checkcast       Lkotlin/jvm/functions/Function1;
        //  6099: astore_1        /* block$iv */
        //  6100: iconst_0       
        //  6101: istore_2        /* $i$f$visible */
        //  6102: aload_0         /* $this$visible$iv */
        //  6103: astore_3       
        //  6104: aload_3        
        //  6105: astore          it$iv
        //  6107: iconst_0       
        //  6108: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6110: aload           it$iv
        //  6112: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6115: dup            
        //  6116: aload_1         /* block$iv */
        //  6117: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6120: checkcast       Ljava/util/function/Predicate;
        //  6123: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6126: aload_3        
        //  6127: nop            
        //  6128: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderR$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6131: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6134: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6137: ldc_w           "Green"
        //  6140: sipush          255
        //  6143: new             Lkotlin/ranges/IntRange;
        //  6146: dup            
        //  6147: iconst_0       
        //  6148: sipush          255
        //  6151: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6154: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6157: astore_0       
        //  6158: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderG$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderG$2;
        //  6161: checkcast       Lkotlin/jvm/functions/Function1;
        //  6164: astore_1        /* block$iv */
        //  6165: iconst_0       
        //  6166: istore_2        /* $i$f$visible */
        //  6167: aload_0         /* $this$visible$iv */
        //  6168: astore_3       
        //  6169: aload_3        
        //  6170: astore          it$iv
        //  6172: iconst_0       
        //  6173: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6175: aload           it$iv
        //  6177: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6180: dup            
        //  6181: aload_1         /* block$iv */
        //  6182: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6185: checkcast       Ljava/util/function/Predicate;
        //  6188: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6191: aload_3        
        //  6192: nop            
        //  6193: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderG$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6196: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6199: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6202: ldc_w           "Blue"
        //  6205: sipush          255
        //  6208: new             Lkotlin/ranges/IntRange;
        //  6211: dup            
        //  6212: iconst_0       
        //  6213: sipush          255
        //  6216: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6219: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6222: astore_0       
        //  6223: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderB$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderB$2;
        //  6226: checkcast       Lkotlin/jvm/functions/Function1;
        //  6229: astore_1        /* block$iv */
        //  6230: iconst_0       
        //  6231: istore_2        /* $i$f$visible */
        //  6232: aload_0         /* $this$visible$iv */
        //  6233: astore_3       
        //  6234: aload_3        
        //  6235: astore          it$iv
        //  6237: iconst_0       
        //  6238: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6240: aload           it$iv
        //  6242: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6245: dup            
        //  6246: aload_1         /* block$iv */
        //  6247: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6250: checkcast       Ljava/util/function/Predicate;
        //  6253: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6256: aload_3        
        //  6257: nop            
        //  6258: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderB$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6261: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6264: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6267: ldc_w           "Alpha"
        //  6270: bipush          70
        //  6272: new             Lkotlin/ranges/IntRange;
        //  6275: dup            
        //  6276: iconst_0       
        //  6277: sipush          255
        //  6280: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6283: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6286: astore_0       
        //  6287: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderA$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderA$2;
        //  6290: checkcast       Lkotlin/jvm/functions/Function1;
        //  6293: astore_1        /* block$iv */
        //  6294: iconst_0       
        //  6295: istore_2        /* $i$f$visible */
        //  6296: aload_0         /* $this$visible$iv */
        //  6297: astore_3       
        //  6298: aload_3        
        //  6299: astore          it$iv
        //  6301: iconst_0       
        //  6302: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6304: aload           it$iv
        //  6306: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6309: dup            
        //  6310: aload_1         /* block$iv */
        //  6311: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6314: checkcast       Ljava/util/function/Predicate;
        //  6317: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6320: aload_3        
        //  6321: nop            
        //  6322: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderA$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6325: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6328: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6331: ldc_w           "Outline"
        //  6334: iconst_1       
        //  6335: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Z)Lme/alpha432/stay/util/delegate/Value;
        //  6338: astore_0       
        //  6339: getstatic       me/alpha432/stay/features/modules/combat/StayAura$outline$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$outline$2;
        //  6342: checkcast       Lkotlin/jvm/functions/Function1;
        //  6345: astore_1        /* block$iv */
        //  6346: iconst_0       
        //  6347: istore_2        /* $i$f$visible */
        //  6348: aload_0         /* $this$visible$iv */
        //  6349: astore_3       
        //  6350: aload_3        
        //  6351: astore          it$iv
        //  6353: iconst_0       
        //  6354: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6356: aload           it$iv
        //  6358: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6361: dup            
        //  6362: aload_1         /* block$iv */
        //  6363: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6366: checkcast       Ljava/util/function/Predicate;
        //  6369: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6372: aload_3        
        //  6373: nop            
        //  6374: putstatic       me/alpha432/stay/features/modules/combat/StayAura.outline$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6377: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6380: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6383: ldc_w           "Line Width"
        //  6386: ldc2_w          3.0
        //  6389: dconst_0       
        //  6390: ldc2_w          5.0
        //  6393: invokestatic    kotlin/ranges/RangesKt.rangeTo:(DD)Lkotlin/ranges/ClosedFloatingPointRange;
        //  6396: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;DLkotlin/ranges/ClosedFloatingPointRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6399: astore_0       
        //  6400: getstatic       me/alpha432/stay/features/modules/combat/StayAura$width$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$width$2;
        //  6403: checkcast       Lkotlin/jvm/functions/Function1;
        //  6406: astore_1        /* block$iv */
        //  6407: iconst_0       
        //  6408: istore_2        /* $i$f$visible */
        //  6409: aload_0         /* $this$visible$iv */
        //  6410: astore_3       
        //  6411: aload_3        
        //  6412: astore          it$iv
        //  6414: iconst_0       
        //  6415: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6417: aload           it$iv
        //  6419: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6422: dup            
        //  6423: aload_1         /* block$iv */
        //  6424: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6427: checkcast       Ljava/util/function/Predicate;
        //  6430: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6433: aload_3        
        //  6434: nop            
        //  6435: putstatic       me/alpha432/stay/features/modules/combat/StayAura.width$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6438: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6441: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6444: ldc_w           "OutlineAlpha"
        //  6447: sipush          255
        //  6450: new             Lkotlin/ranges/IntRange;
        //  6453: dup            
        //  6454: iconst_0       
        //  6455: sipush          255
        //  6458: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6461: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6464: astore_0       
        //  6465: getstatic       me/alpha432/stay/features/modules/combat/StayAura$outlineA$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$outlineA$2;
        //  6468: checkcast       Lkotlin/jvm/functions/Function1;
        //  6471: astore_1        /* block$iv */
        //  6472: iconst_0       
        //  6473: istore_2        /* $i$f$visible */
        //  6474: aload_0         /* $this$visible$iv */
        //  6475: astore_3       
        //  6476: aload_3        
        //  6477: astore          it$iv
        //  6479: iconst_0       
        //  6480: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6482: aload           it$iv
        //  6484: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6487: dup            
        //  6488: aload_1         /* block$iv */
        //  6489: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6492: checkcast       Ljava/util/function/Predicate;
        //  6495: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6498: aload_3        
        //  6499: nop            
        //  6500: putstatic       me/alpha432/stay/features/modules/combat/StayAura.outlineA$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6503: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6506: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6509: ldc_w           "Text Red"
        //  6512: sipush          255
        //  6515: new             Lkotlin/ranges/IntRange;
        //  6518: dup            
        //  6519: iconst_0       
        //  6520: sipush          255
        //  6523: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6526: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6529: astore_0       
        //  6530: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderTR$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderTR$2;
        //  6533: checkcast       Lkotlin/jvm/functions/Function1;
        //  6536: astore_1        /* block$iv */
        //  6537: iconst_0       
        //  6538: istore_2        /* $i$f$visible */
        //  6539: aload_0         /* $this$visible$iv */
        //  6540: astore_3       
        //  6541: aload_3        
        //  6542: astore          it$iv
        //  6544: iconst_0       
        //  6545: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6547: aload           it$iv
        //  6549: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6552: dup            
        //  6553: aload_1         /* block$iv */
        //  6554: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6557: checkcast       Ljava/util/function/Predicate;
        //  6560: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6563: aload_3        
        //  6564: nop            
        //  6565: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderTR$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6568: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6571: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6574: ldc_w           "Text Green"
        //  6577: sipush          255
        //  6580: new             Lkotlin/ranges/IntRange;
        //  6583: dup            
        //  6584: iconst_0       
        //  6585: sipush          255
        //  6588: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6591: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6594: astore_0       
        //  6595: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderTG$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderTG$2;
        //  6598: checkcast       Lkotlin/jvm/functions/Function1;
        //  6601: astore_1        /* block$iv */
        //  6602: iconst_0       
        //  6603: istore_2        /* $i$f$visible */
        //  6604: aload_0         /* $this$visible$iv */
        //  6605: astore_3       
        //  6606: aload_3        
        //  6607: astore          it$iv
        //  6609: iconst_0       
        //  6610: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6612: aload           it$iv
        //  6614: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6617: dup            
        //  6618: aload_1         /* block$iv */
        //  6619: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6622: checkcast       Ljava/util/function/Predicate;
        //  6625: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6628: aload_3        
        //  6629: nop            
        //  6630: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderTG$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6633: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6636: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6639: ldc_w           "Text Blue"
        //  6642: sipush          255
        //  6645: new             Lkotlin/ranges/IntRange;
        //  6648: dup            
        //  6649: iconst_0       
        //  6650: sipush          255
        //  6653: invokespecial   kotlin/ranges/IntRange.<init>:(II)V
        //  6656: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;ILkotlin/ranges/IntRange;)Lme/alpha432/stay/util/delegate/Value;
        //  6659: astore_0       
        //  6660: getstatic       me/alpha432/stay/features/modules/combat/StayAura$renderTB$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$renderTB$2;
        //  6663: checkcast       Lkotlin/jvm/functions/Function1;
        //  6666: astore_1        /* block$iv */
        //  6667: iconst_0       
        //  6668: istore_2        /* $i$f$visible */
        //  6669: aload_0         /* $this$visible$iv */
        //  6670: astore_3       
        //  6671: aload_3        
        //  6672: astore          it$iv
        //  6674: iconst_0       
        //  6675: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6677: aload           it$iv
        //  6679: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6682: dup            
        //  6683: aload_1         /* block$iv */
        //  6684: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6687: checkcast       Ljava/util/function/Predicate;
        //  6690: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6693: aload_3        
        //  6694: nop            
        //  6695: putstatic       me/alpha432/stay/features/modules/combat/StayAura.renderTB$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6698: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6701: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6704: ldc_w           "Hud Info"
        //  6707: getstatic       me/alpha432/stay/features/modules/combat/StayAura$HudInfoMode.DELAY:Lme/alpha432/stay/features/modules/combat/StayAura$HudInfoMode;
        //  6710: checkcast       Ljava/lang/Enum;
        //  6713: invokestatic    me/alpha432/stay/util/delegate/SettingsKt.setting:(Lme/alpha432/stay/features/modules/Module;Ljava/lang/String;Ljava/lang/Enum;)Lme/alpha432/stay/util/delegate/Value;
        //  6716: astore_0       
        //  6717: getstatic       me/alpha432/stay/features/modules/combat/StayAura$hudMode$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$hudMode$2;
        //  6720: checkcast       Lkotlin/jvm/functions/Function1;
        //  6723: astore_1        /* block$iv */
        //  6724: iconst_0       
        //  6725: istore_2        /* $i$f$visible */
        //  6726: aload_0         /* $this$visible$iv */
        //  6727: astore_3       
        //  6728: aload_3        
        //  6729: astore          it$iv
        //  6731: iconst_0       
        //  6732: istore          $i$a$-also-ValueKt$visible$1$iv
        //  6734: aload           it$iv
        //  6736: new             Lme/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0;
        //  6739: dup            
        //  6740: aload_1         /* block$iv */
        //  6741: invokespecial   me/alpha432/stay/util/extension/ValueKt$sam$i$java_util_function_Predicate$0.<init>:(Lkotlin/jvm/functions/Function1;)V
        //  6744: checkcast       Ljava/util/function/Predicate;
        //  6747: invokevirtual   me/alpha432/stay/util/delegate/Value.setVisibility:(Ljava/util/function/Predicate;)V
        //  6750: aload_3        
        //  6751: nop            
        //  6752: putstatic       me/alpha432/stay/features/modules/combat/StayAura.hudMode$delegate:Lme/alpha432/stay/util/delegate/Value;
        //  6755: new             Lme/alpha432/stay/util/counting/Timer;
        //  6758: dup            
        //  6759: invokespecial   me/alpha432/stay/util/counting/Timer.<init>:()V
        //  6762: putstatic       me/alpha432/stay/features/modules/combat/StayAura.placeTimer:Lme/alpha432/stay/util/counting/Timer;
        //  6765: new             Lme/alpha432/stay/util/counting/Timer;
        //  6768: dup            
        //  6769: invokespecial   me/alpha432/stay/util/counting/Timer.<init>:()V
        //  6772: putstatic       me/alpha432/stay/features/modules/combat/StayAura.breakTimer:Lme/alpha432/stay/util/counting/Timer;
        //  6775: new             Lme/alpha432/stay/util/counting/Timer;
        //  6778: dup            
        //  6779: invokespecial   me/alpha432/stay/util/counting/Timer.<init>:()V
        //  6782: putstatic       me/alpha432/stay/features/modules/combat/StayAura.packetTimer:Lme/alpha432/stay/util/counting/Timer;
        //  6785: new             Lme/alpha432/stay/util/counting/Timer;
        //  6788: dup            
        //  6789: invokespecial   me/alpha432/stay/util/counting/Timer.<init>:()V
        //  6792: putstatic       me/alpha432/stay/features/modules/combat/StayAura.predictBreakTimer:Lme/alpha432/stay/util/counting/Timer;
        //  6795: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //  6798: dup            
        //  6799: iconst_m1      
        //  6800: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:(I)V
        //  6803: putstatic       me/alpha432/stay/features/modules/combat/StayAura.crystalID:Ljava/util/concurrent/atomic/AtomicInteger;
        //  6806: new             Lme/alpha432/stay/util/graphics/animations/BlockEasingRender;
        //  6809: dup            
        //  6810: new             Lnet/minecraft/util/math/BlockPos;
        //  6813: dup            
        //  6814: iconst_0       
        //  6815: iconst_0       
        //  6816: iconst_0       
        //  6817: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //  6820: ldc_w           500.0
        //  6823: ldc_w           500.0
        //  6826: invokespecial   me/alpha432/stay/util/graphics/animations/BlockEasingRender.<init>:(Lnet/minecraft/util/math/BlockPos;FF)V
        //  6829: putstatic       me/alpha432/stay/features/modules/combat/StayAura.smoothRender:Lme/alpha432/stay/util/graphics/animations/BlockEasingRender;
        //  6832: bipush          10
        //  6834: ldc_w           "StayAura"
        //  6837: invokestatic    kotlinx/coroutines/ThreadPoolDispatcherKt.newFixedThreadPoolContext:(ILjava/lang/String;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;
        //  6840: checkcast       Lkotlin/coroutines/CoroutineContext;
        //  6843: invokestatic    kotlinx/coroutines/CoroutineScopeKt.CoroutineScope:(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
        //  6846: putstatic       me/alpha432/stay/features/modules/combat/StayAura.auraScope:Lkotlinx/coroutines/CoroutineScope;
        //  6849: new             Ljava/lang/Object;
        //  6852: dup            
        //  6853: invokespecial   java/lang/Object.<init>:()V
        //  6856: putstatic       me/alpha432/stay/features/modules/combat/StayAura.lock:Ljava/lang/Object;
        //  6859: invokestatic    java/lang/System.currentTimeMillis:()J
        //  6862: putstatic       me/alpha432/stay/features/modules/combat/StayAura.lastPlaceTime:J
        //  6865: invokestatic    java/lang/System.currentTimeMillis:()J
        //  6868: putstatic       me/alpha432/stay/features/modules/combat/StayAura.currentPlaceTime:J
        //  6871: ldc_w           ""
        //  6874: putstatic       me/alpha432/stay/features/modules/combat/StayAura.currentAction:Ljava/lang/String;
        //  6877: new             Lme/alpha432/stay/util/counting/Timer;
        //  6880: dup            
        //  6881: invokespecial   me/alpha432/stay/util/counting/Timer.<init>:()V
        //  6884: putstatic       me/alpha432/stay/features/modules/combat/StayAura.countTimer:Lme/alpha432/stay/util/counting/Timer;
        //  6887: new             Ljava/lang/Object;
        //  6890: dup            
        //  6891: invokespecial   java/lang/Object.<init>:()V
        //  6894: putstatic       me/alpha432/stay/features/modules/combat/StayAura.crystalLock:Ljava/lang/Object;
        //  6897: nop            
        //  6898: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6901: getstatic       me/alpha432/stay/features/modules/combat/StayAura$1.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$1;
        //  6904: checkcast       Lkotlin/jvm/functions/Function0;
        //  6907: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura.onEnable:(Lkotlin/jvm/functions/Function0;)V
        //  6910: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6913: getstatic       me/alpha432/stay/features/modules/combat/StayAura$2.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$2;
        //  6916: checkcast       Lkotlin/jvm/functions/Function0;
        //  6919: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura.onDisable:(Lkotlin/jvm/functions/Function0;)V
        //  6922: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6925: getstatic       me/alpha432/stay/features/modules/combat/StayAura$3.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$3;
        //  6928: checkcast       Lkotlin/jvm/functions/Function0;
        //  6931: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura.onTick:(Lkotlin/jvm/functions/Function0;)V
        //  6934: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6937: getstatic       me/alpha432/stay/features/modules/combat/StayAura$4.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$4;
        //  6940: checkcast       Lkotlin/jvm/functions/Function1;
        //  6943: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura.onRenderTick:(Lkotlin/jvm/functions/Function1;)V
        //  6946: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6949: getstatic       me/alpha432/stay/features/modules/combat/StayAura$5.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$5;
        //  6952: checkcast       Lkotlin/jvm/functions/Function1;
        //  6955: invokevirtual   me/alpha432/stay/features/modules/combat/StayAura.onRender3D:(Lkotlin/jvm/functions/Function1;)V
        //  6958: getstatic       me/alpha432/stay/features/modules/combat/StayAura.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura;
        //  6961: checkcast       Lme/alpha432/stay/features/modules/Module;
        //  6964: astore_0       
        //  6965: getstatic       me/alpha432/stay/features/modules/combat/StayAura$6.INSTANCE:Lme/alpha432/stay/features/modules/combat/StayAura$6;
        //  6968: checkcast       Lkotlin/jvm/functions/Function1;
        //  6971: astore_1        /* function$iv */
        //  6972: iconst_0       
        //  6973: istore_2        /* $i$f$safeListener */
        //  6974: getstatic       me/alpha432/stay/event/Listener.INSTANCE:Lme/alpha432/stay/event/Listener;
        //  6977: astore_3       
        //  6978: ldc_w           Lnet/minecraftforge/client/event/RenderWorldLastEvent;.class
        //  6981: astore          clazz$iv$iv
        //  6983: iconst_0       
        //  6984: istore          $i$f$register
        //  6986: aload_3         /* this_$iv$iv */
        //  6987: invokevirtual   me/alpha432/stay/event/Listener.getListeners:()Ljava/util/List;
        //  6990: aload           clazz$iv$iv
        //  6992: aload_1         /* function$iv */
        //  6993: iconst_1       
        //  6994: invokestatic    kotlin/jvm/internal/TypeIntrinsics.beforeCheckcastToFunctionOfArity:(Ljava/lang/Object;I)Ljava/lang/Object;
        //  6997: checkcast       Lkotlin/jvm/functions/Function1;
        //  7000: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  7003: aload_0         /* $this$safeListener$iv */
        //  7004: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //  7007: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  7012: pop            
        //  7013: nop            
        //  7014: nop            
        //  7015: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$Pages;", "", "(Ljava/lang/String;I)V", "GENERAL", "PLACE", "BREAK", "BYPASS", "Modification", "UNSAFE", "RENDER", "Stay" })
    private enum Pages
    {
        GENERAL, 
        PLACE, 
        BREAK, 
        BYPASS, 
        Modification, 
        UNSAFE, 
        RENDER;
        
        private static final /* synthetic */ Pages[] $values() {
            return new Pages[] { Pages.GENERAL, Pages.PLACE, Pages.BREAK, Pages.BYPASS, Pages.Modification, Pages.UNSAFE, Pages.RENDER };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u001a\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\u0010\u0006R%\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$TargetMode;", "", "handler", "Lkotlin/Function1;", "", "Lnet/minecraft/entity/EntityLivingBase;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getHandler", "()Lkotlin/jvm/functions/Function1;", "DISTANCE", "Stay" })
    private enum TargetMode
    {
        @NotNull
        private final Function1<List<? extends EntityLivingBase>, EntityLivingBase> handler;
        
        DISTANCE((Function1<? super List<? extends EntityLivingBase>, ? extends EntityLivingBase>)StayAura$TargetMode$1.INSTANCE);
        
        private TargetMode(final Function1<? super List<? extends EntityLivingBase>, ? extends EntityLivingBase> handler) {
            this.handler = (Function1<List<? extends EntityLivingBase>, EntityLivingBase>)handler;
        }
        
        @NotNull
        public final Function1<List<? extends EntityLivingBase>, EntityLivingBase> getHandler() {
            return this.handler;
        }
        
        private static final /* synthetic */ TargetMode[] $values() {
            return new TargetMode[] { TargetMode.DISTANCE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$SwitchMode;", "", "(Ljava/lang/String;I)V", "NORMAL", "GHOSTHAND", "Stay" })
    private enum SwitchMode
    {
        NORMAL, 
        GHOSTHAND;
        
        private static final /* synthetic */ SwitchMode[] $values() {
            return new SwitchMode[] { SwitchMode.NORMAL, SwitchMode.GHOSTHAND };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$PlaceCalcMode;", "", "(Ljava/lang/String;I)V", "DEFAULT", "DYNAMIC", "COMPLETELY", "Stay" })
    private enum PlaceCalcMode
    {
        DEFAULT, 
        DYNAMIC, 
        COMPLETELY;
        
        private static final /* synthetic */ PlaceCalcMode[] $values() {
            return new PlaceCalcMode[] { PlaceCalcMode.DEFAULT, PlaceCalcMode.DYNAMIC, PlaceCalcMode.COMPLETELY };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$BreakMode;", "", "(Ljava/lang/String;I)V", "ALWAYS", "CALCULATION", "Stay" })
    private enum BreakMode
    {
        ALWAYS, 
        CALCULATION;
        
        private static final /* synthetic */ BreakMode[] $values() {
            return new BreakMode[] { BreakMode.ALWAYS, BreakMode.CALCULATION };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$BreakHand;", "", "(Ljava/lang/String;I)V", "MAIN", "OFFHAND", "NONE", "Stay" })
    private enum BreakHand
    {
        MAIN, 
        OFFHAND, 
        NONE;
        
        private static final /* synthetic */ BreakHand[] $values() {
            return new BreakHand[] { BreakHand.MAIN, BreakHand.OFFHAND, BreakHand.NONE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$BreakCalcMode;", "", "(Ljava/lang/String;I)V", "DEFAULT", "DYNAMIC", "COMPLETELY", "Stay" })
    private enum BreakCalcMode
    {
        DEFAULT, 
        DYNAMIC, 
        COMPLETELY;
        
        private static final /* synthetic */ BreakCalcMode[] $values() {
            return new BreakCalcMode[] { BreakCalcMode.DEFAULT, BreakCalcMode.DYNAMIC, BreakCalcMode.COMPLETELY };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$BypassMode;", "", "(Ljava/lang/String;I)V", "ENTITYIGNORE", "Stay" })
    private enum BypassMode
    {
        ENTITYIGNORE;
        
        private static final /* synthetic */ BypassMode[] $values() {
            return new BypassMode[] { BypassMode.ENTITYIGNORE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$ActionPriority;", "", "(Ljava/lang/String;I)V", "PLACE_BREAK", "BREAK_PLACE", "Stay" })
    private enum ActionPriority
    {
        PLACE_BREAK, 
        BREAK_PLACE;
        
        private static final /* synthetic */ ActionPriority[] $values() {
            return new ActionPriority[] { ActionPriority.PLACE_BREAK, ActionPriority.BREAK_PLACE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$PopTotemTryingProtection;", "", "(Ljava/lang/String;I)V", "CHANCE", "SELFDAMAGE", "SELFHEALTH", "Stay" })
    private enum PopTotemTryingProtection
    {
        CHANCE, 
        SELFDAMAGE, 
        SELFHEALTH;
        
        private static final /* synthetic */ PopTotemTryingProtection[] $values() {
            return new PopTotemTryingProtection[] { PopTotemTryingProtection.CHANCE, PopTotemTryingProtection.SELFDAMAGE, PopTotemTryingProtection.SELFHEALTH };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$OverrideMode;", "", "(Ljava/lang/String;I)V", "TARGETDAMAGE", "SELFDAMAGE", "DISTANCE", "Stay" })
    private enum OverrideMode
    {
        TARGETDAMAGE, 
        SELFDAMAGE, 
        DISTANCE;
        
        private static final /* synthetic */ OverrideMode[] $values() {
            return new OverrideMode[] { OverrideMode.TARGETDAMAGE, OverrideMode.SELFDAMAGE, OverrideMode.DISTANCE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$NullChecked;", "", "(Ljava/lang/String;I)V", "FIRST", "SECOND", "Stay" })
    private enum NullChecked
    {
        FIRST, 
        SECOND;
        
        private static final /* synthetic */ NullChecked[] $values() {
            return new NullChecked[] { NullChecked.FIRST, NullChecked.SECOND };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$RenderMode;", "", "(Ljava/lang/String;I)V", "CLASSIC", "DYNAMIC", "Stay" })
    private enum RenderMode
    {
        CLASSIC, 
        DYNAMIC;
        
        private static final /* synthetic */ RenderMode[] $values() {
            return new RenderMode[] { RenderMode.CLASSIC, RenderMode.DYNAMIC };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$HudInfoMode;", "", "(Ljava/lang/String;I)V", "TARGET", "DELAY", "ACTION", "SPEED", "DMG", "NONE", "Stay" })
    private enum HudInfoMode
    {
        TARGET, 
        DELAY, 
        ACTION, 
        SPEED, 
        DMG, 
        NONE;
        
        private static final /* synthetic */ HudInfoMode[] $values() {
            return new HudInfoMode[] { HudInfoMode.TARGET, HudInfoMode.DELAY, HudInfoMode.ACTION, HudInfoMode.SPEED, HudInfoMode.DMG, HudInfoMode.NONE };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d" }, d2 = { "Lme/alpha432/stay/features/modules/combat/StayAura$CrystalTarget;", "", "blockPos", "Lnet/minecraft/util/math/BlockPos;", "target", "Lnet/minecraft/entity/EntityLivingBase;", "targetDamage", "", "selfDamage", "(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;DD)V", "getBlockPos", "()Lnet/minecraft/util/math/BlockPos;", "getSelfDamage", "()D", "getTarget", "()Lnet/minecraft/entity/EntityLivingBase;", "getTargetDamage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Stay" })
    private static final class CrystalTarget
    {
        @Nullable
        private final BlockPos blockPos;
        @Nullable
        private final EntityLivingBase target;
        private final double targetDamage;
        private final double selfDamage;
        
        public CrystalTarget(@Nullable final BlockPos blockPos, @Nullable final EntityLivingBase target, final double targetDamage, final double selfDamage) {
            this.blockPos = blockPos;
            this.target = target;
            this.targetDamage = targetDamage;
            this.selfDamage = selfDamage;
        }
        
        @Nullable
        public final BlockPos getBlockPos() {
            return this.blockPos;
        }
        
        @Nullable
        public final EntityLivingBase getTarget() {
            return this.target;
        }
        
        public final double getTargetDamage() {
            return this.targetDamage;
        }
        
        public final double getSelfDamage() {
            return this.selfDamage;
        }
        
        @Nullable
        public final BlockPos component1() {
            return this.blockPos;
        }
        
        @Nullable
        public final EntityLivingBase component2() {
            return this.target;
        }
        
        public final double component3() {
            return this.targetDamage;
        }
        
        public final double component4() {
            return this.selfDamage;
        }
        
        @NotNull
        public final CrystalTarget copy(@Nullable final BlockPos blockPos, @Nullable final EntityLivingBase target, final double targetDamage, final double selfDamage) {
            return new CrystalTarget(blockPos, target, targetDamage, selfDamage);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "CrystalTarget(blockPos=" + this.blockPos + ", target=" + this.target + ", targetDamage=" + this.targetDamage + ", selfDamage=" + this.selfDamage + ')';
        }
        
        @Override
        public int hashCode() {
            int result = (this.blockPos == null) ? 0 : this.blockPos.hashCode();
            result = result * 31 + ((this.target == null) ? 0 : this.target.hashCode());
            result = result * 31 + Double.hashCode(this.targetDamage);
            result = result * 31 + Double.hashCode(this.selfDamage);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrystalTarget)) {
                return false;
            }
            final CrystalTarget crystalTarget = (CrystalTarget)other;
            return Intrinsics.areEqual((Object)this.blockPos, (Object)crystalTarget.blockPos) && Intrinsics.areEqual((Object)this.target, (Object)crystalTarget.target) && Intrinsics.areEqual((Object)this.targetDamage, (Object)crystalTarget.targetDamage) && Intrinsics.areEqual((Object)this.selfDamage, (Object)crystalTarget.selfDamage);
        }
    }
}
