public final class nfo extends r7m
{
    public final r7m e;
    public final boolean f;
    public final boolean g;
    public lta h;
    public final long i;
    
    public nfo(final r7m e, final lta lta, final boolean f, final boolean g) {
        final cyl a = g8m.a;
        super(0L, e8m.z);
        this.e = e;
        this.f = f;
        this.g = g;
        lta lta2;
        if (e == null || (lta2 = e.e()) == null) {
            lta2 = g8m.j.e;
        }
        this.h = g8m.i(lta, lta2, f);
        this.i = eqi.T();
    }
    
    @Override
    public final void c() {
        super.c = true;
        if (this.g) {
            final r7m e = this.e;
            if (e != null) {
                e.c();
            }
        }
    }
    
    @Override
    public final e8m d() {
        return this.v().d();
    }
    
    @Override
    public final lta e() {
        return this.h;
    }
    
    @Override
    public final boolean f() {
        return this.v().f();
    }
    
    @Override
    public final long g() {
        return this.v().g();
    }
    
    @Override
    public final lta i() {
        return null;
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
        this.v().m();
    }
    
    @Override
    public final void n(final jpm jpm) {
        this.v().n(jpm);
    }
    
    @Override
    public final r7m u(lta i) {
        i = g8m.i(i, this.h, true);
        if (!this.f) {
            return g8m.e(this.v().u(null), i, true);
        }
        return this.v().u(i);
    }
    
    public final r7m v() {
        r7m r7m;
        if ((r7m = this.e) == null) {
            r7m = g8m.j;
        }
        return r7m;
    }
}
