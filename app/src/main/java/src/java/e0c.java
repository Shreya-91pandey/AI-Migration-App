import androidx.compose.ui.draw.a;
import androidx.compose.foundation.layout.b;

public abstract class e0c
{
    public static final igf a;
    
    static {
        a = b.p((igf)fgf.v, 24.0f);
    }
    
    public static final void a(final o4c o4c, final String s, igf v, long a, final gva gva, final int n, final int n2) {
        gva.i0(-126890956);
        int n3;
        if (gva.f((Object)o4c)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n5;
        final int n4 = n5 = (n | n3);
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.f((Object)s)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        final int n7 = n2 & 0x4;
        int n8;
        if (n7 != 0) {
            n8 = (n5 | 0x180);
        }
        else {
            int n9;
            if (gva.f((Object)v)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n5 | n9);
        }
        int n10;
        if ((n2 & 0x8) == 0x0 && gva.e(a)) {
            n10 = 2048;
        }
        else {
            n10 = 1024;
        }
        final int n11 = n8 | n10;
        if (gva.W(n11 & 0x1, (n11 & 0x493) != 0x492)) {
            gva.b0();
            int n12;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n12 = n11;
                if ((n2 & 0x8) != 0x0) {
                    n12 = (n11 & 0xFFFFE3FF);
                }
            }
            else {
                if (n7 != 0) {
                    v = (igf)fgf.v;
                }
                if ((n2 & 0x8) != 0x0) {
                    a = ((j86)gva.j((sei)dx6.a)).a;
                    n12 = (n11 & 0xFFFFE3FF);
                }
                else {
                    n12 = n11;
                }
            }
            gva.r();
            b((xog)ljq.T(o4c, gva), s, v, a, gva, (n12 & 0x70) | 0x8 | (n12 & 0x380) | (n12 & 0x1C00), 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new c0c(o4c, s, v, a, n, n2);
        }
    }
    
    public static final void b(final xog xog, final String s, igf b, long n, final gva gva, final int n2, final int n3) {
        gva.i0(-2142239481);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            boolean b2;
            if ((n2 & 0x8) == 0x0) {
                b2 = gva.f((Object)xog);
            }
            else {
                b2 = gva.h((Object)xog);
            }
            int n4;
            if (b2) {
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
        int n6 = n5;
        if ((n2 & 0x30) == 0x0) {
            int n7;
            if (gva.f((Object)s)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        final int n8 = n3 & 0x4;
        int n11 = 0;
        Label_0178: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x180);
            }
            else {
                n9 = n6;
                if ((n2 & 0x180) == 0x0) {
                    int n10;
                    if (gva.f((Object)b)) {
                        n10 = 256;
                    }
                    else {
                        n10 = 128;
                    }
                    n11 = (n6 | n10);
                    break Label_0178;
                }
            }
            n11 = n9;
        }
        if ((n2 & 0xC00) == 0x0) {
            int n12;
            if ((n3 & 0x8) == 0x0 && gva.e(n)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n11 |= n12;
        }
        if (gva.W(n11 & 0x1, (n11 & 0x493) != 0x492)) {
            gva.b0();
            final Object v = fgf.v;
            int n13 = 0;
            igf igf = null;
            long n14 = 0L;
            Label_0327: {
                if ((n2 & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                    n13 = n11;
                    igf = b;
                    n14 = n;
                    if ((n3 & 0x8) == 0x0) {
                        break Label_0327;
                    }
                }
                else {
                    if (n8 != 0) {
                        b = (igf)v;
                    }
                    n13 = n11;
                    igf = b;
                    n14 = n;
                    if ((n3 & 0x8) == 0x0) {
                        break Label_0327;
                    }
                    n = ((j86)gva.j((sei)dx6.a)).a;
                }
                n13 = (n11 & 0xFFFFE3FF);
                n14 = n;
                igf = b;
            }
            gva.r();
            final boolean b3 = (((n13 & 0x1C00) ^ 0xC00) > 2048 && gva.e(n14)) || (n13 & 0xC00) == 0x800;
            Object r = gva.R();
            final cib a = bi6.a;
            if (b3 || r == a) {
                if (foo.a(n14, j86.h)) {
                    r = null;
                }
                else {
                    r = new he2(n14, 5);
                }
                gva.q0(r);
            }
            final he2 he2 = (he2)r;
            if (s != null) {
                gva.g0(-537002883);
                final boolean b4 = (n13 & 0x70) == 0x20;
                final Object r2 = gva.R();
                Object o;
                if (b4 || (o = r2) == a) {
                    o = new jy4(s, (byte)4);
                    gva.q0(o);
                }
                b = wsk.b((lta)o, (igf)v, false);
                gva.q(false);
            }
            else {
                gva.g0(-536844101);
                gva.q(false);
                b = (igf)v;
            }
            igf a2 = null;
            Label_0657: {
                if (!yzl.b(xog.i(), 9205357640488583168L)) {
                    n = xog.i();
                    a2 = (igf)v;
                    if (!Float.isInfinite(Float.intBitsToFloat((int)(n >> 32)))) {
                        break Label_0657;
                    }
                    a2 = (igf)v;
                    if (!Float.isInfinite(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)))) {
                        break Label_0657;
                    }
                }
                a2 = e0c.a;
            }
            rj2.a(androidx.compose.ui.draw.a.a(igf.E(a2), xog, (gx)null, (by6)zx6.b, 0.0f, he2, 22).E(b), gva, 0);
            b = igf;
            n = n14;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new d0c(xog, s, b, n, n2, n3);
        }
    }
}
