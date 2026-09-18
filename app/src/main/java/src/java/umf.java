import java.util.Arrays;

public final class umf
{
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public xmf e;
    public int f;
    
    public umf(final int n) {
        this.a = jak.a;
        this.b = o50.e;
        if (n >= 0) {
            this.f(jak.d(n));
            return;
        }
        qiq.r("Capacity must be a positive value.");
        throw null;
    }
    
    public final boolean a(final Object o) {
        final int d = this.d;
        this.b[this.d(o)] = o;
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
        Arrays.fill(this.b, 0, this.c, (Object)null);
        this.f = jak.a(this.c) - this.d;
    }
    
    public final boolean c(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * -862048943;
        final int n2 = n ^ n << 16;
        final int c = this.c;
        int n3 = n2 >>> 7 & c;
        int n4 = 0;
        int n11 = 0;
    Label_0209:
        while (true) {
            final long[] a = this.a;
            final int n5 = n3 >> 3;
            final int n6 = (n3 & 0x7) << 3;
            final long n7 = (a[n5 + 1] << 64 - n6 & -n6 >> 63) | a[n5] >>> n6;
            final long n8 = (n2 & 0x7F) * 72340172838076673L ^ n7;
            for (long n9 = ~n8 & n8 - 72340172838076673L & 0x8080808080808080L; n9 != 0L; n9 &= n9 - 1L) {
                final int n10 = (Long.numberOfTrailingZeros(n9) >> 3) + n3 & c;
                if (mlc.q(this.b[n10], o)) {
                    n11 = n10;
                    break Label_0209;
                }
            }
            if ((n7 & ~n7 << 6 & 0x8080808080808080L) != 0x0L) {
                n11 = -1;
                break;
            }
            n4 += 8;
            n3 = (n3 + n4 & c);
        }
        return n11 >= 0;
    }
    
