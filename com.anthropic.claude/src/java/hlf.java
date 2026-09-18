import java.util.Arrays;

public final class hlf
{
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    
    public hlf(final int n) {
        this.a = jak.a;
        final int[] a = bhc.a;
        this.b = a;
        this.c = a;
        if (n >= 0) {
            this.e(jak.d(n));
            return;
        }
        qiq.r("Capacity must be a positive value.");
        throw null;
    }
    
    public final void a() {
        this.e = 0;
        final long[] a = this.a;
        if (a != jak.a) {
            iw0.U0(a, -9187201950435737472L);
            final long[] a2 = this.a;
            final int d = this.d;
            final int n = d >> 3;
            final long n2 = a2[n];
            final long n3 = 255L << ((d & 0x7) << 3);
            a2[n] = ((n2 & ~n3) | n3);
        }
        this.f = jak.a(this.d) - this.e;
    }
    
    public final int b(int n) {
        final int d = this.d;
        n &= d;
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
            n = (n + n2 & d);
        }
        return n + (Long.numberOfTrailingZeros(n6) >> 3) & d;
    }
    
    public final int c(final int n) {
        final int n2 = Integer.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = this.d;
        int n4 = n3 >>> 7 & d;
        int n5 = 0;
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & d;
                if (this.b[n11] == n) {
                    return n11;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                return -1;
            }
            n5 += 8;
            n4 = (n4 + n5 & d);
        }
    }
    
    public final int d(int c) {
        c = this.c(c);
        if (c >= 0) {
            return this.c[c];
        }
        return -1;
    }
    
    public final void e(int max) {
        if (max > 0) {
            max = Math.max(7, jak.c(max));
        }
        else {
            max = 0;
        }
        this.d = max;
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
        this.f = jak.a(this.d) - this.e;
        this.b = new int[max];
        this.c = new int[max];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof hlf)) {
            return false;
        }
        final hlf hlf = (hlf)o;
        if (hlf.e != this.e) {
            return false;
        }
        final int[] b = this.b;
        final int[] c = this.c;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final int n6 = b[n5];
                            final int n7 = c[n5];
                            final int c2 = hlf.c(n6);
                            if (c2 < 0 || n7 != hlf.c[c2]) {
                                return false;
                            }
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
    
    public final void f(final int n, final int n2) {
        final int hashCode = Integer.hashCode(n);
        final int n3 = -862048943;
        final int n4 = hashCode * -862048943;
        final int n5 = n4 ^ n4 << 16;
        final int n6 = n5 >>> 7;
        final int d = this.d;
        int n7 = n6 & d;
        int n8 = 0;
        int n20 = 0;
    Label_1303:
        while (true) {
            final long[] a = this.a;
            final int n9 = n7 >> 3;
            final int n10 = (n7 & 0x7) << 3;
            final long n11 = a[n9];
            final int n12 = 1;
            final long n13 = a[n9 + 1];
            final int n14 = 0;
            final long n15 = (-n10 >> 63 & n13 << 64 - n10) | n11 >>> n10;
            final long n16 = n5 & 0x7F;
            final long n17 = n15 ^ n16 * 72340172838076673L;
            for (long n18 = n17 - 72340172838076673L & ~n17 & 0x8080808080808080L; n18 != 0L; n18 &= n18 - 1L) {
                final int n19 = (Long.numberOfTrailingZeros(n18) >> 3) + n7 & d;
                if (this.b[n19] == n) {
                    n20 = n19;
                    break Label_1303;
                }
            }
            if ((n15 & ~n15 << 6 & 0x8080808080808080L) != 0x0L) {
                final int b = this.b(n6);
                final int f = this.f;
                final long n21 = 255L;
                long n22 = 0L;
                long n23 = 0L;
                int n25 = 0;
                int b2;
                int n26 = 0;
                if (f != 0 || (this.a[b >> 3] >> ((b & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n22 = n16;
                    n23 = 255L;
                    final int n24 = 1;
                    n25 = 0;
                    b2 = b;
                    n26 = n24;
                }
                else {
                    final int d2 = this.d;
                    Label_1168: {
                        if (d2 > 8) {
                            if (Long.compareUnsigned(this.e * 32L, d2 * 25L) <= 0) {
                                final long[] a2 = this.a;
                                final int d3 = this.d;
                                final int[] b3 = this.b;
                                final int[] c = this.c;
                                for (int i = 0; i < d3 + 7 >> 3; ++i) {
                                    final long n27 = a2[i] & 0x8080808080808080L;
                                    a2[i] = (0xFEFEFEFEFEFEFEFEL & ~n27 + (n27 >>> 7));
                                }
                                final long n28 = n16;
                                n23 = n21;
                                final int length = a2.length;
                                final int n29 = length - 2;
                                a2[n29] = ((a2[n29] & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[length - 1] = a2[0];
                                final int n30 = 0;
                                n25 = n14;
                                for (int j = n30; j != d3; ++j) {
                                    final int n31 = j >> 3;
                                    final long n32 = a2[n31];
                                    final int n33 = (j & 0x7) << 3;
                                    final long n34 = n32 >> n33 & n23;
                                    if (n34 != 128L && n34 == 254L) {
                                        final int n35 = Integer.hashCode(b3[j]) * n3;
                                        final int n36 = n35 ^ n35 << 16;
                                        final int n37 = n36 >>> 7;
                                        final int b4 = this.b(n37);
                                        final int n38 = n37 & d3;
                                        if ((b4 - n38 & d3) / 8 == (j - n38 & d3) / 8) {
                                            a2[n31] = ((long)(n36 & 0x7F) << n33 | (a2[n31] & ~(n23 << n33)));
                                            a2[a2.length - 1] = ((a2[n25] & 0xFFFFFFFFFFFFFFL) | Long.MIN_VALUE);
                                        }
                                        else {
                                            final int n39 = b4 >> 3;
                                            final long n40 = a2[n39];
                                            final int n41 = (b4 & 0x7) << 3;
                                            if ((n40 >> n41 & n23) == 0x80L) {
                                                a2[n39] = ((~(n23 << n41) & n40) | (long)(n36 & 0x7F) << n41);
                                                a2[n31] = ((a2[n31] & ~(n23 << n33)) | 128L << n33);
                                                b3[b4] = b3[j];
                                                b3[j] = n25;
                                                c[b4] = c[j];
                                                c[j] = n25;
                                            }
                                            else {
                                                a2[n39] = ((long)(n36 & 0x7F) << n41 | (~(n23 << n41) & n40));
                                                final int n42 = b3[b4];
                                                b3[b4] = b3[j];
                                                b3[j] = n42;
                                                final int n43 = c[b4];
                                                c[b4] = c[j];
                                                c[j] = n43;
                                                --j;
                                            }
                                            a2[a2.length - 1] = ((a2[n25] & 0xFFFFFFFFFFFFFFL) | Long.MIN_VALUE);
                                        }
                                    }
                                    else {}
                                }
                                n26 = n12;
                                this.f = jak.a(this.d) - this.e;
                                n22 = n28;
                                break Label_1168;
                            }
                        }
                        final long n44 = n16;
                        final long n45 = 255L;
                        final int n46 = 1;
                        final int n47 = 0;
                        final int b5 = jak.b(this.d);
                        final long[] a3 = this.a;
                        final int[] b6 = this.b;
                        final int[] c2 = this.c;
                        final int d4 = this.d;
                        this.e(b5);
                        final long[] a4 = this.a;
                        final int[] b7 = this.b;
                        final int[] c3 = this.c;
                        final int d5 = this.d;
                        int n48 = 0;
                        while (true) {
                            n26 = n46;
                            n23 = n45;
                            n22 = n44;
                            n25 = n47;
                            if (n48 >= d4) {
                                break;
                            }
                            if ((a3[n48 >> 3] >> ((n48 & 0x7) << 3) & 0xFFL) < 128L) {
                                final int n49 = b6[n48];
                                final int n50 = Integer.hashCode(n49) * n3;
                                final int n51 = n50 ^ n50 << 16;
                                final int b8 = this.b(n51 >>> 7);
                                final long n52 = n51 & 0x7F;
                                final int n53 = b8 >> 3;
                                final int n54 = (b8 & 0x7) << 3;
                                a4[(b8 - 7 & d5) + (d5 & 0x7) >> 3] = (a4[n53] = ((a4[n53] & ~(255L << n54)) | n52 << n54));
                                b7[b8] = n49;
                                c3[b8] = c2[n48];
                            }
                            ++n48;
                        }
                    }
                    b2 = this.b(n6);
                }
                ++this.e;
                final int f2 = this.f;
                final long[] a5 = this.a;
                final int n55 = b2 >> 3;
                final long n56 = a5[n55];
                final int n57 = (b2 & 0x7) << 3;
                if ((n56 >> n57 & n23) == 0x80L) {
                    n25 = n26;
                }
                this.f = f2 - n25;
                final int d6 = this.d;
                a5[(b2 - 7 & d6) + (d6 & 0x7) >> 3] = (a5[n55] = ((n56 & ~(n23 << n57)) | n22 << n57));
                n20 = ~b2;
                break;
            }
            n8 += 8;
            n7 = (n7 + n8 & d);
        }
        int n58 = n20;
        if (n20 < 0) {
            n58 = ~n20;
        }
        this.b[n58] = n;
        this.c[n58] = n2;
    }
    
    @Override
    public final int hashCode() {
        final int[] b = this.b;
        final int[] c = this.c;
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
                        final int n8 = (n2 << 3) + i;
                        n7 = n3 + (Integer.hashCode(c[n8]) ^ Integer.hashCode(b[n8]));
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
        if (this.e == 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder("{");
        final int[] b = this.b;
        final int[] c = this.c;
        final long[] a = this.a;
        final int n = a.length - 2;
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
                            final int n8 = (n2 << 3) + i;
                            final int n9 = b[n8];
                            final int n10 = c[n8];
                            sb.append(n9);
                            sb.append("=");
                            sb.append(n10);
                            n7 = ++n3;
                            if (n3 < this.e) {
                                sb.append(", ");
                                n7 = n3;
                            }
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
        sb.append('}');
        return sb.toString();
    }
}
