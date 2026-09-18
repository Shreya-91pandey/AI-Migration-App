public final class iqo implements d1q
{
    public final d1q a;
    public final d1q b;
    
    public iqo(final d1q a, final d1q b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final xc8 xc8) {
        return Math.max(this.a.a(xc8), this.b.a(xc8));
    }
    
    @Override
    public final int b(final xc8 xc8, final qzc qzc) {
        return Math.max(this.a.b(xc8, qzc), this.b.b(xc8, qzc));
    }
    
    @Override
    public final int c(final xc8 xc8) {
        return Math.max(this.a.c(xc8), this.b.c(xc8));
    }
    
    @Override
    public final int d(final xc8 xc8, final qzc qzc) {
        return Math.max(this.a.d(xc8, qzc), this.b.d(xc8, qzc));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof iqo)) {
            return false;
        }
        final iqo iqo = (iqo)o;
        return mlc.q((Object)iqo.a, (Object)this.a) && mlc.q((Object)iqo.b, (Object)this.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append((Object)this.a);
        sb.append(" \u222a ");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
