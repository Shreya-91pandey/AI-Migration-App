public final class ai2 extends ogf
{
    public final float v;
    public final cam w;
    public final aql x;
    
    public ai2(final float v, final cam w, final aql x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    @Override
    public final hgf create() {
        return new zh2(this.v, this.w, this.x);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof ai2) {
                final ai2 ai2 = (ai2)o;
                if (qs8.e(this.v, ai2.v)) {
                    if (this.w.equals((Object)ai2.w)) {
                        if (mlc.q(this.x, ai2.x)) {
                            return true;
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
        return this.x.hashCode() + (this.w.hashCode() + Float.hashCode(this.v) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final String f = qs8.f(this.v);
        final StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        sb.append(f);
        sb.append(", brush=");
        sb.append((Object)this.w);
        sb.append(", shape=");
        sb.append((Object)this.x);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final void update(final hgf hgf) {
        final zh2 zh2 = (zh2)hgf;
        final float m = zh2.M;
        final lv2 p = zh2.P;
        final float v = this.v;
        if (!qs8.e(m, v)) {
            zh2.M = v;
            p.o1();
        }
        final cam n = zh2.N;
        final cam w = this.w;
        if (!mlc.q(n, w)) {
            zh2.N = w;
            p.o1();
        }
        final aql o = zh2.O;
        final aql x = this.x;
        if (!mlc.q(o, x)) {
            zh2.O = x;
            p.o1();
            soh.L(zh2).T();
        }
    }
}
