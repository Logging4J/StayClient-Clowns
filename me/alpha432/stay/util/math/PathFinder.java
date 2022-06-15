//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\L4J\Desktop\clown Down\Minecraft-Deobfuscator3000-master\1.12 stable mappings"!

//Decompiled by Procyon!

package me.alpha432.stay.util.math;

import kotlin.*;
import it.unimi.dsi.fastutil.longs.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import me.alpha432.stay.util.math.vector.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder;", "", "blocks", "Lit/unimi/dsi/fastutil/longs/LongSet;", "stepHeight", "", "fallHeight", "(Lit/unimi/dsi/fastutil/longs/LongSet;II)V", "calculatePath", "Lkotlin/collections/ArrayDeque;", "Lme/alpha432/stay/util/math/PathFinder$PathNode;", "start", "Lme/alpha432/stay/util/math/PathFinder$Node;", "end", "timeout", "Companion", "NeighbourNode", "Node", "PathNode", "Stay" })
public final class PathFinder
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final LongSet blocks;
    private int stepHeight;
    private int fallHeight;
    @NotNull
    private static final Comparator<PathNode> comparator;
    @NotNull
    private static final NeighbourNode[] availableNeighbours;
    
    public PathFinder(@NotNull final LongSet blocks, final int stepHeight, final int fallHeight) {
        Intrinsics.checkNotNullParameter((Object)blocks, "blocks");
        this.blocks = blocks;
        this.stepHeight = stepHeight;
        this.fallHeight = fallHeight;
    }
    
    @NotNull
    public final ArrayDeque<PathNode> calculatePath(@NotNull final Node start, @NotNull final Node end, final int timeout) {
        Intrinsics.checkNotNullParameter((Object)start, "start");
        Intrinsics.checkNotNullParameter((Object)end, "end");
        final TreeSet openNodes = new TreeSet((Comparator<? super E>)PathFinder.comparator);
        final ArrayList closedNodes = new ArrayList();
        final PathNode pathNodeStart = new PathNode(start.getX(), start.getY(), start.getZ());
        pathNodeStart.initCalc(start, end);
        openNodes.add(pathNodeStart);
        int countDown = timeout;
        while (true) {
            final int n = countDown;
            countDown = n - 1;
            if (n <= 0) {
                throw new IllegalStateException("Timeout".toString());
            }
            final PathNode pathNode = openNodes.pollFirst();
            if (pathNode == null) {
                throw new IllegalStateException("Unreachable".toString());
            }
            final PathNode current = pathNode;
            closedNodes.add(current);
            if (Intrinsics.areEqual((Object)current, (Object)end)) {
                final ArrayDeque path = new ArrayDeque();
                for (PathNode node = (PathNode)CollectionsKt.lastOrNull((List)closedNodes); node != null; node = node.getParent()) {
                    path.addFirst((Object)node);
                }
                return (ArrayDeque<PathNode>)path;
            }
            final NeighbourNode[] availableNeighbours = PathFinder.availableNeighbours;
            int i = 0;
            while (i < availableNeighbours.length) {
                final NeighbourNode neighbour = availableNeighbours[i];
                ++i;
                if (!neighbour.isPassable(this, this.blocks, current)) {
                    continue;
                }
                final PathNode nextNode = current.add(neighbour);
                nextNode.calculate(end);
                openNodes.add(nextNode);
            }
        }
    }
    
    public static final /* synthetic */ int access$getFallHeight$p(final PathFinder $this) {
        return $this.fallHeight;
    }
    
    public static final /* synthetic */ int access$getStepHeight$p(final PathFinder $this) {
        return $this.stepHeight;
    }
    
    static {
        Companion = new Companion(null);
        comparator = new Comparator(new Comparator() {
            @Override
            public final int compare(final T a, final T b) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: checkcast       Lme/alpha432/stay/util/math/PathFinder$PathNode;
                //     4: astore_3        /* it */
                //     5: iconst_0       
                //     6: istore          $i$a$-compareBy-PathFinder$Companion$comparator$1
                //     8: aload_3         /* it */
                //     9: invokevirtual   me/alpha432/stay/util/math/PathFinder$PathNode.getF:()I
                //    12: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    15: checkcast       Ljava/lang/Comparable;
                //    18: aload_2         /* b */
                //    19: checkcast       Lme/alpha432/stay/util/math/PathFinder$PathNode;
                //    22: astore_3       
                //    23: astore          5
                //    25: iconst_0       
                //    26: istore          $i$a$-compareBy-PathFinder$Companion$comparator$1
                //    28: aload_3         /* it */
                //    29: invokevirtual   me/alpha432/stay/util/math/PathFinder$PathNode.getF:()I
                //    32: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    35: checkcast       Ljava/lang/Comparable;
                //    38: aload           5
                //    40: swap           
                //    41: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    44: ireturn        
                //    Signature:
                //  (TT;TT;)I
                // 
                // The error that occurred was:
                // 
                // java.lang.NullPointerException
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        }) {
            @Override
            public final int compare(final T a, final T b) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        me/alpha432/stay/util/math/PathFinder$special$$inlined$thenBy$1.$this_thenBy:Ljava/util/Comparator;
                //     4: aload_1         /* a */
                //     5: aload_2         /* b */
                //     6: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
                //    11: istore_3        /* previousCompare */
                //    12: iload_3         /* previousCompare */
                //    13: ifeq            20
                //    16: iload_3         /* previousCompare */
                //    17: goto            68
                //    20: aload_1         /* a */
                //    21: checkcast       Lme/alpha432/stay/util/math/PathFinder$PathNode;
                //    24: astore          it
                //    26: iconst_0       
                //    27: istore          $i$a$-thenBy-PathFinder$Companion$comparator$2
                //    29: aload           it
                //    31: invokevirtual   me/alpha432/stay/util/math/PathFinder$PathNode.getH:()I
                //    34: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    37: checkcast       Ljava/lang/Comparable;
                //    40: aload_2         /* b */
                //    41: checkcast       Lme/alpha432/stay/util/math/PathFinder$PathNode;
                //    44: astore          4
                //    46: astore          6
                //    48: iconst_0       
                //    49: istore          $i$a$-thenBy-PathFinder$Companion$comparator$2
                //    51: aload           it
                //    53: invokevirtual   me/alpha432/stay/util/math/PathFinder$PathNode.getH:()I
                //    56: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    59: checkcast       Ljava/lang/Comparable;
                //    62: aload           6
                //    64: swap           
                //    65: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    68: ireturn        
                //    Signature:
                //  (TT;TT;)I
                //    StackMapTable: 00 02 FC 00 14 01 6F 01
                // 
                // The error that occurred was:
                // 
                // java.lang.NullPointerException
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        };
        availableNeighbours = new NeighbourNode[] { new NeighbourNode(1, 0, 0, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(1, 0, 0), new Node(1, 1, 0) }), new NeighbourNode(-1, 0, 0, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(-1, 0, 0), new Node(-1, 1, 0) }), new NeighbourNode(0, 0, 1, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(0, 0, 1), new Node(0, 1, 1) }), new NeighbourNode(0, 0, -1, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(0, 0, -1), new Node(0, 1, -1) }), new NeighbourNode(0, 1, 0, NeighbourNode.Type.VERTICAL, new Node[] { new Node(0, 0, 0), new Node(0, 1, 0), new Node(0, 2, 0) }), new NeighbourNode(0, -1, 0, NeighbourNode.Type.VERTICAL, new Node[] { new Node(0, -1, 0), new Node(0, 0, 0), new Node(0, 1, 0) }), new NeighbourNode(1, 0, 1, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(1, 0, 1), new Node(1, 1, 1), new Node(1, 0, 0), new Node(1, 1, 0), new Node(0, 0, 1), new Node(0, 1, 1) }), new NeighbourNode(1, 0, -1, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(1, 0, -1), new Node(1, 1, -1), new Node(1, 0, 0), new Node(1, 1, 0), new Node(0, 0, -1), new Node(0, 1, -1) }), new NeighbourNode(-1, 0, 1, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(-1, 0, 1), new Node(-1, 1, 1), new Node(-1, 0, 0), new Node(-1, 1, 0), new Node(0, 0, 1), new Node(0, 1, 1) }), new NeighbourNode(-1, 0, -1, NeighbourNode.Type.HORIZONTAL, new Node[] { new Node(-1, 0, -1), new Node(-1, 1, -1), new Node(-1, 0, 0), new Node(-1, 1, 0), new Node(0, 0, -1), new Node(0, 1, -1) }) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$Companion;", "", "()V", "availableNeighbours", "", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "[Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "comparator", "Ljava/util/Comparator;", "Lme/alpha432/stay/util/math/PathFinder$PathNode;", "Lkotlin/Comparator;", "Stay" })
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "Lme/alpha432/stay/util/math/PathFinder$Node;", "x", "", "y", "z", "type", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type;", "collisions", "", "(IIILme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type;[Lme/alpha432/stay/util/math/PathFinder$Node;)V", "[Lme/alpha432/stay/util/math/PathFinder$Node;", "cost", "getCost", "()I", "checkStepHeight", "", "pathFinder", "Lme/alpha432/stay/util/math/PathFinder;", "node", "Lme/alpha432/stay/util/math/PathFinder$PathNode;", "isPassable", "blockSet", "Lit/unimi/dsi/fastutil/longs/LongSet;", "current", "Companion", "Type", "Stay" })
    public static final class NeighbourNode extends Node
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final Type type;
        @NotNull
        private final Node[] collisions;
        private final int cost;
        @JvmField
        @NotNull
        public static final NeighbourNode ZERO;
        
        public NeighbourNode(final int x, final int y, final int z, @NotNull final Type type, @NotNull final Node[] collisions) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     2: ldc             "type"
            //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     7: aload           collisions
            //     9: ldc             "collisions"
            //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //    14: aload_0         /* this */
            //    15: iload_1         /* x */
            //    16: iload_2         /* y */
            //    17: iload_3         /* z */
            //    18: invokespecial   me/alpha432/stay/util/math/PathFinder$Node.<init>:(III)V
            //    21: aload_0         /* this */
            //    22: aload           type
            //    24: putfield        me/alpha432/stay/util/math/PathFinder$NeighbourNode.type:Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type;
            //    27: aload_0         /* this */
            //    28: aload           collisions
            //    30: putfield        me/alpha432/stay/util/math/PathFinder$NeighbourNode.collisions:[Lme/alpha432/stay/util/math/PathFinder$Node;
            //    33: aload_0         /* this */
            //    34: iconst_0       
            //    35: istore          6
            //    37: iconst_0       
            //    38: istore          7
            //    40: iconst_0       
            //    41: istore          z1$iv
            //    43: iconst_0       
            //    44: istore          $i$f$distanceSq
            //    46: iload_1         /* x */
            //    47: iload           x1$iv
            //    49: isub           
            //    50: istore          $this$sq$iv$iv
            //    52: iconst_0       
            //    53: istore          $i$f$getSq
            //    55: iload           $this$sq$iv$iv
            //    57: iload           $this$sq$iv$iv
            //    59: imul           
            //    60: iload_2         /* y */
            //    61: iload           y1$iv
            //    63: isub           
            //    64: istore          $this$sq$iv$iv
            //    66: iconst_0       
            //    67: istore          $i$f$getSq
            //    69: iload           $this$sq$iv$iv
            //    71: iload           $this$sq$iv$iv
            //    73: imul           
            //    74: iadd           
            //    75: iload_3         /* z */
            //    76: iload           z1$iv
            //    78: isub           
            //    79: istore          $this$sq$iv$iv
            //    81: iconst_0       
            //    82: istore          $i$f$getSq
            //    84: iload           $this$sq$iv$iv
            //    86: iload           $this$sq$iv$iv
            //    88: imul           
            //    89: iadd           
            //    90: putfield        me/alpha432/stay/util/math/PathFinder$NeighbourNode.cost:I
            //    93: return         
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final int getCost() {
            return this.cost;
        }
        
        public final boolean isPassable(@NotNull final PathFinder pathFinder, @NotNull final LongSet blockSet, @NotNull final PathNode current) {
            Intrinsics.checkNotNullParameter((Object)pathFinder, "pathFinder");
            Intrinsics.checkNotNullParameter((Object)blockSet, "blockSet");
            Intrinsics.checkNotNullParameter((Object)current, "current");
            if (this.checkStepHeight(pathFinder, current) && this.type.checkGround(pathFinder, blockSet, current, this)) {
                final Object[] $this$none$iv = this.collisions;
                final int $i$f$none = 0;
                final Object[] array = $this$none$iv;
                int i = 0;
                while (true) {
                    while (i < array.length) {
                        final Object element$iv = array[i];
                        ++i;
                        final Node it = (Node)element$iv;
                        final int n = 0;
                        if (blockSet.contains(((Node)current).toLong(it))) {
                            final boolean b = false;
                            if (b) {
                                return true;
                            }
                            return false;
                        }
                    }
                    final boolean b = true;
                    continue;
                }
            }
            return false;
        }
        
        private final boolean checkStepHeight(final PathFinder pathFinder, final PathNode node) {
            PathNode current = node;
            int totalY = ((Node)this).getY();
            int lastY = ((Node)this).getY();
            while (true) {
                final int n = -PathFinder.access$getFallHeight$p(pathFinder);
                if (totalY > PathFinder.access$getStepHeight$p(pathFinder) || n > totalY) {
                    return false;
                }
                final NeighbourNode neighbourNode = current.getLast();
                if (neighbourNode.type != Type.VERTICAL) {
                    break;
                }
                if (((Node)neighbourNode).getY() != lastY) {
                    break;
                }
                totalY += ((Node)neighbourNode).getY();
                final PathNode parent = current.getParent();
                if (parent == null) {
                    break;
                }
                current = parent;
                lastY = ((Node)neighbourNode).getY();
            }
            final int n2 = -PathFinder.access$getFallHeight$p(pathFinder);
            return totalY <= PathFinder.access$getStepHeight$p(pathFinder) && n2 <= totalY;
        }
        
        public static final /* synthetic */ Type access$getType$p(final NeighbourNode $this) {
            return $this.type;
        }
        
        static {
            Companion = new Companion(null);
            final int x = 0;
            final int y = 0;
            final int z = 0;
            final Type horizontal = Type.HORIZONTAL;
            final int $i$f$emptyArray = 0;
            ZERO = new NeighbourNode(x, y, z, horizontal, new Node[0]);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&j\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type;", "", "(Ljava/lang/String;I)V", "checkGround", "", "pathFinder", "Lme/alpha432/stay/util/math/PathFinder;", "blockSet", "Lit/unimi/dsi/fastutil/longs/LongSet;", "current", "Lme/alpha432/stay/util/math/PathFinder$PathNode;", "next", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "HORIZONTAL", "VERTICAL", "Stay" })
        public enum Type
        {
            HORIZONTAL, 
            VERTICAL;
            
            public abstract boolean checkGround(@NotNull final PathFinder p0, @NotNull final LongSet p1, @NotNull final PathNode p2, @NotNull final NeighbourNode p3);
            
            private static final /* synthetic */ Type[] $values() {
                return new Type[] { Type.HORIZONTAL, Type.VERTICAL };
            }
            
            static {
                $VALUES = $values();
            }
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type$HORIZONTAL;", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type;", "checkGround", "", "pathFinder", "Lme/alpha432/stay/util/math/PathFinder;", "blockSet", "Lit/unimi/dsi/fastutil/longs/LongSet;", "current", "Lme/alpha432/stay/util/math/PathFinder$PathNode;", "next", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "Stay" })
            static final class HORIZONTAL extends Type
            {
                HORIZONTAL(final String $enum$name, final int $enum$ordinal) {
                    super($enum$name, $enum$ordinal, null);
                }
                
                @Override
                public boolean checkGround(@NotNull final PathFinder pathFinder, @NotNull final LongSet blockSet, @NotNull final PathNode current, @NotNull final NeighbourNode next) {
                    Intrinsics.checkNotNullParameter((Object)pathFinder, "pathFinder");
                    Intrinsics.checkNotNullParameter((Object)blockSet, "blockSet");
                    Intrinsics.checkNotNullParameter((Object)current, "current");
                    Intrinsics.checkNotNullParameter((Object)next, "next");
                    return (NeighbourNode.access$getType$p(current.getLast()) == Type.VERTICAL && ((Node)current.getLast()).getY() == 1) || Node.Companion.contains(blockSet, ((Node)current).getX(), ((Node)current).getY() - 1, ((Node)current).getZ());
                }
            }
            
            @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type$VERTICAL;", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Type;", "checkGround", "", "pathFinder", "Lme/alpha432/stay/util/math/PathFinder;", "blockSet", "Lit/unimi/dsi/fastutil/longs/LongSet;", "current", "Lme/alpha432/stay/util/math/PathFinder$PathNode;", "next", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "checkWall", "checkWallAtY", "y", "", "Stay" })
            static final class VERTICAL extends Type
            {
                VERTICAL(final String $enum$name, final int $enum$ordinal) {
                    super($enum$name, $enum$ordinal, null);
                }
                
                @Override
                public boolean checkGround(@NotNull final PathFinder pathFinder, @NotNull final LongSet blockSet, @NotNull final PathNode current, @NotNull final NeighbourNode next) {
                    Intrinsics.checkNotNullParameter((Object)pathFinder, "pathFinder");
                    Intrinsics.checkNotNullParameter((Object)blockSet, "blockSet");
                    Intrinsics.checkNotNullParameter((Object)current, "current");
                    Intrinsics.checkNotNullParameter((Object)next, "next");
                    return (Intrinsics.areEqual((Object)current.getLast(), (Object)next) || ((Node)next).getY() == -1 || Node.Companion.contains(blockSet, ((Node)current).getX(), ((Node)current).getY() - 1, ((Node)current).getZ())) && ((current.getParent() == null && ((Node)next).getY() == -1) || this.checkWall(pathFinder, blockSet, current, next));
                }
                
                private final boolean checkWall(final PathFinder pathFinder, final LongSet blockSet, final PathNode current, final NeighbourNode next) {
                    boolean b;
                    if (((Node)next).getY() > 0) {
                        int i = 0;
                        while (i < PathFinder.access$getStepHeight$p(pathFinder)) {
                            final int y = i;
                            ++i;
                            if (this.checkWallAtY(blockSet, current, y)) {
                                return true;
                            }
                        }
                        b = false;
                    }
                    else {
                        int access$getFallHeight$p = PathFinder.access$getFallHeight$p(pathFinder);
                        if (0 <= access$getFallHeight$p) {
                            do {
                                final int y2 = access$getFallHeight$p;
                                --access$getFallHeight$p;
                                if (this.checkWallAtY(blockSet, current, y2)) {
                                    return true;
                                }
                            } while (0 <= access$getFallHeight$p);
                        }
                        b = false;
                    }
                    return b;
                }
                
                private final boolean checkWallAtY(final LongSet blockSet, final PathNode current, final int y) {
                    return Node.Companion.contains(blockSet, ((Node)current).getX() - 1, y, ((Node)current).getZ()) || Node.Companion.contains(blockSet, ((Node)current).getX() + 1, y, ((Node)current).getZ()) || Node.Companion.contains(blockSet, ((Node)current).getX(), y, ((Node)current).getZ() - 1) || Node.Companion.contains(blockSet, ((Node)current).getX(), y, ((Node)current).getZ() + 1) || Node.Companion.contains(blockSet, ((Node)current).getX() - 1, y, ((Node)current).getZ() - 1) || Node.Companion.contains(blockSet, ((Node)current).getX() + 1, y, ((Node)current).getZ() - 1) || Node.Companion.contains(blockSet, ((Node)current).getX() - 1, y, ((Node)current).getZ() + 1) || Node.Companion.contains(blockSet, ((Node)current).getX() + 1, y, ((Node)current).getZ() + 1);
                }
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode$Companion;", "", "()V", "ZERO", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "Stay" })
        public static final class Companion
        {
            private Companion() {
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B/\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001J\u0016\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\"" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$PathNode;", "Lme/alpha432/stay/util/math/PathFinder$Node;", "x", "", "y", "z", "(III)V", "parent", "last", "Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "(Lme/alpha432/stay/util/math/PathFinder$PathNode;Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;III)V", "f", "getF", "()I", "g", "getG", "setG", "(I)V", "h", "getH", "setH", "getLast", "()Lme/alpha432/stay/util/math/PathFinder$NeighbourNode;", "getParent", "()Lme/alpha432/stay/util/math/PathFinder$PathNode;", "add", "neighbourNode", "calculate", "", "end", "initCalc", "start", "toString", "", "Stay" })
    public static final class PathNode extends Node
    {
        @Nullable
        private final PathNode parent;
        @NotNull
        private final NeighbourNode last;
        private int g;
        private int h;
        
        public PathNode(@Nullable final PathNode parent, @NotNull final NeighbourNode last, final int x, final int y, final int z) {
            Intrinsics.checkNotNullParameter((Object)last, "last");
            super(x, y, z);
            this.parent = parent;
            this.last = last;
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
        }
        
        @Nullable
        public final PathNode getParent() {
            return this.parent;
        }
        
        @NotNull
        public final NeighbourNode getLast() {
            return this.last;
        }
        
        public final int getG() {
            return this.g;
        }
        
        public final void setG(final int <set-?>) {
            this.g = <set-?>;
        }
        
        public final int getH() {
            return this.h;
        }
        
        public final void setH(final int <set-?>) {
            this.h = <set-?>;
        }
        
        public final int getF() {
            return this.g + this.h;
        }
        
        public PathNode(final int x, final int y, final int z) {
            this(null, NeighbourNode.ZERO, x, y, z);
        }
        
        @NotNull
        public final PathNode add(@NotNull final NeighbourNode neighbourNode) {
            Intrinsics.checkNotNullParameter((Object)neighbourNode, "neighbourNode");
            return new PathNode(this, neighbourNode, ((Node)this).getX() + ((Node)neighbourNode).getX(), ((Node)this).getY() + ((Node)neighbourNode).getY(), ((Node)this).getZ() + ((Node)neighbourNode).getZ());
        }
        
        public final void calculate(@NotNull final Node end) {
            Intrinsics.checkNotNullParameter((Object)end, "end");
            final PathNode parent = this.parent;
            Intrinsics.checkNotNull((Object)parent);
            this.g = parent.g + this.last.getCost();
            this.h = ((Node)this).distanceTo(end);
        }
        
        public final void initCalc(@NotNull final Node start, @NotNull final Node end) {
            Intrinsics.checkNotNullParameter((Object)start, "start");
            Intrinsics.checkNotNullParameter((Object)end, "end");
            this.g = ((Node)this).distanceTo(start);
            this.h = ((Node)this).distanceTo(end);
        }
        
        @NotNull
        @Override
        public String toString() {
            return new StringBuilder().append('(').append(((Node)this).getX()).append(", ").append(((Node)this).getY()).append(", ").append(((Node)this).getZ()).append(')').toString();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0000J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0013" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$Node;", "", "x", "", "y", "z", "(III)V", "getX", "()I", "getY", "getZ", "distanceTo", "other", "equals", "", "hashCode", "toLong", "", "Companion", "Stay" })
    public static class Node
    {
        @NotNull
        protected static final Companion Companion;
        private final int x;
        private final int y;
        private final int z;
        
        public Node(final int x, final int y, final int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
        public final int getX() {
            return this.x;
        }
        
        public final int getY() {
            return this.y;
        }
        
        public final int getZ() {
            return this.z;
        }
        
        public final int distanceTo(@NotNull final Node other) {
            Intrinsics.checkNotNullParameter((Object)other, "other");
            int $this$sq$iv = other.x - this.x;
            int $i$f$getSq = 0;
            final int n = $this$sq$iv * $this$sq$iv;
            $this$sq$iv = other.z - this.z;
            $i$f$getSq = 0;
            final int n2 = (n + $this$sq$iv * $this$sq$iv) * 2;
            $this$sq$iv = other.y - this.y;
            $i$f$getSq = 0;
            return n2 + $this$sq$iv * $this$sq$iv;
        }
        
        public final long toLong() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        me/alpha432/stay/util/math/PathFinder$Node.x:I
            //     4: istore_1       
            //     5: aload_0         /* this */
            //     6: getfield        me/alpha432/stay/util/math/PathFinder$Node.y:I
            //     9: istore_2       
            //    10: aload_0         /* this */
            //    11: getfield        me/alpha432/stay/util/math/PathFinder$Node.z:I
            //    14: istore_3        /* z$iv */
            //    15: iconst_0       
            //    16: istore          $i$f$toLong
            //    18: iload_1         /* x$iv */
            //    19: i2l            
            //    20: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getX_MASK:()J
            //    23: land           
            //    24: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getX_SHIFT:()I
            //    27: lshl           
            //    28: iload_2         /* y$iv */
            //    29: i2l            
            //    30: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getY_MASK:()J
            //    33: land           
            //    34: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getY_SHIFT:()I
            //    37: lshl           
            //    38: lor            
            //    39: iload_3         /* z$iv */
            //    40: i2l            
            //    41: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getZ_MASK:()J
            //    44: land           
            //    45: lor            
            //    46: lreturn        
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final long toLong(@NotNull final Node other) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "other"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_0         /* this */
            //     7: getfield        me/alpha432/stay/util/math/PathFinder$Node.x:I
            //    10: aload_1         /* other */
            //    11: getfield        me/alpha432/stay/util/math/PathFinder$Node.x:I
            //    14: iadd           
            //    15: istore_2       
            //    16: aload_0         /* this */
            //    17: getfield        me/alpha432/stay/util/math/PathFinder$Node.y:I
            //    20: aload_1         /* other */
            //    21: getfield        me/alpha432/stay/util/math/PathFinder$Node.y:I
            //    24: iadd           
            //    25: istore_3       
            //    26: aload_0         /* this */
            //    27: getfield        me/alpha432/stay/util/math/PathFinder$Node.z:I
            //    30: aload_1         /* other */
            //    31: getfield        me/alpha432/stay/util/math/PathFinder$Node.z:I
            //    34: iadd           
            //    35: istore          z$iv
            //    37: iconst_0       
            //    38: istore          $i$f$toLong
            //    40: iload_2         /* x$iv */
            //    41: i2l            
            //    42: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getX_MASK:()J
            //    45: land           
            //    46: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getX_SHIFT:()I
            //    49: lshl           
            //    50: iload_3         /* y$iv */
            //    51: i2l            
            //    52: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getY_MASK:()J
            //    55: land           
            //    56: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getY_SHIFT:()I
            //    59: lshl           
            //    60: lor            
            //    61: iload           z$iv
            //    63: i2l            
            //    64: invokestatic    me/alpha432/stay/util/math/vector/ConversionKt.getZ_MASK:()J
            //    67: land           
            //    68: lor            
            //    69: lreturn        
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return this == other || (other instanceof Node && this.x == ((Node)other).x && this.y == ((Node)other).y && this.z == ((Node)other).z);
        }
        
        @Override
        public int hashCode() {
            int result = this.x;
            result = 31 * result + this.y;
            result = 31 * result + this.z;
            return result;
        }
        
        @JvmStatic
        public static final boolean contains(@NotNull final LongSet $this$contains, final int x, final int y, final int z) {
            return Node.Companion.contains($this$contains, x, y, z);
        }
        
        static {
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0084\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¨\u0006\n" }, d2 = { "Lme/alpha432/stay/util/math/PathFinder$Node$Companion;", "", "()V", "contains", "", "Lit/unimi/dsi/fastutil/longs/LongSet;", "x", "", "y", "z", "Stay" })
        protected static final class Companion
        {
            private Companion() {
            }
            
            @JvmStatic
            public final boolean contains(@NotNull final LongSet $this$contains, final int x, final int y, final int z) {
                Intrinsics.checkNotNullParameter((Object)$this$contains, "<this>");
                final int $i$f$toLong = 0;
                return $this$contains.contains(((long)x & ConversionKt.getX_MASK()) << ConversionKt.getX_SHIFT() | ((long)y & ConversionKt.getY_MASK()) << ConversionKt.getY_SHIFT() | ((long)z & ConversionKt.getZ_MASK()));
            }
        }
    }
}
