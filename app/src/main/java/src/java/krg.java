import java.util.List;

public final class krg
{
    public String a;
    public mnn b;
    public tna c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public xc8 i;
    public a90 j;
    public boolean k;
    public long l;
    public q9f m;
    public jrg n;
    public qzc o;
    public long p;
    public int q;
    public int r;
    public long s;
    
    public krg(final String a, final mnn b, final tna c, int b2, final boolean e, final int f, final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = b2;
        this.e = e;
        this.f = f;
        this.g = g;
        b2 = rbc.b;
        this.h = rbc.a;
        this.l = 0L;
        if (!(true & true)) {
            iac.a("width and height must be >= 0");
        }
        this.p = hv6.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }
    
    public static long f(final krg krg, final long n, final qzc qzc) {
        final mnn b = krg.b;
        final q9f m = krg.m;
        final xc8 i = krg.i;
        i.getClass();
        final q9f x = eqi.X(m, qzc, b, i, krg.c);
        krg.m = x;
        return x.a(krg.g, n);
    }
    
    public final int a(final int q, final qzc qzc) {
        final int q2 = this.q;
        final int r = this.r;
        if (q == q2 && q2 != -1) {
            return r;
        }
        long n2;
        final long n = n2 = hv6.a(0, q, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            n2 = f(this, n, qzc);
        }
        final jrg e = this.e(qzc);
        final long f = uoo.F(n2, this.e, this.d, e.y());
        final boolean e2 = this.e;
        final int d = this.d;
        int f2 = this.f;
    Label_0141:
        while (true) {
            Label_0133: {
                if (e2) {
                    break Label_0133;
                }
                if (d != 2) {
                    if (d != 4) {
                        if (d != 5) {
                            break Label_0133;
                        }
                    }
                }
                f2 = 1;
                break Label_0141;
            }
            if (f2 < 1) {
                continue;
            }
            break;
        }
        final int q3 = zn2.q(new a90((e90)e, f2, d, f).f);
        final int j = gv6.j(n2);
        int r2;
        if ((r2 = q3) < j) {
            r2 = j;
        }
        this.q = q;
        return this.r = r2;
    }
    
    public final boolean b(long l, final qzc qzc) {
        this.s = (this.s << 2 | 0x3L);
        final int g = this.g;
        final boolean b = true;
        if (g > 1) {
            l = f(this, l, qzc);
        }
        final a90 j = this.j;
        boolean k = false;
        Label_0317: {
            if (j != null) {
                final jrg n = this.n;
                if (n != null) {
                    if (!n.e()) {
                        if (qzc == this.o) {
                            if (!gv6.c(l, this.p)) {
                                if (gv6.i(l) != gv6.i(this.p)) {
                                    break Label_0317;
                                }
                                if (gv6.k(l) != gv6.k(this.p)) {
                                    break Label_0317;
                                }
                                if (gv6.h(l) < j.f) {
                                    break Label_0317;
                                }
                                if (j.d.d) {
                                    break Label_0317;
                                }
                            }
                            if (!gv6.c(l, this.p)) {
                                final a90 i = this.j;
                                i.getClass();
                                final long d = hv6.d(l, (long)zn2.q(Math.min(i.a.D.c(), i.c())) << 32 | ((long)zn2.q(i.f) & 0xFFFFFFFFL));
                                this.l = d;
                                boolean m = false;
                                Label_0304: {
                                    if (this.d != 3) {
                                        m = b;
                                        if ((int)(d >> 32) < i.c()) {
                                            break Label_0304;
                                        }
                                        if ((int)(0xFFFFFFFFL & d) < i.f) {
                                            m = b;
                                            break Label_0304;
                                        }
                                    }
                                    m = false;
                                }
                                this.k = m;
                                this.p = l;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        final jrg e = this.e(qzc);
        final long f = uoo.F(l, this.e, this.d, e.y());
        final boolean e2 = this.e;
        final int d2 = this.d;
        int f2 = this.f;
    Label_0405:
        while (true) {
            Label_0396: {
                if (e2) {
                    break Label_0396;
                }
                if (d2 != 2) {
                    if (d2 != 4) {
                        if (d2 != 5) {
                            break Label_0396;
                        }
                    }
                }
                f2 = 1;
                break Label_0405;
            }
            if (f2 < 1) {
                continue;
            }
            break;
        }
        final a90 j2 = new a90((e90)e, f2, d2, f);
        this.p = l;
        final int q = zn2.q(j2.c());
        final float f3 = j2.f;
        l = hv6.d(l, ((long)zn2.q(f3) & 0xFFFFFFFFL) | (long)q << 32);
        this.l = l;
        if (this.d != 3) {
            if ((int)(l >> 32) < j2.c() || (int)(l & 0xFFFFFFFFL) < f3) {
                k = true;
            }
        }
        this.k = k;
        this.j = j2;
        return true;
    }
    
    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = hv6.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }
    
    public final void d(final xc8 xc8) {
        final xc8 i = this.i;
        long n;
        if (xc8 != null) {
            final int b = rbc.b;
            n = rbc.a(xc8.getDensity(), xc8.o0());
        }
        else {
            n = rbc.a;
        }
        if (i == null) {
            this.i = xc8;
            this.h = n;
            return;
        }
        if (xc8 != null && this.h == n) {
            return;
        }
        this.i = xc8;
        this.h = n;
        this.s = (this.s << 2 | 0x1L);
        this.c();
    }
    
    public final jrg e(final qzc o) {
        final jrg n = this.n;
        if (n != null && o == this.o) {
            final Object o2 = n;
            if (!n.e()) {
                return this.n = (jrg)o2;
            }
        }
        this.o = o;
        final String a = this.a;
        final mnn f = k8e.F(this.b, o);
        final xc8 i = this.i;
        i.getClass();
        final tna c = this.c;
        final boolean e = this.e;
        final r89 v = r89.v;
        final Object o2 = new e90(a, f, (List)v, (List)v, c, i, e);
        return this.n = (jrg)o2;
    }
    
    @Override
    public final String toString() {
        String s;
        if (this.j != null) {
            s = "<paragraph>";
        }
        else {
            s = "null";
        }
        return hia.n(oz1.t("ParagraphLayoutCache(paragraph=", s, ", lastDensity=", rbc.b(this.h), ", history="), this.s, ", constraints=$)");
    }
}
