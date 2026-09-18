public final class hdd
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof hdd) {
            if (this.a == ((hdd)o).a) {
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
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (a == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (a == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        if (a == 0) {
            return "LineHeightStyle.Trim.None";
        }
        return "Invalid";
    }
}
