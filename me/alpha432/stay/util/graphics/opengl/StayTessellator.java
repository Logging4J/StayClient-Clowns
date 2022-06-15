//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.graphics.opengl;

import cakeslayers.team.eventsystem.utils.*;
import kotlin.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.util.math.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.player.*;
import me.alpha432.stay.util.basement.wrapper.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.block.state.*;
import net.minecraft.client.entity.*;
import java.awt.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007J6\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0007J.\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007J6\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J6\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J6\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J6\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J6\u0010\"\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J\u001e\u0010\"\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007J6\u0010\"\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J.\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J.\u0010#\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J6\u0010$\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J.\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007Jf\u0010%\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J>\u0010%\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J\u001e\u0010%\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J\u001e\u0010%\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J6\u0010%\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J>\u0010%\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007J\u001e\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J6\u0010%\u001a\u00020\u00052\u0006\u00102\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J6\u00103\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J&\u00104\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007J^\u00104\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007J\u0016\u00104\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0007J.\u00104\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007J.\u00105\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J^\u00106\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J\u001e\u00106\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00107\u001a\u0002082\u0006\u0010)\u001a\u00020\u0007J6\u00106\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J6\u00109\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007Jf\u0010:\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J>\u0010:\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J\u001e\u0010:\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J6\u0010:\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0010J\u001e\u0010=\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007J6\u0010=\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J>\u0010=\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J\u001e\u0010=\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007J6\u0010=\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007J.\u0010>\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J\u001e\u0010>\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J6\u0010>\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007Jf\u0010?\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007Jf\u0010@\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J6\u0010A\u001a\u00020\u00052\u0006\u00102\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007J.\u0010B\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020CJf\u0010B\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020CJ6\u0010B\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010)\u001a\u00020CJ\u001e\u0010B\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010)\u001a\u00020CJ\u000e\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u0018J\u0006\u0010F\u001a\u00020+J\u001e\u0010G\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rJ.\u0010H\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\rJ\u0016\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\rJ\u0016\u0010P\u001a\u00020 2\u0006\u0010M\u001a\u00020N2\u0006\u0010\f\u001a\u00020\rJ\b\u0010Q\u001a\u00020\rH\u0007J\u000e\u0010R\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010R\u001a\u00020\u00052\u0006\u0010S\u001a\u00020CJ\u0006\u0010T\u001a\u00020\u0005J\u0006\u0010U\u001a\u00020\u0005J\u0006\u0010V\u001a\u00020\u0005J\u0006\u0010W\u001a\u00020\u0005J\u0006\u0010E\u001a\u00020\u0005¨\u0006X" }, d2 = { "Lme/alpha432/stay/util/graphics/opengl/StayTessellator;", "Lnet/minecraft/client/renderer/Tessellator;", "Lcakeslayers/team/eventsystem/utils/Helper;", "()V", "begin", "", "mode", "", "calculateDistanceWithPartialTicks", "", "n", "n2", "renderPartialTicks", "", "drawBoundingBox", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "width", "argb", "r", "g", "b", "alpha", "qwq", "Lnet/minecraft/util/math/BlockPos;", "pos", "red", "green", "blue", "drawBoundingBoxBlockPos", "bp", "hitVec", "Lnet/minecraft/util/math/Vec3d;", "drawBoundingBoxBottomBlockPos", "drawBoundingBoxKA", "drawBoundingFullBox", "drawBoundingGay", "drawBox", "x", "y", "z", "sides", "buffer", "Lnet/minecraft/client/renderer/BufferBuilder;", "w", "h", "d", "a", "blockPos", "s", "vec3d", "drawBox2", "drawBoxBottom", "drawBoxSmall", "drawBoxTest", "color", "Ljava/awt/Color;", "drawBoxTests", "drawFace", "drawFilledBox", "axisAlignedBB", "drawFullBox", "drawHalfBox", "drawHead", "drawLines", "drawSmallBox", "draw_cube_line", "", "getBoundingFromPos", "render", "getBufferBuilder", "glBillboard", "glBillboardDistanceScaled", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "scale", "interpolateEntity", "entity", "Lnet/minecraft/entity/Entity;", "time", "interpolateEntityClose", "pTicks", "prepare", "mode_requested", "prepareGL", "prepare_gl", "release", "releaseGL", "Stay" })
public final class StayTessellator extends Tessellator implements Helper
{
    @NotNull
    public static final StayTessellator INSTANCE;
    
