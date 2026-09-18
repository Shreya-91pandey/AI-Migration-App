final class rzc extends ogf
{
    public final bua v;
    
    public rzc(final bua v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((yzc)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof rzc && this.v == ((rzc)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((yzc)hgf).J = this.v;
    }
}
