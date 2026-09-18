public final class a7d extends hgf implements pbh, zl6, x2b
{
    public w70 J;
    public j7d K;
    public dkn L;
    public final ksg M;
    
    public a7d(final w70 j, final j7d k, final dkn l) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = o50.Q((Object)null);
    }
    
    public final void g1() {
        final w70 j = this.J;
        if (j.a != null) {
            jac.c("Expected textInputModifierNode to be null");
        }
        j.a = this;
    }
    
    public final void h1() {
        this.J.k(this);
    }
    
    public final void u0(final yxf value) {
        this.M.setValue((Object)value);
    }
}
