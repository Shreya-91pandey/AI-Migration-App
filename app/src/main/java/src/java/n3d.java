final class n3d extends ogf
{
    public final r3d v;
    public final v2b w;
    public final boolean x;
    public final zhg y;
    
    public n3d(final r3d v, final v2b w, final boolean x, final zhg y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((q3d)hgf).J = this.v;
        ((q3d)hgf).K = this.w;
        ((q3d)hgf).L = this.x;
        ((q3d)hgf).M = this.y;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof n3d) {
                final n3d n3d = (n3d)o;
                if (mlc.q((Object)this.v, (Object)n3d.v)) {
                    if (mlc.q((Object)this.w, (Object)n3d.w)) {
                        if (this.x == n3d.x) {
                            if (this.y == n3d.y) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.y.hashCode() + smk.l((this.w.hashCode() + this.v.hashCode() * 31) * 31, 31, this.x);
    }
    
    public final void update(final hgf hgf) {
        final q3d q3d = (q3d)hgf;
        q3d.J = this.v;
        q3d.K = this.w;
        q3d.L = this.x;
        q3d.M = this.y;
    }
}
