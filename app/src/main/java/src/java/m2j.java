import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

public final class m2j
{
    public final sgc a;
    public final AndroidComposeView b;
    public final mlf c;
    public final vun d;
    public final emf e;
    public boolean f;
    public boolean g;
    public boolean h;
    public o40 i;
    public long j;
    public final lce k;
    public final smf l;
    
    public m2j(final jlf a, final AndroidComposeView b) {
        this.a = (sgc)a;
        this.b = b;
        final mlf c = new mlf((byte)2);
        c.c = new long[192];
        c.d = new long[192];
        this.c = c;
        this.d = new vun();
        this.e = new emf();
        this.j = -1L;
        this.k = new lce((Object)this, (byte)16);
        this.l = new smf(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public static boolean c(final yxf yxf) {
        final gmg q0 = yxf.q0;
        return q0 != null && !lq6.U(((j6b)q0).b());
    }
    
    public static long f(final LayoutNode layoutNode) {
        final yxf outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        Object t = layoutNode.Z.y;
        long d = 0L;
        while (t != null && t != outerCoordinator$ui) {
            if (c((yxf)t)) {
                return 9223372034707292159L;
            }
            d = ugc.d(d, ((yxf)t).c0);
            t = ((yxf)t).T;
        }
        return d;
    }
    
    public static void i(final LayoutNode layoutNode) {
        if (layoutNode.x && !c(layoutNode.getOuterCoordinator$ui())) {
            int i = 0;
            layoutNode.x = false;
            if (layoutNode.z) {
                layoutNode.y = f(layoutNode);
                layoutNode.z = false;
            }
            if (!ugc.b(layoutNode.y, 9223372034707292159L)) {
                final inf m = layoutNode.M();
                final Object[] v = m.v;
                while (i < m.x) {
                    i((LayoutNode)v[i]);
                    ++i;
                }
            }
        }
    }
    
    public final void a() {
        final o40 i = this.i;
        if (i != null) {
            ((View)this.b).removeCallbacks((Runnable)i);
            this.i = null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final boolean f = this.f;
        int n;
        if (!f && !this.g) {
            n = 0;
        }
        else {
            n = 1;
        }
        mlf c = this.c;
        final int n2 = 1;
        final vun d = this.d;
        if (f) {
            this.f = false;
            final emf e = this.e;
            final Object[] a = e.a;
            for (int b = e.b, j = 0; j < b; ++j) {
                ((jta)a[j]).a();
            }
            final long[] array = (long[])c.c;
            final int b2 = c.b;
            int n3 = 0;
            final int n4 = n;
            final int n5 = n2;
            while (n3 < array.length - 2 && n3 < b2) {
                final long n6 = array[n3 + 2];
                int n7 = n3;
                if (((int)(n6 >> 60) & 0x1) != 0x0) {
                    final long f2 = array[n3];
                    final long g = array[n3 + 1];
                    uun uun = (uun)((sgc)d.a).b((int)n6 & 0x1FFFFFF);
                    while (true) {
                        n7 = n3;
                        if (uun == null) {
                            break;
                        }
                        final uun e2 = uun.e;
                        final long h = uun.h;
                        final long n8 = uun.b;
                        int n9;
                        if (currentTimeMillis - h < 0L && h != Long.MIN_VALUE) {
                            n9 = 0;
                        }
                        else {
                            n9 = n5;
                        }
                        int n10;
                        if (n8 == 0L) {
                            n10 = n5;
                        }
                        else {
                            n10 = 0;
                        }
                        uun.f = f2;
                        uun.g = g;
                        if (n9 != 0 && n10 != 0) {
                            uun.i = -1L;
                            uun.h = currentTimeMillis;
                            uun.a(f2, g, d.d, d.e, d.g);
                        }
                        else if (n10 == 0) {
                            uun.i = currentTimeMillis;
                            final long c2 = d.c;
                            if (c2 > 0L && n8 + currentTimeMillis < c2) {
                                d.c = c2;
                            }
                        }
                        uun = e2;
                    }
                }
                n3 = n7 + 3;
            }
            final long[] array2 = (long[])c.c;
            final int b3 = c.b;
            int n11 = 0;
            while (true) {
                n = n4;
                if (n11 >= array2.length - 2) {
                    break;
                }
                n = n4;
                if (n11 >= b3) {
                    break;
                }
                final int n12 = n11 + 2;
                array2[n12] &= 0xEFFFFFFFFFFFFFFFL;
                n11 += 3;
            }
        }
        vun vun = null;
        Label_0746: {
            if (this.g) {
                this.g = false;
                final long d2 = d.d;
                final long e3 = d.e;
                final float[] g2 = d.g;
                final jlf a2 = d.a;
                final Object[] c3 = ((sgc)a2).c;
                final long[] a3 = ((sgc)a2).a;
                final int n13 = a3.length - 2;
                if (n13 >= 0) {
                    int n14 = 0;
                    while (true) {
                        long n15 = a3[n14];
                        mlf mlf2;
                        if ((~n15 << 7 & n15 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n16 = 8 - (~(n14 - n13) >>> 31);
                            mlf mlf;
                            for (int k = 0; k < n16; ++k, c = mlf) {
                                mlf = c;
                                if ((n15 & 0xFFL) < 128L) {
                                    uun e4 = (uun)c3[(n14 << 3) + k];
                                    while (true) {
                                        mlf = c;
                                        if (e4 == null) {
                                            break;
                                        }
                                        d.b(e4, d2, e3, g2, currentTimeMillis);
                                        e4 = e4.e;
                                    }
                                }
                                n15 >>= 8;
                            }
                            mlf2 = c;
                            vun = d;
                            c = mlf2;
                            if (n16 != 8) {
                                break Label_0746;
                            }
                        }
                        else {
                            mlf2 = c;
                        }
                        vun = d;
                        c = mlf2;
                        if (n14 == n13) {
                            break Label_0746;
                        }
                        ++n14;
                        c = mlf2;
                    }
                }
            }
            vun = d;
        }
        long n17 = currentTimeMillis;
        mlf mlf3 = c;
        if (n != 0) {
            final long d3 = vun.d;
            final long e5 = vun.e;
            final float[] g3 = vun.g;
            uun uun2 = vun.b;
            mlf3 = c;
            if (uun2 != null) {
                while (true) {
                    mlf3 = c;
                    if (uun2 == null) {
                        break;
                    }
                    final LayoutNode l = soh.L((t98)uun2.c);
                    final long b4 = l0d.a(l).getRectManager().b(l);
                    uun2.f = b4;
                    uun2.g = ((long)(l.J() + (int)(b4 >> 32)) << 32 | ((long)(l.s() + (int)(b4 & 0xFFFFFFFFL)) & 0xFFFFFFFFL));
                    vun.b(uun2, d3, e5, g3, n17);
                    uun2 = uun2.e;
                }
            }
        }
        if (this.h) {
            this.h = false;
            long[] d4;
            int b5;
            long[] c4;
            int n18;
            int b6;
            int n19;
            int n20;
            for (d4 = (long[])mlf3.c, b5 = mlf3.b, c4 = (long[])mlf3.d, n18 = 0, b6 = 0; n18 < d4.length - 2 && b6 < c4.length - 2 && n18 < b5; n18 += 3, b6 = n20) {
                n19 = n18 + 2;
                n20 = b6;
                if (d4[n19] != l2j.a) {
                    c4[b6] = d4[n18];
                    c4[b6 + 1] = d4[n18 + 1];
                    c4[b6 + 2] = d4[n19];
                    n20 = b6 + 3;
                }
            }
            mlf3.b = b6;
            mlf3.c = c4;
            mlf3.d = d4;
        }
        final long c5 = vun.c;
        long c6;
        if (c5 > n17) {
            c6 = c5;
        }
        else {
            long d5 = vun.d;
            final long e6 = vun.e;
            final float[] g4 = vun.g;
            final jlf a4 = vun.a;
            final Object[] c7 = ((sgc)a4).c;
            final long[] a5 = ((sgc)a4).a;
            int n21 = a5.length - 2;
            long n39;
            long a7;
            if (n21 >= 0) {
                int n22 = 0;
                long a6 = Long.MAX_VALUE;
                long n23 = d5;
                while (true) {
                    long n24 = a5[n22];
                    long n25 = n23;
                    int n38;
                    long n40;
                    int n41;
                    if ((~n24 << 7 & n24 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int n26 = 8;
                        int n27 = 8 - (~(n22 - n21) >>> 31);
                        int n29;
                        long n32;
                        int n33;
                        long n36;
                        for (int n28 = 0; n28 < n27; n28 = n33 + 1, n27 = n29, n17 = n32, a6 = n36) {
                            n29 = n27;
                            int n30 = n21;
                            int n31 = n22;
                            n32 = n17;
                            n33 = n28;
                            int n34 = n26;
                            long n35 = n25;
                            n36 = a6;
                            if ((n24 & 0xFFL) < 128L) {
                                uun e7 = (uun)c7[(n22 << 3) + n28];
                                while (true) {
                                    n29 = n27;
                                    n30 = n21;
                                    n31 = n22;
                                    n32 = n17;
                                    n33 = n28;
                                    n34 = n26;
                                    n35 = n25;
                                    n36 = a6;
                                    if (e7 == null) {
                                        break;
                                    }
                                    a6 = vun.a(e7, n25, e6, g4, n17, a6);
                                    e7 = e7.e;
                                }
                            }
                            n24 >>= n34;
                            n25 = n35;
                            n21 = n30;
                            n22 = n31;
                            n26 = n34;
                        }
                        final long n37 = n25;
                        n38 = n22;
                        d5 = n37;
                        n39 = n17;
                        a7 = a6;
                        if (n27 != n26) {
                            break;
                        }
                        a7 = a6;
                        n40 = n37;
                        n41 = n21;
                    }
                    else {
                        final long n42 = n25;
                        a7 = a6;
                        n38 = n22;
                        n41 = n21;
                        n40 = n42;
                    }
                    if (n38 == n41) {
                        d5 = n40;
                        n39 = n17;
                        break;
                    }
                    final int n43 = n38 + 1;
                    n21 = n41;
                    n23 = n40;
                    n22 = n43;
                    a6 = a7;
                }
            }
            else {
                a7 = Long.MAX_VALUE;
                n39 = n17;
            }
            uun uun3 = vun.b;
            c6 = a7;
            if (uun3 != null) {
                while (true) {
                    c6 = a7;
                    if (uun3 == null) {
                        break;
                    }
                    a7 = vun.a(uun3, d5, e6, g4, n39, a7);
                    uun3 = uun3.e;
                }
            }
            if (c6 == Long.MAX_VALUE) {
                c6 = -1L;
            }
            vun.c = c6;
        }
        if (c6 > 0L) {
            this.j();
        }
    }
    
    public final long b(final LayoutNode layoutNode) {
        if (layoutNode.B != -4) {
            final long n = ((long[])this.c.c)[this.d(layoutNode)];
            return (long)(int)(n >> 32) << 32 | ((long)(int)n & 0xFFFFFFFFL);
        }
        return 9223372034707292159L;
    }
    
    public final int d(final LayoutNode layoutNode) {
        int i = layoutNode.B;
        Label_0116: {
            if (i != -4) {
                final int w = layoutNode.w;
                final mlf c = this.c;
                final long[] array = (long[])c.c;
                if (i >= 0 && i < c.b - 2 && ((int)array[i + 2] & 0x1FFFFFF) == (w & 0x1FFFFFF)) {
                    break Label_0116;
                }
                int b;
                for (b = c.b, i = 0; i < b - 2; i += 3) {
                    if (((int)array[i + 2] & 0x1FFFFFF) == (w & 0x1FFFFFF)) {
                        break Label_0116;
                    }
                }
            }
            i = -4;
        }
        if (i == -4) {
            final int w2 = layoutNode.w;
            final StringBuilder sb = new StringBuilder("LayoutNode ");
            sb.append(w2);
            sb.append(" not found in RectList");
            gac.a(sb.toString());
        }
        return layoutNode.B = i;
    }
    
    public final void e(final LayoutNode layoutNode) {
        layoutNode.x = true;
        final rxf z = layoutNode.Z;
        yxf yxf = layoutNode.getOuterCoordinator$ui();
        final loe z2 = layoutNode.z();
        final int v = z2.V();
        final int t = z2.T();
        final float c = (float)v;
        final float d = (float)t;
        final smf l = this.l;
        l.a = 0.0f;
        l.b = 0.0f;
        l.c = c;
        l.d = d;
        while (yxf != null) {
            final LayoutNode p = yxf.P;
            if (yxf == p.getOuterCoordinator$ui() && !p.x) {
                final long b = this.b(p);
                if (!ugc.b(b, 9223372034707292159L)) {
                    l.c((long)Float.floatToRawIntBits((float)(int)(b >> 32)) << 32 | ((long)Float.floatToRawIntBits((float)(int)(b & 0xFFFFFFFFL)) & 0xFFFFFFFFL));
                    break;
                }
            }
            final gmg q0 = yxf.q0;
            if (q0 != null) {
                final float[] b2 = ((j6b)q0).b();
                if (!lq6.U(b2)) {
                    l8e.c(b2, l);
                }
            }
            final long c2 = yxf.c0;
            l.c((0xFFFFFFFFL & (long)Float.floatToRawIntBits((float)(int)(c2 & 0xFFFFFFFFL))) | (long)Float.floatToRawIntBits((float)(int)(c2 >> 32)) << 32);
            yxf = yxf.T;
        }
        final int n = (int)l.a;
        final int n2 = (int)l.b;
        final int n3 = (int)l.c;
        final int n4 = (int)l.d;
        final int w = layoutNode.w;
        final int b3 = layoutNode.B;
        final mlf c3 = this.c;
        int d2 = -4;
        if (b3 != -4) {
            int d3 = this.d(layoutNode);
            final long[] array = (long[])c3.c;
            array[d3] = ((long)n << 32 | ((long)n2 & 0xFFFFFFFFL));
            array[d3 + 1] = ((0xFFFFFFFFL & (long)n4) | (long)n3 << 32);
            d3 += 2;
            final long n5 = array[d3];
            array[d3] = (n5 | (n5 >> 63 & 0x1L) << 60);
        }
        else {
            final LayoutNode g = layoutNode.G();
            int w2;
            if (g != null) {
                w2 = g.w;
            }
            else {
                w2 = -1;
            }
            if (g != null) {
                d2 = this.d(g);
            }
            layoutNode.B = c3.e(w, n, n2, n3, n4, w2, d2, z.l(1024), z.l(16), ((sgc)this.d.a).a(w));
        }
        int i = 0;
        layoutNode.A = false;
        this.f = true;
        final inf m = layoutNode.M();
        final Object[] v2 = m.v;
        while (i < m.x) {
            final LayoutNode layoutNode2 = (LayoutNode)v2[i];
            if (layoutNode2.W()) {
                this.e(layoutNode2);
            }
            ++i;
        }
    }
    
    public final void g(final LayoutNode layoutNode) {
        final boolean w = layoutNode.W();
        final rxf z = layoutNode.Z;
        if (w) {
            if (layoutNode.A) {
                final LayoutNode g = layoutNode.G();
                long y;
                if (g != null && !g.x) {
                    if (g.z) {
                        g.z = false;
                        g.y = f(g);
                    }
                    y = g.y;
                }
                else if (g == null) {
                    y = 0L;
                }
                else {
                    y = 9223372034707292159L;
                }
                final yxf outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
                if (!ugc.b(y, 9223372034707292159L) && !c(outerCoordinator$ui)) {
                    if (!layoutNode.x) {
                        final long d = ugc.d(y, outerCoordinator$ui.c0);
                        final loe z2 = layoutNode.z();
                        final int v = z2.V();
                        final int t = z2.T();
                        final int b = layoutNode.B;
                        final mlf c = this.c;
                        if (b != -4) {
                            final int d2 = this.d(layoutNode);
                            if (g != null) {
                                final int d3 = this.d(g);
                                final int n = (int)(d >> 32);
                                final int n2 = (int)(d & 0xFFFFFFFFL);
                                final long[] array = (long[])c.c;
                                final long n3 = array[d3];
                                final int n4 = (int)(n3 >> 32);
                                final int n5 = (int)n3;
                                final int n6 = n4 + n;
                                final int n7 = n5 + n2;
                                final long n8 = array[d2];
                                final int n9 = (int)(n8 >> 32);
                                final int n10 = (int)n8;
                                final int n11 = n6 - n9;
                                final int n12 = n7 - n10;
                                final int n13 = d2 + 2;
                                final long n14 = array[n13];
                                array[d2] = ((long)n6 << 32 | ((long)n7 & 0xFFFFFFFFL));
                                array[d2 + 1] = ((long)(v + n6) << 32 | ((long)(t + n7) & 0xFFFFFFFFL));
                                array[n13] = (n14 | (n14 >> 63 & 0x1L) << 60);
                                if (n11 != 0 || n12 != 0) {
                                    c.f(d2, n11, n12, n14);
                                }
                            }
                            else {
                                final int d4 = this.d(layoutNode);
                                final int n15 = (int)(d >> 32);
                                final int n16 = (int)(d & 0xFFFFFFFFL);
                                final long[] array2 = (long[])c.c;
                                final long n17 = array2[d4];
                                array2[d4] = (((long)n16 & 0xFFFFFFFFL) | (long)n15 << 32);
                                array2[d4 + 1] = (((long)(t + n16) & 0xFFFFFFFFL) | (long)(v + n15) << 32);
                                final int n18 = d4 + 2;
                                final long n19 = array2[n18];
                                array2[n18] = ((n19 >> 63 & 0x1L) << 60 | n19);
                                final int n20 = n15 - (int)(n17 >> 32);
                                final int n21 = n16 - (int)n17;
                                if (n20 != 0 || n21 != 0) {
                                    c.f(d4, n20, n21, n19);
                                }
                            }
                        }
                        else {
                            final int w2 = layoutNode.w;
                            final boolean l = z.l(1024);
                            final boolean i = z.l(16);
                            final boolean a = ((sgc)this.d.a).a(w2);
                            if (g != null) {
                                final int w3 = g.w;
                                final int d5 = this.d(g);
                                final int n22 = (int)(d >> 32);
                                final int n23 = (int)(d & 0xFFFFFFFFL);
                                final int n24 = w2 & 0x1FFFFFF;
                                final long[] array3 = (long[])c.c;
                                if (((int)array3[d5 + 2] & 0x1FFFFFF) != (0x1FFFFFF & w3)) {
                                    final StringBuilder sb = new StringBuilder("Inserted child ");
                                    sb.append(n24);
                                    sb.append(" without valid parent index or parent ");
                                    sb.append(w3);
                                    sb.append(" not found");
                                    gac.a(sb.toString());
                                }
                                final long n25 = array3[d5];
                                final int n26 = (int)(n25 >> 32);
                                final int n27 = (int)n25;
                                final int n28 = n26 + n22;
                                final int n29 = n27 + n23;
                                layoutNode.B = c.e(n24, n28, n29, n28 + v, n29 + t, w3, d5, l, i, a);
                            }
                            else {
                                final int n30 = (int)(d >> 32);
                                final int n31 = (int)(d & 0xFFFFFFFFL);
                                layoutNode.B = c.e(w2, n30, n31, n30 + v, n31 + t, -1, -4, l, i, a);
                            }
                        }
                    }
                    else {
                        this.e(layoutNode);
                        i(layoutNode);
                    }
                }
                else {
                    this.e(layoutNode);
                }
                layoutNode.A = false;
                this.f = true;
                this.j();
            }
        }
    }
    
    public final void h(final LayoutNode layoutNode) {
        if (layoutNode.B != -4) {
            final int d = this.d(layoutNode);
            final long[] array = (long[])this.c.c;
            array[d + 1] = (array[d] = -1L);
            array[d + 2] = l2j.a;
            layoutNode.B = -4;
            layoutNode.A = true;
            this.f = true;
            this.h = true;
        }
    }
    
    public final void j() {
        final o40 i = this.i;
        final boolean b = i != null;
        final long c = this.d.c;
        if (c >= 0L || !b) {
            if (this.j != c || !b) {
                final AndroidComposeView b2 = this.b;
                if (i != null) {
                    ((View)b2).removeCallbacks((Runnable)i);
                }
                final long currentTimeMillis = System.currentTimeMillis();
                final long max = Math.max(c, 16L + currentTimeMillis);
                this.j = max;
                final o40 j = new o40((jta)this.k, (byte)1);
                ((View)b2).postDelayed((Runnable)j, max - currentTimeMillis);
                this.i = j;
            }
        }
    }
}
