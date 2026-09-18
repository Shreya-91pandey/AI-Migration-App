public final class leh extends ogf
{
    public final p90 v;
    
    public leh(final p90 v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new vmb(this.v, null);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof leh) {
            if (this.v.equals(((leh)o).v)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Boolean.hashCode(false) + this.v.hashCode() * 31;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb.append((Object)this.v);
        sb.append(", overrideDescendants=false)");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final meh meh = (meh)hgf;
        final p90 k = meh.K;
        final p90 v = this.v;
        if (!mlc.q((Object)k, (Object)v)) {
            meh.K = v;
            if (meh.L) {
                meh.q1();
            }
        }
    }
}
