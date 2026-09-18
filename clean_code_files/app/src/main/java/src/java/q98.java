final class q98 extends ogf
{
    public final boolean v;
    public final lta w;
    
    public q98(final lta w, final boolean v) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((s98)hgf).J = this.v;
        ((s98)hgf).K = this.w;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof q98) {
                final q98 q98 = (q98)o;
                if (this.v == q98.v) {
                    if (this.w == q98.w) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.w.hashCode() + Boolean.hashCode(this.v) * 31;
    }
    
    public final void update(final hgf hgf) {
        final s98 s98 = (s98)hgf;
        s98.J = this.v;
        s98.K = this.w;
    }
}
