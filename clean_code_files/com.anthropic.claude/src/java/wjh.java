public final class wjh
{
    public static final wjh a;
    
    static {
        a = (wjh)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof wjh) {
                if (qs8.e(Float.NaN, Float.NaN)) {
                    if (Float.compare(Float.NaN, Float.NaN) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(Float.NaN) + Float.hashCode(Float.NaN) * 31;
    }
    
    @Override
    public final String toString() {
        return hia.k("PreferredSize(dp=", qs8.f(Float.NaN), ", proportion=NaN)");
    }
}
