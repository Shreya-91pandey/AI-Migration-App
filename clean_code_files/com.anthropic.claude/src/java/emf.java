import java.util.Collection;
import java.util.Arrays;
import java.util.List;

public final class emf
{
    public Object[] a;
    public int b;
    public cmf c;
    
    public emf(final int n) {
        Object[] a;
        if (n == 0) {
            a = j4g.a;
        }
        else {
            a = new Object[n];
        }
        this.a = a;
    }
    
    public final void a(final int n, final Object o) {
        if (n >= 0) {
            int b = this.b;
            if (n <= b) {
                ++b;
                final Object[] a = this.a;
                if (a.length < b) {
                    this.n(b, a);
                }
                final Object[] a2 = this.a;
                final int b2 = this.b;
                if (n != b2) {
                    iw0.K0(n + 1, n, b2, a2, a2);
                }
                a2[n] = o;
                ++this.b;
                return;
            }
        }
        final StringBuilder p2 = hia.p(n, "Index ", " must be in 0..");
        p2.append(this.b);
        qiq.t(p2.toString());
        throw null;
    }
    
    public final void b(final Object o) {
        final int n = this.b + 1;
        final Object[] a = this.a;
        if (a.length < n) {
            this.n(n, a);
        }
        final Object[] a2 = this.a;
        final int b = this.b;
        a2[b] = o;
        this.b = b + 1;
    }
    
    public final void c(final emf emf) {
        if (!emf.i()) {
            final int n = this.b + emf.b;
            final Object[] a = this.a;
            if (a.length < n) {
                this.n(n, a);
            }
            iw0.K0(this.b, 0, emf.b, emf.a, this.a);
            this.b += emf.b;
        }
    }
    
    public final void d(final List list) {
        if (!list.isEmpty()) {
            final int b = this.b;
            final int n = list.size() + b;
            final Object[] a = this.a;
            if (a.length < n) {
                this.n(n, a);
            }
            final Object[] a2 = this.a;
            for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
                a2[i + b] = list.get(i);
            }
            this.b += list.size();
        }
    }
    
    public final void e() {
        Arrays.fill(this.a, 0, this.b, (Object)null);
        this.b = 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof emf) {
            final emf emf = (emf)o;
            final int b = emf.b;
            final int b2 = this.b;
            if (b == b2) {
                final Object[] a = this.a;
                final Object[] a2 = emf.a;
                final xgc t = ncq.T(0, b2);
                int v = ((vgc)t).v;
                final int w = ((vgc)t).w;
                if (v <= w) {
                    while (mlc.q(a[v], a2[v])) {
                        if (v == w) {
                            return true;
                        }
                        ++v;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final Object f() {
        if (!this.i()) {
            return this.a[0];
        }
        qiq.u("ObjectList is empty.");
        throw null;
    }
    
    public final Object g(final int n) {
        if (n >= 0 && n < this.b) {
            return this.a[n];
        }
        this.p(n);
        throw null;
    }
    
    public final int h(final Object o) {
        final Object[] a = this.a;
        int i = 0;
        final int n = 0;
        if (o == null) {
            for (int b = this.b, j = n; j < b; ++j) {
                if (a[j] == null) {
                    return j;
                }
            }
        }
        else {
            while (i < this.b) {
                if (o.equals(a[i])) {
                    return i;
                }
                ++i;
            }
        }
        return -1;
    }
    
    @Override
    public final int hashCode() {
        final Object[] a = this.a;
        final int b = this.b;
        int i = 0;
        int n = 0;
        while (i < b) {
            final Object o = a[i];
            int hashCode;
            if (o != null) {
                hashCode = o.hashCode();
            }
            else {
                hashCode = 0;
            }
            n += hashCode * 31;
            ++i;
        }
        return n;
    }
    
    public final boolean i() {
        return this.b == 0;
    }
    
    public final boolean j() {
        return this.b != 0;
    }
    
    public final boolean k(final Object o) {
        final int h = this.h(o);
        if (h >= 0) {
            this.l(h);
            return true;
        }
        return false;
    }
    
    public final Object l(int b) {
        if (b >= 0) {
            final int b2 = this.b;
            if (b < b2) {
                final Object[] a = this.a;
                final Object o = a[b];
                if (b != b2 - 1) {
                    iw0.K0(b, b + 1, b2, a, a);
                }
                b = this.b - 1;
                a[this.b = b] = null;
                return o;
            }
        }
        this.p(b);
        throw null;
    }
    
    public final void m(int b, final int n) {
        if (b >= 0) {
            final int b2 = this.b;
            if (b <= b2 && n >= 0 && n <= b2) {
                if (n >= b) {
                    if (n != b) {
                        if (n < b2) {
                            final Object[] a = this.a;
                            iw0.K0(b, n, b2, a, a);
                        }
                        final int b3 = this.b;
                        b = b3 - (n - b);
                        Arrays.fill(this.a, b, b3, (Object)null);
                        this.b = b;
                    }
                    return;
                }
                final StringBuilder sb = new StringBuilder("Start (");
                sb.append(b);
                sb.append(") is more than end (");
                sb.append(n);
                sb.append(')');
                qiq.r(sb.toString());
                throw null;
            }
        }
        final StringBuilder o = hia.o(b, n, "Start (", ") and end (", ") must be in 0..");
        o.append(this.b);
        qiq.t(o.toString());
        throw null;
    }
    
    public final void n(final int n, final Object[] array) {
        final int length = array.length;
        final Object[] a = new Object[Math.max(n, length * 3 / 2)];
        System.arraycopy((Object)array, 0, (Object)a, 0, length);
        this.a = a;
    }
    
    public final Object o(final int n, final Object o) {
        if (n >= 0 && n < this.b) {
            final Object[] a = this.a;
            final Object o2 = a[n];
            a[n] = o;
            return o2;
        }
        this.p(n);
        throw null;
    }
    
    public final void p(final int n) {
        final StringBuilder p = hia.p(n, "Index ", " must be in 0..");
        p.append(this.b - 1);
        qiq.t(p.toString());
        throw null;
    }
    
    @Override
    public final String toString() {
        final trf trf = new trf((Object)this, (byte)3);
        final StringBuilder sb = new StringBuilder("[");
        final Object[] a = this.a;
        for (int b = this.b, i = 0; i < b; ++i) {
            final Object o = a[i];
            if (i != 0) {
                sb.append((CharSequence)", ");
            }
            if (i == -1) {
                sb.append((CharSequence)"...");
                break;
            }
            sb.append((CharSequence)trf.b(o));
        }
        sb.append((CharSequence)"]");
        return sb.toString();
    }
}
