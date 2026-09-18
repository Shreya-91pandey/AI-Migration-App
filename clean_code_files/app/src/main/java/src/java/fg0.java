public final class fg0 extends ig0
{
    public float a;
    public float b;
    
    public fg0(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final float a(final int n) {
        if (n == 0) {
            return this.a;
        }
        if (n != 1) {
            return 0.0f;
        }
        return this.b;
    }
    
    @Override
    public final int b() {
        return 2;
    }
    
    @Override
    public final ig0 c() {
        return new fg0(0.0f, 0.0f);
    }
    
    @Override
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }
    
    @Override
    public final void e(final int n, final float n2) {
        if (n == 0) {
            this.a = n2;
            return;
        }
        if (n != 1) {
            return;
        }
        this.b = n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof fg0) {
            final fg0 fg0 = (fg0)o;
            if (fg0.a == this.a && fg0.b == this.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final StringBuilder sb = new StringBuilder("AnimationVector2D: v1 = ");
        sb.append(a);
        sb.append(", v2 = ");
        sb.append(b);
        return sb.toString();
    }
}
