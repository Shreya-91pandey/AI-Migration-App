public final class zmn
{
    public static String a(final int n) {
        if (n == 1) {
            return "Clip";
        }
        if (n == 2) {
            return "Ellipsis";
        }
        if (n == 5) {
            return "MiddleEllipsis";
        }
        if (n == 3) {
            return "Visible";
        }
        if (n == 4) {
            return "StartEllipsis";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof zmn;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(2);
    }
    
    @Override
    public final String toString() {
        return "Ellipsis";
    }
}
