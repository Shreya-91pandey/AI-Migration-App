public final class zoa implements Comparable
{
    public static final zoa A;
    public static final zoa B;
    public static final zoa C;
    public static final zoa D;
    public static final zoa E;
    public static final zoa F;
    public static final zoa w;
    public static final zoa x;
    public static final zoa y;
    public static final zoa z;
    public final int v;
    
    static {
        final zoa zoa = new zoa(100);
        final zoa zoa2 = new zoa(200);
        final zoa z2 = new zoa(300);
        final zoa a = w = new zoa(400);
        final zoa b = x = new zoa(500);
        final zoa c = y = new zoa(600);
        final zoa d = new zoa(700);
        final zoa e = new zoa(800);
        final zoa f = new zoa(900);
        z = z2;
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
        F = f;
        lq6.Y((Object[])new zoa[] { zoa, zoa2, z2, a, b, c, d, e, f });
    }
    
    public zoa(final int v) {
        this.v = v;
        int n = 0;
        if (1 <= v) {
            n = n;
            if (v < 1001) {
                n = 1;
            }
        }
        if (n == 0) {
            final StringBuilder sb = new StringBuilder("Font weight can be in range [1, 1000]. Current value: ");
            sb.append(v);
            hac.a(sb.toString());
        }
    }
    
    public final int a(final zoa zoa) {
        return mlc.u(this.v, zoa.v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof zoa && this.v == ((zoa)o).v);
    }
    
    @Override
    public final int hashCode() {
        return this.v;
    }
    
    @Override
    public final String toString() {
        return oz1.n("FontWeight(weight=", this.v, ")");
    }
}
