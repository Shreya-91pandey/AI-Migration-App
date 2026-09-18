import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;

public abstract class arf
{
    public static final alo a;
    
    static {
        a = new alo(256, (u09)null, 6);
    }
    
    public static final void a(final nx8 nx8, final ye6 ye6, final gva gva, final int n) {
        final m30 b = nx8.b;
        gva.i0(-383087355);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)nx8)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)ye6)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final Object r = gva.R();
            final cib a = bi6.a;
            kx8 kx8;
            if ((kx8 = (kx8)r) == a) {
                kx8 = new kx8();
                gva.q0((Object)kx8);
            }
            final kx8 kx9 = kx8;
            Object o;
            if ((o = gva.R()) == a) {
                o = mlc.z((hc7)o89.v, gva);
                gva.q0(o);
            }
            final oc7 oc7 = (oc7)o;
            final boolean b2 = gva.j((sei)hm6.n) == qzc.w;
            final Object o2 = new Object();
            final Object o3 = new Object();
            final Object o4 = new Object();
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            ((y3j)o2).v = xc8.w0(12.0f);
            ((y3j)o3).v = xc8.w0(24.0f);
            ((y3j)o4).v = xc8.w0(48.0f);
            final boolean b3 = b.i.getValue() == yx8.w;
            final boolean g = gva.g(b2);
            final boolean c = gva.c(((y3j)o2).v);
            final boolean c2 = gva.c(((y3j)o3).v);
            final boolean c3 = gva.c(((y3j)o4).v);
            final boolean h = gva.h((Object)oc7);
            final int n6 = n4 & 0xE;
            final boolean b4 = n6 == 4;
            Object r2 = gva.R();
            if ((b4 | (g | c | c2 | c3 | h)) || r2 == a) {
                r2 = new xqf(kx9, oc7, nx8, b2, (y3j)o2, (y3j)o3, (y3j)o4, null);
                gva.q0(r2);
            }
            uoo.e(0, (zta)r2, gva, b3);
            final boolean b5 = b.h.getValue() == yx8.v;
            final boolean b6 = n6 == 4;
            final Object r3 = gva.R();
            Object o5;
            if (b6 || (o5 = r3) == a) {
                o5 = new rf0(nx8, kx9, null, (byte)17);
                gva.q0(o5);
            }
            mlc.f((zta)o5, gva, (Object)b5);
            ye6.h((Object)kx9, (Object)gva, (Object)((n4 & 0x70) | 0x6));
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)nx8, ye6, n, (byte)8);
        }
    }
    
    public static final void b(final kx8 kx8, final d1q d1q, final igf igf, final aql aql, final long n, final long n2, final tia tia, final ye6 ye6, final gva gva, final int n3) {
        gva.i0(1560288494);
        int n5;
        if ((n3 & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)kx8)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n3);
        }
        else {
            n5 = n3;
        }
        int n6 = n5;
        if ((n3 & 0x30) == 0x0) {
            int n7;
            if (gva.f((Object)d1q)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n3 & 0x180) == 0x0) {
            int n9;
            if (gva.f((Object)igf)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n3 & 0xC00) == 0x0) {
            int n11;
            if (gva.f((Object)aql)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((n3 & 0x6000) == 0x0) {
            int n13;
            if (gva.e(n)) {
                n13 = 16384;
            }
            else {
                n13 = 8192;
            }
            n12 = (n10 | n13);
        }
        int n14 = n12;
        if ((0x30000 & n3) == 0x0) {
            int n15;
            if (gva.e(n2)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n14 = (n12 | n15);
        }
        int n16 = n14;
        if ((0x180000 & n3) == 0x0) {
            int n17;
            if (gva.c(0.0f)) {
                n17 = 1048576;
            }
            else {
                n17 = 524288;
            }
            n16 = (n14 | n17);
        }
        int n18 = n16;
        if ((n3 & 0xC00000) == 0x0) {
            boolean b;
            if ((0x1000000 & n3) == 0x0) {
                b = gva.f((Object)tia);
            }
            else {
                b = gva.h((Object)tia);
            }
            int n19;
            if (b) {
                n19 = 8388608;
            }
            else {
                n19 = 4194304;
            }
            n18 = (n16 | n19);
        }
        int n20 = n18;
        if ((0x6000000 & n3) == 0x0) {
            int n21;
            if (gva.h((Object)ye6)) {
                n21 = 67108864;
            }
            else {
                n21 = 33554432;
            }
            n20 = (n18 | n21);
        }
        if (gva.W(n20 & 0x1, (n20 & 0x2492493) != 0x2492492)) {
            gva.b0();
            if ((n3 & 0x1) != 0x0) {
                if (!gva.C()) {
                    gva.Z();
                }
            }
            gva.r();
            final float w0 = ((xc8)gva.j((sei)hm6.h)).w0(360.0f);
            final boolean b2 = gva.j((sei)hm6.n) == qzc.w;
            igf igf2;
            final fgf fgf = (fgf)(igf2 = (igf)fgf.v);
            if (kx8 != null) {
                igf2 = zrn.F((igf)fgf, (lta)new rqf(kx8, b2, (byte)1));
            }
            final igf e = zrn.F(b.t(igf, 240.0f, 0.0f, 360.0f, 10), (lta)new qqf(tia, w0, b2, (byte)1)).E(igf2).E((igf)b.b);
            final ye6 t0 = uuj.t0(-315420087, (aua)new oqf(kx8, b2, tia, w0, d1q, ye6), gva);
            final int n22 = n20 >> 6;
            a6n.a(e, aql, n, n2, 0.0f, 0.0f, null, (zta)t0, gva, (n22 & 0x70) | 0xC00000 | (n22 & 0x380) | (n22 & 0x1C00) | (n22 & 0xE000), 96);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new pqf(kx8, d1q, igf, aql, n, n2, tia, ye6, n3);
        }
    }
    
    public static final void c(final nx8 nx8, final igf igf, aql l, final long n, final long n2, final d1q d1q, final ye6 ye6, final gva gva, final int n3) {
        gva.i0(-1620540727);
        int n5;
        if ((n3 & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)nx8)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n3);
        }
        else {
            n5 = n3;
        }
        int n6 = n5;
        if ((n3 & 0x30) == 0x0) {
            int n7;
            if (gva.f((Object)igf)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n3 & 0x180) == 0x0) {
            n8 = (n6 | 0x80);
        }
        int n9 = n8;
        if ((n3 & 0xC00) == 0x0) {
            int n10;
            if (gva.e(n)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n8 | n10);
        }
        int n11 = n9;
        if ((n3 & 0x6000) == 0x0) {
            int n12;
            if (gva.e(n2)) {
                n12 = 16384;
            }
            else {
                n12 = 8192;
            }
            n11 = (n9 | n12);
        }
        final int n13 = n11 | 0x30000;
        int n15;
        if ((0x180000 & n3) == 0x0) {
            int n14;
            if (gva.f((Object)d1q)) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n15 = (n13 | n14);
        }
        else {
            n15 = n13;
        }
        int n16 = n15;
        if ((0xC00000 & n3) == 0x0) {
            int n17;
            if (gva.h((Object)ye6)) {
                n17 = 8388608;
            }
            else {
                n17 = 4194304;
            }
            n16 = (n15 | n17);
        }
        if (gva.W(n16 & 0x1, (0x492493 & n16) != 0x492492)) {
            gva.b0();
            int n18;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n18 = (n16 & 0xFFFFFC7F);
            }
            else {
                l = vt4.L(8, gva);
                n18 = (n16 & 0xFFFFFC7F);
            }
            gva.r();
            a(nx8, uuj.t0(797187326, (aua)new vqf(d1q, igf, l, n, n2, nx8, ye6), gva), gva, (n18 & 0xE) | 0x30);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new mqf(nx8, igf, l, n, n2, d1q, ye6, n3);
        }
    }
    
    public static final void d(final ye6 ye6, igf igf, final nx8 nx8, final boolean b, long b2, final ye6 ye7, final gva gva, final int n) {
        final Integer value = 6;
        gva.i0(-1907430816);
        int n2;
        if (gva.f((Object)nx8)) {
            n2 = 256;
        }
        else {
            n2 = 128;
        }
        int n3;
        if (gva.g(b)) {
            n3 = 2048;
        }
        else {
            n3 = 1024;
        }
        final int n4 = n | 0x30 | n2 | n3 | 0x2000;
        if (gva.W(n4 & 0x1, (0x12493 & n4) != 0x12492)) {
            gva.b0();
            final Object v = fgf.v;
            int n5;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n5 = (n4 & 0xFFFF1FFF);
            }
            else {
                b2 = j86.b(0.32f, s86.d(29, gva));
                n5 = (n4 & 0xFFFF1FFF);
                igf = (igf)v;
            }
            gva.r();
            final Object r = gva.R();
            final cib a = bi6.a;
            Object z = r;
            if (r == a) {
                z = mlc.z((hc7)o89.v, gva);
                gva.q0(z);
            }
            final oc7 oc7 = (oc7)z;
            final String d = twl.D(2131757666, gva);
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            Object o;
            if ((o = gva.R()) == a) {
                o = o50.Q((Object)Boolean.FALSE);
                gva.q0(o);
            }
            final bnf bnf = (bnf)o;
            final boolean f = gva.f((Object)xc8);
            final Object r2 = gva.R();
            gsg gsg;
            if (f || (gsg = (gsg)r2) == a) {
                gsg = new gsg(0.0f);
                gva.q0((Object)gsg);
            }
            final gsg gsg2 = gsg;
            Object o2;
            if ((o2 = gva.R()) == a) {
                o2 = oz1.f(gva);
            }
            final xma xma = (xma)o2;
            final ygm x = zrn.X(0, gva);
            final ygm x2 = zrn.X(0, gva);
            final ygm x3 = zrn.X(4, gva);
            final int n6 = (n5 & 0x380) ^ 0x180;
            final boolean b3 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final boolean f2 = gva.f((Object)xc8);
            final boolean h = gva.h((Object)x2);
            final boolean h2 = gva.h((Object)x3);
            final boolean h3 = gva.h((Object)x);
            Object r3 = gva.R();
            if ((b3 | f2 | h | h2 | h3) || r3 == a) {
                r3 = new ng4(nx8, xc8, x2, x3, x);
                gva.q0(r3);
            }
            mlc.l((jta)r3, gva);
            final boolean c = nx8.c();
            final boolean b4 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final Object r4 = gva.R();
            Object o3;
            if (b4 || (o3 = r4) == a) {
                o3 = new rf0(nx8, xma, null, (byte)18);
                gva.q0(o3);
            }
            mlc.f((zta)o3, gva, (Object)c);
            final igf j = ri2.j(igf.E((igf)b.c), nx8.b, gva.j((sei)hm6.n) == qzc.w, zhg.w, b, 112);
            final mb2 x4 = wab.x;
            final moe c2 = rj2.c((gx)x4, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b5 = ien.B(gva, j);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n7 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n7);
            }
            else {
                gva.t0();
            }
            final rg6 a2 = awp.A;
            k8e.P((zta)a2, gva, (Object)c2);
            final rg6 z2 = awp.z;
            k8e.P((zta)z2, gva, (Object)l);
            final rg6 b6 = awp.B;
            k8e.P((zta)b6, gva, (Object)hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, (Object)b5);
            final moe c3 = rj2.c((gx)x4, false);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b7 = ien.B(gva, (igf)v);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n7);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, (Object)c3);
            k8e.P((zta)z2, gva, (Object)i);
            oz1.v(hashCode2, gva, b6, gva);
            k8e.P((zta)y, gva, (Object)b7);
            ye7.d((Object)gva, (Object)value);
            gva.q(true);
            final boolean b8 = (n5 & 0x1C00) == 0x800;
            final boolean b9 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final boolean h4 = gva.h((Object)oc7);
            Object r5 = gva.R();
            if ((b8 | b9 | h4) || r5 == a) {
                r5 = new gp6(b, (Object)nx8, (Object)oc7, (byte)2);
                gva.q0(r5);
            }
            jta jta = (jta)r5;
            final String d2 = twl.D(2131756499, gva);
            if (!nx8.c()) {
                jta = null;
            }
            final boolean f3 = gva.f((Object)gsg2);
            final boolean b10 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final Object r6 = gva.R();
            Object o4;
            if ((f3 | b10) || (o4 = r6) == a) {
                o4 = new nob((Object)nx8, (Object)gsg2, (byte)16);
                gva.q0(o4);
            }
            ach.q(d2, null, jta, (jta)o4, b2, gva, 0);
            final boolean b11 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final Object r7 = gva.R();
            Object o5;
            if (b11 || (o5 = r7) == a) {
                o5 = new p8a((Object)nx8, (byte)19);
                gva.q0(o5);
            }
            final igf k = r9n.L((igf)v, (lta)o5);
            final boolean f4 = gva.f((Object)d);
            final boolean b12 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final boolean h5 = gva.h((Object)oc7);
            final Object r8 = gva.R();
            Object o6;
            if ((b12 | f4 | h5) || (o6 = r8) == a) {
                o6 = new rx1((Object)d, (Object)nx8, (Object)oc7, (byte)19);
                gva.q0(o6);
            }
            final igf b13 = wsk.b((lta)o6, k, false);
            final boolean b14 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final boolean h6 = gva.h((Object)oc7);
            final Object r9 = gva.R();
            Object o7;
            if ((h6 | b14) || (o7 = r9) == a) {
                o7 = new n90(nx8, oc7, (byte)7);
                gva.q0(o7);
            }
            final igf g0 = uuj.g0(rml.E(b13, (lta)o7), xma);
            final boolean b15 = (n6 > 256 && gva.f((Object)nx8)) || (n5 & 0x180) == 0x100;
            final boolean f5 = gva.f((Object)gsg2);
            final Object r10 = gva.R();
            Object o8;
            if ((f5 | b15) || (o8 = r10) == a) {
                o8 = new zqf(nx8, bnf, gsg2);
                gva.q0(o8);
            }
            final moe moe = (moe)o8;
            final int hashCode3 = Long.hashCode(gva.T);
            final e3h m = gva.l();
            final igf b16 = ien.B(gva, g0);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n7);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, (Object)moe);
            k8e.P((zta)z2, gva, (Object)m);
            oz1.v(hashCode3, gva, b6, gva);
            k8e.P((zta)y, gva, (Object)b16);
            ye6.d((Object)gva, (Object)value);
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new uqf(ye6, igf, nx8, b, b2, ye7, n);
        }
    }
    
    public static final void e(final ye6 ye6, final boolean b, final jta jta, final igf igf, final zta zta, aql l, final e48 e48, final gva gva, final int n) {
        gva.i0(-583709666);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)ye6)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.g(b)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.h((Object)jta)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        int n7 = n4;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.f((Object)igf)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n4 | n8);
        }
        int n9 = n7;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.h((Object)zta)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n9 = (n7 | n10);
        }
        int n11 = 0x30000 | n9;
        if ((0x180000 & n) == 0x0) {
            n11 = (0xB0000 | n9);
        }
        int n12 = n11;
        if ((0xC00000 & n) == 0x0) {
            int n13;
            if (gva.f((Object)e48)) {
                n13 = 8388608;
            }
            else {
                n13 = 4194304;
            }
            n12 = (n11 | n13);
        }
        final int n14 = 0x6000000 | n12;
        if (gva.W(n14 & 0x1, (0x2492493 & n14) != 0x2492492)) {
            gva.b0();
            int n15;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n15 = (n14 & 0xFFC7FFFF);
            }
            else {
                l = vt4.L(6, gva);
                n15 = (n14 & 0xFFC7FFFF);
            }
            gva.r();
            Object r;
            if ((r = gva.R()) == bi6.a) {
                r = new gfe((byte)12);
                gva.q0(r);
            }
            final igf d = b.d(b.h(wsk.b((lta)r, igf, false), 56.0f, 0.0f, 2), 1.0f);
            gva.g0(-433512770);
            long n16;
            if (b) {
                n16 = e48.e;
            }
            else {
                n16 = e48.f;
            }
            final bnf w = o50.W((Object)new j86(n16), gva);
            gva.q(false);
            a6n.b(b, jta, d, false, l, ((j86)((xom)w).getValue()).a, 0L, 0.0f, null, null, uuj.t0(-1173018444, (aua)new sqf(zta, e48, b, ye6), gva), gva, n15 >> 3 & 0x7E, 968);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new tqf(ye6, b, jta, igf, zta, l, e48, n);
        }
    }
    
    public static final float f(final jqj jqj, final kx8 kx8) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(jqj.K >> 32));
        if (!Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
            int n;
            if (kx8.a()) {
                n = 1;
            }
            else {
                n = -1;
            }
            return kx8.b.h() * n / intBitsToFloat + 1.0f;
        }
        return 1.0f;
    }
    
    public static final float g(final jqj jqj, final kx8 kx8) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(jqj.K & 0xFFFFFFFFL));
        final boolean naN = Float.isNaN(intBitsToFloat);
        float n = 1.0f;
        if (!naN) {
            if (intBitsToFloat == 0.0f) {
                n = n;
            }
            else {
                n = 1.0f - kx8.c.h() / intBitsToFloat;
            }
        }
        return n;
    }
    
    public static final nx8 h(final gva gva) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object o = r;
        if (r == a) {
            o = new yp7((byte)22);
            gva.q0(o);
        }
        final lta lta = (lta)o;
        final n9k n9k = new n9k((lta)new mv2(lta, (byte)5), (zta)new rg6((byte)12));
        final boolean f = gva.f((Object)lta);
        final Object r2 = gva.R();
        Object o2;
        if (f || (o2 = r2) == a) {
            o2 = new lce((Object)lta, (byte)3);
            gva.q0(o2);
        }
        return (nx8)mlc.b0(new Object[0], (m9k)n9k, (jta)o2, gva, 0);
    }
}
