public final class ha6 implements igf
{
    public final igf v;
    public final igf w;
    
    public ha6(final igf v, final igf w) {
        this.v = v;
        this.w = w;
    }
    
    public final Object a(final zta zta, Object a) {
        a = this.v.a(zta, a);
        return this.w.a(zta, a);
    }
    
    public final boolean e(final lta lta) {
        return this.v.e(lta) && this.w.e(lta);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ha6) {
            final ha6 ha6 = (ha6)o;
            if (this.v.equals(ha6.v) && mlc.q((Object)this.w, (Object)ha6.w)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.w.hashCode() * 31 + this.v.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = (StringBuilder)this.a((zta)new w56((byte)6), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
