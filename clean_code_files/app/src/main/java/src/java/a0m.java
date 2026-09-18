public final class a0m
{
    public final id0 a;
    public long b;
    
    public a0m(final id0 a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof a0m) {
                final a0m a0m = (a0m)o;
                if (this.a != a0m.a) {
                    return false;
                }
                if (chc.b(this.b, a0m.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String c = chc.c(this.b);
        final StringBuilder sb = new StringBuilder("AnimData(anim=");
        sb.append((Object)this.a);
        sb.append(", startSize=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
