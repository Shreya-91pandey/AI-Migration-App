final class z6d extends ogf
{
    public final w70 v;
    public final j7d w;
    public final dkn x;
    
    public z6d(final w70 v, final j7d w, final dkn x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final hgf create() {
        return new a7d(this.v, this.w, this.x);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof z6d) {
            final z6d z6d = (z6d)o;
            if (mlc.q((Object)this.v, (Object)z6d.v)) {
                return this.w == z6d.w && this.x == z6d.x;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.x.hashCode() + (this.w.hashCode() + this.v.hashCode() * 31) * 31;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LegacyAdaptingPlatformTextInputModifier(serviceAdapter=");
        sb.append((Object)this.v);
        sb.append(", legacyTextFieldState=");
        sb.append((Object)this.w);
        sb.append(", textFieldSelectionManager=");
        sb.append((Object)this.x);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final a7d a = (a7d)hgf;
        if (a.I) {
            a.J.c();
            a.J.k(a);
        }
        final w70 v = this.v;
        a.J = v;
        if (a.I) {
            if (v.a != null) {
                jac.c("Expected textInputModifierNode to be null");
            }
            v.a = a;
        }
        a.K = this.w;
        a.L = this.x;
    }
}
