final class xfo extends ogf
{
    public final p4d v;
    
    public xfo(final p4d v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((yfo)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof xfo && mlc.q((Object)this.v, (Object)((xfo)o).v));
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TraversablePrefetchStateModifierElement(prefetchState=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        ((yfo)hgf).J = this.v;
    }
}
