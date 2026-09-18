public abstract class icm
{
    public static final long a;
    public static final long b;
    public static final long c;
    public static final oln d;
    
    static {
        a = tsf.K(14);
        b = tsf.K(0);
        c = j86.g;
        final long b2 = j86.b;
        oln a2;
        if (b2 != 16L) {
            a2 = new z86(b2);
        }
        else {
            a2 = nln.a;
        }
        d = a2;
    }
    
    public static final hcm a(final hcm hcm, long n, final qm2 qm2, final float n2, long h, zoa c, soa d, final toa toa, final una una, final String s, long l, final zw1 zw1, final tln tln, final jpd jpd, final long n3, final wgn wgn, final rpl rpl, final nbh nbh, final dw8 dw8) {
        final wnn[] b = vnn.b;
        final long n4 = lcmp(h & 0xFF00000000L, 0L);
        Label_0079: {
            if (n4 != 0) {
                if (!vnn.a(h, hcm.b)) {
                    break Label_0079;
                }
            }
            if (qm2 == null && n != 16L) {
                final long b2 = hcm.a.b();
                final int i = j86.i;
                if (!foo.a(n, b2)) {
                    break Label_0079;
                }
            }
            if ((d == null || d.equals(hcm.d)) && (c == null || c.equals(hcm.c)) && (una == null || una == hcm.f)) {
                if ((l & 0xFF00000000L) != 0x0L) {
                    if (!vnn.a(l, hcm.h)) {
                        break Label_0079;
                    }
                }
                if ((wgn == null || wgn.equals(hcm.m)) && mlc.q((Object)qm2, (Object)hcm.a.c()) && (qm2 == null || n2 == hcm.a.a()) && (toa == null || toa.equals(hcm.e)) && (s == null || s.equals(hcm.g)) && (zw1 == null || zw1.equals(hcm.i)) && (tln == null || tln.equals(hcm.j))) {
                    if (jpd != null) {
                        if (!jpd.equals(hcm.k)) {
                            break Label_0079;
                        }
                    }
                    if (n3 != 16L) {
                        final long j = hcm.l;
                        final int k = j86.i;
                        if (!foo.a(n3, j)) {
                            break Label_0079;
                        }
                    }
                    if ((rpl == null || rpl.equals((Object)hcm.n)) && (nbh == null || nbh.equals(hcm.o))) {
                        if (dw8 == null || dw8.equals(hcm.p)) {
                            return hcm;
                        }
                    }
                }
            }
        }
        final nln a = nln.a;
        oln oln = null;
        Label_0492: {
            if (qm2 != null) {
                if (qm2 instanceof cam) {
                    n = nsk.z(n2, ((cam)qm2).a);
                    if (n != 16L) {
                        oln = new z86(n);
                        break Label_0492;
                    }
                }
                else {
                    if (qm2 instanceof opl) {
                        oln = new sm2((opl)qm2, n2);
                        break Label_0492;
                    }
                    en9.r();
                    return null;
                }
            }
            else if (n != 16L) {
                oln = new z86(n);
                break Label_0492;
            }
            oln = a;
        }
        final oln a2 = hcm.a;
        a2.getClass();
        final boolean b3 = oln instanceof sm2;
        if (b3 && a2 instanceof sm2) {
            final sm2 sm2 = (sm2)oln;
            oln = new sm2(sm2.a, nsk.n(sm2.b, new wfk((Object)a2, (byte)16)));
        }
        else if (!b3 || a2 instanceof sm2) {
            if ((!b3 && a2 instanceof sm2) || oln.equals(a)) {
                oln = a2;
            }
        }
        una f;
        if ((f = una) == null) {
            f = hcm.f;
        }
        if (n4 == 0) {
            n = hcm.b;
        }
        else {
            n = h;
        }
        if (c == null) {
            c = hcm.c;
        }
        if (d == null) {
            d = hcm.d;
        }
        toa e;
        if ((e = toa) == null) {
            e = hcm.e;
        }
        String g;
        if ((g = s) == null) {
            g = hcm.g;
        }
        h = l;
        if ((l & 0xFF00000000L) == 0x0L) {
            h = hcm.h;
        }
        zw1 m;
        if ((m = zw1) == null) {
            m = hcm.i;
        }
        tln j2;
        if (tln == null) {
            j2 = hcm.j;
        }
        else {
            j2 = tln;
        }
        jpd k2;
        if (jpd == null) {
            k2 = hcm.k;
        }
        else {
            k2 = jpd;
        }
        if (n3 != 16L) {
            l = n3;
        }
        else {
            l = hcm.l;
        }
        wgn m2;
        if (wgn == null) {
            m2 = hcm.m;
        }
        else {
            m2 = wgn;
        }
        rpl n5;
        if (rpl == null) {
            n5 = hcm.n;
        }
        else {
            n5 = rpl;
        }
        nbh o;
        if ((o = hcm.o) == null) {
            o = nbh;
        }
        dw8 p19;
        if ((p19 = dw8) == null) {
            p19 = hcm.p;
        }
        return new hcm(oln, n, c, d, e, f, g, h, m, j2, k2, l, m2, n5, o, p19);
    }
    
    public static final Object b(final Object o, final Object o2, final float n) {
        if (n < 0.5) {
            return o;
        }
        return o2;
    }
    
    public static final long c(final float n, final long n2, final long n3) {
        final wnn[] b = vnn.b;
        final long n4 = n2 & 0xFF00000000L;
        if (n4 != 0L) {
            if ((0xFF00000000L & n3) != 0x0L) {
                tsf.t(n2, n3);
                return tsf.Q(vt4.T(vnn.c(n2), vnn.c(n3), n), n4);
            }
        }
        return ((vnn)b(new vnn(n2), new vnn(n3), n)).a;
    }
}
