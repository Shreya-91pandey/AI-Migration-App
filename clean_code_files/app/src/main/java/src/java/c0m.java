import java.util.Map;

public final class c0m extends e0d
{
    public cg0 J;
    public long K;
    public long L;
    public boolean M;
    public final ksg N;
    
    public c0m(final cg0 j) {
        this.J = j;
        this.K = -9223372034707292160L;
        this.L = hv6.b(0, 0, 0, 0, 15);
        this.N = o50.Q(null);
    }
    
    @Override
    public final noe b(final ooe ooe, final goe goe, long d) {
        final boolean r0 = ((flc)ooe).r0();
        boolean b = true;
        o8h o8h;
        if (r0) {
            this.L = d;
            this.M = true;
            o8h = goe.u(d);
        }
        else {
            long l;
            if (this.M) {
                l = this.L;
            }
            else {
                l = d;
            }
            o8h = goe.u(l);
        }
        final long k = ((long)o8h.w & 0xFFFFFFFFL) | (long)o8h.v << 32;
        if (((flc)ooe).r0()) {
            this.K = k;
            d = k;
        }
        else {
            long i;
            if (qt7.G(this.K)) {
                i = this.K;
            }
            else {
                i = k;
            }
            final ksg n = this.N;
            Object value = n.getValue();
            if (value != null) {
                final id0 a = ((a0m)value).a;
                if (chc.b(i, ((chc)a.e()).a) || a.f()) {
                    b = false;
                }
                if (!chc.b(i, ((chc)a.e.getValue()).a) || b) {
                    ((a0m)value).b = ((chc)a.e()).a;
                    rhc.G(this.c1(), null, 0, (zta)new ry0((a0m)value, i, this, (f07)null), 3);
                }
            }
            else {
                value = new a0m(new id0(new chc(i), yi2.l, new chc(4294967297L), 8), i);
            }
            n.setValue(value);
            d = hv6.d(d, ((chc)((a0m)value).a.e()).a);
        }
        final int n2 = (int)(d >> 32);
        final int n3 = (int)(d & 0xFFFFFFFFL);
        return ooe.Y(n2, n3, (Map)s89.v, (lta)new b0m(this, k, n2, n3, ooe, o8h));
    }
    
    @Override
    public final void g1() {
        this.K = -9223372034707292160L;
        this.M = false;
    }
    
    @Override
    public final void i1() {
        this.N.setValue((Object)null);
    }
}
