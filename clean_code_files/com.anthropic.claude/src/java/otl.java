final class otl extends ogf
{
    public final itl v;
    
    public otl(final itl v) {
        this.v = v;
    }
    
    @Override
    public final hgf create() {
        final hgf hgf = new hgf();
        ((ptl)hgf).J = this.v;
        return hgf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof otl && mlc.q(this.v, ((otl)o).v));
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SharedTransitionScopeRootModifierElement(sharedTransitionScope=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final void update(final hgf hgf) {
        final ptl ptl = (ptl)hgf;
        final itl j = ptl.J;
        final itl v = this.v;
        if (!mlc.q(v, j)) {
            yi2.I(ptl, v.z);
        }
        ptl.J = v;
    }
}
