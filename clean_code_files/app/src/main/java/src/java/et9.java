public final class et9 implements d1q
{
    public final d1q a;
    public final d1q b;
    
    public et9(final d1q a, final d1q b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final xc8 xc8) {
        final int n = this.a.a(xc8) - this.b.a(xc8);
        if (n < 0) {
            return 0;
        }
        return n;
    }
    
    @Override
    public final int b(final xc8 xc8, final qzc qzc) {
        final int n = this.a.b(xc8, qzc) - this.b.b(xc8, qzc);
        if (n < 0) {
            return 0;
        }
        return n;
    }
    
    @Override
    public final int c(final xc8 xc8) {
        final int n = this.a.c(xc8) - this.b.c(xc8);
        if (n < 0) {
            return 0;
        }
        return n;
    }
    
    @Override
    public final int d(final xc8 xc8, final qzc qzc) {
        final int n = this.a.d(xc8, qzc) - this.b.d(xc8, qzc);
        if (n < 0) {
            return 0;
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof et9)) {
            return false;
        }
        final et9 et9 = (et9)o;
        return mlc.q((Object)et9.a, (Object)this.a) && mlc.q((Object)et9.b, (Object)this.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append((Object)this.a);
        sb.append(" - ");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
