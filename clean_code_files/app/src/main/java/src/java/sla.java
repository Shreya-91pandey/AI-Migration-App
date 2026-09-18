public final class sla
{
    public final int a = a;
    
    public static String a(final int n) {
        if (n == 1) {
            return "Next";
        }
        if (n == 2) {
            return "Previous";
        }
        if (n == 3) {
            return "Left";
        }
        if (n == 4) {
            return "Right";
        }
        if (n == 5) {
            return "Up";
        }
        if (n == 6) {
            return "Down";
        }
        if (n == 7) {
            return "Enter";
        }
        if (n == 8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof sla) {
            if (this.a == ((sla)o).a) {
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
