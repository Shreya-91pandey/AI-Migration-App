public final class z86 implements oln
{
    public final long a;
    
    public z86(final long a) {
        this.a = a;
        if (a == 16L) {
            hac.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
    
    @Override
    public final float a() {
        return j86.c(this.a);
    }
    
    @Override
    public final long b() {
        return this.a;
    }
    
    @Override
    public final qm2 c() {
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof z86) {
                final long a = ((z86)o).a;
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
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return hia.k("ColorStyle(value=", j86.h(this.a), ")");
    }
}
