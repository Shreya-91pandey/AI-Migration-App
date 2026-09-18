public final class wia implements mia
{
    public final int a;
    public final u09 b;
    public final long c;
    public final long d;
    
    public wia(final int a, final int n, final u09 b) {
        this.a = a;
        this.b = b;
        this.c = a * 1000000L;
        this.d = n * 1000000L;
    }
    
    @Override
    public final float b(long n, final float n2, final float n3, final float n4) {
        if ((n -= this.d) < 0L) {
            n = 0L;
        }
        final long c = this.c;
        if (n > c) {
            n = c;
        }
        if (n == 0L) {
            return n4;
        }
        return (this.e(n, n2, n3, n4) - this.e(n - 1000000L, n2, n3, n4)) * 1000.0f;
    }
    
    @Override
    public final long c(final float n, final float n2, final float n3) {
        return this.d + this.c;
    }
    
    @Override
    public final float e(long n, final float n2, final float n3, float a) {
        if ((n -= this.d) < 0L) {
            n = 0L;
        }
        final long c = this.c;
        long n4 = n;
        if (n > c) {
            n4 = c;
        }
        if (this.a == 0) {
            a = 1.0f;
        }
        else {
            a = n4 / (float)c;
        }
        a = this.b.a(a);
        return n3 * a + (1.0f - a) * n2;
    }
}
