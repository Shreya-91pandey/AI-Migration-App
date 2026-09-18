public final class mxb
{
    public final int a = a;
    
    public static String a(final int n) {
        if (n == 1) {
            return "Hyphens.None";
        }
        if (n == 2) {
            return "Hyphens.Auto";
        }
        if (n == 0) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof mxb) {
            if (this.a == ((mxb)o).a) {
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
        return a(this.a);
    }
}
