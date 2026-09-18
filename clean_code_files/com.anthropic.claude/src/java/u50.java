public final class u50
{
    public final byte a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof u50) {
            if (this.a == ((u50)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode((int)this.a);
    }
    
    @Override
    public final String toString() {
        return oz1.n("AndroidContentDataType(androidAutofillType=", (int)this.a, ")");
    }
}
