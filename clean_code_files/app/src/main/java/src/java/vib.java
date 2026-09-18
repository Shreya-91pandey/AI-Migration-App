final class vib extends ogf
{
    public final mnn v;
    public final int w;
    public final int x;
    
    public vib(final mnn v, final int w, final int x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((wib)hgf).J = this.v;
        ((wib)hgf).K = this.w;
        ((wib)hgf).L = this.x;
        ((wib)hgf).N = -1;
        ((wib)hgf).O = -1;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vib)) {
            return false;
        }
        final vib vib = (vib)o;
        return mlc.q((Object)this.v, (Object)vib.v) && this.w == vib.w && this.x == vib.x;
    }
    
    public final int hashCode() {
        return (this.v.hashCode() * 31 + this.w) * 31 + this.x;
    }
    
    public final void update(final hgf hgf) {
        final wib wib = (wib)hgf;
        final mnn j = wib.J;
        final mnn v = this.v;
        final boolean q = mlc.q((Object)j, (Object)v);
        final int w = this.w;
        final int x = this.x;
        if (q && wib.K == w && wib.L == x) {
            return;
        }
        wib.J = v;
        wib.K = w;
        wib.L = x;
        wib.P = k8e.F(v, soh.L((t98)wib).V);
        wib.M = true;
        soh.L((t98)wib).R();
    }
}
