public final class jym
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof jym) {
            if (this.a == ((jym)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return oz1.n("Strings(value=", this.a, ")");
    }
}
