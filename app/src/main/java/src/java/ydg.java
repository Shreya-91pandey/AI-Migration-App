public final class ydg extends gfg
{
    public static final ydg c;
    
    static {
        c = (ydg)new gfg(0, 2, 1);
    }
    
    @Override
    public final void a(final ifg ifg, final it0 it0, final y5m y5m, final yb0 yb0, final hfg hfg) {
        final bva bva = (bva)ifg.b(0);
        final Object b = ifg.b(1);
        if (b instanceof kva) {
            final kva kva = (kva)b;
            ((inf)yb0.z).b(kva);
            ((umf)yb0.y).a((Object)kva);
        }
        if (y5m.n != 0) {
            ti6.a("Can only append a slot if not current inserting");
        }
        final int i = y5m.i;
        final int j = y5m.j;
        final int c = y5m.c(bva);
        final int f = y5m.f(y5m.b, y5m.q(c + 1));
        y5m.i = f;
        y5m.j = f;
        y5m.w(1, c);
        int k = i;
        int l = j;
        if (i >= f) {
            k = i + 1;
            l = j + 1;
        }
        y5m.c[f] = b;
        y5m.i = k;
        y5m.j = l;
    }
}
