import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import androidx.compose.runtime.d;
import java.util.Iterator;
import android.os.Trace;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class yl6 implements c0j, sl6
{
    public final v5m A;
    public final tmf B;
    public final umf C;
    public final umf D;
    public final tmf E;
    public final fd3 F;
    public final fd3 G;
    public final tmf H;
    public tmf I;
    public boolean J;
    public vwl K;
    public iwg L;
    public yl6 M;
    public int N;
    public final j9j O;
    public final yb0 P;
    public final gva Q;
    public byte R;
    public final tl6 v;
    public final v w;
    public final AtomicReference x;
    public final Object y;
    public final xmf z;
    
    public yl6(final tl6 v, final v w) {
        this.v = v;
        this.w = w;
        this.x = new AtomicReference((Object)null);
        this.y = new Object();
        final umf umf = new umf();
        xmf e;
        if ((e = umf.e) == null) {
            e = new xmf(umf);
            umf.e = e;
        }
        this.z = e;
        final v5m a = new v5m();
        if (v.e()) {
            a.F = new jlf();
        }
        if (v.g()) {
            a.d();
        }
        this.A = a;
        this.B = rhc.k();
        this.C = new umf();
        this.D = new umf();
        this.E = rhc.k();
        final fd3 f = new fd3();
        this.F = f;
        final fd3 g = new fd3();
        this.G = g;
        this.H = rhc.k();
        this.I = rhc.k();
        final j9j o = new j9j((Object)v, (byte)9);
        this.O = o;
        this.P = new yb0();
        final gva q = new gva(w, v, x5m.a(a), e, f, g, o, this);
        v.s(q);
        this.Q = q;
    }
    
    public final void A(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        yl6.y:Ljava/lang/Object;
        //     4: astore          8
        //     6: aload           8
        //     8: dup            
        //     9: astore          10
        //    11: monitorenter   
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokevirtual   yl6.w:(Ljava/lang/Object;)V
        //    17: aload_0        
        //    18: getfield        yl6.E:Ltmf;
        //    21: aload_1        
        //    22: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //    25: astore_1       
        //    26: aload_1        
        //    27: ifnull          195
        //    30: aload_1        
        //    31: instanceof      Lumf;
        //    34: ifeq            187
        //    37: aload_1        
        //    38: checkcast       Lumf;
        //    41: astore          9
        //    43: aload           9
        //    45: getfield        umf.b:[Ljava/lang/Object;
        //    48: astore_1       
        //    49: aload           9
        //    51: getfield        umf.a:[J
        //    54: astore          9
        //    56: aload           9
        //    58: arraylength    
        //    59: iconst_2       
        //    60: isub           
        //    61: istore          4
        //    63: iload           4
        //    65: iflt            195
        //    68: iconst_0       
        //    69: istore_2       
        //    70: aload           9
        //    72: iload_2        
        //    73: laload         
        //    74: lstore          6
        //    76: lload           6
        //    78: ldc2_w          -1
        //    81: lxor           
        //    82: bipush          7
        //    84: lshl           
        //    85: lload           6
        //    87: land           
        //    88: ldc2_w          -9187201950435737472
        //    91: land           
        //    92: ldc2_w          -9187201950435737472
        //    95: lcmp           
        //    96: ifeq            175
        //    99: bipush          8
        //   101: iload_2        
        //   102: iload           4
        //   104: isub           
        //   105: iconst_m1      
        //   106: ixor           
        //   107: bipush          31
        //   109: iushr          
        //   110: isub           
        //   111: istore          5
        //   113: iconst_0       
        //   114: istore_3       
        //   115: iload_3        
        //   116: iload           5
        //   118: if_icmpge       168
        //   121: ldc2_w          255
        //   124: lload           6
        //   126: land           
        //   127: ldc2_w          128
        //   130: lcmp           
        //   131: ifge            155
        //   134: aload_0        
        //   135: aload_1        
        //   136: iload_2        
        //   137: iconst_3       
        //   138: ishl           
        //   139: iload_3        
        //   140: iadd           
        //   141: aaload         
        //   142: checkcast       Lsd8;
        //   145: invokevirtual   yl6.w:(Ljava/lang/Object;)V
        //   148: goto            155
        //   151: astore_1       
        //   152: goto            199
        //   155: lload           6
        //   157: bipush          8
        //   159: lshr           
        //   160: lstore          6
        //   162: iinc            3, 1
        //   165: goto            115
        //   168: iload           5
        //   170: bipush          8
        //   172: if_icmpne       195
        //   175: iload_2        
        //   176: iload           4
        //   178: if_icmpeq       195
        //   181: iinc            2, 1
        //   184: goto            70
        //   187: aload_0        
        //   188: aload_1        
        //   189: checkcast       Lsd8;
        //   192: invokevirtual   yl6.w:(Ljava/lang/Object;)V
        //   195: aload           10
        //   197: monitorexit    
        //   198: return         
        //   199: aload           10
        //   201: monitorexit    
        //   202: aload_1        
        //   203: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     26     151    155    Any
        //  30     63     151    155    Any
        //  134    148    151    155    Any
        //  187    195    151    155    Any
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
    
    public final void B(final zta zta) {
        final boolean m = this.m();
        this.t();
        final tl6 v = this.v;
        if (m) {
            final gva q = this.Q;
            q.z = 0;
            q.y = true;
            v.a(this, zta);
            if (q.F || q.z != 0) {
                pih.a("Cannot disable reuse from root if it was caused by other groups");
            }
            q.z = -1;
            q.y = false;
            return;
        }
        v.a(this, zta);
    }
    
    @Override
    public final void a() {
        final Object y;
        monitorenter(y = this.y);
        Label_0332: {
            try {
                if (this.Q.F) {
                    pih.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
            }
            finally {
                break Label_0332;
            }
            Label_0320: {
                if (this.R != 3) {
                    this.R = 3;
                    final fd3 l = this.Q.L;
                    if (l != null) {
                        this.i(l);
                    }
                    final boolean b = this.A.w == 0;
                    yb0 p = null;
                    Label_0313: {
                        if (!b || !this.z.v.g()) {
                            p = this.P;
                            Object o = this.z;
                            final wl6 d = this.Q.D();
                            Label_0226: {
                                yb0 p2;
                                try {
                                    p.s((Set)o, d);
                                    if (!b) {
                                        o = this.A;
                                        p2 = this.P;
                                        final Object o2;
                                        o = (o2 = ((v5m)o).o());
                                        final int n = ((y5m)o2).t;
                                        final l0 l2 = new(l0.class)();
                                        final l0 l4;
                                        final l0 l3 = l4 = l2;
                                        final yb0 yb0 = p2;
                                        final byte b2 = 7;
                                        new l0((Object)yb0, b2);
                                        final v5m v5m = (v5m)o;
                                        final int n2 = n;
                                        final l0 l5 = l3;
                                        ((y5m)v5m).m(n2, (zta)l5);
                                        final v5m v5m2 = (v5m)o;
                                        ((y5m)v5m2).I();
                                        final v5m v5m3 = (v5m)o;
                                        final boolean b3 = true;
                                        ((y5m)v5m3).e(b3);
                                        final yl6 yl6 = this;
                                        final v v = yl6.w;
                                        v.f();
                                        final yl6 yl7 = this;
                                        final v v2 = yl7.w;
                                        ((it0)v2).i();
                                        final yb0 yb2 = p;
                                        yb2.l();
                                    }
                                    break Label_0226;
                                }
                                finally {
                                    break Label_0313;
                                }
                                try {
                                    final Object o2 = o;
                                    final int n = ((y5m)o2).t;
                                    final l0 l2 = new(l0.class)();
                                    final l0 l4;
                                    final l0 l3 = l4 = l2;
                                    final yb0 yb0 = p2;
                                    final byte b2 = 7;
                                    new l0((Object)yb0, b2);
                                    final v5m v5m = (v5m)o;
                                    final int n2 = n;
                                    final l0 l5 = l3;
                                    ((y5m)v5m).m(n2, (zta)l5);
                                    final v5m v5m2 = (v5m)o;
                                    ((y5m)v5m2).I();
                                    final v5m v5m3 = (v5m)o;
                                    final boolean b3 = true;
                                    ((y5m)v5m3).e(b3);
                                    final yl6 yl6 = this;
                                    final v v = yl6.w;
                                    v.f();
                                    final yl6 yl7 = this;
                                    final v v2 = yl7.w;
                                    ((it0)v2).i();
                                    final yb0 yb2 = p;
                                    yb2.l();
                                }
                                finally {
                                    ((y5m)o).e(false);
                                }
                            }
                            p.k();
                            p.j();
                        }
                        this.H.a();
                        final gva q = this.Q;
                        q.getClass();
                        Trace.beginSection("Compose:Composer.dispose");
                        try {
                            q.b.x(q);
                            q.E.clear();
                            q.s.clear();
                            q.e.f.g0();
                            q.v = null;
                            q.a.f();
                            break Label_0320;
                        }
                        finally {
                            Trace.endSection();
                        }
                    }
                    p.j();
                }
            }
            monitorexit(y);
            this.v.y(this);
            return;
        }
        monitorexit(y);
    }
    
    @Override
    public final void b() {
        this.J = true;
        this.O.q();
    }
    
    @Override
    public final void c(Object g) {
        final gva q = this.Q;
        if (q.A <= 0) {
            final b0j b = q.B();
            if (b != null) {
                final int b2 = b.b | 0x1;
                b.b = b2;
                boolean b3 = false;
                Label_0150: {
                    if ((b2 & 0x20) == 0x0) {
                        amf f;
                        if ((f = b.f) == null) {
                            f = new amf();
                            b.f = f;
                        }
                        final int e = b.e;
                        int c = f.c(g);
                        int n;
                        if (c < 0) {
                            c ^= -1;
                            n = -1;
                        }
                        else {
                            n = f.c[c];
                        }
                        f.b[c] = g;
                        f.c[c] = e;
                        if (n == b.e) {
                            b3 = true;
                            break Label_0150;
                        }
                    }
                    b3 = false;
                }
                this.O.q();
                if (!b3) {
                    if (g instanceof kpm) {
                        ((kpm)g).g(1);
                    }
                    rhc.d(this.B, g, (Object)b);
                    if (g instanceof sd8) {
                        final sd8 sd8 = (sd8)g;
                        final rd8 i = sd8.i();
                        final tmf e2 = this.E;
                        rhc.V(e2, g);
                        final amf e3 = i.e;
                        final Object[] b4 = e3.b;
                        final long[] a = e3.a;
                        final int n2 = a.length - 2;
                        if (n2 >= 0) {
                            int n3 = 0;
                            while (true) {
                                long n4 = a[n3];
                                if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                                    final int n5 = 8;
                                    final int n6 = 8 - (~(n3 - n2) >>> 31);
                                    for (int j = 0; j < n6; ++j) {
                                        if ((n4 & 0xFFL) < 128L) {
                                            final jpm jpm = (jpm)b4[(n3 << 3) + j];
                                            if (jpm instanceof kpm) {
                                                ((kpm)jpm).g(1);
                                            }
                                            rhc.d(e2, (Object)jpm, g);
                                        }
                                        n4 >>= n5;
                                    }
                                    if (n6 != n5) {
                                        break;
                                    }
                                }
                                if (n3 == n2) {
                                    break;
                                }
                                ++n3;
                            }
                        }
                        final Object f2 = i.f;
                        if ((g = b.g) == null) {
                            g = new tmf();
                            b.g = (tmf)g;
                        }
                        ((tmf)g).m((Object)sd8, f2);
                    }
                }
            }
        }
    }
    
    @Override
    public final int d(final b0j b0j, final Object o) {
        final int b = b0j.b;
        if ((b & 0x2) != 0x0) {
            b0j.b = (b | 0x4);
        }
        final bva c = b0j.c;
        if (c != null) {
            if (c.a()) {
                final v5m a = this.A;
                a.getClass();
                final bva c2 = b0j.c;
                if (c2 != null && a.r(r6k.f(c2))) {
                    if (b0j.d != null) {
                        final int v = this.v(b0j, c, o);
                        if (v != 1) {
                            this.O.q();
                        }
                        return v;
                    }
                    return 1;
                }
                else {
                    final Object y = this.y;
                    synchronized (y) {
                        final yl6 m = this.M;
                        monitorexit(y);
                        if (m != null) {
                            final gva q = m.Q;
                            if (q.F && q.m0(b0j, o)) {
                                return 4;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
        return 1;
    }
    
    public final void e() {
        this.x.set((Object)null);
        this.F.f.g0();
        this.G.f.g0();
        final xmf z = this.z;
        if (!z.v.g()) {
            final yb0 p = this.P;
            final wl6 d = this.Q.D();
            try {
                p.s((Set)z, d);
                p.k();
            }
            finally {
                p.j();
            }
        }
    }
    
    public final void f(final Object o, final boolean b) {
        final Object g = this.B.g(o);
        if (g != null) {
            final boolean b2 = g instanceof umf;
            final umf c = this.C;
            final umf d = this.D;
            final tmf h = this.H;
            if (b2) {
                final umf umf = (umf)g;
                final Object[] b3 = umf.b;
                final long[] a = umf.a;
                final int n = a.length - 2;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        long n3 = a[n2];
                        if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n4 = 8 - (~(n2 - n) >>> 31);
                            for (int i = 0; i < n4; ++i) {
                                if ((0xFFL & n3) < 128L) {
                                    final b0j b0j = (b0j)b3[(n2 << 3) + i];
                                    if (!rhc.U(h, o, (Object)b0j) && b0j.b(o) != 1) {
                                        if (b0j.g != null && !b) {
                                            d.a((Object)b0j);
                                        }
                                        else {
                                            c.a((Object)b0j);
                                        }
                                    }
                                }
                                n3 >>= 8;
                            }
                            if (n4 != 8) {
                                break;
                            }
                        }
                        if (n2 == n) {
                            break;
                        }
                        ++n2;
                    }
                }
            }
            else {
                final b0j b0j2 = (b0j)g;
                if (!rhc.U(h, o, (Object)b0j2) && b0j2.b(o) != 1) {
                    if (b0j2.g != null && !b) {
                        d.a((Object)b0j2);
                        return;
                    }
                    c.a((Object)b0j2);
                }
            }
        }
    }
    
    public final void g(final Set set, final boolean b) {
        final boolean b2 = set instanceof lak;
        final tmf e = this.E;
        int n16;
        if (b2) {
            final umf v = ((lak)set).v;
            final Object[] b3 = v.b;
            long[] a = v.a;
            final int n = a.length - 2;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    int n3 = 8;
                    long n4 = a[n2];
                    final int n5 = 7;
                    if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n6 = 8 - (~(n2 - n) >>> 31);
                        for (int i = 0; i < n6; ++i) {
                            if ((n4 & 0xFFL) < 128L) {
                                final Object o = b3[(n2 << 3) + i];
                                if (o instanceof b0j) {
                                    ((b0j)o).b(null);
                                }
                                else {
                                    this.f(o, b);
                                    final Object g = e.g(o);
                                    if (g != null) {
                                        if (g instanceof umf) {
                                            final umf umf = (umf)g;
                                            final Object[] b4 = umf.b;
                                            final long[] a2 = umf.a;
                                            final int n7 = a2.length - 2;
                                            if (n7 >= 0) {
                                                final int n8 = 0;
                                                int n9 = n3;
                                                int n10 = n8;
                                                while (true) {
                                                    final long n11 = a2[n10];
                                                    final long n12 = n4;
                                                    long[] array;
                                                    if ((~n11 << n5 & n11 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                        final int n13 = 8 - (~(n10 - n7) >>> 31);
                                                        int j = 0;
                                                        long n14 = n11;
                                                        while (j < n13) {
                                                            if ((n14 & 0xFFL) < 128L) {
                                                                this.f(b4[(n10 << 3) + j], b);
                                                            }
                                                            n14 >>= n9;
                                                            ++j;
                                                        }
                                                        array = a;
                                                        n4 = n12;
                                                        a = array;
                                                        if (n13 != n9) {
                                                            break;
                                                        }
                                                    }
                                                    else {
                                                        array = a;
                                                    }
                                                    n4 = n12;
                                                    a = array;
                                                    if (n10 == n7) {
                                                        break;
                                                    }
                                                    ++n10;
                                                    n4 = n12;
                                                    a = array;
                                                    n9 = 8;
                                                }
                                            }
                                        }
                                        else {
                                            this.f(g, b);
                                        }
                                    }
                                }
                                n3 = 8;
                            }
                            n4 >>= n3;
                        }
                        final int n15 = n16 = n5;
                        if (n6 != n3) {
                            break;
                        }
                        n16 = n15;
                    }
                    else {
                        n16 = 7;
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
            else {
                n16 = 7;
            }
        }
        else {
            final int n17 = 7;
            final Iterator iterator = ((Iterable)set).iterator();
            while (true) {
                n16 = n17;
                if (!iterator.hasNext()) {
                    break;
                }
                final Object next = iterator.next();
                if (next instanceof b0j) {
                    ((b0j)next).b(null);
                }
                else {
                    this.f(next, b);
                    final Object g2 = e.g(next);
                    if (g2 == null) {
                        continue;
                    }
                    if (g2 instanceof umf) {
                        final umf umf2 = (umf)g2;
                        final Object[] b5 = umf2.b;
                        final long[] a3 = umf2.a;
                        final int n18 = a3.length - 2;
                        if (n18 < 0) {
                            continue;
                        }
                        int n19 = 0;
                        while (true) {
                            long n20 = a3[n19];
                            if ((~n20 << 7 & n20 & 0x8080808080808080L) != 0x8080808080808080L) {
                                final int n21 = 8 - (~(n19 - n18) >>> 31);
                                for (int k = 0; k < n21; ++k) {
                                    if ((n20 & 0xFFL) < 128L) {
                                        this.f(b5[(n19 << 3) + k], b);
                                    }
                                    n20 >>= 8;
                                }
                                if (n21 != 8) {
                                    break;
                                }
                            }
                            if (n19 == n18) {
                                break;
                            }
                            ++n19;
                        }
                    }
                    else {
                        this.f(g2, b);
                    }
                }
            }
        }
        final tmf b6 = this.B;
        final umf c = this.C;
        if (b) {
            final umf d = this.D;
            if (d.h()) {
                long[] a4 = b6.a;
                final int n22 = a4.length - 2;
                if (n22 >= 0) {
                    int n23 = 0;
                    while (true) {
                        long n24 = a4[n23];
                        if ((~n24 << n16 & n24 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n25 = 8 - (~(n23 - n22) >>> 31);
                            for (int l = 0; l < n25; ++l) {
                                if ((n24 & 0xFFL) < 128L) {
                                    final int n26 = (n23 << 3) + l;
                                    final Object o2 = b6.b[n26];
                                    final Object o3 = b6.c[n26];
                                    long[] array2;
                                    boolean g3;
                                    if (o3 instanceof umf) {
                                        final umf umf3 = (umf)o3;
                                        final Object[] b7 = umf3.b;
                                        final long[] a5 = umf3.a;
                                        final int n27 = a5.length - 2;
                                        if (n27 >= 0) {
                                            int n28 = 0;
                                            while (true) {
                                                long n29 = a5[n28];
                                                if ((~n29 << n16 & n29 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                    final int n30 = 8 - (~(n28 - n27) >>> 31);
                                                    for (int n31 = 0; n31 < n30; ++n31) {
                                                        if ((n29 & 0xFFL) < 128L) {
                                                            final int n32 = (n28 << 3) + n31;
                                                            final b0j b0j = (b0j)b7[n32];
                                                            if (d.c((Object)b0j) || c.c((Object)b0j)) {
                                                                umf3.m(n32);
                                                            }
                                                        }
                                                        n29 >>= 8;
                                                    }
                                                    array2 = a4;
                                                    if (n30 != 8) {
                                                        break;
                                                    }
                                                }
                                                array2 = a4;
                                                if (n28 == n27) {
                                                    break;
                                                }
                                                ++n28;
                                            }
                                        }
                                        else {
                                            array2 = a4;
                                        }
                                        g3 = umf3.g();
                                    }
                                    else {
                                        o3.getClass();
                                        final b0j b0j2 = (b0j)o3;
                                        if (!d.c((Object)b0j2) && !c.c((Object)b0j2)) {
                                            g3 = false;
                                            array2 = a4;
                                        }
                                        else {
                                            g3 = true;
                                            array2 = a4;
                                        }
                                    }
                                    a4 = array2;
                                    if (g3) {
                                        b6.l(n26);
                                        a4 = array2;
                                    }
                                }
                                n24 >>= 8;
                            }
                            if (n25 != 8) {
                                break;
                            }
                        }
                        if (n23 == n22) {
                            break;
                        }
                        ++n23;
                    }
                }
                d.b();
                this.l();
                return;
            }
        }
        if (c.h()) {
            long[] a6 = b6.a;
            final int n33 = a6.length - 2;
            if (n33 >= 0) {
                int n34 = 0;
                while (true) {
                    long n35 = a6[n34];
                    if ((~n35 << n16 & n35 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n36 = 8 - (~(n34 - n33) >>> 31);
                        for (int n37 = 0; n37 < n36; ++n37) {
                            if ((n35 & 0xFFL) < 128L) {
                                final int n38 = (n34 << 3) + n37;
                                final Object o4 = b6.b[n38];
                                final Object o5 = b6.c[n38];
                                long[] array3;
                                boolean b9;
                                if (o5 instanceof umf) {
                                    final umf umf4 = (umf)o5;
                                    final Object[] b8 = umf4.b;
                                    final long[] a7 = umf4.a;
                                    final int n39 = a7.length - 2;
                                    if (n39 >= 0) {
                                        int n40 = 0;
                                        while (true) {
                                            long n41 = a7[n40];
                                            if ((~n41 << n16 & n41 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                final int n42 = 8 - (~(n40 - n39) >>> 31);
                                                for (int n43 = 0; n43 < n42; ++n43) {
                                                    if ((n41 & 0xFFL) < 128L) {
                                                        final int n44 = (n40 << 3) + n43;
                                                        if (c.c((Object)b8[n44])) {
                                                            umf4.m(n44);
                                                        }
                                                    }
                                                    n41 >>= 8;
                                                }
                                                array3 = a6;
                                                if (n42 != 8) {
                                                    break;
                                                }
                                            }
                                            array3 = a6;
                                            if (n40 == n39) {
                                                break;
                                            }
                                            ++n40;
                                        }
                                    }
                                    else {
                                        array3 = a6;
                                    }
                                    b9 = umf4.g();
                                }
                                else {
                                    o5.getClass();
                                    b9 = c.c((Object)o5);
                                    array3 = a6;
                                }
                                a6 = array3;
                                if (b9) {
                                    b6.l(n38);
                                    a6 = array3;
                                }
                            }
                            n35 >>= 8;
                        }
                        if (n36 != 8) {
                            break;
                        }
                    }
                    if (n34 == n33) {
                        break;
                    }
                    ++n34;
                }
            }
            this.l();
            c.b();
        }
    }
    
    public final void h() {
        final Object y;
        monitorenter(y = this.y);
        try {
            this.i(this.F);
            this.r();
            monitorexit(y);
        }
        finally {
            EndFinally_3: {
                yb0 p = null;
                xmf z = null;
                wl6 d = null;
                Label_0089: {
                    try {
                        if (!this.z.v.g()) {
                            p = this.P;
                            z = this.z;
                            d = this.Q.D();
                            final yb0 yb0 = p;
                            final xmf xmf = z;
                            final wl6 wl6 = d;
                            yb0.s((Set)xmf, wl6);
                            final yb0 yb2 = p;
                            yb2.k();
                            break Label_0089;
                        }
                        break Label_0089;
                    }
                    finally {
                        final yb0 yb3;
                        p = yb3;
                        try {
                            this.e();
                        }
                        finally {
                            monitorexit(y);
                        }
                        break EndFinally_3;
                    }
                }
                try {
                    final yb0 yb0 = p;
                    final xmf xmf = z;
                    final wl6 wl6 = d;
                    yb0.s((Set)xmf, wl6);
                    final yb0 yb2 = p;
                    yb2.k();
                }
                finally {}
            }
        }
    }
    
    public final void i(fd3 o) {
        final fd3 g = this.G;
        final gva q = this.Q;
        Object o2 = q.D();
        Object p = this.P;
        ((yb0)p).s((Set)this.z, (wl6)o2);
        Label_0975: {
            Label_0938: {
                int n = 0;
                Label_0124: {
                    try {
                        n = (((fd3)o).f.i0() ? 1 : 0);
                        if (n != 0) {
                            Label_0086: {
                                try {
                                    if (g.f.i0() && this.L == null) {
                                        ((yb0)p).k();
                                    }
                                }
                                finally {
                                    break Label_0086;
                                }
                                ((yb0)p).j();
                                return;
                            }
                            ((yb0)p).j();
                        }
                        else {
                            o2 = this.L;
                            if (o2 != null) {
                                o2 = ((iwg)o2).d();
                                break Label_0124;
                            }
                        }
                    }
                    finally {
                        break Label_0938;
                    }
                    o2 = this.w;
                }
                final iwg l = this.L;
                d d;
                if (l != null) {
                    d = l.d();
                }
                else {
                    d = null;
                }
                Object o3;
                if (o2.equals(d)) {
                    o3 = "Compose:recordChanges";
                }
                else {
                    o3 = "Compose:applyChanges";
                }
                Trace.beginSection((String)o3);
                Label_0921: {
                    Label_0205: {
                        try {
                            o3 = this.L;
                            if (o3 != null) {
                                o3 = ((iwg)o3).e();
                                break Label_0205;
                            }
                        }
                        finally {
                            break Label_0921;
                        }
                        o3 = p;
                    }
                    Object o4 = this.A;
                    final wl6 d2 = q.D();
                    Object o5 = x5m.a((v5m)o4).o();
                    try {
                        final fd3 fd3;
                        fd3.p0((it0)o2, (y5m)o5, (yb0)o3, d2);
                        ((y5m)o5).e(true);
                        ((it0)o2).i();
                        Trace.endSection();
                        ((yb0)p).l();
                        ((yb0)p).m();
                        Label_0904: {
                            Label_0869: {
                                if (this.J) {
                                    String s2 = null;
                                    String s4 = null;
                                    Label_0854: {
                                        String s3 = null;
                                        Label_0834: {
                                            while (true) {
                                                Trace.beginSection("Compose:unobserve");
                                                String s = (String)p;
                                                while (true) {
                                                    int n2 = 0;
                                                    int n3 = 0;
                                                    Label_0809: {
                                                        Label_0802: {
                                                            int n7 = 0;
                                                            int n8 = 0;
                                                        Label_0787:
                                                            while (true) {
                                                                long n4 = 0L;
                                                                int n9 = 0;
                                                                Label_0775: {
                                                                    int n10 = 0;
                                                                    long n14 = 0L;
                                                                    Label_0749: {
                                                                        try {
                                                                            this.J = false;
                                                                            s = (String)p;
                                                                            o4 = this.B;
                                                                            s = (String)p;
                                                                            final long[] a = ((tmf)o4).a;
                                                                            s = (String)p;
                                                                            n2 = a.length - 2;
                                                                            if (n2 < 0) {
                                                                                break;
                                                                            }
                                                                            n3 = 0;
                                                                            s2 = (String)p;
                                                                            p = a;
                                                                            n4 = p[n3];
                                                                            final int n5 = 7;
                                                                            final long n6 = -9187201950435737472L;
                                                                            if ((~n4 << 7 & n4 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                                                break Label_0802;
                                                                            }
                                                                            n7 = 8;
                                                                            n8 = 8 - (~(n3 - n2) >>> 31);
                                                                            n9 = 0;
                                                                            if (n9 >= n8) {
                                                                                break Label_0787;
                                                                            }
                                                                            if ((n4 & 0xFFL) >= 128L) {
                                                                                break Label_0775;
                                                                            }
                                                                            n10 = (n3 << 3) + n9;
                                                                            s = s2;
                                                                            p = ((tmf)o4).b[n10];
                                                                            s = s2;
                                                                            o5 = ((tmf)o4).c[n10];
                                                                            s = s2;
                                                                            if (o5 instanceof umf) {
                                                                                s = s2;
                                                                                final umf umf = (umf)o5;
                                                                                s = s2;
                                                                                final Object[] b = umf.b;
                                                                                s = s2;
                                                                                o5 = umf.a;
                                                                                s = s2;
                                                                                final int n11 = ((umf)o5).length - 2;
                                                                                s = s2;
                                                                                if (n11 >= 0) {
                                                                                    final int n12 = 0;
                                                                                    int n13 = n7;
                                                                                    n7 = n12;
                                                                                    while (true) {
                                                                                        n14 = o5[n7];
                                                                                        if ((~n14 << n5 & n14 & n6) != n6) {
                                                                                            final int n15 = 8 - (~(n7 - n11) >>> 31);
                                                                                            for (int i = 0; i < n15; ++i) {
                                                                                                if ((n14 & 0xFFL) < 128L) {
                                                                                                    final int n16 = (n7 << 3) + i;
                                                                                                    p = s;
                                                                                                    try {
                                                                                                        if (!((b0j)b[n16]).a()) {
                                                                                                            p = s;
                                                                                                            umf.m(n16);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {}
                                                                                                }
                                                                                                n14 >>= n13;
                                                                                            }
                                                                                            n14 = n4;
                                                                                            if (n15 != n13) {
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        n14 = n4;
                                                                                        if (n7 == n11) {
                                                                                            break;
                                                                                        }
                                                                                        ++n7;
                                                                                        n13 = 8;
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    n14 = n4;
                                                                                }
                                                                                p = s;
                                                                                n = (umf.g() ? 1 : 0);
                                                                                break Label_0749;
                                                                            }
                                                                        }
                                                                        finally {
                                                                            s2 = s;
                                                                            break Label_0854;
                                                                        }
                                                                        s = (String)(p = s2);
                                                                        o5.getClass();
                                                                        p = s;
                                                                        if (!((b0j)o5).a()) {
                                                                            n = 1;
                                                                            n14 = n4;
                                                                        }
                                                                        else {
                                                                            n = 0;
                                                                            n14 = n4;
                                                                        }
                                                                    }
                                                                    p = s2;
                                                                    if (n != 0) {
                                                                        ((tmf)o4).l(n10);
                                                                    }
                                                                    n7 = 8;
                                                                    n4 = n14;
                                                                }
                                                                n4 >>= n7;
                                                                ++n9;
                                                                continue;
                                                            }
                                                            p = (s3 = s2);
                                                            if (n8 == n7) {
                                                                break Label_0809;
                                                            }
                                                            break Label_0834;
                                                        }
                                                        s4 = (String)p;
                                                        p = s2;
                                                    }
                                                    s3 = (String)p;
                                                    if (n3 != n2) {
                                                        ++n3;
                                                        s2 = (String)p;
                                                        p = s4;
                                                        continue;
                                                    }
                                                    break;
                                                }
                                                break Label_0834;
                                            }
                                            s3 = (String)p;
                                        }
                                        p = s3;
                                        this.l();
                                        p = s3;
                                        try {
                                            Trace.endSection();
                                            break Label_0869;
                                        }
                                        finally {
                                            break Label_0938;
                                        }
                                    }
                                    p = s2;
                                    Trace.endSection();
                                    p = s2;
                                    throw s4;
                                }
                                o = p;
                                try {
                                    if (g.f.i0() && this.L == null) {
                                        ((yb0)o).k();
                                    }
                                }
                                finally {
                                    break Label_0904;
                                }
                            }
                            ((yb0)o).j();
                            return;
                        }
                        ((yb0)o).j();
                    }
                    finally {
                        try {
                            ((y5m)o5).e(false);
                        }
                        finally {}
                    }
                }
                Trace.endSection();
                try {
                    if (g.f.i0() && this.L == null) {
                        ((yb0)p).k();
                    }
                }
                finally {
                    break Label_0975;
                }
            }
            ((yb0)p).j();
            throw;
        }
        ((yb0)p).j();
    }
    
    public final void j() {
        final Object y;
        monitorenter(y = this.y);
        EndFinally_3: {
            try {
                final Object o = this.G;
                ((fd3)o).getClass();
                if (!((fd3)o).f.i0()) {
                    this.i(this.G);
                }
                break EndFinally_3;
            }
            finally {
                Object o = null;
                xmf z = null;
                wl6 d = null;
                Label_0111: {
                    try {
                        if (!this.z.v.g()) {
                            o = this.P;
                            z = this.z;
                            d = this.Q.D();
                            final fd3 fd3 = (fd3)o;
                            final xmf xmf = z;
                            final wl6 wl6 = d;
                            ((yb0)fd3).s((Set)xmf, wl6);
                            final fd3 fd4 = (fd3)o;
                            ((yb0)fd4).k();
                        }
                        break Label_0111;
                    }
                    finally {
                        final fd3 fd5;
                        o = fd5;
                        try {
                            this.e();
                        }
                        finally {
                            monitorexit(y);
                        }
                        break EndFinally_3;
                    }
                }
                try {
                    final fd3 fd3 = (fd3)o;
                    final xmf xmf = z;
                    final wl6 wl6 = d;
                    ((yb0)fd3).s((Set)xmf, wl6);
                    final fd3 fd4 = (fd3)o;
                    ((yb0)fd4).k();
                }
                finally {}
                monitorexit(y);
            }
        }
    }
    
    public final void k() {
        final Object y;
        monitorenter(y = this.y);
        while (true) {
            yb0 yb0 = null;
            xmf z;
            wl6 d;
            try {
                this.Q.v = null;
                if (!this.z.v.g()) {
                    yb0 = this.P;
                    z = this.z;
                    d = this.Q.D();
                    final yb0 yb2 = yb0;
                    final xmf xmf = z;
                    final wl6 wl6 = d;
                    yb2.s((Set)xmf, wl6);
                    final yb0 yb3 = yb0;
                    yb3.k();
                }
                break EndFinally_3;
            }
            finally {
                xmf z2 = null;
                wl6 d2 = null;
                Label_0145: {
                    try {
                        if (!this.z.v.g()) {
                            yb0 = this.P;
                            z2 = this.z;
                            d2 = this.Q.D();
                            final yb0 yb4 = yb0;
                            final xmf xmf2 = z2;
                            final wl6 wl7 = d2;
                            yb4.s((Set)xmf2, wl7);
                            final yb0 yb5 = yb0;
                            yb5.k();
                        }
                        break Label_0145;
                    }
                    finally {
                        final yb0 yb6;
                        yb0 = yb6;
                        try {
                            this.e();
                        }
                        finally {
                            monitorexit(y);
                        }
                        break EndFinally_3;
                    }
                }
                try {
                    final yb0 yb4 = yb0;
                    final xmf xmf2 = z2;
                    final wl6 wl7 = d2;
                    yb4.s((Set)xmf2, wl7);
                    final yb0 yb5 = yb0;
                    yb5.k();
                }
                finally {}
                monitorexit(y);
                return;
            }
            try {
                final yb0 yb2 = yb0;
                final xmf xmf = z;
                final wl6 wl6 = d;
                yb2.s((Set)xmf, wl6);
                final yb0 yb3 = yb0;
                yb3.k();
                continue;
            }
            finally {}
            break;
        }
    }
    
    public final void l() {
        final tmf e = this.E;
        long[] a = e.a;
        int n = a.length - 2;
        final long n2 = 255L;
        int n3 = 7;
        final long n4 = -9187201950435737472L;
        int n21;
        long n22;
        long n23;
        if (n >= 0) {
            int n5 = 0;
            while (true) {
                int n6 = 8;
                long n7 = a[n5];
                if ((~n7 << n3 & n7 & n4) != n4) {
                    final int n8 = 8 - (~(n5 - n) >>> 31);
                    int i = 0;
                    final int n9 = n3;
                    int n10 = n;
                    while (i < n8) {
                        if ((n7 & n2) < 128L) {
                            final int n11 = (n5 << 3) + i;
                            final Object o = e.b[n11];
                            final Object o2 = e.c[n11];
                            final boolean b = o2 instanceof umf;
                            final tmf b2 = this.B;
                            int n19;
                            boolean g;
                            if (b) {
                                final umf umf = (umf)o2;
                                final Object[] b3 = umf.b;
                                final long[] a2 = umf.a;
                                final int n12 = a2.length - 2;
                                long[] array;
                                int n20;
                                if (n12 >= 0) {
                                    int n13 = 0;
                                    int n14 = n6;
                                    while (true) {
                                        long n15 = a2[n13];
                                        final int n16 = n10;
                                        if ((~n15 << n9 & n15 & n4) != n4) {
                                            final int n17 = 8 - (~(n13 - n12) >>> 31);
                                            for (int j = 0; j < n17; ++j) {
                                                if ((n15 & n2) < 128L) {
                                                    final int n18 = (n13 << 3) + j;
                                                    if (!b2.c((Object)b3[n18])) {
                                                        umf.m(n18);
                                                    }
                                                }
                                                n15 >>= n14;
                                            }
                                            array = a;
                                            n19 = n16;
                                            n20 = i;
                                            if (n17 != n14) {
                                                break;
                                            }
                                        }
                                        array = a;
                                        n19 = n16;
                                        n20 = i;
                                        if (n13 == n12) {
                                            break;
                                        }
                                        ++n13;
                                        n10 = n16;
                                        n14 = 8;
                                    }
                                }
                                else {
                                    n19 = n10;
                                    n20 = i;
                                    array = a;
                                }
                                g = umf.g();
                                a = array;
                                i = n20;
                            }
                            else {
                                o2.getClass();
                                if (!b2.c((Object)o2)) {
                                    g = true;
                                    n19 = n10;
                                }
                                else {
                                    g = false;
                                    n19 = n10;
                                }
                            }
                            if (g) {
                                e.l(n11);
                            }
                            n6 = 8;
                            n10 = n19;
                        }
                        n7 >>= n6;
                        ++i;
                    }
                    n21 = n9;
                    n22 = n2;
                    n23 = n4;
                    if (n8 != n6) {
                        break;
                    }
                    n = n10;
                    n3 = n9;
                }
                n21 = n3;
                n22 = n2;
                n23 = n4;
                if (n5 == n) {
                    break;
                }
                ++n5;
            }
        }
        else {
            n22 = 255L;
            n21 = 7;
            n23 = -9187201950435737472L;
        }
        final umf d = this.D;
        if (d.h()) {
            final Object[] b4 = d.b;
            final long[] a3 = d.a;
            final int n24 = a3.length - 2;
            if (n24 >= 0) {
                int n25 = 0;
                while (true) {
                    long n26 = a3[n25];
                    if ((~n26 << n21 & n26 & n23) != n23) {
                        final int n27 = 8 - (~(n25 - n24) >>> 31);
                        for (int k = 0; k < n27; ++k) {
                            if ((n26 & n22) < 128L) {
                                final int n28 = (n25 << 3) + k;
                                if (((b0j)b4[n28]).g == null) {
                                    d.m(n28);
                                }
                            }
                            n26 >>= 8;
                        }
                        if (n27 != 8) {
                            break;
                        }
                    }
                    if (n25 == n24) {
                        break;
                    }
                    ++n25;
                }
            }
        }
    }
    
    public final boolean m() {
        final Object y;
        monitorenter(y = this.y);
        Label_0049: {
            boolean b;
            try {
                final byte r = this.R;
                b = true;
                if (r != 1) {
                    b = false;
                }
                if (b) {
                    this.R = 0;
                }
            }
            finally {
                break Label_0049;
            }
            monitorexit(y);
            return b;
        }
        monitorexit(y);
    }
    
    public final void n(final zta p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        yl6.y:Ljava/lang/Object;
        //     4: astore_2       
        //     5: aload_2        
        //     6: dup            
        //     7: astore          6
        //     9: monitorenter   
        //    10: aload_0        
        //    11: invokevirtual   yl6.q:()V
        //    14: aload_0        
        //    15: getfield        yl6.I:Ltmf;
        //    18: astore_3       
        //    19: aload_0        
        //    20: invokestatic    rhc.k:()Ltmf;
        //    23: putfield        yl6.I:Ltmf;
        //    26: aload_0        
        //    27: getfield        yl6.Q:Lgva;
        //    30: astore          4
        //    32: aload_0        
        //    33: getfield        yl6.K:Lvwl;
        //    36: astore          5
        //    38: aload           4
        //    40: getfield        gva.e:Lfd3;
        //    43: getfield        fd3.f:Ljfg;
        //    46: invokevirtual   jfg.i0:()Z
        //    49: ifne            58
        //    52: ldc_w           "Expected applyChanges() to have been called"
        //    55: invokestatic    ti6.a:(Ljava/lang/String;)V
        //    58: aload           4
        //    60: aload           5
        //    62: putfield        gva.P:Lvwl;
        //    65: aload           4
        //    67: aload_3        
        //    68: aload_1        
        //    69: invokevirtual   gva.o:(Ltmf;Lzta;)V
        //    72: aload           4
        //    74: aconst_null    
        //    75: putfield        gva.P:Lvwl;
        //    78: aload           6
        //    80: monitorexit    
        //    81: return         
        //    82: astore_2       
        //    83: goto            109
        //    86: astore_1       
        //    87: aload           4
        //    89: aconst_null    
        //    90: putfield        gva.P:Lvwl;
        //    93: aload_1        
        //    94: athrow         
        //    95: astore_1       
        //    96: aload_0        
        //    97: aload_3        
        //    98: putfield        yl6.I:Ltmf;
        //   101: aload_1        
        //   102: athrow         
        //   103: astore_1       
        //   104: aload           6
        //   106: monitorexit    
        //   107: aload_1        
        //   108: athrow         
        //   109: aload_0        
        //   110: getfield        yl6.z:Lxmf;
        //   113: getfield        xmf.v:Lumf;
        //   116: invokevirtual   umf.g:()Z
        //   119: ifne            170
        //   122: aload_0        
        //   123: getfield        yl6.P:Lyb0;
        //   126: astore_1       
        //   127: aload_0        
        //   128: getfield        yl6.z:Lxmf;
        //   131: astore          4
        //   133: aload_0        
        //   134: getfield        yl6.Q:Lgva;
        //   137: invokevirtual   gva.D:()Lwl6;
        //   140: astore_3       
        //   141: aload_1        
        //   142: aload           4
        //   144: aload_3        
        //   145: invokevirtual   yb0.s:(Ljava/util/Set;Lwl6;)V
        //   148: aload_1        
        //   149: invokevirtual   yb0.k:()V
        //   152: aload_1        
        //   153: invokevirtual   yb0.j:()V
        //   156: goto            170
        //   159: astore_1       
        //   160: goto            172
        //   163: astore_2       
        //   164: aload_1        
        //   165: invokevirtual   yb0.j:()V
        //   168: aload_2        
        //   169: athrow         
        //   170: aload_2        
        //   171: athrow         
        //   172: aload_0        
        //   173: invokevirtual   yl6.e:()V
        //   176: aload_1        
        //   177: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      10     82     178    Any
        //  10     26     103    109    Any
        //  26     58     95     103    Any
        //  58     65     95     103    Any
        //  65     72     86     95     Any
        //  72     78     95     103    Any
        //  78     81     82     178    Any
        //  87     95     95     103    Any
        //  96     103    103    109    Any
        //  104    109    82     178    Any
        //  109    141    159    163    Any
        //  141    152    163    170    Any
        //  152    156    159    163    Any
        //  164    170    159    163    Any
        //  170    172    159    163    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
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
    
    public final iwg o(final boolean b, final zta zta) {
        if (this.L != null) {
            pih.b("A pausable composition is in progress");
        }
        return this.L = new iwg(this, this.v, this.Q, this.z, zta, b, this.w, this.y);
    }
    
    public final void p() {
        final Object y;
        monitorenter(y = this.y);
        Label_0303: {
            Label_0298: {
                Object z = null;
                Label_0203: {
                    boolean b;
                    try {
                        if (this.L != null) {
                            pih.b("Deactivate is not supported while pausable composition is in progress");
                        }
                        b = (this.A.w == 0);
                        if (b) {
                            if (this.z.v.g()) {
                                break Label_0203;
                            }
                        }
                    }
                    finally {
                        break Label_0303;
                    }
                    Trace.beginSection("Compose:deactivate");
                    try {
                        final yb0 p = this.P;
                        z = this.z;
                        final wl6 d = this.Q.D();
                        Label_0192: {
                            yb0 p2;
                            try {
                                p.s((Set)z, d);
                                if (!b) {
                                    final v5m a = this.A;
                                    p2 = this.P;
                                    final Object o;
                                    z = (o = a.o());
                                    final int n = ((y5m)o).t;
                                    final tz7 tz7 = new(tz7.class)();
                                    final tz7 tz9;
                                    final tz7 tz8 = tz9 = tz7;
                                    final yb0 yb0 = p2;
                                    final Set set = (Set)z;
                                    final byte b2 = 16;
                                    new tz7((Object)yb0, (Object)set, b2);
                                    final Set set2 = (Set)z;
                                    final int n2 = n;
                                    final tz7 tz10 = tz8;
                                    ((y5m)set2).m(n2, (zta)tz10);
                                    final Set set3 = (Set)z;
                                    final boolean b3 = true;
                                    ((y5m)set3).e(b3);
                                    final yl6 yl6 = this;
                                    final v v = yl6.w;
                                    ((it0)v).i();
                                    final yb0 yb2 = p;
                                    yb2.l();
                                }
                                break Label_0192;
                            }
                            finally {
                                final Set set4;
                                z = set4;
                                break Label_0203;
                            }
                            try {
                                final Object o = z;
                                final int n = ((y5m)o).t;
                                final tz7 tz7 = new(tz7.class)();
                                final tz7 tz9;
                                final tz7 tz8 = tz9 = tz7;
                                final yb0 yb0 = p2;
                                final Set set = (Set)z;
                                final byte b2 = 16;
                                new tz7((Object)yb0, (Object)set, b2);
                                final Set set2 = (Set)z;
                                final int n2 = n;
                                final tz7 tz10 = tz8;
                                ((y5m)set2).m(n2, (zta)tz10);
                                final Set set3 = (Set)z;
                                final boolean b3 = true;
                                ((y5m)set3).e(b3);
                                final yl6 yl6 = this;
                                final v v = yl6.w;
                                ((it0)v).i();
                                final yb0 yb2 = p;
                                yb2.l();
                            }
                            finally {
                                ((y5m)z).e(false);
                            }
                        }
                        p.k();
                        p.j();
                        Trace.endSection();
                        this.B.a();
                        this.E.a();
                        this.I.a();
                        this.F.f.g0();
                        this.G.f.g0();
                        final gva q = this.Q;
                        q.E.clear();
                        q.s.clear();
                        q.e.f.g0();
                        q.v = null;
                        this.R = 1;
                        monitorexit(y);
                        return;
                    }
                    finally {
                        break Label_0298;
                    }
                }
                final yb0 yb3;
                yb3.j();
                throw z;
            }
            Trace.endSection();
        }
        monitorexit(y);
    }
    
    public final void q() {
        final Object b = ncq.b;
        final AtomicReference x = this.x;
        final Object andSet = x.getAndSet(b);
        if (andSet != null) {
            if (!andSet.equals(b)) {
                if (andSet instanceof Set) {
                    this.g((Set)andSet, true);
                    return;
                }
                if (!(andSet instanceof Object[])) {
                    final StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
                    sb.append((Object)x);
                    ti6.b(sb.toString());
                    ebq.a();
                    return;
                }
                final Set[] array = (Set[])andSet;
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.g(array[i], true);
                }
            }
            else {
                ti6.b("pending composition has not been applied");
                ebq.a();
            }
        }
    }
    
    public final void r() {
        final AtomicReference x = this.x;
        final Object andSet = x.getAndSet((Object)null);
        if (!mlc.q(andSet, ncq.b)) {
            if (andSet instanceof Set) {
                this.g((Set)andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                final Set[] array = (Set[])andSet;
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.g(array[i], false);
                }
            }
            else if (andSet == null) {
                if (this.L == null) {
                    ti6.a("calling recordModificationsOf and applyChanges concurrently is not supported");
                }
            }
            else {
                final StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
                sb.append((Object)x);
                ti6.b(sb.toString());
                ebq.a();
            }
        }
    }
    
    public final void s() {
        final z89 v = z89.v;
        final AtomicReference x = this.x;
        final Object andSet = x.getAndSet((Object)v);
        if (!mlc.q(andSet, ncq.b)) {
            if (andSet != null) {
                if (andSet instanceof Set) {
                    this.g((Set)andSet, false);
                    return;
                }
                if (andSet instanceof Object[]) {
                    final Set[] array = (Set[])andSet;
                    for (int length = array.length, i = 0; i < length; ++i) {
                        this.g(array[i], false);
                    }
                }
                else {
                    final StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
                    sb.append((Object)x);
                    ti6.b(sb.toString());
                    ebq.a();
                }
            }
        }
    }
    
    public final void t() {
        final byte r = this.R;
        if (r != 0) {
            String s;
            if (r != 1) {
                if (r != 2) {
                    if (r != 3) {
                        s = "";
                    }
                    else {
                        s = "The composition is disposed";
                    }
                }
                else {
                    s = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            }
            else {
                s = "The composition should be activated before setting content.";
            }
            pih.b(s);
        }
        if (this.L == null) {
            return;
        }
        pih.b("A pausable composition is in progress");
    }
    
    public final void u(ArrayList p) {
        final xmf z = this.z;
        final gva q = this.Q;
        for (int size = ((Collection)p).size(), i = 0; i < size; ++i) {
            if (!((iif)((yog)((List)p).get(i)).v).b().equals(this)) {
                ti6.a("Check failed");
                break;
            }
        }
        try {
            q.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                q.G(p);
                try {
                    q.i();
                    Trace.endSection();
                    return;
                }
                finally {}
            }
            finally {
                q.a();
            }
            Trace.endSection();
        }
        finally {
            Label_0171: {
                wl6 d;
                try {
                    if (!z.v.g()) {
                        p = (ArrayList)this.P;
                        d = q.D();
                        final ArrayList list = p;
                        final Object o = z;
                        final wl6 wl6 = d;
                        ((yb0)list).s((Set)o, wl6);
                        final ArrayList list2 = p;
                        ((yb0)list2).k();
                        throw p;
                    }
                    throw p;
                }
                finally {
                    final ArrayList list3;
                    p = list3;
                    break Label_0171;
                }
                try {
                    final ArrayList list = p;
                    final Object o = z;
                    final wl6 wl6 = d;
                    ((yb0)list).s((Set)o, wl6);
                    final ArrayList list2 = p;
                    ((yb0)list2).k();
                }
                finally {
                    ((yb0)p).j();
                }
                throw p;
            }
            this.e();
            throw p;
        }
    }
    
    public final int v(final b0j b0j, final bva bva, final Object o) {
        final Object y;
        monitorenter(y = this.y);
        Label_0567: {
            int n;
            Object f;
            try {
                final yl6 m = this.M;
                n = 3;
                f = null;
                if (m != null) {
                    final v5m a = this.A;
                    final int n2 = this.N;
                    if (a.B) {
                        ti6.a("Writer is active");
                    }
                    if (n2 < 0 || n2 >= a.w) {
                        ti6.a("Invalid group index");
                    }
                    f = r6k.f(bva);
                    Label_0143: {
                        if (a.r((bva)f)) {
                            final int n3 = a.v[n2 * 5 + 3];
                            final int a2 = ((bva)f).a;
                            if (n2 <= a2 && a2 < n3 + n2) {
                                f = m;
                                break Label_0143;
                            }
                        }
                        f = null;
                    }
                }
            }
            finally {
                break Label_0567;
            }
            final int n4 = 2;
            final b0j b0j2;
            int n10 = 0;
            int n12 = 0;
            Label_0526: {
                if (f == null) {
                    final gva q = this.Q;
                    if (q.F && q.m0(b0j2, o)) {
                        monitorexit(y);
                        return 4;
                    }
                    if (o == null) {
                        this.I.m((Object)b0j2, (Object)vzq.C);
                    }
                    else {
                        final boolean b = o instanceof sd8;
                        final tmf i = this.I;
                        if (b) {
                            final Object g = i.g((Object)b0j2);
                            Label_0517: {
                                if (g != null) {
                                    if (g instanceof umf) {
                                        final umf umf = (umf)g;
                                        final Object[] b2 = umf.b;
                                        final long[] a3 = umf.a;
                                        final int n5 = a3.length - 2;
                                        if (n5 >= 0) {
                                            int n6 = 0;
                                            int n7 = n;
                                            while (true) {
                                                long n8 = a3[n6];
                                                int n13;
                                                if ((~n8 << 7 & n8 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                    final int n9 = 8 - (~(n6 - n5) >>> 31);
                                                    n10 = n4;
                                                    for (int j = 0; j < n9; ++j) {
                                                        if ((n8 & 0xFFL) < 128L) {
                                                            final int n11 = n7;
                                                            if (b2[(n6 << 3) + j] == vzq.C) {
                                                                n12 = n11;
                                                                break Label_0526;
                                                            }
                                                        }
                                                        n8 >>= 8;
                                                    }
                                                    n13 = (n12 = n7);
                                                    if (n9 != 8) {
                                                        break Label_0517;
                                                    }
                                                }
                                                else {
                                                    n13 = n7;
                                                }
                                                n10 = n4;
                                                n12 = n13;
                                                if (n6 == n5) {
                                                    break Label_0517;
                                                }
                                                ++n6;
                                                n7 = n13;
                                            }
                                        }
                                    }
                                    else {
                                        final int n14 = 2;
                                        final int n15 = 3;
                                        n10 = n14;
                                        n12 = n15;
                                        if (g == vzq.C) {
                                            n10 = n14;
                                            n12 = n15;
                                            break Label_0526;
                                        }
                                        break Label_0517;
                                    }
                                }
                                n10 = 2;
                                n12 = 3;
                            }
                            rhc.d(this.I, (Object)b0j2, o);
                            break Label_0526;
                        }
                        i.m((Object)b0j2, (Object)vzq.C);
                    }
                }
                n10 = 2;
                n12 = 3;
            }
            monitorexit(y);
            if (f != null) {
                return ((yl6)f).v(b0j2, bva, o);
            }
            this.v.n(this);
            if (this.Q.F) {
                return n12;
            }
            return n10;
        }
        monitorexit(y);
    }
    
    public final void w(final Object o) {
        final Object g = this.B.g(o);
        if (g != null) {
            final boolean b = g instanceof umf;
            final tmf h = this.H;
            if (b) {
                final umf umf = (umf)g;
                final Object[] b2 = umf.b;
                final long[] a = umf.a;
                final int n = a.length - 2;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        long n3 = a[n2];
                        if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n4 = 8 - (~(n2 - n) >>> 31);
                            for (int i = 0; i < n4; ++i) {
                                if ((0xFFL & n3) < 128L) {
                                    final b0j b0j = (b0j)b2[(n2 << 3) + i];
                                    if (b0j.b(o) == 4 && !(o instanceof sd8)) {
                                        rhc.d(h, o, (Object)b0j);
                                    }
                                }
                                n3 >>= 8;
                            }
                            if (n4 != 8) {
                                break;
                            }
                        }
                        if (n2 == n) {
                            break;
                        }
                        ++n2;
                    }
                }
            }
            else {
                final b0j b0j2 = (b0j)g;
                if (b0j2.b(o) == 4 && !(o instanceof sd8)) {
                    rhc.d(h, o, (Object)b0j2);
                }
            }
        }
    }
    
    public final boolean x(final Set set) {
        final boolean b = set instanceof lak;
        final tmf e = this.E;
        final tmf b2 = this.B;
        if (b) {
            final umf v = ((lak)set).v;
            final Object[] b3 = v.b;
            final long[] a = v.a;
            final int n = a.length - 2;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    long n3 = a[n2];
                    if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n4 = 8 - (~(n2 - n) >>> 31);
                        for (int i = 0; i < n4; ++i) {
                            if ((0xFFL & n3) < 128L) {
                                final Object o = b3[(n2 << 3) + i];
                                if (b2.c(o) || e.c(o)) {
                                    return true;
                                }
                            }
                            n3 >>= 8;
                        }
                        if (n4 != 8) {
                            break;
                        }
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
        }
        else {
            for (final Object next : (Iterable)set) {
                if (b2.c(next) || e.c(next)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean y() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        yl6.y:Ljava/lang/Object;
        //     4: astore_2       
        //     5: aload_2        
        //     6: dup            
        //     7: astore          7
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        yl6.L:Liwg;
        //    14: astore_3       
        //    15: iconst_0       
        //    16: istore_1       
        //    17: aload_3        
        //    18: ifnull          48
        //    21: aload_3        
        //    22: invokevirtual   iwg.g:()Z
        //    25: ifne            48
        //    28: aload_3        
        //    29: invokevirtual   iwg.i:()V
        //    32: aload_3        
        //    33: invokevirtual   iwg.d:()Landroidx/compose/runtime/d;
        //    36: invokevirtual   androidx/compose/runtime/d.f:()V
        //    39: aload           7
        //    41: monitorexit    
        //    42: iconst_0       
        //    43: ireturn        
        //    44: astore_3       
        //    45: goto            265
        //    48: aload_0        
        //    49: invokevirtual   yl6.q:()V
        //    52: aload_0        
        //    53: getfield        yl6.I:Ltmf;
        //    56: astore_3       
        //    57: aload_0        
        //    58: invokestatic    rhc.k:()Ltmf;
        //    61: putfield        yl6.I:Ltmf;
        //    64: aload_0        
        //    65: getfield        yl6.Q:Lgva;
        //    68: astore          4
        //    70: aload_0        
        //    71: getfield        yl6.K:Lvwl;
        //    74: astore          5
        //    76: aload           4
        //    78: getfield        gva.e:Lfd3;
        //    81: getfield        fd3.f:Ljfg;
        //    84: astore          6
        //    86: aload           6
        //    88: invokevirtual   jfg.i0:()Z
        //    91: ifne            100
        //    94: ldc_w           "Expected applyChanges() to have been called"
        //    97: invokestatic    ti6.a:(Ljava/lang/String;)V
        //   100: aload_3        
        //   101: getfield        tmf.e:I
        //   104: ifgt            121
        //   107: aload           4
        //   109: getfield        gva.s:Ljava/util/ArrayList;
        //   112: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   115: ifeq            121
        //   118: goto            149
        //   121: aload           4
        //   123: aload           5
        //   125: putfield        gva.P:Lvwl;
        //   128: aload           4
        //   130: aload_3        
        //   131: aconst_null    
        //   132: invokevirtual   gva.o:(Ltmf;Lzta;)V
        //   135: aload           4
        //   137: aconst_null    
        //   138: putfield        gva.P:Lvwl;
        //   141: aload           6
        //   143: invokevirtual   jfg.i0:()Z
        //   146: iconst_1       
        //   147: ixor           
        //   148: istore_1       
        //   149: iload_1        
        //   150: ifne            165
        //   153: aload_0        
        //   154: invokevirtual   yl6.r:()V
        //   157: goto            165
        //   160: astore          4
        //   162: goto            181
        //   165: aload           7
        //   167: monitorexit    
        //   168: iload_1        
        //   169: ireturn        
        //   170: astore          5
        //   172: aload           4
        //   174: aconst_null    
        //   175: putfield        gva.P:Lvwl;
        //   178: aload           5
        //   180: athrow         
        //   181: aload_0        
        //   182: aload_3        
        //   183: putfield        yl6.I:Ltmf;
        //   186: aload           4
        //   188: athrow         
        //   189: astore          4
        //   191: aload_0        
        //   192: getfield        yl6.z:Lxmf;
        //   195: getfield        xmf.v:Lumf;
        //   198: invokevirtual   umf.g:()Z
        //   201: ifne            256
        //   204: aload_0        
        //   205: getfield        yl6.P:Lyb0;
        //   208: astore_3       
        //   209: aload_0        
        //   210: getfield        yl6.z:Lxmf;
        //   213: astore          5
        //   215: aload_0        
        //   216: getfield        yl6.Q:Lgva;
        //   219: invokevirtual   gva.D:()Lwl6;
        //   222: astore          6
        //   224: aload_3        
        //   225: aload           5
        //   227: aload           6
        //   229: invokevirtual   yb0.s:(Ljava/util/Set;Lwl6;)V
        //   232: aload_3        
        //   233: invokevirtual   yb0.k:()V
        //   236: aload_3        
        //   237: invokevirtual   yb0.j:()V
        //   240: goto            256
        //   243: astore_3       
        //   244: goto            259
        //   247: astore          4
        //   249: aload_3        
        //   250: invokevirtual   yb0.j:()V
        //   253: aload           4
        //   255: athrow         
        //   256: aload           4
        //   258: athrow         
        //   259: aload_0        
        //   260: invokevirtual   yl6.e:()V
        //   263: aload_3        
        //   264: athrow         
        //   265: aload           7
        //   267: monitorexit    
        //   268: aload_3        
        //   269: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     15     44     48     Any
        //  21     39     44     48     Any
        //  48     52     44     48     Any
        //  52     64     189    265    Any
        //  64     100    160    165    Any
        //  100    118    160    165    Any
        //  121    128    160    165    Any
        //  128    135    170    181    Any
        //  135    149    160    165    Any
        //  153    157    160    165    Any
        //  172    181    160    165    Any
        //  181    189    189    265    Any
        //  191    224    243    247    Any
        //  224    236    247    256    Any
        //  236    240    243    247    Any
        //  249    256    243    247    Any
        //  256    259    243    247    Any
        //  259    265    44     48     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0149:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
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
    
    public final void z(final lak lak) {
    Label_0000:
        while (true) {
            final Object value = this.x.get();
            Object copy;
            if (value != null && !value.equals(ncq.b)) {
                if (value instanceof Set) {
                    copy = new Set[] { (Set)value, (Set)lak };
                }
                else {
                    if (!(value instanceof Object[])) {
                        fvd.y((Object)this.x, "corrupt pendingModifications: ");
                        return;
                    }
                    final Set[] array = (Set[])value;
                    final int length = array.length;
                    copy = Arrays.copyOf((Object[])array, length + 1);
                    copy[length] = lak;
                }
            }
            else {
                copy = lak;
            }
            final AtomicReference x = this.x;
            while (!x.compareAndSet(value, copy)) {
                if (x.get() != value) {
                    continue Label_0000;
                }
            }
            if (value == null) {
                final Object y = this.y;
                synchronized (y) {
                    this.r();
                }
            }
        }
    }
}
