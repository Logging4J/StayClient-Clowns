//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.text;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import kotlin.collections.*;
import java.util.*;
import me.alpha432.stay.util.graphics.color.*;
import me.alpha432.stay.util.math.vector.*;
import org.lwjgl.opengl.*;
import me.alpha432.stay.client.*;
import me.alpha432.stay.manager.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u000278B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B/\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\b\"\u00020\u0005¢\u0006\u0002\u0010\tB\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J%\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010#\u001a\u00020\u0019JL\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200J\u0018\u00101\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020,J\u0010\u00103\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020,J\u0006\u00104\u001a\u00020)J\u0006\u00105\u001a\u00020,J\b\u00106\u001a\u00020\u0005H\u0016R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069" }, d2 = { "Lme/alpha432/stay/util/text/TextComponent;", "", "textComponent", "(Lme/alpha432/stay/util/text/TextComponent;)V", "string", "", "separator", "delimiters", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "(Ljava/lang/String;)V", "value", "", "currentLine", "getCurrentLine", "()I", "setCurrentLine", "(I)V", "getSeparator", "()Ljava/lang/String;", "textLines", "Ljava/util/ArrayList;", "Lme/alpha432/stay/util/text/TextComponent$TextLine;", "Lkotlin/collections/ArrayList;", "add", "", "text", "color", "Lme/alpha432/stay/util/graphics/color/ColorRGB;", "add-8LI65q0", "(Ljava/lang/String;I)V", "textElement", "Lme/alpha432/stay/util/text/TextComponent$TextElement;", "addLine", "addLine-8LI65q0", "clear", "draw", "pos", "Lme/alpha432/stay/util/math/vector/Vec2d;", "lineSpace", "alpha", "", "scale", "skipEmptyLine", "", "horizontalAlign", "Lme/alpha432/stay/util/math/vector/HAlign;", "verticalAlign", "Lme/alpha432/stay/util/math/vector/VAlign;", "getHeight", "skipEmptyLines", "getLines", "getWidth", "isEmpty", "toString", "TextElement", "TextLine", "Stay" })
public final class TextComponent
{
    @NotNull
    private final String separator;
    @NotNull
    private final ArrayList<TextLine> textLines;
    private int currentLine;
    
    public TextComponent(@NotNull final String separator) {
        Intrinsics.checkNotNullParameter((Object)separator, "separator");
        this.separator = separator;
        this.textLines = new ArrayList<TextLine>();
    }
    
    @NotNull
    public final String getSeparator() {
        return this.separator;
    }
    
    public final int getCurrentLine() {
        return this.currentLine;
    }
    
    public final void setCurrentLine(final int value) {
        this.currentLine = Math.max(value, 0);
    }
    
    public TextComponent(@NotNull final TextComponent textComponent) {
        Intrinsics.checkNotNullParameter((Object)textComponent, "textComponent");
        this(textComponent.separator);
        this.textLines.addAll(textComponent.textLines);
        this.setCurrentLine(textComponent.currentLine);
    }
    
