public final class m0q
{
    public final c3q a;
    public final bhh b;
    
    public m0q(final c3q a, final bhh b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof m0q) {
                final m0q m0q = (m0q)o;
                if (this.a.equals((Object)m0q.a)) {
                    if (this.b.equals(m0q.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WindowAdaptiveInfo(windowSizeClass=");
        sb.append((Object)this.a);
        sb.append(", windowPosture=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
