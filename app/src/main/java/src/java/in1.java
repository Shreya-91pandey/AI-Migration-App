public final class in1 extends hgf
{
    public uun J;
    public final jn1 K;
    
    public in1(final jn1 k) {
        this.K = k;
    }
    
    public final void g1() {
        final jn1 k = this.K;
        k.v = this;
        if (k.w != null) {
            this.J = pkq.i((hgf)this, 0L, (lta)new y((Object)this, (Object)k, (byte)18));
        }
    }
    
    public final void h1() {
        final jn1 k = this.K;
        if (k.v == this) {
            k.v = null;
        }
        final uun j = this.J;
        if (j != null) {
            j.b();
        }
        this.J = null;
    }
}
