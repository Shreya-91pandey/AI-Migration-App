final class lj2 extends ogf
{
    public final gx v;
    public final boolean w;
    
    public lj2(final gx v, final boolean w) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((mj2)hgf).J = this.v;
        ((mj2)hgf).K = this.w;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            lj2 lj2;
            if (o instanceof lj2) {
                lj2 = (lj2)o;
            }
            else {
                lj2 = null;
            }
            if (lj2 != null) {
                if (mlc.q((Object)this.v, (Object)lj2.v) && this.w == lj2.w) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.w) + this.v.hashCode() * 31;
    }
    
    public final void update(final hgf hgf) {
        final mj2 mj2 = (mj2)hgf;
        mj2.J = this.v;
        mj2.K = this.w;
    }
}
