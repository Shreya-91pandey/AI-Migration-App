public final class ahn
{
    public final int a = a;
    
    public static String a(final int n) {
        if (n == 1) {
            return "Ltr";
        }
        if (n == 2) {
            return "Rtl";
        }
        if (n == 3) {
            return "Content";
        }
        if (n == 4) {
            return "ContentOrLtr";
        }
        if (n == 5) {
            return "ContentOrRtl";
        }
        if (n == 0) {
            return "Unspecified";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ahn) {
            if (this.a == ((ahn)o).a) {
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
