public final class us8
{
    public final long a = a;
    
    public static long a(final long n, float d, float c, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            d = d(n);
        }
        if ((n2 & 0x2) != 0x0) {
            c = c(n);
        }
        return (long)Float.floatToRawIntBits(d) << 32 | ((long)Float.floatToRawIntBits(c) & 0xFFFFFFFFL);
    }
    
    public static final boolean b(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float c(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static final float d(final long n) {
        return Float.intBitsToFloat((int)(n >> 32));
    }
    
    public static String e(final long n) {
        if (n != 9205357640488583168L) {
            return hia.k(qs8.f(d(n)), " x ", qs8.f(c(n)));
        }
        return "DpSize.Unspecified";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof us8) {
            if (this.a == ((us8)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return e(this.a);
    }
}
