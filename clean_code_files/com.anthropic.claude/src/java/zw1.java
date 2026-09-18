public final class zw1
{
    public final float a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof zw1) {
            if (Float.compare(this.a, ((zw1)o).a) == 0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return tj0.j("BaselineShift(multiplier=", this.a, ")");
    }
}
