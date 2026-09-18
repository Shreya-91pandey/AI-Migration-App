public final class mb2 implements gx
{
    public final float a;
    public final float b;
    
    public mb2(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final long a(long n, final long n2, final qzc qzc) {
        final float n3 = ((int)(n2 >> 32) - (int)(n >> 32)) / 2.0f;
        final float n4 = ((int)(n2 & 0xFFFFFFFFL) - (int)(n & 0xFFFFFFFFL)) / 2.0f;
        final qzc v = qzc.v;
        float a = this.a;
        if (qzc != v) {
            a *= -1.0f;
        }
        final float b = this.b;
        final int round = Math.round((a + 1.0f) * n3);
        final int round2 = Math.round((1.0f + b) * n4);
        n = round;
        return ((long)round2 & 0xFFFFFFFFL) | n << 32;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mb2)) {
            return false;
        }
        final mb2 mb2 = (mb2)o;
        return Float.compare(this.a, mb2.a) == 0 && Float.compare(this.b, mb2.b) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return ge9.s("BiasAlignment(horizontalBias=", this.a, ", verticalBias=", this.b, ")");
    }
}
