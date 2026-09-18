public final class ad8 implements xc8
{
    public final float v;
    public final float w;
    
    public ad8(final float v, final float w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ad8)) {
            return false;
        }
        final ad8 ad8 = (ad8)o;
        return Float.compare(this.v, ad8.v) == 0 && Float.compare(this.w, ad8.w) == 0;
    }
    
    public final float getDensity() {
        return this.v;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.w) + Float.hashCode(this.v) * 31;
    }
    
    public final float o0() {
        return this.w;
    }
    
    @Override
    public final String toString() {
        return ge9.s("DensityImpl(density=", this.v, ", fontScale=", this.w, ")");
    }
}
