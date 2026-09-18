public final class srm implements yl2
{
    public final jta b;
    public final boolean c;
    public final qzc d;
    public final boolean e;
    public final yl2 f;
    
    public srm(final jta b, final boolean c, final qzc d, final boolean e, final yl2 f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final float a(final float n, final float n2, final float n3) {
        final float n4 = (float)((Number)this.b.a()).intValue();
        final qzc d = this.d;
        final qzc w = qzc.w;
        final boolean b = false;
        final boolean b2 = d == w;
        boolean b3 = b;
        if (!this.e) {
            b3 = b;
            if (b2) {
                b3 = true;
            }
        }
        float n5 = n;
        if (this.c == b3) {
            n5 = n - n4;
        }
        return this.f.a(n5, n2, n3 - n4);
    }
}
