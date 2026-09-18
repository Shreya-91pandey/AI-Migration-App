public final class ip2
{
    public final float a;
    public final float b;
    
    public ip2(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (o instanceof ip2) {
                    final ip2 ip2 = (ip2)o;
                    if (qs8.e(this.a, ip2.a)) {
                        if (qs8.e(this.b, ip2.b)) {
                            if (qs8.e(0.0f, 0.0f)) {
                                if (qs8.e(1.0f, 1.0f)) {
                                    if (qs8.e(0.0f, 0.0f)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(0.0f) + oz1.d(1.0f, oz1.d(0.0f, oz1.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
