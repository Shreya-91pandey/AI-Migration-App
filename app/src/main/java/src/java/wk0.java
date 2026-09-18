import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public abstract class wk0
{
    public static final wq7 a;
    public static final float b;
    
    static {
        a = new wq7(0.8f, 0.0f, 0.8f, 0.15f);
        b = 12.0f;
    }
    
    public static final void a(final zta zta, final igf igf, zta d, bua e, float b, d1q c, final xao xao, final dng dng, final gva gva, final int n, final int n2) {
        gva.i0(-1109867978);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)zta)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0112: {
            int n6;
            if (n5 != 0) {
                n6 = (n4 | 0x30);
            }
            else {
                n6 = n4;
                if ((n & 0x30) == 0x0) {
                    int n7;
                    if (gva.f((Object)igf)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n4 | n7);
                    break Label_0112;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0180: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x180) == 0x0) {
                    int n11;
                    if (gva.h((Object)d)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0180;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0249: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0xC00) == 0x0) {
                    int n15;
                    if (gva.h((Object)e)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0249;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0319: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n & 0x6000) == 0x0) {
                    int n19;
                    if (gva.c(b)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0319;
                }
            }
            n20 = n18;
        }
        if ((0x30000 & n) == 0x0) {
            int n21;
            if ((n2 & 0x20) == 0x0 && gva.f((Object)c)) {
                n21 = 131072;
            }
            else {
                n21 = 65536;
            }
            n20 |= n21;
        }
        if ((0x180000 & n) == 0x0) {
            int n22;
            if (gva.f((Object)xao)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n20 |= n22;
        }
        int n23;
        if ((n2 & 0x80) != 0x0) {
            n23 = (n20 | 0xC00000);
        }
        else {
            n23 = n20;
            if ((n & 0xC00000) == 0x0) {
                int n24;
                if (gva.f((Object)null)) {
                    n24 = 8388608;
                }
                else {
                    n24 = 4194304;
                }
                n23 = (n20 | n24);
            }
        }
        int n25 = 0;
        d1q d1q;
        igf igf2;
        zta zta3;
        bua bua2;
        dng dng2;
        if (gva.W(n25 & 0x1, (0x2492493 & (n25 = (n23 | 0x6000000))) != 0x2492492)) {
            gva.b0();
            Object v;
            int n26;
            dng a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                if ((n2 & 0x20) != 0x0) {
                    n25 &= 0xFFF8FFFF;
                }
                v = igf;
                n26 = n25;
                a = dng;
            }
            else {
                if (n5 != 0) {
                    v = fgf.v;
                }
                else {
                    v = igf;
                }
                if (n9 != 0) {
                    d = (zta)soh.d;
                }
                if (n13 != 0) {
                    e = (bua)soh.e;
                }
                if (n17 != 0) {
                    b = yao.b;
                }
                n26 = n25;
                if ((n2 & 0x20) != 0x0) {
                    c = yao.c(gva);
                    n26 = (n25 & 0xFFF8FFFF);
                }
                a = yao.a;
            }
            gva.r();
            final mnn y = x90.y(12, gva);
            final mnn d2 = mnn.d;
            final kb2 k = wab.K;
            float b2;
            if (!qs8.e(b, Float.NaN) && !qs8.e(b, Float.POSITIVE_INFINITY)) {
                b2 = b;
            }
            else {
                b2 = yao.b;
            }
            final int n27 = n26 << 3;
            final int n28 = n26 << 12;
            c((igf)v, zta, y, d2, k, d, e, b2, a, c, xao, gva, (n26 >> 3 & 0xE) | 0x36C00 | (n27 & 0x70) | (n28 & 0x380000) | (n28 & 0x1C00000) | (n27 & 0x70000000), n26 >> 15 & 0x3FE);
            final zta zta2 = d;
            final bua bua = e;
            d1q = c;
            igf2 = (igf)v;
            zta3 = zta2;
            bua2 = bua;
            dng2 = a;
        }
        else {
            gva.Z();
            zta3 = d;
            d1q = c;
            dng2 = dng;
            bua2 = e;
            igf2 = igf;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new gk0(zta, igf2, zta3, bua2, b, d1q, xao, dng2, n, n2);
        }
    }
    
    public static final void b(final ye6 ye6, final igf igf, final ye6 ye7, final bua bua, final float n, final float n2, d1q c, final xao xao, final bbo bbo, final gva gva, final int n3) {
        gva.i0(-1378129383);
        int n4;
        if (gva.f((Object)igf)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        int n5;
        if (gva.h((Object)ye7)) {
            n5 = 256;
        }
        else {
            n5 = 128;
        }
        int n6;
        if (gva.h((Object)bua)) {
            n6 = 2048;
        }
        else {
            n6 = 1024;
        }
        int n7;
        if (gva.c(n)) {
            n7 = 16384;
        }
        else {
            n7 = 8192;
        }
        int n8;
        if (gva.c(n2)) {
            n8 = 131072;
        }
        else {
            n8 = 65536;
        }
        int n9;
        if (gva.f((Object)xao)) {
            n9 = 8388608;
        }
        else {
            n9 = 4194304;
        }
        int n10;
        if (gva.f((Object)bbo)) {
            n10 = 67108864;
        }
        else {
            n10 = 33554432;
        }
        final int n11 = n3 | n4 | n5 | n6 | n7 | n8 | 0x80000 | n9 | n10;
        if (gva.W(n11 & 0x1, (0x2492493 & n11) != 0x2492492)) {
            gva.b0();
            int n12;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n12 = (n11 & 0xFFC7FFFF);
            }
            else {
                c = yao.c(gva);
                n12 = (n11 & 0xFFC7FFFF);
            }
            gva.r();
            final mnn y = x90.y(8, gva);
            final mnn y2 = x90.y(12, gva);
            final mnn d = mnn.d;
            float c2;
            if (!qs8.e(n, Float.NaN) && !qs8.e(n, Float.POSITIVE_INFINITY)) {
                c2 = n;
            }
            else {
                c2 = yao.c;
            }
            float d2;
            if (!qs8.e(n2, Float.NaN) && !qs8.e(n2, Float.POSITIVE_INFINITY)) {
                d2 = n2;
            }
            else {
                d2 = yao.d;
            }
            final int n13 = n12 >> 3;
            f(igf, ye6, y, ye6, y2, d, d, ye7, bua, c2, d2, c, xao, bbo, gva, (n13 & 0xE) | 0x36D86030, (n13 & 0x70) | 0x6 | (n13 & 0x380) | (0x380000 & n13) | (n13 & 0x1C00000));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new pk0(ye6, igf, ye7, bua, n, n2, c, xao, bbo, n3);
        }
    }
    
    public static final void c(final igf igf, final zta zta, final mnn mnn, final mnn mnn2, final kb2 kb2, final zta zta2, final bua bua, final float n, final dng dng, final d1q d1q, final xao xao, final gva gva, final int n2, final int n3) {
        gva.i0(703932376);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)igf)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n2);
        }
        else {
            n5 = n2;
        }
        if ((n2 & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)zta)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 |= n6;
        }
        if ((n2 & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)mnn)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n5 |= n7;
        }
        int n8 = n5;
        if ((n2 & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)null)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n5 | n9);
        }
        if ((n2 & 0x6000) == 0x0) {
            int n10;
            if (gva.f((Object)mnn2)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n8 |= n10;
        }
        int n11 = n8;
        if ((n2 & 0x30000) == 0x0) {
            int n12;
            if (gva.f((Object)kb2)) {
                n12 = 131072;
            }
            else {
                n12 = 65536;
            }
            n11 = (n8 | n12);
        }
        int n13 = n11;
        if ((n2 & 0x180000) == 0x0) {
            int n14;
            if (gva.h((Object)zta2)) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n13 = (n11 | n14);
        }
        int n15 = n13;
        if ((n2 & 0xC00000) == 0x0) {
            int n16;
            if (gva.h((Object)bua)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n13 | n16);
        }
        int n17 = n15;
        if ((n2 & 0x6000000) == 0x0) {
            int n18;
            if (gva.c(n)) {
                n18 = 67108864;
            }
            else {
                n18 = 33554432;
            }
            n17 = (n15 | n18);
        }
        int n19 = n17;
        if ((n2 & 0x30000000) == 0x0) {
            int n20;
            if (gva.f((Object)dng)) {
                n20 = 536870912;
            }
            else {
                n20 = 268435456;
            }
            n19 = (n17 | n20);
        }
        int n22;
        if ((n3 & 0x6) == 0x0) {
            int n21;
            if (gva.f((Object)d1q)) {
                n21 = 4;
            }
            else {
                n21 = 2;
            }
            n22 = (n3 | n21);
        }
        else {
            n22 = n3;
        }
        int n23 = n22;
        if ((n3 & 0x30) == 0x0) {
            int n24;
            if (gva.f((Object)xao)) {
                n24 = 32;
            }
            else {
                n24 = 16;
            }
            n23 = (n22 | n24);
        }
        int n25 = n23;
        if ((n3 & 0x180) == 0x0) {
            int n26;
            if (gva.f((Object)null)) {
                n26 = 256;
            }
            else {
                n26 = 128;
            }
            n25 = (n23 | n26);
        }
        if (gva.W(n19 & 0x1, (0x12492493 & n19) != 0x12492492 || (n25 & 0x93) != 0x92)) {
            if (Float.isNaN(n) || (Float.floatToRawIntBits(n) & Integer.MAX_VALUE) >= 2139095040) {
                en9.s("The expandedHeight is expected to be specified and finite");
                return;
            }
            final boolean b = (n25 & 0x70) == 0x20;
            final int n27 = n25 & 0x380;
            final boolean b2 = n27 == 256;
            Object o = gva.R();
            final cib a = bi6.a;
            if ((b | b2) || o == a) {
                o = r8m.b((jta)new nr(xao, (byte)1));
                gva.q0(o);
            }
            final xom a2 = tzl.a(((j86)((xom)o).getValue()).a, (bfa)zrn.X(3, gva), (String)null, gva, 0, 12);
            final ye6 t0 = uuj.t0(1222546095, (aua)new l0((Object)bua, (byte)2), gva);
            gva.g0(-1473335574);
            gva.q(false);
            final fgf v = fgf.v;
            final igf e = igf.E((igf)v);
            final boolean f = gva.f((Object)a2);
            Object r = gva.R();
            if (f || r == a) {
                r = new ef0(a2, (byte)1);
                gva.q0(r);
            }
            final igf e2 = t08.E(e, (lta)r);
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new p50((byte)25);
                gva.q0(r2);
            }
            final igf b3 = wsk.b((lta)r2, e2, false);
            Object o2;
            if ((o2 = gva.R()) == a) {
                o2 = sk0.w;
                gva.q0(o2);
            }
            final igf b4 = p6n.b(b3, (Object)lqo.a, (PointerInputEventHandler)o2);
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b5 = ien.B(gva, b4);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b5);
            final igf i = rml.l(vt4.k0((igf)v, d1q));
            final boolean b6 = n27 == 256;
            final Object r3 = gva.R();
            Object o3;
            if (b6 || (o3 = r3) == a) {
                o3 = new Object();
                gva.q0(o3);
            }
            final tia tia = (tia)o3;
            final long c2 = xao.c;
            final long d = xao.d;
            final long e3 = xao.e;
            final long f2 = xao.f;
            final def e4 = t08.e;
            Object r4 = gva.R();
            if (r4 == a) {
                r4 = new kh0((byte)3);
                gva.q0(r4);
            }
            final jta jta = (jta)r4;
            final int n28 = n19 >> 3;
            e(i, tia, c2, d, f2, e3, zta, mnn, mnn2, jta, (jv0)e4, kb2, 0, false, zta2, t0, n, dng, gva, n19 << 15 & 0x7FF80000, (n19 >> 9 & 0x380) | 0x186C36 | (0x70000 & n28) | (0x1C00000 & n28) | (n28 & 0xE000000));
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new mk0(igf, zta, mnn, mnn2, kb2, zta2, bua, n, dng, d1q, xao, n2, n3);
        }
    }
    
    public static final void d(final ye6 ye6, igf v, zta b, bua c, float b2, d1q c2, xao b3, final dng dng, final gva gva, final int n, final int n2) {
        gva.i0(660588393);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)ye6)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0113: {
            int n6;
            if (n5 != 0) {
                n6 = (n4 | 0x30);
            }
            else {
                n6 = n4;
                if ((n & 0x30) == 0x0) {
                    int n7;
                    if (gva.f((Object)v)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n4 | n7);
                    break Label_0113;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0181: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x180) == 0x0) {
                    int n11;
                    if (gva.h((Object)b)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0181;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0250: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0xC00) == 0x0) {
                    int n15;
                    if (gva.h((Object)c)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0250;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0320: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n & 0x6000) == 0x0) {
                    int n19;
                    if (gva.c(b2)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0320;
                }
            }
            n20 = n18;
        }
        if ((0x30000 & n) == 0x0) {
            int n21;
            if ((n2 & 0x20) == 0x0 && gva.f((Object)c2)) {
                n21 = 131072;
            }
            else {
                n21 = 65536;
            }
            n20 |= n21;
        }
        if ((0x180000 & n) == 0x0) {
            int n22;
            if ((n2 & 0x40) == 0x0 && gva.f((Object)b3)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n20 |= n22;
        }
        int n23;
        if ((n2 & 0x80) != 0x0) {
            n23 = (n20 | 0xC00000);
        }
        else {
            n23 = n20;
            if ((n & 0xC00000) == 0x0) {
                int n24;
                if (gva.f((Object)null)) {
                    n24 = 8388608;
                }
                else {
                    n24 = 4194304;
                }
                n23 = (n20 | n24);
            }
        }
        final int n25;
        zta zta;
        igf igf2;
        d1q d1q;
        xao xao;
        dng dng3;
        if (gva.W(n25 & 0x1, (0x2492493 & (n25 = (n23 | 0x6000000))) != 0x2492492)) {
            gva.b0();
            int n27;
            igf igf;
            dng dng2;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n26;
                if ((n2 & 0x20) != 0x0) {
                    n26 = (n25 & 0xFFF8FFFF);
                }
                else {
                    n26 = n25;
                }
                n27 = n26;
                if ((n2 & 0x40) != 0x0) {
                    n27 = (n26 & 0xFFC7FFFF);
                }
                igf = v;
                dng2 = dng;
            }
            else {
                if (n5 != 0) {
                    v = (igf)fgf.v;
                }
                if (n9 != 0) {
                    b = (zta)soh.b;
                }
                if (n13 != 0) {
                    c = (bua)soh.c;
                }
                if (n17 != 0) {
                    b2 = yao.b;
                }
                int n28 = n25;
                if ((n2 & 0x20) != 0x0) {
                    c2 = yao.c(gva);
                    n28 = (n25 & 0xFFF8FFFF);
                }
                n27 = n28;
                if ((n2 & 0x40) != 0x0) {
                    final hng a = yao.a;
                    b3 = yao.b(((e8e)gva.j((sei)h8e.a)).a);
                    n27 = (n28 & 0xFFC7FFFF);
                }
                final hng a2 = yao.a;
                igf = v;
                dng2 = a2;
            }
            gva.r();
            final mnn y = x90.y(12, gva);
            final mnn d = mnn.d;
            final kb2 j = wab.J;
            float b4;
            if (!qs8.e(b2, Float.NaN) && !qs8.e(b2, Float.POSITIVE_INFINITY)) {
                b4 = b2;
            }
            else {
                b4 = yao.b;
            }
            final int n29 = n27 << 3;
            final int n30 = n27 << 12;
            c(igf, (zta)ye6, y, d, j, b, c, b4, dng2, c2, b3, gva, (n27 >> 3 & 0xE) | 0x36C00 | (n29 & 0x70) | (n30 & 0x380000) | (n30 & 0x1C00000) | (n29 & 0x70000000), n27 >> 15 & 0x3FE);
            zta = b;
            igf2 = igf;
            d1q = c2;
            xao = b3;
            dng3 = dng2;
        }
        else {
            gva.Z();
            final d1q d1q2 = c2;
            xao = b3;
            dng3 = dng;
            d1q = d1q2;
            zta = b;
            igf2 = v;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new kk0(ye6, igf2, zta, c, b2, d1q, xao, dng3, n, n2);
        }
    }
    
    public static final void e(final igf igf, final tia tia, final long n, final long n2, final long n3, final long n4, final zta zta, final mnn mnn, final mnn mnn2, final jta jta, final jv0 jv0, final kb2 kb2, final int n5, final boolean b, final zta zta2, final ye6 ye6, final float n6, final dng dng, final gva gva, final int n7, final int n8) {
        gva.i0(239553141);
        int n10;
        if ((n7 & 0x6) == 0x0) {
            int n9;
            if (gva.f((Object)igf)) {
                n9 = 4;
            }
            else {
                n9 = 2;
            }
            n10 = (n9 | n7);
        }
        else {
            n10 = n7;
        }
        final int n11 = 16;
        int n12 = n10;
        if ((n7 & 0x30) == 0x0) {
            boolean b2;
            if ((n7 & 0x40) == 0x0) {
                b2 = gva.f((Object)tia);
            }
            else {
                b2 = gva.h((Object)tia);
            }
            int n13;
            if (b2) {
                n13 = 32;
            }
            else {
                n13 = 16;
            }
            n12 = (n10 | n13);
        }
        final int n14 = 128;
        int n15 = n12;
        if ((n7 & 0x180) == 0x0) {
            int n16;
            if (gva.e(n)) {
                n16 = 256;
            }
            else {
                n16 = 128;
            }
            n15 = (n12 | n16);
        }
        final int n17 = 1024;
        if ((n7 & 0xC00) == 0x0) {
            int n18;
            if (gva.e(n2)) {
                n18 = 2048;
            }
            else {
                n18 = 1024;
            }
            n15 |= n18;
        }
        final int n19 = 8192;
        int n21;
        if ((n7 & 0x6000) == 0x0) {
            int n20;
            if (gva.e(n3)) {
                n20 = 16384;
            }
            else {
                n20 = 8192;
            }
            n21 = (n15 | n20);
        }
        else {
            n21 = n15;
        }
        final int n22 = 65536;
        int n23 = n21;
        if ((n7 & 0x30000) == 0x0) {
            int n24;
            if (gva.e(n4)) {
                n24 = 131072;
            }
            else {
                n24 = 65536;
            }
            n23 = (n21 | n24);
        }
        final int n25 = 524288;
        int n26 = n23;
        if ((n7 & 0x180000) == 0x0) {
            int n27;
            if (gva.h((Object)zta)) {
                n27 = 1048576;
            }
            else {
                n27 = 524288;
            }
            n26 = (n23 | n27);
        }
        final int n28 = 4194304;
        int n29 = n26;
        if ((n7 & 0xC00000) == 0x0) {
            int n30;
            if (gva.f((Object)mnn)) {
                n30 = 8388608;
            }
            else {
                n30 = 4194304;
            }
            n29 = (n26 | n30);
        }
        final int n31 = 33554432;
        int n32 = n29;
        if ((n7 & 0x6000000) == 0x0) {
            int n33;
            if (gva.h((Object)null)) {
                n33 = 67108864;
            }
            else {
                n33 = 33554432;
            }
            n32 = (n29 | n33);
        }
        int n35;
        if ((n7 & 0x30000000) == 0x0) {
            int n34;
            if (gva.f((Object)mnn2)) {
                n34 = 536870912;
            }
            else {
                n34 = 268435456;
            }
            n35 = (n32 | n34);
        }
        else {
            n35 = n32;
        }
        int n37;
        if ((n8 & 0x6) == 0x0) {
            int n36;
            if (gva.h((Object)jta)) {
                n36 = 4;
            }
            else {
                n36 = 2;
            }
            n37 = (n36 | n8);
        }
        else {
            n37 = n8;
        }
        int n38 = n37;
        if ((n8 & 0x30) == 0x0) {
            int n39 = n11;
            if (gva.f((Object)jv0)) {
                n39 = 32;
            }
            n38 = (n37 | n39);
        }
        if ((n8 & 0x180) == 0x0) {
            int n40 = n14;
            if (gva.f((Object)kb2)) {
                n40 = 256;
            }
            n38 |= n40;
        }
        int n42;
        if ((n8 & 0xC00) == 0x0) {
            int n41 = n17;
            if (gva.d(n5)) {
                n41 = 2048;
            }
            n42 = (n38 | n41);
        }
        else {
            n42 = n38;
        }
        int n43 = n42;
        if ((n8 & 0x6000) == 0x0) {
            int n44 = n19;
            if (gva.g(b)) {
                n44 = 16384;
            }
            n43 = (n42 | n44);
        }
        int n45 = n43;
        if ((n8 & 0x30000) == 0x0) {
            int n46 = n22;
            if (gva.h((Object)zta2)) {
                n46 = 131072;
            }
            n45 = (n43 | n46);
        }
        int n47 = n45;
        if ((n8 & 0x180000) == 0x0) {
            int n48 = n25;
            if (gva.h((Object)ye6)) {
                n48 = 1048576;
            }
            n47 = (n45 | n48);
        }
        if ((n8 & 0xC00000) == 0x0) {
            int n49 = n28;
            if (gva.c(n6)) {
                n49 = 8388608;
            }
            n47 |= n49;
        }
        int n50 = n47;
        if ((n8 & 0x6000000) == 0x0) {
            int n51 = n31;
            if (gva.f((Object)dng)) {
                n51 = 67108864;
            }
            n50 = (n47 | n51);
        }
        if (gva.W(n35 & 0x1, (n35 & 0x12492493) != 0x12492492 || (0x2492493 & n50) != 0x2492492)) {
            final boolean b3 = (n35 & 0x70) == 0x20 || ((n35 & 0x40) != 0x0 && gva.f((Object)tia));
            final boolean b4 = (n50 & 0x70) == 0x20;
            final boolean b5 = (n50 & 0x380) == 0x100;
            final boolean b6 = (n50 & 0x1C00) == 0x800;
            final boolean b7 = (0x1C00000 & n50) == 0x800000;
            final Object r = gva.R();
            final cib a = bi6.a;
            abo abo;
            if (!(b3 | b4 | b5 | b6 | b7) && r != a) {
                abo = (abo)r;
            }
            else {
                final abo abo2 = new abo(tia, jv0, kb2, n5, n6, dng);
                gva.q0((Object)abo2);
                abo = abo2;
            }
            final abo abo3 = abo;
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b8 = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n52 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n52);
            }
            else {
                gva.t0();
            }
            final rg6 a2 = awp.A;
            k8e.P((zta)a2, gva, (Object)abo3);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, (Object)l);
            final rg6 b9 = awp.B;
            k8e.P((zta)b9, gva, (Object)hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, (Object)b8);
            final fgf v = fgf.v;
            final igf y2 = omo.Y(ao2.R((igf)v, (Object)"navigationIcon"), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            final mb2 x = wab.x;
            final moe c = rj2.c((gx)x, false);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b10 = ien.B(gva, y2);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n52);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, (Object)c);
            k8e.P((zta)z, gva, (Object)i);
            oz1.v(hashCode2, gva, b9, gva);
            k8e.P((zta)y, gva, (Object)b10);
            final b09 a3 = dx6.a;
            c5q.c(ge9.n(n, a3), zta2, gva, 0x8 | (n50 >> 12 & 0x70));
            gva.q(true);
            gva.g0(408669108);
            final igf w = omo.W(ao2.R((igf)v, (Object)"title"), 4.0f, 0.0f, 2);
            Object a4;
            if (b) {
                gva.g0(-402448939);
                Object r2;
                if ((r2 = gva.R()) == a) {
                    r2 = new p50((byte)26);
                    gva.q0(r2);
                }
                a4 = wsk.a((igf)v, (lta)r2);
                gva.q(false);
            }
            else {
                gva.g0(-402447002);
                gva.q(false);
                a4 = v;
            }
            final igf e = w.E((igf)a4);
            final boolean b11 = (n50 & 0xE) == 0x4;
            Object r3 = gva.R();
            if (b11 || r3 == a) {
                r3 = new nk0(jta, (byte)0);
                gva.q0(r3);
            }
            final igf f = zrn.F(e, (lta)r3);
            final moe c2 = rj2.c((gx)x, false);
            final int hashCode3 = Long.hashCode(gva.T);
            final e3h j = gva.l();
            final igf b12 = ien.B(gva, f);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n52);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, (Object)c2);
            k8e.P((zta)z, gva, (Object)j);
            oz1.v(hashCode3, gva, b9, gva);
            k8e.P((zta)y, gva, (Object)b12);
            ien.f(n2, mnn, zta, gva, (n35 >> 9 & 0xE) | (n35 >> 18 & 0x70) | (n35 >> 12 & 0x380));
            gva.q(true);
            gva.q(false);
            final igf y3 = omo.Y(ao2.R((igf)v, (Object)"actionIcons"), 0.0f, 0.0f, 4.0f, 0.0f, 11);
            final moe c3 = rj2.c((gx)x, false);
            final int hashCode4 = Long.hashCode(gva.T);
            final e3h k = gva.l();
            final igf b13 = ien.B(gva, y3);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n52);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, (Object)c3);
            k8e.P((zta)z, gva, (Object)k);
            oz1.v(hashCode4, gva, b9, gva);
            k8e.P((zta)y, gva, (Object)b13);
            c5q.c(a3.a((Object)new j86(n4)), (zta)ye6, gva, 0x8 | (n50 >> 15 & 0x70));
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ok0(igf, tia, n, n2, n3, n4, zta, mnn, mnn2, jta, jv0, kb2, n5, b, zta2, ye6, n6, dng, n7, n8);
        }
    }
    
    public static final void f(final igf igf, final ye6 ye6, final mnn mnn, final ye6 ye7, final mnn mnn2, final mnn mnn3, final mnn mnn4, final ye6 ye8, final bua bua, final float n, final float n2, final d1q d1q, final xao xao, final bbo bbo, final gva gva, final int n3, final int n4) {
        final kb2 j = wab.J;
        gva.i0(1092180406);
        int n6;
        if ((n3 & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)igf)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n6 = (n5 | n3);
        }
        else {
            n6 = n3;
        }
        final int n7 = 32;
        if ((n3 & 0x30) == 0x0) {
            int n8;
            if (gva.h((Object)ye6)) {
                n8 = 32;
            }
            else {
                n8 = 16;
            }
            n6 |= n8;
        }
        final int n9 = 128;
        if ((n3 & 0x180) == 0x0) {
            int n10;
            if (gva.f((Object)mnn)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n6 |= n10;
        }
        final int n11 = 1024;
        int n12 = n6;
        if ((n3 & 0xC00) == 0x0) {
            int n13;
            if (gva.c(24.0f)) {
                n13 = 2048;
            }
            else {
                n13 = 1024;
            }
            n12 = (n6 | n13);
        }
        final int n14 = 8192;
        if ((n3 & 0x6000) == 0x0) {
            int n15;
            if (gva.h((Object)ye7)) {
                n15 = 16384;
            }
            else {
                n15 = 8192;
            }
            n12 |= n15;
        }
        final int n16 = 65536;
        int n17 = n12;
        if ((n3 & 0x30000) == 0x0) {
            int n18;
            if (gva.f((Object)mnn2)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n17 = (n12 | n18);
        }
        final int n19 = 524288;
        int n21;
        if ((n3 & 0x180000) == 0x0) {
            int n20;
            if (gva.h((Object)null)) {
                n20 = 1048576;
            }
            else {
                n20 = 524288;
            }
            n21 = (n17 | n20);
        }
        else {
            n21 = n17;
        }
        final int n22 = 4194304;
        int n23 = n21;
        if ((n3 & 0xC00000) == 0x0) {
            int n24;
            if (gva.f((Object)mnn3)) {
                n24 = 8388608;
            }
            else {
                n24 = 4194304;
            }
            n23 = (n21 | n24);
        }
        int n25 = n23;
        if ((n3 & 0x6000000) == 0x0) {
            int n26;
            if (gva.h((Object)null)) {
                n26 = 67108864;
            }
            else {
                n26 = 33554432;
            }
            n25 = (n23 | n26);
        }
        int n27 = n25;
        if ((n3 & 0x30000000) == 0x0) {
            int n28;
            if (gva.f((Object)mnn4)) {
                n28 = 536870912;
            }
            else {
                n28 = 268435456;
            }
            n27 = (n25 | n28);
        }
        int n30;
        if ((n4 & 0x6) == 0x0) {
            int n29;
            if (gva.f((Object)j)) {
                n29 = 4;
            }
            else {
                n29 = 2;
            }
            n30 = (n4 | n29);
        }
        else {
            n30 = n4;
        }
        int n31 = n30;
        if ((n4 & 0x30) == 0x0) {
            int n32;
            if (gva.h((Object)ye8)) {
                n32 = n7;
            }
            else {
                n32 = 16;
            }
            n31 = (n30 | n32);
        }
        int n33 = n31;
        if ((n4 & 0x180) == 0x0) {
            int n34 = n9;
            if (gva.h((Object)bua)) {
                n34 = 256;
            }
            n33 = (n31 | n34);
        }
        int n35 = n33;
        if ((n4 & 0xC00) == 0x0) {
            int n36 = n11;
            if (gva.c(n)) {
                n36 = 2048;
            }
            n35 = (n33 | n36);
        }
        int n37 = n35;
        if ((n4 & 0x6000) == 0x0) {
            int n38 = n14;
            if (gva.c(n2)) {
                n38 = 16384;
            }
            n37 = (n35 | n38);
        }
        int n39 = n37;
        if ((n4 & 0x30000) == 0x0) {
            int n40 = n16;
            if (gva.f((Object)d1q)) {
                n40 = 131072;
            }
            n39 = (n37 | n40);
        }
        int n41 = n39;
        if ((n4 & 0x180000) == 0x0) {
            int n42 = n19;
            if (gva.f((Object)xao)) {
                n42 = 1048576;
            }
            n41 = (n39 | n42);
        }
        int n43 = n41;
        if ((n4 & 0xC00000) == 0x0) {
            int n44 = n22;
            if (gva.f((Object)bbo)) {
                n44 = 8388608;
            }
            n43 = (n41 | n44);
        }
        if (gva.W(n27 & 0x1, (n27 & 0x12492493) != 0x12492492 || (n43 & 0x492493) != 0x492492)) {
            if (Float.isNaN(n) || (Float.floatToRawIntBits(n) & Integer.MAX_VALUE) >= 2139095040) {
                en9.s("The collapsedHeight is expected to be specified and finite");
                return;
            }
            if (Float.isNaN(n2) || (Float.floatToRawIntBits(n2) & Integer.MAX_VALUE) >= 2139095040) {
                en9.s("The expandedHeight is expected to be specified and finite");
                return;
            }
            if (qs8.b(n2, n) < 0) {
                en9.s("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                return;
            }
            final int l0 = ((xc8)gva.j((sei)hm6.h)).L0(24.0f);
            final int n45 = n43 & 0x1C00000;
            final boolean b = n45 == 8388608;
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if (b || (o = r) == a) {
                o = new s5((Object)bbo, (byte)6);
                gva.q0(o);
            }
            final jta jta = (jta)o;
            final boolean b2 = (n43 & 0x380000) == 0x100000;
            final boolean f = gva.f((Object)jta);
            final Object r2 = gva.R();
            Object o2;
            if ((b2 | f) || (o2 = r2) == a) {
                o2 = new wz((Object)xao, (Object)jta, (byte)1);
                gva.q0(o2);
            }
            final jta jta2 = (jta)o2;
            final ye6 t0 = uuj.t0(1206534349, (aua)new rk0(bua, (byte)0), gva);
            final boolean f2 = gva.f((Object)jta);
            final Object r3 = gva.R();
            Object o3;
            if (f2 || (o3 = r3) == a) {
                o3 = new vg(jta, (byte)1);
                gva.q0(o3);
            }
            final jta jta3 = (jta)o3;
            final boolean f3 = gva.f((Object)jta);
            final Object r4 = gva.R();
            Object o4;
            if (f3 || (o4 = r4) == a) {
                o4 = new vg(jta, (byte)2);
                gva.q0(o4);
            }
            final jta jta4 = (jta)o4;
            final boolean f4 = gva.f((Object)jta);
            final Object r5 = gva.R();
            Object b3;
            if (f4 || (b3 = r5) == a) {
                b3 = r8m.b((jta)new vg(jta, (byte)3));
                gva.q0(b3);
            }
            final xom xom = (xom)b3;
            final boolean b4 = (boolean)xom.getValue() ^ true;
            final fgf v = fgf.v;
            Object a2;
            if (bbo != null) {
                gva.g0(-1523003386);
                final boolean b5 = n45 == 8388608;
                final Object r6 = gva.R();
                Object o5;
                if (b5 || (o5 = r6) == a) {
                    o5 = new i0((Object)bbo, (byte)12);
                    gva.q0(o5);
                }
                final vv8 b6 = tv8.b((lta)o5, gva, 0);
                final boolean b7 = n45 == 8388608;
                final Object r7 = gva.R();
                Object o6;
                if (b7 || (o6 = r7) == a) {
                    o6 = new uk0(bbo, (f07)null);
                    gva.q0(o6);
                }
                a2 = tv8.a((igf)v, b6, zhg.v, false, null, false, null, (bua)o6, false, 188);
                gva.q(false);
            }
            else {
                gva.g0(-1522488724);
                gva.q(false);
                a2 = v;
            }
            final igf e = igf.E((igf)a2);
            final boolean f5 = gva.f((Object)jta2);
            final Object r8 = gva.R();
            Object o7;
            if (f5 || (o7 = r8) == a) {
                o7 = new hk0(jta2, (byte)0);
                gva.q0(o7);
            }
            final igf e2 = t08.E(e, (lta)o7);
            Object r9;
            if ((r9 = gva.R()) == a) {
                r9 = new uz((byte)15);
                gva.q0(r9);
            }
            final igf b8 = wsk.b((lta)r9, e2, false);
            Object o8;
            if ((o8 = gva.R()) == a) {
                o8 = tk0.w;
                gva.q0(o8);
            }
            final igf b9 = p6n.b(b8, (Object)lqo.a, (PointerInputEventHandler)o8);
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b10 = ien.B(gva, b9);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n46 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n46);
            }
            else {
                gva.t0();
            }
            final rg6 a3 = awp.A;
            k8e.P((zta)a3, gva, (Object)c);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, (Object)i);
            final rg6 b11 = awp.B;
            k8e.P((zta)b11, gva, (Object)hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, (Object)b10);
            final v96 a4 = u96.a((jv0)t08.c, (dx)j, gva, 0);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h k = gva.l();
            final igf b12 = ien.B(gva, (igf)v);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n46);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a3, gva, (Object)a4);
            k8e.P((zta)z, gva, (Object)k);
            oz1.v(hashCode2, gva, b11, gva);
            k8e.P((zta)y, gva, (Object)b12);
            final igf m = rml.l(vt4.k0((igf)v, d1q));
            Object r10;
            if ((r10 = gva.R()) == a) {
                r10 = new ik0();
                gva.q0(r10);
            }
            final tia tia = (tia)r10;
            final long c2 = xao.c;
            final long d = xao.d;
            final long e3 = xao.e;
            final long f6 = xao.f;
            final def e4 = t08.e;
            final boolean booleanValue = (boolean)xom.getValue();
            final hng a5 = yao.a;
            final int n47 = n27 << 6;
            final int n48 = n43 << 6 & 0x380;
            final int n49 = n43 << 12;
            e(m, tia, c2, d, f6, e3, (zta)ye7, mnn2, mnn4, jta3, (jv0)e4, j, 0, booleanValue, (zta)ye8, t0, n, a5, gva, (n47 & 0x1F80000) | (n27 & 0xE000000) | (n27 & 0x70000000), 0x6180C30 | n48 | (n49 & 0x70000) | (n49 & 0x1C00000));
            final int q = xp7.q;
            final igf l2 = rml.l(vt4.k0((igf)v, (d1q)new wbd(d1q, 15)));
            igf m2 = null;
            Label_2168: {
                if (bbo != null) {
                    final cbo a6 = ((hv9)bbo).a();
                    if (a6 != null && (m2 = zrn.M(l2, (lta)new i1((Object)a6, (byte)6))) != null) {
                        break Label_2168;
                    }
                }
                m2 = l2;
            }
            final boolean b13 = n45 == 8388608;
            Object r11 = gva.R();
            if (b13 || r11 == a) {
                r11 = new jk0(bbo);
                gva.q0(r11);
            }
            e(m2, (tia)r11, xao.c, xao.d, xao.f, xao.e, (zta)ye6, mnn, mnn3, jta4, (jv0)t08.d, j, l0, b4, (zta)soh.f, soh.g, n2 - n, a5, gva, (n27 << 15 & 0x1F80000) | (n47 & 0xE000000) | (n47 & 0x70000000), n48 | 0x61B0030);
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new qk0(igf, ye6, mnn, ye7, mnn2, mnn3, mnn4, ye8, bua, n, n2, d1q, xao, bbo, n3, n4);
        }
    }
    
    public static final cbo g(final gva gva) {
        final n9k d = cbo.d;
        final n9k h = p4r.h();
        final boolean c = gva.c(-3.4028235E38f);
        final boolean c2 = gva.c(0.0f);
        final boolean c3 = gva.c(0.0f);
        final Object r = gva.R();
        Object o;
        if ((c | c2 | c3) || (o = r) == bi6.a) {
            o = new qx((byte)18);
            gva.q0(o);
        }
        return (cbo)mlc.b0(new Object[0], (m9k)h, (jta)o, gva, 0);
    }
    
    public static final Object h(final cbo v, float c, final v08 v2, final ygm w, final h07 h07) {
        while (true) {
            Label_0045: {
                if (!(h07 instanceof vk0)) {
                    break Label_0045;
                }
                final vk0 vk0 = (vk0)h07;
                final int z = vk0.z;
                if ((z & Integer.MIN_VALUE) == 0x0) {
                    break Label_0045;
                }
                vk0.z = z + Integer.MIN_VALUE;
                final Object y = vk0.y;
                final int z2 = vk0.z;
                final pc7 v3 = pc7.v;
                y3j x;
                ygm w2;
                cbo cbo;
                if (z2 != 0) {
                    if (z2 != 1) {
                        if (z2 == 2) {
                            final Object o = vk0.v;
                            vt4.g0(y);
                            return f7p.a(iar.g(0.0f, ((y3j)o).v));
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        x = vk0.x;
                        w2 = vk0.w;
                        cbo = (cbo)vk0.v;
                        vt4.g0(y);
                    }
                }
                else {
                    vt4.g0(y);
                    if (v.a() < 0.01f || v.a() == 1.0f) {
                        return f7p.a(0L);
                    }
                    final Object x2 = new Object();
                    ((y3j)x2).v = c;
                    cbo = v;
                    w2 = w;
                    x = (y3j)x2;
                    if (v2 != null) {
                        cbo = v;
                        w2 = w;
                        x = (y3j)x2;
                        if (Math.abs(c) > 1.0f) {
                            final Object o2 = new Object();
                            final dg0 a = yi2.a(0.0f, c, 28);
                            final a5 a2 = new a5(o2, (Object)v, x2, (byte)12);
                            vk0.v = v;
                            vk0.w = w;
                            vk0.x = (y3j)x2;
                            vk0.z = 1;
                            cbo = v;
                            w2 = w;
                            x = (y3j)x2;
                            if (uoo.o(a, v2, false, (lta)a2, (h07)vk0) == v3) {
                                return v3;
                            }
                        }
                    }
                }
                Object o = x;
                if (w2 == null) {
                    return f7p.a(iar.g(0.0f, ((y3j)o).v));
                }
                o = x;
                if (cbo.b() >= 0.0f) {
                    return f7p.a(iar.g(0.0f, ((y3j)o).v));
                }
                o = x;
                if (cbo.b() <= cbo.c()) {
                    return f7p.a(iar.g(0.0f, ((y3j)o).v));
                }
                final dg0 a3 = yi2.a(cbo.b(), 0.0f, 30);
                if (cbo.a() < 0.5f) {
                    c = 0.0f;
                }
                else {
                    c = cbo.c();
                }
                final Float n = new Float(c);
                final i0 i0 = new i0((Object)cbo, (byte)11);
                vk0.v = x;
                vk0.w = null;
                vk0.x = null;
                vk0.z = 2;
                if (uoo.q(a3, n, (cg0)w2, false, (lta)i0, (h07)vk0, 4) != v3) {
                    o = x;
                    return f7p.a(iar.g(0.0f, ((y3j)o).v));
                }
                return v3;
            }
            final vk0 vk0 = new vk0(h07);
            continue;
        }
    }
}
