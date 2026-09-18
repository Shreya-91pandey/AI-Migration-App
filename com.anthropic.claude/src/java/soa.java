public final class soa
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof soa) {
            if (this.a == ((soa)o).a) {
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
        final int a = this.a;
        if (a == 0) {
            return "Normal";
        }
        if (a == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}
