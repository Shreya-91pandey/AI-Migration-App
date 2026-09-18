public final class adc
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof adc) {
            if (this.a == ((adc)o).a) {
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
        if (a == 1) {
            return "Touch";
        }
        if (a == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}
