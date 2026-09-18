public final class cd8 implements xc8
{
    public final float v;
    public final float w;
    public final poa x;
    
    public cd8(final float v, final float w, final poa x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final float I(final long n) {
        if (wnn.a(vnn.b(n), 4294967296L)) {
            return this.x.b(vnn.c(n));
        }
        en9.q("Only Sp can convert to Px");
        return 0.0f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof cd8) {
                final cd8 cd8 = (cd8)o;
                if (Float.compare(this.v, cd8.v) == 0) {
                    if (Float.compare(this.w, cd8.w) == 0) {
                        if (this.x.equals(cd8.x)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final float getDensity() {
        return this.v;
    }
    
    @Override
    public final int hashCode() {
        return this.x.hashCode() + oz1.d(this.w, Float.hashCode(this.v) * 31, 31);
    }
    
    public final float o0() {
        return this.w;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = hia.r("DensityWithConverter(density=", this.v, ", fontScale=", this.w, ", converter=");
        r.append((Object)this.x);
        r.append(")");
        return r.toString();
    }
    
    public final long x(final float n) {
        return tsf.Q(this.x.a(n), 4294967296L);
    }
}
