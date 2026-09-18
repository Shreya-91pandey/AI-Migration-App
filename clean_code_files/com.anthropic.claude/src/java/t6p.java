public final class t6p
{
    public final ig0 a;
    public final u09 b;
    
    public t6p(final ig0 a, final u09 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof t6p) {
            final t6p t6p = (t6p)o;
            if (mlc.q(this.a, t6p.a)) {
                if (mlc.q(this.b, t6p.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(0) + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VectorizedKeyframeSpecElementInfo(vectorValue=");
        sb.append((Object)this.a);
        sb.append(", easing=");
        sb.append((Object)this.b);
        sb.append(", arcMode=ArcMode(value=0))");
        return sb.toString();
    }
}
