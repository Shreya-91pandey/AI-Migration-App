public final class hvc
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
            return "Characters";
        }
        if (n == 2) {
            return "Words";
        }
        if (n == 3) {
            return "Sentences";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof hvc) {
            if (this.a == ((hvc)o).a) {
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
