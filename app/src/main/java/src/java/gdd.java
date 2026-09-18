public final class gdd
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof gdd) {
            if (this.a == ((gdd)o).a) {
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
            return "LineHeightStyle.Mode.Fixed";
        }
        if (a == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        if (a == 2) {
            return "LineHeightStyle.Mode.Tight";
        }
        return "Invalid";
    }
}
