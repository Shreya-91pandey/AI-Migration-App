import java.util.Arrays;

public final class tmf
{
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public k5e f;
    public int g;
    
    public tmf(final int n) {
        this.a = jak.a;
        final Object[] e = o50.e;
        this.b = e;
        this.c = e;
        if (n >= 0) {
            this.h(jak.d(n));
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
        Arrays.fill(this.b, 0, this.d, (Object)null);
        this.g = jak.a(this.d) - this.e;
    }
    
    public final boolean b(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * -862048943;
        final int n2 = n ^ n << 16;
        final int d = this.d;
        int n3 = n2 >>> 7 & d;
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
                final int n10 = (Long.numberOfTrailingZeros(n9) >> 3) + n3 & d;
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
            n3 = (n3 + n4 & d);
        }
        return n11 >= 0;
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
        final int d = this.d;
        int n3 = n2 >>> 7 & d;
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
                final int n10 = (Long.numberOfTrailingZeros(n9) >> 3) + n3 & d;
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
            n3 = (n3 + n4 & d);
        }
        return n11 >= 0;
    }
    
    public final boolean d(final Object o) {
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
                        if ((0xFFL & n3) < 128L && mlc.q(o, c[(n2 << 3) + i])) {
                            return true;
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
        return false;
    }
    
    public final int e(int n) {
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
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof tmf)) {
            return false;
        }
        final tmf tmf = (tmf)o;
        if (tmf.e != this.e) {
            return false;
        }
        final Object[] b = this.b;
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
                            final Object o2 = b[n5];
                            final Object o3 = c[n5];
                            if (o3 == null) {
                                if (tmf.g(o2) != null || !tmf.c(o2)) {
                                    return false;
                                }
                            }
                            else if (!o3.equals(tmf.g(o2))) {
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
    
    public final int f(final Object o) {
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
                int n16 = this.e(n4);
                final int g = this.g;
                long n17 = 255L;
                if (g != 0 || (this.a[n16 >> 3] >> ((n16 & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n17 = 255L;
                }
                else {
                    final int d2 = this.d;
                    Label_1131: {
                        if (d2 > 8) {
                            final int e = this.e;
                            final int n18 = 8;
                            if (Long.compareUnsigned(e * 32L, d2 * 25L) <= 0) {
                                final long[] a2 = this.a;
                                final int d3 = this.d;
                                final Object[] b = this.b;
                                final Object[] c = this.c;
                                for (int i = 0; i < d3 + 7 >> 3; ++i) {
                                    final long n19 = a2[i] & 0x8080808080808080L;
                                    a2[i] = (0xFEFEFEFEFEFEFEFEL & ~n19 + (n19 >>> 7));
                                }
                                final int length = a2.length;
                                final int n20 = length - 2;
                                a2[n20] = ((a2[n20] & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[length - 1] = a2[0];
                                final int n21 = 0;
                                final int n22 = n18;
                                for (int j = n21; j != d3; ++j) {
                                    final int n23 = j >> 3;
                                    final long n24 = a2[n23];
                                    final int n25 = (j & 0x7) << 3;
                                    final long n26 = n24 >> n25 & n17;
                                    if (n26 != 128L && n26 == 254L) {
                                        final Object o2 = b[j];
                                        int hashCode2;
                                        if (o2 != null) {
                                            hashCode2 = o2.hashCode();
                                        }
                                        else {
                                            hashCode2 = 0;
                                        }
                                        final int n27 = hashCode2 * n;
                                        final int n28 = n27 ^ n27 << 16;
                                        final int n29 = n28 >>> 7;
                                        final int e2 = this.e(n29);
                                        final int n30 = n29 & d3;
                                        if ((e2 - n30 & d3) / n22 == (j - n30 & d3) / n22) {
                                            a2[n23] = ((long)(n28 & 0x7F) << n25 | (a2[n23] & ~(n17 << n25)));
                                            a2[a2.length - 1] = a2[0];
                                        }
                                        else {
                                            final int n31 = e2 >> 3;
                                            final long n32 = a2[n31];
                                            final int n33 = (e2 & 0x7) << 3;
                                            if ((n32 >> n33 & n17) == 0x80L) {
                                                a2[n31] = ((~(n17 << n33) & n32) | (long)(n28 & 0x7F) << n33);
                                                a2[n23] = ((a2[n23] & ~(n17 << n25)) | 128L << n25);
                                                b[e2] = b[j];
                                                b[j] = null;
                                                c[e2] = c[j];
                                                c[j] = null;
                                            }
                                            else {
                                                a2[n31] = ((long)(n28 & 0x7F) << n33 | (~(n17 << n33) & n32));
                                                final Object o3 = b[e2];
                                                b[e2] = b[j];
                                                b[j] = o3;
                                                final Object o4 = c[e2];
                                                c[e2] = c[j];
                                                c[j] = o4;
                                                --j;
                                            }
                                            a2[a2.length - 1] = a2[0];
                                        }
                                    }
                                    else {}
                                }
                                this.g = jak.a(this.d) - this.e;
                                break Label_1131;
                            }
                        }
                        final long n34 = 255L;
                        final long n35 = n11;
                        final int b2 = jak.b(this.d);
                        final long[] a3 = this.a;
                        final Object[] b3 = this.b;
                        final Object[] c2 = this.c;
                        final int d4 = this.d;
                        this.h(b2);
                        final long[] a4 = this.a;
                        final Object[] b4 = this.b;
                        final Object[] c3 = this.c;
                        final int d5 = this.d;
                        int n36 = 0;
                        while (true) {
                            n11 = n35;
                            n17 = n34;
                            if (n36 >= d4) {
                                break;
                            }
                            if ((a3[n36 >> 3] >> ((n36 & 0x7) << 3) & 0xFFL) < 128L) {
                                final Object o5 = b3[n36];
                                int hashCode3;
                                if (o5 != null) {
                                    hashCode3 = o5.hashCode();
                                }
                                else {
                                    hashCode3 = 0;
                                }
                                final int n37 = hashCode3 * n;
                                final int n38 = n37 ^ n37 << 16;
                                final int e3 = this.e(n38 >>> 7);
                                final long n39 = n38 & 0x7F;
                                final int n40 = e3 >> 3;
                                final int n41 = (e3 & 0x7) << 3;
                                a4[(e3 - 7 & d5) + (d5 & 0x7) >> 3] = (a4[n40] = ((a4[n40] & ~(255L << n41)) | n39 << n41));
                                b4[e3] = o5;
                                c3[e3] = c2[n36];
                            }
                            ++n36;
                        }
                    }
                    n16 = this.e(n4);
                }
                ++this.e;
                final int g2 = this.g;
                final long[] a5 = this.a;
                final int n42 = n16 >> 3;
                final long n43 = a5[n42];
                final int n44 = (n16 & 0x7) << 3;
                int n45 = n12;
                if ((n43 >> n44 & n17) == 0x80L) {
                    n45 = 1;
                }
                this.g = g2 - n45;
                final int d6 = this.d;
                a5[(n16 - 7 & d6) + (d6 & 0x7) >> 3] = (a5[n42] = ((n43 & ~(n17 << n44)) | n11 << n44));
                return ~n16;
            }
            n7 += 8;
            n6 = (n6 + n7 & d);
        }
    }
    
    public final Object g(final Object o) {
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
        int n13 = 0;
    Label_0213:
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
            return this.c[n13];
        }
        return null;
    }
    
    public final void h(int max) {
        Object[] e = o50.e;
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
            final int n2 = max >> 3;
            final long n3 = a[n2];
            final long n4 = 255L << ((max & 0x7) << 3);
            a[n2] = ((n3 & ~n4) | n4);
        }
        this.a = a;
        this.g = jak.a(this.d) - this.e;
        Object[] b;
        if (max == 0) {
            b = e;
        }
        else {
            b = new Object[max];
        }
        this.b = b;
        if (max != 0) {
            e = new Object[max];
        }
        this.c = e;
    }
    
    @Override
    public final int hashCode() {
        final Object[] b = this.b;
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
                        final Object o = b[n8];
                        final Object o2 = c[n8];
                        int hashCode;
                        if (o != null) {
                            hashCode = o.hashCode();
                        }
                        else {
                            hashCode = 0;
                        }
                        int hashCode2;
                        if (o2 != null) {
                            hashCode2 = o2.hashCode();
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
    
    public final boolean i() {
        return this.e == 0;
    }
    
    public final boolean j() {
        return this.e != 0;
    }
    
    public final Object k(final Object o) {
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
        int n13 = 0;
    Label_0213:
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
            return this.l(n13);
        }
        return null;
    }
    
    public final Object l(final int n) {
        --this.e;
        final long[] a = this.a;
        final int d = this.d;
        final int n2 = n >> 3;
        final int n3 = (n & 0x7) << 3;
        a[(n - 7 & d) + (d & 0x7) >> 3] = (a[n2] = ((a[n2] & ~(255L << n3)) | 254L << n3));
        this.b[n] = null;
        final Object[] c = this.c;
        final Object o = c[n];
        c[n] = null;
        return o;
    }
    
    public final void m(final Object o, final Object o2) {
        int f;
        final int n = f = this.f(o);
        if (n < 0) {
            f = ~n;
        }
        this.b[f] = o;
        this.c[f] = o2;
    }
    
    @Override
    public final String toString() {
        if (this.i()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder("{");
        final Object[] b = this.b;
        final Object[] c = this.c;
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
                            final Object o2 = c[n8];
                            Object o3;
                            if ((o3 = o) == this) {
                                o3 = "(this)";
                            }
                            sb.append(o3);
                            sb.append("=");
                            Object o4;
                            if ((o4 = o2) == this) {
                                o4 = "(this)";
                            }
                            sb.append(o4);
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
