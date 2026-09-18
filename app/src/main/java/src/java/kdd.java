public final class kdd implements poa
{
    public final float a;
    
    public kdd(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final float n) {
        return n / this.a;
    }
    
    @Override
    public final float b(final float n) {
        return n * this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kdd && Float.compare(this.a, ((kdd)o).a) == 0);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return tj0.j("LinearFontScaleConverter(fontScale=", this.a, ")");
    }
}
