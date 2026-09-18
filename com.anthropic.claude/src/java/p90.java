public final class p90 implements neh
{
    public final short b;
    
    public p90(final int b) {
        this.b = (short)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            Class<?> class1;
            if (o != null) {
                class1 = o.getClass();
            }
            else {
                class1 = null;
            }
            if (p90.class.equals(class1)) {
                o.getClass();
                if (this.b == ((p90)o).b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        return oz1.n("AndroidPointerIcon(type=", (int)this.b, ")");
    }
}
