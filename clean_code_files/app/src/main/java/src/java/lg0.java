public final class lg0
{
    public final Object a;
    public final int b;
    public int c;
    public final String d;
    
    public lg0(final int b, final int c, final Object a, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ng0 a(int n) {
        final int c = this.c;
        if (c != Integer.MIN_VALUE) {
            n = c;
        }
        if (n == Integer.MIN_VALUE) {
            hac.c("Item.end should be set first");
        }
        return new ng0(this.b, n, this.a, this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lg0)) {
            return false;
        }
        final lg0 lg0 = (lg0)o;
        return mlc.q(this.a, lg0.a) && this.b == lg0.b && this.c == lg0.c && mlc.q((Object)this.d, (Object)lg0.d);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.d.hashCode() + hia.y(this.c, hia.y(this.b, hashCode * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        final StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
