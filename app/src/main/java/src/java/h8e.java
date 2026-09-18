import androidx.compose.material3.c;

public abstract class h8e
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new v0e((byte)5), (byte)1);
    }
    
    public static final void a(final r86 r86, final xhf xhf, final eql eql, final tno tno, final zta zta, final gva gva, final int n) {
        gva.i0(904511636);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)r86)) {
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
            if (gva.f((Object)xhf)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)eql)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)tno)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.h((Object)zta)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            gva.b0();
            if ((n & 0x1) != 0x0) {
                if (!gva.C()) {
                    gva.Z();
                }
            }
            gva.r();
            final e8e e8e = new e8e(r86, tno, eql, xhf);
            final c a = utj.a(false, 0.0f, 0L, null, 255);
            final long a2 = r86.a;
            final boolean e = gva.e(a2);
            final Object r87 = gva.R();
            gnn gnn;
            if (e || (gnn = (gnn)r87) == bi6.a) {
                gnn = new gnn(a2, j86.b(0.4f, a2));
                gva.q0((Object)gnn);
            }
            c5q.d(new ffi[] { h8e.a.a((Object)e8e), w7c.a.a((Object)a), hnn.a.a((Object)gnn) }, (zta)uuj.t0(-1750539308, (aua)new g8e(tno, zta, (byte)0), gva), gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new gf0((Object)r86, (Object)xhf, (Object)eql, (Object)tno, (Object)zta, n, (byte)3);
        }
    }
    
    public static final void b(final r86 r86, eql eql, final tno tno, final zta zta, final gva gva, final int n, final int n2) {
        gva.i0(-449719819);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if ((n2 & 0x1) == 0x0 && gva.f((Object)r86)) {
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
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            n5 = (n4 | 0x10);
        }
        int n6 = n5;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)tno)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)zta)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        r86 r87;
        if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
            gva.b0();
            final b09 a = h8e.a;
            int n11;
            eql c;
            r86 a2;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n10 = n8;
                if ((n2 & 0x1) != 0x0) {
                    n10 = (n8 & 0xFFFFFFF1);
                }
                n11 = (n10 & 0xFFFFFF8F);
                c = eql;
                a2 = r86;
            }
            else {
                if ((n2 & 0x1) != 0x0) {
                    a2 = ((e8e)gva.j((sei)a)).a;
                    n8 &= 0xFFFFFFF1;
                }
                else {
                    a2 = r86;
                }
                c = ((e8e)gva.j((sei)a)).c;
                n11 = (n8 & 0xFFFFFF8F);
            }
            gva.r();
            final xhf d = ((e8e)gva.j((sei)a)).d;
            final int n12 = n11 << 3;
            a(a2, d, c, tno, zta, gva, (n12 & 0xE000) | ((n11 & 0xE) | (n12 & 0x1C00)));
            r87 = a2;
            eql = c;
        }
        else {
            gva.Z();
            r87 = r86;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new f8e((Object)r87, (Object)eql, (Object)tno, zta, n, n2, (byte)0);
        }
    }
}
