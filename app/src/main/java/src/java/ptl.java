import java.util.Map;

public final class ptl extends hgf implements a0d, k5g, bw8, zl6
{
    public itl J;
    
    @Override
    public final void F0() {
        this.J.e();
        yi2.I(this, this.J.z);
    }
    
    @Override
    public final void I0(final k0d k0d) {
        k0d.a();
        final itl j = this.J;
        final d6b graphicsContext = soh.M(this).getGraphicsContext();
        final emf d = j.D;
        final int h = j.C.h();
        if (j.F != h) {
            final ygm a = ntl.a;
            for (int b = d.b, i = 1; i < b; ++i) {
                final Object g = d.g(i);
                int k;
                for (k = i - 1; k >= 0; --k) {
                    final ezc ezc = (ezc)d.g(k);
                    final ezc ezc2 = (ezc)g;
                    final float e = ezc.e();
                    float e2 = -1.0f;
                    float e3;
                    if (e == 0.0f && ezc instanceof vrl && ((vrl)ezc).G == null) {
                        e3 = -1.0f;
                    }
                    else {
                        e3 = ezc.e();
                    }
                    if (ezc2.e() != 0.0f || !(ezc2 instanceof vrl) || ((vrl)ezc2).G != null) {
                        e2 = ezc2.e();
                    }
                    if (Float.compare(e3, e2) <= 0) {
                        break;
                    }
                    d.o(k + 1, d.g(k));
                }
                d.o(k + 1, g);
            }
            j.F = h;
        }
        final Object[] a2 = d.a;
        for (int b2 = d.b, l = 0; l < b2; ++l) {
            ((ezc)a2[l]).c(k0d, graphicsContext);
        }
    }
    
    @Override
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final o8h u = goe.u(n);
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new xd0(ooe, this, u, (byte)4));
    }
    
    @Override
    public final void g1() {
        yi2.I(this, this.J.z);
        this.J.x = new ve(this, (byte)11);
    }
    
    @Override
    public final void h1() {
        this.J.x = null;
    }
}
