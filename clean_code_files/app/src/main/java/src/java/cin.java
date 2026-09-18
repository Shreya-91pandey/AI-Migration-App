import android.view.DragEvent;

public final class cin implements ut8
{
    public final shn A;
    public final shn v;
    public final thn w;
    public final shn x;
    public final shn y;
    public final shn z;
    
    public cin(final shn v, final thn w, final shn x, final shn y, final shn z, final shn a) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
    }
    
    public final void G0(final mt8 mt8) {
    }
    
    public final void H0(final mt8 mt8) {
        final DragEvent p = i9r.p(mt8);
        final float x = p.getX();
        final float y = p.getY();
        final long n = Float.floatToRawIntBits(x);
        final long n2 = Float.floatToRawIntBits(y);
        final yhn w = this.y.w;
        final long n3 = fkq.n(w.M, n << 32 | (n2 & 0xFFFFFFFFL));
        final int d = w.M.d(n3, true);
        if (d >= 0) {
            w.L.m(rhc.c(d, d));
        }
        w.N.H(qbb.v, n3);
    }
    
    public final void N(final mt8 mt8) {
        this.A.b((Object)mt8);
    }
    
    public final boolean Y0(final mt8 mt8) {
        this.v.b((Object)mt8);
        this.w.d((Object)r8r.k(i9r.p(mt8).getClipData()), (Object)r8r.l(i9r.p(mt8).getClipDescription()));
        return Boolean.TRUE;
    }
    
    public final void x0(final mt8 mt8) {
        this.z.b((Object)mt8);
    }
    
    public final void z(final mt8 mt8) {
        this.x.b((Object)mt8);
    }
}
