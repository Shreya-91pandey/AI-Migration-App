public final class tln
{
    public static final tln c;
    public final float a;
    public final float b;
    
    static {
        c = new tln(1.0f, 0.0f);
    }
    
    public tln(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tln)) {
            return false;
        }
        final tln tln = (tln)o;
        return this.a == tln.a && this.b == tln.b;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return ge9.s("TextGeometricTransform(scaleX=", this.a, ", skewX=", this.b, ")");
    }
}
