public final class vj implements d1q
{
    public final d1q a;
    public final ing b;
    
    public vj(final d1q a, final ing b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final xc8 xc8) {
        return this.b.a(xc8) + this.a.a(xc8);
    }
    
    @Override
    public final int b(final xc8 xc8, final qzc qzc) {
        return this.b.b(xc8, qzc) + this.a.b(xc8, qzc);
    }
    
    @Override
    public final int c(final xc8 xc8) {
        return this.b.c(xc8) + this.a.c(xc8);
    }
    
    @Override
    public final int d(final xc8 xc8, final qzc qzc) {
        return this.b.d(xc8, qzc) + this.a.d(xc8, qzc);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof vj) {
                final vj vj = (vj)o;
                if (mlc.q((Object)vj.a, (Object)this.a) && vj.b.equals(this.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.a.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append((Object)this.a);
        sb.append(" + ");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
