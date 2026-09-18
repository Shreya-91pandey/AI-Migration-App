public final class bq4 extends ogf
{
    public final h74 v;
    
    public bq4(final h74 v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((aq4)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof bq4) {
                if (this.v == ((bq4)o).v) {
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
        final aq4 aq4 = (aq4)hgf;
        aq4.J = this.v;
        soh.L((t98)aq4).T();
    }
}
