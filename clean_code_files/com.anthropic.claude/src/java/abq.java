final class abq extends ogf
{
    public final float v;
    public final Object w;
    
    public abq(final float v, final Object w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final hgf create() {
        final hgf hgf = new hgf();
        ((bbq)hgf).J = this.v;
        ((bbq)hgf).K = this.w;
        return hgf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof abq) {
            final abq abq = (abq)o;
            if (abq.v == this.v && mlc.q(abq.w, this.w)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Float.hashCode(this.v);
        final Object w = this.w;
        int hashCode2;
        if (w != null) {
            hashCode2 = w.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final void update(final hgf hgf) {
        final bbq bbq = (bbq)hgf;
        bbq.J = this.v;
        bbq.K = this.w;
    }
}
