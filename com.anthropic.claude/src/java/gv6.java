public final class gv6
{
    public final long a = a;
    
    public static final long a(final int n, final int n2, final int n3, final int n4) {
        if (n2 < n || n4 < n3 || n < 0 || n3 < 0) {
            iac.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return hv6.h(n, n2, n3, n4);
    }
    
    public static final boolean c(final long n, final long n2) {
        return n == n2;
    }
    
    public static final boolean d(final long n) {
        final int n2 = (int)(0x3L & n);
        final int n3 = ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1);
        return ((int)(n >> n3 + 46) & (1 << 18 - n3) - 1) != 0x0;
    }
    
    public static final boolean e(final long n) {
        final int n2 = (int)(0x3L & n);
        return ((int)(n >> 33) & (1 << ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1) + 13) - 1) != 0x0;
    }
    
    public static final boolean f(final long n) {
        final int n2 = (int)(0x3L & n);
        final int n3 = ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1);
        final int n4 = (1 << 18 - n3) - 1;
        final int n5 = (int)(n >> n3 + 15);
        int n6 = (int)(n >> n3 + 46) & n4;
        if (n6 == 0) {
            n6 = Integer.MAX_VALUE;
        }
        else {
            --n6;
        }
        return (n5 & n4) == n6;
    }
    
    public static final boolean g(final long n) {
        final int n2 = (int)(0x3L & n);
        final int n3 = (1 << ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1) + 13) - 1;
        final int n4 = (int)(n >> 2);
        int n5 = (int)(n >> 33) & n3;
        if (n5 == 0) {
            n5 = Integer.MAX_VALUE;
        }
        else {
            --n5;
        }
        return (n4 & n3) == n5;
    }
    
    public static final int h(final long n) {
        final int n2 = (int)(0x3L & n);
        final int n3 = ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1);
        final int n4 = (int)(n >> n3 + 46) & (1 << 18 - n3) - 1;
        if (n4 == 0) {
            return Integer.MAX_VALUE;
        }
        return n4 - 1;
    }
    
    public static final int i(final long n) {
        final int n2 = (int)(0x3L & n);
        final int n3 = (int)(n >> 33) & (1 << ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1) + 13) - 1;
        if (n3 == 0) {
            return Integer.MAX_VALUE;
        }
        return n3 - 1;
    }
    
    public static final int j(final long n) {
        final int n2 = (int)(0x3L & n);
        final int n3 = ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1);
        return (int)(n >> n3 + 15) & (1 << 18 - n3) - 1;
    }
    
    public static final int k(final long n) {
        final int n2 = (int)(0x3L & n);
        return (int)(n >> 2) & (1 << ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1) + 13) - 1;
    }
    
    public static final boolean l(final long n) {
        final int n2 = (int)(0x3L & n);
        boolean b = true;
        final int n3 = ((n2 & 0x2) >> 1) * 3 + ((n2 & 0x1) << 1);
        final int n4 = (int)(n >> 33);
        final int n5 = (int)(n >> n3 + 46);
        final boolean b2 = (n4 & (1 << n3 + 13) - 1) - 1 == 0;
        if ((n5 & (1 << 18 - n3) - 1) - 1 != 0) {
            b = false;
        }
        return b2 | b;
    }
    
    public static String m(final long n) {
        final int i = i(n);
        String value = "Infinity";
        String value2;
        if (i == Integer.MAX_VALUE) {
            value2 = "Infinity";
        }
        else {
            value2 = String.valueOf(i);
        }
        final int h = h(n);
        if (h != Integer.MAX_VALUE) {
            value = String.valueOf(h);
        }
        final int k = k(n);
        final int j = j(n);
        final StringBuilder w = lmf.w(k, "Constraints(minWidth = ", ", maxWidth = ", value2, ", minHeight = ");
        w.append(j);
        w.append(", maxHeight = ");
        w.append(value);
        w.append(")");
        return w.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof gv6) {
            if (this.a == ((gv6)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return m(this.a);
    }
}
