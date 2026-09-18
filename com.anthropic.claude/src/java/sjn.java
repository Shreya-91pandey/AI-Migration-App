public final class sjn
{
    public static final n9k g;
    public final gsg a;
    public final gsg b;
    public final hsg c;
    public k2j d;
    public long e;
    public final ksg f;
    
    static {
        g = twl.K((lta)new cyl((byte)28), (zta)new dtk((byte)12));
    }
    
    public sjn(final zhg zhg, final float n) {
        this.a = new gsg(n);
        this.b = new gsg(0.0f);
        this.c = new hsg(0);
        this.d = k2j.e;
        this.e = dnn.b;
        this.f = new ksg((Object)zhg, (q8m)def.D);
    }
    
    public final void a(final zhg zhg, final k2j d, final int n, int n2) {
        final float n3 = (float)(n2 - n);
        this.b.i(n3);
        float a = d.a;
        final float b = d.b;
        final k2j d2 = this.d;
        final float a2 = d2.a;
        final gsg a3 = this.a;
        if (a != a2 || b != d2.b) {
            if (zhg == zhg.v) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                a = b;
            }
            float n4;
            if (n2 != 0) {
                n4 = d.d;
            }
            else {
                n4 = d.c;
            }
            final float h = a3.h();
            final float n5 = (float)n;
            final float n6 = h + n5;
            float n7 = 0.0f;
            Label_0205: {
                if (n4 <= n6) {
                    n2 = fcmpg(a, h);
                    if (n2 >= 0 || n4 - a <= n5) {
                        if (n2 < 0 && n4 - a <= n5) {
                            n7 = a - h;
                            break Label_0205;
                        }
                        n7 = 0.0f;
                        break Label_0205;
                    }
                }
                n7 = n4 - n6;
            }
            a3.i(a3.h() + n7);
            this.d = d;
        }
        a3.i(ncq.n(a3.h(), 0.0f, n3));
        this.c.i(n);
    }
}
