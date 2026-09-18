public final class l30
{
    public Object a;
    public Object b;
    public float c;
    public final m30 d;
    
    public l30(final m30 d) {
        this.d = d;
        this.c = Float.NaN;
    }
    
    public final void a(float n, float h) {
        final m30 d = this.d;
        final ksg g = d.g;
        final gsg j = d.j;
        final float h2 = j.h();
        j.i(n);
        d.k.i(h);
        if (!Float.isNaN(h2)) {
            final boolean b = n >= h2;
            n = d.c().f(g.getValue());
            if (j.h() == n) {
                h = j.h();
                if (b) {
                    n = 1.0f;
                }
                else {
                    n = -1.0f;
                }
                Object o;
                if ((o = d.c().b(h + n, b)) == null) {
                    o = g.getValue();
                }
                if (b) {
                    this.a = g.getValue();
                    this.b = o;
                }
                else {
                    this.a = o;
                    this.b = g.getValue();
                }
            }
            else {
                Object a;
                if ((a = d.c().b(j.h(), false)) == null) {
                    a = g.getValue();
                }
                Object b2;
                if ((b2 = d.c().b(j.h(), true)) == null) {
                    b2 = g.getValue();
                }
                this.a = a;
                this.b = b2;
            }
            final b48 c = d.c();
            final Object a2 = this.a;
            a2.getClass();
            n = c.f(a2);
            final b48 c2 = d.c();
            final Object b3 = this.b;
            b3.getClass();
            this.c = Math.abs(n - c2.f(b3));
            if (Math.abs(j.h() - d.c().f(g.getValue())) >= this.c / 2.0f) {
                Object o2;
                if (b) {
                    o2 = this.b;
                }
                else {
                    o2 = this.a;
                }
                Object value = o2;
                if (o2 == null) {
                    value = g.getValue();
                }
                if (d.a.b(value)) {
                    g.setValue(value);
                }
            }
        }
    }
}
