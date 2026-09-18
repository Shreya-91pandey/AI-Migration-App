public final class kfn
{
    public final int a = a;
    
    public static String a(final int n) {
        if (n == 1) {
            return "Left";
        }
        if (n == 2) {
            return "Right";
        }
        if (n == 3) {
            return "Center";
        }
        if (n == 4) {
            return "Justify";
        }
        if (n == 5) {
            return "Start";
        }
        if (n == 6) {
            return "End";
        }
        if (n == 0) {
            return "Unspecified";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kfn) {
            if (this.a == ((kfn)o).a) {
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
