public final class jvp
{
    public final float a;
    public final float b;
    
    public jvp(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final float[] a() {
        final float a = this.a;
        final float b = this.b;
        return new float[] { a / b, 1.0f, (1.0f - a - b) / b };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jvp)) {
            return false;
        }
        final jvp jvp = (jvp)o;
        return Float.compare(this.a, jvp.a) == 0 && Float.compare(this.b, jvp.b) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return ge9.s("WhitePoint(x=", this.a, ", y=", this.b, ")");
    }
}
