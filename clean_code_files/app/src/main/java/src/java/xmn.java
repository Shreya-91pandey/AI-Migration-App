public final class xmn
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof xmn) {
            if (this.a == ((xmn)o).a) {
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
        if (a == 1) {
            return "Linearity.Linear";
        }
        if (a == 2) {
            return "Linearity.FontHinting";
        }
        if (a == 3) {
            return "Linearity.None";
        }
        return "Invalid";
    }
}
