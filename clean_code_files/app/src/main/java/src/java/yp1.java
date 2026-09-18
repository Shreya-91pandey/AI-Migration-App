public final class yp1 extends hgf implements bw8, k5g, xsk
{
    public long J;
    public qm2 K;
    public float L;
    public aql M;
    public long N;
    public qzc O;
    public k8e P;
    public aql Q;
    public k8e R;
    
    @Override
    public final void F0() {
        this.N = 9205357640488583168L;
        this.O = null;
        this.P = null;
        this.Q = null;
        x90.z(this);
    }
    
    @Override
    public final void I0(final k0d k0d) {
        final z13 v = k0d.v;
        Label_0517: {
            if (this.M == zn2.k) {
                if (!foo.a(this.J, j86.h)) {
                    cw8.r((cw8)k0d, this.J, 0L, 0L, 0.0f, (tym)null, (he2)null, 126);
                }
                final qm2 k = this.K;
                if (k != null) {
                    cw8.U0((cw8)k0d, k, 0L, 0L, this.L, (dw8)null, 0, 118);
                }
            }
            else {
                k8e p;
                if (yzl.b(((cw8)v).i(), this.N) && k0d.getLayoutDirection() == this.O && mlc.q(this.Q, this.M)) {
                    p = this.P;
                    p.getClass();
                }
                else {
                    yi2.I(this, (jta)new jd0((Object)this, (Object)k0d, (byte)5));
                    p = this.R;
                    this.R = null;
                }
                this.P = p;
                this.N = ((cw8)v).i();
                this.O = k0d.getLayoutDirection();
                this.Q = this.M;
                p.getClass();
                if (!foo.a(this.J, j86.h)) {
                    tsf.y((cw8)k0d, p, this.J, (dw8)null, 60);
                }
                final qm2 i = this.K;
                if (i != null) {
                    final float l = this.L;
                    final boolean b = p instanceof rig;
                    final gea a = gea.a;
                    if (b) {
                        final k2j e = ((rig)p).e;
                        k0d.l0(i, (0xFFFFFFFFL & (long)Float.floatToRawIntBits(e.b)) | (long)Float.floatToRawIntBits(e.a) << 32, tsf.V(e), l, (dw8)a, 3);
                    }
                    else {
                        g90 g90;
                        if (p instanceof sig) {
                            final sig sig = (sig)p;
                            g90 = sig.f;
                            if (g90 == null) {
                                final lvj e2 = sig.e;
                                final float intBitsToFloat = Float.intBitsToFloat((int)(e2.h >> 32));
                                k0d.t0(i, (long)Float.floatToRawIntBits(e2.a) << 32 | ((long)Float.floatToRawIntBits(e2.b) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(e2.b()) << 32 | ((long)Float.floatToRawIntBits(e2.a()) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(intBitsToFloat) << 32 | ((long)Float.floatToRawIntBits(intBitsToFloat) & 0xFFFFFFFFL), l, (dw8)a);
                                break Label_0517;
                            }
                        }
                        else {
                            if (!(p instanceof qig)) {
                                en9.r();
                                return;
                            }
                            g90 = ((qig)p).e;
                        }
                        k0d.l(g90, i, l, (dw8)a, 3);
                    }
                }
            }
        }
        k0d.a();
    }
    
    @Override
    public final void j(final itk itk) {
        ftk.u(itk, this.M);
    }
    
    @Override
    public final boolean o() {
        return false;
    }
}
