public final class tga implements by6
{
    public final long e(long n, long n2) {
        n = Float.floatToRawIntBits(1.0f);
        n2 = Float.floatToRawIntBits(1.0f);
        final int a = bak.a;
        return n << 32 | (n2 & 0xFFFFFFFFL);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof tga) {
                if (Float.compare(1.0f, 1.0f) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(1.0f);
    }
    
    @Override
    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
