public final class ejh
{
    public final String a;
    public final Long b;
    
    public ejh(final String a, final Long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof ejh) {
                final ejh ejh = (ejh)o;
                if (this.a.equals(ejh.a)) {
                    if (this.b.equals(ejh.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Preference(key=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append((Object)this.b);
        sb.append(')');
        return sb.toString();
    }
}
