public final class vin extends riq
{
    public final kb2 d;
    public final kb2 e;
    
    public vin(final int n) {
        final kb2 j = wab.J;
        this.d = j;
        this.e = j;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof vin) {
                final vin vin = (vin)o;
                if (mlc.q((Object)this.d, (Object)vin.d)) {
                    if (mlc.q((Object)this.e, (Object)vin.e)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return Float.hashCode(this.e.a) + oz1.d(this.d.a, Boolean.hashCode(false) * 31, 31);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Cutout(isAlwaysMinimized=false, minimizedAlignment=");
        sb.append((Object)this.d);
        sb.append(", expandedAlignment=");
        sb.append((Object)this.e);
        sb.append(")");
        return sb.toString();
    }
}
