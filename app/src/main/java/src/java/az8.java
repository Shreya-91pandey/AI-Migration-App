final class az8 extends ogf
{
    public final lta v;
    
    public az8(final lta v) {
        this.v = v;
    }
    
    @Override
    public final hgf create() {
        final vt8 a = vt4.a;
        final v98 v98 = new v98();
        ((xt8)v98).L = this.v;
        ((xt8)v98).M = (ut8)a;
        return v98;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof az8) {
                if (this.v == ((az8)o).v) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode() + vt4.a.hashCode() * 31;
    }
    
    @Override
    public final void update(final hgf hgf) {
        final xt8 xt8 = (xt8)hgf;
        final vt8 a = vt4.a;
        xt8.L = this.v;
        if (a != xt8.M) {
            final st8 n = xt8.N;
            if (n != null) {
                xt8.p1((t98)n);
            }
            xt8.M = (ut8)a;
            final st8 n2 = new st8(new tt8((Object)new i1((Object)xt8, (byte)26), (Object)a, (byte)0), 1);
            xt8.o1((t98)n2);
            xt8.N = n2;
        }
    }
}
