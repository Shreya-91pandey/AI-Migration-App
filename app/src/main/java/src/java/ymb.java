final class ymb extends ogf
{
    public final llf v;
    
    public ymb(final llf v) {
        this.v = v;
    }
    
    @Override
    public final hgf create() {
        final hgf hgf = new hgf();
        ((cnb)hgf).J = this.v;
        return hgf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ymb && mlc.q(((ymb)o).v, this.v));
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode() * 31;
    }
    
    @Override
    public final void update(final hgf hgf) {
        final cnb cnb = (cnb)hgf;
        final llf j = cnb.J;
        final llf v = this.v;
        if (!mlc.q(j, v)) {
            cnb.q1();
            cnb.J = v;
        }
    }
}
