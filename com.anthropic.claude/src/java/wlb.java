public final class wlb
{
    public final zta a;
    public final byte b;
    
    public wlb(final zta a, final byte b) {
        this.b = b;
        this.a = a;
    }
    
    public final float a(final float n, final nzc nzc, final nzc nzc2) {
        switch (this.b) {
            default: {
                return Float.intBitsToFloat((int)(nzc2.H(nzc, ((long)Float.floatToRawIntBits((int)(nzc.k() & 0xFFFFFFFFL) / 2.0f) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n) << 32) >> 32));
            }
            case 0: {
                return Float.intBitsToFloat((int)(nzc2.H(nzc, ((long)Float.floatToRawIntBits(n) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits((int)(nzc.k() >> 32) / 2.0f) << 32) & 0xFFFFFFFFL));
            }
        }
    }
}
