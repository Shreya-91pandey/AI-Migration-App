public final class oma extends ogf
{
    public final pma v;
    
    public oma(final pma v) {
        this.v = v;
    }
    
    public final hgf create() {
        return this.v.c;
    }
    
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    public final int hashCode() {
        return this.v.c.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final gna gna = (gna)hgf;
    }
}
