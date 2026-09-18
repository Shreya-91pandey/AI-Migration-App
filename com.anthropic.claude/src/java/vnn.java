public final class vnn
{
    public static final wnn[] b;
    public static final long c;
    public final long a = a;
    
    static {
        b = new wnn[] { new wnn(0L), new wnn(4294967296L), new wnn(8589934592L) };
        c = tsf.Q(Float.NaN, 0L);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final long b(final long n) {
        return vnn.b[(int)((n & 0xFF00000000L) >>> 32)].a;
    }
    
    public static final float c(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static final boolean d(final long n) {
        return (n & 0xFF00000000L) == 0x200000000L;
    }
    
    public static final boolean e(final long n) {
        return (n & 0xFF00000000L) == 0x100000000L;
    }
    
    public static String f(final long n) {
        final long b = b(n);
        if (wnn.a(b, 0L)) {
            return "Unspecified";
        }
        if (wnn.a(b, 4294967296L)) {
            final float c = c(n);
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(".sp");
            return sb.toString();
        }
        if (wnn.a(b, 8589934592L)) {
            final float c2 = c(n);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(c2);
            sb2.append(".em");
            return sb2.toString();
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof vnn) {
            if (this.a == ((vnn)o).a) {
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
        return f(this.a);
    }
}
