public final class b0m extends qxc implements lta
{
    public final o8h A;
    public final long w;
    public final int x;
    public final int y;
    public final ooe z;
    
    public b0m(final c0m c0m, final long w, final int x, final int y, final ooe z, final o8h a) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        super(1);
    }
    
    @Override
    public final Object b(final Object o) {
        final n8h n8h = (n8h)o;
        final long n = (long)this.x << 32 | ((long)this.y & 0xFFFFFFFFL);
        final qzc layoutDirection = ((flc)this.z).getLayoutDirection();
        final int n2 = (int)(n >> 32);
        final long w = this.w;
        final float n3 = (n2 - (int)(w >> 32)) / 2.0f;
        final float n4 = ((int)(n & 0xFFFFFFFFL) - (int)(w & 0xFFFFFFFFL)) / 2.0f;
        float n5;
        if (layoutDirection == qzc.v) {
            n5 = -1.0f;
        }
        else {
            n5 = -1.0f * -1.0f;
        }
        n8h.h(n8h, this.A, ((long)Math.round((1.0f - 1.0f) * n4) & 0xFFFFFFFFL) | (long)Math.round((n5 + 1.0f) * n3) << 32);
        return lqo.a;
    }
}
