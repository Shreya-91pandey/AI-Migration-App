public abstract class o8h
{
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;
    
    public o8h() {
        this.x = 0L;
        this.y = p8h.b;
        this.z = 0L;
    }
    
    public int S(final hx hx) {
        return Integer.MIN_VALUE;
    }
    
    public int T() {
        return (int)(this.x & 0xFFFFFFFFL);
    }
    
    public int V() {
        return (int)(this.x >> 32);
    }
    
    public final void W() {
        this.v = ncq.o((int)(this.x >> 32), gv6.k(this.y), gv6.i(this.y));
        final int o = ncq.o((int)(this.x & 0xFFFFFFFFL), gv6.j(this.y), gv6.h(this.y));
        this.w = o;
        final int v = this.v;
        final long x = this.x;
        this.z = ((long)((v - (int)(x >> 32)) / 2) << 32 | (0xFFFFFFFFL & (long)((o - (int)(x & 0xFFFFFFFFL)) / 2)));
    }
    
    public void a0(final long n, final float n2, final lta lta) {
    }
    
    public void b0(final long n, final float n2, final g6b g6b) {
        this.a0(n, n2, null);
    }
    
    public final void c0(final long x) {
        if (!chc.b(this.x, x)) {
            this.x = x;
            this.W();
        }
    }
    
    public final void d0(final long y) {
        if (!gv6.c(this.y, y)) {
            this.y = y;
            this.W();
        }
    }
    
    public Object z() {
        return null;
    }
}
