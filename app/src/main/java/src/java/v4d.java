final class v4d extends ogf
{
    public final jta v;
    public final s4d w;
    public final zhg x;
    public final boolean y;
    public final boolean z;
    
    public v4d(final jta v, final s4d w, final zhg x, final boolean y, final boolean z) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public final hgf create() {
        return new y4d(this.v, this.w, this.x, this.y, this.z);
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof v4d) {
                final v4d v4d = (v4d)o;
                if (this.v == v4d.v) {
                    if (mlc.q((Object)this.w, (Object)v4d.w)) {
                        if (this.x == v4d.x) {
                            if (this.y == v4d.y) {
                                if (this.z == v4d.z) {
                                    return true;
                                }
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
        return Boolean.hashCode(this.z) + smk.l((this.x.hashCode() + (this.w.hashCode() + this.v.hashCode() * 31) * 31) * 31, 31, this.y);
    }
    
    public final void update(final hgf hgf) {
        final y4d y4d = (y4d)hgf;
        y4d.J = this.v;
        y4d.K = this.w;
        final zhg l = y4d.L;
        final zhg x = this.x;
        if (l != x) {
            y4d.L = x;
            soh.L((t98)y4d).T();
        }
        final boolean m = y4d.M;
        final boolean y = this.y;
        final boolean z = this.z;
        if (m == y && y4d.N == z) {
            return;
        }
        y4d.M = y;
        y4d.N = z;
        y4d.o1();
        soh.L((t98)y4d).T();
    }
}
