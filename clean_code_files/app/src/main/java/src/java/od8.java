public final class od8
{
    public static final od8 c;
    public final long a;
    public final long b;
    
    static {
        c = new od8(0L, 0L);
    }
    
    public od8(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof od8) {
                final od8 od8 = (od8)o;
                if (chc.b(this.a, od8.a)) {
                    if (us8.b(this.b, od8.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + Long.hashCode(this.a) * 31;
    }
}
