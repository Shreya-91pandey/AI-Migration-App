public final class sr1 implements ur1
{
    public final long a;
    public final double b;
    public final long c;
    
    public sr1(final long a, final double b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final long a(final int n) {
        double n2 = (double)this.a;
        for (int i = 0; i < n; ++i) {
            n2 *= this.b;
        }
        final long n3 = (long)n2;
        final long c = this.c;
        if (n3 > c) {
            return c;
        }
        return n3;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sr1)) {
            return false;
        }
        final sr1 sr1 = (sr1)o;
        return this.a == sr1.a && Double.compare(this.b, sr1.b) == 0 && this.c == sr1.c;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.c) + idn.k(this.b, Long.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder u = smk.u(this.a, "Exponential(initialDelayMs=", ", factor=");
        u.append(this.b);
        u.append(", maxDelayMs=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}
