public final class b0f
{
    public final int a = a;
    
    public static int a(final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        int n = 0;
        int n2;
        if (b2) {
            n2 = 2;
        }
        else {
            n2 = 0;
        }
        int n3;
        if (b3) {
            n3 = 4;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (b4) {
            n4 = 8;
        }
        else {
            n4 = 0;
        }
        if (b5) {
            n = 16;
        }
        return (b ? 1 : 0) | n2 | n3 | n4 | n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof b0f) {
            if (this.a == ((b0f)o).a) {
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
        return oz1.n("MenuItemsAvailability(value=", this.a, ")");
    }
}
