final class r6g extends ogf
{
    public final lta v;
    public final boolean w;
    
    public r6g(final lta v, final boolean w) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((s6g)hgf).J = this.v;
        ((s6g)hgf).K = this.w;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            r6g r6g;
            if (o instanceof r6g) {
                r6g = (r6g)o;
            }
            else {
                r6g = null;
            }
            if (r6g != null) {
                if (this.v == r6g.v && this.w == r6g.w) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.w) + this.v.hashCode() * 31;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append((Object)this.v);
        sb.append(", rtlAware=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final s6g s6g = (s6g)hgf;
        final lta j = s6g.J;
        final lta v = this.v;
        final boolean w = this.w;
        if (j != v || s6g.K != w) {
            soh.L((t98)s6g).s0(false);
        }
        s6g.J = v;
        s6g.K = w;
    }
}
