public final class e8c
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof e8c) {
            if (this.a == ((e8c)o).a) {
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
        return oz1.n("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.a, ")");
    }
}
