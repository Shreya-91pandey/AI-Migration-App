public final class mrg implements kg0
{
    public final int a;
    public final int b;
    public final long c;
    public final vln d;
    public final fbh e;
    public final idd f;
    public final int g;
    public final int h;
    public final ymn i;
    
    public mrg(int a, final int b, final long c, final vln d, final fbh e, final idd f, final int g, final int h, final ymn i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        final wnn[] b2 = vnn.b;
        if (!vnn.a(c, vnn.c)) {
            if (vnn.c(c) >= 0.0f) {
                a = 1;
            }
            else {
                a = 0;
            }
            if (a == 0) {
                final float c2 = vnn.c(c);
                final StringBuilder sb = new StringBuilder("lineHeight can't be negative (");
                sb.append(c2);
                sb.append(")");
                hac.c(sb.toString());
            }
        }
    }
    
    public mrg(int n, vln vln, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        final long c = vnn.c;
        if ((n2 & 0x8) != 0x0) {
            vln = null;
        }
        this(n, 0, c, vln, null, null, 0, 0, null);
    }
    
    public final mrg a(final mrg mrg) {
        if (mrg == null) {
            return this;
        }
        return nrg.a(this, mrg.a, mrg.b, mrg.c, mrg.d, mrg.e, mrg.f, mrg.g, mrg.h, mrg.i);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof mrg) {
                final mrg mrg = (mrg)o;
                if (this.a == mrg.a && this.b == mrg.b) {
                    if (vnn.a(this.c, mrg.c)) {
                        if (mlc.q((Object)this.d, (Object)mrg.d)) {
                            if (mlc.q((Object)this.e, (Object)mrg.e)) {
                                if (mlc.q((Object)this.f, (Object)mrg.f)) {
                                    if (this.g == mrg.g && this.h == mrg.h) {
                                        if (mlc.q((Object)this.i, (Object)mrg.i)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int y = hia.y(this.b, Integer.hashCode(this.a) * 31, 31);
        final wnn[] b = vnn.b;
        final int d = hia.d(y, this.c, 31);
        final int n = 0;
        final vln d2 = this.d;
        int hashCode;
        if (d2 != null) {
            hashCode = d2.hashCode();
        }
        else {
            hashCode = 0;
        }
        final fbh e = this.e;
        int hashCode2;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final idd f = this.f;
        int hashCode3;
        if (f != null) {
            hashCode3 = f.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int y2 = hia.y(this.h, hia.y(this.g, (((d + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31, 31), 31);
        final ymn i = this.i;
        int hashCode4 = n;
        if (i != null) {
            hashCode4 = i.hashCode();
        }
        return y2 + hashCode4;
    }
    
    @Override
    public final String toString() {
        final String a = kfn.a(this.a);
        final String a2 = ahn.a(this.b);
        final String f = vnn.f(this.c);
        final String a3 = icd.a(this.g);
        final String a4 = mxb.a(this.h);
        final StringBuilder t = oz1.t("ParagraphStyle(textAlign=", a, ", textDirection=", a2, ", lineHeight=");
        t.append(f);
        t.append(", textIndent=");
        t.append((Object)this.d);
        t.append(", platformStyle=");
        t.append((Object)this.e);
        t.append(", lineHeightStyle=");
        t.append((Object)this.f);
        t.append(", lineBreak=");
        oz1.A(t, a3, ", hyphens=", a4, ", textMotion=");
        t.append((Object)this.i);
        t.append(")");
        return t.toString();
    }
}
