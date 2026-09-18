public interface mia extends cg0
{
    default o6p a(final dlo dlo) {
        return new c2l(this);
    }
    
    float b(final long p0, final float p1, final float p2, final float p3);
    
    long c(final float p0, final float p1, final float p2);
    
    default float d(final float n, final float n2, final float n3) {
        return this.b(this.c(n, n2, n3), n, n2, n3);
    }
    
    float e(final long p0, final float p1, final float p2, final float p3);
}
