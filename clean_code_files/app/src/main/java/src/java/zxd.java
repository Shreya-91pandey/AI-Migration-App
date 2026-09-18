public final class zxd implements nzc
{
    public final yxd v;
    
    public zxd(final yxd v) {
        this.v = v;
    }
    
    @Override
    public final nzc D() {
        if (!this.p()) {
            gac.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        final yxf t = this.v.P.P.getOuterCoordinator$ui().T;
        if (t != null) {
            final yxd f1 = t.f1();
            if (f1 != null) {
                return f1.S;
            }
        }
        return null;
    }
    
    @Override
    public final long H(final nzc nzc, final long n) {
        return this.O(nzc, n, true);
    }
    
    @Override
    public final long K(final long n) {
        return l6g.i(this.v.P.K(n), this.a());
    }
    
    @Override
    public final k2j L(final nzc nzc, final boolean b) {
        return this.v.P.L(nzc, b);
    }
    
    @Override
    public final long N(final long n) {
        return this.v.P.N(l6g.i(n, this.a()));
    }
    
    @Override
    public final long O(final nzc nzc, long n, final boolean b) {
        final boolean b2 = nzc instanceof zxd;
        final yxd v = this.v;
        if (!b2) {
            final yxd f = b2r.f(v);
            yxf p3 = f.P;
            n = this.O(f.S, n, b);
            final long q = f.Q;
            n = l6g.h(n, (0xFFFFFFFFL & (long)Float.floatToRawIntBits((float)(int)(q & 0xFFFFFFFFL))) | (long)Float.floatToRawIntBits((float)(int)(q >> 32)) << 32);
            if (!p3.h1().I) {
                gac.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            p3.r1();
            final yxf t = p3.T;
            if (t != null) {
                p3 = t;
            }
            return l6g.i(n, p3.O(nzc, 0L, b));
        }
        final yxd v2 = ((zxd)nzc).v;
        final yxf p4 = v2.P;
        p4.r1();
        final yxd f2 = v.P.d1(p4).f1();
        if (f2 != null) {
            final boolean b3 = b ^ true;
            n = ugc.c(ugc.d(v2.X0(f2, b3), zrn.R(n)), v.X0(f2, b3));
            return (long)Float.floatToRawIntBits((float)(int)(n >> 32)) << 32 | ((long)Float.floatToRawIntBits((float)(int)(n & 0xFFFFFFFFL)) & 0xFFFFFFFFL);
        }
        final yxd f3 = b2r.f(v2);
        final boolean b4 = b ^ true;
        n = ugc.d(ugc.d(v2.X0(f3, b4), f3.Q), zrn.R(n));
        final yxd f4 = b2r.f(v);
        n = ugc.c(n, ugc.d(v.X0(f4, b4), f4.Q));
        final float n2 = (float)(int)(n >> 32);
        final float n3 = (float)(int)(n & 0xFFFFFFFFL);
        n = Float.floatToRawIntBits(n2);
        final long n4 = Float.floatToRawIntBits(n3);
        final yxf t2 = f4.P.T;
        t2.getClass();
        final yxf t3 = f3.P.T;
        t3.getClass();
        return t2.O(t3, (n4 & 0xFFFFFFFFL) | n << 32, b);
    }
    
    public final long a() {
        final yxd v = this.v;
        final yxd f = b2r.f(v);
        return l6g.h(this.O(f.S, 0L, true), v.P.O(f.P, 0L, true));
    }
    
    @Override
    public final long b(final long n) {
        return this.v.P.b(l6g.i(n, this.a()));
    }
    
    @Override
    public final void h(final float[] array) {
        this.v.P.h(array);
    }
    
    @Override
    public final void j(final nzc nzc, final float[] array) {
        this.v.P.j(nzc, array);
    }
    
    @Override
    public final long k() {
        final yxd v = this.v;
        return (long)v.v << 32 | ((long)v.w & 0xFFFFFFFFL);
    }
    
    @Override
    public final boolean p() {
        return this.v.P.h1().I;
    }
    
    @Override
    public final long t(final long n) {
        return this.v.P.t(l6g.i(n, this.a()));
    }
    
    @Override
    public final long w(final long n) {
        return l6g.i(this.v.P.w(n), this.a());
    }
}
