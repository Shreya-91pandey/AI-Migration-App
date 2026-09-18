public final class rpl
{
    public static final rpl d;
    public final long a;
    public final long b;
    public final float c;
    
    static {
        d = new rpl(0.0f, t08.e(4278190080L), 0L);
    }
    
    public rpl(final float c, final long a, final long b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof rpl) {
                final rpl rpl = (rpl)o;
                final long a = rpl.a;
                final int i = j86.i;
                if (foo.a(this.a, a)) {
                    if (l6g.c(this.b, rpl.b)) {
                        if (this.c == rpl.c) {
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
        final int i = j86.i;
        return Float.hashCode(this.c) + hia.d(Long.hashCode(this.a) * 31, this.b, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("Shadow(color=", j86.h(this.a), ", offset=", l6g.k(this.b), ", blurRadius=");
        t.append(this.c);
        t.append(")");
        return t.toString();
    }
}
