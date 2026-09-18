public final class jc9 extends qxc implements lta
{
    public final hsl w;
    public final xom x;
    public final xom y;
    public final xom z;
    
    public jc9(final hsl w, final ueo x, final ueo y, final ueo z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        super(1);
    }
    
    @Override
    public final Object b(Object l) {
        final jqj jqj = (jqj)l;
        final float n = 1.0f;
        final xom x = this.x;
        float floatValue;
        if (x != null) {
            floatValue = ((Number)x.getValue()).floatValue();
        }
        else {
            floatValue = 1.0f;
        }
        final hsl w = this.w;
        final byl c = w.c;
        final gsg gsg = (gsg)c.v;
        float h;
        if (w.d() && (boolean)((ksg)c.w).getValue()) {
            h = ((gsg)c.x).h();
        }
        else {
            h = 1.0f;
        }
        final float g = floatValue * h;
        if (w.d()) {
            w.g = g;
        }
        jqj.b(g);
        final xom y = this.y;
        float floatValue2;
        if (y != null) {
            floatValue2 = ((Number)y.getValue()).floatValue();
        }
        else {
            floatValue2 = 1.0f;
        }
        final boolean b = w.d() && (boolean)((ksg)c.y).getValue();
        float h2;
        if (b) {
            h2 = gsg.h();
        }
        else {
            h2 = 1.0f;
        }
        final float h3 = floatValue2 * h2;
        if (w.d()) {
            w.h = h3;
            float h4 = n;
            if (b) {
                h4 = gsg.h();
            }
            w.k = h4;
            if (b) {
                if ((l = w.l) == null) {
                    l = new g7p(false);
                    w.l = (g7p)l;
                }
                final tei a = e98.a;
                ((g7p)l).a(h3, lz8.i(gwn.b(w.d)));
            }
        }
        jqj.h(h3);
        jqj.j(h3);
        final xom z = this.z;
        long n2;
        if (z != null) {
            n2 = ((jeo)z.getValue()).a;
        }
        else {
            n2 = jeo.b;
        }
        long a2 = n2;
        if (w.d()) {
            a2 = n2;
            if (((ksg)c.z).getValue()) {
                a2 = ((jeo)((ksg)c.A).getValue()).a;
            }
        }
        if (w.d()) {
            w.i = a2;
        }
        jqj.p(a2);
        return lqo.a;
    }
}
