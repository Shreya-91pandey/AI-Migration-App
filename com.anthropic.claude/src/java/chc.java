public final class chc
{
    public final long a = a;
    
    public static boolean a(final long n, final Object o) {
        return o instanceof chc && n == ((chc)o).a;
    }
    
    public static final boolean b(final long n, final long n2) {
        return n == n2;
    }
    
    public static String c(final long n) {
        final int n2 = (int)(n >> 32);
        final int n3 = (int)(n & 0xFFFFFFFFL);
        final StringBuilder sb = new StringBuilder();
        sb.append(n2);
        sb.append(" x ");
        sb.append(n3);
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return a(this.a, o);
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return c(this.a);
    }
}
