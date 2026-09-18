import java.util.Arrays;

public final class amf
{
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    
    public amf(final int n) {
        this.a = jak.a;
        this.b = o50.e;
        this.c = bhc.a;
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
        Arrays.fill(this.b, 0, this.d, (Object)null);
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
    
    public final int c(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = -862048943;
        final int n2 = hashCode * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int n4 = n3 >>> 7;
        final int n5 = n3 & 0x7F;
        final int d = this.d;
        int n6 = n4 & d;
        int n7 = 0;
        while (true) {
            final long[] a = this.a;
            final int n8 = n6 >> 3;
            final int n9 = (n6 & 0x7) << 3;
            final long n10 = (a[n8 + 1] << 64 - n9 & -n9 >> 63) | a[n8] >>> n9;
            long n11 = n5;
            final int n12 = 0;
            final long n13 = n10 ^ n11 * 72340172838076673L;
            for (long n14 = ~n13 & n13 - 72340172838076673L & 0x8080808080808080L; n14 != 0L; n14 &= n14 - 1L) {
                final int n15 = n6 + (Long.numberOfTrailingZeros(n14) >> 3) & d;
                if (mlc.q(this.b[n15], o)) {
                    return n15;
                }
            }
            if ((~n10 << 6 & n10 & 0x8080808080808080L) != 0x0L) {
                int n16 = this.b(n4);
                final int f = this.f;
                long n17 = 255L;
                if (f != 0 || (this.a[n16 >> 3] >> ((n16 & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n17 = 255L;
                }
                else {
                    final int d2 = this.d;
                    Label_1160: {
                        if (d2 > 8) {
                            final int e = this.e;
                            final int n18 = 8;
                            if (Long.compareUnsigned(e * 32L, d2 * 25L) <= 0) {
                                final long[] a2 = this.a;
                                final int d3 = this.d;
                                final Object[] b = this.b;
                                final int[] c = this.c;
                                for (int i = 0; i < d3 + 7 >> 3; ++i) {
                                    final long n19 = a2[i] & 0x8080808080808080L;
                                    a2[i] = (0xFEFEFEFEFEFEFEFEL & ~n19 + (n19 >>> 7));
                                }
                                final long n20 = n11;
                                final int length = a2.length;
                                final int n21 = length - 2;
                                final long n22 = a2[n21];
                                final long n23 = 72057594037927935L;
                                a2[n21] = ((n22 & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[length - 1] = a2[0];
                                final int n24 = 0;
                                final int n25 = n18;
                                for (int j = n24; j != d3; ++j) {
                                    final int n26 = j >> 3;
                                    final long n27 = a2[n26];
                                    final int n28 = (j & 0x7) << 3;
                                    final long n29 = n27 >> n28 & n17;
                                    if (n29 != 128L && n29 == 254L) {
                                        final Object o2 = b[j];
                                        int hashCode2;
                                        if (o2 != null) {
                                            hashCode2 = o2.hashCode();
                                        }
                                        else {
                                            hashCode2 = 0;
                                        }
                                        final int n30 = hashCode2 * n;
                                        final int n31 = n30 ^ n30 << 16;
                                        final int n32 = n31 >>> 7;
                                        final int b2 = this.b(n32);
                                        final int n33 = n32 & d3;
                                        if ((b2 - n33 & d3) / 8 == (j - n33 & d3) / n25) {
                                            a2[n26] = ((long)(n31 & 0x7F) << n28 | (a2[n26] & ~(n17 << n28)));
                                            a2[a2.length - 1] = ((a2[0] & n23) | Long.MIN_VALUE);
                                        }
                                        else {
                                            final int n34 = b2 >> 3;
                                            final long n35 = a2[n34];
                                            final int n36 = (b2 & 0x7) << 3;
                                            if ((n35 >> n36 & n17) == 0x80L) {
                                                a2[n34] = ((~(n17 << n36) & n35) | (long)(n31 & 0x7F) << n36);
                                                a2[n26] = ((a2[n26] & ~(n17 << n28)) | 128L << n28);
                                                b[b2] = b[j];
                                                b[j] = null;
                                                c[b2] = c[j];
                                                c[j] = 0;
                                            }
                                            else {
                                                a2[n34] = ((long)(n31 & 0x7F) << n36 | (~(n17 << n36) & n35));
                                                final Object o3 = b[b2];
                                                b[b2] = b[j];
                                                b[j] = o3;
                                                final int n37 = c[b2];
                                                c[b2] = c[j];
                                                c[j] = n37;
                                                --j;
                                            }
                                            a2[a2.length - 1] = ((a2[0] & n23) | Long.MIN_VALUE);
                                        }
                                    }
                                    else {}
                                }
                                this.f = jak.a(this.d) - this.e;
                                n11 = n20;
                                break Label_1160;
                            }
                        }
                        final long n38 = 255L;
                        final long n39 = n11;
                        final int b3 = jak.b(this.d);
                        final long[] a3 = this.a;
                        final Object[] b4 = this.b;
                        final int[] c2 = this.c;
                        final int d4 = this.d;
                        this.e(b3);
                        final long[] a4 = this.a;
                        final Object[] b5 = this.b;
                        final int[] c3 = this.c;
                        final int d5 = this.d;
                        int n40 = 0;
                        while (true) {
                            n11 = n39;
                            n17 = n38;
                            if (n40 >= d4) {
                                break;
                            }
                            if ((a3[n40 >> 3] >> ((n40 & 0x7) << 3) & 0xFFL) < 128L) {
                                final Object o4 = b4[n40];
                                int hashCode3;
                                if (o4 != null) {
                                    hashCode3 = o4.hashCode();
                                }
                                else {
                                    hashCode3 = 0;
                                }
                                final int n41 = hashCode3 * n;
                                final int n42 = n41 ^ n41 << 16;
                                final int b6 = this.b(n42 >>> 7);
                                final long n43 = n42 & 0x7F;
                                final int n44 = b6 >> 3;
                                final int n45 = (b6 & 0x7) << 3;
                                a4[(b6 - 7 & d5) + (d5 & 0x7) >> 3] = (a4[n44] = ((a4[n44] & ~(255L << n45)) | n43 << n45));
                                b5[b6] = o4;
                                c3[b6] = c2[n40];
                            }
                            ++n40;
                        }
                    }
                    n16 = this.b(n4);
                }
                ++this.e;
                final int f2 = this.f;
                final long[] a5 = this.a;
                final int n46 = n16 >> 3;
                final long n47 = a5[n46];
                final int n48 = (n16 & 0x7) << 3;
                int n49 = n12;
                if ((n47 >> n48 & n17) == 0x80L) {
                    n49 = 1;
                }
                this.f = f2 - n49;
                final int d6 = this.d;
                a5[(n16 - 7 & d6) + (d6 & 0x7) >> 3] = (a5[n46] = ((n47 & ~(n17 << n48)) | n11 << n48));
                return ~n16;
            }
            n7 += 8;
            n6 = (n6 + n7 & d);
        }
    }
    
    public final int d(final Object o) {
        final int n = 0;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = hashCode * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = this.d;
        int n4 = n3 >>> 7;
        int n5 = n;
        while (true) {
            final int n6 = n4 & d;
            final long[] a = this.a;
            final int n7 = n6 >> 3;
            final int n8 = (n6 & 0x7) << 3;
            final long n9 = (a[n7 + 1] << 64 - n8 & -n8 >> 63) | a[n7] >>> n8;
            final long n10 = (n3 & 0x7F) * 72340172838076673L ^ n9;
            for (long n11 = ~n10 & n10 - 72340172838076673L & 0x8080808080808080L; n11 != 0L; n11 &= n11 - 1L) {
                final int n12 = (Long.numberOfTrailingZeros(n11) >> 3) + n6 & d;
                if (mlc.q(this.b[n12], o)) {
                    return n12;
                }
            }
            if ((n9 & ~n9 << 6 & 0x8080808080808080L) != 0x0L) {
                return -1;
            }
            n5 += 8;
            n4 = n6 + n5;
        }
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
        this.b = new Object[max];
        this.c = new int[max];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof amf)) {
            return false;
        }
        final amf amf = (amf)o;
        if (amf.e != this.e) {
            return false;
        }
        final Object[] b = this.b;
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
                            final Object o2 = b[n5];
                            final int n6 = c[n5];
                            final int d = amf.d(o2);
                            if (d < 0 || n6 != amf.c[d]) {
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
    
    public final void f(final int n) {
        --this.e;
        final long[] a = this.a;
        final int d = this.d;
        final int n2 = n >> 3;
        final int n3 = (n & 0x7) << 3;
        a[(n - 7 & d) + (d & 0x7) >> 3] = (a[n2] = ((a[n2] & ~(255L << n3)) | 254L << n3));
        this.b[n] = null;
    }
    
    public final void g(final int n, final Object o) {
        int c;
        final int n2 = c = this.c(o);
        if (n2 < 0) {
            c = ~n2;
        }
        this.b[c] = o;
        this.c[c] = n;
    }
    
    @Override
    public final int hashCode() {
        final Object[] b = this.b;
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
                        final Object o = b[n8];
                        final int n9 = c[n8];
                        int hashCode;
                        if (o != null) {
                            hashCode = o.hashCode();
                        }
                        else {
                            hashCode = 0;
                        }
                        n7 = n3 + (Integer.hashCode(n9) ^ hashCode);
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
        final Object[] b = this.b;
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
                            final Object o = b[n8];
                            final int n9 = c[n8];
                            Object o2;
                            if ((o2 = o) == this) {
                                o2 = "(this)";
                            }
                            sb.append(o2);
                            sb.append("=");
                            sb.append(n9);
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
