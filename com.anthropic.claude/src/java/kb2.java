public final class kb2 implements dx
{
    public final float a;
    
    public kb2(final float a) {
        this.a = a;
    }
    
    @Override
    public final int a(final int n, final int n2, final qzc qzc) {
        final float n3 = (n2 - n) / 2.0f;
        final qzc v = qzc.v;
        float a = this.a;
        if (qzc != v) {
            a *= -1.0f;
        }
        return Math.round((1.0f + a) * n3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kb2 && Float.compare(this.a, ((kb2)o).a) == 0);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return tj0.j("Horizontal(bias=", this.a, ")");
    }
}
