final class wp8 extends ogf
{
    public final z3d v;
    
    public wp8(final z3d v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((xp8)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wp8 && mlc.q((Object)this.v, (Object)((wp8)o).v));
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DisplayingDisappearingItemsElement(animator=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final xp8 j = (xp8)hgf;
        final z3d i = j.J;
        final z3d v = this.v;
        if (!mlc.q((Object)i, (Object)v) && j.v.I) {
            final z3d k = j.J;
            k.e();
            k.b = null;
            k.c = -1;
            v.j = j;
            j.J = v;
        }
    }
}
