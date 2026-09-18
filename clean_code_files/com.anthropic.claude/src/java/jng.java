import java.util.Map;

public final class jng extends hgf implements a0d
{
    public dng J;
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final float b = this.J.b(ooe.getLayoutDirection());
        final float d = this.J.d();
        final float c = this.J.c(ooe.getLayoutDirection());
        final float a = this.J.a();
        final int b2 = qs8.b(b, 0.0f);
        boolean b3 = false;
        final boolean b4 = b2 >= 0;
        final boolean b5 = qs8.b(d, 0.0f) >= 0;
        final boolean b6 = qs8.b(c, 0.0f) >= 0;
        if (qs8.b(a, 0.0f) >= 0) {
            b3 = true;
        }
        if (!(b4 & b5 & b6 & b3)) {
            eac.a("Padding must be non-negative");
        }
        final int l0 = ooe.L0(b);
        final int n2 = ooe.L0(c) + l0;
        final int l2 = ooe.L0(d);
        final int n3 = ooe.L0(a) + l2;
        final o8h u = goe.u(hv6.i(-n2, n, -n3));
        return ooe.Y(hv6.g(u.v + n2, n), hv6.f(u.w + n3, n), (Map)s89.v, (lta)new jec((byte)2, l0, l2, (Object)u));
    }
}
