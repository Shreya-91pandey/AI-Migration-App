import java.util.Arrays;

public final class rlf
{
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;
    
    public rlf(final int n) {
        this.a = jak.a;
        this.b = qwd.a;
        this.c = o50.e;
        if (n >= 0) {
            this.f(jak.d(n));
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
        Arrays.fill(this.c, 0, this.d, (Object)null);
        this.f = jak.a(this.d) - this.e;
    }
    
    public final boolean b(final long n) {
        final int n2 = Long.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = this.d;
        int n4 = n3 >>> 7 & d;
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
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & d;
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
            n4 = (n4 + n5 & d);
        }
        return n12 >= 0;
    }
    
    public final int c(long n) {
        final int hashCode = Long.hashCode(n);
        final int n2 = -862048943;
        final int n3 = hashCode * -862048943;
        final int n4 = n3 ^ n3 << 16;
        final int n5 = n4 >>> 7;
        final int d = this.d;
        int n6 = n5 & d;
        int n7 = 0;
        while (true) {
            final long[] a = this.a;
            final int n8 = n6 >> 3;
            final int n9 = (n6 & 0x7) << 3;
            final long n10 = a[n8];
            final int n11 = 1;
            final long n12 = (a[n8 + 1] << 64 - n9 & -n9 >> 63) | n10 >>> n9;
            final long n13 = n4 & 0x7F;
            final int n14 = 0;
            final long n15 = n12 ^ n13 * 72340172838076673L;
            for (long n16 = ~n15 & n15 - 72340172838076673L & 0x8080808080808080L; n16 != 0L; n16 &= n16 - 1L) {
                final int n17 = n6 + (Long.numberOfTrailingZeros(n16) >> 3) & d;
                if (this.b[n17] == n) {
                    return n17;
                }
            }
            if ((~n12 << 6 & n12 & 0x8080808080808080L) != 0x0L) {
                int n18 = this.d(n5);
                int n19 = 0;
                int n20 = 0;
                if (this.f != 0 || (this.a[n18 >> 3] >> ((n18 & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n = n13;
                    n19 = 0;
                    n20 = 1;
                }
                else {
                    final int d2 = this.d;
                    Label_1146: {
                        if (d2 > 8) {
                            if (Long.compareUnsigned(this.e * 32L, d2 * 25L) <= 0) {
                                final long[] a2 = this.a;
                                final int d3 = this.d;
                                final long[] b = this.b;
                                final Object[] c = this.c;
                                int i = 0;
                                n20 = n11;
                                n19 = n14;
                                while (i < d3 + 7 >> 3) {
                                    n = (a2[i] & 0x8080808080808080L);
                                    a2[i] = (0xFEFEFEFEFEFEFEFEL & ~n + (n >>> 7));
                                    ++i;
                                }
                                n = n13;
                                final int length = a2.length;
                                final int n21 = length - 2;
                                final long n22 = a2[n21];
                                final long n23 = 72057594037927935L;
                                a2[n21] = ((n22 & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[length - 1] = a2[n19];
                                for (int j = n19; j != d3; ++j) {
                                    final int n24 = j >> 3;
                                    final long n25 = a2[n24];
                                    final int n26 = (j & 0x7) << 3;
                                    final long n27 = n25 >> n26 & 0xFFL;
                                    if (n27 != 128L && n27 == 254L) {
                                        final int n28 = Long.hashCode(b[j]) * n2;
                                        final int n29 = n28 ^ n28 << 16;
                                        final int n30 = n29 >>> 7;
                                        final int d4 = this.d(n30);
                                        final int n31 = n30 & d3;
                                        if ((d4 - n31 & d3) / 8 == (j - n31 & d3) / 8) {
                                            a2[n24] = ((long)(n29 & 0x7F) << n26 | (a2[n24] & ~(255L << n26)));
                                            a2[a2.length - n20] = ((a2[n19] & n23) | Long.MIN_VALUE);
                                        }
                                        else {
                                            final int n32 = d4 >> 3;
                                            final long n33 = a2[n32];
                                            final int n34 = (d4 & 0x7) << 3;
                                            if ((n33 >> n34 & 0xFFL) == 0x80L) {
                                                a2[n32] = ((n33 & ~(255L << n34)) | (long)(n29 & 0x7F) << n34);
                                                a2[n24] = ((a2[n24] & ~(255L << n26)) | 128L << n26);
                                                b[d4] = b[j];
                                                b[j] = 0L;
                                                c[d4] = c[j];
                                                c[j] = null;
                                            }
                                            else {
                                                a2[n32] = ((long)(n29 & 0x7F) << n34 | (n33 & ~(255L << n34)));
                                                final long n35 = b[d4];
                                                b[d4] = b[j];
                                                b[j] = n35;
                                                final Object o = c[d4];
                                                c[d4] = c[j];
                                                c[j] = o;
                                                --j;
                                            }
                                            a2[a2.length - 1] = ((a2[n19] & n23) | Long.MIN_VALUE);
                                        }
                                    }
                                    else {}
                                }
                                this.f = jak.a(this.d) - this.e;
                                break Label_1146;
                            }
                        }
                        final int n36 = 0;
                        final int n37 = 1;
                        final int b2 = jak.b(this.d);
                        final long[] a3 = this.a;
                        final long[] b3 = this.b;
                        final Object[] c2 = this.c;
                        final int d5 = this.d;
                        this.f(b2);
                        final long[] a4 = this.a;
                        final long[] b4 = this.b;
                        final Object[] c3 = this.c;
                        final int d6 = this.d;
                        int n38 = 0;
                        while (true) {
                            n20 = n37;
                            n19 = n36;
                            n = n13;
                            if (n38 >= d5) {
                                break;
                            }
                            if ((a3[n38 >> 3] >> ((n38 & 0x7) << 3) & 0xFFL) < 128L) {
                                n = b3[n38];
                                final int n39 = Long.hashCode(n) * n2;
                                final int n40 = n39 ^ n39 << 16;
                                final int d7 = this.d(n40 >>> 7);
                                final long n41 = n40 & 0x7F;
                                final int n42 = d7 >> 3;
                                final int n43 = (d7 & 0x7) << 3;
                                a4[(d7 - 7 & d6) + (d6 & 0x7) >> 3] = (a4[n42] = ((a4[n42] & ~(255L << n43)) | n41 << n43));
                                b4[d7] = n;
                                c3[d7] = c2[n38];
                            }
                            ++n38;
                        }
                    }
                    n18 = this.d(n5);
                }
                ++this.e;
                final int f = this.f;
                final long[] a5 = this.a;
                final int n44 = n18 >> 3;
                final long n45 = a5[n44];
                final int n46 = (n18 & 0x7) << 3;
                if ((n45 >> n46 & 0xFFL) != 0x80L) {
                    n20 = n19;
                }
                this.f = f - n20;
                final int d8 = this.d;
                n = ((n45 & ~(255L << n46)) | n << n46);
                a5[(n18 - 7 & d8) + (d8 & 0x7) >> 3] = (a5[n44] = n);
                return n18;
            }
            n7 += 8;
            n6 = (n6 + n7 & d);
        }
    }
    
    public final int d(int n) {
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
    
    public final Object e(final long n) {
        final int n2 = Long.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = this.d;
        int n4 = n3 >>> 7 & d;
        int n5 = 0;
        int n12 = 0;
    Label_0200:
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & d;
                if (this.b[n11] == n) {
                    n12 = n11;
                    break Label_0200;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n12 = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & d);
        }
        if (n12 >= 0) {
            return this.c[n12];
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof rlf)) {
            return false;
        }
        final rlf rlf = (rlf)o;
        if (rlf.e != this.e) {
            return false;
        }
        final long[] b = this.b;
        final Object[] c = this.c;
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
                            final long n6 = b[n5];
                            final Object o2 = c[n5];
                            if (o2 == null) {
                                if (rlf.e(n6) != null || !rlf.b(n6)) {
                                    return false;
                                }
                            }
                            else if (!o2.equals(rlf.e(n6))) {
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
    
    public final void f(int max) {
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
        this.b = new long[max];
        this.c = new Object[max];
    }
    
    public final Object g(final long n) {
        final int n2 = Long.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = this.d;
        int n4 = n3 >>> 7 & d;
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
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & d;
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
            n4 = (n4 + n5 & d);
        }
        if (n12 >= 0) {
            return this.h(n12);
        }
        return null;
    }
    
    public final Object h(final int n) {
        --this.e;
        final long[] a = this.a;
        final int d = this.d;
        final int n2 = n >> 3;
        final int n3 = (n & 0x7) << 3;
        a[(n - 7 & d) + (d & 0x7) >> 3] = (a[n2] = ((a[n2] & ~(255L << n3)) | 254L << n3));
        final Object[] c = this.c;
        final Object o = c[n];
        c[n] = null;
        return o;
    }
    
    @Override
    public final int hashCode() {
        final long[] b = this.b;
        final Object[] c = this.c;
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
                        final long n9 = b[n8];
                        final Object o = c[n8];
                        final int hashCode = Long.hashCode(n9);
                        int hashCode2;
                        if (o != null) {
                            hashCode2 = o.hashCode();
                        }
                        else {
                            hashCode2 = 0;
                        }
                        n7 = n3 + (hashCode2 ^ hashCode);
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
    
    public final void i(final long n, final Object o) {
        final int c = this.c(n);
        this.b[c] = n;
        this.c[c] = o;
    }
    
    @Override
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder("{");
        final long[] b = this.b;
        final Object[] c = this.c;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            int n3 = 0;
            while (true) {
                long n4 = a[n2];
                if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n5 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n5; ++i) {
                        if ((0xFFL & n4) < 128L) {
                            final int n6 = (n2 << 3) + i;
                            final long n7 = b[n6];
                            final Object o = c[n6];
                            sb.append(n7);
                            sb.append("=");
                            Object o2;
                            if ((o2 = o) == this) {
                                o2 = "(this)";
                            }
                            sb.append(o2);
                            final int n8 = n3 + 1;
                            if ((n3 = n8) < this.e) {
                                sb.append(", ");
                                n3 = n8;
                            }
                        }
                        n4 >>= 8;
                    }
                    if (n5 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
