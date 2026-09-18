import java.util.Map;

public final class zql extends hgf implements rt0, bw8, mgf, k5g, zl6
{
    public k2j J;
    public hg0 K;
    public k2j L;
    public boolean M;
    public vrl N;
    public final kzl O;
    
    public zql(final vrl n) {
        this.N = n;
        final tei a = srl.a;
        final kzl o = new kzl(a);
        o.Y(a, (Object)n);
        this.O = o;
    }
    
    @Override
    public final noe D0(final st0 st0, final goe goe, long n) {
        if (this.N.h().c.a().e() != null) {
            final k2j c = this.N.h().c.a().c();
            if (c != null) {
                final float b = c.b;
                final float d = c.d;
                final float a = c.a;
                final float c2 = c.c;
                final hsl f = this.N.f();
                if (f == null || !f.c()) {
                    this.N.E = false;
                }
                else if (!this.N.E) {
                    final nzc e = f.e;
                    if (e != null && e.p()) {
                        if (this.p1().p()) {
                            float k = f.k;
                            final long a2 = srl.a(e, this.p1(), f.i);
                            final long b2 = srl.b(k, c.h(), a2);
                            final zql h = this.N.H;
                            hsl o1;
                            if (h != null) {
                                o1 = h.o1();
                            }
                            else {
                                o1 = null;
                            }
                            final boolean b3 = o1 == f;
                            final boolean b4 = !this.N.j() && b3;
                            if (b4) {
                                k = 1.0f;
                            }
                            final int n2 = (int)(b2 >> 32);
                            final float i = ge9.k(c2, a, k, Float.intBitsToFloat(n2));
                            final int n3 = (int)(b2 & 0xFFFFFFFFL);
                            this.J = new k2j(Float.intBitsToFloat(n2), Float.intBitsToFloat(n3), i, ge9.k(d, b, k, Float.intBitsToFloat(n3)));
                            if (!b4) {
                                final eg0 a3 = f.a();
                                float b5 = 0.0f;
                                float a4;
                                if (a3 != null) {
                                    a4 = a3.a;
                                }
                                else {
                                    a4 = 0.0f;
                                }
                                final fg0 b6 = f.b();
                                float a5;
                                if (b6 != null) {
                                    a5 = b6.a;
                                }
                                else {
                                    a5 = 0.0f;
                                }
                                if (b6 != null) {
                                    b5 = b6.b;
                                }
                                final int n4 = (int)(a2 >> 32);
                                final float intBitsToFloat = Float.intBitsToFloat(n4);
                                final int n5 = (int)(a2 & 0xFFFFFFFFL);
                                this.K = new hg0((a - intBitsToFloat) * a4 + a5, (b - Float.intBitsToFloat(n5)) * a4 + b5, (c2 - Float.intBitsToFloat(n4)) * a4 + a5, (d - Float.intBitsToFloat(n5)) * a4 + b5);
                            }
                            else {
                                this.K = null;
                            }
                            this.N.E = true;
                        }
                    }
                }
            }
        }
        k2j k2j;
        if ((k2j = this.J) == null && (k2j = this.N.g().c()) == null) {
            final rtl c3 = this.N.h().c;
            c3.c();
            k2j = c3.a().f(c3.a);
        }
        if (k2j != null) {
            n = uoo.X(k2j.g());
            final int n6 = (int)(n >> 32);
            final int n7 = (int)(n & 0xFFFFFFFFL);
            if (n6 == Integer.MAX_VALUE || n7 == Integer.MAX_VALUE) {
                fvd.m("Error: Infinite width/height is invalid. animated bounds: ", (Object)this.N.g().c(), (Object)", current bounds: ", (Object)this.N.h().c.a().c());
                return null;
            }
            int n8;
            if ((n8 = n6) < 0) {
                n8 = 0;
            }
            int n9;
            if ((n9 = n7) < 0) {
                n9 = 0;
            }
            if (!(n8 >= 0 & n9 >= 0)) {
                iac.a("width and height must be >= 0");
            }
            n = hv6.h(n8, n8, n9, n9);
        }
        final o8h u = goe.u(n);
        if (this.N.h().c.a().d()) {
            final ctl ctl = (ctl)this.N.A.getValue();
            n = this.N.h().b.v.d((nzc)soh.K(this)).k();
            final int v = u.v;
            final int w = u.w;
            ctl.getClass();
        }
        else {
            n = ((long)u.v << 32 | ((long)u.w & 0xFFFFFFFFL));
        }
        return ((ooe)st0).Y((int)(n >> 32), (int)(n & 0xFFFFFFFFL), (Map)s89.v, (lta)new yql(this, u));
    }
    
