final class y7c extends ogf
{
    public final llf v;
    public final a8c w;
    
    public y7c(final llf v, final a8c w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final hgf create() {
        final t98 a = this.w.a(this.v);
        final v98 v98 = new v98();
        v98.o1(((z7c)v98).L = a);
        return v98;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y7c)) {
            return false;
        }
        final y7c y7c = (y7c)o;
        return mlc.q(this.v, y7c.v) && mlc.q(this.w, y7c.w);
    }
    
    @Override
    public final int hashCode() {
        return this.w.hashCode() + this.v.hashCode() * 31;
    }
    
    @Override
    public final void update(final hgf hgf) {
        final z7c z7c = (z7c)hgf;
        final t98 a = this.w.a(this.v);
        z7c.p1(z7c.L);
        z7c.o1(z7c.L = a);
    }
}
