final class n9m extends ogf
{
    public final lta v;
    
    public n9m(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((mic)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof n9m) {
            if (this.v == ((n9m)o).v) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final lta v = this.v;
        int hashCode;
        if (v != null) {
            hashCode = v.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31;
    }
    
    public final void update(final hgf hgf) {
        ((mic)hgf).J = this.v;
    }
}
