final class ge0<S> extends ogf
{
    public final veo v;
    public final bnf w;
    public final le0 x;
    
    public ge0(final veo v, final bnf w, final le0 x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    @Override
    public final hgf create() {
        return new je0(this.v, this.w, this.x);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ge0) {
            final ge0 ge0 = (ge0)o;
            if (mlc.q(ge0.v, this.v) && ge0.w.equals(this.w)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.x.hashCode();
        final veo v = this.v;
        int hashCode2;
        if (v != null) {
            hashCode2 = v.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return this.w.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final void update(final hgf hgf) {
        final je0 je0 = (je0)hgf;
        je0.J = this.v;
        je0.K = this.w;
        je0.L = this.x;
    }
}
