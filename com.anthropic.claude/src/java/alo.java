public final class alo implements mz8
{
    public final int a;
    public final int b;
    public final u09 c;
    
    public alo(final int a, final int b, final u09 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public alo(final int n, u09 a, final int n2) {
        if ((n2 & 0x4) != 0x0) {
            a = x09.a;
        }
        this(n, 0, a);
    }
    
    @Override
    public final o6p a(final dlo dlo) {
        return new fc2(this.a, this.b, this.c);
    }
    
    @Override
    public final q6p a(final dlo dlo) {
        return new fc2(this.a, this.b, this.c);
    }
    
    @Override
    public final r6p a(final dlo dlo) {
        return new fc2(this.a, this.b, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof alo) {
            final alo alo = (alo)o;
            if (alo.a == this.a && alo.b == this.b && mlc.q(alo.c, this.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.c.hashCode() + this.a * 31) * 31 + this.b;
    }
}