    public TextComponent(@NotNull final String string, @NotNull final String separator, @NotNull final String... delimiters) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        Intrinsics.checkNotNullParameter((Object)separator, "separator");
        Intrinsics.checkNotNullParameter((Object)delimiters, "delimiters");
        this(separator);
        final List lines = StringsKt.lines((CharSequence)string);
        for (final String line : lines) {
            for (final String splitText : StringsKt.split$default((CharSequence)line, (String[])Arrays.copyOf(delimiters, delimiters.length), false, 0, 6, (Object)null)) {
                add-8LI65q0$default(this, splitText, 0, 2, null);
            }
            if (!Intrinsics.areEqual((Object)line, CollectionsKt.last(lines))) {
                this.setCurrentLine(this.currentLine + 1);
            }
        }
    }
    
    public final void addLine-8LI65q0(@NotNull final String text, final int color) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.add-8LI65q0(text, color);
        this.setCurrentLine(this.currentLine + 1);
    }
    
    public final void addLine(@NotNull final TextElement textElement) {
        Intrinsics.checkNotNullParameter((Object)textElement, "textElement");
        this.add(textElement);
        this.setCurrentLine(this.currentLine + 1);
    }
    
    public final void add-8LI65q0(@NotNull final String text, final int color) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        this.add(new TextElement(text, color, null));
    }
    
    public static /* synthetic */ void add-8LI65q0$default(final TextComponent textComponent, final String text, int constructor-impl, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            constructor-impl = ColorRGB.constructor-impl(255, 255, 255);
        }
        textComponent.add-8LI65q0(text, constructor-impl);
    }
    
    public final void add(@NotNull final TextElement textElement) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "textElement"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        me/alpha432/stay/util/text/TextComponent.textLines:Ljava/util/ArrayList;
        //    10: invokevirtual   java/util/ArrayList.size:()I
        //    13: aload_0         /* this */
        //    14: getfield        me/alpha432/stay/util/text/TextComponent.currentLine:I
        //    17: if_icmpgt       32
        //    20: aload_0         /* this */
        //    21: getfield        me/alpha432/stay/util/text/TextComponent.textLines:Ljava/util/ArrayList;
        //    24: aconst_null    
        //    25: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    28: pop            
        //    29: goto            6
        //    32: aload_0         /* this */
        //    33: getfield        me/alpha432/stay/util/text/TextComponent.textLines:Ljava/util/ArrayList;
        //    36: aload_0         /* this */
        //    37: getfield        me/alpha432/stay/util/text/TextComponent.currentLine:I
        //    40: aload_0         /* this */
        //    41: getfield        me/alpha432/stay/util/text/TextComponent.textLines:Ljava/util/ArrayList;
        //    44: aload_0         /* this */
        //    45: getfield        me/alpha432/stay/util/text/TextComponent.currentLine:I
        //    48: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    51: checkcast       Lme/alpha432/stay/util/text/TextComponent$TextLine;
        //    54: dup            
        //    55: ifnonnull       70
        //    58: pop            
        //    59: new             Lme/alpha432/stay/util/text/TextComponent$TextLine;
        //    62: dup            
        //    63: aload_0         /* this */
        //    64: getfield        me/alpha432/stay/util/text/TextComponent.separator:Ljava/lang/String;
        //    67: invokespecial   me/alpha432/stay/util/text/TextComponent$TextLine.<init>:(Ljava/lang/String;)V
        //    70: astore_2       
        //    71: aload_2        
        //    72: astore_3       
        //    73: istore          6
        //    75: astore          5
        //    77: iconst_0       
        //    78: istore          $i$a$-apply-TextComponent$add$1
        //    80: aload_3         /* $this$add_u24lambda_u2d0 */
        //    81: aload_1         /* textElement */
        //    82: invokevirtual   me/alpha432/stay/util/text/TextComponent$TextLine.add:(Lme/alpha432/stay/util/text/TextComponent$TextElement;)V
        //    85: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //    88: astore          7
        //    90: aload           5
        //    92: iload           6
        //    94: aload_2        
        //    95: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //    98: pop            
        //    99: return         
        //    StackMapTable: 00 03 06 19 FF 00 25 00 02 07 00 02 07 00 48 00 03 07 00 5B 01 07 00 46
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void clear() {
        this.textLines.clear();
        this.setCurrentLine(0);
    }
    
    public final void draw(@NotNull final Vec2d pos, final int lineSpace, final float alpha, final float scale, final boolean skipEmptyLine, @NotNull final HAlign horizontalAlign, @NotNull final VAlign verticalAlign) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        Intrinsics.checkNotNullParameter((Object)horizontalAlign, "horizontalAlign");
        Intrinsics.checkNotNullParameter((Object)verticalAlign, "verticalAlign");
        if (this.isEmpty()) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glTranslated(pos.getX(), pos.getY() - 1.0, 0.0);
        GL11.glScalef(scale, scale, 1.0f);
        if (verticalAlign != VAlign.TOP) {
            int height = getHeight$default(this, lineSpace, false, 2, null);
            if (verticalAlign == VAlign.CENTER) {
                height /= 2;
            }
            GL11.glTranslatef(0.0f, (float)(-height), 0.0f);
        }
        for (final TextLine line : this.textLines) {
            if (skipEmptyLine) {
                if (line == null) {
                    continue;
                }
                if (line.isEmpty()) {
                    continue;
                }
            }
            final TextLine textLine = line;
            if (textLine != null) {
                textLine.drawLine(alpha, horizontalAlign);
            }
            final float n = 0.0f;
            final TextManager fontRenderer = Stay.fontRenderer;
            Intrinsics.checkNotNull((Object)fontRenderer);
            GL11.glTranslatef(n, (float)(fontRenderer.getFontHeight() + lineSpace), 0.0f);
        }
        GL11.glPopMatrix();
    }
    
    public final boolean isEmpty() {
        final Iterable $this$firstOrNull$iv = this.textLines;
        final int $i$f$firstOrNull = 0;
        for (final Object element$iv : $this$firstOrNull$iv) {
            final TextLine it = (TextLine)element$iv;
            final int n = 0;
            final TextLine textLine = it;
            if (textLine != null && !textLine.isEmpty()) {
                final Object o = element$iv;
                return o == null;
            }
        }
        final Object o = null;
        return o == null;
    }
    
    public final float getWidth() {
        final Iterator<Object> iterator = this.textLines.iterator();
        Float value;
        if (!iterator.hasNext()) {
            value = null;
        }
        else {
            final TextLine it = iterator.next();
            final int n = 0;
            final TextLine textLine = it;
            float max = (textLine == null) ? 0.0f : textLine.getWidth();
            while (iterator.hasNext()) {
                final TextLine it2 = iterator.next();
                final int n2 = 0;
                final TextLine textLine2 = it2;
                max = Math.max(max, (textLine2 == null) ? 0.0f : textLine2.getWidth());
            }
            value = max;
        }
        final Float n3 = value;
        return (n3 == null) ? 0.0f : n3;
    }
    
    public final int getHeight(final int lineSpace, final boolean skipEmptyLines) {
        final TextManager fontRenderer = Stay.fontRenderer;
        Intrinsics.checkNotNull((Object)fontRenderer);
        return fontRenderer.getFontHeight() * this.getLines(skipEmptyLines) + lineSpace * (this.getLines(skipEmptyLines) - 1);
    }
    
    public static /* synthetic */ int getHeight$default(final TextComponent textComponent, final int lineSpace, boolean skipEmptyLines, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            skipEmptyLines = true;
        }
        return textComponent.getHeight(lineSpace, skipEmptyLines);
    }
    
    public final int getLines(final boolean skipEmptyLines) {
        final Iterable $this$count$iv = this.textLines;
        final int $i$f$count = 0;
        int n;
        if ($this$count$iv instanceof Collection && ((Collection)$this$count$iv).isEmpty()) {
            n = 0;
        }
        else {
            int count$iv = 0;
            for (final Object element$iv : $this$count$iv) {
                final TextLine it = (TextLine)element$iv;
                final int n2 = 0;
                if ((skipEmptyLines || (it != null && !it.isEmpty())) && ++count$iv < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            n = count$iv;
        }
        return n;
    }
    
    @NotNull
    @Override
    public String toString() {
        return CollectionsKt.joinToString$default((Iterable)this.textLines, (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
    }
    
    public TextComponent() {
        this(null, 1, null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000bJ\b\u0010\u0016\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017" }, d2 = { "Lme/alpha432/stay/util/text/TextComponent$TextLine;", "", "separator", "", "(Ljava/lang/String;)V", "cachedString", "textElementList", "Ljava/util/ArrayList;", "Lme/alpha432/stay/util/text/TextComponent$TextElement;", "Lkotlin/collections/ArrayList;", "add", "", "textElement", "drawLine", "alpha", "", "horizontalAlign", "Lme/alpha432/stay/util/math/vector/HAlign;", "getWidth", "isEmpty", "", "reverse", "updateCache", "Stay" })
    public static final class TextLine
    {
        @NotNull
        private final String separator;
        @NotNull
        private final ArrayList<TextElement> textElementList;
        @NotNull
        private String cachedString;
        
        public TextLine(@NotNull final String separator) {
            Intrinsics.checkNotNullParameter((Object)separator, "separator");
            this.separator = separator;
            this.textElementList = new ArrayList<TextElement>();
            this.cachedString = "";
        }
        
        public final boolean isEmpty() {
            return this.textElementList.size() == 0;
        }
        
        public final void add(@NotNull final TextElement textElement) {
            Intrinsics.checkNotNullParameter((Object)textElement, "textElement");
            this.textElementList.add(textElement);
            this.updateCache();
        }
        
        public final void drawLine(final float alpha, @NotNull final HAlign horizontalAlign) {
            Intrinsics.checkNotNullParameter((Object)horizontalAlign, "horizontalAlign");
            GL11.glPushMatrix();
            if (horizontalAlign != HAlign.LEFT) {
                float width = this.getWidth();
                if (horizontalAlign == HAlign.CENTER) {
                    width /= 2.0f;
                }
                GL11.glTranslatef(-width, 0.0f, 0.0f);
            }
            for (final TextElement textElement : this.textElementList) {
                int color = textElement.getColor-RRr7D4I();
                color = ColorRGB.alpha-_3BFyQM(color, (int)(ColorRGB.getA-impl(color) * alpha));
                final TextManager fontRenderer = Stay.fontRenderer;
                Intrinsics.checkNotNull((Object)fontRenderer);
                fontRenderer.drawString(textElement.getText(), 0.0f, 0.0f, color, true);
                final String adjustedSeparator = Intrinsics.areEqual((Object)this.separator, (Object)" ") ? "  " : this.separator;
                final TextManager fontRenderer2 = Stay.fontRenderer;
                Intrinsics.checkNotNull((Object)fontRenderer2);
                GL11.glTranslatef((float)fontRenderer2.getStringWidth(Intrinsics.stringPlus(textElement.getText(), (Object)adjustedSeparator)), 0.0f, 0.0f);
            }
            GL11.glPopMatrix();
        }
        
        public final float getWidth() {
            final TextManager fontRenderer = Stay.fontRenderer;
            Intrinsics.checkNotNull((Object)fontRenderer);
            return (float)fontRenderer.getStringWidth(this.cachedString);
        }
        
        public final void reverse() {
            CollectionsKt.reverse((List)this.textElementList);
            this.updateCache();
        }
        
        private final void updateCache() {
            final String adjustedSeparator = Intrinsics.areEqual((Object)this.separator, (Object)" ") ? "  " : this.separator;
            this.cachedString = CollectionsKt.joinToString$default((Iterable)this.textElementList, (CharSequence)adjustedSeparator, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u0003H\u0016R\u001c\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e" }, d2 = { "Lme/alpha432/stay/util/text/TextComponent$TextElement;", "", "textIn", "", "color", "Lme/alpha432/stay/util/graphics/color/ColorRGB;", "(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-RRr7D4I", "()I", "I", "text", "getText", "()Ljava/lang/String;", "toString", "Stay" })
    public static final class TextElement
    {
        private final int color;
        @NotNull
        private final String text;
        
        private TextElement(final String textIn, final int color) {
            this.color = color;
            this.text = textIn;
        }
        
        public final int getColor-RRr7D4I() {
            return this.color;
        }
        
        @NotNull
        public final String getText() {
            return this.text;
        }
        
        @NotNull
        @Override
        public String toString() {
            return this.text;
        }
    }
}
