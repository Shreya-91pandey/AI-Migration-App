public final class otj
{
    public final long a;
    
    public otj() {
        final long h = j86.h;
        this.a = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof otj) {
                final long a = ((otj)o).a;
                final int i = j86.i;
                if (foo.a(this.a, a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int i = j86.i;
        return Long.hashCode(this.a) * 961;
    }
    
    @Override
    public final String toString() {
        return hia.k("RippleConfiguration(color=", j86.h(this.a), ", focus=null, rippleAlpha=null)");
    }
}
