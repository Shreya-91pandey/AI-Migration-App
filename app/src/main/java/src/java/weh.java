public final class weh
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof weh) {
            if (this.a == ((weh)o).a) {
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
        return oz1.n("PointerKeyboardModifiers(packedValue=", this.a, ")");
    }
}
