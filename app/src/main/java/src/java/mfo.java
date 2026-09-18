public final class mfo extends zmf
{
    public final zmf o;
    public final boolean p;
    public final boolean q;
    public lta r;
    public lta s;
    public final long t;
    
    public mfo(final zmf o, lta lta, final lta lta2, final boolean p5, final boolean q) {
        final cyl a = g8m.a;
        lta lta3;
        if (o == null || (lta3 = o.y()) == null) {
            lta3 = g8m.j.e;
        }
        final lta i = g8m.i(lta, lta3, p5);
        if (o == null || (lta = o.i()) == null) {
            lta = g8m.j.f;
        }
        lta = g8m.j(lta2, lta);
        super(0L, e8m.z, i, lta);
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = super.e;
        this.s = super.f;
        this.t = eqi.T();
    }
    
    @Override
    public final void B(final umf umf) {
        twl.Z();
        throw null;
    }
    
    @Override
    public final zmf C(lta i, lta j) {
        i = g8m.i(i, this.r, true);
        j = g8m.j(j, this.s);
        if (!this.p) {
            return new mfo(this.D().C(null, j), i, j, false, true);
        }
        return this.D().C(i, j);
    }
    
    public final zmf D() {
        zmf zmf;
        if ((zmf = this.o) == null) {
            zmf = g8m.j;
        }
        return zmf;
    }
    
    @Override
    public final void c() {
        super.c = true;
        if (this.q) {
            final zmf o = this.o;
            if (o != null) {
                o.c();
            }
        }
    }
    
    @Override
    public final e8m d() {
        return this.D().d();
    }
    
    @Override
    public final lta e() {
        return this.r;
    }
    
    @Override
    public final boolean f() {
        return this.D().f();
    }
    
    @Override
    public final long g() {
        return this.D().g();
    }
    
    @Override
    public final int h() {
        return this.D().h();
    }
    
    @Override
    public final lta i() {
        return this.s;
    }
    
    @Override
    public final void k() {
        twl.Z();
        throw null;
    }
    
    @Override
    public final void l() {
        twl.Z();
        throw null;
    }
    
    @Override
    public final void m() {
        this.D().m();
    }
    
    @Override
    public final void n(final jpm jpm) {
        this.D().n(jpm);
    }
    
    @Override
    public final void r(final e8m e8m) {
        twl.Z();
        throw null;
    }
    
    @Override
    public final void s(final long n) {
        twl.Z();
        throw null;
    }
    
    @Override
    public final void t(final int n) {
        this.D().t(n);
    }
    
    @Override
    public final r7m u(lta i) {
        i = g8m.i(i, this.r, true);
        if (!this.p) {
            return g8m.e(this.D().u(null), i, true);
        }
        return this.D().u(i);
    }
    
    @Override
    public final uoo w() {
        return this.D().w();
    }
    
    @Override
    public final umf x() {
        return this.D().x();
    }
    
    @Override
    public final lta y() {
        return this.r;
    }
}
