public final class e0k implements o6p
{
    public final int v;
    public final long w;
    public final long x;
    public final Object y;
    
    public e0k(final q6p y, int g, final long n) {
        this.y = y;
        this.v = g;
        g = y.g();
        this.w = (y.h() + g) * 1000000L;
        this.x = n * 1000000L;
    }
    
    public e0k(final rjc y, final long w, final long x, final int v) {
        this.y = y;
        this.w = w;
        this.x = x;
        this.v = v;
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    public long b(long n) {
        n += this.x;
        if (n <= 0L) {
            return 0L;
        }
        final long w = this.w;
        final long n2 = n / w;
        if (this.v != 1 && n2 % 2L != 0L) {
            return (n2 + 1L) * w - n;
        }
        return n - n2 * w;
    }
    
    public ig0 c(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        final long x = this.x;
        final long w = this.w;
        if (n + x > w) {
            return ((q6p)this.y).e(w - x, ig0, ig3, ig2);
        }
        return ig2;
    }
    
    @Override
    public long d(final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return Long.MAX_VALUE;
    }
    
    @Override
    public ig0 e(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((q6p)this.y).e(this.b(n), ig0, ig2, this.c(n, ig0, ig3, ig2));
    }
    
    @Override
    public ig0 i(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((q6p)this.y).i(this.b(n), ig0, ig2, this.c(n, ig0, ig3, ig2));
    }
}
