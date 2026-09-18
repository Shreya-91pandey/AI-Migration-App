public final class arl extends ogf
{
    public final vrl v;
    
    public arl(final vrl v) {
        this.v = v;
    }
    
    @Override
    public final hgf create() {
        return new zql(this.v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof arl && this.v == ((arl)o).v);
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SharedBoundsNodeElement(sharedElementState=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final void update(final hgf hgf) {
        final zql zql = (zql)hgf;
        final vrl n = zql.N;
        final vrl v = this.v;
        if (v != n) {
            n.v.setValue((Object)Boolean.FALSE);
            zql.N = v;
            v.v.setValue((Object)zql.I);
            if (zql.I) {
                zql.r1();
            }
        }
    }
}
