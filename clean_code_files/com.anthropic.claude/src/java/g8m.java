import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

public abstract class g8m
{
    public static final cyl a;
    public static final tze b;
    public static final Object c;
    public static e8m d;
    public static long e;
    public static final lc0 f;
    public static final mlf g;
    public static List h;
    public static List i;
    public static final b3b j;
    public static final cc1 k;
    
    static {
        a = new cyl((byte)3);
        b = new tze((byte)12);
        c = new Object();
        final e8m e8m = g8m.d = e8m.z;
        g8m.e = 2L;
        final Object f2 = new Object();
        ((lc0)f2).c = new long[16];
        ((lc0)f2).d = new int[16];
        final int[] e = new int[16];
        int n;
        for (int i = 0; i < 16; i = n) {
            n = i + 1;
            e[i] = n;
        }
        ((lc0)f2).e = e;
        f = (lc0)f2;
        final mlf g2 = new mlf((byte)3);
        g2.c = new int[16];
        g2.d = new srp[16];
        g = g2;
        g8m.i = (g8m.h = (List)r89.v);
        final long e2 = g8m.e;
        g8m.e = 1L + e2;
        final zmf l = new zmf(e2, e8m, null, (lta)new sfa((byte)14));
        g8m.d = g8m.d.m(l.b);
        j = (b3b)l;
        k = (cc1)new AtomicInteger(0);
    }
    
    public static final e8m a(e8m m, long n, final long n2) {
        while (mlc.v(n, n2) < 0) {
            m = m.m(n);
            ++n;
        }
        return m;
    }
    
