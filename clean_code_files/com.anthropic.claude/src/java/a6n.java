public abstract class a6n
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new s8k((byte)23), (byte)0);
    }
    
    public static final void a(igf v, aql k, long p11, long b, float n, float n2, bi2 bi2, final zta zta, final gva gva, final int n3, final int n4) {
        if ((n4 & 0x1) != 0x0) {
            v = (igf)fgf.v;
        }
        if ((n4 & 0x2) != 0x0) {
            k = (aql)zn2.k;
        }
        if ((n4 & 0x4) != 0x0) {
            p11 = ((e8e)gva.j((sei)h8e.a)).a.p;
        }
        if ((n4 & 0x8) != 0x0) {
            b = s86.b(p11, gva);
        }
        if ((n4 & 0x10) != 0x0) {
            n = 0.0f;
        }
        if ((n4 & 0x20) != 0x0) {
            n2 = 0.0f;
        }
        if ((n4 & 0x40) != 0x0) {
            bi2 = null;
        }
        final b09 a = a6n.a;
        n += ((qs8)gva.j((sei)a)).v;
        c5q.d(new ffi[] { ge9.n(b, dx6.a), a.a((Object)new qs8(n)) }, (zta)uuj.t0(421772006, (aua)new z5n(v, k, p11, n, bi2, n2, zta), gva), gva, 56);
    }
    
    public static final void b(final boolean b, final jta jta, final igf igf, boolean b2, final aql aql, final long n, long b3, float n2, final bi2 bi2, final llf llf, final ye6 ye6, final gva gva, final int n3, final int n4) {
        if ((n4 & 0x8) != 0x0) {
            b2 = true;
        }
        if ((n4 & 0x40) != 0x0) {
            b3 = s86.b(n, gva);
        }
        if ((n4 & 0x100) != 0x0) {
            n2 = 0.0f;
        }
        final llf llf2 = null;
        bi2 bi3;
        if ((n4 & 0x200) != 0x0) {
            bi3 = null;
        }
        else {
            bi3 = bi2;
        }
        llf llf3;
        if ((n4 & 0x400) != 0x0) {
            llf3 = llf2;
        }
        else {
            llf3 = llf;
        }
        if (llf3 == null) {
            gva.g0(1528105640);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = oz1.g(gva);
            }
            llf3 = (llf)o;
        }
        else {
            gva.g0(-227801585);
        }
        gva.q(false);
        final b09 a = a6n.a;
        final float n5 = ((qs8)gva.j((sei)a)).v + 0.0f;
        c5q.d(new ffi[] { ge9.n(b3, dx6.a), a.a((Object)new qs8(n5)) }, (zta)uuj.t0(1508735219, (aua)new y5n(igf, llf3, aql, n, n5, bi3, b, b2, jta, n2, ye6), gva), gva, 56);
    }
    
    public static final void c(final jta jta, final igf igf, boolean b, final aql aql, final long n, long b2, float n2, float n3, bi2 bi2, final llf llf, final ye6 ye6, final gva gva, final int n4, final int n5) {
        Object v;
        if ((n5 & 0x2) != 0x0) {
            v = fgf.v;
        }
        else {
            v = igf;
        }
        if ((n5 & 0x4) != 0x0) {
            b = true;
        }
        if ((n5 & 0x20) != 0x0) {
            b2 = s86.b(n, gva);
        }
        if ((n5 & 0x40) != 0x0) {
            n2 = 0.0f;
        }
        if ((n5 & 0x80) != 0x0) {
            n3 = 0.0f;
        }
        llf llf2 = null;
        if ((n5 & 0x100) != 0x0) {
            bi2 = null;
        }
        if ((n5 & 0x200) == 0x0) {
            llf2 = llf;
        }
        if (llf2 == null) {
            gva.g0(-1701074900);
            Object o;
            if ((o = gva.R()) == bi6.a) {
                o = oz1.g(gva);
            }
            llf2 = (llf)o;
        }
        else {
            gva.g0(2023335947);
        }
        gva.q(false);
        final b09 a = a6n.a;
        n2 += ((qs8)gva.j((sei)a)).v;
        c5q.d(new ffi[] { ge9.n(b2, dx6.a), a.a((Object)new qs8(n2)) }, (zta)uuj.t0(849208527, (aua)new x5n((igf)v, llf2, aql, n, n2, bi2, b, jta, n3, ye6), gva), gva, 56);
    }
    
    public static final igf d(igf m, final aql aql, final long n, final bi2 bi2, final float n2) {
        final Object v = fgf.v;
        igf g;
        if (n2 > 0.0f) {
            g = zrn.G((igf)v, 0.0f, 0.0f, 0.0f, n2, 0.0f, aql, false, 1042399);
        }
        else {
            g = (igf)v;
        }
        final igf e = m.E(g);
        m = (igf)v;
        if (bi2 != null) {
            m = zn2.m((igf)v, bi2.a, bi2.b, aql);
        }
        return rml.k(rhc.h(e.E(m), n, aql), aql);
    }
    
    public static final long e(final long n, final float n2, final gva gva) {
        final r86 a = ((e8e)gva.j((sei)h8e.a)).a;
        final boolean booleanValue = (boolean)gva.j((sei)s86.a);
        final long p3 = a.p;
        final int i = j86.i;
        long z = n;
        if (foo.a(n, p3)) {
            z = n;
            if (booleanValue) {
                if (qs8.e(n2, 0.0f)) {
                    return p3;
                }
                z = t08.z(j86.b(((float)Math.log((double)(n2 + 1.0f)) * 4.5f + 2.0f) / 100.0f, a.t), p3);
            }
        }
        return z;
    }
}
