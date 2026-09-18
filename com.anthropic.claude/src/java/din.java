public final class din
{
    public static final din f;
    public final boolean a;
    public final long b;
    public final float c;
    public final int d;
    public final boolean e;
    
    static {
        f = new din(false, 9205357640488583168L, 0.0f, 1, false);
    }
    
    public din(final boolean a, final long b, final float c, final int d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof din) {
                final din din = (din)o;
                if (this.a == din.a) {
                    if (l6g.c(this.b, din.b)) {
                        if (Float.compare(this.c, din.c) == 0) {
                            if (this.d == din.d) {
                                if (this.e == din.e) {
                                    return true;
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
        return Boolean.hashCode(this.e) + hia.b(this.d, oz1.d(this.c, hia.d(Boolean.hashCode(this.a) * 31, this.b, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final String k = l6g.k(this.b);
        final StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(k);
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(y1j.v(this.d));
        sb.append(", handlesCrossed=");
        return ge9.t(sb, this.e, ")");
    }
}
