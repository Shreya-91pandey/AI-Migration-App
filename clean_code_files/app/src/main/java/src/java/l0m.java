import java.util.Map;

public final class l0m extends hgf implements a0d
{
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    
    public final int M0(final wxd wxd, final goe goe, int f) {
        final long o1 = this.o1((ooe)wxd);
        if (gv6.g(o1)) {
            return gv6.i(o1);
        }
        if (!this.N) {
            f = hv6.f(f, o1);
        }
        return hv6.g(goe.n(f), o1);
    }
    
    public final noe b(final ooe ooe, final goe goe, long n) {
        final long o1 = this.o1(ooe);
        if (this.N) {
            n = hv6.e(n, o1);
        }
        else {
            int k;
            if (!Float.isNaN(this.J)) {
                k = gv6.k(o1);
            }
            else {
                final int i = gv6.k(n);
                final int j = gv6.i(o1);
                if ((k = i) > j) {
                    k = j;
                }
            }
            int l;
            if (!Float.isNaN(this.L)) {
                l = gv6.i(o1);
            }
            else {
                final int m = gv6.i(n);
                final int k2 = gv6.k(o1);
                if ((l = m) < k2) {
                    l = k2;
                }
            }
            int j2;
            if (!Float.isNaN(this.K)) {
                j2 = gv6.j(o1);
            }
            else {
                final int j3 = gv6.j(n);
                final int h = gv6.h(o1);
                if ((j2 = j3) > h) {
                    j2 = h;
                }
            }
            int h2;
            if (!Float.isNaN(this.M)) {
                h2 = gv6.h(o1);
            }
            else {
                final int h3 = gv6.h(n);
                final int j4 = gv6.j(o1);
                if ((h2 = h3) < j4) {
                    h2 = j4;
                }
            }
            n = hv6.a(k, l, j2, h2);
        }
        final o8h u = goe.u(n);
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new t40(u, (byte)8));
    }
    
    public final int g(final wxd wxd, final goe goe, int g) {
        final long o1 = this.o1((ooe)wxd);
        if (gv6.f(o1)) {
            return gv6.h(o1);
        }
        if (!this.N) {
            g = hv6.g(g, o1);
        }
        return hv6.f(goe.a(g), o1);
    }
    
    public final int h(final wxd wxd, final goe goe, int g) {
        final long o1 = this.o1((ooe)wxd);
        if (gv6.f(o1)) {
            return gv6.h(o1);
        }
        if (!this.N) {
            g = hv6.g(g, o1);
        }
        return hv6.f(goe.Q(g), o1);
    }
    
    public final int k(final wxd wxd, final goe goe, int f) {
        final long o1 = this.o1((ooe)wxd);
        if (gv6.g(o1)) {
            return gv6.i(o1);
        }
        if (!this.N) {
            f = hv6.f(f, o1);
        }
        return hv6.g(goe.s(f), o1);
    }
    
    public final long o1(final ooe ooe) {
        final boolean naN = Float.isNaN(this.L);
        final int n = 0;
        int l0;
        if (!naN) {
            if ((l0 = ooe.L0(this.L)) < 0) {
                l0 = 0;
            }
        }
        else {
            l0 = Integer.MAX_VALUE;
        }
        int l2;
        if (!Float.isNaN(this.M)) {
            if ((l2 = ooe.L0(this.M)) < 0) {
                l2 = 0;
            }
        }
        else {
            l2 = Integer.MAX_VALUE;
        }
        int n3 = 0;
        Label_0144: {
            if (!Float.isNaN(this.J)) {
                int l3;
                if ((l3 = ooe.L0(this.J)) < 0) {
                    l3 = 0;
                }
                int n2;
                if ((n2 = l3) > l0) {
                    n2 = l0;
                }
                if (n2 != Integer.MAX_VALUE) {
                    n3 = n2;
                    break Label_0144;
                }
            }
            n3 = 0;
        }
        int n4 = n;
        if (!Float.isNaN(this.K)) {
            int l4;
            if ((l4 = ooe.L0(this.K)) < 0) {
                l4 = 0;
            }
            int n5;
            if ((n5 = l4) > l2) {
                n5 = l2;
            }
            n4 = n;
            if (n5 != Integer.MAX_VALUE) {
                n4 = n5;
            }
        }
        return hv6.a(n3, l0, n4, l2);
    }
}
