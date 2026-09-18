import java.util.ArrayList;

public final class oeg extends gfg
{
    public static final oeg c;
    
    static {
        c = (oeg)new gfg(1, 0, 2);
    }
    
    @Override
    public final void a(final ifg ifg, final it0 it0, final y5m y5m, final yb0 yb0, final hfg hfg) {
        int a = ifg.a(0);
        if (y5m.n != 0) {
            ti6.a("Cannot move a group while inserting");
        }
        if (a < 0) {
            ti6.a("Parameter offset is out of bounds");
        }
        if (a != 0) {
            final int t = y5m.t;
            final int v = y5m.v;
            final int u = y5m.u;
            int n = t;
            int[] b;
            while (true) {
                b = y5m.b;
                if (a <= 0) {
                    break;
                }
                n += b[y5m.q(n) * 5 + 3];
                if (n > u) {
                    ti6.a("Parameter offset is out of bounds");
                }
                --a;
            }
            final int n2 = b[y5m.q(n) * 5 + 3];
            final int f = y5m.f(y5m.b, y5m.q(y5m.t));
            final int f2 = y5m.f(y5m.b, y5m.q(n));
            final int[] b2 = y5m.b;
            final int n3 = n + n2;
            final int f3 = y5m.f(b2, y5m.q(n3));
            final int n4 = f3 - f2;
            y5m.w(n4, Math.max(y5m.t - 1, 0));
            y5m.v(n2);
            final int[] b3 = y5m.b;
            final int n5 = y5m.q(n3) * 5;
            iw0.J0(y5m.q(t) * 5, n5, n2 * 5 + n5, b3, b3);
            if (n4 > 0) {
                final Object[] c = y5m.c;
                final int g = y5m.g(f2 + n4);
                System.arraycopy((Object)c, g, (Object)c, f, y5m.g(f3 + n4) - g);
            }
            final int n6 = f2 + n4;
            final int n7 = n6 - f;
            final int k = y5m.k;
            final int l = y5m.l;
            final int length = y5m.c.length;
            final int m = y5m.m;
            for (int i = t; i < t + n2; ++i) {
                final int q = y5m.q(i);
                final int f4 = y5m.f(b3, q);
                int n8;
                if (m < q) {
                    n8 = 0;
                }
                else {
                    n8 = k;
                }
                b3[q * 5 + 4] = y5m.h(y5m.h(f4 - n7, n8, l, length), y5m.k, y5m.l, y5m.c.length);
            }
            final int o = y5m.o();
            final int j = x5m.b(y5m.d, n3, o);
            final ArrayList list = new ArrayList();
            if (j >= 0) {
                while (j < y5m.d.size()) {
                    final bva bva = (bva)y5m.d.get(j);
                    final int c2 = y5m.c(bva);
                    if (c2 < n3 || c2 >= n3 + n2) {
                        break;
                    }
                    list.add((Object)bva);
                    final bva bva2 = (bva)y5m.d.remove(j);
                }
            }
            for (int size = list.size(), n9 = 0; n9 < size; ++n9) {
                final bva bva3 = (bva)list.get(n9);
                final int a2 = y5m.c(bva3) + (t - n3);
                if (a2 >= y5m.g) {
                    bva3.a = -(o - a2);
                }
                else {
                    bva3.a = a2;
                }
                y5m.d.add(x5m.b(y5m.d, a2, o), (Object)bva3);
            }
            if (y5m.J(n3, n2)) {
                ti6.a("Unexpectedly removed anchors");
            }
            y5m.l(v, y5m.u, t);
            if (n4 > 0) {
                y5m.K(n6, n4, n3 - 1);
            }
        }
    }
}
