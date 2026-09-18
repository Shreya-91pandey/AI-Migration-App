public abstract class r7m
{
    public e8m a;
    public long b;
    public boolean c;
    public int d;
    
    public r7m(long b, e8m d) {
        this.a = d;
        this.b = b;
        final cyl a = g8m.a;
        int d2 = 0;
        Label_0151: {
            if (b != 0L) {
                d = this.d();
                final long x = d.x;
                final long[] y = d.y;
                Label_0116: {
                    if (y != null) {
                        b = y[0];
                    }
                    else {
                        final long w = d.w;
                        if (w != 0L) {
                            d2 = Long.numberOfTrailingZeros(w);
                            b = x;
                        }
                        else {
                            final long v = d.v;
                            if (v == 0L) {
                                break Label_0116;
                            }
                            b = x + 64L;
                            d2 = Long.numberOfTrailingZeros(v);
                        }
                        b += d2;
                    }
                }
                final Object c = g8m.c;
                synchronized (c) {
                    d2 = g8m.f.a(b);
                    break Label_0151;
                }
            }
            d2 = -1;
        }
        this.d = d2;
    }
    
    public static void q(final r7m r7m) {
        g8m.b.l((Object)r7m);
    }
    
    public final void a() {
        final Object c = g8m.c;
        synchronized (c) {
            this.b();
            this.p();
        }
    }
    
    public void b() {
        g8m.d = g8m.d.d(this.g());
    }
    
    public abstract void c();
    
    public e8m d() {
        return this.a;
    }
    
    public abstract lta e();
    
    public boolean f() {
        return false;
    }
    
    public long g() {
        return this.b;
    }
    
    public int h() {
        return 0;
    }
    
    public lta i() {
        return null;
    }
    
    public final r7m j() {
        final tze b = g8m.b;
        final r7m r7m = (r7m)b.get();
        b.l((Object)this);
        return r7m;
    }
    
    public void k() {
        twl.Z();
        throw null;
    }
    
    public void l() {
        twl.Z();
        throw null;
    }
    
    public void m() {
    }
    
    public void n(final jpm jpm) {
        final cyl a = g8m.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }
    
    public final void o() {
        final int d = this.d;
        if (d >= 0) {
            g8m.t(d);
            this.d = -1;
        }
    }
    
    public void p() {
        this.o();
    }
    
    public void r(final e8m a) {
        this.a = a;
    }
    
    public void s(final long b) {
        this.b = b;
    }
    
    public void t(final int n) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }
    
    public abstract r7m u(final lta p0);
}
