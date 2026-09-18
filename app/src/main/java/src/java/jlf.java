import java.util.Arrays;

public final class jlf extends sgc
{
    public int f;
    
    public jlf(final int n) {
        super.a = jak.a;
        super.b = bhc.a;
        super.c = o50.e;
        if (n >= 0) {
            this.f(jak.d(n));
            return;
        }
        qiq.r("Capacity must be a positive value.");
        throw null;
    }
    
    public final void c() {
        super.e = 0;
        final long[] a = super.a;
        if (a != jak.a) {
            iw0.U0(a, -9187201950435737472L);
            final long[] a2 = super.a;
            final int d = super.d;
            final int n = d >> 3;
            final long n2 = a2[n];
            final long n3 = 255L << ((d & 0x7) << 3);
            a2[n] = ((n2 & ~n3) | n3);
        }
        Arrays.fill(super.c, 0, super.d, (Object)null);
        this.f = jak.a(super.d) - super.e;
    }
    
    public final int d(int i) {
        final int hashCode = Integer.hashCode(i);
        final int n = -862048943;
        final int n2 = hashCode * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int n4 = n3 >>> 7;
        final int d = super.d;
        int n5 = n4 & d;
        int n6 = 0;
        while (true) {
            final long[] a = super.a;
            final int n7 = n5 >> 3;
            final int n8 = (n5 & 0x7) << 3;
            final long n9 = a[n7];
            final int n10 = 1;
            final long n11 = (a[n7 + 1] << 64 - n8 & -n8 >> 63) | n9 >>> n8;
            long n12 = n3 & 0x7F;
            final int n13 = 0;
            final long n14 = n11 ^ n12 * 72340172838076673L;
            for (long n15 = ~n14 & n14 - 72340172838076673L & 0x8080808080808080L; n15 != 0L; n15 &= n15 - 1L) {
                final int n16 = n5 + (Long.numberOfTrailingZeros(n15) >> 3) & d;
                if (super.b[n16] == i) {
                    return n16;
                }
            }
            if ((~n11 << 6 & n11 & 0x8080808080808080L) != 0x0L) {
                i = this.e(n4);
                final int f = this.f;
                long n17 = 255L;
                int e;
                if (f != 0 || (super.a[i >> 3] >> ((i & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n17 = 255L;
                    final int n18 = 1;
                    e = i;
                    i = n18;
                }
                else {
                    i = super.d;
                    Label_1138: {
                        if (i > 8) {
                            if (Long.compareUnsigned(super.e * 32L, i * 25L) <= 0) {
                                final long[] a2 = super.a;
                                final int d2 = super.d;
                                final int[] b = super.b;
                                final Object[] c = super.c;
                                long n19;
                                for (i = n13; i < d2 + 7 >> 3; ++i) {
                                    n19 = (a2[i] & 0x8080808080808080L);
                                    a2[i] = (0xFEFEFEFEFEFEFEFEL & ~n19 + (n19 >>> 7));
                                }
                                final long n20 = n12;
                                i = a2.length;
                                final int n21 = i - 2;
                                final long n22 = a2[n21];
                                final long n23 = 72057594037927935L;
                                a2[n21] = ((n22 & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[i - 1] = a2[n13];
                                i = n13;
                                final int n24 = n10;
                                while (i != d2) {
                                    final int n25 = i >> 3;
                                    final long n26 = a2[n25];
                                    final int n27 = (i & 0x7) << 3;
                                    final long n28 = n26 >> n27 & n17;
                                    if (n28 != 128L && n28 == 254L) {
                                        final int n29 = Integer.hashCode(b[i]) * n;
                                        final int n30 = n29 ^ n29 << 16;
                                        final int n31 = n30 >>> 7;
                                        final int e2 = this.e(n31);
                                        final int n32 = n31 & d2;
                                        if ((e2 - n32 & d2) / 8 == (i - n32 & d2) / 8) {
                                            a2[n25] = ((long)(n30 & 0x7F) << n27 | (~(n17 << n27) & a2[n25]));
                                            a2[a2.length - n24] = ((a2[n13] & n23) | Long.MIN_VALUE);
                                            ++i;
                                        }
                                        else {
                                            final int n33 = e2 >> 3;
                                            final long n34 = a2[n33];
                                            final int n35 = (e2 & 0x7) << 3;
                                            if ((n34 >> n35 & n17) == 0x80L) {
                                                a2[n33] = ((~(n17 << n35) & n34) | (long)(n30 & 0x7F) << n35);
                                                a2[n25] = ((a2[n25] & ~(n17 << n27)) | 128L << n27);
                                                b[e2] = b[i];
                                                b[i] = n13;
                                                c[e2] = c[i];
                                                c[i] = null;
                                            }
                                            else {
                                                a2[n33] = ((long)(n30 & 0x7F) << n35 | (~(n17 << n35) & n34));
                                                final int n36 = b[e2];
                                                b[e2] = b[i];
                                                b[i] = n36;
                                                final Object o = c[e2];
                                                c[e2] = c[i];
                                                c[i] = o;
                                                --i;
                                            }
                                            a2[a2.length - 1] = ((a2[n13] & n23) | Long.MIN_VALUE);
                                            ++i;
                                        }
                                    }
                                    else {
                                        ++i;
                                    }
                                }
                                i = n24;
                                this.f = jak.a(super.d) - super.e;
                                n12 = n20;
                                break Label_1138;
                            }
                        }
                        final long n37 = 255L;
                        final long n38 = n12;
                        final int n39 = 1;
                        i = jak.b(super.d);
                        final long[] a3 = super.a;
                        final int[] b2 = super.b;
                        final Object[] c2 = super.c;
                        final int d3 = super.d;
                        this.f(i);
                        final long[] a4 = super.a;
                        final int[] b3 = super.b;
                        final Object[] c3 = super.c;
                        final int d4 = super.d;
                        int n40 = n13;
                        while (true) {
                            n12 = n38;
                            n17 = n37;
                            i = n39;
                            if (n40 >= d3) {
                                break;
                            }
                            if ((a3[n40 >> 3] >> ((n40 & 0x7) << 3) & 0xFFL) < 128L) {
                                i = b2[n40];
                                final int n41 = Integer.hashCode(i) * n;
                                final int n42 = n41 ^ n41 << 16;
                                final int e3 = this.e(n42 >>> 7);
                                final long n43 = n42 & 0x7F;
                                final int n44 = e3 >> 3;
                                final int n45 = (e3 & 0x7) << 3;
                                a4[(e3 - 7 & d4) + (d4 & 0x7) >> 3] = (a4[n44] = ((a4[n44] & ~(255L << n45)) | n43 << n45));
                                b3[e3] = i;
                                c3[e3] = c2[n40];
                            }
                            ++n40;
                        }
                    }
                    e = this.e(n4);
                }
                ++super.e;
                final int f2 = this.f;
                final long[] a5 = super.a;
                final int n46 = e >> 3;
                final long n47 = a5[n46];
                final int n48 = (e & 0x7) << 3;
                if ((n47 >> n48 & n17) != 0x80L) {
                    i = n13;
                }
                this.f = f2 - i;
                i = super.d;
                a5[(e - 7 & i) + (i & 0x7) >> 3] = (a5[n46] = ((n47 & ~(n17 << n48)) | n12 << n48));
                return e;
            }
            n6 += 8;
            n5 = (n5 + n6 & d);
        }
    }
    
    public final int e(int n) {
        final int d = super.d;
        n &= d;
        int n2 = 0;
        long n6;
        while (true) {
            final long[] a = super.a;
            final int n3 = n >> 3;
            final int n4 = (n & 0x7) << 3;
            final long n5 = (a[n3 + 1] << 64 - n4 & -n4 >> 63) | a[n3] >>> n4;
            n6 = (n5 & ~n5 << 7 & 0x8080808080808080L);
            if (n6 != 0L) {
                break;
            }
            n2 += 8;
            n = (n + n2 & d);
        }
        return n + (Long.numberOfTrailingZeros(n6) >> 3) & d;
    }
    
    public final void f(int max) {
        if (max > 0) {
            max = Math.max(7, jak.c(max));
        }
        else {
            max = 0;
        }
        super.d = max;
        long[] a;
        if (max == 0) {
            a = jak.a;
        }
        else {
            final int n = (max + 15 & 0xFFFFFFF8) >> 3;
            a = new long[n];
            Arrays.fill(a, 0, n, -9187201950435737472L);
        }
        super.a = a;
        final int n2 = max >> 3;
        final long n3 = a[n2];
        final long n4 = 255L << ((max & 0x7) << 3);
        a[n2] = ((n3 & ~n4) | n4);
        this.f = jak.a(super.d) - super.e;
        super.b = new int[max];
        super.c = new Object[max];
    }
    
    public final Object g(int n) {
        final int n2 = Integer.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = super.d;
        int n4 = n3 >>> 7 & d;
        int n5 = 0;
    Label_0195:
        while (true) {
            final long[] a = super.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & d;
                if (super.b[n11] == n) {
                    n = n11;
                    break Label_0195;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & d);
        }
        if (n >= 0) {
            return this.h(n);
        }
        return null;
    }
    
    public final Object h(final int n) {
        --super.e;
        final long[] a = super.a;
        final int d = super.d;
        final int n2 = n >> 3;
        final int n3 = (n & 0x7) << 3;
        a[(n - 7 & d) + (d & 0x7) >> 3] = (a[n2] = ((a[n2] & ~(255L << n3)) | 254L << n3));
        final Object[] c = super.c;
        final Object o = c[n];
        c[n] = null;
        return o;
    }
    
    public final void i(final int n, final Object o) {
        final int d = this.d(n);
        super.b[d] = n;
        super.c[d] = o;
    }
}
