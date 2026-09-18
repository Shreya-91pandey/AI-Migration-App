import androidx.work.OverwritingInputMerger;

public final class v5q
{
    public static final oyl A;
    public static final String z;
    public final String a;
    public x4q b;
    public final String c;
    public final String d;
    public nt7 e;
    public final nt7 f;
    public long g;
    public long h;
    public long i;
    public fv6 j;
    public final int k;
    public int l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public int r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;
    
    static {
        z = krd.e("WorkSpec");
        A = new oyl((byte)29);
    }
    
    public v5q(final String a, final x4q b, final String c, final String d, final nt7 e, final nt7 f, final long g, final long h, final long i, final fv6 j, final int k, final int l, final long m, final long n, final long o, final long p25, final boolean q, final int r, final int s, final int t, final long u, final int v, final int w, final String x, final Boolean y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p25;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public static v5q b(final v5q v5q, String a, x4q b, nt7 e, int k, long n, int s, int t, long u, int v, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            a = v5q.a;
        }
        if ((n2 & 0x2) != 0x0) {
            b = v5q.b;
        }
        String c;
        if ((n2 & 0x4) != 0x0) {
            c = v5q.c;
        }
        else {
            c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        }
        final String d = v5q.d;
        if ((n2 & 0x10) != 0x0) {
            e = v5q.e;
        }
        final nt7 f = v5q.f;
        final long g = v5q.g;
        final long h = v5q.h;
        final long i = v5q.i;
        final fv6 j = v5q.j;
        if ((n2 & 0x400) != 0x0) {
            k = v5q.k;
        }
        final int l = v5q.l;
        final long m = v5q.m;
        if ((n2 & 0x2000) != 0x0) {
            n = v5q.n;
        }
        final long o = v5q.o;
        final long p11 = v5q.p;
        final boolean q = v5q.q;
        final int r = v5q.r;
        if ((n2 & 0x40000) != 0x0) {
            s = v5q.s;
        }
        if ((n2 & 0x80000) != 0x0) {
            t = v5q.t;
        }
        if ((n2 & 0x100000) != 0x0) {
            u = v5q.u;
        }
        if ((n2 & 0x200000) != 0x0) {
            v = v5q.v;
        }
        return new v5q(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p11, q, r, s, t, u, v, v5q.w, v5q.x, v5q.y);
    }
    
    public final long a() {
        return zn2.n(this.b == x4q.v && this.k > 0, this.k, this.l, this.m, this.n, this.s, this.c(), this.g, this.i, this.h, this.u);
    }
    
    public final boolean c() {
        return this.h != 0L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof v5q) {
                final v5q v5q = (v5q)o;
                if (mlc.q((Object)this.a, (Object)v5q.a)) {
                    if (this.b == v5q.b) {
                        if (mlc.q((Object)this.c, (Object)v5q.c)) {
                            if (mlc.q((Object)this.d, (Object)v5q.d)) {
                                if (mlc.q((Object)this.e, (Object)v5q.e)) {
                                    if (mlc.q((Object)this.f, (Object)v5q.f)) {
                                        if (this.g == v5q.g) {
                                            if (this.h == v5q.h) {
                                                if (this.i == v5q.i) {
                                                    if (mlc.q((Object)this.j, (Object)v5q.j)) {
                                                        if (this.k == v5q.k) {
                                                            if (this.l == v5q.l) {
                                                                if (this.m == v5q.m) {
                                                                    if (this.n == v5q.n) {
                                                                        if (this.o == v5q.o) {
                                                                            if (this.p == v5q.p) {
                                                                                if (this.q == v5q.q) {
                                                                                    if (this.r == v5q.r) {
                                                                                        if (this.s == v5q.s) {
                                                                                            if (this.t == v5q.t) {
                                                                                                if (this.u == v5q.u) {
                                                                                                    if (this.v == v5q.v) {
                                                                                                        if (this.w == v5q.w) {
                                                                                                            if (mlc.q((Object)this.x, (Object)v5q.x)) {
                                                                                                                if (mlc.q((Object)this.y, (Object)v5q.y)) {
                                                                                                                    return true;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int y = hia.y(this.w, hia.y(this.v, hia.d(hia.y(this.t, hia.y(this.s, hia.b(this.r, smk.l(hia.d(hia.d(hia.d(hia.d(hia.b(this.l, hia.y(this.k, (this.j.hashCode() + hia.d(hia.d(hia.d((this.f.hashCode() + (this.e.hashCode() + smk.j(smk.j((this.b.hashCode() + this.a.hashCode() * 31) * 31, 31, this.c), 31, this.d)) * 31) * 31, this.g, 31), this.h, 31), this.i, 31)) * 31, 31), 31), this.m, 31), this.n, 31), this.o, 31), this.p, 31), 31, this.q), 31), 31), 31), this.u, 31), 31), 31);
        final String x = this.x;
        int hashCode = 0;
        int hashCode2;
        if (x == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = x.hashCode();
        }
        final Boolean y2 = this.y;
        if (y2 != null) {
            hashCode = y2.hashCode();
        }
        return (y + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return xc2.k(new StringBuilder("{WorkSpec: "), this.a, '}');
    }
}
