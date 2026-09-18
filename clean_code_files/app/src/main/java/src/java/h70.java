public final class h70 implements hbh
{
    public final int v;
    
    public h70(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h70 && this.v == ((h70)o).v);
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.v);
    }
    
    @Override
    public final String toString() {
        return oz1.n("AndroidFontResolveInterceptor(fontWeightAdjustment=", this.v, ")");
    }
}
