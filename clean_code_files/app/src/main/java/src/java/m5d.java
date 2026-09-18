import java.util.Collection;
import java.util.List;

public final class m5d implements g4d
{
    public final int[] A;
    public final int a;
    public final List b;
    public final boolean c;
    public final dx d;
    public final lb2 e;
    public final qzc f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final z3d n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    
    public m5d(int max, final List b, final boolean c, final dx d, final lb2 e, final qzc f, final boolean g, int i, int n, int j, final long k, final Object l, final Object m, final z3d n2, final long o) {
        this.a = max;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = i;
        this.i = n;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n2;
        this.o = o;
        this.x = Integer.MIN_VALUE;
        final int size = ((Collection)b).size();
        i = 0;
        n = (max = 0);
        while (i < size) {
            final o8h o8h = (o8h)b.get(i);
            final boolean c2 = this.c;
            if (c2) {
                j = o8h.w;
            }
            else {
                j = o8h.v;
            }
            j += n;
            if (!c2) {
                n = o8h.w;
            }
            else {
                n = o8h.v;
            }
            max = Math.max(max, n);
            ++i;
            n = j;
        }
        this.q = n;
        this.v = max;
        this.A = new int[this.b.size() * 2];
        if (this.c) {
            this.u = this.j;
            this.s = n;
            this.r = max;
            this.t = 0;
            return;
        }
        this.u = 0;
        this.s = max;
        this.r = n;
        this.t = this.j;
    }
    
    public final int a(long n) {
        if (this.c) {
            n &= 0xFFFFFFFFL;
        }
        else {
            n >>= 32;
        }
        return (int)n;
    }
    
    public final int b() {
        int n;
        int n2;
        if (this.c) {
            n = this.s;
            n2 = this.u;
        }
        else {
            n = this.r;
            n2 = this.t;
        }
        final int n3 = n + n2;
        if (n3 < 0) {
            return 0;
        }
        return n3;
    }
    
    public final void c(final n8h n8h, final boolean b) {
        if (this.x == Integer.MIN_VALUE) {
            jac.a("position() should be called first");
        }
        final List b2 = this.b;
        for (int size = b2.size(), i = 0; i < size; ++i) {
            final o8h o8h = (o8h)b2.get(i);
            final int y = this.y;
            final boolean c = this.c;
            int n;
            if (c) {
                n = o8h.w;
            }
            else {
                n = o8h.v;
            }
            final int n2 = y - n;
            final int z = this.z;
            long n3 = this.k(i);
            final v3d a = this.n.a(i, this.l);
            g6b f;
            if (a != null) {
                if (b) {
                    a.o(n3);
                }
                else {
                    if (!ugc.b(a.g(), 9223372034707292159L)) {
                        n3 = a.g();
                    }
                    final long d = ugc.d(n3, a.h());
                    if ((this.a(n3) <= n2 && this.a(d) <= n2) || (this.a(n3) >= z && this.a(d) >= z)) {
                        a.e();
                    }
                    n3 = d;
                }
                f = a.f();
            }
            else {
                f = null;
            }
            if (this.g) {
                final int x = this.x;
                if (c) {
                    final int n4 = (int)(n3 >> 32);
                    final int n5 = (int)(n3 & 0xFFFFFFFFL);
                    int n6;
                    if (c) {
                        n6 = o8h.w;
                    }
                    else {
                        n6 = o8h.v;
                    }
                    n3 = ((long)n4 << 32 | ((long)(x - n5 - n6) & 0xFFFFFFFFL));
                }
                else {
                    final int n7 = (int)(n3 >> 32);
                    int n8;
                    if (c) {
                        n8 = o8h.w;
                    }
                    else {
                        n8 = o8h.v;
                    }
                    n3 = ((long)(x - n7 - n8) << 32 | ((long)(int)(n3 & 0xFFFFFFFFL) & 0xFFFFFFFFL));
                }
            }
            final long d2 = ugc.d(n3, this.k);
            if (!b && a != null) {
                a.q(d2);
            }
            if (c) {
                if (f != null) {
                    n8h.e(o8h);
                    o8h.b0(ugc.d(d2, o8h.z), 0.0f, f);
                }
                else {
                    n8h.p(n8h, o8h, d2, (qd0)null, 6);
                }
            }
            else if (f != null) {
                if (n8h.c() != qzc.v && n8h.d() != 0) {
                    final int d3 = n8h.d();
                    final int v = o8h.v;
                    final int n9 = (int)(d2 >> 32);
                    final int n10 = (int)(d2 & 0xFFFFFFFFL);
                    final long n11 = d3 - v - n9;
                    final long n12 = n10;
                    n8h.e(o8h);
                    o8h.b0(ugc.d(n11 << 32 | (n12 & 0xFFFFFFFFL), o8h.z), 0.0f, f);
                }
                else {
                    n8h.e(o8h);
                    o8h.b0(ugc.d(d2, o8h.z), 0.0f, f);
                }
            }
            else {
                n8h.n(n8h, o8h, d2);
            }
        }
    }
    
    @Override
    public final int d() {
        return 1;
    }
    
    @Override
    public final void e(final int n, final int n2, final int n3, final int n4) {
        this.o(n, n3, n4);
    }
    
    @Override
    public final int f() {
        return this.t;
    }
    
    @Override
    public final int g() {
        return this.s;
    }
    
    @Override
    public final int getIndex() {
        return this.a;
    }
    
    @Override
    public final Object getKey() {
        return this.l;
    }
    
    @Override
    public final long h() {
        return this.o;
    }
    
    @Override
    public final List i() {
        return this.b;
    }
    
    @Override
    public final int j() {
        return this.u;
    }
    
    @Override
    public final long k(int p) {
        if (p != 0 || this.b.size() != 0) {
            final int n = p * 2;
            final int[] a = this.A;
            p = a[n];
            return ((long)a[n + 1] & 0xFFFFFFFFL) | (long)p << 32;
        }
        p = this.p;
        if (this.c) {
            return (long)p & 0xFFFFFFFFL;
        }
        return (long)p << 32;
    }
    
    @Override
    public final int l() {
        return 0;
    }
    
    @Override
    public final int m() {
        return this.r;
    }
    
    @Override
    public final void n() {
        this.w = true;
    }
    
    public final void o(int i, final int n, final int n2) {
        this.p = i;
        final boolean c = this.c;
        int x;
        if (c) {
            x = n2;
        }
        else {
            x = n;
        }
        this.x = x;
        final List b = this.b;
        final int size = ((Collection)b).size();
        final int n3 = 0;
        int n4 = i;
        o8h o8h;
        int n5;
        int[] a;
        dx d;
        int n6;
        lb2 e;
        for (i = n3; i < size; ++i) {
            o8h = (o8h)b.get(i);
            n5 = i * 2;
            a = this.A;
            if (c) {
                d = this.d;
                if (d == null) {
                    throw hia.s("null horizontalAlignment when isVertical == true");
                }
                a[n5] = d.a(o8h.v, n, this.f);
                a[n5 + 1] = n4;
                n6 = o8h.w;
            }
            else {
                a[n5] = n4;
                e = this.e;
                if (e == null) {
                    throw hia.s("null verticalAlignment when isVertical == false");
                }
                a[n5 + 1] = e.a(o8h.w, n2);
                n6 = o8h.v;
            }
            n4 += n6;
        }
        this.y = -this.h;
        this.z = this.x + this.i;
    }
}
