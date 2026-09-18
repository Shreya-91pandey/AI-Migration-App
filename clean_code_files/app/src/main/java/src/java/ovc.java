public final class ovc
{
    public final Float a;
    public u09 b;
    
    public ovc(final Float a, final u09 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ovc) {
            final ovc ovc = (ovc)o;
            if (ovc.a.equals(this.a) && mlc.q(ovc.b, this.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + hia.y(0, this.a.hashCode() * 31, 31);
    }
}
