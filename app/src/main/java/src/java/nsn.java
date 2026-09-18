public final class nsn
{
    public final int a;
    public final long[] b;
    public final Object[] c;
    
    public nsn(final int a, final long[] b, final Object[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a(final long n) {
        int n2 = this.a - 1;
        if (n2 != -1) {
            final long[] b = this.b;
            int i = 0;
            if (n2 != 0) {
                while (i <= n2) {
                    final int n3 = i + n2 >>> 1;
                    final long n4 = lcmp(b[n3] - n, 0L);
                    if (n4 < 0) {
                        i = n3 + 1;
                    }
                    else {
                        if (n4 <= 0) {
                            return n3;
                        }
                        n2 = n3 - 1;
                    }
                }
                return -(i + 1);
            }
            final long n5 = lcmp(b[0], n);
            if (n5 == 0) {
                return 0;
            }
            if (n5 > 0) {
                return -2;
            }
        }
        return -1;
    }
    
    public final nsn b(long n, Object o) {
        final Object[] c = this.c;
        final int length = c.length;
        final int n2 = 0;
        int i = 0;
        int n3 = 0;
        while (i < length) {
            int n4 = n3;
            if (c[i] != null) {
                n4 = n3 + 1;
            }
            ++i;
            n3 = n4;
        }
        final int n5 = n3 + 1;
        final long[] array = new long[n5];
        final Object[] array2 = new Object[n5];
        if (n5 > 1) {
            int n6 = 0;
            int n7 = n2;
            long[] b;
            int a;
            int j;
            while (true) {
                b = this.b;
                a = this.a;
                j = n7;
                if (n7 >= n5) {
                    break;
                }
                j = n7;
                if (n6 >= a) {
                    break;
                }
                final long n8 = b[n6];
                final Object o2 = c[n6];
                if (n8 > n) {
                    array[n7] = n;
                    array2[n7] = o;
                    j = n7 + 1;
                    break;
                }
                int n9 = n7;
                if (o2 != null) {
                    array[n7] = n8;
                    array2[n7] = o2;
                    n9 = n7 + 1;
                }
                ++n6;
                n7 = n9;
            }
            int n10;
            if ((n10 = n6) == a) {
                array[n3] = n;
                array2[n3] = o;
            }
            else {
                while (j < n5) {
                    n = b[n10];
                    o = c[n10];
                    int n11 = j;
                    if (o != null) {
                        array[j] = n;
                        array2[j] = o;
                        n11 = j + 1;
                    }
                    ++n10;
                    j = n11;
                }
            }
        }
        else {
            array[0] = n;
            array2[0] = o;
        }
        return new nsn(n5, array, array2);
    }
}
