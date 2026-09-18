import java.util.Map;

public final class r0d implements noe
{
    public final byte a;
    public final noe b;
    public final v0d c;
    public final int d;
    public final noe e;
    
    public final int a() {
        switch (this.a) {
            default: {
                return this.b.a();
            }
            case 0: {
                return this.b.a();
            }
        }
    }
    
    public final int b() {
        switch (this.a) {
            default: {
                return this.b.b();
            }
            case 0: {
                return this.b.b();
            }
        }
    }
    
    public final Map c() {
        switch (this.a) {
            default: {
                return this.b.c();
            }
            case 0: {
                return this.b.c();
            }
        }
    }
    
    public final void d() {
        final byte a = this.a;
        final noe e = this.e;
        final int d = this.d;
        final v0d c = this.c;
        switch (a) {
            default: {
                c.y = d;
                e.d();
                if (c.v.D == null) {
                    c.f(c.y);
                }
                return;
            }
            case 0: {
                c.z = d;
                e.d();
                final inf h = c.H;
                final tmf g = c.G;
                final long[] a2 = g.a;
                final int n = a2.length - 2;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        long n3 = a2[n2];
                        if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n4 = 8;
                            final int n5 = 8 - (~(n2 - n) >>> 31);
                            for (int i = 0; i < n5; ++i) {
                                if ((0xFFL & n3) < 128L) {
                                    final int n6 = (n2 << 3) + i;
                                    final Object o = g.b[n6];
                                    final e1n e1n = (e1n)g.c[n6];
                                    final int j = h.j(o);
                                    if (j < 0 || j >= c.z) {
                                        if (j >= 0) {
                                            final Object c2 = c5q.c;
                                            final Object[] v = h.v;
                                            final Object o2 = v[j];
                                            v[j] = c2;
                                        }
                                        if (c.E.b(o)) {
                                            e1n.a();
                                        }
                                        g.l(n6);
                                    }
                                }
                                n3 >>= n4;
                            }
                            if (n5 != n4) {
                                break;
                            }
                        }
                        if (n2 == n) {
                            break;
                        }
                        ++n2;
                    }
                }
                c.f(c.y);
            }
        }
    }
    
    public final lta e() {
        switch (this.a) {
            default: {
                return this.b.e();
            }
            case 0: {
                return this.b.e();
            }
        }
    }
    
    public final zta f() {
        switch (this.a) {
            default: {
                return this.b.f();
            }
            case 0: {
                return this.b.f();
            }
        }
    }
    
    public final lta g() {
        switch (this.a) {
            default: {
                return this.b.g();
            }
            case 0: {
                return this.b.g();
            }
        }
    }
}
