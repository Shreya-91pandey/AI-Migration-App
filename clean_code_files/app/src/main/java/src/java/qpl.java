public final class qpl
{
    public final float a;
    public final float b;
    public final long c;
    public final byte d;
    public final long e;
    public final float f;
    
    public qpl(final float a, final float b, final long c, final long e, final float n, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (byte)d;
        this.e = e;
        this.f = ncq.n(n, 0.0f, 1.0f);
    }
    
    public qpl(final float n, long b, final float n2, final long n3, final float n4, final int n5) {
        if (b == 16L) {
            b = j86.b;
        }
        this(n, n2, n3, b, n4, n5);
    }
    
    public qpl(final float n, final long n2, float n3, long n4, final int n5) {
        if ((n5 & 0x4) != 0x0) {
            n3 = 0.0f;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = 0L;
        }
        this(n, n2, n3, n4, 1.0f, 3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof qpl) {
                final qpl qpl = (qpl)o;
                if (qs8.e(this.a, qpl.a)) {
                    if (qs8.e(this.b, qpl.b)) {
                        if (this.c == qpl.c && this.f == qpl.f && this.d == qpl.d) {
                            final long e = qpl.e;
                            final int i = j86.i;
                            if (foo.a(this.e, e)) {
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
    
    @Override
    public final int hashCode() {
        final int y = hia.y((int)this.d, oz1.d(this.f, hia.d(oz1.d(this.b, Float.hashCode(this.a) * 31, 31), this.c, 31), 31), 31);
        final int i = j86.i;
        return hia.d(y, this.e, 31);
    }
    
    @Override
    public final String toString() {
        final String f = qs8.f(this.a);
        final String f2 = qs8.f(this.b);
        final String a = ts8.a(this.c);
        final String l = x90.L((int)this.d);
        final String h = j86.h(this.e);
        final StringBuilder t = oz1.t("Shadow(radius=", f, ", spread=", f2, ", offset=");
        t.append(a);
        t.append(", alpha=");
        t.append(this.f);
        t.append(", blendMode=");
        return oz1.q(t, l, ", color=", h, ", brush=null)");
    }
}
