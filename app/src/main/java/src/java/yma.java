final class yma extends ogf
{
    public final xma v;
    
    public yma(final xma v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((ana)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof yma && mlc.q((Object)this.v, (Object)((yma)o).v));
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FocusRequesterElement(focusRequester=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final ana ana = (ana)hgf;
        ana.J.a.k(ana);
        final xma v = this.v;
        ana.J = v;
        v.a.b(ana);
    }
}