    public static final Object b(final lta p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          8
        //     5: getstatic       g8m.c:Ljava/lang/Object;
        //     8: astore          9
        //    10: aload           9
        //    12: dup            
        //    13: astore          11
        //    15: monitorenter   
        //    16: aload           8
        //    18: getfield        zmf.h:Lumf;
        //    21: astore          7
        //    23: aload           7
        //    25: ifnull          43
        //    28: getstatic       g8m.k:Lcc1;
        //    31: iconst_1       
        //    32: invokevirtual   java/util/concurrent/atomic/AtomicInteger.addAndGet:(I)I
        //    35: pop            
        //    36: goto            43
        //    39: astore_0       
        //    40: goto            312
        //    43: aload           8
        //    45: aload_0        
        //    46: invokestatic    g8m.u:(Lb3b;Llta;)Ljava/lang/Object;
        //    49: astore_0       
        //    50: aload           11
        //    52: monitorexit    
        //    53: aload           7
        //    55: ifnull          142
        //    58: getstatic       g8m.h:Ljava/util/List;
        //    61: astore          9
        //    63: new             Llak;
        //    66: astore          10
        //    68: aload           10
        //    70: aload           7
        //    72: invokespecial   lak.<init>:(Lumf;)V
        //    75: aload           9
        //    77: invokeinterface java/util/Collection.size:()I
        //    82: istore_2       
        //    83: iconst_0       
        //    84: istore_1       
        //    85: iload_1        
        //    86: iload_2        
        //    87: if_icmpge       121
        //    90: aload           9
        //    92: iload_1        
        //    93: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    98: checkcast       Lzta;
        //   101: aload           10
        //   103: aload           8
        //   105: invokeinterface zta.d:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   110: pop            
        //   111: iinc            1, 1
        //   114: goto            85
        //   117: astore_0       
        //   118: goto            132
        //   121: getstatic       g8m.k:Lcc1;
        //   124: iconst_m1      
        //   125: invokevirtual   java/util/concurrent/atomic/AtomicInteger.addAndGet:(I)I
        //   128: pop            
        //   129: goto            142
        //   132: getstatic       g8m.k:Lcc1;
        //   135: iconst_m1      
        //   136: invokevirtual   java/util/concurrent/atomic/AtomicInteger.addAndGet:(I)I
        //   139: pop            
        //   140: aload_0        
        //   141: athrow         
        //   142: getstatic       g8m.c:Ljava/lang/Object;
        //   145: astore          8
        //   147: aload           8
        //   149: dup            
        //   150: astore          12
        //   152: monitorenter   
        //   153: invokestatic    g8m.d:()V
        //   156: aload           7
        //   158: ifnull          302
        //   161: aload           7
        //   163: getfield        umf.b:[Ljava/lang/Object;
        //   166: astore          9
        //   168: aload           7
        //   170: getfield        umf.a:[J
        //   173: astore          7
        //   175: aload           7
        //   177: arraylength    
        //   178: iconst_2       
        //   179: isub           
        //   180: istore_3       
        //   181: iload_3        
        //   182: iflt            302
        //   185: iconst_0       
        //   186: istore_1       
        //   187: aload           7
        //   189: iload_1        
        //   190: laload         
        //   191: lstore          5
        //   193: lload           5
        //   195: ldc2_w          -1
        //   198: lxor           
        //   199: bipush          7
        //   201: lshl           
        //   202: lload           5
        //   204: land           
        //   205: ldc2_w          -9187201950435737472
        //   208: land           
        //   209: ldc2_w          -9187201950435737472
        //   212: lcmp           
        //   213: ifeq            291
        //   216: bipush          8
        //   218: iload_1        
        //   219: iload_3        
        //   220: isub           
        //   221: iconst_m1      
        //   222: ixor           
        //   223: bipush          31
        //   225: iushr          
        //   226: isub           
        //   227: istore          4
        //   229: iconst_0       
        //   230: istore_2       
        //   231: iload_2        
        //   232: iload           4
        //   234: if_icmpge       284
        //   237: ldc2_w          255
        //   240: lload           5
        //   242: land           
        //   243: ldc2_w          128
        //   246: lcmp           
        //   247: ifge            271
        //   250: aload           9
        //   252: iload_1        
        //   253: iconst_3       
        //   254: ishl           
        //   255: iload_2        
        //   256: iadd           
        //   257: aaload         
        //   258: checkcast       Ljpm;
        //   261: invokestatic    g8m.p:(Ljpm;)V
        //   264: goto            271
        //   267: astore_0       
        //   268: goto            307
        //   271: lload           5
        //   273: bipush          8
        //   275: lshr           
        //   276: lstore          5
        //   278: iinc            2, 1
        //   281: goto            231
        //   284: iload           4
        //   286: bipush          8
        //   288: if_icmpne       302
        //   291: iload_1        
        //   292: iload_3        
        //   293: if_icmpeq       302
        //   296: iinc            1, 1
        //   299: goto            187
        //   302: aload           12
        //   304: monitorexit    
        //   305: aload_0        
        //   306: areturn        
        //   307: aload           12
        //   309: monitorexit    
        //   310: aload_0        
        //   311: athrow         
        //   312: aload           11
        //   314: monitorexit    
        //   315: aload_0        
        //   316: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  16     23     39     43     Any
        //  28     36     39     43     Any
        //  43     50     39     43     Any
        //  58     83     117    121    Any
        //  90     111    117    121    Any
        //  153    156    267    271    Any
        //  161    181    267    271    Any
        //  250    264    267    271    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final void c() {
        b((lta)g8m.a);
    }
    
    public static final void d() {
        final mlf g = g8m.g;
        final int b = g.b;
        int n = 0;
        int b2 = 0;
        while (true) {
            Object value = null;
            if (n >= b) {
                break;
            }
            final srp srp = ((srp[])g.d)[n];
            if (srp != null) {
                value = ((Reference)srp).get();
            }
            int n2 = b2;
            if (value != null) {
                n2 = b2;
                if (o((jpm)value)) {
                    if (b2 != n) {
                        ((srp[])g.d)[b2] = srp;
                        final int[] array = (int[])g.c;
                        array[b2] = array[n];
                    }
                    n2 = b2 + 1;
                }
            }
            ++n;
            b2 = n2;
        }
        for (int i = b2; i < b; ++i) {
            ((srp[])g.d)[i] = null;
            ((int[])g.c)[i] = 0;
        }
        if (b2 != b) {
            g.b = b2;
        }
    }
    
