public final class yzl
{
    public final long a = a;
    
    public static long a(final long n, float intBitsToFloat, float intBitsToFloat2, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        }
        if ((n2 & 0x2) != 0x0) {
            intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        return (long)Float.floatToRawIntBits(intBitsToFloat) << 32 | ((long)Float.floatToRawIntBits(intBitsToFloat2) & 0xFFFFFFFFL);
    }
    
    public static final boolean b(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float c(final long n) {
        return Math.min(Float.intBitsToFloat((int)(n >> 32 & 0x7FFFFFFFL)), Float.intBitsToFloat((int)(n & 0x7FFFFFFFL)));
    }
    
    public static final boolean d(final long n) {
        boolean b = false;
        final boolean b2 = n == 9205357640488583168L;
        final boolean b3 = Float.intBitsToFloat((int)(n >> 32)) <= 0.0f;
        if (Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) <= 0.0f) {
            b = true;
        }
        return b2 | b3 | b;
    }
    
    public static final long e(final float n, long n2) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n2 >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
        n2 = Float.floatToRawIntBits(intBitsToFloat * n);
        return ((long)Float.floatToRawIntBits(intBitsToFloat2 * n) & 0xFFFFFFFFL) | n2 << 32;
    }
    
    public static String f(final long n) {
        if (n != 9205357640488583168L) {
            return lmf.t("Size(", n1r.l(Float.intBitsToFloat((int)(n >> 32))), ", ", n1r.l(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL))), ")");
        }
        return "Size.Unspecified";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof yzl) {
            if (this.a == ((yzl)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return f(this.a);
    }
}
