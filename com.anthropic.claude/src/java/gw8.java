final class gw8 extends ogf
{
    public final lta v;
    
    public gw8(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((hw8)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof gw8 && this.v == ((gw8)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((hw8)hgf).J = this.v;
    }
}
