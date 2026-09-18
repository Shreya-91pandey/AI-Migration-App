public abstract class rbc
{
    public static final long a;
    public static final int b = 0;
    
    static {
        a = a(Float.NaN, Float.NaN);
    }
    
    public static long a(final float n, final float n2) {
        return ((long)Float.floatToRawIntBits(n2) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n) << 32;
    }
    
    public static String b(final long n) {
        return ge9.s("InlineDensity(density=", Float.intBitsToFloat((int)(n >> 32)), ", fontScale=", Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)), ")");
    }
}
