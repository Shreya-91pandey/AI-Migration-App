final class quc extends ogf
{
    public final lta v;
    public final lta w;
    
    public quc(final lta v, final lta w) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((suc)hgf).J = this.v;
        ((suc)hgf).K = this.w;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof quc)) {
            return false;
        }
        final quc quc = (quc)o;
        return this.v == quc.v && this.w == quc.w;
    }
    
    public final int hashCode() {
        int hashCode = 0;
        final lta v = this.v;
        int hashCode2;
        if (v != null) {
            hashCode2 = v.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final lta w = this.w;
        if (w != null) {
            hashCode = w.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final void update(final hgf hgf) {
        final suc suc = (suc)hgf;
        suc.J = this.v;
        suc.K = this.w;
    }
}
