import java.util.Collection;
import java.util.List;

public final class akb
{
    public final nzc a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final emf f;
    public final byf g;
    public final rlf h;
    
    public akb(final nzc a) {
        this.a = a;
        this.f = new emf();
        this.g = new byf();
        this.h = new rlf(10);
    }
    
    public final void a(long n, final List list, final boolean b) {
        final int size = ((Collection)list).size();
        byf g;
        final byf byf = g = this.g;
        int n2 = 1;
        int n3 = 0;
        rlf h = null;
    Label_0250_Outer:
        while (true) {
            h = this.h;
            if (n3 >= size) {
                break;
            }
            final hgf obj = (hgf)list.get(n3);
            int n4 = n2;
            byf byf2 = g;
            Label_0346: {
                if (obj.I) {
                    obj.H = new u78((Object)this, (Object)obj, (byte)23);
                Label_0250:
                    while (true) {
                        Label_0260: {
                            if ((n4 = n2) != 0) {
                                final inf a = g.a;
                                final Object[] v = a.v;
                                final int x = a.x;
                                int i = 0;
                                while (true) {
                                    while (i < x) {
                                        final Object o = v[i];
                                        if (((oxf)o).c.equals(obj)) {
                                            final oxf oxf = (oxf)o;
                                            if (oxf == null) {
                                                n4 = 0;
                                                break Label_0260;
                                            }
                                            oxf.i = true;
                                            oxf.d.a(n);
                                            oxf oxf2 = oxf;
                                            n4 = n2;
                                            if (b) {
                                                Object e;
                                                if ((e = h.e(n)) == null) {
                                                    e = new emf();
                                                    h.i(n, e);
                                                }
                                                ((emf)e).b((Object)oxf);
                                                n4 = n2;
                                                oxf2 = oxf;
                                            }
                                            break Label_0250;
                                        }
                                        else {
                                            ++i;
                                        }
                                    }
                                    final Object o = null;
                                    continue Label_0250_Outer;
                                }
                            }
                            break Label_0260;
                            oxf oxf2 = null;
                            byf2 = oxf2;
                            break Label_0346;
                        }
                        final oxf oxf3 = new oxf(obj);
                        oxf3.d.a(n);
                        if (b) {
                            Object e2;
                            if ((e2 = h.e(n)) == null) {
                                e2 = new emf();
                                h.i(n, e2);
                            }
                            ((emf)e2).b((Object)oxf3);
                        }
                        g.a.b(oxf3);
                        oxf oxf2 = oxf3;
                        continue Label_0250;
                    }
                }
            }
            ++n3;
            n2 = n4;
            g = byf2;
        }
        if (b) {
            final long[] b2 = h.b;
            final Object[] c = h.c;
            final long[] a2 = h.a;
            final int n5 = a2.length - 2;
            if (n5 >= 0) {
                int n6 = 0;
                while (true) {
                    n = a2[n6];
                    if ((~n << 7 & n & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n7 = 8;
                        final int n8 = 8 - (~(n6 - n5) >>> 31);
                        for (int j = 0; j < n8; ++j) {
                            if ((0xFFL & n) < 128L) {
                                final int n9 = (n6 << 3) + j;
                                final long n10 = b2[n9];
                                final emf emf = (emf)c[n9];
                                final inf a3 = byf.a;
                                final Object[] v2 = a3.v;
                                for (int x2 = a3.x, k = 0; k < x2; ++k) {
                                    ((oxf)v2[k]).f(n10, emf);
                                }
                            }
                            n >>= n7;
                        }
                        if (n8 != n7) {
                            break;
                        }
                    }
                    if (n6 == n5) {
                        break;
                    }
                    ++n6;
                }
            }
        }
        h.a();
    }
    
    public final boolean b(final ms9 ms9, final boolean b) {
        final byf g = this.g;
        final inf a = g.a;
        if (!g.a((rwd)ms9.b, this.a, ms9, b)) {
            return false;
        }
        final boolean b2 = true;
        this.b = true;
        final Object[] v = a.v;
        final int x = a.x;
        int i = 0;
        int n = 0;
        while (i < x) {
            final boolean b3 = ((oxf)v[i]).e(ms9, b) || n != 0;
            ++i;
            n = (b3 ? 1 : 0);
        }
        final Object[] v2 = a.v;
        final int x2 = a.x;
        int j = 0;
        int n2 = 0;
        while (j < x2) {
            if (!((oxf)v2[j]).d(ms9) && n2 == 0) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            ++j;
        }
        g.b(ms9);
        boolean b4 = b2;
        if (n2 == 0) {
            b4 = (n != 0 && b2);
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            final emf f = this.f;
            for (int b5 = f.b, k = 0; k < b5; ++k) {
                this.d((hgf)f.g(k));
            }
            f.e();
        }
        if (this.c) {
            this.c = false;
            this.c();
        }
        if (this.d) {
            this.d = false;
            g.a.h();
        }
        return b4;
    }
    
    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        final byf g = this.g;
        final inf a = g.a;
        final Object[] v = a.v;
        for (int x = a.x, i = 0; i < x; ++i) {
            ((oxf)v[i]).c();
        }
        if (this.d) {
            this.d = true;
            return;
        }
        g.a.h();
    }
    
    public final void d(final hgf obj) {
        if (this.b) {
            this.e = true;
            this.f.b((Object)obj);
            return;
        }
        final byf g = this.g;
        final emf b = g.b;
        b.e();
        b.b((Object)g);
        while (b.j()) {
            final byf byf = (byf)b.l(b.b - 1);
            int n = 0;
            while (true) {
                final inf a = byf.a;
                if (n >= a.x) {
                    break;
                }
                final oxf oxf = (oxf)a.v[n];
                if (oxf.c.equals(obj)) {
                    byf.a.k(oxf);
                    oxf.c();
                }
                else {
                    b.b((Object)oxf);
                    ++n;
                }
            }
        }
    }
}
