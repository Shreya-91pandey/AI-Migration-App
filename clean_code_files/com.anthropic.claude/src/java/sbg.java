public final class sbg
{
    public final String a;
    
    public sbg(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof sbg) {
                if (this.a.equals(((sbg)o).a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("OpaqueKey(key=", this.a, ")");
    }
}
