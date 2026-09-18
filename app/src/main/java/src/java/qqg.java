public final class qqg
{
    public final wjh a;
    public final wjh b;
    public final p3 c;
    public boolean d;
    public float e;
    
    public qqg() {
        final wjh a = wjh.a;
        this.a = a;
        this.b = a;
        this.c = hqg.a;
        this.d = false;
        this.e = Float.NaN;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof qqg) {
                final qqg qqg = (qqg)o;
                if (mlc.q((Object)this.a, (Object)qqg.a)) {
                    if (mlc.q((Object)this.b, (Object)qqg.b)) {
                        if (mlc.q((Object)this.c, (Object)qqg.c)) {
                            if (this.d == qqg.d) {
                                if (qs8.e(this.e, qqg.e)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.e) + smk.l((this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31, 31, this.d);
    }
    
    @Override
    public final String toString() {
        final boolean d = this.d;
        final String f = qs8.f(this.e);
        final StringBuilder sb = new StringBuilder("PaneScaffoldParentDataImpl(preferredWidthInternal=");
        sb.append((Object)this.a);
        sb.append(", preferredHeightInternal=");
        sb.append((Object)this.b);
        sb.append(", paneMargins=");
        sb.append((Object)this.c);
        sb.append(", isAnimatedPane=");
        sb.append(d);
        sb.append(", minTouchTargetSize=");
        return oz1.p(sb, f, ")");
    }
}
