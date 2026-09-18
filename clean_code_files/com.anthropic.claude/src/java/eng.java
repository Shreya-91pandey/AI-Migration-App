final class eng extends ogf
{
    public final dng v;
    
    public eng(final dng v) {
        this.v = v;
    }
    
    public final hgf create() {
        final fec fec = new fec();
        ((fng)fec).L = this.v;
        return fec;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof eng && ((eng)o).v.equals(this.v));
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final fng fng = (fng)hgf;
        final dng l = fng.L;
        final dng v = this.v;
        if (!v.equals(l)) {
            fng.L = v;
            fng.p1();
        }
    }
}