    public static final r7m e(final r7m r7m, final lta lta, final boolean b) {
        final boolean b2 = r7m instanceof zmf;
        if (!b2 && r7m != null) {
            return new nfo(r7m, lta, false, b);
        }
        zmf zmf;
        if (b2) {
            zmf = (zmf)r7m;
        }
        else {
            zmf = null;
        }
        return new mfo(zmf, lta, null, false, b);
    }
    
    public static final lpm f(lpm r) {
        final r7m h = h();
        final lpm r2 = r(r, h.g(), h.d());
        if (r2 == null) {
            final Object c = g8m.c;
            synchronized (c) {
                final r7m h2 = h();
                r = r(r, h2.g(), h2.d());
                monitorexit(c);
                if (r != null) {
                    return r;
                }
                q();
                throw null;
            }
        }
        return r2;
    }
    
    public static final lpm g(lpm r, final r7m r7m) {
        final lpm r2 = r(r, r7m.g(), r7m.d());
        if (r2 == null) {
            final Object c = g8m.c;
            synchronized (c) {
                r = r(r, r7m.g(), r7m.d());
                monitorexit(c);
                if (r != null) {
                    return r;
                }
                q();
                throw null;
            }
        }
        return r2;
    }
    
    public static final r7m h() {
        r7m j;
        if ((j = (r7m)g8m.b.get()) == null) {
            j = g8m.j;
        }
        return j;
    }
    
    public static final lta i(final lta lta, lta lta2, final boolean b) {
        if (!b) {
            lta2 = null;
        }
        if (lta != null && lta2 != null && lta != lta2) {
            return (lta)new f8m(lta, lta2, (byte)0);
        }
        if (lta == null) {
            return lta2;
        }
        return lta;
    }
    
    public static final lta j(final lta lta, final lta lta2) {
        if (lta != null && lta2 != null && lta != lta2) {
            return (lta)new f8m(lta, lta2, (byte)1);
        }
        if (lta == null) {
            return lta2;
        }
        return lta;
    }
    
    public static final lpm k(lpm c, final jpm jpm) {
        lpm lpm = jpm.a();
        long e = g8m.e;
        final lc0 f = g8m.f;
        if (f.a > 0) {
            e = ((long[])f.c)[0];
        }
        final lpm lpm2 = null;
        lpm lpm3 = null;
        lpm lpm4;
        while (true) {
            lpm4 = lpm2;
            if (lpm != null) {
                final long a = lpm.a;
                Label_0137: {
                    if (a != 0L) {
                        lpm lpm5 = lpm3;
                        if (a != 0L) {
                            lpm5 = lpm3;
                            if (mlc.v(a, e - 1L) <= 0) {
                                lpm5 = lpm3;
                                if (!e8m.z.f(a)) {
                                    if (lpm3 == null) {
                                        lpm5 = lpm;
                                    }
                                    else {
                                        if (mlc.v(lpm.a, lpm3.a) < 0) {
                                            break Label_0137;
                                        }
                                        lpm4 = lpm3;
                                        break;
                                    }
                                }
                            }
                        }
                        lpm = lpm.b;
                        lpm3 = lpm5;
                        continue;
                    }
                }
                lpm4 = lpm;
                break;
            }
            break;
        }
        if (lpm4 != null) {
            lpm4.a = Long.MAX_VALUE;
            return lpm4;
        }
        c = c.c(Long.MAX_VALUE);
        c.b = jpm.a();
        jpm.f(c);
        return c;
    }
    
    public static final void l(final r7m r7m, final jpm jpm) {
        r7m.t(r7m.h() + 1);
        final lta i = r7m.i();
        if (i != null) {
            i.b((Object)jpm);
        }
    }
    
