final class s20<T> extends ogf
{
    public final gia A;
    public final m30 v;
    public final zhg w;
    public final boolean x;
    public final Boolean y;
    public final llf z;
    
    public s20(final m30 v, final zhg w, final boolean x, final Boolean y, final llf z, final gia a) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    @Override
    public final hgf create() {
        final vu8 vu8 = new vu8((lta)ri2.a, this.x, this.z, this.w);
        ((g30)vu8).e0 = this.v;
        ((g30)vu8).f0 = this.y;
        ((g30)vu8).g0 = this.A;
        return vu8;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof s20) {
                final s20 s20 = (s20)o;
                if (mlc.q(this.v, s20.v)) {
                    if (this.w == s20.w) {
                        if (this.x == s20.x) {
                            if (mlc.q(this.y, s20.y)) {
                                if (mlc.q(this.z, s20.z)) {
                                    if (mlc.q(this.A, s20.A)) {
                                        return true;
                                    }
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
    
    @Override
    public final int hashCode() {
        final int l = smk.l((this.w.hashCode() + this.v.hashCode() * 31) * 31, 31, this.x);
        int hashCode = 0;
        final Boolean y = this.y;
        int hashCode2;
        if (y != null) {
            hashCode2 = y.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final llf z = this.z;
        int hashCode3;
        if (z != null) {
            hashCode3 = z.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final gia a = this.A;
        if (a != null) {
            hashCode = a.hashCode();
        }
        return ((l + hashCode2) * 31 + hashCode3) * 29791 + hashCode;
    }
    
    @Override
    public final void update(final hgf hgf) {
        final g30 g30 = (g30)hgf;
        final gia a = this.A;
        g30.g0 = a;
        final m30 e0 = g30.e0;
        final m30 v = this.v;
        boolean b;
        if (!mlc.q(e0, v)) {
            g30.e0 = v;
            g30.L1(a);
            b = true;
        }
        else {
            b = false;
        }
        final zhg l = g30.L;
        final zhg w = this.w;
        if (l != w) {
            g30.L = w;
            b = true;
        }
        final Boolean f0 = g30.f0;
        final Boolean y = this.y;
        if (!mlc.q(f0, y)) {
            g30.f0 = y;
            b = true;
        }
        g30.I1(g30.M, this.x, this.z, w, b);
    }
}
