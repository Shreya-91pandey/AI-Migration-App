public final class mnn
{
    public static final mnn d;
    public final hcm a;
    public final mrg b;
    public final vbh c;
    
    static {
        d = new mnn(0L, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, 16777215);
    }
    
    public mnn(long h, long c, zoa zoa, soa soa, una una, long c2, long h2, int n, int n2, long c3, idd idd, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            h = j86.h;
        }
        if ((n3 & 0x2) != 0x0) {
            c = vnn.c;
        }
        if ((n3 & 0x4) != 0x0) {
            zoa = null;
        }
        if ((n3 & 0x8) != 0x0) {
            soa = null;
        }
        if ((n3 & 0x20) != 0x0) {
            una = null;
        }
        if ((n3 & 0x80) != 0x0) {
            c2 = vnn.c;
        }
        if ((n3 & 0x800) != 0x0) {
            h2 = j86.h;
        }
        final int n4 = 0;
        if ((0x8000 & n3) != 0x0) {
            n = 0;
        }
        if ((0x10000 & n3) != 0x0) {
            n2 = n4;
        }
        if ((0x20000 & n3) != 0x0) {
            c3 = vnn.c;
        }
        if ((n3 & 0x100000) != 0x0) {
            idd = null;
        }
        this(new hcm(h, c, zoa, soa, null, una, null, c2, null, null, null, h2, null, null, null), new mrg(n, n2, c3, null, null, idd, 0, 0, null), null);
    }
    
    public mnn(final hcm hcm, final mrg mrg) {
        final nbh o = hcm.o;
        final fbh e = mrg.e;
        vbh vbh;
        if (o == null && e == null) {
            vbh = null;
        }
        else {
            vbh = new vbh(o, e);
        }
        this(hcm, mrg, vbh);
    }
    
    public mnn(final hcm a, final mrg b, final vbh c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static mnn a(final mnn mnn, long b, long b2, zoa c, soa d, una f, long h, wgn m, int a, long c2, idd f2, int g, int h2) {
        vbh vbh = yi2.b;
        if ((h2 & 0x1) != 0x0) {
            b = mnn.a.a.b();
        }
        if ((h2 & 0x2) != 0x0) {
            b2 = mnn.a.b;
        }
        if ((h2 & 0x4) != 0x0) {
            c = mnn.a.c;
        }
        if ((h2 & 0x8) != 0x0) {
            d = mnn.a.d;
        }
        final hcm a2 = mnn.a;
        final toa e = a2.e;
        if ((h2 & 0x20) != 0x0) {
            f = a2.f;
        }
        String g2;
        if ((h2 & 0x40) != 0x0) {
            g2 = a2.g;
        }
        else {
            g2 = "tnum";
        }
        if ((h2 & 0x80) != 0x0) {
            h = a2.h;
        }
        final zw1 i = a2.i;
        final tln j = a2.j;
        final jpd k = a2.k;
        final long l = a2.l;
        if ((h2 & 0x1000) != 0x0) {
            m = a2.m;
        }
        final rpl n = a2.n;
        final dw8 p13 = a2.p;
        if ((h2 & 0x8000) != 0x0) {
            a = mnn.b.a;
        }
        int b3;
        if ((h2 & 0x10000) != 0x0) {
            b3 = mnn.b.b;
        }
        else {
            b3 = 1;
        }
        if ((h2 & 0x20000) != 0x0) {
            c2 = mnn.b.c;
        }
        final mrg b4 = mnn.b;
        final vln d2 = b4.d;
        if ((h2 & 0x80000) != 0x0) {
            vbh = mnn.c;
        }
        if ((h2 & 0x100000) != 0x0) {
            f2 = b4.f;
        }
        if ((h2 & 0x200000) != 0x0) {
            g = b4.g;
        }
        h2 = b4.h;
        final ymn i2 = b4.i;
        final long b5 = a2.a.b();
        final int i3 = j86.i;
        oln oln;
        if (foo.a(b, b5)) {
            oln = a2.a;
        }
        else if (b != 16L) {
            oln = new z86(b);
        }
        else {
            oln = nln.a;
        }
        final fbh fbh = null;
        nbh a3;
        if (vbh != null) {
            a3 = vbh.a;
        }
        else {
            a3 = null;
        }
        final hcm hcm = new hcm(oln, b2, c, d, e, f, g2, h, i, j, k, l, m, n, a3, p13);
        fbh b6 = fbh;
        if (vbh != null) {
            b6 = vbh.b;
        }
        return new mnn(hcm, new mrg(a, b3, c2, d2, b6, f2, g, h2, i2), vbh);
    }
    
    public static mnn f(final mnn mnn, long h, long c, zoa zoa, una una, long c2, wgn wgn, int n, long c3, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            h = j86.h;
        }
        if ((n2 & 0x2) != 0x0) {
            c = vnn.c;
        }
        if ((n2 & 0x4) != 0x0) {
            zoa = null;
        }
        if ((n2 & 0x20) != 0x0) {
            una = null;
        }
        if ((n2 & 0x80) != 0x0) {
            c2 = vnn.c;
        }
        final long h2 = j86.h;
        if ((n2 & 0x1000) != 0x0) {
            wgn = null;
        }
        if ((0x8000 & n2) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x20000) != 0x0) {
            c3 = vnn.c;
        }
        final hcm a = icm.a(mnn.a, h, null, Float.NaN, c, zoa, null, null, una, null, c2, null, null, null, h2, wgn, null, null, null);
        final mrg a2 = nrg.a(mnn.b, n, 0, c3, null, null, null, 0, 0, null);
        if (mnn.a == a && mnn.b == a2) {
            return mnn;
        }
        return new mnn(a, a2);
    }
    
    public final qm2 b() {
        return this.a.a.c();
    }
    
    public final long c() {
        return this.a.a.b();
    }
    
    public final boolean d(final mnn mnn) {
        return this == mnn || (mlc.q((Object)this.b, (Object)mnn.b) && this.a.b(mnn.a));
    }
    
    public final mnn e(final mnn mnn) {
        if (mnn != null && !mnn.equals(mnn.d)) {
            return new mnn(this.a.d(mnn.a), this.b.a(mnn.b));
        }
        return this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mnn)) {
            return false;
        }
        final mnn mnn = (mnn)o;
        return mlc.q((Object)this.a, (Object)mnn.a) && mlc.q((Object)this.b, (Object)mnn.b) && mlc.q((Object)this.c, (Object)mnn.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final vbh c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String h = j86.h(this.c());
        final qm2 b = this.b();
        final hcm a = this.a;
        final float a2 = a.a.a();
        final String f = vnn.f(a.b);
        final zoa c = a.c;
        final soa d = a.d;
        final toa e = a.e;
        final una f2 = a.f;
        final String g = a.g;
        final String f3 = vnn.f(a.h);
        final zw1 i = a.i;
        final tln j = a.j;
        final jpd k = a.k;
        final String h2 = j86.h(a.l);
        final wgn m = a.m;
        final rpl n = a.n;
        final dw8 p = a.p;
        final mrg b2 = this.b;
        final String a3 = kfn.a(b2.a);
        final String a4 = ahn.a(b2.b);
        final String f4 = vnn.f(b2.c);
        final vln d2 = b2.d;
        final idd f5 = b2.f;
        final String a5 = icd.a(b2.g);
        final String a6 = mxb.a(b2.h);
        final ymn l = b2.i;
        final StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(h);
        sb.append(", brush=");
        sb.append((Object)b);
        sb.append(", alpha=");
        sb.append(a2);
        sb.append(", fontSize=");
        sb.append(f);
        sb.append(", fontWeight=");
        sb.append((Object)c);
        sb.append(", fontStyle=");
        sb.append((Object)d);
        sb.append(", fontSynthesis=");
        sb.append((Object)e);
        sb.append(", fontFamily=");
        sb.append((Object)f2);
        sb.append(", fontFeatureSettings=");
        oz1.A(sb, g, ", letterSpacing=", f3, ", baselineShift=");
        sb.append((Object)i);
        sb.append(", textGeometricTransform=");
        sb.append((Object)j);
        sb.append(", localeList=");
        sb.append((Object)k);
        sb.append(", background=");
        sb.append(h2);
        sb.append(", textDecoration=");
        sb.append((Object)m);
        sb.append(", shadow=");
        sb.append((Object)n);
        sb.append(", drawStyle=");
        sb.append((Object)p);
        sb.append(", textAlign=");
        sb.append(a3);
        sb.append(", textDirection=");
        oz1.A(sb, a4, ", lineHeight=", f4, ", textIndent=");
        sb.append((Object)d2);
        sb.append(", platformStyle=");
        sb.append((Object)this.c);
        sb.append(", lineHeightStyle=");
        sb.append((Object)f5);
        sb.append(", lineBreak=");
        sb.append(a5);
        sb.append(", hyphens=");
        sb.append(a6);
        sb.append(", textMotion=");
        sb.append((Object)l);
        sb.append(")");
        return sb.toString();
    }
}
