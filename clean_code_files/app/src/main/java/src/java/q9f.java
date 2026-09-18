import java.util.List;

public final class q9f
{
    public static q9f h;
    public final qzc a;
    public final mnn b;
    public final ad8 c;
    public final tna d;
    public final mnn e;
    public float f;
    public float g;
    
    public q9f(final qzc a, final mnn b, final ad8 c, final tna d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = k8e.F(b, a);
        this.f = Float.NaN;
        this.g = Float.NaN;
    }
    
    public final long a(int n, final long n2) {
        float g = this.g;
        final float f = this.f;
        final boolean naN = Float.isNaN(g);
        int n3 = 0;
        float f2 = 0.0f;
        Label_0179: {
            if (!naN) {
                f2 = f;
                if (!Float.isNaN(f)) {
                    break Label_0179;
                }
            }
            final String a = r9f.a;
            final mnn e = this.e;
            final r89 v = r89.v;
            final tna d = this.d;
            final ad8 c = this.c;
            final a90 a2 = new a90(new e90(a, e, (List)v, (List)v, d, (xc8)c, false), 1, 1, hv6.b(0, 0, 0, 0, 15));
            final float f3 = new a90(new e90(r9f.b, e, (List)v, (List)v, this.d, (xc8)c, true), 2, 1, hv6.b(0, 0, 0, 0, 15)).f;
            g = a2.f;
            f2 = f3 - g;
            this.g = g;
            this.f = f2;
        }
        if (n != 1) {
            n = Math.round(f2 * (n - 1) + g);
            if (n >= 0) {
                n3 = n;
            }
            final int h = gv6.h(n2);
            n = n3;
            if (n3 > h) {
                n = h;
            }
        }
        else {
            n = gv6.j(n2);
        }
        return hv6.a(gv6.k(n2), gv6.i(n2), n, gv6.h(n2));
    }
}
