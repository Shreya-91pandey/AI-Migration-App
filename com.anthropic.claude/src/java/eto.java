import java.util.Map;

public final class eto extends hgf implements a0d
{
    public float J;
    public float K;
    
    public final int M0(final wxd wxd, final goe goe, int l0) {
        final int n = goe.n(l0);
        if (!Float.isNaN(this.J)) {
            l0 = ((xc8)wxd).L0(this.J);
        }
        else {
            l0 = 0;
        }
        if (n < l0) {
            return l0;
        }
        return n;
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final boolean naN = Float.isNaN(this.J);
        int j = 0;
        int k;
        if (!naN && gv6.k(n) == 0) {
            final int l0 = ooe.L0(this.J);
            final int i = gv6.i(n);
            if ((k = l0) < 0) {
                k = 0;
            }
            if (k > i) {
                k = i;
            }
        }
        else {
            k = gv6.k(n);
        }
        final int m = gv6.i(n);
        if (!Float.isNaN(this.K) && gv6.j(n) == 0) {
            final int l2 = ooe.L0(this.K);
            final int h = gv6.h(n);
            if (l2 >= 0) {
                j = l2;
            }
            if (j > h) {
                j = h;
            }
        }
        else {
            j = gv6.j(n);
        }
        final o8h u = goe.u(hv6.a(k, m, j, gv6.h(n)));
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new t40(u, (byte)13));
    }
    
    public final int g(final wxd wxd, final goe goe, int l0) {
        final int a = goe.a(l0);
        if (!Float.isNaN(this.K)) {
            l0 = ((xc8)wxd).L0(this.K);
        }
        else {
            l0 = 0;
        }
        if (a < l0) {
            return l0;
        }
        return a;
    }
    
    public final int h(final wxd wxd, final goe goe, int l0) {
        final int q = goe.Q(l0);
        if (!Float.isNaN(this.K)) {
            l0 = ((xc8)wxd).L0(this.K);
        }
        else {
            l0 = 0;
        }
        if (q < l0) {
            return l0;
        }
        return q;
    }
    
    public final int k(final wxd wxd, final goe goe, int l0) {
        final int s = goe.s(l0);
        if (!Float.isNaN(this.J)) {
            l0 = ((xc8)wxd).L0(this.J);
        }
        else {
            l0 = 0;
        }
        if (s < l0) {
            return l0;
        }
        return s;
    }
}
