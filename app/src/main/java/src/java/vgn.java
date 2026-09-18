public final class vgn extends v98 implements zl6, hgn
{
    public g66 L;
    public lta M;
    public lta N;
    public lta O;
    public wmm P;
    public final sd8 Q;
    public k2j R;
    
    public vgn(final g66 l, final lta m, final lta n, final lta o) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.Q = r8m.b((jta)new wfk((Object)this, (byte)13));
        this.R = k2j.e;
    }
    
    public final ggn f0() {
        return (ggn)this.Q.getValue();
    }
    
    public final void g1() {
        final g66 l = this.L;
        l.v = 3;
        l.w = this;
    }
    
    public final void h1() {
        final g66 l = this.L;
        l.v = 2;
        l.w = null;
    }
    
    public final long n(final nzc nzc) {
        return this.s(nzc).h();
    }
    
    public final k2j s(final nzc nzc) {
        if (!((hgf)this).I) {
            return this.R;
        }
        final k2j r = (k2j)this.O.b((Object)nzc);
        if (r == null) {
            return this.R;
        }
        return this.R = r;
    }
}
