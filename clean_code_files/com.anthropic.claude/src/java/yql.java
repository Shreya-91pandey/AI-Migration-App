public final class yql extends qxc implements lta
{
    public final byte w;
    public final o8h x;
    public final zql y;
    
    public yql(final o8h x, final zql y) {
        this.w = 1;
        this.x = x;
        this.y = y;
        super(1);
    }
    
    public yql(final zql y, final o8h x) {
        this.w = 0;
        this.y = y;
        this.x = x;
        super(1);
    }
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        lqo a = lqo.a;
        final zql y = this.y;
        final o8h x = this.x;
        final l6g l6g = null;
        switch (w) {
            default: {
                final n8h n8h = (n8h)o;
                n8h.g(n8h, x, 0, 0);
                final url h = y.N.h();
                final vrl n = y.N;
                final rtl c = h.c;
                c.c();
                lqo lqo = a;
                if (!mlc.q(c.a(), qwf.a)) {
                    if (!n.m()) {
                        lqo = a;
                    }
                    else {
                        final qtl a2 = c.a();
                        lqo = a;
                        if (n.g().b()) {
                            lqo = a;
                            if (a2.b()) {
                                final nzc b = n8h.b();
                                lqo = a;
                                if (b != null) {
                                    final long z = uoo.Z(b.k());
                                    final itl b2 = n.h().b;
                                    final nzc b3 = n.h().b.B;
                                    if (b3 != null) {
                                        final long f = b2.f(b3, b);
                                        final itl b4 = n.h().b;
                                        final nzc b5 = n.h().b.B;
                                        if (b5 != null) {
                                            final long f2 = nzc.f(b5, b, 2);
                                            final qtl a3 = c.a();
                                            final url a4 = c.a;
                                            final zql f3 = c.f;
                                            f3.getClass();
                                            c.b.setValue((Object)a3.a(a4, f3, z, f, f2));
                                            lqo = a;
                                            return lqo;
                                        }
                                        en9.s("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                                    }
                                    else {
                                        en9.s("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                                    }
                                    lqo = null;
                                }
                            }
                        }
                    }
                }
                return lqo;
            }
            case 0: {
                final n8h n8h2 = (n8h)o;
                y.M = true;
                y.L = null;
                final qtl a5 = y.N.h().c.a();
                if (!y.N.m()) {
                    n8h.g(n8h2, x, 0, 0);
                }
                else if (a5.d()) {
                    final c2l e = a5.e();
                    if (e != null) {
                        final k2j c2 = a5.c();
                        if (c2 != null) {
                            final boolean a6 = y.N.h().b.a();
                            long r = 0L;
                            if (a6) {
                                final nzc b6 = n8h2.b();
                                if (b6 == null) {
                                    n8h2.f(x, 0, 0, 0.0f);
                                    return a;
                                }
                                final boolean b7 = y.N.h().c.a().b();
                                long h2 = y.p1().H(b6, 0L);
                                qt7.C(e);
                                final vrl n2 = y.N;
                                if (!b7) {
                                    n2.g().a(c2, qt7.C(e), new vf0((byte)1), y.J, y.K);
                                }
                                else {
                                    n2.g().a(c2, qt7.C(e), null, y.J, y.K);
                                }
                                y.J = null;
                                y.K = null;
                                final k2j c3 = y.N.g().c();
                                l6g l6g2 = l6g;
                                if (c3 != null) {
                                    l6g2 = new l6g(l6g.i(l6g.h(c3.h(), ((l6g)((ksg)e.x).getValue()).a), ((l6g)((ksg)e.z).getValue()).a));
                                }
                                long n3;
                                if (!y.N.g().b() && b7) {
                                    if (l6g2 != null) {
                                        n3 = l6g2.a;
                                    }
                                    else {
                                        n3 = c2.h();
                                    }
                                }
                                else {
                                    if (l6g2 != null) {
                                        n3 = l6g2.a;
                                    }
                                    else {
                                        n3 = h2;
                                    }
                                    k2j k2j;
                                    if (l6g2 == null) {
                                        k2j = rml.f(h2, uoo.Z(b6.k()));
                                    }
                                    else {
                                        k2j = rml.f(l6g2.a, c3.g());
                                    }
                                    y.N.h().c.a().i(k2j);
                                }
                                final hsl f4 = y.N.f();
                                long b8 = n3;
                                if (f4 != null) {
                                    final byl c4 = f4.c;
                                    b8 = n3;
                                    if (f4.d()) {
                                        if (y.N.g().d()) {
                                            h2 = n3;
                                        }
                                        final nzc e2 = f4.e;
                                        if (e2 != null && e2.p() && y.p1().p()) {
                                            float h3;
                                            if (((ksg)c4.y).getValue()) {
                                                h3 = ((gsg)c4.v).h();
                                            }
                                            else {
                                                h3 = 1.0f;
                                            }
                                            long n4;
                                            if (((ksg)c4.z).getValue()) {
                                                n4 = ((jeo)((ksg)c4.A).getValue()).a;
                                            }
                                            else {
                                                n4 = jeo.b;
                                            }
                                            b8 = srl.b(h3, n3, srl.a(e2, y.p1(), n4));
                                        }
                                        else {
                                            b8 = h2;
                                        }
                                    }
                                }
                                final long h4 = b6.H(y.p1(), b8);
                                n8h2.f(x, Math.round(Float.intBitsToFloat((int)(h4 >> 32))), Math.round(Float.intBitsToFloat((int)(h4 & 0xFFFFFFFFL))), 0.0f);
                                return a;
                            }
                            else {
                                if (!y.N.g().b()) {
                                    final nzc b9 = n8h2.b();
                                    if (b9 != null) {
                                        r = zrn.R(l6g.h(c2.h(), y.p1().H(b9, 0L)));
                                    }
                                    n8h2.f(x, (int)(r >> 32), (int)(r & 0xFFFFFFFFL), 0.0f);
                                    return a;
                                }
                                n8h.g(n8h2, x, 0, 0);
                                return a;
                            }
                        }
                        else {
                            fvd.t((Object)a5, "Match State is configured, but current bounds is null. State = ");
                        }
                    }
                    else {
                        fvd.t((Object)a5, "Match State is configured, but target data is null. State = ");
                    }
                    a = null;
                }
                else {
                    n8h.g(n8h2, x, 0, 0);
                }
                return a;
            }
        }
    }
}
