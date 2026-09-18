final class i8n extends ogf
{
    public final lta v;
    
    public i8n(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        final kec kec = new kec(ao2.y);
        ((j8n)kec).M = this.v;
        return kec;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof i8n) {
                if (this.v == ((i8n)o).v) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final j8n j8n = (j8n)hgf;
        final lta m = j8n.M;
        final lta v = this.v;
        if (m != v) {
            j8n.M = v;
            final l2q n = j8n.N;
            if (n != null) {
                final d1q l = (d1q)v.b((Object)n);
                if (!mlc.q((Object)l, (Object)j8n.L)) {
                    j8n.L = l;
                    j8n.p1();
                }
            }
        }
    }
}
