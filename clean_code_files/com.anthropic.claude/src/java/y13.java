public final class y13
{
    public xc8 a;
    public qzc b;
    public x13 c;
    public long d;
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof y13) {
                final y13 y13 = (y13)o;
                if (mlc.q((Object)this.a, (Object)y13.a)) {
                    if (this.b == y13.b) {
                        if (mlc.q((Object)this.c, (Object)y13.c)) {
                            if (yzl.b(this.d, y13.d)) {
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
        return Long.hashCode(this.d) + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final xc8 a = this.a;
        final qzc b = this.b;
        final x13 c = this.c;
        final String f = yzl.f(this.d);
        final StringBuilder sb = new StringBuilder("DrawParams(density=");
        sb.append((Object)a);
        sb.append(", layoutDirection=");
        sb.append((Object)b);
        sb.append(", canvas=");
        sb.append((Object)c);
        sb.append(", size=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
