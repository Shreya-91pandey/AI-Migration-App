public final class iqg
{
    public final goe a;
    public final byte b;
    public final oun c;
    public final dpg d;
    public int e;
    public int f;
    public final p3 g;
    public final boolean h;
    public float i;
    public ygc j;
    
    public iqg(final goe a, final int b, final oun c, final dpg d, int l0, int l2, final xc8 xc8, final long n) {
        this.a = a;
        this.b = (byte)b;
        this.c = c;
        this.d = d;
        final Object z = a.z();
        qqg qqg;
        if (z instanceof qqg) {
            qqg = (qqg)z;
        }
        else {
            qqg = null;
        }
        qqg qqg2 = qqg;
        if (qqg == null) {
            qqg2 = new qqg();
        }
        final wjh b2 = qqg2.b;
        qqg2.a.getClass();
        if (!Float.isNaN(Float.NaN)) {
            l0 = xc8.L0(Float.NaN);
        }
        else if (Math.abs(Float.NaN) <= Float.MAX_VALUE) {
            l0 = (int)((int)(n >> 32) * Float.NaN);
        }
        this.e = l0;
        b2.getClass();
        if (!Float.isNaN(Float.NaN)) {
            l2 = xc8.L0(Float.NaN);
        }
        else if (Math.abs(Float.NaN) <= Float.MAX_VALUE) {
            l2 = (int)((int)(0xFFFFFFFFL & n) * Float.NaN);
        }
        this.f = l2;
        this.g = qqg2.c;
        this.h = qqg2.d;
        this.i = 0.0f;
    }
    
    public final void a(final n8h n8h, ygc j) {
        final ygc ygc = j = this.j;
        if (ygc != null) {
            final int a = ygc.a;
            this.g.getClass();
            j = new ygc(a, ygc.b, ygc.c, ygc.d);
            this.j = j;
        }
        final int n = 0;
        int f;
        if (j != null) {
            f = j.f();
        }
        else {
            f = 0;
        }
        final int max = Math.max(f, 0);
        j = this.j;
        int c;
        if (j != null) {
            c = j.c();
        }
        else {
            c = 0;
        }
        final int max2 = Math.max(c, 0);
        boolean b = true;
        final boolean b2 = max >= 0;
        if (max2 < 0) {
            b = false;
        }
        if (!(b & b2)) {
            iac.a("width and height must be >= 0");
        }
        final o8h u = this.a.u(hv6.h(max, max, max2, max2));
        j = this.j;
        int a2;
        if (j != null) {
            a2 = j.a;
        }
        else {
            a2 = 0;
        }
        int b3 = n;
        if (j != null) {
            b3 = j.b;
        }
        n8h.f(u, a2, b3, this.i);
    }
}
