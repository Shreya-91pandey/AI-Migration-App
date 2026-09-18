public final class tsi extends r7m
{
    public final lta e;
    public int f;
    
    public tsi(final long n, final e8m e8m, final lta e) {
        super(n, e8m);
        this.e = e;
        this.f = 1;
    }
    
    @Override
    public final void c() {
        if (!super.c) {
            this.l();
            super.c = true;
            final Object c = g8m.c;
            synchronized (c) {
                this.o();
            }
        }
    }
    
    @Override
    public final lta e() {
        return this.e;
    }
    
    @Override
    public final boolean f() {
        return true;
    }
    
    @Override
    public final lta i() {
        return null;
    }
    
    @Override
    public final void k() {
        ++this.f;
    }
    
    @Override
    public final void l() {
        final int f = this.f - 1;
        this.f = f;
        if (f == 0) {
            this.a();
        }
    }
    
    @Override
    public final void m() {
    }
    
    @Override
    public final void n(final jpm jpm) {
        final cyl a = g8m.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }
    
    @Override
    public final r7m u(final lta lta) {
        g8m.v(this);
        return new wrf(super.b, super.a, g8m.i(lta, this.e, true), this);
    }
}
