public final class yeo implements xeo
{
    public final Object a;
    public final Object b;
    
    public yeo(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object d() {
        return this.a;
    }
    
    @Override
    public final boolean equals(Object d) {
        if (d instanceof xeo) {
            final xeo xeo = (xeo)d;
            d = xeo.d();
            if (mlc.q(this.a, d) && mlc.q(this.b, xeo.h())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Object h() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Object a = this.a;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
}
