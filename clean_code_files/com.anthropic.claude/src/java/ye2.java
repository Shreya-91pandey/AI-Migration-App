final class ye2 extends ogf
{
    public final lta v;
    
    public ye2(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new ze2(this.v);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ye2 && this.v == ((ye2)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final ze2 ze2 = (ze2)hgf;
        final lta v = this.v;
        ze2.J = v;
        if (ze2.v.I) {
            final yxf s = soh.J((t98)ze2, 2).S;
            if (s != null) {
                s.H1(v, true);
            }
        }
    }
}
