import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class e8m implements Iterable, stc
{
    public static final e8m z;
    public final long v;
    public final long w;
    public final long x;
    public final long[] y;
    
    static {
        z = new e8m(0L, 0L, 0L, null);
    }
    
    public e8m(final long v, final long w, final long x, final long[] y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final e8m a(e8m d) {
        e8m d2 = this;
        final e8m z = e8m.z;
        if (d == z) {
            return d2;
        }
        if (d2 == z) {
            return z;
        }
        final long x = d.x;
        final long x2 = d.x;
        final long[] y = d.y;
        final long w = d.w;
        final long v = d.v;
        final long x3 = d2.x;
        if (x == x3) {
            final long[] y2 = d2.y;
            if (y == y2) {
                return new e8m(d2.v & ~v, d2.w & ~w, x3, y2);
            }
        }
        final int n = 0;
        d = d2;
        if (y != null) {
            final int length = y.length;
            int n2 = 0;
            while (true) {
                d = d2;
                if (n2 >= length) {
                    break;
                }
                d2 = d2.d(y[n2]);
                ++n2;
            }
        }
        e8m e8m = d;
        if (w != 0L) {
            int n3 = 0;
            while (true) {
                e8m = d;
                if (n3 >= 64) {
                    break;
                }
                e8m d3 = d;
                if ((1L << n3 & w) != 0x0L) {
                    d3 = d.d(n3 + x2);
                }
                ++n3;
                d = d3;
            }
        }
        d = e8m;
        if (v != 0L) {
            int n4 = n;
            while (true) {
                d = e8m;
                if (n4 >= 64) {
                    break;
                }
                d = e8m;
                if ((1L << n4 & v) != 0x0L) {
                    d = e8m.d(n4 + x2 + 64L);
                }
                ++n4;
                e8m = d;
            }
        }
        return d;
    }
    
    public final e8m d(long n) {
        final long n2 = n - this.x;
        if (mlc.v(n2, 0L) >= 0 && mlc.v(n2, 64L) < 0) {
            final long n3 = 1L << (int)n2;
            final long w = this.w;
            if ((w & n3) != 0x0L) {
                n = this.x;
                return new e8m(this.v, w & ~n3, n, this.y);
            }
        }
        else if (mlc.v(n2, 64L) >= 0 && mlc.v(n2, 128L) < 0) {
            final long n4 = 1L << (int)n2 - 64;
            n = this.v;
            if ((n & n4) != 0x0L) {
                return new e8m(n & ~n4, this.w, this.x, this.y);
            }
        }
        else if (mlc.v(n2, 0L) < 0) {
            final long[] y = this.y;
            if (y != null) {
                final int p = c5q.p(y, n);
                if (p >= 0) {
                    final int length = y.length;
                    final int n5 = length - 1;
                    long[] array;
                    if (n5 == 0) {
                        array = null;
                    }
                    else {
                        array = new long[n5];
                        if (p > 0) {
                            iw0.M0(y, array, 0, 0, p);
                        }
                        if (p < n5) {
                            iw0.M0(y, array, p, p + 1, length);
                        }
                    }
                    return new e8m(this.v, this.w, this.x, array);
                }
            }
        }
        return this;
    }
    
    public final boolean f(final long n) {
        final long n2 = n - this.x;
        if (mlc.v(n2, 0L) >= 0 && mlc.v(n2, 64L) < 0) {
            return (1L << (int)n2 & this.w) != 0x0L;
        }
        if (mlc.v(n2, 64L) >= 0 && mlc.v(n2, 128L) < 0) {
            return (1L << (int)n2 - 64 & this.v) != 0x0L;
        }
        if (mlc.v(n2, 0L) > 0) {
            return false;
        }
        final long[] y = this.y;
        return y != null && c5q.p(y, n) >= 0;
    }
    
    public final Iterator iterator() {
        return new mw0((Object)new d8m(this, (f07)null), (byte)1).iterator();
    }
    
    public final e8m j(e8m e8m) {
        e8m m = this;
        final e8m z = e8m.z;
        if (e8m == z) {
            return m;
        }
        if (m == z) {
            return e8m;
        }
        final long x = e8m.x;
        final long x2 = e8m.x;
        final long[] y = e8m.y;
        final long w = e8m.w;
        final long v = e8m.v;
        final long x3 = m.x;
        final long w2 = m.w;
        final long v2 = m.v;
        if (x == x3) {
            final long[] y2 = m.y;
            if (y == y2) {
                return new e8m(v2 | v, w2 | w, x3, y2);
            }
        }
        final int n = 0;
        final int n2 = 0;
        final long[] y3 = m.y;
        if (y3 == null) {
            if (y3 != null) {
                final int length = y3.length;
                int n3 = 0;
                e8m i = e8m;
                while (true) {
                    e8m = i;
                    if (n3 >= length) {
                        break;
                    }
                    i = i.m(y3[n3]);
                    ++n3;
                }
            }
            final long x4 = m.x;
            e8m e8m2 = e8m;
            if (w2 != 0L) {
                int n4 = 0;
                while (true) {
                    e8m2 = e8m;
                    if (n4 >= 64) {
                        break;
                    }
                    e8m j = e8m;
                    if ((1L << n4 & w2) != 0x0L) {
                        j = e8m.m(n4 + x4);
                    }
                    ++n4;
                    e8m = j;
                }
            }
            e8m = e8m2;
            if (v2 != 0L) {
                int n5 = n2;
                while (true) {
                    e8m = e8m2;
                    if (n5 >= 64) {
                        break;
                    }
                    e8m = e8m2;
                    if ((1L << n5 & v2) != 0x0L) {
                        e8m = e8m2.m(n5 + x4 + 64L);
                    }
                    ++n5;
                    e8m2 = e8m;
                }
            }
            return e8m;
        }
        e8m = m;
        if (y != null) {
            final int length2 = y.length;
            int n6 = 0;
            while (true) {
                e8m = m;
                if (n6 >= length2) {
                    break;
                }
                m = m.m(y[n6]);
                ++n6;
            }
        }
        e8m e8m3 = e8m;
        if (w != 0L) {
            int n7 = 0;
            while (true) {
                e8m3 = e8m;
                if (n7 >= 64) {
                    break;
                }
                e8m k = e8m;
                if ((1L << n7 & w) != 0x0L) {
                    k = e8m.m(n7 + x2);
                }
                ++n7;
                e8m = k;
            }
        }
        e8m = e8m3;
        if (v != 0L) {
            int n8 = n;
            while (true) {
                e8m = e8m3;
                if (n8 >= 64) {
                    break;
                }
                e8m = e8m3;
                if ((1L << n8 & v) != 0x0L) {
                    e8m = e8m3.m(n8 + x2 + 64L);
                }
                ++n8;
                e8m3 = e8m;
            }
        }
        return e8m;
    }
    
    public final e8m m(long x) {
        long x2 = this.x;
        final long n = x - x2;
        long n2 = 0L;
        final int v = mlc.v(n, 0L);
        long w = this.w;
        if (v >= 0 && mlc.v(n, 64L) < 0) {
            x = 1L << (int)n;
            if ((w & x) == 0x0L) {
                return new e8m(this.v, w | x, this.x, this.y);
            }
        }
        else {
            final int v2 = mlc.v(n, 64L);
            long v3 = this.v;
            final int n3 = 64;
            if (v2 >= 0 && mlc.v(n, 128L) < 0) {
                x = 1L << (int)n - 64;
                if ((v3 & x) == 0x0L) {
                    return new e8m(v3 | x, this.w, this.x, this.y);
                }
            }
            else {
                final int v4 = mlc.v(n, 128L);
                final long[] y = this.y;
                if (v4 >= 0) {
                    if (!this.f(x)) {
                        long n4;
                        if (mlc.v(n4 = (x + 1L) / 64L * 64L, 0L) < 0) {
                            n4 = 9223372036854775680L;
                        }
                        xzj xzj = null;
                        while (true) {
                            while (mlc.v(x2, n4) < 0) {
                                xzj xzj2;
                                if (w != n2) {
                                    if (xzj == null) {
                                        final Object o = new Object();
                                        qlf v5;
                                        if (y != null) {
                                            final long[] copy = Arrays.copyOf(y, y.length);
                                            v5 = new qlf(copy.length);
                                            final int b = v5.b;
                                            if (b < 0) {
                                                qiq.t("");
                                                throw null;
                                            }
                                            if (copy.length != 0) {
                                                v5.c(copy.length + b);
                                                final long[] a = v5.a;
                                                final int b2 = v5.b;
                                                if (b != b2) {
                                                    iw0.M0(a, a, copy.length + b, b, b2);
                                                }
                                                System.arraycopy((Object)copy, 0, (Object)a, b, copy.length);
                                                v5.b += copy.length;
                                            }
                                        }
                                        else {
                                            v5 = new qlf();
                                        }
                                        ((xzj)o).v = v5;
                                        xzj = (xzj)o;
                                    }
                                    int n5 = 0;
                                    while (true) {
                                        xzj2 = xzj;
                                        if (n5 >= n3) {
                                            break;
                                        }
                                        if ((1L << n5 & w) != n2) {
                                            ((qlf)xzj.v).a(n5 + x2);
                                        }
                                        ++n5;
                                    }
                                }
                                else {
                                    xzj2 = xzj;
                                }
                                if (v3 == n2) {
                                    x2 = n4;
                                    xzj = xzj2;
                                    if (xzj != null) {
                                        final qlf qlf = (qlf)xzj.v;
                                        final int b3 = qlf.b;
                                        long[] array;
                                        if (b3 == 0) {
                                            array = null;
                                        }
                                        else {
                                            array = new long[b3];
                                            final long[] a2 = qlf.a;
                                            for (int i = 0; i < b3; ++i) {
                                                array[i] = a2[i];
                                            }
                                        }
                                        if (array != null) {
                                            return new e8m(v3, n2, x2, array).m(x);
                                        }
                                    }
                                    long[] array = y;
                                    return new e8m(v3, n2, x2, array).m(x);
                                }
                                x2 += 64L;
                                final long n6 = n2;
                                xzj = xzj2;
                                w = v3;
                                v3 = n6;
                            }
                            n2 = w;
                            continue;
                        }
                    }
                }
                else {
                    if (y == null) {
                        return new e8m(this.v, this.w, this.x, new long[] { x });
                    }
                    final int p = c5q.p(y, x);
                    if (p < 0) {
                        final int n7 = -(p + 1);
                        final int length = y.length;
                        final long[] array2 = new long[length + 1];
                        iw0.M0(y, array2, 0, 0, n7);
                        iw0.M0(y, array2, n7 + 1, n7, length);
                        array2[n7] = x;
                        final long w2 = this.w;
                        x = this.x;
                        return new e8m(this.v, w2, x, array2);
                    }
                }
            }
        }
        return this;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final ArrayList list = new ArrayList(d86.p0((Iterable)this, 10));
        final Iterator iterator = ((Iterable)this).iterator();
        while (iterator.hasNext()) {
            ((Collection)list).add((Object)String.valueOf(((Number)iterator.next()).longValue()));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)"");
        final int size = ((Collection)list).size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final Object value = ((List)list).get(i);
            boolean b = true;
            if (++n > 1) {
                sb.append((CharSequence)", ");
            }
            if (value != null) {
                b = (value instanceof CharSequence);
            }
            if (b) {
                sb.append((CharSequence)value);
            }
            else if (value instanceof Character) {
                sb.append((char)value);
            }
            else {
                sb.append((CharSequence)value.toString());
            }
            ++i;
        }
        sb.append((CharSequence)"");
        final String string2 = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" [");
        sb2.append(string2);
        sb2.append("]");
        return sb2.toString();
    }
}