    @Override
    public final void F0() {
        this.N.h().f();
        yi2.I(this, this.N.h().i);
    }
    
    @Override
    public final void I0(final k0d k0d) {
        final k2j c = this.N.h().c.a().c();
        final boolean j = this.N.j();
        final vrl n = this.N;
        g90 a = null;
        if (!j) {
            n.F = null;
            this.q1(null);
            final vrl n2 = this.N;
            if (n2.h().c.a().d() && (n2.j() || !n2.i())) {
                return;
            }
            k0d.a();
        }
        else {
            if (c != null) {
                a = ((atl)n.C.getValue()).a(this.N.l(), c, k0d.getLayoutDirection(), soh.L(this).U);
            }
            n.F = a;
            if (this.N.I.getValue() == null) {
                this.q1(soh.M(this).getGraphicsContext().c());
            }
            final g6b g6b = (g6b)this.N.I.getValue();
            if (g6b == null) {
                en9.q("Error: shared element does not have a layer for rendering in the overlay.");
                return;
            }
            cw8.Q0(k0d, g6b, (lta)new k10(k0d, c, this));
            final vrl n3 = this.N;
            if (n3.h().c.a().d() && (n3.j() || !n3.i())) {
                return;
            }
            r9n.p((cw8)k0d, g6b);
        }
    }
    
    @Override
    public final boolean T() {
        return this.N.m() && this.N.h().a() && this.N.h().b.a();
    }
    
    @Override
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final o8h u = goe.u(n);
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new yql(u, this));
    }
    
    @Override
    public final void g1() {
        yi2.I(this, this.N.h().i);
        this.r1();
        this.N.v.setValue((Object)Boolean.TRUE);
    }
    
    @Override
    public final void h1() {
        final nzc a = this.N.h().b.A;
        if (a != null) {
            k2j f;
            if (a.p() && this.M) {
                f = rml.f(l6g.h(soh.K(this).N(0L), a.N(0L)), uoo.Z(((o8h)soh.K(this)).x));
            }
            else {
                f = null;
            }
            this.L = f;
        }
        this.q1(null);
        final vrl n = this.N;
        if (!mlc.q(n.G, null)) {
            n.G = null;
            final hsg c = n.h().b.C;
            c.i(c.h() + 1);
        }
        final vrl n2 = this.N;
        n2.H = null;
        n2.v.setValue((Object)Boolean.FALSE);
        this.M = false;
    }
    
    @Override
    public final void i1() {
        this.L = null;
        this.q1(null);
    }
    
    @Override
    public final r9n m0() {
        return (r9n)this.O;
    }
    
    public final hsl o1() {
        if (super.I) {
            return (hsl)this.P(e98.a);
        }
        return null;
    }
    
    public final nzc p1() {
        final nzc a = this.N.h().b.A;
        if (a != null) {
            return a;
        }
        en9.s("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }
    
    public final void q1(final g6b value) {
        final g6b g6b = (g6b)this.N.I.getValue();
        if (!mlc.q(value, g6b)) {
            if (g6b != null) {
                soh.M(this).getGraphicsContext().a(g6b);
            }
            this.N.I.setValue((Object)value);
        }
    }
    
    public final void r1() {
        final tei a = srl.a;
        final vrl n = this.N;
        final t89 h = t89.h;
        final kzl o = this.O;
        if (o == h) {
            gac.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!o.o(a)) {
            final StringBuilder sb = new StringBuilder("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ");
            sb.append((Object)a);
            sb.append(" was not found.");
            gac.a(sb.toString());
        }
        o.Y(a, (Object)n);
        final vrl n2 = this.N;
        final vrl g = (vrl)this.P(a);
        if (!mlc.q(n2.G, g)) {
            n2.G = g;
            final hsg c = n2.h().b.C;
            c.i(c.h() + 1);
        }
        this.q1(null);
        this.M = false;
        this.N.H = this;
    }
}