    private StayTessellator() {
        super(2097152);
    }
    
    @JvmStatic
    public static final float pTicks() {
        return StayTessellator.INSTANCE.getMc().isGamePaused ? StayTessellator.INSTANCE.getMc().renderPartialTicksPaused : StayTessellator.INSTANCE.getMc().getRenderPartialTicks();
    }
    
    public final void drawBox(@NotNull final BlockPos blockPos, final int r, final int g, final int b, final int a, final int sides, final int s) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, (float)blockPos.getX(), (float)blockPos.getY(), (float)blockPos.getZ(), 1.0f, 1.0f, 1.0f, r, g, b, a, sides);
    }
    
    public final void prepare(final int mode) {
        this.prepareGL();
        this.begin(mode);
    }
    
    public final void prepare(@NotNull final String mode_requested) {
        Intrinsics.checkNotNullParameter((Object)mode_requested, "mode_requested");
        int mode = 0;
        if (StringsKt.equals(mode_requested, "quads", true)) {
            mode = 7;
        }
        else if (StringsKt.equals(mode_requested, "lines", true)) {
            mode = 1;
        }
        this.prepare_gl();
        this.begin(mode);
    }
    
    public final void prepare_gl() {
        GL11.glBlendFunc(770, 771);
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.glLineWidth(1.5f);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.disableLighting();
        GlStateManager.disableCull();
        GlStateManager.enableAlpha();
        GlStateManager.color(1.0f, 1.0f, 1.0f);
        GL11.glLineWidth(2.0f);
    }
    
    public final void draw_cube_line(@NotNull final BlockPos blockPos, final int argb, @NotNull final String sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.draw_cube_line(blockPos, r, g, b, a, sides);
    }
    
    public final void draw_cube_line(final float x, final float y, final float z, final int argb, @NotNull final String sides) {
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.draw_cube_line(getBuffer, x, y, z, 1.0f, 0.5645f, 1.0f, r, g, b, a, sides);
    }
    
    public final void draw_cube_line(@NotNull final BlockPos blockPos, final int r, final int g, final int b, final int a, @NotNull final String sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.draw_cube_line(getBuffer, (float)blockPos.getX(), (float)blockPos.getY(), (float)blockPos.getZ(), 1.0f, 1.0f, 1.0f, r, g, b, a, sides);
    }
    
    public final void drawBox2(@NotNull final AxisAlignedBB bb, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        if ((sides & 0x1) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x2) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x4) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x8) != 0x0) {
            bufferBuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x10) != 0x0) {
            bufferBuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x20) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        tessellator.draw();
    }
    
    public final void drawBoxSmall(final float x, final float y, final float z, final int argb, final int sides) {
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, x, y, z, 0.25f, 0.25f, 0.25f, r, g, b, a, sides);
    }
    
    public final void prepareGL() {
        GL11.glBlendFunc(770, 771);
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.glLineWidth(1.5f);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.disableLighting();
        GlStateManager.disableCull();
        GlStateManager.enableAlpha();
        GlStateManager.color(1.0f, 1.0f, 1.0f);
    }
    
    public final void begin(final int mode) {
        this.getBuffer().begin(mode, DefaultVertexFormats.POSITION_COLOR);
    }
    
    public final void release() {
        this.render();
        this.releaseGL();
    }
    
    public final void render() {
        this.draw();
    }
    
    public final void releaseGL() {
        GlStateManager.enableCull();
        GlStateManager.depthMask(true);
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.enableDepth();
        GlStateManager.color(1.0f, 1.0f, 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public final void drawFace(@NotNull final BlockPos blockPos, final int argb, final int sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawFace(blockPos, r, g, b, a, sides);
    }
    
    public final void drawFace(@NotNull final BlockPos blockPos, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawFace(getBuffer, (float)blockPos.getX(), (float)blockPos.getY(), (float)blockPos.getZ(), 1.0f, 1.0f, 1.0f, r, g, b, a, sides);
    }
    
    public final void drawFace(@NotNull final BufferBuilder buffer, final float x, final float y, final float z, final float w, final float h, final float d, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        if ((sides & 0x1) != 0x0) {
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
        }
    }
    
    public final void drawFace(@NotNull final BufferBuilder buffer, @NotNull final AxisAlignedBB bb, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        if ((sides & 0x1) != 0x0) {
            buffer.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
        }
    }
    
    public final void drawFullBox(@NotNull final AxisAlignedBB bb, @NotNull final BlockPos blockPos, final float width, final int red, final int green, final int blue, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        this.prepare(7);
        this.drawBox(blockPos, red, green, blue, alpha, 63);
        this.release();
        this.drawBoundingBox(bb, width, red, green, blue, 255);
    }
    
    public final void drawBoundingGay(@NotNull final AxisAlignedBB bb, final float width, final int r, final int g, final int b, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(width);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(1, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        GL11.glDisable(2848);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    public final void drawBox(@NotNull final AxisAlignedBB bb, final int argb, final int sides) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, bb, r, g, b, a, sides);
    }
    
    public final void drawBox(@NotNull final BlockPos blockPos, final int argb, final int sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawBox(blockPos, r, g, b, a, sides);
    }
    
    public final void drawHalfBox(@NotNull final BlockPos blockPos, final int argb, final int sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawHalfBox(blockPos, r, g, b, a, sides);
    }
    
    public final void drawHalfBox(final float x, final float y, final float z, final int argb, final int sides) {
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, x, y, z, 1.0f, 0.5f, 1.0f, r, g, b, a, sides);
    }
    
    public final void drawBox(final float x, final float y, final float z, final int argb, final int sides) {
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, x, y, z, 1.0f, 1.0f, 1.0f, r, g, b, a, sides);
    }
    
    public final void drawBox(@NotNull final BlockPos blockPos, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, (float)blockPos.getX(), (float)blockPos.getY(), (float)blockPos.getZ(), 1.0f, 1.0f, 1.0f, r, g, b, a, sides);
    }
    
    public final void drawHalfBox(@NotNull final BlockPos blockPos, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, (float)blockPos.getX(), (float)blockPos.getY(), (float)blockPos.getZ(), 1.0f, 0.5f, 1.0f, r, g, b, a, sides);
    }
    
    public final void drawBox(@NotNull final Vec3d vec3d, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, (float)vec3d.x, (float)vec3d.y, (float)vec3d.z, 1.0f, 1.0f, 1.0f, r, g, b, a, sides);
    }
    
    public final void draw_cube_line(@NotNull final BufferBuilder buffer, final float x, final float y, final float z, final float w, final float h, final float d, final int r, final int g, final int b, final int a, @NotNull final String sides) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        Intrinsics.checkNotNullParameter((Object)sides, "sides");
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("downwest") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("upwest") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("downeast") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("upeast") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("downnorth") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("upnorth") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("downsouth") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("upsouth") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("nortwest") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("norteast") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("southweast") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if (StringsKt.split$default((CharSequence)sides, new String[] { "-" }, false, 0, 6, (Object)null).contains("southeast") || StringsKt.equals(sides, "all", true)) {
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
    }
    
    @NotNull
    public final BufferBuilder getBufferBuilder() {
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        return getBuffer;
    }
    
    public final void drawHead(@NotNull final BufferBuilder buffer, final float x, final float y, final float z, final float w, final float h, final float d, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        if ((sides & 0x2) != 0x0) {
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
    }
    
    public final void drawBox(@NotNull final BufferBuilder buffer, final float x, final float y, final float z, final float w, final float h, final float d, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        if ((sides & 0x1) != 0x0) {
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x2) != 0x0) {
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x4) != 0x0) {
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x8) != 0x0) {
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x10) != 0x0) {
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x20) != 0x0) {
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
    }
    
    public final void drawBox(@NotNull final BufferBuilder buffer, @NotNull final AxisAlignedBB bb, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        if ((sides & 0x1) != 0x0) {
            buffer.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x2) != 0x0) {
            buffer.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x4) != 0x0) {
            buffer.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x8) != 0x0) {
            buffer.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x10) != 0x0) {
            buffer.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x20) != 0x0) {
            buffer.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            buffer.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
    }
    
    public final void drawSmallBox(@NotNull final Vec3d vec3d, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)vec3d, "vec3d");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBox(getBuffer, (float)vec3d.x, (float)vec3d.y, (float)vec3d.z, 0.3f, 0.3f, 0.3f, r, g, b, a, sides);
    }
    
    public final void drawLines(@NotNull final BufferBuilder buffer, final float x, final float y, final float z, final float w, final float h, final float d, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        if ((sides & 0x11) != 0x0) {
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x12) != 0x0) {
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x21) != 0x0) {
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x22) != 0x0) {
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x5) != 0x0) {
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x6) != 0x0) {
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x9) != 0x0) {
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0xA) != 0x0) {
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x14) != 0x0) {
            buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x24) != 0x0) {
            buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)z).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x18) != 0x0) {
            buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)x, (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x28) != 0x0) {
            buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
            buffer.pos((double)(x + w), (double)(y + h), (double)(z + d)).color(r, g, b, a).endVertex();
        }
    }
    
    public final void drawBoundingBox(@NotNull final BlockPos bb, final float width, final int argb) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawBoundingBox(bb, width, r, g, b, a);
    }
    
    public final void drawBoundingBox(@NotNull final AxisAlignedBB bb, final float width, final int argb) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawBoundingBox(bb, width, r, g, b, a);
    }
    
    public final void drawBoundingBoxKA(@NotNull final BlockPos bb, final float width, final int argb) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawBoundingBoxKA(bb, width, r, g, b, a);
    }
    
    public final void drawBoundingBoxKA(@NotNull final BlockPos pos, final float width, final int red, final int green, final int blue, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        this.drawBoundingBox(this.getBoundingFromPos(pos), width, red, green, blue, alpha);
    }
    
    public final void drawBoundingBox(@NotNull final BlockPos pos, final float width, final int red, final int green, final int blue, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        this.drawBoundingBox(this.getBoundingFromPos(pos), width, red, green, blue, alpha);
    }
    
    public final void drawBoundingBox(@NotNull final AxisAlignedBB bb, final int qwq) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        this.drawBoundingBox(bb, qwq, qwq, qwq, qwq);
    }
    
    public final void drawBoundingBox(@NotNull final AxisAlignedBB bb, final int r, final int g, final int b, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(2929);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3553);
        GL11.glDepthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(1, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public final void drawBoundingBox(@NotNull final AxisAlignedBB bb, final float width, final int r, final int g, final int b, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(2929);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3553);
        GL11.glDepthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(width);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(1, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public final void drawBoundingBoxKA(@NotNull final AxisAlignedBB bb, final float width, final int r, final int g, final int b, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(2929);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3553);
        GL11.glDepthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(width);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX - bb.minX, bb.maxY - bb.minY, bb.maxZ - bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(1, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public final void drawBoundingBoxBlockPos(@NotNull final BlockPos bp, final float width, final int r, final int g, final int b, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bp, "bp");
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(width);
        final Minecraft mc = Minecraft.getMinecraft();
        final double x = bp.getX() - mc.getRenderManager().viewerPosX;
        final double y = bp.getY() - mc.getRenderManager().viewerPosY;
        final double z = bp.getZ() - mc.getRenderManager().viewerPosZ;
        final AxisAlignedBB bb = new AxisAlignedBB(x, y, z, x + 1.0, y + 1.0, z + 1.0);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(1, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        GL11.glDisable(2848);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    public final void drawBoundingBoxBlockPos(@NotNull final Vec3d hitVec, final float width, final int r, final int g, final int b, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)hitVec, "hitVec");
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(width);
        final Minecraft mc = Minecraft.getMinecraft();
        final double x = hitVec.x - mc.getRenderManager().viewerPosX;
        final double y = hitVec.y - mc.getRenderManager().viewerPosY;
        final double z = hitVec.z - mc.getRenderManager().viewerPosZ;
        final AxisAlignedBB bb = new AxisAlignedBB(x, y, z, x + 1.0, y + 1.0, z + 1.0);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        bufferbuilder.begin(1, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        GL11.glDisable(2848);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    public final void drawBoundingBoxBottomBlockPos(@NotNull final BlockPos bp, final float width, final int r, final int g, final int b, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bp, "bp");
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(width);
        final Minecraft mc = Minecraft.getMinecraft();
        final double x = bp.getX() - mc.getRenderManager().viewerPosX;
        final double y = bp.getY() - mc.getRenderManager().viewerPosY;
        final double z = bp.getZ() - mc.getRenderManager().viewerPosZ;
        final AxisAlignedBB bb = new AxisAlignedBB(x, y, z, x + 1.0, y + 1.0, z + 1.0);
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, alpha).endVertex();
        bufferbuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, alpha).endVertex();
        tessellator.draw();
        GL11.glDisable(2848);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    public final void drawBoxBottom(@NotNull final BufferBuilder buffer, final float x, final float y, final float z, final float w, final float h, final float d, final int r, final int g, final int b, final int a) {
        Intrinsics.checkNotNullParameter((Object)buffer, "buffer");
        buffer.pos((double)(x + w), (double)y, (double)z).color(r, g, b, a).endVertex();
        buffer.pos((double)(x + w), (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        buffer.pos((double)x, (double)y, (double)(z + d)).color(r, g, b, a).endVertex();
        buffer.pos((double)x, (double)y, (double)z).color(r, g, b, a).endVertex();
    }
    
    public final void drawBoxBottom(@NotNull final BlockPos blockPos, final int argb) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawBoxBottom(blockPos, r, g, b, a);
    }
    
    public final void drawBoxBottom(final float x, final float y, final float z, final int argb) {
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBoxBottom(getBuffer, x, y, z, 1.0f, 1.0f, 1.0f, r, g, b, a);
    }
    
    public final void drawBoxBottom(@NotNull final BlockPos blockPos, final int r, final int g, final int b, final int a) {
        Intrinsics.checkNotNullParameter((Object)blockPos, "blockPos");
        final BufferBuilder getBuffer = this.getBuffer();
        Intrinsics.checkNotNullExpressionValue((Object)getBuffer, "buffer");
        this.drawBoxBottom(getBuffer, (float)blockPos.getX(), (float)blockPos.getY(), (float)blockPos.getZ(), 1.0f, 1.0f, 1.0f, r, g, b, a);
    }
    
    public final void glBillboard(final float x, final float y, final float z) {
        final float scale = 0.02666667f;
        final double n = x;
        final RenderManager getRenderManager = Minecraft.getMinecraft().getRenderManager();
        if (getRenderManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.renderer.entity.RenderManager");
        }
        final double n2 = n - getRenderManager.renderPosX;
        final double n3 = y;
        final RenderManager getRenderManager2 = Minecraft.getMinecraft().getRenderManager();
        if (getRenderManager2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.renderer.entity.RenderManager");
        }
        final double n4 = n3 - getRenderManager2.renderPosY;
        final double n5 = z;
        final RenderManager getRenderManager3 = Minecraft.getMinecraft().getRenderManager();
        if (getRenderManager3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.renderer.entity.RenderManager");
        }
        GlStateManager.translate(n2, n4, n5 - getRenderManager3.renderPosZ);
        GlStateManager.glNormal3f(0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-Minecraft.getMinecraft().player.rotationYaw, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(Minecraft.getMinecraft().player.rotationPitch, (Minecraft.getMinecraft().gameSettings.thirdPersonView == 2) ? -1.0f : 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(-scale, -scale, scale);
    }
    
    public final void glBillboardDistanceScaled(final float x, final float y, final float z, @NotNull final EntityPlayer player, final float scale) {
        Intrinsics.checkNotNullParameter((Object)player, "player");
        this.glBillboard(x, y, z);
        final int distance = (int)player.getDistance((double)x, (double)y, (double)z);
        float scaleDistance = distance / 2.0f / (2.0f + (2.0f - scale));
        if (scaleDistance < 1.0f) {
            scaleDistance = 1.0f;
        }
        GlStateManager.scale(scaleDistance, scaleDistance, scaleDistance);
    }
    
    public final void drawBox(@NotNull final Vec3d hitVec, final int argb, final int sides) {
        Intrinsics.checkNotNullParameter((Object)hitVec, "hitVec");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawBox(hitVec, r, g, b, a, sides);
    }
    
    public final void drawFullBox(@NotNull final BlockPos pos, final float width, final int argb) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawFullBox(pos, width, r, g, b, a);
    }
    
    public final void drawFullBox(@NotNull final BlockPos pos, final float width, final int red, final int green, final int blue, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        this.drawBoundingFullBox(this.getBoundingFromPos(pos), red, green, blue, alpha);
        this.drawBoundingBox(this.getBoundingFromPos(pos), width, red, green, blue, 255);
    }
    
    public final void drawFullBox(@NotNull final AxisAlignedBB bb, final float width, final int argb) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        final int a = argb >>> 24 & 0xFF;
        final int r = argb >>> 16 & 0xFF;
        final int g = argb >>> 8 & 0xFF;
        final int b = argb & 0xFF;
        this.drawFullBox(bb, width, r, g, b, a);
    }
    
    public final void drawFullBox(@NotNull final AxisAlignedBB bb, final float width, final int red, final int green, final int blue, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        this.drawBoundingFullBox(bb, red, green, blue, alpha);
        this.drawBoundingBox(bb, width, red, green, blue, 255);
    }
    
    public final void drawBoundingFullBox(@NotNull final AxisAlignedBB bb, final int red, final int green, final int blue, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        GlStateManager.color(red / 255.0f, green / 255.0f, blue / 255.0f, alpha / 255.0f);
        this.drawFilledBox(bb);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public final void drawBoundingFullBox(@NotNull final BlockPos pos, final int red, final int green, final int blue, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        this.drawBoundingFullBox(this.getBoundingFromPos(pos), red, green, blue, alpha);
    }
    
    @NotNull
    public final AxisAlignedBB getBoundingFromPos(@NotNull final BlockPos render) {
        Intrinsics.checkNotNullParameter((Object)render, "render");
        final IBlockState getBlockState = MinecraftWrapper.getMc().world.getBlockState(render);
        Intrinsics.checkNotNullExpressionValue((Object)getBlockState, "mc.world.getBlockState(render)");
        final IBlockState iBlockState = getBlockState;
        final EntityPlayerSP player = MinecraftWrapper.getMc().player;
        Intrinsics.checkNotNullExpressionValue((Object)player, "mc.player");
        final Vec3d interp = this.interpolateEntity((Entity)player, MinecraftWrapper.getMc().getRenderPartialTicks());
        final AxisAlignedBB offset = iBlockState.getSelectedBoundingBox((World)MinecraftWrapper.getMc().world, render).expand(0.002, 0.002, 0.002).offset(-interp.x, -interp.y, -interp.z);
        Intrinsics.checkNotNullExpressionValue((Object)offset, "iBlockState.getSelectedB\u2026.x, -interp.y, -interp.z)");
        return offset;
    }
    
    @NotNull
    public final Vec3d interpolateEntity(@NotNull final Entity entity, final float time) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * time, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * time, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * time);
    }
    
    @NotNull
    public final Vec3d interpolateEntityClose(@NotNull final Entity entity, final float renderPartialTicks) {
        Intrinsics.checkNotNullParameter((Object)entity, "entity");
        final double calculateDistanceWithPartialTicks = this.calculateDistanceWithPartialTicks(entity.posX, entity.lastTickPosX, renderPartialTicks);
        final RenderManager getRenderManager = Minecraft.getMinecraft().getRenderManager();
        if (getRenderManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.renderer.entity.RenderManager");
        }
        final double n = calculateDistanceWithPartialTicks - getRenderManager.renderPosX;
        final double calculateDistanceWithPartialTicks2 = this.calculateDistanceWithPartialTicks(entity.posY, entity.lastTickPosY, renderPartialTicks);
        final RenderManager getRenderManager2 = Minecraft.getMinecraft().getRenderManager();
        if (getRenderManager2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.renderer.entity.RenderManager");
        }
        final double n2 = calculateDistanceWithPartialTicks2 - getRenderManager2.renderPosY;
        final double calculateDistanceWithPartialTicks3 = this.calculateDistanceWithPartialTicks(entity.posZ, entity.lastTickPosZ, renderPartialTicks);
        final RenderManager getRenderManager3 = Minecraft.getMinecraft().getRenderManager();
        if (getRenderManager3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type net.minecraft.client.renderer.entity.RenderManager");
        }
        return new Vec3d(n, n2, calculateDistanceWithPartialTicks3 - getRenderManager3.renderPosZ);
    }
    
    public final double calculateDistanceWithPartialTicks(final double n, final double n2, final float renderPartialTicks) {
        return n2 + (n - n2) * MinecraftWrapper.getMc().getRenderPartialTicks();
    }
    
    public final void drawFilledBox(@NotNull final AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkNotNullParameter((Object)axisAlignedBB, "axisAlignedBB");
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder vertexbuffer = tessellator.getBuffer();
        vertexbuffer.begin(7, DefaultVertexFormats.POSITION);
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        vertexbuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        tessellator.draw();
    }
    
    public final void drawBoxTest(final float x, final float y, final float z, final float w, final float h, final float d, final int r, final int g, final int b, final int a, final int sides) {
        GL11.glPushMatrix();
        GL11.glBlendFunc(770, 771);
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        GlStateManager.glLineWidth(1.0f);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.disableDepth();
        GlStateManager.disableLighting();
        GlStateManager.disableCull();
        GlStateManager.enableAlpha();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        RenderUtil.setColor(new Color(r, g, b, a));
        GL11.glBegin(7);
        if ((sides & 0x1) != 0x0) {
            GL11.glVertex3d((double)(x + w), (double)y, (double)z);
            GL11.glVertex3d((double)(x + w), (double)y, (double)(z + d));
            GL11.glVertex3d((double)x, (double)y, (double)(z + d));
            GL11.glVertex3d((double)x, (double)y, (double)z);
        }
        if ((sides & 0x2) != 0x0) {
            GL11.glVertex3d((double)(x + w), (double)(y + h), (double)z);
            GL11.glVertex3d((double)x, (double)(y + h), (double)z);
            GL11.glVertex3d((double)x, (double)(y + h), (double)(z + d));
            GL11.glVertex3d((double)(x + w), (double)(y + h), (double)(z + d));
        }
        if ((sides & 0x4) != 0x0) {
            GL11.glVertex3d((double)(x + w), (double)y, (double)z);
            GL11.glVertex3d((double)x, (double)y, (double)z);
            GL11.glVertex3d((double)x, (double)(y + h), (double)z);
            GL11.glVertex3d((double)(x + w), (double)(y + h), (double)z);
        }
        if ((sides & 0x8) != 0x0) {
            GL11.glVertex3d((double)x, (double)y, (double)(z + d));
            GL11.glVertex3d((double)(x + w), (double)y, (double)(z + d));
            GL11.glVertex3d((double)(x + w), (double)(y + h), (double)(z + d));
            GL11.glVertex3d((double)x, (double)(y + h), (double)(z + d));
        }
        if ((sides & 0x10) != 0x0) {
            GL11.glVertex3d((double)x, (double)y, (double)z);
            GL11.glVertex3d((double)x, (double)y, (double)(z + d));
            GL11.glVertex3d((double)x, (double)(y + h), (double)(z + d));
            GL11.glVertex3d((double)x, (double)(y + h), (double)z);
        }
        if ((sides & 0x20) != 0x0) {
            GL11.glVertex3d((double)(x + w), (double)y, (double)(z + d));
            GL11.glVertex3d((double)(x + w), (double)y, (double)z);
            GL11.glVertex3d((double)(x + w), (double)(y + h), (double)z);
            GL11.glVertex3d((double)(x + w), (double)(y + h), (double)(z + d));
        }
        GL11.glEnd();
        GlStateManager.enableCull();
        GlStateManager.depthMask(true);
        GlStateManager.enableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.enableDepth();
        GlStateManager.color(1.0f, 1.0f, 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }
    
    public final void drawBoxTest(@NotNull final AxisAlignedBB bb, @NotNull final Color color, final int sides) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this.drawBoxTest(bb, color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha(), sides);
    }
    
    public final void drawBoxTest(@NotNull final AxisAlignedBB bb, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        this.drawBoxTest((float)bb.minX, (float)bb.minY, (float)bb.minZ, (float)bb.maxX - (float)bb.minX, (float)bb.maxY - (float)bb.minY, (float)bb.maxZ - (float)bb.minZ, r, g, b, a, sides);
    }
    
    public final void drawBoxTests(@NotNull final AxisAlignedBB bb, final int r, final int g, final int b, final int a, final int sides) {
        Intrinsics.checkNotNullParameter((Object)bb, "bb");
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        if ((sides & 0x1) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x2) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x4) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x8) != 0x0) {
            bufferBuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x10) != 0x0) {
            bufferBuilder.pos(bb.minX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.minX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
        }
        if ((sides & 0x20) != 0x0) {
            bufferBuilder.pos(bb.maxX, bb.minY, bb.maxZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.minY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.minZ).color(r, g, b, a).endVertex();
            bufferBuilder.pos(bb.maxX, bb.maxY, bb.maxZ).color(r, g, b, a).endVertex();
        }
        tessellator.draw();
    }
    
    @NotNull
    public Minecraft getMc() {
        return Helper.DefaultImpls.getMc((Helper)this);
    }
    
    @Nullable
    public EntityPlayerSP getPlayer() {
        return Helper.DefaultImpls.getPlayer((Helper)this);
    }
    
    @Nullable
    public World getWorld() {
        return Helper.DefaultImpls.getWorld((Helper)this);
    }
    
    static {
        INSTANCE = new StayTessellator();
    }
}
