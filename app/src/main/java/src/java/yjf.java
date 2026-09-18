import java.util.List;

public final class yjf
{
    public og0 a;
    public tna b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public rfn h;
    public q9f i;
    public long j;
    public xc8 k;
    public mnn l;
    public uy7 m;
    public qzc n;
    public omn o;
    public int p;
    public int q;
    public xjf r;
    public long s;
    
    public yjf(final og0 a, final mnn l, final tna b, int b2, final boolean d, final int e, final int f, final List g, final rfn h) {
        this.a = a;
        this.b = b;
        this.c = b2;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        b2 = rbc.b;
        this.j = rbc.a;
        this.l = l;
        this.p = -1;
        this.q = -1;
    }
    
    public final int a(final int p2, final qzc qzc) {
        final int p3 = this.p;
        final int q = this.q;
        if (p2 == p3 && p3 != -1) {
            return q;
        }
        long n2;
        final long n = n2 = hv6.a(0, p2, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            n2 = this.h(n, qzc);
        }
        final int q2 = zn2.q(this.b(n2, qzc).e);
        final int j = gv6.j(n2);
        int q3;
        if ((q3 = q2) < j) {
            q3 = j;
        }
        this.p = p2;
        return this.q = q3;
    }
    
    public final vjf b(long f, final qzc qzc) {
        final uy7 e = this.e(qzc);
        f = uoo.F(f, this.d, this.c, e.y());
        final boolean d = this.d;
        final int c = this.c;
        int e2 = this.e;
        while (true) {
            Label_0076: {
                if (d) {
                    break Label_0076;
                }
                if (c != 2) {
                    if (c != 4) {
                        if (c != 5) {
                            break Label_0076;
                        }
                    }
                }
                e2 = 1;
                return new vjf(e, f, e2, c);
            }
            if (e2 < 1) {
                continue;
            }
            break;
        }
        return new vjf(e, f, e2, c);
    }
    
    public final boolean c(long n, final qzc n2) {
        this.s = (this.s << 2 | 0x3L);
        long h;
        if (this.f > 1) {
            h = this.h(n, n2);
        }
        else {
            h = n;
        }
        final omn o = this.o;
        Label_0232: {
            if (o != null) {
                final vjf b = o.b;
                final nmn a = o.a;
                if (!b.a.e()) {
                    final qzc h2 = a.h;
                    final long j = a.j;
                    if (n2 == h2) {
                        if (!gv6.c(h, j)) {
                            if (gv6.i(h) != gv6.i(j)) {
                                break Label_0232;
                            }
                            if (gv6.k(h) != gv6.k(j)) {
                                break Label_0232;
                            }
                            if (gv6.h(h) < b.e) {
                                break Label_0232;
                            }
                            if (b.c) {
                                break Label_0232;
                            }
                        }
                        final omn o2 = this.o;
                        o2.getClass();
                        if (gv6.c(h, o2.a.j)) {
                            return false;
                        }
                        final omn o3 = this.o;
                        o3.getClass();
                        this.o = this.g(n2, h, o3.b);
                        return true;
                    }
                }
            }
        }
        final rfn h3 = this.h;
        if (h3 != null) {
            this.n = n2;
            final long b2 = this.l.a.b;
            xjf r;
            if ((r = this.r) == null) {
                r = new xjf(this);
                this.r = r;
            }
            final long n3 = n = ((wk1)h3).b(r, n, this.a);
            if (vnn.d(n3)) {
                n = zjf.a(b2, n3);
            }
            xjf r2;
            if ((r2 = this.r) == null) {
                r2 = new xjf(this);
                this.r = r2;
            }
            final omn a2 = r2.a();
            if (a2 != null) {
                final nmn a3 = a2.a;
                if (vnn.a(n, a3.b.a.b) && a3.f == this.c) {
                    this.o = a2;
                    return true;
                }
            }
            this.f(mnn.a(this.l, 0L, n, (zoa)null, (soa)null, (una)null, 0L, (wgn)null, 0, 0L, (idd)null, 0, 16777213));
        }
        this.o = this.g(n2, h, this.b(h, n2));
        return true;
    }
    
    public final void d(final xc8 xc8) {
        final xc8 k = this.k;
        long n;
        if (xc8 != null) {
            final int b = rbc.b;
            n = rbc.a(xc8.getDensity(), xc8.o0());
        }
        else {
            n = rbc.a;
        }
        if (k == null) {
            this.k = xc8;
            this.j = n;
            return;
        }
        if (xc8 != null && this.j == n) {
            return;
        }
        this.k = xc8;
        this.j = n;
        this.s = (this.s << 2 | 0x1L);
        this.m = null;
        this.o = null;
        this.q = -1;
        this.p = -1;
        this.r = null;
    }
    
    public final uy7 e(final qzc n) {
        final uy7 m = this.m;
        if (m != null && n == this.n) {
            final uy7 uy7 = m;
            if (!m.e()) {
                return this.m = uy7;
            }
        }
        this.n = n;
        final og0 a = this.a;
        final mnn f = k8e.F(this.l, n);
        final xc8 k = this.k;
        k.getClass();
        final tna b = this.b;
        Object o;
        if ((o = this.g) == null) {
            o = r89.v;
        }
        final uy7 uy7 = new uy7(a, k, b, f, (List)o, this.d);
        return this.m = uy7;
    }
    
    public final void f(final mnn l) {
        final boolean d = l.d(this.l);
        this.l = l;
        if (!d) {
            this.s <<= 2;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
        }
    }
    
    public final omn g(final qzc qzc, final long n, final vjf vjf) {
        final float min = Math.min(vjf.a.y(), vjf.d);
        final og0 a = this.a;
        final mnn l = this.l;
        Object o;
        if ((o = this.g) == null) {
            o = r89.v;
        }
        final int e = this.e;
        final boolean d = this.d;
        final int c = this.c;
        final xc8 k = this.k;
        k.getClass();
        return new omn(new nmn(a, l, (List)o, e, d, c, k, qzc, this.b, n), vjf, hv6.d(n, (long)zn2.q(min) << 32 | ((long)zn2.q(vjf.e) & 0xFFFFFFFFL)));
    }
    
    public final long h(final long n, final qzc qzc) {
        final q9f i = this.i;
        final mnn l = this.l;
        final xc8 k = this.k;
        k.getClass();
        final q9f x = eqi.X(i, qzc, l, k, this.b);
        this.i = x;
        return x.a(this.f, n);
    }
    
    @Override
    public final String toString() {
        final omn o = this.o;
        Object o2 = "null";
        String s;
        if (o != null) {
            s = "<TextLayoutResult>";
        }
        else {
            s = "null";
        }
        final String b = rbc.b(this.j);
        final long s2 = this.s;
        final omn o3 = this.o;
        if (o3 != null) {
            o2 = new gv6(o3.a.j);
        }
        final StringBuilder t = oz1.t("MultiParagraphLayoutCache(textLayoutResult=", s, ", lastDensity=", b, ", history=");
        t.append(s2);
        t.append(", constraints=");
        t.append(o2);
        t.append(")");
        return t.toString();
    }
}
