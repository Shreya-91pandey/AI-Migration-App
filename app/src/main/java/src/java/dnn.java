public final class dnn
{
    public static final long b;
    public static final int c = 0;
    public final long a = a;
    
    static {
        b = rhc.c(0, 0);
    }
    
    public static final boolean a(final long n, final long n2) {
        final int g = g(n);
        final int g2 = g(n2);
        boolean b = false;
        final boolean b2 = g <= g2;
        if (f(n2) <= f(n)) {
            b = true;
        }
        return b2 & b;
    }
    
    public static boolean b(final long n, final Object o) {
        return o instanceof dnn && n == ((dnn)o).a;
    }
    
    public static final boolean c(final long n, final long n2) {
        return n == n2;
    }
    
    public static final boolean d(final long n) {
        return (int)(n >> 32) == (int)(n & 0xFFFFFFFFL);
    }
    
    public static final int e(final long n) {
        return f(n) - g(n);
    }
    
    public static final int f(final long n) {
        return Math.max((int)(n >> 32), (int)(n & 0xFFFFFFFFL));
    }
    
    public static final int g(final long n) {
        return Math.min((int)(n >> 32), (int)(n & 0xFFFFFFFFL));
    }
    
    public static final boolean h(final long n) {
        return (int)(n >> 32) > (int)(n & 0xFFFFFFFFL);
    }
    
    public static String i(final long n) {
        return hia.g((int)(n >> 32), (int)(n & 0xFFFFFFFFL), "TextRange(", ", ", ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return b(this.a, o);
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return i(this.a);
    }
}
