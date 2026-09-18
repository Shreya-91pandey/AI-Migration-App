public abstract class srl
{
    public static final tei a;
    
    static {
        a = new tei((jta)rn6.K);
    }
    
    public static final long a(final nzc nzc, final nzc nzc2, final long n) {
        final k2j l = nzc2.L(nzc, false);
        final float a = l.a;
        final float c = l.c;
        final int c2 = jeo.c;
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float b = l.b;
        return (long)Float.floatToRawIntBits(intBitsToFloat * (c - a) + a) << 32 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) * (l.d - b) + b) & 0xFFFFFFFFL);
    }
    
    public static final long b(final float n, final long n2, final long n3) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n2 >> 32));
        final int n4 = (int)(n3 >> 32);
        final float intBitsToFloat2 = Float.intBitsToFloat(n4);
        final float intBitsToFloat3 = Float.intBitsToFloat(n4);
        final float intBitsToFloat4 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
        final int n5 = (int)(n3 & 0xFFFFFFFFL);
        return (long)Float.floatToRawIntBits(intBitsToFloat3 + (intBitsToFloat - intBitsToFloat2) * n + 0.0f) << 32 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(n5) + (intBitsToFloat4 - Float.intBitsToFloat(n5)) * n + 0.0f) & 0xFFFFFFFFL);
    }
}
