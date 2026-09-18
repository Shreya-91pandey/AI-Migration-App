final class zzl extends ogf
{
    public final bfa v;
    
    public zzl(final bfa v) {
        this.v = v;
    }
    
    @Override
    public final hgf create() {
        return new c0m(this.v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof zzl && mlc.q(((zzl)o).v, this.v)) {
            final mb2 x = wab.x;
            if (x.equals((Object)x)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.hashCode(-1.0f) + Float.hashCode(-1.0f) * 31 + this.v.hashCode() * 31) * 31;
    }
    
    @Override
    public final void update(final hgf hgf) {
        ((c0m)hgf).J = this.v;
    }
}
