import java.util.Arrays;

public final class dhc
{
    public int[] a;
    public int b;
    
    public dhc(final byte b) {
        switch (b) {
            default: {
                this.a = new int[10];
                return;
            }
            case 2: {
                this.a = new int[30];
            }
        }
    }
    
    public dhc(final int n) {
        this.a = new int[n];
    }
    
    public static long b(final boolean b, int n, final int n2, int n3, final int n4) {
        int n5;
        if (b) {
            n5 = n3;
        }
        else {
            n5 = n4;
        }
        if (b) {
            n3 = n4;
        }
        if (n < n2) {
            return rhc.c(n, n);
        }
        if (n == n2) {
            if (n5 == 0) {
                return rhc.c(n2, n3 + n2);
            }
            return rhc.c(n2, n2);
        }
        else {
            if (n >= n2 + n5) {
                n = n - n5 + n3;
                return rhc.c(n, n);
            }
            if (n3 == 0) {
                return rhc.c(n2, n2);
            }
            return rhc.c(n2, n3 + n2);
        }
    }
    
    public long a(int n, final boolean b) {
        final int[] a = this.a;
        final int b2 = this.b;
        int n4;
        int n5;
        if (b2 >= 0) {
            if (!b) {
                int n2 = b2 - 1;
                final int n3 = n;
                int min = n;
                n = n3;
                while (true) {
                    n4 = n;
                    n5 = min;
                    if (-1 >= n2) {
                        break;
                    }
                    final int n6 = n2 * 3;
                    final int n7 = a[n6];
                    final int n8 = a[n6 + 1];
                    final int n9 = a[n6 + 2];
                    final long b3 = b(b, min, n7, n8, n9);
                    final long b4 = b(b, n, n7, n8, n9);
                    n = dnn.c;
                    min = Math.min((int)(b3 >> 32), (int)(b4 >> 32));
                    n = Math.max((int)(b3 & 0xFFFFFFFFL), (int)(b4 & 0xFFFFFFFFL));
                    --n2;
                }
            }
            else {
                int n10 = 0;
                int max = n;
                while (true) {
                    n4 = max;
                    n5 = n;
                    if (n10 >= b2) {
                        break;
                    }
                    final int n11 = n10 * 3;
                    final int n12 = a[n11];
                    final int n13 = a[n11 + 1];
                    final int n14 = a[n11 + 2];
                    final long b5 = b(b, n, n12, n13, n14);
                    final long b6 = b(b, max, n12, n13, n14);
                    n = dnn.c;
                    n = Math.min((int)(b5 >> 32), (int)(b6 >> 32));
                    max = Math.max((int)(b5 & 0xFFFFFFFFL), (int)(b6 & 0xFFFFFFFFL));
                    ++n10;
                }
            }
        }
        else {
            n4 = n;
            n5 = n;
        }
        return rhc.c(n5, n4);
    }
    
    public int c(final int n) {
        final int n2 = this.b - 1;
        if (n2 >= 0) {
            return this.a[n2];
        }
        return n;
    }
    
    public int d() {
        final int[] a = this.a;
        final int b = this.b - 1;
        this.b = b;
        return a[b];
    }
    
    public void e(final int n) {
        int[] a;
        final int[] array = a = this.a;
        if (this.b >= array.length) {
            a = Arrays.copyOf(array, array.length * 2);
            this.a = a;
        }
        a[this.b++] = n;
    }
    
    public void f(final int n, final int n2, final int n3) {
        final int b = this.b;
        final int[] a = this.a;
        final int b2 = b + 3;
        int[] copy = a;
        if (b2 >= a.length) {
            copy = Arrays.copyOf(a, a.length * 2);
            this.a = copy;
        }
        copy[b] = n + n3;
        copy[b + 1] = n2 + n3;
        copy[b + 2] = n3;
        this.b = b2;
    }
    
    public void g(final int n, final int n2, final int n3, final int n4) {
        final int b = this.b;
        final int[] a = this.a;
        final int b2 = b + 4;
        int[] copy = a;
        if (b2 >= a.length) {
            copy = Arrays.copyOf(a, a.length * 2);
            this.a = copy;
        }
        copy[b] = n;
        copy[b + 1] = n2;
        copy[b + 2] = n3;
        copy[b + 3] = n4;
        this.b = b2;
    }
    
    public void h(final int n, final int n2) {
        if (n < n2) {
            int n3 = n - 3;
            int n6;
            for (int i = n; i < n2; i += 3, n3 = n6) {
                final int[] a = this.a;
                final int n4 = a[i];
                final int n5 = a[n2];
                if (n4 >= n5) {
                    n6 = n3;
                    if (n4 != n5) {
                        continue;
                    }
                    n6 = n3;
                    if (a[i + 1] > a[n2 + 1]) {
                        continue;
                    }
                }
                n6 = n3 + 3;
                this.j(n6, i);
            }
            this.j(n3 + 3, n2);
            this.h(n, n3);
            this.h(n3 + 6, n2);
        }
    }
    
    public void i(int min, int n, final int n2) {
        if (n2 < 0) {
            final StringBuilder sb = new StringBuilder("Expected newLen to be \u2265 0, was ");
            sb.append(n2);
            jac.a(sb.toString());
        }
        min = Math.min(min, n);
        n = Math.max(min, n) - min;
        if (n < 2 && n == n2) {
            return;
        }
        final int b = this.b + 1;
        int[] a;
        final int[] array = a = this.a;
        if (b > array.length / 3) {
            a = Arrays.copyOf(this.a, Math.max(b * 2, array.length / 3 * 2) * 3);
            this.a = a;
        }
        final int n3 = this.b * 3;
        a[n3] = min;
        a[n3 + 1] = n;
        a[n3 + 2] = n2;
        this.b = b;
    }
    
    public void j(int n, int n2) {
        final int[] a = this.a;
        final int n3 = a[n];
        a[n] = a[n2];
        a[n2] = n3;
        final int n4 = n + 1;
        final int n5 = n2 + 1;
        final int n6 = a[n4];
        a[n4] = a[n5];
        a[n5] = n6;
        n += 2;
        final int n7 = n2 + 2;
        n2 = a[n];
        a[n] = a[n7];
        a[n7] = n2;
    }
}
