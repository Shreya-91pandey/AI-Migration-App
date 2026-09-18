public final class qc9 extends qxc implements lta
{
    public final o8h A;
    public final long B;
    public final jc9 C;
    public final uc9 w;
    public final xom x;
    public final long y;
    public final long z;
    
    public qc9(final uc9 w, final ueo x, final long n, final long y, final long z, final o8h a, final long b, final jc9 c) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        super(1);
    }
    
    @Override
    public final Object b(final Object o) {
        final n8h n8h = (n8h)o;
        final uc9 w = this.w;
        final hsl p = w.P;
        final long n = 0L;
        final xom x = this.x;
        long a;
        if (x != null) {
            a = ((ugc)x.getValue()).a;
        }
        else {
            a = 0L;
        }
        p.d();
        p.d();
        final long d = ugc.d(a, 0L);
        if (p.d()) {
            p.j = d;
        }
        final gx t = w.T;
        long a2 = n;
        if (t != null) {
            a2 = t.a(this.y, this.z, qzc.v);
        }
        final long d2 = ugc.d(a2, d);
        final int n2 = (int)(d2 >> 32);
        final long b = this.B;
        final int n3 = (int)(b >> 32);
        final int n4 = (int)(d2 & 0xFFFFFFFFL);
        final int n5 = (int)(b & 0xFFFFFFFFL);
        final long n6 = n2 + n3;
        final long n7 = n4 + n5;
        final o8h a3 = this.A;
        n8h.e(a3);
        a3.a0(ugc.d(n6 << 32 | (n7 & 0xFFFFFFFFL), a3.z), 0.0f, (lta)this.C);
        return lqo.a;
    }
}
