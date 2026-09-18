import java.util.Arrays;

public final class slf
{
    public long[] a;
    public long[] b;
    public int c;
    public int d;
    public int e;
    
    public slf(final int n) {
        this.a = jak.a;
        this.b = qwd.a;
        if (n >= 0) {
            this.c(jak.d(n));
            return;
        }
        qiq.r("Capacity must be a positive value.");
        throw null;
    }
    
    public final boolean a(final long n) {
        final int n2 = Long.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int c = this.c;
        int n4 = n3 >>> 7 & c;
        int n5 = 0;
        int n12 = 0;
    Label_0197:
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & c;
                if (this.b[n11] == n) {
                    n12 = n11;
                    break Label_0197;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n12 = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & c);
        }
        return n12 >= 0;
    }
    
    public final int b(int n) {
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
    
    public final void c(int max) {
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
        this.b = new long[max];
    }
    
    public final void d(final long n) {
        final int hashCode = Long.hashCode(n);
        final int n2 = -862048943;
        final int n3 = hashCode * -862048943;
        final int n4 = n3 ^ n3 << 16;
        final int n5 = n4 >>> 7;
        final int c = this.c;
        int n6 = n5 & c;
        int n7 = 0;
        int b = 0;
    Label_1235:
        while (true) {
            final long[] a = this.a;
            final int n8 = n6 >> 3;
            final int n9 = (n6 & 0x7) << 3;
            final long n10 = a[n8];
            final int n11 = 1;
            final long n12 = (a[n8 + 1] << 64 - n9 & -n9 >> 63) | n10 >>> n9;
            long n13 = n4 & 0x7F;
            final int n14 = 0;
            final long n15 = n12 ^ n13 * 72340172838076673L;
            for (long n16 = ~n15 & n15 - 72340172838076673L & 0x8080808080808080L; n16 != 0L; n16 &= n16 - 1L) {
                final int n17 = n6 + (Long.numberOfTrailingZeros(n16) >> 3) & c;
                if (this.b[n17] == n) {
                    b = n17;
                    break Label_1235;
                }
            }
            if ((~n12 << 6 & n12 & 0x8080808080808080L) != 0x0L) {
                final int b2 = this.b(n5);
                final int e = this.e;
                long n18 = 255L;
                int n20 = 0;
                int n21 = 0;
                if (e != 0 || (this.a[b2 >> 3] >> ((b2 & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n18 = 255L;
                    final int n19 = 0;
                    n20 = 1;
                    b = b2;
                    n21 = n19;
                }
                else {
                    final int c2 = this.c;
                    Label_1106: {
                        if (c2 > 8) {
                            if (Long.compareUnsigned(this.d * 32L, c2 * 25L) <= 0) {
                                final long[] a2 = this.a;
                                final int c3 = this.c;
                                final long[] b3 = this.b;
                                for (int i = 0; i < c3 + 7 >> 3; ++i) {
                                    final long n22 = a2[i] & 0x8080808080808080L;
                                    a2[i] = (0xFEFEFEFEFEFEFEFEL & ~n22 + (n22 >>> 7));
                                }
                                final long n23 = n13;
                                final int length = a2.length;
                                final int n24 = length - 2;
                                final long n25 = a2[n24];
                                final long n26 = 72057594037927935L;
                                a2[n24] = ((n25 & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[length - 1] = a2[0];
                                final int n27 = 0;
                                final int n28 = n14;
                                for (int j = n27; j != c3; ++j) {
                                    final int n29 = j >> 3;
                                    final long n30 = a2[n29];
                                    final int n31 = (j & 0x7) << 3;
                                    final long n32 = n30 >> n31 & n18;
                                    if (n32 != 128L && n32 == 254L) {
                                        final int n33 = Long.hashCode(b3[j]) * n2;
                                        final int n34 = n33 ^ n33 << 16;
                                        final int n35 = n34 >>> 7;
                                        final int b4 = this.b(n35);
                                        final int n36 = n35 & c3;
                                        if ((b4 - n36 & c3) / 8 == (j - n36 & c3) / 8) {
                                            a2[n29] = ((long)(n34 & 0x7F) << n31 | (a2[n29] & ~(n18 << n31)));
                                            a2[a2.length - n11] = ((a2[n28] & n26) | Long.MIN_VALUE);
                                        }
                                        else {
                                            final int n37 = b4 >> 3;
                                            final long n38 = a2[n37];
                                            final int n39 = (b4 & 0x7) << 3;
                                            if ((n38 >> n39 & n18) == 0x80L) {
                                                a2[n37] = ((n38 & ~(n18 << n39)) | (long)(n34 & 0x7F) << n39);
                                                a2[n29] = ((a2[n29] & ~(n18 << n31)) | 128L << n31);
                                                b3[b4] = b3[j];
                                                b3[j] = 0L;
                                            }
                                            else {
                                                a2[n37] = ((long)(n34 & 0x7F) << n39 | (n38 & ~(n18 << n39)));
                                                final long n40 = b3[b4];
                                                b3[b4] = b3[j];
                                                b3[j] = n40;
                                                --j;
                                            }
                                            a2[a2.length - 1] = ((a2[n28] & n26) | Long.MIN_VALUE);
                                        }
                                    }
                                    else {}
                                }
                                n21 = n28;
                                n20 = n11;
                                this.e = jak.a(this.c) - this.d;
                                n13 = n23;
                                break Label_1106;
                            }
                        }
                        final long n41 = 255L;
                        final long n42 = n13;
                        final int n43 = 0;
                        final int n44 = 1;
                        final int b5 = jak.b(this.c);
                        final long[] a3 = this.a;
                        final long[] b6 = this.b;
                        final int c4 = this.c;
                        this.c(b5);
                        final long[] a4 = this.a;
                        final long[] b7 = this.b;
                        final int c5 = this.c;
                        int n45 = 0;
                        while (true) {
                            n13 = n42;
                            n18 = n41;
                            n21 = n43;
                            n20 = n44;
                            if (n45 >= c4) {
                                break;
                            }
                            if ((a3[n45 >> 3] >> ((n45 & 0x7) << 3) & 0xFFL) < 128L) {
                                final long n46 = b6[n45];
                                final int n47 = Long.hashCode(n46) * n2;
                                final int n48 = n47 ^ n47 << 16;
                                final int b8 = this.b(n48 >>> 7);
                                final long n49 = n48 & 0x7F;
                                final int n50 = b8 >> 3;
                                final int n51 = (b8 & 0x7) << 3;
                                a4[(b8 - 7 & c5) + (c5 & 0x7) >> 3] = (a4[n50] = ((a4[n50] & ~(255L << n51)) | n49 << n51));
                                b7[b8] = n46;
                            }
                            ++n45;
                        }
                    }
                    b = this.b(n5);
                }
                ++this.d;
                final int e2 = this.e;
                final long[] a5 = this.a;
                final int n52 = b >> 3;
                final long n53 = a5[n52];
                final int n54 = (b & 0x7) << 3;
                if ((n53 >> n54 & n18) == 0x80L) {
                    n21 = n20;
                }
                this.e = e2 - n21;
                final int c6 = this.c;
                a5[(b - 7 & c6) + (c6 & 0x7) >> 3] = (a5[n52] = ((n53 & ~(n18 << n54)) | n13 << n54));
                break;
            }
            n7 += 8;
            n6 = (n6 + n7 & c);
        }
        this.b[b] = n;
    }
    
    public final void e(long n) {
        final int n2 = Long.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int c = this.c;
        int n4 = n3 >>> 7 & c;
        int n5 = 0;
        int n12 = 0;
    Label_0197:
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & c;
                if (this.b[n11] == n) {
                    n12 = n11;
                    break Label_0197;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n12 = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & c);
        }
        if (n12 >= 0) {
            --this.d;
            final long[] a2 = this.a;
            final int c2 = this.c;
            final int n13 = n12 >> 3;
            final int n14 = (n12 & 0x7) << 3;
            n = ((a2[n13] & ~(255L << n14)) | 254L << n14);
            a2[(n12 - 7 & c2) + (c2 & 0x7) >> 3] = (a2[n13] = n);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof slf)) {
            return false;
        }
        final slf slf = (slf)o;
        if (slf.d != this.d) {
            return false;
        }
        final long[] b = this.b;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L && !slf.a(b[(n2 << 3) + i])) {
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
    
    @Override
    public final int hashCode() {
        final long[] b = this.b;
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
                        n7 = Long.hashCode(b[(n2 << 3) + i]) + n3;
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
        final long[] b = this.b;
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
                                final long n8 = b[(n2 << 3) + i];
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
