import java.util.Map;

public final class wib extends hgf implements zl6, a0d, k5g
{
    public mnn J;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public mnn P;
    public cno Q;
    
    public final void F0() {
        if (this.Q != null) {
            yi2.I((hgf)this, (jta)new kca((Object)this, (byte)6));
        }
        this.M = true;
        soh.L((t98)this).R();
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        if (this.M) {
            this.o1(ooe, this.q1(), (tna)uoo.z((zl6)this, (sei)hm6.k));
            this.M = false;
        }
        final int n2 = this.N;
        int n3;
        if (n2 != -1) {
            n3 = ncq.o(n2, gv6.j(n), gv6.h(n));
        }
        else {
            n3 = gv6.j(n);
        }
        final int o = this.O;
        int n4;
        if (o != -1) {
            n4 = ncq.o(o, gv6.j(n), gv6.h(n));
        }
        else {
            n4 = gv6.h(n);
        }
        final o8h u = goe.u(gv6.b(n, 0, 0, n3, n4, 3));
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new t40(u, (byte)3));
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void f() {
        this.M = true;
        soh.L((t98)this).R();
    }
    
    public final int g(final wxd wxd, final goe goe, int n) {
        this.p1(wxd);
        final int n2 = this.N;
        final int o = this.O;
        if (n2 == o) {
            return o;
        }
        final int a = goe.a(n);
        final int n3 = this.N;
        final int o2 = this.O;
        if ((n = a) < n3) {
            n = n3;
        }
        if (n > o2) {
            return o2;
        }
        return n;
    }
    
    public final void g1() {
        final tna tna = (tna)uoo.z((zl6)this, (sei)hm6.k);
        this.P = k8e.F(this.J, soh.L((t98)this).V);
        final una f = this.q1().a.f;
        zoa zoa;
        if ((zoa = this.q1().a.c) == null) {
            zoa = zoa.A;
        }
        final soa d = this.q1().a.d;
        int a;
        if (d != null) {
            a = d.a;
        }
        else {
            a = 0;
        }
        final toa e = this.q1().a.e;
        int a2;
        if (e != null) {
            a2 = e.a;
        }
        else {
            a2 = 65535;
        }
        this.Q = ((wna)tna).b(f, zoa, a, a2);
        yi2.I((hgf)this, (jta)new h87((Object)this, (byte)16));
        this.M = true;
    }
    
    public final int h(final wxd wxd, final goe goe, int n) {
        this.p1(wxd);
        final int n2 = this.N;
        if (n2 == this.O) {
            return n2;
        }
        final int q = goe.Q(n);
        final int n3 = this.N;
        final int o = this.O;
        if ((n = q) < n3) {
            n = n3;
        }
        if (n > o) {
            return o;
        }
        return n;
    }
    
    public final void h0() {
        this.P = k8e.F(this.J, soh.L((t98)this).V);
        this.M = true;
        soh.L((t98)this).R();
    }
    
    public final void h1() {
        this.P = null;
        this.Q = null;
        this.M = false;
    }
    
    public final void o1(final ooe ooe, final mnn mnn, final tna tna) {
        final mmn d = bin.b(mnn, ooe, tna, 3, true).d;
        final float h = d.h(0);
        final float h2 = d.h(1);
        final float h3 = d.h(2);
        this.N = xp7.r(h, h2, h3, this.K, 1);
        this.O = xp7.r(h, h2, h3, this.L, Integer.MAX_VALUE);
    }
    
    public final void p1(final wxd wxd) {
        final boolean m = this.M;
        int n = 0;
        if (m) {
            this.o1((ooe)wxd, this.q1(), (tna)uoo.z((zl6)this, (sei)hm6.k));
            this.M = false;
        }
        final int n2 = this.N;
        if (n2 >= 0) {
            n = n2;
        }
        this.N = n;
        int o = this.O;
        if (o == -1) {
            o = Integer.MAX_VALUE;
        }
        this.O = o;
    }
    
    public final mnn q1() {
        final mnn p = this.P;
        if (p != null) {
            return p;
        }
        throw hia.s("Resolved style is not set.");
    }
}
