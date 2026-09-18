public final class va0
{
    public aql a;
    public long b;
    public qzc c;
    public float d;
    public qpl e;
    
    public va0(final aql a, final long b, final qzc c, final float d, final qpl e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof va0) {
                final va0 va0 = (va0)o;
                if (mlc.q((Object)this.a, (Object)va0.a)) {
                    if (yzl.b(this.b, va0.b)) {
                        if (this.c == va0.c) {
                            if (Float.compare(this.d, va0.d) == 0) {
                                if (mlc.q((Object)this.e, (Object)va0.e)) {
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
        final int d = oz1.d(this.d, (this.c.hashCode() + hia.d(this.a.hashCode() * 31, this.b, 31)) * 31, 31);
        final qpl e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return d + hashCode;
    }
    
    @Override
    public final String toString() {
        final aql a = this.a;
        final String f = yzl.f(this.b);
        final qzc c = this.c;
        final float d = this.d;
        final qpl e = this.e;
        final StringBuilder sb = new StringBuilder("ShadowKey(shape=");
        sb.append((Object)a);
        sb.append(", size=");
        sb.append(f);
        sb.append(", layoutDirection=");
        sb.append((Object)c);
        sb.append(", density=");
        sb.append(d);
        sb.append(", shadow=");
        sb.append((Object)e);
        sb.append(")");
        return sb.toString();
    }
}
