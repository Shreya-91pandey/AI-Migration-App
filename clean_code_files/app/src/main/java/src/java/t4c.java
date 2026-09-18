public final class t4c
{
    public final int a = a;
    
    public static String a(final int n) {
        if (n == -1) {
            return "Unspecified";
        }
        if (n == 0) {
            return "None";
        }
        if (n == 1) {
            return "Default";
        }
        if (n == 2) {
            return "Go";
        }
        if (n == 3) {
            return "Search";
        }
        if (n == 4) {
            return "Send";
        }
        if (n == 5) {
            return "Previous";
        }
        if (n == 6) {
            return "Next";
        }
        if (n == 7) {
            return "Done";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof t4c) {
            if (this.a == ((t4c)o).a) {
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
