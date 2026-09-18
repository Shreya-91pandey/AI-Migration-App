public final class l6g
{
    public final long a = a;
    
    public static long a(float intBitsToFloat, final int n, final long n2) {
        float intBitsToFloat2;
        if ((n & 0x1) != 0x0) {
            intBitsToFloat2 = Float.intBitsToFloat((int)(n2 >> 32));
        }
        else {
            intBitsToFloat2 = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            intBitsToFloat = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
        }
        return (long)Float.floatToRawIntBits(intBitsToFloat2) << 32 | ((long)Float.floatToRawIntBits(intBitsToFloat) & 0xFFFFFFFFL);
    }
    
    public static final long b(float n, long n2) {
        final float n3 = Float.intBitsToFloat((int)(n2 >> 32)) / n;
        n = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) / n;
        n2 = Float.floatToRawIntBits(n3);
        return ((long)Float.floatToRawIntBits(n) & 0xFFFFFFFFL) | n2 << 32;
    }
    
    public static final boolean c(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float d(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        return (float)Math.sqrt((double)(intBitsToFloat2 * intBitsToFloat2 + intBitsToFloat * intBitsToFloat));
    }
    
    public static final float e(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        return intBitsToFloat2 * intBitsToFloat2 + intBitsToFloat * intBitsToFloat;
    }
    
    public static final float f(final long n) {
        return Float.intBitsToFloat((int)(n >> 32));
    }
    
    public static final float g(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static final long h(final long n, final long n2) {
        return (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n >> 32)) - Float.intBitsToFloat((int)(n2 >> 32))) << 32 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) - Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL))) & 0xFFFFFFFFL);
    }
    
    public static final long i(long n, final long n2) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n2 >> 32));
        final float intBitsToFloat3 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        final float intBitsToFloat4 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
        n = Float.floatToRawIntBits(intBitsToFloat2 + intBitsToFloat);
        return ((long)Float.floatToRawIntBits(intBitsToFloat4 + intBitsToFloat3) & 0xFFFFFFFFL) | n << 32;
    }
    
    public static final long j(final float n, long n2) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n2 >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
        n2 = Float.floatToRawIntBits(intBitsToFloat * n);
        return ((long)Float.floatToRawIntBits(intBitsToFloat2 * n) & 0xFFFFFFFFL) | n2 << 32;
    }
    
    public static String k(final long n) {
        if ((0x7FFFFFFF7FFFFFFFL & n) != 0x7FC000007FC00000L) {
            return lmf.t("Offset(", n1r.l(Float.intBitsToFloat((int)(n >> 32))), ", ", n1r.l(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL))), ")");
        }
        return "Offset.Unspecified";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof l6g) {
            if (this.a == ((l6g)o).a) {
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
        return k(this.a);
    }
}
