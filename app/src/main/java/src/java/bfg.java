public final class bfg extends gfg
{
    public static final bfg c;
    
    static {
        c = (bfg)new gfg(1, 0, 2);
    }
    
    @Override
    public final void a(final ifg ifg, final it0 it0, final y5m y5m, final yb0 yb0, final hfg hfg) {
        final int a = ifg.a(0);
        final int v = y5m.v;
        final int o = y5m.O(y5m.b, y5m.q(v));
        for (int f = y5m.f(y5m.b, y5m.q(v + 1)), i = Math.max(o, f - a); i < f; ++i) {
            final Object o2 = y5m.c[y5m.g(i)];
            if (o2 instanceof kva) {
                yb0.n((kva)o2);
            }
            else if (o2 instanceof b0j) {
                ((b0j)o2).c();
            }
        }
        if (a <= 0) {
            ti6.a("Check failed");
        }
        final int v2 = y5m.v;
        final int o3 = y5m.O(y5m.b, y5m.q(v2));
        final int n = y5m.f(y5m.b, y5m.q(v2 + 1)) - a;
        if (n < o3) {
            ti6.a("Check failed");
        }
        y5m.K(n, a, v2);
        final int j = y5m.i;
        if (j >= o3) {
            y5m.i = j - a;
        }
    }
}
