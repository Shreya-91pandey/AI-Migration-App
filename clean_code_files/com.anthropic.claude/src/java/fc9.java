final class fc9 extends ogf
{
    public final ev9 A;
    public final hsl B;
    public final jta C;
    public final gc9 D;
    public final efo v;
    public final veo w;
    public final veo x;
    public final veo y;
    public final id9 z;
    
    public fc9(final efo v, final veo w, final veo x, final veo y, final id9 z, final ev9 a, final hsl b, final jta c, final gc9 d) {
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
        return new uc9(this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof fc9) {
            final fc9 fc9 = (fc9)o;
            if (mlc.q(fc9.v, this.v) && mlc.q(fc9.w, this.w) && mlc.q(fc9.x, this.x) && mlc.q(fc9.y, this.y) && fc9.z.equals(this.z) && mlc.q(fc9.A, this.A)) {
                if (fc9.B == this.B) {
                    if (fc9.C == this.C && mlc.q(fc9.D, this.D)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.v.hashCode();
        int hashCode2 = 0;
        final veo w = this.w;
        int hashCode3;
        if (w != null) {
            hashCode3 = w.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final veo x = this.x;
        int hashCode4;
        if (x != null) {
            hashCode4 = x.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final veo y = this.y;
        if (y != null) {
            hashCode2 = y.hashCode();
        }
        return this.B.hashCode() + (this.D.hashCode() * 31 + ca9.q((this.A.hashCode() + (this.z.hashCode() + (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2) * 31) * 31) * 31, 31, this.C));
    }
    
    @Override
    public final void update(final hgf hgf) {
        final uc9 uc9 = (uc9)hgf;
        uc9.J = this.v;
        uc9.K = this.w;
        uc9.L = this.x;
        uc9.M = this.y;
        uc9.N = this.z;
        uc9.O = this.A;
        uc9.P = this.B;
        uc9.Q = this.C;
        uc9.R = this.D;
    }
}
