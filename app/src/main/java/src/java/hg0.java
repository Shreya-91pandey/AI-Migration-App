public final class hg0 extends ig0
{
    public float a;
    public float b;
    public float c;
    public float d;
    
    public hg0(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final float a(final int n) {
        if (n == 0) {
            return this.a;
        }
        if (n == 1) {
            return this.b;
        }
        if (n == 2) {
            return this.c;
        }
        if (n != 3) {
            return 0.0f;
        }
        return this.d;
    }
    
    @Override
    public final int b() {
        return 4;
    }
    
    @Override
    public final ig0 c() {
        return new hg0(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }
    
    @Override
    public final void e(final int n, final float n2) {
        if (n == 0) {
            this.a = n2;
            return;
        }
        if (n == 1) {
            this.b = n2;
            return;
        }
        if (n == 2) {
            this.c = n2;
            return;
        }
        if (n != 3) {
            return;
        }
        this.d = n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof hg0) {
            final hg0 hg0 = (hg0)o;
            if (hg0.a == this.a && hg0.b == this.b && hg0.c == this.c && hg0.d == this.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + oz1.d(this.c, oz1.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final float d = this.d;
        final StringBuilder r = hia.r("AnimationVector4D: v1 = ", a, ", v2 = ", b, ", v3 = ");
        r.append(c);
        r.append(", v4 = ");
        r.append(d);
        return r.toString();
    }
}
