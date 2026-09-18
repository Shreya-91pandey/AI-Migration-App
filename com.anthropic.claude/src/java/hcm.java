public final class hcm implements kg0
{
    public final oln a;
    public final long b;
    public final zoa c;
    public final soa d;
    public final toa e;
    public final una f;
    public final String g;
    public final long h;
    public final zw1 i;
    public final tln j;
    public final jpd k;
    public final long l;
    public final wgn m;
    public final rpl n;
    public final nbh o;
    public final dw8 p;
    
    public hcm(long h, long c, zoa zoa, soa soa, toa toa, una una, String s, long c2, zw1 zw1, tln tln, jpd jpd, long h2, wgn wgn, rpl rpl, final int n) {
        if ((n & 0x1) != 0x0) {
            h = j86.h;
        }
        if ((n & 0x2) != 0x0) {
            c = vnn.c;
        }
        if ((n & 0x4) != 0x0) {
            zoa = null;
        }
        if ((n & 0x8) != 0x0) {
            soa = null;
        }
        if ((n & 0x10) != 0x0) {
            toa = null;
        }
        if ((n & 0x20) != 0x0) {
            una = null;
        }
        if ((n & 0x40) != 0x0) {
            s = null;
        }
        if ((n & 0x80) != 0x0) {
            c2 = vnn.c;
        }
        if ((n & 0x100) != 0x0) {
            zw1 = null;
        }
        if ((n & 0x200) != 0x0) {
            tln = null;
        }
        if ((n & 0x400) != 0x0) {
            jpd = null;
        }
        if ((n & 0x800) != 0x0) {
            h2 = j86.h;
        }
        if ((n & 0x1000) != 0x0) {
            wgn = null;
        }
        if ((n & 0x2000) != 0x0) {
            rpl = null;
        }
        this(h, c, zoa, soa, toa, una, s, c2, zw1, tln, jpd, h2, wgn, rpl, null);
    }
    
    public hcm(final long n, final long n2, final zoa zoa, final soa soa, final toa toa, final una una, final String s, final long n3, final zw1 zw1, final tln tln, final jpd jpd, final long n4, final wgn wgn, final rpl rpl, final nbh nbh) {
        oln a;
        if (n != 16L) {
            a = new z86(n);
        }
        else {
            a = nln.a;
        }
        this(a, n2, zoa, soa, toa, una, s, n3, zw1, tln, jpd, n4, wgn, rpl, nbh, null);
    }
    
    public hcm(final oln a, final long b, final zoa c, final soa d, final toa e, final una f, final String g, final long h, final zw1 i, final tln j, final jpd k, final long l, final wgn m, final rpl n, final nbh o, final dw8 p16) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    public static hcm a(final hcm hcm, long b, int i) {
        if ((i & 0x1) != 0x0) {
            b = hcm.a.b();
        }
        final long b2 = hcm.b;
        final zoa c = hcm.c;
        final soa d = hcm.d;
        final toa e = hcm.e;
        una f;
        if ((i & 0x20) != 0x0) {
            f = hcm.f;
        }
        else {
            f = null;
        }
        final String g = hcm.g;
        final long h = hcm.h;
        final zw1 j = hcm.i;
        final tln k = hcm.j;
        final jpd l = hcm.k;
        final long m = hcm.l;
        final wgn m2 = hcm.m;
        final rpl n = hcm.n;
        final nbh o = hcm.o;
        final dw8 p3 = hcm.p;
        oln oln = hcm.a;
        final long b3 = oln.b();
        i = j86.i;
        if (!foo.a(b, b3)) {
            if (b != 16L) {
                oln = new z86(b);
            }
            else {
                oln = nln.a;
            }
        }
        return new hcm(oln, b2, c, d, e, f, g, h, j, k, l, m, m2, n, o, p3);
    }
    
    public final boolean b(final hcm hcm) {
        if (this != hcm) {
            if (vnn.a(this.b, hcm.b)) {
                if (mlc.q((Object)this.c, (Object)hcm.c)) {
                    if (mlc.q((Object)this.d, (Object)hcm.d)) {
                        if (mlc.q((Object)this.e, (Object)hcm.e)) {
                            if (mlc.q((Object)this.f, (Object)hcm.f)) {
                                if (mlc.q((Object)this.g, (Object)hcm.g)) {
                                    if (vnn.a(this.h, hcm.h)) {
                                        if (mlc.q((Object)this.i, (Object)hcm.i)) {
                                            if (mlc.q((Object)this.j, (Object)hcm.j)) {
                                                if (mlc.q((Object)this.k, (Object)hcm.k)) {
                                                    final long l = hcm.l;
                                                    final int i = j86.i;
                                                    if (foo.a(this.l, l)) {
                                                        if (mlc.q((Object)this.o, (Object)hcm.o)) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean c(final hcm hcm) {
        return mlc.q((Object)this.a, (Object)hcm.a) && mlc.q((Object)this.m, (Object)hcm.m) && mlc.q((Object)this.n, (Object)hcm.n) && mlc.q((Object)this.p, (Object)hcm.p);
    }
    
    public final hcm d(final hcm hcm) {
        if (hcm == null) {
            return this;
        }
        final oln a = hcm.a;
        return icm.a(this, a.b(), a.c(), a.a(), hcm.b, hcm.c, hcm.d, hcm.e, hcm.f, hcm.g, hcm.h, hcm.i, hcm.j, hcm.k, hcm.l, hcm.m, hcm.n, hcm.o, hcm.p);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hcm)) {
            return false;
        }
        final hcm hcm = (hcm)o;
        return this.b(hcm) && this.c(hcm);
    }
    
    @Override
    public final int hashCode() {
        final oln a = this.a;
        final long b = a.b();
        final int i = j86.i;
        final int hashCode = Long.hashCode(b);
        final qm2 c = a.c();
        final int n = 0;
        int hashCode2;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int hashCode3 = Float.hashCode(a.a());
        final wnn[] b2 = vnn.b;
        final int d = hia.d((hashCode3 + (hashCode * 31 + hashCode2) * 31) * 31, this.b, 31);
        final zoa c2 = this.c;
        int v;
        if (c2 != null) {
            v = c2.v;
        }
        else {
            v = 0;
        }
        final soa d2 = this.d;
        int hashCode4;
        if (d2 != null) {
            hashCode4 = Integer.hashCode(d2.a);
        }
        else {
            hashCode4 = 0;
        }
        final toa e = this.e;
        int hashCode5;
        if (e != null) {
            hashCode5 = Integer.hashCode(e.a);
        }
        else {
            hashCode5 = 0;
        }
        final una f = this.f;
        int hashCode6;
        if (f != null) {
            hashCode6 = f.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final String g = this.g;
        int hashCode7;
        if (g != null) {
            hashCode7 = g.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int d3 = hia.d((((((d + v) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31, this.h, 31);
        final zw1 j = this.i;
        int hashCode8;
        if (j != null) {
            hashCode8 = Float.hashCode(j.a);
        }
        else {
            hashCode8 = 0;
        }
        final tln k = this.j;
        int hashCode9;
        if (k != null) {
            hashCode9 = k.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final jpd l = this.k;
        int hashCode10;
        if (l != null) {
            hashCode10 = l.v.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int d4 = hia.d((((d3 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31, this.l, 31);
        final wgn m = this.m;
        int a2;
        if (m != null) {
            a2 = m.a;
        }
        else {
            a2 = 0;
        }
        final rpl n2 = this.n;
        int hashCode11;
        if (n2 != null) {
            hashCode11 = n2.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final nbh o = this.o;
        int hashCode12;
        if (o != null) {
            hashCode12 = o.hashCode();
        }
        else {
            hashCode12 = 0;
        }
        final dw8 p = this.p;
        int hashCode13 = n;
        if (p != null) {
            hashCode13 = p.hashCode();
        }
        return (((d4 + a2) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13;
    }
    
    @Override
    public final String toString() {
        final oln a = this.a;
        final String h = j86.h(a.b());
        final qm2 c = a.c();
        final float a2 = a.a();
        final String f = vnn.f(this.b);
        final String f2 = vnn.f(this.h);
        final String h2 = j86.h(this.l);
        final StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(h);
        sb.append(", brush=");
        sb.append((Object)c);
        sb.append(", alpha=");
        sb.append(a2);
        sb.append(", fontSize=");
        sb.append(f);
        sb.append(", fontWeight=");
        sb.append((Object)this.c);
        sb.append(", fontStyle=");
        sb.append((Object)this.d);
        sb.append(", fontSynthesis=");
        sb.append((Object)this.e);
        sb.append(", fontFamily=");
        sb.append((Object)this.f);
        sb.append(", fontFeatureSettings=");
        oz1.A(sb, this.g, ", letterSpacing=", f2, ", baselineShift=");
        sb.append((Object)this.i);
        sb.append(", textGeometricTransform=");
        sb.append((Object)this.j);
        sb.append(", localeList=");
        sb.append((Object)this.k);
        sb.append(", background=");
        sb.append(h2);
        sb.append(", textDecoration=");
        sb.append((Object)this.m);
        sb.append(", shadow=");
        sb.append((Object)this.n);
        sb.append(", platformStyle=");
        sb.append((Object)this.o);
        sb.append(", drawStyle=");
        sb.append((Object)this.p);
        sb.append(")");
        return sb.toString();
    }
}
