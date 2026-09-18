public final class cv8
{
    public final long a;
    public final long b;
    public final long c;
    
    public cv8(final long a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (o instanceof cv8) {
                    final cv8 cv8 = (cv8)o;
                    if (us8.b(this.a, cv8.a)) {
                        if (us8.b(this.b, cv8.b)) {
                            if (us8.b(this.c, cv8.c)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.c) + hia.d(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
