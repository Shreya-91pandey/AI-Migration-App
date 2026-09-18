public final class eg0 extends ig0
{
    public float a;
    
    public eg0(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final int n) {
        if (n == 0) {
            return this.a;
        }
        return 0.0f;
    }
    
    @Override
    public final void d() {
        this.a = 0.0f;
    }
    
    @Override
    public final void e(final int n, final float a) {
        if (n == 0) {
            this.a = a;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof eg0 && ((eg0)o).a == this.a;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final StringBuilder sb = new StringBuilder("AnimationVector1D: value = ");
        sb.append(a);
        return sb.toString();
    }
}
