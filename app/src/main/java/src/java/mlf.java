import java.util.Arrays;

public final class mlf
{
    public final byte a;
    public int b;
    public Object c;
    public Object d;
    
    public mlf() {
        this.a = 0;
        this.c = new inf(0, (Object[])new zkc[16]);
    }
    
    public mlf(final mei c, final int b, final String d) {
        this.a = 4;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public mlf(final xgc xgc, final xp7 xp7) {
        this.a = 1;
        final mlf f = xp7.F();
        final int v = ((vgc)xgc).v;
        if (v < 0) {
            jac.c("negative nearestRange.first");
        }
        final int min = Math.min(((vgc)xgc).w, f.b - 1);
        if (min < v) {
            final amf a = i4g.a;
            a.getClass();
            this.c = a;
            this.d = new Object[0];
            this.b = 0;
        }
        else {
            final int n = min - v + 1;
            this.d = new Object[n];
            this.b = v;
            final amf c = new amf(n);
            final inf inf = (inf)f.c;
            if (v < 0 || v >= f.b) {
                final int b = f.b;
                final StringBuilder sb = new StringBuilder("Index ");
                sb.append(v);
                sb.append(", size ");
                sb.append(b);
                jac.e(sb.toString());
            }
            if (min < 0 || min >= f.b) {
                final int b2 = f.b;
                final StringBuilder sb2 = new StringBuilder("Index ");
                sb2.append(min);
                sb2.append(", size ");
                sb2.append(b2);
                jac.e(sb2.toString());
            }
            if (min < v) {
                final StringBuilder sb3 = new StringBuilder("toIndex (");
                sb3.append(min);
                sb3.append(") should be not smaller than fromIndex (");
                sb3.append(v);
                sb3.append(")");
                jac.a(sb3.toString());
            }
            zkc zkc;
            for (int j = ncq.j(v, inf), i = ((zkc)inf.v[j]).a; i <= min; i += zkc.b, ++j) {
                zkc = (zkc)inf.v[j];
                final lta key = zkc.c.getKey();
                final int a2 = zkc.a;
                int max = Math.max(v, a2);
                final int min2 = Math.min(min, zkc.b + a2 - 1);
                if (max <= min2) {
                    while (true) {
                        Object o;
                        if (key == null || (o = key.b((Object)(max - a2))) == null) {
                            o = unh.e(max);
                        }
                        c.g(max, o);
                        ((Object[])this.d)[max - this.b] = o;
                        if (max == min2) {
                            break;
                        }
                        ++max;
                    }
                }
            }
            this.c = c;
        }
    }
    
    public void a(final int n, final s3d s3d) {
        if (n < 0) {
            jac.a("size should be >=0");
        }
        if (n == 0) {
            return;
        }
        final zkc zkc = new zkc(this.b, n, s3d);
        this.b += n;
        ((inf)this.c).b((Object)zkc);
    }
    
    public zkc b(int j) {
        if (j < 0 || j >= this.b) {
            final int b = this.b;
            final StringBuilder sb = new StringBuilder("Index ");
            sb.append(j);
            sb.append(", size ");
            sb.append(b);
            jac.e(sb.toString());
        }
        final zkc zkc = (zkc)this.d;
        if (zkc != null) {
            final int a = zkc.a;
            if (j < zkc.b + a && a <= j) {
                return zkc;
            }
        }
        final inf inf = (inf)this.c;
        j = ncq.j(j, inf);
        return (zkc)(this.d = inf.v[j]);
    }
    
    public int c(final Object o) {
        final amf amf = (amf)this.c;
        final int d = amf.d(o);
        if (d >= 0) {
            return amf.c[d];
        }
        return -1;
    }
    
    public Object d(int n) {
        final Object[] array = (Object[])this.d;
        n -= this.b;
        if (n >= 0 && n < array.length) {
            return array[n];
        }
        return null;
    }
    
    public int e(int b, int n, int n2, int n3, final int n4, final int n5, final int n6, final boolean b2, final boolean b3, final boolean b4) {
        final int n7 = b & 0x1FFFFFF;
        final long[] array = (long[])this.c;
        final int b5 = this.b;
        final int b6 = b5 + 3;
        this.b = b6;
        final int length = array.length;
        if (length <= b6) {
            final int max = Math.max(length * 2, b6);
            this.c = Arrays.copyOf(array, max);
            this.d = Arrays.copyOf((long[])this.d, max);
        }
        final long[] array2 = (long[])this.c;
        array2[b5] = ((long)n << 32 | ((long)n2 & 0xFFFFFFFFL));
        array2[b5 + 1] = ((long)n3 << 32 | ((long)n4 & 0xFFFFFFFFL));
        final long n8 = (long)(b4 ? 1 : 0);
        final long n9 = (long)(b3 ? 1 : 0);
        final long n10 = (long)(b2 ? 1 : 0);
        n = 0;
        final long n11 = Math.min(0, 1023);
        n2 = (n5 & 0x1FFFFFF);
        array2[b5 + 2] = (n8 << 63 | n9 << 62 | n10 << 61 | 0x1000000000000000L | n11 << 50 | (long)n2 << 25 | (long)(b & 0x1FFFFFF));
        if (n5 == -1) {
            return b5;
        }
        if (n6 != -4) {
            b = 1;
        }
        else {
            b = 0;
        }
        if (b == 0) {
            final StringBuilder sb = new StringBuilder("Inserted child ");
            sb.append(n7);
            sb.append(" without valid parent index");
            gac.c(sb.toString());
        }
        n3 = n6 + 2;
        final long n12 = array2[n3];
        b = n;
        if ((0x1FFFFFF & (int)n12) == n2) {
            b = 1;
        }
        if (b == 0) {
            final StringBuilder sb2 = new StringBuilder("Inserted child ");
            sb2.append(n7);
            sb2.append(" without valid parent index or parent ");
            sb2.append(n2);
            sb2.append(" not found");
            gac.c(sb2.toString());
        }
        n = (b5 - n6) / 3;
        b = l2j.b;
        array2[n3] = ((0xF003FFFFFFFFFFFFL & n12) | (long)Math.min(n, 1023) << 50);
        return b5;
    }
    
    public void f(int n, final int n2, final int n3, long n4) {
        final int n5 = 50;
        if (((int)(n4 >> 50) & 0x3FF) > 0) {
            final int b = l2j.b;
            final long n6 = -1125899873288193L;
            final int n7 = 33554431;
            final long n8 = n & 0x1FFFFFF;
            final int n9 = 25;
            final long[] array = (long[])this.c;
            final long[] array2 = (long[])this.d;
            final int b2 = this.b;
            array2[0] = ((n4 & 0xFFFC000001FFFFFFL) | n8 << 25);
            int i = 1;
            n4 = n6;
            n = n7;
            while (i > 0) {
                final int n10 = i - 1;
                final long n11 = array2[n10];
                final int n12 = (int)n11;
                int n13 = (int)(n11 >> n9) & n;
                final int n14 = (int)(n11 >> n5) & 0x3FF;
                int n15;
                if (n14 == 1023) {
                    n15 = b2;
                }
                else {
                    n15 = n14 * 3 + n13;
                }
                if (n13 < 0) {
                    break;
                }
                final int n16 = n15;
                i = n10;
                final int n17 = n;
                while (n13 < b2 - 2 && n13 <= n16) {
                    final int n18 = n13 + 2;
                    final long n19 = array[n18];
                    int n23;
                    if (((int)(n19 >> n9) & n17) == (n12 & n)) {
                        final long n20 = array[n13];
                        final int n21 = n13 + 1;
                        final long n22 = array[n21];
                        array[n13] = (((long)((int)n20 + n3) & 0xFFFFFFFFL) | (long)((int)(n20 >> 32) + n2) << 32);
                        array[n21] = (((long)((int)n22 + n3) & 0xFFFFFFFFL) | (long)((int)(n22 >> 32) + n2) << 32);
                        array[n18] = ((n19 >> 63 & 0x1L) << 60 | n19);
                        n23 = i;
                        if (((int)(n19 >> n5) & 0x3FF) > 0) {
                            final int b3 = l2j.b;
                            array2[i] = ((n19 & n4) | (long)(n13 + 3 & n17) << n9);
                            n23 = i + 1;
                        }
                    }
                    else {
                        n23 = i;
                    }
                    n13 += 3;
                    i = n23;
                }
                n = n17;
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 4: {
                final StringBuilder sb = new StringBuilder();
                if (this.c == mei.w) {
                    sb.append("HTTP/1.0");
                }
                else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String)this.d);
                return sb.toString();
            }
        }
    }
}
