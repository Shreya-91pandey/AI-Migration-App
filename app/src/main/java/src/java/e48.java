public final class e48
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    
    public e48(final long a, final long b, final long c, final long d, final long e, final long f, final long g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof e48) {
            final e48 e48 = (e48)o;
            final long a = e48.a;
            final int i = j86.i;
            if (foo.a(this.a, a)) {
                if (foo.a(this.b, e48.b)) {
                    if (foo.a(this.c, e48.c)) {
                        if (foo.a(this.d, e48.d)) {
                            if (foo.a(this.e, e48.e)) {
                                if (foo.a(this.f, e48.f)) {
                                    if (foo.a(this.g, e48.g)) {
                                        return foo.a(this.h, e48.h);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int i = j86.i;
        return Long.hashCode(this.h) + hia.d(hia.d(hia.d(hia.d(hia.d(hia.d(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }
}
