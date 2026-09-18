public final class lvj
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    
    static {
        t08.p(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }
    
    public lvj(final float a, final float b, final float c, final float d, final long e, final long f, final long g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final float a() {
        return this.d - this.b;
    }
    
    public final float b() {
        return this.c - this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof lvj) {
                final lvj lvj = (lvj)o;
                if (Float.compare(this.a, lvj.a) == 0) {
                    if (Float.compare(this.b, lvj.b) == 0) {
                        if (Float.compare(this.c, lvj.c) == 0) {
                            if (Float.compare(this.d, lvj.d) == 0) {
                                if (t2r.g(this.e, lvj.e)) {
                                    if (t2r.g(this.f, lvj.f)) {
                                        if (t2r.g(this.g, lvj.g)) {
                                            if (t2r.g(this.h, lvj.h)) {
                                                return true;
                                            }
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
        return Long.hashCode(this.h) + hia.d(hia.d(hia.d(oz1.d(this.d, oz1.d(this.c, oz1.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), this.f, 31), this.g, 31);
    }
    
    @Override
    public final String toString() {
        final String l = n1r.l(this.a);
        final String i = n1r.l(this.b);
        final String j = n1r.l(this.c);
        final String k = n1r.l(this.d);
        final StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        final String p = oz1.p(sb, ", ", k);
        final long e = this.e;
        final long f = this.f;
        final boolean g = t2r.g(e, f);
        final long g2 = this.g;
        final long h = this.h;
        if (!g || !t2r.g(f, g2) || !t2r.g(g2, h)) {
            final String m = t2r.k(e);
            final String k2 = t2r.k(f);
            final String k3 = t2r.k(g2);
            final String k4 = t2r.k(h);
            final StringBuilder t = oz1.t("RoundRect(rect=", p, ", topLeft=", m, ", topRight=");
            oz1.A(t, k2, ", bottomRight=", k3, ", bottomLeft=");
            return oz1.p(t, k4, ")");
        }
        final int n = (int)(e >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n);
        final int n2 = (int)(e & 0xFFFFFFFFL);
        if (intBitsToFloat == Float.intBitsToFloat(n2)) {
            return lmf.t("RoundRect(rect=", p, ", radius=", n1r.l(Float.intBitsToFloat(n)), ")");
        }
        return oz1.p(oz1.t("RoundRect(rect=", p, ", x=", n1r.l(Float.intBitsToFloat(n)), ", y="), n1r.l(Float.intBitsToFloat(n2)), ")");
    }
}
