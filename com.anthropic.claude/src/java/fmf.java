import java.util.Collection;
import java.util.Arrays;

public final class fmf
{
    public long[] a;
    public Object[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    public fmf(final int n) {
        this.a = jak.a;
        this.b = o50.e;
        this.c = uuj.w;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        if (n >= 0) {
            this.f(jak.d(n));
            return;
        }
        qiq.r("Capacity must be a positive value.");
        throw null;
    }
    
    public final boolean a(final Object o) {
        final int g = this.g;
        final int d = this.d(o);
        this.b[d] = o;
        final long[] c = this.c;
        final int d2 = this.d;
        c[d] = (((long)d2 & 0x7FFFFFFFL) | 0x3FFFFFFF80000000L);
        if (d2 != Integer.MAX_VALUE) {
            c[d2] = (((long)d & 0x7FFFFFFFL) << 31 | (c[d2] & 0xC00000007FFFFFFFL));
        }
        this.d = d;
        if (this.e == Integer.MAX_VALUE) {
            this.e = d;
        }
        return this.g != g;
    }
    
    public final void b() {
        this.g = 0;
        final long[] a = this.a;
        if (a != jak.a) {
            iw0.U0(a, -9187201950435737472L);
            final long[] a2 = this.a;
            final int f = this.f;
            final int n = f >> 3;
            final long n2 = a2[n];
            final long n3 = 255L << ((f & 0x7) << 3);
            a2[n] = ((n2 & ~n3) | n3);
        }
        Arrays.fill(this.b, 0, this.f, (Object)null);
        iw0.U0(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = jak.a(this.f) - this.g;
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
        final int f = this.f;
        int n3 = n2 >>> 7 & f;
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
                final int n10 = (Long.numberOfTrailingZeros(n9) >> 3) + n3 & f;
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
            n3 = (n3 + n4 & f);
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
        final int f = this.f;
        int n5 = n4 & f;
        int n6 = 0;
        while (true) {
            final long[] a = this.a;
            final int n7 = n5 >> 3;
            final int n8 = (n5 & 0x7) << 3;
            final long n9 = (a[n7 + 1] << 64 - n8 & -n8 >> 63) | a[n7] >>> n8;
            final long n10 = n3 & 0x7F;
            final long n11 = n9 ^ n10 * 72340172838076673L;
            for (long n12 = n11 - 72340172838076673L & ~n11 & 0x8080808080808080L; n12 != 0L; n12 &= n12 - 1L) {
                final int n13 = (Long.numberOfTrailingZeros(n12) >> 3) + n5 & f;
                if (mlc.q(this.b[n13], o)) {
                    return n13;
                }
            }
            if ((n9 & ~n9 << 6 & 0x8080808080808080L) != 0x0L) {
                int n14 = this.e(n4);
                final int h = this.h;
                final long n15 = 255L;
                long n16;
                long n17;
                if (h != 0 || (this.a[n14 >> 3] >> ((n14 & 0x7) << 3) & 0xFFL) == 0xFEL) {
                    n16 = n10;
                    n17 = 255L;
                }
                else {
                    final int f2 = this.f;
                    Label_1713: {
                        if (f2 > 8) {
                            if (Long.compareUnsigned(this.g * 32L, f2 * 25L) <= 0) {
                                final long[] a2 = this.a;
                                if (a2 == null) {
                                    n16 = n10;
                                    n17 = 255L;
                                    break Label_1713;
                                }
                                final int f3 = this.f;
                                final Object[] b = this.b;
                                final long[] c = this.c;
                                final long[] array = new long[f3];
                                Arrays.fill(array, 0, f3, 9223372034707292159L);
                                for (int i = 0; i < f3 + 7 >> 3; ++i) {
                                    final long n18 = a2[i] & 0x8080808080808080L;
                                    a2[i] = (~n18 + (n18 >>> 7) & 0xFEFEFEFEFEFEFEFEL);
                                }
                                final long n19 = n15;
                                final int length = a2.length;
                                final int n20 = length - 2;
                                a2[n20] = ((a2[n20] & 0xFFFFFFFFFFFFFFL) | 0xFF00000000000000L);
                                a2[length - 1] = a2[0];
                                for (int j = 0; j != f3; ++j) {
                                    final int n21 = j >> 3;
                                    final long n22 = a2[n21];
                                    final int n23 = (j & 0x7) << 3;
                                    final long n24 = n22 >> n23 & n19;
                                    if (n24 != 128L && n24 == 254L) {
                                        final Object o2 = b[j];
                                        int hashCode2;
                                        if (o2 != null) {
                                            hashCode2 = o2.hashCode();
                                        }
                                        else {
                                            hashCode2 = 0;
                                        }
                                        final int n25 = hashCode2 * n;
                                        final int n26 = n25 ^ n25 << 16;
                                        final int n27 = n26 >>> 7;
                                        final int e = this.e(n27);
                                        final int n28 = n27 & f3;
                                        if ((e - n28 & f3) / 8 == (j - n28 & f3) / 8) {
                                            a2[n21] = ((a2[n21] & ~(n19 << n23)) | (long)(n26 & 0x7F) << n23);
                                            if (array[j] == 9223372034707292159L) {
                                                final long n29 = j;
                                                array[j] = (n29 | n29 << 32);
                                            }
                                            a2[a2.length - 1] = a2[0];
                                        }
                                        else {
                                            final int n30 = e >> 3;
                                            final long n31 = a2[n30];
                                            final int n32 = (e & 0x7) << 3;
                                            if ((n31 >> n32 & n19) == 0x80L) {
                                                a2[n30] = ((n31 & ~(n19 << n32)) | (long)(n26 & 0x7F) << n32);
                                                a2[n21] = ((a2[n21] & ~(n19 << n23)) | 128L << n23);
                                                b[e] = b[j];
                                                b[j] = null;
                                                c[e] = c[j];
                                                c[j] = 4611686018427387903L;
                                                final int n33 = (int)(array[j] >> 32 & 0xFFFFFFFFL);
                                                if (n33 != Integer.MAX_VALUE) {
                                                    array[n33] = ((long)e | (array[n33] & 0xFFFFFFFF00000000L));
                                                    array[j] = ((array[j] & 0xFFFFFFFFL) | 0xFFFFFFFF00000000L);
                                                }
                                                else {
                                                    array[j] = (0x7FFFFFFF00000000L | (long)e);
                                                }
                                                array[e] = ((long)j << 32 | 0x7FFFFFFFL);
                                            }
                                            else {
                                                a2[n30] = ((long)(n26 & 0x7F) << n32 | (n31 & ~(n19 << n32)));
                                                final Object o3 = b[e];
                                                b[e] = b[j];
                                                b[j] = o3;
                                                final long n34 = c[e];
                                                c[e] = c[j];
                                                c[j] = n34;
                                                int n35 = (int)(array[j] >> 32 & 0xFFFFFFFFL);
                                                if (n35 != Integer.MAX_VALUE) {
                                                    final long n36 = array[n35];
                                                    final long n37 = e;
                                                    array[n35] = ((n36 & 0xFFFFFFFF00000000L) | n37);
                                                    array[j] = ((array[j] & 0xFFFFFFFFL) | n37 << 32);
                                                }
                                                else {
                                                    final long n38 = e;
                                                    array[j] = (n38 | n38 << 32);
                                                    n35 = j;
                                                }
                                                array[e] = ((long)n35 << 32 | (long)j);
                                                --j;
                                            }
                                            a2[a2.length - 1] = a2[0];
                                        }
                                    }
                                    else {}
                                }
                                final long n39 = n10;
                                this.h = jak.a(this.f) - this.g;
                                final long[] c2 = this.c;
                                for (int length2 = c2.length, k = 0; k < length2; ++k) {
                                    final long n40 = c2[k];
                                    final int n41 = (int)(n40 >> 31 & 0x7FFFFFFFL);
                                    final int n42 = (int)(n40 & 0x7FFFFFFFL);
                                    int n43;
                                    if (n41 == Integer.MAX_VALUE) {
                                        n43 = Integer.MAX_VALUE;
                                    }
                                    else {
                                        n43 = (int)(array[n41] & 0xFFFFFFFFL);
                                    }
                                    final long n44 = n43;
                                    int n45;
                                    if (n42 == Integer.MAX_VALUE) {
                                        n45 = Integer.MAX_VALUE;
                                    }
                                    else {
                                        n45 = (int)(array[n42] & 0xFFFFFFFFL);
                                    }
                                    c2[k] = (((n40 & 0xC000000000000000L) | n44) << 31 | (long)n45);
                                }
                                final int d = this.d;
                                if (d != Integer.MAX_VALUE) {
                                    this.d = (int)(array[d] & 0xFFFFFFFFL);
                                }
                                final int e2 = this.e;
                                n17 = n19;
                                n16 = n39;
                                if (e2 != Integer.MAX_VALUE) {
                                    this.e = (int)(array[e2] & 0xFFFFFFFFL);
                                    n17 = n19;
                                    n16 = n39;
                                }
                                break Label_1713;
                            }
                        }
                        final long n46 = n10;
                        final long n47 = 255L;
                        final int b2 = jak.b(this.f);
                        final long[] a3 = this.a;
                        final Object[] b3 = this.b;
                        final long[] c3 = this.c;
                        final int f4 = this.f;
                        final int[] array2 = new int[f4];
                        this.f(b2);
                        final long[] a4 = this.a;
                        final Object[] b4 = this.b;
                        final long[] c4 = this.c;
                        final int f5 = this.f;
                        for (int l = 0; l < f4; ++l) {
                            if ((a3[l >> 3] >> ((l & 0x7) << 3) & 0xFFL) < 128L) {
                                final Object o4 = b3[l];
                                int hashCode3;
                                if (o4 != null) {
                                    hashCode3 = o4.hashCode();
                                }
                                else {
                                    hashCode3 = 0;
                                }
                                final int n48 = hashCode3 * n;
                                final int n49 = n48 ^ n48 << 16;
                                final int e3 = this.e(n49 >>> 7);
                                final long n50 = n49 & 0x7F;
                                final int n51 = e3 >> 3;
                                final int n52 = (e3 & 0x7) << 3;
                                a4[(e3 - 7 & f5) + (f5 & 0x7) >> 3] = (a4[n51] = ((a4[n51] & ~(255L << n52)) | n50 << n52));
                                b4[e3] = o4;
                                c4[e3] = c3[l];
                                array2[l] = e3;
                            }
                        }
                        final long[] c5 = this.c;
                        for (int length3 = c5.length, n53 = 0; n53 < length3; ++n53) {
                            final long n54 = c5[n53];
                            final int n55 = (int)(n54 >> 31 & 0x7FFFFFFFL);
                            final int n56 = (int)(n54 & 0x7FFFFFFFL);
                            int n57;
                            if (n55 == Integer.MAX_VALUE) {
                                n57 = Integer.MAX_VALUE;
                            }
                            else {
                                n57 = array2[n55];
                            }
                            final long n58 = n57;
                            int n59;
                            if (n56 == Integer.MAX_VALUE) {
                                n59 = Integer.MAX_VALUE;
                            }
                            else {
                                n59 = array2[n56];
                            }
                            c5[n53] = (((n54 & 0xC000000000000000L) | n58) << 31 | (long)n59);
                        }
                        final int d2 = this.d;
                        if (d2 != Integer.MAX_VALUE) {
                            this.d = array2[d2];
                        }
                        final int e4 = this.e;
                        n17 = n47;
                        n16 = n46;
                        if (e4 != Integer.MAX_VALUE) {
                            this.e = array2[e4];
                            n16 = n46;
                            n17 = n47;
                        }
                    }
                    n14 = this.e(n4);
                }
                int n60 = 0;
                ++this.g;
                final int h2 = this.h;
                final long[] a5 = this.a;
                final int n61 = n14 >> 3;
                final long n62 = a5[n61];
                final int n63 = (n14 & 0x7) << 3;
                if ((n62 >> n63 & n17) == 0x80L) {
                    n60 = 1;
                }
                this.h = h2 - n60;
                final int f6 = this.f;
                a5[(n14 - 7 & f6) + (f6 & 0x7) >> 3] = (a5[n61] = ((n62 & ~(n17 << n63)) | n16 << n63));
                return n14;
            }
            n6 += 8;
            n5 = (n5 + n6 & f);
        }
    }
    
    public final int e(int n) {
        final int f = this.f;
        n &= f;
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
            n = (n + n2 & f);
        }
        return n + (Long.numberOfTrailingZeros(n6) >> 3) & f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof fmf)) {
            return false;
        }
        final fmf fmf = (fmf)o;
        if (fmf.g != this.g) {
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
                        if ((0xFFL & n3) < 128L && !fmf.c(b[(n2 << 3) + i])) {
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
        this.f = max;
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
        this.h = jak.a(this.f) - this.g;
        Object[] e;
        if (max == 0) {
            e = o50.e;
        }
        else {
            e = new Object[max];
        }
        this.b = e;
        long[] w;
        if (max == 0) {
            w = uuj.w;
        }
        else {
            w = new long[max];
            Arrays.fill(w, 0, max, 4611686018427387903L);
        }
        this.c = w;
    }
    
    public final boolean g(final Object o) {
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
        final int f = this.f;
        int n3 = n2 >>> 7 & f;
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
                final int n10 = (Long.numberOfTrailingZeros(n9) >> 3) + n3 & f;
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
            n3 = (n3 + n4 & f);
        }
        if (n11 >= 0) {
            b = true;
        }
        if (b) {
            this.h(n11);
        }
        return b;
    }
    
