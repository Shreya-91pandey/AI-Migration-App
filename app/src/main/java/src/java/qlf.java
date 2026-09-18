import java.util.Arrays;

public final class qlf
{
    public long[] a;
    public int b;
    
    public qlf(final int n) {
        long[] a;
        if (n == 0) {
            a = qwd.a;
        }
        else {
            a = new long[n];
        }
        this.a = a;
    }
    
    public final void a(final long n) {
        this.c(this.b + 1);
        final long[] a = this.a;
        final int b = this.b;
        a[b] = n;
        this.b = b + 1;
    }
    
    public final void b(final int n, final qlf qlf) {
        if (n >= 0) {
            final int b = this.b;
            if (n <= b) {
                final int b2 = qlf.b;
                if (b2 == 0) {
                    return;
                }
                this.c(b + b2);
                final long[] a = this.a;
                final int b3 = this.b;
                if (n != b3) {
                    iw0.M0(a, a, qlf.b + n, n, b3);
                }
                iw0.M0(qlf.a, a, n, 0, qlf.b);
                this.b += qlf.b;
                return;
            }
        }
        qiq.t("");
        throw null;
    }
    
    public final void c(final int n) {
        final long[] a = this.a;
        if (a.length < n) {
            this.a = Arrays.copyOf(a, Math.max(n, a.length * 3 / 2));
        }
    }
    
    public final long d(final int n) {
        if (n >= 0 && n < this.b) {
            return this.a[n];
        }
        qiq.t("Index must be between 0 and size");
        throw null;
    }
    
    public final void e(final int n, final int n2) {
        if (n >= 0) {
            final int b = this.b;
            if (n <= b && n2 >= 0 && n2 <= b) {
                if (n2 >= n) {
                    if (n2 != n) {
                        if (n2 < b) {
                            final long[] a = this.a;
                            iw0.M0(a, a, n, n2, b);
                        }
                        this.b -= n2 - n;
                    }
                    return;
                }
                qiq.r("The end index must be < start index");
                throw null;
            }
        }
        qiq.t("Index must be between 0 and size");
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof qlf) {
            final qlf qlf = (qlf)o;
            final int b = qlf.b;
            final int b2 = this.b;
            if (b == b2) {
                final long[] a = this.a;
                final long[] a2 = qlf.a;
                final xgc t = ncq.T(0, b2);
                int v = ((vgc)t).v;
                final int w = ((vgc)t).w;
                if (v <= w) {
                    while (a[v] == a2[v]) {
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
    
    public final void f(final int n, final long n2) {
        if (n >= 0 && n < this.b) {
            final long[] a = this.a;
            final long n3 = a[n];
            a[n] = n2;
            return;
        }
        qiq.t("Index must be between 0 and size");
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final long[] a = this.a;
        final int b = this.b;
        int i = 0;
        int n = 0;
        while (i < b) {
            n += Long.hashCode(a[i]) * 31;
            ++i;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        final long[] a = this.a;
        for (int b = this.b, i = 0; i < b; ++i) {
            final long n = a[i];
            if (i != 0) {
                sb.append((CharSequence)", ");
            }
            if (i == -1) {
                sb.append((CharSequence)"...");
                break;
            }
            sb.append(n);
        }
        sb.append((CharSequence)"]");
        return sb.toString();
    }
}
