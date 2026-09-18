final class p8g extends ogf
{
    public final lta v;
    
    public p8g(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((q8g)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof p8g && this.v == ((p8g)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((q8g)hgf).J = this.v;
    }
}
