public final class w0n extends ogf
{
    public final vs8 v;
    
    public w0n(final vs8 v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new vmb(o50.j, this.v);
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof w0n) {
                final w0n w0n = (w0n)o;
                final p90 j = o50.j;
                if (j.equals(j)) {
                    if (mlc.q((Object)this.v, (Object)w0n.v)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        int hashCode = 0;
        final int l = smk.l(1022 * 31, 31, false);
        final vs8 v = this.v;
        if (v != null) {
            hashCode = v.hashCode();
        }
        return l + hashCode;
    }
    
    public final String toString() {
        final p90 j = o50.j;
        final StringBuilder sb = new StringBuilder("StylusHoverIconModifierElement(icon=");
        sb.append((Object)j);
        sb.append(", overrideDescendants=false, touchBoundsExpansion=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final x0n x0n = (x0n)hgf;
        final p90 j = o50.j;
        if (!mlc.q((Object)x0n.K, (Object)j)) {
            x0n.K = j;
            if (x0n.L) {
                x0n.q1();
            }
        }
        x0n.J = this.v;
    }
}
