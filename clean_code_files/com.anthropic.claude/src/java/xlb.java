import java.util.Map;

public final class xlb implements xzc
{
    public final sjn v;
    public final int w;
    public final leo x;
    public final jta y;
    
    public xlb(final sjn v, final int w, final leo x, final jta y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public final noe b(final ooe ooe, final goe goe, final long n) {
        long b;
        if (goe.s(gv6.h(n)) < gv6.i(n)) {
            b = n;
        }
        else {
            b = gv6.b(n, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        final o8h u = goe.u(b);
        final int min = Math.min(u.v, gv6.i(n));
        return ooe.Y(min, u.w, (Map)s89.v, (lta)new qd8(min, (Object)this, (Object)ooe, (Object)u, (byte)1));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof xlb) {
                final xlb xlb = (xlb)o;
                if (this.v != xlb.v) {
                    return false;
                }
                if (this.w == xlb.w) {
                    if (this.x.equals((Object)xlb.x)) {
                        if (mlc.q((Object)this.y, (Object)xlb.y)) {
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
        return this.y.hashCode() + (this.x.hashCode() + hia.y(this.w, this.v.hashCode() * 31, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("HorizontalScrollLayoutModifier(scrollerPosition=");
        sb.append((Object)this.v);
        sb.append(", cursorOffset=");
        sb.append(this.w);
        sb.append(", transformedText=");
        sb.append((Object)this.x);
        sb.append(", textLayoutResultProvider=");
        sb.append((Object)this.y);
        sb.append(")");
        return sb.toString();
    }
}
