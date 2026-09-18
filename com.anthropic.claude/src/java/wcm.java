import java.util.Arrays;

public final class wcm implements Cloneable
{
    public int[] v;
    public Object[] w;
    public int x;
    
    public wcm(int n) {
        n = 4;
        int n2;
        while (true) {
            n2 = 40;
            if (n >= 32) {
                break;
            }
            n2 = (1 << n) - 12;
            if (40 <= n2) {
                break;
            }
            ++n;
        }
        n = n2 / 4;
        this.v = new int[n];
        this.w = new Object[n];
    }
    
    public final wcm a() {
        final Object clone = super.clone();
        clone.getClass();
        final wcm wcm = (wcm)clone;
        wcm.v = this.v.clone();
        wcm.w = this.w.clone();
        return wcm;
    }
    
    public final int b(final int n) {
        if (n < this.x && n >= 0) {
            return this.v[n];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public final void c(final int n, final Object o) {
        final int o2 = o50.o(this.x, n, this.v);
        if (o2 >= 0) {
            this.w[o2] = o;
            return;
        }
        final int n2 = ~o2;
        final int x = this.x;
        if (n2 < x) {
            final Object[] w = this.w;
            if (w[n2] == k1r.c) {
                this.v[n2] = n;
                w[n2] = o;
                return;
            }
        }
        if (x >= this.v.length) {
            final int n3 = (x + 1) * 4;
            int n4 = 4;
            int n5;
            while (true) {
                n5 = n3;
                if (n4 >= 32) {
                    break;
                }
                n5 = (1 << n4) - 12;
                if (n3 <= n5) {
                    break;
                }
                ++n4;
            }
            final int n6 = n5 / 4;
            this.v = Arrays.copyOf(this.v, n6);
            this.w = Arrays.copyOf(this.w, n6);
        }
        final int x2 = this.x;
        if (x2 - n2 != 0) {
            final int[] v = this.v;
            final int n7 = n2 + 1;
            iw0.J0(n7, n2, x2, v, v);
            final Object[] w2 = this.w;
            iw0.K0(n7, n2, this.x, w2, w2);
        }
        this.v[n2] = n;
        this.w[n2] = o;
        ++this.x;
    }
    
    public final Object d(final int n) {
        if (n < this.x && n >= 0) {
            return this.w[n];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    @Override
    public final String toString() {
        final int x = this.x;
        if (x <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(x * 28);
        sb.append('{');
        for (int x2 = this.x, i = 0; i < x2; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.b(i));
            sb.append('=');
            final Object d = this.d(i);
            if (d != this) {
                sb.append(d);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
