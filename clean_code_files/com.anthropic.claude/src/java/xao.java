public final class xao
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    
    public xao(final long a, final long b, final long c, final long d, final long e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final xao a(long a, long b, long c, long d, long e, long f) {
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
        if (e == 16L) {
            e = this.e;
        }
        if (f == 16L) {
            f = this.f;
        }
        return new xao(a, b, c, d, e, f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (o instanceof xao) {
                    final xao xao = (xao)o;
                    final long a = xao.a;
                    final int i = j86.i;
                    if (foo.a(this.a, a)) {
                        if (foo.a(this.b, xao.b)) {
                            if (foo.a(this.c, xao.c)) {
                                if (foo.a(this.d, xao.d)) {
                                    if (foo.a(this.e, xao.e)) {
                                        if (foo.a(this.f, xao.f)) {
                                            return true;
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
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int i = j86.i;
        return Long.hashCode(this.f) + hia.d(hia.d(hia.d(hia.d(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
