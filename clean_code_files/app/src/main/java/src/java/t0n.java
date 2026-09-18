final class t0n extends ogf
{
    public final jta v;
    
    public t0n(final jta v) {
        this.v = v;
    }
    
    public final hgf create() {
        return (hgf)new u0n(this.v);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof t0n && this.v == ((t0n)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((u0n)hgf).L = this.v;
    }
}
