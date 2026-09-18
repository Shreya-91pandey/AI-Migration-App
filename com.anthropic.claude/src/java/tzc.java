final class tzc extends ogf
{
    public final Object v;
    
    public tzc(final Object v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((uzc)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof tzc) {
                if (this.v.equals(((tzc)o).v)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final String toString() {
        return lmf.r(this.v, "LayoutIdElement(layoutId=", ")");
    }
    
    public final void update(final hgf hgf) {
        ((uzc)hgf).J = this.v;
    }
}
