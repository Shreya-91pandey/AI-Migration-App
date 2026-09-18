import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public final class y5m
{
    public final v5m a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public jlf f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final dhc p;
    public final dhc q;
    public final dhc r;
    public jlf s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public ilf x;
    
    public y5m(final v5m a) {
        this.a = a;
        final int[] v = a.v;
        this.b = v;
        final Object[] x = a.x;
        this.c = x;
        this.d = a.D;
        this.e = a.E;
        this.f = a.F;
        final int w = a.w;
        this.g = w;
        this.h = v.length / 5 - w;
        final int y = a.y;
        this.k = y;
        this.l = x.length - y;
        this.m = w;
        this.p = new dhc((byte)1);
        this.q = new dhc((byte)1);
        this.r = new dhc((byte)1);
        this.u = w;
        this.v = -1;
    }
    
    public static int h(final int n, final int n2, final int n3, final int n4) {
        int n5 = n;
        if (n > n2) {
            n5 = -(n4 - n3 - n + 1);
        }
        return n5;
    }
    
    public static void y(final y5m y5m) {
        final int v = y5m.v;
        final int q = y5m.q(v);
        final int[] b = y5m.b;
        final int n = q * 5 + 1;
        final int n2 = b[n];
        if ((n2 & 0x8000000) == 0x0) {
            final int n3 = (n2 & 0xF7FFFFFF) | 0x8000000;
            b[n] = n3;
            if ((0x4000000 & n3) == 0x0) {
                y5m.V(y5m.F(b, v));
            }
        }
    }
    
    public final void A(final int g) {
        final int h = this.h;
        final int g2 = this.g;
        if (g2 != g) {
            if (!this.d.isEmpty()) {
                final int n = this.n() - this.h;
                final ArrayList d = this.d;
                if (g2 < g) {
                    for (int i = x5m.b(d, g2, n); i < this.d.size(); ++i) {
                        final bva bva = (bva)this.d.get(i);
                        final int a = bva.a;
                        if (a >= 0) {
                            break;
                        }
                        final int a2 = a + n;
                        if (a2 >= g) {
                            break;
                        }
                        bva.a = a2;
                    }
                }
                else {
                    for (int j = x5m.b(d, g, n); j < this.d.size(); ++j) {
                        final bva bva2 = (bva)this.d.get(j);
                        final int a3 = bva2.a;
                        if (a3 < 0) {
                            break;
                        }
                        bva2.a = -(n - a3);
                    }
                }
            }
            if (h > 0) {
                final int[] b = this.b;
                final int n2 = g * 5;
                final int n3 = h * 5;
                final int n4 = g2 * 5;
                if (g < g2) {
                    iw0.J0(n3 + n2, n2, n4, b, b);
                }
                else {
                    iw0.J0(n4, n4 + n3, n2 + n3, b, b);
                }
            }
            int k;
            if (g < (k = g2)) {
                k = g + h;
            }
            final int n5 = this.n();
            if (k >= n5) {
                ti6.a("Check failed");
            }
            while (k < n5) {
                final int[] b2 = this.b;
                final int n6 = k * 5 + 2;
                final int n7 = b2[n6];
                int n8;
                if (n7 > -2) {
                    n8 = n7;
                }
                else {
                    n8 = this.o() + n7 + 2;
                }
                if (n8 >= g) {
                    n8 = -(this.o() - n8 + 2);
                }
                if (n8 != n7) {
                    this.b[n6] = n8;
                }
                final int n9 = k + 1;
                if ((k = n9) == g) {
                    k = n9 + h;
                }
            }
        }
        this.g = g;
    }
    
    public final void B(final int k, int i) {
        final int l = this.l;
        final int j = this.k;
        final int m = this.m;
        if (j != k) {
            final Object[] c = this.c;
            if (k < j) {
                System.arraycopy((Object)c, k, (Object)c, k + l, j - k);
            }
            else {
                final int n = j + l;
                System.arraycopy((Object)c, n, (Object)c, j, k + l - n);
            }
        }
        final int min = Math.min(i + 1, this.o());
        if (m != min) {
            final int n2 = this.c.length - l;
            if (min < m) {
                i = this.q(min);
                final int q = this.q(m);
                final int g = this.g;
                while (i < q) {
                    final int[] b = this.b;
                    final int n3 = i * 5 + 4;
                    final int n4 = b[n3];
                    if (n4 < 0) {
                        ti6.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[n3] = -(n2 - n4 + 1);
                    final int n5 = ++i;
                    if (n5 == g) {
                        i = n5 + this.h;
                    }
                }
            }
            else {
                int[] b2;
                int n6;
                int n7;
                int n8;
                for (i = this.q(m); i < this.q(min); i = n8 + this.h) {
                    b2 = this.b;
                    n6 = i * 5 + 4;
                    n7 = b2[n6];
                    if (n7 >= 0) {
                        ti6.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[n6] = n7 + n2 + 1;
                    n8 = ++i;
                    if (n8 == this.g) {}
                }
            }
            this.m = min;
        }
        this.k = k;
    }
    
    public final List C(final bva bva, final y5m y5m) {
        if (y5m.n <= 0) {
            ti6.a("Check failed");
        }
        if (this.n != 0) {
            ti6.a("Check failed");
        }
        if (!bva.a()) {
            ti6.a("Check failed");
        }
        final int c = this.c(bva);
        int n = 1;
        final int n2 = c + 1;
        final int t = this.t;
        if (t > n2 || n2 >= this.u) {
            ti6.a("Check failed");
        }
        int i = this.F(this.b, n2);
        final int t2 = this.t(n2);
        int e;
        if (this.x(n2)) {
            e = 1;
        }
        else {
            e = this.E(n2);
        }
        final List c2 = ien.C(this, n2, y5m, false, false, true);
        this.V(i);
        if (e <= 0) {
            n = 0;
        }
        while (i >= t) {
            final int q = this.q(i);
            final int[] b = this.b;
            final int n3 = q * 5;
            final int n4 = n3 + 3;
            b[n4] -= t2;
            int n5;
            if ((n5 = n) != 0) {
                final int n6 = b[n3 + 1];
                if ((0x40000000 & n6) != 0x0) {
                    n5 = 0;
                }
                else {
                    x5m.f(q, (n6 & 0x3FFFFFF) - e, b);
                    n5 = n;
                }
            }
            i = this.F(this.b, i);
            n = n5;
        }
        if (n != 0) {
            if (this.o < e) {
                ti6.a("Check failed");
            }
            this.o -= e;
        }
        return c2;
    }
    
    public final Object D(int q) {
        q = this.q(q);
        final int[] b = this.b;
        if ((b[q * 5 + 1] & 0x40000000) != 0x0) {
            return this.c[this.g(this.f(b, q))];
        }
        return null;
    }
    
    public final int E(final int n) {
        return this.b[this.q(n) * 5 + 1] & 0x3FFFFFF;
    }
    
    public final int F(final int[] array, int n) {
        n = array[this.q(n) * 5 + 2];
        if (n > -2) {
            return n;
        }
        return this.o() + n + 2;
    }
    
    public final Object G(final Object o) {
        if (this.n > 0) {
            this.w(1, this.v);
        }
        final Object o2 = this.c[this.g(this.i++)];
        if (this.i > this.j) {
            ti6.a("Writing to an invalid slot");
        }
        this.c[this.g(this.i - 1)] = o;
        return o2;
    }
    
    public final void H() {
        final ilf x = this.x;
        if (x != null) {
            while (x.b != 0) {
                final int w = soh.W(x);
                final int q = this.q(w);
                int n = w + 1;
                final int t = this.t(w);
                int n2;
                int n3;
                while (true) {
                    n2 = 0;
                    if (n >= t + w) {
                        n3 = 0;
                        break;
                    }
                    if ((this.b[this.q(n) * 5 + 1] & 0xC000000) != 0x0) {
                        n3 = 1;
                        break;
                    }
                    n += this.t(n);
                }
                final int[] b = this.b;
                final int n4 = q * 5 + 1;
                final int n5 = b[n4];
                if ((0x4000000 & n5) != 0x0) {
                    n2 = 1;
                }
                if (n2 != n3) {
                    b[n4] = (n3 << 26 | (0xFBFFFFFF & n5));
                    final int f = this.F(b, w);
                    if (f < 0) {
                        continue;
                    }
                    soh.h(x, f);
                }
            }
        }
    }
    
    public final boolean I() {
        if (this.n != 0) {
            ti6.a("Cannot remove group while inserting");
        }
        final int t = this.t;
        final int i = this.i;
        final int f = this.f(this.b, this.q(t));
        final int m = this.M();
        this.P(this.v);
        final ilf x = this.x;
        if (x != null) {
            while (true) {
                final int b = x.b;
                if (b == 0) {
                    break;
                }
                if (b == 0) {
                    qiq.u("IntList is empty.");
                    throw null;
                }
                if (x.a[0] < t) {
                    break;
                }
                soh.W(x);
            }
        }
        final boolean j = this.J(t, this.t - t);
        this.K(f, this.i - f, t - 1);
        this.t = t;
        this.i = i;
        this.o -= m;
        return j;
    }
    
    public final boolean J(int g, final int n) {
        int n2 = 0;
        int n3 = 0;
        final int n4 = 0;
        if (n > 0) {
            final ArrayList d = this.d;
            this.A(g);
            if (!d.isEmpty()) {
                final HashMap e = this.e;
                final int h = this.h;
                final int n5 = g + n;
                final int b = x5m.b(this.d, n5, this.n() - h);
                int i;
                if ((i = b) >= this.d.size()) {
                    i = b - 1;
                }
                int n6 = i + 1;
                int n7 = 0;
                while (i >= 0) {
                    final bva bva = (bva)this.d.get(i);
                    final int c = this.c(bva);
                    if (c < g) {
                        break;
                    }
                    int n8 = n7;
                    if (c < n5) {
                        bva.a = Integer.MIN_VALUE;
                        if (e != null) {
                            final iva iva = (iva)e.remove((Object)bva);
                        }
                        if ((n8 = n7) == 0) {
                            n8 = i + 1;
                        }
                        n6 = i;
                    }
                    --i;
                    n7 = n8;
                }
                int n9 = n4;
                if (n6 < n7) {
                    n9 = 1;
                }
                n2 = n9;
                if (n9 != 0) {
                    this.d.subList(n6, n7).clear();
                    n2 = n9;
                }
            }
            this.g = g;
            this.h += n;
            final int m = this.m;
            if (m > g) {
                this.m = Math.max(g, m - n);
            }
            g = this.u;
            if (g >= this.g) {
                this.u = g - n;
            }
            g = this.v;
            n3 = n2;
            if (g >= 0) {
                n3 = n2;
                if ((this.b[this.q(g) * 5 + 1] & 0x4000000) != 0x0) {
                    this.V(g);
                    n3 = n2;
                }
            }
        }
        return n3 != 0;
    }
    
    public final void K(final int k, final int n, int j) {
        if (n > 0) {
            final int l = this.l;
            final int n2 = k + n;
            this.B(n2, j);
            this.k = k;
            this.l = l + n;
            Arrays.fill(this.c, k, n2, (Object)null);
            j = this.j;
            if (j >= k) {
                this.j = j - n;
            }
        }
    }
    
    public final Object L(int g, final int n, final Object o) {
        final int o2 = this.O(this.b, this.q(g));
        final int f = this.f(this.b, this.q(g + 1));
        final int n2 = o2 + n;
        if (n2 < o2 || n2 >= f) {
            final StringBuilder sb = new StringBuilder("Write to an invalid slot index ");
            sb.append(n);
            sb.append(" for group ");
            sb.append(g);
            ti6.a(sb.toString());
        }
        g = this.g(n2);
        final Object[] c = this.c;
        final Object o3 = c[g];
        c[g] = o;
        return o3;
    }
    
    public final int M() {
        final int q = this.q(this.t);
        final int t = this.t;
        final int[] b = this.b;
        final int n = q * 5;
        final int t2 = b[n + 3] + t;
        this.t = t2;
        this.i = this.f(b, this.q(t2));
        final int n2 = this.b[n + 1];
        if ((0x40000000 & n2) != 0x0) {
            return 1;
        }
        return n2 & 0x3FFFFFF;
    }
    
    public final void N() {
        final int u = this.u;
        this.t = u;
        this.i = this.f(this.b, this.q(u));
    }
    
    public final int O(final int[] array, int d) {
        if (d >= this.n()) {
            return this.c.length - this.l;
        }
        d = x5m.d(array, d);
        final int l = this.l;
        final int length = this.c.length;
        if (d < 0) {
            return length - l + d + 1;
        }
        return d;
    }
    
    public final iva P(final int n) {
        final HashMap e = this.e;
        if (e != null) {
            final bva s = this.S(n);
            if (s != null) {
                return (iva)e.get((Object)s);
            }
        }
        return null;
    }
    
    public final void Q() {
        if (this.n != 0) {
            ti6.a("Key must be supplied when inserting");
        }
        final cib a = bi6.a;
        this.R(0, a, false, a);
    }
    
    public final void R(int u, final Object o, final boolean b, final Object o2) {
        final int v = this.v;
        final boolean b2 = this.n > 0;
        this.r.e(this.o);
        final cib a = bi6.a;
        if (b2) {
            final int t = this.t;
            final int f = this.f(this.b, this.q(t));
            this.v(1);
            this.i = f;
            this.j = f;
            final int q = this.q(t);
            int n;
            if (o != a) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2;
            if (!b && o2 != a) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            int h;
            final int n3 = h = h(f, this.k, this.l, this.c.length);
            if (n3 >= 0) {
                h = n3;
                if (this.m < t) {
                    h = -(this.c.length - this.l - n3 + 1);
                }
            }
            final int[] b3 = this.b;
            final int v2 = this.v;
            final int n4 = q * 5;
            b3[n4] = u;
            b3[n4 + 1] = ((b ? 1 : 0) << 30 | n << 29 | n2 << 28);
            b3[n4 + 2] = v2;
            b3[n4 + 3] = 0;
            b3[n4 + 4] = h;
            u = (b ? 1 : 0) + n + n2;
            if (u > 0) {
                this.w(u, t);
                final Object[] c = this.c;
                final int n5 = u = this.i;
                if ((b ? 1 : 0) != 0) {
                    c[n5] = o2;
                    u = n5 + 1;
                }
                int n6 = u;
                if (n != 0) {
                    c[u] = o;
                    n6 = u + 1;
                }
                u = n6;
                if (n2 != 0) {
                    c[n6] = o2;
                    u = n6 + 1;
                }
                this.i = u;
            }
            this.o = 0;
            final int t2 = t + 1;
            this.v = t;
            this.t = t2;
            u = t2;
            if (v >= 0) {
                this.P(v);
                u = t2;
            }
        }
        else {
            this.p.e(v);
            u = this.n();
            this.q.e(u - this.h - this.u);
            u = this.t;
            final int q2 = this.q(u);
            if (!mlc.q(o2, (Object)a)) {
                if ((b ? 1 : 0) != 0) {
                    this.W(this.t, o2);
                }
                else {
                    this.U(o2);
                }
            }
            this.i = this.O(this.b, q2);
            this.j = this.f(this.b, this.q(this.t + 1));
            final int[] b4 = this.b;
            final int n7 = q2 * 5;
            this.o = (b4[n7 + 1] & 0x3FFFFFF);
            this.v = u;
            this.t = u + 1;
            u += b4[n7 + 3];
        }
        this.u = u;
    }
    
    public final bva S(int c) {
        if (c >= 0 && c < this.o()) {
            final ArrayList d = this.d;
            c = x5m.c(d, c, this.o());
            if (c >= 0) {
                return (bva)d.get(c);
            }
        }
        return null;
    }
    
    public final void T(final Object o) {
        if (this.n > 0 && this.i != this.k) {
            jlf s;
            if ((s = this.s) == null) {
                s = new jlf();
            }
            this.s = s;
            final int v = this.v;
            Object b;
            if ((b = ((sgc)s).b(v)) == null) {
                b = new emf();
                s.i(v, b);
            }
            ((emf)b).b(o);
            return;
        }
        this.G(o);
    }
    
    public final void U(final Object o) {
        final int q = this.q(this.t);
        final int[] b = this.b;
        final int n = q * 5 + 1;
        if ((b[n] & 0x10000000) == 0x0) {
            ti6.a("Updating the data of a group that was not created with a data slot");
        }
        final Object[] c = this.c;
        final int[] b2 = this.b;
        c[this.g(Integer.bitCount(b2[n] >> 29) + this.f(b2, q))] = o;
    }
    
    public final void V(final int n) {
        if (n >= 0) {
            ilf x;
            if ((x = this.x) == null) {
                x = new ilf();
                this.x = x;
            }
            soh.h(x, n);
        }
    }
    
    public final void W(final int n, final Object o) {
        final int q = this.q(n);
        final int[] b = this.b;
        if (q >= b.length || (b[q * 5 + 1] & 0x40000000) == 0x0) {
            final StringBuilder sb = new StringBuilder("Updating the node of a group at ");
            sb.append(n);
            sb.append(" that was not created with as a node group");
            ti6.a(sb.toString());
        }
        this.c[this.g(this.f(this.b, q))] = o;
    }
    
    public final void a(int f) {
        if (f < 0) {
            ti6.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            pih.b("Cannot call seek() while inserting");
        }
        if (f == 0) {
            return;
        }
        f += this.t;
        final int v = this.v;
        if (f < v || f > this.u) {
            final int u = this.u;
            final StringBuilder sb = new StringBuilder("Cannot seek outside the current group (");
            sb.append(v);
            sb.append("-");
            sb.append(u);
            sb.append(")");
            ti6.a(sb.toString());
        }
        this.t = f;
        f = this.f(this.b, this.q(f));
        this.i = f;
        this.j = f;
    }
    
    public final bva b(int n) {
        final ArrayList d = this.d;
        final int c = x5m.c(d, n, this.o());
        if (c < 0) {
            if (n > this.g) {
                n = -(this.o() - n);
            }
            final bva bva = new bva(n);
            d.add(-(c + 1), (Object)bva);
            return bva;
        }
        return (bva)d.get(c);
    }
    
    public final int c(final bva bva) {
        final int a = bva.a;
        if (a < 0) {
            return this.o() + a;
        }
        return a;
    }
    
    public final void d() {
        if (this.n++ == 0) {
            this.q.e(this.n() - this.h - this.u);
        }
    }
    
    public final void e(final boolean b) {
        this.w = true;
        if (b && this.p.b == 0) {
            this.A(this.o());
            this.B(this.c.length - this.l, this.g);
            final int k = this.k;
            Arrays.fill(this.c, k, this.l + k, (Object)null);
            this.H();
        }
        final int[] b2 = this.b;
        final int g = this.g;
        final Object[] c = this.c;
        final int i = this.k;
        final ArrayList d = this.d;
        final HashMap e = this.e;
        final jlf f = this.f;
        final v5m a = this.a;
        if (!a.B) {
            pih.a("Unexpected writer close()");
        }
        a.B = false;
        a.v = b2;
        a.w = g;
        a.x = c;
        a.y = i;
        a.D = d;
        a.E = e;
        a.F = f;
    }
    
    public final int f(final int[] array, int length) {
        if (length >= this.n()) {
            return this.c.length - this.l;
        }
        final int n = array[length * 5 + 4];
        final int l = this.l;
        length = this.c.length;
        if (n < 0) {
            return length - l + n + 1;
        }
        return n;
    }
    
    public final int g(final int n) {
        final int l = this.l;
        int n2;
        if (n < this.k) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        return l * n2 + n;
    }
    
    public final void i() {
        final int n = this.n;
        final int n2 = 0;
        final int n3 = 0;
        final boolean b = n > 0;
        final int t = this.t;
        final int u = this.u;
        final int v = this.v;
        final int q = this.q(v);
        final int o = this.o;
        final int n4 = t - v;
        final int[] b2 = this.b;
        int n5 = q * 5;
        final int n6 = n5 + 1;
        final boolean b3 = (b2[n6] & 0x40000000) != 0x0;
        final dhc r = this.r;
        if (b) {
            final jlf s = this.s;
            if (s != null) {
                final emf emf = (emf)((sgc)s).b(v);
                if (emf != null) {
                    final Object[] a = emf.a;
                    for (int b4 = emf.b, i = 0; i < b4; ++i) {
                        this.G(a[i]);
                    }
                    final emf emf2 = (emf)s.g(v);
                }
            }
            final int[] b5 = this.b;
            b5[n5 + 3] = n4;
            x5m.f(q, o, b5);
            final int d = r.d();
            int n7 = o;
            if (b3) {
                n7 = 1;
            }
            this.o = d + n7;
            final int f = this.F(this.b, v);
            int n8;
            if ((this.v = f) < 0) {
                n8 = this.o();
            }
            else {
                n8 = this.q(f + 1);
            }
            int f2;
            if (n8 < 0) {
                f2 = n3;
            }
            else {
                f2 = this.f(this.b, n8);
            }
            this.i = f2;
            this.j = f2;
            return;
        }
        if (t != u) {
            ti6.a("Expected to be at the end of a group");
        }
        final int[] b6 = this.b;
        n5 += 3;
        final int n9 = b6[n5];
        final int n10 = b6[n6] & 0x3FFFFFF;
        b6[n5] = n4;
        x5m.f(q, o, b6);
        final int d2 = this.p.d();
        this.u = this.n() - this.h - this.q.d();
        this.v = d2;
        final int f3 = this.F(this.b, v);
        final int d3 = r.d();
        this.o = d3;
        if (f3 == d2) {
            int n11;
            if (b3) {
                n11 = n2;
            }
            else {
                n11 = o - n10;
            }
            this.o = d3 + n11;
            return;
        }
        final int n12 = n4 - n9;
        int n13;
        if (b3) {
            n13 = 0;
        }
        else {
            n13 = o - n10;
        }
        int f4 = f3;
        int n14 = n13;
        int n15 = 0;
        Label_0614: {
            if (n12 == 0) {
                if ((n15 = n13) == 0) {
                    break Label_0614;
                }
                n14 = n13;
                f4 = f3;
            }
            while (true) {
                n15 = n14;
                if (f4 == 0) {
                    break;
                }
                n15 = n14;
                if (f4 == d2) {
                    break;
                }
                if (n14 == 0) {
                    n15 = n14;
                    if (n12 == 0) {
                        break;
                    }
                }
                final int q2 = this.q(f4);
                if (n12 != 0) {
                    final int[] b7 = this.b;
                    final int n16 = q2 * 5 + 3;
                    b7[n16] += n12;
                }
                if (n14 != 0) {
                    final int[] b8 = this.b;
                    x5m.f(q2, (b8[q2 * 5 + 1] & 0x3FFFFFF) + n14, b8);
                }
                final int[] b9 = this.b;
                if ((b9[q2 * 5 + 1] & 0x40000000) != 0x0) {
                    n14 = 0;
                }
                f4 = this.F(b9, f4);
            }
        }
        this.o += n15;
    }
    
    public final void j() {
        if (this.n <= 0) {
            pih.b("Unbalanced begin/end insert");
        }
        final int n = this.n - 1;
        this.n = n;
        if (n == 0) {
            if (this.r.b != this.p.b) {
                ti6.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = this.n() - this.h - this.q.d();
        }
    }
    
    public final void k(final int t) {
        final int n = this.n;
        final boolean b = false;
        if (n > 0) {
            ti6.a("Cannot call ensureStarted() while inserting");
        }
        final int v = this.v;
        if (v != t) {
            int n2 = b ? 1 : 0;
            if (t >= v) {
                n2 = (b ? 1 : 0);
                if (t < this.u) {
                    n2 = 1;
                }
            }
            if (n2 == 0) {
                final StringBuilder sb = new StringBuilder("Started group at ");
                sb.append(t);
                sb.append(" must be a subgroup of the group at ");
                sb.append(v);
                ti6.a(sb.toString());
            }
            final int t2 = this.t;
            final int i = this.i;
            final int j = this.j;
            this.t = t;
            this.Q();
            this.t = t2;
            this.i = i;
            this.j = j;
        }
    }
    
    public final void l(int n, final int n2, int i) {
        if (n >= this.g) {
            n = -(this.o() - n + 2);
        }
        while (i < n2) {
            this.b[this.q(i) * 5 + 2] = n;
            final int n3 = this.b[this.q(i) * 5 + 3] + i;
            this.l(i, n3, i + 1);
            i = n3;
        }
    }
    
    public final void m(final int n, final zta zta) {
        int f = this.F(this.b, n);
        int o = this.o();
        final int t = this.t(n);
        int i = n;
        klf klf = null;
        ilf ilf = null;
        while (i < t + n) {
            int j;
            int n2;
            klf klf2;
            for (j = this.f(this.b, this.q(i)), n2 = i + 1; j < this.f(this.b, this.q(n2)); ++j, klf = klf2) {
                final Object o2 = this.c[this.g(j)];
                if (o2 instanceof kva) {
                    kva kva = (kva)o2;
                    if (!(kva instanceof kva)) {
                        kva = null;
                    }
                    if (kva == null) {
                        ti6.b("Inconsistent composition");
                        ebq.a();
                        return;
                    }
                    final int b = kva.b;
                    if (b >= 0) {
                        final int n3 = this.t(i) + i;
                        int n4 = n2;
                        int n7;
                        int n8;
                        for (int n5 = 0; n4 < n3 && n5 < b; n5 = n8, n4 = n7) {
                            final int q = this.q(n4);
                            final int[] b2 = this.b;
                            final int n6 = q * 5;
                            n7 = b2[n6 + 3] + n4;
                            n8 = n5;
                            if (n7 < n3) {
                                if ((b2[n6 + 1] & 0x20000000) != 0x0) {
                                    n8 = n5;
                                }
                                else {
                                    n8 = n5 + 1;
                                }
                            }
                        }
                        if ((klf2 = klf) == null) {
                            final int[] a = bhc.a;
                            klf2 = new klf();
                        }
                        ilf ilf2;
                        if ((ilf2 = ilf) == null) {
                            ilf2 = new ilf();
                        }
                        klf2.a(n4);
                        ilf2.a(n4);
                        ilf2.a(j);
                        ilf = ilf2;
                        continue;
                    }
                }
                zta.d((Object)j, o2);
                klf2 = klf;
            }
            int f2;
            if (n2 < o) {
                f2 = this.F(this.b, n2);
            }
            else {
                f2 = -1;
            }
            Label_0745: {
                if (f2 != i) {
                    int n9 = i;
                    int n10 = f;
                    Label_0689: {
                        while (true) {
                            int n15;
                            if (ilf != null && klf != null && klf.g(n9)) {
                                final int b3 = ilf.b;
                                final int n11 = b3 / 2;
                                int k = 0;
                                int n12 = 0;
                                while (k < n11) {
                                    final int n13 = k * 2;
                                    final int c = ilf.c(n13);
                                    int n14;
                                    if (c == n9) {
                                        final int c2 = ilf.c(n13 + 1);
                                        zta.d((Object)c2, this.c[this.g(c2)]);
                                        n14 = n12;
                                    }
                                    else if (n13 != n12) {
                                        ilf.f(n12, c);
                                        n14 = n12 + 2;
                                        ilf.f(n12 + 1, ilf.c(n13 + 1));
                                    }
                                    else {
                                        n14 = n12 + 2;
                                    }
                                    ++k;
                                    n12 = n14;
                                }
                                n15 = o;
                                if (n12 != b3) {
                                    if (n12 < 0) {
                                        break Label_0689;
                                    }
                                    final int b4 = ilf.b;
                                    if (n12 > b4 || b3 < 0 || b3 > b4) {
                                        break Label_0689;
                                    }
                                    if (b3 < n12) {
                                        break;
                                    }
                                    n15 = o;
                                    if (b3 != n12) {
                                        if (b3 < b4) {
                                            final int[] a2 = ilf.a;
                                            iw0.J0(n12, b3, b4, a2, a2);
                                        }
                                        ilf.b -= b3 - n12;
                                        n15 = o;
                                    }
                                }
                            }
                            else {
                                n15 = o;
                            }
                            o = n15;
                            if (n9 == n) {
                                break Label_0745;
                            }
                            o = n15;
                            if (n10 == f2) {
                                break Label_0745;
                            }
                            final int f3 = this.F(this.b, n10);
                            n9 = n10;
                            n10 = f3;
                            o = n15;
                        }
                        qiq.r("The end index must be < start index");
                        throw null;
                    }
                    qiq.t("Index must be between 0 and size");
                    throw null;
                }
            }
            i = n2;
            f = f2;
        }
    }
    
    public final int n() {
        return this.b.length / 5;
    }
    
    public final int o() {
        return this.n() - this.h;
    }
    
    public final Object p(int n) {
        final int q = this.q(n);
        final int[] b = this.b;
        n = q * 5 + 1;
        if ((b[n] & 0x10000000) != 0x0) {
            return this.c[Integer.bitCount(b[n] >> 29) + this.f(b, q)];
        }
        return bi6.a;
    }
    
    public final int q(final int n) {
        final int h = this.h;
        int n2;
        if (n < this.g) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        return h * n2 + n;
    }
    
    public final int r(final int n) {
        return this.b[this.q(n) * 5];
    }
    
    public final Object s(int q) {
        q = this.q(q);
        final int[] b = this.b;
        final int n = q * 5;
        q = b[n + 1];
        if ((0x20000000 & q) != 0x0) {
            return this.c[Integer.bitCount(q >> 30) + b[n + 4]];
        }
        return null;
    }
    
    public final int t(final int n) {
        return this.b[this.q(n) * 5 + 3];
    }
    
    @Override
    public final String toString() {
        final int t = this.t;
        final int u = this.u;
        final int o = this.o();
        final int g = this.g;
        final int h = this.h;
        final StringBuilder o2 = hia.o(t, u, "SlotWriter(current = ", " end=", " size = ");
        xc2.m(o, g, " gap=", "-", o2);
        return smk.q(h + g, ")", o2);
    }
    
    public final boolean u(final int n, final int n2) {
        int u;
        if (n2 == this.v) {
            u = this.u;
        }
        else {
            final dhc p2 = this.p;
            int n3 = 0;
            Label_0038: {
                if (n2 <= p2.c(0)) {
                    final int[] a = p2.a;
                    final int min = Math.min(a.length, p2.b);
                    int i = 0;
                    while (true) {
                        while (i < min) {
                            if (a[i] == n2) {
                                if (i < 0) {
                                    n3 = this.t(n2);
                                    break Label_0038;
                                }
                                u = this.n() - this.h - this.q.a[i];
                                return n > n2 && n < u;
                            }
                            else {
                                ++i;
                            }
                        }
                        i = -1;
                        continue;
                    }
                }
                n3 = this.t(n2);
            }
            u = n3 + n2;
        }
        return n > n2 && n < u;
    }
    
    public final void v(final int n) {
        if (n > 0) {
            final int t = this.t;
            this.A(t);
            final int g = this.g;
            final int h = this.h;
            final int[] b = this.b;
            final int n2 = b.length / 5;
            final int n3 = n2 - h;
            int k = 0;
            int n4 = h;
            int[] b2 = b;
            if (h < n) {
                final int max = Math.max(Math.max(n2 * 2, n3 + n), 32);
                b2 = new int[max * 5];
                n4 = max - n3;
                iw0.J0(0, 0, g * 5, b, b2);
                iw0.J0((g + n4) * 5, (h + g) * 5, n2 * 5, b, b2);
                this.b = b2;
            }
            final int u = this.u;
            if (u >= g) {
                this.u = u + n;
            }
            final int g2 = g + n;
            this.g = g2;
            this.h = n4 - n;
            int f;
            if (n3 > 0) {
                f = this.f(b2, this.q(t + n));
            }
            else {
                f = 0;
            }
            if (this.m >= g) {
                k = this.k;
            }
            final int h2 = h(f, k, this.l, this.c.length);
            for (int i = g; i < g2; ++i) {
                this.b[i * 5 + 4] = h2;
            }
            final int m = this.m;
            if (m >= g) {
                this.m = m + n;
            }
        }
    }
    
    public final void w(final int n, int i) {
        if (n > 0) {
            this.B(this.i, i);
            final int k = this.k;
            final int l = this.l;
            if ((i = l) < n) {
                final Object[] c = this.c;
                final int length = c.length;
                final int n2 = length - l;
                final int max = Math.max(Math.max(length * 2, n2 + n), 32);
                final Object[] c2 = new Object[max];
                for (i = 0; i < max; ++i) {
                    c2[i] = null;
                }
                i = max - n2;
                final int n3 = l + k;
                System.arraycopy((Object)c, 0, (Object)c2, 0, k);
                System.arraycopy((Object)c, n3, (Object)c2, k + i, length - n3);
                this.c = c2;
            }
            final int j = this.j;
            if (j >= k) {
                this.j = j + n;
            }
            this.k = k + n;
            this.l = i - n;
        }
    }
    
    public final boolean x(final int n) {
        return (this.b[this.q(n) * 5 + 1] & 0x40000000) != 0x0;
    }
    
    public final void z(v5m o, int y) {
        if (this.n <= 0) {
            ti6.a("Check failed");
        }
        if (y == 0 && this.t == 0 && this.a.w == 0) {
            final int[] v = o.v;
            final int n = v[y * 5 + 3];
            final int w = o.w;
            if (n == w) {
                final int[] b = this.b;
                final Object[] c = this.c;
                final ArrayList d = this.d;
                final HashMap e = this.e;
                final jlf f = this.f;
                final Object[] x = o.x;
                y = o.y;
                final HashMap e2 = o.E;
                final jlf f2 = o.F;
                this.b = v;
                this.c = x;
                this.d = o.D;
                this.g = w;
                this.h = v.length / 5 - w;
                this.k = y;
                this.l = x.length - y;
                this.m = w;
                this.e = e2;
                this.f = f2;
                o.v = b;
                o.w = 0;
                o.x = c;
                o.y = 0;
                o.D = d;
                o.E = e;
                o.F = f;
                return;
            }
        }
        o = (v5m)o.o();
        try {
            ien.C((y5m)o, y, this, true, true, false);
            ((y5m)o).e(true);
        }
        finally {
            ((y5m)o).e(false);
        }
    }
}
