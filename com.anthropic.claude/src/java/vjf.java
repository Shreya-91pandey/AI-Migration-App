import android.text.Layout;
import android.text.TextUtils$TruncateAt;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class vjf
{
    public final uy7 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;
    
    public vjf(final uy7 a, final long n, int i, int j) {
        this.a = a;
        this.b = i;
        if (gv6.k(n) != 0 || gv6.j(n) != 0) {
            hac.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        final ArrayList h = new ArrayList();
        final ArrayList list = (ArrayList)a.z;
        final int size = list.size();
        float e = 0.0f;
        int k = 0;
        i = 0;
        while (true) {
            while (k < size) {
                final irg irg = (irg)list.get(k);
                final e90 a2 = irg.a;
                final int l = gv6.i(n);
                int h2;
                if (gv6.d(n)) {
                    if ((h2 = gv6.h(n) - (int)(float)Math.ceil((double)e)) < 0) {
                        h2 = 0;
                    }
                }
                else {
                    h2 = gv6.h(n);
                }
                final a90 a3 = new a90(a2, this.b - i, j, hv6.b(0, l, 0, h2, 5));
                final float n2 = a3.f + e;
                final mmn d = a3.d;
                final int n3 = i + d.g;
                h.add((Object)new hrg(a3, irg.b, irg.c, i, n3, e, n2));
                if (d.d || (n3 == this.b && k != lq6.P((List)this.a.z))) {
                    final boolean c = true;
                    i = n3;
                    e = n2;
                    this.e = e;
                    this.f = i;
                    this.c = c;
                    this.h = h;
                    this.d = (float)gv6.i(n);
                    final ArrayList list2 = new ArrayList(h.size());
                    int size2;
                    hrg hrg;
                    List g;
                    ArrayList list3;
                    int size3;
                    k2j k2j;
                    k2j a4;
                    for (size2 = h.size(), i = 0; i < size2; ++i) {
                        hrg = (hrg)h.get(i);
                        g = hrg.a.g;
                        list3 = new ArrayList(g.size());
                        for (size3 = ((Collection)g).size(), j = 0; j < size3; ++j) {
                            k2j = (k2j)g.get(j);
                            if (k2j != null) {
                                a4 = hrg.a(k2j);
                            }
                            else {
                                a4 = null;
                            }
                            list3.add((Object)a4);
                        }
                        h86.t0((Collection)list2, (Iterable)list3);
                    }
                    ArrayList z0 = list2;
                    if (list2.size() < ((List)this.a.w).size()) {
                        j = ((List)this.a.w).size() - list2.size();
                        final ArrayList list4 = new ArrayList(j);
                        for (i = 0; i < j; ++i) {
                            list4.add((Object)null);
                        }
                        z0 = c86.Z0((Collection)list2, (Iterable)list4);
                    }
                    this.g = z0;
                    return;
                }
                ++k;
                i = n3;
                e = n2;
            }
            final boolean c = false;
            continue;
        }
    }
    
    public static void i(final vjf vjf, final x13 x13, long h, rpl rpl, wgn wgn, dw8 dw8, int i) {
        if ((i & 0x2) != 0x0) {
            h = j86.h;
        }
        if ((i & 0x4) != 0x0) {
            rpl = null;
        }
        if ((i & 0x8) != 0x0) {
            wgn = null;
        }
        if ((i & 0x10) != 0x0) {
            dw8 = null;
        }
        x13.g();
        final ArrayList h2 = vjf.h;
        int size;
        hrg hrg;
        for (size = h2.size(), i = 0; i < size; ++i) {
            hrg = (hrg)h2.get(i);
            hrg.a.e(x13, h, rpl, wgn, dw8);
            x13.n(0.0f, hrg.a.f);
        }
        x13.p();
    }
    
    public final void a(final long n, final float[] array) {
        this.j(dnn.g(n));
        this.k(dnn.f(n));
        final Object o = new Object();
        ((z3j)o).v = 0;
        omo.G(this.h, n, (lta)new yh2(n, array, (z3j)o, (y3j)new Object()));
    }
    
    public final float b(final int n) {
        this.l(n);
        final ArrayList h = this.h;
        final hrg hrg = (hrg)h.get(omo.E(n, (List)h));
        return hrg.a.d.e(n - hrg.d) + hrg.f;
    }
    
    public final int c(int n, final boolean b) {
        this.l(n);
        final ArrayList h = this.h;
        final hrg hrg = (hrg)h.get(omo.E(n, (List)h));
        final a90 a = hrg.a;
        final int n2 = n - hrg.d;
        final mmn d = a.d;
        if (b) {
            final Layout f = d.f;
            final ThreadLocal a2 = rmn.a;
            if (f.getEllipsisCount(n2) > 0 && d.b == TextUtils$TruncateAt.END) {
                n = f.getLineStart(n2);
                n += f.getEllipsisStart(n2);
            }
            else {
                final uy7 c = d.c();
                final Layout layout = (Layout)c.v;
                n = c.R(layout.getLineEnd(n2), layout.getLineStart(n2));
            }
        }
        else {
            n = d.f(n2);
        }
        return n + hrg.b;
    }
    
    public final int d(int d) {
        final int length = ((og0)this.a.v).w.length();
        final ArrayList h = this.h;
        int n;
        if (d >= length) {
            n = lq6.P((List)h);
        }
        else if (d < 0) {
            n = 0;
        }
        else {
            n = omo.D(d, (List)h);
        }
        final hrg hrg = (hrg)h.get(n);
        final a90 a = hrg.a;
        d = hrg.d(d);
        return a.d.g(d) + hrg.d;
    }
    
    public final int e(final float n) {
        final ArrayList h = this.h;
        final hrg hrg = (hrg)h.get(omo.F(h, n));
        final int c = hrg.c;
        final int b = hrg.b;
        final int d = hrg.d;
        if (c - b == 0) {
            return d;
        }
        final a90 a = hrg.a;
        final float f = hrg.f;
        final mmn d2 = a.d;
        final int n2 = (int)(n - f - 0.0f);
        final int g = d2.g;
        int n3;
        if (g <= 0) {
            n3 = 0;
        }
        else {
            final int lineForVertical = d2.f.getLineForVertical(n2 - d2.h);
            final int n4 = g - 1;
            if ((n3 = lineForVertical) > n4) {
                n3 = n4;
            }
        }
        return n3 + d;
    }
    
    public final float f(final int n) {
        this.l(n);
        final ArrayList h = this.h;
        final hrg hrg = (hrg)h.get(omo.E(n, (List)h));
        return hrg.a.d.i(n - hrg.d) + hrg.f;
    }
    
    public final int g(long n) {
        final int n2 = (int)(n & 0xFFFFFFFFL);
        final float intBitsToFloat = Float.intBitsToFloat(n2);
        final ArrayList h = this.h;
        final hrg hrg = (hrg)h.get(omo.F(h, intBitsToFloat));
        final int c = hrg.c;
        final int b = hrg.b;
        if (c - b == 0) {
            return b;
        }
        final a90 a = hrg.a;
        n = ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n >> 32))) << 32 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(n2) - hrg.f) & 0xFFFFFFFFL));
        final mmn d = a.d;
        final int n3 = (int)(Float.intBitsToFloat((int)(0xFFFFFFFFL & n)) - 0.0f);
        final Layout f = d.f;
        final int lineForVertical = f.getLineForVertical(n3 - d.h);
        int n4;
        if (lineForVertical >= d.g) {
            n4 = f.getText().length();
        }
        else {
            n4 = f.getOffsetForHorizontal(lineForVertical, d.b(lineForVertical) * -1.0f + Float.intBitsToFloat((int)(n >> 32)));
        }
        return n4 + b;
    }
    
    public final long h(final k2j k2j, final int n, final yif yif) {
        final float b = k2j.b;
        final ArrayList h = this.h;
        int f = omo.F(h, b);
        final float g = ((hrg)h.get(f)).g;
        final float d = k2j.d;
        if (g >= d || f == lq6.P((List)h)) {
            final hrg hrg = (hrg)h.get(f);
            return hrg.b(hrg.a.b(hrg.c(k2j), n, yif), true);
        }
        int f2 = omo.F(h, d);
        long n2 = dnn.b;
        long b2;
        while (true) {
            b2 = dnn.b;
            if (!dnn.c(n2, b2) || f > f2) {
                break;
            }
            final hrg hrg2 = (hrg)h.get(f);
            n2 = hrg2.b(hrg2.a.b(hrg2.c(k2j), n, yif), true);
            ++f;
        }
        long b3 = b2;
        if (dnn.c(n2, b2)) {
            return b2;
        }
        long b4;
        while (true) {
            b4 = dnn.b;
            if (!dnn.c(b3, b4) || f > f2) {
                break;
            }
            final hrg hrg3 = (hrg)h.get(f2);
            b3 = hrg3.b(hrg3.a.b(hrg3.c(k2j), n, yif), true);
            --f2;
        }
        if (dnn.c(b3, b4)) {
            return n2;
        }
        return rhc.c((int)(n2 >> 32), (int)(0xFFFFFFFFL & b3));
    }
    
    public final void j(final int n) {
        final og0 og0 = (og0)this.a.v;
        if (n >= 0 && n < og0.w.length()) {
            return;
        }
        final int length = og0.w.length();
        final StringBuilder sb = new StringBuilder("offset(");
        sb.append(n);
        sb.append(") is out of bounds [0, ");
        sb.append(length);
        sb.append(")");
        hac.a(sb.toString());
    }
    
    public final void k(final int n) {
        final og0 og0 = (og0)this.a.v;
        if (n >= 0 && n <= og0.w.length()) {
            return;
        }
        final int length = og0.w.length();
        final StringBuilder sb = new StringBuilder("offset(");
        sb.append(n);
        sb.append(") is out of bounds [0, ");
        sb.append(length);
        sb.append("]");
        hac.a(sb.toString());
    }
    
    public final void l(final int n) {
        final boolean b = false;
        final int f = this.f;
        int n2 = b ? 1 : 0;
        if (n >= 0) {
            n2 = (b ? 1 : 0);
            if (n < f) {
                n2 = 1;
            }
        }
        if (n2 == 0) {
            final StringBuilder sb = new StringBuilder("lineIndex(");
            sb.append(n);
            sb.append(") is out of bounds [0, ");
            sb.append(f);
            sb.append(")");
            hac.a(sb.toString());
        }
    }
}
