import androidx.compose.foundation.layout.b;

public abstract class fuh
{
    public static final wq7 a;
    public static final wq7 b;
    
    static {
        a = new wq7(0.3f, 0.0f, 0.8f, 0.15f);
        b = new wq7(0.2f, 0.0f, 0.0f, 1.0f);
    }
    
    public static final void a(igf v, long d, float n, long g, int n2, float n3, final gva gva, final int n4, final int n5) {
        gva.i0(333154241);
        final int n6 = n5 & 0x1;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0x6) == 0x0) {
            int n8;
            if (gva.f((Object)v)) {
                n8 = 4;
            }
            else {
                n8 = 2;
            }
            n7 = (n8 | n4);
        }
        else {
            n7 = n4;
        }
        if ((n4 & 0x30) == 0x0) {
            int n9;
            if ((n5 & 0x2) == 0x0 && gva.e(d)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n7 |= n9;
        }
        final int n10 = n5 & 0x4;
        int n11;
        if (n10 != 0) {
            n11 = (n7 | 0x180);
        }
        else {
            n11 = n7;
            if ((n4 & 0x180) == 0x0) {
                int n12;
                if (gva.c(n)) {
                    n12 = 256;
                }
                else {
                    n12 = 128;
                }
                n11 = (n7 | n12);
            }
        }
        int n13 = n11;
        if ((n4 & 0xC00) == 0x0) {
            n13 = (n11 | 0x400);
        }
        final int n14 = n5 & 0x10;
        int n15;
        if (n14 != 0) {
            n15 = (n13 | 0x6000);
        }
        else {
            n15 = n13;
            if ((n4 & 0x6000) == 0x0) {
                int n16;
                if (gva.d(n2)) {
                    n16 = 16384;
                }
                else {
                    n16 = 8192;
                }
                n15 = (n13 | n16);
            }
        }
        int n17 = n15 | 0x30000;
        if (gva.W(n17 & 0x1, (n17 & 0x12493) != 0x12492)) {
            gva.b0();
            int n19;
            if ((n4 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n18 = n17;
                if ((n5 & 0x2) != 0x0) {
                    n18 = (n17 & 0xFFFFFF8F);
                }
                n19 = (n18 & 0xFFFFE3FF);
            }
            else {
                if (n6 != 0) {
                    v = (igf)fgf.v;
                }
                if ((n5 & 0x2) != 0x0) {
                    d = s86.d(25, gva);
                    n17 &= 0xFFFFFF8F;
                }
                if (n10 != 0) {
                    n = 4.0f;
                }
                g = j86.g;
                n19 = (n17 & 0xFFFFE3FF);
                if (n14 != 0) {
                    n2 = 1;
                }
                n3 = 4.0f;
            }
            gva.r();
            final tym tym = new tym(((xc8)gva.j((sei)hm6.h)).w0(n), 0.0f, n2, 0, (h90)null, 26);
            final z8c k0 = eqi.k0((String)null, gva, 1);
            final x8c l = eqi.L(k0, 0.0f, 1080.0f, ri2.W((mz8)ri2.I0(6000, 0, (u09)x09.d, 2), 0, 6), (String)null, gva, 4536, 8);
            final njh njh = new njh((byte)4);
            final pvc pvc = new pvc();
            njh.b((Object)pvc);
            final x8c i = eqi.L(k0, 0.0f, 360.0f, ri2.W((mz8)new qvc(pvc), 0, 6), (String)null, gva, 4536, 8);
            final pvc pvc2 = new pvc();
            pvc2.a = 6000;
            pvc2.a(Float.valueOf(0.87f), 3000).b = (u09)fuh.b;
            pvc2.a(Float.valueOf(0.1f), 6000);
            final x8c j = eqi.L(k0, 0.1f, 0.87f, ri2.W((mz8)new qvc(pvc2), 0, 6), (String)null, gva, 4536, 8);
            final igf p9 = androidx.compose.foundation.layout.b.p(wsk.b((lta)new njh((byte)5), v, true), 40.0f);
            final boolean f = gva.f((Object)j);
            final boolean b = (n19 & 0xE000) == 0x4000;
            final boolean b2 = (0x70000 & n19) == 0x20000;
            final boolean b3 = (n19 & 0x380) == 0x100;
            final boolean f2 = gva.f((Object)l);
            final boolean f3 = gva.f((Object)i);
            final boolean e = gva.e(g);
            final boolean h = gva.h((Object)tym);
            final boolean b4 = (((n19 & 0x70) ^ 0x30) > 32 && gva.e(d)) || (n19 & 0x30) == 0x20;
            Object r = gva.R();
            if ((b | f | b2 | b3 | f2 | f3 | e | h | b4) || r == bi6.a) {
                r = new duh(j, n2, n3, n, l, i, g, tym, d);
                gva.q0(r);
            }
            ljq.j(p9, (lta)r, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new euh(v, d, n, g, n2, n3, n4, n5);
        }
    }
    
    public static final void b(final jta jta, final igf igf, final long n, final float n2, final long n3, int n4, float n5, final gva gva, final int n6) {
        gva.i0(-1798883595);
        int n8;
        if ((n6 & 0x6) == 0x0) {
            int n7;
            if (gva.h((Object)jta)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n8 = (n7 | n6);
        }
        else {
            n8 = n6;
        }
        int n9 = n8;
        if ((n6 & 0x30) == 0x0) {
            int n10;
            if (gva.f((Object)igf)) {
                n10 = 32;
            }
            else {
                n10 = 16;
            }
            n9 = (n8 | n10);
        }
        int n11 = n9;
        if ((n6 & 0x180) == 0x0) {
            int n12;
            if (gva.e(n)) {
                n12 = 256;
            }
            else {
                n12 = 128;
            }
            n11 = (n9 | n12);
        }
        int n13 = n11;
        if ((n6 & 0xC00) == 0x0) {
            int n14;
            if (gva.c(n2)) {
                n14 = 2048;
            }
            else {
                n14 = 1024;
            }
            n13 = (n11 | n14);
        }
        int n15 = n13;
        if ((n6 & 0x6000) == 0x0) {
            int n16;
            if (gva.e(n3)) {
                n16 = 16384;
            }
            else {
                n16 = 8192;
            }
            n15 = (n13 | n16);
        }
        final int n17 = n15 | 0x1B0000;
        if (gva.W(n17 & 0x1, (0x92493 & n17) != 0x92492)) {
            gva.b0();
            if ((n6 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                n5 = 4.0f;
                n4 = 1;
            }
            gva.r();
            final boolean b = (n17 & 0xE) == 0x4;
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if (b || (o = r) == a) {
                o = new vg(jta, (byte)26);
                gva.q0(o);
            }
            final jta jta2 = (jta)o;
            final tym tym = new tym(((xc8)gva.j((sei)hm6.h)).w0(n2), 0.0f, n4, 0, (h90)null, 26);
            final boolean f = gva.f((Object)jta2);
            final Object r2 = gva.R();
            Object o2;
            if (f || (o2 = r2) == a) {
                o2 = new hk0(jta2, (byte)18);
                gva.q0(o2);
            }
            final igf p9 = androidx.compose.foundation.layout.b.p(wsk.b((lta)o2, igf, true), 40.0f);
            final boolean f2 = gva.f((Object)jta2);
            final boolean b2 = (n17 & 0x70000) == 0x20000;
            final boolean b3 = (0x380000 & n17) == 0x100000;
            final boolean b4 = (n17 & 0x1C00) == 0x800;
            final boolean b5 = (((0xE000 & n17) ^ 0x6000) > 16384 && gva.e(n3)) || (n17 & 0x6000) == 0x4000;
            final boolean h = gva.h((Object)tym);
            final boolean b6 = (((n17 & 0x380) ^ 0x180) > 256 && gva.e(n)) || (n17 & 0x180) == 0x100;
            Object r3 = gva.R();
            if ((b2 | f2 | b3 | b4 | b5 | h | b6) || r3 == a) {
                r3 = new buh(jta2, n4, n5, n2, n3, tym, n);
                gva.q0(r3);
            }
            ljq.j(p9, (lta)r3, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cuh(jta, igf, n, n2, n3, n4, n5, n6);
        }
    }
    
    public static final void c(final igf igf, long d, final long n, int n2, float n3, final gva gva, final int n4) {
        final Float value = 1.0f;
        final Float value2 = 0.0f;
        gva.i0(567589233);
        final int n5 = n4 | 0x6C10;
        if (gva.W(n5 & 0x1, (n5 & 0x2493) != 0x2492)) {
            gva.b0();
            if ((n4 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                d = s86.d(25, gva);
                n2 = 1;
                n3 = 4.0f;
            }
            gva.r();
            final z8c k0 = eqi.k0((String)null, gva, 1);
            final pvc pvc = new pvc();
            pvc.a = 1750;
            final ovc a = pvc.a(value2, 0);
            final wq7 a2 = fuh.a;
            a.b = (u09)a2;
            pvc.a(value, 1000);
            final x8c l = eqi.L(k0, 0.0f, 1.0f, ri2.W((mz8)new qvc(pvc), 0, 6), (String)null, gva, 4536, 8);
            final pvc pvc2 = new pvc();
            pvc2.a = 1750;
            pvc2.a(value2, 250).b = (u09)a2;
            pvc2.a(value, 1250);
            final x8c i = eqi.L(k0, 0.0f, 1.0f, ri2.W((mz8)new qvc(pvc2), 0, 6), (String)null, gva, 4536, 8);
            final pvc pvc3 = new pvc();
            pvc3.a = 1750;
            pvc3.a(value2, 650).b = (u09)a2;
            pvc3.a(value, 1500);
            final x8c j = eqi.L(k0, 0.0f, 1.0f, ri2.W((mz8)new qvc(pvc3), 0, 6), (String)null, gva, 4536, 8);
            final pvc pvc4 = new pvc();
            pvc4.a = 1750;
            pvc4.a(value2, 900).b = (u09)a2;
            pvc4.a(value, 1750);
            final x8c m = eqi.L(k0, 0.0f, 1.0f, ri2.W((mz8)new qvc(pvc4), 0, 6), (String)null, gva, 4536, 8);
            final igf r = androidx.compose.foundation.layout.b.r(wsk.b((lta)new njh((byte)5), igf.E(h5.a()), true), 240.0f, 4.0f);
            final boolean f = gva.f((Object)l);
            final boolean f2 = gva.f((Object)i);
            final boolean e = gva.e(d);
            final boolean f3 = gva.f((Object)j);
            final boolean f4 = gva.f((Object)m);
            Object r2 = gva.R();
            if ((f | f2 | e | f3 | f4) || r2 == bi6.a) {
                r2 = new zth(n2, n3, l, n, i, d, j, m);
                gva.q0(r2);
            }
            ljq.j(r, (lta)r2, gva, 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new auh(igf, d, n, n2, n3, n4);
        }
    }
    
    public static final void d(final cw8 cw8, final float n, final float n2, final long n3, final tym tym) {
        final float n4 = tym.a / 2.0f;
        final float n5 = Float.intBitsToFloat((int)(cw8.i() >> 32)) - 2.0f * n4;
        cw8.U(cw8, n3, n, n2, (long)Float.floatToRawIntBits(n4) << 32 | ((long)Float.floatToRawIntBits(n4) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(n5) << 32 | ((long)Float.floatToRawIntBits(n5) & 0xFFFFFFFFL), 0.0f, (dw8)tym, 832);
    }
    
    public static final void e(final cw8 cw8, final float n, final float n2, final long n3, final float n4, final int n5) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(cw8.i() >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(cw8.i() & 0xFFFFFFFFL));
        final float n6 = intBitsToFloat2 / 2.0f;
        final boolean b = cw8.getLayoutDirection() == qzc.v;
        float n7;
        if (b) {
            n7 = n;
        }
        else {
            n7 = 1.0f - n2;
        }
        final float n8 = n7 * intBitsToFloat;
        float n9;
        if (b) {
            n9 = n2;
        }
        else {
            n9 = 1.0f - n;
        }
        final float n10 = n9 * intBitsToFloat;
        if (n5 != 0) {
            if (intBitsToFloat2 <= intBitsToFloat) {
                final float n11 = n4 / 2.0f;
                float n12 = intBitsToFloat - n11;
                float n13 = n8;
                if (n8 < n11) {
                    n13 = n11;
                }
                float n14 = n13;
                if (n13 > n12) {
                    n14 = n12;
                }
                float n15 = n10;
                if (n10 < n11) {
                    n15 = n11;
                }
                if (n15 <= n12) {
                    n12 = n15;
                }
                if (Math.abs(n2 - n) > 0.0f) {
                    cw8.K0(cw8, n3, (long)Float.floatToRawIntBits(n14) << 32 | ((long)Float.floatToRawIntBits(n6) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(n12) << 32 | ((long)Float.floatToRawIntBits(n6) & 0xFFFFFFFFL), n4, n5, 480);
                }
                return;
            }
        }
        cw8.K0(cw8, n3, (long)Float.floatToRawIntBits(n8) << 32 | ((long)Float.floatToRawIntBits(n6) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(n10) << 32 | ((long)Float.floatToRawIntBits(n6) & 0xFFFFFFFFL), n4, 0, 496);
    }
}
