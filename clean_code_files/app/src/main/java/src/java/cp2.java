public final class cp2
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    
    public cp2(final long a, final long b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final cp2 a(long a, long b, long c, long d) {
        if (a == 16L) {
            a = this.a;
        }
        if (b == 16L) {
            b = this.b;
        }
        if (c == 16L) {
            c = this.c;
        }
        if (d == 16L) {
            d = this.d;
        }
        return new cp2(a, b, c, d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (o instanceof cp2) {
                    final cp2 cp2 = (cp2)o;
                    final long a = cp2.a;
                    final int i = j86.i;
                    if (foo.a(this.a, a)) {
                        if (foo.a(this.b, cp2.b)) {
                            if (foo.a(this.c, cp2.c)) {
                                if (foo.a(this.d, cp2.d)) {
                                    return true;
                                }
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
        final int i = j86.i;
        return Long.hashCode(this.d) + hia.d(hia.d(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
