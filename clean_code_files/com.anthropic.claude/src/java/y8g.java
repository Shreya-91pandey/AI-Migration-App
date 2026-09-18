final class y8g extends ogf
{
    public final lta v;
    
    public y8g(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((z8g)hgf).J = this.v;
        ((z8g)hgf).K = -9223372034707292160L;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof y8g && this.v == ((y8g)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final z8g z8g = (z8g)hgf;
        z8g.J = this.v;
        z8g.K = -9223372034707292160L;
    }
}