    public final void h(final int n) {
        --this.g;
        final long[] a = this.a;
        final int f = this.f;
        final int n2 = n >> 3;
        final int n3 = (n & 0x7) << 3;
        a[(n - 7 & f) + (f & 0x7) >> 3] = (a[n2] = ((a[n2] & ~(255L << n3)) | 254L << n3));
        this.b[n] = null;
        final long[] c = this.c;
        final long n4 = c[n];
        final int e = (int)(n4 >> 31 & 0x7FFFFFFFL);
        final int d = (int)(n4 & 0x7FFFFFFFL);
        if (e != Integer.MAX_VALUE) {
            c[e] = ((c[e] & 0xFFFFFFFF80000000L) | ((long)d & 0x7FFFFFFFL));
        }
        else {
            this.d = d;
        }
        if (d != Integer.MAX_VALUE) {
            c[d] = (((long)e & 0x7FFFFFFFL) << 31 | (c[d] & 0xC00000007FFFFFFFL));
        }
        else {
            this.e = e;
        }
        c[n] = 4611686018427387903L;
    }
    
    @Override
    public final int hashCode() {
        int n = this.f * 31 + this.g;
        final Object[] b = this.b;
        final long[] a = this.a;
        final int n2 = a.length - 2;
        int n3 = n;
        if (n2 >= 0) {
            int n4 = 0;
            while (true) {
                long n5 = a[n4];
                int n6 = n;
                if ((~n5 << 7 & n5 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n7 = 8 - (~(n4 - n2) >>> 31);
                    int n8;
                    for (int i = 0; i < n7; ++i, n = n8) {
                        n8 = n;
                        if ((0xFFL & n5) < 128L) {
                            final Object o = b[(n4 << 3) + i];
                            n8 = n;
                            if (!mlc.q(o, this)) {
                                int hashCode;
                                if (o != null) {
                                    hashCode = o.hashCode();
                                }
                                else {
                                    hashCode = 0;
                                }
                                n8 = n + hashCode;
                            }
                        }
                        n5 >>= 8;
                    }
                    if (n7 != 8) {
                        return n;
                    }
                    n6 = n;
                }
                n3 = n6;
                if (n4 == n2) {
                    break;
                }
                ++n4;
                n = n6;
            }
        }
        return n3;
    }
    
    public final boolean i(final Collection collection) {
        final Object[] b = this.b;
        final int g = this.g;
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
                            if (!c86.A0((Iterable)collection, b[n5])) {
                                this.h(n5);
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
        return g != this.g;
    }
    
    @Override
    public final String toString() {
        final trf trf = new trf((Object)this, (byte)6);
        final StringBuilder sb = new StringBuilder("[");
        final Object[] b = this.b;
        final long[] c = this.c;
        int i = this.e;
        int n = 0;
        while (i != Integer.MAX_VALUE) {
            final int n2 = (int)(c[i] >> 31 & 0x7FFFFFFFL);
            final Object o = b[i];
            if (n != 0) {
                sb.append((CharSequence)", ");
            }
            if (n == -1) {
                sb.append((CharSequence)"...");
                break;
            }
            sb.append((CharSequence)trf.b(o));
            ++n;
            i = n2;
        }
        sb.append((CharSequence)"]");
        return sb.toString();
    }
}
