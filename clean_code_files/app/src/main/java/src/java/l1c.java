public final class l1c
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof l1c) {
            if (this.a == ((l1c)o).a) {
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
            return "Argb8888";
        }
        if (a == 1) {
            return "Alpha8";
        }
        if (a == 2) {
            return "Rgb565";
        }
        if (a == 3) {
            return "F16";
        }
        if (a == 4) {
            return "Gpu";
        }
        return "Unknown";
    }
}
