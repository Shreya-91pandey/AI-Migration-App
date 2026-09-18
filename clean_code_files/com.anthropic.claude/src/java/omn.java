import android.text.Layout;
import android.graphics.RectF;
import java.util.List;
import java.util.ArrayList;

public final class omn
{
    public final nmn a;
    public final vjf b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;
    
    public omn(final nmn a, final vjf b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final ArrayList h = b.h;
        final boolean empty = h.isEmpty();
        final float n = 0.0f;
        float d;
        if (empty) {
            d = 0.0f;
        }
        else {
            d = ((hrg)h.get(0)).a.d.d(0) + 0.0f;
        }
        this.d = d;
        float e;
        if (h.isEmpty()) {
            e = n;
        }
        else {
            final hrg hrg = (hrg)c86.P0((List)h);
            final mmn d2 = hrg.a.d;
            e = d2.d(d2.g - 1) + 0.0f + hrg.f;
        }
        this.e = e;
        this.f = b.g;
    }
    
    public final int a(int d) {
        final vjf b = this.b;
        b.k(d);
        final int length = ((og0)b.a.v).w.length();
        final ArrayList h = b.h;
        int n;
        if (d == length) {
            n = lq6.P((List)h);
        }
        else {
            n = omo.D(d, (List)h);
        }
        final hrg hrg = (hrg)h.get(n);
        final a90 a = hrg.a;
        d = hrg.d(d);
        if (a.d.f.isRtlCharAt(d)) {
            return 2;
        }
        return 1;
    }
    
