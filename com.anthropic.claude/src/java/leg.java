public final class leg extends gfg
{
    public static final leg d;
    public static final leg e;
    public static final leg f;
    public static final leg g;
    public final byte c;
    
    @Override
    public final void a(final ifg ifg, final it0 it0, final y5m y5m, final yb0 yb0, final hfg hfg) {
        switch (this.c) {
            default: {
                final Object b = ifg.b(0);
                final int a = ifg.a(0);
                if (b instanceof kva) {
                    final kva kva = (kva)b;
                    ((inf)yb0.z).b(kva);
                    ((umf)yb0.y).a((Object)kva);
                }
                final Object l = y5m.L(y5m.t, a, b);
                if (l instanceof kva) {
                    yb0.n((kva)l);
                }
                else if (l instanceof b0j) {
                    ((b0j)l).c();
                }
                return;
            }
            case 2: {
                final Object b2 = ifg.b(0);
                final bva bva = (bva)ifg.b(1);
                final int a2 = ifg.a(0);
                if (b2 instanceof kva) {
                    final kva kva2 = (kva)b2;
                    ((inf)yb0.z).b(kva2);
                    ((umf)yb0.y).a((Object)kva2);
                }
                final Object i = y5m.L(y5m.c(bva), a2, b2);
                if (i instanceof kva) {
                    yb0.n((kva)i);
                }
                else if (i instanceof b0j) {
                    ((b0j)i).c();
                }
                return;
            }
            case 1: {
                final bva bva2 = (bva)ifg.b(0);
                final int a3 = ifg.a(0);
                it0.g();
                bva2.getClass();
                it0.a(a3, y5m.D(y5m.c(bva2)));
                return;
            }
            case 0: {
                final Object a4 = ((jta)ifg.b(0)).a();
                final bva bva3 = (bva)ifg.b(1);
                final int a5 = ifg.a(0);
                bva3.getClass();
                y5m.W(y5m.c(bva3), a4);
                it0.h(a5, a4);
                it0.b(a4);
            }
        }
    }
    
    @Override
    public bva b(final ifg ifg) {
        switch (this.c) {
            default: {
                return super.b(ifg);
            }
            case 1: {
                return (bva)ifg.b(0);
            }
            case 0: {
                return (bva)ifg.b(1);
            }
        }
    }
}
