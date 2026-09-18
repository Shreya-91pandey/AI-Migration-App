public final class hng implements dng
{
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    
    public hng(final float b, final float c, final float d, final float e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        boolean b2 = false;
        final boolean b3 = b >= 0.0f;
        final boolean b4 = c >= 0.0f;
        final boolean b5 = d >= 0.0f;
        if (e >= 0.0f) {
            b2 = true;
        }
        if (!(b3 & b4 & b5 & b2)) {
            eac.a("Padding must be non-negative");
        }
    }
    
    @Override
    public final float a() {
        return this.e;
    }
    
    @Override
    public final float b(final qzc qzc) {
        if (qzc == qzc.v) {
            return this.b;
        }
        return this.d;
    }
    
    @Override
    public final float c(final qzc qzc) {
        if (qzc == qzc.v) {
            return this.d;
        }
        return this.b;
    }
    
    @Override
    public final float d() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof hng) {
            final hng hng = (hng)o;
            if (qs8.e(this.b, hng.b) && qs8.e(this.c, hng.c) && qs8.e(this.d, hng.d) && qs8.e(this.e, hng.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.e) + oz1.d(this.d, oz1.d(this.c, Float.hashCode(this.b) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        return oz1.q(oz1.t("PaddingValues(start=", qs8.f(this.b), ", top=", qs8.f(this.c), ", end="), qs8.f(this.d), ", bottom=", qs8.f(this.e), ")");
    }
}
