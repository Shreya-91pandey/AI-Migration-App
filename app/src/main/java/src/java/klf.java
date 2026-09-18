import java.util.Arrays;

public final class klf
{
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;
    
    public klf(final int n) {
        this.a = jak.a;
        this.b = bhc.a;
        if (n >= 0) {
            this.f(jak.d(n));
            return;
        }
        qiq.r("Capacity must be a positive value.");
        throw null;
    }
    
    public final boolean a(final int n) {
        final int d = this.d;
        this.b[this.d(n)] = n;
        return this.d != d;
    }
    
    public final void b() {
        this.d = 0;
        final long[] a = this.a;
        if (a != jak.a) {
            iw0.U0(a, -9187201950435737472L);
            final long[] a2 = this.a;
            final int c = this.c;
            final int n = c >> 3;
            final long n2 = a2[n];
            final long n3 = 255L << ((c & 0x7) << 3);
            a2[n] = ((n2 & ~n3) | n3);
        }
        this.e = jak.a(this.c) - this.d;
    }
    
    public final boolean c(int n) {
        final int n2 = Integer.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int c = this.c;
        int n4 = n3 >>> 7 & c;
        int n5 = 0;
    Label_0195:
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & c;
                if (this.b[n11] == n) {
                    n = n11;
                    break Label_0195;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & c);
        }
        return n >= 0;
    }
    
    public final int d(int i) {
        final int hashCode = Integer.hashCode(i);
        final int n = -862048943;
        final int n2 = hashCode * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int n4 = n3 >>> 7;
        final int c = this.c;
        int n5 = n4 & c;
        int n6 = 0;
        while (true) {
            final long[] a = this.a;
            final int n7 = n5 >> 3;
            final int n8 = (n5 & 0x7) << 3;
            final long n9 = a[n7];
            final int n10 = 1;
            final long n11 = (a[n7 + 1] << 64 - n8 & -n8 >> 63) | n9 >>> n8;
            long n12 = n3 & 0x7F;
            final int n13 = 0;
            final long n14 = n11 ^ n12 * 72340172838076673L;
            for (long n15 = ~n14 & n14 - 72340172838076673L & 0x8080808080808080L; n15 != 0L; n15 &= n15 - 1L) {
                final int n16 = n5 + (Long.numberOfTrailingZeros(n15) >> 3) & c;
                if (this.b[n16] == i) {
                    return n16;
                }
            }
            final int n17 = 8;
            if ((~n11 << 6 & n11 & 0x8080808080808080L) != 0x0L) {
                i = this.e(n4);
                final int e = this.e;
                long n18 = 255L;
                int e2;
                if (e != 0 || (this.a[i >> 3] >> ((i & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n18 = 255L;
                    final int n19 = 1;
                    e2 = i;
                    i = n19;
                }
                else {
                    i = this.c;
                    Label_1088: {
                        if (i > 8) {
                            if (Long.compareUnsigned(this.d * 32L, i * 25L) <= 0) {
                                final long[] a2 = this.a;
                                final int c2 = this.c;
                                final int[] b = this.b;
                                int j = n13;
                                i = n17;
                                while (j < c2 + 7 >> 3) {
                                    final long n20 = a2[j] & 0x8080808080808080L;
                                    a2[j] = (0xFEFEFEFEFEFEFEFEL & ~n20 + (n20 >>> 7));
                                    ++j;
                                }
                                final long n21 = n12;
                                i = a2.length;
                                final int n22 = i - 2;
                                final long n23 = a2[n22];
                                final long n24 = 72057594037927935L;
                                a2[n22] = ((n23 & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[i - 1] = a2[n13];
                                i = n13;
                                final int n25 = n10;
                                while (i != c2) {
                                    final int n26 = i >> 3;
                                    final long n27 = a2[n26];
                                    final int n28 = (i & 0x7) << 3;
                                    final long n29 = n27 >> n28 & n18;
                                    if (n29 != 128L && n29 == 254L) {
                                        final int n30 = Integer.hashCode(b[i]) * n;
                                        final int n31 = n30 ^ n30 << 16;
                                        final int n32 = n31 >>> 7;
                                        final int e3 = this.e(n32);
                                        final int n33 = n32 & c2;
                                        if ((e3 - n33 & c2) / 8 == (i - n33 & c2) / 8) {
                                            a2[n26] = ((long)(n31 & 0x7F) << n28 | (~(n18 << n28) & a2[n26]));
                                            a2[a2.length - n25] = ((a2[n13] & n24) | Long.MIN_VALUE);
                                            ++i;
                                        }
                                        else {
                                            final int n34 = e3 >> 3;
                                            final long n35 = a2[n34];
                                            final int n36 = (e3 & 0x7) << 3;
                                            if ((n35 >> n36 & n18) == 0x80L) {
                                                a2[n34] = ((~(n18 << n36) & n35) | (long)(n31 & 0x7F) << n36);
                                                a2[n26] = ((a2[n26] & ~(n18 << n28)) | 128L << n28);
                                                b[e3] = b[i];
                                                b[i] = n13;
                                            }
                                            else {
                                                a2[n34] = ((long)(n31 & 0x7F) << n36 | (~(n18 << n36) & n35));
                                                final int n37 = b[e3];
                                                b[e3] = b[i];
                                                b[i] = n37;
                                                --i;
                                            }
                                            a2[a2.length - n25] = ((a2[n13] & n24) | Long.MIN_VALUE);
                                            i += n25;
                                        }
                                    }
                                    else {
                                        ++i;
                                    }
                                }
                                i = n25;
                                this.e = jak.a(this.c) - this.d;
                                n12 = n21;
                                break Label_1088;
                            }
                        }
                        final long n38 = 255L;
                        final long n39 = n12;
                        final int n40 = 1;
                        i = jak.b(this.c);
                        final long[] a3 = this.a;
                        final int[] b2 = this.b;
                        final int c3 = this.c;
                        this.f(i);
                        final long[] a4 = this.a;
                        final int[] b3 = this.b;
                        final int c4 = this.c;
                        int n41 = n13;
                        while (true) {
                            i = n40;
                            n12 = n39;
                            n18 = n38;
                            if (n41 >= c3) {
                                break;
                            }
                            if ((a3[n41 >> 3] >> ((n41 & 0x7) << 3) & 0xFFL) < 128L) {
                                i = b2[n41];
                                final int n42 = Integer.hashCode(i) * n;
                                final int n43 = n42 ^ n42 << 16;
                                final int e4 = this.e(n43 >>> 7);
                                final long n44 = n43 & 0x7F;
                                final int n45 = e4 >> 3;
                                final int n46 = (e4 & 0x7) << 3;
                                a4[(e4 - 7 & c4) + (c4 & 0x7) >> 3] = (a4[n45] = ((a4[n45] & ~(255L << n46)) | n44 << n46));
                                b3[e4] = i;
                            }
                            ++n41;
                        }
                    }
                    e2 = this.e(n4);
                }
                this.d += i;
                final int e5 = this.e;
                final long[] a5 = this.a;
                final int n47 = e2 >> 3;
                final long n48 = a5[n47];
                final int n49 = (e2 & 0x7) << 3;
                if ((n48 >> n49 & n18) != 0x80L) {
                    i = n13;
                }
                this.e = e5 - i;
                i = this.c;
                a5[(e2 - 7 & i) + (i & 0x7) >> 3] = (a5[n47] = ((n48 & ~(n18 << n49)) | n12 << n49));
                return e2;
            }
            n6 += 8;
            n5 = (n5 + n6 & c);
        }
    }
    
    public final int e(int n) {
        final int c = this.c;
        n &= c;
        int n2 = 0;
        long n6;
        while (true) {
            final long[] a = this.a;
            final int n3 = n >> 3;
            final int n4 = (n & 0x7) << 3;
            final long n5 = (a[n3 + 1] << 64 - n4 & -n4 >> 63) | a[n3] >>> n4;
            n6 = (n5 & ~n5 << 7 & 0x8080808080808080L);
            if (n6 != 0L) {
                break;
            }
            n2 += 8;
            n = (n + n2 & c);
        }
        return n + (Long.numberOfTrailingZeros(n6) >> 3) & c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof klf)) {
            return false;
        }
        final klf klf = (klf)o;
        if (klf.d != this.d) {
            return false;
        }
        final int[] b = this.b;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L && !klf.c(b[(n2 << 3) + i])) {
                            return false;
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return true;
    }
    
    public final void f(int max) {
        if (max > 0) {
            max = Math.max(7, jak.c(max));
        }
        else {
            max = 0;
        }
        this.c = max;
        long[] a;
        if (max == 0) {
            a = jak.a;
        }
        else {
            final int n = (max + 15 & 0xFFFFFFF8) >> 3;
            a = new long[n];
            Arrays.fill(a, 0, n, -9187201950435737472L);
        }
        this.a = a;
        final int n2 = max >> 3;
        final long n3 = a[n2];
        final long n4 = 255L << ((max & 0x7) << 3);
        a[n2] = ((n3 & ~n4) | n4);
        this.e = jak.a(this.c) - this.d;
        this.b = new int[max];
    }
    
    public final boolean g(int n) {
        final int n2 = Integer.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int c = this.c;
        int n4 = n3 >>> 7 & c;
        boolean b = false;
        int n5 = 0;
    Label_0198:
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & c;
                if (this.b[n11] == n) {
                    n = n11;
                    break Label_0198;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & c);
        }
        if (n >= 0) {
            b = true;
        }
        if (b) {
            this.h(n);
        }
        return b;
    }
    
    public final void h(final int n) {
        --this.d;
        final long[] a = this.a;
        final int c = this.c;
        final int n2 = n >> 3;
        final int n3 = (n & 0x7) << 3;
        a[(n - 7 & c) + (c & 0x7) >> 3] = (a[n2] = ((a[n2] & ~(255L << n3)) | 254L << n3));
    }
    
    @Override
    public final int hashCode() {
        final int[] b = this.b;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n < 0) {
            return 0;
        }
        int n2 = 0;
        int n3 = 0;
        while (true) {
            long n4 = a[n2];
            int n5 = n3;
            if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                final int n6 = 8 - (~(n2 - n) >>> 31);
                int n7;
                for (int i = 0; i < n6; ++i, n3 = n7) {
                    n7 = n3;
                    if ((0xFFL & n4) < 128L) {
                        n7 = Integer.hashCode(b[(n2 << 3) + i]) + n3;
                    }
                    n4 >>= 8;
                }
                if (n6 != 8) {
                    return n3;
                }
                n5 = n3;
            }
            if (n2 == n) {
                return n5;
            }
            ++n2;
            n3 = n5;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        final int[] b = this.b;
        final long[] a = this.a;
        final int n = a.length - 2;
        Label_0198: {
            if (n >= 0) {
                int n2 = 0;
                int n3 = 0;
                while (true) {
                    long n4 = a[n2];
                    int n5 = n3;
                    if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n6 = 8 - (~(n2 - n) >>> 31);
                        int n7;
                        for (int i = 0; i < n6; ++i, n3 = n7) {
                            n7 = n3;
                            if ((0xFFL & n4) < 128L) {
                                final int n8 = b[(n2 << 3) + i];
                                if (n3 != 0) {
                                    sb.append((CharSequence)", ");
                                }
                                if (n3 == -1) {
                                    sb.append((CharSequence)"...");
                                    break Label_0198;
                                }
                                sb.append(n8);
                                n7 = n3 + 1;
                            }
                            n4 >>= 8;
                        }
                        if (n6 != 8) {
                            break;
                        }
                        n5 = n3;
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                    n3 = n5;
                }
            }
        }
        sb.append((CharSequence)"]");
        return sb.toString();
    }
}
