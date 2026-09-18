final class pd0 extends ogf
{
    public final wfk v;
    public final qun w;
    public final alo x;
    
    public pd0(final wfk v, final qun w, final alo x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((rd0)hgf).J = this.v;
        ((rd0)hgf).K = this.w;
        ((rd0)hgf).L = true;
        ((rd0)hgf).M = -9223372034707292160L;
        ((rd0)hgf).N = -9223372034707292160L;
        ((rd0)hgf).O = new jcn((cg0)this.x, (dlo)yi2.e, (Object)(-1.0f), (Object)1.0f, (ig0)null);
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof pd0) {
                final pd0 pd0 = (pd0)o;
                if (this.v == pd0.v) {
                    if (this.w != pd0.w) {
                        return false;
                    }
                    if (this.x.equals((Object)pd0.x)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return x90.c.hashCode() + (this.x.hashCode() + (this.w.hashCode() + (this.v.hashCode() + Boolean.hashCode(true) * 31) * 31) * 31) * 31;
    }
    
    public final void update(final hgf hgf) {
        final rd0 rd0 = (rd0)hgf;
        rd0.J = this.v;
        rd0.K = this.w;
        rd0.L = true;
        rd0.O = new jcn((cg0)this.x, (dlo)yi2.e, (Object)(-1.0f), (Object)1.0f, (ig0)null);
    }
}
