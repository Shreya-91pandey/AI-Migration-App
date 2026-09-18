import java.util.Map;

public class kec extends fec implements a0d
{
    public d1q L;
    
    public kec(final d1q l) {
        this.L = l;
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final int n2 = super.K.d(ooe, ooe.getLayoutDirection()) - super.J.d(ooe, ooe.getLayoutDirection());
        final int n3 = super.K.a(ooe) - super.J.a(ooe);
        final int b = super.K.b(ooe, ooe.getLayoutDirection());
        final int b2 = super.J.b(ooe, ooe.getLayoutDirection());
        final int c = super.K.c(ooe);
        final int c2 = super.J.c(ooe);
        final int n4 = b - b2 + n2;
        final int n5 = c - c2 + n3;
        final o8h u = goe.u(hv6.i(-n4, n, -n5));
        return ooe.Y(hv6.g(u.v + n4, n), hv6.f(u.w + n5, n), (Map)s89.v, (lta)new jec((byte)0, n2, n3, (Object)u));
    }
    
    @Override
    public final d1q o1(final d1q d1q) {
        return new iqo(d1q, this.L);
    }
    
    @Override
    public final void p1() {
        super.p1();
        soh.L((t98)this).R();
    }
}
