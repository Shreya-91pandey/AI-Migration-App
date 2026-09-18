public final class iuj
{
    public final byte a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof iuj) {
            if (this.a == ((iuj)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode((int)this.a);
    }
    
    @Override
    public final String toString() {
        final byte a = this.a;
        if (a == 0) {
            return "Button";
        }
        if (a == 1) {
            return "Checkbox";
        }
        if (a == 2) {
            return "Switch";
        }
        if (a == 3) {
            return "RadioButton";
        }
        if (a == 4) {
            return "Tab";
        }
        if (a == 5) {
            return "Image";
        }
        if (a == 6) {
            return "DropdownList";
        }
        if (a == 7) {
            return "Picker";
        }
        if (a == 8) {
            return "Carousel";
        }
        return "Unknown";
    }
}
