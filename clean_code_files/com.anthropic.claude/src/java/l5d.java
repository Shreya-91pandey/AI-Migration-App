import java.util.Collection;
import java.util.Map;
import java.util.List;

public final class l5d implements noe
{
    public final m5d a;
    public final int b;
    public final boolean c;
    public final float d;
    public final noe e;
    public final float f;
    public final boolean g;
    public final oc7 h;
    public final xc8 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final zhg q;
    public final int r;
    public final int s;
    
    public l5d(final m5d a, final int b, final boolean c, final float d, final noe e, final float f, final boolean g, final oc7 h, final xc8 i, final long j, final int k, final List l, final int m, final int n, final int o, final boolean p19, final zhg q, final int r, final int s) {
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
        this.p = p19;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final int a() {
        return this.e.a();
    }
    
    @Override
    public final int b() {
        return this.e.b();
    }
    
    @Override
    public final Map c() {
        return this.e.c();
    }
    
    @Override
    public final void d() {
        this.e.d();
    }
    
    @Override
    public final lta e() {
        return this.e.e();
    }
    
    @Override
    public final zta f() {
        return this.e.f();
    }
    
    @Override
    public final lta g() {
        return this.e.g();
    }
    
    public final l5d h(final int n, final boolean b) {
        if (!this.g) {
            final List l = this.l;
            if (!l.isEmpty()) {
                final m5d a = this.a;
                if (a != null) {
                    final int b2 = a.b();
                    int n2 = this.b - n;
                    if (n2 >= 0 && n2 < b2) {
                        final m5d m5d = (m5d)c86.G0(l);
                        final m5d m5d2 = (m5d)c86.P0(l);
                        if (!m5d.w) {
                            if (!m5d2.w) {
                                final int p2 = m5d.p;
                                final int n3 = this.n;
                                final int m = this.m;
                                if (n < 0) {
                                    if (Math.min(m5d.b() + p2 - m, m5d2.b() + m5d2.p - n3) <= -n) {
                                        return null;
                                    }
                                }
                                else if (Math.min(m - p2, n3 - m5d2.p) <= n) {
                                    return null;
                                }
                                int n4;
                                for (int size = ((Collection)l).size(), i = 0; i < size; ++i, n2 = n4) {
                                    final m5d m5d3 = (m5d)l.get(i);
                                    final boolean c = m5d3.c;
                                    final int[] a2 = m5d3.A;
                                    if (m5d3.w) {
                                        n4 = n2;
                                    }
                                    else {
                                        m5d3.p += n;
                                        for (int length = a2.length, j = 0; j < length; ++j) {
                                            final int n5 = j & 0x1;
                                            if ((c && n5 != 0) || (!c && n5 == 0)) {
                                                a2[j] += n;
                                            }
                                        }
                                        n4 = n2;
                                        if (b) {
                                            final int size2 = m5d3.b.size();
                                            int n6 = 0;
                                            while (true) {
                                                n4 = n2;
                                                if (n6 >= size2) {
                                                    break;
                                                }
                                                final v3d a3 = m5d3.n.a(n6, m5d3.l);
                                                if (a3 != null) {
                                                    final long k = a3.j();
                                                    int n7;
                                                    int n8;
                                                    if (c) {
                                                        n7 = (int)(k >> 32);
                                                        n8 = (int)(k & 0xFFFFFFFFL) + n;
                                                    }
                                                    else {
                                                        n7 = (int)(k >> 32) + n;
                                                        n8 = (int)(k & 0xFFFFFFFFL);
                                                    }
                                                    a3.r(((long)n8 & 0xFFFFFFFFL) | (long)n7 << 32);
                                                }
                                                ++n6;
                                            }
                                        }
                                    }
                                }
                                return new l5d(this.a, n2, this.c || n > 0, (float)n, this.e, this.f, this.g, this.h, this.i, this.j, this.k, l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public final long i() {
        final noe e = this.e;
        return (long)e.b() << 32 | ((long)e.a() & 0xFFFFFFFFL);
    }
}