    public final k2j b(int n) {
        final vjf b = this.b;
        b.j(n);
        final ArrayList h = b.h;
        final hrg hrg = (hrg)h.get(omo.D(n, (List)h));
        final a90 a = hrg.a;
        final int d = hrg.d(n);
        final CharSequence e = a.e;
        if (d < 0 || d >= e.length()) {
            n = e.length();
            final StringBuilder sb = new StringBuilder("offset(");
            sb.append(d);
            sb.append(") is out of bounds [0,");
            sb.append(n);
            sb.append(")");
            hac.a(sb.toString());
        }
        final mmn d2 = a.d;
        n = d2.g(d);
        final float i = d2.i(n);
        final float e2 = d2.e(n);
        final Layout f = d2.f;
        if (f.getParagraphDirection(n) == 1) {
            n = 1;
        }
        else {
            n = 0;
        }
        final boolean rtlChar = f.isRtlCharAt(d);
        float n2 = 0.0f;
        float n3 = 0.0f;
        Label_0319: {
            if (n != 0 && !rtlChar) {
                n2 = d2.j(d, false);
                n3 = d2.j(d + 1, true);
            }
            else {
                float n4;
                float n5;
                if (n != 0 && rtlChar) {
                    n4 = d2.k(d, false);
                    n5 = d2.k(d + 1, true);
                }
                else {
                    if (!rtlChar) {
                        n2 = d2.k(d, false);
                        n3 = d2.k(d + 1, true);
                        break Label_0319;
                    }
                    n4 = d2.j(d, false);
                    n5 = d2.j(d + 1, true);
                }
                final float n6 = n4;
                n2 = n5;
                n3 = n6;
            }
        }
        final RectF rectF = new RectF(n2, i, n3, e2);
        return hrg.a(new k2j(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }
    
    public final k2j c(int n) {
        final vjf b = this.b;
        b.k(n);
        final int length = ((og0)b.a.v).w.length();
        final ArrayList h = b.h;
        int n2;
        if (n == length) {
            n2 = lq6.P((List)h);
        }
        else {
            n2 = omo.D(n, (List)h);
        }
        final hrg hrg = (hrg)h.get(n2);
        final a90 a = hrg.a;
        final int d = hrg.d(n);
        final CharSequence e = a.e;
        final mmn d2 = a.d;
        if (d < 0 || d > e.length()) {
            n = e.length();
            final StringBuilder sb = new StringBuilder("offset(");
            sb.append(d);
            sb.append(") is out of bounds [0,");
            sb.append(n);
            sb.append("]");
            hac.a(sb.toString());
        }
        final float j = d2.j(d, false);
        n = d2.g(d);
        return hrg.a(new k2j(j, d2.i(n) + 0.0f, j, d2.e(n) + 0.0f));
    }
    
    public final boolean d() {
        final vjf b = this.b;
        return b.c || (int)(this.c & 0xFFFFFFFFL) < b.e;
    }
    
    public final boolean e() {
        if ((int)(this.c >> 32) >= this.b.d) {
            if (!this.d()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof omn) {
                final omn omn = (omn)o;
                if (this.a.equals(omn.a)) {
                    if (this.b != omn.b) {
                        return false;
                    }
                    if (chc.b(this.c, omn.c)) {
                        if (this.d == omn.d && this.e == omn.e) {
                            if (this.f.equals(omn.f)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final float f(int d, final boolean b) {
        final vjf b2 = this.b;
        b2.k(d);
        final int length = ((og0)b2.a.v).w.length();
        final ArrayList h = b2.h;
        int n;
        if (d == length) {
            n = lq6.P((List)h);
        }
        else {
            n = omo.D(d, (List)h);
        }
        final hrg hrg = (hrg)h.get(n);
        final a90 a = hrg.a;
        d = hrg.d(d);
        final mmn d2 = a.d;
        if (b) {
            return d2.j(d, false);
        }
        return d2.k(d, false);
    }
    
    public final float g(int n) {
        final vjf b = this.b;
        b.l(n);
        final ArrayList h = b.h;
        final hrg hrg = (hrg)h.get(omo.E(n, (List)h));
        final a90 a = hrg.a;
        n -= hrg.d;
        final mmn d = a.d;
        final float lineLeft = d.f.getLineLeft(n);
        float j;
        if (n == d.g - 1) {
            j = d.j;
        }
        else {
            j = 0.0f;
        }
        return lineLeft + j;
    }
    
    public final float h(int n) {
        final vjf b = this.b;
        b.l(n);
        final ArrayList h = b.h;
        final hrg hrg = (hrg)h.get(omo.E(n, (List)h));
        final a90 a = hrg.a;
        n -= hrg.d;
        final mmn d = a.d;
        final float lineRight = d.f.getLineRight(n);
        float k;
        if (n == d.g - 1) {
            k = d.k;
        }
        else {
            k = 0.0f;
        }
        return lineRight + k;
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() + oz1.d(this.e, oz1.d(this.d, hia.d((this.b.hashCode() + this.a.hashCode() * 31) * 31, this.c, 31), 31), 31);
    }
    
    public final int i(final int n) {
        final vjf b = this.b;
        b.l(n);
        final ArrayList h = b.h;
        final hrg hrg = (hrg)h.get(omo.E(n, (List)h));
        return hrg.a.d.f.getLineStart(n - hrg.d) + hrg.b;
    }
    
    public final int j(int n) {
        final vjf b = this.b;
        b.k(n);
        final int length = ((og0)b.a.v).w.length();
        final ArrayList h = b.h;
        int n2;
        if (n == length) {
            n2 = lq6.P((List)h);
        }
        else {
            n2 = omo.D(n, (List)h);
        }
        final hrg hrg = (hrg)h.get(n2);
        final a90 a = hrg.a;
        n = hrg.d(n);
        final mmn d = a.d;
        n = d.g(n);
        if (d.f.getParagraphDirection(n) == 1) {
            return 1;
        }
        return 2;
    }
    
    public final g90 k(final int n, final int n2) {
        final vjf b = this.b;
        final og0 og0 = (og0)b.a.v;
        if (n < 0 || n > n2 || n2 > og0.w.length()) {
            final int length = og0.w.length();
            final StringBuilder o = hia.o(n, n2, "Start(", ") or End(", ") is out of range [0..");
            o.append(length);
            o.append("), or start > end!");
            hac.a(o.toString());
        }
        if (n == n2) {
            return j90.a();
        }
        final g90 a = j90.a();
        omo.G(b.h, rhc.c(n, n2), (lta)new jec((byte)3, n, n2, (Object)a));
        return a;
    }
    
    public final long l(int d) {
        final vjf b = this.b;
        b.k(d);
        final int length = ((og0)b.a.v).w.length();
        final ArrayList h = b.h;
        int n;
        if (d == length) {
            n = lq6.P((List)h);
        }
        else {
            n = omo.D(d, (List)h);
        }
        final hrg hrg = (hrg)h.get(n);
        final a90 a = hrg.a;
        d = hrg.d(d);
        final rm0 l = a.d.l();
        return hrg.b(rhc.c(hlq.i(l, d), hlq.h(l, d)), false);
    }
    
    public final boolean m(final int n) {
        final vjf b = this.b;
        b.l(n);
        final ArrayList h = b.h;
        final hrg hrg = (hrg)h.get(omo.E(n, (List)h));
        final a90 a = hrg.a;
        final int d = hrg.d;
        final Layout f = a.d.f;
        final ThreadLocal a2 = rmn.a;
        return f.getEllipsisCount(n - d) > 0;
    }
    
    @Override
    public final String toString() {
        final String c = chc.c(this.c);
        final StringBuilder sb = new StringBuilder("TextLayoutResult(layoutInput=");
        sb.append((Object)this.a);
        sb.append(", multiParagraph=");
        sb.append((Object)this.b);
        sb.append(", size=");
        sb.append(c);
        sb.append(", firstBaseline=");
        sb.append(this.d);
        sb.append(", lastBaseline=");
        sb.append(this.e);
        sb.append(", placeholderRects=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
