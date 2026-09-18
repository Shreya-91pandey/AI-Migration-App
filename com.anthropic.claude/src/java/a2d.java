public final class a2d extends ogf
{
    public final float v;
    public final boolean w;
    
    public a2d(final float v, final boolean w) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((b2d)hgf).J = this.v;
        ((b2d)hgf).K = this.w;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        a2d a2d;
        if (o instanceof a2d) {
            a2d = (a2d)o;
        }
        else {
            a2d = null;
        }
        return a2d != null && (this.v == a2d.v && this.w == a2d.w);
    }
    
    public final int hashCode() {
        return Boolean.hashCode(this.w) + Float.hashCode(this.v) * 31;
    }
    
    public final void update(final hgf hgf) {
        final b2d b2d = (b2d)hgf;
        b2d.J = this.v;
        b2d.K = this.w;
    }
}
