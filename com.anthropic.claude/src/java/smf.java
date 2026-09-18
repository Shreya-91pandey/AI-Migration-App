public final class smf
{
    public float a;
    public float b;
    public float c;
    public float d;
    
    public smf(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final float n, final float n2, final float n3, final float n4) {
        this.a = Math.max(n, this.a);
        this.b = Math.max(n2, this.b);
        this.c = Math.min(n3, this.c);
        this.d = Math.min(n4, this.d);
    }
    
    public final boolean b() {
        final float a = this.a;
        final float c = this.c;
        boolean b = false;
        final boolean b2 = a >= c;
        if (this.b >= this.d) {
            b = true;
        }
        return b2 | b;
    }
    
    public final void c(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        this.a += intBitsToFloat;
        this.b += intBitsToFloat2;
        this.c += intBitsToFloat;
        this.d += intBitsToFloat2;
    }
    
    @Override
    public final String toString() {
        return oz1.q(oz1.t("MutableRect(", n1r.l(this.a), ", ", n1r.l(this.b), ", "), n1r.l(this.c), ", ", n1r.l(this.d), ")");
    }
}
