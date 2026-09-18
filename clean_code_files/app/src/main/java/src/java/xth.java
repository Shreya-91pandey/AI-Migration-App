public final class xth
{
    public static final xth d;
    public final float a;
    public final u55 b;
    public final int c;
    
    static {
        d = new xth(0.0f, new u55(0.0f, 0.0f), 0);
    }
    
    public xth(final float a, final u55 b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!Float.isNaN(a)) {
            return;
        }
        en9.s("current must not be NaN");
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof xth) {
                final xth xth = (xth)o;
                if (this.a == xth.a) {
                    if (mlc.q((Object)this.b, (Object)xth.b)) {
                        if (this.c == xth.c) {
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
        return (this.b.hashCode() + Float.hashCode(this.a) * 31) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append((Object)this.b);
        sb.append(", steps=");
        return smk.q(this.c, ")", sb);
    }
}
