public final class yjj implements dkj
{
    public final String a;
    
    public yjj(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof yjj) {
                if (this.a.equals(((yjj)o).a)) {
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
        return hia.k("AbortedBecause(errorCode=", this.a, ")");
    }
}
