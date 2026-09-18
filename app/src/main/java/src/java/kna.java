final class kna extends ogf
{
    public final llf v;
    
    public kna(final llf v) {
        this.v = v;
    }
    
    @Override
    public final hgf create() {
        return new lna(this.v, null, 6);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kna && mlc.q(this.v, ((kna)o).v));
    }
    
    @Override
    public final int hashCode() {
        final llf v = this.v;
        if (v != null) {
            return v.hashCode();
        }
        return 0;
    }
    
    @Override
    public final void update(final hgf hgf) {
        ((lna)hgf).t1(this.v);
    }
}
