public final class le0 implements ee0
{
    public final efo a;
    public gx b;
    public qzc c;
    public final ksg d;
    public final tmf e;
    public ueo f;
    
    public le0(final efo a, final gx b, final qzc c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = o50.Q(new chc(0L));
        final long[] a2 = jak.a;
        this.e = new tmf();
    }
    
    @Override
    public final ey6 a(final ey6 ey6, final o0m d) {
        ey6.d = d;
        return ey6;
    }
    
    @Override
    public final id9 c(final int n, final ygm ygm) {
        if (this.k(n)) {
            return pc9.o(ygm, (lta)new ke0(this, (byte)0));
        }
        if (this.l(n)) {
            return pc9.o(ygm, (lta)new ke0(this, (byte)1));
        }
        if (q9r.g(n, 2)) {
            return pc9.p(ygm, (lta)new ke0(this, (byte)2));
        }
        if (q9r.g(n, 3)) {
            return pc9.p(ygm, (lta)new ke0(this, (byte)3));
        }
        return id9.b;
    }
    
    @Override
    public final Object d() {
        return this.a.f().d();
    }
    
    @Override
    public final ev9 f(final int n, final ygm ygm) {
        if (this.k(n)) {
            return pc9.r(ygm, (lta)new ke0(this, (byte)4));
        }
        if (this.l(n)) {
            return pc9.r(ygm, (lta)new ke0(this, (byte)5));
        }
        if (q9r.g(n, 2)) {
            return pc9.s(ygm, (lta)new ke0(this, (byte)6));
        }
        if (q9r.g(n, 3)) {
            return pc9.s(ygm, (lta)new ke0(this, (byte)7));
        }
        return ev9.b;
    }
    
    @Override
    public final Object h() {
        return this.a.f().h();
    }
    
    public final long i(final long n, final long n2) {
        return this.b.a(n, n2, qzc.v);
    }
    
    public final long j() {
        final ueo f = this.f;
        if (f != null) {
            return ((chc)f.getValue()).a;
        }
        return ((chc)this.d.getValue()).a;
    }
    
    public final boolean k(final int n) {
        return q9r.g(n, 0) || (q9r.g(n, 4) && this.c == qzc.v) || (q9r.g(n, 5) && this.c == qzc.w);
    }
    
    public final boolean l(final int n) {
        return q9r.g(n, 1) || (q9r.g(n, 4) && this.c == qzc.w) || (q9r.g(n, 5) && this.c == qzc.v);
    }
}
