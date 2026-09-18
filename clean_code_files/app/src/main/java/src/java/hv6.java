public abstract class hv6
{
    public static final long a(final int n, final int n2, final int n3, final int n4) {
        boolean b = false;
        final boolean b2 = n2 >= n;
        final boolean b3 = n4 >= n3;
        final boolean b4 = n >= 0;
        if (n3 >= 0) {
            b = true;
        }
        if (!(b & (b2 & b3 & b4))) {
            iac.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(n, n2, n3, n4);
    }
    
    public static final int c(final int n) {
        if (n < 8191) {
            return 13;
        }
        if (n < 32767) {
            return 15;
        }
        if (n < 65535) {
            return 16;
        }
        if (n < 262143) {
            return 18;
        }
        return 255;
    }
    
    public static final long d(final long n, final long n2) {
        final int n3 = (int)(n2 >> 32);
        final int k = gv6.k(n);
        int i = gv6.i(n);
        int n4 = n3;
        if (n3 < k) {
            n4 = k;
        }
        if (n4 <= i) {
            i = n4;
        }
        final int n5 = (int)(n2 & 0xFFFFFFFFL);
        final int j = gv6.j(n);
        final int h = gv6.h(n);
        int n6 = n5;
        if (n5 < j) {
            n6 = j;
        }
        if (n6 > h) {
            n6 = h;
        }
        return (long)i << 32 | ((long)n6 & 0xFFFFFFFFL);
    }
    
    public static final long e(final long n, final long n2) {
        final int k = gv6.k(n);
        int i = gv6.i(n);
        final int j = gv6.j(n);
        final int h = gv6.h(n);
        int l;
        if ((l = gv6.k(n2)) < k) {
            l = k;
        }
        int n3;
        if ((n3 = l) > i) {
            n3 = i;
        }
        int m = gv6.i(n2);
        if (m < k) {
            m = k;
        }
        if (m <= i) {
            i = m;
        }
        int j2;
        if ((j2 = gv6.j(n2)) < j) {
            j2 = j;
        }
        int n4;
        if ((n4 = j2) > h) {
            n4 = h;
        }
        int h2 = gv6.h(n2);
        if (h2 < j) {
            h2 = j;
        }
        if (h2 > h) {
            h2 = h;
        }
        return a(n3, i, n4, h2);
    }
    
    public static final int f(final int n, final long n2) {
        final int j = gv6.j(n2);
        final int h = gv6.h(n2);
        int n3 = n;
        if (n < j) {
            n3 = j;
        }
        if (n3 > h) {
            return h;
        }
        return n3;
    }
    
    public static final int g(final int n, final long n2) {
        final int k = gv6.k(n2);
        final int i = gv6.i(n2);
        int n3 = n;
        if (n < k) {
            n3 = k;
        }
        if (n3 > i) {
            return i;
        }
        return n3;
    }
    
    public static final long h(final int n, int n2, final int n3, int n4) {
        int n5;
        if (n4 == Integer.MAX_VALUE) {
            n5 = n3;
        }
        else {
            n5 = n4;
        }
        final int c = c(n5);
        int n6;
        if (n2 == Integer.MAX_VALUE) {
            n6 = n;
        }
        else {
            n6 = n2;
        }
        final int c2 = c(n6);
        if (c + c2 > 31) {
            k(n6, n5);
        }
        ++n2;
        final int n7 = n4 + 1;
        n4 = c2 - 13;
        return (long)(n2 & ~(n2 >> 31)) << 33 | ((long)((n4 >> 1) + (n4 & 0x1)) | (long)n << 2) | (long)n3 << c2 + 2 | (long)(n7 & ~(n7 >> 31)) << c2 + 33;
    }
    
    public static final long i(int n, final long n2, int n3) {
        final int n4 = gv6.k(n2) + n;
        final int n5 = 0;
        int n6 = n4;
        if (n4 < 0) {
            n6 = 0;
        }
        final int i = gv6.i(n2);
        if (i == Integer.MAX_VALUE) {
            n = i;
        }
        else if ((n += i) < 0) {
            n = 0;
        }
        int n7;
        if ((n7 = gv6.j(n2) + n3) < 0) {
            n7 = 0;
        }
        final int h = gv6.h(n2);
        if (h == Integer.MAX_VALUE) {
            n3 = h;
        }
        else if ((n3 += h) < 0) {
            n3 = n5;
        }
        return a(n6, n, n7, n3);
    }
    
    public static final void k(final int n, final int n2) {
        throw new IllegalArgumentException(hia.g(n, n2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }
    
    public static final Void l(final int n) {
        throw new IllegalArgumentException(oz1.n("Can't represent a size of ", n, " in Constraints"));
    }
}
