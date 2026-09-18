import java.util.Arrays;

public final class ilf
{
    public int[] a;
    public int b;
    
    public ilf(final int n) {
        int[] a;
        if (n == 0) {
            a = bhc.a;
        }
        else {
            a = new int[n];
        }
        this.a = a;
    }
    
    public final void a(final int n) {
        this.b(this.b + 1);
        final int[] a = this.a;
        final int b = this.b;
        a[b] = n;
        this.b = b + 1;
    }
    
    public final void b(final int n) {
        final int[] a = this.a;
        if (a.length < n) {
            this.a = Arrays.copyOf(a, Math.max(n, a.length * 3 / 2));
        }
    }
    
    public final int c(final int n) {
        if (n >= 0 && n < this.b) {
            return this.a[n];
        }
        qiq.t("Index must be between 0 and size");
        throw null;
    }
    
    public final int d() {
        final int b = this.b;
        if (b != 0) {
            return this.a[b - 1];
        }
        qiq.u("IntList is empty.");
        throw null;
    }
    
    public final void e(final int n) {
        if (n >= 0) {
            final int b = this.b;
            if (n < b) {
                final int[] a = this.a;
                final int n2 = a[n];
                if (n != b - 1) {
                    iw0.J0(n, n + 1, b, a, a);
                }
                --this.b;
                return;
            }
        }
        qiq.t("Index must be between 0 and size");
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ilf) {
            final ilf ilf = (ilf)o;
            final int b = ilf.b;
            final int b2 = this.b;
            if (b == b2) {
                final int[] a = this.a;
                final int[] a2 = ilf.a;
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
    
    public final void f(final int n, final int n2) {
        if (n >= 0 && n < this.b) {
            final int[] a = this.a;
            final int n3 = a[n];
            a[n] = n2;
            return;
        }
        qiq.t("Index must be between 0 and size");
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int[] a = this.a;
        final int b = this.b;
        int i = 0;
        int n = 0;
        while (i < b) {
            n += Integer.hashCode(a[i]) * 31;
            ++i;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        final int[] a = this.a;
        for (int b = this.b, i = 0; i < b; ++i) {
            final int n = a[i];
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
