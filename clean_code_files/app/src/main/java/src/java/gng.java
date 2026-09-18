final class gng extends ogf
{
    public final dng v;
    
    public gng(final dng v) {
        this.v = v;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((jng)hgf).J = this.v;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        gng gng;
        if (o instanceof gng) {
            gng = (gng)o;
        }
        else {
            gng = null;
        }
        return gng != null && mlc.q((Object)this.v, (Object)gng.v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((jng)hgf).J = this.v;
    }
}
