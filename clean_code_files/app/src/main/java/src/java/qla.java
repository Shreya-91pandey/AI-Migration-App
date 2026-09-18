final class qla extends ogf
{
    public final lta v;
    
    public qla(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((rla)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qla && this.v == ((qla)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((rla)hgf).J = this.v;
    }
}
