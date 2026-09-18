import java.util.Map;

public final class iea extends hgf implements a0d
{
    public int J;
    public float K;
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        int j;
        int l;
        if (gv6.e(n) && this.J != 1) {
            final int round = Math.round(gv6.i(n) * this.K);
            final int k = gv6.k(n);
            final int i = gv6.i(n);
            int n2;
            if ((n2 = round) < k) {
                n2 = k;
            }
            if (n2 > i) {
                n2 = i;
            }
            j = n2;
            l = n2;
        }
        else {
            l = gv6.k(n);
            j = gv6.i(n);
        }
        int j2;
        int h2;
        if (gv6.d(n) && this.J != 2) {
            final int round2 = Math.round(gv6.h(n) * this.K);
            final int m = gv6.j(n);
            final int h = gv6.h(n);
            if ((j2 = round2) < m) {
                j2 = m;
            }
            if (j2 > h) {
                j2 = h;
            }
            h2 = j2;
        }
        else {
            j2 = gv6.j(n);
            h2 = gv6.h(n);
        }
        final o8h u = goe.u(hv6.a(l, j, j2, h2));
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new t40(u, (byte)2));
    }
}
