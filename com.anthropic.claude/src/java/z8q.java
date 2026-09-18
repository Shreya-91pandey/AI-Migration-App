import java.util.Map;

public final class z8q extends hgf implements a0d
{
    public int J;
    public boolean K;
    public zta L;
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final int j = this.J;
        int i = 0;
        int k;
        if (j != 1) {
            k = 0;
        }
        else {
            k = gv6.k(n);
        }
        if (this.J == 2) {
            i = gv6.j(n);
        }
        final int l = this.J;
        int h = Integer.MAX_VALUE;
        int m;
        if (l != 1 && this.K) {
            m = Integer.MAX_VALUE;
        }
        else {
            m = gv6.i(n);
        }
        if (this.J == 2 || !this.K) {
            h = gv6.h(n);
        }
        final o8h u = goe.u(hv6.a(k, m, i, h));
        final int o = ncq.o(u.v, gv6.k(n), gv6.i(n));
        final int o2 = ncq.o(u.w, gv6.j(n), gv6.h(n));
        return ooe.Y(o, o2, (Map)s89.v, (lta)new izj(this, o, u, o2, ooe));
    }
}
