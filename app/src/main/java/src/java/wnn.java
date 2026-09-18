public final class wnn
{
    public final long a = a;
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static String b(final long n) {
        if (a(n, 0L)) {
            return "Unspecified";
        }
        if (a(n, 4294967296L)) {
            return "Sp";
        }
        if (a(n, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof wnn) {
            if (this.a == ((wnn)o).a) {
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
        return b(this.a);
    }
}