    public final int d(final Object o) {
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
        final int c = this.c;
        int n6 = n4 & c;
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
                final int n15 = n6 + (Long.numberOfTrailingZeros(n14) >> 3) & c;
                if (mlc.q(this.b[n15], o)) {
                    return n15;
                }
            }
            if ((~n10 << 6 & n10 & 0x8080808080808080L) != 0x0L) {
                int n16 = this.e(n4);
                final int f = this.f;
                long n17 = 255L;
                if (f != 0 || (this.a[n16 >> 3] >> ((n16 & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n17 = 255L;
                }
                else {
                    final int c2 = this.c;
                    Label_1107: {
                        if (c2 > 8) {
                            final int d = this.d;
                            final int n18 = 8;
                            if (Long.compareUnsigned(d * 32L, c2 * 25L) <= 0) {
                                final long[] a2 = this.a;
                                final int c3 = this.c;
                                final Object[] b = this.b;
                                for (int i = 0; i < c3 + 7 >> 3; ++i) {
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
                                for (int j = n24; j != c3; ++j) {
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
                                        final int e = this.e(n32);
                                        final int n33 = n32 & c3;
                                        if ((e - n33 & c3) / n25 == (j - n33 & c3) / n25) {
                                            a2[n26] = ((long)(n31 & 0x7F) << n28 | (~(n17 << n28) & a2[n26]));
                                            a2[a2.length - 1] = ((a2[0] & n23) | Long.MIN_VALUE);
                                        }
                                        else {
                                            final int n34 = e >> 3;
                                            final long n35 = a2[n34];
                                            final int n36 = (e & 0x7) << 3;
                                            if ((n35 >> n36 & n17) == 0x80L) {
                                                a2[n34] = ((~(n17 << n36) & n35) | (long)(n31 & 0x7F) << n36);
                                                a2[n26] = ((a2[n26] & ~(n17 << n28)) | 128L << n28);
                                                b[e] = b[j];
                                                b[j] = null;
                                            }
                                            else {
                                                a2[n34] = ((long)(n31 & 0x7F) << n36 | (~(n17 << n36) & n35));
                                                final Object o3 = b[e];
                                                b[e] = b[j];
                                                b[j] = o3;
                                                --j;
                                            }
                                            a2[a2.length - 1] = ((a2[0] & n23) | Long.MIN_VALUE);
                                        }
                                    }
                                    else {}
                                }
                                this.f = jak.a(this.c) - this.d;
                                n11 = n20;
                                break Label_1107;
                            }
                        }
                        final long n37 = 255L;
                        final long n38 = n11;
                        final int b2 = jak.b(this.c);
                        final long[] a3 = this.a;
                        final Object[] b3 = this.b;
                        final int c4 = this.c;
                        this.f(b2);
                        final long[] a4 = this.a;
                        final Object[] b4 = this.b;
                        final int c5 = this.c;
                        int n39 = 0;
                        while (true) {
                            n11 = n38;
                            n17 = n37;
                            if (n39 >= c4) {
                                break;
                            }
                            if ((a3[n39 >> 3] >> ((n39 & 0x7) << 3) & 0xFFL) < 128L) {
                                final Object o4 = b3[n39];
                                int hashCode3;
                                if (o4 != null) {
                                    hashCode3 = o4.hashCode();
                                }
                                else {
                                    hashCode3 = 0;
                                }
                                final int n40 = hashCode3 * n;
                                final int n41 = n40 ^ n40 << 16;
                                final int e2 = this.e(n41 >>> 7);
                                final long n42 = n41 & 0x7F;
                                final int n43 = e2 >> 3;
                                final int n44 = (e2 & 0x7) << 3;
                                a4[(e2 - 7 & c5) + (c5 & 0x7) >> 3] = (a4[n43] = ((a4[n43] & ~(255L << n44)) | n42 << n44));
                                b4[e2] = o4;
                            }
                            ++n39;
                        }
                    }
                    n16 = this.e(n4);
                }
                ++this.d;
                final int f2 = this.f;
                final long[] a5 = this.a;
                final int n45 = n16 >> 3;
                final long n46 = a5[n45];
                final int n47 = (n16 & 0x7) << 3;
                int n48 = n12;
                if ((n46 >> n47 & n17) == 0x80L) {
                    n48 = 1;
                }
                this.f = f2 - n48;
                final int c6 = this.c;
                a5[(n16 - 7 & c6) + (c6 & 0x7) >> 3] = (a5[n45] = ((n46 & ~(n17 << n47)) | n11 << n47));
                return n16;
            }
            n7 += 8;
            n6 = (n6 + n7 & c);
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
        if (!(o instanceof umf)) {
            return false;
        }
        final umf umf = (umf)o;
        if (umf.d != this.d) {
            return false;
        }
        final Object[] b = this.b;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L && !umf.c(b[(n2 << 3) + i])) {
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
        this.f = jak.a(this.c) - this.d;
        Object[] e;
        if (max == 0) {
            e = o50.e;
        }
        else {
            e = new Object[max];
        }
        this.b = e;
    }
    
    public final boolean g() {
        return this.d == 0;
    }
    
    public final boolean h() {
        return this.d != 0;
    }
    
    @Override
    public final int hashCode() {
        final Object[] b = this.b;
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
                        final Object o = b[(n2 << 3) + i];
                        int hashCode;
                        if (o != null) {
                            hashCode = o.hashCode();
                        }
                        else {
                            hashCode = 0;
                        }
                        n7 = n3 + hashCode;
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
    
    public final void i(final Object o) {
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
        final int c = this.c;
        int n4 = n3 >>> 7;
        int n5 = n;
        int n13 = 0;
    Label_0213:
        while (true) {
            final int n6 = n4 & c;
            final long[] a = this.a;
            final int n7 = n6 >> 3;
            final int n8 = (n6 & 0x7) << 3;
            final long n9 = (a[n7 + 1] << 64 - n8 & -n8 >> 63) | a[n7] >>> n8;
            final long n10 = (n3 & 0x7F) * 72340172838076673L ^ n9;
            for (long n11 = ~n10 & n10 - 72340172838076673L & 0x8080808080808080L; n11 != 0L; n11 &= n11 - 1L) {
                final int n12 = (Long.numberOfTrailingZeros(n11) >> 3) + n6 & c;
                if (mlc.q(this.b[n12], o)) {
                    n13 = n12;
                    break Label_0213;
                }
            }
            if ((n9 & ~n9 << 6 & 0x8080808080808080L) != 0x0L) {
                n13 = -1;
                break;
            }
            n5 += 8;
            n4 = n6 + n5;
        }
        if (n13 >= 0) {
            this.m(n13);
        }
    }
    
    public final void j(final umf umf) {
        final Object[] b = umf.b;
        final long[] a = umf.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            this.k(b[(n2 << 3) + i]);
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
    }
    
    public final void k(final Object o) {
        this.b[this.d(o)] = o;
    }
    
    public final boolean l(final Object o) {
        boolean b = false;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * -862048943;
        final int n2 = n ^ n << 16;
        final int c = this.c;
        int n3 = n2 >>> 7 & c;
        int n4 = 0;
        int n11 = 0;
    Label_0212:
        while (true) {
            final long[] a = this.a;
            final int n5 = n3 >> 3;
            final int n6 = (n3 & 0x7) << 3;
            final long n7 = (a[n5 + 1] << 64 - n6 & -n6 >> 63) | a[n5] >>> n6;
            final long n8 = (n2 & 0x7F) * 72340172838076673L ^ n7;
            for (long n9 = ~n8 & n8 - 72340172838076673L & 0x8080808080808080L; n9 != 0L; n9 &= n9 - 1L) {
                final int n10 = (Long.numberOfTrailingZeros(n9) >> 3) + n3 & c;
                if (mlc.q(this.b[n10], o)) {
                    n11 = n10;
                    break Label_0212;
                }
            }
            if ((n7 & ~n7 << 6 & 0x8080808080808080L) != 0x0L) {
                n11 = -1;
                break;
            }
            n4 += 8;
            n3 = (n3 + n4 & c);
        }
        if (n11 >= 0) {
            b = true;
        }
        if (b) {
            this.m(n11);
        }
        return b;
    }
    
    public final void m(final int n) {
        --this.d;
        final long[] a = this.a;
        final int c = this.c;
        final int n2 = n >> 3;
        final int n3 = (n & 0x7) << 3;
        a[(n - 7 & c) + (c & 0x7) >> 3] = (a[n2] = ((a[n2] & ~(255L << n3)) | 254L << n3));
        this.b[n] = null;
    }
    
    @Override
    public final String toString() {
        final jwj jwj = new jwj((Object)this, (byte)4);
        final StringBuilder sb = new StringBuilder("[");
        final Object[] b = this.b;
        final long[] a = this.a;
        final int n = a.length - 2;
        Label_0217: {
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
                                final Object o = b[(n2 << 3) + i];
                                if (n3 != 0) {
                                    sb.append((CharSequence)", ");
                                }
                                if (n3 == -1) {
                                    sb.append((CharSequence)"...");
                                    break Label_0217;
                                }
                                sb.append((CharSequence)jwj.b(o));
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
