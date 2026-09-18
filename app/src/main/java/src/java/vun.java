public final class vun
{
    public final jlf a;
    public uun b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;
    
    public vun() {
        final jlf a = tgc.a;
        this.a = new jlf();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }
    
    public static long a(final uun uun, final long n, final long n2, final float[] array, final long h, final long n3) {
        final long n4 = uun.b;
        if (n4 > 0L) {
            final long i = uun.i;
            if (i > 0L) {
                if (h - i >= n4) {
                    uun.h = h;
                    uun.i = -1L;
                    uun.a(uun.f, uun.g, n, n2, array);
                    return n3;
                }
                return Math.min(n3, i + n4);
            }
        }
        return n3;
    }
    
    public final void b(final uun uun, long c, final long n, final float[] array, final long n2) {
        final long h = uun.h;
        final long n3 = uun.b;
        final boolean b = n2 - h > 0L || h == Long.MIN_VALUE;
        final boolean b2 = n3 == 0L;
        uun.i = n2;
        if (b && b2) {
            uun.h = n2;
            uun.a(uun.f, uun.g, c, n, array);
        }
        if (!b2) {
            c = this.c;
            if (c > 0L && n2 + n3 < c) {
                this.c = c;
            }
        }
    }
    
    public final boolean c(long n, final long d, final float[] g, final int n2, final int n3) {
        boolean b;
        if (!ugc.b(d, this.d)) {
            this.d = d;
            b = true;
        }
        else {
            b = false;
        }
        if (!ugc.b(n, this.e)) {
            this.e = n;
            b = true;
        }
        if (g != null) {
            this.g = g;
            b = true;
        }
        n = ((long)n2 << 32 | ((long)n3 & 0xFFFFFFFFL));
        if (n != this.f) {
            this.f = n;
            return true;
        }
        return b;
    }
}
