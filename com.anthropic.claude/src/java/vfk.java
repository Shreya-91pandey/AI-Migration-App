final class vfk extends ogf
{
    public final llf A;
    public final yl2 B;
    public final boolean C;
    public final w60 D;
    public final mgk v;
    public final zhg w;
    public final boolean x;
    public final boolean y;
    public final gia z;
    
    public vfk(final w60 d, final yl2 b, final gia z, final llf a, final zhg w, final mgk v, final boolean x, final boolean y, final boolean c) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }
    
    @Override
    public final hgf create() {
        final v98 v98 = new v98();
        ((xfk)v98).L = this.v;
        ((xfk)v98).M = this.w;
        ((xfk)v98).N = this.x;
        ((xfk)v98).O = this.y;
        ((xfk)v98).P = this.z;
        ((xfk)v98).Q = this.A;
        ((xfk)v98).R = this.B;
        ((xfk)v98).S = this.C;
        ((xfk)v98).T = this.D;
        return v98;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (vfk.class == o.getClass()) {
                    final vfk vfk = (vfk)o;
                    if (this.v.equals(vfk.v)) {
                        if (this.w == vfk.w) {
                            if (this.x == vfk.x) {
                                if (this.y == vfk.y) {
                                    if (mlc.q(this.z, vfk.z)) {
                                        if (mlc.q(this.A, vfk.A)) {
                                            if (mlc.q(this.B, vfk.B)) {
                                                if (this.C == vfk.C) {
                                                    if (mlc.q(this.D, vfk.D)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
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
        final int l = smk.l(smk.l((this.w.hashCode() + this.v.hashCode() * 31) * 31, 31, this.x), 31, this.y);
        final int n = 0;
        final gia z = this.z;
        int hashCode;
        if (z != null) {
            hashCode = z.hashCode();
        }
        else {
            hashCode = 0;
        }
        final llf a = this.A;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final yl2 b = this.B;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int i = smk.l((((l + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31, 31, this.C);
        final w60 d = this.D;
        int hashCode4 = n;
        if (d != null) {
            hashCode4 = d.hashCode();
        }
        return i + hashCode4;
    }
    
    @Override
    public final void update(final hgf hgf) {
        ((xfk)hgf).t1(this.D, this.B, this.z, this.A, this.w, this.v, this.C, this.x, this.y);
    }
}
