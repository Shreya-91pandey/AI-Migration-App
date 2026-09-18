public final class g8p extends ogf
{
    public final lb2 v;
    
    public g8p(final lb2 v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((h8p)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        g8p g8p;
        if (o instanceof g8p) {
            g8p = (g8p)o;
        }
        else {
            g8p = null;
        }
        return g8p != null && this.v.equals((Object)g8p.v);
    }
    
    public final int hashCode() {
        return Float.hashCode(this.v.a);
    }
    
    public final void update(final hgf hgf) {
        ((h8p)hgf).J = this.v;
    }
}
