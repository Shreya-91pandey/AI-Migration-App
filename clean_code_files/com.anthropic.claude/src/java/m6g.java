final class m6g extends ogf
{
    public final float v;
    public final float w;
    
    public m6g(final float v, final float w) {
        this.v = v;
        this.w = w;
    }
    
    public final hgf create() {
        final hgf hgf = new hgf();
        ((p6g)hgf).J = this.v;
        ((p6g)hgf).K = this.w;
        ((p6g)hgf).L = true;
        return hgf;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        m6g m6g;
        if (o instanceof m6g) {
            m6g = (m6g)o;
        }
        else {
            m6g = null;
        }
        if (m6g != null) {
            if (qs8.e(this.v, m6g.v) && qs8.e(this.w, m6g.w)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(true) + oz1.d(this.w, Float.hashCode(this.v) * 31, 31);
    }
    
    public final String toString() {
        return lmf.t("OffsetModifierElement(x=", qs8.f(this.v), ", y=", qs8.f(this.w), ", rtlAware=true)");
    }
    
    public final void update(final hgf hgf) {
        final p6g p6g = (p6g)hgf;
        final float j = p6g.J;
        final float v = this.v;
        final boolean e = qs8.e(j, v);
        final float w = this.w;
        if (!e || !qs8.e(p6g.K, w) || !p6g.L) {
            soh.L((t98)p6g).s0(false);
        }
        p6g.J = v;
        p6g.K = w;
        p6g.L = true;
    }
}
