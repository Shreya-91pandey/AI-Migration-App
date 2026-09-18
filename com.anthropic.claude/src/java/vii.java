import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.layout.b;

public final class vii
{
    public static final vii a;
    public static final nvj b;
    public static final float c;
    public static final float d;
    public static final float e;
    
    static {
        a = (vii)new Object();
        b = ovj.a;
        c = 80.0f;
        d = 80.0f;
        e = 3.0f;
    }
    
    public final void a(final dji dji, final boolean b, final igf igf, long s, long g, float d, final gva gva, final int n) {
        gva.i0(-1076870256);
        int n2;
        if (gva.f(dji)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.g(b)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f(igf)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n | n2 | n3 | n4 | 0x12400;
        if (gva.W(n5 & 0x1, (0x92493 & n5) != 0x92492)) {
            gva.b0();
            int n6;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n6 = (n5 & 0xFFF803FF);
                final long n7 = s;
                s = g;
                g = n7;
            }
            else {
                final b09 a = h8e.a;
                g = ((e8e)gva.j(a)).a.G;
                s = ((e8e)gva.j(a)).a.s;
                n6 = (n5 & 0xFFF803FF);
                d = vii.d;
            }
            gva.r();
            this.b(dji, b, igf, d, null, g, 0.0f, uuj.t0(298232649, (aua)new oii(b, s, dji), gva), gva, (n6 & 0x380) | ((n6 & 0xE) | 0xC00000 | (n6 & 0x70)) | 0x6000000);
            final long n8 = s;
            s = g;
            g = n8;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new pii(this, dji, b, igf, s, g, d, n);
        }
    }
    
    public final void b(final dji dji, final boolean b, final igf igf, final float n, aql b2, final long n2, float e, final ye6 ye6, final gva gva, final int n3) {
        gva.i0(-1341144489);
        int n5;
        if ((n3 & 0x6) == 0x0) {
            int n4;
            if (gva.f(dji)) {
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
        if ((n3 & 0x30) == 0x0) {
            int n6;
            if (gva.g(b)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 |= n6;
        }
        int n7 = n5;
        if ((n3 & 0x180) == 0x0) {
            int n8;
            if (gva.f(igf)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n3 & 0xC00) == 0x0) {
            int n10;
            if (gva.c(n)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        int n11 = n9;
        if ((n3 & 0x6000) == 0x0) {
            n11 = (n9 | 0x2000);
        }
        int n12 = n11;
        if ((0x30000 & n3) == 0x0) {
            int n13;
            if (gva.e(n2)) {
                n13 = 131072;
            }
            else {
                n13 = 65536;
            }
            n12 = (n11 | n13);
        }
        int n14 = n12;
        if ((0x180000 & n3) == 0x0) {
            n14 = (n12 | 0x80000);
        }
        int n15 = n14;
        if ((0xC00000 & n3) == 0x0) {
            int n16;
            if (gva.h(ye6)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n14 | n16);
        }
        if ((0x6000000 & n3) == 0x0) {
            int n17;
            if (gva.f(this)) {
                n17 = 67108864;
            }
            else {
                n17 = 33554432;
            }
            n15 |= n17;
        }
        if (gva.W(n15 & 0x1, (0x2492493 & n15) != 0x2492492)) {
            gva.b0();
            int n18;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n18 = (n15 & 0xFFC71FFF);
            }
            else {
                n18 = (n15 & 0xFFC71FFF);
                b2 = (aql)vii.b;
                e = vii.e;
            }
            gva.r();
            final igf p10 = b.p(igf, 40.0f);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o = r;
            if (r == a) {
                o = new njh((byte)11);
                gva.q0(o);
            }
            final igf g = t08.G(p10, (lta)o);
            final boolean b3 = (n18 & 0xE) == 0x4;
            final boolean b4 = (n18 & 0x70) == 0x20;
            final boolean b5 = (((n18 & 0x1C00) ^ 0xC00) > 2048 && gva.c(n)) || (n18 & 0xC00) == 0x800;
            final boolean c = gva.c(e);
            final boolean f = gva.f(b2);
            Object r2 = gva.R();
            if ((b4 | b3 | b5 | c | f) || r2 == a) {
                r2 = new rii(dji, b, n, e, b2);
                gva.q0(r2);
            }
            final igf h = rhc.h(lq6.W(g, (bua)r2), n2, b2);
            final moe c2 = rj2.c((gx)wab.B, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b6 = ien.B(gva, h);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c2);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b6);
            ye6.h((Object)dk2.a, (Object)gva, (Object)((((n18 >> 12 & 0x1C00) | 0x30) >> 6 & 0x70) | 0x6));
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new sii(this, dji, b, igf, n, b2, n2, e, ye6, n3);
        }
    }
}
