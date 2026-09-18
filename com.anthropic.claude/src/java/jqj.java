public final class jqj implements xc8
{
    public float A;
    public float B;
    public long C;
    public long D;
    public float E;
    public float F;
    public long G;
    public aql H;
    public boolean I;
    public int J;
    public long K;
    public czc L;
    public xc8 M;
    public qzc N;
    public r1 O;
    public byte P;
    public k8e Q;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;
    
    public jqj() {
        this.w = 1.0f;
        this.x = 1.0f;
        this.y = 1.0f;
        final long a = k6b.a;
        this.C = a;
        this.D = a;
        this.F = 8.0f;
        this.G = jeo.b;
        this.H = (aql)zn2.k;
        this.J = 0;
        this.K = 9205357640488583168L;
        this.L = czc.a;
        this.M = (xc8)r6k.a();
        this.N = qzc.v;
        this.P = 3;
    }
    
    public final void a() {
        this.h(1.0f);
        this.j(1.0f);
        this.b(1.0f);
        this.s(0.0f);
        this.t(0.0f);
        this.k(0.0f);
        final long a = k6b.a;
        this.c(a);
        this.o(a);
        this.g(0.0f);
        if (this.F != 8.0f) {
            this.v |= 0x800;
            this.F = 8.0f;
        }
        this.p(jeo.b);
        this.n((aql)zn2.k);
        this.d(false);
        this.f(null);
        if (this.P != 3) {
            this.v |= 0x80000;
            this.P = 3;
        }
        this.e(0);
        final czc a2 = czc.a;
        if (!mlc.q((Object)this.L, (Object)a2)) {
            this.v |= 0x100000;
            this.L = a2;
        }
        this.K = 9205357640488583168L;
        this.Q = null;
        this.v = 0;
    }
    
    public final void b(final float y) {
        if (this.y == y) {
            return;
        }
        this.v |= 0x4;
        this.y = y;
    }
    
    public final void c(final long c) {
        final long c2 = this.C;
        final int i = j86.i;
        if (!foo.a(c2, c)) {
            this.v |= 0x40;
            this.C = c;
        }
    }
    
    public final void d(final boolean i) {
        if (this.I != i) {
            this.v |= 0x4000;
            this.I = i;
        }
    }
    
    public final void e(final int j) {
        if (this.J == j) {
            return;
        }
        this.v |= 0x8000;
        this.J = j;
    }
    
    public final void f(final r1 o) {
        if (!mlc.q((Object)this.O, (Object)o)) {
            this.v |= 0x20000;
            this.O = o;
        }
    }
    
    public final void g(final float e) {
        if (this.E == e) {
            return;
        }
        this.v |= 0x400;
        this.E = e;
    }
    
    public final float getDensity() {
        return this.M.getDensity();
    }
    
    public final void h(final float w) {
        if (this.w == w) {
            return;
        }
        this.v |= 0x1;
        this.w = w;
    }
    
    public final void j(final float x) {
        if (this.x == x) {
            return;
        }
        this.v |= 0x2;
        this.x = x;
    }
    
    public final void k(final float b) {
        if (this.B == b) {
            return;
        }
        this.v |= 0x20;
        this.B = b;
    }
    
    public final void n(final aql h) {
        if (!mlc.q((Object)this.H, (Object)h)) {
            this.v |= 0x2000;
            this.H = h;
        }
    }
    
    public final void o(final long d) {
        final long d2 = this.D;
        final int i = j86.i;
        if (!foo.a(d2, d)) {
            this.v |= 0x80;
            this.D = d;
        }
    }
    
    public final float o0() {
        return this.M.o0();
    }
    
    public final void p(final long g) {
        if (!jeo.a(this.G, g)) {
            this.v |= 0x1000;
            this.G = g;
        }
    }
    
    public final void s(final float z) {
        if (this.z == z) {
            return;
        }
        this.v |= 0x8;
        this.z = z;
    }
    
    public final void t(final float a) {
        if (this.A == a) {
            return;
        }
        this.v |= 0x10;
        this.A = a;
    }
}
