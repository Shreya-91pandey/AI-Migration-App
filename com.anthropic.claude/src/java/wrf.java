public final class wrf extends r7m
{
    public final lta e;
    public final r7m f;
    
    public wrf(final long n, final e8m e8m, final lta e, final r7m f) {
        super(n, e8m);
        this.e = e;
        (this.f = f).k();
    }
    
    @Override
    public final void c() {
        final r7m f = this.f;
        if (!super.c) {
            if (super.b != f.g()) {
                this.a();
            }
            f.l();
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
    public final r7m u(final lta lta) {
        return new wrf(super.b, super.a, g8m.i(lta, this.e, true), this.f);
    }
}
