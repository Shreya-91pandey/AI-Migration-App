public final class yjn implements aif
{
    public boolean a;
    public dnn b;
    public final dkn c;
    
    public yjn(final dkn c) {
        this.c = c;
        this.a = true;
    }
    
    public final boolean a(final long n) {
        final dkn c = this.c;
        if (c.o()) {
            if (c.r().a.w.length() != 0) {
                final j7d d = c.d;
                if (d != null) {
                    if (d.d() != null) {
                        this.f(c.r(), n, false, wab.e0);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final void b() {
        if (this.a) {
            this.c.t(this.b);
        }
    }
    
    public final boolean c(long f, final ypk ypk, final int n) {
        final dkn c = this.c;
        if (c.o()) {
            if (c.r().a.w.length() != 0) {
                final j7d d = c.d;
                if (d != null) {
                    if (d.d() != null) {
                        final xma m = c.m;
                        if (m != null) {
                            xma.a(m);
                        }
                        c.p = f;
                        c.u = -1;
                        c.j(true);
                        f = this.f(c.r(), c.p, true, ypk);
                        if (n >= 2) {
                            this.a = true;
                            this.b = new dnn(f);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean d(final long n, final ypk ypk) {
        final dkn c = this.c;
        if (c.o()) {
            if (c.r().a.w.length() != 0) {
                final j7d d = c.d;
                if (d != null) {
                    if (d.d() != null) {
                        this.f(c.r(), n, false, ypk);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean e(final long n) {
        final dkn c = this.c;
        final j7d d = c.d;
        if (d != null) {
            if (d.d() != null) {
                if (c.o()) {
                    c.u = -1;
                    final xma m = c.m;
                    if (m != null) {
                        xma.a(m);
                    }
                    this.f(c.r(), n, false, wab.e0);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final long f(final mln mln, long c, final boolean b, final ypk ypk) {
        final dkn c2 = this.c;
        c = c2.C(mln, c, b, false, ypk, false, null);
        if (!dnn.b(c, (Object)this.b)) {
            this.a = false;
        }
        tbb tbb;
        if (dnn.d(c)) {
            tbb = tbb.x;
        }
        else {
            tbb = tbb.w;
        }
        c2.y(tbb);
        return c;
    }
}
