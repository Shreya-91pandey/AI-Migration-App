public final class ygc
{
    public static final ygc e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        e = new ygc(0, 0, 0, 0);
    }
    
    public ygc(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static ygc a(final ygc ygc, int a, int b, int c, int d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = ygc.a;
        }
        if ((n & 0x2) != 0x0) {
            b = ygc.b;
        }
        if ((n & 0x4) != 0x0) {
            c = ygc.c;
        }
        if ((n & 0x8) != 0x0) {
            d = ygc.d;
        }
        ygc.getClass();
        return new ygc(a, b, c, d);
    }
    
    public final long b() {
        return ((long)(this.c() / 2 + this.b) & 0xFFFFFFFFL) | (long)(this.f() / 2 + this.a) << 32;
    }
    
    public final int c() {
        return this.d - this.b;
    }
    
    public final long d() {
        return (long)this.f() << 32 | ((long)this.c() & 0xFFFFFFFFL);
    }
    
    public final long e() {
        return (long)this.a << 32 | ((long)this.b & 0xFFFFFFFFL);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ygc)) {
            return false;
        }
        final ygc ygc = (ygc)o;
        return this.a == ygc.a && this.b == ygc.b && this.c == ygc.c && this.d == ygc.d;
    }
    
    public final int f() {
        return this.c - this.a;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + hia.y(this.c, hia.y(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        return rua.h(this.c, this.d, ", ", ")", hia.o(this.a, this.b, "IntRect.fromLTRB(", ", ", ", "));
    }
}
