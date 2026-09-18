public final class ugc
{
    public final long a = a;
    
    public static long a(int n, int n2, final int n3, long n4) {
        if ((n3 & 0x1) != 0x0) {
            n = (int)(n4 >> 32);
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = (int)(n4 & 0xFFFFFFFFL);
        }
        n4 = n;
        return ((long)n2 & 0xFFFFFFFFL) | n4 << 32;
    }
    
    public static final boolean b(final long n, final long n2) {
        return n == n2;
    }
    
    public static final long c(final long n, final long n2) {
        return (long)((int)(n >> 32) - (int)(n2 >> 32)) << 32 | ((long)((int)(n & 0xFFFFFFFFL) - (int)(n2 & 0xFFFFFFFFL)) & 0xFFFFFFFFL);
    }
    
    public static final long d(final long n, final long n2) {
        return (long)((int)(n >> 32) + (int)(n2 >> 32)) << 32 | ((long)((int)(n & 0xFFFFFFFFL) + (int)(n2 & 0xFFFFFFFFL)) & 0xFFFFFFFFL);
    }
    
    public static String e(final long n) {
        return hia.g((int)(n >> 32), (int)(n & 0xFFFFFFFFL), "(", ", ", ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ugc) {
            if (this.a == ((ugc)o).a) {
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