    public static final HashMap m(final long n, final zmf zmf, final e8m e8m) {
        final umf x = zmf.x();
        Label_0337: {
            if (x != null) {
                final long g = zmf.g();
                final e8m j = zmf.d().m(g).j(zmf.j);
                final Object[] b = x.b;
                final long[] a = x.a;
                final int n2 = a.length - 2;
                if (n2 >= 0) {
                    int n3 = 0;
                    Map map = null;
                    while (true) {
                        long n4 = a[n3];
                        if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n5 = 8;
                            final int n6 = 8 - (~(n3 - n2) >>> 31);
                            for (int i = 0; i < n6; ++i) {
                                if ((n4 & 0xFFL) < 128L) {
                                    final jpm jpm = (jpm)b[(n3 << 3) + i];
                                    final lpm a2 = jpm.a();
                                    final lpm r = r(a2, n, e8m);
                                    if (r != null) {
                                        final lpm r2 = r(a2, g, j);
                                        if (r2 != null) {
                                            if (!r.equals(r2)) {
                                                final lpm r3 = r(a2, g, zmf.d());
                                                if (r3 == null) {
                                                    q();
                                                    throw null;
                                                }
                                                final lpm d = jpm.d(r2, r, r3);
                                                if (d == null) {
                                                    break Label_0337;
                                                }
                                                Object o;
                                                if ((o = map) == null) {
                                                    o = new HashMap();
                                                }
                                                ((Map)o).put((Object)r, (Object)d);
                                                map = (Map)o;
                                            }
                                        }
                                    }
                                }
                                n4 >>= n5;
                            }
                            if (n6 != n5) {
                                return (HashMap)map;
                            }
                        }
                        if (n3 == n2) {
                            return (HashMap)map;
                        }
                        ++n3;
                    }
                }
            }
        }
        return null;
    }
    
    public static final lpm n(lpm k, final kpm kpm, final r7m r7m, final lpm lpm) {
        if (r7m.f()) {
            r7m.n((jpm)kpm);
        }
        final long g = r7m.g();
        if (lpm.a == g) {
            return lpm;
        }
        final Object c = g8m.c;
        synchronized (c) {
            k = k(k, (jpm)kpm);
            monitorexit(c);
            k.a = g;
            r7m.n((jpm)kpm);
            return k;
        }
    }
    
    public static final boolean o(final jpm jpm) {
        lpm lpm = jpm.a();
        long e = g8m.e;
        final lc0 f = g8m.f;
        if (f.a > 0) {
            e = ((long[])f.c)[0];
        }
        lpm lpm2 = null;
        lpm lpm3 = null;
        int n = 0;
        while (lpm != null) {
            final long a = lpm.a;
            lpm lpm4 = lpm2;
            lpm lpm5 = lpm3;
            int n2 = n;
            if (a != 0L) {
                if (mlc.v(a, e) < 0) {
                    if (lpm2 == null) {
                        n2 = n + 1;
                        lpm4 = lpm;
                        lpm5 = lpm3;
                    }
                    else {
                        lpm lpm6;
                        if (mlc.v(lpm.a, lpm2.a) < 0) {
                            lpm6 = lpm;
                            lpm4 = lpm2;
                        }
                        else {
                            lpm4 = lpm;
                            lpm6 = lpm2;
                        }
                        lpm b = lpm3;
                        Label_0220: {
                            if (lpm3 == null) {
                                lpm a2;
                                lpm lpm7;
                                for (b = (a2 = jpm.a()); b != null; b = b.b, a2 = lpm7) {
                                    if (mlc.v(b.a, e) >= 0) {
                                        break Label_0220;
                                    }
                                    lpm7 = a2;
                                    if (mlc.v(a2.a, b.a) < 0) {
                                        lpm7 = b;
                                    }
                                }
                                b = a2;
                            }
                        }
                        lpm6.a = 0L;
                        lpm6.a(b);
                        lpm5 = b;
                        n2 = n;
                    }
                }
                else {
                    n2 = n + 1;
                    lpm5 = lpm3;
                    lpm4 = lpm2;
                }
            }
            lpm = lpm.b;
            lpm2 = lpm4;
            lpm3 = lpm5;
            n = n2;
        }
        return n > 1;
    }
    
    public static final void p(final jpm jpm) {
        if (o(jpm)) {
            final mlf g = g8m.g;
            final int b = g.b;
            final int identityHashCode = System.identityHashCode((Object)jpm);
            int n = -1;
            Label_0315: {
                if (b > 0) {
                    int n2 = g.b - 1;
                    int i = 0;
                Label_0131:
                    while (true) {
                        while (i <= n2) {
                            final int n3 = i + n2 >>> 1;
                            final int n4 = ((int[])g.c)[n3];
                            if (n4 < identityHashCode) {
                                i = n3 + 1;
                            }
                            else if (n4 > identityHashCode) {
                                n2 = n3 - 1;
                            }
                            else {
                                final srp srp = ((srp[])g.d)[n3];
                                Object value;
                                if (srp != null) {
                                    value = ((Reference)srp).get();
                                }
                                else {
                                    value = null;
                                }
                                int j;
                                if (jpm == value) {
                                    j = n3;
                                }
                                else {
                                    for (j = n3 - 1; -1 < j && ((int[])g.c)[j] == identityHashCode; --j) {
                                        final srp srp2 = ((srp[])g.d)[j];
                                        Object value2;
                                        if (srp2 != null) {
                                            value2 = ((Reference)srp2).get();
                                        }
                                        else {
                                            value2 = null;
                                        }
                                        if (value2 == jpm) {
                                            break Label_0131;
                                        }
                                    }
                                    for (j = n3 + 1; j < g.b; ++j) {
                                        if (((int[])g.c)[j] != identityHashCode) {
                                            j = -(j + 1);
                                            break Label_0131;
                                        }
                                        final srp srp3 = ((srp[])g.d)[j];
                                        Object value3;
                                        if (srp3 != null) {
                                            value3 = ((Reference)srp3).get();
                                        }
                                        else {
                                            value3 = null;
                                        }
                                        if (value3 == jpm) {
                                            break Label_0131;
                                        }
                                    }
                                    j = -(g.b + 1);
                                }
                                n = j;
                                if (j >= 0) {
                                    return;
                                }
                                break Label_0315;
                            }
                        }
                        int j = -(i + 1);
                        continue Label_0131;
                    }
                }
            }
            final int n5 = -(n + 1);
            final srp[] array = (srp[])g.d;
            final int length = array.length;
            if (b == length) {
                final int n6 = length * 2;
                final srp[] d = new srp[n6];
                final int[] c = new int[n6];
                final int n7 = n5 + 1;
                System.arraycopy((Object)array, n5, (Object)d, n7, b - n5);
                System.arraycopy((Object)g.d, 0, (Object)d, 0, n5);
                iw0.J0(n7, n5, b, (int[])g.c, c);
                iw0.N0(0, n5, 6, (int[])g.c, c);
                g.d = d;
                g.c = c;
            }
            else {
                final int n8 = n5 + 1;
                System.arraycopy((Object)array, n5, (Object)array, n8, b - n5);
                final int[] array2 = (int[])g.c;
                iw0.J0(n8, n5, b, array2, array2);
            }
            ((srp[])g.d)[n5] = (srp)new WeakReference((Object)jpm);
            ((int[])g.c)[n5] = identityHashCode;
            ++g.b;
        }
    }
    
    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }
    
    public static final lpm r(lpm b, final long n, final e8m e8m) {
        lpm lpm = null;
        while (b != null) {
            final long a = b.a;
            lpm lpm2 = lpm;
            Label_0080: {
                if (a != 0L) {
                    lpm2 = lpm;
                    if (mlc.v(a, n) <= 0) {
                        lpm2 = lpm;
                        if (!e8m.f(a)) {
                            if (lpm != null) {
                                lpm2 = lpm;
                                if (mlc.v(lpm.a, b.a) >= 0) {
                                    break Label_0080;
                                }
                            }
                            lpm2 = b;
                        }
                    }
                }
            }
            b = b.b;
            lpm = lpm2;
        }
        if (lpm != null) {
            return lpm;
        }
        return null;
    }
    
    public static final lpm s(lpm r, final jpm jpm) {
        final r7m h = h();
        final lta e = h.e();
        if (e != null) {
            e.b((Object)jpm);
        }
        r = r(r, h.g(), h.d());
        if (r == null) {
            final Object c = g8m.c;
            synchronized (c) {
                final r7m h2 = h();
                final lpm a = jpm.a();
                a.getClass();
                final lpm r2 = r(a, h2.g(), h2.d());
                if (r2 != null) {
                    return r2;
                }
                q();
                throw null;
            }
        }
        return r;
    }
    
    public static final void t(final int b) {
        final lc0 f = g8m.f;
        int i = ((int[])f.e)[b];
        f.d(i, f.a - 1);
        --f.a;
        final long[] array = (long[])f.c;
        final long n = array[i];
        int n2;
        for (int j = i; j > 0; j = n2) {
            n2 = (j + 1 >> 1) - 1;
            if (mlc.v(array[n2], n) <= 0) {
                break;
            }
            f.d(n2, j);
        }
        final long[] array2 = (long[])f.c;
        while (i < f.a >> 1) {
            final int n3 = i + 1 << 1;
            final int n4 = n3 - 1;
            if (n3 < f.a && mlc.v(array2[n3], array2[n4]) < 0) {
                if (mlc.v(array2[n3], array2[i]) >= 0) {
                    break;
                }
                f.d(n3, i);
                i = n3;
            }
            else {
                if (mlc.v(array2[n4], array2[i]) >= 0) {
                    break;
                }
                f.d(n4, i);
                i = n4;
            }
        }
        ((int[])f.e)[b] = f.b;
        f.b = b;
    }
    
    public static final Object u(final b3b b3b, final lta lta) {
        final long b = b3b.b;
        final Object b2 = lta.b((Object)g8m.d.d(b));
        final long e = g8m.e;
        g8m.e = 1L + e;
        final e8m a = g8m.d = g8m.d.d(b);
        b3b.b = e;
        b3b.a = a;
        b3b.g = 0;
        b3b.h = null;
        b3b.o();
        g8m.d = g8m.d.m(e);
        return b2;
    }
    
    public static final void v(final r7m r7m) {
        if (!g8m.d.f(r7m.g())) {
            final long g = r7m.g();
            final boolean c = r7m.c;
            zmf zmf;
            if (r7m instanceof zmf) {
                zmf = (zmf)r7m;
            }
            else {
                zmf = null;
            }
            Object value;
            if (zmf != null) {
                value = zmf.m;
            }
            else {
                value = "read-only";
            }
            final Object c2 = g8m.c;
            synchronized (c2) {
                final lc0 f = g8m.f;
                long n;
                if (f.a > 0) {
                    n = ((long[])f.c)[0];
                }
                else {
                    n = -1L;
                }
                monitorexit(c2);
                final StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
                sb.append(g);
                sb.append(", disposed=");
                sb.append(c);
                sb.append(", applied=");
                sb.append(value);
                sb.append(", lowestPin=");
                sb.append((Object)n);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
    }
    
    public static final lpm w(lpm o, final jpm jpm, final r7m r7m) {
        if (r7m.f()) {
            r7m.n(jpm);
        }
        final long g = r7m.g();
        if ((o = r((lpm)o, g, r7m.d())) == null) {
            final Object c = g8m.c;
            synchronized (c) {
                final r7m h = h();
                final lpm a = jpm.a();
                a.getClass();
                o = r(a, h.g(), h.d());
                if (o == null) {
                    q();
                    throw null;
                }
            }
        }
        if (((lpm)o).a == r7m.g()) {
            return (lpm)o;
        }
        final Object c2;
        monitorenter(c2 = g8m.c);
        Label_0202: {
            try {
                final lpm r = r(jpm.a(), g, r7m.d());
                if (r != null) {
                    if (r.a == g) {
                        o = r;
                    }
                    else {
                        o = k(r, jpm);
                        ((lpm)o).a(r);
                        ((lpm)o).a = r7m.g();
                    }
                    monitorexit(c2);
                    r7m.n(jpm);
                    return (lpm)o;
                }
            }
            finally {
                break Label_0202;
            }
            q();
            throw null;
        }
        monitorexit(c2);
    }
}
