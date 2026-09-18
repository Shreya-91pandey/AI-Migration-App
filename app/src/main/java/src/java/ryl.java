public final class ryl extends ogf
{
    public final aql v;
    public final qpl w;
    
    public ryl(final aql v, final qpl w) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((syl)hgf).J = this.v;
        ((syl)hgf).K = this.w;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ryl)) {
            return false;
        }
        final ryl ryl = (ryl)o;
        return mlc.q((Object)this.v, (Object)ryl.v) && mlc.q((Object)this.w, (Object)ryl.w);
    }
    
    public final int hashCode() {
        return this.w.hashCode() + this.v.hashCode() * 31;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SimpleDropShadowElement(shape=");
        sb.append((Object)this.v);
        sb.append(", shadow=");
        sb.append((Object)this.w);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final syl syl = (syl)hgf;
        final aql j = syl.J;
        final aql v = this.v;
        final boolean q = mlc.q((Object)j, (Object)v);
        final qpl w = this.w;
        if (!q || !mlc.q((Object)syl.K, (Object)w)) {
            syl.L = null;
        }
        syl.J = v;
        syl.K = w;
    }
}
