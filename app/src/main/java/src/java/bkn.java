public final class bkn implements dhn
{
    public boolean a;
    public dnn b;
    public ypk c;
    public final dkn d;
    
    public bkn(final dkn d) {
        this.d = d;
        this.a = true;
        this.c = wab.e0;
    }
    
    public final void a() {
        this.f();
    }
    
    public final void b(final long p2, final ypk c) {
        final dkn d = this.d;
        if (d.o()) {
            if (d.s.getValue() == null) {
                d.x(qbb.x);
                d.u = -1;
                this.a = true;
                this.c = c;
                d.s();
                final j7d d2 = d.d;
                Label_0295: {
                    if (d2 != null) {
                        final pmn d3 = d2.d();
                        if (d3 != null && d3.c(p2)) {
                            if (d.r().a.w.length() == 0) {
                                return;
                            }
                            d.j(false);
                            final long c2 = d.C(mln.a(d.r(), (og0)null, dnn.b, 5), p2, true, false, this.c, true, dcb.a(0));
                            d.q = new dnn(c2);
                            this.b = new dnn(c2);
                            break Label_0295;
                        }
                    }
                    final j7d d4 = d.d;
                    if (d4 != null) {
                        final pmn d5 = d4.d();
                        if (d5 != null) {
                            final int n = d.b.n(d5.b(p2, true));
                            final mln g = dkn.g(d.r().a, rhc.c(n, n));
                            d.j(false);
                            final ccb l = d.l;
                            if (l != null) {
                                l.a(0);
                            }
                            d.c.b((Object)g);
                            d.x = new dnn(g.b);
                        }
                    }
                    this.a = false;
                }
                d.y(tbb.v);
                d.p = p2;
                d.w(new l6g(p2));
                d.r = 0L;
            }
        }
    }
    
    public final void c() {
    }
    
    public final void d() {
    }
    
    public final void e(long n) {
        final dkn d = this.d;
        if (d.o()) {
            if (d.r().a.w.length() != 0) {
                d.r = l6g.i(d.r, n);
                final j7d d2 = d.d;
                if (d2 != null) {
                    final pmn d3 = d2.d();
                    if (d3 != null) {
                        d.w(new l6g(l6g.i(d.p, d.r)));
                        Label_0382: {
                            if (d.q == null) {
                                final l6g m = d.m();
                                m.getClass();
                                if (!d3.c(m.a)) {
                                    final int n2 = d.b.n(d3.b(d.p, true));
                                    final o6g b = d.b;
                                    final l6g i = d.m();
                                    i.getClass();
                                    ypk ypk;
                                    if (n2 == b.n(d3.b(i.a, true))) {
                                        ypk = wab.e0;
                                    }
                                    else {
                                        ypk = wab.g0;
                                    }
                                    final mln r = d.r();
                                    final l6g j = d.m();
                                    j.getClass();
                                    n = d.C(r, j.a, false, false, ypk, true, dcb.a(9));
                                    break Label_0382;
                                }
                            }
                            final dnn q = d.q;
                            int b2;
                            if (q != null) {
                                b2 = (int)(q.a >> 32);
                            }
                            else {
                                b2 = d3.b(d.p, false);
                            }
                            final l6g k = d.m();
                            k.getClass();
                            final int b3 = d3.b(k.a, false);
                            if (d.q == null && b2 == b3) {
                                return;
                            }
                            final mln r2 = d.r();
                            final l6g l = d.m();
                            l.getClass();
                            n = d.C(r2, l.a, false, false, this.c, true, dcb.a(9));
                        }
                        this.b = new dnn(n);
                        if (!dnn.b(n, (Object)d.q)) {
                            this.a = false;
                        }
                    }
                }
                d.B(false);
            }
        }
    }
    
    public final void f() {
        final dkn d = this.d;
        d.x(null);
        d.w(null);
        this.c = wab.e0;
        final boolean b = true;
        d.B(true);
        final dnn b2 = this.b;
        long n;
        if (b2 != null) {
            n = b2.a;
        }
        else {
            n = d.r().b;
        }
        final boolean d2 = dnn.d(n);
        tbb tbb;
        if (d2) {
            tbb = tbb.x;
        }
        else {
            tbb = tbb.w;
        }
        d.y(tbb);
        final j7d d3 = d.d;
        if (d3 != null) {
            d3.m.setValue((Object)(!d2 && xiq.B(d, true)));
        }
        final j7d d4 = d.d;
        if (d4 != null) {
            d4.n.setValue((Object)(!d2 && xiq.B(d, false)));
        }
        final j7d d5 = d.d;
        if (d5 != null) {
            d5.o.setValue((Object)(d2 && xiq.B(d, true) && b));
        }
        if (this.a) {
            d.t(d.q);
        }
        d.q = null;
    }
    
    public final void onCancel() {
        this.f();
    }
}
