final class vv6 extends ogf
{
    public final lta v;
    
    public vv6(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        final fec fec = new fec();
        ((wv6)fec).L = this.v;
        return fec;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vv6 && ((vv6)o).v == this.v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final wv6 wv6 = (wv6)hgf;
        final lta l = wv6.L;
        final lta v = this.v;
        if (v != l) {
            wv6.L = v;
            wv6.p1();
        }
    }
}
