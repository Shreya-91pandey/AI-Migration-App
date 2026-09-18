public final class toa
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof toa) {
            if (this.a == ((toa)o).a) {
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
            return "None";
        }
        if (a == 1) {
            return "Weight";
        }
        if (a == 2) {
            return "Style";
        }
        if (a == 65535) {
            return "All";
        }
        return "Invalid";
    }
}
