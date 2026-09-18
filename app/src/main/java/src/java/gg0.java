public final class gg0 extends ig0
{
    public float a;
    public float b;
    public float c;
    
    public gg0(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final float a(final int n) {
        if (n == 0) {
            return this.a;
        }
        if (n == 1) {
            return this.b;
        }
        if (n != 2) {
            return 0.0f;
        }
        return this.c;
    }
    
    @Override
    public final int b() {
        return 3;
    }
    
    @Override
    public final ig0 c() {
        return new gg0(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }
    
    @Override
    public final void e(final int n, final float c) {
        if (n == 0) {
            this.a = c;
            return;
        }
        if (n == 1) {
            this.b = c;
            return;
        }
        if (n != 2) {
            return;
        }
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof gg0) {
            final gg0 gg0 = (gg0)o;
            if (gg0.a == this.a && gg0.b == this.b && gg0.c == this.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.c) + oz1.d(this.b, Float.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final StringBuilder r = hia.r("AnimationVector3D: v1 = ", a, ", v2 = ", b, ", v3 = ");
        r.append(c);
        return r.toString();
    }
}
