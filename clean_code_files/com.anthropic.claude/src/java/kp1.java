final class kp1 extends ogf
{
    public final long v;
    public final qm2 w;
    public final aql x;
    
    public kp1(long h, qm2 w, final aql x, final int n) {
        if ((n & 0x1) != 0x0) {
            h = j86.h;
        }
        if ((n & 0x2) != 0x0) {
            w = null;
        }
        this.v = h;
        this.w = w;
        this.x = x;
    }
    
    @Override
    public final hgf create() {
        final hgf hgf = new hgf();
        ((yp1)hgf).J = this.v;
        ((yp1)hgf).K = this.w;
        ((yp1)hgf).L = 1.0f;
        ((yp1)hgf).M = this.x;
        ((yp1)hgf).N = 9205357640488583168L;
        return hgf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        kp1 kp1;
        if (o instanceof kp1) {
            kp1 = (kp1)o;
        }
        else {
            kp1 = null;
        }
        if (kp1 != null) {
            final long v = kp1.v;
            final int i = j86.i;
            if (foo.a(this.v, v) && mlc.q(this.w, kp1.w) && mlc.q(this.x, kp1.x)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int i = j86.i;
        final int hashCode = Long.hashCode(this.v);
        final qm2 w = this.w;
        int hashCode2;
        if (w != null) {
            hashCode2 = w.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return this.x.hashCode() + oz1.d(1.0f, (hashCode * 31 + hashCode2) * 31, 31);
    }
    
    @Override
    public final void update(final hgf hgf) {
        final yp1 yp1 = (yp1)hgf;
        yp1.J = this.v;
        yp1.K = this.w;
        yp1.L = 1.0f;
        final aql m = yp1.M;
        final aql x = this.x;
        if (!mlc.q(m, x)) {
            yp1.M = x;
            soh.L(yp1).T();
        }
        x90.z(yp1);
    }
}
